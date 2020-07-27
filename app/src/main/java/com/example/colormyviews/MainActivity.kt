package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private fun setListeners(){

        for (item in listOf(box_one_text,box_two_text,box_three_text,box_four_text,box_five_text,box_six_text,box_seven_text,box_eight_text,box_nine_text,const_lay)){
            item.setOnClickListener{ makecol(it)}
        }

    }

    private fun makecol(view: View){

        when(view.id){

            R.id.box_one_text->view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text->view.setBackgroundColor(Color.MAGENTA)
            R.id.box_three_text->view.setBackgroundColor(Color.BLUE)

           // R.id.box_three_text->view.setBackgroundResource(android.R.color.holo_blue_bright)
            R.id.box_four_text->view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text->view.setBackgroundResource(android.R.color.holo_red_dark)
            R.id.box_six_text->view.setBackgroundResource(android.R.color.holo_purple)
            R.id.box_seven_text->view.setBackgroundResource(android.R.color.holo_orange_dark)
            R.id.box_eight_text->view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_nine_text->view.setBackgroundResource(android.R.color.holo_orange_light)


            else->view.setBackgroundColor(Color.BLACK)

        }


    }
}
