package com.recyclerview_darikaflahaa_12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageList = listOf<mobil>(
                mobil(
                        R.drawable.silvias10,
                        "Nissan Silvia (S10) 1975-1979",
                        "Dibekali 2 pilahan mesin 1.8 L18 SOHC I4 dan 2.0 L20B SOHC I4, dengan basic mesin yang diambil dari datsun B210, S10 tak hanya memiliki tenaga yang buas, namun juga mampu menghajar tikungan lebih cepat. Dibeberapa negara Nissan Silvia S10 hadir dengan nama Datsun 200SX. Sayang, ketangguhan bermanufer S10 tak sepopuler rival sesama compact sportcar asal Toyota dan Mazda."
                ),
                mobil(
                        R.drawable.silvias11,
                        "Nissan Silvia (S110) 1979-1985",
                        "Desain serba kotak yang menjadi trend kala itu membuat gernerasi S-Platform ke-2 ini berubah total dari model sebelumnya. Nissan Silvia S110 berbagi sasis dengan Mazda Cosmo yang merupakan mobil jepang pertama yang menggunaan mesin rotary. Di Amerika dan Kanada mobil ini dikenal dengan sebutan Datsun 200SX sedangkan di Mexico dengan nama Datsun Sakura." +
                                "S110 Tersedia dalam bentuk Hardtop Coupe 2-pintu, dan Hatchback Coupe 3-pintu, serta ditawarkan dalam beberapa pilihan mesin baru yang powerfull. Generasi S-Platform ke-2 ini menggunakan Z-series engine dan diantaranya sudah dilengkapi teknologi turbocharger dan injeksi. Tidak hanya Z-series, salah satu varian populer S110 yang menggunakan mesin 2.4 L DOHC FJ24 I4 dengan karburator Twin Solex yaitu 240RS menorehkan prestasi terbaiknya dengan finish diposisi ke-2 pada New Zealand Rally pada rentang tahun 1983 hingga 1985."
                ),
                mobil(
                        R.drawable.silvias12,
                        "Nissan Silvia (S12) 1983-1988",
                        "S12 hadir dengan gaya ikoniknya menggunakan lampu depan flip-flop. Body S-Platform ke-3 (Nissan Silvia seri-4) ini memiliki 3 pilihan model yaitu, coupe (sering disebut notchback), hatchback, dan chassis widebody atau disebut Grandprix yang hanya diproduksi 50 unit di dunia. Pada model hatchback bentuk S12 dan AE86 sangatlah mirip, bahkan S12 terlihat seperti “kakak” AE86 karena berukuran lebih besar." +
                                "Mesin yang di usung S12 adalah 1.8 dan 2.0 liter dengan seri mesin CA dan FJ. Kedua mesin tersebut dibekali dengan pilihan teknologi SOHC dan DOHC yang tersaji dengan pilihan mesin turbo juga. Ditahun 1987 Nissan membuat S12 dengan mesin V6 VG30E untuk pasar Amerika Utara. Mesin yang benamkan pada 200SX (sebutan S12 diamerika) terkenal paling buas diantara mesin S12 lainnya."
                ),


                mobil(
                        R.drawable.silvias13,
                        "Nissan Silvia (S13) 1988-1993",
                        "Mobil penggerak roda belakang selanjutnya adalah Nissan Silvia S13. Di Indonesia S13 sering kita jumpai diajang drifting dan di gunakan oleh drifter-drifter andal nasional. Pihak pabrikan Nissan menghadirkan S13 dengan 3 pilihan model, diantaranya adalah coupe, Hatcback, dan convertible yang muncul dipenghujung dekade dengan nama . Pada model coupe sengat mirip dengan Nissan Cefiro jika dilihat penampakan depannya, sementara model hatchback masih mempertahankan lampu depan flip-flop." +
                                "Untuk export adalah model hatcback yang menggunakan nama 180SX atau 200SX tergantung besarnya mesin. Untuk Amerika, Silvia yang dipasarkan disebut 240SX karena bermesin 2400 cc dan semua bentuk body memiliki lampu depan retractable. Di Jepang S13 Fastback 180SX diproduksi terus setelah S13 Silvia Coupe dihentikan. Model yang unik adalah Sileighty yaitu Fastback yang menggunakan bagian depan Silvia Coupe dengan lampu depan kotak."
                ),
                mobil(
                        R.drawable.silvias14,
                        "Nissan Silvia (S14) 1993-1998",
                        "Melanjutkan kedikdayaan S13 yang sukses merebut hati penggemar mobil berpenggerak roda belakang, S14 hadir dengan penyegaran tampang lebih modern dengan desain lebih membulat. Kemampuan bermanufer serta handling S14 semakin baik berkat wheelbase roda yang diperpanjang." +
                                "Di era S14 mesin 1.8 sudah di tiadakan, sementara mesin yang digunakan masih meneruskan kejayaan mesin SR series milik S13 namun sudah mengalami pembaharuan dengan penambahan teknologi variable valve timing sistem atau Nissan menyebutnya VTC dan perubahan pada intake camsaft serta turbo T28 lebih diperbesar. Sementara 240SX untuk pasar Amerika masih mendapat mesin KA24DE yang sama dengan mesin SUV & Truk Nissan."
                ),
                mobil(
                        R.drawable.silvias15,
                        "Nissan Silvia (S15) 1999-2002",
                        "Inilah Nissan Silvia generasi terakhir yang menjadi salah satu idola di film The Fast and the Furious Tokyo Drift. S-Chassis pada S15 berbeda dari sebelumnya dan hanya dijual di Jepang, Australia, Selandia Baru danTaiwan. Di Taiwan S15 dikenal dengan nama AREX Elite 951." +
                                "Untuk mesin S15 dibekali dengan mesin SR20DET dengan kemampuan mesin lebih ditinkatkan dari SR series sebelumnya yaitu upgrade ball-bearing turbocharger yang mampu meningkatkan tenaga hingga 250hp. Varian lain S15 menggunakan mesin SR20DE tanpa turbo yang dapat menghasilkan tenaga hingga 165hp."
                )


        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_mobil)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter(this, imageList) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)


        }
    }
}