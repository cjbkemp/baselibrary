package com.cj.library.api;

import com.cj.library.app.BaseApplication;
import com.cj.library.utils.NetworkUtils;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by cj on 2017/4/12.
 */

public class CacheInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request oldRequest=chain.request();
        String cacheControl=oldRequest.cacheControl().toString();
        Response oldResponse=chain.proceed(oldRequest);
        if(NetworkUtils.isNetConnected(BaseApplication.getContext())){
            return oldResponse.newBuilder()
                        .header("Cache-Control",cacheControl)
                        .removeHeader("Pragma")
                        .build();

        }
        return oldResponse;
    }
}
