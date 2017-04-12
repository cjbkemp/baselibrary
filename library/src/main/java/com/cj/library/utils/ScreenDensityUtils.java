package com.cj.library.utils;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/**
 * Created by cj on 2016/6/1.
 * Email:781806481@qq.com
 */
public class ScreenDensityUtils {

    private static final DisplayMetrics displayMetrics= Resources.getSystem().getDisplayMetrics();

    /**
     * func:
     * convert dpValue to pxValue
     *
     * @param dpValue
     * @return
     */
    public static int dp2px(float dpValue){
            return (int)(dpValue*displayMetrics.density+0.5f);
    }

    /**
     * func:
     * convert pxValue to dpValue
     * @param pxValue
     * @return
     */
    public static int px2dp(float pxValue){
        return (int)(pxValue/displayMetrics.density+0.5f);
    }

    /**
     * func:
     * convert spValue to pxValue
     * @param spValue
     * @return
     */
    public static int sp2px(float spValue){
        return (int)(spValue*displayMetrics.scaledDensity+0.5f);
    }

    /**
     * func:
     * convert pxValue to spValue
     * @param pxValue
     * @return
     */
    public static int px2sp(float pxValue){
        return (int)(pxValue/displayMetrics.scaledDensity+0.5f);
    }

    /**
     * func:
     * get ScreenHeight
     * @return
     */
    public static int getScreenHeight(){
        return displayMetrics.heightPixels;
    }

    /**
     * func:
     * get ScreenWidth
     * @return
     */
    public static int getScreenWidth(){
        return displayMetrics.widthPixels;
    }

    /**
     * func:
     * get ScreenDensity
     * @return
     */
    public static float getScreenDensity(){
        return displayMetrics.density;
    }

}
