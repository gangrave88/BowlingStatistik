package com.gangrave88.bowlingstatistik

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.table_score.view.*

class TableScore @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
):ConstraintLayout(context, attrs, defStyleAttr){

    private var currentFrame:Int = 1
    private lateinit var frames:HashMap<Int, Frame>

    init {
        LayoutInflater.from(context).inflate(R.layout.table_score,this, true)

        frames = HashMap()

        initView()
    }

    private fun initView() {

        frames.put(1, frame_1)
        frames.put(2, frame_2)
        frames.put(3, frame_3)
        frames.put(4, frame_4)
        frames.put(5, frame_5)
        frames.put(6, frame_6)
        frames.put(7, frame_7)
        frames.put(8, frame_8)
        frames.put(9, frame_9)
        frames.put(10, frame_10)

        for (i in 1..10){
            frames[i]?.setData(i.toString())
        }
    }

    fun setData(numFrame:Int, numThrow:Int, score:Int){
        when(numThrow){
            1 -> frames[numFrame]?.setData("",score.toString(),"","","")
            2 -> frames[numFrame]?.setData("","",score.toString(),"","")
        }

    }
}