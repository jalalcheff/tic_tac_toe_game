package com.example.xogame

import android.widget.Toast
import kotlin.math.abs

class SpaceState(var position:Int,var whatPlay:String)
{

    fun changeStates()
    {
        if (whatPlay=="o")
        listState[position]=1
        else if (whatPlay=="x")
            listState[position]=2
    }
    //check if there  is horizontal match
     fun checkListHor():Boolean {
        var count=0
        var sum=0
        for (i in 0..2) {
            sum=0
            for (j in count .. (count+2) )
            {
                sum+= listState[j]

            }
            if (sum==3||sum==6)
                break
            count+=3
        }

        return (sum==3||sum==6)
    }
    //check if there is vertical match
     fun checkListVer():Boolean {
        var count=0
        var sum=0
        for (i in 0..2) {
            sum=0
            for (j in count .. (count+(2*3)) step 3)
            {
                sum+= listState[j]

            }
            if (sum==3||sum==6)
                break

            count+=1
        }

        return (sum==3||sum==6)
    }
     fun checkListMajorDiagonal():Boolean {
        var sum=0
        for (j in listState.indices step 4) {
            sum += listState[j]
        }

        return (sum==3||sum==6)
    }
     fun checkListMinorDiagonal():Boolean {
        var sum=0
        for (j in 2 ..6 step 2) {
            sum += listState[j]
        }

        return (sum==3||sum==6)
    }


    fun printListState()
    {
        println("......................................................................")
        listState.forEach {
            println(it)
        }
    }
    companion object
    {

        val listState= arrayListOf(Int.MAX_VALUE,Int.MAX_VALUE,Int.MAX_VALUE,Int.MAX_VALUE,Int.MAX_VALUE,Int.MAX_VALUE,Int.MAX_VALUE,Int.MAX_VALUE,Int.MAX_VALUE)

    }
}