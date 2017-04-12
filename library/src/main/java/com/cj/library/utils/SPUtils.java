package com.cj.library.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.cj.library.app.BaseApplication;


/**
 * Created by Administrator on 2016/11/22.
 */
public class SPUtils {
    private static final String SP_NAME="framework";
    private static SharedPreferences sp= BaseApplication.getContext().getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
    private static SharedPreferences.Editor editor=sp.edit();
    private static final String TAG="SPUtils";

    /**
     * 添加键值对
     * @param key
     * @param value
     */
    public static void add(String key,Object value){
        String className=value.getClass().getSimpleName();
        switch (className){
            case "Integer":
                editor.putInt(key, (Integer) value);
                break;
            case "Long":
                editor.putLong(key, (Long) value);
                break;
            case "Float":
                editor.putFloat(key, (Float) value);
                break;
            case "String":
                editor.putString(key, (String) value);
                break;
            case "Boolean":
                editor.putBoolean(key, (Boolean) value);
                break;
            default:
                Log.d(BaseApplication.getContext().getPackageName(),"\t"+TAG+"\t"+"add()"+"\t"+"参数值错误");
                break;
        }
        editor.commit();
    }

    /**
     * 删除该键值对
     * 当没有该key的时候，不报错
     * @param key
     */
    public static void delete(String key){
        editor.remove(key);
        editor.commit();
    }

    /**
     * 获取某键的string值，若不存在该键，则返回null
     * @param key
     * @return
     */
    public static String getString(String key){
        return sp.getString(key,null);
    }

    /**
     * 获取某键的int值，若不存在，返回0
     * @param key
     * @return
     */
    public static int getInt(String key){
        return sp.getInt(key,0);
    }

    /**
     * 获取某键的long值，若不存在，返回0
     * @param key
     * @return
     */
    public static long getLong(String key){
        return sp.getLong(key,0l);
    }

    /**
     * 获取某键的float值，若不存在，返回0
     * @param key
     * @return
     */
    public static float getFloat(String key){
        return sp.getFloat(key,0f);
    }

    /**
     * 获取某键的boolean值，若不存在，返回false
     * @param key
     * @return
     */
    public static boolean getBoolean(String key){
        return sp.getBoolean(key,false);
    }
}
