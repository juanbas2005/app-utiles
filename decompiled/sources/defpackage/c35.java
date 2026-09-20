package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Patterns;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* renamed from: c35  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class c35 {
    public static x83 a;
    public static x83 b;
    public static x83 c;

    /* JADX WARNING: type inference failed for: r1v13, types: [ib2, java.lang.Object] */
    public static final void a(nw6 nw6, ml4 ml4, yt2 yt2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        fw0 fw0 = h49.y;
        yt2.g0(-977568115);
        if ((i & 6) == 0) {
            if (yt2.g(nw6)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (yt2.g(ml4)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (yt2.i(fw0)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i2 & 1, z)) {
            String i6 = h75.i(R.string.m3c_snackbar_pane_title, yt2);
            Object Q = yt2.Q();
            Object obj = Q;
            if (Q == ay0.a) {
                ? obj2 = new Object();
                obj2.a = new Object();
                obj2.b = new ArrayList();
                yt2.o0(obj2);
                obj = obj2;
            }
            ib2 ib2 = (ib2) obj;
            Object obj3 = ib2.a;
            ArrayList arrayList = ib2.b;
            if (!sg3.e(nw6, obj3)) {
                yt2.e0(1441886385);
                ib2.a = nw6;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    arrayList2.add((nw6) ((hb2) arrayList.get(i7)).a);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(nw6)) {
                    arrayList3.add(nw6);
                }
                arrayList.clear();
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    Object obj4 = arrayList3.get(i8);
                    if (obj4 != null) {
                        arrayList4.add(obj4);
                    }
                }
                int size3 = arrayList4.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    nw6 nw62 = (nw6) arrayList4.get(i9);
                    arrayList.add(new hb2(nw62, su0.J(-1952400805, new uo2(nw62, nw6, ib2, i6), yt2)));
                }
                yt2.r(false);
            } else {
                yt2.e0(1443889109);
                yt2.r(false);
            }
            lh4 d = mb0.d(xb4.y, false);
            int hashCode = Long.hashCode(yt2.T);
            vf5 m = yt2.m();
            ml4 E = gw8.E(yt2, ml4);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt2.i0();
            if (yt2.S) {
                yt2.l(vy0);
            } else {
                yt2.r0();
            }
            g75.Q(tx0.f, yt2, d);
            g75.Q(tx0.e, yt2, m);
            g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
            g75.O(yt2, tx0.h);
            g75.Q(tx0.d, yt2, E);
            yx5 B = yt2.B();
            if (B != null) {
                B.b |= 1;
                ib2.c = B;
                yt2.e0(-1888182177);
                int size4 = arrayList.size();
                for (int i10 = 0; i10 < size4; i10++) {
                    hb2 hb2 = (hb2) arrayList.get(i10);
                    nw6 nw63 = (nw6) hb2.a;
                    fw0 fw02 = hb2.b;
                    yt2.c0(1325010085, nw63);
                    fw02.u(su0.J(-1893791890, new lw6(nw63, 0), yt2), yt2, 6);
                    yt2.r(false);
                }
                yt2.r(false);
                yt2.r(true);
            } else {
                h.s("no recompose scope found");
                return;
            }
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new dj7((Object) nw6, (Object) ml4, i, 18);
        }
    }

    public static final void b(qw6 qw6, ml4 ml4, hs2 hs2, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        yt2.g0(-1077081618);
        if (yt2.g(qw6)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (yt2.g(ml4)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3 | 384;
        if ((i5 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i5 & 1, z)) {
            hs2 = h49.y;
            nw6 nw6 = (nw6) qw6.b.getValue();
            p4 p4Var = (p4) yt2.k(xy0.a);
            boolean g = yt2.g(nw6) | yt2.i(p4Var);
            Object Q = yt2.Q();
            if (g || Q == ay0.a) {
                Q = new k05(nw6, p4Var, (f61) null, 20);
                yt2.o0(Q);
            }
            t49.h((gs2) Q, yt2, nw6);
            a((nw6) qw6.b.getValue(), ml4, yt2, i5 & 1008);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ou4(qw6, ml4, hs2, i);
        }
    }

    public static final boolean c(tg7 tg7) {
        k32 k32;
        qj5 qj5;
        dk5 dk5 = tg7.c;
        if (dk5 == null || (qj5 = dk5.b) == null) {
            k32 = null;
        } else {
            k32 = new k32(qj5.b);
        }
        boolean z = false;
        if (k32 != null && k32.a == 1) {
            z = true;
        }
        return !z;
    }

    public static final Object d(yb9 yb9, md3 md3) {
        if (yb9.j()) {
            Exception h = yb9.h();
            if (h != null) {
                throw h;
            } else if (!yb9.d) {
                return yb9.i();
            } else {
                throw new CancellationException("Task " + yb9 + " was cancelled normally.");
            }
        } else {
            kk0 kk0 = new kk0(1, rc9.a0(md3));
            kk0.v();
            yb9.c(gv1.x, new kb1(kk0));
            return kk0.t();
        }
    }

    public static aq4 e() {
        return new ed5(vs7.a, d63.G);
    }

    public static final zr3 f(q2 q2Var, gy0 gy0, String str) {
        q2Var.getClass();
        zr3 a2 = q2Var.a(gy0, str);
        if (a2 != null) {
            return a2;
        }
        h03.v(q2Var.c(), str);
        throw null;
    }

    public static final zr3 g(q2 q2Var, j42 j42, Object obj) {
        q2Var.getClass();
        obj.getClass();
        zr3 b2 = q2Var.b(j42, obj);
        if (b2 != null) {
            return b2;
        }
        gq3 b3 = b26.a.b(obj.getClass());
        gq3 c2 = q2Var.c();
        c2.getClass();
        String A = b3.A();
        if (A == null) {
            A = String.valueOf(b3);
        }
        h03.v(c2, A);
        throw null;
    }

    public static SharedPreferences h(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final ba6 i(gh4 gh4) {
        Object B = gh4.B();
        if (B instanceof ba6) {
            return (ba6) B;
        }
        return null;
    }

    public static final float j(ba6 ba6) {
        if (ba6 != null) {
            return ba6.a;
        }
        return 0.0f;
    }

    public static final int k(pi6 pi6, byte b2, int i, int i2) {
        if (i < 0 || i >= pi6.a()) {
            h.j(String.valueOf(i));
            return 0;
        } else if (i > i2 || i2 > pi6.a()) {
            h.j(String.valueOf(i2));
            return 0;
        } else {
            int i3 = pi6.b;
            byte[] bArr = pi6.a;
            while (i < i2) {
                if (bArr[i3 + i] == b2) {
                    return i;
                }
                i++;
            }
            return -1;
        }
    }

    public static final boolean l(String str) {
        if (str == null || str.length() == 0 || !Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
            return false;
        }
        return true;
    }

    public static final kq6 m(kq6 kq6, kq6 kq62, float f) {
        kq6.getClass();
        kq62.getClass();
        float E = we.E(ox1.a(0), ox1.a(0), f);
        float E2 = we.E(ox1.b(0), ox1.b(0), f);
        Float.floatToRawIntBits(E);
        Float.floatToRawIntBits(E2);
        uq3.F(0, 0, f);
        throw null;
    }

    public static Typeface n(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, gl0.K(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public static final void o(pe2 pe2, oz4 oz4, x95 x95, uq4 uq4) {
        pe2.getClass();
        oz4.getClass();
        x95.getClass();
        uq4.getClass();
        String str = ((y95) x95).A.a.a;
        uq4.b().getClass();
        str.getClass();
    }

    public static void p(int i, Object[] objArr) {
        int i2 = 0;
        while (i2 < i) {
            if (objArr[i2] != null) {
                i2++;
            } else {
                ku4.j(hl6.p(new StringBuilder(String.valueOf(i2).length() + 9), "at index ", i2));
                return;
            }
        }
    }

    public static final void q(Level level, Executor executor, Exception exc, String str, Object... objArr) {
        yl0 yl0 = new yl0(level, exc, str, objArr, 7, false);
        int i = mc9.a;
        executor.execute(new z46(new Object(), vb9.a(), false, yl0, 14));
    }
}
