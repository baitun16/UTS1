package com.example.tugasuts
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFac()
        rv_list_main.layoutManager = LinearLayoutManager(this)
        rv_list_main.setHasFixedSize(true)
        rv_list_main.adapter = FacAdapter(data, { onItem: FacData ->
            onItemClicked(onItem) })
    }
    private fun onItemClicked(onItem: FacData) {
        val showDetailActivityIntent = Intent(this, FacDetail::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.imgFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.nameFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.descFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.descDet)
        startActivity(showDetailActivityIntent)
    }
    private fun createFac(): List<FacData> {
        val rvList = ArrayList<FacData>()
        rvList.add(
            FacData(
                R.drawable.logo_upn,
                "Fakultas Ilmu Komputer",
                "Fakultas Ilmu Komputer\n" +
                        "adalah satu dari dari 7\n" +
                        "program studi di UPN\n" +
                        "VETERAN JATIM",
                "1. Teknik Informatika\n" +
                        "2. Sistem Informasi"
            )
        )
        rvList.add(
            FacData(
                R.drawable.logo_upn,
                "Fakultas Teknik",
                "Fakultas Teknik\n" +
                        "merupakan salah satu dari 7\n" +
                        "Fakultas 'Veteran' Jawa\n" +
                        "Timur. Yang terdiri dari program\n" +
                        "studi: ",
                "1. Teknik Kimia\n" +
                        "2. Teknik Industri\n" +
                        "3. Teknik Sipil\n" +
                        "4. Teknik Lingkungan\n" +
                        "5. Teknologi Pangan"
            )
        )
        rvList.add(
                FacData(
                    R.drawable.logo_upn,
                    "Fakultas Ekonomi dan Bisnis",
                    "Fakultas Ekonomi dan Bisnis\n" +
                            "merupakan salah satu dari 7\n" +
                            "Fakultas 'Veteran' Jawa\n" +
                            "Timur. Yang terdiri dari program\n" +
                            "studi: ",
                    "1. Ekonomi Pembangunan\n" +
                            "2. Akuntansi\n" +
                            "3. Manajemen"
                )
                )
        rvList.add(
            FacData(
                R.drawable.logo_upn,
                "Fakultas Pertanian",
                "Fakultas Pertanian\n" +
                        "merupakan salah satu dari 7\n" +
                        "Fakultas 'Veteran' Jawa\n" +
                        "Timur. Yang terdiri dari program\n" +
                        "studi: ",
                "1. Agroteknologi\n" +
                        "2. Agribisnis"
            )
        )
        rvList.add(
            FacData(
                R.drawable.me,
                "Baitun Nadhiroh",
                "Nama : Baitun Nadhiroh\n"+
                        "TTL : Gresik, 16 Nov 1999\n" +
                        "Alamat : Ds Tambah Beras RT 2 RW 2, Gresik\n" +
                        "No. HP : 0831-1774-7446\n" +
                        "Email : baitunnadhiroh1@gmail.com\n" +
                        "Github : https://github.com/baitun16\n",
                "Pendidikan : \n" +
                        "\t\t Mi Matholiul Anwar \n" +
                        "\t\t SMPN 1 Cerme \n" +
                        "\t\t SMAN 1 Cerme \n" +
                        "\t\t UPN Jatim \n \n" +
                        "Penghargaan : \n" +
                        "\t\t 1. Juara 1 Futsal Putri Fisip Fest \n" +
                        "\t\t 2. Peringkat 4 Paradise Cup Nasional \n" +
                        "\t\t 3. Juara 1 Incredible Sixteen Cup \n" +
                        "\t\t 4. Penerima Beasiswa BI"
            )
        )
        return rvList
    }
}
