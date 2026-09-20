package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import android.widget.EditText;
import com.google.zxing.ChecksumException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.lang.reflect.Proxy;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ns8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ns8 implements p41, av6, fc, ub0, sl5, e77, fx6, ot0, zj1, ws2, r8, od1, sy6, y45 {
    public static volatile ns8 y;
    public static final ou2 z = new ou2(1);
    public final /* synthetic */ int w;
    public Object x;

    /* JADX WARNING: type inference failed for: r5v1, types: [ue4, java.lang.Object] */
    public ns8(int i) {
        wj4 wj4;
        this.w = i;
        switch (i) {
            case 1:
                try {
                    wj4 = (wj4) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null);
                } catch (Exception unused) {
                    wj4 = z;
                }
                wj4[] wj4Arr = {ou2.b, wj4};
                ? obj = new Object();
                obj.a = wj4Arr;
                Charset charset = rf3.a;
                this.x = obj;
                return;
            case 4:
                this.x = new ArrayList();
                return;
            case 14:
                this.x = new HashSet();
                return;
            case 16:
                this.x = new br4(8, (Object) gv2.o);
                return;
            case 17:
                this.x = x91.u(Looper.getMainLooper());
                return;
            default:
                this.x = new CopyOnWriteArrayList();
                return;
        }
    }

    public static s24 V(ns8 ns8, int i) {
        vr2 vr2;
        s34 s34 = (s34) ns8.x;
        ix6 h = j45.h();
        if (h != null) {
            vr2 = h.e();
        } else {
            vr2 = null;
        }
        vr2 vr22 = vr2;
        ix6 j = j45.j(h);
        try {
            m34 m34 = (m34) s34.f.getValue();
            j45.m(h, j, vr22);
            return s34.q.a(i, m34.j, s34.d, new tm3(i, m34));
        } catch (Throwable th) {
            Throwable th2 = th;
            j45.m(h, j, vr22);
            throw th2;
        }
    }

    public static String W(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String next : bundle.keySet()) {
            jSONObject2.put(next, bundle.get(next));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public ws2 C(vw3 vw3) {
        vw3.getClass();
        return this;
    }

    public Object E(er5 er5, Object obj) {
        er5.getClass();
        ms1.l((ms1) this.x, er5, (StringBuilder) obj);
        return vs7.a;
    }

    public /* bridge */ /* synthetic */ Object F(xs2 xs2, Object obj) {
        X(xs2, (StringBuilder) obj);
        return vs7.a;
    }

    public ws2 H(vj1 vj1) {
        vj1.getClass();
        return this;
    }

    public Object I(ql4 ql4, Object obj) {
        boolean z2;
        wp0 p0;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        String str;
        StringBuilder sb = (StringBuilder) obj;
        ms1 ms1 = (ms1) this.x;
        ps1 ps1 = ms1.a;
        if (ql4.v() == iq0.z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!ps1.A()) {
            List t = ql4.t();
            t.getClass();
            ms1.u(sb, t);
            ms1.q(sb, ql4, (mm) null);
            if (!z2) {
                us1 f = ql4.f();
                f.getClass();
                ms1.Y(f, sb);
            }
            if (!(ql4.v() == iq0.x && ql4.o() == fl4.A) && (!ql4.v().a() || ql4.o() != fl4.x)) {
                fl4 o = ql4.o();
                o.getClass();
                ms1.D(o, sb, ms1.n(ql4));
            }
            ms1.C(ql4, sb);
            if (!ps1.u().contains(ns1.D) || !ql4.p()) {
                z3 = false;
            } else {
                z3 = true;
            }
            ms1.F(sb, z3, "inner");
            if (!ps1.u().contains(ns1.F) || !ql4.x0()) {
                z4 = false;
            } else {
                z4 = true;
            }
            ms1.F(sb, z4, "data");
            if (!ps1.u().contains(ns1.G) || !ql4.j()) {
                z5 = false;
            } else {
                z5 = true;
            }
            ms1.F(sb, z5, "inline");
            if (!ps1.u().contains(ns1.M) || !ql4.z0()) {
                z6 = false;
            } else {
                z6 = true;
            }
            ms1.F(sb, z6, "value");
            if (!ps1.u().contains(ns1.L) || !ql4.y0()) {
                z7 = false;
            } else {
                z7 = true;
            }
            ms1.F(sb, z7, "fun");
            if (ql4.w0()) {
                str = "companion object";
            } else {
                int ordinal = ql4.v().ordinal();
                if (ordinal == 0) {
                    str = "class";
                } else if (ordinal == 1) {
                    str = "interface";
                } else if (ordinal == 2) {
                    str = "enum class";
                } else if (ordinal == 3) {
                    str = "enum entry";
                } else if (ordinal == 4) {
                    str = "annotation class";
                } else if (ordinal == 5) {
                    str = "object";
                } else {
                    h.c();
                    return null;
                }
            }
            sb.append(ms1.A(str));
        }
        if (!rs1.k(ql4)) {
            if (!ps1.A()) {
                ms1.O(sb);
            }
            ms1.H(ql4, sb, true);
        } else {
            jz0 jz0 = ps1.G;
            yr3 yr3 = ps1.Z[31];
            jz0.getClass();
            yr3.getClass();
            if (((Boolean) jz0.x).booleanValue()) {
                if (ps1.A()) {
                    sb.append("companion object");
                }
                ms1.O(sb);
                vj1 r = ql4.r();
                if (r != null) {
                    sb.append("of ");
                    uq4 name = r.getName();
                    name.getClass();
                    sb.append(ms1.G(name, false));
                }
            }
            if (ps1.D() || !sg3.e(ql4.getName(), oz6.b)) {
                if (!ps1.A()) {
                    ms1.O(sb);
                }
                uq4 name2 = ql4.getName();
                name2.getClass();
                sb.append(ms1.G(name2, true));
            }
        }
        if (!z2) {
            List u0 = ql4.u0();
            u0.getClass();
            ms1.U(sb, u0, false);
            ms1.s(ql4, sb);
            if (!ql4.v().a()) {
                jz0 jz02 = ps1.i;
                yr3 yr32 = ps1.Z[7];
                jz02.getClass();
                yr32.getClass();
                if (((Boolean) jz02.x).booleanValue() && (p0 = ql4.p0()) != null) {
                    sb.append(" ");
                    ms1.q(sb, p0, (mm) null);
                    us1 f2 = p0.f();
                    f2.getClass();
                    ms1.Y(f2, sb);
                    sb.append(ms1.A("constructor"));
                    List S = p0.S();
                    S.getClass();
                    ms1.X(sb, S, p0.E());
                }
            }
            jz0 jz03 = ps1.x;
            yr3 yr33 = ps1.Z[22];
            jz03.getClass();
            yr33.getClass();
            if (!((Boolean) jz03.x).booleanValue() && !fv3.F(ql4.g0())) {
                Collection e = ql4.n().e();
                e.getClass();
                if (!e.isEmpty() && (e.size() != 1 || !fv3.y((vw3) e.iterator().next()))) {
                    ms1.O(sb);
                    sb.append(": ");
                    dt0.D0(e, sb, ", ", (String) null, (String) null, new ls1(ms1, 1), 60);
                }
            }
            ms1.Z(sb, u0);
        }
        return vs7.a;
    }

    public ws2 J(uq4 uq4) {
        uq4.getClass();
        return this;
    }

    public void K(yb9 yb9) {
        kk0 kk0 = (kk0) this.x;
        yb9.getClass();
        if (yb9.k()) {
            Object i = yb9.i();
            if (i != null) {
                kk0.f(i);
            } else {
                h.s("FCM token was null");
            }
        } else {
            hr2 hr2 = yh7.a;
            yb9.h();
            hr2.getClass();
            hr2.p(new Object[0]);
            Throwable h = yb9.h();
            if (h == null) {
                h = new IllegalStateException("FCM token request failed");
            }
            kk0.f(new m66(h));
        }
    }

    public Object L(y95 y95, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        ms1 ms1 = (ms1) this.x;
        ms1.getClass();
        up2 up2 = y95.A;
        sb.append(ms1.A("package-fragment"));
        vp2 vp2 = up2.a;
        vp2.getClass();
        String m = ms1.m(z65.N(vp2.f(vp2)));
        if (m.length() > 0) {
            sb.append(" ");
            sb.append(m);
        }
        if (ms1.a.p()) {
            sb.append(" in ");
            ms1.H(y95.r(), sb, false);
        }
        return vs7.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0103  */
    public Object M(wp0 wp0, Object obj) {
        boolean z2;
        jz0 jz0;
        boolean z3;
        wp0 p0;
        ArrayList arrayList;
        boolean z4 = wp0.Z;
        StringBuilder sb = (StringBuilder) obj;
        ms1 ms1 = (ms1) this.x;
        ms1.getClass();
        ms1.q(sb, wp0, (mm) null);
        ps1 ps1 = ms1.a;
        if (ps1.x() || wp0.r1().o() != fl4.y) {
            us1 f = wp0.f();
            f.getClass();
            if (ms1.Y(f, sb)) {
                z2 = true;
                ms1.B(wp0, sb);
                jz0 = ps1.P;
                yr3[] yr3Arr = ps1.Z;
                yr3 yr3 = yr3Arr[40];
                jz0.getClass();
                yr3.getClass();
                if (!((Boolean) jz0.x).booleanValue() || !z4 || z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    sb.append(ms1.A("constructor"));
                }
                ql4 s1 = wp0.r();
                s1.getClass();
                if (ps1.y()) {
                    if (z3) {
                        sb.append(" ");
                    }
                    ms1.H(s1, sb, true);
                    ms1.U(sb, wp0.getTypeParameters(), false);
                }
                List S = wp0.S();
                S.getClass();
                ms1.X(sb, S, wp0.E());
                jz0 jz02 = ps1.q;
                yr3 yr32 = yr3Arr[15];
                jz02.getClass();
                yr32.getClass();
                if (((Boolean) jz02.x).booleanValue() && !z4 && (p0 = s1.p0()) != null) {
                    List S2 = p0.S();
                    S2.getClass();
                    arrayList = new ArrayList();
                    for (Object next : S2) {
                        h28 h28 = (h28) next;
                        if (!h28.g1() && h28.F == null) {
                            arrayList.add(next);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        sb.append(" : ");
                        sb.append(ms1.A("this"));
                        sb.append(dt0.E0(arrayList, ", ", "(", ")", v61.M, 24));
                    }
                }
                if (ps1.y()) {
                    ms1.Z(sb, wp0.getTypeParameters());
                }
                return vs7.a;
            }
        }
        z2 = false;
        ms1.B(wp0, sb);
        jz0 = ps1.P;
        yr3[] yr3Arr2 = ps1.Z;
        yr3 yr33 = yr3Arr2[40];
        jz0.getClass();
        yr33.getClass();
        if (!((Boolean) jz0.x).booleanValue()) {
        }
        z3 = true;
        if (z3) {
        }
        ql4 s12 = wp0.r();
        s12.getClass();
        if (ps1.y()) {
        }
        List S3 = wp0.S();
        S3.getClass();
        ms1.X(sb, S3, wp0.E());
        jz0 jz022 = ps1.q;
        yr3 yr322 = yr3Arr2[15];
        jz022.getClass();
        yr322.getClass();
        List S22 = p0.S();
        S22.getClass();
        arrayList = new ArrayList();
        while (r0.hasNext()) {
        }
        if (!arrayList.isEmpty()) {
        }
        if (ps1.y()) {
        }
        return vs7.a;
    }

    public void O(nm2 nm2) {
        ArrayList arrayList = (ArrayList) this.x;
        if (nm2 instanceof e05) {
            arrayList.add(nm2);
        } else if (nm2 instanceof az0) {
            for (e05 add : ((az0) nm2).a) {
                arrayList.add(add);
            }
        } else {
            h.c();
        }
    }

    public void P(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i2 + i3;
        if (i4 == 0) {
            i5 = 1;
        } else {
            i5 = 2;
        }
        int[] iArr = new int[(i6 / i5)];
        for (int i7 = 0; i7 < i6; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i5] = bArr[i7 + i] & 255;
            }
        }
        try {
            ((br4) this.x).x(iArr, i3 / i5);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i5];
                }
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.a();
        }
    }

    public x31 Q(Object obj, gq3 gq3, Activity activity, fa2 fa2) {
        gq3.getClass();
        w31 w31 = new w31(gq3, fa2);
        ClassLoader classLoader = (ClassLoader) this.x;
        Class<?> loadClass = classLoader.loadClass("java.util.function.Consumer");
        loadClass.getClass();
        Object newProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{loadClass}, w31);
        newProxyInstance.getClass();
        Class<?> cls = obj.getClass();
        Class<?> loadClass2 = classLoader.loadClass("java.util.function.Consumer");
        loadClass2.getClass();
        cls.getMethod("addWindowLayoutInfoListener", new Class[]{Activity.class, loadClass2}).invoke(obj, new Object[]{activity, newProxyInstance});
        Class<?> cls2 = obj.getClass();
        Class<?> loadClass3 = classLoader.loadClass("java.util.function.Consumer");
        loadClass3.getClass();
        return new x31(cls2.getMethod("removeWindowLayoutInfoListener", new Class[]{loadClass3}), obj, newProxyInstance);
    }

    public void R(byte b) {
        ((Parcel) this.x).writeByte(b);
    }

    public void S(float f) {
        ((Parcel) this.x).writeFloat(f);
    }

    public void T(long j) {
        long b = wg7.b(j);
        byte b2 = 0;
        if (!xg7.a(b, 0)) {
            if (xg7.a(b, 4294967296L)) {
                b2 = 1;
            } else if (xg7.a(b, 8589934592L)) {
                b2 = 2;
            }
        }
        R(b2);
        if (!xg7.a(wg7.b(j), 0)) {
            S(wg7.c(j));
        }
    }

    public ql4 U(x06 x06) {
        x06 x062;
        c14 c14;
        ji4 ji4;
        vq0 vq0;
        x06.getClass();
        up2 c = x06.c();
        Class<?> declaringClass = x06.a.getDeclaringClass();
        if (declaringClass != null) {
            x062 = new x06(declaringClass);
        } else {
            x062 = null;
        }
        if (x062 != null) {
            ql4 U = U(x062);
            if (U != null) {
                ji4 = U.Y();
            } else {
                ji4 = null;
            }
            if (ji4 != null) {
                vq0 = ji4.e(x06.e(), oz4.D);
            } else {
                vq0 = null;
            }
            if (vq0 instanceof ql4) {
                return (ql4) vq0;
            }
        } else if (!(c == null || (c14 = (c14) dt0.y0(sg3.D(((d14) this.x).c(c.b())))) == null)) {
            i14 i14 = c14.F.d;
            i14.getClass();
            return i14.v(x06.e(), x06);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0076, code lost:
        if (r0.l() != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ae, code lost:
        if (r0.l() != false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0166, code lost:
        if (defpackage.fv3.E(r1, defpackage.m27.d) == false) goto L_0x0168;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0081  */
    public void X(xs2 xs2, StringBuilder sb) {
        String str;
        boolean z2;
        ms1 ms1 = (ms1) this.x;
        ps1 ps1 = ms1.a;
        if (!ps1.A()) {
            if (!ps1.z()) {
                List h0 = xs2.h0();
                h0.getClass();
                ms1.u(sb, h0);
                ms1.q(sb, xs2, (mm) null);
                us1 f = xs2.f();
                f.getClass();
                ms1.Y(f, sb);
                ms1.E(xs2, sb);
                if (ps1.t()) {
                    ms1.C(xs2, sb);
                }
                ms1.K(xs2, sb);
                if (ps1.t()) {
                    boolean z3 = false;
                    if (xs2.q()) {
                        Collection s = xs2.s();
                        s.getClass();
                        Iterable iterable = s;
                        if (!((Collection) iterable).isEmpty()) {
                            Iterator it = iterable.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                } else if (((xs2) it.next()).q()) {
                                }
                            }
                        }
                        z2 = true;
                        if (xs2.w()) {
                            Collection s2 = xs2.s();
                            s2.getClass();
                            Iterable iterable2 = s2;
                            if (!((Collection) iterable2).isEmpty()) {
                                Iterator it2 = iterable2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if (((xs2) it2.next()).w()) {
                                    }
                                }
                            }
                            z3 = true;
                        }
                        ms1.F(sb, xs2.M(), "tailrec");
                        ms1.F(sb, xs2.i(), "suspend");
                        ms1.F(sb, xs2.j(), "inline");
                        ms1.F(sb, z3, "infix");
                        ms1.F(sb, z2, "operator");
                    }
                    z2 = false;
                    if (xs2.w()) {
                    }
                    ms1.F(sb, xs2.M(), "tailrec");
                    ms1.F(sb, xs2.i(), "suspend");
                    ms1.F(sb, xs2.j(), "inline");
                    ms1.F(sb, z3, "infix");
                    ms1.F(sb, z2, "operator");
                } else {
                    ms1.F(sb, xs2.i(), "suspend");
                }
                ms1.B(xs2, sb);
                if (ps1.D()) {
                    if (xs2.l0()) {
                        sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (xs2.q0()) {
                        sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb.append(ms1.A("fun"));
            sb.append(" ");
            List typeParameters = xs2.getTypeParameters();
            typeParameters.getClass();
            ms1.U(sb, typeParameters, true);
            ms1.M(xs2, sb);
        }
        ms1.H(xs2, sb, true);
        List S = xs2.S();
        S.getClass();
        ms1.X(sb, S, xs2.E());
        ms1.N(xs2, sb);
        vw3 k = xs2.k();
        jz0 jz0 = ps1.l;
        yr3[] yr3Arr = ps1.Z;
        yr3 yr3 = yr3Arr[10];
        jz0.getClass();
        yr3.getClass();
        if (!((Boolean) jz0.x).booleanValue()) {
            jz0 jz02 = ps1.k;
            yr3 yr32 = yr3Arr[9];
            jz02.getClass();
            yr32.getClass();
            if (!((Boolean) jz02.x).booleanValue() && k != null) {
                uq4 uq4 = fv3.e;
            }
            sb.append(": ");
            if (k == null) {
                str = "[NULL]";
            } else {
                str = ms1.P(k);
            }
            sb.append(str);
        }
        List typeParameters2 = xs2.getTypeParameters();
        typeParameters2.getClass();
        ms1.Z(sb, typeParameters2);
    }

    public void Y(ar5 ar5, StringBuilder sb, String str) {
        ms1 ms1 = (ms1) this.x;
        int ordinal = ms1.a.w().ordinal();
        if (ordinal == 0) {
            ms1.C(ar5, sb);
            sb.append(str.concat(" for "));
            cr5 f1 = ar5.f1();
            f1.getClass();
            ms1.l(ms1, f1, sb);
        } else if (ordinal == 1) {
            X(ar5, sb);
        } else if (ordinal != 2) {
            h.c();
        }
    }

    public void b(Object obj) {
        q8 q8Var = (q8) obj;
        rq2 rq2 = (rq2) this.x;
        nq2 nq2 = (nq2) rq2.F.pollLast();
        if (nq2 == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = nq2.w;
        int i = nq2.x;
        bq2 A = rq2.c.A(str);
        if (A == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
            return;
        }
        A.x(i, q8Var.w, q8Var.x);
    }

    public xs2 build() {
        return (o62) this.x;
    }

    public long c() {
        kp1 kp1 = (kp1) this.x;
        long c = kp1.P.c();
        if (c != 16) {
            return c;
        }
        y76 y76 = (y76) h49.w(kp1, d86.b);
        if (y76 != null) {
            long j = y76.a;
            if (j != 16) {
                return j;
            }
        }
        return ((jt0) h49.w(kp1, j41.a)).a;
    }

    public Object d(fr5 fr5, Object obj) {
        Y(fr5, (StringBuilder) obj, "getter");
        return vs7.a;
    }

    public Object e(h28 h28, Object obj) {
        ((ms1) this.x).W(h28, true, (StringBuilder) obj, true);
        return vs7.a;
    }

    public Object f(r3 r3Var, Object obj) {
        ((ms1) this.x).S(r3Var, (StringBuilder) obj, true);
        return vs7.a;
    }

    public Object g(qz3 qz3, Object obj) {
        ((StringBuilder) obj).append(qz3.getName());
        return vs7.a;
    }

    public ws2 h(int i) {
        if (i != 0) {
            return this;
        }
        throw null;
    }

    public Object k(jr5 jr5, Object obj) {
        Y(jr5, (StringBuilder) obj, "setter");
        return vs7.a;
    }

    public float l(float f, float f2) {
        return 0.0f;
    }

    public void m(m91 m91) {
        this.x = m91;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", (Throwable) null);
        }
    }

    public Iterable n(Object obj) {
        vq0 vq0;
        ql4 ql4;
        xn3 xn3 = (xn3) this.x;
        Collection<vw3> e = ((ql4) obj).n().e();
        e.getClass();
        ArrayList arrayList = new ArrayList();
        for (vw3 L : e) {
            vq0 u = L.L().u();
            ql4 ql42 = null;
            if (u != null) {
                vq0 = u.a();
            } else {
                vq0 = null;
            }
            if (vq0 instanceof ql4) {
                ql4 = (ql4) vq0;
            } else {
                ql4 = null;
            }
            if (ql4 != null && (ql42 = xn3.a(ql4)) == null) {
                ql42 = ql4;
            }
            if (ql42 != null) {
                arrayList.add(ql42);
            }
        }
        return arrayList;
    }

    public void onEvent(String str, Bundle bundle) {
        m91 m91 = (m91) this.x;
        if (m91 != null) {
            try {
                p91 p91 = m91.a;
                ((ya1) p91.o.x).b(new n91(p91, System.currentTimeMillis() - p91.d, "$A$:" + W(str, bundle)));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", (Throwable) null);
            }
        }
    }

    public yb9 q(Object obj) {
        bo6 bo6 = (bo6) obj;
        jz0 jz0 = (jz0) this.x;
        if (bo6 == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", (Throwable) null);
            return b35.l((Object) null);
        }
        k91 k91 = (k91) jz0.y;
        k91.a(k91);
        k91.m.B0((String) null, (ya1) k91.e.x);
        k91.q.d((Object) null);
        return b35.l((Object) null);
    }

    public ws2 r(rm rmVar) {
        rmVar.getClass();
        return this;
    }

    public float s(float f) {
        return ((hv2) this.x).s(f);
    }

    public Object t(v34 v34, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        ms1 ms1 = (ms1) this.x;
        ms1.getClass();
        up2 up2 = v34.z;
        sb.append(ms1.A("package"));
        vp2 vp2 = up2.a;
        vp2.getClass();
        String m = ms1.m(z65.N(vp2.f(vp2)));
        if (m.length() > 0) {
            sb.append(" ");
            sb.append(m);
        }
        if (ms1.a.p()) {
            sb.append(" in context of ");
            ms1.H(v34.y, sb, false);
        }
        return vs7.a;
    }

    public String toString() {
        switch (this.w) {
            case 26:
                StringBuilder sb = new StringBuilder();
                c14 c14 = (c14) this.x;
                sb.append(c14);
                sb.append(": ");
                sb.append(((Map) p25.q(c14.E, c14.I[0])).keySet());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public Object u(ut1 ut1, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        ms1 ms1 = (ms1) this.x;
        ms1.getClass();
        ms1.q(sb, ut1, (mm) null);
        us1 us1 = ut1.B;
        us1.getClass();
        ms1.Y(us1, sb);
        ms1.C(ut1, sb);
        sb.append(ms1.A("typealias"));
        sb.append(" ");
        ms1.H(ut1, sb, true);
        ms1.U(sb, ut1.u0(), false);
        ms1.s(ut1, sb);
        sb.append(" = ");
        sb.append(ms1.P(ut1.h1()));
        return vs7.a;
    }

    public ws2 v(us1 us1) {
        us1.getClass();
        return this;
    }

    public Object x(tl4 tl4, Object obj) {
        ((ms1) this.x).H(tl4, (StringBuilder) obj, true);
        return vs7.a;
    }

    public long y(se3 se3, long j, ey3 ey3, long j2) {
        boolean z2;
        long j3 = ((oe3) ((sr2) this.x).b()).a;
        int i = se3.a + ((int) (j3 >> 32));
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j >> 32);
        if (ey3 == ey3.w) {
            z2 = true;
        } else {
            z2 = false;
        }
        return (((long) dh4.d(se3.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L) | (((long) dh4.d(i, i2, i3, z2)) << 32);
    }

    public Object z(ix5 ix5) {
        return gr8.H(new c6(((qt) this.x).B, 4), ix5);
    }

    public ws2 B() {
        return this;
    }

    public ws2 G() {
        return this;
    }

    public ws2 N() {
        return this;
    }

    public ws2 j() {
        return this;
    }

    public ws2 o() {
        return this;
    }

    public ws2 p() {
        return this;
    }

    public ws2 w() {
        return this;
    }

    public ws2 A(fl4 fl4) {
        return this;
    }

    public ws2 a(List list) {
        return this;
    }

    public ws2 i(qz3 qz3) {
        return this;
    }

    public /* synthetic */ ns8(int i, boolean z2) {
        this.w = i;
    }

    public /* synthetic */ ns8(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public ns8(ClassLoader classLoader) {
        this.w = 11;
        classLoader.getClass();
        this.x = classLoader;
    }

    public ns8(EditText editText) {
        this.w = 20;
        this.x = new jz0(editText);
    }
}
