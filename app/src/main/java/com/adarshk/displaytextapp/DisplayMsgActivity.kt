package com.adarshk.displaytextapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.adarshk.displaytextapp.R

class DisplayMsgActivity: AppCompatActivity() {

    private lateinit var displayedMsg : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_displaymsg)

        val displayedMsg = findViewById<TextView>(R.id.displayedMsg)
        val receivedMsg = intent.getStringExtra(MESSAGE_ID)
        displayedMsg.text = receivedMsg
    }
}