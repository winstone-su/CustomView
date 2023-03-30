package com.carl.sample.basicdrawing

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.os.Build
import android.util.AttributeSet
import android.view.View
import androidx.annotation.RequiresApi

/**
 * @CreateTime : 2023/3/30 11:42
 * @Author : AppOS
 * @Description :
 */
class BasicColor:View {

    constructor(context: Context): super(context)

    constructor(context: Context, atts: AttributeSet): super(context,atts)

    constructor(context: Context, atts: AttributeSet, defStyle: Int): super(context,atts,defStyle)

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        val green = Color.green(0xFF000F00)
    }
}