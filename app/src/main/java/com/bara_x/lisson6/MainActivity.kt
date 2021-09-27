package com.bara_x.lisson6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bara_x.lisson6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.buttonResult.setOnClickListener {

            val resultValue = bindingClass.editValue.text.toString()

            when (resultValue){
                Constance.DIRECTOR -> {
                    bindingClass.textViewResult.visibility = View.VISIBLE
                    val tempText = "Получите ваши ${Constance.DIRECTOR_PAY}"
                    if(bindingClass.edPass.text.toString() == Constance.DIRECTOR_PASSWORD){
                        bindingClass.textViewResult.text = tempText
                } else {
                    bindingClass.textViewResult.text = "Неверный код"
                    }
                }

                Constance.INGENER ->{
                    bindingClass.textViewResult.visibility = View.VISIBLE
                    val tempText = "Получите ваши ${Constance.INGENER_PAY}"
                    if(bindingClass.edPass.text.toString() == Constance.INGENER_PASSWORD){
                        bindingClass.textViewResult.text = tempText
                    } else {
                        bindingClass.textViewResult.text = "Неверный код"
                    }



                }
                    else -> {
                        bindingClass.textViewResult.visibility = View.VISIBLE
                        bindingClass.textViewResult.text = "Вы герой"

                    }
            }


        }

    }
}

