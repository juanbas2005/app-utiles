package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.firebase.messaging.FirebaseMessaging;
import io.github.jan.supabase.auth.user.UserSession;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.GZIPInputStream;

/* renamed from: cf4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cf4 implements ly4, y45 {
    public static cf4 A;
    public final /* synthetic */ int w;
    public Object x;
    public Object y;
    public Object z;

    public cf4(int i) {
        this.w = i;
        switch (i) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return;
            case 18:
                this.x = new AtomicReference(rd3.l);
                this.z = new Object();
                return;
            case 20:
                this.x = new kd4(8);
                return;
            case 25:
                this.x = new WeakHashMap();
                this.y = new WeakHashMap();
                this.z = new WeakHashMap();
                return;
            case 27:
                this.x = new wi8("", 0, (HashMap) null);
                this.y = new wi8("", 0, (HashMap) null);
                this.z = new ArrayList();
                return;
            default:
                long[] jArr = bg6.a;
                this.x = new tp4();
                return;
        }
    }

    public static final void a(cf4 cf4, Network network, boolean z2) {
        boolean z3;
        Network[] allNetworks = ((ConnectivityManager) cf4.x).getAllNetworks();
        int length = allNetworks.length;
        boolean z4 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Network network2 = allNetworks[i];
            if (sg3.e(network2, network)) {
                z3 = z2;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) cf4.x).getNetworkCapabilities(network2);
                if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            }
            if (z3) {
                z4 = true;
                break;
            }
            i++;
        }
        da7 da7 = (da7) cf4.y;
        synchronized (da7) {
            try {
                if (((jx5) da7.w.get()) != null) {
                    da7.A = z4;
                } else {
                    da7.b();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public static Object c(yb9 yb9) {
        try {
            return b35.c(yb9, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException e2) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e2);
        }
    }

    public static jc6 k(hc6 hc6, String str) {
        jc6 k;
        jc6 jc6 = (jc6) hc6;
        if (str.equals(jc6.c)) {
            return jc6;
        }
        for (lc6 lc6 : hc6.a()) {
            if (lc6 instanceof jc6) {
                jc6 jc62 = (jc6) lc6;
                if (str.equals(jc62.c)) {
                    return jc62;
                }
                if ((lc6 instanceof hc6) && (k = k((hc6) lc6, str)) != null) {
                    return k;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.io.BufferedInputStream} */
    /* JADX WARNING: type inference failed for: r0v0, types: [td6, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    public static cf4 n(InputStream inputStream) {
        ? obj = new Object();
        obj.a = null;
        obj.b = null;
        obj.c = false;
        obj.e = false;
        obj.f = null;
        obj.g = null;
        obj.h = false;
        obj.i = null;
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int read = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (read == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            obj.B(inputStream);
            return obj.a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    public static cf4 w(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new cf4(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public void A() {
        ((TypedArray) this.y).recycle();
    }

    public jc6 B(String str) {
        if (str != null) {
            if (str.startsWith("\"") && str.endsWith("\"")) {
                str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
            } else if (str.startsWith("'") && str.endsWith("'")) {
                str = str.substring(1, str.length() - 1).replace("\\'", "'");
            }
            String replace = str.replace("\\\n", "").replace("\\A", "\n");
            if (replace.length() > 1 && replace.startsWith("#")) {
                String substring = replace.substring(1);
                HashMap hashMap = (HashMap) this.z;
                if (substring.length() == 0) {
                    return null;
                }
                if (substring.equals(((ec6) this.x).c)) {
                    return (ec6) this.x;
                }
                if (hashMap.containsKey(substring)) {
                    return (jc6) hashMap.get(substring);
                }
                jc6 k = k((ec6) this.x, substring);
                hashMap.put(substring, k);
                return k;
            }
        }
        return null;
    }

    public Object C(UserSession userSession, f61 f61) {
        kg5 kg5 = (kg5) this.z;
        pl3 pl3 = (pl3) this.y;
        pl3.getClass();
        String d = pl3.d(UserSession.Companion.serializer(), userSession);
        Object e0 = ar7.e0((h81) kg5.y, new gv(kg5, (String) this.x, d, (f61) null, 12), (h61) f61);
        vs7 vs7 = vs7.a;
        p81 p81 = p81.w;
        if (e0 != p81) {
            e0 = vs7;
        }
        if (e0 == p81) {
            return e0;
        }
        return vs7;
    }

    public void D(Object obj) {
        long f = jb5.f();
        if (f == oh7.a) {
            this.y = obj;
            return;
        }
        synchronized (this.z) {
            kh7 kh7 = (kh7) ((AtomicReference) this.x).get();
            int a = kh7.a(f);
            if (a < 0) {
                ((AtomicReference) this.x).set(kh7.b(f, obj));
            } else {
                kh7.c[a] = obj;
            }
        }
    }

    public void E() {
        tp4 tp4 = (tp4) this.x;
        String str = (String) this.y;
        List list = (List) tp4.k(str);
        if (list != null) {
            list.remove((sr2) this.z);
        }
        if (list != null && !list.isEmpty()) {
            tp4.m(str, list);
        }
    }

    public void K(yb9 yb9) {
        switch (this.w) {
            case 28:
                String str = (String) this.y;
                ScheduledFuture scheduledFuture = (ScheduledFuture) this.z;
                zt6 zt6 = ((ha6) this.x).a;
                synchronized (zt6) {
                    zt6.remove(str);
                }
                scheduledFuture.cancel(false);
                return;
            default:
                ((ph8) this.x).removeCallbacksAndMessages((Object) null);
                xb7 xb7 = (xb7) this.y;
                if (yb9.k()) {
                    xb7.d(yb9.i());
                    return;
                } else if (yb9.d) {
                    ((yb9) ((br4) this.z).x).n((Object) null);
                    return;
                } else {
                    Exception h = yb9.h();
                    Objects.requireNonNull(h);
                    xb7.c(h);
                    return;
                }
        }
    }

    public cf4 b(String str) {
        return new cf4((ub4) this.x, str.concat((String) this.y), (vr2) new ay5(19, (Object) this));
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.w) {
            case 27:
                cf4 cf4 = new cf4(((wi8) this.x).clone());
                Iterator it = ((ArrayList) this.z).iterator();
                while (it.hasNext()) {
                    ((ArrayList) cf4.z).add(((wi8) it.next()).clone());
                }
                return cf4;
            default:
                return super.clone();
        }
    }

    public boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.x;
        for (Network networkCapabilities : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(networkCapabilities);
            if (networkCapabilities2 != null && networkCapabilities2.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    public void e(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.x;
        eu5 eu5 = new eu5(byteArrayOutputStream, hashMap, (HashMap) this.y, (q25) this.z);
        q25 q25 = (q25) hashMap.get(obj.getClass());
        if (q25 != null) {
            q25.a(obj, eu5);
            return;
        }
        Class<?> cls = obj.getClass();
        throw new RuntimeException("No encoder for " + cls);
    }

    public Object f() {
        long f = jb5.f();
        if (f == oh7.a) {
            return this.y;
        }
        kh7 kh7 = (kh7) ((AtomicReference) this.x).get();
        int a = kh7.a(f);
        if (a >= 0) {
            return kh7.c[a];
        }
        return null;
    }

    public ColorStateList g(int i) {
        int resourceId;
        ColorStateList r;
        TypedArray typedArray = (TypedArray) this.y;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (r = ag8.r((Context) this.x, resourceId)) == null) {
            return typedArray.getColorStateList(i);
        }
        return r;
    }

    public sp4 h() {
        int i;
        float f;
        int i2;
        ec6 ec6 = (ec6) this.x;
        pb6 pb6 = ec6.r;
        pb6 pb62 = ec6.s;
        if (pb6 == null || pb6.g() || (i = pb6.x) == 9 || i == 2 || i == 3) {
            return new sp4(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float c = pb6.c();
        if (pb62 == null) {
            sp4 sp4 = ((ec6) this.x).o;
            if (sp4 != null) {
                f = (sp4.e * c) / sp4.d;
            } else {
                f = c;
            }
        } else if (pb62.g() || (i2 = pb62.x) == 9 || i2 == 2 || i2 == 3) {
            return new sp4(-1.0f, -1.0f, -1.0f, -1.0f);
        } else {
            f = pb62.c();
        }
        return new sp4(0.0f, 0.0f, c, f);
    }

    public Drawable i(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.y;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return typedArray.getDrawable(i);
        }
        return rc9.N((Context) this.x, resourceId);
    }

    public Drawable j(int i) {
        int resourceId;
        Drawable d;
        if (!((TypedArray) this.y).hasValue(i) || (resourceId = ((TypedArray) this.y).getResourceId(i, 0)) == 0) {
            return null;
        }
        yo a = yo.a();
        Context context = (Context) this.x;
        synchronized (a) {
            d = a.a.d(context, resourceId, true);
        }
        return d;
    }

    public int l() {
        if (q().a.isEmpty()) {
            return -1;
        }
        long j = ((long) ((ph4) dt0.w0(q().a)).a) - ((long) q().h);
        if (j < 0) {
            j = 0;
        }
        return (int) j;
    }

    public Typeface m(int i, int i2, xp xpVar) {
        int resourceId = ((TypedArray) this.y).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.z) == null) {
            this.z = new TypedValue();
        }
        Context context = (Context) this.x;
        TypedValue typedValue = (TypedValue) this.z;
        ThreadLocal threadLocal = x56.a;
        if (context.isRestricted()) {
            return null;
        }
        return x56.a(context, resourceId, typedValue, i2, xpVar, true, false);
    }

    public boolean o() {
        return !q().a.isEmpty();
    }

    public int p() {
        if (q().a.isEmpty()) {
            return -1;
        }
        long j = ((long) ((ph4) dt0.G0(q().a)).a) + ((long) q().h);
        long t = ((long) t()) - 1;
        if (j > t) {
            j = t;
        }
        return (int) j;
    }

    public db5 q() {
        db5 db5 = (db5) this.y;
        if (db5 != null) {
            return db5;
        }
        sg3.a0("layoutInfo");
        throw null;
    }

    public int r() {
        if (q().a.isEmpty()) {
            return 0;
        }
        return Math.abs(((((ph4) dt0.G0(q().a)).j + q().b) + q().c) - q().g);
    }

    public int s() {
        int i = 0;
        if (q().a.isEmpty()) {
            return 0;
        }
        int i2 = ((ph4) dt0.w0(q().a)).j + (-q().f);
        if (i2 <= 0) {
            i = i2;
        }
        return Math.abs(i);
    }

    public void shutdown() {
        ((ConnectivityManager) this.x).unregisterNetworkCallback((db3) this.z);
    }

    public int t() {
        return ((Number) ((m24) this.x).b()).intValue();
    }

    public String toString() {
        switch (this.w) {
            case 3:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.x);
                sb.append('{');
                hv2 hv2 = (hv2) ((hv2) this.y).x;
                String str = "";
                while (hv2 != null) {
                    Object obj = hv2.y;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append(deepToString, 1, deepToString.length() - 1);
                    }
                    hv2 = (hv2) hv2.x;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 4:
                String str2 = (String) this.z;
                String str3 = (String) this.y;
                StringBuilder sb2 = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.x;
                if (uri != null) {
                    sb2.append(" uri=");
                    sb2.append(String.valueOf(uri));
                }
                if (str3 != null) {
                    sb2.append(" action=");
                    sb2.append(str3);
                }
                if (str2 != null) {
                    sb2.append(" mimetype=");
                    sb2.append(str2);
                }
                sb2.append(" }");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public boolean u() {
        if (((a37) this.x).getValue() != this.z) {
            return true;
        }
        cf4 cf4 = (cf4) this.y;
        if (cf4 == null || !cf4.u()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    public Object v(f61 f61) {
        xp6 xp6;
        int i;
        String str;
        String str2 = (String) this.x;
        if (f61 instanceof xp6) {
            xp6 = (xp6) f61;
            int i2 = xp6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xp6.B = i2 - Integer.MIN_VALUE;
                Object obj = xp6.z;
                i = xp6.B;
                if (i != 0) {
                    o85.q(obj);
                    kg5 kg5 = (kg5) this.z;
                    xp6.B = 1;
                    obj = ar7.e0((h81) kg5.y, new c97(kg5, str2, (f61) null, 0), xp6);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) obj;
                if (str == null) {
                    pl3 pl3 = (pl3) this.y;
                    pl3.getClass();
                    return pl3.b(UserSession.Companion.serializer(), str);
                }
                ta1.l("No entry with the key ", str2);
                return null;
            }
        }
        xp6 = new xp6(this, (h61) f61);
        Object obj2 = xp6.z;
        i = xp6.B;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
    }

    public void x(Activity activity, pb8 pb8) {
        WeakHashMap weakHashMap = (WeakHashMap) this.z;
        activity.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.y;
        reentrantLock.lock();
        try {
            if (!pb8.equals((pb8) weakHashMap.get(activity))) {
                pb8 pb82 = (pb8) weakHashMap.put(activity, pb8);
                reentrantLock.unlock();
                Iterator it = ((et6) ((br4) this.x).x).b.iterator();
                it.getClass();
                while (it.hasNext()) {
                    dt6 dt6 = (dt6) it.next();
                    if (dt6.a.equals(activity)) {
                        dt6.c = pb8;
                        dt6.b.accept(pb8);
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void y(String str, String str2, String str3, String str4) {
        oe2 oe2 = (oe2) this.y;
        if (str2 == null || str3 == null) {
            rf2.i("FIS auth token or FIS ID is empty");
            return;
        }
        oe2.a();
        cf2 cf2 = oe2.c;
        String str5 = cf2.h;
        oe2.a();
        String str6 = cf2.a;
        if (str5 != null) {
            URL url = new URL(f21.m(f21.o("https://fcmregistrations.googleapis.com/v1/projects/", str5, "/registrations/", str3, "/topicSubscriptions/"), str, ":", str4));
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder o = f21.o("Topic ", str4, " for: ", str, " with url: ");
                o.append(url);
                Log.d("FirebaseMessaging", o.toString());
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("x-goog-api-key", str6);
            httpURLConnection.setRequestProperty("x-goog-firebase-installations-auth", str2);
            httpURLConnection.setDoOutput(false);
            try {
                int responseCode = httpURLConnection.getResponseCode();
                httpURLConnection.disconnect();
                if (responseCode < 200 || responseCode >= 300) {
                    if (responseCode == 404 || responseCode == 403) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            StringBuilder q = b81.q("Topic ", str4, " failed: ");
                            q.append(httpURLConnection.getResponseMessage());
                            Log.d("FirebaseMessaging", q.toString());
                        }
                        StringBuilder q2 = b81.q("Topic ", str4, " failed: ");
                        q2.append(httpURLConnection.getResponseMessage());
                        throw new IOException(q2.toString());
                    } else if (responseCode >= 500) {
                        rf2.i("INTERNAL_SERVER_ERROR");
                    } else {
                        throw new IOException("Topic " + str4 + " failed with status: " + responseCode);
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", pb4.m("Topic ", str4, " for: ", str, " succeeded."));
                }
            } catch (IOException e) {
                throw new IOException("SERVICE_NOT_AVAILABLE", e);
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                throw th;
            }
        } else {
            rf2.i("Project ID or API Key is missing");
        }
    }

    public void z(j54 j54) {
        zl6 zl6 = (zl6) this.z;
        if (zl6 != null) {
            zl6.run();
        }
        zl6 zl62 = new zl6((w54) this.x, j54);
        this.z = zl62;
        ((Handler) this.y).postAtFrontOfQueue(zl62);
    }

    public cf4(wi8 wi8) {
        this.w = 27;
        this.x = wi8;
        this.y = wi8.clone();
        this.z = new ArrayList();
    }

    public cf4(ub4 ub4, String str, vr2 vr2) {
        this.w = 19;
        ub4.getClass();
        vr2.getClass();
        this.x = ub4;
        this.y = str;
        this.z = (ms3) vr2.y(ub4);
    }

    public cf4(kt1 kt1, rg4 rg4) {
        this.w = 7;
        this.x = kt1;
        this.y = rg4;
        this.z = new ConcurrentHashMap();
    }

    public cf4(by5 by5) {
        this.w = 6;
        this.x = new AtomicInteger(0);
        this.y = new o9(1);
        this.z = new qm3(10, (Object) this, (Object) by5);
    }

    public cf4(SystemForegroundService systemForegroundService) {
        this.w = 15;
        this.x = new w54(systemForegroundService, true);
        this.y = new Handler(Looper.getMainLooper());
    }

    public cf4(re3 re3, Method[] methodArr, Method method) {
        this.w = 26;
        re3.getClass();
        this.x = re3;
        this.y = methodArr;
        this.z = method;
    }

    public cf4(oe2 oe2, FirebaseMessaging firebaseMessaging, we2 we2) {
        this.w = 22;
        this.x = we2;
        this.y = oe2;
        this.z = firebaseMessaging;
    }

    public cf4(m24 m24) {
        this.w = 8;
        this.x = m24;
    }

    public cf4(wq0 wq0, List list, cf4 cf4) {
        this.w = 9;
        wq0.getClass();
        list.getClass();
        this.x = wq0;
        this.y = list;
        this.z = cf4;
    }

    public cf4(Context context, TypedArray typedArray) {
        this.w = 21;
        this.x = context;
        this.y = typedArray;
    }

    public cf4(Runnable runnable) {
        this.w = 1;
        this.y = new CopyOnWriteArrayList();
        this.z = new HashMap();
        this.x = runnable;
    }

    public cf4(Context context, LocationManager locationManager) {
        this.w = 23;
        this.z = new Object();
        this.x = context;
        this.y = locationManager;
    }

    public cf4(ConnectivityManager connectivityManager, da7 da7) {
        this.w = 12;
        this.x = connectivityManager;
        this.y = da7;
        db3 db3 = new db3(2, this);
        this.z = db3;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), db3);
    }

    public cf4(String str, int i) {
        this.w = i;
        switch (i) {
            case 16:
                try {
                    ay4 d = gw8.d();
                    km3 km3 = yp6.a;
                    km3.getClass();
                    this.x = str;
                    this.y = km3;
                    if (!str.equals("session")) {
                        String g = d.g("session");
                        String g2 = d.g(str);
                        if (g != null && g2 == null) {
                            d.t(str, g);
                            d.u("session");
                        }
                    }
                    this.z = hj8.G(d);
                    return;
                } catch (Exception unused) {
                    h.s("Failed to create default settings for SettingsSessionManager. You might have to provide a custom settings instance or a custom session manager. Learn more at https://github.com/supabase-community/supabase-kt/wiki/Session-Saving");
                    throw null;
                }
            default:
                hv2 hv2 = new hv2(16);
                this.y = hv2;
                this.z = hv2;
                this.x = str;
                return;
        }
    }

    public cf4(wq7 wq7, cf4 cf4) {
        this.w = 24;
        this.x = wq7;
        this.y = cf4;
        this.z = wq7.w;
    }

    public /* synthetic */ cf4(Object obj, Object obj2, Object obj3, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
    }

    public cf4(br4 br4) {
        this.w = 17;
        this.x = br4;
        this.y = new ReentrantLock();
        this.z = new WeakHashMap();
    }
}
