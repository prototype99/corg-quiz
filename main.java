import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

/*  Add Different Messages For Different Result Numbers.
Show Correct Answer At The End to highlight what person got wrong
Randomly shuffle questions to add variety.
Add a lot more questions and make a limit of 30 questions. Might aim for sample question size of 100 questions to be randomly picking 20-30 out of.
 * 
 */
class MapleStoryQuiz {

    public static void main(String[] args) {
        int quizScore = 0;
        String[][] answers = {
                {"Explorers", "Cygnus Knights", "The Resistance", "The Heroes Of Maple"},
                {"Henesys", "Ellinia", "The Nautlius", "Perion"},
                {"Kaiser", "Beast Tamer", "Hoyoung", "Shade"},
                {"Dragon Knight", "Gunslinger", "Angelic Buster", "Monster Tamer"},
                {"275", "400", "300", "295"},
                {"Pink Bean", "Zakum", "Hilla", "Horntail"},
                {"20", "30", "8", "15"},
                {"Grendell", "Asmodeus", "Sia Astella", "Aerith"},
                {"Staff", "Wand", "Shining Rod", "Mystical Tome"},
                {"Anima", "Nova", "Skykin", "Flora", "Demon"},
                {"Tiger", "FangBlade", "ZeroByDivide", "InmateSearch"},
                {"Tempest", "RED", "Ascension", "Mutiny"},
                {"Night Walker", "Blaster", "Shade", "Angelic Buster"},
                {"Edelstein", "Ellinia", "Orbis", "Ludibrium"},
                {"Damien", "Hilla", "Lotus", "Arkarium"},
                {"Pathfinder", "Kinesis", "Thunder Breaker", "Evan"},
                {"Ellinel Fairy Academy", "Elluel", "Leafre", "Henesys"},
                {"Evan", "Shade", "Demon Slayer", "Demon Avenger"},
                {"Dagger", "Energy Sword", "Whip Blade", "Claw"},
                {"Twilight Perion", "Vanishing Journey", "Sleepywood", "Root Abyss"},
                {"Cassandra", "Mr. Kim", "Maple Administrator", "Dallier"},
                {"Luminous", "Evan", "Ark", "Mercedes"},
                {"Nautilus Harbor", "Ariant", "Leafre", "El Nath"},
                {"Kaiser", "Aran", "Dawn Warrior", "Hayato"},
                {"Thief", "Pirate", "Warrior", "Magician"},
                {"10", "20", "30", "50"},
                {"Xenon", "Shade", "Kinesis", "Hero"},
                {"Aran", "Jett", "Shade", "Dual Blade"},
                {"Kerning City", "Ellinia", "NLC", "Henesys"},
                {"Kaiser", "Mercedes", "Mechanic", "Kanna"},
                {"Von Leon", "Crimson Balrog", "Zakum", "CWKPQ Boss"},
                {"Warrior", "Bowman", "Thief", "Magician"},
                {"Arkarium's Revenge", "Easter Egg Hunt", "Beasts of Fury", "Golden Temple"},
                {"Ludibrium", "Leafre", "Mu Lung", "Ariant"},
                {"Kaiser", "Mihile", "Dawn Warrior", "Blaze Wizard"},
                {"El Nath", "Future Henesys", "Singapore", "Rien"},
                {"Pierre", "Hilla", "Von Leon", "Pink Bean"},
                {"Freud", "Mir", "Shade", "Nineheart"},
                {"Xenon", "Beast Tamer", "Cadena", "Luminous"},
                {"Maple Island", "Victoria Island", "Ludus Lake", "Mu Lung Garden"},
                {"El Nath", "Orbis", "Ariant", "Aquarium"},
                {"Cassandra", "Athena Pierce", "Dallier", "Maple Admin"}

        };
        String[] quizQuestions = {
                "What is the group of beginner adventurers that start their journey on Maple Island?",
                "What town is Chief Stan in?",
                "What is the name of the forgotten Hero?",
                "Which of the following is NOT a MapleStory class branch?",
                "What is the current level cap?",
                "Who is the first major boss in MapleStory history?",
                "At what level do you job advance to a magician?",
                "Who is the instructor of Magicians?",
                "What weapon do magicians NOT use?",
                "Which of the following is NOT a playable race?",
                "Who was the first level 200 player in MapleStory history? ",
                " What was the update that brought in the Hero Of Light & Darkness?",
                "Which class uses a 'Soul Shooter' as a weapon?",
                "What is the name of the floating city in the sky?",
                "Who is the Black Mage's commander that uses gravity magic?",
                "Which class is part of the Cygnus Knights?",
                "What is the starting town for the Hero 'Mercedes'?",
                "Which MapleStory class uses their own HP as a resource to fight?",
                "What type of weapon does the class 'Xenon' use?",
                "Which area in MapleStory is known for the CRA set?",
                "What is the name of the NPC that helps players reset their Ability Points?",
                "Which MapleStory character is known for having a pet dragon?",
                "What is the name of the pirate-themed town?",
                "Which class can transform into a dragon?",
                "Which job branch does the character 'Phantom' belong to?",
                "What is the max level for professions like Mining and Herbalism?",
                "Which character class uses a uses their psychic limiter as a weapon?",
                "Which class uses two daggers as their weapon?",
                "Which town is known for its haunted mansion?",
                "Which class belongs to the 'Resistance' faction?",
                "What is the name of the boss in the 'Crimsonwood Keep' dungeon?",
                "What is the job of 'Mercedes'?",
                "Which event in MapleStory allows players to collect 'Sunshine' and 'Raindrops'?",
                "Which area is known for the 'Ludus Lake' theme?",
                "Which of these classes uses the 'Soul Master' skill set?",
                "What is the name of the time-travel themed area?",
                "Which boss can be found in the 'Root Abyss'?",
                "What is the name of the dragon that accompanies 'Evan'?",
                "Which class is part of the 'Nova' race?",
                "Which MapleStory continent is 'Mu Lung' located on?",
                "What is the name of the mining village located south of Orbis?",
                "Which NPC is known as the 'Maple Administrator'?"

        };

        String[] correctAnswers = {
                "Explorers",
                "Henesys",
                "Shade",
                "Monster Tamer",
                "300",
                "Zakum",
                "8",
                "Grendell",
                "Mystical Tome",
                "Skykin",
                "FangBlade",
                "Tempest",
                "Angelic Buster",
                "Orbis",
                "Lotus",
                "Thunder Breaker",
                "Elluel",
                "Demon Avenger",
                "Energy Sword",
                "Root Abyss",
                "Mr. Kim",
                "Evan",
                "Nautilus Harbor",
                "Kaiser",
                "Thief",
                "10",
                "Kinesis",
                "Dual Blade",
                "NLC",
                "Mechanic",
                "CWKPQ Boss",
                "Bowman",
                "Beasts of Fury",
                "Ludibrium",
                "Mihile",
                "Future Henesys",
                "Pierre",
                "Mir",
                "Cadena",
                "Mu Lung Garden",
                "El Nath",
                "Maple Administrator"
        };
        String player = JOptionPane.showInputDialog("Welcome to the MapleStory Quiz! Please enter your name new player! :3");
        JOptionPane.showMessageDialog(null, "Ah.. I see.. Welcome to the quiz, " + player + "!", "MapleStory Quiz", JOptionPane.PLAIN_MESSAGE);
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < quizQuestions.length; i++) {
            indices.add(i);
        }

        // Shuffle the list
        Collections.shuffle(indices);

        // Ask 10 random questions
        for (int i = 0; i < 10; i++) {
            int index = indices.get(i);
            String response = (String) JOptionPane.showInputDialog(
                    null,
                    quizQuestions[index],
                    "Quiz Question " + (i + 1),
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    answers[index],
                    null
            );

            // Check if response is correct
            if (response != null && response.equals(correctAnswers[index])) {
                quizScore++;
            }
        }

        // Display quiz result
        String message;
        if (quizScore == 0) {
            message = "Zamn bro... Are you like trolling...?";
        } else if (quizScore > 0 && quizScore <= 3) {
            message = "Ok you have SOME idea on what's going on....";
        } else if (quizScore >= 4 && quizScore <= 6) {
            message = "Hold on let em cook...?";
        } else if (quizScore >= 7 && quizScore <= 9) {
            message = "ALRIGHT NOW WE HAVE KNOWLEDGE!";
        } else {
            message = "DAAAMN A PERFECT SCORE? Ok Maple Wiz!";
        }

        JOptionPane.showMessageDialog(null, "Here are your results, " + player + "!\nYou scored " + quizScore + " out of 10.\n" + message, "Quiz Results", JOptionPane.PLAIN_MESSAGE);
    }
}