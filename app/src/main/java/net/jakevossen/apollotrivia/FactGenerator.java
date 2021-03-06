package net.jakevossen.apollotrivia;

import android.os.Build;
import android.support.annotation.RequiresApi;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by Jake on 6/16/2017.
 */
public class FactGenerator {

    public FactGenerator(){ };
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Facts genFacts(){
        //vars
        Facts facts = new Facts();
        ArrayList<String> answerList = new ArrayList<>();
        String question;
        String explanation;
        String source;
        //generic question
        /*
        //new question
        answerList.clear();
        question = "";

        answerList.add("");
        answerList.add("");
        answerList.add("");
        answerList.add("");

        explanation = "";
        source = "";

        facts.addFact(new Fact(question,answerList,explanation,source));

         */


        //new question
        answerList.clear();

        question = "What were the first words spoken on the moon?";

        answerList.add("...one small step for a man, one giant leap for mankind");
        answerList.add("The pledge of allegiance");
        answerList.add("The preamble of the constitution");
        answerList.add("Not known, the radio data failed");

        explanation = "\"...one small step for a man, one giant leap for mankind\" were the first words on the moon, spoken my Neil Armstrong. He claims he siad \"...one small step for a man, AND ONE giant leap for mankind\", but the radio did not pick up on it.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "What was the first Apollo Mission?";

        answerList.add("Apollo 1");
        answerList.add("Apollo 0");
        answerList.add("Apollo 11");
        answerList.add("Apollo 10");

        explanation = "Apollo 1 was the first mission";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/index.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "When was the tragedy of the Apollo 1 mission?";

        answerList.add("Jan. 27, 1967");
        answerList.add("Jul. 14, 1966");
        answerList.add("Dec. 2, 1968");
        answerList.add("May 29, 1968");

        explanation = "Jan. 27, 1967 was the day that a preflight test killed Virgil Grissom, Edward White, and Roger Chaffee";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo1.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "What is the name of the rocket primarily used in the Apollo missions?";

        answerList.add("Saturn");
        answerList.add("Falcon");
        answerList.add("Atlas");
        answerList.add("Delta");

        explanation = "Rockets named Saturn were primarily used during the Apollo missions.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo1.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "What mission contained the first Saturn V launch?";

        answerList.add("Apollo 4");
        answerList.add("Apollo 1");
        answerList.add("Apollo 11");
        answerList.add("Apollo 10");

        explanation = "Apollo 4 was the first to fly the Saturn V rocket";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo1.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "What year was the first Saturn rocket launched?";

        answerList.add("1967");
        answerList.add("1963");
        answerList.add("1965");
        answerList.add("1969");

        explanation = "1967 was the first time the Saturn V rocket flew";
        source = "https://www.nasa.gov/audience/forstudents/5-8/features/nasa-knows/what-was-the-saturn-v-58.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "How heavy is the Saturn V rocket fully fueled?";

        answerList.add("2.8 million kilograms");
        answerList.add(".9 million kilograms");
        answerList.add("8.1 million kilograms");
        answerList.add("4.2 million kilograms");

        explanation = "Fully fueled for liftoff, the Saturn V weighed 2.8 million kilograms (6.2 million pounds).";
        source = "https://www.nasa.gov/audience/forstudents/5-8/features/nasa-knows/what-was-the-saturn-v-58.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "How tall is the Saturn V rocket?";

        answerList.add("111 meters");
        answerList.add("314 meters");
        answerList.add("72 meters");
        answerList.add("161 meters");

        explanation = "The Saturn V rocket was 111 meters tall";
        source = "https://www.nasa.gov/audience/forstudents/5-8/features/nasa-knows/what-was-the-saturn-v-58.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "How many elephants does the Saturn V rocket weigh when it is fully fueled?";

        answerList.add("400");
        answerList.add("120");
        answerList.add("1000");
        answerList.add("650");

        explanation = "The Saturn V rocket weighed about 400 elephants when it was fueled for takeoff.";
        source = "https://www.nasa.gov/audience/forstudents/5-8/features/nasa-knows/what-was-the-saturn-v-58.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "How many pounds of thrust did the Saturn V produce at launch?";

        answerList.add("34.5 million newtons");
        answerList.add("133.2 million newtons");
        answerList.add("12.8 million newtons");
        answerList.add("72.1 million newtons");

        explanation = "The saturn V generated 34.5 million newtons(7.6 million pounds) of thrust at launch, which is more than 85 Hoover Dams.)";
        source = "https://www.nasa.gov/audience/forstudents/5-8/features/nasa-knows/what-was-the-saturn-v-58.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "When was the launch of Apollo 7?";

        answerList.add("Oct. 11, 1968");
        answerList.add("Feb. 2, 1966");
        answerList.add("Aug. 20, 1969");
        answerList.add("Jul. 21, 1968");

        explanation = "Apollo 7 was launched on Oct. 11, 1968; 11:02:45 a.m. EST";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo7.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "What launch complex did the Apollo 7 mission use?";

        answerList.add("Launch Complex 34");
        answerList.add("Launch Complex 40");
        answerList.add("Launch Complex 41");
        answerList.add("Launch Complex 37A");

        explanation = "Apollo 7 was launched at Launch Complex 34";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo7.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "What was the size of orbit of the Apollo 7 mission?";

        answerList.add("141 miles");
        answerList.add("212 miles");
        answerList.add("180 miles");
        answerList.add("334 miles");

        explanation = "The orbit of Apollo 7 was 140 by 183 miles";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo7.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "What was the point of keeping the S-IVB part of the craft in orbit with them in the Apollo 7 mission?";

        answerList.add("So they could simulate docking");
        answerList.add("It contained necessary food and supplies");
        answerList.add("They didn't want to, the jettison failed");
        answerList.add("It was part of science equipment they needed");

        explanation = "They used the jettison part of the ship to simulate docking, a necessary part of the lunar mission";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo7.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "How did the engine perform on the Apollo 7 mission?";

        answerList.add("Nearly perfectly");
        answerList.add("Incredibly poorly, and it was difficult to return from orbit");
        answerList.add("Acceptable, but could have been better");
        answerList.add("Bad, but not bad enough that it caused issues.");

        explanation = "There were eight nearly perfect firings out of eight attempts";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo7.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "How long did the Apollo 7 capsule stay in orbit?";

        answerList.add("10.8 days");
        answerList.add("8.1 days");
        answerList.add("3.2 days");
        answerList.add("5.9 days");

        explanation = "Apollo 7 was in orbit for 10.8 days";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo7.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "What was one of the medical issues the astronauts experienced on Apollo 7?";

        answerList.add("A bad cold");
        answerList.add("Dehydration");
        answerList.add("Eyesight issues from the sun");
        answerList.add("Skin issues");

        explanation = "About 15 hours into the flight, Schirra developed a bad cold, and Cunningham and Eisele soon followed suit. A cold is uncomfortable enough on the ground, but in weightlessness it presents a different problem. Mucus accumulates, fills the nasal passages and does not drain from the head. The only relief is to blow hard, which is painful to the ear drums. So the crew of Apollo 7 whirled through space suffering from stopped-up ears and noses.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo7.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "What was the landing spot of Apollo 7?";

        answerList.add("27 degrees, 32 minutes north, and 64 degrees, 4 minutes west");
        answerList.add("31 degrees, 19 minutes north, and 44 degrees, 12 minutes west");
        answerList.add("25 degrees, 40 minutes north, and 66 degrees, 52 minutes west");
        answerList.add("12 degrees, 23 minutes north, and 12 degrees, 44 minutes west");

        explanation = "Apollo's flotation bags had their first try out when the spacecraft, considered a \"lousy boat,\" splashed down in the Atlantic southeast of Bermuda, less than 2 kilometers from the planned impact point. The landing location was 27 degrees, 32 minutes north, and 64 degrees, 4 minutes west. The module turned upside down, but when inflated, the brightly colored bags flipped it upright.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo7.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "What time did the astronauts on Apollo 7 return to the ship?";

        answerList.add("8:20 a.m. EDT");
        answerList.add("2:20 a.m. EDT");
        answerList.add("9:15 p.m. EDT");
        answerList.add("3:36 p.m. EDT");

        explanation = "The crew arrived at 8:20 a.m. EDT";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo7.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //APOLLO 8

        //new question
        answerList.clear();
        question = "Who was the Commander of the Apollo 8 mission?";

        answerList.add("Frank Borman");
        answerList.add("Neil Armstrong");
        answerList.add("William A. Anders");
        answerList.add("Edwin E. Aldrin Jr.");

        explanation = "The commander of the Apollo 8 mission was Frank Borman";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo8.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "When was the launch of Apollo 8?";

        answerList.add("Dec. 21, 1968");
        answerList.add("Mar. 28, 1967");
        answerList.add("Oct. 3, 1968");
        answerList.add("Jul. 14, 1968");

        explanation = "Apollo 8 launched at Dec. 21, 1968; 7:51 a.m. EST";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo8.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "How long was the burn that sent Apollo 8 to the moon?";

        answerList.add("Five-minutes, 17-seconds");
        answerList.add("Two-minutes, 45-seconds");
        answerList.add("Eight-minutes, 30-seconds");
        answerList.add("Three-minutes, 22-seconds");

        explanation = "The burn lasted Five-minues, 17 seconds";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo8.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "When did the loss of signal occur during the Apollo 8 mission when the austronauts went behind the moon?";

        answerList.add("68 hours, 58 minutes, 45 seconds ");
        answerList.add("40 hours, 9 minutes, 32 seconds ");
        answerList.add("81 hours, 36 minutes, 22 seconds ");
        answerList.add("33 hours, 21 minutes, 19 seconds ");

        explanation = "Loss of signal occurred at 68 hours, 58 minutes, 45 seconds when Apollo 8 passed behind the moon. At that moment, NASA's three astronauts became the first humans to see the moon's far side.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo8.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "How long did the first Lunar orbit insertion burn last on the Apollo 8 mission?";

        answerList.add("Four minutes, two seconds");
        answerList.add("Six minutes, eight-seconds");
        answerList.add("Nine-minute, 30-seconds");
        answerList.add("Two-minute, 59-seconds");

        explanation = "The first lunar orbit insertion burn, at 69 hours, 8 minutes, 52 seconds, lasted four minutes, two seconds and reduced the spacecraft's 8,400 feet per second velocity by 2,994 feet per second";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo8.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "What was the size of the orbit around the moon on the Apollo 8 mission?";

        answerList.add("70 miles");
        answerList.add("12 miles");
        answerList.add("112 miles");
        answerList.add("44 miles");

        explanation = "The orbit circularized at 70 miles by the second lunar orbit insertion burn of 135 feet per second, performed at the start of the third revolution, again on the back side of the moon";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo8.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "On Christmas eve, what message did the Apollo 8 astronauts brodcast home?";

        answerList.add("Merry Christmas, as well as verses from the book of Genesis in the Bible");
        answerList.add("A call to more science in the education system");
        answerList.add("Endorsement of a political candidate");
        answerList.add("A call to follow your country");

        explanation = "During a telecast on Christmas Eve, the crew read verses from the first chapter of Genesis and wished viewers, \"Good night, good luck, a Merry Christmas and God bless all of you - all of you on the good Earth.\"";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo8.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "What was the re-entry velocity of Apollo 8?";

        answerList.add("24,696 mph");
        answerList.add("62,471 mph");
        answerList.add("13,942 mph");
        answerList.add("44,326 mph");

        explanation = "The re-entry velocity was 24,696 mph.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo8.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "What was the re-entry heat on the heatsheild of Apollo 8";

        answerList.add("5,000 degrees F");
        answerList.add("15,000 degrees F");
        answerList.add("8,000 degrees F");
        answerList.add("2,000 degrees F");

        explanation = "The heatshield withstood teampatures of 5,000 degrees F";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo8.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "What time did the Apollo 8 crew get to the ship?";

        answerList.add("12:20 p.m. EST");
        answerList.add("3:16 p.m. EST");
        answerList.add("1:12 a.m. EST");
        answerList.add("7:41 p.m. EST");

        explanation = "The Apollo 8 crew reached the recovery ship at 12:20 p.m. EST.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo8.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "How long did the Apollo 8 crew have to wait in the command module in the ocean?";

        answerList.add("50 minutes");
        answerList.add("2 hours");
        answerList.add("4 minutes");
        answerList.add("38 minutes");

        explanation = " According to prior planning, helicopters and aircraft hovered over the spacecraft, and pararescue personnel were not deployed until local sunrise, 50 minutes after splashdown.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo8.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //Apollo 9

        //new question
        answerList.clear();
        question = "Who was the commander of Apollo 9?";

        answerList.add("James A. McDivitt");
        answerList.add("Neil Armstrong");
        answerList.add("David R. Scott");
        answerList.add("Alan L. Bean");

        explanation = "James A. McDivitt was the commander of the Apollo 9 mission.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo9.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "When did Apollo 9 launch?";

        answerList.add("March 3, 1969");
        answerList.add("Oct. 8, 1968");
        answerList.add("May 21, 1968");
        answerList.add("Jan. 17, 1970");

        explanation = "Apollo 9 launched on March 3, 1969";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo9.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "What was the orbit of Apollo 9 after it circulized?";

        answerList.add("123 by 127 miles");
        answerList.add("142 by 140 miles");
        answerList.add("112 by 113 miles");
        answerList.add("155 by 160 miles");

        explanation = "On the first day, and after orbit injection of the combined S-IVB stage and its SLA-LM-CSM payload, venting of the S-IVB propellant tanks changed the orbit to 123 by 127 miles";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo9.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "What was one of the main goals of the Apollo 9 testing wise?";

        answerList.add("Docking");
        answerList.add("Crew stability");
        answerList.add("Rocket launching");
        answerList.add("Orbits");

        explanation = "NASA wanted to make sure that docking was going too work";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo9.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "What was one of the reasons the orbit of Apollo 9 was expanded?";

        answerList.add("Test firing the lunar module");
        answerList.add("Overshooting the rocket launch");
        answerList.add("Engine misfire");
        answerList.add("Bad interpretation of measurements");

        explanation = "This included a 367-second firing of the LM descent engine to simulate the throttle pattern to be used during a lunar landing mission. McDivitt controlled the final 59 seconds, varying the thrust from 10 to 40 percent and shutting it off manually. This was the first crewed throttling of an engine in space and increased the spacecraft's orbit to 130 by 300 miles.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo9.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "Why was the two-hour EVA cancelled on the Apollo 9 mission?";

        answerList.add("Nasusa");
        answerList.add("The door failed");
        answerList.add("Radio connection issues");
        answerList.add("Saftey risks");

        explanation = "Because of nausea, Schweickart's scheduled two-hour EVA to simulate external transfer rescue techniques was canceled. Instead, he climbed out of the LM porch for a 37.5 minute EVA, testing the EVA mobility unit, including the portable life support system backpack.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo9.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "Why was the Apollo 9 mission extended by one day?";

        answerList.add("Rough seas in the primary landing location");
        answerList.add("Needed more time for testing");
        answerList.add("Ship was having issues during entry and they had to cancel");
        answerList.add("The ship that was supposed to pick them up was down for maintenance");

        explanation = "On March 13, the tenth day, re-entry was extended by one revolution because of heavy seas in the primary recovery area.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo9.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "How close did the new lunar module get to landing on the Apollo 10 mission?";

        answerList.add("9 miles");
        answerList.add("Less that 1 mile");
        answerList.add("70 miles");
        answerList.add("15 miles");

        explanation = "The lunar module had a descent to about nine miles off the moon's surface";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo10.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "What was the main purpose of Apollo 10";

        answerList.add("Practice everything except the landing");
        answerList.add("Refine radio transmissions");
        answerList.add("See if the Saturn V rocket could lift that much weight");
        answerList.add("Unknown, it has been clasified");

        explanation = "The Apollo 10 mission encompassed all aspects of an actual crewed lunar landing, except the landing.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo10.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "Whats the velocity of Apollo 10 on the way to the moon?";

        answerList.add("36,651 feet per second");
        answerList.add("62,152 feet per second");
        answerList.add("42,522 feet per second");
        answerList.add("51,942 feet per second");

        explanation = "One-and-a-half orbits later, translunar injection occurred. The S-IVB fired to increase velocity from 25,593 to 36,651 feet per second.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo10.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "Whats the velocity of Apollo 10 on the way to the moon?";

        answerList.add("36,651 feet per second");
        answerList.add("62,152 feet per second");
        answerList.add("42,522 feet per second");
        answerList.add("51,942 feet per second");

        explanation = "The Apollo 10 crew members were Commander Thomas Stafford, Command Module Pilot John Young and Lunar Module Pilot Eugene Cernan.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo10.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "Who was the commander of Apollo 10?";

        answerList.add("Thomas Stafford");
        answerList.add("John Young");
        answerList.add("Neil Armstrong");
        answerList.add("George Washington");

        explanation = "The Apollo 10 crew members were Commander Thomas Stafford, Command Module Pilot John Young and Lunar Module Pilot Eugene Cernan.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo10.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "Which Apollo mission had the first color braodcast?";

        answerList.add("Apollo 10");
        answerList.add("Apollo 8");
        answerList.add("Apollo 9");
        answerList.add("Apollo 14");

        explanation = "The first live color TV transmissions to Earth began three hours after launch when Apollo 10 was 3,570 miles from Earth and concluded when the spacecraft was 9,428 miles away.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo10.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "How big was the lunar orbit on Apollo 10?";

        answerList.add("69 miles");
        answerList.add("32 miles");
        answerList.add("112 miles");
        answerList.add("256 miles");

        explanation = "The lunar orbit of Apollo 10 was approximately 69 miles.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo10.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "What was the Lunar orbit of the Apollo 10 lunar module";

        answerList.add("9.7 by 70.5 miles.");
        answerList.add("17 by 142.1 miles.");
        answerList.add("14.2 by 65.5 miles");
        answerList.add("22.1 by 59.9 miles");

        explanation = "To achieve a simulation of the future Apollo 11 landing, the LM descent engine fired for 27.4 seconds, with 10 percent thrust for the first 15 seconds and 40 percent thrust for the rest. This brought the LM to a new orbit of 9.7 by 70.5 miles.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo10.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "What was the primary mission of the Apollo 11 mission?";

        answerList.add("Perform a crewed lunar landing and return to Earth.");
        answerList.add("Practice the Saturn V launch");
        answerList.add("Do a test run before the real landing");
        answerList.add("Rescue crew left on Apollo 10");

        explanation = "The primary objective of Apollo 11 was to complete a national goal set by President John F. Kennedy on May 25, 1961: perform a crewed lunar landing and return to Earth.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "Approximately how many people watched the moon landing?";

        answerList.add("530 million");
        answerList.add("1 billion");
        answerList.add("100 million");
        answerList.add("325 million");

        explanation = "530 million people watched the moon landing";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "When did Apollo 11 launch?";

        answerList.add("July 16, 1969");
        answerList.add("July 8, 1969");
        answerList.add("Feb. 22, 1969");
        answerList.add("Oct. 10, 1969");

        explanation = "Apollo 11 launched from Cape Kennedy on July 16, 1969";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "Who was the commander of Apollo 11?";

        answerList.add("Neil Armstrong");
        answerList.add("Michael Collins");
        answerList.add("Edwin \"Buzz\" Aldrin");
        answerList.add("James A. McDivitt");

        explanation = "The commander of Apollo 11 was Neil Armstrong";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "When did Apollo 11 land on the moon?";

        answerList.add("July 20, 1969");
        answerList.add("June 14, 1970");
        answerList.add("Feb 2, 12968");
        answerList.add("July 4, 1969");

        explanation = "Apollo 11 landed on the moon on July 20, 1969";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "What was the nickname of the lunar module on Apollo 11?";

        answerList.add("Eagle");
        answerList.add("Dragon");
        answerList.add("Foxcat");
        answerList.add("Falcon");

        explanation = "Eagle was the name for the Apollo 11 Lunar Module";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "How long was the retrograde burn in orbit on Apollo 11 in orbit around the moon";

        answerList.add("357.5 seconds");
        answerList.add("128.4 second");
        answerList.add("833.1 seconds");
        answerList.add("64.2 seconds");

        explanation = "Apollo 11 landed on the moon on July 20, 1969";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "How long was the retrograde burn in orbit around the moon on Apollo 11 to acheive lunar decent";

        answerList.add("357.5 seconds");
        answerList.add("128.4 second");
        answerList.add("833.1 seconds");
        answerList.add("64.2 seconds");

        explanation = "The retrograde burn to get in orbit on Apollo 11 was 357.5 seconds";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "How long was the retrograde burn in orbit around the moon on Apollo 11 begin lunar injection";

        answerList.add("30 seconds");
        answerList.add("12 second");
        answerList.add("177 seconds");
        answerList.add("17 seconds");

        explanation = "The Apollo 11 burn to start the decent was 30 seconds";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "How long was the retrograde burn in the lunar decent on Apollo 11 at the start of the powered decent";

        answerList.add("756.3 seconds");
        answerList.add("1002.1 second");
        answerList.add("59.4 seconds");
        answerList.add("491.9 seconds");

        explanation = "The start burn of the Apollo 11 decent was 756.3";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "What was one of the things left on the Lunar surface on Apollo 11";

        answerList.add("Medallions bearing the names of the three Apollo 1 astronauts");
        answerList.add("A lego set");
        answerList.add("They didn't leave anything");
        answerList.add("A paper written by the president");

        explanation = "Commemorative medallions bearing the names of the three Apollo 1 astronauts who lost their lives in a launch pad fire, and two cosmonauts who also died in accidents, were left on the moon's surface. A one-and-a-half inch silicon disk, containing micro miniaturized goodwill messages from 73 countries, and the names of congressional and NASA leaders, also stayed behind.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "What was the name of the landing site of Apollo 11";

        answerList.add("Sea of Tranquility");
        answerList.add("Eagle");
        answerList.add("Copernicus");
        answerList.add("Pitatus");

        explanation = "Partially piloted manually by Armstrong, the Eagle landed in the Sea of Tranquility in Site 2 at 0 degrees, 41 minutes, 15 seconds north latitude and 23 degrees, 26 minutes east longitude";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "How far off was the landing on Apollo 11";

        answerList.add("four miles downrange");
        answerList.add("twenty-one miles downrange");
        answerList.add("twelve miles short");
        answerList.add("one mile short");

        explanation = "This was about four miles downrange from the predicted touchdown point and occurred almost one-and-a-half minutes earlier than scheduled.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "How long after launch did the first Apollo 11 astronaut land on the moon?";

        answerList.add("109 hours, 42 minutes");
        answerList.add("122 hours, 3 minutes");
        answerList.add("89 hours, 14 minutes");
        answerList.add("77 hours, 51 minutes");

        explanation = "At about 109 hours, 42 minutes after launch, Armstrong stepped onto the moon.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "How far did the Apollo 11 astronauts go from the LM?";

        answerList.add("300 feet");
        answerList.add("19 feet");
        answerList.add("244 feet");
        answerList.add("154 feet");

        explanation = "During the EVA, in which they both ranged up to 300 feet from the Eagle, Aldrin deployed the Early Apollo Scientific Experiments Package, or EASEP, experiments, and Armstrong and Aldrin gathered and verbally reported on the lunar surface samples.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "How long was Aldrin on the surface of the moon during Apollo 11?";

        answerList.add("one hour, 33 minutes");
        answerList.add("two hours, 11 minutes");
        answerList.add("one hour,36 minutes");
        answerList.add("four hours, 17 minutes");

        explanation = "After Aldrin had spent one hour, 33 minutes on the surface, he re-entered the LM, followed 41 minutes later by Armstrong. The entire EVA phase lasted more than two-and-a-half hours, ending at 111 hours, 39 minutes into the mission.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "How long was the LM on Apollo 11 on the Moon?";

        answerList.add("21 hours, 36 minutes");
        answerList.add("3 hours, 11 minutes");
        answerList.add("30 hours, 14 minutes");
        answerList.add("4 hours, 47 minutes");

        explanation = "Armstrong and Aldrin spent 21 hours, 36 minutes on the moon's surface. After a rest period that included seven hours of sleep, the ascent stage engine fired at 124 hours, 22 minutes.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "How long was the total Apollo 11 flight?";

        answerList.add("195 hours, 18 minutes, 35 seconds");
        answerList.add("155 hours, 12 minutes, 44 seconds");
        answerList.add("241 hours, 32 minutes, 9 seconds");
        answerList.add("121 hours, 55 minutes, 38 seconds");

        explanation = "After a flight of 195 hours, 18 minutes, 35 seconds - about 36 minutes longer than planned - Apollo 11 splashed down in the Pacific Ocean.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "Who was the Lunar Module Pilot on Apollo 11?";

        answerList.add("Edwin E. Aldrin Jr");
        answerList.add("Neil Armstrong");
        answerList.add("William A. Anders");
        answerList.add("Michael Collins");

        explanation = "Edwin E. Aldrin Jr. was the Lunar Module Pilot";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,explanation,source));

        //new question
        answerList.clear();
        question = "Who was the Command Module Pilot on Apollo 11?";

        answerList.add("Michael Collins");
        answerList.add("Neil Armstrong");
        answerList.add("William A. Anders");
        answerList.add("Edwin E. Aldrin Jr.");

        explanation = "Michael Collins was the Command Module Pilot";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,explanation,source));
        


        //end
        return facts;
    }

}
