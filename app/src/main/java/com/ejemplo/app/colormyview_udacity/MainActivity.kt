package com.ejemplo.app.colormyview_udacity

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners (){
        val clickableViews : List<View> =
            listOf(box_one_text,box_two_text,box_three_text,box_four_text,box_five_text, constraint_layaout, red_button, green_button, yellow_button, blue_button, purple_button, brown_button)
        for (item in clickableViews){
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored (view : View) {
        when (view.id){
            //Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            //Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            //Button using custom colors for background
            R.id.red_button -> view.setBackgroundResource(R.color.my_red)
            R.id.green_button -> view.setBackgroundResource(R.color.my_green)
            R.id.yellow_button -> view.setBackgroundResource(R.color.my_yellow)

            R.id.blue_button -> box_three_text.setBackgroundResource(R.color.my_blue)
            R.id.purple_button -> box_four_text.setBackgroundResource(R.color.my_purple)
            R.id.brown_button -> box_five_text.setBackgroundResource(R.color.my_brown)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
