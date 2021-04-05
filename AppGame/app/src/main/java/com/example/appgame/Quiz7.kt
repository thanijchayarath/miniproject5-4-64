package com.example.appgame

object Quiz7 {
    const val USER_NAME:String = "Username"
    const val TOTAL_QUESTIONS:String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answer"


    fun getQuestion():ArrayList<Quiz>{
        val questionsList = java.util.ArrayList<Quiz>()

        val que121 = Quiz(121,"What is the name of the character?",
            R.drawable.n121,
            "Antarcticite",
            "Cinnabar",
            "Phosphophyllite",
            "Diamond",
            3
        )
        questionsList.add(que121)

        val que122 = Quiz(122,"What is the name of the character?",
            R.drawable.n122,
            "Cinnabar",
            "Diamond",
            "Zircon",
            "Rutile",
            2
        )
        questionsList.add(que122)

        val que123 = Quiz(123,"What is the name of the character?",
            R.drawable.n123,
            "Rutile",
            "Topaz",
            "Peridot",
            "Obsidian",
            1
        )
        questionsList.add(que123)

        val que124 = Quiz(124,"What is the name of the character?",
            R.drawable.n124,
            "Bort",
            "Antarcticite",
            "Cinnabar",
            "Alexandrite",
            3
        )
        questionsList.add(que124)

        val que125 = Quiz(125,"What is the name of the character?",
            R.drawable.n125,
            "Benitoite",
            "Antarcticite",
            "Cairngorm",
            "Amethyst",
            2
        )
        questionsList.add(que125)

        val que126 = Quiz(126,"What is the name of the character?",
            R.drawable.n126,
            "Admirabilis",
            "Ventricosus",
            "Shiro",
            "Aculeatus",
            4
        )
        questionsList.add(que126)

        val que127 = Quiz(127,"What is the name of the character?",
            R.drawable.n127,
            "Kongo",
            "Bort",
            "Euclase",
            "Fluorite",
            1
        )
        questionsList.add(que127)

        val que128 = Quiz(128,"What is the name of the character?",
            R.drawable.n128,
            "Goshenite",
            "Neptunite",
            "Chrysoberyl",
            "Bort",
            4
        )
        questionsList.add(que128)

        val que129 = Quiz(129,"What is the name of the character?",
            R.drawable.n129,
            "Benitoite",
            "Amethyst",
            "Morganite",
            "Hemimorphite",
            2
        )
        questionsList.add(que129)

        val que130 = Quiz(130,"What is the name of the character?",
            R.drawable.n130,
            "Jade",
            "Alexandrite",
            "Padparadscha",
            "Heliodor",
            2
        )
        questionsList.add(que130)

        val que131 = Quiz(131,"What is the name of the character?",
            R.drawable.n131,
            "Euclase",
            "Heliodor",
            "Goshenite",
            "Hemimorphite",
            1
        )
        questionsList.add(que131)

        val que132 = Quiz(132,"What is the name of the character?",
            R.drawable.n132,
            "Fluorite",
            "Peridot",
            "Ghost Quartz",
            "Goshenite",
            4
        )
        questionsList.add(que132)

        val que133 = Quiz(133,"What is the name of the character?",
            R.drawable.n133,
            "Morganite",
            "Jade",
            "Neptunite",
            "Hemimorphite",
            2
        )
        questionsList.add(que133)

        val que134 = Quiz(134,"What is the name of the character?",
            R.drawable.n134,
            "Padparadscha",
            "Red Beryl",
            "Morganite",
            "Sphene",
            3
        )
        questionsList.add(que134)

        val que135 = Quiz(135,"What is the name of the character?",
            R.drawable.n135,
            "Peridot",
            "Red Beryl",
            "Padparadscha",
            "Sphene",
            3
        )
        questionsList.add(que135)

        val que136 = Quiz(136,"What is the name of the character?",
            R.drawable.n136,
            "Ventricosus",
            "Aculeatus",
            "Admirabilis",
            "Shiro",
            1
        )
        questionsList.add(que136)

        val que137 = Quiz(137,"What is the name of the character?",
            R.drawable.n137,
            "Admirabilis",
            "Aculeatus",
            "Ventricosus",
            "Shiro",
            4
        )
        questionsList.add(que137)

        val que138 = Quiz(138,"What is the name of the character?",
            R.drawable.n138,
            "Zircon",
            "Sapphire",
            "Topaz",
            "Yellow Diamond",
            4
        )
        questionsList.add(que138)

        val que139 = Quiz(139,"What is the name of the character?",
            R.drawable.n139,
            "Topaz",
            "Neptunite",
            "Zircon",
            "Sphene",
            3
        )
        questionsList.add(que139)

        val que140 = Quiz(140,"What is the name of the character?",
            R.drawable.n140,
            "Phosphophyllite",
            "Watermelon Tourmaline",
            "Hemimorphite",
            "Jade",
            3
        )
        questionsList.add(que140)

        return questionsList
    }

}