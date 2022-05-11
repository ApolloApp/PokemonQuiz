package com.candoanything.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            R.drawable.ic_pokemon_one,
            "Who's that pokemon?",
            "Chameleon",
            "Charizard",
            "Charmander",
            "Squirtle",
            3

        )
        questionList.add(que1)

        // 2
        val que2 = Question(
            2,
            R.drawable.ic_pokemon_two,
            "Who's that pokemon?",
            "Articuno",
            "Blastoise",
            "Kakuna",
            "Sandshrew",
            1

        )
        questionList.add(que2)

        // 3
        val que3 = Question(
            3,
            R.drawable.ic_pokemon_three,
            " Who's that pokemon?",
            "Pidgeotto",
            "Pidgeot",
            "Pidgey",
            "Nidorina",
            2

        )
        questionList.add(que3)

        // 4
        val que4 = Question(
            4,
            R.drawable.ic_pokemon_four,
            "Who's that pokemon?",
            "Raichu",
            "Pichu",
            "Nidorina",
            "Pikachu",
            4

        )
        questionList.add(que4)

        // 5
        val que5 = Question(
            5,
            R.drawable.ic_pokemon_five,
            "Who's that pokemon?",
            "Squirtle",
            "Wartortle",
            "Alakazam",
            "Machamp",
            2

        )
        questionList.add(que5)

        return questionList
    }

}