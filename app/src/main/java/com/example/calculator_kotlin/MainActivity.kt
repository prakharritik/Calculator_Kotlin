package com.example.calculator_kotlin

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var et_n1: EditText
    lateinit var et_n2: EditText
    lateinit var tv_res: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        et_n1 = findViewById(R.id.et_n1)
        et_n2 = findViewById(R.id.et_n2)
        tv_res = findViewById(R.id.tv_res)
    }
    fun add(view: View?) {
        val n1: Int
        val n2: Int
        val res: Int
        n1 = et_n1.text.toString().toInt()
        n2 = et_n2.text.toString().toInt()
        res = n1 + n2
        tv_res.text = res.toString() + ""
    }

    fun sub(view: View?) {
        val n1: Int
        val n2: Int
        val res: Int
        n1 = et_n1.text.toString().toInt()
        n2 = et_n2.text.toString().toInt()
        res = n1 - n2
        tv_res.text = res.toString() + ""
    }

    fun mult(view: View?) {
        val n1: Int
        val n2: Int
        val res: Int
        n1 = et_n1.text.toString().toInt()
        n2 = et_n2.text.toString().toInt()
        res = n1 * n2
        tv_res.text = res.toString() + ""
    }

    operator fun div(view: View?) {
        val n1: Int
        val n2: Int
        val res: Int
        n1 = et_n1.text.toString().toInt()
        n2 = et_n2.text.toString().toInt()
        res = n1 / n2
        tv_res.text = res.toString() + ""
    }
}