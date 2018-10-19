package com.wyh.mvnt.util;

import lombok.extern.slf4j.Slf4j;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author: WangYuanHang
 * @Description:
 * @date: 2018/10/16 15:13
 */
@Slf4j
public class HttpClientUtil {

    public void sendHttpRequest() {

    }

    public static String sendHttpGetRequest(String url) {
        String bodyStr = null;
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(3, TimeUnit.SECONDS)
                .readTimeout(5,TimeUnit.SECONDS)
                .writeTimeout(5,TimeUnit.SECONDS)
                .build();
        Request request = new Request.Builder()
                .url(url)
                .build();
        Call call = okHttpClient.newCall(request);
        Response res = null;
        try {
            res = call.execute();
            bodyStr = res.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bodyStr;
    }

    public void sendHttpPostRequest() {

    }
}
