package net.jakevossen.apollotrivia;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends BaseActivity {
    private static Fact newRandFact;
    private static Facts facts;
    private static  Boolean isFirstTime = true;
    private static int correctStreak;
    private static int totalCorrect;
    private static int totalQuestionsAsked;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //first time checker
        if ((isFirstTime == null) || isFirstTime || facts.equals(null)){
            genAllQuestions(false);
            isFirstTime = false;
        }
        //set the questions
        if (savedInstanceState == null){
            Fact newRandFact = facts.getRandomFact();
            this.newRandFact = newRandFact;
        }
        genNewQuestion(this.newRandFact);

        //generate the stats
        showInGameStats();

    }

    private void showInGameStats() {
        //cuurent streak
        TextView curStreak = (TextView) findViewById(R.id.streakCounter);
        curStreak.setText("" + correctStreak);

        //answer frac
        TextView fracCorrect = (TextView) findViewById(R.id.answerFracValue);
        fracCorrect.setText("" + totalCorrect + "/" + totalQuestionsAsked);

        //percentage
        int percentage = getPercent(totalCorrect, totalQuestionsAsked);
        TextView correctPercentage = (TextView) findViewById(R.id.correctPercentageValue);
        correctPercentage.setText("" + percentage + "%");
    }

    private int getPercent(int num, int den) {
        int temp = 0;
        if (den > 0){
            double percentDouble = (double)num / den;
            percentDouble = percentDouble * 100;
            temp = (int)Math.round(percentDouble);
        }
        return temp;
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void genNewQuestion(Fact newRandFact) {
        TextView question = (TextView)findViewById(R.id.question);
        RadioButton answer0 = (RadioButton) findViewById(R.id.answer0RadioButton);
        RadioButton answer1 = (RadioButton) findViewById(R.id.answer1RadioButton);
        RadioButton answer2 = (RadioButton)findViewById(R.id.answer2RadioButton);
        RadioButton answer3 = (RadioButton)findViewById(R.id.answer3RadioButton);
        Log.d("TAG", "Set questions");
        //set text
        question.setText(newRandFact.getQuestion());
        answer0.setText(newRandFact.getAnswer(0));
        answer1.setText(newRandFact.getAnswer(1));
        answer2.setText(newRandFact.getAnswer(2));
        answer3.setText(newRandFact.getAnswer(3));
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void genAllQuestions(Boolean doJsonify) {
        FactGenerator factGenerator = new FactGenerator();
        facts = factGenerator.genFacts();
        if (doJsonify){
            facts.jsonify(facts.getFacts());
        }
        facts.randomizeArray();
        Log.d("TAG", "Generated questions");
    }

    public void submitGenButton(View view){
        Intent intent = new Intent(this, explanation.class);
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.answersRadioGroup);

        //if no button was selected
        if (radioGroup.getCheckedRadioButtonId() == -1){
            //make a toast!
            Context context = getApplicationContext();
            CharSequence text = "Please select an option";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        else {
            int selectedId = radioGroup.getCheckedRadioButtonId();
            RadioButton radioButton = (RadioButton) findViewById(selectedId);
            totalQuestionsAsked++;
            if (isItCorrect(newRandFact,radioButton)){
                //if it was correct
                correctStreak++;
                totalCorrect++;
            }
            else{
                correctStreak = 0;
            }
            intent.putExtra("explanation",newRandFact.getExplanation());
            intent.putExtra("isItCorrect",isItCorrect(newRandFact,radioButton));
            intent.putExtra("source",newRandFact.getSource());
            startActivity(intent);
        }
    }

    private boolean isItCorrect(Fact ourFact, RadioButton radioButton) {
        return radioButton.getText().equals(ourFact.getCorrectAnswer());
    }

}
