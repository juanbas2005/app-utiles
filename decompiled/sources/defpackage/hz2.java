package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.e;
import com.google.firebase.components.ComponentRegistrar;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

/* renamed from: hz2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hz2 implements rr0, ib0, d81, od1, v52, tl6, eq7, eb0, uq0, lh2, tr, vr, j51 {
    public static final hz2 A = new hz2(4);
    public static final hz2 B = new hz2(5);
    public static final hz2 C = new hz2(6);
    public static final hz2 D = new hz2(7);
    public static final hz2 E = new hz2(8);
    public static final /* synthetic */ hz2 F = new hz2(9);
    public static final hz2 G = new hz2(10);
    public static final hz2 H = new hz2(11);
    public static final hz2 I = new hz2(12);
    public static final hz2 J = new hz2(13);
    public static final hz2 K = new hz2(14);
    public static final hz2 L = new hz2(15);
    public static final hz2 M = new hz2(16);
    public static final hz2 N = new hz2(17);
    public static final wb8 O = new Object();
    public static final hz2 x = new hz2(1);
    public static final hz2 y = new hz2(2);
    public static final /* synthetic */ hz2 z = new hz2(3);
    public final /* synthetic */ int w;

    public /* synthetic */ hz2(int i) {
        this.w = i;
    }

    public static hz2 G0(Context context, int i) {
        boolean z2;
        if (i != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        k75.g("Cannot create a CalendarItemStyle with a styleResId of 0", z2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, ov5.n);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        t49.L(context, obtainStyledAttributes, 4);
        t49.L(context, obtainStyledAttributes, 9);
        t49.L(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rq6.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new a0(0.0f)).a();
        obtainStyledAttributes.recycle();
        hz2 hz2 = new hz2(22);
        k75.h(rect.left);
        k75.h(rect.top);
        k75.h(rect.right);
        k75.h(rect.bottom);
        return hz2;
    }

    public static void O0(Object obj) {
        throw new Error("This method should not be called on " + obj + " with a new kotlin-reflect implementation. Please file an issue at https://kotl.in/issue");
    }

    public long A(int i, tt2 tt2) {
        return ((bg7) tt2.e).j(i);
    }

    public po7 A0(v76 v76) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                v76.getClass();
                return (po7) v76;
            default:
                return rc9.m(v76);
        }
    }

    public v76 B(zw3 zw3) {
        fu6 x0;
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                zw3.getClass();
                bh2 h0 = h0(zw3);
                if (h0 != null) {
                    return j(h0);
                }
                v76 n0 = n0(zw3);
                n0.getClass();
                return n0;
            default:
                zw3.getClass();
                zg2 p = rc9.p(zw3);
                if (p != null && (x0 = rc9.x0(p)) != null) {
                    return x0;
                }
                fu6 s = rc9.s(zw3);
                s.getClass();
                return s;
        }
    }

    public /* bridge */ du7 B0(hu6 hu6, hu6 hu62) {
        return rc9.E(this, hu6, hu62);
    }

    public zw3 C(nl0 nl0) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return (zw3) ((el0) nl0).x;
            default:
                return rc9.y0(nl0);
        }
    }

    public zw3 C0(zw3 zw3) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                O0(zw3);
                throw null;
            default:
                return rc9.f1(this, zw3);
        }
    }

    public Collection D(xo7 xo7) {
        ArrayList arrayList;
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                xo7.getClass();
                if (xo7 instanceof gq3) {
                    List<as3> e = ((gq3) xo7).e();
                    arrayList = new ArrayList(et0.e0(e, 10));
                    for (as3 as3 : e) {
                        as3.getClass();
                        arrayList.add((zw3) as3);
                    }
                } else if (xo7 instanceof cs3) {
                    List<as3> upperBounds = ((cs3) xo7).getUpperBounds();
                    arrayList = new ArrayList(et0.e0(upperBounds, 10));
                    for (as3 as32 : upperBounds) {
                        as32.getClass();
                        arrayList.add((zw3) as32);
                    }
                } else if (xo7 instanceof fl0) {
                    ArrayList arrayList2 = ((fl0) xo7).x;
                    if (arrayList2 != null) {
                        arrayList = new ArrayList(et0.e0(arrayList2, 10));
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            as3 as33 = (as3) it.next();
                            as33.getClass();
                            arrayList.add((zw3) as33);
                        }
                    } else {
                        sg3.a0("supertypes");
                        throw null;
                    }
                } else {
                    StringBuilder p = b81.p("Unsupported type constructor: ", xo7, " (");
                    p.append(xo7.getClass().getName());
                    p.append(')');
                    throw new IllegalStateException(p.toString().toString());
                }
                return arrayList;
            default:
                return rc9.V0(xo7);
        }
    }

    public void D0(j43 j43, a97 a97) {
        j43.getClass();
        j43.C.f(s53.i, new ea((Object) (gs2) a97, (f61) null, 0));
    }

    public boolean E(xo7 xo7) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return !(xo7 instanceof fl0);
            default:
                return rc9.i0(xo7);
        }
    }

    public boolean E0(zw3 zw3) {
        ds1 ds1;
        vw3 vw3;
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                zw3.getClass();
                if ((zw3 instanceof c2) && (((c2) zw3).J() instanceof y62)) {
                    return true;
                }
                if (zw3 instanceof ds1) {
                    ds1 = (ds1) zw3;
                } else {
                    ds1 = null;
                }
                if (ds1 == null || (vw3 = ds1.x) == null || !gr8.N(vw3)) {
                    return false;
                }
                return true;
            default:
                return rc9.j0(zw3);
        }
    }

    public xo7 F(v76 v76) {
        oq3 oq3;
        Class<?> componentType;
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                v76.getClass();
                if (v76 instanceof el0) {
                    return ((el0) v76).y;
                }
                c2 c2Var = (c2) v76;
                if (c2Var.u()) {
                    return w05.x;
                }
                vq3 J2 = c2Var.J();
                if (J2 instanceof oq3) {
                    oq3 = (oq3) J2;
                } else {
                    oq3 = null;
                }
                if (oq3 == null || (componentType = kl8.u(oq3).getComponentType()) == null || componentType.isPrimitive()) {
                    Object g = c2Var.g();
                    if (g == null) {
                        g = c2Var.J();
                    }
                    g.getClass();
                    return (xo7) g;
                }
                return (xo7) b26.a.b(Object[].class);
            default:
                return rc9.b1(v76);
        }
    }

    public ro1 F0(v76 v76) {
        v76.getClass();
        if (!(v76 instanceof c2) || !((c2) v76).s()) {
            return null;
        }
        return (ro1) v76;
    }

    public cl0 G(nl0 nl0) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return cl0.w;
            default:
                return rc9.v(nl0);
        }
    }

    public boolean H(zw3 zw3) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                zw3.getClass();
                if (((as3) B(zw3)).v() != ((as3) V(zw3)).v()) {
                    return true;
                }
                return false;
            default:
                zw3.getClass();
                if (rc9.n0(B(zw3)) != rc9.n0(V(zw3))) {
                    return true;
                }
                return false;
        }
    }

    public boolean I(zw3 zw3) {
        Object obj = null;
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                zw3.getClass();
                v76 n0 = n0(zw3);
                if (n0 != null) {
                    obj = F0(n0);
                }
                if (obj != null) {
                    return true;
                }
                return false;
            default:
                zw3.getClass();
                fu6 s = rc9.s(zw3);
                if (s != null) {
                    obj = rc9.o(s);
                }
                if (obj != null) {
                    return true;
                }
                return false;
        }
    }

    public /* bridge */ fu6 J(vw3 vw3) {
        return rc9.s(vw3);
    }

    public boolean K(v76 v76) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                v76.getClass();
                if (F0(v76) != null) {
                    return true;
                }
                return false;
            default:
                v76.getClass();
                if (rc9.o(v76) != null) {
                    return true;
                }
                return false;
        }
    }

    public zw3 K0(zw3 zw3) {
        fu6 g1;
        zw3.getClass();
        fu6 s = rc9.s(zw3);
        if (s == null || (g1 = rc9.g1(s, true)) == null) {
            return zw3;
        }
        return g1;
    }

    public boolean L(v76 v76) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                F(v76).getClass();
                return false;
            default:
                return rc9.l0(rc9.b1(v76));
        }
    }

    public uo7 L0() {
        return t49.C(false, this, (s3) null, 24);
    }

    public Object M(FileInputStream fileInputStream) {
        int i;
        byte[] bArr;
        try {
            nn5 o = nn5.o(fileInputStream);
            pp4 pp4 = new pp4(false);
            jn5[] jn5Arr = (jn5[]) Arrays.copyOf(new jn5[0], 0);
            pp4.b();
            if (jn5Arr.length <= 0) {
                Map m = o.m();
                m.getClass();
                for (Map.Entry entry : m.entrySet()) {
                    String str = (String) entry.getKey();
                    rn5 rn5 = (rn5) entry.getValue();
                    str.getClass();
                    rn5.getClass();
                    int C2 = rn5.C();
                    if (C2 == 0) {
                        i = -1;
                    } else {
                        i = kn5.a[b81.B(C2)];
                    }
                    switch (i) {
                        case -1:
                            throw new IOException("Value case is null.", (Throwable) null);
                        case 1:
                            pp4.d(new in5(str), Boolean.valueOf(rn5.t()));
                            break;
                        case 2:
                            pp4.d(new in5(str), Float.valueOf(rn5.x()));
                            break;
                        case 3:
                            pp4.d(new in5(str), Double.valueOf(rn5.w()));
                            break;
                        case 4:
                            pp4.d(new in5(str), Integer.valueOf(rn5.y()));
                            break;
                        case 5:
                            pp4.d(new in5(str), Long.valueOf(rn5.z()));
                            break;
                        case 6:
                            pp4.d(new in5(str), rn5.A());
                            break;
                        case 7:
                            in5 in5 = new in5(str);
                            qf3 n = rn5.B().n();
                            n.getClass();
                            pp4.d(in5, dt0.g1(n));
                            break;
                        case 8:
                            in5 in52 = new in5(str);
                            zf0 u = rn5.u();
                            int size = u.size();
                            if (size == 0) {
                                bArr = tf3.b;
                            } else {
                                byte[] bArr2 = new byte[size];
                                u.k(size, bArr2);
                                bArr = bArr2;
                            }
                            pp4.d(in52, bArr);
                            break;
                        case 9:
                            throw new IOException("Value not set.", (Throwable) null);
                        default:
                            h.c();
                            return null;
                    }
                }
                return new pp4(new LinkedHashMap(pp4.a()), true);
            }
            jn5 jn5 = jn5Arr[0];
            throw null;
        } catch (InvalidProtocolBufferException e) {
            throw new IOException("Unable to parse preferences proto.", e);
        }
    }

    public hu6 M0(v76 v76) {
        fu6 fu6;
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                ro1 F0 = F0(v76);
                if (F0 == null) {
                    return (hu6) v76;
                }
                O0(F0);
                throw null;
            default:
                qo1 o = rc9.o(v76);
                if (o == null || (fu6 = o.x) == null) {
                    return (hu6) v76;
                }
                return fu6;
        }
    }

    public float N(float f, long j) {
        return 0.0f;
    }

    public List N0(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (gv0 gv0 : componentRegistrar.getComponents()) {
            String str = gv0.a;
            if (str != null) {
                gv0 = new gv0(str, gv0.b, gv0.c, gv0.d, gv0.e, new yv0(0, (Object) str, (Object) gv0), gv0.g);
            }
            arrayList.add(gv0);
        }
        return arrayList;
    }

    public /* bridge */ gs2 O() {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return null;
            default:
                return null;
        }
    }

    public o85 P(v76 v76) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                is3 is3 = is3.c;
                return new z16(ed1.k((as3) v76));
            default:
                return rc9.U0(this, v76);
        }
    }

    public float Q(float f, float f2, long j) {
        return 0.0f;
    }

    public Collection R(v76 v76) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                O0(v76);
                throw null;
            default:
                return rc9.E0(this, v76);
        }
    }

    public zw3 S(zw3 zw3) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                O0(zw3);
                throw null;
            default:
                return rc9.z0(zw3);
        }
    }

    public void T(v76 v76) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                v76.getClass();
                return;
            default:
                rc9.u0(v76);
                return;
        }
    }

    public int U(xo7 xo7) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                xo7.getClass();
                if (xo7 instanceof gq3) {
                    return gl0.I((gq3) xo7).size();
                }
                return 0;
            default:
                return rc9.B0(xo7);
        }
    }

    public v76 V(zw3 zw3) {
        fu6 e1;
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                zw3.getClass();
                bh2 h0 = h0(zw3);
                if (h0 != null) {
                    return i(h0);
                }
                v76 n0 = n0(zw3);
                n0.getClass();
                return n0;
            default:
                zw3.getClass();
                zg2 p = rc9.p(zw3);
                if (p != null && (e1 = rc9.e1(p)) != null) {
                    return e1;
                }
                fu6 s = rc9.s(zw3);
                s.getClass();
                return s;
        }
    }

    public nl0 W(hu6 hu6) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                if (hu6 instanceof nl0) {
                    return (nl0) hu6;
                }
                return null;
            default:
                return rc9.n(this, hu6);
        }
    }

    public zw3 X(ArrayList arrayList) {
        fu6 fu6;
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                O0(this);
                throw null;
            default:
                int size = arrayList.size();
                if (size == 0) {
                    h.s("Expected some types");
                    return null;
                } else if (size == 1) {
                    return (du7) dt0.P0(arrayList);
                } else {
                    ArrayList arrayList2 = new ArrayList(et0.e0(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    boolean z2 = false;
                    boolean z3 = false;
                    while (it.hasNext()) {
                        du7 du7 = (du7) it.next();
                        if (z2 || gr8.N(du7)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (du7 instanceof fu6) {
                            fu6 = (fu6) du7;
                        } else if (du7 instanceof zg2) {
                            fu6 = ((zg2) du7).x;
                            z3 = true;
                        } else {
                            h.c();
                            return null;
                        }
                        arrayList2.add(fu6);
                    }
                    if (z2) {
                        return z62.c(x62.T, arrayList.toString());
                    }
                    lp7 lp7 = lp7.a;
                    if (!z3) {
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
    }

    public qo7 Y(zw3 zw3) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                O0(zw3);
                throw null;
            default:
                return rc9.t(zw3);
        }
    }

    public qo7 Z(ml0 ml0) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return new hs3(((fl0) ml0).w);
            default:
                return rc9.F0(ml0);
        }
    }

    public float a() {
        return 0.0f;
    }

    public boolean a0(v76 v76, v76 v762) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                v76.getClass();
                v762.getClass();
                return false;
            default:
                return rc9.Z(v76, v762);
        }
    }

    public boolean b(sp7 sp7, xo7 xo7) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                O0(sp7);
                throw null;
            default:
                return rc9.Y(sp7, xo7);
        }
    }

    public sp7 b0(xo7 xo7, int i) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                Object obj = gl0.I((gq3) xo7).get(i);
                obj.getClass();
                return (ds3) obj;
            default:
                return rc9.Q(xo7, i);
        }
    }

    public long c(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
        long floatToRawIntBits = (((long) Float.floatToRawIntBits(intBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(intBitsToFloat)) & 4294967295L);
        int i = yf6.a;
        return floatToRawIntBits;
    }

    public boolean c0(xo7 xo7, xo7 xo72) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                xo7.getClass();
                xo72.getClass();
                return xo7.equals(xo72);
            default:
                return rc9.k(xo7, xo72);
        }
    }

    public int d(zw3 zw3) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                zw3.getClass();
                return ((as3) zw3).I().size();
            default:
                return rc9.l(zw3);
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [hu6] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public boolean d0(v76 v76) {
        nl0 nl0 = null;
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                v76 n0 = n0(v76);
                if (n0 != null) {
                    ? M0 = M0(n0);
                    if (M0 instanceof nl0) {
                        nl0 = M0;
                    }
                }
                if (nl0 != null) {
                    return true;
                }
                return false;
            default:
                fu6 s = rc9.s(v76);
                if (s != null) {
                    nl0 = rc9.n(this, M0(s));
                }
                if (nl0 != null) {
                    return true;
                }
                return false;
        }
    }

    public boolean e(nl0 nl0) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return false;
            default:
                return nl0 instanceof hl0;
        }
    }

    public boolean e0(zw3 zw3) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                zw3.getClass();
                return false;
            default:
                zw3.getClass();
                return zw3 instanceof v05;
        }
    }

    public boolean f(qo7 qo7) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                qo7.getClass();
                gs3 gs3 = ((hs3) qo7).a;
                gs3 gs32 = gs3.c;
                return sg3.e(gs3, gs3.c);
            default:
                return rc9.t0(qo7);
        }
    }

    public long f0(float f) {
        return 0;
    }

    public fv3 g() {
        throw new UnsupportedOperationException("Not supported");
    }

    public void g0(v76 v76) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return;
            default:
                rc9.v0(v76);
                return;
        }
    }

    public v76 h(v76 v76) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return ((c2) v76).H(false);
            default:
                return rc9.g1(v76, false);
        }
    }

    public bh2 h0(zw3 zw3) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                zw3.getClass();
                if (!(zw3 instanceof c2) || ((c2) zw3).D() == null) {
                    return null;
                }
                return (bh2) zw3;
            default:
                return rc9.p(zw3);
        }
    }

    public v76 i(bh2 bh2) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                c2 K2 = ((c2) bh2).K();
                K2.getClass();
                return K2;
            default:
                return rc9.e1(bh2);
        }
    }

    public xo7 i0(zw3 zw3) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                zw3.getClass();
                v76 n0 = n0(zw3);
                if (n0 == null) {
                    n0 = B(zw3);
                }
                return F(n0);
            default:
                zw3.getClass();
                v76 s = rc9.s(zw3);
                if (s == null) {
                    s = B(zw3);
                }
                return rc9.b1(s);
        }
    }

    public v76 j(bh2 bh2) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                c2 D2 = ((c2) bh2).D();
                D2.getClass();
                return D2;
            default:
                return rc9.x0(bh2);
        }
    }

    public boolean j0(xo7 xo7) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return false;
            default:
                return rc9.l0(xo7);
        }
    }

    public int k(po7 po7) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                po7.getClass();
                if (po7 instanceof v76) {
                    return d((zw3) po7);
                }
                if (po7 instanceof qr) {
                    return ((qr) po7).size();
                }
                StringBuilder sb = new StringBuilder("unknown type argument list type: ");
                sb.append(po7);
                h.o(sb, ", ", b26.a.b(po7.getClass()));
                return 0;
            default:
                po7.getClass();
                if (po7 instanceof v76) {
                    return rc9.l((zw3) po7);
                }
                if (po7 instanceof qr) {
                    return ((qr) po7).size();
                }
                StringBuilder sb2 = new StringBuilder("unknown type argument list type: ");
                sb2.append(po7);
                h.o(sb2, ", ", b26.a.b(po7.getClass()));
                return 0;
        }
    }

    public float k0(float f, float f2) {
        return 0.0f;
    }

    public Object l() {
        return new pp4(true);
    }

    public v76 l0(v76 v76) {
        gq3 gq3;
        is3 is3;
        c2 c2Var;
        as3 as3;
        c2 c2Var2;
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                as3 as32 = (as3) v76;
                vq3 J2 = as32.J();
                gq3 gq32 = null;
                if (J2 instanceof gq3) {
                    gq3 = (gq3) J2;
                } else {
                    gq3 = null;
                }
                if (gq3 == null) {
                    return null;
                }
                List<gs3> I2 = as32.I();
                if (I2 != null && I2.isEmpty()) {
                    return null;
                }
                for (gs3 gs3 : I2) {
                    ks3 ks3 = gs3.a;
                    ks3 ks32 = ks3.w;
                    if (ks3 != ks32) {
                        List I3 = gl0.I(gq3);
                        if (I3.size() != I2.size()) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList(et0.e0(I2, 10));
                        Iterator it = I2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                gs3 gs32 = (gs3) it.next();
                                ks3 ks33 = gs32.a;
                                if (ks33 != ks32) {
                                    as3 as33 = gs32.b;
                                    if (ks33 != ks3.x) {
                                        as33 = null;
                                    }
                                    gs3 gs33 = gs3.c;
                                    gs32 = x91.C(new el0(as33, new fl0(gs32), false));
                                }
                                arrayList.add(gs32);
                            } else {
                                is3 is32 = is3.c;
                                List I4 = gl0.I(gq3);
                                if (I4.size() == arrayList.size()) {
                                    if (I4.isEmpty()) {
                                        is3 = is3.c.a(false);
                                    } else {
                                        is3 = new is3(sf4.a0(dt0.i1(I4, arrayList)), false);
                                    }
                                    int size = I2.size();
                                    for (int i = 0; i < size; i++) {
                                        gs3 gs34 = (gs3) I2.get(i);
                                        if (gs34.a != ks32) {
                                            List<as3> upperBounds = ((cs3) I3.get(i)).getUpperBounds();
                                            ArrayList arrayList2 = new ArrayList();
                                            for (as3 b : upperBounds) {
                                                as3 as34 = is3.b(b, ks32).b;
                                                as34.getClass();
                                                arrayList2.add(as34);
                                            }
                                            if (gs34.a == ks3.y) {
                                                as3 as35 = gs34.b;
                                                as35.getClass();
                                                arrayList2.add(as35);
                                            }
                                            as3 as36 = ((gs3) arrayList.get(i)).b;
                                            as36.getClass();
                                            fl0 fl0 = ((el0) as36).y;
                                            fl0.getClass();
                                            fl0.x = arrayList2;
                                        }
                                    }
                                    boolean v = as32.v();
                                    ArrayList arrayList3 = arrayList;
                                    List annotations = as32.getAnnotations();
                                    boolean z2 = as32 instanceof c2;
                                    if (z2) {
                                        c2Var = (c2) as32;
                                    } else {
                                        c2Var = null;
                                    }
                                    if (c2Var != null) {
                                        as3 = c2Var.b();
                                    } else {
                                        as3 = null;
                                    }
                                    if (z2) {
                                        c2Var2 = (c2) as32;
                                    } else {
                                        c2Var2 = null;
                                    }
                                    if (c2Var2 != null) {
                                        gq32 = c2Var2.g();
                                    }
                                    return new cu6(gq3, arrayList3, v, annotations, as3, false, false, false, gq32, (sr2) null);
                                }
                                StringBuilder sb = new StringBuilder("Params vs args count mismatch (");
                                sb.append(I4.size());
                                sb.append(" != ");
                                sb.append(arrayList.size());
                                sb.append(") for class '");
                                sb.append(gq3);
                                String E0 = dt0.E0(arrayList, (String) null, (String) null, (String) null, (vr2) null, 63);
                                sb.append("' with args: ");
                                sb.append(E0);
                                throw new IllegalStateException(sb.toString().toString());
                            }
                        }
                    }
                }
                return null;
            default:
                return rc9.u(v76);
        }
    }

    public jq7 m(qo7 qo7) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                qo7.getClass();
                ks3 ks3 = ((hs3) qo7).a.a;
                jq7 jq7 = jq7.OUT;
                if (ks3 == null) {
                    return jq7;
                }
                int ordinal = ks3.ordinal();
                if (ordinal == 0) {
                    return jq7.INV;
                }
                if (ordinal == 1) {
                    return jq7.IN;
                }
                if (ordinal == 2) {
                    return jq7;
                }
                h.c();
                return null;
            default:
                return rc9.V(qo7);
        }
    }

    public Object m0(Object obj, ls7 ls7, v6 v6Var) {
        e eVar;
        Map a = ((pp4) obj).a();
        ln5 n = nn5.n();
        for (Map.Entry entry : a.entrySet()) {
            Object value = entry.getValue();
            String str = ((in5) entry.getKey()).a;
            if (value instanceof Boolean) {
                qn5 D2 = rn5.D();
                boolean booleanValue = ((Boolean) value).booleanValue();
                D2.c();
                rn5.q((rn5) D2.x, booleanValue);
                eVar = D2.a();
            } else if (value instanceof Float) {
                qn5 D3 = rn5.D();
                float floatValue = ((Number) value).floatValue();
                D3.c();
                rn5.r((rn5) D3.x, floatValue);
                eVar = D3.a();
            } else if (value instanceof Double) {
                qn5 D4 = rn5.D();
                double doubleValue = ((Number) value).doubleValue();
                D4.c();
                rn5.o((rn5) D4.x, doubleValue);
                eVar = D4.a();
            } else if (value instanceof Integer) {
                qn5 D5 = rn5.D();
                int intValue = ((Number) value).intValue();
                D5.c();
                rn5.s((rn5) D5.x, intValue);
                eVar = D5.a();
            } else if (value instanceof Long) {
                qn5 D6 = rn5.D();
                long longValue = ((Number) value).longValue();
                D6.c();
                rn5.l((rn5) D6.x, longValue);
                eVar = D6.a();
            } else if (value instanceof String) {
                qn5 D7 = rn5.D();
                D7.c();
                rn5.m((rn5) D7.x, (String) value);
                eVar = D7.a();
            } else if (value instanceof Set) {
                qn5 D8 = rn5.D();
                on5 o = pn5.o();
                o.c();
                pn5.l((pn5) o.x, (Set) value);
                D8.c();
                rn5.n((rn5) D8.x, (pn5) o.a());
                eVar = D8.a();
            } else if (value instanceof byte[]) {
                qn5 D9 = rn5.D();
                byte[] bArr = (byte[]) value;
                zf0 g = zf0.g(bArr, 0, bArr.length);
                D9.c();
                rn5.p((rn5) D9.x, g);
                eVar = D9.a();
            } else {
                h.s("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                return null;
            }
            n.getClass();
            str.getClass();
            n.c();
            nn5.l((nn5) n.x).put(str, (rn5) eVar);
        }
        nn5 nn5 = (nn5) n.a();
        int a2 = nn5.a((pg6) null);
        Logger logger = ws0.f;
        if (a2 > 4096) {
            a2 = 4096;
        }
        ws0 ws0 = new ws0(ls7, a2);
        nn5.b(ws0);
        if (ws0.d > 0) {
            ws0.k();
        }
        return vs7.a;
    }

    public Iterable n(Object obj) {
        switch (this.w) {
            case 4:
                int i = ts1.a;
                Collection s = ((h28) obj).s();
                ArrayList arrayList = new ArrayList(et0.e0(s, 10));
                Iterator it = ((ArrayList) s).iterator();
                while (it.hasNext()) {
                    arrayList.add(((h28) it.next()).e1());
                }
                return arrayList;
            default:
                yr3[] yr3Arr = xn3.D;
                return ((ri0) obj).a().s();
        }
    }

    public v76 n0(zw3 zw3) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                zw3.getClass();
                if (h0(zw3) != null) {
                    return null;
                }
                return (v76) zw3;
            default:
                return rc9.s(zw3);
        }
    }

    public void o(zw3 zw3) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                zw3.getClass();
                return;
            default:
                zw3.getClass();
                rc9.p(zw3);
                return;
        }
    }

    public nl0 o0(v76 v76) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                hu6 M0 = M0(v76);
                if (M0 instanceof nl0) {
                    return (nl0) M0;
                }
                return null;
            default:
                return rc9.n(this, M0(v76));
        }
    }

    public zw3 p(qo7 qo7) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                qo7.getClass();
                return (zw3) ((hs3) qo7).a.b;
            default:
                return rc9.T(this, qo7);
        }
    }

    public boolean p0(xo7 xo7) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return xo7.equals(b26.a.b(Object.class));
            default:
                return rc9.f0(xo7);
        }
    }

    public boolean q(xo7 xo7) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return false;
            default:
                return rc9.m0(xo7);
        }
    }

    public boolean q0(nl0 nl0) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return false;
            default:
                return rc9.r0(nl0);
        }
    }

    public ml0 r(nl0 nl0) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return ((el0) nl0).y;
            default:
                return rc9.a1(nl0);
        }
    }

    public boolean r0(xo7 xo7) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                xo7.getClass();
                return xo7.equals(w05.x);
            default:
                return rc9.o0(xo7);
        }
    }

    public Rect s(Activity activity) {
        int i;
        hb0 hb0 = ib0.b;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", (Class[]) null).invoke(obj, (Object[]) null);
                invoke.getClass();
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", (Class[]) null).invoke(obj, (Object[]) null);
                invoke2.getClass();
                rect.set((Rect) invoke2);
            }
        } catch (Exception e) {
            if ((e instanceof NoSuchFieldException) || (e instanceof NoSuchMethodException) || (e instanceof IllegalAccessException) || (e instanceof InvocationTargetException)) {
                hb0.getClass();
                Log.w(hb0.b, e);
                activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
            } else {
                throw e;
            }
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = resources.getDimensionPixelSize(identifier);
            } else {
                i = 0;
            }
            int i2 = rect.bottom + i;
            if (i2 == point.y) {
                rect.bottom = i2;
            } else {
                int i3 = rect.right + i;
                if (i3 == point.x) {
                    rect.right = i3;
                } else if (rect.left == i) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor((Class[]) null);
                constructor.setAccessible(true);
                Object newInstance = constructor.newInstance((Object[]) null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", new Class[]{newInstance.getClass()});
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, new Object[]{newInstance});
                Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(newInstance);
                if (q4.u(obj2)) {
                    displayCutout = q4.f(obj2);
                }
            } catch (Exception e2) {
                if ((e2 instanceof ClassNotFoundException) || (e2 instanceof NoSuchMethodException) || (e2 instanceof NoSuchFieldException) || (e2 instanceof IllegalAccessException) || (e2 instanceof InvocationTargetException) || (e2 instanceof InstantiationException)) {
                    hb0.getClass();
                    Log.w(hb0.b, e2);
                } else {
                    throw e2;
                }
            }
            if (displayCutout != null) {
                if (rect.left == displayCutout.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutout.getSafeInsetRight()) {
                    rect.right = displayCutout.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutout.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutout.getSafeInsetBottom()) {
                    rect.bottom = displayCutout.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }

    public void s0(tp1 tp1, int i, int[] iArr, int[] iArr2) {
        wr.b(i, iArr, iArr2, false);
    }

    public boolean t(xo7 xo7) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return xo7 instanceof gq3;
            default:
                return rc9.g0(xo7);
        }
    }

    public qo7 t0(po7 po7, int i) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                po7.getClass();
                if (po7 instanceof hu6) {
                    return v0((zw3) po7, i);
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
            default:
                po7.getClass();
                if (po7 instanceof hu6) {
                    return rc9.K((zw3) po7, i);
                }
                if (po7 instanceof qr) {
                    Object obj2 = ((qr) po7).get(i);
                    obj2.getClass();
                    return (qo7) obj2;
                }
                StringBuilder sb2 = new StringBuilder("unknown type argument list type: ");
                sb2.append(po7);
                h.o(sb2, ", ", b26.a.b(po7.getClass()));
                return null;
        }
    }

    public String toString() {
        switch (this.w) {
            case 20:
                return "Arrangement#SpaceBetween";
            default:
                return super.toString();
        }
    }

    public void u(tp1 tp1, int i, int[] iArr, ey3 ey3, int[] iArr2) {
        if (ey3 == ey3.w) {
            wr.b(i, iArr, iArr2, false);
        } else {
            wr.b(i, iArr, iArr2, true);
        }
    }

    public boolean u0(xo7 xo7) {
        el4 el4;
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                if (xo7 instanceof oq3) {
                    oq3 oq3 = (oq3) xo7;
                    Class cls = oq3.x;
                    gu3 d0 = oq3.d0();
                    if (d0 == null || (el4 = (el4) su.b.I(su.a[7], d0)) == null) {
                        if (cls.isAnnotation() || cls.isEnum()) {
                            el4 = el4.x;
                        } else if (sg3.e(fd1.S(cls), Boolean.TRUE)) {
                            el4 = el4.A;
                        } else if (Modifier.isAbstract(cls.getModifiers())) {
                            el4 = el4.z;
                        } else if (!Modifier.isFinal(cls.getModifiers())) {
                            el4 = el4.y;
                        } else {
                            el4 = el4.x;
                        }
                    }
                    if (el4 != el4.x || oq3.b0() == hq0.z || oq3.b0() == hq0.A || oq3.b0() == hq0.B) {
                        return false;
                    }
                    return true;
                }
                return false;
            default:
                return rc9.h0(xo7);
        }
    }

    public boolean v(v76 v76) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                v76.getClass();
                if (!r0(i0(v76))) {
                    return false;
                }
                O0(v76);
                throw null;
            default:
                v76.getClass();
                if (!rc9.o0(i0(v76)) || rc9.p0(v76)) {
                    return false;
                }
                return true;
        }
    }

    public qo7 v0(zw3 zw3, int i) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                zw3.getClass();
                return new hs3((gs3) ((as3) zw3).I().get(i));
            default:
                return rc9.K(zw3, i);
        }
    }

    public boolean w(v76 v76) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                v76.getClass();
                xo7 F2 = F(v76);
                F2.getClass();
                return F2 instanceof gq3;
            default:
                v76.getClass();
                return rc9.g0(rc9.b1(v76));
        }
    }

    public boolean w0(zw3 zw3) {
        boolean e;
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                zw3.getClass();
                e = sg3.e(F(B(zw3)), F(V(zw3)));
                break;
            default:
                zw3.getClass();
                e = sg3.e(rc9.b1(B(zw3)), rc9.b1(V(zw3)));
                break;
        }
        return !e;
    }

    public qo7 x(v76 v76, int i) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                if (i < 0 || i >= d(v76)) {
                    return null;
                }
                return v0(v76, i);
            default:
                if (i < 0 || i >= rc9.l(v76)) {
                    return null;
                }
                return rc9.K(v76, i);
        }
    }

    public Boolean x0() {
        return null;
    }

    public jq7 y(sp7 sp7) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                int ordinal = ((cs3) sp7).c().ordinal();
                if (ordinal == 0) {
                    return jq7.INV;
                }
                if (ordinal == 1) {
                    return jq7.IN;
                }
                if (ordinal == 2) {
                    return jq7.OUT;
                }
                h.c();
                return null;
            default:
                return rc9.W(sp7);
        }
    }

    public boolean y0(zw3 zw3) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                zw3.getClass();
                return ((as3) zw3).v();
            default:
                return rc9.n0(zw3);
        }
    }

    public float z() {
        return 0.0f;
    }

    public void z0(v76 v76, xo7 xo7) {
        int i = this.w;
    }

    public /* bridge */ fu6 h(v76 v76) {
        return rc9.g1(v76, true);
    }

    public /* bridge */ fu6 i(bh2 bh2) {
        return rc9.e1(bh2);
    }

    public /* bridge */ fu6 j(bh2 bh2) {
        return rc9.x0(bh2);
    }

    private final void J0(v76 v76) {
    }

    private final void H0(v76 v76, xo7 xo7) {
    }

    private final void I0(v76 v76, xo7 xo7) {
    }
}
