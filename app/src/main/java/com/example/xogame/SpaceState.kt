package com.example.xogame

import android.widget.Toast
import kotlin.math.abs

class SpaceState(var position:Int,var whatPlay:String)
{
    var playSetHor=""
fun checkWinner(left:Int,up:Int,right:Int,bottom:Int) {
    var alphaHor=1
    var alphaVer=1
    when(position)
    {
        in 0..2 -> alphaHor=2
        in 3..5->alphaHor=5
        in 6..8->alphaHor=8

    }
    when(position)
    {
        in 0..2 -> alphaVer=0
        in 3..5->alphaVer=1
        in 6..8->alphaVer=2
    }

if (left == 1)
    {
        /*if (whatPlay=="x")

        for (i in 0 .. abs(alphaHor-position))
        {
            if (listState[i]==2)
                playSetHor+="2"
        }
        else if (whatPlay=="o")
            for (i in 0 ..abs(alphaHor-position))
            {
                if (listState[i]==1)
                    playSetHor+="1"
            }
        if (playSetHor=="111"||playSetHor=="222")
        println("congrattttttttttttttttttttttttts")
        else
            println("sooooooooooooooooooooooooooory $playSetHor $whatPlay $position ${listState[2]}")*/

          
    }
    if (up==1)
    {
        if (whatPlay=="x")
            for (i in 0 .. alphaVer)
            {
                if (listState[abs(position-3*i)]==2)
                    playSetHor+="2"

            }
        else if (whatPlay=="o")
            for (i in 0 ..alphaVer)
            {
                 if (listState[abs(position-3*i)]==1)
                    playSetHor+="1"
            }
       /* if (playSetHor=="11"||playSetHor=="22")
            println("congrattttttttttttttttttttttttts")
        else
            println("sooooooooooooooooooooooooooory $playSetHor $whatPlay $position ${listState[2]}")*/

    }
    if (right==1)
    {
        if (whatPlay=="x")
            for (i in 0 .. abs(alphaHor-position))
            {
                if (listState[i]==2)
                    playSetHor+="2"
            }
        else if (whatPlay=="o")
            for (i in 0 ..abs(alphaHor-position))
            {
                if (listState[i]==1)
                    playSetHor+="1"
            }
        if (playSetHor=="11"||playSetHor=="22")
            println("congrattttttttttttttttttttttttts")
        else
            println("sooooooooooooooooooooooooooory $playSetHor $whatPlay $position ${listState[2]}")

    }
    if (bottom==1)
    {
        if (whatPlay=="x")
            for (i in 1 .. 2-alphaVer)
            {
                if (listState[abs(position+3*i)]==2)
                    playSetHor+="2"

            }
        else if (whatPlay=="o")
            for (i in 1 ..2-alphaVer)
            {
                if (listState[abs(position+3*i)]==1)
                    playSetHor+="1"
            }
        if (playSetHor=="11"||playSetHor=="22")
            println("congrattttttttttttttttttttttttts $playSetHor $whatPlay $position ${listState[2]}")
        else
            println("sooooooooooooooooooooooooooory $playSetHor $whatPlay $position ${listState[2]}")
    }

}
    fun changeStates()
    {
        if (whatPlay=="o")
        listState[position]=1
        else if (whatPlay=="x")
            listState[position]=2
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

        val listState= arrayListOf(0,0,0,0,0,0,0,0,0)

    }
}