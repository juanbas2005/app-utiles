package defpackage;

import com.google.firebase.perf.config.RemoteConfigManager;

/* renamed from: b01  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b01 {
    public static final rg d = rg.d();
    public static volatile b01 e;
    public final RemoteConfigManager a = RemoteConfigManager.getInstance();
    public h93 b = new h93();
    public final zt1 c = zt1.b();

    public static synchronized b01 e() {
        b01 b01;
        synchronized (b01.class) {
            try {
                if (e == null) {
                    e = new b01();
                }
                b01 = e;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return b01;
    }

    public static boolean k(long j) {
        if (j >= 0) {
            return true;
        }
        return false;
    }

    public static boolean l(String str) {
        if (!str.trim().isEmpty()) {
            for (String trim : str.split(";")) {
                if (trim.trim().equals("22.0.5")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(long j) {
        if (j >= 0) {
            return true;
        }
        return false;
    }

    public static boolean o(double d2) {
        if (0.0d > d2 || d2 > 1.0d) {
            return false;
        }
        return true;
    }

    public final n75 a(we weVar) {
        zt1 zt1 = this.c;
        String r = weVar.r();
        if (r == null) {
            zt1.getClass();
            zt1.c.a("Key is null when getting boolean value on device cache.");
            return new n75();
        }
        if (zt1.a == null) {
            zt1.c(zt1.a());
            if (zt1.a == null) {
                return new n75();
            }
        }
        if (!zt1.a.contains(r)) {
            return new n75();
        }
        try {
            return new n75(Boolean.valueOf(zt1.a.getBoolean(r, false)));
        } catch (ClassCastException e2) {
            zt1.c.b("Key %s from sharedPreferences has type other than long: %s", r, e2.getMessage());
            return new n75();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:17|18|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        defpackage.zt1.c.b("Key %s from sharedPreferences has type other than double: %s", r4, r3.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return new defpackage.n75();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return new defpackage.n75(java.lang.Double.valueOf(java.lang.Float.valueOf(r3.a.getFloat(r4, 0.0f)).doubleValue()));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0051 */
    public final n75 b(we weVar) {
        zt1 zt1 = this.c;
        String r = weVar.r();
        if (r == null) {
            zt1.getClass();
            zt1.c.a("Key is null when getting double value on device cache.");
            return new n75();
        }
        if (zt1.a == null) {
            zt1.c(zt1.a());
            if (zt1.a == null) {
                return new n75();
            }
        }
        if (!zt1.a.contains(r)) {
            return new n75();
        }
        return new n75(Double.valueOf(Double.longBitsToDouble(zt1.a.getLong(r, 0))));
    }

    public final n75 c(we weVar) {
        zt1 zt1 = this.c;
        String r = weVar.r();
        if (r == null) {
            zt1.getClass();
            zt1.c.a("Key is null when getting long value on device cache.");
            return new n75();
        }
        if (zt1.a == null) {
            zt1.c(zt1.a());
            if (zt1.a == null) {
                return new n75();
            }
        }
        if (!zt1.a.contains(r)) {
            return new n75();
        }
        try {
            return new n75(Long.valueOf(zt1.a.getLong(r, 0)));
        } catch (ClassCastException e2) {
            zt1.c.b("Key %s from sharedPreferences has type other than long: %s", r, e2.getMessage());
            return new n75();
        }
    }

    public final n75 d(we weVar) {
        zt1 zt1 = this.c;
        String r = weVar.r();
        if (r == null) {
            zt1.getClass();
            zt1.c.a("Key is null when getting String value on device cache.");
            return new n75();
        }
        if (zt1.a == null) {
            zt1.c(zt1.a());
            if (zt1.a == null) {
                return new n75();
            }
        }
        if (!zt1.a.contains(r)) {
            return new n75();
        }
        try {
            return new n75(zt1.a.getString(r, ""));
        } catch (ClassCastException e2) {
            zt1.c.b("Key %s from sharedPreferences has type other than String: %s", r, e2.getMessage());
            return new n75();
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [h01, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v5, types: [g01, java.lang.Object] */
    public final Boolean f() {
        g01 g01;
        Boolean bool;
        h01 h01;
        synchronized (g01.class) {
            try {
                if (g01.G == null) {
                    g01.G = new Object();
                }
                g01 = g01.G;
            } finally {
                while (true) {
                }
            }
        }
        n75 g = g(g01);
        if (g.b()) {
            bool = (Boolean) g.a();
        } else {
            bool = Boolean.FALSE;
        }
        if (bool.booleanValue()) {
            return Boolean.FALSE;
        }
        synchronized (h01.class) {
            try {
                if (h01.G == null) {
                    h01.G = new Object();
                }
                h01 = h01.G;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        n75 a2 = a(h01);
        if (a2.b()) {
            return (Boolean) a2.a();
        }
        n75 g2 = g(h01);
        if (g2.b()) {
            return (Boolean) g2.a();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[SYNTHETIC, Splitter:B:10:0x001e] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    public final n75 g(we weVar) {
        boolean z;
        h93 h93 = this.b;
        String s = weVar.s();
        if (s == null) {
            h93.getClass();
        } else if (h93.a.containsKey(s)) {
            z = true;
            if (z) {
                return new n75();
            }
            try {
                Boolean bool = (Boolean) h93.a.get(s);
                if (bool == null) {
                    return new n75();
                }
                return new n75(bool);
            } catch (ClassCastException e2) {
                h93.b.b("Metadata key %s contains type other than boolean: %s", s, e2.getMessage());
                return new n75();
            }
        }
        z = false;
        if (z) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    public final n75 h(we weVar) {
        boolean z;
        h93 h93 = this.b;
        String s = weVar.s();
        if (s == null) {
            h93.getClass();
        } else if (h93.a.containsKey(s)) {
            z = true;
            if (z) {
                return new n75();
            }
            Object obj = h93.a.get(s);
            if (obj == null) {
                return new n75();
            }
            if (obj instanceof Float) {
                return new n75(Double.valueOf(((Float) obj).doubleValue()));
            }
            if (obj instanceof Double) {
                return new n75((Double) obj);
            }
            h93.b.b("Metadata key %s contains type other than double: %s", s);
            return new n75();
        }
        z = false;
        if (z) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e A[SYNTHETIC, Splitter:B:9:0x001e] */
    public final n75 i(we weVar) {
        boolean z;
        n75 n75;
        h93 h93 = this.b;
        String s = weVar.s();
        if (s == null) {
            h93.getClass();
        } else if (h93.a.containsKey(s)) {
            z = true;
            if (z) {
                n75 = new n75();
            } else {
                try {
                    Integer num = (Integer) h93.a.get(s);
                    if (num == null) {
                        n75 = new n75();
                    } else {
                        n75 = new n75(num);
                    }
                } catch (ClassCastException e2) {
                    h93.b.b("Metadata key %s contains type other than int: %s", s, e2.getMessage());
                    n75 = new n75();
                }
            }
            if (!n75.b()) {
                return new n75(Long.valueOf((long) ((Integer) n75.a()).intValue()));
            }
            return new n75();
        }
        z = false;
        if (z) {
        }
        if (!n75.b()) {
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [p01, java.lang.Object] */
    public final long j() {
        p01 p01;
        synchronized (p01.class) {
            try {
                if (p01.G == null) {
                    p01.G = new Object();
                }
                p01 = p01.G;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        RemoteConfigManager remoteConfigManager = this.a;
        p01.getClass();
        n75 n75 = remoteConfigManager.getLong("fpr_rl_time_limit_sec");
        if (!n75.b() || ((Long) n75.a()).longValue() <= 0) {
            n75 c2 = c(p01);
            if (!c2.b() || ((Long) c2.a()).longValue() <= 0) {
                return 600;
            }
            return ((Long) c2.a()).longValue();
        }
        this.c.d(((Long) n75.a()).longValue(), "com.google.firebase.perf.TimeLimitSec");
        return ((Long) n75.a()).longValue();
    }

    /* JADX WARNING: type inference failed for: r3v10, types: [q01, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v14, types: [r01, java.lang.Object] */
    public final boolean n() {
        r01 r01;
        boolean z;
        q01 q01;
        boolean z2;
        Boolean f = f();
        if (f == null || f.booleanValue()) {
            synchronized (r01.class) {
                try {
                    if (r01.G == null) {
                        r01.G = new Object();
                    }
                    r01 = r01.G;
                } finally {
                    while (true) {
                    }
                }
            }
            n75 a2 = a(r01);
            n75 n75 = this.a.getBoolean("fpr_enabled");
            if (n75.b()) {
                if (this.a.isLastFetchFailed()) {
                    z = false;
                } else {
                    Boolean bool = (Boolean) n75.a();
                    if (!a2.b() || a2.a() != bool) {
                        this.c.g("com.google.firebase.perf.SdkEnabled", bool.booleanValue());
                    }
                    z = bool.booleanValue();
                }
            } else if (a2.b()) {
                z = ((Boolean) a2.a()).booleanValue();
            } else {
                z = true;
            }
            if (z) {
                synchronized (q01.class) {
                    try {
                        if (q01.G == null) {
                            q01.G = new Object();
                        }
                        q01 = q01.G;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                n75 d2 = d(q01);
                n75 string = this.a.getString("fpr_disabled_android_versions");
                if (string.b()) {
                    String str = (String) string.a();
                    if (!d2.b() || !((String) d2.a()).equals(str)) {
                        this.c.f("com.google.firebase.perf.SdkDisabledVersions", str);
                    }
                    z2 = l(str);
                } else if (d2.b()) {
                    z2 = l((String) d2.a());
                } else {
                    z2 = l("");
                }
                if (!z2) {
                    return true;
                }
            }
        }
        return false;
    }
}
