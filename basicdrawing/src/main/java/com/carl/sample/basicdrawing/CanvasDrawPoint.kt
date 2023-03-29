package com.carl.sample.basicdrawing

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

/**
 * @CreateTime : 2023/3/29 17:22
 * @Author : AppOS
 * @Description :
 */
class CanvasDrawPoint: View {
    constructor(context: Context): super(context)

    constructor(context: Context, atts: AttributeSet): super(context,atts)

    constructor(context: Context, atts: AttributeSet, defStyle: Int): super(context,atts,defStyle)

    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val paint = Paint()
        paint.run {
            color = Color.CYAN
            strokeWidth = 15f
        }
        canvas?.drawPoint(100f,100f,paint)
    }
}