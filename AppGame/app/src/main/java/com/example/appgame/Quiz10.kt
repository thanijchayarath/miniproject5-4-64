package com.example.appgame
//tokyo 5
//kono 5
//fruit 5
//houseki 5
object Quiz10 {

    const val USER_NAME:String = "Username"
    const val TOTAL_QUESTIONS:String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answer"


    fun getQuestion():ArrayList<Quiz> {
        val questionsList = java.util.ArrayList<Quiz>(20)

//        val que21 = Quiz(21, "Where is here?",
//                R.drawable.n21,
//                "ตึกอาคารในโตเกียว",
//                "ใจกลางโตเกียว",
//                "ตึกร้างในโตเกียว",
//                "ชายแดนโตเกียว",
//                2
//        )
//        questionsList.add(que21)
//
//        val que22 = Quiz(22, "Where is here?",
//                R.drawable.n22,
//                "มหาวิทยาลัย",
//                "โรงเรียน",
//                "โรงแรม",
//                "คอนโด",
//                1
//        )
//        questionsList.add(que22)

        val que181 = Quiz(181, "Where is here?",
                R.drawable.n23,
                "ทางเดิน",
                "ในตรอกซอย",
                "ที่จอดรถ",
                "ห้องเช่า",
                2
        )
        questionsList.add(que181)

        val que182 = Quiz(182,"Where is here?",
                R.drawable.n63,
                "Tohru's House",
                "Kyo's House",
                "Yuki's House",
                "Shigure's House",
                4
        )
        questionsList.add(que182)

        val que183 = Quiz(183,"Where is here?",
                R.drawable.n103,
                "ห้องเก็บของ",
                "ห้องชมรมโคโตะ",
                "ห้องนอน",
                "ห้องพักอาจารย์",
                2
        )
        questionsList.add(que183)

        val que184 = Quiz(184,"Where is here?",
                R.drawable.n67,
                "ห้องนั่งเล่นของบ้านกระท่อม",
                "ห้องนั่งเล่นของบ้านชิงูเระ",
                "ห้องนั่งเล่นของที่ทำงานอายาเมะ",
                "ห้องนั่งเล่นของบ้านพักตากอากาศ",
                1
        )
        questionsList.add(que184)

        val que185 = Quiz(185, "Where are they?",
                R.drawable.n30,
                "โถงทางเดินCCG",
                "ลานประลองกลางเวหา",
                "มารีนฟอร์ด",
                "ศูนย์กลางCCG",
                4
        )
        questionsList.add(que185)

        val que186 = Quiz(186,"Where is here?",
                R.drawable.n149,
                "ลานน้ำแข็ง",
                "ลานสเก็ต",
                "ขั้วโลกใต้",
                "ภูเขาน้ำแข็ง",
                1
        )
        questionsList.add(que186)

        val que187 = Quiz(187,"Where is here?",
                R.drawable.n117,
                "ห้องลุงเก็น",
                "ห้องทาคาโอกะ",
                "ห้องอิซากิ",
                "ห้องจิกะ",
                2
        )
        questionsList.add(que187)

        val que188 = Quiz(188, "Where is here?",
                R.drawable.n33,
                "โตเกียว",
                "เกียวโต",
                "โซล",
                "ดาดฟ้า",
                4
        )
        questionsList.add(que188)

        val que189 = Quiz(189,"Where is here?",
                R.drawable.n76,
                "Yuki's Room",
                "Akito's Room",
                "Hatori's Room",
                "Kureno's Room",
                2
        )
        questionsList.add(que189)

        val que190 = Quiz(190,"Where is here?",
                R.drawable.n144,
                "ห้องนอน",
                "ห้องใต้ถุนบ้าน",
                "ห้องประชุม",
                "ห้องครัว",
                2
        )
        questionsList.add(que190)

        val que191 = Quiz(191, "Where is here?",
                R.drawable.n38,
                "บ้าน",
                "บริษัท",
                "CCG",
                "คฤหาสน์วงคำเหลา",
                1
        )
        questionsList.add(que191)

        val que192 = Quiz(192,"Where is here?",
                R.drawable.n109,
                "โรงเรียนโทคิเสะ",
                "โรงเรียนเมเรียว",
                "โรงเรียนฮาคุโตะ",
                "โรงเรียนหญิงล้วนฮิเมะซากะ",
                4
        )
        questionsList.add(que192)

        val que193 = Quiz(193,"Where is here?",
                R.drawable.n106,
                "บ้านโดจิม่า",
                "บ้านจิกะ",
                "บ้านแม่โฮซุกิ",
                "บ้านโฮซุกิ",
                4
        )
        questionsList.add(que193)

        val que194 = Quiz(194,"Where is here?",
                R.drawable.n155,
                "ก้นทะเล",
                "ใต้ท้องทะเล",
                "ท้องทะเล",
                "คาบมหาสมุทร",
                1
        )
        questionsList.add(que194)

        val que195 = Quiz(195,"Where is here?",
                R.drawable.n62,
                "Kyo Room",
                "Yuki Room",
                "Kazuma Room",
                "Isolation Room",
                4
        )
        questionsList.add(que195)

        val que196 = Quiz(196, "Where is here?",
                R.drawable.n28,
                "ห้องนอน",
                "ห้องเรียน",
                "ร้านกาแฟ",
                "พิพิธภัณฑ์",
                3
        )
        questionsList.add(que196)

        val que197 = Quiz(197,"Where is here?",
                R.drawable.n71,
                "Momiji's Room",
                "Shigure's Room",
                "Tohru's Room",
                "Hatori's Room",
                4
        )
        questionsList.add(que197)

        val que198 = Quiz(198,"Where is here?",
                R.drawable.n147,
                "ห้องนอนรวม",
                "เต้นท์จำศีล",
                "เตียงใหญ่รวม",
                "ห้องจำศีล",
                2
        )
        questionsList.add(que198)

        val que199 = Quiz(199,"Where is here?",
                R.drawable.n119,
                "Shizune's House",
                "Hozuki's House",
                "Gen's House",
                "Chika's House",
                1
        )
        questionsList.add(que199)

        val que200 = Quiz(200,"Where is here?",
                R.drawable.n159,
                "ในจิตใจของPhosphophyllite",
                "ในจิตใจของKongo",
                "ในจิตใจของAntarcticite",
                "ในจิตใจของDiamond",
                1
        )
        questionsList.add(que200)

//        val que24 = Quiz(24, "Where is here?",
//                R.drawable.n24,
//                "ในตรอกซอย",
//                "ซอยมืด",
//                "ทางเดิน",
//                "ช่องแคบตึก",
//                3
//        )
//        questionsList.add(que24)
//
//        val que25 = Quiz(25, "Where is here?",
//                R.drawable.n25,
//                "ทางเดินเชื่อมตึก",
//                "ฟุตบาทโตเกียว",
//                "ในตึก",
//                "สวนสาธารณะ",
//                1
//        )
//        questionsList.add(que25)

//        val que26 = Quiz(26, "Where is here?",
//                R.drawable.n26,
//                "Kaneki's Room",
//                "Hideyoshi's Room",
//                "Uta's Room",
//                "Nishio's Room",
//                2
//        )
//        questionsList.add(que26)
//
//        val que27 = Quiz(27, "Where is here?",
//                R.drawable.n27,
//                "สำนักงานCCG",
//                "ห้องประชุมCCG",
//                "โถงทางเดินCCG",
//                "ห้องเรียนCCG",
//                1
//        )
//        questionsList.add(que27)
//
//        val que29 = Quiz(29, "Where is here?",
//                R.drawable.n29,
//                "ในจิตใจ",
//                "แปลงดอกไม้",
//                "สวนดอกไม้",
//                "ทุ่งดอกไม้",
//                1
//        )
//        questionsList.add(que29)
//
//        val que31 = Quiz(31, "Where is here?",
//                R.drawable.n31,
//                "ลานหิมะ",
//                "สวนสาธารณะ",
//                "เอโดะ",
//                "ใจกลางโตเกียว",
//                2
//        )
//        questionsList.add(que31)
//
//        val que32 = Quiz(32, "Where is here?",
//                R.drawable.n32,
//                "ตึกอาคาร",
//                "ตึกร้าง",
//                "ห้องร้าง",
//                "บ้าน",
//                2
//        )
//        questionsList.add(que32)
//
//        val que34 = Quiz(34, "Where is here?",
//                R.drawable.n34,
//                "ห้องโถงใหญ่",
//                "ห้องสมุด",
//                "ศูนย์หนังสือใหญ่",
//                "ห้าง",
//                2
//        )
//        questionsList.add(que34)
//
//        val que35 = Quiz(35, "Where is here?",
//                R.drawable.n35,
//                "รถไฟชินคันเซ็น",
//                "เหมืองรถไฟ",
//                "ห้าแยกลาดพร้าว",
//                "สถานีรถไฟ",
//                4
//        )
//        questionsList.add(que35)
//
//        val que36 = Quiz(36, "Where is here?",
//                R.drawable.n36,
//                "ทางเท้าโตเกียว",
//                "สวนสาธารณะ",
//                "หน้าตึกCCG",
//                "หน้ามหาวิทยาลัย",
//                3
//        )
//        questionsList.add(que36)
//
//        val que37 = Quiz(37, "Where is here?",
//                R.drawable.n37,
//                "เช็งเม้ง",
//                "ดาวแซนดร้า",
//                "สุสาน",
//                "สุสานคนเป็น",
//                3
//        )
//        questionsList.add(que37)
//
//        val que39 = Quiz(39, "Where is here?",
//                R.drawable.n39,
//                "คุก",
//                "ห้องทรมาน",
//                "ห้องขังCCG",
//                "หลุมดำ",
//                3
//        )
//        questionsList.add(que39)
//
//        val que40 = Quiz(40, "Where is here?",
//                R.drawable.n40,
//                "สวนดอกไม้โอรัน",
//                "สวนกุหลาบ",
//                "โบสถ์",
//                "วังกุหลาบ",
//                2
//        )
//        questionsList.add(que40)
//
//        val que61 = Quiz(61,"Where is here?",
//                R.drawable.n61,
//                "โรงแรม",
//                "โรงเรียน",
//                "หมู่บ้าน",
//                "บริษัท",
//                2
//        )
//        questionsList.add(que61)
//
//        val que64 = Quiz(64,"Where is here?",
//                R.drawable.n64,
//                "Yudo's House",
//                "Tekuando's House",
//                "Karate's House",
//                "Dojo's House",
//                4
//        )
//        questionsList.add(que64)
//
//        val que65 = Quiz(65,"Where is here?",
//                R.drawable.n65,
//                "Honda's House",
//                "Sohma's House",
//                "Kuragi's House",
//                "Hanajima's House",
//                2
//        )
//        questionsList.add(que65)
//
//        val que66 = Quiz(66,"Where is here?",
//                R.drawable.n66,
//                "บ้านอากิโตะ",
//                "บ้านชิงูเระ",
//                "บ้านพักตากอากาศ",
//                "บ้านกระท่อม",
//                4
//        )
//        questionsList.add(que66)
//
//        val que68 = Quiz(68,"Where is here?",
//                R.drawable.n68,
//                "ห้องนั่งเล่นของบ้านโทรุ",
//                "ห้องนั่งเล่นของบ้านชิงูเระ",
//                "ห้องนั่งเล่นของที่ทำงานอายาเมะ",
//                "ห้องนั่งเล่นของบ้านกระท่อม",
//                2
//        )
//        questionsList.add(que68)
//
//        val que69 = Quiz(69,"Where is here?",
//                R.drawable.n69,
//                "ที่ทำงานของพ่อโมมิจิ",
//                "ที่ทำงานของโมมิจิ",
//                "ที่ทำงานของโทรุ",
//                "ที่ทำงานของแม่โมมิจิ",
//                1
//        )
//        questionsList.add(que69)
//
//        val que70 = Quiz(70,"Where are they?",
//                R.drawable.n70,
//                "ดาดฟ้าของบ้านชิงูเระ",
//                "ดาดฟ้าของที่ทำงานพ่อโมมิจิ",
//                "ดาดฟ้าของโรงเรียน",
//                "ดาดฟ้าของบ้านพักตากอากาศ",
//                3
//        )
//        questionsList.add(que70)
//
//        val que72 = Quiz(72,"Where is here?",
//                R.drawable.n72,
//                "Ayame's Room",
//                "Kyo's Room",
//                "Shigure's Room",
//                "Yuki's Room",
//                2
//        )
//        questionsList.add(que72)
//
//        val que73 = Quiz(73,"Where is here?",
//                R.drawable.n73,
//                "ห้องเรียน",
//                "ห้องคณะกรรมการ",
//                "ห้องชมรม",
//                "ห้องเก็บของ",
//                1
//        )
//        questionsList.add(que73)
//
//        val que74 = Quiz(74,"Where is here?",
//                R.drawable.n74,
//                "ดาดฟ้าของโรงเรียน",
//                "ดาดฟ้าของบ้านชิงูเระ",
//                "ดาดฟ้าของบ้านกระท่อม",
//                "ดาดฟ้าของบ้านพักตากอากาศ",
//                2
//        )
//        questionsList.add(que74)
//
//        val que75 = Quiz(75,"Where is here?",
//                R.drawable.n75,
//                "สนามกีฬาโรงเรียน",
//                "สนามเด็กเล่น",
//                "ห้องเรียนของโมมิจิ",
//                "สวนสาธารณะ",
//                1
//        )
//        questionsList.add(que75)
//
//        val que77 = Quiz(77,"Where is here?",
//                R.drawable.n77,
//                "โรงแรม",
//                "ห้องเช่า",
//                "รีสอร์ท",
//                "คอนโด",
//                2
//        )
//        questionsList.add(que77)
//
//        val que78 = Quiz(78,"Where is here?",
//                R.drawable.n78,
//                "Yuki's Room",
//                "Tohru's Room",
//                "Kyo's Room",
//                "Shigure's Room",
//                4
//        )
//        questionsList.add(que78)
//
//        val que79 = Quiz(79,"Where is here?",
//                R.drawable.n79,
//                "Tohru's Room",
//                "Yuki's Room",
//                "Isuzu's Room",
//                "Kyo's Room",
//                1
//        )
//        questionsList.add(que79)
//
//        val que80 = Quiz(80,"Where is here?",
//                R.drawable.n80,
//                "Ayame's Room",
//                "Isuzu's Room",
//                "Hatsuharu's Room",
//                "Kagura's Room",
//                3
//        )
//        questionsList.add(que80)
//
//        val que101 = Quiz(101,"Where is here?",
//                R.drawable.n101,
//                "Gen's House",
//                "Chika's House",
//                "Shizune's House",
//                "Hozuki's House",
//                3
//        )
//        questionsList.add(que101)
//
//        val que102 = Quiz(102,"Where is here?",
//                R.drawable.n102,
//                "ทางเดินในสวนสาธารณะ",
//                "ทางเดินในโรงเรียน",
//                "ทางเดินในมหาลัย",
//                "ทางเดินฟุตบาท",
//                2
//        )
//        questionsList.add(que102)
//
//        val que104 = Quiz(104,"Where is here?",
//                R.drawable.n104,
//                "หน้าห้องชมรมโคโตะ",
//                "หน้าห้องเรียน",
//                "หน้าห้องเก็บของ",
//                "หน้าห้องนอน",
//                1
//        )
//        questionsList.add(que104)
//
//        val que105 = Quiz(105,"Where is here?",
//                R.drawable.n105,
//                "หน้าบ้านตระกูลโฮซุกิ",
//                "หน้าบ้านจิกะ",
//                "หน้าบ้านโฮซุกิ",
//                "หน้าบ้านแม่โฮซุกิ",
//                3
//        )
//        questionsList.add(que105)
//
//        val que107 = Quiz(107,"Where is here?",
//                R.drawable.n107,
//                "ห้องชิซูเนะ",
//                "ห้องลุงเก็น",
//                "ห้องอิซากิ",
//                "ห้องจิกะ",
//                3
//        )
//        questionsList.add(que107)
//
//        val que108 = Quiz(108,"Where is here?",
//                R.drawable.n108,
//                "ห้องนอนจิกะ",
//                "ห้องนอนอิซากิ",
//                "ที่นอนจิกะ",
//                "ที่นอนอิซากิ",
//                1
//        )
//        questionsList.add(que108)
//
//        val que110 = Quiz(110,"Where are they?",
//                R.drawable.n110,
//                "ห้องหลังเวที",
//                "ทางเดินเชื่อมตึก",
//                "Hall",
//                "ทางเดินhall",
//                3
//        )
//        questionsList.add(que110)
//
//        val que111 = Quiz(111,"Where is here?",
//                R.drawable.n111,
//                "ห้องชมรมโคโตะ",
//                "ห้องซ้อมหลังเวที",
//                "ห้องเก็บเสียง",
//                "ห้องเก็บเครื่องดนตรีโคโตะ",
//                2
//        )
//        questionsList.add(que111)
//
//        val que112 = Quiz(112,"Where is here?",
//                R.drawable.n112,
//                "ห้องพยาบาลในห้าง",
//                "ห้องพยาบาลในโรงเรียน",
//                "ห้องพยาบาลในตึกแข่งขัน",
//                "ห้องพยาบาลในสวนสนุก",
//                3
//        )
//        questionsList.add(que112)
//
//        val que113 = Quiz(113,"Where is here?",
//                R.drawable.n113,
//                "ห้องเรียนรุ่นพี่ทาเคโซ",
//                "ห้องเรียนมาชิโระ",
//                "ห้องเรียนจิกะ",
//                "ห้องเรียนโคตะ",
//                1
//        )
//        questionsList.add(que113)
//
//        val que114 = Quiz(114,"Where is here?",
//                R.drawable.n114,
//                "ดาดฟ้าคอนโด",
//                "ดาดฟ้าโรงแรม",
//                "ดาดฟ้าของบ้าน",
//                "ดาดฟ้าโรงเรียน",
//                4
//        )
//        questionsList.add(que114)
//
//        val que115 = Quiz(115,"Where is here?",
//                R.drawable.n115,
//                "เวทีกลางแจ้ง",
//                "เวทีในสวนสาธารณะ",
//                "เวทีแข่งขัน",
//                "เวทีโรงเรียน",
//                3
//        )
//        questionsList.add(que115)
//
//        val que116 = Quiz(116,"Where is here?",
//                R.drawable.n116,
//                "เวทีโรงเรียน",
//                "เวทีกลางแจ้ง",
//                "เวทีแข่งขัน",
//                "เวทีในสวนสาธารณะ",
//                1
//        )
//        questionsList.add(que116)
//
//        val que118 = Quiz(118,"Where is here?",
//                R.drawable.n118,
//                "Shizune's House",
//                "Chika's House",
//                "Gen's House",
//                "Isaki's House",
//                3
//        )
//        questionsList.add(que118)
//
//        val que120 = Quiz(120,"Where is here?",
//                R.drawable.n120,
//                "ร้านโอโคโนมิยากิ",
//                "ภัตราคาร",
//                "ร้านปิ้งย่าง",
//                "ร้านมอนจา",
//                4
//        )
//        questionsList.add(que120)
//
//        val que141 = Quiz(141,"Where is here?",
//                R.drawable.n141,
//                "Phosphophyllite's Room",
//                "Diamond's Room",
//                "Rutile's Room",
//                "Cinnabar's Room",
//                2
//        )
//        questionsList.add(que141)
//
//        val que142 = Quiz(142,"Where is here?",
//                R.drawable.n142,
//                "สวนหญ้า",
//                "สวนสาธารณะ",
//                "สวนผัก",
//                "สวนหย่อม",
//                1
//        )
//        questionsList.add(que142)
//
//        val que143 = Quiz(143,"Where is here?",
//                R.drawable.n143,
//                "สวนหญ้า",
//                "บนเมฆของพวกmoon",
//                "สวนหญ้าใกล้ถ้ำ",
//                "สวนหญ้าใกล้หน้าผา",
//                4
//        )
//        questionsList.add(que143)
//
//        val que145 = Quiz(145,"Where is here?",
//                R.drawable.n145,
//                "สวนหญ้ารอบบ้าน",
//                "สวนหญ้าลานกว้างฤดูร้อน",
//                "สวนหญ้าลานกว้างฤดูหนาว",
//                "สวนหญ้า",
//                3
//        )
//        questionsList.add(que145)
//
//        val que146 = Quiz(146,"Where is here?",
//                R.drawable.n146,
//                "ห้องประชุม",
//                "ห้องนอน",
//                "ห้องอาบน้ำ",
//                "ห้องนั่งเล่น",
//                3
//        )
//        questionsList.add(que146)
//
//        val que148 = Quiz(148,"Where is here?",
//                R.drawable.n148,
//                "หน้าผา",
//                "ถ้ำ",
//                "ช่องแคบมฤตยู",
//                "เมฆ",
//                2
//        )
//        questionsList.add(que148)
//
//        val que150 = Quiz(150,"Where are they?",
//                R.drawable.n150,
//                "ขั้วโลกเหนือ",
//                "ทะเล",
//                "ลานน้ำแข็ง",
//                "ภูเขาน้ำแข็ง",
//                3
//        )
//        questionsList.add(que150)
//
//        val que151 = Quiz(151,"Where is here?",
//                R.drawable.n151,
//                "ลานกว้าง",
//                "เมฆของพวกmoon",
//                "หน้าผา",
//                "ลานน้ำแข็ง",
//                2
//        )
//        questionsList.add(que151)
//
//        val que152 = Quiz(152,"Where is here?",
//                R.drawable.n152,
//                "ใกล้หน้าผา",
//                "ลานกว้าง",
//                "สวนหญ้า",
//                "ทะเล",
//                1
//        )
//        questionsList.add(que152)
//
//        val que153 = Quiz(153,"Where is here?",
//                R.drawable.n153,
//                "ลานกว้าง",
//                "หน้าผา",
//                "สวนหญ้า",
//                "ทะเล",
//                2
//        )
//        questionsList.add(que153)
//
//        val que154 = Quiz(154,"Where is here?",
//                R.drawable.n154,
//                "ทะเล",
//                "ในถ้ำ",
//                "หน้าถ้ำ",
//                "หลังถ้ำ",
//                3
//        )
//        questionsList.add(que154)
//
//        val que156 = Quiz(156,"Where is here?",
//                R.drawable.n156,
//                "ในห้องขัง",
//                "ในทอง",
//                "ในกล่องอัญมณี",
//                "ในคุก",
//                2
//        )
//        questionsList.add(que156)
//
//        val que157 = Quiz(157,"Where is here?",
//                R.drawable.n157,
//                "Amethyst's Room",
//                "Jade's Room",
//                "Phosphophyllite's Room",
//                "Alexandrite's Room",
//                3
//        )
//        questionsList.add(que157)
//
//        val que158 = Quiz(158,"Where is here?",
//                R.drawable.n158,
//                "บนหัวของShiro",
//                "ในขนของShiro",
//                "บนตัวของShiro",
//                "บนหางของShiro",
//                3
//        )
//        questionsList.add(que158)
//
//        val que160 = Quiz(160,"Where is here?",
//                R.drawable.n160,
//                "Jade's Room",
//                "Goshenite's Room",
//                "Hemimorphite's Room",
//                "Kongo's Room",
//                4
//        )
//        questionsList.add(que160)

        return questionsList

    }

}