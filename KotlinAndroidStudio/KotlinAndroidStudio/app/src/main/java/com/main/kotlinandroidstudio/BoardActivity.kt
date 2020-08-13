package com.main.kotlinandroidstudio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.main.kotlinandroidstudio.constant.FIRST_PLAYER
import com.main.kotlinandroidstudio.constant.SECOND_PLAYER
import kotlinx.android.synthetic.main.activity_board.*

class BoardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board)
//        val playerOne = intent.getStringExtra("playerOne")
//        val playerTwo = intent.getStringExtra("playerTwo")
        val playerOne = intent.getStringExtra(FIRST_PLAYER)
        val playerTwo = intent.getStringExtra(SECOND_PLAYER)
        textView2.text = "$playerOne vs $playerTwo"
    }

    fun backHandle(view: View) {
        //intent menambah tumpukan baru, bukan kembali ke halaman sebelumnya
        //bukan destroy tapi stop activity
//        val intent = Intent(this,MainActivity::class.java)
//        startActivity(intent)
        //untuk back, jika memakai intent maka akan ketumpuk tumpuk
        //destroy activity
        finish()
        //merupakan back bawaan dari hp atau tombol back dri hp
//        onBackPressed()
    }
}
