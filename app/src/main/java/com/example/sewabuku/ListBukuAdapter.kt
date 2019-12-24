package com.example.sewabuku

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListBukuAdapter(private val listBuku: ArrayList<Buku>) : RecyclerView.Adapter<ListBukuAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_buku, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBuku.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, detail, photo, penerbit, page, writer, tahun, harga, language) = listBuku[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = name
        holder.tvDetail.text = detail

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, DetailBuku::class.java)
            moveDetail.putExtra(DetailBuku.EXTRA_NAME, name)
            moveDetail.putExtra(DetailBuku.EXTRA_DETAIL, detail)
            moveDetail.putExtra(DetailBuku.EXTRA_PHOTO, photo)
            moveDetail.putExtra(DetailBuku.EXTRA_PENERBIT, penerbit)
            moveDetail.putExtra(DetailBuku.EXTRA_PAGE, page)
            moveDetail.putExtra(DetailBuku.EXTRA_WRITER, writer)
            moveDetail.putExtra(DetailBuku.EXTRA_TAHUN, tahun)
            moveDetail.putExtra(DetailBuku.EXTRA_HARGA, harga)
            moveDetail.putExtra(DetailBuku.EXTRA_LANG, language)
            mContext.startActivity(moveDetail)
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}