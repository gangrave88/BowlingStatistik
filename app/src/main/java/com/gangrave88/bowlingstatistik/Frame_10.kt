package com.gangrave88.bowlingstatistik

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.frame_10.view.*

class Frame_10 @JvmOverloads constructor(
        context: Context,
        attrs:AttributeSet? = null,
        defStyleAttr: Int = 0
): ConstraintLayout(context, attrs, defStyleAttr), Frame{

    init {
        LayoutInflater.from(context).inflate(R.layout.frame_10,this, true)
    }

    override fun setData(mTitle:String, mThrow1:String, mThrow2:String, mThrow3:String , mScore:String){
        if (mTitle !== "") title.text = mTitle
        if (mThrow1 !== "") throw1.text = mThrow1
        if (mThrow2 !== "") throw2.text = mThrow2
        if (mThrow3 !== "") throw3.text = mThrow3
        if (mScore !== "") score.text = mScore
    }
}