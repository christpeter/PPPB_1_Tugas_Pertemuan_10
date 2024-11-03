package com.example.pppb1tugaspertemuan10

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val movies = listOf(
            Movie("Venom : The Last Dance", "Action", "1h 49m", R.drawable.venom_poster, "Venom: The Last Dance melanjutkan kisah Eddie Brock dan Venom yang kini harus berhadapan dengan ancaman baru yang lebih kuat. Sebuah organisasi jahat berusaha menguasai kekuatan symbiote dan menciptakan varian baru yang lebih berbahaya.\n" +
                    "\n" +
                    "Berdasarkan cuplikan singkat, cerita dibuka dengan Eddie dan Venom menempel di pesawat yang sedang terbang. Mereka tengah diburu oleh alien berukuran besar dari planet asal Venom. Di sisi lain, mereka juga saat ini sedang diburu oleh agen pemerintah.\n" +
                    "\n" +
                    "Berkaitan dengan para alien di Bumi yang memburu Venom, ia mengatakan pada Eddie, “Bangsaku telah menemukanku.” Eddie pun menanyakan lebih lanjut mengenai pihak yang mengirim mereka.\n" +
                    "\n" +
                    "Venom menjawab bahwa para alien dikirim oleh penciptanya. Venom kemudian mengenalkan sosok Knull yang menciptakan dirinya pada Eddie. Namun, ia menekankan bahwa Knull menjadi ancaman terbesar baginya.\n" +
                    "\n" +
                    "Cuplikan singkat kemudian menampilkan hubungan antara Eddie dan Venom ketika berusaha menyelesaikan misi terkait ancaman berbahaya saat ini. Mereka dituntut untuk saling percaya dan bekerja sama lebih erat.\n" +
                    "\n" +
                    "Di sisi lain, Eddie menghadapi dilema moral yang sulit. Ia harus memilih antara menggunakan kekuatan Venom untuk kepentingan pribadinya atau mengorbankan segalanya demi melindungi orang-orang yang ia cintai."),
            Movie("DOSA MUSYRIK", "Horror", "1h 32m", R.drawable.dosa_poster, "Dosa Musyrik, yang diproduksi oleh MVP Pictures, berkisah tentang seorang pemuda bernama Nugie (diperankan oleh Marthino Lio) yang tengah terjebak masalah ekonomi dan kesulitan membiayai pengobatan ibunya. Dalam keterdesakannya, ia terlilit utang dan harus menghadapi pilihan-pilihan yang berisiko.\n" +
                    "\n" +
                    "Saat menemui jalan buntu, Nugie memilih membawa ibunya yang sakit ke seorang dukun sakti, Mbah Narto (Pritt Timothy). Keputusannya ini membuat adiknya, Tari (Delia Husein), merasa tidak setuju karena bertentangan dengan ajaran agama Islam yang mereka yakini. Namun, demi kesehatan ibunya, Nugie tetap nekat.\n" +
                    "\n" +
                    "Masalah bertambah rumit ketika Nugie kembali mengambil langkah yang lebih berbahaya: mencuri di rumah Mbah Narto untuk melunasi utangnya. Sayangnya, bukan uang yang ia dapat, melainkan sebuah keris keramat yang berharga dan diselimuti misteri. Keris itu ternyata telah diperoleh Mbah Narto dengan perjuangan besar dan penuh pengorbanan.\n" +
                    "\n" +
                    "Sejak saat itu, kehidupan Nugie berubah drastis. Ia mulai dihantui oleh keris keramat yang menyimpan kutukan mengerikan dari sosok makhluk gaib bernama Ni Larapati. Teror demi teror tak henti menghantui hidupnya, membawa keluarga Nugie ke dalam pusaran malapetaka yang tak terduga.\n" +
                    "\n" +
                    "Apa yang diinginkan Ni Larapati, dan bagaimana nasib Nugie serta keluarganya?"),
            Movie("Inside Out 2", "Drama", "1h 36m", R.drawable.inside_out_2_poster, "Perjalanan Riley Andersen (Kensington Tallman) mengenali emosi yang berkecamuk dalam kepalanya belum usai. Kini, ketika ia menginjak usia remaja, emosi yang ia miliki justru makin kompleks.\n" +
                    "\n" +
                    "Riley kini tumbuh menjadi gadis remaja  berusia 13 tahun yang mengalami perubahan dalam hidupnya, ia mulai merasakan iri, cemas, bosan, dan malu.\n" +
                    "\n" +
                    "Perasaan ini memperkuat emosi yang ada dalam dirinya, dulu Riley hanya merasakan rasa senang, sedih, marah, jijik, dan takut.\n" +
                    "\n" +
                    "Di tengah kecamuk emosi yang kian banyak dan kompleks tersebut, Riley mulai bergabung dengan tim hoki di sekolahnya, ia mulai menyesuaikan diri dengan teman-teman barunya.\n" +
                    "\n" +
                    "Pertemuan Riley dengan suasana baru juga orang-orang yang baru membuat Riley merasakan emosi yang ternyata sulit ia pahami, yakni rasa kurang percaya diri.\n" +
                    "\n" +
                    "Kurangnya rasa percaya diri tersebut membuat Riley mengalami perubahan sikap yang cukup drastis. Perubahan sikap Riley ini membuat hubungannya dengan orang-orang terdekatnya menjadi kurang baik.\n" +
                    "\n" +
                    "Namun, perubahan sikap Riley tak hanya berdampak pada orang-orang di sekitarnya. Joy (Amy Poehler) dan emosi lainnya di dalam kepala Riley juga mengalami kegemparan.\n" +
                    "\n" +
                    "Hal tersebut karena Joy dan kawan-kawan harus menghadapi karakter emosi baru, yakni Anxiety (Maya Hawke). Adanya emosi baru yang masuk dalam kepala Riley, membuat emosi lain harus kembali beradaptasi dan bekerja sama agar Riley tak tenggelam dalam rasa kalut. "),
            Movie("Transformer One", "Action", "1h 44m", R.drawable.transformer_poster, "Transformer One akan memfokuskan kisahnya pada dua karakter utama film ini, yaitu Optimus Prime dan Megatron.\n" +
                    "\n" +
                    "Sebelum keduanya bermusuhan, dua robot ini sejatinya adalah dua sahabat yang awalnya Optimus Prime dikenal sebagai Orion Pax dan Megatron dikenal sebagai D-16.\n" +
                    "\n" +
                    "Dua pasang sahabat ini sejatinya adalah saudara seperjuangan yang digadang-gadang dapat mengubah nasib planet Cybertron. Namun, seiring berjalannya waktu, berbagi konflik bermunculan.\n" +
                    "\n" +
                    "Pertentangan di antara keduanya pun tidak mungkin dihindari. Perbedaan dan pertentangan antara Orion Pax dan D-16 itulah yang memicu konflik hebat hingga permusuhan yang menjadi benih pertempuran antara Autobots dan Decepticons yang tiada kunjung padam.\n" +
                    "\n" +
                    "Film ini juga mengisahkan, Optimus dan Megatron akan bertemu dengan B-127 atau Bumblebee. Mereka juga akan bertemu dengan Ariel atau Elita-1.\n" +
                    "\n" +
                    "Pertemuan itu akhirnya memunculkan pertempuran di permukaan planet yang bertujuan melindungi planet Cybertron.\n" +
                    "\n" +
                    "Pertempuran itu juga menjadi upaya para robot ini untuk menghadapi ancaman dari ras luar angkasa yang mengerikan yang dikenal sebagai Quintesson. Quintesson ini diduga adalah pencipta Transformers.\n" +
                    "\n" +
                    "Di film ini juga akan dikisahkan mengenai robot raksasa, bernama Alpha Trion dan Autobots tertua. Keduanya adalah Sentinel Prime, yang menjadi kunci dalam konflik di planet Cybertron ini."),
        )

        recyclerView.adapter = MovieAdapter(this, movies)
    }
}
