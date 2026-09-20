package defpackage;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* renamed from: dd  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dd extends ej5 implements u51 {
    public static final boolean e;
    public Context c;
    public final ArrayList d;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        } else {
            z = false;
        }
        e = z;
    }

    public dd() {
        Object obj;
        if (Build.VERSION.SDK_INT >= 29) {
            obj = new Object();
        } else {
            obj = null;
        }
        ArrayList V0 = qs.V0(new ey6[]{obj, new oo1(mi.e), new oo1(b21.a), new oo1(cb0.a)});
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
        StrictMode.noteSlowCall("buildTrustRootIndex");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new j60(new n70((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length)));
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

    public final Object g() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.g();
        }
        CloseGuard h = t4.h();
        h.open("response.body().close()");
        return h;
    }

    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    public final void i(String str, int i, Throwable th) {
        if (i == 5) {
            boolean z = ih.e;
            Log.w("OkHttp", str, th);
            return;
        }
        boolean z2 = ih.e;
        Log.i("OkHttp", str, th);
    }

    public final void j(String str, Object obj) {
        if (Build.VERSION.SDK_INT >= 30) {
            obj.getClass();
            t4.i(obj).warnIfOpen();
            return;
        }
        super.j(str, obj);
    }

    public final SSLContext k() {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.getClass();
        return instance;
    }
}
