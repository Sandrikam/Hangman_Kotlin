import java.lang.management.GarbageCollectorMXBean

class GetGameInformation {

    fun Game_info(Game_Word: String, Player_Name: String, Game_lives: Int, Char_Input:String) {

        /**
         * Entering game parameters such as Name Word and Lives
         */
        print("Enter Your Name: ")

        val Player_Name = readLine().toString()

        print("Hello ${Player_Name}. Let's Hang Some heads.")

        print("Enter a Game Word Now: ")
        /**
         * inputing Word For the game to proceed
         */
        val Game_Word = readLine().toString().toLowerCase()

        print("Let The Word Be: ${Game_Word}. My Lord! ")

        print("Game Is Starting...")
        /**
         * Decidind on non constand life value
         *
         * because it will decrease with every mistake
         */
        val Game_lives = 8
        print("Lives Count is: ${Game_lives}.")

        /**
         * defining variable for individual character input
         *
         * to check against "Game_word" variable
         *
         */
        val Char_Input = readLine().toLowerCase()
        print("Enter character: ${Char_Input}. ")

        if(Game_Word.contains(Char_Input)){
            print("Congrats! ${Char_Input} is in a Word. ")
        }
        else
        {
            print("Wrong Letter, Life count is: ${Game_lives - 1} ")
        }


    }






    }


}