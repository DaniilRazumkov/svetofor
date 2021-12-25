package com.example.svetofor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.svetofor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass= ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.bRed.setOnClickListener{
            bindingClass.back.setBackgroundColor(resources.getColor(R.color.red))
            bindingClass.bRed.setBackgroundColor(resources.getColor(R.color.back))
            bindingClass.btGreen.setBackgroundColor(resources.getColor(R.color.green))
            bindingClass.btYeliow.setBackgroundColor(resources.getColor(R.color.yellow))
            bindingClass.btYeliow.isEnabled=true
            bindingClass.btYeliow.isClickable=true
            bindingClass.btGreen.isEnabled=true
            bindingClass.btGreen.isClickable=true
            bindingClass.bRed.isEnabled=false
            bindingClass.bRed.isClickable=false
       }

            bindingClass.btYeliow.setOnClickListener{
        bindingClass.back.setBackgroundColor(resources.getColor(R.color.yellow))
                bindingClass.btYeliow.setBackgroundColor(resources.getColor(R.color.back))
                bindingClass.bRed.setBackgroundColor(resources.getColor(R.color.red))
                bindingClass.btGreen.setBackgroundColor(resources.getColor(R.color.green))
                bindingClass.btYeliow.isEnabled=false
                bindingClass.btYeliow.isClickable=false
                bindingClass.btGreen.isEnabled=true
                bindingClass.btGreen.isClickable=true
                bindingClass.bRed.isEnabled=true
                bindingClass.bRed.isClickable=true
            }
                bindingClass.btGreen.setOnClickListener{
                    bindingClass.back.setBackgroundColor(resources.getColor(R.color.green))
                    bindingClass.btGreen.setBackgroundColor(resources.getColor(R.color.back))
                    bindingClass.btYeliow.setBackgroundColor(resources.getColor(R.color.yellow))
                    bindingClass.bRed.setBackgroundColor(resources.getColor(R.color.red))
                    bindingClass.btYeliow.isEnabled=true
                    bindingClass.btYeliow.isClickable=true
                    bindingClass.btGreen.isEnabled=false
                    bindingClass.btGreen.isClickable=false
                    bindingClass.bRed.isEnabled=true
                    bindingClass.bRed.isClickable=true

    }
}

    }
