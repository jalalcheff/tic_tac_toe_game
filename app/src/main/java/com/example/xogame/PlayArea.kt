package com.example.xogame

import android.app.Activity
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.core.util.Preconditions.checkState
import com.example.xogame.databinding.ActivityMainBinding
import com.example.xogame.databinding.ActivityPlayAreaBinding

class PlayArea : AppCompatActivity() {
    var role=0
    lateinit var binding: ActivityPlayAreaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPlayAreaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firstSquare()
        secondSquare()
        thirdSquare()
        fourthSquare()
        fifthSquare()
        sixthSquare()
        seventhSquare()
        eighthSquare()
        ninthSquare()

    }

    private fun ninthSquare() {
        binding.ninthSquare.setOnClickListener {
            if (role==1) {
                binding.ninthSquare.setImageResource(R.drawable.x)
                role = 0
                val stateOne=SpaceState(8,"x")
                stateOne.changeStates()
                stateOne.printListState()
            }
            else {
                binding.ninthSquare.setImageResource(R.drawable.o)
                role = 1
                val stateOne=SpaceState(8,"o")
                stateOne.changeStates()
                stateOne.printListState()
            }
            binding.ninthSquare.isEnabled=false
        }


    }

    private fun eighthSquare() {
        binding.eighthSquare.setOnClickListener {
            if (role==1) {
                binding.eighthSquare.setImageResource(R.drawable.x)
                role = 0
                val stateOne=SpaceState(7,"x")
                stateOne.changeStates()
                stateOne.printListState()
            }
            else {
                binding.eighthSquare.setImageResource(R.drawable.o)
                role = 1
                val stateOne=SpaceState(7,"o")
                stateOne.changeStates()
                stateOne.printListState()
            }
            binding.eighthSquare.isEnabled=false
        }


    }

    private fun seventhSquare() {
        binding.seventhSquare.setOnClickListener {
            if (role==1) {
                binding.seventhSquare.setImageResource(R.drawable.x)
                role = 0
                val stateOne=SpaceState(6,"x")
                stateOne.changeStates()
                stateOne.printListState()
            }
            else {
                binding.seventhSquare.setImageResource(R.drawable.o)
                role = 1
                val stateOne=SpaceState(6,"o")
                stateOne.changeStates()
                stateOne.printListState()
            }
            binding.seventhSquare.isEnabled=false
        }

    }

    private fun sixthSquare() {
        binding.sixthSquare.setOnClickListener {
            if (role==1) {
                binding.sixthSquare.setImageResource(R.drawable.x)
                role = 0
                val stateOne=SpaceState(5,"x")
                stateOne.changeStates()
                stateOne.printListState()
            }
            else {
                binding.sixthSquare.setImageResource(R.drawable.o)
                role = 1
                val stateOne=SpaceState(5,"o")
                stateOne.changeStates()
                stateOne.printListState()
            }
            binding.sixthSquare.isEnabled=false
        }


    }

    private fun fifthSquare() {
        binding.fifthSquare.setOnClickListener {
            if (role==1) {
                binding.fifthSquare.setImageResource(R.drawable.x)
                role = 0
                val stateOne=SpaceState(4,"x")
                stateOne.changeStates()
                stateOne.printListState()
                stateOne.checkWinner(1,1,1,1)
            }
            else {
                binding.fifthSquare.setImageResource(R.drawable.o)
                role = 1
                val stateOne=SpaceState(4,"o")
                stateOne.changeStates()
                stateOne.printListState()
                stateOne.checkWinner(1,1,1,1)
            }
            binding.fifthSquare.isEnabled=false
        }


    }

    private fun fourthSquare() {
        binding.fourthSquare.setOnClickListener {
            if (role==1) {
                binding.fourthSquare.setImageResource(R.drawable.x)
                role = 0
                val stateOne=SpaceState(3,"x")
                stateOne.changeStates()
                stateOne.printListState()
            }
            else {
                binding.fourthSquare.setImageResource(R.drawable.o)
                role = 1
                val stateOne=SpaceState(3,"o")
                stateOne.changeStates()
                stateOne.printListState()
            }
            binding.fourthSquare.isEnabled=false
        }


    }

    private fun thirdSquare() {
        binding.thirdSquare.setOnClickListener {
            if (role==1) {
                binding.thirdSquare.setImageResource(R.drawable.x)
                role = 0
                val stateOne=SpaceState(2,"x")
                stateOne.changeStates()
                stateOne.printListState()
                stateOne.checkWinner(1,0,0,1)
            }
            else {
                binding.thirdSquare.setImageResource(R.drawable.o)
                role = 1
                val stateOne=SpaceState(2,"o")
                stateOne.changeStates()
                stateOne.printListState()
                stateOne.checkWinner(1,0,0,1)
            }
            binding.thirdSquare.isEnabled=false
        }

    }

    private fun secondSquare() {
        binding.secondSquare.setOnClickListener {
            if (role==1) {
                binding.secondSquare.setImageResource(R.drawable.x)
                role = 0
                val stateOne=SpaceState(1,"x")
                stateOne.changeStates()
                stateOne.printListState()
            }
            else {
                binding.secondSquare.setImageResource(R.drawable.o)
                role = 1
                val stateOne=SpaceState(1,"o")
                stateOne.changeStates()
                stateOne.printListState()
            }
            binding.secondSquare.isEnabled=false
        }
    }

    private fun firstSquare() {
        binding.firstSquare.setOnClickListener {

            if (role==1) {
                binding.firstSquare.setImageResource(R.drawable.x)
                role = 0
                val stateOne=SpaceState(0,"x")
                stateOne.changeStates()
                stateOne.printListState()
                stateOne.checkWinner(0,0,1,1)
            }
            else {
                binding.firstSquare.setImageResource(R.drawable.o)
                role = 1
                val stateOne=SpaceState(0,"o")
                stateOne.changeStates()
                stateOne.printListState()
                stateOne.checkWinner(0,0,1,1)
            }
            binding.firstSquare.isEnabled=false
          
        }

    }



}