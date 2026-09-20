package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* renamed from: ce3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ce3 {
    public static final rg f = rg.d();
    public final HttpURLConnection a;
    public final sy4 b;
    public long c = -1;
    public long d = -1;
    public final ui7 e;

    public ce3(HttpURLConnection httpURLConnection, ui7 ui7, sy4 sy4) {
        this.a = httpURLConnection;
        this.b = sy4;
        this.e = ui7;
        sy4.j(httpURLConnection.getURL().toString());
    }

    public final void a() {
        int i = (this.c > -1 ? 1 : (this.c == -1 ? 0 : -1));
        sy4 sy4 = this.b;
        ui7 ui7 = this.e;
        if (i == 0) {
            ui7.d();
            long j = ui7.w;
            this.c = j;
            sy4.f(j);
        }
        try {
            this.a.connect();
        } catch (IOException e2) {
            f21.t(ui7, sy4, sy4);
            throw e2;
        }
    }

    public final Object b() {
        ui7 ui7 = this.e;
        i();
        HttpURLConnection httpURLConnection = this.a;
        int responseCode = httpURLConnection.getResponseCode();
        sy4 sy4 = this.b;
        sy4.d(responseCode);
        try {
            Object content = httpURLConnection.getContent();
            if (content instanceof InputStream) {
                sy4.g(httpURLConnection.getContentType());
                return new yd3((InputStream) content, sy4, ui7);
            }
            sy4.g(httpURLConnection.getContentType());
            sy4.h((long) httpURLConnection.getContentLength());
            sy4.i(ui7.b());
            sy4.b();
            return content;
        } catch (IOException e2) {
            f21.t(ui7, sy4, sy4);
            throw e2;
        }
    }

    public final Object c(Class[] clsArr) {
        ui7 ui7 = this.e;
        i();
        HttpURLConnection httpURLConnection = this.a;
        int responseCode = httpURLConnection.getResponseCode();
        sy4 sy4 = this.b;
        sy4.d(responseCode);
        try {
            Object content = httpURLConnection.getContent(clsArr);
            if (content instanceof InputStream) {
                sy4.g(httpURLConnection.getContentType());
                return new yd3((InputStream) content, sy4, ui7);
            }
            sy4.g(httpURLConnection.getContentType());
            sy4.h((long) httpURLConnection.getContentLength());
            sy4.i(ui7.b());
            sy4.b();
            return content;
        } catch (IOException e2) {
            f21.t(ui7, sy4, sy4);
            throw e2;
        }
    }

    public final InputStream d() {
        HttpURLConnection httpURLConnection = this.a;
        sy4 sy4 = this.b;
        i();
        try {
            sy4.d(httpURLConnection.getResponseCode());
        } catch (IOException unused) {
            f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream != null) {
            return new yd3(errorStream, sy4, this.e);
        }
        return errorStream;
    }

    public final InputStream e() {
        ui7 ui7 = this.e;
        i();
        HttpURLConnection httpURLConnection = this.a;
        int responseCode = httpURLConnection.getResponseCode();
        sy4 sy4 = this.b;
        sy4.d(responseCode);
        sy4.g(httpURLConnection.getContentType());
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (inputStream != null) {
                return new yd3(inputStream, sy4, ui7);
            }
            return inputStream;
        } catch (IOException e2) {
            f21.t(ui7, sy4, sy4);
            throw e2;
        }
    }

    public final boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public final OutputStream f() {
        ui7 ui7 = this.e;
        sy4 sy4 = this.b;
        try {
            OutputStream outputStream = this.a.getOutputStream();
            if (outputStream != null) {
                return new zd3(outputStream, sy4, ui7);
            }
            return outputStream;
        } catch (IOException e2) {
            f21.t(ui7, sy4, sy4);
            throw e2;
        }
    }

    public final int g() {
        i();
        int i = (this.d > -1 ? 1 : (this.d == -1 ? 0 : -1));
        ui7 ui7 = this.e;
        sy4 sy4 = this.b;
        if (i == 0) {
            long b2 = ui7.b();
            this.d = b2;
            py4 py4 = sy4.z;
            py4.h();
            ry4.z((ry4) py4.x, b2);
        }
        try {
            int responseCode = this.a.getResponseCode();
            sy4.d(responseCode);
            return responseCode;
        } catch (IOException e2) {
            f21.t(ui7, sy4, sy4);
            throw e2;
        }
    }

    public final String h() {
        HttpURLConnection httpURLConnection = this.a;
        i();
        int i = (this.d > -1 ? 1 : (this.d == -1 ? 0 : -1));
        ui7 ui7 = this.e;
        sy4 sy4 = this.b;
        if (i == 0) {
            long b2 = ui7.b();
            this.d = b2;
            py4 py4 = sy4.z;
            py4.h();
            ry4.z((ry4) py4.x, b2);
        }
        try {
            String responseMessage = httpURLConnection.getResponseMessage();
            sy4.d(httpURLConnection.getResponseCode());
            return responseMessage;
        } catch (IOException e2) {
            f21.t(ui7, sy4, sy4);
            throw e2;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i() {
        int i = (this.c > -1 ? 1 : (this.c == -1 ? 0 : -1));
        sy4 sy4 = this.b;
        if (i == 0) {
            ui7 ui7 = this.e;
            ui7.d();
            long j = ui7.w;
            this.c = j;
            sy4.f(j);
        }
        HttpURLConnection httpURLConnection = this.a;
        String requestMethod = httpURLConnection.getRequestMethod();
        if (requestMethod != null) {
            sy4.c(requestMethod);
        } else if (httpURLConnection.getDoOutput()) {
            sy4.c("POST");
        } else {
            sy4.c("GET");
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
