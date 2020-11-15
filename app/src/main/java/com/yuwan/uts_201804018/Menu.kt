package com.yuwan.uts_201804018


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.*

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val bl : Button = findViewById(R.id.btn_bsl)
        bl.setOnClickListener{
            val intent = Intent(this,BestLaptopActivity::class.java)
            startActivity(intent)
        }

        val bsh : Button = findViewById(R.id.btn_bsh)
        bsh.setOnClickListener{
            val intent = Intent(this,BestHpActivity::class.java)
            startActivity(intent)
        }

        val web : Button = findViewById(R.id.btn_web)
        web.setOnClickListener{
            val intent = Intent(this,WebActivity::class.java)
            startActivity(intent)
        }

        val lptp : Button = findViewById(R.id.btn_laptop)
        lptp.setOnClickListener{
            val intent = Intent(this,LaptopActivity::class.java)
            startActivity(intent)
        }


    }
}