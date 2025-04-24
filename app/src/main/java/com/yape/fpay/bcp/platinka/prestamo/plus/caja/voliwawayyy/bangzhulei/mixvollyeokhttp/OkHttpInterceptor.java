package com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.bangzhulei.mixvollyeokhttp;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * okhttp拦截器，用于日志打印
 */
public class OkHttpInterceptor implements Interceptor {

    private static final String NEWLINE = "\n";

    @Override
    public Response intercept(Chain chain) throws IOException {
        long requestTime = System.currentTimeMillis();
        Request request = chain.request();

        StringBuilder sb = new StringBuilder();
        sb.append("请求url为：").append(request.url()).append(NEWLINE);
        sb.append("请求方式为：").append(request.method()).append(NEWLINE);

        // 打印请求的header
        Headers requestHeaders = request.headers();
        sb.append(handleHeader(requestHeaders, true)).append(NEWLINE);
        // 打印请求内容
//        if (!request.method().toLowerCase().contains("get")) {
        RequestBody rb = request.body();
        if (rb != null) {
            okio.Buffer buffer = new okio.Buffer();
            rb.writeTo(buffer);
            sb.append("请求的数据为：").append(buffer.readUtf8()).append(NEWLINE);
            buffer.clear();
        }
//        }

        Response response = chain.proceed(request);
        // 打印返回的header
        Headers responseHeaders = response.headers();
        sb.append(handleHeader(responseHeaders, false)).append(NEWLINE);
        // 打印返回内容
        String content = response.body().string();
        long responseTime = System.currentTimeMillis();
        sb.append("HTTP状态码：").append(response.code()).append(NEWLINE);
        sb.append("耗费时间为：").append(responseTime - requestTime).append("ms").append(NEWLINE);
        sb.append("返回的数据为：").append(content).append(NEWLINE);
//        NetworkLogger.d(sb.toString());
        MediaType mediaType = response.body().contentType();
        return response.newBuilder().body(ResponseBody.create(mediaType, content)).build();
    }

    private String handleHeader(Headers headers, boolean isRequest) {
        Iterator<String> iterator = headers.names().iterator();
        StringBuilder headerString = new StringBuilder();
        headerString.append(isRequest ? "请求的header为：" : "返回的header为：");
        while (iterator.hasNext()) {
            String name = iterator.next();
            List<String> headerValues = headers.values(name);
            headerString.append("[").append(name).append(":").append(headerValues.isEmpty() ? "" : headerValues.get(0)).append("]");
        }
        return headerString.toString();
    }
}