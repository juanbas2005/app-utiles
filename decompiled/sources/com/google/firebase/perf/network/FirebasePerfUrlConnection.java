package com.google.firebase.perf.network;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class FirebasePerfUrlConnection {
    public static Object getContent(URL url) {
        hn7 hn7 = hn7.O;
        ui7 ui7 = new ui7();
        ui7.d();
        long j = ui7.w;
        sy4 sy4 = new sy4(hn7);
        try {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new be3((HttpsURLConnection) openConnection, ui7, sy4).a.b();
            }
            if (openConnection instanceof HttpURLConnection) {
                return new ae3((HttpURLConnection) openConnection, ui7, sy4).a.b();
            }
            return openConnection.getContent();
        } catch (IOException e) {
            sy4.f(j);
            sy4.i(ui7.b());
            sy4.j(url.toString());
            ty4.c(sy4);
            throw e;
        }
    }

    public static Object instrument(Object obj) {
        if (obj instanceof HttpsURLConnection) {
            return new be3((HttpsURLConnection) obj, new ui7(), new sy4(hn7.O));
        }
        if (obj instanceof HttpURLConnection) {
            return new ae3((HttpURLConnection) obj, new ui7(), new sy4(hn7.O));
        }
        return obj;
    }

    public static InputStream openStream(URL url) {
        hn7 hn7 = hn7.O;
        ui7 ui7 = new ui7();
        if (!hn7.y.get()) {
            return url.openConnection().getInputStream();
        }
        ui7.d();
        long j = ui7.w;
        sy4 sy4 = new sy4(hn7);
        try {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new be3((HttpsURLConnection) openConnection, ui7, sy4).a.e();
            }
            if (openConnection instanceof HttpURLConnection) {
                return new ae3((HttpURLConnection) openConnection, ui7, sy4).a.e();
            }
            return openConnection.getInputStream();
        } catch (IOException e) {
            sy4.f(j);
            sy4.i(ui7.b());
            sy4.j(url.toString());
            ty4.c(sy4);
            throw e;
        }
    }

    public static Object getContent(URL url, Class[] clsArr) {
        hn7 hn7 = hn7.O;
        ui7 ui7 = new ui7();
        ui7.d();
        long j = ui7.w;
        sy4 sy4 = new sy4(hn7);
        try {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new be3((HttpsURLConnection) openConnection, ui7, sy4).a.c(clsArr);
            }
            if (openConnection instanceof HttpURLConnection) {
                return new ae3((HttpURLConnection) openConnection, ui7, sy4).a.c(clsArr);
            }
            return openConnection.getContent(clsArr);
        } catch (IOException e) {
            sy4.f(j);
            sy4.i(ui7.b());
            sy4.j(url.toString());
            ty4.c(sy4);
            throw e;
        }
    }
}
