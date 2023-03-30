package com.carl.sample.basicdrawing

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

/**
 * @CreateTime : 2023/3/30 9:25
 * @Author : AppOS
 * @Description :
 */
class BasicRect: View {
    constructor(context: Context): super(context)

    constructor(context: Context, atts: AttributeSet): super(context,atts)

    constructor(context: Context, atts: AttributeSet, defStyle: Int): super(context,atts,defStyle)

    private val paint: Paint = Paint()

    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.run {
            color = Color.CYAN
            strokeWidth = 10f
            style = Paint.Style.STROKE
        }
        //直接构造
        canvas?.drawRect(10f,10f,100f,100f,paint)
        //使用RectF构造
        paint.style = Paint.Style.FILL
        val rectF = RectF(210f,10f,300f,100f)
        canvas?.drawRect(rectF,paint)

    }
}