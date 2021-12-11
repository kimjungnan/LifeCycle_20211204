package com.neppplus.lifecycle_20211204

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()
        Log.d("메인화면","onCreate실행됨")

    }

    override fun onResume() {
        super.onResume()  // 오버라이딩 : super.시작 => 보존  return super.시작 -> 통으로 삭제

        Log.d("메인", "onResume 실행됨")


    }

    override fun onPause() {
        super.onPause()
        Log.d("메인", "onPause 실행됨")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("메인", "onㅇDestory 실행됨")
    }

        fun setupEvents(){

            btnMoveToOther.setOnClickListener{

            val myIntent =  Intent( this, OtherActivity::class.java)
                startActivity(myIntent)

            }
        }

    fun setValues(){
        txtName.text = "김정난"
    }
}