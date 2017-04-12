package com.cj.library.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by cj on 2017/4/12.
 */

public class NetworkUtils {

    /**
     * 判断网络是否连接
     * @param context
     * @return
     */
    public static boolean isConnected(Context context){
        ConnectivityManager cm= (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if(cm!=null){
            NetworkInfo networkInfo=cm.getActiveNetworkInfo();
            if(networkInfo!=null&&networkInfo.isConnected()){
                if(networkInfo.getState()==NetworkInfo.State.CONNECTED){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 判断是否为wifi连接
     * @param context
     * @return
     */
    public static boolean isWifi(Context context){
        ConnectivityManager cm= (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if(cm==null) return false;
        if(cm.getActiveNetworkInfo()==null) return false;
        return cm.getActiveNetworkInfo().getType()==ConnectivityManager.TYPE_WIFI;
    }

    /**
     * 判断是否为移动网络
     * @param context
     * @return
     */
    public static boolean isMobile(Context context){
        ConnectivityManager cm= (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if(cm==null) return false;
        if(cm.getActiveNetworkInfo()==null) return false;
        return cm.getActiveNetworkInfo().getType()==ConnectivityManager.TYPE_MOBILE;
    }

}
