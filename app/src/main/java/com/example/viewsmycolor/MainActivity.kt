package com.example.viewsmycolor

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
    }


    private fun setListener(){ // function
        val clickableView = listOf<View>(txt_box_one,box_two_txt,box_tree_txt,
            box_four_txt,box_five_txt,constrain_layout_ID,yellow_button,red_button,green_button)

        for (item in clickableView){

            item.setOnClickListener {
                when(it.id){
                    R.id.txt_box_one -> it.setBackgroundColor(Color.DKGRAY)
                    R.id.box_two_txt -> it.setBackgroundColor(Color.GRAY)
                    R.id.box_tree_txt -> it.setBackgroundResource(android.R.color.holo_green_light)
                    R.id.box_four_txt -> it.setBackgroundResource(android.R.color.holo_green_dark)
                    R.id.box_five_txt -> it.setBackgroundResource(android.R.color.holo_green_light)


                    R.id.red_button -> box_tree_txt.setBackgroundResource(R.color.my_red)
                    R.id.yellow_button -> box_four_txt.setBackgroundResource(R.color.my_yellow)
                    R.id.green_button -> box_five_txt.setBackgroundResource(R.color.my_green)

                    else -> it.setBackgroundColor(Color.LTGRAY)
                }
            }
        }
    }
}
