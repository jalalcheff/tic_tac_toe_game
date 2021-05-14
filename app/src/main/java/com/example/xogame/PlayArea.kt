package com.example.xogame

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
       // binding.playerTurn.text= playerOneName
        binding= ActivityPlayAreaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.playerTurn.text= playerOneName
        firstSquare()
        secondSquare()
        thirdSquare()
        fourthSquare()
        fifthSquare()
        sixthSquare()
        seventhSquare()
        eighthSquare()
        ninthSquare()
        playAgain()
    }

    private fun playAgain() {
        binding.wonPlayerButton.setOnClickListener {
            val playAgainList = SpaceState
            for (i in 0 until playAgainList.listState.size)
                playAgainList.listState[i] = Int.MAX_VALUE
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }

    private fun ninthSquare() {
        binding.ninthSquare.setOnClickListener {
            if (role==1) {
                binding.ninthSquare.setImageResource(R.drawable.x)
                role = 0
                binding.playerTurn.text = playerOneName
                val stateOne=SpaceState(8,"x")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer() || stateOne.checkListMajorDiagonal())
                    //if the condition exceed do something
                    wonLayout(playerTwoName)
            }

            else {
                binding.ninthSquare.setImageResource(R.drawable.o)
                role = 1
                binding.playerTurn.text= playerTwoName
                val stateOne=SpaceState(8,"o")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer() || stateOne.checkListMajorDiagonal())
                    //do something

                wonLayout(playerOneName)

            }
            binding.ninthSquare.isEnabled=false
        }


    }

    private fun eighthSquare() {
        binding.eighthSquare.setOnClickListener {
            if (role==1) {
                binding.eighthSquare.setImageResource(R.drawable.x)
                role = 0
                binding.playerTurn.text= playerOneName
                val stateOne=SpaceState(7,"x")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer())
                    wonLayout(playerTwoName)



            }
            else {
                binding.eighthSquare.setImageResource(R.drawable.o)
                role = 1
                binding.playerTurn.text= playerTwoName
                val stateOne=SpaceState(7,"o")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer())


                wonLayout(playerOneName)
            }
            binding.eighthSquare.isEnabled=false
        }


    }

    private fun seventhSquare() {
        binding.seventhSquare.setOnClickListener {
            if (role==1) {
                binding.seventhSquare.setImageResource(R.drawable.x)
                role = 0
                binding.playerTurn.text= playerOneName
                val stateOne=SpaceState(6,"x")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer() || stateOne.checkListMinorDiagonal())

                wonLayout(playerTwoName)
            }
            else {
                binding.seventhSquare.setImageResource(R.drawable.o)
                role = 1
                binding.playerTurn.text= playerTwoName
                val stateOne=SpaceState(6,"o")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer() || stateOne.checkListMinorDiagonal())

                wonLayout(playerOneName)

            }
            binding.seventhSquare.isEnabled=false
        }

    }

    private fun sixthSquare() {
        binding.sixthSquare.setOnClickListener {
            if (role==1) {
                binding.sixthSquare.setImageResource(R.drawable.x)
                role = 0
                binding.playerTurn.text= playerOneName
                val stateOne=SpaceState(5,"x")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer())

                wonLayout(playerTwoName)
            }
            else {
                binding.sixthSquare.setImageResource(R.drawable.o)
                role = 1
                binding.playerTurn.text= playerTwoName
                val stateOne=SpaceState(5,"o")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer())

                wonLayout(playerOneName)

            }
            binding.sixthSquare.isEnabled=false
        }


    }

    private fun fifthSquare() {
        binding.fifthSquare.setOnClickListener {
            if (role==1) {
                binding.fifthSquare.setImageResource(R.drawable.x)
                role = 0
                binding.playerTurn.text= playerOneName
                val stateOne=SpaceState(4,"x")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer() || stateOne.checkListMajorDiagonal()||stateOne.checkListMinorDiagonal())

                wonLayout(playerTwoName)
            }
            else {
                binding.fifthSquare.setImageResource(R.drawable.o)
                role = 1
                binding.playerTurn.text= playerTwoName
                val stateOne=SpaceState(4,"o")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer() || stateOne.checkListMajorDiagonal()||stateOne.checkListMinorDiagonal())

                wonLayout(playerOneName)

            }
            binding.fifthSquare.isEnabled=false
        }


    }

    private fun fourthSquare() {
        binding.fourthSquare.setOnClickListener {
            if (role==1) {
                binding.fourthSquare.setImageResource(R.drawable.x)
                role = 0
                binding.playerTurn.text= playerOneName
                val stateOne=SpaceState(3,"x")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer())

                wonLayout(playerTwoName)


            }
            else {
                binding.fourthSquare.setImageResource(R.drawable.o)
                role = 1
                binding.playerTurn.text= playerTwoName
                val stateOne=SpaceState(3,"o")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer())

                wonLayout(playerOneName)



            }
            binding.fourthSquare.isEnabled=false
        }


    }

    private fun thirdSquare() {
        binding.thirdSquare.setOnClickListener {
            if (role==1) {
                binding.thirdSquare.setImageResource(R.drawable.x)
                role = 0
                binding.playerTurn.text = playerOneName
                val stateOne=SpaceState(2,"x")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer() || stateOne.checkListMinorDiagonal())

                wonLayout(playerTwoName)



            }
            else {
                binding.thirdSquare.setImageResource(R.drawable.o)
                role = 1
                binding.playerTurn.text= playerTwoName
                val stateOne=SpaceState(2,"o")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer() || stateOne.checkListMinorDiagonal())

                wonLayout(playerOneName)


            }
            binding.thirdSquare.isEnabled=false
        }

    }

    private fun secondSquare() {
        binding.secondSquare.setOnClickListener {
            if (role==1) {
                binding.secondSquare.setImageResource(R.drawable.x)
                role = 0
                binding.playerTurn.text = playerOneName
                val stateOne=SpaceState(1,"x")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer())

                wonLayout(playerTwoName)

            }
            else {
                binding.secondSquare.setImageResource(R.drawable.o)
                role = 1
                binding.playerTurn.text= playerTwoName
                val stateOne=SpaceState(1,"o")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer())

                wonLayout(playerOneName)
            }
            binding.secondSquare.isEnabled=false
        }
    }

    private fun firstSquare() {
        binding.firstSquare.setOnClickListener {

            if (role==1) {
                binding.firstSquare.setImageResource(R.drawable.x)
                binding.playerTurn.text = playerOneName
                role = 0
                val stateOne=SpaceState(0,"x")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer() || stateOne.checkListMajorDiagonal())

                wonLayout(playerTwoName)
            }
            else {
                binding.firstSquare.setImageResource(R.drawable.o)
                binding.playerTurn.text= playerTwoName
                role = 1
                val stateOne=SpaceState(0,"o")
                stateOne.changeStates()
                stateOne.printListState()
                if (stateOne.checkListHor() || stateOne.checkListVer() || stateOne.checkListMajorDiagonal()) {
                    wonLayout(playerOneName)
                }




            }
            binding.firstSquare.isEnabled=false
          
        }

    }

    private fun wonLayout(winnerName:String) {
        binding.squaresContainer.visibility= View.INVISIBLE
        binding.playerTurn.visibility=View.INVISIBLE
        binding.turnText.visibility=View.INVISIBLE
        binding.wonPlayer.visibility=View.VISIBLE
        binding.wonPlayerButton.visibility=View.VISIBLE
        binding.wonPlayer.text="$winnerName wins"
    }




}