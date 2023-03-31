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
 * @CreateTime : 2023/3/31 16:43
 * @Author : AppOS
 * @Description :
 */
class ArcView: View {

    constructor(context: Context): super(context)

    constructor(context: Context, atts: AttributeSet): super(context,atts)

    constructor(context: Context, atts: AttributeSet, defStyle: Int): super(context,atts,defStyle)

    private val paint: Paint = Paint()

    init {
        paint.color = Color.RED
        paint.strokeWidth = 10f
        paint.style = Paint.Style.STROKE
    }

    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        val rect = RectF(10f,10f,200f,200f)
        canvas?.drawArc(rect,0f,90f,true,paint)
    }
}