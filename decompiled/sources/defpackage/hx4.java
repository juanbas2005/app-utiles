package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import cu.lestebang.utiletecsa.feature.settings.service.SpeedOverlayService;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URI;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* renamed from: hx4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class hx4 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ hx4(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    /* JADX WARNING: type inference failed for: r3v11, types: [yb5] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x05d6 A[Catch:{ all -> 0x05c9, all -> 0x05cf, all -> 0x05d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0665 A[Catch:{ all -> 0x065e, all -> 0x0685 }] */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0688 A[SYNTHETIC, Splitter:B:323:0x0688] */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x06d9 A[SYNTHETIC, Splitter:B:347:0x06d9] */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x05d7 A[SYNTHETIC] */
    public final Object b() {
        Iterator<T> it;
        go3 go3;
        long j;
        int K0;
        Throwable th;
        go3 go32;
        c62 c62;
        Throwable th2;
        zw5 zw5;
        Throwable th3;
        Throwable th4;
        Throwable th5;
        zw5 zw52;
        Throwable th6;
        yb5 yb5;
        boolean z;
        int i;
        Throwable th7;
        RectF rectF;
        float f;
        float f2;
        yb5 yb52;
        int i2;
        int i3;
        float f3;
        float f4;
        int i4 = this.w;
        long j2 = 0;
        boolean z2 = true;
        int i5 = false;
        xf xfVar = null;
        Object obj = this.x;
        switch (i4) {
            case b85.b:
                if (((Number) ((ix4) obj).a.d()).floatValue() == 1.0f) {
                    return jx4.w;
                }
                return jx4.x;
            case 1:
                return "Unexpected end of input: yet to parse ".concat(((z15) obj).b());
            case 2:
                return ((i85) ((j85) obj)).d();
            case 3:
                return new t45((v45) obj);
            case 4:
                dc5 dc5 = (dc5) obj;
                TrustManager[] trustManagerArr = {new yr4(1)};
                SSLContext instance = SSLContext.getInstance("TLS");
                instance.init((KeyManager[]) null, trustManagerArr, new SecureRandom());
                c45 c45 = new c45();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                c45.a(30, timeUnit);
                c45.y = fg8.b(60, timeUnit);
                SSLSocketFactory socketFactory = instance.getSocketFactory();
                socketFactory.getClass();
                TrustManager trustManager = trustManagerArr[0];
                trustManager.getClass();
                c45.b(socketFactory, (X509TrustManager) trustManager);
                HostnameVerifier wr4 = new wr4(1);
                if (wr4 != c45.t) {
                    c45.C = null;
                }
                c45.t = wr4;
                c45.i = false;
                br4 br4 = dc5.c;
                br4.getClass();
                c45.k = br4;
                return new d45(c45);
            case 5:
                xd5 xd5 = (xd5) obj;
                return xd5.w.n(xd5.x);
            case 6:
                return hl6.o(new StringBuilder("Unexpected end of input: yet to parse '"), ((ih5) obj).a, '\'');
            case 7:
                zk5 zk5 = (zk5) obj;
                nl6 f5 = b85.f("kotlinx.serialization.Polymorphic", yk5.l, new ll6[0], new h43(28, zk5));
                gq3 gq3 = zk5.a;
                gq3.getClass();
                return new w51(f5, gq3);
            case 8:
                File file = (File) ((qm3) obj).b();
                String name = file.getName();
                name.getClass();
                if (d57.d1('.', name, "").equals("preferences_pb")) {
                    File absoluteFile = file.getAbsoluteFile();
                    absoluteFile.getClass();
                    return absoluteFile;
                }
                h.p(file, " does not match required extension for Preferences file: preferences_pb", "File extension for file: ");
                return null;
            case 9:
                ((q18) obj).getClass();
                UUID randomUUID = UUID.randomUUID();
                randomUUID.getClass();
                String uuid = randomUUID.toString();
                uuid.getClass();
                return uuid;
            case 10:
                return Float.valueOf(((oz5) obj).t);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                q56 q56 = (q56) obj;
                ClassLoader classLoader = q56.x;
                nd2 nd2 = q56.y;
                Enumeration<URL> resources = classLoader.getResources("");
                resources.getClass();
                ArrayList<T> list = Collections.list(resources);
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (URL next : list) {
                    next.getClass();
                    if (!sg3.e(next.getProtocol(), "file")) {
                        yb5 = null;
                    } else {
                        String str = ae5.x;
                        yb5 = new yb5(nd2, tz2.l(new File(next.toURI())));
                    }
                    if (yb5 != null) {
                        arrayList.add(yb5);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                resources2.getClass();
                ArrayList<T> list2 = Collections.list(resources2);
                list2.getClass();
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    URL url = (URL) it2.next();
                    url.getClass();
                    String url2 = url.toString();
                    url2.getClass();
                    if (k57.u0(url2, "jar:file:", false) && (K0 = d57.K0(0, 6, url2, "!")) != -1) {
                        String str2 = ae5.x;
                        ae5 l = tz2.l(new File(URI.create(url2.substring(4, K0))));
                        go3 G = nd2.G(l);
                        try {
                            long size = G.size();
                            long j3 = size - 22;
                            if (j3 >= j2) {
                                long max = Math.max(size - 65558, j2);
                                while (true) {
                                    j = j2;
                                    zw5 zw53 = new zw5(G.a(j3));
                                    try {
                                        if (zw53.k() == 101010256) {
                                            short o = zw53.o() & 65535;
                                            short o2 = zw53.o() & 65535;
                                            it = it2;
                                            long o3 = (long) (zw53.o() & 65535);
                                            go3 = G;
                                            if (o3 == ((long) (zw53.o() & 65535)) && o == 0 && o2 == 0) {
                                                try {
                                                    zw53.skip(4);
                                                    short o4 = zw53.o() & 65535;
                                                    c62 c622 = new c62(o4, o3, ((long) zw53.k()) & 4294967295L);
                                                    short s = o4;
                                                    zw53.u((long) s);
                                                    try {
                                                        zw53.close();
                                                        long j4 = j3 - 20;
                                                        if (j4 > j) {
                                                            go32 = go3;
                                                            try {
                                                                zw5 zw54 = new zw5(go32.a(j4));
                                                                try {
                                                                    if (zw54.k() == 117853008) {
                                                                        int k = zw54.k();
                                                                        long l2 = zw54.l();
                                                                        if (zw54.k() == 1 && k == 0) {
                                                                            zw52 = new zw5(go32.a(l2));
                                                                            int k2 = zw52.k();
                                                                            if (k2 == 101075792) {
                                                                                zw52.skip(12);
                                                                                int k3 = zw52.k();
                                                                                int k4 = zw52.k();
                                                                                long l3 = zw52.l();
                                                                                if (l3 == zw52.l() && k3 == 0 && k4 == 0) {
                                                                                    zw52.skip(8);
                                                                                    c62 c623 = new c62(s, l3, zw52.l());
                                                                                    try {
                                                                                        zw52.close();
                                                                                        th = null;
                                                                                    } catch (Throwable th8) {
                                                                                        th = th8;
                                                                                    }
                                                                                    c622 = c623;
                                                                                    if (th == null) {
                                                                                        throw th;
                                                                                    }
                                                                                } else {
                                                                                    throw new IOException("unsupported zip: spanned");
                                                                                }
                                                                            } else {
                                                                                throw new IOException("bad zip: expected " + ya5.i(101075792) + " but was " + ya5.i(k2));
                                                                            }
                                                                        } else {
                                                                            throw new IOException("unsupported zip: spanned");
                                                                        }
                                                                    }
                                                                } catch (Throwable th9) {
                                                                    th5 = th9;
                                                                    zw54.close();
                                                                    th4 = th5;
                                                                }
                                                                try {
                                                                    zw54.close();
                                                                    th4 = null;
                                                                } catch (Throwable th10) {
                                                                    th4 = th10;
                                                                }
                                                            } catch (Throwable th11) {
                                                                th = th11;
                                                                go3 = go32;
                                                                if (go3 != null) {
                                                                }
                                                                throw th;
                                                            }
                                                            if (th4 != null) {
                                                                throw th4;
                                                            }
                                                        } else {
                                                            go32 = go3;
                                                        }
                                                        c62 = c622;
                                                    } catch (Throwable th12) {
                                                        th = th12;
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    zw53.close();
                                                    throw th;
                                                }
                                                try {
                                                    ArrayList arrayList3 = new ArrayList();
                                                    zw5 zw55 = new zw5(go32.a(c62.b));
                                                    try {
                                                        long j5 = c62.a;
                                                        long j6 = j;
                                                        while (j6 < j5) {
                                                            wf8 q = ya5.q(zw55);
                                                            go3 = go32;
                                                            zw5 = zw55;
                                                            try {
                                                                if (q.h < c62.b) {
                                                                    ae5 ae5 = q56.A;
                                                                    if (jv2.e(q.a)) {
                                                                        arrayList3.add(q);
                                                                    }
                                                                    j6++;
                                                                    zw55 = zw5;
                                                                    go32 = go3;
                                                                } else {
                                                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                                                }
                                                            } catch (Throwable th14) {
                                                                th = th14;
                                                                th3 = th;
                                                                zw5.close();
                                                                th2 = th3;
                                                                if (th2 == null) {
                                                                }
                                                            }
                                                        }
                                                        go3 = go32;
                                                        try {
                                                            zw55.close();
                                                            th2 = null;
                                                        } catch (Throwable th15) {
                                                            th2 = th15;
                                                        }
                                                    } catch (Throwable th16) {
                                                        th = th16;
                                                        go3 = go32;
                                                        zw5 = zw55;
                                                        th3 = th;
                                                        zw5.close();
                                                        th2 = th3;
                                                        if (th2 == null) {
                                                        }
                                                    }
                                                    if (th2 == null) {
                                                        xf8 xf8 = new xf8(l, nd2, ya5.d(arrayList3));
                                                        try {
                                                            go3.close();
                                                        } catch (Throwable unused) {
                                                        }
                                                        xfVar = new yb5(xf8, q56.A);
                                                    } else {
                                                        throw th2;
                                                    }
                                                } catch (Throwable th17) {
                                                    th = th17;
                                                    go3 = go32;
                                                    th = th;
                                                    if (go3 != null) {
                                                        try {
                                                            go3.close();
                                                        } catch (Throwable th18) {
                                                            su0.b(th, th18);
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                throw new IOException("unsupported zip: spanned");
                                            }
                                        } else {
                                            Iterator<T> it3 = it2;
                                            go3 = G;
                                            zw53.close();
                                            j3--;
                                            if (j3 >= max) {
                                                it2 = it3;
                                                j2 = j;
                                                G = go3;
                                            } else {
                                                throw new IOException("not a zip: end of central directory signature not found");
                                            }
                                        }
                                    } catch (Throwable th19) {
                                        th = th19;
                                        go3 go33 = G;
                                        zw53.close();
                                        throw th;
                                    }
                                }
                            } else {
                                throw new IOException("not a zip: size=" + G.size());
                            }
                        } catch (Throwable th20) {
                            th = th20;
                            go3 = G;
                            th = th;
                            if (go3 != null) {
                            }
                            throw th;
                        }
                    } else {
                        j = j2;
                        it = it2;
                    }
                    if (xfVar != null) {
                        arrayList2.add(xfVar);
                    }
                    it2 = it;
                    j2 = j;
                    xfVar = null;
                }
                return dt0.M0(arrayList, arrayList2);
            case 12:
                return ((Callable) obj).call();
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                ((Runnable) obj).run();
                return vs7.a;
            case 14:
                y06 y06 = (y06) obj;
                Class<?> loadClass = y06.a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                loadClass.getClass();
                Method declaredMethod = loadClass.getDeclaredMethod("getWindowExtensions", (Class[]) null);
                Class<?> loadClass2 = y06.a.loadClass("androidx.window.extensions.WindowExtensions");
                loadClass2.getClass();
                declaredMethod.getClass();
                if (!declaredMethod.getReturnType().equals(loadClass2) || !Modifier.isPublic(declaredMethod.getModifiers())) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            case h75.g:
                ne6 ne6 = (ne6) obj;
                lf6 lf6 = ne6.w;
                Object obj2 = ne6.z;
                if (obj2 != null) {
                    return lf6.c(ne6, obj2);
                }
                h.q("Value should be initialized");
                return null;
            case 16:
                kg5 kg5 = ((ue6) obj).y;
                if (kg5 == null) {
                    return null;
                }
                Bundle j7 = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
                kg5.H(j7);
                if (j7.isEmpty()) {
                    return null;
                }
                return j7;
            case 17:
                return cf6.c((a68) obj);
            case 18:
                if6 if6 = (if6) obj;
                if6.k().x0(new ky5(0, if6));
                return vs7.a;
            case 19:
                ih6 ih6 = (ih6) obj;
                yf yfVar = (yf) h49.w(ih6, l95.a);
                ih6.W = yfVar;
                if (yfVar != null) {
                    xfVar = new xf(yfVar.a, yfVar.b, yfVar.c, yfVar.d);
                }
                ih6.X = xfVar;
                return vs7.a;
            case 20:
                oi6 oi6 = (oi6) obj;
                mm7 mm7 = oi6.A;
                if (mm7 != null) {
                    j2 = mm7.g();
                }
                oi6.B = j2;
                return vs7.a;
            case 21:
                return obj;
            case 22:
                nl6 nl6 = (nl6) obj;
                return Integer.valueOf(fb5.l(nl6, nl6.k));
            case 23:
                return ((as3) ((ArrayList) obj).get(0)).J();
            case 24:
                jq6 jq6 = (jq6) obj;
                ed5 ed5 = jq6.y;
                if (((wu6) ed5.getValue()).a != 9205357640488583168L && !wu6.e(((wu6) ed5.getValue()).a)) {
                    return jq6.w.c(((wu6) ed5.getValue()).a);
                }
                return null;
            case 25:
                cy6 cy6 = (cy6) obj;
                while (true) {
                    synchronized (cy6.h) {
                        try {
                            if (!cy6.a) {
                                cy6.a = z2;
                                eq4 eq4 = (eq4) cy6.g;
                                Object[] objArr = eq4.w;
                                int i6 = eq4.y;
                                int i7 = i5;
                                while (i7 < i6) {
                                    by6 by6 = (by6) objArr[i7];
                                    up4 up4 = by6.g;
                                    vr2 vr2 = by6.a;
                                    Object[] objArr2 = up4.b;
                                    long[] jArr = up4.a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i8 = i5;
                                        while (true) {
                                            long j8 = jArr[i8];
                                            if ((((~j8) << 7) & j8 & -9187201950435737472L) != -9187201950435737472L) {
                                                int i9 = 8;
                                                int i10 = 8 - ((~(i8 - length)) >>> 31);
                                                int i11 = 0;
                                                while (i11 < i10) {
                                                    if ((j8 & 255) < 128) {
                                                        i = i9;
                                                        vr2.y(objArr2[(i8 << 3) + i11]);
                                                    } else {
                                                        i = i9;
                                                    }
                                                    j8 >>= i;
                                                    i11++;
                                                    i9 = i;
                                                }
                                                if (i10 != i9) {
                                                }
                                            }
                                            if (i8 != length) {
                                                i8++;
                                            }
                                        }
                                    }
                                    up4.b();
                                    i7++;
                                    i5 = false;
                                }
                                cy6.a = i5;
                            }
                        } catch (Throwable th21) {
                            throw th21;
                        }
                    }
                    if (!cy6.c()) {
                        return vs7.a;
                    }
                    z2 = true;
                    i5 = false;
                }
            case 26:
                d37 d37 = ((SpeedOverlayService) obj).J;
                Boolean bool = Boolean.TRUE;
                d37.getClass();
                d37.l((Object) null, bool);
                return vs7.a;
            case 27:
                y57 y57 = (y57) obj;
                cx2 cx2 = y57.R;
                if (cx2 != null) {
                    return cx2;
                }
                cx2 c = ((je) rc9.P0(y57)).getGraphicsContext().c();
                y57.R = c;
                return c;
            case 28:
                k97 k97 = (k97) obj;
                u83 u83 = k97.a;
                v75 v75 = k97.b;
                ed0 k5 = u83.k();
                try {
                    cf4 n = cf4.n(k5.l0());
                    k5.close();
                    ec6 ec6 = (ec6) n.x;
                    if (ec6 != null) {
                        sp4 sp4 = ec6.o;
                        if (sp4 == null) {
                            rectF = null;
                        } else {
                            rectF = new RectF(sp4.b, sp4.c, sp4.c(), sp4.d());
                        }
                        if (rectF != null) {
                            f2 = rectF.width();
                            f = rectF.height();
                        } else if (((ec6) n.x) != null) {
                            f2 = n.h().d;
                            if (((ec6) n.x) != null) {
                                f = n.h().e;
                            } else {
                                h.q("SVG document is empty");
                                return null;
                            }
                        } else {
                            h.q("SVG document is empty");
                            return null;
                        }
                        wf6 wf6 = v75.e;
                        uu6 uu6 = v75.d;
                        if (sg3.e(uu6, uu6.c)) {
                            float f6 = 512.0f;
                            if (f2 > 0.0f) {
                                f4 = f2;
                            } else {
                                f4 = 512.0f;
                            }
                            if (f > 0.0f) {
                                f6 = f;
                            }
                            yb52 = new yb5(Float.valueOf(f4), Float.valueOf(f6));
                        } else {
                            yb52 = new yb5(Float.valueOf(rc9.Z0(uu6.a, wf6)), Float.valueOf(rc9.Z0(uu6.b, wf6)));
                        }
                        float floatValue = ((Number) yb52.w).floatValue();
                        float floatValue2 = ((Number) yb52.x).floatValue();
                        int i12 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                        if (i12 <= 0 || f <= 0.0f) {
                            int C = dh4.C(floatValue);
                            int C2 = dh4.C(floatValue2);
                            i2 = C;
                            i3 = C2;
                        } else {
                            float f7 = floatValue / f2;
                            float f8 = floatValue2 / f;
                            int ordinal = v75.e.ordinal();
                            if (ordinal == 0) {
                                f3 = Math.max(f7, f8);
                            } else if (ordinal == 1) {
                                f3 = Math.min(f7, f8);
                            } else {
                                h.c();
                                return null;
                            }
                            i2 = (int) (f3 * f2);
                            i3 = (int) (f3 * f);
                        }
                        if (rectF == null && i12 > 0 && f > 0.0f) {
                            ec6 ec62 = (ec6) n.x;
                            if (ec62 != null) {
                                ec62.o = new sp4(0.0f, 0.0f, f2, f);
                            } else {
                                h.q("SVG document is empty");
                                return null;
                            }
                        }
                        ec6 ec63 = (ec6) n.x;
                        if (ec63 != null) {
                            ec63.r = td6.s("100%");
                            ec6 ec64 = (ec6) n.x;
                            if (ec64 != null) {
                                ec64.s = td6.s("100%");
                                Bitmap.Config config = v75.b;
                                if (config == null || (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE)) {
                                    config = Bitmap.Config.ARGB_8888;
                                }
                                Bitmap createBitmap = Bitmap.createBitmap(i2, i3, config);
                                if (v75.l.w.get("coil#css") == null) {
                                    Canvas canvas = new Canvas(createBitmap);
                                    sp4 sp42 = new sp4(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
                                    kd6 kd6 = new kd6(0, false);
                                    kd6.x = canvas;
                                    kd6.y = n;
                                    ec6 ec65 = (ec6) n.x;
                                    if (ec65 == null) {
                                        Log.w("SVGAndroidRenderer", "Nothing to render. Document is empty.");
                                    } else {
                                        sp4 sp43 = ec65.o;
                                        zn5 zn5 = ec65.n;
                                        kd6.z = new id6();
                                        kd6.A = new Stack();
                                        kd6.K0((id6) kd6.z, dc6.a());
                                        id6 id6 = (id6) kd6.z;
                                        id6.f = null;
                                        id6.h = false;
                                        ((Stack) kd6.A).push(new id6(id6));
                                        kd6.C = new Stack();
                                        kd6.B = new Stack();
                                        Boolean bool2 = ec65.d;
                                        if (bool2 != null) {
                                            ((id6) kd6.z).h = bool2.booleanValue();
                                        }
                                        kd6.H0();
                                        sp4 sp44 = new sp4(sp42);
                                        pb6 pb6 = ec65.r;
                                        if (pb6 != null) {
                                            sp44.d = pb6.b(kd6, sp44.d);
                                        }
                                        pb6 pb62 = ec65.s;
                                        if (pb62 != null) {
                                            sp44.e = pb62.b(kd6, sp44.e);
                                        }
                                        kd6.v0(ec65, sp44, sp43, zn5);
                                        kd6.G0();
                                    }
                                    return new gk1(new BitmapDrawable(v75.a.getResources(), createBitmap), true);
                                }
                                ku4.a();
                                return null;
                            }
                            h.q("SVG document is empty");
                            return null;
                        }
                        h.q("SVG document is empty");
                        return null;
                    }
                    h.q("SVG document is empty");
                    return null;
                } catch (Throwable th22) {
                    ed1.i(k5, th7);
                    throw th22;
                }
            default:
                nc7 nc7 = (nc7) obj;
                nc7.Y = null;
                g75.D(nc7);
                su0.B(nc7);
                rc9.e0(nc7);
                return Boolean.TRUE;
        }
        th = th6;
        if (th == null) {
        }
    }
}
