package com.gangrave88.bowlingstatistik

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout

class TableScore @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
):LinearLayout(context, attrs, defStyleAttr, defStyleRes){



    init {
        var view = LayoutInflater.from(context).inflate(R.layout.table_score, this)
    }

}