package defpackage;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: kt1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kt1 {
    public static final Set b = wn6.w(gv3.A);
    public static final Set c = qs.r1(new gv3[]{gv3.B, gv3.E});
    public static final rk4 d = new rk4(new int[]{1, 1, 11}, false);
    public static final rk4 e = new rk4(new int[]{1, 1, 13}, false);
    public ws1 a;

    static {
        new rk4(new int[]{1, 1, 2}, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (c.contains(r0.a) != false) goto L_0x001e;
     */
    public final rt1 a(x95 x95, v16 v16) {
        String[] strArr;
        yb5 yb5;
        rk4 rk4;
        v16.getClass();
        hv3 hv3 = v16.b;
        rk4 rk42 = hv3.b;
        String[] strArr2 = hv3.c;
        if (strArr2 == null) {
            strArr2 = hv3.d;
        }
        if (strArr2 != null) {
        }
        strArr2 = null;
        if (!(strArr2 == null || (strArr = hv3.e) == null)) {
            try {
                yb5 = rp3.i(strArr2, strArr);
            } catch (InvalidProtocolBufferException e2) {
                throw new IllegalStateException("Could not read data from ".concat(v16.a()), e2);
            } catch (Throwable th) {
                c().c.getClass();
                rk4 e3 = e();
                e3.getClass();
                if (rk42.f) {
                    rk4 = rk4.g;
                } else {
                    rk4 = rk4.h;
                }
                int i = rk4.b;
                int i2 = e3.b;
                if (i > i2 || (i >= i2 && rk4.c > e3.c)) {
                    e3 = rk4;
                }
                int i3 = rk42.c;
                int i4 = rk42.b;
                boolean z = false;
                if (!((i4 == 1 && i3 == 0) || i4 == 0)) {
                    int i5 = e3.b;
                    if (i4 > i5 || (i4 >= i5 && i3 > e3.c)) {
                        z = true;
                    }
                    z = !z;
                }
                if (!z) {
                    yb5 = null;
                } else {
                    throw th;
                }
            }
            if (yb5 != null) {
                uo3 uo3 = (uo3) yb5.w;
                ns5 ns5 = (ns5) yb5.x;
                d(v16);
                wo3 wo3 = new wo3(v16, ns5, uo3, f(v16), b(v16));
                return new rt1(x95, ns5, uo3, rk42, wo3, c(), "scope for " + wo3 + " in " + x95, x10.E);
            }
        }
        return null;
    }

    public final ht1 b(v16 v16) {
        c().c.getClass();
        int i = v16.b.g;
        if ((i & 16) == 0 || (i & 32) != 0) {
            return ht1.w;
        }
        return ht1.x;
    }

    public final ws1 c() {
        ws1 ws1 = this.a;
        if (ws1 != null) {
            return ws1;
        }
        sg3.a0("components");
        throw null;
    }

    public final z93 d(v16 v16) {
        rk4 rk4;
        rk4 rk42;
        rk4 rk43;
        c().c.getClass();
        hv3 hv3 = v16.b;
        rk4 rk44 = hv3.b;
        rk4 rk45 = hv3.b;
        rk4 e2 = e();
        e2.getClass();
        if (rk45.f) {
            rk4 = rk4.g;
        } else {
            rk4 = rk4.h;
        }
        int i = rk4.b;
        int i2 = e2.b;
        if (i > i2 || (i >= i2 && rk4.c > e2.c)) {
            e2 = rk4;
        }
        int i3 = rk45.c;
        int i4 = rk45.b;
        boolean z = false;
        if (!((i4 == 1 && i3 == 0) || i4 == 0)) {
            int i5 = e2.b;
            if (i4 > i5 || (i4 >= i5 && i3 > e2.c)) {
                z = true;
            }
            z = !z;
        }
        if (z) {
            return null;
        }
        rk4 rk46 = rk4.g;
        rk4 e3 = e();
        rk4 e4 = e();
        boolean z2 = rk44.f;
        e4.getClass();
        if (z2) {
            rk42 = rk46;
        } else {
            rk42 = rk4.h;
        }
        int i6 = rk42.b;
        int i7 = e4.b;
        if (i6 <= i7 && (i6 < i7 || rk42.c <= e4.c)) {
            rk43 = e4;
        } else {
            rk43 = rk42;
        }
        return new z93(rk44, rk46, e3, rk43, v16.a());
    }

    public final rk4 e() {
        c().c.getClass();
        return rk4.g;
    }

    public final boolean f(v16 v16) {
        c().c.getClass();
        c().c.getClass();
        hv3 hv3 = v16.b;
        if ((hv3.g & 2) == 0 || !hv3.b.equals(d)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (b.contains(r1.a) != false) goto L_0x001b;
     */
    public final xp0 g(v16 v16) {
        String[] strArr;
        yb5 yb5;
        rk4 rk4;
        hv3 hv3 = v16.b;
        rk4 rk42 = hv3.b;
        String[] strArr2 = hv3.c;
        if (strArr2 == null) {
            strArr2 = hv3.d;
        }
        if (strArr2 != null) {
        }
        strArr2 = null;
        if (!(strArr2 == null || (strArr = hv3.e) == null)) {
            try {
                yb5 = rp3.f(strArr2, strArr);
            } catch (InvalidProtocolBufferException e2) {
                throw new IllegalStateException("Could not read data from ".concat(v16.a()), e2);
            } catch (Throwable th) {
                c().c.getClass();
                rk4 e3 = e();
                e3.getClass();
                if (rk42.f) {
                    rk4 = rk4.g;
                } else {
                    rk4 = rk4.h;
                }
                int i = rk4.b;
                int i2 = e3.b;
                if (i > i2 || (i >= i2 && rk4.c > e3.c)) {
                    e3 = rk4;
                }
                int i3 = rk42.c;
                int i4 = rk42.b;
                boolean z = false;
                if (!((i4 == 1 && i3 == 0) || i4 == 0)) {
                    int i5 = e3.b;
                    if (i4 > i5 || (i4 >= i5 && i3 > e3.c)) {
                        z = true;
                    }
                    z = !z;
                }
                if (!z) {
                    yb5 = null;
                } else {
                    throw th;
                }
            }
            if (yb5 != null) {
                d(v16);
                return new xp0((uo3) yb5.w, (tr5) yb5.x, rk42, new rv3(v16, new nm5(f(v16)), b(v16)));
            }
        }
        return null;
    }
}
