package com.carl.sample.basicdrawing

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

/**
 * @CreateTime : 2023/3/29 15:12
 * @Author : AppOS
 * @Description :
 */
class BasicView2: View {
    constructor(context: Context): super(context)

    constructor(context: Context, atts: AttributeSet): super(context,atts)

    constructor(context: Context, atts: AttributeSet, defStyle: Int): super(context,atts,defStyle)

    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        //设置画笔的基本属性
        val paint = Paint()
        paint.run {
            //设置画笔颜色
            color = Color.RED
            //设置画笔宽度
            strokeWidth = 50f
        }
        //设置画笔填充样式
        paint.style = Paint.Style.FILL
        //画圆 cx: 圆心x坐标，cy: 圆心y坐标
        canvas?.run {
            drawCircle(190f,200f,100f,paint)
            paint.style = Paint.Style.STROKE
            drawCircle(190f,500f,100f,paint)
            paint.style = Paint.Style.FILL_AND_STROKE
            drawCircle(190f,800f,100f,paint)

            paint.strokeWidth = 5f
            paint.style = Paint.Style.FILL
            paint.textSize = 36f
            paint.color = Color.BLACK
            drawText("FILL",160f,350f,paint)
            drawText("STROKE",130f,660f, paint)
            drawText("FILL_AND_STROKE",80f,970f,paint)
        }
    }
}