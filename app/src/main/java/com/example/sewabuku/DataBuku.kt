package com.example.sewabuku

object DataBuku {
    private val namaBuku = arrayOf("Sebuah Seni Untuk Bersikap Bodo Amat",
        "Practical Malware Analysis",
        "Sang Pangeran dan Janissary Terakhir",
        "Semua Ada Saatnya",
        "Android Application Development For Dummies",
        "Muhammad Al-Fatih 1453",
        "Obat Malas Dosis Tinggi",
        "Lapis-Lapis Keberkahan",
        "Metasploit: The Penetration Tester's Guide",
        "Buku Sakti Wireless Hacking",
        "Reversing: Secrets of Reverse Engineering",
        "The Hunger Games")

    private val detailBuku = arrayOf("Selama beberapa tahun belakangan, Mark Manson—melalui blognya yang sangat populer—telah membantu mengoreksi harapan-harapan delusional kita, baik mengenai diri kita sendiri maupun dunia. Ia kini menuangkan buah pikirnya yang keren itu di dalam buku hebat ini.\n" +
            "“Dalam hidup ini, kita hanya punya kepedulian dalam jumlah yang terbatas. Makanya, Anda harus bijaksana dalam menentukan kepedulian Anda.” Manson menciptakan momen perbincangan yang serius dan mendalam, dibungkus dengan cerita-cerita yang menghibur dan “kekinian”, serta humor yang cadas. Buku ini merupakan tamparan di wajah yang menyegarkan untuk kita semua, supaya kita bisa mulai menjalani kehidupan yang lebih memuaskan, dan apa adanya.",
        "Malware analysis is big business, and attacks can cost a company dearly. When malware breaches your defenses, you need to act quickly to cure current infections and prevent future ones from occurring.\n" +
                "\n" + "For those who want to stay ahead of the latest malware, Practical Malware Analysis will teach you the tools and techniques used by professional analysts. With this book as your guide, you'll be able to safely analyze, debug, and disassemble any malicious software that comes your way.",
        "Kisah, Kasih, dan Selisih dalam Perang Dipanegara",
        "Buku “Semua Ada Saatnya” ini mengajak pembaca untuk lebih menikmati hidup dengan membaca kisah-kisah menarik dan santai yang sangat menginspirasi dan memberi semangat. Tentu agar stamina spiritual Anda selalu terjaga. Tak pelak buku ini layak Anda baca untuk menemani waktu santai Anda",
        "Learn to create amazing apps for latest Android smartphone and tablets",
        "Ada cara yang menyenangkan untuk mengubah kepribadian Anda agar menjadi selevel para ksatria Islam yang terpisah zaman dan waktu, bacalah sejarah",
        "Obat Malas Dosis Tinggi merupakan karya cerdas, kreatif, inovatif, yang bermanfaat untuk anak-anak, remaja, orang tua, dan bahkan para calon dai yang masih belajar mengembangkan diri.",
        "Memburu berkah amatlah berat. Tapi justru di dalamnyalah ada banyak rasa nikmat.\n" +
                "\n" +
                "Bahagia adalah kata paling menyihir dalam hidup manusia.\n" +
                "Semua jiwa merinduinya. Semua akal mengharapinya. Semua raga mengejarnya. Tapi kebahagiaan adalah goda yang tega. Ia bayangan yang melipir jika difikir, lari jika dicari, tak tentu jika diburu, melesat jika ditangkap, menghilang jika dihadang.",
        "The Metasploit Framework makes discovering, exploiting, and sharing vulnerabilities quick and relatively painless. But while Metasploit is used by security professionals everywhere, the tool can be hard to grasp for first-time users. Metasploit: The Penetration Tester's Guide fills this gap by teaching you how to harness the Framework and interact with the vibrant community of Metasploit contributors.\n" +
                "\n" +
                "Once you've built your foundation for penetration testing, you'll learn the Framework's conventions, interfaces, and module system as you launch simulated attacks. You'll move on to advanced penetration testing techniques, including network reconnaissance and enumeration, client-side attacks, wireless attacks, and targeted social-engineering attacks.",
        "Buku Sakti Wireless Hacking ini merupakan edisi revisi dari buku yang berjudul “Step by Step Wireless Hacking”. Pergantian judul dilakukan karena ada berbagai penambahan materi dan update lainnya. Tujuannya agar menjadi lebih fokus dan tepat sasaran dalam melakukan aksi wireless hacking. Apalagi, saat ini telah lahir Windows 10. Melalui buku ini, Anda akan mempelajari bagaimana mencari, bahkan mengeksploitasi kelemahan yang ada pada jaringan wireless. Mulai dari proses War Driving, mencari SSID yang disembunyikan, sampai memecahkan enkripsi WEP maupun WPA/WPA2. Aksi Denial of Service (Dos) pun bisa dilakukan pada wireless hacking. Tidak hanya itu, aksi wireless hacking ini juga banyak digunakan untuk menyadap password orang lain. Bagaimana membongkar \"jeroan\" perangkat wireless tanpa harus membukanya secara fisik.",
        "Beginning with a basic primer on reverse engineering-including computer internals, operating systems, and assembly language-and then discussing the various\n" +
                "applications of reverse engineering, this book provides readers with practical, in-depth techniques for software reverse engineering. The book is broken into two parts, the first deals with security-related reverse engineering and the second explores the more practical aspects of reverse engineering. In addition, the author explains how to reverse engineer a third-party software library to improve interfacing and how to reverse engineer a competitor's software to build a better product.",
        "Could you survive on your own, in the wild, with everyone out to make sure you don't live to see the morning?\n" +
                "\n" +
                "In the ruins of a place once known as North America lies the nation of Panem, a shining Capitol surrounded by twelve outlying districts. The Capitol is harsh and cruel and keeps the districts in line by forcing them all to send one boy and one girl between the ages of twelve and eighteen to participate in the annual Hunger Games, a fight to the death on live TV. Sixteen-year-old Katniss Everdeen, who lives alone with her mother and younger sister, regards it as a death sentence when she is forced to represent her district in the Games. But Katniss has been close to dead before - and survival, for her, is second nature. Without really meaning to, she becomes a contender. But if she is to win, she will have to start making choices that weigh survival against humanity and life against love.\n" +
                "\n" +
                "New York Times bestselling author Suzanne Collins delivers equal parts suspense and philosophy, adventure and romance, in this searing novel set in a future with unsettling parallels to our present.")

    private val bukuImages = intArrayOf(R.drawable.bodo_amat,
        R.drawable.practical_malware,
        R.drawable.sang_pangeran,
        R.drawable.ada_saatnya,
        R.drawable.arduino,
        R.drawable.alfatih_1453,
        R.drawable.obat_malas,
        R.drawable.lapis_keberkahan,
        R.drawable.metasploit,
        R.drawable.buku_sakti,
        R.drawable.reversing,
        R.drawable.hunger_games
        )

    private val penerbit = arrayOf("HarperOne", "No Starch Press", "Pro-U Media", "Pustaka Al-Kautsar",
        "For Dummies", "Khilafah Press", "Elex Media Komputindo", "Pro-U Media", "No Starch Press", "Elex Media Komputindo",
        "Wiley", "Scholastic Press")
    private val writer = arrayOf("Mark Manson, F. Wicakso (Translator)", "Michael Sikorski", "Salim A. Fillah", "Syaikh Mahmud Al-Mishri " +
            "Abdul Somad (Translator)", "Michael Burton", "Felix Y. Siauw", "Khalifa Bisma Sanjaya", "Salim A. Fillah",
        "David Kennedy, Jim O'Gorman, Devon Kearns, Mati Aharoni", "Efvy Zam", "Eldad Eilam", "Suzanne Collins")
    private val page = arrayOf("224", "802", "600", "9", "10", "320", "379", "514", "328", "248", "624", "374")
    private val tahun = intArrayOf(2016, 2012, 2019, 2016, 2012, 2011, 2018, 2014, 2011, 2016, 2005, 2008)
    private val harga = arrayOf("Rp. 75.000", "Rp. 650.000", "Rp. 125.000", "Rp. 85.000", "Rp. 25.000",
        "Rp. 100.000", "Rp. 85.000", "Rp. 110.000", "Rp. 450.000", "Rp. 175.000", "Rp. 550.000", "Rp. 200.000")
    private val language =  arrayOf("Indonesia", "English", "Indonesia", "Indonesia", "English", "Indonesia", "Indonesia",
        "Indonesia", "English", "Indonesia", "English", "English")

    val listData: ArrayList<Buku>
        get() {
            val list = arrayListOf<Buku>()

            for (position in namaBuku.indices) {
                val buku = Buku()
                buku.nama = namaBuku[position]
                buku.detail = detailBuku[position]
                buku.photo = bukuImages[position]
                buku.penerbit = penerbit[position]
                buku.page = page[position]
                buku.writer = writer[position]
                buku.tahun = tahun[position]
                buku.harga = harga[position]
                buku.language = language[position]

                list.add(buku)
            }
            return list
        }
}