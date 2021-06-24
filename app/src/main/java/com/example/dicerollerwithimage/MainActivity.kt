package com.example.dicerollerwithimage

import android.os.Bundle
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnRoll : Button = findViewById<Button>(R.id.Roll_Button)

        btnRoll.setOnClickListener(){

            val randomInt = (1..6).random()

            val diceImage : ImageView = findViewById<ImageView>(R.id.dice_Image)

            val drawableResource = when (randomInt){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            diceImage.setImageResource(drawableResource)
        }


    }
}
