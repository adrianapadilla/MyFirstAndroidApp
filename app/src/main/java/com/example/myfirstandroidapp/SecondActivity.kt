package com.example.myfirstandroidapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        setSupportActionBar(toolbar)

        back_button.setOnClickListener { view ->
            // create a Toast with some text, to appear for a short time
            val myToast = Toast.makeText(view.context, "This is the message button!", Toast.LENGTH_SHORT)
            // show the Toast
            myToast.show()
        }

    }

}
