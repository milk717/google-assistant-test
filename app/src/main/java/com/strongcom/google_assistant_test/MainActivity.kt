package com.strongcom.google_assistant_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

private const val CREATE_THING = "name"
private const val ADD_NOTICE = "title"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val action = intent?.extras?.getString(CREATE_THING)

        Log.d("asdhjfhasdkljfhsa", "custom intent =  "+(action ?: "문자"))

        Toast.makeText(application, "$action",Toast.LENGTH_LONG).show()

    }
}