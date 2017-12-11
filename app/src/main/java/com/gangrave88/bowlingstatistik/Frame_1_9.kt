package com.gangrave88.bowlingstatistik

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.frame_1_9.view.*

class Frame_1_9 @JvmOverloads constructor(
        context: Context,
        attrs:AttributeSet? = null,
        defStyleAttr: Int = 0
): ConstraintLayout(context, attrs, defStyleAttr), Frame{

    init {
        LayoutInflater.from(context).inflate(R.layout.frame_1_9,this, true)
    }

    override fun setScore(scoreFrame: Int) {
        if (scoreFrame.toString() !== "") score.text = scoreFrame.toString()
    }

    override fun setThrow(numThrow: Int, scoreThrow: Int) {
        when (numThrow) {
            1 -> throw1.text = throwToString(scoreThrow)
            2 -> throw2.text = throwToString(scoreThrow)
        }
    }

    override fun setTitle(mTitle: String) {
        if (mTitle !== "") title.text = mTitle
    }
}