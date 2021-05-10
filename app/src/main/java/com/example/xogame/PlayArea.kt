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
                if (stateOne.checkListHor() || stateOne.checkListVer() || stateOne.checkListMajorDiagonal())
                    //if the condition exceed do something
                {
                    Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()


                }
            }
            else {
                binding.ninthSquare.setImageResource(R.drawable.o)
                role = 1
                val stateOne=SpaceState(8,"o")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer() || stateOne.checkListMajorDiagonal())
                    //do something
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()

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
                if (stateOne.checkListHor() || stateOne.checkListVer())


                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()
            }
            else {
                binding.eighthSquare.setImageResource(R.drawable.o)
                role = 1
                val stateOne=SpaceState(7,"o")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer())

                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()
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
                if (stateOne.checkListHor() || stateOne.checkListVer() || stateOne.checkListMinorDiagonal())
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()
            }
            else {
                binding.seventhSquare.setImageResource(R.drawable.o)
                role = 1
                val stateOne=SpaceState(6,"o")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer() || stateOne.checkListMinorDiagonal())
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()

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
                if (stateOne.checkListHor() || stateOne.checkListVer())
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()
            }
            else {
                binding.sixthSquare.setImageResource(R.drawable.o)
                role = 1
                val stateOne=SpaceState(5,"o")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer())
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()

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
                if (stateOne.checkListHor() || stateOne.checkListVer() || stateOne.checkListMajorDiagonal()||stateOne.checkListMinorDiagonal())
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()
            }
            else {
                binding.fifthSquare.setImageResource(R.drawable.o)
                role = 1
                val stateOne=SpaceState(4,"o")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer() || stateOne.checkListMajorDiagonal()||stateOne.checkListMinorDiagonal())
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()

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
                if (stateOne.checkListHor() || stateOne.checkListVer())
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()


            }
            else {
                binding.fourthSquare.setImageResource(R.drawable.o)
                role = 1
                val stateOne=SpaceState(3,"o")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer())
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()



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
                if (stateOne.checkListHor() || stateOne.checkListVer() || stateOne.checkListMinorDiagonal())
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()



            }
            else {
                binding.thirdSquare.setImageResource(R.drawable.o)
                role = 1
                val stateOne=SpaceState(2,"o")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer() || stateOne.checkListMinorDiagonal())
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()


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
                if (stateOne.checkListHor() || stateOne.checkListVer())
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()
            }
            else {
                binding.secondSquare.setImageResource(R.drawable.o)
                role = 1
                val stateOne=SpaceState(1,"o")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer())
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()
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
                if (stateOne.checkListHor() || stateOne.checkListVer() || stateOne.checkListMajorDiagonal())
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()


            }
            else {
                binding.firstSquare.setImageResource(R.drawable.o)
                role = 1
                val stateOne=SpaceState(0,"o")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer() || stateOne.checkListMajorDiagonal())
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()




            }
            binding.firstSquare.isEnabled=false
          
        }

    }



}