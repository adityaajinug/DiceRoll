package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn : Button = findViewById(R.id.button)


        rollBtn.setOnClickListener {
            val toast = Toast.makeText(this, "Dice Roled!", Toast.LENGTH_SHORT)
            toast.show()

            val resultRole: TextView = findViewById(R.id.textView)

            resultRole.text = "6"
            roleDice()

        }
    }

    private fun roleDice() {
        // Dice object
       val dice = Dice(6)
        val diceRoll = dice.roll()


        // Screen Roll

        val resultRole: TextView = findViewById(R.id.textView)
        resultRole.text = diceRoll.toString()

    }


}