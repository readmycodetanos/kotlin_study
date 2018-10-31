package com.study.eyepetizer.utils

import android.content.Context

object UiUtils{

    //dip 전환
    fun dip2px(context: Context, dipValue:Float):Float{
        val scale:Float =context.resources.displayMetrics.density;
        return dipValue*scale+0.5f;
    }

    fun px2dip(context:Context,pxValue:Float):Int{
        val scale:Float = context.resources.displayMetrics.density
        return (pxValue/scale+0.5f).toInt()
    }

}