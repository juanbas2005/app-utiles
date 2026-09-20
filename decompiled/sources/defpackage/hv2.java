package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import io.ktor.client.engine.okhttp.StreamAdapterIOException;
import io.ktor.client.network.sockets.ConnectTimeoutException;
import io.ktor.http.Url;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: hv2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class hv2 implements yp0, s67, fx6, a27, r15, vi0, mk0, f75, uq0 {
    public final /* synthetic */ int w;
    public Object x;
    public Object y;

    public hv2(int i) {
        this.w = i;
        switch (i) {
            case 10:
                lo7 lo7 = we.v;
                Float valueOf = Float.valueOf(0.0f);
                this.x = new il(lo7, valueOf, (ol) lo7.a.y(valueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
                return;
            case 16:
                return;
            case 18:
                this.y = new tp4();
                this.x = new tp4();
                return;
            case 22:
                this.y = new AtomicInteger();
                this.x = new AtomicInteger();
                return;
            case 23:
                this.y = new eq4(new uy3[16]);
                return;
            default:
                this.y = new SparseIntArray();
                this.x = new SparseIntArray();
                return;
        }
    }

    public static void D0(uy3 uy3) {
        if (uy3.i0 > 0) {
            if (uy3.b0.d == qy3.A && !uy3.p() && !uy3.q() && !uy3.j0 && uy3.K()) {
                ll4 ll4 = (ll4) uy3.a0.g;
                if ((ll4.z & 256) != 0) {
                    while (ll4 != null) {
                        if ((ll4.y & 256) != 0) {
                            ll4 ll42 = ll4;
                            eq4 eq4 = null;
                            while (ll42 != null) {
                                if (ll42 instanceof aw2) {
                                    aw2 aw2 = (aw2) ll42;
                                    aw2.b0(rc9.M0(aw2, 256));
                                } else if ((ll42.y & 256) != 0 && (ll42 instanceof wo1)) {
                                    int i = 0;
                                    for (ll4 ll43 = ((wo1) ll42).L; ll43 != null; ll43 = ll43.B) {
                                        if ((ll43.y & 256) != 0) {
                                            i++;
                                            if (i == 1) {
                                                ll42 = ll43;
                                            } else {
                                                if (eq4 == null) {
                                                    eq4 = new eq4(new ll4[16]);
                                                }
                                                if (ll42 != null) {
                                                    eq4.b(ll42);
                                                    ll42 = null;
                                                }
                                                eq4.b(ll43);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                ll42 = rc9.j(eq4);
                            }
                        }
                        if ((ll4.z & 256) == 0) {
                            break;
                        }
                        ll4 = ll4.B;
                    }
                }
            }
            uy3.h0 = false;
            eq4 z = uy3.z();
            Object[] objArr = z.w;
            int i2 = z.y;
            for (int i3 = 0; i3 < i2; i3++) {
                D0((uy3) objArr[i3]);
            }
        }
    }

    public static hv2 N0(t54 t54) {
        return new hv2(t54, ((a68) t54).g());
    }

    public static int P0(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        if (i3 + 1 > i2) {
            return i4 + 1;
        }
        return i4;
    }

    public List A(Integer num) {
        List A = ((f75) this.y).A((Integer) null);
        jv6 jv6 = (jv6) this.x;
        int i = jv6.v;
        if (i < 0) {
            return A;
        }
        return dt0.M0(gr8.v(jv6, num, i, Integer.valueOf(jv6.G(jv6.b, i))), A);
    }

    public /* bridge */ po7 A0(v76 v76) {
        return rc9.m(v76);
    }

    public v76 B(zw3 zw3) {
        fu6 x0;
        zw3.getClass();
        zg2 p = rc9.p(zw3);
        if (p != null && (x0 = rc9.x0(p)) != null) {
            return x0;
        }
        fu6 s = rc9.s(zw3);
        s.getClass();
        return s;
    }

    public /* bridge */ du7 B0(hu6 hu6, hu6 hu62) {
        return rc9.E(this, hu6, hu62);
    }

    public /* bridge */ zw3 C(nl0 nl0) {
        return rc9.y0(nl0);
    }

    public /* bridge */ zw3 C0(zw3 zw3) {
        return rc9.f1(this, zw3);
    }

    public /* bridge */ Collection D(xo7 xo7) {
        return rc9.V0(xo7);
    }

    public /* bridge */ boolean E(xo7 xo7) {
        return rc9.i0(xo7);
    }

    public /* bridge */ boolean E0(zw3 zw3) {
        return rc9.j0(zw3);
    }

    public /* bridge */ xo7 F(v76 v76) {
        return rc9.b1(v76);
    }

    public void F0(String str, PrintWriter printWriter) {
        boolean z;
        i94 i94 = (i94) this.x;
        if (i94.b.f() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String concat = str.concat("    ");
            for (int i = 0; i < i94.b.f(); i++) {
                h94 h94 = (h94) i94.b.g(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i94.b.d(i));
                printWriter.print(": ");
                printWriter.println(h94.toString());
                printWriter.print(concat);
                printWriter.print("mId=");
                printWriter.print(h94.l);
                printWriter.print(" mArgs=");
                Object obj = null;
                printWriter.println((Object) null);
                printWriter.print(concat);
                printWriter.print("mLoader=");
                printWriter.println(h94.m);
                ai8 ai8 = h94.m;
                String concat2 = concat.concat("  ");
                ai8.getClass();
                printWriter.print(concat2);
                printWriter.print("mId=");
                printWriter.print(ai8.a);
                printWriter.print(" mListener=");
                printWriter.println(ai8.b);
                if (ai8.d || ai8.g) {
                    printWriter.print(concat2);
                    printWriter.print("mStarted=");
                    printWriter.print(ai8.d);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(ai8.g);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (ai8.e || ai8.f) {
                    printWriter.print(concat2);
                    printWriter.print("mAbandoned=");
                    printWriter.print(ai8.e);
                    printWriter.print(" mReset=");
                    printWriter.println(ai8.f);
                }
                if (ai8.i != null) {
                    printWriter.print(concat2);
                    printWriter.print("mTask=");
                    printWriter.print(ai8.i);
                    printWriter.print(" waiting=");
                    ai8.i.getClass();
                    printWriter.println(false);
                }
                if (ai8.j != null) {
                    printWriter.print(concat2);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(ai8.j);
                    printWriter.print(" waiting=");
                    ai8.j.getClass();
                    printWriter.println(false);
                }
                if (h94.o != null) {
                    printWriter.print(concat);
                    printWriter.print("mCallbacks=");
                    printWriter.println(h94.o);
                    v70 v70 = h94.o;
                    String concat3 = concat.concat("  ");
                    v70.getClass();
                    printWriter.print(concat3);
                    printWriter.print("mDeliveredData=");
                    printWriter.println(v70.x);
                }
                printWriter.print(concat);
                printWriter.print("mData=");
                ai8 ai82 = h94.m;
                Object obj2 = h94.e;
                if (obj2 != bp4.k) {
                    obj = obj2;
                }
                ai82.getClass();
                StringBuilder sb = new StringBuilder(64);
                if (obj == null) {
                    sb.append("null");
                } else {
                    Class<?> cls = obj.getClass();
                    sb.append(cls.getSimpleName());
                    sb.append("{");
                    sb.append(Integer.toHexString(System.identityHashCode(cls)));
                    sb.append("}");
                }
                printWriter.println(sb.toString());
                printWriter.print(concat);
                printWriter.print("mStarted=");
                if (h94.c > 0) {
                    z = true;
                } else {
                    z = false;
                }
                printWriter.println(z);
            }
        }
    }

    public /* bridge */ cl0 G(nl0 nl0) {
        return rc9.v(nl0);
    }

    public int G0(int i) {
        int i2 = 0;
        int i3 = 1;
        switch (this.w) {
            case b85.b:
                int[] iArr = (int[]) this.x;
                if (i == 0) {
                    return J0(0);
                }
                if (i == 1) {
                    int length = iArr.length;
                    int i4 = 0;
                    while (i2 < length) {
                        int i5 = iArr[i2];
                        gv2 gv2 = gv2.h;
                        i4 ^= i5;
                        i2++;
                    }
                    return i4;
                }
                int i6 = iArr[0];
                int length2 = iArr.length;
                while (i3 < length2) {
                    i6 = ((gv2) this.y).b(i, i6) ^ iArr[i3];
                    i3++;
                }
                return i6;
            default:
                vl4 vl4 = (vl4) this.y;
                int[] iArr2 = (int[]) this.x;
                if (i == 0) {
                    return J0(0);
                }
                if (i == 1) {
                    int length3 = iArr2.length;
                    int i7 = 0;
                    while (i2 < length3) {
                        i7 = vl4.a(i7, iArr2[i2]);
                        i2++;
                    }
                    return i7;
                }
                int i8 = iArr2[0];
                int length4 = iArr2.length;
                while (i3 < length4) {
                    i8 = vl4.a(vl4.c(i, i8), iArr2[i3]);
                    i3++;
                }
                return i8;
        }
    }

    public boolean H(zw3 zw3) {
        zw3.getClass();
        if (rc9.n0(B(zw3)) != rc9.n0(V(zw3))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007f A[Catch:{ CancellationException -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0080 A[Catch:{ CancellationException -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    public Object H0(h61 h61) {
        v63 v63;
        int i;
        p81 p81;
        l43 l43;
        int i2;
        int i3;
        yl1 d;
        int i4;
        Object n;
        if (h61 instanceof v63) {
            v63 = (v63) h61;
            int i5 = v63.F;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                v63.F = i5 - Integer.MIN_VALUE;
                Object obj = v63.D;
                i = v63.F;
                p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    y53 y53 = new y53();
                    y53 y532 = (y53) this.y;
                    y53.e = y532.e;
                    y53.e(y532);
                    v63.z = 0;
                    v63.A = 0;
                    v63.F = 1;
                    obj = ((j43) this.x).a(y53, v63);
                    if (obj == p81) {
                        return p81;
                    }
                    i3 = 0;
                    i4 = 0;
                } else if (i == 1) {
                    i3 = v63.A;
                    i4 = v63.z;
                    o85.q(obj);
                } else if (i == 2) {
                    i3 = v63.A;
                    i2 = v63.z;
                    l43 = v63.B;
                    o85.q(obj);
                    yl1 d2 = ((l43) obj).d();
                    d = l43.d();
                    v63.B = null;
                    v63.C = d2;
                    v63.z = i2;
                    v63.A = i3;
                    v63.F = 3;
                    if (s0(d, v63) != p81) {
                        return p81;
                    }
                    return d2;
                } else if (i == 3) {
                    yl1 yl1 = v63.C;
                    try {
                        o85.q(obj);
                        return yl1;
                    } catch (CancellationException e) {
                        throw h49.U(e);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l43 l432 = (l43) obj;
                v63.B = l432;
                v63.z = i4;
                v63.A = i3;
                v63.F = 2;
                n = n85.n(l432, v63);
                if (n != p81) {
                    return p81;
                }
                int i6 = i4;
                l43 = l432;
                obj = n;
                i2 = i6;
                yl1 d22 = ((l43) obj).d();
                d = l43.d();
                v63.B = null;
                v63.C = d22;
                v63.z = i2;
                v63.A = i3;
                v63.F = 3;
                if (s0(d, v63) != p81) {
                }
            }
        }
        v63 = new v63(this, h61);
        Object obj2 = v63.D;
        i = v63.F;
        p81 = p81.w;
        if (i != 0) {
        }
        l43 l4322 = (l43) obj2;
        v63.B = l4322;
        v63.z = i4;
        v63.A = i3;
        v63.F = 2;
        n = n85.n(l4322, v63);
        if (n != p81) {
        }
    }

    public boolean I(zw3 zw3) {
        qo1 qo1;
        zw3.getClass();
        fu6 s = rc9.s(zw3);
        if (s != null) {
            qo1 = rc9.o(s);
        } else {
            qo1 = null;
        }
        if (qo1 != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    public CctBackendFactory I0(String str) {
        Bundle bundle;
        Map map;
        if (((Map) this.x) == null) {
            Context context = (Context) this.y;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                        if (bundle != null) {
                            Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                            map = Collections.EMPTY_MAP;
                        } else {
                            HashMap hashMap = new HashMap();
                            for (String next : bundle.keySet()) {
                                Object obj = bundle.get(next);
                                if ((obj instanceof String) && next.startsWith("backend:")) {
                                    for (String trim : ((String) obj).split(",", -1)) {
                                        String trim2 = trim.trim();
                                        if (!trim2.isEmpty()) {
                                            hashMap.put(trim2, next.substring(8));
                                        }
                                    }
                                }
                            }
                            map = hashMap;
                        }
                        this.x = map;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle != null) {
            }
            this.x = map;
        }
        String str2 = (String) ((Map) this.x).get(str);
        if (str2 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str2).asSubclass(CctBackendFactory.class).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str2 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.w("BackendRegistry", "Could not instantiate " + str2 + ".", e2);
            return null;
        } catch (InstantiationException e3) {
            Log.w("BackendRegistry", "Could not instantiate " + str2 + ".", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str2), e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str2), e5);
            return null;
        }
    }

    public /* bridge */ fu6 J(vw3 vw3) {
        return rc9.s(vw3);
    }

    public int J0(int i) {
        switch (this.w) {
            case b85.b:
                int[] iArr = (int[]) this.x;
                return iArr[(iArr.length - 1) - i];
            default:
                int[] iArr2 = (int[]) this.x;
                return iArr2[(iArr2.length - 1) - i];
        }
    }

    public boolean K(v76 v76) {
        v76.getClass();
        if (rc9.o(v76) != null) {
            return true;
        }
        return false;
    }

    public Object K0() {
        if (((AtomicBoolean) this.x).compareAndSet(false, true)) {
            return this.y;
        }
        return null;
    }

    public boolean L(v76 v76) {
        return rc9.l0(rc9.b1(v76));
    }

    public File L0() {
        if (((File) this.y) == null) {
            synchronized (this) {
                try {
                    if (((File) this.y) == null) {
                        String str = "PersistedInstallation." + ((oe2) this.x).d() + ".json";
                        oe2 oe2 = (oe2) this.x;
                        oe2.a();
                        File file = new File(oe2.a.getNoBackupFilesDir(), str);
                        this.y = file;
                        if (file.exists()) {
                            File file2 = (File) this.y;
                            return file2;
                        }
                        oe2 oe22 = (oe2) this.x;
                        oe22.a();
                        File file3 = new File(oe22.a.getFilesDir(), str);
                        if (file3.exists() && !file3.renameTo((File) this.y)) {
                            Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file3;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.y;
    }

    /* JADX WARNING: type inference failed for: r3v11, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public void M(zh0 zh0, IOException iOException) {
        Object obj;
        kk0 kk0 = (kk0) this.x;
        if (!(kk0.u() instanceof ok0)) {
            md2 md2 = (md2) this.y;
            if (iOException instanceof StreamAdapterIOException) {
                ? cause = iOException.getCause();
                if (cause != 0) {
                    iOException = cause;
                }
            } else if (iOException instanceof SocketTimeoutException) {
                String message = iOException.getMessage();
                if (message == null || !d57.x0(message, "connect", true)) {
                    iOException = a73.a(md2, iOException);
                } else {
                    cc4 cc4 = a73.a;
                    md2.getClass();
                    StringBuilder sb = new StringBuilder("Connect timeout has expired [url=");
                    sb.append((Url) md2.b);
                    sb.append(", connect_timeout=");
                    y63 y63 = (y63) md2.b();
                    if (y63 == null || (obj = y63.b) == null) {
                        obj = "unknown";
                    }
                    sb.append(obj);
                    sb.append(" ms]");
                    iOException = new ConnectTimeoutException(sb.toString(), iOException);
                }
            }
            kk0.f(new m66(iOException));
        }
    }

    public int M0() {
        int length;
        switch (this.w) {
            case b85.b:
                length = ((int[]) this.x).length;
                break;
            default:
                length = ((int[]) this.x).length;
                break;
        }
        return length - 1;
    }

    public boolean N() {
        return ((f75) this.y).N();
    }

    public gs2 O() {
        return null;
    }

    public lh4 O0() {
        return (lh4) ((ed5) this.x).getValue();
    }

    public /* bridge */ o85 P(v76 v76) {
        return rc9.U0(this, v76);
    }

    public boolean Q(long j) {
        Object obj;
        List list = (List) ((kg5) this.x).x;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (a35.i(((sk5) obj).a, j)) {
                break;
            }
            i++;
        }
        sk5 sk5 = (sk5) obj;
        if (sk5 != null) {
            return sk5.h;
        }
        return false;
    }

    public ai8 Q0(int i, g94 g94) {
        t54 t54 = (t54) this.y;
        i94 i94 = (i94) this.x;
        boolean z = i94.c;
        cz6 cz6 = i94.b;
        if (z) {
            h.s("Called while creating a loader");
            return null;
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            h94 h94 = (h94) cz6.c(i);
            if (h94 == null) {
                try {
                    i94.c = true;
                    ai8 i2 = g94.i();
                    if (i2.getClass().isMemberClass()) {
                        if (!Modifier.isStatic(i2.getClass().getModifiers())) {
                            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + i2);
                        }
                    }
                    h94 h942 = new h94(i, i2);
                    cz6.e(i, h942);
                    i94.c = false;
                    ai8 ai8 = h942.m;
                    v70 v70 = new v70(ai8, g94);
                    h942.d(t54, v70);
                    v70 v702 = h942.o;
                    if (v702 != null) {
                        h942.h(v702);
                    }
                    h942.n = t54;
                    h942.o = v70;
                    return ai8;
                } catch (Throwable th) {
                    i94.c = false;
                    throw th;
                }
            } else {
                ai8 ai82 = h94.m;
                v70 v703 = new v70(ai82, g94);
                h94.d(t54, v703);
                v70 v704 = h94.o;
                if (v704 != null) {
                    h94.h(v704);
                }
                h94.n = t54;
                h94.o = v703;
                return ai82;
            }
        } else {
            h.s("initLoader must be called on the main thread");
            return null;
        }
    }

    public /* bridge */ Collection R(v76 v76) {
        return rc9.E0(this, v76);
    }

    public void R0(g10 g10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", g10.a);
            jSONObject.put("Status", b81.B(g10.b));
            jSONObject.put("AuthToken", g10.c);
            jSONObject.put("RefreshToken", g10.d);
            jSONObject.put("TokenCreationEpochInSecs", g10.f);
            jSONObject.put("ExpiresInSecs", g10.e);
            jSONObject.put("FisError", g10.g);
            oe2 oe2 = (oe2) this.x;
            oe2.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", oe2.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(L0())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public zw3 S(zw3 zw3) {
        return rc9.z0(zw3);
    }

    public void S0() {
        ((SparseIntArray) this.y).clear();
    }

    public /* bridge */ void T(v76 v76) {
        rc9.u0(v76);
    }

    public boolean T0() {
        switch (this.w) {
            case b85.b:
                if (((int[]) this.x)[0] == 0) {
                    return true;
                }
                return false;
            default:
                if (((int[]) this.x)[0] == 0) {
                    return true;
                }
                return false;
        }
    }

    public /* bridge */ int U(xo7 xo7) {
        return rc9.B0(xo7);
    }

    public hv2 U0(int i) {
        int[] iArr = (int[]) this.x;
        gv2 gv2 = (gv2) this.y;
        if (i == 0) {
            return gv2.c;
        }
        if (i == 1) {
            return this;
        }
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = gv2.b(iArr[i2], i);
        }
        return new hv2(gv2, iArr2);
    }

    public v76 V(zw3 zw3) {
        fu6 e1;
        zw3.getClass();
        zg2 p = rc9.p(zw3);
        if (p != null && (e1 = rc9.e1(p)) != null) {
            return e1;
        }
        fu6 s = rc9.s(zw3);
        s.getClass();
        return s;
    }

    public hv2 V0(hv2 hv2) {
        vl4 vl4 = (vl4) this.y;
        if (!vl4.equals((vl4) hv2.y)) {
            h.q("ModulusPolys do not have same ModulusGF field");
            return null;
        } else if (T0() || hv2.T0()) {
            return vl4.c;
        } else {
            int[] iArr = (int[]) this.x;
            int length = iArr.length;
            int[] iArr2 = (int[]) hv2.x;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = vl4.a(iArr3[i4], vl4.c(i2, iArr2[i3]));
                }
            }
            return new hv2(vl4, iArr3);
        }
    }

    public /* bridge */ nl0 W(hu6 hu6) {
        return rc9.n(this, hu6);
    }

    public hv2 W0(int i) {
        int[] iArr = (int[]) this.x;
        vl4 vl4 = (vl4) this.y;
        if (i == 0) {
            return vl4.c;
        }
        if (i == 1) {
            return this;
        }
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = vl4.c(iArr[i2], i);
        }
        return new hv2(vl4, iArr2);
    }

    public zw3 X(ArrayList arrayList) {
        fu6 fu6;
        int size = arrayList.size();
        if (size == 0) {
            h.s("Expected some types");
            return null;
        } else if (size == 1) {
            return (du7) dt0.P0(arrayList);
        } else {
            ArrayList arrayList2 = new ArrayList(et0.e0(arrayList, 10));
            Iterator it = arrayList.iterator();
            boolean z = false;
            boolean z2 = false;
            while (it.hasNext()) {
                du7 du7 = (du7) it.next();
                if (z || gr8.N(du7)) {
                    z = true;
                } else {
                    z = false;
                }
                if (du7 instanceof fu6) {
                    fu6 = (fu6) du7;
                } else if (du7 instanceof zg2) {
                    fu6 = ((zg2) du7).x;
                    z2 = true;
                } else {
                    h.c();
                    return null;
                }
                arrayList2.add(fu6);
            }
            if (z) {
                return z62.c(x62.T, arrayList.toString());
            }
            lp7 lp7 = lp7.a;
            if (!z2) {
                return lp7.b(arrayList2);
            }
            ArrayList arrayList3 = new ArrayList(et0.e0(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(mp7.n0((du7) it2.next()));
            }
            return kl8.n(lp7.b(arrayList2), lp7.b(arrayList3));
        }
    }

    public hu6 X0(v76 v76) {
        fu6 fu6;
        qo1 o = rc9.o(v76);
        if (o == null || (fu6 = o.x) == null) {
            return (hu6) v76;
        }
        return fu6;
    }

    public /* bridge */ qo7 Y(zw3 zw3) {
        return rc9.t(zw3);
    }

    public g10 Y0() {
        JSONObject jSONObject;
        FileInputStream fileInputStream;
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(L0());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        String optString = jSONObject.optString("Fid", (String) null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", (String) null);
        String optString3 = jSONObject.optString("RefreshToken", (String) null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0);
        String optString4 = jSONObject.optString("FisError", (String) null);
        int i = g10.h;
        byte b = (byte) (((byte) (0 | 2)) | 1);
        int i2 = b81.F(5)[optInt];
        if (i2 != 0) {
            byte b2 = (byte) (((byte) (b | 2)) | 1);
            if (b2 == 3 && i2 != 0) {
                return new g10(optString, i2, optString2, optString3, optLong2, optLong, optString4);
            }
            StringBuilder sb = new StringBuilder();
            if (i2 == 0) {
                sb.append(" registrationStatus");
            }
            if ((b2 & 1) == 0) {
                sb.append(" expiresInSecs");
            }
            if ((b2 & 2) == 0) {
                sb.append(" tokenCreationEpochInSecs");
            }
            h.s(f21.i("Missing required properties:", sb));
            return null;
        }
        ku4.j("Null registrationStatus");
        return null;
        throw th;
    }

    public /* bridge */ qo7 Z(ml0 ml0) {
        return rc9.F0(ml0);
    }

    public void Z0() {
        h27 h27 = (h27) this.y;
        if (h27 != null) {
            h27.o((CancellationException) null);
        }
        this.x = new il(we.v, Float.valueOf(0.0f), (ol) null, 60);
    }

    public void a(r67 r67) {
        int i;
        hp4 hp4 = (hp4) this.x;
        hp4.a();
        mp4 mp4 = (mp4) r67.x;
        Object[] objArr = mp4.b;
        long[] jArr = mp4.c;
        int i2 = mp4.e;
        while (i2 != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i2] >> 31) & 2147483647L);
            Object obj = objArr[i2];
            Object b = ((g24) this.y).b(obj);
            int d = hp4.d(b);
            if (d >= 0) {
                i = hp4.c[d];
            } else {
                i = 0;
            }
            if (i == 7) {
                r67.remove(obj);
            } else {
                hp4.g(i + 1, b);
            }
            i2 = i3;
        }
    }

    public /* bridge */ boolean a0(v76 v76, v76 v762) {
        return rc9.Z(v76, v762);
    }

    public hv2 a1(hv2 hv2) {
        if (!((vl4) this.y).equals((vl4) hv2.y)) {
            h.q("ModulusPolys do not have same ModulusGF field");
            return null;
        } else if (hv2.T0()) {
            return this;
        } else {
            int[] iArr = (int[]) hv2.x;
            int length = iArr.length;
            int[] iArr2 = new int[length];
            int i = 0;
            while (true) {
                vl4 vl4 = (vl4) hv2.y;
                if (i >= length) {
                    return f0(new hv2(vl4, iArr2));
                }
                int i2 = iArr[i];
                vl4.getClass();
                iArr2[i] = (929 - i2) % 929;
                i++;
            }
        }
    }

    public /* bridge */ boolean b(sp7 sp7, xo7 xo7) {
        return rc9.Y(sp7, xo7);
    }

    public /* bridge */ sp7 b0(xo7 xo7, int i) {
        return rc9.Q(xo7, i);
    }

    public void b1(float f, tp1 tp1, o81 o81) {
        vr2 vr2;
        if (f > tp1.e0(1.0f)) {
            ix6 h = j45.h();
            if (h != null) {
                vr2 = h.e();
            } else {
                vr2 = null;
            }
            ix6 j = j45.j(h);
            try {
                float floatValue = ((Number) ((il) this.x).x.getValue()).floatValue();
                h27 h27 = (h27) this.y;
                if (h27 != null) {
                    h27.o((CancellationException) null);
                }
                il ilVar = (il) this.x;
                if (ilVar.B) {
                    this.x = gr8.D(ilVar, floatValue - f, 0.0f, 30);
                } else {
                    this.x = new il(we.v, Float.valueOf(-f), (ol) null, 60);
                }
                this.y = ar7.H(o81, (e81) null, (r81) null, new ot(this, (f61) null, 12), 3);
                j45.m(h, j, vr2);
            } catch (Throwable th) {
                j45.m(h, j, vr2);
                throw th;
            }
        }
    }

    public boolean c(Object obj, Object obj2) {
        g24 g24 = (g24) this.y;
        return sg3.e(g24.b(obj), g24.b(obj2));
    }

    public boolean c0(xo7 xo7, xo7 xo72) {
        xo7.getClass();
        xo72.getClass();
        if (!(xo7 instanceof wo7)) {
            h.q("Failed requirement.");
            return false;
        } else if (!(xo72 instanceof wo7)) {
            h.q("Failed requirement.");
            return false;
        } else if (rc9.k(xo7, xo72)) {
            return true;
        } else {
            wo7 wo7 = (wo7) xo7;
            wo7 wo72 = (wo7) xo72;
            Map map = (Map) this.y;
            if (((ww3) this.x).c(wo7, wo72)) {
                return true;
            }
            if (map != null) {
                wo7 wo73 = (wo7) map.get(wo7);
                wo7 wo74 = (wo7) map.get(wo72);
                if (wo73 != null && wo73.equals(wo72)) {
                    return true;
                }
                if (wo74 == null || !wo74.equals(wo7)) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    public void c1(hn4 hn4) {
        tp4 tp4 = (tp4) this.y;
        Object g = ((tp4) this.x).g(hn4);
        if (g == null) {
            return;
        }
        if (g instanceof lp4) {
            lp4 lp4 = (lp4) g;
            Object[] objArr = lp4.a;
            int i = lp4.b;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[i2];
                obj.getClass();
                co4.c(tp4, (fn4) obj, new h43(22, hn4));
            }
            return;
        }
        co4.c(tp4, (fn4) g, new h43(22, hn4));
    }

    public void cancel() {
        if (!((yt) this.x).compareAndSet(1, 1)) {
            ((g20) this.y).b();
        }
    }

    public /* bridge */ int d(zw3 zw3) {
        return rc9.l(zw3);
    }

    public boolean d0(v76 v76) {
        nl0 nl0;
        fu6 s = rc9.s(v76);
        if (s != null) {
            nl0 = rc9.n(this, X0(s));
        } else {
            nl0 = null;
        }
        if (nl0 != null) {
            return true;
        }
        return false;
    }

    public boolean e(nl0 nl0) {
        return nl0 instanceof hl0;
    }

    public boolean e0(zw3 zw3) {
        zw3.getClass();
        return zw3 instanceof v05;
    }

    public /* bridge */ boolean f(qo7 qo7) {
        return rc9.t0(qo7);
    }

    public hv2 f0(hv2 hv2) {
        vl4 vl4 = (vl4) this.y;
        if (!vl4.equals((vl4) hv2.y)) {
            h.q("ModulusPolys do not have same ModulusGF field");
            return null;
        } else if (T0()) {
            return hv2;
        } else {
            if (hv2.T0()) {
                return this;
            }
            int[] iArr = (int[]) this.x;
            int[] iArr2 = (int[]) hv2.x;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr2;
                iArr2 = iArr;
                iArr = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = vl4.a(iArr2[i - length], iArr[i]);
            }
            return new hv2(vl4, iArr4);
        }
    }

    public fv3 g() {
        throw new UnsupportedOperationException("Not supported");
    }

    public /* bridge */ void g0(v76 v76) {
        rc9.v0(v76);
    }

    public /* bridge */ v76 h(v76 v76) {
        return rc9.g1(v76, false);
    }

    public /* bridge */ bh2 h0(zw3 zw3) {
        return rc9.p(zw3);
    }

    public /* bridge */ v76 i(bh2 bh2) {
        return rc9.e1(bh2);
    }

    public xo7 i0(zw3 zw3) {
        zw3.getClass();
        v76 s = rc9.s(zw3);
        if (s == null) {
            s = B(zw3);
        }
        return rc9.b1(s);
    }

    public /* bridge */ v76 j(bh2 bh2) {
        return rc9.x0(bh2);
    }

    public /* bridge */ boolean j0(xo7 xo7) {
        return rc9.l0(xo7);
    }

    public int k(po7 po7) {
        po7.getClass();
        if (po7 instanceof v76) {
            return rc9.l((zw3) po7);
        }
        if (po7 instanceof qr) {
            return ((qr) po7).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(po7);
        h.o(sb, ", ", b26.a.b(po7.getClass()));
        return 0;
    }

    public void k0(String str, Object obj) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.y).add(f21.m(new StringBuilder(length + 1 + valueOf.length()), str, "=", valueOf));
    }

    public float l(float f, float f2) {
        int i = 0;
        float f3 = 0.0f;
        switch (this.w) {
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                float abs = Math.abs(f2);
                List list = ((s34) this.y).j().k;
                if (!list.isEmpty()) {
                    int size = list.size();
                    int size2 = list.size();
                    int i2 = 0;
                    while (i < size2) {
                        i2 += ((n34) list.get(i)).m;
                        i++;
                    }
                    i = i2 / size;
                }
                float f4 = abs - ((float) i);
                if (f4 >= 0.0f) {
                    f3 = f4;
                }
                return Math.signum(f2) * f3;
            default:
                ob5 ob5 = (ob5) this.y;
                int o = ob5.o();
                ed5 ed5 = ob5.m;
                int i3 = ((db5) ed5.getValue()).c + o;
                if (i3 == 0) {
                    return 0.0f;
                }
                int i4 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                int i5 = ob5.e;
                if (i4 < 0) {
                    i5++;
                }
                int p = z65.p(((int) (f2 / ((float) i3))) + i5, 0, ob5.n());
                ob5.o();
                int i6 = ((db5) ed5.getValue()).c;
                long j = (long) i5;
                long j2 = j - 1;
                if (j2 < 0) {
                    j2 = 0;
                }
                int i7 = (int) j2;
                long j3 = j + 1;
                if (j3 > 2147483647L) {
                    j3 = 2147483647L;
                }
                int abs2 = Math.abs((z65.p(z65.p(p, i7, (int) j3), 0, ob5.n()) - i5) * i3) - i3;
                if (abs2 >= 0) {
                    i = abs2;
                }
                if (i == 0) {
                    return (float) i;
                }
                return Math.signum(f) * ((float) i);
        }
    }

    public /* bridge */ v76 l0(v76 v76) {
        return rc9.u(v76);
    }

    public /* bridge */ jq7 m(qo7 qo7) {
        return rc9.V(qo7);
    }

    public hv2 m0(hv2 hv2) {
        gv2 gv2 = (gv2) this.y;
        if (!gv2.equals((gv2) hv2.y)) {
            h.q("GenericGFPolys do not have same GenericGF field");
            return null;
        } else if (T0()) {
            return hv2;
        } else {
            if (hv2.T0()) {
                return this;
            }
            int[] iArr = (int[]) this.x;
            int[] iArr2 = (int[]) hv2.x;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr2;
                iArr2 = iArr;
                iArr = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = iArr2[i - length] ^ iArr[i];
            }
            return new hv2(gv2, iArr4);
        }
    }

    public StackTraceElement[] n(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        a27[] a27Arr = (a27[]) this.y;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            a27 a27 = a27Arr[i];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = a27.n(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((s63) this.x).n(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    public /* bridge */ v76 n0(zw3 zw3) {
        return rc9.s(zw3);
    }

    public void o(zw3 zw3) {
        zw3.getClass();
        rc9.p(zw3);
    }

    public nl0 o0(v76 v76) {
        return rc9.n(this, X0(v76));
    }

    public /* bridge */ zw3 p(qo7 qo7) {
        return rc9.T(this, qo7);
    }

    public /* bridge */ boolean p0(xo7 xo7) {
        return rc9.f0(xo7);
    }

    public /* bridge */ boolean q(xo7 xo7) {
        return rc9.m0(xo7);
    }

    public /* bridge */ boolean q0(nl0 nl0) {
        return rc9.r0(nl0);
    }

    public /* bridge */ ml0 r(nl0 nl0) {
        return rc9.a1(nl0);
    }

    public /* bridge */ boolean r0(xo7 xo7) {
        return rc9.o0(xo7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a4, code lost:
        if (java.lang.Math.abs(r10) <= java.lang.Math.abs(r9)) goto L_0x01a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01b9  */
    public float s(float f) {
        boolean z;
        n34 n34;
        long i;
        float f2 = f;
        switch (this.w) {
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                s34 s34 = (s34) this.y;
                List list = s34.j().k;
                gx6 gx6 = (gx6) this.x;
                int size = list.size();
                float f3 = Float.NEGATIVE_INFINITY;
                float f4 = Float.POSITIVE_INFINITY;
                for (int i2 = 0; i2 < size; i2++) {
                    n34 n342 = (n34) list.get(i2);
                    if (n342 != null) {
                        n34 = n342;
                    } else {
                        n34 = null;
                    }
                    if (n34 == null || !n34.s) {
                        m34 j = s34.j();
                        if (j.o == z75.w) {
                            i = j.i() & 4294967295L;
                        } else {
                            i = j.i() >> 32;
                        }
                        int i3 = (int) i;
                        int i4 = s34.j().p;
                        int i5 = n342.m;
                        int i6 = n342.l;
                        int i7 = s34.j().n;
                        float f5 = ((float) i6) - ((float) gx6.f(i3, i5, -s34.j().l, i4));
                        if (f5 <= 0.0f && f5 > f3) {
                            f3 = f5;
                        }
                        if (f5 >= 0.0f && f5 < f4) {
                            f4 = f5;
                        }
                    }
                }
                if (Math.abs(f2) < ((m34) s34.f.getValue()).i.e0(400.0f)) {
                    z = false;
                } else if (f2 > 0.0f) {
                    z = true;
                } else {
                    z = true;
                }
                if (!z) {
                    break;
                } else if (!z) {
                    if (!z) {
                        f3 = 0.0f;
                    }
                    if (f3 == Float.POSITIVE_INFINITY || f3 == Float.NEGATIVE_INFINITY) {
                        return 0.0f;
                    }
                    return f3;
                }
                f3 = f4;
                if (f3 == Float.POSITIVE_INFINITY && f3 == Float.NEGATIVE_INFINITY) {
                }
                break;
            default:
                ob5 ob5 = (ob5) this.y;
                gx6 gx62 = ob5.m().n;
                List list2 = ob5.m().a;
                int size2 = list2.size();
                float f6 = Float.NEGATIVE_INFINITY;
                float f7 = Float.POSITIVE_INFINITY;
                for (int i8 = 0; i8 < size2; i8++) {
                    int i9 = ob5.m().d;
                    int i10 = ob5.m().b;
                    int i11 = ((ph4) list2.get(i8)).j;
                    ob5.n();
                    float f8 = ((float) i11) - ((float) gx62.f(za5.q(ob5.m()), i10, -ob5.m().f, i9));
                    if (f8 <= 0.0f && f8 > f6) {
                        f6 = f8;
                    }
                    if (f8 >= 0.0f && f8 < f7) {
                        f7 = f8;
                    }
                }
                if (f6 == Float.NEGATIVE_INFINITY) {
                    f6 = f7;
                }
                if (f7 == Float.POSITIVE_INFINITY) {
                    f7 = f6;
                }
                if (!ob5.c()) {
                    if (jb5.w(ob5, f2)) {
                        f6 = 0.0f;
                        f7 = 0.0f;
                    } else {
                        f7 = 0.0f;
                    }
                }
                if (!ob5.b()) {
                    f6 = 0.0f;
                    if (!jb5.w(ob5, f2)) {
                        f7 = 0.0f;
                    }
                }
                Float valueOf = Float.valueOf(f6);
                Float valueOf2 = Float.valueOf(f7);
                float floatValue = valueOf.floatValue();
                float floatValue2 = valueOf2.floatValue();
                float floatValue3 = ((Number) ((gc5) this.x).u(Float.valueOf(f2), Float.valueOf(floatValue), Float.valueOf(floatValue2))).floatValue();
                if (!(floatValue3 == floatValue || floatValue3 == floatValue2 || floatValue3 == 0.0f)) {
                    bc3.c("Final Snapping Offset Should Be one of " + floatValue + ", " + floatValue2 + " or 0.0");
                }
                if (floatValue3 == Float.POSITIVE_INFINITY || floatValue3 == Float.NEGATIVE_INFINITY) {
                    return 0.0f;
                }
                return floatValue3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public Object s0(yl1 yl1, h61 h61) {
        u63 u63;
        int i;
        if (h61 instanceof u63) {
            u63 = (u63) h61;
            int i2 = u63.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u63.B = i2 - Integer.MIN_VALUE;
                Object obj = u63.z;
                i = u63.B;
                if (i != 0) {
                    o85.q(obj);
                    fl3 fl3 = (fl3) r16.Q(yl1.k());
                    fl3.v0();
                    au auVar = hx1.a;
                    iz0 attributes = yl1.V().getAttributes();
                    au auVar2 = hx1.b;
                    attributes.getClass();
                    auVar2.getClass();
                    if (!attributes.c().containsKey(auVar2)) {
                        try {
                            t49.w(yl1.b());
                        } catch (Throwable unused) {
                        }
                    }
                    u63.B = 1;
                    Object j0 = fl3.j0(u63);
                    p81 p81 = p81.w;
                    if (j0 == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            }
        }
        u63 = new u63(this, h61);
        Object obj2 = u63.z;
        i = u63.B;
        if (i != 0) {
        }
        return vs7.a;
    }

    public /* bridge */ boolean t(xo7 xo7) {
        return rc9.g0(xo7);
    }

    public qo7 t0(po7 po7, int i) {
        po7.getClass();
        if (po7 instanceof hu6) {
            return rc9.K((zw3) po7, i);
        }
        if (po7 instanceof qr) {
            Object obj = ((qr) po7).get(i);
            obj.getClass();
            return (qo7) obj;
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(po7);
        h.o(sb, ", ", b26.a.b(po7.getClass()));
        return null;
    }

    public String toString() {
        switch (this.w) {
            case b85.b:
                if (T0()) {
                    return "0";
                }
                StringBuilder sb = new StringBuilder(M0() * 8);
                for (int M0 = M0(); M0 >= 0; M0--) {
                    int J0 = J0(M0);
                    if (J0 != 0) {
                        if (J0 < 0) {
                            if (M0 == M0()) {
                                sb.append("-");
                            } else {
                                sb.append(" - ");
                            }
                            J0 = -J0;
                        } else if (sb.length() > 0) {
                            sb.append(" + ");
                        }
                        if (M0 == 0 || J0 != 1) {
                            gv2 gv2 = (gv2) this.y;
                            if (J0 != 0) {
                                int i = gv2.b[J0];
                                if (i == 0) {
                                    sb.append('1');
                                } else if (i == 1) {
                                    sb.append('a');
                                } else {
                                    sb.append("a^");
                                    sb.append(i);
                                }
                            } else {
                                gv2.getClass();
                                ku4.v();
                                return null;
                            }
                        }
                        if (M0 != 0) {
                            if (M0 == 1) {
                                sb.append('x');
                            } else {
                                sb.append("x^");
                                sb.append(M0);
                            }
                        }
                    }
                }
                return sb.toString();
            case 3:
                return "HttpStatement[" + ((y53) this.y).a + ']';
            case 12:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((t54) this.y).getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}}");
                return sb2.toString();
            case h75.g:
                StringBuilder sb3 = new StringBuilder(M0() * 8);
                for (int M02 = M0(); M02 >= 0; M02--) {
                    int J02 = J0(M02);
                    if (J02 != 0) {
                        if (J02 < 0) {
                            sb3.append(" - ");
                            J02 = -J02;
                        } else if (sb3.length() > 0) {
                            sb3.append(" + ");
                        }
                        if (M02 == 0 || J02 != 1) {
                            sb3.append(J02);
                        }
                        if (M02 != 0) {
                            if (M02 == 1) {
                                sb3.append('x');
                            } else {
                                sb3.append("x^");
                                sb3.append(M02);
                            }
                        }
                    }
                }
                return sb3.toString();
            case 20:
                StringBuilder sb4 = new StringBuilder(100);
                sb4.append(this.x.getClass().getSimpleName());
                sb4.append('{');
                ArrayList arrayList = (ArrayList) this.y;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb4.append((String) arrayList.get(i2));
                    if (i2 < size - 1) {
                        sb4.append(", ");
                    }
                }
                sb4.append('}');
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    public xp0 u(gq0 gq0) {
        gq0.getClass();
        kt1 kt1 = (kt1) this.x;
        kt1.c().c.getClass();
        v16 q = b96.q((rg4) this.y, gq0, rk4.g);
        if (q == null) {
            return null;
        }
        m06.a(q.a).equals(gq0);
        return kt1.g(q);
    }

    public /* bridge */ boolean u0(xo7 xo7) {
        return rc9.h0(xo7);
    }

    public boolean v(v76 v76) {
        v76.getClass();
        if (!rc9.o0(i0(v76)) || rc9.p0(v76)) {
            return false;
        }
        return true;
    }

    public /* bridge */ qo7 v0(zw3 zw3, int i) {
        return rc9.K(zw3, i);
    }

    public boolean w(v76 v76) {
        v76.getClass();
        return rc9.g0(rc9.b1(v76));
    }

    public boolean w0(zw3 zw3) {
        zw3.getClass();
        return !sg3.e(rc9.b1(B(zw3)), rc9.b1(V(zw3)));
    }

    public qo7 x(v76 v76, int i) {
        if (i < 0 || i >= rc9.l(v76)) {
            return null;
        }
        return rc9.K(v76, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r3 < r1) goto L_0x0019;
     */
    public void x0() {
        uy3[] uy3Arr;
        eq4 eq4 = (eq4) this.y;
        Arrays.sort(eq4.w, 0, eq4.y, a91.B);
        int i = eq4.y;
        uy3[] uy3Arr2 = (uy3[]) this.x;
        if (uy3Arr2 != null) {
            int length = uy3Arr2.length;
            uy3Arr = uy3Arr2;
        }
        uy3Arr = new uy3[Math.max(16, i)];
        this.x = null;
        for (int i2 = 0; i2 < i; i2++) {
            uy3Arr[i2] = eq4.w[i2];
        }
        eq4.g();
        while (true) {
            i--;
            if (-1 < i) {
                uy3 uy3 = uy3Arr[i];
                uy3.getClass();
                if (uy3.h0) {
                    D0(uy3);
                }
                uy3Arr[i] = null;
            } else {
                this.x = uy3Arr;
                return;
            }
        }
    }

    public /* bridge */ jq7 y(sp7 sp7) {
        return rc9.W(sp7);
    }

    public /* bridge */ boolean y0(zw3 zw3) {
        return rc9.n0(zw3);
    }

    public void z(zh0 zh0, a66 a66) {
        if (!((dx5) zh0).N) {
            ((kk0) this.x).f(a66);
        }
    }

    public /* bridge */ fu6 i(bh2 bh2) {
        return rc9.e1(bh2);
    }

    public /* bridge */ fu6 j(bh2 bh2) {
        return rc9.x0(bh2);
    }

    public /* bridge */ fu6 h(v76 v76) {
        return rc9.g1(v76, true);
    }

    public void z0(v76 v76, xo7 xo7) {
    }

    public hv2(int i, Object obj) {
        this.w = i;
        switch (i) {
            case 25:
                this.y = obj;
                this.x = new AtomicBoolean(false);
                return;
            default:
                this.x = obj;
                this.y = new ArrayList();
                return;
        }
    }

    public hv2(HashMap hashMap, ww3 ww3) {
        this.w = 27;
        ww3.getClass();
        this.y = hashMap;
        this.x = ww3;
    }

    public hv2(vl4 vl4, int[] iArr) {
        this.w = 15;
        if (iArr.length != 0) {
            this.y = vl4;
            int length = iArr.length;
            int i = 1;
            if (length <= 1 || iArr[0] != 0) {
                this.x = iArr;
                return;
            }
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.x = new int[]{0};
                return;
            }
            int i2 = length - i;
            int[] iArr2 = new int[i2];
            this.x = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, i2);
            return;
        }
        ku4.v();
        throw null;
    }

    public hv2(a27[] a27Arr) {
        this.w = 14;
        this.y = a27Arr;
        this.x = new s63(3);
    }

    public hv2(uy3 uy3, lh4 lh4) {
        this.w = 5;
        this.y = uy3;
        this.x = u55.p(lh4);
    }

    public hv2(ns3 ns3) {
        this.w = 7;
        this.y = ns3;
        byte[] bArr = new byte[32];
        byte[] bArr2 = ns3.a;
        byte[] copyOf = Arrays.copyOf(bArr2, bArr2.length);
        vc1 vc1 = new vc1();
        int[] iArr = vc1.o;
        int[] iArr2 = vc1.p;
        int[] iArr3 = vc1.m;
        int[] iArr4 = vc1.l;
        try {
            Arrays.fill(iArr4, 0);
            iArr4[0] = 9;
            Arrays.fill(iArr3, 0);
            iArr3[0] = 1;
            Arrays.fill(iArr, 0);
            System.arraycopy(iArr4, 0, vc1.n, 0, iArr4.length);
            Arrays.fill(iArr2, 0);
            iArr2[0] = 1;
            vc1.d(copyOf);
            vc1.f(iArr2, iArr);
            vc1.e(iArr3, iArr3, iArr2);
            for (int i = 0; i < 32; i++) {
                int i2 = i * 8;
                int i3 = i2 % 26;
                int i4 = i2 / 26;
                if (i3 <= 18) {
                    bArr[i] = (byte) (iArr3[i4] >> i3);
                } else {
                    bArr[i] = (byte) ((iArr3[i4 + 1] << (26 - i3)) | (iArr3[i4] >> i3));
                }
            }
            vc1.c();
            this.x = new ns3(bArr);
        } catch (Throwable th) {
            vc1.c();
            throw th;
        }
    }

    public hv2(y53 y53, j43 j43) {
        this.w = 3;
        j43.getClass();
        this.y = y53;
        this.x = j43;
    }

    public hv2(ob5 ob5, gc5 gc5, gb5 gb5) {
        this.w = 28;
        this.y = ob5;
        this.x = gc5;
    }

    public hv2(g20 g20) {
        this.w = 24;
        this.y = g20;
        this.x = new AtomicInteger(0);
    }

    public hv2(md2 md2, kk0 kk0) {
        this.w = 21;
        md2.getClass();
        this.y = md2;
        this.x = kk0;
    }

    public hv2(t54 t54, z58 z58) {
        this.w = 12;
        this.y = t54;
        z58.getClass();
        gb1 gb1 = gb1.b;
        gb1.getClass();
        no7 no7 = new no7(z58, i94.d, gb1);
        gq3 b = b26.a.b(i94.class);
        String l = b.l();
        if (l != null) {
            this.x = (i94) no7.b(b, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(l));
        } else {
            h.q("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public hv2(gv2 gv2, int[] iArr) {
        this.w = 0;
        if (iArr.length != 0) {
            this.y = gv2;
            int length = iArr.length;
            int i = 1;
            if (length <= 1 || iArr[0] != 0) {
                this.x = iArr;
                return;
            }
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.x = new int[]{0};
                return;
            }
            int i2 = length - i;
            int[] iArr2 = new int[i2];
            this.x = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, i2);
            return;
        }
        ku4.v();
        throw null;
    }

    public hv2(oe2 oe2) {
        this.w = 29;
        this.x = oe2;
    }

    public hv2(Context context) {
        this.w = 13;
        this.x = null;
        this.y = context;
    }

    public hv2(Map map) {
        this.w = 19;
        this.y = map;
        this.x = new kb4("Java nullability annotation states").c(new b0(25, this));
    }

    public hv2(g24 g24) {
        this.w = 9;
        this.y = g24;
        hp4 hp4 = v25.a;
        this.x = new hp4();
    }

    public hv2(int[] iArr, int[] iArr2) {
        this.w = 8;
        this.x = iArr;
        this.y = iArr2;
    }

    public hv2(ArrayList arrayList, ArrayList arrayList2) {
        this.w = 1;
        int size = arrayList.size();
        this.x = new int[size];
        this.y = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.x)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.y)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public hv2(int i, int i2) {
        this.w = 1;
        this.x = new int[]{i, i2};
        this.y = new float[]{0.0f, 1.0f};
    }

    public hv2(int i, int i2, int i3) {
        this.w = 1;
        this.x = new int[]{i, i2, i3};
        this.y = new float[]{0.0f, 0.5f, 1.0f};
    }

    public /* synthetic */ hv2(int i, Object obj, Object obj2) {
        this.w = i;
        this.y = obj;
        this.x = obj2;
    }
}
