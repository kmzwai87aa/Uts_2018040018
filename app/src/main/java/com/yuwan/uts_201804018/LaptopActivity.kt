package com.yuwan.uts_201804018

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
class LaptopActivity : AppCompatActivity() {
    private  lateinit var rvProduk: RecyclerView
    private var list: ArrayList<Laptop> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_laptop)

        rvProduk = findViewById(R.id.rv_produk)
        rvProduk.setHasFixedSize(true)

        list.addAll(DataLaptop.listData)
        showRecyclerViewListMode()

    }
    private fun showRecyclerViewListMode(){
        rvProduk.layoutManager = LinearLayoutManager(this)
        val listMakananAdapter = ListProdukLaptop(list)
        rvProduk.adapter = listMakananAdapter
    }
}