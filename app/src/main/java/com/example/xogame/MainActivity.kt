package com.example.xogame

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doOnTextChanged
import com.example.xogame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addCallBacks()
    }



    private fun addCallBacks()
    {
        binding.playGameBtn.setOnClickListener{
            if (binding.playerOneName.editableText.toString()=="" && binding.playerTwoName.editableText.toString()=="")
                Toast.makeText(this, "enter players name", Toast.LENGTH_SHORT).show()
            else {
                playerOneName=binding.playerOneName.text.toString()
                playerTwoName=binding.playerTwoName.text.toString()
                val intent = Intent(this, PlayArea::class.java)
                startActivity(intent)
            }


        }

    }

}

