package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

/* renamed from: ae3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ae3 extends HttpURLConnection {
    public final ce3 a;

    public ae3(HttpURLConnection httpURLConnection, ui7 ui7, sy4 sy4) {
        super(httpURLConnection.getURL());
        this.a = new ce3(httpURLConnection, ui7, sy4);
    }

    public final void addRequestProperty(String str, String str2) {
        this.a.a.addRequestProperty(str, str2);
    }

    public final void connect() {
        this.a.a();
    }

    public final void disconnect() {
        ce3 ce3 = this.a;
        sy4 sy4 = ce3.b;
        sy4.i(ce3.e.b());
        sy4.b();
        ce3.a.disconnect();
    }

    public final boolean equals(Object obj) {
        return this.a.a.equals(obj);
    }

    public final boolean getAllowUserInteraction() {
        return this.a.a.getAllowUserInteraction();
    }

    public final int getConnectTimeout() {
        return this.a.a.getConnectTimeout();
    }

    public final Object getContent() {
        return this.a.b();
    }

    public final String getContentEncoding() {
        ce3 ce3 = this.a;
        ce3.i();
        return ce3.a.getContentEncoding();
    }

    public final int getContentLength() {
        ce3 ce3 = this.a;
        ce3.i();
        return ce3.a.getContentLength();
    }

    public final long getContentLengthLong() {
        ce3 ce3 = this.a;
        ce3.i();
        return ce3.a.getContentLengthLong();
    }

    public final String getContentType() {
        ce3 ce3 = this.a;
        ce3.i();
        return ce3.a.getContentType();
    }

    public final long getDate() {
        ce3 ce3 = this.a;
        ce3.i();
        return ce3.a.getDate();
    }

    public final boolean getDefaultUseCaches() {
        return this.a.a.getDefaultUseCaches();
    }

    public final boolean getDoInput() {
        return this.a.a.getDoInput();
    }

    public final boolean getDoOutput() {
        return this.a.a.getDoOutput();
    }

    public final InputStream getErrorStream() {
        return this.a.d();
    }

    public final long getExpiration() {
        ce3 ce3 = this.a;
        ce3.i();
        return ce3.a.getExpiration();
    }

    public final String getHeaderField(int i) {
        ce3 ce3 = this.a;
        ce3.i();
        return ce3.a.getHeaderField(i);
    }

    public final long getHeaderFieldDate(String str, long j) {
        ce3 ce3 = this.a;
        ce3.i();
        return ce3.a.getHeaderFieldDate(str, j);
    }

    public final int getHeaderFieldInt(String str, int i) {
        ce3 ce3 = this.a;
        ce3.i();
        return ce3.a.getHeaderFieldInt(str, i);
    }

    public final String getHeaderFieldKey(int i) {
        ce3 ce3 = this.a;
        ce3.i();
        return ce3.a.getHeaderFieldKey(i);
    }

    public final long getHeaderFieldLong(String str, long j) {
        ce3 ce3 = this.a;
        ce3.i();
        return ce3.a.getHeaderFieldLong(str, j);
    }

    public final Map getHeaderFields() {
        ce3 ce3 = this.a;
        ce3.i();
        return ce3.a.getHeaderFields();
    }

    public final long getIfModifiedSince() {
        return this.a.a.getIfModifiedSince();
    }

    public final InputStream getInputStream() {
        return this.a.e();
    }

    public final boolean getInstanceFollowRedirects() {
        return this.a.a.getInstanceFollowRedirects();
    }

    public final long getLastModified() {
        ce3 ce3 = this.a;
        ce3.i();
        return ce3.a.getLastModified();
    }

    public final OutputStream getOutputStream() {
        return this.a.f();
    }

    public final Permission getPermission() {
        ce3 ce3 = this.a;
        sy4 sy4 = ce3.b;
        try {
            return ce3.a.getPermission();
        } catch (IOException e) {
            f21.t(ce3.e, sy4, sy4);
            throw e;
        }
    }

    public final int getReadTimeout() {
        return this.a.a.getReadTimeout();
    }

    public final String getRequestMethod() {
        return this.a.a.getRequestMethod();
    }

    public final Map getRequestProperties() {
        return this.a.a.getRequestProperties();
    }

    public final String getRequestProperty(String str) {
        return this.a.a.getRequestProperty(str);
    }

    public final int getResponseCode() {
        return this.a.g();
    }

    public final String getResponseMessage() {
        return this.a.h();
    }

    public final URL getURL() {
        return this.a.a.getURL();
    }

    public final boolean getUseCaches() {
        return this.a.a.getUseCaches();
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final void setAllowUserInteraction(boolean z) {
        this.a.a.setAllowUserInteraction(z);
    }

    public final void setChunkedStreamingMode(int i) {
        this.a.a.setChunkedStreamingMode(i);
    }

    public final void setConnectTimeout(int i) {
        this.a.a.setConnectTimeout(i);
    }

    public final void setDefaultUseCaches(boolean z) {
        this.a.a.setDefaultUseCaches(z);
    }

    public final void setDoInput(boolean z) {
        this.a.a.setDoInput(z);
    }

    public final void setDoOutput(boolean z) {
        this.a.a.setDoOutput(z);
    }

    public final void setFixedLengthStreamingMode(int i) {
        this.a.a.setFixedLengthStreamingMode(i);
    }

    public final void setIfModifiedSince(long j) {
        this.a.a.setIfModifiedSince(j);
    }

    public final void setInstanceFollowRedirects(boolean z) {
        this.a.a.setInstanceFollowRedirects(z);
    }

    public final void setReadTimeout(int i) {
        this.a.a.setReadTimeout(i);
    }

    public final void setRequestMethod(String str) {
        this.a.a.setRequestMethod(str);
    }

    public final void setRequestProperty(String str, String str2) {
        ce3 ce3 = this.a;
        ce3.getClass();
        if ("User-Agent".equalsIgnoreCase(str)) {
            ce3.b.B = str2;
        }
        ce3.a.setRequestProperty(str, str2);
    }

    public final void setUseCaches(boolean z) {
        this.a.a.setUseCaches(z);
    }

    public final String toString() {
        return this.a.a.toString();
    }

    public final boolean usingProxy() {
        return this.a.a.usingProxy();
    }

    public final Object getContent(Class[] clsArr) {
        return this.a.c(clsArr);
    }

    public final void setFixedLengthStreamingMode(long j) {
        this.a.a.setFixedLengthStreamingMode(j);
    }

    public final String getHeaderField(String str) {
        ce3 ce3 = this.a;
        ce3.i();
        return ce3.a.getHeaderField(str);
    }
}
