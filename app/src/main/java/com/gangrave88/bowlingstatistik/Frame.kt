package com.gangrave88.bowlingstatistik

interface Frame{
    fun setTitle(mTitle: String)
    fun setThrow(numThrow: Int, scoreThrow:Int)
    fun setScore(scoreFrame: Int)
    fun getThrow(numFrame: Int, numThrow: Int)
}

fun throwToString(scoreThrow: Int):String{
    var stringToReturn = ""
    when(scoreThrow) {
        0 -> stringToReturn="-"
        in 1..9 -> stringToReturn=scoreThrow.toString()
        10 -> stringToReturn="X"
    }
    return stringToReturn
}