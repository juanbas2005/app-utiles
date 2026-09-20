package com.google.firebase.perf.network;

import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class FirebasePerfHttpClient {
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) {
        ui7.e();
        long a = ui7.a();
        sy4 sy4 = new sy4(hn7.O);
        try {
            sy4.j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            sy4.c(httpRequest.getRequestLine().getMethod());
            Long a2 = ty4.a(httpRequest);
            if (a2 != null) {
                sy4.e(a2.longValue());
            }
            long e = ui7.e();
            long a3 = ui7.a();
            sy4.f(e);
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            ui7.e();
            sy4.i(ui7.a() - a3);
            sy4.d(execute.getStatusLine().getStatusCode());
            Long a4 = ty4.a(execute);
            if (a4 != null) {
                sy4.h(a4.longValue());
            }
            String b = ty4.b(execute);
            if (b != null) {
                sy4.g(b);
            }
            sy4.b();
            return execute;
        } catch (IOException e2) {
            ui7.e();
            sy4.i(ui7.a() - a);
            ty4.c(sy4);
            throw e2;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) {
        ui7 ui7 = new ui7();
        sy4 sy4 = new sy4(hn7.O);
        try {
            sy4.j(httpUriRequest.getURI().toString());
            sy4.c(httpUriRequest.getMethod());
            Long a = ty4.a(httpUriRequest);
            if (a != null) {
                sy4.e(a.longValue());
            }
            ui7.d();
            sy4.f(ui7.w);
            return httpClient.execute(httpUriRequest, new de3(responseHandler, ui7, sy4));
        } catch (IOException e) {
            f21.t(ui7, sy4, sy4);
            throw e;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        ui7.e();
        long a = ui7.a();
        sy4 sy4 = new sy4(hn7.O);
        try {
            sy4.j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            sy4.c(httpRequest.getRequestLine().getMethod());
            Long a2 = ty4.a(httpRequest);
            if (a2 != null) {
                sy4.e(a2.longValue());
            }
            long e = ui7.e();
            long a3 = ui7.a();
            sy4.f(e);
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            ui7.e();
            sy4.i(ui7.a() - a3);
            sy4.d(execute.getStatusLine().getStatusCode());
            Long a4 = ty4.a(execute);
            if (a4 != null) {
                sy4.h(a4.longValue());
            }
            String b = ty4.b(execute);
            if (b != null) {
                sy4.g(b);
            }
            sy4.b();
            return execute;
        } catch (IOException e2) {
            ui7.e();
            sy4.i(ui7.a() - a);
            ty4.c(sy4);
            throw e2;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) {
        ui7.e();
        long a = ui7.a();
        sy4 sy4 = new sy4(hn7.O);
        try {
            sy4.j(httpUriRequest.getURI().toString());
            sy4.c(httpUriRequest.getMethod());
            Long a2 = ty4.a(httpUriRequest);
            if (a2 != null) {
                sy4.e(a2.longValue());
            }
            long e = ui7.e();
            long a3 = ui7.a();
            sy4.f(e);
            HttpResponse execute = httpClient.execute(httpUriRequest);
            ui7.e();
            sy4.i(ui7.a() - a3);
            sy4.d(execute.getStatusLine().getStatusCode());
            Long a4 = ty4.a(execute);
            if (a4 != null) {
                sy4.h(a4.longValue());
            }
            String b = ty4.b(execute);
            if (b != null) {
                sy4.g(b);
            }
            sy4.b();
            return execute;
        } catch (IOException e2) {
            ui7.e();
            sy4.i(ui7.a() - a);
            ty4.c(sy4);
            throw e2;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) {
        ui7.e();
        long a = ui7.a();
        sy4 sy4 = new sy4(hn7.O);
        try {
            sy4.j(httpUriRequest.getURI().toString());
            sy4.c(httpUriRequest.getMethod());
            Long a2 = ty4.a(httpUriRequest);
            if (a2 != null) {
                sy4.e(a2.longValue());
            }
            long e = ui7.e();
            long a3 = ui7.a();
            sy4.f(e);
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            ui7.e();
            sy4.i(ui7.a() - a3);
            sy4.d(execute.getStatusLine().getStatusCode());
            Long a4 = ty4.a(execute);
            if (a4 != null) {
                sy4.h(a4.longValue());
            }
            String b = ty4.b(execute);
            if (b != null) {
                sy4.g(b);
            }
            sy4.b();
            return execute;
        } catch (IOException e2) {
            ui7.e();
            sy4.i(ui7.a() - a);
            ty4.c(sy4);
            throw e2;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) {
        ui7 ui7 = new ui7();
        sy4 sy4 = new sy4(hn7.O);
        try {
            sy4.j(httpUriRequest.getURI().toString());
            sy4.c(httpUriRequest.getMethod());
            Long a = ty4.a(httpUriRequest);
            if (a != null) {
                sy4.e(a.longValue());
            }
            ui7.d();
            sy4.f(ui7.w);
            return httpClient.execute(httpUriRequest, new de3(responseHandler, ui7, sy4), httpContext);
        } catch (IOException e) {
            f21.t(ui7, sy4, sy4);
            throw e;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        ui7 ui7 = new ui7();
        sy4 sy4 = new sy4(hn7.O);
        try {
            sy4.j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            sy4.c(httpRequest.getRequestLine().getMethod());
            Long a = ty4.a(httpRequest);
            if (a != null) {
                sy4.e(a.longValue());
            }
            ui7.d();
            sy4.f(ui7.w);
            return httpClient.execute(httpHost, httpRequest, new de3(responseHandler, ui7, sy4));
        } catch (IOException e) {
            f21.t(ui7, sy4, sy4);
            throw e;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        ui7 ui7 = new ui7();
        sy4 sy4 = new sy4(hn7.O);
        try {
            sy4.j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            sy4.c(httpRequest.getRequestLine().getMethod());
            Long a = ty4.a(httpRequest);
            if (a != null) {
                sy4.e(a.longValue());
            }
            ui7.d();
            sy4.f(ui7.w);
            return httpClient.execute(httpHost, httpRequest, new de3(responseHandler, ui7, sy4), httpContext);
        } catch (IOException e) {
            f21.t(ui7, sy4, sy4);
            throw e;
        }
    }
}
