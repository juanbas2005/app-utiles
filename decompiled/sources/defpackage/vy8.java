package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.ext.SdkExtensions;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;

/* renamed from: vy8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vy8 extends fy8 {
    public int A;
    public String B;
    public String C;
    public long D;
    public final long E;
    public final long F;
    public List G;
    public String H;
    public final String I;
    public int J;
    public String K;
    public String L;
    public long M = 0;
    public String N = null;
    public String y;
    public String z;

    public vy8(y19 y19, long j, long j2, String str) {
        super(y19);
        this.E = j;
        this.F = j2;
        this.I = str;
    }

    public final boolean f1() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x025f A[SYNTHETIC, Splitter:B:98:0x025f] */
    public final z99 g1(String str) {
        long j;
        String str2;
        boolean z2;
        long j2;
        boolean z3;
        String str3;
        int i;
        Boolean p1;
        boolean z4;
        boolean z5;
        boolean z6;
        String str4;
        Boolean p12;
        boolean z7;
        y19 y19;
        boolean z8;
        long j3;
        ay8 ay8;
        long j4;
        int i2;
        long j5;
        z99 z99;
        int i3;
        int i4;
        b1();
        String i1 = i1();
        String j1 = j1();
        d1();
        String str5 = this.z;
        d1();
        long j6 = (long) this.A;
        d1();
        z65.k(this.B);
        long j7 = j6;
        String str6 = this.B;
        y19 y192 = (y19) this.w;
        tp8 tp8 = y192.z;
        pz8 pz8 = y192.B;
        tp8 tp82 = y192.z;
        Context context = y192.w;
        d99 d99 = y192.E;
        q09 q09 = y192.A;
        tp8.i1();
        d1();
        b1();
        String str7 = i1;
        String str8 = j1;
        long j8 = this.D;
        long j9 = 0;
        long j10 = j8;
        if (j8 == 0) {
            y19.e(d99);
            y19 y193 = (y19) d99.w;
            String packageName = context.getPackageName();
            d99.b1();
            z65.h(packageName);
            PackageManager packageManager = context.getPackageManager();
            z2 = false;
            MessageDigest v1 = d99.v1();
            long j11 = -1;
            if (v1 == null) {
                pz8 pz82 = y193.B;
                y19.g(pz82);
                pz82.B.a("Could not get MD5 instance");
                str2 = str5;
                j = j7;
            } else if (packageManager != null) {
                try {
                    if (!d99.K1(context, packageName)) {
                        str2 = str5;
                        try {
                            j = j7;
                            try {
                                Signature[] signatureArr = cf8.a(context).c(64, y193.w.getPackageName()).signatures;
                                if (signatureArr == null || signatureArr.length <= 0) {
                                    pz8 pz83 = y193.B;
                                    y19.g(pz83);
                                    pz83.E.a("Could not get signatures");
                                } else {
                                    j11 = d99.w1(v1.digest(signatureArr[0].toByteArray()));
                                }
                            } catch (PackageManager.NameNotFoundException e) {
                                e = e;
                                pz8 pz84 = y193.B;
                                y19.g(pz84);
                                pz84.B.b("Package name not found", e);
                                j2 = 0;
                                this.D = j2;
                                boolean a = y192.a();
                                y19.e(q09);
                                boolean z9 = !q09.N;
                                b1();
                                if (y192.a()) {
                                }
                                z3 = a;
                                str3 = null;
                                y19.e(q09);
                                long a2 = q09.B.a();
                                i = (a2 > 0 ? 1 : (a2 == 0 ? 0 : -1));
                                long j12 = j2;
                                long j13 = y192.Z;
                                if (i != 0) {
                                }
                                d1();
                                int i5 = this.J;
                                p1 = tp82.p1("google_analytics_adid_collection_enabled");
                                if (p1 == null || p1.booleanValue()) {
                                }
                                y19.e(q09);
                                q09.b1();
                                long j14 = j13;
                                boolean z10 = q09.g1().getBoolean("deferred_analytics_collection", z2);
                                if (tp82.s1("google_analytics_default_allow_ad_personalization_signals", true) == c39.GRANTED) {
                                }
                                Boolean valueOf = Boolean.valueOf(z5);
                                List list = this.G;
                                String g = q09.j1().g();
                                int i6 = i5;
                                if (this.H == null) {
                                }
                                String str9 = this.H;
                                boolean z11 = z10;
                                if (q09.j1().i(f39.ANALYTICS_STORAGE)) {
                                }
                                p12 = tp82.p1("google_analytics_sgtm_upload_enabled");
                                if (p12 != null) {
                                }
                                y19.e(d99);
                                y19 = (y19) d99.w;
                                String str10 = str4;
                                String i12 = i1();
                                boolean z12 = z7;
                                if (y19.w.getPackageManager() != null) {
                                }
                                y19.e(q09);
                                int i7 = q09.j1().b;
                                y19.e(q09);
                                q09.b1();
                                int i8 = i7;
                                String str11 = ir8.b(q09.g1().getString("dma_consent_settings", (String) null)).b;
                                wo8.a();
                                ay8 = by8.P0;
                                if (!tp82.n1((String) null, ay8)) {
                                }
                                i2 = 0;
                                wo8.a();
                                if (tp82.n1((String) null, ay8)) {
                                }
                                String str12 = tp82.y;
                                long j15 = j5;
                                String valueOf2 = String.valueOf(h39.h(tp82.s1("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j16 = y192.Z;
                                y19.d(y192.Q);
                                int e2 = hl6.e(y192.Q.h1());
                                int i9 = i2;
                                long j17 = j16;
                                if (tp82.n1((String) null, by8.e1)) {
                                }
                                boolean z13 = z11;
                                int i10 = i9;
                                boolean z14 = z8;
                                String str13 = valueOf2;
                                String str14 = str2;
                                List list2 = list;
                                long j18 = j12;
                                String str15 = str8;
                                String str16 = str9;
                                String str17 = str11;
                                long j19 = j;
                                String str18 = g;
                                long j20 = this.E;
                                int i11 = e2;
                                boolean z15 = z6;
                                long j21 = j14;
                                int i13 = i6;
                                long j22 = j4;
                                z99 = new z99(str7, str15, str14, j19, str6, 161000, j18, str, z3, z15, str3, j21, i13, z14, z13, valueOf, j20, list2, str18, str16, str10, z12, j22, i8, str17, i10, j15, str12, str13, j17, i11, j9);
                                return z99;
                            }
                        } catch (PackageManager.NameNotFoundException e3) {
                            e = e3;
                            j = j7;
                            pz8 pz842 = y193.B;
                            y19.g(pz842);
                            pz842.B.b("Package name not found", e);
                            j2 = 0;
                            this.D = j2;
                            boolean a3 = y192.a();
                            y19.e(q09);
                            boolean z92 = !q09.N;
                            b1();
                            if (y192.a()) {
                            }
                            z3 = a3;
                            str3 = null;
                            y19.e(q09);
                            long a22 = q09.B.a();
                            i = (a22 > 0 ? 1 : (a22 == 0 ? 0 : -1));
                            long j122 = j2;
                            long j132 = y192.Z;
                            if (i != 0) {
                            }
                            d1();
                            int i52 = this.J;
                            p1 = tp82.p1("google_analytics_adid_collection_enabled");
                            if (p1 == null || p1.booleanValue()) {
                            }
                            y19.e(q09);
                            q09.b1();
                            long j142 = j132;
                            boolean z102 = q09.g1().getBoolean("deferred_analytics_collection", z2);
                            if (tp82.s1("google_analytics_default_allow_ad_personalization_signals", true) == c39.GRANTED) {
                            }
                            Boolean valueOf3 = Boolean.valueOf(z5);
                            List list3 = this.G;
                            String g2 = q09.j1().g();
                            int i62 = i52;
                            if (this.H == null) {
                            }
                            String str92 = this.H;
                            boolean z112 = z102;
                            if (q09.j1().i(f39.ANALYTICS_STORAGE)) {
                            }
                            p12 = tp82.p1("google_analytics_sgtm_upload_enabled");
                            if (p12 != null) {
                            }
                            y19.e(d99);
                            y19 = (y19) d99.w;
                            String str102 = str4;
                            String i122 = i1();
                            boolean z122 = z7;
                            if (y19.w.getPackageManager() != null) {
                            }
                            y19.e(q09);
                            int i72 = q09.j1().b;
                            y19.e(q09);
                            q09.b1();
                            int i82 = i72;
                            String str112 = ir8.b(q09.g1().getString("dma_consent_settings", (String) null)).b;
                            wo8.a();
                            ay8 = by8.P0;
                            if (!tp82.n1((String) null, ay8)) {
                            }
                            i2 = 0;
                            wo8.a();
                            if (tp82.n1((String) null, ay8)) {
                            }
                            String str122 = tp82.y;
                            long j152 = j5;
                            String valueOf22 = String.valueOf(h39.h(tp82.s1("google_analytics_default_allow_ad_personalization_signals", true)));
                            long j162 = y192.Z;
                            y19.d(y192.Q);
                            int e22 = hl6.e(y192.Q.h1());
                            int i92 = i2;
                            long j172 = j162;
                            if (tp82.n1((String) null, by8.e1)) {
                            }
                            boolean z132 = z112;
                            int i102 = i92;
                            boolean z142 = z8;
                            String str132 = valueOf22;
                            String str142 = str2;
                            List list22 = list3;
                            long j182 = j122;
                            String str152 = str8;
                            String str162 = str92;
                            String str172 = str112;
                            long j192 = j;
                            String str182 = g2;
                            long j202 = this.E;
                            int i112 = e22;
                            boolean z152 = z6;
                            long j212 = j142;
                            int i132 = i62;
                            long j222 = j4;
                            z99 = new z99(str7, str152, str142, j192, str6, 161000, j182, str, z3, z152, str3, j212, i132, z142, z132, valueOf3, j202, list22, str182, str162, str102, z122, j222, i82, str172, i102, j152, str122, str132, j172, i112, j9);
                            return z99;
                        }
                    } else {
                        str2 = str5;
                        j = j7;
                        j11 = 0;
                    }
                } catch (PackageManager.NameNotFoundException e4) {
                    e = e4;
                    str2 = str5;
                    j = j7;
                    pz8 pz8422 = y193.B;
                    y19.g(pz8422);
                    pz8422.B.b("Package name not found", e);
                    j2 = 0;
                    this.D = j2;
                    boolean a32 = y192.a();
                    y19.e(q09);
                    boolean z922 = !q09.N;
                    b1();
                    if (y192.a()) {
                    }
                    z3 = a32;
                    str3 = null;
                    y19.e(q09);
                    long a222 = q09.B.a();
                    i = (a222 > 0 ? 1 : (a222 == 0 ? 0 : -1));
                    long j1222 = j2;
                    long j1322 = y192.Z;
                    if (i != 0) {
                    }
                    d1();
                    int i522 = this.J;
                    p1 = tp82.p1("google_analytics_adid_collection_enabled");
                    if (p1 == null || p1.booleanValue()) {
                    }
                    y19.e(q09);
                    q09.b1();
                    long j1422 = j1322;
                    boolean z1022 = q09.g1().getBoolean("deferred_analytics_collection", z2);
                    if (tp82.s1("google_analytics_default_allow_ad_personalization_signals", true) == c39.GRANTED) {
                    }
                    Boolean valueOf32 = Boolean.valueOf(z5);
                    List list32 = this.G;
                    String g22 = q09.j1().g();
                    int i622 = i522;
                    if (this.H == null) {
                    }
                    String str922 = this.H;
                    boolean z1122 = z1022;
                    if (q09.j1().i(f39.ANALYTICS_STORAGE)) {
                    }
                    p12 = tp82.p1("google_analytics_sgtm_upload_enabled");
                    if (p12 != null) {
                    }
                    y19.e(d99);
                    y19 = (y19) d99.w;
                    String str1022 = str4;
                    String i1222 = i1();
                    boolean z1222 = z7;
                    if (y19.w.getPackageManager() != null) {
                    }
                    y19.e(q09);
                    int i722 = q09.j1().b;
                    y19.e(q09);
                    q09.b1();
                    int i822 = i722;
                    String str1122 = ir8.b(q09.g1().getString("dma_consent_settings", (String) null)).b;
                    wo8.a();
                    ay8 = by8.P0;
                    if (!tp82.n1((String) null, ay8)) {
                    }
                    i2 = 0;
                    wo8.a();
                    if (tp82.n1((String) null, ay8)) {
                    }
                    String str1222 = tp82.y;
                    long j1522 = j5;
                    String valueOf222 = String.valueOf(h39.h(tp82.s1("google_analytics_default_allow_ad_personalization_signals", true)));
                    long j1622 = y192.Z;
                    y19.d(y192.Q);
                    int e222 = hl6.e(y192.Q.h1());
                    int i922 = i2;
                    long j1722 = j1622;
                    if (tp82.n1((String) null, by8.e1)) {
                    }
                    boolean z1322 = z1122;
                    int i1022 = i922;
                    boolean z1422 = z8;
                    String str1322 = valueOf222;
                    String str1422 = str2;
                    List list222 = list32;
                    long j1822 = j1222;
                    String str1522 = str8;
                    String str1622 = str922;
                    String str1722 = str1122;
                    long j1922 = j;
                    String str1822 = g22;
                    long j2022 = this.E;
                    int i1122 = e222;
                    boolean z1522 = z6;
                    long j2122 = j1422;
                    int i1322 = i622;
                    long j2222 = j4;
                    z99 = new z99(str7, str1522, str1422, j1922, str6, 161000, j1822, str, z3, z1522, str3, j2122, i1322, z1422, z1322, valueOf32, j2022, list222, str1822, str1622, str1022, z1222, j2222, i822, str1722, i1022, j1522, str1222, str1322, j1722, i1122, j9);
                    return z99;
                }
            } else {
                str2 = str5;
                j = j7;
                j2 = 0;
                this.D = j2;
            }
            j2 = j11;
            this.D = j2;
        } else {
            str2 = str5;
            j = j7;
            z2 = false;
            j2 = j10;
        }
        boolean a322 = y192.a();
        y19.e(q09);
        boolean z9222 = !q09.N;
        b1();
        if (y192.a()) {
            np8 np8 = (np8) mp8.x.w.w;
            if (tp82.n1((String) null, by8.H0)) {
                y19.g(pz8);
                pz8.J.a("Disabled IID for tests.");
            } else {
                try {
                    Class<?> loadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (loadClass != null) {
                        z3 = a322;
                        try {
                            Object[] objArr = {context};
                            str3 = null;
                            Object invoke = loadClass.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, objArr);
                            if (invoke != null) {
                                try {
                                    str3 = (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", (Class[]) null).invoke(invoke, (Object[]) null);
                                } catch (Exception unused) {
                                    y19.g(pz8);
                                    pz8.G.a("Failed to retrieve Firebase Instance Id");
                                }
                            }
                        } catch (Exception unused2) {
                            y19.g(pz8);
                            pz8.F.a("Failed to obtain Firebase Analytics instance");
                        }
                        y19.e(q09);
                        long a2222 = q09.B.a();
                        i = (a2222 > 0 ? 1 : (a2222 == 0 ? 0 : -1));
                        long j12222 = j2;
                        long j13222 = y192.Z;
                        if (i != 0) {
                            j13222 = Math.min(j13222, a2222);
                        }
                        d1();
                        int i5222 = this.J;
                        p1 = tp82.p1("google_analytics_adid_collection_enabled");
                        if (p1 == null || p1.booleanValue()) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        y19.e(q09);
                        q09.b1();
                        long j14222 = j13222;
                        boolean z10222 = q09.g1().getBoolean("deferred_analytics_collection", z2);
                        if (tp82.s1("google_analytics_default_allow_ad_personalization_signals", true) == c39.GRANTED) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        Boolean valueOf322 = Boolean.valueOf(z5);
                        List list322 = this.G;
                        String g222 = q09.j1().g();
                        int i6222 = i5222;
                        if (this.H == null) {
                            y19.e(d99);
                            this.H = d99.Z1();
                        }
                        String str9222 = this.H;
                        boolean z11222 = z10222;
                        if (q09.j1().i(f39.ANALYTICS_STORAGE)) {
                            z6 = z9222;
                            str4 = null;
                        } else {
                            b1();
                            boolean z16 = z9222;
                            if (this.M == 0) {
                                z6 = z16;
                            } else {
                                y192.G.getClass();
                                long currentTimeMillis = System.currentTimeMillis() - this.M;
                                z6 = z16;
                                if (this.L != null && currentTimeMillis > 86400000 && this.N == null) {
                                    h1();
                                }
                            }
                            if (this.L == null) {
                                h1();
                            }
                            str4 = this.L;
                        }
                        p12 = tp82.p1("google_analytics_sgtm_upload_enabled");
                        if (p12 != null) {
                            z7 = false;
                        } else {
                            z7 = p12.booleanValue();
                        }
                        y19.e(d99);
                        y19 = (y19) d99.w;
                        String str10222 = str4;
                        String i12222 = i1();
                        boolean z12222 = z7;
                        if (y19.w.getPackageManager() != null) {
                            z8 = z4;
                            j3 = 0;
                        } else {
                            try {
                                z8 = z4;
                                i4 = 0;
                                try {
                                    ApplicationInfo b = cf8.a(y19.w).b(0, i12222);
                                    if (b != null) {
                                        i3 = b.targetSdkVersion;
                                        j3 = (long) i3;
                                    }
                                } catch (PackageManager.NameNotFoundException unused3) {
                                    pz8 pz85 = y19.B;
                                    y19.g(pz85);
                                    pz85.H.b("PackageManager failed to find running app: app_id", i12222);
                                    i3 = i4;
                                    j3 = (long) i3;
                                    y19.e(q09);
                                    int i7222 = q09.j1().b;
                                    y19.e(q09);
                                    q09.b1();
                                    int i8222 = i7222;
                                    String str11222 = ir8.b(q09.g1().getString("dma_consent_settings", (String) null)).b;
                                    wo8.a();
                                    ay8 = by8.P0;
                                    if (!tp82.n1((String) null, ay8)) {
                                    }
                                    i2 = 0;
                                    wo8.a();
                                    if (tp82.n1((String) null, ay8)) {
                                    }
                                    String str12222 = tp82.y;
                                    long j15222 = j5;
                                    String valueOf2222 = String.valueOf(h39.h(tp82.s1("google_analytics_default_allow_ad_personalization_signals", true)));
                                    long j16222 = y192.Z;
                                    y19.d(y192.Q);
                                    int e2222 = hl6.e(y192.Q.h1());
                                    int i9222 = i2;
                                    long j17222 = j16222;
                                    if (tp82.n1((String) null, by8.e1)) {
                                    }
                                    boolean z13222 = z11222;
                                    int i10222 = i9222;
                                    boolean z14222 = z8;
                                    String str13222 = valueOf2222;
                                    String str14222 = str2;
                                    List list2222 = list322;
                                    long j18222 = j12222;
                                    String str15222 = str8;
                                    String str16222 = str9222;
                                    String str17222 = str11222;
                                    long j19222 = j;
                                    String str18222 = g222;
                                    long j20222 = this.E;
                                    int i11222 = e2222;
                                    boolean z15222 = z6;
                                    long j21222 = j14222;
                                    int i13222 = i6222;
                                    long j22222 = j4;
                                    z99 = new z99(str7, str15222, str14222, j19222, str6, 161000, j18222, str, z3, z15222, str3, j21222, i13222, z14222, z13222, valueOf322, j20222, list2222, str18222, str16222, str10222, z12222, j22222, i8222, str17222, i10222, j15222, str12222, str13222, j17222, i11222, j9);
                                    return z99;
                                }
                            } catch (PackageManager.NameNotFoundException unused4) {
                                z8 = z4;
                                i4 = 0;
                                pz8 pz852 = y19.B;
                                y19.g(pz852);
                                pz852.H.b("PackageManager failed to find running app: app_id", i12222);
                                i3 = i4;
                                j3 = (long) i3;
                                y19.e(q09);
                                int i72222 = q09.j1().b;
                                y19.e(q09);
                                q09.b1();
                                int i82222 = i72222;
                                String str112222 = ir8.b(q09.g1().getString("dma_consent_settings", (String) null)).b;
                                wo8.a();
                                ay8 = by8.P0;
                                if (!tp82.n1((String) null, ay8)) {
                                }
                                i2 = 0;
                                wo8.a();
                                if (tp82.n1((String) null, ay8)) {
                                }
                                String str122222 = tp82.y;
                                long j152222 = j5;
                                String valueOf22222 = String.valueOf(h39.h(tp82.s1("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j162222 = y192.Z;
                                y19.d(y192.Q);
                                int e22222 = hl6.e(y192.Q.h1());
                                int i92222 = i2;
                                long j172222 = j162222;
                                if (tp82.n1((String) null, by8.e1)) {
                                }
                                boolean z132222 = z11222;
                                int i102222 = i92222;
                                boolean z142222 = z8;
                                String str132222 = valueOf22222;
                                String str142222 = str2;
                                List list22222 = list322;
                                long j182222 = j12222;
                                String str152222 = str8;
                                String str162222 = str9222;
                                String str172222 = str112222;
                                long j192222 = j;
                                String str182222 = g222;
                                long j202222 = this.E;
                                int i112222 = e22222;
                                boolean z152222 = z6;
                                long j212222 = j14222;
                                int i132222 = i6222;
                                long j222222 = j4;
                                z99 = new z99(str7, str152222, str142222, j192222, str6, 161000, j182222, str, z3, z152222, str3, j212222, i132222, z142222, z132222, valueOf322, j202222, list22222, str182222, str162222, str10222, z12222, j222222, i82222, str172222, i102222, j152222, str122222, str132222, j172222, i112222, j9);
                                return z99;
                            }
                            i3 = i4;
                            j3 = (long) i3;
                        }
                        y19.e(q09);
                        int i722222 = q09.j1().b;
                        y19.e(q09);
                        q09.b1();
                        int i822222 = i722222;
                        String str1122222 = ir8.b(q09.g1().getString("dma_consent_settings", (String) null)).b;
                        wo8.a();
                        ay8 = by8.P0;
                        if (!tp82.n1((String) null, ay8)) {
                            y19.e(d99);
                            j4 = j3;
                            if (Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(30) > 3) {
                                i2 = SdkExtensions.getExtensionVersion(1000000);
                                wo8.a();
                                if (tp82.n1((String) null, ay8)) {
                                    y19.e(d99);
                                    j5 = d99.z1();
                                } else {
                                    j5 = 0;
                                }
                                String str1222222 = tp82.y;
                                long j1522222 = j5;
                                String valueOf222222 = String.valueOf(h39.h(tp82.s1("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j1622222 = y192.Z;
                                y19.d(y192.Q);
                                int e222222 = hl6.e(y192.Q.h1());
                                int i922222 = i2;
                                long j1722222 = j1622222;
                                if (tp82.n1((String) null, by8.e1)) {
                                    j9 = y192.a0;
                                }
                                boolean z1322222 = z11222;
                                int i1022222 = i922222;
                                boolean z1422222 = z8;
                                String str1322222 = valueOf222222;
                                String str1422222 = str2;
                                List list222222 = list322;
                                long j1822222 = j12222;
                                String str1522222 = str8;
                                String str1622222 = str9222;
                                String str1722222 = str1122222;
                                long j1922222 = j;
                                String str1822222 = g222;
                                long j2022222 = this.E;
                                int i1122222 = e222222;
                                boolean z1522222 = z6;
                                long j2122222 = j14222;
                                int i1322222 = i6222;
                                long j2222222 = j4;
                                z99 = new z99(str7, str1522222, str1422222, j1922222, str6, 161000, j1822222, str, z3, z1522222, str3, j2122222, i1322222, z1422222, z1322222, valueOf322, j2022222, list222222, str1822222, str1622222, str10222, z12222, j2222222, i822222, str1722222, i1022222, j1522222, str1222222, str1322222, j1722222, i1122222, j9);
                                return z99;
                            }
                        } else {
                            j4 = j3;
                        }
                        i2 = 0;
                        wo8.a();
                        if (tp82.n1((String) null, ay8)) {
                        }
                        String str12222222 = tp82.y;
                        long j15222222 = j5;
                        String valueOf2222222 = String.valueOf(h39.h(tp82.s1("google_analytics_default_allow_ad_personalization_signals", true)));
                        long j16222222 = y192.Z;
                        y19.d(y192.Q);
                        int e2222222 = hl6.e(y192.Q.h1());
                        int i9222222 = i2;
                        long j17222222 = j16222222;
                        if (tp82.n1((String) null, by8.e1)) {
                        }
                        boolean z13222222 = z11222;
                        int i10222222 = i9222222;
                        boolean z14222222 = z8;
                        String str13222222 = valueOf2222222;
                        String str14222222 = str2;
                        List list2222222 = list322;
                        long j18222222 = j12222;
                        String str15222222 = str8;
                        String str16222222 = str9222;
                        String str17222222 = str1122222;
                        long j19222222 = j;
                        String str18222222 = g222;
                        long j20222222 = this.E;
                        int i11222222 = e2222222;
                        boolean z15222222 = z6;
                        long j21222222 = j14222;
                        int i13222222 = i6222;
                        long j22222222 = j4;
                        z99 = new z99(str7, str15222222, str14222222, j19222222, str6, 161000, j18222222, str, z3, z15222222, str3, j21222222, i13222222, z14222222, z13222222, valueOf322, j20222222, list2222222, str18222222, str16222222, str10222, z12222, j22222222, i822222, str17222222, i10222222, j15222222, str12222222, str13222222, j17222222, i11222222, j9);
                        return z99;
                    }
                } catch (ClassNotFoundException unused5) {
                }
                z3 = a322;
                str3 = null;
                y19.e(q09);
                long a22222 = q09.B.a();
                i = (a22222 > 0 ? 1 : (a22222 == 0 ? 0 : -1));
                long j122222 = j2;
                long j132222 = y192.Z;
                if (i != 0) {
                }
                d1();
                int i52222 = this.J;
                p1 = tp82.p1("google_analytics_adid_collection_enabled");
                if (p1 == null || p1.booleanValue()) {
                }
                y19.e(q09);
                q09.b1();
                long j142222 = j132222;
                boolean z102222 = q09.g1().getBoolean("deferred_analytics_collection", z2);
                if (tp82.s1("google_analytics_default_allow_ad_personalization_signals", true) == c39.GRANTED) {
                }
                Boolean valueOf3222 = Boolean.valueOf(z5);
                List list3222 = this.G;
                String g2222 = q09.j1().g();
                int i62222 = i52222;
                if (this.H == null) {
                }
                String str92222 = this.H;
                boolean z112222 = z102222;
                if (q09.j1().i(f39.ANALYTICS_STORAGE)) {
                }
                p12 = tp82.p1("google_analytics_sgtm_upload_enabled");
                if (p12 != null) {
                }
                y19.e(d99);
                y19 = (y19) d99.w;
                String str102222 = str4;
                String i122222 = i1();
                boolean z122222 = z7;
                if (y19.w.getPackageManager() != null) {
                }
                y19.e(q09);
                int i7222222 = q09.j1().b;
                y19.e(q09);
                q09.b1();
                int i8222222 = i7222222;
                String str11222222 = ir8.b(q09.g1().getString("dma_consent_settings", (String) null)).b;
                wo8.a();
                ay8 = by8.P0;
                if (!tp82.n1((String) null, ay8)) {
                }
                i2 = 0;
                wo8.a();
                if (tp82.n1((String) null, ay8)) {
                }
                String str122222222 = tp82.y;
                long j152222222 = j5;
                String valueOf22222222 = String.valueOf(h39.h(tp82.s1("google_analytics_default_allow_ad_personalization_signals", true)));
                long j162222222 = y192.Z;
                y19.d(y192.Q);
                int e22222222 = hl6.e(y192.Q.h1());
                int i92222222 = i2;
                long j172222222 = j162222222;
                if (tp82.n1((String) null, by8.e1)) {
                }
                boolean z132222222 = z112222;
                int i102222222 = i92222222;
                boolean z142222222 = z8;
                String str132222222 = valueOf22222222;
                String str142222222 = str2;
                List list22222222 = list3222;
                long j182222222 = j122222;
                String str152222222 = str8;
                String str162222222 = str92222;
                String str172222222 = str11222222;
                long j192222222 = j;
                String str182222222 = g2222;
                long j202222222 = this.E;
                int i112222222 = e22222222;
                boolean z152222222 = z6;
                long j212222222 = j142222;
                int i132222222 = i62222;
                long j222222222 = j4;
                z99 = new z99(str7, str152222222, str142222222, j192222222, str6, 161000, j182222222, str, z3, z152222222, str3, j212222222, i132222222, z142222222, z132222222, valueOf3222, j202222222, list22222222, str182222222, str162222222, str102222, z122222, j222222222, i8222222, str172222222, i102222222, j152222222, str122222222, str132222222, j172222222, i112222222, j9);
                return z99;
            }
        }
        z3 = a322;
        str3 = null;
        y19.e(q09);
        long a222222 = q09.B.a();
        i = (a222222 > 0 ? 1 : (a222222 == 0 ? 0 : -1));
        long j1222222 = j2;
        long j1322222 = y192.Z;
        if (i != 0) {
        }
        d1();
        int i522222 = this.J;
        p1 = tp82.p1("google_analytics_adid_collection_enabled");
        if (p1 == null || p1.booleanValue()) {
        }
        y19.e(q09);
        q09.b1();
        long j1422222 = j1322222;
        boolean z1022222 = q09.g1().getBoolean("deferred_analytics_collection", z2);
        if (tp82.s1("google_analytics_default_allow_ad_personalization_signals", true) == c39.GRANTED) {
        }
        Boolean valueOf32222 = Boolean.valueOf(z5);
        List list32222 = this.G;
        String g22222 = q09.j1().g();
        int i622222 = i522222;
        if (this.H == null) {
        }
        String str922222 = this.H;
        boolean z1122222 = z1022222;
        if (q09.j1().i(f39.ANALYTICS_STORAGE)) {
        }
        p12 = tp82.p1("google_analytics_sgtm_upload_enabled");
        if (p12 != null) {
        }
        y19.e(d99);
        y19 = (y19) d99.w;
        String str1022222 = str4;
        String i1222222 = i1();
        boolean z1222222 = z7;
        if (y19.w.getPackageManager() != null) {
        }
        y19.e(q09);
        int i72222222 = q09.j1().b;
        y19.e(q09);
        q09.b1();
        int i82222222 = i72222222;
        String str112222222 = ir8.b(q09.g1().getString("dma_consent_settings", (String) null)).b;
        wo8.a();
        ay8 = by8.P0;
        if (!tp82.n1((String) null, ay8)) {
        }
        i2 = 0;
        wo8.a();
        if (tp82.n1((String) null, ay8)) {
        }
        String str1222222222 = tp82.y;
        long j1522222222 = j5;
        String valueOf222222222 = String.valueOf(h39.h(tp82.s1("google_analytics_default_allow_ad_personalization_signals", true)));
        long j1622222222 = y192.Z;
        y19.d(y192.Q);
        int e222222222 = hl6.e(y192.Q.h1());
        int i922222222 = i2;
        long j1722222222 = j1622222222;
        if (tp82.n1((String) null, by8.e1)) {
        }
        boolean z1322222222 = z1122222;
        int i1022222222 = i922222222;
        boolean z1422222222 = z8;
        String str1322222222 = valueOf222222222;
        String str1422222222 = str2;
        List list222222222 = list32222;
        long j1822222222 = j1222222;
        String str1522222222 = str8;
        String str1622222222 = str922222;
        String str1722222222 = str112222222;
        long j1922222222 = j;
        String str1822222222 = g22222;
        long j2022222222 = this.E;
        int i1122222222 = e222222222;
        boolean z1522222222 = z6;
        long j2122222222 = j1422222;
        int i1322222222 = i622222;
        long j2222222222 = j4;
        z99 = new z99(str7, str1522222222, str1422222222, j1922222222, str6, 161000, j1822222222, str, z3, z1522222222, str3, j2122222222, i1322222222, z1422222222, z1322222222, valueOf32222, j2022222222, list222222222, str1822222222, str1622222222, str1022222, z1222222, j2222222222, i82222222, str1722222222, i1022222222, j1522222222, str1222222222, str1322222222, j1722222222, i1122222222, j9);
        return z99;
    }

    public final void h1() {
        String str;
        String str2;
        b1();
        y19 y19 = (y19) this.w;
        q09 q09 = y19.A;
        pz8 pz8 = y19.B;
        y19.e(q09);
        if (!q09.j1().i(f39.ANALYTICS_STORAGE)) {
            y19.g(pz8);
            pz8.I.a("Analytics Storage consent is not granted");
            str = null;
        } else {
            byte[] bArr = new byte[16];
            d99 d99 = y19.E;
            y19.e(d99);
            d99.b2().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
        }
        y19.g(pz8);
        mz8 mz8 = pz8.I;
        if (str == null) {
            str2 = "null";
        } else {
            str2 = "not null";
        }
        mz8.a("Resetting session stitching token to ".concat(str2));
        this.L = str;
        y19.G.getClass();
        this.M = System.currentTimeMillis();
    }

    public final String i1() {
        d1();
        z65.k(this.y);
        return this.y;
    }

    public final String j1() {
        b1();
        d1();
        z65.k(this.K);
        return this.K;
    }
}
