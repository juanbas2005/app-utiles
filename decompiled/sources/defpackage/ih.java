package defpackage;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* renamed from: ih  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ih extends ej5 implements u51 {
    public static final boolean e;
    public Context c;
    public final ArrayList d;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT < 29) {
            z = true;
        } else {
            z = false;
        }
        e = z;
    }

    public ih() {
        mi miVar;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            miVar = new mi(cls);
        } catch (Exception e2) {
            CopyOnWriteArraySet copyOnWriteArraySet = pg.a;
            pg.a(d45.class.getName(), 5, "unable to load android socket classes", e2);
            miVar = null;
        }
        ArrayList V0 = qs.V0(new ey6[]{miVar, new oo1(mi.e), new oo1(b21.a), new oo1(cb0.a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = V0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ey6) next).b()) {
                arrayList.add(next);
            }
        }
        this.d = arrayList;
    }

    public final void a(Context context) {
        this.c = context;
    }

    public final Context b() {
        return this.c;
    }

    public final x91 c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        fo7 fo7;
        qd qdVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            qdVar = new qd(x509TrustManager, x509TrustManagerExtensions);
        }
        if (qdVar != null) {
            return qdVar;
        }
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            fo7 = new hh(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused2) {
            X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
            fo7 = new n70((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
        }
        return new j60(fo7);
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        list.getClass();
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ey6) obj).a(sSLSocket)) {
                break;
            }
        }
        ey6 ey6 = (ey6) obj;
        if (ey6 != null) {
            ey6.d(sSLSocket, str, list);
        }
    }

    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        inetSocketAddress.getClass();
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e2);
            }
            throw e2;
        }
    }

    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ey6) obj).a(sSLSocket)) {
                break;
            }
        }
        ey6 ey6 = (ey6) obj;
        if (ey6 != null) {
            return ey6.c(sSLSocket);
        }
        return null;
    }

    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    public final void i(String str, int i, Throwable th) {
        if (i == 5) {
            Log.w("OkHttp", str, th);
        } else {
            Log.i("OkHttp", str, th);
        }
    }

    public final SSLContext k() {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.getClass();
        return instance;
    }
}
