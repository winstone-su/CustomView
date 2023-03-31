package com.carl.sample.basicdrawing

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

/**
 * @CreateTime : 2023/3/31 16:17
 * @Author : AppOS
 * @Description :
 */
class DrawRoundRect:View {
    constructor(context: Context): super(context)

    constructor(context: Context, atts: AttributeSet): super(context,atts)

    constructor(context: Context, atts: AttributeSet, defStyle: Int): super(context,atts,defStyle)

    private val paint: Paint = Paint()

    init {
        paint.color = Color.GREEN
        paint.strokeWidth = 10f
        paint.style = Paint.Style.FILL
    }

    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        val rectF = RectF(100f,10f,300f,100f)
        canvas?.drawRoundRect(rectF,20f,10f,paint)
    }
}