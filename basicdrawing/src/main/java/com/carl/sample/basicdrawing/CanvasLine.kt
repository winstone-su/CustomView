package com.carl.sample.basicdrawing

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

/**
 * @CreateTime : 2023/3/29 17:07
 * @Author : AppOS
 * @Description :
 */
class CanvasLine: View {
    constructor(context: Context): super(context)

    constructor(context: Context, atts: AttributeSet): super(context,atts)

    constructor(context: Context, atts: AttributeSet, defStyle: Int): super(context,atts,defStyle)

    private val paint: Paint = Paint()

    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.run {
            color = Color.RED
            style = Paint.Style.FILL
            strokeWidth = 50f
        }
        canvas?.run {
            drawLine(100f,100f,200f,200f,paint)
        }

        paint.style = Paint.Style.STROKE
        canvas?.drawLine(300f,100f,400f,200f,paint)
        paint.style = Paint.Style.FILL_AND_STROKE
        canvas?.drawLine(500f,100f,600f,200f,paint)
    }

}