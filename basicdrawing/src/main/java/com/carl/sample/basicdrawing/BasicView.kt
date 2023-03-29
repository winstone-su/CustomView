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
class BasicView: View {
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
            //设置画笔填充样式
            style = Paint.Style.STROKE
            //设置画笔宽度
            strokeWidth = 50f
        }
        //画圆
        canvas?.drawCircle(190f,200f,150f,paint)

    }
}