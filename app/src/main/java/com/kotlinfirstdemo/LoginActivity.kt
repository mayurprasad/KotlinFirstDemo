package com.kotlinfirstdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    lateinit var btn_login: Button
    lateinit var et_username: EditText
    lateinit var et_password: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login = findViewById(R.id.button1) as Button
        et_username = findViewById(R.id.editText1) as EditText
        et_password = findViewById(R.id.editText2) as EditText

        btn_login.setOnClickListener { view ->
            var strUser = et_password.getText().toString().trim()
            Toast.makeText(applicationContext, strUser, Toast.LENGTH_LONG).show()
        }
    }
}
