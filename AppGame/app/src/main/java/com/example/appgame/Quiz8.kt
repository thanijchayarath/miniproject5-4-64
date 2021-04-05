package com.example.appgame

object Quiz8 {
    const val USER_NAME:String = "Username"
    const val TOTAL_QUESTIONS:String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answer"


    fun getQuestion():ArrayList<Quiz>{
        val questionsList = java.util.ArrayList<Quiz>()

        val que141 = Quiz(141,"Where is here?",
            R.drawable.n141,
            "Phosphophyllite's Room",
            "Diamond's Room",
            "Rutile's Room",
            "Cinnabar's Room",
            2
        )
        questionsList.add(que141)

        val que142 = Quiz(142,"Where is here?",
            R.drawable.n142,
            "สวนหญ้า",
            "สวนสาธารณะ",
            "สวนผัก",
            "สวนหย่อม",
            1
        )
        questionsList.add(que142)

        val que143 = Quiz(143,"Where is here?",
            R.drawable.n143,
            "สวนหญ้า",
            "บนเมฆของพวกmoon",
            "สวนหญ้าใกล้ถ้ำ",
            "สวนหญ้าใกล้หน้าผา",
            4
        )
        questionsList.add(que143)

        val que144 = Quiz(144,"Where is here?",
            R.drawable.n144,
            "ห้องนอน",
            "ห้องใต้ถุนบ้าน",
            "ห้องประชุม",
            "ห้องครัว",
            2
        )
        questionsList.add(que144)

        val que145 = Quiz(145,"Where is here?",
            R.drawable.n145,
            "สวนหญ้ารอบบ้าน",
            "สวนหญ้าลานกว้างฤดูร้อน",
            "สวนหญ้าลานกว้างฤดูหนาว",
            "สวนหญ้า",
            3
        )
        questionsList.add(que145)

        val que146 = Quiz(146,"Where is here?",
            R.drawable.n146,
            "ห้องประชุม",
            "ห้องนอน",
            "ห้องอาบน้ำ",
            "ห้องนั่งเล่น",
            3
        )
        questionsList.add(que146)

        val que147 = Quiz(147,"Where is here?",
            R.drawable.n147,
            "ห้องนอนรวม",
            "เต้นท์จำศีล",
            "เตียงใหญ่รวม",
            "ห้องจำศีล",
            2
        )
        questionsList.add(que147)

        val que148 = Quiz(148,"Where is here?",
            R.drawable.n148,
            "หน้าผา",
            "ถ้ำ",
            "ช่องแคบมฤตยู",
            "เมฆ",
            2
        )
        questionsList.add(que148)

        val que149 = Quiz(149,"Where is here?",
            R.drawable.n149,
            "ลานน้ำแข็ง",
            "ลานสเก็ต",
            "ขั้วโลกใต้",
            "ภูเขาน้ำแข็ง",
            1
        )
        questionsList.add(que149)

        val que150 = Quiz(150,"Where are they?",
            R.drawable.n150,
            "ขั้วโลกเหนือ",
            "ทะเล",
            "ลานน้ำแข็ง",
            "ภูเขาน้ำแข็ง",
            3
        )
        questionsList.add(que150)

        val que151 = Quiz(151,"Where is here?",
            R.drawable.n151,
            "ลานกว้าง",
            "เมฆของพวกmoon",
            "หน้าผา",
            "ลานน้ำแข็ง",
            2
        )
        questionsList.add(que151)

        val que152 = Quiz(152,"Where is here?",
            R.drawable.n152,
            "ใกล้หน้าผา",
            "ลานกว้าง",
            "สวนหญ้า",
            "ทะเล",
            1
        )
        questionsList.add(que152)

        val que153 = Quiz(153,"Where is here?",
            R.drawable.n153,
            "ลานกว้าง",
            "หน้าผา",
            "สวนหญ้า",
            "ทะเล",
            2
        )
        questionsList.add(que153)

        val que154 = Quiz(154,"Where is here?",
            R.drawable.n154,
            "ทะเล",
            "ในถ้ำ",
            "หน้าถ้ำ",
            "หลังถ้ำ",
            3
        )
        questionsList.add(que154)

        val que155 = Quiz(155,"Where is here?",
            R.drawable.n155,
            "ก้นทะเล",
            "ใต้ท้องทะเล",
            "ท้องทะเล",
            "คาบมหาสมุทร",
            1
        )
        questionsList.add(que155)

        val que156 = Quiz(156,"Where is here?",
            R.drawable.n156,
            "ในห้องขัง",
            "ในทอง",
            "ในกล่องอัญมณี",
            "ในคุก",
            2
        )
        questionsList.add(que156)

        val que157 = Quiz(157,"Where is here?",
            R.drawable.n157,
            "Amethyst's Room",
            "Jade's Room",
            "Phosphophyllite's Room",
            "Alexandrite's Room",
            3
        )
        questionsList.add(que157)

        val que158 = Quiz(158,"Where is here?",
            R.drawable.n158,
            "บนหัวของShiro",
            "ในขนของShiro",
            "บนตัวของShiro",
            "บนหางของShiro",
            3
        )
        questionsList.add(que158)

        val que159 = Quiz(159,"Where is here?",
            R.drawable.n159,
            "ในจิตใจของPhosphophyllite",
            "ในจิตใจของKongo",
            "ในจิตใจของAntarcticite",
            "ในจิตใจของDiamond",
            1
        )
        questionsList.add(que159)

        val que160 = Quiz(160,"Where is here?",
            R.drawable.n160,
            "Jade's Room",
            "Goshenite's Room",
            "Hemimorphite's Room",
            "Kongo's Room",
            4
        )
        questionsList.add(que160)

        return questionsList
    }

}