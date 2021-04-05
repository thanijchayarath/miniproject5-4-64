package com.example.appgame
//tokyo 5
//kono 5
//houseki 5
//fruit 5
object Quiz9 {

    const val USER_NAME:String = "Username"
    const val TOTAL_QUESTIONS:String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answer"

    fun getQuestion():ArrayList<Quiz> {
        val questionsList = java.util.ArrayList<Quiz>(20)//.random(random = 20)
//        val que161 = Quiz(161,"What is the name of the character?",
//        val ran = (que1 until que140).random()

        val que161 = Quiz(161,"What is the name of the character?",
            R.drawable.n1,
            "Haise Sasaki",
            "Ichika Kaneki",
            "Ken Kaneki",
            "Hideyoshi Nagachika",
            3
        )
        questionsList.add(que161)

//        val que2 = Quiz(2,"What is the name of the character?",
//            R.drawable.n2,
//            "Haise Sasaki",
//            "Ken Kaneki",
//            "Hideyoshi Nagachika",
//            "Ichika Kaneki",
//            1
//        )
//        questionsList.add(que2)

//        val que3 = Quiz(3,"What is the name of the character?",
//            R.drawable.n3,
//            "Ken Kaneki",
//            "Rize Kamishiro",
//            "Touka Kirishima",
//            "Ichika Kaneki",
//            4
//        )
//        questionsList.add(que3)
//
//        val que4 = Quiz(4,"What is the name of the character?",
//            R.drawable.n4,
//            "Rize Kamishiro",
//            "Touka Kirishima",
//            "Ichika Kaneki",
//            "Eto Yoshimura",
//            2
//        )
//        questionsList.add(que4)

        val que162 = Quiz(162,"What is the name of the character?",
                R.drawable.n81,
                "Chiharu Hozuki",
                "Akira Dōjima",
                "Satowa Hozuki",
                "Hiro Kurusu",
                3
        )
        questionsList.add(que162)

//        val que5 = Quiz(5,"What is the name of the character?",
//            R.drawable.n5,
//            "Mayu",
//            "Saiko Yonebayashi",
//            "Karren von Rosewald",
//            "Rize Kamishiro",
//            4
//        )
//        questionsList.add(que5)
//
//        val que6 = Quiz(6,"What is the name of the character?",
//            R.drawable.n6,
//            "Karren von Rosewald",
//            "Hinami Fueguchi",
//            "Ryouko Fueguchi",
//            "Kimi Nishio",
//            1
//        )
//        questionsList.add(que6)

//        val que8 = Quiz(8,"What is the name of the character?",
//            R.drawable.n8,
//            "Saiko Yonebayashi",
//            "Ruisawa",
//            "Mayu",
//            "Rou",
//            1
//        )
//        questionsList.add(que8)

        val que163 = Quiz(163,"What is the name of the character?",
                R.drawable.n139,
                "Topaz",
                "Neptunite",
                "Zircon",
                "Sphene",
                3
        )
        questionsList.add(que163)

        val que164 = Quiz(164,"What is the name of the character?",
                R.drawable.n52,
                "Hatsuharu Sohma",
                "Isuzu Sohma",
                "Momiji Sohma",
                "Ritsu Sohma",
                4
        )
        questionsList.add(que164)

        val que165 = Quiz(165,"What is the name of the character?",
                R.drawable.n125,
                "Benitoite",
                "Antarcticite",
                "Cairngorm",
                "Amethyst",
                2
        )
        questionsList.add(que165)

        val que166 = Quiz(166,"What is the name of the character?",
                R.drawable.n20,
                "Kishou Arima",
                "Ayato Kirishima",
                "Arata Kirishima",
                "Hideyoshi Nagachika",
                4
        )
        questionsList.add(que166)

        val que167 = Quiz(167,"What is the name of the character?",
                R.drawable.n57,
                "Hatori Sohma",
                "Kyo Sohma",
                "Yuki Sohma",
                "Hiro Sohma",
                2
        )
        questionsList.add(que167)

        val que168 = Quiz(168,"What is the name of the character?",
                R.drawable.n17,
                "Mayu",
                "Kurona Yasuhisa",
                "Nashiro Yasuhisa",
                "Matsumae",
                2
        )
        questionsList.add(que168)

        val que169 = Quiz(169,"What is the name of the character?",
                R.drawable.n123,
                "Rutile",
                "Topaz",
                "Peridot",
                "Obsidian",
                1
        )
        questionsList.add(que169)

        val que170 = Quiz(170,"What is the name of the character?",
                R.drawable.n93,
                "Tsukaji",
                "Takeru Kurata",
                "Tokise High School Principal",
                "Tokise High School Vice Principal",
                3
        )
        questionsList.add(que170)

        val que171 = Quiz(171,"What is the name of the character?",
                R.drawable.n88,
                "Takeru Kurata",
                "Mio Kanzaki",
                "Ousuke Kiryu",
                "Taishin Yamamoto",
                2
        )
        questionsList.add(que171)

        val que172 = Quiz(172,"What is the name of the character?",
                R.drawable.n11,
                "Noro",
                "Rikai Souzu",
                "Tatara",
                "Koutarou Amon",
                4
        )
        questionsList.add(que172)

        val que173 = Quiz(173,"What is the name of the character?",
                R.drawable.n44,
                "Megumi Hanajima",
                "Naohito Sakuragi",
                "Kunimitsu Tomoda",
                "Kakeru Manabe",
                1
        )
        questionsList.add(que173)

        val que174 = Quiz(174,"What is the name of the character?",
                R.drawable.n58,
                "Kyo Sohma",
                "Yuki Sohma",
                "Kazuma Sohma",
                "Momiji Sohma",
                3
        )
        questionsList.add(que174)

        val que175 = Quiz(175,"What is the name of the character?",
                R.drawable.n91,
                "Kota Mizuhara",
                "Saneyasu Adachi",
                "Michitaka Sakai",
                "Chika Kudo",
                1
        )
        questionsList.add(que175)

        val que176 = Quiz(176,"What is the name of the character?",
                R.drawable.n129,
                "Benitoite",
                "Amethyst",
                "Morganite",
                "Hemimorphite",
                2
        )
        questionsList.add(que176)

        val que177 = Quiz(177,"What is the name of the character?",
                R.drawable.n49,
                "Mayuko Shiraki",
                "Mine Kuramae",
                "Tohru Honda",
                "Mitsuru",
                4
        )
        questionsList.add(que177)

        val que178 = Quiz(178,"What is the name of the character?",
                R.drawable.n98,
                "Kiyoka Amamiya",
                "Hozumi Tachibana",
                "Uta Suzumori",
                "Rui Natsume",
                1
        )
        questionsList.add(que178)

        val que179 = Quiz(179,"What is the name of the character?",
                R.drawable.n7,
                "Saiko Yonebayashi",
                "Taguchi",
                "Tooru Mutsuki",
                "Ruisawa",
                4
        )
        questionsList.add(que179)

        val que180 = Quiz(180,"What is the name of the character?",
                R.drawable.n136,
                "Ventricosus",
                "Aculeatus",
                "Admirabilis",
                "Shiro",
                1
        )
        questionsList.add(que180)

//        val que9 = Quiz(9,"What is the name of the character?",
//            R.drawable.n9,
//            "Mayu",
//            "Rou",
//            "Ruisawa",
//            "Shio Ihei",
//            2
//        )
//        questionsList.add(que9)
//
//        val que10 = Quiz(10,"What is the name of the character?",
//            R.drawable.n10,
//            "Mayu",
//            "Ruisawa",
//            "Shio Ihei",
//            "Taguchi",
//            3
//        )
//        questionsList.add(que10)

//        val que12 = Quiz(12,"What is the name of the character?",
//            R.drawable.n12,
//            "Shuu Tsukiyama",
//            "Ryou",
//            "Seidou Takizawa",
//            "Noro",
//            4
//        )
//        questionsList.add(que12)
//
//        val que13 = Quiz(13,"What is the name of the character?",
//            R.drawable.n13,
//            "Tatara",
//            "Yakumo Oomori",
//            "Ryou",
//            "Seidou Takizawa",
//            2
//        )
//        questionsList.add(que13)
//
//        val que14 = Quiz(14,"What is the name of the character?",
//            R.drawable.n14,
//            "Ryou",
//            "Tatara",
//            "Seidou Takizawa",
//            "Shuu Tsukiyama",
//            3
//        )
//        questionsList.add(que14)
//
//        val que15 = Quiz(15,"What is the name of the character?",
//            R.drawable.n15,
//            "Shuu Tsukiyama",
//            "Tsuneyoshi Washuu",
//            "Uta",
//            "Sumiharu Katou",
//            1
//        )
//        questionsList.add(que15)
//
//        val que16 = Quiz(16,"What is the name of the character?",
//            R.drawable.n16,
//            "Uta",
//            "Tatara",
//            "Kuki Urie",
//            "Koori Ui",
//            1
//        )
//        questionsList.add(que16)

//        val que18 = Quiz(18,"What is the name of the character?",
//            R.drawable.n18,
//            "Kurona Yasuhisa",
//            "Mayu",
//            "Nashiro Yasuhisa",
//            "Karren von Rosewald",
//            3
//        )
//        questionsList.add(que18)
//
//        val que19 = Quiz(19,"What is the name of the character?",
//            R.drawable.n19,
//            "Ryou",
//            "Tatara",
//            "Nutcracker's partner",
//            "Renji Yomo",
//            2
//        )
//        questionsList.add(que19)

//        val que41 = Quiz(41,"What is the name of the character?",
//            R.drawable.n41,
//            "Kureno Sohma",
//            "Shigure Sohma",
//            "Akito Sohma",
//            "Yuki Sohma",
//            1
//        )
//        questionsList.add(que41)
//
//        val que42 = Quiz(42,"What is the name of the character?",
//            R.drawable.n42,
//            "Kisa Sohma",
//            "Tohru Honda",
//            "Saki Hanajima",
//            "Kimi Toudou",
//            3
//        )
//        questionsList.add(que42)
//
//        val que43 = Quiz(43,"What is the name of the character?",
//            R.drawable.n43,
//            "Machi Kuragi",
//            "Isuzu Sohma",
//            "Kyoko Honda",
//            "Mine Kuramae",
//            4
//        )
//        questionsList.add(que43)

//        val que45 = Quiz(45,"What is the name of the character?",
//            R.drawable.n45,
//            "Yuki Sohma",
//            "Akito Sohma",
//            "Ayame Sohma",
//            "Ritsu Sohma",
//            2
//        )
//        questionsList.add(que45)
//
//        val que46 = Quiz(46,"What is the name of the character?",
//            R.drawable.n46,
//            "Kimi Toudou",
//            "Mine Kuramae",
//            "Machi Kuragi",
//            "Tohru Honda",
//            3
//        )
//        questionsList.add(que46)
//
//        val que47 = Quiz(47,"What is the name of the character?",
//            R.drawable.n47,
//            "Hatori Sohma",
//            "Momiji Sohma",
//            "Yuki Sohma",
//            "Hatsuharu Sohma",
//            4
//        )
//        questionsList.add(que47)
//
//        val que48 = Quiz(48,"What is the name of the character?",
//            R.drawable.n48,
//            "Megumi Hanajima",
//            "Naohito Sakuragi",
//            "Kunimitsu Tomoda",
//            "Yuki Sohma",
//            2
//        )
//        questionsList.add(que48)

//        val que50 = Quiz(50,"What is the name of the character?",
//            R.drawable.n50,
//            "Isuzu Sohma",
//            "Tohru Honda",
//            "Kagura Sohma",
//            "Kyoko Honda",
//            2
//        )
//        questionsList.add(que50)
//
//        val que51 = Quiz(51,"What is the name of the character?",
//            R.drawable.n51,
//            "Mayuko Shiraki",
//            "Isuzu Sohma",
//            "Mitsuru",
//            "Arisa Uotani",
//            1
//        )
//        questionsList.add(que51)

//        val que53 = Quiz(53,"What is the name of the character?",
//            R.drawable.n53,
//            "Kisa Sohma",
//            "Arisa Uotani",
//            "Kimi Toudou",
//            "Kagura Sohma",
//            2
//        )
//        questionsList.add(que53)
//
//        val que54 = Quiz(54,"What is the name of the character?",
//            R.drawable.n54,
//            "Kagura Sohma",
//            "Kisa Sohma",
//            "Ritsu Sohma",
//            "Motoko Minagawa",
//            2
//        )
//        questionsList.add(que54)
//
//        val que55 = Quiz(55,"What is the name of the character?",
//            R.drawable.n55,
//            "Motoko Minagawa",
//            "Arisa Uotani",
//            "Kimi Toudou",
//            "Tohru Honda",
//            1
//        )
//        questionsList.add(que55)
//
//        val que56 = Quiz(56,"What is the name of the character?",
//            R.drawable.n56,
//            "Hatori Sohma",
//            "Ayame Sohma",
//            "Shigure Sohma",
//            "Momiji Sohma",
//            2
//        )
//        questionsList.add(que56)
//
//        val que59 = Quiz(59,"What is the name of the character?",
//            R.drawable.n59,
//            "Hiro Sohma",
//            "Momiji Sohma",
//            "Hatori Sohma",
//            "Kureno Sohma",
//            3
//        )
//        questionsList.add(que59)
//
//        val que60 = Quiz(60,"What is the name of the character?",
//            R.drawable.n60,
//            "Kakeru Manabe",
//            "Yuki Sohma",
//            "Kunimitsu Tomoda",
//            "Naohito Sakuragi",
//            1
//        )
//        questionsList.add(que60)

//        val que82 = Quiz(82,"What is the name of the character?",
//            R.drawable.n82,
//            "Hiro Kurusu",
//            "Satowa Hozuki",
//            "Isaki Kudo",
//            "Akira Dōjima",
//            1
//        )
//        questionsList.add(que82)
//
//        val que83 = Quiz(83,"What is the name of the character?",
//            R.drawable.n83,
//            "Akira Dōjima",
//            "Satowa Hozuki",
//            "Dōjima",
//            "Keishi Dōjima",
//            1
//        )
//        questionsList.add(que83)
//
//        val que84 = Quiz(84,"What is the name of the character?",
//            R.drawable.n84,
//            "Tetsuki Takaoka",
//            "Suzuka Takinami",
//            "Takezo Kurata",
//            "Chika Kudo",
//            4
//        )
//        questionsList.add(que84)
//
//        val que85 = Quiz(85,"What is the name of the character?",
//            R.drawable.n85,
//            "Tetsuki Takaoka",
//            "Chika Kudo",
//            "Takezo Kurata",
//            "Suzuka Takinami",
//            1
//        )
//        questionsList.add(que85)
//
//        val que86 = Quiz(86,"What is the name of the character?",
//            R.drawable.n86,
//            "Suzuka Takinami",
//            "Kaoru Takinami",
//            "Gen Kudo",
//            "Keishi Dōjima",
//            1
//        )
//        questionsList.add(que86)
//
//        val que87 = Quiz(87,"What is the name of the character?",
//            R.drawable.n87,
//            "Mio Kanzaki",
//            "Kaoru Takinami",
//            "Ousuke Kiryu",
//            "Suzuka Takinami",
//            2
//        )
//        questionsList.add(que87)

//        val que89 = Quiz(89,"What is the name of the character?",
//            R.drawable.n89,
//            "Taishin Yamamoto",
//            "Ousuke Kiryu",
//            "Saneyasu Adachi",
//            "Takeru Kurata",
//            3
//        )
//        questionsList.add(que89)
//
//        val que90 = Quiz(90,"What is the name of the character?",
//            R.drawable.n90,
//            "Michitaka Sakai",
//            "Ousuke Kiryu",
//            "Haru Kasugai",
//            "Kota Mizuhara",
//            1
//        )
//        questionsList.add(que90)

//        val que92 = Quiz(92,"What is the name of the character?",
//            R.drawable.n92,
//            "Yae Masamoto",
//            "Shizune Nishina",
//            "Wakaba",
//            "Uta Suzumori",
//            2
//        )
//        questionsList.add(que92)
//
//        val que94 = Quiz(94,"What is the name of the character?",
//            R.drawable.n94,
//            "Taishin Yamamoto",
//            "Tsukaji",
//            "Takeru Kurata",
//            "Sentaro Miya",
//            3
//        )
//        questionsList.add(que94)
//
//        val que95 = Quiz(95,"What is the name of the character?",
//            R.drawable.n95,
//            "Taishin Yamamoto",
//            "Keishi Dōjima",
//            "Gen Kudo",
//            "Reiji Hozuki",
//            4
//        )
//        questionsList.add(que95)
//
//        val que96 = Quiz(96,"What is the name of the character?",
//            R.drawable.n96,
//            "Rui Natsume",
//            "Mashiro",
//            "Nene Ootori",
//            "Minami",
//            2
//        )
//        questionsList.add(que96)
//
//        val que97 = Quiz(97,"What is the name of the character?",
//            R.drawable.n97,
//            "Yae Masamoto",
//            "Kiyoka Amamiya",
//            "Uta Suzumori",
//            "Tsukasa Yukimori",
//            4
//        )
//        questionsList.add(que97)

//        val que99 = Quiz(99,"What is the name of the character?",
//            R.drawable.n99,
//            "Wakaba",
//            "Kou",
//            "Hozumi Tachibana",
//            "Uta Suzumori",
//            4
//        )
//        questionsList.add(que99)
//
//        val que100 = Quiz(100,"What is the name of the character?",
//            R.drawable.n100,
//            "Fujimoto",
//            "Haru Kasugai",
//            "Taishin Yamamoto",
//            "Tsukaji",
//            3
//        )
//        questionsList.add(que100)
//
//        val que121 = Quiz(121,"What is the name of the character?",
//            R.drawable.n121,
//            "Antarcticite",
//            "Cinnabar",
//            "Phosphophyllite",
//            "Diamond",
//            3
//        )
//        questionsList.add(que121)
//
//        val que122 = Quiz(122,"What is the name of the character?",
//            R.drawable.n122,
//            "Cinnabar",
//            "Diamond",
//            "Zircon",
//            "Rutile",
//            2
//        )
//        questionsList.add(que122)

//        val que124 = Quiz(124,"What is the name of the character?",
//            R.drawable.n124,
//            "Bort",
//            "Antarcticite",
//            "Cinnabar",
//            "Alexandrite",
//            3
//        )
//        questionsList.add(que124)
//
//        val que126 = Quiz(126,"What is the name of the character?",
//            R.drawable.n126,
//            "Admirabilis",
//            "Ventricosus",
//            "Shiro",
//            "Aculeatus",
//            4
//        )
//        questionsList.add(que126)
//
//        val que127 = Quiz(127,"What is the name of the character?",
//            R.drawable.n127,
//            "Kongo",
//            "Bort",
//            "Euclase",
//            "Fluorite",
//            1
//        )
//        questionsList.add(que127)
//
//        val que128 = Quiz(128,"What is the name of the character?",
//            R.drawable.n128,
//            "Goshenite",
//            "Neptunite",
//            "Chrysoberyl",
//            "Bort",
//            4
//        )
//        questionsList.add(que128)

//        val que130 = Quiz(130,"What is the name of the character?",
//            R.drawable.n130,
//            "Jade",
//            "Alexandrite",
//            "Padparadscha",
//            "Heliodor",
//            2
//        )
//        questionsList.add(que130)
//
//        val que131 = Quiz(131,"What is the name of the character?",
//            R.drawable.n131,
//            "Euclase",
//            "Heliodor",
//            "Goshenite",
//            "Hemimorphite",
//            1
//        )
//        questionsList.add(que131)
//
//        val que132 = Quiz(132,"What is the name of the character?",
//            R.drawable.n132,
//            "Fluorite",
//            "Peridot",
//            "Ghost Quartz",
//            "Goshenite",
//            4
//        )
//        questionsList.add(que132)
//
//        val que133 = Quiz(133,"What is the name of the character?",
//            R.drawable.n133,
//            "Morganite",
//            "Jade",
//            "Neptunite",
//            "Hemimorphite",
//            2
//        )
//        questionsList.add(que133)
//
//        val que134 = Quiz(134,"What is the name of the character?",
//            R.drawable.n134,
//            "Padparadscha",
//            "Red Beryl",
//            "Morganite",
//            "Sphene",
//            3
//        )
//        questionsList.add(que134)
//
//        val que135 = Quiz(135,"What is the name of the character?",
//            R.drawable.n135,
//            "Peridot",
//            "Red Beryl",
//            "Padparadscha",
//            "Sphene",
//            3
//        )
//        questionsList.add(que135)

//        val que137 = Quiz(137,"What is the name of the character?",
//            R.drawable.n137,
//            "Admirabilis",
//            "Aculeatus",
//            "Ventricosus",
//            "Shiro",
//            4
//        )
//        questionsList.add(que137)
//
//        val que138 = Quiz(138,"What is the name of the character?",
//            R.drawable.n138,
//            "Zircon",
//            "Sapphire",
//            "Topaz",
//            "Yellow Diamond",
//            4
//        )
//        questionsList.add(que138)

//        val que140 = Quiz(140,"What is the name of the character?",
//            R.drawable.n140,
//            "Phosphophyllite",
//            "Watermelon Tourmaline",
//            "Hemimorphite",
//            "Jade",
//            3
//        )
//        questionsList.add(que140)

        return questionsList

    }
}