package com.candoanything.myquizapp

object Constants {

    fun getQuestion():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            R.drawable.ic_launcher_riddle,
            "What has to be broken before you can use it?",
            "An light",
            "An wall",
            "An egg",
            "An hope",
            3

        )
        questionList.add(que1)

        // 2
        val que2 = Question(
            2,
            R.drawable.ic_launcher_riddle,
            "A cowboy rode into town on Friday afternoon. He spent three days in town and then rode out on Friday. How is that possible?",
            "Friday is the name of the man's horse.",
            "Friday is enemy of the man's.",
            "Friday is the name of the man father",
            "Friday is nothing",
            1

        )
        questionList.add(que2)

        // 3
        val que3 = Question(
            3,
            R.drawable.ic_launcher_riddle,
            " I am pronounced as one letter, but I am written with three. Me and my twin are either blue, green, or brown. What am I?",
            "An light",
            "An eye.",
            "An man",
            "An lucky",
            2

        )
        questionList.add(que3)

        // 4
        val que4 = Question(
            4,
            R.drawable.ic_launcher_riddle,
            "What is full of holes but can still hold water?",
            "An dark",
            "An wall",
            "An egg",
            "An sponge",
            4

        )
        questionList.add(que4)

        // 5
        val que5 = Question(
            5,
            R.drawable.ic_launcher_riddle,
            "What belongs to you but is used more by others?",
            "your thought",
            "your name",
            "your strength",
            "your style",
            3

        )
        questionList.add(que5)

        return questionList
    }

}