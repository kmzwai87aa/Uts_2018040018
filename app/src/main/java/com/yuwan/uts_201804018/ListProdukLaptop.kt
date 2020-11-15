package com.yuwan.uts_201804018

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
class ListProdukLaptop(private val listProduk: ArrayList<Laptop>) : RecyclerView.Adapter<ListProdukLaptop.ListViewHolder>() {
    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvProduk: TextView = itemView.findViewById(R.id.tv_produk)
        var tvHarga: TextView = itemView.findViewById(R.id.tv_harga)
        var ivLogo: ImageView = itemView.findViewById(R.id.civ_produk)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_produk, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listProduk.size
    }

    override fun onBindViewHolder(holder: ListProdukLaptop.ListViewHolder, position: Int) {
        val produk = listProduk[position]

        Glide.with(holder.itemView.context)
            .load(produk.logo)
            .apply(RequestOptions().override(50, 50))
            .into(holder.ivLogo)
        holder.tvProduk.text = produk.produk
        holder.tvHarga.text = produk.harga
    }
}