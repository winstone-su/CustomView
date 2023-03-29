package com.carl.sample.basicdrawing

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.os.Build
import android.util.AttributeSet
import android.view.View
import androidx.annotation.RequiresApi

/**
 * @CreateTime : 2023/3/29 16:21
 * @Author : AppOS
 * @Description :
 */
class Canvas1: View {
    constructor(context: Context): super(context)

    constructor(context: Context, atts: AttributeSet): super(context,atts)

    constructor(context: Context, atts: AttributeSet, defStyle: Int): super(context,atts,defStyle)

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.run {
//            drawColor(Color.BLUE)
            drawARGB(0xFF,0x00,0x00,0xFF)
//            drawRGB(0x00,0x00,0xFF)
        }
    }
}