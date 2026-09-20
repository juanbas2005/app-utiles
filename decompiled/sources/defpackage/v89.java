package defpackage;

import android.app.BroadcastOptions;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzaeh;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;

/* renamed from: v89  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v89 implements a39 {
    public static volatile v89 g0;
    public w79 A;
    public dl8 B;
    public final y89 C;
    public xz8 D;
    public u69 E;
    public final k89 F;
    public v09 G;
    public final y19 H;
    public final AtomicBoolean I = new AtomicBoolean(false);
    public boolean J;
    public long K;
    public ArrayList L;
    public final LinkedList M = new LinkedList();
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public FileLock S;
    public FileChannel T;
    public ArrayList U;
    public ArrayList V;
    public long W;
    public final HashMap X;
    public final HashMap Y;
    public final HashMap Z;
    public final HashMap a0 = new HashMap();
    public f59 b0;
    public String c0;
    public h79 d0;
    public long e0;
    public final n49 f0 = new n49(2, this);
    public final j19 w;
    public final xz8 x;
    public uq8 y;
    public f09 z;

    /* JADX WARNING: type inference failed for: r0v6, types: [z79, k89] */
    /* JADX WARNING: type inference failed for: r0v7, types: [g89, y89] */
    public v89(z49 z49) {
        this.H = y19.m(z49.x, (iv8) null, (Long) null, (Long) null);
        this.W = -1;
        this.F = new z79(this);
        ? g89 = new g89(this);
        g89.e1();
        this.C = g89;
        xz8 xz8 = new xz8(this, 0);
        xz8.e1();
        this.x = xz8;
        j19 j19 = new j19(this);
        j19.e1();
        this.w = j19;
        this.X = new HashMap();
        this.Y = new HashMap();
        this.Z = new HashMap();
        n0().l1(new m89(this, z49));
    }

    public static final boolean P(z99 z99) {
        if (!TextUtils.isEmpty(z99.x)) {
            return true;
        }
        return false;
    }

    public static final void R(g89 g89) {
        if (g89 == null) {
            h.s("Upload Component not created");
        } else if (!g89.y) {
            h.s("Component not initialized: ".concat(String.valueOf(g89.getClass())));
        }
    }

    public static final Boolean S(z99 z99) {
        Boolean bool = z99.L;
        String str = z99.Y;
        if (!TextUtils.isEmpty(str)) {
            int ordinal = ((c39) rg4.v(str).x).ordinal();
            if (ordinal == 0 || ordinal == 1) {
                return null;
            }
            if (ordinal == 2) {
                return Boolean.TRUE;
            }
            if (ordinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    public static v89 x(Context context) {
        z65.k(context);
        z65.k(context.getApplicationContext());
        if (g0 == null) {
            synchronized (v89.class) {
                try {
                    if (g0 == null) {
                        g0 = new v89(new z49(context, 2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g0;
    }

    public static final void y(f19 f19, int i, String str) {
        List g = f19.g();
        int i2 = 0;
        while (i2 < g.size()) {
            if (!"_err".equals(((n19) g.get(i2)).u())) {
                i2++;
            } else {
                return;
            }
        }
        l19 F2 = n19.F();
        F2.g("_err");
        F2.i((long) i);
        l19 F3 = n19.F();
        F3.g("_ev");
        F3.h(str);
        f19.j((n19) F2.d());
        f19.j((n19) F3.d());
    }

    public static final void z(f19 f19, String str) {
        List g = f19.g();
        for (int i = 0; i < g.size(); i++) {
            if (str.equals(((n19) g.get(i)).u())) {
                f19.l(i);
                return;
            }
        }
    }

    public final ts2 A() {
        return this.H.y;
    }

    public final int B(String str, rg4 rg4) {
        c39 g1;
        j19 j19 = this.w;
        ry8 y1 = j19.y1(str);
        f39 f39 = f39.AD_PERSONALIZATION;
        if (y1 == null) {
            rg4.w(f39, xp8.FAILSAFE);
            return 1;
        }
        uq8 uq8 = this.y;
        R(uq8);
        c09 g2 = uq8.g2(str);
        if (g2 == null || ((c39) rg4.v(g2.s()).x) != c39.POLICY || (g1 = j19.g1(str, f39)) == c39.UNINITIALIZED) {
            rg4.w(f39, xp8.REMOTE_DEFAULT);
            if (j19.x1(str, f39)) {
                return 0;
            }
        } else {
            rg4.w(f39, xp8.REMOTE_ENFORCED_DEFAULT);
            if (g1 == c39.GRANTED) {
                return 0;
            }
        }
        return 1;
    }

    public final HashMap C(h19 h19) {
        Serializable u1;
        HashMap hashMap = new HashMap();
        h0();
        HashMap hashMap2 = new HashMap();
        for (n19 n19 : h19.v()) {
            if (n19.u().startsWith("gad_") && (u1 = y89.u1(n19)) != null) {
                hashMap2.put(n19.u(), u1);
            }
        }
        for (Map.Entry entry : hashMap2.entrySet()) {
            hashMap.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return hashMap;
    }

    public final void D() {
        n0().b1();
        if (!this.M.isEmpty()) {
            if (this.d0 == null) {
                this.d0 = new h79(this, this.H, 2);
            }
            if (this.d0.c == 0) {
                Q().getClass();
                long max = Math.max(0, ((long) ((Integer) by8.A0.a((Object) null)).intValue()) - (SystemClock.elapsedRealtime() - this.e0));
                G().J.b("Scheduling notify next app runnable, delay in ms", Long.valueOf(max));
                if (this.d0 == null) {
                    this.d0 = new h79(this, this.H, 2);
                }
                this.d0.b(max);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:177:0x05a0, code lost:
        if ("_v".equals(r6.m()) != false) goto L_0x05a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x030b A[SYNTHETIC, Splitter:B:105:0x030b] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x03a4 A[Catch:{ NumberFormatException -> 0x0b24, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0401 A[Catch:{ NumberFormatException -> 0x0b24, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0405 A[Catch:{ NumberFormatException -> 0x0b24, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x046b A[Catch:{ NumberFormatException -> 0x0b24, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0492 A[Catch:{ NumberFormatException -> 0x0b24, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x049b A[Catch:{ NumberFormatException -> 0x0b24, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x04ba A[Catch:{ NumberFormatException -> 0x0b24, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x04d5 A[Catch:{ NumberFormatException -> 0x0b24, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x04e4 A[Catch:{ NumberFormatException -> 0x0b24, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0535 A[Catch:{ NumberFormatException -> 0x0b24, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0606 A[Catch:{ NumberFormatException -> 0x0b24, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x061b A[Catch:{ NumberFormatException -> 0x0b24, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0738 A[Catch:{ NumberFormatException -> 0x0b24, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0b5c A[Catch:{ NumberFormatException -> 0x0b24, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x0ba8 A[Catch:{ NumberFormatException -> 0x0b24, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x0bcb A[Catch:{ NumberFormatException -> 0x0b24, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0182 A[Catch:{ NumberFormatException -> 0x0b24, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c1 A[Catch:{ NumberFormatException -> 0x0b24, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0289 A[Catch:{ NumberFormatException -> 0x0b24, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x029d A[Catch:{ NumberFormatException -> 0x0b24, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x029e A[Catch:{ NumberFormatException -> 0x0b24, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02db A[Catch:{ NumberFormatException -> 0x0b24, all -> 0x0125 }] */
    public final boolean E(long j, String str) {
        boolean z2;
        int i;
        Long l;
        String str2;
        y19 y19;
        Long l2;
        j19 d02;
        String t;
        long j2;
        long j3;
        int i2;
        boolean z3;
        long j4;
        Long l3;
        String str3;
        String str4;
        String str5;
        String str6;
        int i3;
        int i4;
        x19 x19;
        int i5;
        boolean s1;
        boolean z4;
        String str7;
        String str8;
        int i6;
        long j1;
        int i7;
        int i8;
        int i9;
        boolean z5;
        boolean z6;
        int i10;
        boolean z7;
        l19 l19;
        String str9;
        v89 v89 = this;
        String str10 = "1";
        String str11 = "_ai";
        String str12 = "purchase";
        String str13 = "items";
        long j5 = 1L;
        v89.e0().Q1();
        rb2 rb2 = new rb2(v89);
        v89.e0().O1(str, j, v89.W, rb2);
        rb2 rb22 = rb2;
        ArrayList arrayList = (ArrayList) rb22.z;
        if (arrayList == null || arrayList.isEmpty()) {
            e0().R1();
            z2 = false;
        } else {
            x19 x192 = (x19) ((b29) rb22.x).k();
            x192.b();
            ((b29) x192.x).e0();
            int i11 = -1;
            int i12 = -1;
            int i13 = 0;
            int i14 = 0;
            boolean z8 = false;
            f19 f19 = null;
            f19 f192 = null;
            boolean z9 = false;
            while (true) {
                int size = ((ArrayList) rb22.z).size();
                i = i14;
                l = j5;
                str2 = "_et";
                y19 = v89.H;
                if (i13 >= size) {
                    break;
                }
                f19 f193 = (f19) ((h19) ((ArrayList) rb22.z).get(i13)).k();
                int i15 = i13;
                if (v89.d0().r1(((b29) rb22.x).t(), f193.m())) {
                    String str14 = str13;
                    v89.G().h1().c(pz8.k1(((b29) rb22.x).t()), y19.h().a(f193.m()), "Dropping blocked raw event. appId");
                    if (!str10.equals(v89.d0().Y(((b29) rb22.x).t(), "measurement.upload.blacklist_internal"))) {
                        if (!str10.equals(v89.d0().Y(((b29) rb22.x).t(), "measurement.upload.blacklist_public"))) {
                            if (!"_err".equals(f193.m())) {
                                v89.i0();
                                d99.u1(v89.f0, ((b29) rb22.x).t(), 11, "_ev", f193.m(), 0);
                            }
                        }
                    }
                    str3 = str10;
                    str6 = str12;
                    i14 = i;
                    i3 = i15;
                    str5 = str14;
                    str4 = str11;
                } else {
                    String str15 = str13;
                    String m = f193.m();
                    str3 = str10;
                    if (!m.equals(str12)) {
                        if (!m.equals("_iap") && !m.equals("ecommerce_purchase")) {
                            i5 = i12;
                            x19 = x192;
                            i4 = i11;
                            if (v89.c0().n1((String) null, by8.f1) && m.equals("in_app_purchase")) {
                                l19 F22 = n19.F();
                                F22.g("_ct");
                                if (!z8) {
                                    String t2 = ((b29) rb22.x).t();
                                    if (v89.O(t2, str12) && v89.O(t2, "_iap") && v89.O(t2, "ecommerce_purchase")) {
                                        str9 = "new";
                                        F22.h(str9);
                                        f193.j((n19) F22.d());
                                        z8 = true;
                                    }
                                }
                                str9 = "returning";
                                F22.h(str9);
                                f193.j((n19) F22.d());
                                z8 = true;
                            }
                            if (f193.m().equals(b35.G(str11, r16.Y, r16.T))) {
                                f193.n(str11);
                                v89.G().j1().a("Renaming ad_impression to _ai");
                                if (Log.isLoggable(v89.G().m1(), 5)) {
                                    for (int i16 = 0; i16 < f193.h(); i16++) {
                                        if ("ad_platform".equals(f193.i(i16).u()) && !f193.i(i16).w().isEmpty() && "admob".equalsIgnoreCase(f193.i(i16).w())) {
                                            v89.G().G.a("AdMob ad impression logged from app. Potentially duplicative.");
                                        }
                                    }
                                }
                            }
                            tp8 c022 = v89.c0();
                            ay8 ay82 = by8.f1;
                            if (c022.n1((String) null, ay82) && f193.m().equals("in_app_purchase")) {
                                f193.n("_iap");
                                v89.G().j1().a("Renaming in_app_purchase to _iap");
                            }
                            s1 = v89.d0().s1(((b29) rb22.x).t(), f193.m());
                            if (v89.c0().n1((String) null, ay82) && "_iap".equals(f193.m())) {
                                s1 = v89.t(f193);
                                String t32 = ((b29) rb22.x).t();
                                if ("_iap".equals(f193.m())) {
                                    v89.I(f193, "value", t32);
                                    v89.I(f193, "price", t32);
                                }
                                if (!"_iap".equals(f193.m())) {
                                    ArrayList arrayList2 = new ArrayList(f193.g());
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= arrayList2.size()) {
                                            l19 F3 = n19.F();
                                            F3.g("quantity");
                                            F3.i(1);
                                            f193.j((n19) F3.d());
                                            break;
                                        } else if ("quantity".equals(((n19) arrayList2.get(i17)).u())) {
                                            break;
                                        } else {
                                            i17++;
                                        }
                                    }
                                }
                            }
                            if (!s1) {
                                v89.h0();
                                String m2 = f193.m();
                                z65.h(m2);
                                if (m2.hashCode() != 95027 || !m2.equals("_ui")) {
                                    str7 = str11;
                                    str6 = str12;
                                    z4 = false;
                                    if (z4) {
                                        v89.t(f193);
                                    }
                                    if ("_e".equals(f193.m())) {
                                        v89.h0();
                                        if (y89.m1("_fr", (h19) f193.d()) == null) {
                                            if (f192 != null && Math.abs(f192.o() - f193.o()) <= 1000) {
                                                f19 f194 = (f19) f192.clone();
                                                if (v89.H(f193, f194)) {
                                                    x192 = x19;
                                                    int i18 = i4;
                                                    x192.V(i18, f194);
                                                    i11 = i18;
                                                    i12 = i5;
                                                    f19 = null;
                                                    f192 = null;
                                                    if (v89.c0().n1((String) null, by8.e1) && f193.t() && !f193.r()) {
                                                        j1 = v89.h0().j1(f193.u());
                                                        if (j1 != 0) {
                                                            f193.s(j1);
                                                        }
                                                        f193.b();
                                                        ((h19) f193.x).t(0);
                                                    }
                                                    if (f193.h() == 0) {
                                                        v89.h0();
                                                        Bundle l1 = y89.l1(f193.g());
                                                        int i19 = 0;
                                                        while (i19 < f193.h()) {
                                                            n19 i20 = f193.i(i19);
                                                            String str16 = str15;
                                                            if (!i20.u().equals(str16) || i20.D().isEmpty()) {
                                                                i6 = i19;
                                                                str8 = str7;
                                                                if (!i20.u().equals(str16)) {
                                                                    v89.s(f193.m(), (l19) i20.k(), l1, ((b29) rb22.x).t());
                                                                }
                                                            } else {
                                                                String t4 = ((b29) rb22.x).t();
                                                                zl8 D2 = i20.D();
                                                                Bundle[] bundleArr = new Bundle[D2.size()];
                                                                i6 = i19;
                                                                int i21 = 0;
                                                                while (i21 < D2.size()) {
                                                                    n19 n19 = (n19) D2.get(i21);
                                                                    v89.h0();
                                                                    n19 n192 = n19;
                                                                    Bundle l12 = y89.l1(n19.D());
                                                                    for (n19 k : n192.D()) {
                                                                        v89.s(f193.m(), (l19) k.k(), l12, t4);
                                                                        D2 = D2;
                                                                        str7 = str7;
                                                                    }
                                                                    bundleArr[i21] = l12;
                                                                    i21++;
                                                                    D2 = D2;
                                                                    str7 = str7;
                                                                }
                                                                str8 = str7;
                                                                l1.putParcelableArray(str16, bundleArr);
                                                            }
                                                            i19 = i6 + 1;
                                                            str7 = str8;
                                                            str15 = str16;
                                                        }
                                                        str5 = str15;
                                                        str4 = str7;
                                                        f193.b();
                                                        ((h19) f193.x).N();
                                                        y89 h0 = v89.h0();
                                                        ArrayList arrayList3 = new ArrayList();
                                                        for (String next : l1.keySet()) {
                                                            l19 F4 = n19.F();
                                                            F4.g(next);
                                                            Object obj = l1.get(next);
                                                            if (obj != null) {
                                                                h0.A1(F4, obj);
                                                                arrayList3.add((n19) F4.d());
                                                            }
                                                        }
                                                        Iterator it = arrayList3.iterator();
                                                        while (it.hasNext()) {
                                                            f193.j((n19) it.next());
                                                        }
                                                    } else {
                                                        str5 = str15;
                                                        str4 = str7;
                                                    }
                                                    i3 = i15;
                                                    ((ArrayList) rb22.z).set(i3, (h19) f193.d());
                                                    x192.W(f193);
                                                    i14 = i + 1;
                                                }
                                            }
                                            x192 = x19;
                                            f19 = f193;
                                            i11 = i4;
                                            i12 = i;
                                            j1 = v89.h0().j1(f193.u());
                                            if (j1 != 0) {
                                            }
                                            f193.b();
                                            ((h19) f193.x).t(0);
                                            if (f193.h() == 0) {
                                            }
                                            i3 = i15;
                                            ((ArrayList) rb22.z).set(i3, (h19) f193.d());
                                            x192.W(f193);
                                            i14 = i + 1;
                                        } else {
                                            x192 = x19;
                                            i7 = i4;
                                        }
                                    } else {
                                        x192 = x19;
                                        i7 = i4;
                                        if ("_vs".equals(f193.m())) {
                                            v89.h0();
                                            if (y89.m1(str2, (h19) f193.d()) == null) {
                                                if (f19 != null && Math.abs(f19.o() - f193.o()) <= 1000) {
                                                    f19 f195 = (f19) f19.clone();
                                                    if (v89.H(f195, f193)) {
                                                        i8 = i5;
                                                        x192.V(i8, f195);
                                                        i11 = i7;
                                                        f19 = null;
                                                        f192 = null;
                                                        i12 = i8;
                                                        j1 = v89.h0().j1(f193.u());
                                                        if (j1 != 0) {
                                                        }
                                                        f193.b();
                                                        ((h19) f193.x).t(0);
                                                        if (f193.h() == 0) {
                                                        }
                                                        i3 = i15;
                                                        ((ArrayList) rb22.z).set(i3, (h19) f193.d());
                                                        x192.W(f193);
                                                        i14 = i + 1;
                                                    }
                                                }
                                                i12 = i5;
                                                f192 = f193;
                                                i11 = i;
                                                j1 = v89.h0().j1(f193.u());
                                                if (j1 != 0) {
                                                }
                                                f193.b();
                                                ((h19) f193.x).t(0);
                                                if (f193.h() == 0) {
                                                }
                                                i3 = i15;
                                                ((ArrayList) rb22.z).set(i3, (h19) f193.d());
                                                x192.W(f193);
                                                i14 = i + 1;
                                            }
                                        } else {
                                            i8 = i5;
                                            if (!"_f".equals(f193.m())) {
                                            }
                                            if ("_f".equals(f193.m()) || "_v".equals(f193.m())) {
                                                int i22 = 0;
                                                while (true) {
                                                    if (i22 >= f193.h()) {
                                                        break;
                                                    }
                                                    n19 i23 = f193.i(i22);
                                                    if ("_elt".equals(i23.u())) {
                                                        f193.q(i23.y());
                                                        f193.l(i22);
                                                        break;
                                                    }
                                                    i22++;
                                                }
                                            }
                                            i11 = i7;
                                            i12 = i8;
                                            j1 = v89.h0().j1(f193.u());
                                            if (j1 != 0) {
                                            }
                                            f193.b();
                                            ((h19) f193.x).t(0);
                                            if (f193.h() == 0) {
                                            }
                                            i3 = i15;
                                            ((ArrayList) rb22.z).set(i3, (h19) f193.d());
                                            x192.W(f193);
                                            i14 = i + 1;
                                        }
                                    }
                                    i8 = i5;
                                    i11 = i7;
                                    i12 = i8;
                                    j1 = v89.h0().j1(f193.u());
                                    if (j1 != 0) {
                                    }
                                    f193.b();
                                    ((h19) f193.x).t(0);
                                    if (f193.h() == 0) {
                                    }
                                    i3 = i15;
                                    ((ArrayList) rb22.z).set(i3, (h19) f193.d());
                                    x192.W(f193);
                                    i14 = i + 1;
                                }
                            }
                            z5 = false;
                            z6 = false;
                            for (i9 = 0; i9 < f193.h(); i9++) {
                                if ("_c".equals(f193.i(i9).u())) {
                                    l19 l192 = (l19) f193.i(i9).k();
                                    l192.i(1);
                                    f193.b();
                                    ((h19) f193.x).K(i9, (n19) l192.d());
                                    z5 = true;
                                } else if ("_r".equals(f193.i(i9).u())) {
                                    l19 l193 = (l19) f193.i(i9).k();
                                    l193.i(1);
                                    f193.b();
                                    ((h19) f193.x).K(i9, (n19) l193.d());
                                    z6 = true;
                                }
                            }
                            if (!z5 || !s1) {
                                z4 = s1;
                                str7 = str11;
                                str6 = str12;
                            } else {
                                z4 = s1;
                                v89.G().j1().b("Marking event as conversion", y19.h().a(f193.m()));
                                l19 F5 = n19.F();
                                F5.g("_c");
                                str7 = str11;
                                str6 = str12;
                                F5.i(1);
                                f193.k(F5);
                            }
                            if (!z6) {
                                v89.G().j1().b("Marking event as real-time", y19.h().a(f193.m()));
                                l19 F6 = n19.F();
                                F6.g("_r");
                                F6.i(1);
                                f193.k(F6);
                            }
                            if (v89.e0().i2(v89.b(), ((b29) rb22.x).t(), false, true, false, false).e <= ((long) v89.c0().l1(((b29) rb22.x).t(), by8.p))) {
                                z(f193, "_r");
                            } else {
                                z9 = true;
                            }
                            if (d99.c2(f193.m()) && z4 && v89.e0().i2(v89.b(), ((b29) rb22.x).t(), true, false, false, false).c > ((long) v89.c0().l1(((b29) rb22.x).t(), by8.o))) {
                                v89.G().h1().b("Too many conversions. Not logging as conversion. appId", pz8.k1(((b29) rb22.x).t()));
                                z7 = false;
                                l19 = null;
                                int i242 = -1;
                                for (i10 = 0; i10 < f193.h(); i10++) {
                                    n19 i25 = f193.i(i10);
                                    if ("_c".equals(i25.u())) {
                                        l19 = (l19) i25.k();
                                        i242 = i10;
                                    } else if ("_err".equals(i25.u())) {
                                        z7 = true;
                                    }
                                }
                                if (z7) {
                                    if (l19 != null) {
                                        f193.l(i242);
                                    } else {
                                        l19 = null;
                                    }
                                }
                                if (l19 == null) {
                                    l19 l194 = (l19) l19.clone();
                                    l194.g("_err");
                                    l194.i(10);
                                    f193.b();
                                    ((h19) f193.x).K(i242, (n19) l194.d());
                                } else {
                                    v89.G().g1().b("Did not find conversion parameter. appId", pz8.k1(((b29) rb22.x).t()));
                                }
                            }
                            if (z4) {
                            }
                            if ("_e".equals(f193.m())) {
                            }
                            i8 = i5;
                            i11 = i7;
                            i12 = i8;
                            j1 = v89.h0().j1(f193.u());
                            if (j1 != 0) {
                            }
                            f193.b();
                            ((h19) f193.x).t(0);
                            if (f193.h() == 0) {
                            }
                            i3 = i15;
                            ((ArrayList) rb22.z).set(i3, (h19) f193.d());
                            x192.W(f193);
                            i14 = i + 1;
                        }
                    }
                    x19 = x192;
                    i4 = i11;
                    i5 = i12;
                    l19 F222 = n19.F();
                    F222.g("_ct");
                    if (!z8) {
                    }
                    str9 = "returning";
                    try {
                        F222.h(str9);
                        f193.j((n19) F222.d());
                        z8 = true;
                        if (f193.m().equals(b35.G(str11, r16.Y, r16.T))) {
                        }
                        tp8 c0222 = v89.c0();
                        ay8 ay822 = by8.f1;
                        f193.n("_iap");
                        v89.G().j1().a("Renaming in_app_purchase to _iap");
                        s1 = v89.d0().s1(((b29) rb22.x).t(), f193.m());
                        s1 = v89.t(f193);
                        String t322 = ((b29) rb22.x).t();
                        if ("_iap".equals(f193.m())) {
                        }
                        if (!"_iap".equals(f193.m())) {
                        }
                        if (!s1) {
                        }
                        z5 = false;
                        z6 = false;
                        while (i9 < f193.h()) {
                        }
                        if (!z5) {
                        }
                        z4 = s1;
                        str7 = str11;
                        str6 = str12;
                        if (!z6) {
                        }
                        if (v89.e0().i2(v89.b(), ((b29) rb22.x).t(), false, true, false, false).e <= ((long) v89.c0().l1(((b29) rb22.x).t(), by8.p))) {
                        }
                        v89.G().h1().b("Too many conversions. Not logging as conversion. appId", pz8.k1(((b29) rb22.x).t()));
                        z7 = false;
                        l19 = null;
                        int i2422 = -1;
                        while (i10 < f193.h()) {
                        }
                        if (z7) {
                        }
                        if (l19 == null) {
                        }
                        if (z4) {
                        }
                        if ("_e".equals(f193.m())) {
                        }
                        i8 = i5;
                        i11 = i7;
                        i12 = i8;
                        j1 = v89.h0().j1(f193.u());
                        if (j1 != 0) {
                        }
                        f193.b();
                        ((h19) f193.x).t(0);
                        if (f193.h() == 0) {
                        }
                        i3 = i15;
                        ((ArrayList) rb22.z).set(i3, (h19) f193.d());
                        x192.W(f193);
                        i14 = i + 1;
                    } catch (NumberFormatException e) {
                        ((y19) d02.w).G().h1().c(pz8.k1(t), e, "Unable to parse timezone offset. appId");
                    } catch (Throwable th) {
                        e0().S1();
                        throw th;
                    }
                }
                i13 = i3 + 1;
                str12 = str6;
                str13 = str5;
                j5 = l;
                str11 = str4;
                str10 = str3;
            }
            String str17 = str2;
            int i26 = i;
            int i27 = 0;
            long j6 = 0;
            while (i27 < i26) {
                h19 Y1 = ((b29) x192.x).Y1(i27);
                if ("_e".equals(Y1.y())) {
                    v89.h0();
                    if (y89.m1("_fr", Y1) != null) {
                        x192.X(i27);
                        i26--;
                        i27--;
                        i27++;
                    }
                }
                v89.h0();
                n19 m1 = y89.m1(str17, Y1);
                if (m1 != null) {
                    if (m1.x()) {
                        l3 = Long.valueOf(m1.y());
                    } else {
                        l3 = null;
                    }
                    if (l3 != null && l3.longValue() > 0) {
                        j6 += l3.longValue();
                    }
                }
                i27++;
            }
            v89.F(x192, j6, false);
            Iterator it2 = x192.T().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if ("_s".equals(((h19) it2.next()).y())) {
                        v89.e0().W1(x192.n(), "_se");
                        break;
                    }
                } else {
                    break;
                }
            }
            if (y89.O1("_sid", x192) >= 0) {
                v89.F(x192, j6, true);
            } else {
                int O1 = y89.O1("_se", x192);
                if (O1 >= 0) {
                    x192.b();
                    ((b29) x192.x).i0(O1);
                    v89.G().g1().b("Session engagement user property is in the bundle without session ID. appId", pz8.k1(((b29) rb22.x).t()));
                }
            }
            String t5 = ((b29) rb22.x).t();
            v89.n0().b1();
            v89.j0();
            c09 g2 = v89.e0().g2(t5);
            if (g2 == null) {
                v89.G().g1().b("Cannot fix consent fields without appInfo. appId", pz8.k1(t5));
            } else {
                v89.h(g2, x192);
            }
            String t6 = ((b29) rb22.x).t();
            v89.n0().b1();
            v89.j0();
            c09 g22 = v89.e0().g2(t6);
            if (g22 == null) {
                v89.G().h1().b("Cannot populate ad_campaign_info without appInfo. appId", pz8.k1(t6));
            } else {
                v89.i(g22, x192);
            }
            x192.b();
            ((b29) x192.x).l0(Long.MAX_VALUE);
            x192.b();
            ((b29) x192.x).m0(Long.MIN_VALUE);
            for (int i28 = 0; i28 < x192.U(); i28++) {
                h19 Y12 = ((b29) x192.x).Y1(i28);
                if (Y12.A() < ((b29) x192.x).f2()) {
                    long A2 = Y12.A();
                    x192.b();
                    ((b29) x192.x).l0(A2);
                }
                if (Y12.A() > ((b29) x192.x).h2()) {
                    long A3 = Y12.A();
                    x192.b();
                    ((b29) x192.x).m0(A3);
                }
            }
            x192.L();
            h39 h39 = h39.c;
            h39 j7 = v89.a(((b29) rb22.x).t()).j(h39.c(100, ((b29) rb22.x).y0()));
            h39 L1 = v89.e0().L1(((b29) rb22.x).t());
            v89.e0().K1(((b29) rb22.x).t(), j7);
            f39 f39 = f39.ANALYTICS_STORAGE;
            if (!j7.i(f39) && L1.i(f39)) {
                v89.e0().U1(((b29) rb22.x).t());
            } else if (j7.i(f39) && !L1.i(f39)) {
                v89.e0().V1(((b29) rb22.x).t());
            }
            f39 f392 = f39.AD_STORAGE;
            if (!j7.i(f392)) {
                x192.b();
                ((b29) x192.x).D1();
                x192.b();
                ((b29) x192.x).F1();
                x192.b();
                ((b29) x192.x).W0();
            }
            if (!j7.i(f39)) {
                x192.b();
                ((b29) x192.x).H1();
                x192.b();
                ((b29) x192.x).d1();
            }
            wo8.a();
            if (v89.c0().n1(((b29) rb22.x).t(), by8.O0)) {
                v89.i0();
                if (d99.E1((String) by8.q0.a((Object) null), ((b29) rb22.x).t()) && v89.a(((b29) rb22.x).t()).i(f392) && ((b29) rb22.x).D0()) {
                    v89.r(x192, rb22);
                }
            }
            x192.b();
            ((b29) x192.x).P1();
            x192.I(v89.g0().g1(x192.n(), x192.T(), Collections.unmodifiableList(((b29) x192.x).Z1()), Long.valueOf(((b29) x192.x).f2()), Long.valueOf(((b29) x192.x).h2()), !j7.i(f39)));
            if (v89.c0().e1(((b29) rb22.x).t())) {
                HashMap hashMap = new HashMap();
                ArrayList arrayList4 = new ArrayList();
                SecureRandom b2 = v89.i0().b2();
                int i29 = 0;
                while (i29 < x192.U()) {
                    f19 f196 = (f19) ((b29) x192.x).Y1(i29).k();
                    if (f196.m().equals("_ep")) {
                        v89.h0();
                        String str18 = (String) y89.o1("_en", (h19) f196.d());
                        qr8 qr8 = (qr8) hashMap.get(str18);
                        if (qr8 == null) {
                            uq8 e02 = v89.e0();
                            String t7 = ((b29) rb22.x).t();
                            z65.k(str18);
                            qr8 = e02.C1("events", t7, str18);
                            if (qr8 != null) {
                                hashMap.put(str18, qr8);
                            }
                        }
                        if (qr8 == null || qr8.i != null) {
                            l2 = l;
                        } else {
                            Long l4 = qr8.j;
                            if (l4 != null) {
                                if (l4.longValue() > 1) {
                                    v89.h0();
                                    y89.k1(f196, "_sr", l4);
                                }
                            }
                            Boolean bool = qr8.k;
                            if (bool == null || !bool.booleanValue()) {
                                l2 = l;
                            } else {
                                v89.h0();
                                l2 = l;
                                y89.k1(f196, "_efs", l2);
                            }
                            arrayList4.add((h19) f196.d());
                        }
                        x192.V(i29, f196);
                    } else {
                        l2 = l;
                        d02 = v89.d0();
                        t = ((b29) rb22.x).t();
                        String Y2 = d02.Y(t, "measurement.account.time_zone_offset_minutes");
                        if (!TextUtils.isEmpty(Y2)) {
                            j2 = Long.parseLong(Y2);
                            v89.i0();
                            long j82 = j2 * 60000;
                            long o3 = (f196.o() + j82) / 86400000;
                            h19 h192 = (h19) f196.d();
                            if (!TextUtils.isEmpty("_dbg")) {
                                Iterator it3 = h192.v().iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    n19 n193 = (n19) it3.next();
                                    j3 = j82;
                                    if (!"_dbg".equals(n193.u())) {
                                        j82 = j3;
                                    } else if (l2.equals(Long.valueOf(n193.y()))) {
                                        i2 = 1;
                                    }
                                }
                                if (i2 <= 0) {
                                    G().h1().c(f196.m(), Integer.valueOf(i2), "Sample rate must be positive. event, rate");
                                    arrayList4.add((h19) f196.d());
                                    x192.V(i29, f196);
                                } else {
                                    qr8 qr82 = (qr8) hashMap.get(f196.m());
                                    if (qr82 == null && (qr82 = e0().C1("events", ((b29) rb22.x).t(), f196.m())) == null) {
                                        G().h1().c(((b29) rb22.x).t(), f196.m(), "Event being bundled has no eventAggregate. appId, eventName");
                                        qr82 = new qr8(((b29) rb22.x).t(), f196.m(), 1, 1, 1, f196.o(), 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
                                    }
                                    h0();
                                    Long l5 = (Long) y89.o1("_eid", (h19) f196.d());
                                    if (l5 != null) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (i2 == 1) {
                                        arrayList4.add((h19) f196.d());
                                        if (z3 && !(qr82.i == null && qr82.j == null && qr82.k == null)) {
                                            hashMap.put(f196.m(), qr82.b((Long) null, (Long) null, (Boolean) null));
                                        }
                                        x192.V(i29, f196);
                                    } else {
                                        if (b2.nextInt(i2) == 0) {
                                            h0();
                                            Long valueOf = Long.valueOf((long) i2);
                                            y89.k1(f196, "_sr", valueOf);
                                            arrayList4.add((h19) f196.d());
                                            if (z3) {
                                                qr82 = qr82.b((Long) null, valueOf, (Boolean) null);
                                            }
                                            hashMap.put(f196.m(), new qr8(qr82.a, qr82.b, qr82.c, qr82.d, qr82.e, qr82.f, f196.o(), Long.valueOf(o3), qr82.i, qr82.j, qr82.k));
                                            l = l2;
                                        } else {
                                            Long l6 = qr82.h;
                                            if (l6 != null) {
                                                j4 = l6.longValue();
                                            } else {
                                                i0();
                                                j4 = (j3 + f196.p()) / 86400000;
                                            }
                                            if (j4 != o3) {
                                                h0();
                                                y89.k1(f196, "_efs", l2);
                                                h0();
                                                Long valueOf2 = Long.valueOf((long) i2);
                                                y89.k1(f196, "_sr", valueOf2);
                                                arrayList4.add((h19) f196.d());
                                                if (z3) {
                                                    qr82 = qr82.b((Long) null, valueOf2, Boolean.TRUE);
                                                }
                                                String m3 = f196.m();
                                                long o2 = f196.o();
                                                Long valueOf3 = Long.valueOf(o3);
                                                Long l7 = qr82.i;
                                                Long l8 = qr82.j;
                                                Boolean bool2 = qr82.k;
                                                String str19 = qr82.a;
                                                String str20 = qr82.b;
                                                l = l2;
                                                String str21 = str19;
                                                String str22 = str20;
                                                hashMap.put(m3, new qr8(str21, str22, qr82.c, qr82.d, qr82.e, qr82.f, o2, valueOf3, l7, l8, bool2));
                                            } else {
                                                l = l2;
                                                if (z3) {
                                                    hashMap.put(f196.m(), qr82.b(l5, (Long) null, (Boolean) null));
                                                    x192.V(i29, f196);
                                                    i29++;
                                                    v89 = this;
                                                }
                                            }
                                        }
                                        x192.V(i29, f196);
                                        i29++;
                                        v89 = this;
                                    }
                                }
                            }
                            j3 = j82;
                            i2 = d0().u1(((b29) rb22.x).t(), f196.m());
                            if (i2 <= 0) {
                            }
                        }
                        j2 = 0;
                        v89.i0();
                        long j822 = j2 * 60000;
                        long o32 = (f196.o() + j822) / 86400000;
                        h19 h1922 = (h19) f196.d();
                        if (!TextUtils.isEmpty("_dbg")) {
                        }
                        j3 = j822;
                        i2 = d0().u1(((b29) rb22.x).t(), f196.m());
                        if (i2 <= 0) {
                        }
                    }
                    l = l2;
                    i29++;
                    v89 = this;
                }
                if (arrayList4.size() < x192.U()) {
                    x192.b();
                    ((b29) x192.x).e0();
                    x192.b();
                    ((b29) x192.x).d0(arrayList4);
                }
                for (Map.Entry value : hashMap.entrySet()) {
                    e0().D1("events", (qr8) value.getValue());
                }
            }
            String t8 = ((b29) rb22.x).t();
            c09 g23 = e0().g2(t8);
            if (g23 == null) {
                G().g1().b("Bundling raw events w/o app info. appId", pz8.k1(((b29) rb22.x).t()));
            } else if (x192.U() > 0) {
                r19 r19 = g23.a.C;
                y19.g(r19);
                r19.b1();
                long j9 = g23.i;
                if (j9 != 0) {
                    x192.g(j9);
                } else {
                    x192.h();
                }
                r19 r192 = g23.a.C;
                y19.g(r192);
                r192.b1();
                long j10 = g23.h;
                if (j10 != 0) {
                    j9 = j10;
                }
                if (j9 != 0) {
                    x192.a0(j9);
                } else {
                    x192.b0();
                }
                g23.h((long) x192.U());
                r19 r193 = g23.a.C;
                y19.g(r193);
                r193.b1();
                x192.b();
                ((b29) x192.x).n1((int) g23.F);
                r19 r194 = g23.a.C;
                y19.g(r194);
                r194.b1();
                x192.w((int) g23.g);
                g23.M(((b29) x192.x).f2());
                g23.N(((b29) x192.x).h2());
                String v = g23.v();
                if (v != null) {
                    x192.E(v);
                } else {
                    x192.F();
                }
                e0().h2(g23, false);
            }
            if (x192.U() > 0) {
                y19.getClass();
                if (c0().n1(((b29) rb22.x).t(), by8.j1)) {
                    String n = x192.n();
                    if (!TextUtils.isEmpty(n)) {
                        c09 g24 = e0().g2(n);
                        if (g24 != null) {
                            Q().getClass();
                            long currentTimeMillis = System.currentTimeMillis();
                            r19 r195 = g24.a.C;
                            y19.g(r195);
                            r195.b1();
                            if (currentTimeMillis - g24.J >= c0().k1(n, by8.B0)) {
                                List J1 = e0().J1("");
                                if (!J1.isEmpty()) {
                                    x192.b();
                                    ((b29) x192.x).W1(J1);
                                }
                                List J12 = e0().J1(n);
                                if (!J12.isEmpty()) {
                                    x192.b();
                                    ((b29) x192.x).W1(J12);
                                }
                                g24.u(currentTimeMillis);
                                e0().h2(g24, false);
                            }
                        }
                    }
                }
                bz8 o1 = d0().o1(((b29) rb22.x).t());
                if (o1 != null) {
                    if (o1.t()) {
                        long u = o1.u();
                        x192.b();
                        ((b29) x192.x).U0(u);
                        e0().l2((b29) x192.d(), z9);
                    }
                }
                if (((b29) rb22.x).I().isEmpty()) {
                    x192.b();
                    ((b29) x192.x).U0(-1);
                } else {
                    G().h1().b("Did not find measurement config or missing version info. appId", pz8.k1(((b29) rb22.x).t()));
                }
                e0().l2((b29) x192.d(), z9);
            }
            e0().s1((ArrayList) rb22.y);
            uq8 e03 = e0();
            try {
                e03.T1().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{t8, t8});
            } catch (SQLiteException e2) {
                ((y19) e03.w).G().g1().c(pz8.k1(t8), e2, "Failed to remove unused event metadata. appId");
            }
            e0().R1();
            z2 = true;
        }
        e0().S1();
        return z2;
    }

    public final void F(x19 x19, long j, boolean z2) {
        String str;
        b99 b99;
        String str2;
        Object obj;
        if (true != z2) {
            str = "_lte";
        } else {
            str = "_se";
        }
        String str3 = str;
        uq8 uq8 = this.y;
        R(uq8);
        b99 Y1 = uq8.Y1(x19.n(), str3);
        if (Y1 == null || (obj = Y1.e) == null) {
            String n = x19.n();
            Q().getClass();
            b99 = new b99(n, "auto", str3, System.currentTimeMillis(), Long.valueOf(j));
        } else {
            String n2 = x19.n();
            Q().getClass();
            b99 = new b99(n2, "auto", str3, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
        }
        l29 E2 = m29.E();
        E2.b();
        ((m29) E2.x).G(str3);
        Q().getClass();
        long currentTimeMillis = System.currentTimeMillis();
        E2.b();
        ((m29) E2.x).F(currentTimeMillis);
        Object obj2 = b99.e;
        long longValue = ((Long) obj2).longValue();
        E2.b();
        ((m29) E2.x).J(longValue);
        m29 m29 = (m29) E2.d();
        int O1 = y89.O1(str3, x19);
        if (O1 >= 0) {
            x19.b();
            ((b29) x19.x).g0(O1, m29);
        } else {
            x19.b();
            ((b29) x19.x).h0(m29);
        }
        if (j > 0) {
            uq8 uq82 = this.y;
            R(uq82);
            uq82.X1(b99);
            if (true != z2) {
                str2 = "lifetime";
            } else {
                str2 = "session-scoped";
            }
            G().J.c(str2, obj2, "Updated engagement user property. scope, value");
        }
    }

    public final pz8 G() {
        y19 y19 = this.H;
        z65.k(y19);
        pz8 pz8 = y19.B;
        y19.g(pz8);
        return pz8;
    }

    public final boolean H(f19 f19, f19 f192) {
        String str;
        z65.f("_e".equals(f19.m()));
        h0();
        n19 m1 = y89.m1("_sc", (h19) f19.d());
        String str2 = null;
        if (m1 == null) {
            str = null;
        } else {
            str = m1.w();
        }
        h0();
        n19 m12 = y89.m1("_pc", (h19) f192.d());
        if (m12 != null) {
            str2 = m12.w();
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        z65.f("_e".equals(f19.m()));
        h0();
        n19 m13 = y89.m1("_et", (h19) f19.d());
        if (m13 == null || !m13.x() || m13.y() <= 0) {
            return true;
        }
        long y2 = m13.y();
        h0();
        n19 m14 = y89.m1("_et", (h19) f192.d());
        if (m14 != null && m14.y() > 0) {
            y2 += m14.y();
        }
        h0();
        y89.k1(f192, "_et", Long.valueOf(y2));
        h0();
        y89.k1(f19, "_fr", 1L);
        return true;
    }

    public final void I(f19 f19, String str, String str2) {
        ArrayList arrayList = new ArrayList(f19.g());
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (str.equals(((n19) arrayList.get(i)).u())) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            double C2 = f19.i(i).C() * 1000000.0d;
            if (C2 == 0.0d) {
                C2 = ((double) f19.i(i).y()) * 1000000.0d;
            }
            if (C2 > 9.223372036854776E18d || C2 < -9.223372036854776E18d) {
                G().E.c(pz8.k1(str2), Double.valueOf(C2), f21.h("Data lost. Purchase ", str, " is too big. appId"));
                return;
            }
            f19.l(i);
            l19 F2 = n19.F();
            F2.g(str);
            F2.i(Math.round(C2));
            f19.j((n19) F2.d());
        }
    }

    public final boolean J() {
        n0().b1();
        j0();
        uq8 uq8 = this.y;
        R(uq8);
        if (uq8.y1("select count(1) > 0 from raw_events", (String[]) null) != 0) {
            return true;
        }
        uq8 uq82 = this.y;
        R(uq82);
        if (!TextUtils.isEmpty(uq82.k1())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01d2  */
    public final void K() {
        boolean z2;
        long j;
        long max;
        long j2;
        int i;
        int i2;
        y89 y89 = this.C;
        n0().b1();
        j0();
        if (this.K > 0) {
            Q().getClass();
            long abs = 3600000 - Math.abs(SystemClock.elapsedRealtime() - this.K);
            if (abs > 0) {
                G().J.b("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                f0().a();
                w79 w79 = this.A;
                R(w79);
                w79.h1();
                return;
            }
            this.K = 0;
        }
        if (!this.H.c() || !J()) {
            G().J.a("Nothing to upload or uploading impossible");
            f0().a();
            w79 w792 = this.A;
            R(w792);
            w792.h1();
            return;
        }
        Q().getClass();
        long currentTimeMillis = System.currentTimeMillis();
        c0();
        long max2 = Math.max(0, ((Long) by8.O.a((Object) null)).longValue());
        uq8 uq8 = this.y;
        R(uq8);
        if (uq8.y1("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) == 0) {
            uq8 uq82 = this.y;
            R(uq82);
            if (uq82.y1("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) == 0) {
                z2 = false;
                if (!z2) {
                    String g1 = c0().g1("debug.firebase.analytics.app");
                    if (TextUtils.isEmpty(g1) || ".none.".equals(g1)) {
                        c0();
                        j = Math.max(0, ((Long) by8.I.a((Object) null)).longValue());
                    } else {
                        c0();
                        j = Math.max(0, ((Long) by8.J.a((Object) null)).longValue());
                    }
                } else {
                    c0();
                    j = Math.max(0, ((Long) by8.H.a((Object) null)).longValue());
                }
                long a4 = this.E.D.a();
                long a22 = this.E.E.a();
                uq8 uq832 = this.y;
                R(uq832);
                long z12 = uq832.z1("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
                uq8 uq842 = this.y;
                R(uq842);
                long j32 = currentTimeMillis;
                max = Math.max(z12, uq842.z1("select max(timestamp) from raw_events", (String[]) null, 0));
                if (max != 0) {
                    j2 = 0;
                } else {
                    long abs2 = j32 - Math.abs(max - j32);
                    long abs3 = j32 - Math.abs(a22 - j32);
                    long j4 = max2 + abs2;
                    long max3 = Math.max(j32 - Math.abs(a4 - j32), abs3);
                    if (z2 && max3 > 0) {
                        j4 = Math.min(abs2, max3) + j;
                    }
                    R(y89);
                    if (!y89.K1(max3, j)) {
                        j2 = max3 + j;
                    } else {
                        j2 = j4;
                    }
                    if (abs3 != 0 && abs3 >= abs2) {
                        int i3 = 0;
                        while (true) {
                            c0();
                            i = 0;
                            if (i3 >= Math.min(20, Math.max(0, ((Integer) by8.Q.a((Object) null)).intValue()))) {
                                j2 = 0;
                                break;
                            }
                            c0();
                            j2 += Math.max(0, ((Long) by8.P.a((Object) null)).longValue()) * (1 << i3);
                            if (j2 > abs3) {
                                break;
                            }
                            i3++;
                        }
                        if (j2 == 0) {
                            G().J.a("Next upload time is 0");
                            f0().a();
                            w79 w793 = this.A;
                            R(w793);
                            w793.h1();
                            return;
                        }
                        xz8 xz8 = this.x;
                        R(xz8);
                        if (xz8.g1()) {
                            long a3 = this.E.C.a();
                            c0();
                            long max4 = Math.max(0, ((Long) by8.G.a((Object) null)).longValue());
                            R(y89);
                            if (!y89.K1(a3, max4)) {
                                j2 = Math.max(j2, a3 + max4);
                            }
                            f0().a();
                            Q().getClass();
                            long currentTimeMillis2 = j2 - System.currentTimeMillis();
                            if (currentTimeMillis2 <= 0) {
                                c0();
                                currentTimeMillis2 = Math.max(0, ((Long) by8.K.a((Object) null)).longValue());
                                l09 l09 = this.E.D;
                                Q().getClass();
                                l09.b(System.currentTimeMillis());
                            }
                            G().J.b("Upload scheduled in approximately ms", Long.valueOf(currentTimeMillis2));
                            w79 w794 = this.A;
                            R(w794);
                            w794.d1();
                            y19 y19 = (y19) w794.w;
                            y19.getClass();
                            pz8 pz8 = y19.B;
                            Context context = y19.w;
                            if (!d99.X1(context)) {
                                y19.g(pz8);
                                pz8.I.a("Receiver not registered/enabled");
                            }
                            if (!d99.x1(context)) {
                                y19.g(pz8);
                                pz8.I.a("Service not registered/enabled");
                            }
                            w794.h1();
                            y19.g(pz8);
                            pz8.J.b("Scheduling upload, millis", Long.valueOf(currentTimeMillis2));
                            y19.G.getClass();
                            SystemClock.elapsedRealtime();
                            if (currentTimeMillis2 < Math.max(0, ((Long) by8.L.a((Object) null)).longValue()) && w794.g1().c == 0) {
                                w794.g1().b(currentTimeMillis2);
                            }
                            ComponentName componentName = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService");
                            int j1 = w794.j1();
                            PersistableBundle persistableBundle = new PersistableBundle();
                            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
                            JobInfo build = new JobInfo.Builder(j1, componentName).setMinimumLatency(currentTimeMillis2).setOverrideDeadline(currentTimeMillis2 + currentTimeMillis2).setExtras(persistableBundle).build();
                            Method method = qt8.a;
                            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                            jobScheduler.getClass();
                            Method method2 = qt8.a;
                            if (method2 == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
                                jobScheduler.schedule(build);
                                return;
                            }
                            Method method3 = qt8.b;
                            if (method3 != null) {
                                try {
                                    Integer num = (Integer) method3.invoke(UserHandle.class, (Object[]) null);
                                    if (num != null) {
                                        i2 = num.intValue();
                                        Integer num22 = (Integer) method2.invoke(jobScheduler, new Object[]{build, "com.google.android.gms", Integer.valueOf(i2), "UploadAlarm"});
                                        return;
                                    }
                                } catch (IllegalAccessException | InvocationTargetException e) {
                                    if (Log.isLoggable("JobSchedulerCompat", 6)) {
                                        Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                                    }
                                }
                            }
                            i2 = i;
                            try {
                                Integer num222 = (Integer) method2.invoke(jobScheduler, new Object[]{build, "com.google.android.gms", Integer.valueOf(i2), "UploadAlarm"});
                                return;
                            } catch (IllegalAccessException | InvocationTargetException e2) {
                                Log.e("UploadAlarm", "error calling scheduleAsPackage", e2);
                                jobScheduler.schedule(build);
                                return;
                            }
                        } else {
                            G().J.a("No network");
                            f09 f02 = f0();
                            v89 v89 = f02.a;
                            v89.j0();
                            v89.n0().b1();
                            if (!f02.b) {
                                v89.H.w.registerReceiver(f02, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                                xz8 xz82 = v89.x;
                                R(xz82);
                                f02.c = xz82.g1();
                                v89.G().J.b("Registering connectivity change receiver. Network connected", Boolean.valueOf(f02.c));
                                f02.b = true;
                            }
                            w79 w795 = this.A;
                            R(w795);
                            w795.h1();
                            return;
                        }
                    }
                }
                i = 0;
                if (j2 == 0) {
                }
            }
        }
        z2 = true;
        if (!z2) {
        }
        long a42 = this.E.D.a();
        long a222 = this.E.E.a();
        uq8 uq8322 = this.y;
        R(uq8322);
        long z122 = uq8322.z1("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
        uq8 uq8422 = this.y;
        R(uq8422);
        long j322 = currentTimeMillis;
        max = Math.max(z122, uq8422.z1("select max(timestamp) from raw_events", (String[]) null, 0));
        if (max != 0) {
        }
        i = 0;
        if (j2 == 0) {
        }
    }

    public final void L() {
        n0().b1();
        if (this.P || this.Q || this.R) {
            G().J.d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.P), Boolean.valueOf(this.Q), Boolean.valueOf(this.R));
            return;
        }
        G().J.a("Stopping uploading service(s)");
        ArrayList arrayList = this.L;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            ArrayList arrayList2 = this.L;
            z65.k(arrayList2);
            arrayList2.clear();
        }
    }

    public final Boolean M(c09 c09) {
        try {
            int i = (c09.Q() > -2147483648L ? 1 : (c09.Q() == -2147483648L ? 0 : -1));
            y19 y19 = this.H;
            if (i != 0) {
                if (c09.Q() == ((long) cf8.a(y19.w).c(0, c09.E()).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = cf8.a(y19.w).c(0, c09.E()).versionName;
                String O2 = c09.O();
                if (O2 != null && O2.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final z99 N(String str) {
        String str2 = str;
        uq8 uq8 = this.y;
        R(uq8);
        c09 g2 = uq8.g2(str2);
        if (g2 != null) {
            y19 y19 = g2.a;
            if (!TextUtils.isEmpty(g2.O())) {
                Boolean M2 = M(g2);
                if (M2 == null || M2.booleanValue()) {
                    String H2 = g2.H();
                    String O2 = g2.O();
                    long Q2 = g2.Q();
                    r19 r19 = y19.C;
                    y19.g(r19);
                    r19.b1();
                    long j = Q2;
                    String str3 = g2.l;
                    r19 r192 = y19.C;
                    y19.g(r192);
                    r192.b1();
                    long j2 = j;
                    long j3 = g2.m;
                    r19 r193 = y19.C;
                    y19.g(r193);
                    r193.b1();
                    long j4 = j2;
                    long j5 = g2.n;
                    r19 r194 = y19.C;
                    y19.g(r194);
                    r194.b1();
                    boolean z2 = g2.o;
                    long j6 = j4;
                    String K2 = g2.K();
                    r19 r195 = y19.C;
                    y19.g(r195);
                    r195.b1();
                    boolean z3 = g2.p;
                    Boolean x2 = g2.x();
                    long b = g2.b();
                    r19 r196 = y19.C;
                    y19.g(r196);
                    r196.b1();
                    ArrayList arrayList = g2.s;
                    String g = a(str).g();
                    boolean z4 = g2.z();
                    r19 r197 = y19.C;
                    y19.g(r197);
                    r197.b1();
                    long j7 = g2.v;
                    int i = a(str).b;
                    String str4 = m0(str).b;
                    int i2 = i;
                    r19 r198 = y19.C;
                    y19.g(r198);
                    r198.b1();
                    int i3 = g2.x;
                    r19 r199 = y19.C;
                    y19.g(r199);
                    r199.b1();
                    int i4 = i3;
                    long j8 = g2.B;
                    String D2 = g2.D();
                    String s = g2.s();
                    int t = g2.t();
                    return new z99(str, H2, O2, j6, str3, j3, j5, (String) null, z2, false, K2, 0, 0, z3, false, x2, b, (List) arrayList, g, "", (String) null, z4, j7, i2, str4, i4, j8, D2, s, 0, t, 0);
                }
                G().B.b("App version does not match; dropping. appId", pz8.k1(str2));
                return null;
            }
        }
        G().I.b("No app data available; dropping", str2);
        return null;
    }

    public final boolean O(String str, String str2) {
        uq8 uq8 = this.y;
        R(uq8);
        qr8 C1 = uq8.C1("events", str, str2);
        if (C1 == null || C1.c < 1) {
            return true;
        }
        return false;
    }

    public final xb4 Q() {
        y19 y19 = this.H;
        z65.k(y19);
        return y19.G;
    }

    public final void T() {
        n0().b1();
        j0();
        if (!this.J) {
            this.J = true;
            n0().b1();
            FileLock fileLock = this.S;
            y19 y19 = this.H;
            if (fileLock == null || !fileLock.isValid()) {
                ((y19) this.y.w).getClass();
                try {
                    FileChannel channel = new RandomAccessFile(new File(new File(y19.w.getFilesDir(), "google_app_measurement.db").getPath()), "rw").getChannel();
                    this.T = channel;
                    FileLock tryLock = channel.tryLock();
                    this.S = tryLock;
                    if (tryLock != null) {
                        G().J.a("Storage concurrent access okay");
                    } else {
                        G().B.a("Storage concurrent data access panic");
                        return;
                    }
                } catch (FileNotFoundException e) {
                    G().B.b("Failed to acquire storage lock", e);
                    return;
                } catch (IOException e2) {
                    G().B.b("Failed to access storage lock file", e2);
                    return;
                } catch (OverlappingFileLockException e3) {
                    G().E.b("Storage lock already acquired", e3);
                    return;
                }
            } else {
                G().J.a("Storage concurrent access okay");
            }
            FileChannel fileChannel = this.T;
            n0().b1();
            int i = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                G().B.a("Bad channel to read from");
            } else {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0);
                    int read = fileChannel.read(allocate);
                    if (read == 4) {
                        allocate.flip();
                        i = allocate.getInt();
                    } else if (read != -1) {
                        G().E.b("Unexpected data length. Bytes read", Integer.valueOf(read));
                    }
                } catch (IOException e4) {
                    G().B.b("Failed to read from channel", e4);
                }
            }
            vy8 l = y19.l();
            l.d1();
            int i2 = l.A;
            n0().b1();
            if (i > i2) {
                G().B.c(Integer.valueOf(i), Integer.valueOf(i2), "Panic: can't downgrade version. Previous, current version");
            } else if (i < i2) {
                FileChannel fileChannel2 = this.T;
                n0().b1();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    G().B.a("Bad channel to read from");
                } else {
                    ByteBuffer allocate2 = ByteBuffer.allocate(4);
                    allocate2.putInt(i2);
                    allocate2.flip();
                    try {
                        fileChannel2.truncate(0);
                        fileChannel2.write(allocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            G().B.b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        G().J.c(Integer.valueOf(i), Integer.valueOf(i2), "Storage version upgraded. Previous, current version");
                        return;
                    } catch (IOException e5) {
                        G().B.b("Failed to write to channel", e5);
                    }
                }
                G().B.c(Integer.valueOf(i), Integer.valueOf(i2), "Storage version upgrade failed. Previous, current version");
            }
        }
    }

    public final void U(z89 z89, z99 z99) {
        String str;
        long j;
        long j2;
        int i;
        int i2;
        z89 z892 = z89;
        z99 z992 = z99;
        n0().b1();
        j0();
        boolean P2 = P(z992);
        String str2 = z992.w;
        if (P2) {
            if (!z992.D) {
                a0(z992);
                return;
            }
            d99 i0 = i0();
            String str3 = z892.x;
            int l2 = i0.l2(str3);
            n49 n49 = this.f0;
            if (l2 != 0) {
                i0();
                c0();
                String j1 = d99.j1(24, str3, true);
                if (str3 != null) {
                    i2 = str3.length();
                } else {
                    i2 = 0;
                }
                i0();
                d99.u1(n49, z992.w, l2, "_ev", j1, i2);
                return;
            }
            int r1 = i0().r1(str3, z892.f());
            if (r1 != 0) {
                i0();
                c0();
                String j12 = d99.j1(24, str3, true);
                Object f = z892.f();
                if (f == null || (!(f instanceof String) && !(f instanceof CharSequence))) {
                    i = 0;
                } else {
                    i = f.toString().length();
                }
                i0();
                d99.u1(n49, z992.w, r1, "_ev", j12, i);
                return;
            }
            n49 n492 = n49;
            Object s1 = i0().s1(str3, z892.f());
            if (s1 != null) {
                if ("_sid".equals(str3)) {
                    long j3 = z892.y;
                    String str4 = z892.B;
                    z65.k(str2);
                    uq8 uq8 = this.y;
                    R(uq8);
                    b99 Y1 = uq8.Y1(str2, "_sno");
                    if (Y1 != null) {
                        Object obj = Y1.e;
                        if (obj instanceof Long) {
                            j2 = ((Long) obj).longValue();
                            str = "_sid";
                            U(new z89(j3, Long.valueOf(j2 + 1), "_sno", str4), z992);
                        }
                    }
                    if (Y1 != null) {
                        G().E.b("Retrieved last session number from database does not contain a valid (long) value", Y1.e);
                    }
                    uq8 uq82 = this.y;
                    R(uq82);
                    qr8 C1 = uq82.C1("events", str2, "_s");
                    if (C1 != null) {
                        mz8 mz8 = G().J;
                        str = "_sid";
                        long j4 = C1.c;
                        mz8.b("Backfill the session number. Last used session number", Long.valueOf(j4));
                        j2 = j4;
                    } else {
                        str = "_sid";
                        j2 = 0;
                    }
                    U(new z89(j3, Long.valueOf(j2 + 1), "_sno", str4), z992);
                } else {
                    str = "_sid";
                }
                z65.k(str2);
                String str5 = z892.B;
                z65.k(str5);
                b99 b99 = new b99(str2, str5, str3, z892.y, s1);
                mz8 mz82 = G().J;
                y19 y19 = this.H;
                fz8 fz8 = y19.F;
                String str6 = b99.c;
                mz82.c(fz8.c(str6), s1, "Setting user property");
                uq8 uq83 = this.y;
                R(uq83);
                uq83.Q1();
                try {
                    boolean equals = "_id".equals(str6);
                    Object obj2 = b99.e;
                    if (equals) {
                        uq8 uq84 = this.y;
                        R(uq84);
                        b99 Y12 = uq84.Y1(str2, "_id");
                        if (Y12 != null && !obj2.equals(Y12.e)) {
                            uq8 uq85 = this.y;
                            R(uq85);
                            uq85.W1(str2, "_lair");
                        }
                    }
                    a0(z992);
                    uq8 uq86 = this.y;
                    R(uq86);
                    boolean X1 = uq86.X1(b99);
                    if (str.equals(str3)) {
                        y89 y89 = this.C;
                        R(y89);
                        String str7 = z992.Q;
                        if (TextUtils.isEmpty(str7)) {
                            j = 0;
                        } else {
                            j = y89.L1(str7.getBytes(StandardCharsets.UTF_8));
                        }
                        uq8 uq87 = this.y;
                        R(uq87);
                        c09 g2 = uq87.g2(str2);
                        if (g2 != null) {
                            g2.B(j);
                            if (g2.o()) {
                                uq8 uq88 = this.y;
                                R(uq88);
                                uq88.h2(g2, false);
                            }
                        }
                    }
                    uq8 uq89 = this.y;
                    R(uq89);
                    uq89.R1();
                    if (!X1) {
                        G().B.c(y19.F.c(str6), obj2, "Too many unique user properties are set. Ignoring user property");
                        i0();
                        d99.u1(n492, str2, 9, (String) null, (String) null, 0);
                    }
                    uq8 uq810 = this.y;
                    R(uq810);
                    uq810.S1();
                } catch (Throwable th) {
                    uq8 uq811 = this.y;
                    R(uq811);
                    uq811.S1();
                    throw th;
                }
            }
        }
    }

    public final void V(String str, z99 z99) {
        long j;
        n0().b1();
        j0();
        boolean P2 = P(z99);
        String str2 = z99.w;
        if (P2) {
            if (!z99.D) {
                a0(z99);
                return;
            }
            Boolean S2 = S(z99);
            if (!"_npa".equals(str) || S2 == null) {
                mz8 mz8 = G().I;
                y19 y19 = this.H;
                mz8.b("Removing user property", y19.F.c(str));
                uq8 uq8 = this.y;
                R(uq8);
                uq8.Q1();
                try {
                    a0(z99);
                    if ("_id".equals(str)) {
                        uq8 uq82 = this.y;
                        R(uq82);
                        z65.k(str2);
                        uq82.W1(str2, "_lair");
                    }
                    uq8 uq83 = this.y;
                    R(uq83);
                    z65.k(str2);
                    uq83.W1(str2, str);
                    uq8 uq84 = this.y;
                    R(uq84);
                    uq84.R1();
                    G().I.b("User property removed", y19.F.c(str));
                    uq8 uq85 = this.y;
                    R(uq85);
                    uq85.S1();
                } catch (Throwable th) {
                    Throwable th2 = th;
                    uq8 uq86 = this.y;
                    R(uq86);
                    uq86.S1();
                    throw th2;
                }
            } else {
                G().I.a("Falling back to manifest metadata value for ad personalization");
                Q().getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (true != S2.booleanValue()) {
                    j = 0;
                } else {
                    j = 1;
                }
                U(new z89(currentTimeMillis, Long.valueOf(j), "_npa", "auto"), z99);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x02c4 A[Catch:{ RuntimeException -> 0x025d, all -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02e8 A[Catch:{ RuntimeException -> 0x025d, all -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02ff A[SYNTHETIC, Splitter:B:116:0x02ff] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0391 A[Catch:{ RuntimeException -> 0x025d, all -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03b0 A[Catch:{ RuntimeException -> 0x025d, all -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x043a A[Catch:{ RuntimeException -> 0x025d, all -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0144 A[Catch:{ RuntimeException -> 0x025d, all -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x014b A[Catch:{ RuntimeException -> 0x025d, all -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0158 A[SYNTHETIC, Splitter:B:61:0x0158] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0163 A[Catch:{ RuntimeException -> 0x025d, all -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x016f A[Catch:{ RuntimeException -> 0x025d, all -> 0x00fc }] */
    public final void W(z99 z99) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        int i;
        boolean z2;
        qr8 qr8;
        y19 y19;
        String str;
        y19 y192;
        String str2;
        String str3;
        y19 y193;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        z99 z992;
        ApplicationInfo applicationInfo2;
        long j7;
        boolean z3;
        long j8;
        long j9;
        String str4;
        long j10;
        long j11;
        z99 z993 = z99;
        y19 y194 = this.H;
        n0().b1();
        j0();
        z65.k(z993);
        boolean z4 = z993.K;
        String str5 = z993.w;
        z65.h(str5);
        if (P(z993)) {
            uq8 uq8 = this.y;
            R(uq8);
            c09 g2 = uq8.g2(str5);
            if (g2 != null && TextUtils.isEmpty(g2.H()) && !TextUtils.isEmpty(z993.x)) {
                g2.f(0);
                uq8 uq82 = this.y;
                R(uq82);
                uq82.h2(g2, false);
                j19 j19 = this.w;
                R(j19);
                j19.b1();
                j19.E.remove(str5);
            }
            if (!z993.D) {
                a0(z99);
                return;
            }
            long j12 = z993.H;
            tp8 c02 = c0();
            ay8 ay8 = by8.e1;
            if (c02.n1((String) null, ay8)) {
                j = j12;
                j2 = z993.b0;
            } else {
                j = j12;
                j2 = 0;
            }
            if (j == 0) {
                Q().getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (c0().n1((String) null, ay8)) {
                    Q().getClass();
                    j11 = SystemClock.elapsedRealtime();
                } else {
                    j11 = 0;
                }
                j4 = currentTimeMillis;
                j3 = j11;
            } else {
                j3 = j2;
                j4 = j;
            }
            int i2 = z993.I;
            if (!(i2 == 0 || i2 == 1)) {
                G().E.c(pz8.k1(str5), Integer.valueOf(i2), "Incorrect app type, assuming installed app. appId, appType");
                i2 = 0;
            }
            uq8 uq83 = this.y;
            R(uq83);
            uq83.Q1();
            try {
                uq8 uq84 = this.y;
                R(uq84);
                b99 Y1 = uq84.Y1(str5, "_npa");
                Boolean S2 = S(z993);
                if (Y1 != null) {
                    j5 = 1;
                    if (!"auto".equals(Y1.b)) {
                        j6 = j4;
                        if (!c0().n1((String) null, by8.W0)) {
                            i = i2;
                            Z(z993, z993.Z);
                        } else {
                            i = i2;
                            Z(z993, j6);
                        }
                        a0(z99);
                        uq8 uq852 = this.y;
                        if (i != 0) {
                            R(uq852);
                            qr8 = uq852.C1("events", str5, "_f");
                            z2 = false;
                        } else {
                            R(uq852);
                            qr8 = uq852.C1("events", str5, "_v");
                            z2 = true;
                        }
                        if (qr8 != null) {
                            long j13 = ((j6 / 3600000) + j5) * 3600000;
                            boolean z5 = z4;
                            if (!z2) {
                                Long valueOf = Long.valueOf(j13);
                                long j14 = j6;
                                U(new z89(j14, valueOf, "_fot", "auto"), z993);
                                n0().b1();
                                v09 v09 = this.G;
                                z65.k(v09);
                                y19 = v09.w;
                                if (str5 != null) {
                                    if (!str5.isEmpty()) {
                                        str3 = "_et";
                                        r19 r19 = y19.C;
                                        pz8 pz8 = y19.B;
                                        str2 = "_elt";
                                        Context context = y19.w;
                                        y19.g(r19);
                                        r19.b1();
                                        if (!v09.b()) {
                                            y19.g(pz8);
                                            pz8.H.a("Install Referrer Reporter is not available");
                                            y192 = y194;
                                            str = str5;
                                        } else {
                                            t09 t09 = new t09(v09, str5);
                                            v09 v092 = v09;
                                            r19 r192 = y19.C;
                                            y19.g(r192);
                                            r192.b1();
                                            y192 = y194;
                                            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                            str = str5;
                                            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                            PackageManager packageManager = context.getPackageManager();
                                            if (packageManager == null) {
                                                y19.g(pz8);
                                                pz8.F.a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                            } else {
                                                List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                                                    y19.g(pz8);
                                                    pz8.H.a("Play Service for fetching Install Referrer is unavailable on device");
                                                } else {
                                                    ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                                    if (serviceInfo != null) {
                                                        String str6 = serviceInfo.packageName;
                                                        if (serviceInfo.name == null || !"com.android.vending".equals(str6) || !v092.b()) {
                                                            y19.g(pz8);
                                                            pz8.E.a("Play Store version 8.3.73 or higher required for Install Referrer");
                                                        } else {
                                                            boolean a = q11.b().a(context, new Intent(intent), t09, 1);
                                                            y19.g(pz8);
                                                            mz8 mz8 = pz8.J;
                                                            if (a) {
                                                                str4 = "available";
                                                            } else {
                                                                str4 = "not available";
                                                            }
                                                            mz8.b("Install Referrer Service is", str4);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        n0().b1();
                                        j0();
                                        Bundle bundle2 = new Bundle();
                                        long j152 = j5;
                                        bundle2.putLong("_c", j152);
                                        bundle2.putLong("_r", j152);
                                        bundle2.putLong("_uwa", 0);
                                        bundle2.putLong("_pfo", 0);
                                        bundle2.putLong("_sys", 0);
                                        bundle2.putLong("_sysu", 0);
                                        bundle2.putLong(str3, j152);
                                        if (z5) {
                                            bundle2.putLong("_dac", j152);
                                        }
                                        z65.k(str);
                                        uq8 uq862 = this.y;
                                        R(uq862);
                                        z65.h(str);
                                        uq862.b1();
                                        uq862.d1();
                                        String str72 = str;
                                        long q12 = uq862.q1(str72);
                                        y193 = y192;
                                        if (y193.w.getPackageManager() != null) {
                                            G().B.b("PackageManager is null, first open report might be inaccurate. appId", pz8.k1(str72));
                                            z992 = z99;
                                        } else {
                                            try {
                                                packageInfo = cf8.a(y193.w).c(0, str72);
                                            } catch (PackageManager.NameNotFoundException e) {
                                                G().B.c(pz8.k1(str72), e, "Package info is null, first open report might be inaccurate. appId");
                                                packageInfo = null;
                                            }
                                            if (packageInfo != null) {
                                                long j16 = packageInfo.firstInstallTime;
                                                if (j16 != 0) {
                                                    if (j16 != packageInfo.lastUpdateTime) {
                                                        applicationInfo = null;
                                                        if (!c0().n1((String) null, by8.I0)) {
                                                            bundle2.putLong("_uwa", 1);
                                                        } else if (q12 == 0) {
                                                            bundle2.putLong("_uwa", 1);
                                                            z3 = false;
                                                            q12 = 0;
                                                        }
                                                        z3 = false;
                                                    } else {
                                                        applicationInfo = null;
                                                        z3 = true;
                                                    }
                                                    if (true != z3) {
                                                        j8 = 0;
                                                    } else {
                                                        j8 = 1;
                                                    }
                                                    z992 = z99;
                                                    U(new z89(j14, Long.valueOf(j8), "_fi", "auto"), z992);
                                                    applicationInfo2 = cf8.a(y193.w).b(0, str72);
                                                    if (applicationInfo2 != null) {
                                                        if ((applicationInfo2.flags & 1) != 0) {
                                                            j7 = 1;
                                                            bundle2.putLong("_sys", 1);
                                                        } else {
                                                            j7 = 1;
                                                        }
                                                        if ((applicationInfo2.flags & 128) != 0) {
                                                            bundle2.putLong("_sysu", j7);
                                                        }
                                                    }
                                                }
                                            }
                                            z992 = z99;
                                            applicationInfo = null;
                                            try {
                                                applicationInfo2 = cf8.a(y193.w).b(0, str72);
                                            } catch (PackageManager.NameNotFoundException e2) {
                                                G().B.c(pz8.k1(str72), e2, "Application info is null, first open report might be inaccurate. appId");
                                                applicationInfo2 = applicationInfo;
                                            }
                                            if (applicationInfo2 != null) {
                                            }
                                        }
                                        j9 = q12;
                                        if (j9 >= 0) {
                                            bundle2.putLong("_pfo", j9);
                                        }
                                        Q().getClass();
                                        bundle2.putLong(str2, System.currentTimeMillis());
                                        d(new zr8("_f", new ur8(bundle2), "auto", j14, j3), z992);
                                    }
                                }
                                y192 = y194;
                                str2 = "_elt";
                                str = str5;
                                str3 = "_et";
                                pz8 pz82 = y19.B;
                                y19.g(pz82);
                                pz82.F.a("Install Referrer Reporter was called with invalid app package name");
                                n0().b1();
                                j0();
                                Bundle bundle22 = new Bundle();
                                long j1522 = j5;
                                bundle22.putLong("_c", j1522);
                                bundle22.putLong("_r", j1522);
                                bundle22.putLong("_uwa", 0);
                                bundle22.putLong("_pfo", 0);
                                bundle22.putLong("_sys", 0);
                                bundle22.putLong("_sysu", 0);
                                bundle22.putLong(str3, j1522);
                                if (z5) {
                                }
                                z65.k(str);
                                uq8 uq8622 = this.y;
                                R(uq8622);
                                z65.h(str);
                                uq8622.b1();
                                uq8622.d1();
                                String str722 = str;
                                long q122 = uq8622.q1(str722);
                                y193 = y192;
                                if (y193.w.getPackageManager() != null) {
                                }
                                j9 = q122;
                                if (j9 >= 0) {
                                }
                                Q().getClass();
                                bundle22.putLong(str2, System.currentTimeMillis());
                                d(new zr8("_f", new ur8(bundle22), "auto", j14, j3), z992);
                            } else {
                                z99 z994 = z993;
                                String str8 = "_elt";
                                long j17 = j6;
                                Long valueOf2 = Long.valueOf(j13);
                                long j18 = j6;
                                U(new z89(j18, valueOf2, "_fvt", "auto"), z994);
                                n0().b1();
                                j0();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("_c", 1);
                                bundle3.putLong("_r", 1);
                                bundle3.putLong("_et", 1);
                                if (z5) {
                                    bundle3.putLong("_dac", 1);
                                }
                                Q().getClass();
                                bundle3.putLong(str8, System.currentTimeMillis());
                                d(new zr8("_v", new ur8(bundle3), "auto", j18, j3), z994);
                            }
                        } else {
                            z99 z995 = z993;
                            long j20 = j6;
                            if (z995.E) {
                                d(new zr8("_cd", new ur8(new Bundle()), "auto", j20, 0), z995);
                            }
                        }
                        uq8 uq872 = this.y;
                        R(uq872);
                        uq872.R1();
                        uq8 uq882 = this.y;
                        R(uq882);
                        uq882.S1();
                    }
                } else {
                    j5 = 1;
                }
                if (S2 != null) {
                    if (true != S2.booleanValue()) {
                        j10 = 0;
                    } else {
                        j10 = j5;
                    }
                    z89 z89 = new z89(j4, Long.valueOf(j10), "_npa", "auto");
                    j6 = j4;
                    if (Y1 == null || !Y1.e.equals(z89.z)) {
                        U(z89, z993);
                    }
                } else {
                    j6 = j4;
                    if (Y1 != null) {
                        V("_npa", z993);
                    }
                }
                if (!c0().n1((String) null, by8.W0)) {
                }
                a0(z99);
                uq8 uq8522 = this.y;
                if (i != 0) {
                }
                if (qr8 != null) {
                }
            } catch (RuntimeException e3) {
                pz8 pz83 = y19.B;
                y19.g(pz83);
                pz83.B.b("Exception occurred while binding to Install Referrer Service", e3.getMessage());
            } catch (Throwable th) {
                uq8 uq89 = this.y;
                R(uq89);
                uq89.S1();
                throw th;
            }
            uq8 uq8722 = this.y;
            R(uq8722);
            uq8722.R1();
            uq8 uq8822 = this.y;
            R(uq8822);
            uq8822.S1();
        }
    }

    public final void X(xn8 xn8, z99 z99) {
        zr8 zr8;
        z65.h(xn8.w);
        z65.k(xn8.x);
        z65.k(xn8.y);
        z65.h(xn8.y.x);
        n0().b1();
        j0();
        if (P(z99)) {
            if (!z99.D) {
                a0(z99);
                return;
            }
            xn8 xn82 = new xn8(xn8);
            boolean z2 = false;
            xn82.A = false;
            uq8 uq8 = this.y;
            R(uq8);
            uq8.Q1();
            try {
                uq8 uq82 = this.y;
                R(uq82);
                String str = xn82.w;
                z65.k(str);
                xn8 c2 = uq82.c2(str, xn82.y.x);
                y19 y19 = this.H;
                if (c2 != null) {
                    if (!c2.x.equals(xn82.x)) {
                        G().E.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", y19.F.c(xn82.y.x), xn82.x, c2.x);
                    }
                }
                if (c2 != null && c2.A) {
                    xn82.x = c2.x;
                    xn82.z = c2.z;
                    xn82.D = c2.D;
                    xn82.B = c2.B;
                    xn82.E = c2.E;
                    xn82.A = true;
                    z89 z89 = xn82.y;
                    xn82.y = new z89(c2.y.y, z89.f(), z89.x, c2.y.B);
                } else if (TextUtils.isEmpty(xn82.B)) {
                    z89 z892 = xn82.y;
                    xn82.y = new z89(xn82.z, z892.f(), z892.x, xn82.y.B);
                    xn82.A = true;
                    z2 = true;
                }
                if (xn82.A) {
                    z89 z893 = xn82.y;
                    String str2 = xn82.w;
                    z65.k(str2);
                    String str3 = xn82.x;
                    String str4 = z893.x;
                    long j = z893.y;
                    Object f = z893.f();
                    z65.k(f);
                    b99 b99 = new b99(str2, str3, str4, j, f);
                    Object obj = b99.e;
                    String str5 = b99.c;
                    uq8 uq83 = this.y;
                    R(uq83);
                    if (uq83.X1(b99)) {
                        G().I.d("User property updated immediately", xn82.w, y19.F.c(str5), obj);
                    } else {
                        G().B.d("(2)Too many active user properties, ignoring", pz8.k1(xn82.w), y19.F.c(str5), obj);
                    }
                    if (z2 && (zr8 = xn82.E) != null) {
                        g(new zr8(zr8, xn82.z, 0), z99);
                    }
                }
                uq8 uq84 = this.y;
                R(uq84);
                if (uq84.b2(xn82)) {
                    G().I.d("Conditional property added", xn82.w, y19.F.c(xn82.y.x), xn82.y.f());
                } else {
                    G().B.d("Too many conditional properties, ignoring", pz8.k1(xn82.w), y19.F.c(xn82.y.x), xn82.y.f());
                }
                uq8 uq85 = this.y;
                R(uq85);
                uq85.R1();
                uq8 uq86 = this.y;
                R(uq86);
                uq86.S1();
            } catch (Throwable th) {
                Throwable th2 = th;
                uq8 uq87 = this.y;
                R(uq87);
                uq87.S1();
                throw th2;
            }
        }
    }

    public final void Y(xn8 xn8, z99 z99) {
        Bundle bundle;
        z65.h(xn8.w);
        z65.k(xn8.y);
        z65.h(xn8.y.x);
        n0().b1();
        j0();
        if (P(z99)) {
            if (!z99.D) {
                a0(z99);
                return;
            }
            uq8 uq8 = this.y;
            R(uq8);
            uq8.Q1();
            try {
                a0(z99);
                String str = xn8.w;
                z65.k(str);
                uq8 uq82 = this.y;
                R(uq82);
                xn8 c2 = uq82.c2(str, xn8.y.x);
                y19 y19 = this.H;
                if (c2 != null) {
                    G().I.c(xn8.w, y19.F.c(xn8.y.x), "Removing conditional user property");
                    uq8 uq83 = this.y;
                    R(uq83);
                    uq83.d2(str, xn8.y.x);
                    if (c2.A) {
                        uq8 uq84 = this.y;
                        R(uq84);
                        uq84.W1(str, xn8.y.x);
                    }
                    zr8 zr8 = xn8.G;
                    if (zr8 != null) {
                        ur8 ur8 = zr8.x;
                        if (ur8 != null) {
                            bundle = ur8.l();
                        } else {
                            bundle = null;
                        }
                        zr8 J1 = i0().J1(zr8.w, bundle, c2.x, zr8.z, zr8.A, true);
                        z65.k(J1);
                        g(J1, z99);
                    }
                } else {
                    G().E.c(pz8.k1(xn8.w), y19.F.c(xn8.y.x), "Conditional user property doesn't exist");
                }
                uq8 uq85 = this.y;
                R(uq85);
                uq85.R1();
                uq8 uq86 = this.y;
                R(uq86);
                uq86.S1();
            } catch (Throwable th) {
                Throwable th2 = th;
                uq8 uq87 = this.y;
                R(uq87);
                uq87.S1();
                throw th2;
            }
        }
    }

    public final void Z(z99 z99, long j) {
        boolean z2;
        z99 z992 = z99;
        uq8 uq8 = this.y;
        R(uq8);
        String str = z992.w;
        z65.k(str);
        c09 g2 = uq8.g2(str);
        if (g2 != null) {
            i0();
            String str2 = z992.x;
            String H2 = g2.H();
            boolean isEmpty = TextUtils.isEmpty(str2);
            boolean isEmpty2 = TextUtils.isEmpty(H2);
            if (!isEmpty && !isEmpty2) {
                z65.k(str2);
                if (!str2.equals(H2)) {
                    G().E.b("New GMP App Id passed in. Removing cached database data. appId", pz8.k1(g2.E()));
                    uq8 uq82 = this.y;
                    R(uq82);
                    y19 y19 = (y19) uq82.w;
                    String E2 = g2.E();
                    uq82.d1();
                    uq82.b1();
                    z65.h(E2);
                    try {
                        SQLiteDatabase T1 = uq82.T1();
                        String[] strArr = {E2};
                        int delete = T1.delete("events", "app_id=?", strArr) + T1.delete("user_attributes", "app_id=?", strArr) + T1.delete("conditional_properties", "app_id=?", strArr) + T1.delete("apps", "app_id=?", strArr) + T1.delete("raw_events", "app_id=?", strArr) + T1.delete("raw_events_metadata", "app_id=?", strArr) + T1.delete("event_filters", "app_id=?", strArr) + T1.delete("property_filters", "app_id=?", strArr) + T1.delete("audience_filter_values", "app_id=?", strArr) + T1.delete("consent_settings", "app_id=?", strArr) + T1.delete("default_event_params", "app_id=?", strArr) + T1.delete("trigger_uris", "app_id=?", strArr) + T1.delete("diagnostic_signals", "app_id=?", strArr);
                        fo8 fo8 = (fo8) eo8.x.w.w;
                        if (y19.z.n1((String) null, by8.c1)) {
                            delete += T1.delete("no_data_mode_events", "app_id=?", strArr);
                        }
                        if (delete > 0) {
                            pz8 pz8 = y19.B;
                            y19.g(pz8);
                            pz8.J.c(E2, Integer.valueOf(delete), "Deleted application data. app, records");
                        }
                    } catch (SQLiteException e) {
                        pz8 pz82 = y19.B;
                        y19.g(pz82);
                        pz82.B.c(pz8.k1(E2), e, "Error deleting application data. appId, error");
                    }
                    g2 = null;
                }
            }
        }
        if (g2 != null) {
            boolean z3 = true;
            if (g2.Q() == -2147483648L || g2.Q() == z992.F) {
                z2 = false;
            } else {
                z2 = true;
            }
            String O2 = g2.O();
            if (g2.Q() != -2147483648L || O2 == null || O2.equals(z992.y)) {
                z3 = false;
            }
            if (z2 || z3) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", O2);
                zr8 zr8 = new zr8("_au", new ur8(bundle), "auto", j, 0);
                if (c0().n1((String) null, by8.X0)) {
                    d(zr8, z992);
                } else {
                    e(zr8, z992);
                }
            }
        }
    }

    public final h39 a(String str) {
        h39 h39 = h39.c;
        n0().b1();
        j0();
        HashMap hashMap = this.X;
        h39 h392 = (h39) hashMap.get(str);
        if (h392 == null) {
            uq8 uq8 = this.y;
            R(uq8);
            h392 = uq8.w1(str);
            if (h392 == null) {
                h392 = h39.c;
            }
            n0().b1();
            j0();
            hashMap.put(str, h392);
            uq8 uq82 = this.y;
            R(uq82);
            uq82.I1(str, h392);
        }
        return h392;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0283  */
    public final c09 a0(z99 z99) {
        boolean z2;
        String str;
        long j;
        String str2;
        String str3;
        String str4;
        boolean z3;
        boolean z4;
        boolean z5;
        String str5;
        boolean z6;
        String str6;
        boolean z7;
        int i;
        boolean z8;
        n0().b1();
        j0();
        z65.k(z99);
        boolean z9 = z99.J;
        String str7 = z99.w;
        z65.h(str7);
        String str8 = z99.P;
        if (!str8.isEmpty()) {
            this.Z.put(str7, new t89(this, str8));
        }
        uq8 uq8 = this.y;
        R(uq8);
        c09 g2 = uq8.g2(str7);
        h39 j2 = a(str7).j(h39.c(100, z99.O));
        String i1 = this.E.i1(z99, j2);
        boolean z10 = true;
        f39 f39 = f39.AD_STORAGE;
        f39 f392 = f39.ANALYTICS_STORAGE;
        boolean z11 = false;
        if (g2 == null) {
            g2 = new c09(this.H, str7);
            if (j2.i(f392)) {
                g2.G(j(j2));
            }
            if (j2.i(f39)) {
                g2.J(i1);
            }
        } else {
            y19 y19 = g2.a;
            if (j2.i(f39) && i1 != null) {
                r19 r19 = y19.C;
                y19.g(r19);
                r19.b1();
                if (!i1.equals(g2.e)) {
                    r19 r192 = y19.C;
                    y19.g(r192);
                    r192.b1();
                    boolean isEmpty = TextUtils.isEmpty(g2.e);
                    g2.J(i1);
                    if (z9 && !"00000000-0000-0000-0000-000000000000".equals(this.E.g1(z99, j2).first) && !isEmpty) {
                        if (j2.i(f392)) {
                            g2.G(j(j2));
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        uq8 uq82 = this.y;
                        R(uq82);
                        if (uq82.Y1(str7, "_id") != null) {
                            uq8 uq83 = this.y;
                            R(uq83);
                            if (uq83.Y1(str7, "_lair") == null) {
                                Q().getClass();
                                b99 b99 = new b99(str7, "auto", "_lair", System.currentTimeMillis(), 1L);
                                uq8 uq84 = this.y;
                                R(uq84);
                                uq84.X1(b99);
                            }
                        }
                        y19 y1922 = g2.a;
                        g2.I(z99.x);
                        str = z99.G;
                        if (!TextUtils.isEmpty(str)) {
                            g2.L(str);
                        }
                        j = z99.A;
                        if (j != 0) {
                            g2.T(j);
                        }
                        str2 = z99.y;
                        if (!TextUtils.isEmpty(str2)) {
                            g2.P(str2);
                        }
                        g2.R(z99.F);
                        str3 = z99.z;
                        if (str3 != null) {
                            g2.S(str3);
                        }
                        g2.a(z99.B);
                        g2.d(z99.D);
                        str4 = z99.C;
                        if (!TextUtils.isEmpty(str4)) {
                            g2.w(str4);
                        }
                        r19 r1932 = y1922.C;
                        y19.g(r1932);
                        r1932.b1();
                        boolean z122 = g2.R;
                        if (g2.p == z9) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        g2.R = z122 | z3;
                        g2.p = z9;
                        Boolean bool2 = z99.L;
                        r19 r1942 = y1922.C;
                        y19.g(r1942);
                        r1942.b1();
                        g2.R |= !Objects.equals(g2.q, bool2);
                        g2.q = bool2;
                        g2.c(z99.M);
                        String str92 = z99.Q;
                        r19 r1952 = y1922.C;
                        y19.g(r1952);
                        r1952.b1();
                        g2.R |= !Objects.equals(g2.t, str92);
                        g2.t = str92;
                        go8 go82 = go8.x;
                        ho8 ho83 = (ho8) go82.w.w;
                        if (!c0().n1((String) null, by8.L0)) {
                            g2.y(z99.N);
                        } else {
                            ho8 ho82 = (ho8) go82.w.w;
                            if (c0().n1((String) null, by8.K0)) {
                                g2.y((List) null);
                            }
                        }
                        z4 = z99.R;
                        r19 r1962 = y1922.C;
                        y19.g(r1962);
                        r1962.b1();
                        boolean z132 = g2.R;
                        if (g2.u == z4) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        g2.R = z132 | z5;
                        g2.u = z4;
                        str5 = z99.X;
                        r19 r1972 = y1922.C;
                        y19.g(r1972);
                        r1972.b1();
                        boolean z142 = g2.R;
                        if (g2.C == str5) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        g2.R = z142 | z6;
                        g2.C = str5;
                        wo8.a();
                        if (c0().n1((String) null, by8.O0)) {
                            int i2 = z99.V;
                            r19 r198 = y1922.C;
                            y19.g(r198);
                            r198.b1();
                            boolean z15 = g2.R;
                            if (g2.x != i2) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            g2.R = z15 | z8;
                            g2.x = i2;
                        }
                        g2.A(z99.S);
                        str6 = z99.Y;
                        r19 r1992 = y1922.C;
                        y19.g(r1992);
                        r1992.b1();
                        boolean z162 = g2.R;
                        if (g2.G == str6) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        g2.R = z162 | z7;
                        g2.G = str6;
                        i = z99.a0;
                        r19 r19102 = y1922.C;
                        y19.g(r19102);
                        r19102.b1();
                        boolean z172 = g2.R;
                        if (g2.I != i) {
                            z11 = true;
                        }
                        g2.R = z172 | z11;
                        g2.I = i;
                        if (!g2.o()) {
                            z10 = z2;
                        } else if (!z2) {
                            return g2;
                        }
                        uq8 uq852 = this.y;
                        R(uq852);
                        uq852.h2(g2, z10);
                        return g2;
                    } else if (TextUtils.isEmpty(g2.F()) && j2.i(f392)) {
                        g2.G(j(j2));
                    }
                }
            }
            if (TextUtils.isEmpty(g2.F()) && j2.i(f392)) {
                g2.G(j(j2));
            }
        }
        z2 = false;
        y19 y19222 = g2.a;
        g2.I(z99.x);
        str = z99.G;
        if (!TextUtils.isEmpty(str)) {
        }
        j = z99.A;
        if (j != 0) {
        }
        str2 = z99.y;
        if (!TextUtils.isEmpty(str2)) {
        }
        g2.R(z99.F);
        str3 = z99.z;
        if (str3 != null) {
        }
        g2.a(z99.B);
        g2.d(z99.D);
        str4 = z99.C;
        if (!TextUtils.isEmpty(str4)) {
        }
        r19 r19322 = y19222.C;
        y19.g(r19322);
        r19322.b1();
        boolean z1222 = g2.R;
        if (g2.p == z9) {
        }
        g2.R = z1222 | z3;
        g2.p = z9;
        Boolean bool22 = z99.L;
        r19 r19422 = y19222.C;
        y19.g(r19422);
        r19422.b1();
        g2.R |= !Objects.equals(g2.q, bool22);
        g2.q = bool22;
        g2.c(z99.M);
        String str922 = z99.Q;
        r19 r19522 = y19222.C;
        y19.g(r19522);
        r19522.b1();
        g2.R |= !Objects.equals(g2.t, str922);
        g2.t = str922;
        go8 go822 = go8.x;
        ho8 ho832 = (ho8) go822.w.w;
        if (!c0().n1((String) null, by8.L0)) {
        }
        z4 = z99.R;
        r19 r19622 = y19222.C;
        y19.g(r19622);
        r19622.b1();
        boolean z1322 = g2.R;
        if (g2.u == z4) {
        }
        g2.R = z1322 | z5;
        g2.u = z4;
        str5 = z99.X;
        r19 r19722 = y19222.C;
        y19.g(r19722);
        r19722.b1();
        boolean z1422 = g2.R;
        if (g2.C == str5) {
        }
        g2.R = z1422 | z6;
        g2.C = str5;
        wo8.a();
        if (c0().n1((String) null, by8.O0)) {
        }
        g2.A(z99.S);
        str6 = z99.Y;
        r19 r19922 = y19222.C;
        y19.g(r19922);
        r19922.b1();
        boolean z1622 = g2.R;
        if (g2.G == str6) {
        }
        g2.R = z1622 | z7;
        g2.G = str6;
        i = z99.a0;
        r19 r191022 = y19222.C;
        y19.g(r191022);
        r191022.b1();
        boolean z1722 = g2.R;
        if (g2.I != i) {
        }
        g2.R = z1722 | z11;
        g2.I = i;
        if (!g2.o()) {
        }
        uq8 uq8522 = this.y;
        R(uq8522);
        uq8522.h2(g2, z10);
        return g2;
    }

    public final long b() {
        Q().getClass();
        long currentTimeMillis = System.currentTimeMillis();
        u69 u69 = this.E;
        u69.d1();
        u69.b1();
        l09 l09 = u69.F;
        long a = l09.a();
        if (a == 0) {
            d99 d99 = ((y19) u69.w).E;
            y19.e(d99);
            a = ((long) d99.b2().nextInt(86400000)) + 1;
            l09.b(a);
        }
        return ((((currentTimeMillis + a) / 1000) / 60) / 60) / 24;
    }

    public final List b0(Bundle bundle, z99 z99) {
        List list;
        int[] iArr;
        Bundle bundle2 = bundle;
        z99 z992 = z99;
        n0().b1();
        wo8.a();
        tp8 c02 = c0();
        String str = z992.w;
        if (!c02.n1(str, by8.O0) || str == null) {
            return new ArrayList();
        }
        if (bundle2 != null) {
            int[] intArray = bundle2.getIntArray("uriSources");
            long[] longArray = bundle2.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    G().B.a("Uri sources and timestamps do not match");
                } else {
                    int i = 0;
                    while (i < intArray.length) {
                        uq8 uq8 = this.y;
                        R(uq8);
                        y19 y19 = (y19) uq8.w;
                        int i2 = intArray[i];
                        long j = longArray[i];
                        z65.h(str);
                        uq8.b1();
                        uq8.d1();
                        try {
                            iArr = intArray;
                            try {
                                int delete = uq8.T1().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i2), String.valueOf(j)});
                                pz8 pz8 = y19.B;
                                y19.g(pz8);
                                mz8 mz8 = pz8.J;
                                StringBuilder sb = new StringBuilder(String.valueOf(delete).length() + 46);
                                sb.append("Pruned ");
                                sb.append(delete);
                                sb.append(" trigger URIs. appId, source, timestamp");
                                mz8.d(sb.toString(), str, Integer.valueOf(i2), Long.valueOf(j));
                            } catch (SQLiteException e) {
                                e = e;
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            iArr = intArray;
                            pz8 pz82 = y19.B;
                            y19.g(pz82);
                            pz82.B.c(pz8.k1(str), e, "Error pruning trigger URIs. appId");
                            i++;
                            intArray = iArr;
                        }
                        i++;
                        intArray = iArr;
                    }
                }
            }
        }
        uq8 uq82 = this.y;
        R(uq82);
        String str2 = z992.w;
        z65.h(str2);
        uq82.b1();
        uq82.d1();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = uq82.T1().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, (String) null, (String) null, "rowid", (String) null);
            list = arrayList;
            if (cursor.moveToFirst()) {
                do {
                    String string = cursor.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(new u79(cursor.getInt(2), cursor.getLong(1), string));
                } while (cursor.moveToNext());
                list = arrayList;
            }
        } catch (SQLiteException e3) {
            pz8 pz83 = ((y19) uq82.w).B;
            y19.g(pz83);
            pz83.B.c(pz8.k1(str2), e3, "Error querying trigger uris. appId");
            list = Collections.EMPTY_LIST;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return list;
    }

    public final void c(String str, zr8 zr8) {
        String str2 = str;
        zr8 zr82 = zr8;
        uq8 uq8 = this.y;
        R(uq8);
        c09 g2 = uq8.g2(str2);
        if (g2 != null) {
            y19 y19 = g2.a;
            if (!TextUtils.isEmpty(g2.O())) {
                Boolean M2 = M(g2);
                if (M2 == null) {
                    if (!"_ui".equals(zr82.w)) {
                        G().E.b("Could not find package. appId", pz8.k1(str2));
                    }
                } else if (!M2.booleanValue()) {
                    G().B.b("App version does not match; dropping event. appId", pz8.k1(str2));
                    return;
                }
                String H2 = g2.H();
                long Q2 = g2.Q();
                r19 r19 = y19.C;
                y19.g(r19);
                r19.b1();
                String str3 = H2;
                String str4 = g2.l;
                r19 r192 = y19.C;
                y19.g(r192);
                r192.b1();
                String O2 = g2.O();
                long j = g2.m;
                r19 r193 = y19.C;
                y19.g(r193);
                r193.b1();
                long j2 = g2.n;
                r19 r194 = y19.C;
                y19.g(r194);
                r194.b1();
                boolean z2 = g2.o;
                String K2 = g2.K();
                r19 r195 = y19.C;
                y19.g(r195);
                r195.b1();
                boolean z3 = g2.p;
                Boolean x2 = g2.x();
                long b = g2.b();
                boolean z4 = z3;
                r19 r196 = y19.C;
                y19.g(r196);
                r196.b1();
                ArrayList arrayList = g2.s;
                String g = a(str).g();
                boolean z5 = g2.z();
                ArrayList arrayList2 = arrayList;
                r19 r197 = y19.C;
                y19.g(r197);
                r197.b1();
                long j3 = g2.v;
                int i = a(str).b;
                String str5 = m0(str).b;
                int i2 = i;
                r19 r198 = y19.C;
                y19.g(r198);
                r198.b1();
                int i3 = g2.x;
                r19 r199 = y19.C;
                y19.g(r199);
                r199.b1();
                int i4 = i3;
                long j4 = g2.B;
                String D2 = g2.D();
                String s = g2.s();
                int t = g2.t();
                String str6 = str;
                d(zr8, new z99(str6, str3, O2, Q2, str4, j, j2, (String) null, z2, false, K2, 0, 0, z4, false, x2, b, (List) arrayList2, g, "", (String) null, z5, j3, i2, str5, i4, j4, D2, s, 0, t, 0));
                return;
            }
        }
        G().I.b("No app data available; dropping event", str2);
    }

    public final tp8 c0() {
        y19 y19 = this.H;
        z65.k(y19);
        return y19.z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010a  */
    public final void d(zr8 zr8, z99 z99) {
        Throwable th;
        Bundle bundle;
        zr8 b;
        ur8 ur8;
        Cursor cursor;
        String str = z99.w;
        z65.h(str);
        rz8 a = rz8.a(zr8);
        Bundle bundle2 = a.e;
        d99 i0 = i0();
        uq8 uq8 = this.y;
        R(uq8);
        y19 y19 = (y19) uq8.w;
        uq8.b1();
        uq8.d1();
        Cursor cursor2 = null;
        try {
            cursor = uq8.T1().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
            try {
                if (!cursor.moveToFirst()) {
                    pz8 pz8 = y19.B;
                    y19.g(pz8);
                    pz8.J.a("Default event parameters not found");
                    if (cursor != null) {
                        cursor.close();
                    }
                    bundle = null;
                    i0.p1(bundle2, bundle);
                    d99 i0222 = i0();
                    tp8 c0222 = c0();
                    c0222.getClass();
                    i0222.n1(a, Math.max(Math.min(c0222.l1(str, by8.X), 100), 25));
                    b = a.b();
                    if (!c0().n1((String) null, by8.Z0) && "_cmp".equals(b.w)) {
                        ur8 = b.x;
                        if ("referrer API v2".equals(ur8.w.getString("_cis"))) {
                            String string = ur8.w.getString("gclid");
                            if (!TextUtils.isEmpty(string)) {
                                U(new z89(b.z, string, "_lgclid", "auto"), z99);
                            }
                        }
                    }
                    e(b, z99);
                }
                try {
                    h19 h19 = (h19) ((f19) y89.N1(h19.J(), cursor.getBlob(0))).d();
                    uq8.x.h0();
                    bundle = y89.l1(h19.v());
                    cursor.close();
                } catch (IOException e) {
                    pz8 pz82 = y19.B;
                    y19.g(pz82);
                    pz82.B.c(pz8.k1(str), e, "Failed to retrieve default event parameters. appId");
                }
                i0.p1(bundle2, bundle);
                d99 i02222 = i0();
                tp8 c02222 = c0();
                c02222.getClass();
                i02222.n1(a, Math.max(Math.min(c02222.l1(str, by8.X), 100), 25));
                b = a.b();
                ur8 = b.x;
                if ("referrer API v2".equals(ur8.w.getString("_cis"))) {
                }
                e(b, z99);
            } catch (SQLiteException e2) {
                e = e2;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
            try {
                pz8 pz83 = y19.B;
                y19.g(pz83);
                pz83.B.b("Error selecting default event parameters", e);
                if (cursor != null) {
                }
                bundle = null;
                i0.p1(bundle2, bundle);
                d99 i022222 = i0();
                tp8 c022222 = c0();
                c022222.getClass();
                i022222.n1(a, Math.max(Math.min(c022222.l1(str, by8.X), 100), 25));
                b = a.b();
                ur8 = b.x;
                if ("referrer API v2".equals(ur8.w.getString("_cis"))) {
                }
                e(b, z99);
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    public final j19 d0() {
        j19 j19 = this.w;
        R(j19);
        return j19;
    }

    public final void e(zr8 zr8, z99 z99) {
        long j;
        List list;
        y19 y19;
        List list2;
        List<xn8> list3;
        long j2;
        String str;
        zr8 zr82 = zr8;
        z99 z992 = z99;
        z65.k(z992);
        String str2 = z992.w;
        z65.h(str2);
        n0().b1();
        j0();
        long j3 = zr82.z;
        long j4 = zr82.A;
        rz8 a = rz8.a(zr82);
        n0().b1();
        f59 f59 = this.b0;
        if (f59 == null || (str = this.c0) == null || !str.equals(str2)) {
            f59 = null;
        }
        d99.Y1(f59, a.e, false);
        zr8 b = a.b();
        h0();
        if (!TextUtils.isEmpty(z992.x)) {
            if (!z992.D) {
                a0(z992);
                return;
            }
            List list4 = z992.N;
            if (list4 != null) {
                String str3 = b.w;
                if (list4.contains(str3)) {
                    Bundle l = b.x.l();
                    j = j3;
                    l.putLong("ga_safelisted", 1);
                    b = new zr8(str3, new ur8(l), b.y, b.z, b.A);
                } else {
                    G().I.d("Dropping non-safelisted event. appId, event name, origin", str2, str3, b.y);
                    return;
                }
            } else {
                j = j3;
            }
            uq8 uq8 = this.y;
            R(uq8);
            uq8.Q1();
            try {
                String str4 = b.w;
                if ("_s".equals(str4)) {
                    uq8 uq82 = this.y;
                    R(uq82);
                    if (!uq82.r1(str2, "_s") && b.x.w.getLong("_sid") != 0) {
                        uq8 uq83 = this.y;
                        R(uq83);
                        if (!uq83.r1(str2, "_f")) {
                            uq8 uq84 = this.y;
                            R(uq84);
                            if (!uq84.r1(str2, "_v")) {
                                uq8 uq85 = this.y;
                                R(uq85);
                                Q().getClass();
                                uq85.v1(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", f(str2, b));
                            }
                        }
                        uq8 uq86 = this.y;
                        R(uq86);
                        uq86.v1(str2, (Long) null, "_sid", f(str2, b));
                    }
                }
                uq8 uq87 = this.y;
                R(uq87);
                z65.h(str2);
                uq87.b1();
                uq87.d1();
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i < 0) {
                    pz8 pz8 = ((y19) uq87.w).B;
                    y19.g(pz8);
                    pz8.E.c(pz8.k1(str2), Long.valueOf(j), "Invalid time querying timed out conditional properties");
                    list = Collections.EMPTY_LIST;
                } else {
                    list = uq87.f2("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                Iterator it = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    y19 = this.H;
                    if (!hasNext) {
                        break;
                    }
                    xn8 xn8 = (xn8) it.next();
                    if (xn8 != null) {
                        G().J.d("User property timed out", xn8.w, y19.F.c(xn8.y.x), xn8.y.f());
                        zr8 zr83 = xn8.C;
                        if (zr83 != null) {
                            j2 = j;
                            g(new zr8(zr83, j2, j4), z992);
                        } else {
                            j2 = j;
                        }
                        uq8 uq88 = this.y;
                        R(uq88);
                        uq88.d2(str2, xn8.y.x);
                        j = j2;
                    }
                }
                long j5 = j;
                uq8 uq89 = this.y;
                R(uq89);
                z65.h(str2);
                uq89.b1();
                uq89.d1();
                if (i < 0) {
                    pz8 pz82 = ((y19) uq89.w).B;
                    y19.g(pz82);
                    pz82.E.c(pz8.k1(str2), Long.valueOf(j5), "Invalid time querying expired conditional properties");
                    list2 = Collections.EMPTY_LIST;
                } else {
                    list2 = uq89.f2("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j5)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    xn8 xn82 = (xn8) it2.next();
                    if (xn82 != null) {
                        Iterator it3 = it2;
                        int i2 = i;
                        long j6 = j5;
                        G().J.d("User property expired", xn82.w, y19.F.c(xn82.y.x), xn82.y.f());
                        uq8 uq810 = this.y;
                        R(uq810);
                        uq810.W1(str2, xn82.y.x);
                        zr8 zr84 = xn82.G;
                        if (zr84 != null) {
                            arrayList.add(zr84);
                        }
                        uq8 uq811 = this.y;
                        R(uq811);
                        uq811.d2(str2, xn82.y.x);
                        it2 = it3;
                        i = i2;
                        j5 = j6;
                    }
                }
                int i3 = i;
                long j7 = j5;
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    long j8 = j7;
                    g(new zr8((zr8) it4.next(), j8, j4), z992);
                    j7 = j8;
                    j4 = j4;
                }
                long j9 = j4;
                long j10 = j7;
                uq8 uq812 = this.y;
                R(uq812);
                z65.h(str2);
                z65.h(str4);
                uq812.b1();
                uq812.d1();
                if (i3 < 0) {
                    y19 y192 = (y19) uq812.w;
                    pz8 pz83 = y192.B;
                    y19.g(pz83);
                    pz83.E.d("Invalid time querying triggered conditional properties", pz8.k1(str2), y192.F.a(str4), Long.valueOf(j10));
                    list3 = Collections.EMPTY_LIST;
                } else {
                    list3 = uq812.f2("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j10)});
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                for (xn8 xn83 : list3) {
                    if (xn83 != null) {
                        z89 z89 = xn83.y;
                        String str5 = xn83.w;
                        z65.k(str5);
                        long j11 = j10;
                        String str6 = xn83.x;
                        String str7 = z89.x;
                        Object f = z89.f();
                        z65.k(f);
                        long j12 = j11;
                        b99 b99 = new b99(str5, str6, str7, j12, f);
                        j10 = j12;
                        Object obj = b99.e;
                        String str8 = b99.c;
                        uq8 uq813 = this.y;
                        R(uq813);
                        if (uq813.X1(b99)) {
                            G().J.d("User property triggered", xn83.w, y19.F.c(str8), obj);
                        } else {
                            G().B.d("Too many active user properties, ignoring", pz8.k1(xn83.w), y19.F.c(str8), obj);
                        }
                        zr8 zr85 = xn83.E;
                        if (zr85 != null) {
                            arrayList2.add(zr85);
                        }
                        xn83.y = new z89(b99);
                        xn83.A = true;
                        uq8 uq814 = this.y;
                        R(uq814);
                        uq814.b2(xn83);
                    }
                }
                g(b, z992);
                Iterator it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    long j13 = j9;
                    g(new zr8((zr8) it5.next(), j10, j13), z992);
                    j9 = j13;
                }
                uq8 uq815 = this.y;
                R(uq815);
                uq815.R1();
                uq8 uq816 = this.y;
                R(uq816);
                uq816.S1();
            } catch (Throwable th) {
                uq8 uq817 = this.y;
                R(uq817);
                uq817.S1();
                throw th;
            }
        }
    }

    public final uq8 e0() {
        uq8 uq8 = this.y;
        R(uq8);
        return uq8;
    }

    public final Bundle f(String str, zr8 zr8) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", zr8.x.w.getLong("_sid"));
        uq8 uq8 = this.y;
        R(uq8);
        b99 Y1 = uq8.Y1(str, "_sno");
        if (Y1 != null) {
            Object obj = Y1.e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    public final f09 f0() {
        f09 f09 = this.z;
        if (f09 != null) {
            return f09;
        }
        h.s("Network broadcast receiver not created");
        return null;
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:579)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:485)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:205)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x03d1 A[Catch:{ SQLiteException -> 0x02e4, all -> 0x01c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x03f6 A[Catch:{ SQLiteException -> 0x02e4, all -> 0x01c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x077a A[Catch:{ SQLiteException -> 0x02e4, all -> 0x01c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0795 A[Catch:{ SQLiteException -> 0x02e4, all -> 0x01c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x07cd A[SYNTHETIC, Splitter:B:235:0x07cd] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x08c1 A[Catch:{ all -> 0x0853 }] */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x08e1 A[Catch:{ all -> 0x0853 }] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0941 A[Catch:{ SQLiteException -> 0x0b46, all -> 0x090b }] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x096a A[Catch:{ SQLiteException -> 0x0b46, all -> 0x090b }] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0983 A[Catch:{ SQLiteException -> 0x0b46, all -> 0x090b }] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0a85 A[Catch:{ SQLiteException -> 0x0b46, all -> 0x090b }] */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x0b30 A[Catch:{ SQLiteException -> 0x0b46, all -> 0x090b }] */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0b48  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x0a92 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01cf A[Catch:{ SQLiteException -> 0x02e4, all -> 0x01c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01f7 A[SYNTHETIC, Splitter:B:54:0x01f7] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x024e A[Catch:{ SQLiteException -> 0x02e4, all -> 0x01c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x025a A[Catch:{ SQLiteException -> 0x02e4, all -> 0x01c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x031a A[Catch:{ SQLiteException -> 0x02e4, all -> 0x01c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0347 A[Catch:{ SQLiteException -> 0x02e4, all -> 0x01c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0365 A[Catch:{ SQLiteException -> 0x02e4, all -> 0x01c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0368 A[Catch:{ SQLiteException -> 0x02e4, all -> 0x01c3 }] */
    public final void g(defpackage.zr8 r42, defpackage.z99 r43) {
        /*
            r41 = this;
            r1 = r41
            r2 = r43
            java.lang.String r3 = "metadata_fingerprint"
            java.lang.String r4 = "app_id"
            java.lang.String r5 = "_fx"
            java.lang.String r6 = "events"
            java.lang.String r7 = "raw_events"
            java.lang.String r8 = "_sno"
            defpackage.z65.k(r2)
            boolean r9 = r2.D
            java.lang.String r11 = r2.w
            defpackage.z65.h(r11)
            long r27 = java.lang.System.nanoTime()
            r19 r0 = r1.n0()
            r0.b1()
            r1.j0()
            r1.h0()
            java.lang.String r10 = r2.x
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x0035
            goto L_0x00f9
        L_0x0035:
            if (r9 != 0) goto L_0x003b
            r1.a0(r2)
            return
        L_0x003b:
            j19 r0 = r1.d0()
            r12 = r42
            java.lang.String r14 = r12.w
            boolean r0 = r0.r1(r11, r14)
            java.lang.String r13 = "_err"
            y19 r15 = r1.H
            r16 = r10
            n49 r10 = r1.f0
            r29 = r3
            r3 = 0
            if (r0 == 0) goto L_0x00fa
            pz8 r0 = r1.G()
            mz8 r0 = r0.h1()
            nz8 r2 = defpackage.pz8.k1(r11)
            fz8 r4 = r15.h()
            java.lang.String r4 = r4.a(r14)
            java.lang.String r5 = "Dropping blocked event. appId"
            r0.c(r2, r4, r5)
            j19 r0 = r1.d0()
            java.lang.String r2 = "measurement.upload.blacklist_internal"
            java.lang.String r0 = r0.Y(r11, r2)
            java.lang.String r2 = "1"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00a2
            j19 r0 = r1.d0()
            java.lang.String r4 = "measurement.upload.blacklist_public"
            java.lang.String r0 = r0.Y(r11, r4)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0090
            goto L_0x00a2
        L_0x0090:
            boolean r0 = r13.equals(r14)
            if (r0 != 0) goto L_0x00f9
            r1.i0()
            java.lang.String r13 = "_ev"
            r15 = 0
            r12 = 11
            defpackage.d99.u1(r10, r11, r12, r13, r14, r15)
            return
        L_0x00a2:
            uq8 r0 = r1.e0()
            c09 r0 = r0.g2(r11)
            if (r0 == 0) goto L_0x00f9
            y19 r2 = r0.a
            r19 r4 = r2.C
            defpackage.y19.g(r4)
            r4.b1()
            long r4 = r0.T
            r19 r2 = r2.C
            defpackage.y19.g(r2)
            r2.b1()
            long r6 = r0.S
            long r4 = java.lang.Math.max(r4, r6)
            xb4 r2 = r1.Q()
            r2.getClass()
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r4
            long r4 = java.lang.Math.abs(r6)
            r1.c0()
            ay8 r2 = defpackage.by8.N
            java.lang.Object r2 = r2.a(r3)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x00f9
            pz8 r2 = r1.G()
            mz8 r2 = r2.i1()
            java.lang.String r3 = "Fetching config for blocked app"
            r2.a(r3)
            r1.v(r0)
        L_0x00f9:
            return
        L_0x00fa:
            r17 = r10
            rz8 r0 = defpackage.rz8.a(r12)
            d99 r10 = r1.i0()
            tp8 r12 = r1.c0()
            r12.getClass()
            ay8 r14 = defpackage.by8.X
            int r12 = r12.l1(r11, r14)
            r14 = 100
            int r12 = java.lang.Math.min(r12, r14)
            r14 = 25
            int r12 = java.lang.Math.max(r12, r14)
            r10.n1(r0, r12)
            tp8 r10 = r1.c0()
            ay8 r12 = defpackage.by8.f0
            r14 = 35
            int r10 = r10.l1(r11, r12)
            int r10 = java.lang.Math.min(r10, r14)
            r12 = 10
            int r10 = java.lang.Math.max(r10, r12)
            android.os.Bundle r12 = r0.e
            java.util.TreeSet r14 = new java.util.TreeSet
            java.util.Set r3 = r12.keySet()
            r14.<init>(r3)
            java.util.Iterator r3 = r14.iterator()
        L_0x0145:
            boolean r14 = r3.hasNext()
            if (r14 == 0) goto L_0x0169
            java.lang.Object r14 = r3.next()
            java.lang.String r14 = (java.lang.String) r14
            r18 = r3
            java.lang.String r3 = "items"
            boolean r3 = r3.equals(r14)
            if (r3 == 0) goto L_0x0166
            d99 r3 = r1.i0()
            android.os.Parcelable[] r14 = r12.getParcelableArray(r14)
            r3.o1(r14, r10)
        L_0x0166:
            r3 = r18
            goto L_0x0145
        L_0x0169:
            zr8 r3 = r0.b()
            ur8 r10 = r3.x
            java.lang.String r12 = r3.w
            pz8 r0 = r1.G()
            java.lang.String r0 = r0.m1()
            r14 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r14)
            if (r0 == 0) goto L_0x0198
            pz8 r0 = r1.G()
            mz8 r0 = r0.j1()
            fz8 r14 = r15.h()
            java.lang.String r14 = r14.d(r3)
            r18 = r13
            java.lang.String r13 = "Logging event"
            r0.b(r13, r14)
            goto L_0x019a
        L_0x0198:
            r18 = r13
        L_0x019a:
            uq8 r0 = r1.e0()
            r0.Q1()
            r1.a0(r2)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = "ecommerce_purchase"
            boolean r0 = r0.equals(r12)     // Catch:{ all -> 0x01c3 }
            java.lang.String r13 = "refund"
            r30 = 1
            if (r0 != 0) goto L_0x01be
            java.lang.String r0 = "purchase"
            boolean r0 = r0.equals(r12)     // Catch:{ all -> 0x01c3 }
            if (r0 != 0) goto L_0x01be
            boolean r0 = r13.equals(r12)     // Catch:{ all -> 0x01c3 }
            if (r0 == 0) goto L_0x01c1
        L_0x01be:
            r0 = r30
            goto L_0x01c7
        L_0x01c1:
            r0 = 0
            goto L_0x01c7
        L_0x01c3:
            r0 = move-exception
            r3 = r1
            goto L_0x0bc8
        L_0x01c7:
            java.lang.String r14 = "_iap"
            boolean r14 = r14.equals(r12)     // Catch:{ all -> 0x01c3 }
            if (r14 != 0) goto L_0x01e5
            if (r0 == 0) goto L_0x01d4
            r0 = r30
            goto L_0x01e5
        L_0x01d4:
            r31 = r4
            r34 = r5
            r32 = r9
            r4 = r10
            r42 = r12
            r9 = r16
            r23 = r17
            r5 = r18
            goto L_0x0356
        L_0x01e5:
            java.lang.String r14 = "_ltv_"
            r20 = r15
            java.lang.String r15 = r10.k()     // Catch:{ all -> 0x01c3 }
            r31 = r4
            android.os.Bundle r4 = r10.w
            r21 = r10
            java.lang.String r10 = "value"
            if (r0 == 0) goto L_0x024e
            java.lang.Double r0 = r21.g()     // Catch:{ all -> 0x01c3 }
            double r22 = r0.doubleValue()     // Catch:{ all -> 0x01c3 }
            r24 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r22 = r22 * r24
            r32 = 0
            int r0 = (r22 > r32 ? 1 : (r22 == r32 ? 0 : -1))
            if (r0 != 0) goto L_0x0216
            r32 = r9
            long r9 = r4.getLong(r10)     // Catch:{ all -> 0x01c3 }
            double r9 = (double) r9     // Catch:{ all -> 0x01c3 }
            double r22 = r9 * r24
            goto L_0x0218
        L_0x0216:
            r32 = r9
        L_0x0218:
            r9 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r0 = (r22 > r9 ? 1 : (r22 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x0230
            r9 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r0 = (r22 > r9 ? 1 : (r22 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0230
            long r9 = java.lang.Math.round(r22)     // Catch:{ all -> 0x01c3 }
            boolean r0 = r13.equals(r12)     // Catch:{ all -> 0x01c3 }
            if (r0 == 0) goto L_0x0254
            long r9 = -r9
            goto L_0x0254
        L_0x0230:
            pz8 r0 = r1.G()     // Catch:{ all -> 0x01c3 }
            mz8 r0 = r0.h1()     // Catch:{ all -> 0x01c3 }
            java.lang.String r2 = "Data lost. Currency value is too big. appId"
            nz8 r3 = defpackage.pz8.k1(r11)     // Catch:{ all -> 0x01c3 }
            java.lang.Double r4 = java.lang.Double.valueOf(r22)     // Catch:{ all -> 0x01c3 }
            r0.c(r3, r4, r2)     // Catch:{ all -> 0x01c3 }
            uq8 r0 = r1.e0()     // Catch:{ all -> 0x01c3 }
            r0.R1()     // Catch:{ all -> 0x01c3 }
            goto L_0x05e6
        L_0x024e:
            r32 = r9
            long r9 = r4.getLong(r10)     // Catch:{ all -> 0x01c3 }
        L_0x0254:
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x01c3 }
            if (r0 != 0) goto L_0x034a
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r15.toUpperCase(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r4 = "[A-Z]{3}"
            boolean r4 = r0.matches(r4)     // Catch:{ all -> 0x01c3 }
            if (r4 == 0) goto L_0x034a
            java.lang.String r13 = r14.concat(r0)     // Catch:{ all -> 0x01c3 }
            uq8 r0 = r1.e0()     // Catch:{ all -> 0x01c3 }
            b99 r0 = r0.Y1(r11, r13)     // Catch:{ all -> 0x01c3 }
            if (r0 == 0) goto L_0x027c
            java.lang.Object r0 = r0.e     // Catch:{ all -> 0x01c3 }
            boolean r4 = r0 instanceof java.lang.Long     // Catch:{ all -> 0x01c3 }
            if (r4 != 0) goto L_0x0289
        L_0x027c:
            r34 = r5
            r22 = r9
            r42 = r12
            r9 = r16
            r5 = r18
            r4 = r21
            goto L_0x02b9
        L_0x0289:
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x01c3 }
            long r14 = r0.longValue()     // Catch:{ all -> 0x01c3 }
            r22 = r9
            b99 r10 = new b99     // Catch:{ all -> 0x01c3 }
            r4 = r12
            java.lang.String r12 = r3.y     // Catch:{ all -> 0x01c3 }
            xb4 r0 = r1.Q()     // Catch:{ all -> 0x01c3 }
            r0.getClass()     // Catch:{ all -> 0x01c3 }
            r24 = r14
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01c3 }
            long r22 = r24 + r22
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x01c3 }
            r42 = r4
            r34 = r5
            r9 = r16
            r5 = r18
            r4 = r21
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r16)     // Catch:{ all -> 0x01c3 }
            goto L_0x0310
        L_0x02b9:
            uq8 r10 = r1.e0()     // Catch:{ all -> 0x01c3 }
            tp8 r0 = r1.c0()     // Catch:{ all -> 0x01c3 }
            ay8 r12 = defpackage.by8.T     // Catch:{ all -> 0x01c3 }
            int r0 = r0.l1(r11, r12)     // Catch:{ all -> 0x01c3 }
            int r0 = r0 + -1
            defpackage.z65.h(r11)     // Catch:{ all -> 0x01c3 }
            r10.b1()     // Catch:{ all -> 0x01c3 }
            r10.d1()     // Catch:{ all -> 0x01c3 }
            android.database.sqlite.SQLiteDatabase r12 = r10.T1()     // Catch:{ SQLiteException -> 0x02e4 }
            java.lang.String r14 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x02e4 }
            java.lang.String[] r0 = new java.lang.String[]{r11, r11, r0}     // Catch:{ SQLiteException -> 0x02e4 }
            r12.execSQL(r14, r0)     // Catch:{ SQLiteException -> 0x02e4 }
            goto L_0x02fa
        L_0x02e4:
            r0 = move-exception
            java.lang.Object r10 = r10.w     // Catch:{ all -> 0x01c3 }
            y19 r10 = (defpackage.y19) r10     // Catch:{ all -> 0x01c3 }
            pz8 r10 = r10.G()     // Catch:{ all -> 0x01c3 }
            mz8 r10 = r10.g1()     // Catch:{ all -> 0x01c3 }
            java.lang.String r12 = "Error pruning currencies. appId"
            nz8 r14 = defpackage.pz8.k1(r11)     // Catch:{ all -> 0x01c3 }
            r10.c(r14, r0, r12)     // Catch:{ all -> 0x01c3 }
        L_0x02fa:
            b99 r10 = new b99     // Catch:{ all -> 0x01c3 }
            java.lang.String r12 = r3.y     // Catch:{ all -> 0x01c3 }
            xb4 r0 = r1.Q()     // Catch:{ all -> 0x01c3 }
            r0.getClass()     // Catch:{ all -> 0x01c3 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01c3 }
            java.lang.Long r16 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x01c3 }
            r10.<init>(r11, r12, r13, r14, r16)     // Catch:{ all -> 0x01c3 }
        L_0x0310:
            uq8 r0 = r1.e0()     // Catch:{ all -> 0x01c3 }
            boolean r0 = r0.X1(r10)     // Catch:{ all -> 0x01c3 }
            if (r0 != 0) goto L_0x0347
            pz8 r0 = r1.G()     // Catch:{ all -> 0x01c3 }
            mz8 r0 = r0.g1()     // Catch:{ all -> 0x01c3 }
            java.lang.String r12 = "Too many unique user properties are set. Ignoring user property. appId"
            nz8 r13 = defpackage.pz8.k1(r11)     // Catch:{ all -> 0x01c3 }
            fz8 r14 = r20.h()     // Catch:{ all -> 0x01c3 }
            java.lang.String r15 = r10.c     // Catch:{ all -> 0x01c3 }
            java.lang.String r14 = r14.c(r15)     // Catch:{ all -> 0x01c3 }
            java.lang.Object r10 = r10.e     // Catch:{ all -> 0x01c3 }
            r0.d(r12, r13, r14, r10)     // Catch:{ all -> 0x01c3 }
            r1.i0()     // Catch:{ all -> 0x01c3 }
            r14 = 0
            r15 = 0
            r12 = 9
            r13 = 0
            r10 = r17
            defpackage.d99.u1(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x01c3 }
            r23 = r10
            goto L_0x0356
        L_0x0347:
            r23 = r17
            goto L_0x0356
        L_0x034a:
            r34 = r5
            r42 = r12
            r9 = r16
            r23 = r17
            r5 = r18
            r4 = r21
        L_0x0356:
            boolean r17 = defpackage.d99.c2(r42)     // Catch:{ all -> 0x01c3 }
            r10 = r42
            boolean r19 = r5.equals(r10)     // Catch:{ all -> 0x01c3 }
            r1.i0()     // Catch:{ all -> 0x01c3 }
            if (r4 != 0) goto L_0x0368
            r14 = 0
            goto L_0x038e
        L_0x0368:
            android.os.Bundle r0 = r4.w     // Catch:{ all -> 0x01c3 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x01c3 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01c3 }
            r14 = 0
        L_0x0374:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x01c3 }
            if (r5 == 0) goto L_0x038e
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x01c3 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x01c3 }
            java.lang.Object r5 = r4.f(r5)     // Catch:{ all -> 0x01c3 }
            boolean r12 = r5 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x01c3 }
            if (r12 == 0) goto L_0x0374
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5     // Catch:{ all -> 0x01c3 }
            int r5 = r5.length     // Catch:{ all -> 0x01c3 }
            long r12 = (long) r5     // Catch:{ all -> 0x01c3 }
            long r14 = r14 + r12
            goto L_0x0374
        L_0x038e:
            r12 = 1
            long r14 = r14 + r12
            r5 = r10
            uq8 r10 = r1.e0()     // Catch:{ all -> 0x01c3 }
            r24 = r12
            r13 = r11
            long r11 = r1.b()     // Catch:{ all -> 0x01c3 }
            r36 = 0
            r21 = 0
            r22 = 0
            r16 = 1
            r18 = 0
            r20 = 0
            r42 = r4
            r4 = r5
            r38 = r6
            r5 = r24
            kq8 r0 = r10.j2(r11, r13, r14, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x01c3 }
            r11 = r13
            r22 = r17
            long r12 = r0.b     // Catch:{ all -> 0x01c3 }
            r1.c0()     // Catch:{ all -> 0x01c3 }
            ay8 r10 = defpackage.by8.l     // Catch:{ all -> 0x01c3 }
            r14 = 0
            java.lang.Object r10 = r10.a(r14)     // Catch:{ all -> 0x01c3 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x01c3 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x01c3 }
            long r14 = (long) r10     // Catch:{ all -> 0x01c3 }
            long r12 = r12 - r14
            int r10 = (r12 > r36 ? 1 : (r12 == r36 ? 0 : -1))
            r14 = 1000(0x3e8, double:4.94E-321)
            if (r10 <= 0) goto L_0x03f6
            long r12 = r12 % r14
            int r2 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x03ed
            pz8 r2 = r1.G()     // Catch:{ all -> 0x01c3 }
            mz8 r2 = r2.g1()     // Catch:{ all -> 0x01c3 }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            nz8 r4 = defpackage.pz8.k1(r11)     // Catch:{ all -> 0x01c3 }
            long r5 = r0.b     // Catch:{ all -> 0x01c3 }
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x01c3 }
            r2.c(r4, r0, r3)     // Catch:{ all -> 0x01c3 }
        L_0x03ed:
            uq8 r0 = r1.e0()     // Catch:{ all -> 0x01c3 }
            r0.R1()     // Catch:{ all -> 0x01c3 }
            goto L_0x05e6
        L_0x03f6:
            if (r22 == 0) goto L_0x0447
            long r12 = r0.a     // Catch:{ all -> 0x01c3 }
            r1.c0()     // Catch:{ all -> 0x01c3 }
            ay8 r10 = defpackage.by8.n     // Catch:{ all -> 0x01c3 }
            r16 = r14
            r14 = 0
            java.lang.Object r10 = r10.a(r14)     // Catch:{ all -> 0x01c3 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x01c3 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x01c3 }
            long r14 = (long) r10     // Catch:{ all -> 0x01c3 }
            long r12 = r12 - r14
            int r10 = (r12 > r36 ? 1 : (r12 == r36 ? 0 : -1))
            if (r10 <= 0) goto L_0x0447
            long r12 = r12 % r16
            int r2 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x042f
            pz8 r2 = r1.G()     // Catch:{ all -> 0x01c3 }
            mz8 r2 = r2.g1()     // Catch:{ all -> 0x01c3 }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            nz8 r5 = defpackage.pz8.k1(r11)     // Catch:{ all -> 0x01c3 }
            long r6 = r0.a     // Catch:{ all -> 0x01c3 }
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x01c3 }
            r2.c(r5, r0, r4)     // Catch:{ all -> 0x01c3 }
        L_0x042f:
            r1.i0()     // Catch:{ all -> 0x01c3 }
            java.lang.String r13 = "_ev"
            java.lang.String r14 = r3.w     // Catch:{ all -> 0x01c3 }
            r15 = 0
            r12 = 16
            r10 = r23
            defpackage.d99.u1(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x01c3 }
            uq8 r0 = r1.e0()     // Catch:{ all -> 0x01c3 }
            r0.R1()     // Catch:{ all -> 0x01c3 }
            goto L_0x05e6
        L_0x0447:
            r10 = 1000000(0xf4240, float:1.401298E-39)
            if (r19 == 0) goto L_0x048b
            long r12 = r0.d     // Catch:{ all -> 0x01c3 }
            tp8 r14 = r1.c0()     // Catch:{ all -> 0x01c3 }
            ay8 r15 = defpackage.by8.m     // Catch:{ all -> 0x01c3 }
            int r14 = r14.l1(r11, r15)     // Catch:{ all -> 0x01c3 }
            int r14 = java.lang.Math.min(r10, r14)     // Catch:{ all -> 0x01c3 }
            r15 = 0
            int r14 = java.lang.Math.max(r15, r14)     // Catch:{ all -> 0x01c3 }
            long r14 = (long) r14     // Catch:{ all -> 0x01c3 }
            long r12 = r12 - r14
            int r14 = (r12 > r36 ? 1 : (r12 == r36 ? 0 : -1))
            if (r14 <= 0) goto L_0x048b
            int r2 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0482
            pz8 r2 = r1.G()     // Catch:{ all -> 0x01c3 }
            mz8 r2 = r2.g1()     // Catch:{ all -> 0x01c3 }
            java.lang.String r3 = "Too many error events logged. appId, count"
            nz8 r4 = defpackage.pz8.k1(r11)     // Catch:{ all -> 0x01c3 }
            long r5 = r0.d     // Catch:{ all -> 0x01c3 }
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x01c3 }
            r2.c(r4, r0, r3)     // Catch:{ all -> 0x01c3 }
        L_0x0482:
            uq8 r0 = r1.e0()     // Catch:{ all -> 0x01c3 }
            r0.R1()     // Catch:{ all -> 0x01c3 }
            goto L_0x05e6
        L_0x048b:
            android.os.Bundle r12 = r42.l()     // Catch:{ all -> 0x01c3 }
            d99 r0 = r1.i0()     // Catch:{ all -> 0x01c3 }
            java.lang.String r13 = "_o"
            java.lang.String r14 = r3.y     // Catch:{ all -> 0x01c3 }
            r0.t1(r12, r13, r14)     // Catch:{ all -> 0x01c3 }
            d99 r0 = r1.i0()     // Catch:{ all -> 0x01c3 }
            java.lang.String r13 = r2.X     // Catch:{ all -> 0x01c3 }
            boolean r0 = r0.H1(r11, r13)     // Catch:{ all -> 0x01c3 }
            java.lang.String r13 = "_r"
            if (r0 == 0) goto L_0x04bc
            d99 r0 = r1.i0()     // Catch:{ all -> 0x01c3 }
            java.lang.String r14 = "_dbg"
            java.lang.Long r15 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x01c3 }
            r0.t1(r12, r14, r15)     // Catch:{ all -> 0x01c3 }
            d99 r0 = r1.i0()     // Catch:{ all -> 0x01c3 }
            r0.t1(r12, r13, r15)     // Catch:{ all -> 0x01c3 }
        L_0x04bc:
            java.lang.String r0 = "_s"
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x01c3 }
            if (r0 == 0) goto L_0x04db
            uq8 r0 = r1.e0()     // Catch:{ all -> 0x01c3 }
            b99 r0 = r0.Y1(r11, r8)     // Catch:{ all -> 0x01c3 }
            if (r0 == 0) goto L_0x04db
            java.lang.Object r0 = r0.e     // Catch:{ all -> 0x01c3 }
            boolean r4 = r0 instanceof java.lang.Long     // Catch:{ all -> 0x01c3 }
            if (r4 == 0) goto L_0x04db
            d99 r4 = r1.i0()     // Catch:{ all -> 0x01c3 }
            r4.t1(r12, r8, r0)     // Catch:{ all -> 0x01c3 }
        L_0x04db:
            uq8 r4 = r1.e0()     // Catch:{ all -> 0x01c3 }
            defpackage.z65.h(r11)     // Catch:{ all -> 0x01c3 }
            r4.b1()     // Catch:{ all -> 0x01c3 }
            r4.d1()     // Catch:{ all -> 0x01c3 }
            android.database.sqlite.SQLiteDatabase r0 = r4.T1()     // Catch:{ SQLiteException -> 0x0511 }
            java.lang.Object r8 = r4.w     // Catch:{ SQLiteException -> 0x0511 }
            y19 r8 = (defpackage.y19) r8     // Catch:{ SQLiteException -> 0x0511 }
            tp8 r8 = r8.z     // Catch:{ SQLiteException -> 0x0511 }
            ay8 r14 = defpackage.by8.q     // Catch:{ SQLiteException -> 0x0511 }
            int r8 = r8.l1(r11, r14)     // Catch:{ SQLiteException -> 0x0511 }
            int r8 = java.lang.Math.min(r10, r8)     // Catch:{ SQLiteException -> 0x0511 }
            r15 = 0
            int r8 = java.lang.Math.max(r15, r8)     // Catch:{ SQLiteException -> 0x0511 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x0511 }
            java.lang.String r10 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            java.lang.String[] r8 = new java.lang.String[]{r11, r8}     // Catch:{ SQLiteException -> 0x0511 }
            int r0 = r0.delete(r7, r10, r8)     // Catch:{ SQLiteException -> 0x0511 }
            long r14 = (long) r0
            goto L_0x0529
        L_0x0511:
            r0 = move-exception
            java.lang.Object r4 = r4.w     // Catch:{ all -> 0x01c3 }
            y19 r4 = (defpackage.y19) r4     // Catch:{ all -> 0x01c3 }
            pz8 r4 = r4.G()     // Catch:{ all -> 0x01c3 }
            mz8 r4 = r4.g1()     // Catch:{ all -> 0x01c3 }
            java.lang.String r8 = "Error deleting over the limit events. appId"
            nz8 r10 = defpackage.pz8.k1(r11)     // Catch:{ all -> 0x01c3 }
            r4.c(r10, r0, r8)     // Catch:{ all -> 0x01c3 }
            r14 = r36
        L_0x0529:
            int r0 = (r14 > r36 ? 1 : (r14 == r36 ? 0 : -1))
            if (r0 <= 0) goto L_0x0542
            pz8 r0 = r1.G()     // Catch:{ all -> 0x01c3 }
            mz8 r0 = r0.h1()     // Catch:{ all -> 0x01c3 }
            java.lang.String r4 = "Data lost. Too many events stored on disk, deleted. appId"
            nz8 r8 = defpackage.pz8.k1(r11)     // Catch:{ all -> 0x01c3 }
            java.lang.Long r10 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x01c3 }
            r0.c(r8, r10, r4)     // Catch:{ all -> 0x01c3 }
        L_0x0542:
            or8 r10 = new or8     // Catch:{ all -> 0x01c3 }
            r4 = r13
            r13 = r11
            y19 r11 = r1.H     // Catch:{ all -> 0x01c3 }
            r21 = r12
            java.lang.String r12 = r3.y     // Catch:{ all -> 0x01c3 }
            java.lang.String r14 = r3.w     // Catch:{ all -> 0x01c3 }
            r39 = r5
            long r5 = r3.z     // Catch:{ all -> 0x01c3 }
            r42 = r4
            long r3 = r3.A     // Catch:{ all -> 0x01c3 }
            r19 = 0
            r17 = r3
            r15 = r5
            r4 = r42
            r10.<init>((defpackage.y19) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (long) r15, (long) r17, (long) r19, (android.os.Bundle) r21)     // Catch:{ all -> 0x01c3 }
            r0 = r10
            r3 = r11
            r11 = r13
            uq8 r5 = r1.e0()     // Catch:{ all -> 0x01c3 }
            java.lang.String r12 = r0.b     // Catch:{ all -> 0x01c3 }
            r6 = r38
            qr8 r5 = r5.C1(r6, r11, r12)     // Catch:{ all -> 0x01c3 }
            if (r5 != 0) goto L_0x060d
            uq8 r5 = r1.e0()     // Catch:{ all -> 0x01c3 }
            long r13 = r5.t1(r11)     // Catch:{ all -> 0x01c3 }
            tp8 r5 = r1.c0()     // Catch:{ all -> 0x01c3 }
            r5.getClass()     // Catch:{ all -> 0x01c3 }
            ay8 r8 = defpackage.by8.W     // Catch:{ all -> 0x01c3 }
            int r5 = r5.l1(r11, r8)     // Catch:{ all -> 0x01c3 }
            r10 = 2000(0x7d0, float:2.803E-42)
            int r5 = java.lang.Math.min(r5, r10)     // Catch:{ all -> 0x01c3 }
            r15 = 500(0x1f4, float:7.0E-43)
            int r5 = java.lang.Math.max(r5, r15)     // Catch:{ all -> 0x01c3 }
            r16 = r11
            long r10 = (long) r5     // Catch:{ all -> 0x01c3 }
            int r5 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r5 < 0) goto L_0x05ee
            if (r22 == 0) goto L_0x05ee
            d99 r5 = r1.i0()     // Catch:{ all -> 0x01c3 }
            boolean r5 = r5.k2(r12)     // Catch:{ all -> 0x01c3 }
            if (r5 != 0) goto L_0x05ee
            pz8 r0 = r1.G()     // Catch:{ all -> 0x01c3 }
            mz8 r0 = r0.g1()     // Catch:{ all -> 0x01c3 }
            java.lang.String r2 = "Too many event names used, ignoring event. appId, name, supported count"
            nz8 r4 = defpackage.pz8.k1(r16)     // Catch:{ all -> 0x01c3 }
            fz8 r3 = r3.h()     // Catch:{ all -> 0x01c3 }
            java.lang.String r3 = r3.a(r12)     // Catch:{ all -> 0x01c3 }
            tp8 r5 = r1.c0()     // Catch:{ all -> 0x01c3 }
            r5.getClass()     // Catch:{ all -> 0x01c3 }
            r11 = r16
            int r5 = r5.l1(r11, r8)     // Catch:{ all -> 0x01c3 }
            r6 = 2000(0x7d0, float:2.803E-42)
            int r5 = java.lang.Math.min(r5, r6)     // Catch:{ all -> 0x01c3 }
            int r5 = java.lang.Math.max(r5, r15)     // Catch:{ all -> 0x01c3 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x01c3 }
            r0.d(r2, r4, r3, r5)     // Catch:{ all -> 0x01c3 }
            r1.i0()     // Catch:{ all -> 0x01c3 }
            r14 = 0
            r15 = 0
            r12 = 8
            r13 = 0
            r10 = r23
            defpackage.d99.u1(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x01c3 }
        L_0x05e6:
            uq8 r0 = r1.e0()
            r0.S1()
            return
        L_0x05ee:
            r11 = r16
            r8 = r23
            qr8 r10 = new qr8     // Catch:{ all -> 0x01c3 }
            long r13 = r0.d     // Catch:{ all -> 0x01c3 }
            r25 = 0
            r26 = 0
            r19 = r13
            r13 = 0
            r15 = 0
            r17 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r10.<init>(r11, r12, r13, r15, r17, r19, r21, r23, r24, r25, r26)     // Catch:{ all -> 0x01c3 }
            r5 = r0
            goto L_0x061d
        L_0x060d:
            r8 = r23
            long r12 = r5.f     // Catch:{ all -> 0x01c3 }
            or8 r10 = r0.a(r3, r12)     // Catch:{ all -> 0x01c3 }
            long r12 = r10.d     // Catch:{ all -> 0x01c3 }
            qr8 r0 = r5.a(r12)     // Catch:{ all -> 0x01c3 }
            r5 = r10
            r10 = r0
        L_0x061d:
            uq8 r0 = r1.e0()     // Catch:{ all -> 0x01c3 }
            r0.D1(r6, r10)     // Catch:{ all -> 0x01c3 }
            r19 r0 = r1.n0()     // Catch:{ all -> 0x01c3 }
            r0.b1()     // Catch:{ all -> 0x01c3 }
            r1.j0()     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r5.a     // Catch:{ all -> 0x01c3 }
            defpackage.z65.h(r0)     // Catch:{ all -> 0x01c3 }
            boolean r0 = r0.equals(r11)     // Catch:{ all -> 0x01c3 }
            defpackage.z65.f(r0)     // Catch:{ all -> 0x01c3 }
            x19 r6 = defpackage.b29.Y()     // Catch:{ all -> 0x01c3 }
            r6.x()     // Catch:{ all -> 0x01c3 }
            r6.i()     // Catch:{ all -> 0x01c3 }
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x01c3 }
            if (r0 != 0) goto L_0x064d
            r6.o(r11)     // Catch:{ all -> 0x01c3 }
        L_0x064d:
            java.lang.String r0 = r2.z     // Catch:{ all -> 0x01c3 }
            boolean r10 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01c3 }
            if (r10 != 0) goto L_0x0658
            r6.m(r0)     // Catch:{ all -> 0x01c3 }
        L_0x0658:
            java.lang.String r10 = r2.y     // Catch:{ all -> 0x01c3 }
            boolean r12 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x01c3 }
            if (r12 != 0) goto L_0x0663
            r6.p(r10)     // Catch:{ all -> 0x01c3 }
        L_0x0663:
            java.lang.String r12 = r2.Q     // Catch:{ all -> 0x01c3 }
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x01c3 }
            if (r13 != 0) goto L_0x066e
            r6.Q(r12)     // Catch:{ all -> 0x01c3 }
        L_0x066e:
            long r13 = r2.F     // Catch:{ all -> 0x01c3 }
            r15 = -2147483648(0xffffffff80000000, double:NaN)
            int r15 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r15 == 0) goto L_0x067b
            int r15 = (int) r13     // Catch:{ all -> 0x01c3 }
            r6.K(r15)     // Catch:{ all -> 0x01c3 }
        L_0x067b:
            r15 = r12
            r16 = r13
            long r12 = r2.A     // Catch:{ all -> 0x01c3 }
            r6.q(r12)     // Catch:{ all -> 0x01c3 }
            boolean r14 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x01c3 }
            if (r14 != 0) goto L_0x068c
            r6.G(r9)     // Catch:{ all -> 0x01c3 }
        L_0x068c:
            defpackage.z65.k(r11)     // Catch:{ all -> 0x01c3 }
            h39 r14 = r1.a(r11)     // Catch:{ all -> 0x01c3 }
            r42 = r15
            java.lang.String r15 = r2.O     // Catch:{ all -> 0x01c3 }
            r18 = r7
            r19 = r12
            r7 = 100
            h39 r12 = defpackage.h39.c(r7, r15)     // Catch:{ all -> 0x01c3 }
            h39 r7 = r14.j(r12)     // Catch:{ all -> 0x01c3 }
            java.lang.String r12 = r7.f()     // Catch:{ all -> 0x01c3 }
            r6.P(r12)     // Catch:{ all -> 0x01c3 }
            defpackage.wo8.a()     // Catch:{ all -> 0x01c3 }
            tp8 r12 = r1.c0()     // Catch:{ all -> 0x01c3 }
            ay8 r13 = defpackage.by8.O0     // Catch:{ all -> 0x01c3 }
            boolean r12 = r12.n1(r11, r13)     // Catch:{ all -> 0x01c3 }
            f39 r13 = defpackage.f39.AD_STORAGE
            if (r12 == 0) goto L_0x0772
            r1.i0()     // Catch:{ all -> 0x01c3 }
            ay8 r12 = defpackage.by8.q0     // Catch:{ all -> 0x01c3 }
            r14 = 0
            java.lang.Object r12 = r12.a(r14)     // Catch:{ all -> 0x01c3 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x01c3 }
            boolean r12 = defpackage.d99.E1(r12, r11)     // Catch:{ all -> 0x01c3 }
            if (r12 == 0) goto L_0x0772
            int r12 = r2.V     // Catch:{ all -> 0x01c3 }
            r6.y(r12)     // Catch:{ all -> 0x01c3 }
            r12 = r9
            r14 = r10
            long r9 = r2.W     // Catch:{ all -> 0x01c3 }
            boolean r7 = r7.i(r13)     // Catch:{ all -> 0x01c3 }
            r21 = 32
            if (r7 != 0) goto L_0x06ea
            int r7 = (r9 > r36 ? 1 : (r9 == r36 ? 0 : -1))
            if (r7 == 0) goto L_0x06ea
            r23 = -2
            long r9 = r9 & r23
            long r9 = r9 | r21
        L_0x06ea:
            int r7 = (r9 > r39 ? 1 : (r9 == r39 ? 0 : -1))
            if (r7 != 0) goto L_0x06f1
            r7 = r30
            goto L_0x06f2
        L_0x06f1:
            r7 = 0
        L_0x06f2:
            r6.S(r7)     // Catch:{ all -> 0x01c3 }
            int r7 = (r9 > r36 ? 1 : (r9 == r36 ? 0 : -1))
            if (r7 != 0) goto L_0x06fb
            goto L_0x0774
        L_0x06fb:
            j09 r7 = defpackage.k09.A()     // Catch:{ all -> 0x01c3 }
            long r23 = r9 & r39
            int r23 = (r23 > r36 ? 1 : (r23 == r36 ? 0 : -1))
            if (r23 == 0) goto L_0x070a
            r23 = r9
            r9 = r30
            goto L_0x070d
        L_0x070a:
            r23 = r9
            r9 = 0
        L_0x070d:
            r7.g(r9)     // Catch:{ all -> 0x01c3 }
            r9 = 2
            long r9 = r23 & r9
            int r9 = (r9 > r36 ? 1 : (r9 == r36 ? 0 : -1))
            if (r9 == 0) goto L_0x071b
            r9 = r30
            goto L_0x071c
        L_0x071b:
            r9 = 0
        L_0x071c:
            r7.h(r9)     // Catch:{ all -> 0x01c3 }
            r9 = 4
            long r9 = r23 & r9
            int r9 = (r9 > r36 ? 1 : (r9 == r36 ? 0 : -1))
            if (r9 == 0) goto L_0x072a
            r9 = r30
            goto L_0x072b
        L_0x072a:
            r9 = 0
        L_0x072b:
            r7.i(r9)     // Catch:{ all -> 0x01c3 }
            r9 = 8
            long r9 = r23 & r9
            int r9 = (r9 > r36 ? 1 : (r9 == r36 ? 0 : -1))
            if (r9 == 0) goto L_0x0739
            r9 = r30
            goto L_0x073a
        L_0x0739:
            r9 = 0
        L_0x073a:
            r7.j(r9)     // Catch:{ all -> 0x01c3 }
            r9 = 16
            long r9 = r23 & r9
            int r9 = (r9 > r36 ? 1 : (r9 == r36 ? 0 : -1))
            if (r9 == 0) goto L_0x0748
            r9 = r30
            goto L_0x0749
        L_0x0748:
            r9 = 0
        L_0x0749:
            r7.k(r9)     // Catch:{ all -> 0x01c3 }
            long r9 = r23 & r21
            int r9 = (r9 > r36 ? 1 : (r9 == r36 ? 0 : -1))
            if (r9 == 0) goto L_0x0755
            r9 = r30
            goto L_0x0756
        L_0x0755:
            r9 = 0
        L_0x0756:
            r7.l(r9)     // Catch:{ all -> 0x01c3 }
            r9 = 64
            long r9 = r23 & r9
            int r9 = (r9 > r36 ? 1 : (r9 == r36 ? 0 : -1))
            if (r9 == 0) goto L_0x0764
            r9 = r30
            goto L_0x0765
        L_0x0764:
            r9 = 0
        L_0x0765:
            r7.m(r9)     // Catch:{ all -> 0x01c3 }
            nl8 r7 = r7.d()     // Catch:{ all -> 0x01c3 }
            k09 r7 = (defpackage.k09) r7     // Catch:{ all -> 0x01c3 }
            r6.z(r7)     // Catch:{ all -> 0x01c3 }
            goto L_0x0774
        L_0x0772:
            r12 = r9
            r14 = r10
        L_0x0774:
            long r9 = r2.B     // Catch:{ all -> 0x01c3 }
            int r7 = (r9 > r36 ? 1 : (r9 == r36 ? 0 : -1))
            if (r7 == 0) goto L_0x077d
            r6.v(r9)     // Catch:{ all -> 0x01c3 }
        L_0x077d:
            r21 = r9
            long r9 = r2.M     // Catch:{ all -> 0x01c3 }
            r6.N(r9)     // Catch:{ all -> 0x01c3 }
            tp8 r7 = r1.c0()     // Catch:{ all -> 0x01c3 }
            r23 = r12
            ay8 r12 = defpackage.by8.U0     // Catch:{ all -> 0x01c3 }
            r24 = r14
            r14 = 0
            boolean r7 = r7.n1(r14, r12)     // Catch:{ all -> 0x01c3 }
            if (r7 == 0) goto L_0x079f
            r1.c0()     // Catch:{ all -> 0x01c3 }
            java.lang.String r7 = defpackage.pn8.a()     // Catch:{ all -> 0x01c3 }
            r6.D(r7)     // Catch:{ all -> 0x01c3 }
        L_0x079f:
            tp8 r7 = r1.c0()     // Catch:{ all -> 0x01c3 }
            ay8 r12 = defpackage.by8.V0     // Catch:{ all -> 0x01c3 }
            r14 = 0
            boolean r7 = r7.n1(r14, r12)     // Catch:{ all -> 0x01c3 }
            if (r7 == 0) goto L_0x07b9
            j19 r7 = r1.d0()     // Catch:{ all -> 0x01c3 }
            java.util.List r7 = r7.t1(r11)     // Catch:{ all -> 0x01c3 }
            if (r7 == 0) goto L_0x07b9
            r6.M(r7)     // Catch:{ all -> 0x01c3 }
        L_0x07b9:
            h39 r7 = r1.a(r11)     // Catch:{ all -> 0x01c3 }
            r12 = 100
            h39 r12 = defpackage.h39.c(r12, r15)     // Catch:{ all -> 0x01c3 }
            h39 r7 = r7.j(r12)     // Catch:{ all -> 0x01c3 }
            boolean r12 = r7.i(r13)     // Catch:{ all -> 0x01c3 }
            if (r12 == 0) goto L_0x087a
            boolean r12 = r2.J     // Catch:{ all -> 0x0853 }
            if (r12 == 0) goto L_0x087a
            u69 r14 = r1.E     // Catch:{ all -> 0x0853 }
            android.util.Pair r14 = r14.g1(r2, r7)     // Catch:{ all -> 0x0853 }
            java.lang.Object r15 = r14.first     // Catch:{ all -> 0x0853 }
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15     // Catch:{ all -> 0x0853 }
            boolean r15 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0853 }
            if (r15 != 0) goto L_0x087a
            if (r12 == 0) goto L_0x087a
            java.lang.Object r12 = r14.first     // Catch:{ all -> 0x0853 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0853 }
            r6.s(r12)     // Catch:{ all -> 0x0853 }
            java.lang.Object r12 = r14.second     // Catch:{ all -> 0x0853 }
            if (r12 == 0) goto L_0x07f7
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ all -> 0x01c3 }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x01c3 }
            r6.t(r12)     // Catch:{ all -> 0x01c3 }
        L_0x07f7:
            java.lang.String r12 = r5.b     // Catch:{ all -> 0x0853 }
            r15 = r34
            boolean r12 = r12.equals(r15)     // Catch:{ all -> 0x0853 }
            if (r12 != 0) goto L_0x087a
            java.lang.Object r12 = r14.first     // Catch:{ all -> 0x0853 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0853 }
            java.lang.String r14 = "00000000-0000-0000-0000-000000000000"
            boolean r12 = r12.equals(r14)     // Catch:{ all -> 0x0853 }
            if (r12 != 0) goto L_0x087a
            uq8 r12 = r1.e0()     // Catch:{ all -> 0x0853 }
            c09 r12 = r12.g2(r11)     // Catch:{ all -> 0x0853 }
            if (r12 == 0) goto L_0x087a
            y19 r14 = r12.a     // Catch:{ all -> 0x0853 }
            r19 r14 = r14.C     // Catch:{ all -> 0x0853 }
            defpackage.y19.g(r14)     // Catch:{ all -> 0x0853 }
            r14.b1()     // Catch:{ all -> 0x0853 }
            boolean r14 = r12.y     // Catch:{ all -> 0x0853 }
            if (r14 == 0) goto L_0x087a
            r25 = r5
            r5 = 0
            r14 = 0
            r1.p(r11, r5, r14, r14)     // Catch:{ all -> 0x0853 }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x0853 }
            r5.<init>()     // Catch:{ all -> 0x0853 }
            y19 r14 = r12.a     // Catch:{ all -> 0x0853 }
            r19 r14 = r14.C     // Catch:{ all -> 0x0853 }
            defpackage.y19.g(r14)     // Catch:{ all -> 0x0853 }
            r14.b1()     // Catch:{ all -> 0x0853 }
            java.lang.Long r14 = r12.z     // Catch:{ all -> 0x0853 }
            if (r14 == 0) goto L_0x0858
            r26 = r14
            java.lang.String r14 = "_pfo"
            r34 = r9
            long r9 = r26.longValue()     // Catch:{ all -> 0x0853 }
            r1 = r36
            long r9 = java.lang.Math.max(r1, r9)     // Catch:{ all -> 0x0853 }
            r5.putLong(r14, r9)     // Catch:{ all -> 0x0853 }
            goto L_0x085a
        L_0x0853:
            r0 = move-exception
            r3 = r41
            goto L_0x0bc8
        L_0x0858:
            r34 = r9
        L_0x085a:
            y19 r1 = r12.a     // Catch:{ all -> 0x0853 }
            r19 r1 = r1.C     // Catch:{ all -> 0x0853 }
            defpackage.y19.g(r1)     // Catch:{ all -> 0x0853 }
            r1.b1()     // Catch:{ all -> 0x0853 }
            java.lang.Long r1 = r12.A     // Catch:{ all -> 0x0853 }
            if (r1 == 0) goto L_0x0871
            java.lang.String r2 = "_uwa"
            long r9 = r1.longValue()     // Catch:{ all -> 0x0853 }
            r5.putLong(r2, r9)     // Catch:{ all -> 0x0853 }
        L_0x0871:
            r1 = r39
            r5.putLong(r4, r1)     // Catch:{ all -> 0x0853 }
            r8.f(r11, r15, r5)     // Catch:{ all -> 0x0853 }
            goto L_0x087e
        L_0x087a:
            r25 = r5
            r34 = r9
        L_0x087e:
            kr8 r1 = r3.k()     // Catch:{ all -> 0x0853 }
            r1.e1()     // Catch:{ all -> 0x0853 }
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ all -> 0x0853 }
            r6.j()     // Catch:{ all -> 0x0853 }
            kr8 r1 = r3.k()     // Catch:{ all -> 0x0853 }
            r1.e1()     // Catch:{ all -> 0x0853 }
            java.lang.String r1 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0853 }
            r6.b()     // Catch:{ all -> 0x0853 }
            nl8 r2 = r6.x     // Catch:{ all -> 0x0853 }
            b29 r2 = (defpackage.b29) r2     // Catch:{ all -> 0x0853 }
            r2.s0(r1)     // Catch:{ all -> 0x0853 }
            kr8 r1 = r3.k()     // Catch:{ all -> 0x0853 }
            long r1 = r1.g1()     // Catch:{ all -> 0x0853 }
            int r1 = (int) r1     // Catch:{ all -> 0x0853 }
            r6.l(r1)     // Catch:{ all -> 0x0853 }
            kr8 r1 = r3.k()     // Catch:{ all -> 0x0853 }
            java.lang.String r1 = r1.h1()     // Catch:{ all -> 0x0853 }
            r6.k(r1)     // Catch:{ all -> 0x0853 }
            r2 = r43
            long r8 = r2.S     // Catch:{ all -> 0x0853 }
            r6.R(r8)     // Catch:{ all -> 0x0853 }
            boolean r1 = r3.a()     // Catch:{ all -> 0x0853 }
            if (r1 == 0) goto L_0x08d7
            r6.n()     // Catch:{ all -> 0x0853 }
            r14 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x0853 }
            if (r1 == 0) goto L_0x08cc
            goto L_0x08d7
        L_0x08cc:
            r6.b()     // Catch:{ all -> 0x0853 }
            nl8 r0 = r6.x     // Catch:{ all -> 0x0853 }
            b29 r0 = (defpackage.b29) r0     // Catch:{ all -> 0x0853 }
            r0.V0(r14)     // Catch:{ all -> 0x0853 }
            throw r14     // Catch:{ all -> 0x0853 }
        L_0x08d7:
            uq8 r1 = r41.e0()     // Catch:{ all -> 0x0853 }
            c09 r1 = r1.g2(r11)     // Catch:{ all -> 0x0853 }
            if (r1 != 0) goto L_0x0941
            c09 r1 = new c09     // Catch:{ all -> 0x0853 }
            r1.<init>(r3, r11)     // Catch:{ all -> 0x0853 }
            r3 = r41
            java.lang.String r5 = r3.j(r7)     // Catch:{ all -> 0x090b }
            r1.G(r5)     // Catch:{ all -> 0x090b }
            java.lang.String r5 = r2.G     // Catch:{ all -> 0x090b }
            r1.L(r5)     // Catch:{ all -> 0x090b }
            r9 = r23
            r1.I(r9)     // Catch:{ all -> 0x090b }
            boolean r5 = r7.i(r13)     // Catch:{ all -> 0x090b }
            if (r5 == 0) goto L_0x0908
            u69 r5 = r3.E     // Catch:{ all -> 0x090b }
            java.lang.String r2 = r5.i1(r2, r7)     // Catch:{ all -> 0x090b }
            r1.J(r2)     // Catch:{ all -> 0x090b }
        L_0x0908:
            r8 = 0
            goto L_0x090e
        L_0x090b:
            r0 = move-exception
            goto L_0x0bc8
        L_0x090e:
            r1.e(r8)     // Catch:{ all -> 0x090b }
            r1.M(r8)     // Catch:{ all -> 0x090b }
            r1.N(r8)     // Catch:{ all -> 0x090b }
            r14 = r24
            r1.P(r14)     // Catch:{ all -> 0x090b }
            r8 = r16
            r1.R(r8)     // Catch:{ all -> 0x090b }
            r1.S(r0)     // Catch:{ all -> 0x090b }
            r8 = r19
            r1.T(r8)     // Catch:{ all -> 0x090b }
            r8 = r21
            r1.a(r8)     // Catch:{ all -> 0x090b }
            r2 = r32
            r1.d(r2)     // Catch:{ all -> 0x090b }
            r8 = r34
            r1.c(r8)     // Catch:{ all -> 0x090b }
            uq8 r0 = r3.e0()     // Catch:{ all -> 0x090b }
            r15 = 0
            r0.h2(r1, r15)     // Catch:{ all -> 0x090b }
            goto L_0x0944
        L_0x0941:
            r15 = 0
            r3 = r41
        L_0x0944:
            f39 r0 = defpackage.f39.ANALYTICS_STORAGE     // Catch:{ all -> 0x090b }
            boolean r0 = r7.i(r0)     // Catch:{ all -> 0x090b }
            if (r0 == 0) goto L_0x0960
            java.lang.String r0 = r1.F()     // Catch:{ all -> 0x090b }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x090b }
            if (r0 != 0) goto L_0x0960
            java.lang.String r0 = r1.F()     // Catch:{ all -> 0x090b }
            defpackage.z65.k(r0)     // Catch:{ all -> 0x090b }
            r6.u(r0)     // Catch:{ all -> 0x090b }
        L_0x0960:
            java.lang.String r0 = r1.K()     // Catch:{ all -> 0x090b }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x090b }
            if (r0 != 0) goto L_0x0974
            java.lang.String r0 = r1.K()     // Catch:{ all -> 0x090b }
            defpackage.z65.k(r0)     // Catch:{ all -> 0x090b }
            r6.J(r0)     // Catch:{ all -> 0x090b }
        L_0x0974:
            uq8 r0 = r3.e0()     // Catch:{ all -> 0x090b }
            java.util.List r0 = r0.Z1(r11)     // Catch:{ all -> 0x090b }
            r14 = r15
        L_0x097d:
            int r2 = r0.size()     // Catch:{ all -> 0x090b }
            if (r14 >= r2) goto L_0x0a1d
            l29 r2 = defpackage.m29.E()     // Catch:{ all -> 0x090b }
            java.lang.Object r5 = r0.get(r14)     // Catch:{ all -> 0x090b }
            b99 r5 = (defpackage.b99) r5     // Catch:{ all -> 0x090b }
            java.lang.String r5 = r5.c     // Catch:{ all -> 0x090b }
            r2.b()     // Catch:{ all -> 0x090b }
            nl8 r7 = r2.x     // Catch:{ all -> 0x090b }
            m29 r7 = (defpackage.m29) r7     // Catch:{ all -> 0x090b }
            r7.G(r5)     // Catch:{ all -> 0x090b }
            java.lang.Object r5 = r0.get(r14)     // Catch:{ all -> 0x090b }
            b99 r5 = (defpackage.b99) r5     // Catch:{ all -> 0x090b }
            long r7 = r5.d     // Catch:{ all -> 0x090b }
            r2.b()     // Catch:{ all -> 0x090b }
            nl8 r5 = r2.x     // Catch:{ all -> 0x090b }
            m29 r5 = (defpackage.m29) r5     // Catch:{ all -> 0x090b }
            r5.F(r7)     // Catch:{ all -> 0x090b }
            y89 r5 = r3.h0()     // Catch:{ all -> 0x090b }
            java.lang.Object r7 = r0.get(r14)     // Catch:{ all -> 0x090b }
            b99 r7 = (defpackage.b99) r7     // Catch:{ all -> 0x090b }
            java.lang.Object r7 = r7.e     // Catch:{ all -> 0x090b }
            r5.z1(r2, r7)     // Catch:{ all -> 0x090b }
            r6.Y(r2)     // Catch:{ all -> 0x090b }
            java.lang.String r2 = "_sid"
            java.lang.Object r5 = r0.get(r14)     // Catch:{ all -> 0x090b }
            b99 r5 = (defpackage.b99) r5     // Catch:{ all -> 0x090b }
            java.lang.String r5 = r5.c     // Catch:{ all -> 0x090b }
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x090b }
            if (r2 == 0) goto L_0x0a15
            y19 r2 = r1.a     // Catch:{ all -> 0x090b }
            r19 r2 = r2.C     // Catch:{ all -> 0x090b }
            defpackage.y19.g(r2)     // Catch:{ all -> 0x090b }
            r2.b1()     // Catch:{ all -> 0x090b }
            long r7 = r1.w     // Catch:{ all -> 0x090b }
            r36 = 0
            int r2 = (r7 > r36 ? 1 : (r7 == r36 ? 0 : -1))
            if (r2 == 0) goto L_0x0a15
            y89 r2 = r3.h0()     // Catch:{ all -> 0x090b }
            boolean r5 = android.text.TextUtils.isEmpty(r42)     // Catch:{ all -> 0x090b }
            if (r5 == 0) goto L_0x09ee
            r7 = r42
            r12 = 0
            goto L_0x09fa
        L_0x09ee:
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x090b }
            r7 = r42
            byte[] r5 = r7.getBytes(r5)     // Catch:{ all -> 0x090b }
            long r12 = r2.L1(r5)     // Catch:{ all -> 0x090b }
        L_0x09fa:
            y19 r2 = r1.a     // Catch:{ all -> 0x090b }
            r19 r2 = r2.C     // Catch:{ all -> 0x090b }
            defpackage.y19.g(r2)     // Catch:{ all -> 0x090b }
            r2.b1()     // Catch:{ all -> 0x090b }
            long r8 = r1.w     // Catch:{ all -> 0x090b }
            int r2 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0a17
            r6.b()     // Catch:{ all -> 0x090b }
            nl8 r2 = r6.x     // Catch:{ all -> 0x090b }
            b29 r2 = (defpackage.b29) r2     // Catch:{ all -> 0x090b }
            r2.d1()     // Catch:{ all -> 0x090b }
            goto L_0x0a17
        L_0x0a15:
            r7 = r42
        L_0x0a17:
            int r14 = r14 + 1
            r42 = r7
            goto L_0x097d
        L_0x0a1d:
            uq8 r1 = r3.e0()     // Catch:{ IOException -> 0x0b65 }
            nl8 r0 = r6.d()     // Catch:{ IOException -> 0x0b65 }
            r2 = r0
            b29 r2 = (defpackage.b29) r2     // Catch:{ IOException -> 0x0b65 }
            r1.b1()     // Catch:{ IOException -> 0x0b65 }
            r1.d1()     // Catch:{ IOException -> 0x0b65 }
            java.lang.String r0 = r2.t()     // Catch:{ IOException -> 0x0b65 }
            defpackage.z65.h(r0)     // Catch:{ IOException -> 0x0b65 }
            byte[] r0 = r2.a()     // Catch:{ IOException -> 0x0b65 }
            v89 r5 = r1.x     // Catch:{ IOException -> 0x0b65 }
            y89 r5 = r5.h0()     // Catch:{ IOException -> 0x0b65 }
            long r7 = r5.L1(r0)     // Catch:{ IOException -> 0x0b65 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ IOException -> 0x0b65 }
            r5.<init>()     // Catch:{ IOException -> 0x0b65 }
            java.lang.String r9 = r2.t()     // Catch:{ IOException -> 0x0b65 }
            r10 = r31
            r5.put(r10, r9)     // Catch:{ IOException -> 0x0b65 }
            java.lang.Long r9 = java.lang.Long.valueOf(r7)     // Catch:{ IOException -> 0x0b65 }
            r11 = r29
            r5.put(r11, r9)     // Catch:{ IOException -> 0x0b65 }
            java.lang.String r9 = "metadata"
            r5.put(r9, r0)     // Catch:{ IOException -> 0x0b65 }
            android.database.sqlite.SQLiteDatabase r0 = r1.T1()     // Catch:{ SQLiteException -> 0x0b67 }
            java.lang.String r9 = "raw_events_metadata"
            r12 = 4
            r14 = 0
            r0.insertWithOnConflict(r9, r14, r5, r12)     // Catch:{ SQLiteException -> 0x0b67 }
            uq8 r1 = r3.e0()     // Catch:{ all -> 0x090b }
            r2 = r25
            ur8 r0 = r2.g     // Catch:{ all -> 0x090b }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x090b }
            android.os.Bundle r0 = r0.w     // Catch:{ all -> 0x090b }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x090b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x090b }
        L_0x0a7f:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x090b }
            if (r5 == 0) goto L_0x0a92
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x090b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x090b }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x090b }
            if (r5 == 0) goto L_0x0a7f
            goto L_0x0acc
        L_0x0a92:
            j19 r0 = r3.d0()     // Catch:{ all -> 0x090b }
            java.lang.String r4 = r2.a     // Catch:{ all -> 0x090b }
            java.lang.String r5 = r2.b     // Catch:{ all -> 0x090b }
            boolean r0 = r0.s1(r4, r5)     // Catch:{ all -> 0x090b }
            uq8 r19 = r3.e0()     // Catch:{ all -> 0x090b }
            long r20 = r3.b()     // Catch:{ all -> 0x090b }
            r25 = 0
            r26 = 0
            r23 = 0
            r24 = 0
            r22 = r4
            kq8 r4 = r19.i2(r20, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x090b }
            r5 = r22
            if (r0 == 0) goto L_0x0aca
            long r12 = r4.e     // Catch:{ all -> 0x090b }
            tp8 r0 = r3.c0()     // Catch:{ all -> 0x090b }
            ay8 r4 = defpackage.by8.p     // Catch:{ all -> 0x090b }
            int r0 = r0.l1(r5, r4)     // Catch:{ all -> 0x090b }
            long r4 = (long) r0     // Catch:{ all -> 0x090b }
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0aca
            goto L_0x0acc
        L_0x0aca:
            r30 = r15
        L_0x0acc:
            r1.b1()     // Catch:{ all -> 0x090b }
            r1.d1()     // Catch:{ all -> 0x090b }
            java.lang.String r0 = r2.a     // Catch:{ all -> 0x090b }
            defpackage.z65.h(r0)     // Catch:{ all -> 0x090b }
            v89 r4 = r1.x     // Catch:{ all -> 0x090b }
            y89 r4 = r4.h0()     // Catch:{ all -> 0x090b }
            h19 r4 = r4.C1(r2)     // Catch:{ all -> 0x090b }
            byte[] r4 = r4.a()     // Catch:{ all -> 0x090b }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x090b }
            r5.<init>()     // Catch:{ all -> 0x090b }
            r5.put(r10, r0)     // Catch:{ all -> 0x090b }
            java.lang.String r6 = "name"
            java.lang.String r9 = r2.b     // Catch:{ all -> 0x090b }
            r5.put(r6, r9)     // Catch:{ all -> 0x090b }
            java.lang.String r6 = "timestamp"
            long r9 = r2.d     // Catch:{ all -> 0x090b }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x090b }
            r5.put(r6, r9)     // Catch:{ all -> 0x090b }
            java.lang.Long r6 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x090b }
            r5.put(r11, r6)     // Catch:{ all -> 0x090b }
            java.lang.String r6 = "data"
            r5.put(r6, r4)     // Catch:{ all -> 0x090b }
            java.lang.String r4 = "realtime"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r30)     // Catch:{ all -> 0x090b }
            r5.put(r4, r6)     // Catch:{ all -> 0x090b }
            java.lang.String r4 = "elapsed_time"
            long r6 = r2.e     // Catch:{ all -> 0x090b }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x090b }
            r5.put(r4, r6)     // Catch:{ all -> 0x090b }
            android.database.sqlite.SQLiteDatabase r4 = r1.T1()     // Catch:{ SQLiteException -> 0x0b46 }
            r6 = r18
            r14 = 0
            long r4 = r4.insert(r6, r14, r5)     // Catch:{ SQLiteException -> 0x0b46 }
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0b48
            java.lang.Object r4 = r1.w     // Catch:{ SQLiteException -> 0x0b46 }
            y19 r4 = (defpackage.y19) r4     // Catch:{ SQLiteException -> 0x0b46 }
            pz8 r4 = r4.G()     // Catch:{ SQLiteException -> 0x0b46 }
            mz8 r4 = r4.g1()     // Catch:{ SQLiteException -> 0x0b46 }
            java.lang.String r5 = "Failed to insert raw event (got -1). appId"
            nz8 r0 = defpackage.pz8.k1(r0)     // Catch:{ SQLiteException -> 0x0b46 }
            r4.b(r5, r0)     // Catch:{ SQLiteException -> 0x0b46 }
            goto L_0x0b97
        L_0x0b46:
            r0 = move-exception
            goto L_0x0b4d
        L_0x0b48:
            r8 = 0
            r3.K = r8     // Catch:{ all -> 0x090b }
            goto L_0x0b97
        L_0x0b4d:
            java.lang.Object r1 = r1.w     // Catch:{ all -> 0x090b }
            y19 r1 = (defpackage.y19) r1     // Catch:{ all -> 0x090b }
            pz8 r1 = r1.G()     // Catch:{ all -> 0x090b }
            mz8 r1 = r1.g1()     // Catch:{ all -> 0x090b }
            java.lang.String r4 = "Error storing raw event. appId"
            java.lang.String r2 = r2.a     // Catch:{ all -> 0x090b }
            nz8 r2 = defpackage.pz8.k1(r2)     // Catch:{ all -> 0x090b }
            r1.c(r2, r0, r4)     // Catch:{ all -> 0x090b }
            goto L_0x0b97
        L_0x0b65:
            r0 = move-exception
            goto L_0x0b82
        L_0x0b67:
            r0 = move-exception
            java.lang.Object r1 = r1.w     // Catch:{ IOException -> 0x0b65 }
            y19 r1 = (defpackage.y19) r1     // Catch:{ IOException -> 0x0b65 }
            pz8 r1 = r1.G()     // Catch:{ IOException -> 0x0b65 }
            mz8 r1 = r1.g1()     // Catch:{ IOException -> 0x0b65 }
            java.lang.String r4 = "Error storing raw event metadata. appId"
            java.lang.String r2 = r2.t()     // Catch:{ IOException -> 0x0b65 }
            nz8 r2 = defpackage.pz8.k1(r2)     // Catch:{ IOException -> 0x0b65 }
            r1.c(r2, r0, r4)     // Catch:{ IOException -> 0x0b65 }
            throw r0     // Catch:{ IOException -> 0x0b65 }
        L_0x0b82:
            pz8 r1 = r3.G()     // Catch:{ all -> 0x090b }
            mz8 r1 = r1.g1()     // Catch:{ all -> 0x090b }
            java.lang.String r2 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r4 = r6.n()     // Catch:{ all -> 0x090b }
            nz8 r4 = defpackage.pz8.k1(r4)     // Catch:{ all -> 0x090b }
            r1.c(r4, r0, r2)     // Catch:{ all -> 0x090b }
        L_0x0b97:
            uq8 r0 = r3.e0()     // Catch:{ all -> 0x090b }
            r0.R1()     // Catch:{ all -> 0x090b }
            uq8 r0 = r3.e0()
            r0.S1()
            r3.K()
            pz8 r0 = r3.G()
            mz8 r0 = r0.j1()
            long r1 = java.lang.System.nanoTime()
            long r1 = r1 - r27
            r3 = 500000(0x7a120, double:2.47033E-318)
            long r1 = r1 + r3
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 / r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "Background event processing time, ms"
            r0.b(r2, r1)
            return
        L_0x0bc8:
            uq8 r1 = r3.e0()
            r1.S1()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v89.g(zr8, z99):void");
    }

    public final dl8 g0() {
        dl8 dl8 = this.B;
        R(dl8);
        return dl8;
    }

    public final void h(c09 c09, x19 x19) {
        rg4 rg4;
        m29 m29;
        boolean z2;
        xp8 xp8;
        x19 x192 = x19;
        n0().b1();
        j0();
        String F0 = ((b29) x192.x).F0();
        EnumMap enumMap = new EnumMap(f39.class);
        int length = F0.length();
        int length2 = f39.values().length;
        xp8 xp82 = xp8.UNSET;
        int i = 0;
        if (length < length2 || F0.charAt(0) != '1') {
            rg4 = new rg4(18);
        } else {
            f39[] values = f39.values();
            int length3 = values.length;
            int i2 = 0;
            int i3 = 1;
            while (i2 < length3) {
                f39 f39 = values[i2];
                int i4 = i3 + 1;
                char charAt = F0.charAt(i3);
                xp8[] values2 = xp8.values();
                int length4 = values2.length;
                int i5 = i;
                while (true) {
                    if (i5 >= length4) {
                        xp8 = xp82;
                        break;
                    }
                    xp8 = values2[i5];
                    if (xp8.w == charAt) {
                        break;
                    }
                    i5++;
                }
                enumMap.put(f39, xp8);
                i2++;
                i3 = i4;
                i = 0;
            }
            rg4 = new rg4(enumMap);
        }
        String E2 = c09.E();
        n0().b1();
        j0();
        h39 a = a(E2);
        EnumMap enumMap2 = a.a;
        f39 f392 = f39.AD_STORAGE;
        c39 c39 = (c39) enumMap2.get(f392);
        c39 c392 = c39.UNINITIALIZED;
        if (c39 == null) {
            c39 = c392;
        }
        int i6 = a.b;
        int ordinal = c39.ordinal();
        xp8 xp83 = xp8.REMOTE_ENFORCED_DEFAULT;
        xp8 xp84 = xp8.FAILSAFE;
        if (ordinal == 1) {
            rg4.w(f392, xp83);
        } else if (ordinal == 2 || ordinal == 3) {
            rg4.u(f392, i6);
        } else {
            rg4.w(f392, xp84);
        }
        f39 f393 = f39.ANALYTICS_STORAGE;
        c39 c393 = (c39) enumMap2.get(f393);
        if (c393 != null) {
            c392 = c393;
        }
        int ordinal2 = c392.ordinal();
        if (ordinal2 == 1) {
            rg4.w(f393, xp83);
        } else if (ordinal2 == 2 || ordinal2 == 3) {
            rg4.u(f393, i6);
        } else {
            rg4.w(f393, xp84);
        }
        String E3 = c09.E();
        n0().b1();
        j0();
        ir8 q0 = q0(E3, m0(E3), a(E3), rg4);
        String str = q0.d;
        Boolean bool = q0.c;
        z65.k(bool);
        boolean booleanValue = bool.booleanValue();
        x192.b();
        ((b29) x192.x).j1(booleanValue);
        if (!TextUtils.isEmpty(str)) {
            x192.b();
            ((b29) x192.x).k1(str);
        }
        n0().b1();
        j0();
        Iterator it = Collections.unmodifiableList(((b29) x192.x).Z1()).iterator();
        while (true) {
            if (!it.hasNext()) {
                m29 = null;
                break;
            }
            m29 = (m29) it.next();
            if ("_npa".equals(m29.v())) {
                break;
            }
        }
        if (m29 != null) {
            f39 f394 = f39.AD_PERSONALIZATION;
            xp8 xp85 = (xp8) ((EnumMap) rg4.x).get(f394);
            if (xp85 == null) {
                xp85 = xp82;
            }
            if (xp85 == xp82) {
                uq8 uq8 = this.y;
                R(uq8);
                b99 Y1 = uq8.Y1(c09.E(), "_npa");
                xp8 xp86 = xp8.MANIFEST;
                xp8 xp87 = xp8.API;
                if (Y1 != null) {
                    String str2 = Y1.b;
                    if ("tcf".equals(str2)) {
                        rg4.w(f394, xp8.TCF);
                    } else if ("app".equals(str2)) {
                        rg4.w(f394, xp87);
                    } else {
                        rg4.w(f394, xp86);
                    }
                } else {
                    Boolean x2 = c09.x();
                    if (x2 == null || ((x2.booleanValue() && m29.z() != 1) || (!x2.booleanValue() && m29.z() != 0))) {
                        rg4.w(f394, xp87);
                    } else {
                        rg4.w(f394, xp86);
                    }
                }
            }
        } else {
            int B2 = B(c09.E(), rg4);
            l29 E4 = m29.E();
            E4.b();
            ((m29) E4.x).G("_npa");
            Q().getClass();
            long currentTimeMillis = System.currentTimeMillis();
            E4.b();
            ((m29) E4.x).F(currentTimeMillis);
            E4.b();
            ((m29) E4.x).J((long) B2);
            x192.b();
            ((b29) x192.x).h0((m29) E4.d());
            G().J.c("non_personalized_ads(_npa)", Integer.valueOf(B2), "Setting user property");
        }
        String rg42 = rg4.toString();
        x192.b();
        ((b29) x192.x).i1(rg42);
        String E5 = c09.E();
        j19 j19 = this.w;
        j19.b1();
        j19.i1(E5);
        ry8 y1 = j19.y1(E5);
        if (y1 != null && y1.w() && !y1.x()) {
            z2 = false;
        } else {
            z2 = true;
        }
        List T2 = x192.T();
        for (int i7 = 0; i7 < T2.size(); i7++) {
            if ("_tcf".equals(((h19) T2.get(i7)).y())) {
                f19 f19 = (f19) ((h19) T2.get(i7)).k();
                List g = f19.g();
                int i8 = 0;
                while (true) {
                    if (i8 >= g.size()) {
                        break;
                    } else if ("_tcfd".equals(((n19) g.get(i8)).u())) {
                        String w2 = ((n19) g.get(i8)).w();
                        if (z2 && w2.length() > 4) {
                            char[] charArray = w2.toCharArray();
                            int i9 = 1;
                            while (true) {
                                if (i9 >= 64) {
                                    i9 = 0;
                                    break;
                                } else if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i9)) {
                                    break;
                                } else {
                                    i9++;
                                }
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i9 | 1);
                            w2 = String.valueOf(charArray);
                        }
                        l19 F2 = n19.F();
                        F2.g("_tcfd");
                        F2.h(w2);
                        f19.b();
                        ((h19) f19.x).K(i8, (n19) F2.d());
                    } else {
                        i8++;
                    }
                }
                x192.V(i7, f19);
                return;
            }
        }
    }

    public final y89 h0() {
        y89 y89 = this.C;
        R(y89);
        return y89;
    }

    public final void i(c09 c09, x19 x19) {
        boolean z2;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Serializable serializable;
        Serializable u1;
        c09 c092 = c09;
        x19 x192 = x19;
        n0().b1();
        j0();
        uz8 Y2 = e09.Y();
        y19 y19 = c092.a;
        r19 r19 = y19.C;
        y19.g(r19);
        r19.b1();
        byte[] bArr = c092.H;
        if (bArr != null) {
            try {
                Y2 = (uz8) y89.N1(Y2, bArr);
            } catch (zzaeh unused) {
                G().E.b("Failed to parse locally stored ad campaign info. appId", pz8.k1(c092.E()));
            }
        }
        Iterator it = x192.T().iterator();
        while (it.hasNext()) {
            h19 h19 = (h19) it.next();
            if (h19.y().equals("_cmp")) {
                n19 m1 = y89.m1("gclid", h19);
                if (m1 == null) {
                    obj = null;
                } else {
                    obj = y89.u1(m1);
                }
                Object obj6 = "";
                if (obj == null) {
                    obj = obj6;
                }
                String str = (String) obj;
                n19 m12 = y89.m1("gbraid", h19);
                if (m12 == null) {
                    obj2 = null;
                } else {
                    obj2 = y89.u1(m12);
                }
                if (obj2 == null) {
                    obj2 = obj6;
                }
                String str2 = (String) obj2;
                n19 m13 = y89.m1("gad_source", h19);
                if (m13 == null) {
                    obj3 = null;
                } else {
                    obj3 = y89.u1(m13);
                }
                if (obj3 == null) {
                    obj3 = obj6;
                }
                String str3 = (String) obj3;
                n19 m14 = y89.m1("deep_link_url", h19);
                if (m14 == null) {
                    obj4 = null;
                } else {
                    obj4 = y89.u1(m14);
                }
                if (obj4 != null) {
                    obj6 = obj4;
                }
                String str4 = (String) obj6;
                String[] split = ((String) by8.b1.a((Object) null)).split(",");
                h0();
                HashMap hashMap = new HashMap();
                for (n19 n19 : h19.v()) {
                    Iterator it2 = it;
                    if (Arrays.asList(split).contains(n19.u()) && (u1 = y89.u1(n19)) != null) {
                        hashMap.put(n19.u(), u1);
                    }
                    it = it2;
                }
                Iterator it3 = it;
                if (!hashMap.isEmpty()) {
                    long j = 0L;
                    n19 m15 = y89.m1("click_timestamp", h19);
                    if (m15 == null) {
                        obj5 = null;
                    } else {
                        obj5 = y89.u1(m15);
                    }
                    if (obj5 != null) {
                        j = obj5;
                    }
                    long longValue = ((Long) j).longValue();
                    if (longValue <= 0) {
                        longValue = h19.A();
                    }
                    long j2 = longValue;
                    n19 m16 = y89.m1("_cis", h19);
                    if (m16 == null) {
                        serializable = null;
                    } else {
                        serializable = y89.u1(m16);
                    }
                    if ("referrer API v2".equals(serializable)) {
                        if (j2 > ((e09) Y2.x).V()) {
                            if (str.isEmpty()) {
                                Y2.b();
                                ((e09) Y2.x).w();
                            } else {
                                Y2.b();
                                ((e09) Y2.x).v(str);
                            }
                            if (str2.isEmpty()) {
                                Y2.b();
                                ((e09) Y2.x).y();
                            } else {
                                Y2.b();
                                ((e09) Y2.x).x(str2);
                            }
                            if (str3.isEmpty()) {
                                Y2.b();
                                ((e09) Y2.x).A();
                            } else {
                                Y2.b();
                                ((e09) Y2.x).z(str3);
                            }
                            Y2.b();
                            ((e09) Y2.x).B(j2);
                            Y2.b();
                            ((e09) Y2.x).D().clear();
                            HashMap C2 = C(h19);
                            Y2.b();
                            ((e09) Y2.x).D().putAll(C2);
                        }
                    } else if (j2 > ((e09) Y2.x).N()) {
                        if (str.isEmpty()) {
                            Y2.b();
                            ((e09) Y2.x).b0();
                        } else {
                            Y2.b();
                            ((e09) Y2.x).a0(str);
                        }
                        if (str2.isEmpty()) {
                            Y2.b();
                            ((e09) Y2.x).d0();
                        } else {
                            Y2.b();
                            ((e09) Y2.x).c0(str2);
                        }
                        if (str3.isEmpty()) {
                            Y2.b();
                            ((e09) Y2.x).t();
                        } else {
                            Y2.b();
                            ((e09) Y2.x).e0(str3);
                        }
                        if (c0().n1((String) null, by8.a1)) {
                            if (str4.isEmpty()) {
                                Y2.b();
                                ((e09) Y2.x).F();
                            } else {
                                Y2.b();
                                ((e09) Y2.x).E(str4);
                            }
                        }
                        Y2.b();
                        ((e09) Y2.x).u(j2);
                        Y2.b();
                        ((e09) Y2.x).C().clear();
                        HashMap C3 = C(h19);
                        Y2.b();
                        ((e09) Y2.x).C().putAll(C3);
                    }
                }
                it = it3;
            }
        }
        if (!((e09) Y2.d()).equals(e09.Z())) {
            x192.b();
            ((b29) x192.x).o1((e09) Y2.d());
        }
        byte[] a = ((e09) Y2.d()).a();
        r19 r192 = y19.C;
        y19.g(r192);
        r192.b1();
        boolean z3 = c092.R;
        if (c092.H != a) {
            z2 = true;
        } else {
            z2 = false;
        }
        c092.R = z3 | z2;
        c092.H = a;
        if (c092.o()) {
            uq8 uq8 = this.y;
            R(uq8);
            uq8.h2(c092, false);
        }
        if (c0().n1((String) null, by8.a1)) {
            for (int i = 0; i < x192.U(); i++) {
                h19 Y1 = ((b29) x192.x).Y1(i);
                if ("_cmp".equals(Y1.y())) {
                    f19 f19 = (f19) Y1.k();
                    List g = f19.g();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= g.size()) {
                            break;
                        } else if ("deep_link_url".equals(((n19) g.get(i2)).u())) {
                            f19.l(i2);
                            x192.V(i, f19);
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        if (c0().n1((String) null, by8.Z0)) {
            uq8 uq82 = this.y;
            R(uq82);
            uq82.W1(c092.E(), "_lgclid");
        }
    }

    public final d99 i0() {
        y19 y19 = this.H;
        z65.k(y19);
        d99 d99 = y19.E;
        y19.e(d99);
        return d99;
    }

    public final String j(h39 h39) {
        if (!h39.i(f39.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        i0().b2().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    public final void j0() {
        if (!this.I.get()) {
            h.s("UploadController is not initialized");
        }
    }

    public final void k(ArrayList arrayList) {
        z65.f(!arrayList.isEmpty());
        if (this.U != null) {
            G().B.a("Set uploading progress before finishing the previous upload");
        } else {
            this.U = new ArrayList(arrayList);
        }
    }

    public final void k0(z99 z99) {
        n0().b1();
        j0();
        String str = z99.w;
        z65.h(str);
        h39 c = h39.c(z99.T, z99.O);
        a(str);
        G().J.c(str, c, "Setting storage consent for package");
        n0().b1();
        j0();
        this.X.put(str, c);
        uq8 uq8 = this.y;
        R(uq8);
        uq8.I1(str, c);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v6, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0127, code lost:
        if (r7 == 0) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a2, code lost:
        if (r1 != null) goto L_0x017d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01c1 A[SYNTHETIC, Splitter:B:80:0x01c1] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:71:0x01a5=Splitter:B:71:0x01a5, B:44:0x012a=Splitter:B:44:0x012a, B:35:0x010b=Splitter:B:35:0x010b, B:57:0x017d=Splitter:B:57:0x017d} */
    public final void l() {
        ? r7;
        SQLiteException e;
        Cursor cursor;
        Cursor cursor2;
        n0().b1();
        j0();
        this.R = true;
        try {
            y19 y19 = this.H;
            y19.getClass();
            Boolean bool = y19.j().A;
            if (bool == null) {
                G().E.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                G().B.a("Upload called in the client side when service should be used");
            } else if (this.K > 0) {
                K();
            } else {
                n0().b1();
                if (this.U != null) {
                    G().J.a("Uploading requested multiple times");
                } else {
                    xz8 xz8 = this.x;
                    R(xz8);
                    if (!xz8.g1()) {
                        G().J.a("Network not connected, ignoring upload request");
                        K();
                    } else {
                        Q().getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        r7 = 0;
                        int l1 = c0().l1((String) null, by8.h0);
                        c0();
                        long longValue = currentTimeMillis - ((Long) by8.e.a((Object) null)).longValue();
                        for (int i = 0; i < l1 && E(longValue, (String) null); i++) {
                        }
                        wo8.a();
                        n0().b1();
                        D();
                        long a = this.E.D.a();
                        if (a != 0) {
                            G().I.b("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(currentTimeMillis - a)));
                        }
                        uq8 uq8 = this.y;
                        R(uq8);
                        String k1 = uq8.k1();
                        long j = -1;
                        if (!TextUtils.isEmpty(k1)) {
                            if (this.W == -1) {
                                uq8 uq82 = this.y;
                                R(uq82);
                                try {
                                    Cursor rawQuery = uq82.T1().rawQuery("select rowid from raw_events order by rowid desc limit 1;", (String[]) null);
                                    boolean moveToFirst = rawQuery.moveToFirst();
                                    cursor2 = rawQuery;
                                    if (moveToFirst) {
                                        r7 = rawQuery;
                                        j = rawQuery.getLong(0);
                                        cursor2 = rawQuery;
                                    }
                                } catch (SQLiteException e2) {
                                    pz8 pz8 = ((y19) uq82.w).B;
                                    y19.g(pz8);
                                    pz8.B.b("Error querying raw events", e2);
                                    cursor2 = r7;
                                }
                                cursor2.close();
                                this.W = j;
                            }
                            m(currentTimeMillis, k1);
                        } else {
                            this.W = -1;
                            uq8 uq83 = this.y;
                            R(uq83);
                            c0();
                            long longValue2 = currentTimeMillis - ((Long) by8.e.a((Object) null)).longValue();
                            uq83.b1();
                            uq83.d1();
                            try {
                                cursor = uq83.T1().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(longValue2)});
                                try {
                                    if (!cursor.moveToFirst()) {
                                        pz8 pz82 = ((y19) uq83.w).B;
                                        y19.g(pz82);
                                        pz82.J.a("No expired configs for apps with pending events");
                                    } else {
                                        r7 = cursor.getString(0);
                                    }
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    try {
                                        pz8 pz83 = ((y19) uq83.w).B;
                                        y19.g(pz83);
                                        pz83.B.b("Error selecting expired configs", e);
                                    } catch (Throwable th) {
                                        th = th;
                                        r7 = cursor;
                                        if (r7 != 0) {
                                            r7.close();
                                        }
                                        throw th;
                                    }
                                }
                            } catch (SQLiteException e4) {
                                e = e4;
                                cursor = null;
                                pz8 pz832 = ((y19) uq83.w).B;
                                y19.g(pz832);
                                pz832.B.b("Error selecting expired configs", e);
                            } catch (Throwable th2) {
                                th = th2;
                                if (r7 != 0) {
                                }
                                throw th;
                            }
                            cursor.close();
                            r7 = r7;
                            if (!TextUtils.isEmpty(r7)) {
                                uq8 uq84 = this.y;
                                R(uq84);
                                c09 g2 = uq84.g2(r7);
                                if (g2 != null) {
                                    v(g2);
                                }
                            }
                        }
                    }
                }
            }
            this.R = false;
            L();
        } catch (Throwable th3) {
            this.R = false;
            L();
            throw th3;
        }
    }

    public final void l0(z99 z99) {
        boolean z2;
        n0().b1();
        j0();
        String str = z99.w;
        z65.h(str);
        ir8 b = ir8.b(z99.U);
        G().J.c(str, b, "Setting DMA consent for package");
        n0().b1();
        j0();
        c39 a = ir8.c(100, p0(str)).a();
        this.Y.put(str, b);
        uq8 uq8 = this.y;
        R(uq8);
        z65.k(str);
        z65.k(b);
        uq8.b1();
        uq8.d1();
        h39 w1 = uq8.w1(str);
        h39 h39 = h39.c;
        if (w1 == h39) {
            uq8.I1(str, h39);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", b.b);
        uq8.B1(contentValues);
        c39 a2 = ir8.c(100, p0(str)).a();
        n0().b1();
        j0();
        boolean z3 = true;
        c39 c39 = c39.GRANTED;
        c39 c392 = c39.DENIED;
        if (a == c392 && a2 == c39) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(a == c39 && a2 == c392)) {
            z3 = false;
        }
        if (z2 || z3) {
            G().J.b("Generated _dcu event for", str);
            Bundle bundle = new Bundle();
            uq8 uq82 = this.y;
            R(uq82);
            if (uq82.i2(b(), str, false, false, false, false).f < ((long) c0().l1(str, by8.l0))) {
                bundle.putLong("_r", 1);
                uq8 uq83 = this.y;
                R(uq83);
                G().J.c(str, Long.valueOf(uq83.i2(b(), str, false, false, true, false).f), "_dcu realtime event count");
            }
            this.f0.f(str, "_dcu", bundle);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0202, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0204, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0205, code lost:
        r23 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x020e, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0225, code lost:
        if (r11 != null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0403, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0404, code lost:
        r22 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0408, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0409, code lost:
        r22 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0460, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0482, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0483, code lost:
        r17 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0486, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x04a0, code lost:
        r22.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x058f, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0aec, code lost:
        r14.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0202 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:9:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x034e A[Catch:{ SQLiteException -> 0x0361 }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0403 A[ExcHandler: all (th java.lang.Throwable), PHI: r4 
      PHI: (r4v69 android.database.Cursor) = (r4v68 android.database.Cursor), (r4v70 android.database.Cursor), (r4v70 android.database.Cursor) binds: [B:160:0x03de, B:173:0x040e, B:174:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:160:0x03de] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0460 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:157:0x03b1] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04ae  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x058f  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x05aa  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0626  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0628  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0657  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x07b4  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0808  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0817  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0a9d  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x0aec  */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x02ad A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x07fc A[EDGE_INSN: B:431:0x07fc->B:324:0x07fc ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x07ee A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:444:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:448:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:449:? A[RETURN, SYNTHETIC] */
    public final void m(long j, String str) {
        boolean z2;
        boolean z3;
        long j2;
        List<Pair> list;
        int i;
        List list2;
        h39 a;
        f39 f39;
        List list3;
        int i2;
        s19 A2;
        int size;
        int i3;
        boolean i4;
        boolean n1;
        boolean z4;
        List list4;
        boolean z5;
        y19 y19;
        boolean z6;
        String str2;
        String str3;
        String str4;
        i89 i89;
        xz8 xz8;
        String str5;
        boolean z7;
        boolean z8;
        List list5;
        int i5;
        int i6;
        List list6;
        List list7;
        String str6;
        ArrayList arrayList;
        boolean isEmpty;
        List list8;
        Iterator it;
        Iterator it2;
        int i7;
        int i8;
        Cursor cursor;
        y19 y192;
        ArrayList arrayList2;
        uq8 e02;
        ContentValues contentValues;
        y19 y193;
        Cursor cursor2;
        List list9;
        uq8 uq8;
        long j3;
        long j4;
        long j5 = j;
        String str7 = str;
        int l1 = c0().l1(str7, by8.h);
        int i9 = 0;
        int max = Math.max(0, c0().l1(str7, by8.i));
        uq8 e03 = e0();
        y19 y194 = (y19) e03.w;
        e03.b1();
        e03.d1();
        int i10 = 1;
        if (l1 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        z65.f(z2);
        if (max > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        z65.f(z3);
        z65.h(str7);
        try {
            j2 = -1;
            cursor2 = e03.T1().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str7}, (String) null, (String) null, "rowid", String.valueOf(l1));
            try {
                if (!cursor2.moveToFirst()) {
                    list9 = Collections.EMPTY_LIST;
                    cursor2.close();
                    list = list9;
                    if (list.isEmpty()) {
                        eo8 eo8 = eo8.x;
                        fo8 fo8 = (fo8) eo8.w.w;
                        tp8 c02 = c0();
                        ay8 ay8 = by8.c1;
                        boolean n12 = c02.n1((String) null, ay8);
                        f39 f392 = f39.ANALYTICS_STORAGE;
                        if (n12) {
                            fo8 fo82 = (fo8) eo8.w.w;
                            if (!c0().n1((String) null, ay8)) {
                                i = 34;
                                arrayList = list;
                            } else if (a(str7).i(f392) || !d0().h1(str7)) {
                                i = 34;
                                ArrayList arrayList3 = new ArrayList(list.size());
                                uq8 e04 = e0();
                                y19 y195 = (y19) e04.w;
                                z65.h(str7);
                                e04.b1();
                                e04.d1();
                                ArrayList arrayList4 = new ArrayList();
                                try {
                                    SQLiteDatabase T1 = e04.T1();
                                    y195.Q().getClass();
                                    long currentTimeMillis = System.currentTimeMillis();
                                    Cursor query = T1.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str7, String.valueOf(currentTimeMillis)}, (String) null, (String) null, "rowid", (String) null);
                                    SQLiteDatabase sQLiteDatabase = T1;
                                    try {
                                        if (query.moveToFirst()) {
                                            y192 = y195;
                                            while (true) {
                                                try {
                                                    arrayList4.add((h19) ((f19) y89.N1(h19.J(), query.getBlob(0))).d());
                                                    cursor = query;
                                                    arrayList2 = arrayList4;
                                                } catch (zzaeh e) {
                                                    cursor = query;
                                                    arrayList2 = arrayList4;
                                                    try {
                                                        y192.G().G.c(pz8.k1(str7), e, "Failed to parse stored NO_DATA mode event, appId");
                                                    } catch (SQLiteException e2) {
                                                        e = e2;
                                                        try {
                                                            y192.G().g1().c(pz8.k1(str7), e, "Error flushing NO_DATA mode events. appId");
                                                            list8 = Collections.EMPTY_LIST;
                                                            if (cursor != null) {
                                                            }
                                                            it = list.iterator();
                                                            boolean z9 = true;
                                                            while (it.hasNext()) {
                                                            }
                                                            arrayList = arrayList3;
                                                            isEmpty = arrayList.isEmpty();
                                                            list2 = arrayList;
                                                            if (isEmpty) {
                                                            }
                                                            a = a(str7);
                                                            f39 = f39.AD_STORAGE;
                                                            if (a.i(f39)) {
                                                            }
                                                            i2 = 0;
                                                            list3 = list2;
                                                            A2 = w19.A();
                                                            size = list3.size();
                                                            ArrayList arrayList5 = new ArrayList(list3.size());
                                                            if (!c0().d1(str7) || !a(str7).i(f39)) {
                                                            }
                                                            boolean i11 = a(str7).i(f39);
                                                            i4 = a(str7).i(f392);
                                                            fp8 fp8 = (fp8) ep8.x.w.w;
                                                            n1 = c0().n1(str7, by8.M0);
                                                            k89 k89 = this.F;
                                                            i89 d1 = k89.d1(str7);
                                                            boolean z10 = i11;
                                                            list4 = list3;
                                                            while (true) {
                                                                y19 = this.H;
                                                                if (i2 < size) {
                                                                }
                                                                i2 = i5 + 1;
                                                                i3 = i6;
                                                                size = r24;
                                                                list4 = list5;
                                                                i4 = z8;
                                                                n1 = z7;
                                                            }
                                                            y19 y196 = y19;
                                                            if (((w19) A2.x).u() != 0) {
                                                            }
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            Cursor cursor3 = cursor;
                                                            if (cursor3 != null) {
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                }
                                                if (!cursor.moveToNext()) {
                                                    break;
                                                }
                                                query = cursor;
                                                arrayList4 = arrayList2;
                                            }
                                            cursor.close();
                                            int delete = sQLiteDatabase.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str7, String.valueOf(currentTimeMillis)});
                                            mz8 j1 = y192.G().j1();
                                            StringBuilder sb = new StringBuilder(String.valueOf(delete).length() + 34);
                                            sb.append("Pruned ");
                                            sb.append(delete);
                                            sb.append(" NO_DATA mode events. appId");
                                            j1.b(sb.toString(), str7);
                                        } else {
                                            arrayList2 = arrayList4;
                                            query.close();
                                        }
                                        list8 = arrayList2;
                                    } catch (SQLiteException e3) {
                                        e = e3;
                                        cursor = query;
                                        y192 = y195;
                                        y192.G().g1().c(pz8.k1(str7), e, "Error flushing NO_DATA mode events. appId");
                                        list8 = Collections.EMPTY_LIST;
                                        if (cursor != null) {
                                        }
                                        it = list.iterator();
                                        boolean z92 = true;
                                        while (it.hasNext()) {
                                        }
                                        arrayList = arrayList3;
                                        isEmpty = arrayList.isEmpty();
                                        list2 = arrayList;
                                        if (isEmpty) {
                                        }
                                        a = a(str7);
                                        f39 = f39.AD_STORAGE;
                                        if (a.i(f39)) {
                                        }
                                        i2 = 0;
                                        list3 = list2;
                                        A2 = w19.A();
                                        size = list3.size();
                                        ArrayList arrayList52 = new ArrayList(list3.size());
                                        if (!c0().d1(str7) || !a(str7).i(f39)) {
                                        }
                                        boolean i112 = a(str7).i(f39);
                                        i4 = a(str7).i(f392);
                                        fp8 fp82 = (fp8) ep8.x.w.w;
                                        n1 = c0().n1(str7, by8.M0);
                                        k89 k892 = this.F;
                                        i89 d12 = k892.d1(str7);
                                        boolean z102 = i112;
                                        list4 = list3;
                                        while (true) {
                                            y19 = this.H;
                                            if (i2 < size) {
                                            }
                                            i2 = i5 + 1;
                                            i3 = i6;
                                            size = r24;
                                            list4 = list5;
                                            i4 = z8;
                                            n1 = z7;
                                        }
                                        y19 y1962 = y19;
                                        if (((w19) A2.x).u() != 0) {
                                        }
                                    } catch (Throwable th2) {
                                    }
                                } catch (SQLiteException e4) {
                                    e = e4;
                                } catch (Throwable th3) {
                                }
                                it = list.iterator();
                                boolean z922 = true;
                                while (it.hasNext()) {
                                    Pair pair = (Pair) it.next();
                                    x19 x19 = (x19) ((b29) pair.first).k();
                                    if (z922 && !list8.isEmpty()) {
                                        List T2 = x19.T();
                                        x19.b();
                                        ((b29) x19.x).e0();
                                        x19.b();
                                        ((b29) x19.x).d0(list8);
                                        x19.b();
                                        ((b29) x19.x).d0(T2);
                                        z922 = false;
                                    }
                                    p09 u = a19.u();
                                    ry8 y1 = d0().y1(str7);
                                    ArrayList arrayList6 = new ArrayList();
                                    if (y1 != null) {
                                        Iterator it3 = y1.t().iterator();
                                        while (it3.hasNext()) {
                                            yx8 yx8 = (yx8) it3.next();
                                            Iterator it4 = it;
                                            u09 t = x09.t();
                                            boolean z11 = z922;
                                            int t2 = yx8.t() - 1;
                                            List list10 = list8;
                                            if (t2 == 1) {
                                                it2 = it3;
                                                i7 = 3;
                                                i8 = 2;
                                            } else if (t2 != 2) {
                                                it2 = it3;
                                                i7 = 3;
                                                if (t2 == 3) {
                                                    i8 = 4;
                                                } else if (t2 != 4) {
                                                    i8 = 1;
                                                } else {
                                                    i8 = 5;
                                                }
                                            } else {
                                                it2 = it3;
                                                i7 = 3;
                                                i8 = 3;
                                            }
                                            t.g(i8);
                                            int v = yx8.v() - 1;
                                            if (v == 1) {
                                                i7 = 2;
                                            } else if (v != 2) {
                                                i7 = 1;
                                            }
                                            t.h(i7);
                                            arrayList6.add((x09) t.d());
                                            it = it4;
                                            list8 = list10;
                                            z922 = z11;
                                            it3 = it2;
                                        }
                                    }
                                    Iterator it5 = it;
                                    boolean z12 = z922;
                                    List list11 = list8;
                                    u.g(arrayList6);
                                    x19.C(u);
                                    arrayList3.add(Pair.create((b29) x19.d(), (Long) pair.second));
                                    it = it5;
                                    list8 = list11;
                                    z922 = z12;
                                }
                                arrayList = arrayList3;
                            } else {
                                List asList = Arrays.asList(((String) by8.d1.a((Object) null)).split(","));
                                for (Pair pair2 : list) {
                                    try {
                                        e0().l1(((Long) pair2.second).longValue());
                                        for (h19 h19 : ((b29) pair2.first).T1()) {
                                            if (asList.contains(h19.y())) {
                                                if (!h19.y().equals("_f")) {
                                                    if (h19.y().equals("_v")) {
                                                    }
                                                    e02 = e0();
                                                    e02.b1();
                                                    e02.d1();
                                                    z65.h(str7);
                                                    y19 y197 = (y19) e02.w;
                                                    y197.G().j1().b("Caching events in NO_DATA mode", h19);
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str7);
                                                    h19 h192 = h19;
                                                    contentValues.put("name", h192.y());
                                                    contentValues.put("data", h192.a());
                                                    contentValues.put("timestamp_millis", Long.valueOf(h192.A()));
                                                    if (e02.T1().insert("no_data_mode_events", (String) null, contentValues) != j2) {
                                                        y197.G().g1().b("Failed to insert NO_DATA mode event (got -1). appId", pz8.k1(str7));
                                                    }
                                                }
                                                f19 f19 = (f19) h19.k();
                                                h0();
                                                y89.k1(f19, "_dac", 1L);
                                                h19 = (h19) f19.d();
                                                e02 = e0();
                                                e02.b1();
                                                e02.d1();
                                                z65.h(str7);
                                                y19 y1972 = (y19) e02.w;
                                                try {
                                                    y1972.G().j1().b("Caching events in NO_DATA mode", h19);
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str7);
                                                    h19 h1922 = h19;
                                                    contentValues.put("name", h1922.y());
                                                    contentValues.put("data", h1922.a());
                                                    contentValues.put("timestamp_millis", Long.valueOf(h1922.A()));
                                                    try {
                                                        if (e02.T1().insert("no_data_mode_events", (String) null, contentValues) != j2) {
                                                        }
                                                    } catch (SQLiteException e5) {
                                                        ((y19) e02.w).G().g1().c(pz8.k1(str7), e5, "Error storing NO_DATA mode event. appId");
                                                    }
                                                } catch (SQLiteException unused) {
                                                }
                                            }
                                        }
                                    } catch (SQLiteException unused2) {
                                        G().G.b("Failed handling NO_DATA mode bundles. appId", str7);
                                    }
                                }
                                i = 34;
                                arrayList = Collections.EMPTY_LIST;
                            }
                            isEmpty = arrayList.isEmpty();
                            list2 = arrayList;
                            if (isEmpty) {
                                return;
                            }
                        } else {
                            i = 34;
                            list2 = list;
                        }
                        a = a(str7);
                        f39 = f39.AD_STORAGE;
                        if (a.i(f39)) {
                            Iterator it6 = list2.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    str6 = null;
                                    break;
                                }
                                b29 b29 = (b29) ((Pair) it6.next()).first;
                                if (!b29.z().isEmpty()) {
                                    str6 = b29.z();
                                    break;
                                }
                            }
                            if (str6 != null) {
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= list2.size()) {
                                        break;
                                    }
                                    b29 b292 = (b29) ((Pair) list2.get(i12)).first;
                                    if (!b292.z().isEmpty() && !b292.z().equals(str6)) {
                                        i2 = 0;
                                        list3 = list2.subList(0, i12);
                                        break;
                                    }
                                    i12++;
                                }
                                A2 = w19.A();
                                size = list3.size();
                                ArrayList arrayList522 = new ArrayList(list3.size());
                                if (!c0().d1(str7) || !a(str7).i(f39)) {
                                    i3 = i2;
                                } else {
                                    i3 = 1;
                                }
                                boolean i1122 = a(str7).i(f39);
                                i4 = a(str7).i(f392);
                                fp8 fp822 = (fp8) ep8.x.w.w;
                                n1 = c0().n1(str7, by8.M0);
                                k89 k8922 = this.F;
                                i89 d122 = k8922.d1(str7);
                                boolean z1022 = i1122;
                                list4 = list3;
                                while (true) {
                                    y19 = this.H;
                                    if (i2 < size) {
                                        break;
                                    }
                                    y19 y198 = y19;
                                    x19 x192 = (x19) ((b29) ((Pair) list4.get(i2)).first).k();
                                    int i13 = size;
                                    arrayList522.add((Long) ((Pair) list4.get(i2)).second);
                                    c0().i1();
                                    x192.r();
                                    x192.b();
                                    ((b29) x192.x).j0(j5);
                                    y198.getClass();
                                    x192.H();
                                    if (i3 == 0) {
                                        x192.b();
                                        ((b29) x192.x).W0();
                                    }
                                    if (!z1022) {
                                        x192.b();
                                        ((b29) x192.x).D1();
                                        x192.b();
                                        ((b29) x192.x).F1();
                                    }
                                    if (!z5) {
                                        x192.b();
                                        ((b29) x192.x).H1();
                                    }
                                    q(str7, x192);
                                    if (!z4) {
                                        x192.b();
                                        ((b29) x192.x).d1();
                                    }
                                    if (!z5) {
                                        x192.b();
                                        ((b29) x192.x).P1();
                                    }
                                    String z13 = ((b29) x192.x).z();
                                    if (!TextUtils.isEmpty(z13)) {
                                        i6 = i3;
                                        if (!z13.equals("00000000-0000-0000-0000-000000000000")) {
                                            i5 = i2;
                                            z8 = z5;
                                            list5 = list4;
                                            z7 = z4;
                                            if (x192.U() != 0) {
                                                if (c0().n1(str7, by8.C0)) {
                                                    x192.O(h0().L1(((b29) x192.d()).a()));
                                                }
                                                k29 b = d122.b();
                                                if (b != null) {
                                                    x192.A(b);
                                                }
                                                A2.b();
                                                ((w19) A2.x).D((b29) x192.d());
                                            }
                                            i2 = i5 + 1;
                                            i3 = i6;
                                            size = i13;
                                            list4 = list5;
                                            i4 = z8;
                                            n1 = z7;
                                        }
                                    } else {
                                        i6 = i3;
                                    }
                                    ArrayList arrayList7 = new ArrayList(x192.T());
                                    Iterator it7 = arrayList7.iterator();
                                    i5 = i2;
                                    Long l = null;
                                    Long l2 = null;
                                    boolean z14 = false;
                                    boolean z15 = false;
                                    List list12 = list4;
                                    while (it7.hasNext()) {
                                        boolean z16 = z5;
                                        h19 h193 = (h19) it7.next();
                                        List list13 = list12;
                                        boolean z17 = z4;
                                        if ("_fx".equals(h193.y())) {
                                            it7.remove();
                                            list7 = list13;
                                            z5 = z16;
                                            z4 = z17;
                                            z14 = true;
                                        } else if ("_f".equals(h193.y())) {
                                            h0();
                                            n19 m1 = y89.m1("_pfo", h193);
                                            if (m1 != null) {
                                                l = Long.valueOf(m1.y());
                                            }
                                            h0();
                                            n19 m12 = y89.m1("_uwa", h193);
                                            if (m12 != null) {
                                                l2 = Long.valueOf(m12.y());
                                            }
                                            list7 = list13;
                                            z5 = z16;
                                            z4 = z17;
                                        } else {
                                            list6 = list13;
                                            z5 = z16;
                                            z4 = z17;
                                            list12 = list6;
                                        }
                                        z15 = true;
                                        list6 = list7;
                                        list12 = list6;
                                    }
                                    z8 = z5;
                                    list5 = list12;
                                    z7 = z4;
                                    if (z14) {
                                        x192.b();
                                        ((b29) x192.x).e0();
                                        x192.b();
                                        ((b29) x192.x).d0(arrayList7);
                                    }
                                    if (z15) {
                                        p(x192.n(), true, l, l2);
                                    }
                                    if (x192.U() != 0) {
                                    }
                                    i2 = i5 + 1;
                                    i3 = i6;
                                    size = i13;
                                    list4 = list5;
                                    i4 = z8;
                                    n1 = z7;
                                }
                                y19 y19622 = y19;
                                if (((w19) A2.x).u() != 0) {
                                    k(arrayList522);
                                    u(false, 204, (Throwable) null, (byte[]) null, str7, Collections.EMPTY_LIST, (Map) null);
                                    return;
                                }
                                w19 w19 = (w19) A2.d();
                                ArrayList arrayList8 = new ArrayList();
                                e59 e59 = d122.c;
                                if (e59 == e59.A) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (e59 != e59.z) {
                                    if (z6) {
                                        z6 = true;
                                    } else {
                                        str4 = null;
                                        ArrayList arrayList9 = arrayList8;
                                        xz8 = this.x;
                                        R(xz8);
                                        if (!xz8.g1()) {
                                            if (Log.isLoggable(G().m1(), 2)) {
                                                str5 = h0().D1(w19);
                                            } else {
                                                str5 = str4;
                                            }
                                            h0();
                                            byte[] a2 = w19.a();
                                            k(arrayList522);
                                            this.E.E.b(j5);
                                            G().j1().d("Uploading data. app, uncompressed size, data", str7, Integer.valueOf(a2.length), str5);
                                            this.Q = true;
                                            R(xz8);
                                            xz8.j1(str7, d122, w19, new fm8(this, str7, (Object) arrayList9, 9));
                                            return;
                                        }
                                        return;
                                    }
                                }
                                Iterator it8 = ((w19) A2.d()).t().iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        if (((b29) it8.next()).R()) {
                                            str2 = UUID.randomUUID().toString();
                                            break;
                                        }
                                    } else {
                                        str2 = null;
                                        break;
                                    }
                                }
                                w19 w192 = (w19) A2.d();
                                n0().b1();
                                j0();
                                s19 B2 = w19.B(w192);
                                if (!TextUtils.isEmpty(str2)) {
                                    B2.b();
                                    ((w19) B2.x).G(str2);
                                }
                                String p1 = d0().p1(str7);
                                if (!TextUtils.isEmpty(p1)) {
                                    B2.h(p1);
                                }
                                ArrayList arrayList10 = new ArrayList();
                                for (b29 Z2 : w192.t()) {
                                    x19 Z3 = b29.Z(Z2);
                                    Z3.b();
                                    ((b29) Z3.x).W0();
                                    arrayList10.add((b29) Z3.d());
                                }
                                B2.b();
                                ((w19) B2.x).F();
                                B2.b();
                                ((w19) B2.x).E(arrayList10);
                                mz8 j12 = G().j1();
                                if (TextUtils.isEmpty(str2)) {
                                    str3 = "null";
                                } else {
                                    str3 = B2.g();
                                }
                                j12.b("[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ", str3);
                                w19 w193 = (w19) B2.d();
                                if (!TextUtils.isEmpty(str2)) {
                                    n0().b1();
                                    j0();
                                    s19 A3 = w19.A();
                                    G().j1().b("[sgtm] Processing Google Signal, sgtmJoinId:", str2);
                                    A3.b();
                                    ((w19) A3.x).G(str2);
                                    for (b29 b293 : ((w19) A2.d()).t()) {
                                        x19 Y2 = b29.Y();
                                        String S2 = b293.S();
                                        Y2.b();
                                        ((b29) Y2.x).V0(S2);
                                        int O0 = b293.O0();
                                        Y2.b();
                                        ((b29) Y2.x).n1(O0);
                                        A3.b();
                                        ((w19) A3.x).D((b29) Y2.d());
                                    }
                                    w19 w194 = (w19) A3.d();
                                    String p12 = k8922.x.d0().p1(str7);
                                    boolean isEmpty2 = TextUtils.isEmpty(p12);
                                    e59 e592 = e59.y;
                                    e59 e593 = e59.B;
                                    if (!isEmpty2) {
                                        Uri parse = Uri.parse((String) by8.s.a((Object) null));
                                        Uri.Builder buildUpon = parse.buildUpon();
                                        String authority = parse.getAuthority();
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(p12).length() + 1 + String.valueOf(authority).length());
                                        sb2.append(p12);
                                        sb2.append(".");
                                        sb2.append(authority);
                                        buildUpon.authority(sb2.toString());
                                        String uri = buildUpon.build().toString();
                                        if (z6) {
                                            e592 = e593;
                                        }
                                        str4 = null;
                                        i89 = new i89(uri, Collections.EMPTY_MAP, e592, (k29) null);
                                    } else {
                                        str4 = null;
                                        String str8 = (String) by8.s.a((Object) null);
                                        if (z6) {
                                            e592 = e593;
                                        }
                                        i89 = new i89(str8, Collections.EMPTY_MAP, e592, (k29) null);
                                    }
                                    arrayList8.add(Pair.create(w194, i89));
                                } else {
                                    str4 = null;
                                }
                                if (z6) {
                                    s19 s19 = (s19) w193.k();
                                    for (int i14 = 0; i14 < w193.u(); i14++) {
                                        x19 x193 = (x19) w193.v(i14).k();
                                        x193.Z();
                                        x193.B(j5);
                                        s19.b();
                                        ((w19) s19.x).C(i14, (b29) x193.d());
                                    }
                                    arrayList8.add(Pair.create((w19) s19.d(), d122));
                                    k(arrayList522);
                                    String str9 = str;
                                    u(false, 204, (Throwable) null, (byte[]) null, str9, arrayList8, (Map) null);
                                    if (n(str9, d122.a())) {
                                        G().j1().b("[sgtm] Sending sgtm batches available notification to app", str9);
                                        Intent intent = new Intent();
                                        intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                        intent.setPackage(str9);
                                        Context o0 = y19622.o0();
                                        if (Build.VERSION.SDK_INT < i) {
                                            o0.sendBroadcast(intent);
                                            return;
                                        } else {
                                            o0.sendBroadcast(intent, (String) null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    str7 = str;
                                    w19 = w193;
                                    ArrayList arrayList92 = arrayList8;
                                    xz8 = this.x;
                                    R(xz8);
                                    if (!xz8.g1()) {
                                    }
                                }
                            }
                        }
                        i2 = 0;
                        list3 = list2;
                        A2 = w19.A();
                        size = list3.size();
                        ArrayList arrayList5222 = new ArrayList(list3.size());
                        if (!c0().d1(str7) || !a(str7).i(f39)) {
                        }
                        boolean i11222 = a(str7).i(f39);
                        i4 = a(str7).i(f392);
                        fp8 fp8222 = (fp8) ep8.x.w.w;
                        n1 = c0().n1(str7, by8.M0);
                        k89 k89222 = this.F;
                        i89 d1222 = k89222.d1(str7);
                        boolean z10222 = i11222;
                        list4 = list3;
                        while (true) {
                            y19 = this.H;
                            if (i2 < size) {
                            }
                            i2 = i5 + 1;
                            i3 = i6;
                            size = i13;
                            list4 = list5;
                            i4 = z8;
                            n1 = z7;
                        }
                        y19 y196222 = y19;
                        if (((w19) A2.x).u() != 0) {
                        }
                    } else {
                        return;
                    }
                } else {
                    ArrayList arrayList11 = new ArrayList();
                    int i15 = 0;
                    while (true) {
                        long j6 = cursor2.getLong(i9);
                        try {
                            byte[] blob = cursor2.getBlob(i10);
                            y89 h0 = e03.x.h0();
                            try {
                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[1024];
                                uq8 = e03;
                                while (true) {
                                    try {
                                        int read = gZIPInputStream.read(bArr);
                                        if (read <= 0) {
                                            break;
                                        }
                                        y193 = y194;
                                        try {
                                            byteArrayOutputStream.write(bArr, 0, read);
                                            y194 = y193;
                                        } catch (IOException e6) {
                                            e = e6;
                                            try {
                                                ((y19) h0.w).G().g1().b("Failed to ungzip content", e);
                                                throw e;
                                            } catch (IOException e7) {
                                                e = e7;
                                                try {
                                                    y193.G().g1().c(pz8.k1(str7), e, "Failed to unzip queued bundle. appId");
                                                    e03 = uq8;
                                                    y194 = y193;
                                                    i9 = 0;
                                                    i10 = 1;
                                                } catch (SQLiteException e8) {
                                                    e = e8;
                                                    try {
                                                        y193.G().g1().c(pz8.k1(str7), e, "Error querying bundles. appId");
                                                        list9 = Collections.EMPTY_LIST;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        Cursor cursor4 = cursor2;
                                                        if (cursor4 != null) {
                                                        }
                                                        throw th;
                                                    }
                                                }
                                            }
                                        }
                                    } catch (IOException e9) {
                                        e = e9;
                                        y193 = y194;
                                        ((y19) h0.w).G().g1().b("Failed to ungzip content", e);
                                        throw e;
                                    }
                                }
                                gZIPInputStream.close();
                                byteArrayInputStream.close();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                if (!arrayList11.isEmpty() && byteArray.length + i15 > max) {
                                    break;
                                }
                                try {
                                    x19 x194 = (x19) y89.N1(b29.Y(), byteArray);
                                    if (!arrayList11.isEmpty()) {
                                        b29 b294 = (b29) ((Pair) arrayList11.get(0)).first;
                                        b29 b295 = (b29) x194.d();
                                        if (!b294.y0().equals(b295.y0()) || !b294.F0().equals(b295.F0()) || b294.H0() != b295.H0() || !b294.J0().equals(b295.J0())) {
                                            break;
                                        }
                                        Iterator it9 = b294.Z1().iterator();
                                        while (true) {
                                            if (!it9.hasNext()) {
                                                j3 = -1;
                                                break;
                                            }
                                            m29 m29 = (m29) it9.next();
                                            Iterator it10 = it9;
                                            if ("_npa".equals(m29.v())) {
                                                j3 = m29.z();
                                                break;
                                            }
                                            it9 = it10;
                                        }
                                        Iterator it11 = b295.Z1().iterator();
                                        while (true) {
                                            if (!it11.hasNext()) {
                                                j4 = -1;
                                                break;
                                            }
                                            m29 m292 = (m29) it11.next();
                                            if ("_npa".equals(m292.v())) {
                                                j4 = m292.z();
                                                break;
                                            }
                                        }
                                        if (j3 != j4) {
                                            break;
                                        }
                                    }
                                    if (!cursor2.isNull(2)) {
                                        int i16 = cursor2.getInt(2);
                                        x194.b();
                                        ((b29) x194.x).X0(i16);
                                    }
                                    i15 += byteArray.length;
                                    arrayList11.add(Pair.create((b29) x194.d(), Long.valueOf(j6)));
                                } catch (IOException e10) {
                                    y194.G().g1().c(pz8.k1(str7), e10, "Failed to merge queued bundle. appId");
                                }
                                y193 = y194;
                                if (!cursor2.moveToNext() || i15 > max) {
                                    break;
                                }
                                e03 = uq8;
                                y194 = y193;
                                i9 = 0;
                                i10 = 1;
                            } catch (IOException e11) {
                                e = e11;
                                uq8 = e03;
                                y193 = y194;
                                ((y19) h0.w).G().g1().b("Failed to ungzip content", e);
                                throw e;
                            }
                        } catch (IOException e12) {
                            e = e12;
                            uq8 = e03;
                            y193 = y194;
                            y193.G().g1().c(pz8.k1(str7), e, "Failed to unzip queued bundle. appId");
                            e03 = uq8;
                            y194 = y193;
                            i9 = 0;
                            i10 = 1;
                        }
                    }
                    cursor2.close();
                    list = arrayList11;
                    if (list.isEmpty()) {
                    }
                }
            } catch (SQLiteException e13) {
                e = e13;
                y193 = y194;
                y193.G().g1().c(pz8.k1(str7), e, "Error querying bundles. appId");
                list9 = Collections.EMPTY_LIST;
            }
        } catch (SQLiteException e14) {
            e = e14;
            y19 y199 = y194;
            j2 = -1;
            cursor2 = null;
            y193.G().g1().c(pz8.k1(str7), e, "Error querying bundles. appId");
            list9 = Collections.EMPTY_LIST;
        } catch (Throwable th5) {
        }
        cursor = null;
        y192.G().g1().c(pz8.k1(str7), e, "Error flushing NO_DATA mode events. appId");
        list8 = Collections.EMPTY_LIST;
        if (cursor != null) {
        }
        it = list.iterator();
        boolean z9222 = true;
        while (it.hasNext()) {
        }
        arrayList = arrayList3;
        isEmpty = arrayList.isEmpty();
        list2 = arrayList;
        if (isEmpty) {
        }
        a = a(str7);
        f39 = f39.AD_STORAGE;
        if (a.i(f39)) {
        }
        i2 = 0;
        list3 = list2;
        A2 = w19.A();
        size = list3.size();
        ArrayList arrayList52222 = new ArrayList(list3.size());
        if (!c0().d1(str7) || !a(str7).i(f39)) {
        }
        boolean i112222 = a(str7).i(f39);
        i4 = a(str7).i(f392);
        fp8 fp82222 = (fp8) ep8.x.w.w;
        n1 = c0().n1(str7, by8.M0);
        k89 k892222 = this.F;
        i89 d12222 = k892222.d1(str7);
        boolean z102222 = i112222;
        list4 = list3;
        while (true) {
            y19 = this.H;
            if (i2 < size) {
            }
            i2 = i5 + 1;
            i3 = i6;
            size = i13;
            list4 = list5;
            i4 = z8;
            n1 = z7;
        }
        y19 y1962222 = y19;
        if (((w19) A2.x).u() != 0) {
        }
    }

    public final ir8 m0(String str) {
        n0().b1();
        j0();
        HashMap hashMap = this.Y;
        ir8 ir8 = (ir8) hashMap.get(str);
        if (ir8 != null) {
            return ir8;
        }
        uq8 uq8 = this.y;
        R(uq8);
        z65.k(str);
        uq8.b1();
        uq8.d1();
        ir8 b = ir8.b(uq8.A1("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        hashMap.put(str, b);
        return b;
    }

    public final boolean n(String str, String str2) {
        uq8 uq8 = this.y;
        R(uq8);
        c09 g2 = uq8.g2(str);
        HashMap hashMap = this.a0;
        if (g2 == null || !i0().H1(str, g2.D())) {
            u89 u89 = (u89) hashMap.get(str2);
            if (u89 != null) {
                u89.a.Q().getClass();
                if (System.currentTimeMillis() >= u89.c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        hashMap.remove(str2);
        return true;
    }

    public final r19 n0() {
        y19 y19 = this.H;
        z65.k(y19);
        r19 r19 = y19.C;
        y19.g(r19);
        return r19;
    }

    public final void o(String str) {
        x89 x89;
        n0().b1();
        j0();
        this.R = true;
        try {
            y19 y19 = this.H;
            y19.getClass();
            Boolean bool = y19.j().A;
            if (bool == null) {
                G().E.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                G().B.a("Upload called in the client side when service should be used");
            } else if (this.K > 0) {
                K();
            } else {
                xz8 xz8 = this.x;
                R(xz8);
                if (!xz8.g1()) {
                    G().J.a("Network not connected, ignoring upload request");
                    K();
                } else {
                    uq8 uq8 = this.y;
                    R(uq8);
                    if (!uq8.i1(str)) {
                        G().J.b("[sgtm] Upload queue has no batches for appId", str);
                    } else {
                        uq8 uq82 = this.y;
                        R(uq82);
                        z65.h(str);
                        uq82.b1();
                        uq82.d1();
                        List h1 = uq82.h1(str, c89.f(e59.y), 1);
                        if (h1.isEmpty()) {
                            x89 = null;
                        } else {
                            x89 = (x89) h1.get(0);
                        }
                        if (x89 != null) {
                            w19 w19 = x89.b;
                            G().J.d("[sgtm] Uploading data from upload queue. appId, type, url", str, x89.e, x89.c);
                            byte[] a = w19.a();
                            if (Log.isLoggable(G().m1(), 2)) {
                                y89 y89 = this.C;
                                R(y89);
                                G().J.d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(a.length), y89.D1(w19));
                            }
                            i89 i89 = new i89(x89.c, x89.d, x89.e, (k29) null);
                            this.Q = true;
                            xz8 xz82 = this.x;
                            R(xz82);
                            xz82.j1(str, i89, w19, new fm8(this, str, (Object) x89, 10));
                        }
                    }
                }
            }
        } finally {
            this.R = false;
            L();
        }
    }

    public final Context o0() {
        return this.H.w;
    }

    public final void p(String str, boolean z2, Long l, Long l2) {
        boolean z3;
        uq8 uq8 = this.y;
        R(uq8);
        c09 g2 = uq8.g2(str);
        if (g2 != null) {
            y19 y19 = g2.a;
            r19 r19 = y19.C;
            y19.g(r19);
            r19.b1();
            boolean z4 = g2.R;
            if (g2.y != z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            g2.R = z4 | z3;
            g2.y = z2;
            r19 r192 = y19.C;
            y19.g(r192);
            r192.b1();
            g2.R |= !Objects.equals(g2.z, l);
            g2.z = l;
            r19 r193 = y19.C;
            y19.g(r193);
            r193.b1();
            g2.R |= !Objects.equals(g2.A, l2);
            g2.A = l2;
            if (g2.o()) {
                uq8 uq82 = this.y;
                R(uq82);
                uq82.h2(g2, false);
            }
        }
    }

    public final Bundle p0(String str) {
        String str2;
        int i;
        String str3;
        n0().b1();
        j0();
        j19 j19 = this.w;
        R(j19);
        if (j19.y1(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        h39 a = a(str);
        Bundle bundle2 = new Bundle();
        Iterator it = a.a.entrySet().iterator();
        while (true) {
            str2 = "denied";
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int ordinal = ((c39) entry.getValue()).ordinal();
            if (ordinal != 2) {
                if (ordinal != 3) {
                    str2 = null;
                } else {
                    str2 = "granted";
                }
            }
            if (str2 != null) {
                bundle2.putString(((f39) entry.getKey()).w, str2);
            }
        }
        bundle.putAll(bundle2);
        ir8 q0 = q0(str, m0(str), a, new rg4(18));
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : q0.e.entrySet()) {
            int ordinal2 = ((c39) entry2.getValue()).ordinal();
            if (ordinal2 == 2) {
                str3 = str2;
            } else if (ordinal2 != 3) {
                str3 = null;
            } else {
                str3 = "granted";
            }
            if (str3 != null) {
                bundle3.putString(((f39) entry2.getKey()).w, str3);
            }
        }
        Boolean bool = q0.c;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = q0.d;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        uq8 uq8 = this.y;
        R(uq8);
        b99 Y1 = uq8.Y1(str, "_npa");
        if (Y1 != null) {
            i = Y1.e.equals(1L);
        } else {
            i = B(str, new rg4(18));
        }
        if (1 != i) {
            str2 = "granted";
        }
        bundle.putString("ad_personalization", str2);
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x011f, code lost:
        if (r6 < android.os.SystemClock.elapsedRealtime()) goto L_0x0121;
     */
    public final void q(String str, x19 x19) {
        int O1;
        int indexOf;
        j19 j19 = this.w;
        R(j19);
        j19.b1();
        j19.i1(str);
        js jsVar = j19.A;
        Set set = (Set) jsVar.get(str);
        if (set != null) {
            x19.b();
            ((b29) x19.x).e1(set);
        }
        R(j19);
        j19.b1();
        j19.i1(str);
        if (jsVar.get(str) != null && (((Set) jsVar.get(str)).contains("device_model") || ((Set) jsVar.get(str)).contains("device_info"))) {
            x19.b();
            ((b29) x19.x).u1();
        }
        R(j19);
        if (j19.v1(str)) {
            String n2 = ((b29) x19.x).n2();
            if (!TextUtils.isEmpty(n2) && (indexOf = n2.indexOf(".")) != -1) {
                String substring = n2.substring(0, indexOf);
                x19.b();
                ((b29) x19.x).s0(substring);
            }
        }
        R(j19);
        j19.b1();
        j19.i1(str);
        if (!(jsVar.get(str) == null || !((Set) jsVar.get(str)).contains("user_id") || (O1 = y89.O1("_id", x19)) == -1)) {
            x19.b();
            ((b29) x19.x).i0(O1);
        }
        R(j19);
        j19.b1();
        j19.i1(str);
        if (jsVar.get(str) != null && ((Set) jsVar.get(str)).contains("google_signals")) {
            x19.b();
            ((b29) x19.x).W0();
        }
        R(j19);
        if (j19.w1(str)) {
            x19.b();
            ((b29) x19.x).H1();
            if (a(str).i(f39.ANALYTICS_STORAGE)) {
                HashMap hashMap = this.Z;
                t89 t89 = (t89) hashMap.get(str);
                if (t89 != null) {
                    long k1 = c0().k1(str, by8.j0) + t89.b;
                    Q().getClass();
                }
                t89 = new t89(this, i0().Z1());
                hashMap.put(str, t89);
                String str2 = t89.a;
                x19.b();
                ((b29) x19.x).f1(str2);
            }
        }
        R(j19);
        j19.b1();
        j19.i1(str);
        if (jsVar.get(str) != null && ((Set) jsVar.get(str)).contains("enhanced_user_id")) {
            x19.b();
            ((b29) x19.x).d1();
        }
    }

    public final ir8 q0(String str, ir8 ir8, h39 h39, rg4 rg4) {
        f39 f39;
        boolean z2;
        c39 g1;
        j19 j19 = this.w;
        R(j19);
        ry8 y1 = j19.y1(str);
        int i = 90;
        c39 c39 = c39.DENIED;
        f39 f392 = f39.AD_USER_DATA;
        if (y1 == null) {
            if (ir8.a() == c39) {
                i = ir8.a;
                rg4.u(f392, i);
            } else {
                rg4.w(f392, xp8.FAILSAFE);
            }
            return new ir8(Boolean.FALSE, i, Boolean.TRUE, "-");
        }
        c39 a = ir8.a();
        boolean z3 = false;
        c39 c392 = c39.GRANTED;
        if (a == c392 || a == c39) {
            i = ir8.a;
            rg4.u(f392, i);
        } else {
            c39 c393 = c39.POLICY;
            c39 c394 = c39.UNINITIALIZED;
            if (a != c393 || (g1 = j19.g1(str, f392)) == c394) {
                j19.b1();
                j19.i1(str);
                ry8 y12 = j19.y1(str);
                if (y12 != null) {
                    Iterator it = y12.u().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        zx8 zx8 = (zx8) it.next();
                        if (f392 == j19.n1(zx8.t())) {
                            f39 = j19.n1(zx8.u());
                            break;
                        }
                    }
                }
                f39 = null;
                EnumMap enumMap = h39.a;
                f39 f393 = f39.AD_STORAGE;
                c39 c395 = (c39) enumMap.get(f393);
                if (c395 != null) {
                    c394 = c395;
                }
                if (c394 == c392 || c394 == c39) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (f39 != f393 || !z2) {
                    rg4.w(f392, xp8.REMOTE_DEFAULT);
                    if (true != j19.x1(str, f392)) {
                        a = c39;
                    } else {
                        a = c392;
                    }
                } else {
                    rg4.w(f392, xp8.REMOTE_DELEGATION);
                    a = c394;
                }
            } else {
                rg4.w(f392, xp8.REMOTE_ENFORCED_DEFAULT);
                a = g1;
            }
        }
        j19.b1();
        j19.i1(str);
        ry8 y13 = j19.y1(str);
        if (y13 == null || !y13.w() || y13.x()) {
            z3 = true;
        }
        R(j19);
        j19.b1();
        j19.i1(str);
        TreeSet treeSet = new TreeSet();
        ry8 y14 = j19.y1(str);
        if (y14 != null) {
            for (ky8 t : y14.v()) {
                treeSet.add(t.t());
            }
        }
        if (a == c39 || treeSet.isEmpty()) {
            return new ir8(Boolean.FALSE, i, Boolean.valueOf(z3), "-");
        }
        Boolean bool = Boolean.TRUE;
        Boolean valueOf = Boolean.valueOf(z3);
        String str2 = "";
        if (z3) {
            str2 = TextUtils.join(str2, treeSet);
        }
        return new ir8(bool, i, valueOf, str2);
    }

    public final void r(x19 x19, rb2 rb2) {
        String str;
        String str2;
        x19 x192 = x19;
        rb2 rb22 = rb2;
        for (int i = 0; i < x192.U(); i++) {
            f19 f19 = (f19) ((b29) x192.x).Y1(i).k();
            Iterator it = f19.g().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if ("_c".equals(((n19) it.next()).u())) {
                    if (((b29) rb22.x).K0() >= c0().l1(((b29) rb22.x).t(), by8.k0)) {
                        int l1 = c0().l1(((b29) rb22.x).t(), by8.x0);
                        LinkedList linkedList = this.M;
                        y89 y89 = this.C;
                        if (l1 > 0) {
                            uq8 uq8 = this.y;
                            R(uq8);
                            if (uq8.i2(b(), ((b29) rb22.x).t(), false, false, false, true).g > ((long) l1)) {
                                l19 F2 = n19.F();
                                F2.g("_tnr");
                                F2.i(1);
                                f19.j((n19) F2.d());
                            } else {
                                if (c0().n1(((b29) rb22.x).t(), by8.Q0)) {
                                    str2 = i0().Z1();
                                    l19 F3 = n19.F();
                                    F3.g("_tu");
                                    F3.h(str2);
                                    f19.j((n19) F3.d());
                                } else {
                                    str2 = null;
                                }
                                l19 F4 = n19.F();
                                F4.g("_tr");
                                F4.i(1);
                                f19.j((n19) F4.d());
                                R(y89);
                                u79 B1 = y89.B1(((b29) rb22.x).t(), x192, f19, str2);
                                if (B1 != null) {
                                    G().J.c(((b29) rb22.x).t(), B1.w, "Generated trigger URI. appId, uri");
                                    uq8 uq82 = this.y;
                                    R(uq82);
                                    uq82.x1(((b29) rb22.x).t(), B1);
                                    if (!linkedList.contains(((b29) rb22.x).t())) {
                                        linkedList.add(((b29) rb22.x).t());
                                    }
                                }
                            }
                        } else {
                            if (c0().n1(((b29) rb22.x).t(), by8.Q0)) {
                                str = i0().Z1();
                                l19 F5 = n19.F();
                                F5.g("_tu");
                                F5.h(str);
                                f19.j((n19) F5.d());
                            } else {
                                str = null;
                            }
                            l19 F6 = n19.F();
                            F6.g("_tr");
                            F6.i(1);
                            f19.j((n19) F6.d());
                            R(y89);
                            u79 B12 = y89.B1(((b29) rb22.x).t(), x192, f19, str);
                            if (B12 != null) {
                                G().J.c(((b29) rb22.x).t(), B12.w, "Generated trigger URI. appId, uri");
                                uq8 uq83 = this.y;
                                R(uq83);
                                uq83.x1(((b29) rb22.x).t(), B12);
                                if (!linkedList.contains(((b29) rb22.x).t())) {
                                    linkedList.add(((b29) rb22.x).t());
                                }
                            }
                        }
                    }
                    x192.b();
                    ((b29) x192.x).b0(i, (h19) f19.d());
                }
            }
        }
    }

    public final void s(String str, l19 l19, Bundle bundle, String str2) {
        List list;
        int h1;
        if (c0().n1(str2, by8.a1)) {
            list = h03.q("_o", "_sn", "_sc", "_si", "deep_link_url");
        } else {
            list = h03.q("_o", "_sn", "_sc", "_si");
        }
        if (d99.G1(((n19) l19.x).u()) || d99.G1(str)) {
            h1 = c0().h1(str2, true);
        } else {
            tp8 c02 = c0();
            c02.getClass();
            h1 = Math.max(Math.min(c02.l1(str2, by8.g0), 500), 100);
        }
        long j = (long) h1;
        long codePointCount = (long) ((n19) l19.x).w().codePointCount(0, ((n19) l19.x).w().length());
        i0();
        String u = ((n19) l19.x).u();
        c0();
        String j1 = d99.j1(40, u, true);
        if (codePointCount > j && !list.contains(((n19) l19.x).u())) {
            if ("_ev".equals(((n19) l19.x).u())) {
                i0();
                bundle.putString("_ev", d99.j1(c0().h1(str2, true), ((n19) l19.x).w(), true));
                return;
            }
            G().G.c(j1, Long.valueOf(codePointCount), "Param value is too long; discarded. Name, value length");
            if (bundle.getLong("_err") == 0) {
                bundle.putLong("_err", 4);
                if (bundle.getString("_ev") == null) {
                    bundle.putString("_ev", j1);
                    bundle.putLong("_el", codePointCount);
                }
            }
            bundle.remove(((n19) l19.x).u());
        }
    }

    public final boolean t(f19 f19) {
        ArrayList arrayList = new ArrayList(f19.g());
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if ("value".equals(((n19) arrayList.get(i3)).u())) {
                i = i3;
            } else if ("currency".equals(((n19) arrayList.get(i3)).u())) {
                i2 = i3;
            }
        }
        if (i == -1) {
            if (!c0().n1((String) null, by8.f1) || !"_iap".equals(f19.m())) {
                return true;
            }
            z(f19, "_c");
            y(f19, 18, "value");
            return false;
        } else if (((n19) arrayList.get(i)).x() || ((n19) arrayList.get(i)).B()) {
            if (i2 != -1) {
                String w2 = ((n19) arrayList.get(i2)).w();
                if (w2.length() == 3) {
                    int i4 = 0;
                    while (i4 < w2.length()) {
                        int codePointAt = w2.codePointAt(i4);
                        if (Character.isLetter(codePointAt)) {
                            i4 += Character.charCount(codePointAt);
                        }
                    }
                    return true;
                }
            }
            G().G.a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
            f19.l(i);
            z(f19, "_c");
            y(f19, 19, "currency");
            return false;
        } else {
            G().G.a("Value must be specified with a numeric type.");
            f19.l(i);
            z(f19, "_c");
            y(f19, 18, "value");
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r2 != null) goto L_0x0048;
     */
    public final void u(boolean z2, int i, Throwable th, byte[] bArr, String str, List list, Map map) {
        byte[] bArr2;
        e59 e59;
        int i2 = i;
        Throwable th2 = th;
        xz8 xz8 = this.x;
        n0().b1();
        j0();
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } catch (SQLiteException e) {
                ArrayList arrayList = this.V;
                if (arrayList == null || !arrayList.contains(r4)) {
                    throw e;
                }
            } catch (SQLiteException e2) {
                G().B.b("Database error while trying to delete uploaded bundles", e2);
                Q().getClass();
                this.K = SystemClock.elapsedRealtime();
                G().J.b("Disable upload, time", Long.valueOf(this.K));
            } catch (Throwable th3) {
                this.Q = false;
                L();
                throw th3;
            }
        } else {
            bArr2 = bArr;
        }
        if (c0().n1((String) null, by8.e1)) {
            y89 y89 = this.C;
            R(y89);
            y89.i1(map);
        }
        ArrayList<Long> arrayList2 = this.U;
        z65.k(arrayList2);
        this.U = null;
        if (z2) {
            if (i2 != 200) {
                if (i2 == 204) {
                    i2 = 204;
                }
                String str2 = new String(bArr2, StandardCharsets.UTF_8);
                G().G.d("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th2, str2.substring(0, Math.min(32, str2.length())));
                l09 l09 = this.E.E;
                Q().getClass();
                l09.b(System.currentTimeMillis());
                if (i2 == 503 || i2 == 429) {
                    l09 l092 = this.E.C;
                    Q().getClass();
                    l092.b(System.currentTimeMillis());
                }
                uq8 uq8 = this.y;
                R(uq8);
                uq8.n1(arrayList2);
                K();
                this.Q = false;
                L();
            }
        }
        mz8 mz8 = G().J;
        Integer valueOf = Integer.valueOf(i2);
        mz8.c(valueOf, Boolean.valueOf(z2), "Network upload successful with code, uploadAttempted");
        if (z2) {
            l09 l093 = this.E.D;
            Q().getClass();
            l093.b(System.currentTimeMillis());
        }
        this.E.E.b(0);
        K();
        if (z2) {
            G().J.c(valueOf, Integer.valueOf(bArr2.length), "Successful upload. Got network response. code, size");
        } else {
            G().J.a("Purged empty bundles");
        }
        uq8 uq82 = this.y;
        R(uq82);
        uq82.Q1();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            e59 = e59.A;
            if (!hasNext) {
                break;
            }
            Pair pair = (Pair) it.next();
            w19 w19 = (w19) pair.first;
            i89 i89 = (i89) pair.second;
            e59 e592 = i89.c;
            e59 e593 = i89.c;
            if (e592 != e59) {
                uq8 uq83 = this.y;
                R(uq83);
                uq8 uq84 = uq83;
                String str3 = i89.a;
                Map map2 = i89.b;
                if (map2 == null) {
                    map2 = Collections.EMPTY_MAP;
                }
                uq8 uq85 = uq84;
                e59 e594 = e593;
                w19 w192 = w19;
                long g1 = uq85.g1(str, w192, str3, map2, e594, (Long) null);
                if (e594 == e59.B && g1 != -1 && !w192.x().isEmpty()) {
                    hashMap.put(w192.x(), Long.valueOf(g1));
                }
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Pair pair2 = (Pair) it2.next();
            w19 w193 = (w19) pair2.first;
            i89 i892 = (i89) pair2.second;
            if (i892.c == e59) {
                Long l = (Long) hashMap.get(w193.x());
                uq8 uq86 = this.y;
                R(uq86);
                e59 e595 = e59;
                String str4 = i892.a;
                Map map3 = i892.b;
                if (map3 == null) {
                    map3 = Collections.EMPTY_MAP;
                }
                uq86.g1(str, w193, str4, map3, i892.c, l);
                e59 = e595;
            } else {
                String str5 = str;
            }
        }
        String str6 = str;
        uq8 uq87 = this.y;
        R(uq87);
        List h1 = uq87.h1(str6, c89.f(e59), 1);
        if (!h1.isEmpty()) {
            long j = ((x89) h1.get(0)).f;
            Q().getClass();
            if (System.currentTimeMillis() > ((Long) by8.F.a((Object) null)).longValue() + j) {
                G().E.c(str6, Long.valueOf(j), "[sgtm] client batches are queued too long. appId, creationTime");
            }
        }
        for (Long l2 : arrayList2) {
            uq8 uq88 = this.y;
            R(uq88);
            uq88.l1(l2.longValue());
        }
        uq8 uq89 = this.y;
        R(uq89);
        uq89.R1();
        uq8 uq810 = this.y;
        R(uq810);
        uq810.S1();
        this.V = null;
        R(xz8);
        if (xz8.g1()) {
            uq8 uq811 = this.y;
            R(uq811);
            if (uq811.i1(str6)) {
                o(str6);
                this.K = 0;
                this.Q = false;
                L();
            }
        }
        R(xz8);
        if (!xz8.g1() || !J()) {
            this.W = -1;
            K();
        } else {
            l();
        }
        this.K = 0;
        this.Q = false;
        L();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: zt6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: zt6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: zt6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: zt6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: zt6} */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void v(c09 c09) {
        Map map;
        zt6 zt6;
        n0().b1();
        if (TextUtils.isEmpty(c09.H())) {
            String E2 = c09.E();
            z65.k(E2);
            w(E2, 204, (Throwable) null, (byte[]) null, (Map) null);
            return;
        }
        String E3 = c09.E();
        z65.k(E3);
        G().J.b("Fetching remote configuration", E3);
        j19 j19 = this.w;
        R(j19);
        bz8 o1 = j19.o1(E3);
        R(j19);
        j19.b1();
        String str = (String) j19.J.get(E3);
        if (o1 != null) {
            if (!TextUtils.isEmpty(str)) {
                zt6 = new zt6(0);
                zt6.put("If-Modified-Since", str);
            } else {
                zt6 = null;
            }
            R(j19);
            j19.b1();
            String str2 = (String) j19.K.get(E3);
            if (!TextUtils.isEmpty(str2)) {
                if (zt6 == null) {
                    zt6 = new zt6(0);
                }
                zt6.put("If-None-Match", str2);
            }
            map = zt6;
        } else {
            map = null;
        }
        this.P = true;
        xz8 xz8 = this.x;
        R(xz8);
        rg4 rg4 = new rg4(26, (Object) this);
        y19 y19 = (y19) xz8.w;
        xz8.b1();
        xz8.d1();
        k89 k89 = xz8.x.F;
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder appendQueryParameter = builder.scheme((String) by8.f.a((Object) null)).encodedAuthority((String) by8.g.a((Object) null)).path("config/app/".concat(String.valueOf(c09.H()))).appendQueryParameter("platform", "android");
        ((y19) k89.w).z.i1();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(161000)).appendQueryParameter("runtime_version", "0");
        String uri = builder.build().toString();
        try {
            URL url = new URI(uri).toURL();
            r19 r19 = y19.C;
            y19.g(r19);
            r19.o1(new vz8(xz8, c09.E(), url, (byte[]) null, map, (tz8) rg4));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.B.c(pz8.k1(c09.E()), uri, "Failed to parse config URL. Not fetching. appId");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063 A[Catch:{ all -> 0x0074, all -> 0x0015 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0126 A[Catch:{ all -> 0x0074, all -> 0x0015 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0132 A[Catch:{ all -> 0x0074, all -> 0x0015 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0150 A[Catch:{ all -> 0x0074, all -> 0x0015 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0154 A[Catch:{ all -> 0x0074, all -> 0x0015 }] */
    public final void w(String str, int i, Throwable th, byte[] bArr, Map map) {
        boolean z2;
        xz8 xz8 = this.x;
        n0().b1();
        j0();
        z65.h(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.P = false;
                L();
                throw th2;
            }
        }
        mz8 mz8 = G().J;
        Integer valueOf = Integer.valueOf(bArr.length);
        mz8.b("onConfigFetched. Response size", valueOf);
        if (c0().n1((String) null, by8.e1)) {
            y89 y89 = this.C;
            R(y89);
            y89.i1(map);
        }
        uq8 uq8 = this.y;
        R(uq8);
        uq8.Q1();
        uq8 uq82 = this.y;
        R(uq82);
        c09 g2 = uq82.g2(str);
        if (!(i == 200 || i == 204)) {
            if (i == 304) {
                i = 304;
            }
            z2 = false;
            if (g2 == null) {
                G().E.b("App does not exist in onConfigFetched. appId", pz8.k1(str));
            } else {
                j19 j19 = this.w;
                if (z2 || i == 404) {
                    h0();
                    String n1 = y89.n1("Last-Modified", map);
                    h0();
                    String n12 = y89.n1("ETag", map);
                    if (i != 404) {
                        if (i != 304) {
                            R(j19);
                            j19.q1(str, bArr, n1, n12);
                            Q().getClass();
                            g2.f(System.currentTimeMillis());
                            uq8 uq83 = this.y;
                            R(uq83);
                            uq83.h2(g2, false);
                            if (i != 404) {
                                G().G.b("Config not found. Using empty config. appId", str);
                            } else {
                                G().J.c(Integer.valueOf(i), valueOf, "Successfully fetched config. Got network response. code, size");
                            }
                            R(xz8);
                            if (!xz8.g1() || !J()) {
                                R(xz8);
                                if (xz8.g1()) {
                                    uq8 uq84 = this.y;
                                    R(uq84);
                                    if (uq84.i1(g2.E())) {
                                        o(g2.E());
                                    }
                                }
                                K();
                            } else {
                                l();
                            }
                        }
                    }
                    R(j19);
                    if (j19.o1(str) == null) {
                        R(j19);
                        j19.q1(str, (byte[]) null, (String) null, (String) null);
                    }
                    Q().getClass();
                    g2.f(System.currentTimeMillis());
                    uq8 uq832 = this.y;
                    R(uq832);
                    uq832.h2(g2, false);
                    if (i != 404) {
                    }
                    R(xz8);
                    if (!xz8.g1() || !J()) {
                    }
                } else {
                    Q().getClass();
                    g2.g(System.currentTimeMillis());
                    uq8 uq85 = this.y;
                    R(uq85);
                    uq85.h2(g2, false);
                    G().J.c(Integer.valueOf(i), th, "Fetching config failed. code, error");
                    R(j19);
                    j19.b1();
                    j19.J.put(str, (Object) null);
                    l09 l09 = this.E.E;
                    Q().getClass();
                    l09.b(System.currentTimeMillis());
                    if (i == 503 || i == 429) {
                        l09 l092 = this.E.C;
                        Q().getClass();
                        l092.b(System.currentTimeMillis());
                    }
                    K();
                }
            }
            uq8 uq86 = this.y;
            R(uq86);
            uq86.R1();
            uq8 uq87 = this.y;
            R(uq87);
            uq87.S1();
            this.P = false;
            L();
        }
        if (th == null) {
            z2 = true;
            if (g2 == null) {
            }
            uq8 uq862 = this.y;
            R(uq862);
            uq862.R1();
            uq8 uq872 = this.y;
            R(uq872);
            uq872.S1();
            this.P = false;
            L();
        }
        z2 = false;
        if (g2 == null) {
        }
        uq8 uq8622 = this.y;
        R(uq8622);
        uq8622.R1();
        uq8 uq8722 = this.y;
        R(uq8722);
        uq8722.S1();
        this.P = false;
        L();
    }
}
