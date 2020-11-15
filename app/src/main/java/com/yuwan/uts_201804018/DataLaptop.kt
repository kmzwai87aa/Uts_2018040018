package com.yuwan.uts_201804018

object DataLaptop {
    private val namaProduk = arrayOf(
                "APPLE MacBook Pro with Touch Bar [MVVL2ID/A] - Silver",
        "APPLE Macbook Pro 13 Inch [MWP42ID/A] - Space Gray",
        "APPLE MacBook Pro with Touch Bar [MVVK2ID/A] - Space Gray",
        "APPLE MacBook Air [MVFN2ID/A] - 256GB - Gold",
      "APPLE MacBook Pro with Touch Bar [MR9R2ID/A] - Space Grey",
        "APPLE MacBook Air [MQD32ID/A]",
     "APPLE Macbook Pro 13 Inch [MWP42ID/A] - Space Gray",
       "APPLE Macbook Pro 13 Inch [MXK52ID/A] - Space Gray",
        "APPLE MacBook Air [MVFH2ID/A] - 128GB - Space Grey",
        "APPLE MacBook Air [MVFK2ID/A] - 128GB - Silver",
        "APPLE iPad 7 2019 Wi-Fi 10.2\" 32GB - Space Gray",
        "APPLE iPad Air 3 Wifi 32GB - Grey",
        "APPLE iPad Pro 11\" Wi-Fi + Cellular 2020 256GB - Silver",
        "APPLE iPad Pro Wi-Fi 128GB 12.9\" - Gold",
        "APPLE iPad Pro Wi-Fi 128GB 12.9\" - Gold",
        "APPLE iPad Pro Wi-Fi 11\" 2018 [MTXT2PA/A] - 512GB - Space Gray",
        "APPLE iPad Air 2 Wifi + Cell 128GB - Gold",
        "APPLE iPad Mini 2019 Wifi [MUQW2PA/A] - 64GB - Space Grey",
        "APPLE iPad Mini 2019 Wifi [MUQX2PA/A] - 64GB - Silver",
        "SAMSUNG S20+"
    )

    private val hargaProduk = arrayOf(
        "Rp 16.000.000",
        "Rp 15.000.000",
        "Rp 13.000.000",
        "Rp 14.000.000",
        "Rp 11.000.000",
        "Rp 12.000.000",
        "Rp 17.000.000",
        "Rp 18.000.000",
        "Rp 19.000.000",
        "Rp 17.500.000",
        "Rp 6.699.000",
        "Rp 5.999.000",
        "Rp 20.499.000",
        "Rp 15.109.000",
        "Rp 15.109.000",
        "Rp 22.699.000",
        "Rp 11.499.000",
        "Rp 8.499.000",
        "Rp 8.499.000",
        "Rp 17.500.000"
    )

    private val logoProduk = intArrayOf(
        R.drawable.a,
        R.drawable.b,
        R.drawable.c,
        R.drawable.d,
        R.drawable.e,
        R.drawable.f,
        R.drawable.g,
        R.drawable.h,
        R.drawable.i,
        R.drawable.apple,
        R.drawable.j,
        R.drawable.k,
        R.drawable.l,
        R.drawable.m,
        R.drawable.n,
        R.drawable.o,
        R.drawable.p,
        R.drawable.q,
        R.drawable.r,
        R.drawable.s
    )

    val listData: ArrayList<Laptop>
        get() {
            val listProduk = arrayListOf<Laptop>()
            for (position in namaProduk.indices){
                val makanan = Laptop()
                makanan.produk = namaProduk[position]
                makanan.harga = hargaProduk[position]
                makanan.logo = logoProduk[position]
                listProduk.add(makanan)
            }
            return listProduk
        }
}