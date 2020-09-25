package com.adarshk.displaytextapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.adarshk.displaytextapp.R

const val MESSAGE_ID = "Text_entered"
class MainActivity : AppCompatActivity(){

    private lateinit var enteredText : EditText
    private lateinit var sendBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enteredText = findViewById<EditText>(R.id.enteredText)
        sendBtn = findViewById<Button>(R.id.sendBtn)
    }

    fun sendBtnClickEvent(v: View) {
        val textEntered : String = enteredText.text.toString()
        val startIntent = Intent(this, DisplayMsgActivity::class.java)
        startIntent.putExtra(MESSAGE_ID, textEntered)
        startActivity(startIntent)
    }
}