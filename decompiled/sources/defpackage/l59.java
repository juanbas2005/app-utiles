package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: l59  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l59 extends fy8 {
    public f59 A;
    public final ConcurrentHashMap B = new ConcurrentHashMap();
    public jv8 C;
    public volatile boolean D;
    public volatile f59 E;
    public f59 F;
    public boolean G;
    public final Object H = new Object();
    public volatile f59 y;
    public volatile f59 z;

    public l59(y19 y19) {
        super(y19);
    }

    public final boolean f1() {
        return false;
    }

    public final f59 g1(boolean z2) {
        d1();
        b1();
        f59 f59 = this.A;
        if (z2 && f59 == null) {
            return this.F;
        }
        return f59;
    }

    public final String h1(String str) {
        String str2;
        if (str == null) {
            return "Activity";
        }
        String[] split = str.split("\\.");
        int length = split.length;
        if (length > 0) {
            str2 = split[length - 1];
        } else {
            str2 = "";
        }
        y19 y19 = (y19) this.w;
        int length2 = str2.length();
        y19.z.getClass();
        if (length2 <= 500) {
            return str2;
        }
        y19.z.getClass();
        return str2.substring(0, 500);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ec  */
    public final void i1(f59 f59, f59 f592, long j, boolean z2, Bundle bundle) {
        boolean z3;
        Bundle bundle2;
        String str;
        long j2;
        long j3;
        Bundle bundle3;
        f59 f593 = f59;
        f59 f594 = f592;
        long j4 = j;
        Bundle bundle4 = bundle;
        boolean z4 = f593.e;
        y19 y19 = (y19) this.w;
        b1();
        boolean z5 = false;
        if (f594 != null) {
            if (f594.c == f593.c && Objects.equals(f594.b, f593.b) && Objects.equals(f594.a, f593.a)) {
                z3 = false;
                if (z2 && this.A != null) {
                    z5 = true;
                }
                if (z3) {
                    if (bundle4 != null) {
                        bundle2 = new Bundle(bundle4);
                    } else {
                        bundle2 = new Bundle();
                    }
                    d99.Y1(f593, bundle2, true);
                    if (f594 != null) {
                        String str2 = f594.a;
                        if (str2 != null) {
                            bundle2.putString("_pn", str2);
                        }
                        String str3 = f594.b;
                        if (str3 != null) {
                            bundle2.putString("_pc", str3);
                        }
                        bundle2.putLong("_pi", f594.c);
                    }
                    if (z5) {
                        o79 o79 = y19.D;
                        y19.f(o79);
                        r38 r38 = o79.B;
                        long j5 = j4 - r38.x;
                        r38.x = j4;
                        if (j5 > 0) {
                            d99 d99 = y19.E;
                            y19.e(d99);
                            d99.O1(bundle2, j5);
                        }
                    }
                    tp8 tp8 = y19.z;
                    xb4 xb4 = y19.G;
                    if (!tp8.r1()) {
                        bundle2.putLong("_mst", 1);
                    }
                    if (true != z4) {
                        str = "auto";
                    } else {
                        str = "app";
                    }
                    String str4 = str;
                    xb4.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (z4) {
                        long j6 = f593.f;
                        if (j6 != 0) {
                            j2 = j6;
                            if (!y19.z.n1((String) null, by8.e1)) {
                                j3 = SystemClock.elapsedRealtime();
                            } else {
                                j3 = 0;
                            }
                            if (!z4) {
                                bundle3 = bundle2;
                                long j7 = f593.g;
                                if (j7 != 0) {
                                    j3 = j7;
                                }
                            } else {
                                bundle3 = bundle2;
                            }
                            v49 v49 = y19.I;
                            y19.f(v49);
                            v49.k1(j2, j3, bundle3, str4, "_vs");
                        }
                    }
                    j2 = currentTimeMillis;
                    if (!y19.z.n1((String) null, by8.e1)) {
                    }
                    if (!z4) {
                    }
                    v49 v492 = y19.I;
                    y19.f(v492);
                    v492.k1(j2, j3, bundle3, str4, "_vs");
                }
                if (z5) {
                    l1(this.A, true, j4);
                }
                this.A = f593;
                if (z4) {
                    this.F = f593;
                }
                r69 j8 = y19.j();
                j8.b1();
                j8.d1();
                j8.q1(new c49(j8, f593));
            }
        }
        z3 = true;
        z5 = true;
        if (z3) {
        }
        if (z5) {
        }
        this.A = f593;
        if (z4) {
        }
        r69 j82 = y19.j();
        j82.b1();
        j82.d1();
        j82.q1(new c49(j82, f593));
    }

    public final void j1(jv8 jv8, Bundle bundle) {
        Bundle bundle2;
        if (((y19) this.w).z.r1() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            f59 f59 = new f59(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name"));
            this.B.put(Integer.valueOf(jv8.w), f59);
        }
    }

    public final void k1(String str, f59 f59, boolean z2) {
        f59 f592;
        f59 f593;
        String str2;
        f59 f594 = f59;
        if (this.y == null) {
            f592 = this.z;
        } else {
            f592 = this.y;
        }
        f59 f595 = f592;
        if (f594.b == null) {
            if (str != null) {
                str2 = h1(str);
            } else {
                str2 = null;
            }
            f593 = new f59(f594.a, str2, f594.c, f594.e, f594.f, f594.g);
        } else {
            f593 = f594;
        }
        this.z = this.y;
        this.y = f593;
        y19 y19 = (y19) this.w;
        y19.G.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        r19 r19 = y19.C;
        y19.g(r19);
        r19.l1(new g59(this, f593, f595, elapsedRealtime, z2));
    }

    public final void l1(f59 f59, boolean z2, long j) {
        boolean z3;
        y19 y19 = (y19) this.w;
        ev8 ev8 = y19.J;
        y19.d(ev8);
        y19.G.getClass();
        ev8.f1(SystemClock.elapsedRealtime());
        if (f59 == null || !f59.d) {
            z3 = false;
        } else {
            z3 = true;
        }
        o79 o79 = y19.D;
        y19.f(o79);
        if (o79.B.e(z3, z2, j) && f59 != null) {
            f59.d = false;
        }
    }

    public final f59 m1(jv8 jv8) {
        z65.k(jv8);
        Integer valueOf = Integer.valueOf(jv8.w);
        ConcurrentHashMap concurrentHashMap = this.B;
        f59 f59 = (f59) concurrentHashMap.get(valueOf);
        if (f59 == null) {
            String h1 = h1(jv8.x);
            d99 d99 = ((y19) this.w).E;
            y19.e(d99);
            f59 f592 = new f59(d99.a2(), (String) null, h1);
            concurrentHashMap.put(valueOf, f592);
            f59 = f592;
        }
        if (this.E != null) {
            return this.E;
        }
        return f59;
    }
}
