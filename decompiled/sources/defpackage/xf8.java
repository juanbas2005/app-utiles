package defpackage;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;

/* renamed from: xf8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xf8 extends nd2 {
    public static final ae5 A = tz2.k("/");
    public final ae5 x;
    public final nd2 y;
    public final LinkedHashMap z;

    static {
        String str = ae5.x;
    }

    public xf8(ae5 ae5, nd2 nd2, LinkedHashMap linkedHashMap) {
        this.x = ae5;
        this.y = nd2;
        this.z = linkedHashMap;
    }

    public final List B(ae5 ae5) {
        ae5 ae52 = A;
        ae52.getClass();
        wf8 wf8 = (wf8) this.z.get(f.b(ae52, ae5, true));
        if (wf8 != null) {
            return dt0.b1(wf8.q);
        }
        kj6.p("not a directory: ", ae5);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0052 A[SYNTHETIC, Splitter:B:23:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059 A[SYNTHETIC, Splitter:B:27:0x0059] */
    public final dq1 E(ae5 ae5) {
        Long l;
        boolean z2;
        Long l2;
        Long l3;
        Long l4;
        Long valueOf;
        Throwable th;
        Throwable th2;
        Throwable th3;
        ae5.getClass();
        ae5 ae52 = A;
        ae52.getClass();
        wf8 wf8 = (wf8) this.z.get(f.b(ae52, ae5, true));
        if (wf8 == null) {
            return null;
        }
        long j = wf8.h;
        if (j != -1) {
            go3 G = this.y.G(this.x);
            try {
                zw5 zw5 = new zw5(G.a(j));
                try {
                    wf8 = ya5.s(zw5, wf8);
                    wf8.getClass();
                    try {
                        zw5.close();
                        th2 = null;
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                } catch (Throwable th5) {
                    su0.b(th3, th5);
                }
                if (th2 != null) {
                    try {
                        G.close();
                        th = null;
                    } catch (Throwable th6) {
                        th = th6;
                    }
                    if (th != null) {
                        throw th;
                    }
                } else {
                    throw th2;
                }
            } catch (Throwable th7) {
                Throwable th8 = th7;
                if (G != null) {
                    try {
                        G.close();
                    } catch (Throwable th9) {
                        su0.b(th8, th9);
                    }
                }
                th = th8;
                wf8 = null;
            }
        }
        boolean z3 = wf8.b;
        boolean z4 = !z3;
        if (z3) {
            l = null;
        } else {
            l = Long.valueOf(wf8.f);
        }
        Long l5 = wf8.m;
        if (l5 != null) {
            l2 = Long.valueOf((l5.longValue() / 10000) - 11644473600000L);
            z2 = true;
        } else {
            Integer num = wf8.p;
            if (num != null) {
                z2 = true;
                l2 = Long.valueOf(((long) num.intValue()) * 1000);
            } else {
                z2 = true;
                l2 = null;
            }
        }
        Long l6 = wf8.k;
        if (l6 != null) {
            l3 = Long.valueOf((l6.longValue() / 10000) - 11644473600000L);
        } else {
            Integer num2 = wf8.n;
            if (num2 != null) {
                l3 = Long.valueOf(((long) num2.intValue()) * 1000);
            } else {
                int i = wf8.j;
                if (i != -1) {
                    int i2 = wf8.i;
                    if (i != -1) {
                        int i3 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        boolean z5 = z2;
                        gregorianCalendar.set(14, 0);
                        GregorianCalendar gregorianCalendar2 = gregorianCalendar;
                        gregorianCalendar2.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, (i >> 11) & 31, (i >> 5) & 63, i3);
                        l3 = Long.valueOf(gregorianCalendar2.getTime().getTime());
                    }
                }
                l3 = null;
            }
        }
        Long l7 = wf8.l;
        if (l7 != null) {
            valueOf = Long.valueOf((l7.longValue() / 10000) - 11644473600000L);
        } else {
            Integer num3 = wf8.o;
            if (num3 != null) {
                valueOf = Long.valueOf(((long) num3.intValue()) * 1000);
            } else {
                l4 = null;
                return new dq1(z4, z3, (ae5) null, l, l2, l3, l4);
            }
        }
        l4 = valueOf;
        return new dq1(z4, z3, (ae5) null, l, l2, l3, l4);
        th2 = th3;
        wf8 = null;
        if (th2 != null) {
        }
    }

    public final go3 G(ae5 ae5) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    public final tu6 I(ae5 ae5) {
        ae5.getClass();
        throw new IOException("zip file systems are read-only");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071  */
    public final oy6 L(ae5 ae5) {
        Throwable th;
        zw5 zw5;
        ae5.getClass();
        ae5 ae52 = A;
        ae52.getClass();
        wf8 wf8 = (wf8) this.z.get(f.b(ae52, ae5, true));
        if (wf8 != null) {
            long j = wf8.f;
            go3 G = this.y.G(this.x);
            try {
                zw5 = new zw5(G.a(wf8.h));
                try {
                    G.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                su0.b(th, th3);
            }
            if (th != null) {
                zw5.getClass();
                ya5.s(zw5, (wf8) null);
                if (wf8.g == 0) {
                    return new gg2(zw5, j, true);
                }
                return new gg2(new mb3(new zw5(new gg2(zw5, wf8.e, true)), new Inflater(true)), j, false);
            }
            throw th;
        }
        ta1.m("no such file: ", ae5);
        return null;
        th = th;
        zw5 = null;
        if (th != null) {
        }
    }

    public final tu6 a(ae5 ae5) {
        ae5.getClass();
        throw new IOException("zip file systems are read-only");
    }

    public final void k(ae5 ae5, ae5 ae52) {
        ae5.getClass();
        ae52.getClass();
        throw new IOException("zip file systems are read-only");
    }

    public final void l(ae5 ae5) {
        ae5.getClass();
        throw new IOException("zip file systems are read-only");
    }

    public final void o(ae5 ae5) {
        ae5.getClass();
        throw new IOException("zip file systems are read-only");
    }
}
