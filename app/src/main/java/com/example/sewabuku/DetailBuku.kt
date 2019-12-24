package com.example.sewabuku

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailBuku : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_PAGE = "extra_page"
        const val EXTRA_WRITER = "extra_writer"
        const val EXTRA_PENERBIT = "extra_penerbit"
        const val EXTRA_TAHUN = "extra_tahun"
        const val EXTRA_HARGA = "extra_harga"
        const val EXTRA_LANG = "extra_lang"
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_buku)
        val actionbar = supportActionBar
        actionbar?.title = "Detail Buku"
        actionbar?.setDisplayHomeAsUpEnabled(true)

        val tvSetName: TextView = findViewById(R.id.tv_item_name)
        val imgSetPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvSetPenerbit: TextView = findViewById(R.id.tv_item_penerbit)
        val tvSetPage: TextView = findViewById(R.id.tv_item_page)
        val tvSetWriter: TextView = findViewById(R.id.tv_item_writer)
        val tvSetTahun: TextView = findViewById(R.id.tv_item_tahun)
        val tvSetHarga: TextView = findViewById(R.id.tv_item_harga)
        val tvSetLang: TextView = findViewById(R.id.tv_item_lang)
        val tvSetDetail: TextView = findViewById(R.id.tv_item_detail)

        val name = intent.getStringExtra(EXTRA_NAME)
        val image = intent.getIntExtra(EXTRA_PHOTO, 0)
        val penerbit = intent.getStringExtra(EXTRA_PENERBIT)
        val page = intent.getStringExtra(EXTRA_PAGE)
        val writer = intent.getStringExtra(EXTRA_WRITER)
        val tahun = intent.getIntExtra(EXTRA_TAHUN, 0)
        val harga = intent.getStringExtra(EXTRA_HARGA)
        val language = intent.getStringExtra(EXTRA_LANG)
        val detail = intent.getStringExtra(EXTRA_DETAIL)

        tvSetName.text = name
        tvSetPage.text = page
        tvSetWriter.text = writer
        tvSetPenerbit.text = penerbit
        tvSetTahun.text = tahun.toString()
        tvSetHarga.text = harga
        tvSetLang.text = language
        tvSetDetail.text = detail

        Glide.with(this)
            .load(image)
            .apply(RequestOptions())
            .into(imgSetPhoto)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}