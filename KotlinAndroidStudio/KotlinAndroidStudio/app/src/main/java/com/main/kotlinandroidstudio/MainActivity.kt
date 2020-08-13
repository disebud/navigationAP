package com.main.kotlinandroidstudio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.main.kotlinandroidstudio.constant.FIRST_PLAYER
import com.main.kotlinandroidstudio.constant.SECOND_PLAYER
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pencetButton.setOnClickListener(this)
        pencetButton2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        println("INI : $v")
        when (v) {
            pencetButton -> showName()
            pencetButton2 -> toBoardActivity()
        }
    }

    fun toBoardActivity(){
        val intent = Intent(this,BoardActivity::class.java)
        val playerOne = input_playerOne.text.toString()
        val playerTwo = input_playerTwo.text.toString()
//        intent.putExtra("playerOne",playerOne)
//        intent.putExtra("playerTwo",playerTwo)
        intent.putExtra(FIRST_PLAYER,playerOne)
        intent.putExtra(SECOND_PLAYER,playerTwo)
        startActivity(intent)
    }

    fun showName() {
        val namePlayerOne = input_playerOne.text.toString()
        val namePlayerTwo = input_playerTwo.text.toString()
        name_playerOne.text = namePlayerOne
        name_playerTwo.text = namePlayerTwo
    }

    //fun dibawah sama nama dengan android:onClick
    //handle pencet menerima sebuah view
//    fun handlePencet(view: View) {
//        println("INI VIEW $view")
//        //mengambil text dari input_name
//        val name = input_name.text.toString()
//        //memasang text dari name
//        name_text.text = name
//    }
}
