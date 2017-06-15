package com.kotlinfirstdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.*

class LoginJavaActivity : AppCompatActivity() {
    lateinit var btn_login: Button
    lateinit var et_user: EditText
    lateinit var et_pass: EditText
    lateinit var lv: ListView
    var strUser = ""

    val strArray = arrayOf("ABC", "XYZ")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initialiseViews()

        et_user.setText("Hello1")

        btn_login.setOnClickListener {
            strUser = et_user.text.toString()
            val strPass = et_pass.text.toString().trim { it <= ' ' }
            showToast(mergeString(strUser, strPass))
        }

        val strArr = ArrayAdapter(this, android.R.layout.simple_list_item_1, strArray)
        lv.adapter = strArr
        lv.setOnItemClickListener { adapterView, view, position, long ->
            ToastMessage.toasterMsgShot(applicationContext, "My name is: $strUser $position")
        }
    }

    fun initialiseViews() {
        btn_login = findViewById(R.id.button1) as Button
        et_user = findViewById(R.id.editText1) as EditText
        et_pass = findViewById(R.id.editText2) as EditText
        lv = findViewById(R.id.listView1) as ListView
    }

    fun showToast(str: String) {
        Toast.makeText(applicationContext, str, Toast.LENGTH_LONG).show()
    }

    fun mergeString(strUser: String, strPass: String): String {
        return "$strUser : $strPass"
    }
}
