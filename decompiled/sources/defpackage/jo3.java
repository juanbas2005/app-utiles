package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.List;

/* renamed from: jo3  reason: default package */
public final class jo3 implements vr2 {
    public static final jo3 A = new jo3(3);
    public static final jo3 B = new jo3(4);
    public static final jo3 C = new jo3(5);
    public static final jo3 D = new jo3(6);
    public static final jo3 E = new jo3(7);
    public static final jo3 F = new jo3(8);
    public static final jo3 G = new jo3(9);
    public static final jo3 H = new jo3(10);
    public static final jo3 I = new jo3(11);
    public static final jo3 J = new jo3(12);
    public static final jo3 K = new jo3(13);
    public static final jo3 L = new jo3(14);
    public static final jo3 M = new jo3(15);
    public static final jo3 N = new jo3(16);
    public static final jo3 O = new jo3(17);
    public static final jo3 P = new jo3(18);
    public static final jo3 Q = new jo3(19);
    public static final jo3 R = new jo3(20);
    public static final jo3 S = new jo3(21);
    public static final jo3 T = new jo3(22);
    public static final jo3 U = new jo3(23);
    public static final jo3 V = new jo3(24);
    public static final jo3 W = new jo3(25);
    public static final jo3 X = new jo3(26);
    public static final jo3 Y = new jo3(27);
    public static final jo3 Z = new jo3(28);
    public static final jo3 a0 = new jo3(29);
    public static final jo3 x = new jo3(0);
    public static final jo3 y = new jo3(1);
    public static final jo3 z = new jo3(2);
    public final /* synthetic */ int w;

    public /* synthetic */ jo3(int i) {
        this.w = i;
    }

    public final Object y(Object obj) {
        cs3 cs3;
        ql4 ql4;
        fu6 g0;
        du7 F2;
        vw3 k;
        boolean z2;
        gq0 f;
        ut1 ut1;
        vw3 k2;
        boolean z3 = false;
        switch (this.w) {
            case b85.b:
                Class<?> returnType = ((Method) obj).getReturnType();
                returnType.getClass();
                return m06.b(returnType);
            case 1:
                y92 y92 = (y92) obj;
                y92 y922 = rp3.a;
                y92.getClass();
                y92.a(qp3.a);
                y92.a(qp3.b);
                y92.a(qp3.c);
                y92.a(qp3.d);
                y92.a(qp3.e);
                y92.a(qp3.f);
                y92.a(qp3.g);
                y92.a(qp3.h);
                y92.a(qp3.i);
                y92.a(qp3.j);
                y92.a(qp3.k);
                y92.a(qp3.l);
                y92.a(sl6.a);
                return vs7.a;
            case 2:
                cr5 cr5 = (cr5) obj;
                k26 k26 = yq3.w;
                cr5.getClass();
                return ms1.e.o(cr5) + " | " + ta6.b(cr5).s();
            case 3:
                qu3 qu3 = (qu3) obj;
                k26 k262 = yq3.w;
                qu3.getClass();
                return qu3.b + " | " + tf4.y(qu3).a;
            case 4:
                xs2 xs2 = (xs2) obj;
                k26 k263 = yq3.w;
                xs2.getClass();
                return ms1.e.o(xs2) + " | " + ta6.c(xs2).m();
            case 5:
                Method method = (Method) obj;
                k26 k264 = yq3.w;
                method.getClass();
                return f55.l(method);
            case 6:
                ku3 ku3 = (ku3) obj;
                k26 k265 = yq3.w;
                ku3.getClass();
                return String.valueOf(tf4.x(ku3).a);
            case 7:
                Constructor constructor = (Constructor) obj;
                k26 k266 = yq3.w;
                constructor.getClass();
                return f55.j(constructor);
            case 8:
                Field field = (Field) obj;
                k26 k267 = yq3.w;
                return field.getName() + ' ' + field.getType();
            case 9:
                as3 as3 = (as3) obj;
                as3.getClass();
                vq3 J2 = as3.J();
                if (J2 instanceof cs3) {
                    cs3 = (cs3) J2;
                } else {
                    cs3 = null;
                }
                if (cs3 != null) {
                    return (as3) dt0.y0(cs3.getUpperBounds());
                }
                return null;
            case 10:
                yb5 yb5 = (yb5) obj;
                yb5.getClass();
                return ((String) yb5.w) + " = " + ((fu3) yb5.x);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                ((Number) obj).intValue();
                return null;
            case 12:
                g16 g16 = (g16) obj;
                int i = a14.v;
                g16.getClass();
                return Boolean.valueOf(!Modifier.isStatic(g16.b().getModifiers()));
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                au6 au6 = (au6) obj;
                yr3[] yr3Arr = m14.m;
                au6.getClass();
                return au6;
            case 14:
                g16 g162 = (g16) obj;
                int i2 = o14.p;
                g162.getClass();
                return Boolean.valueOf(Modifier.isStatic(g162.b().getModifiers()));
            case h75.g:
                ji4 ji4 = (ji4) obj;
                int i3 = o14.p;
                ji4.getClass();
                return ji4.g();
            case 16:
                int i4 = o14.p;
                vq0 u = ((vw3) obj).L().u();
                if (u instanceof ql4) {
                    return (ql4) u;
                }
                return null;
            case 17:
                ((Number) obj).intValue();
                return null;
            case 18:
                ((Number) obj).intValue();
                return null;
            case 19:
                hz2 hz2 = hz2.F;
                ((uq4) obj).getClass();
                return Boolean.TRUE;
            case 20:
                yb5 yb52 = (yb5) obj;
                yb52.getClass();
                return pb4.l((String) yb52.w, "=", URLEncoder.encode((String) yb52.x, "UTF-8"));
            case 21:
                xs2 xs22 = (xs2) obj;
                List list = l75.a;
                xs22.getClass();
                List S2 = xs22.S();
                S2.getClass();
                h28 h28 = (h28) dt0.H0(S2);
                if (h28 == null || ts1.a(h28) || h28.F != null) {
                    return "last parameter should not have a default value or be a vararg";
                }
                return null;
            case 22:
                xs2 xs23 = (xs2) obj;
                List list2 = l75.a;
                xs23.getClass();
                vj1 r = xs23.r();
                r.getClass();
                if (r instanceof ql4) {
                    uq4 uq4 = fv3.e;
                    if (fv3.b((ql4) r, m27.a)) {
                        return null;
                    }
                }
                Collection s = xs23.s();
                s.getClass();
                Iterable<xs2> iterable = s;
                if (!((Collection) iterable).isEmpty()) {
                    for (xs2 r2 : iterable) {
                        vj1 r3 = r2.r();
                        r3.getClass();
                        if (r3 instanceof ql4) {
                            uq4 uq42 = fv3.e;
                            if (fv3.b((ql4) r3, m27.a)) {
                                return null;
                            }
                        }
                    }
                }
                vj1 r4 = xs23.r();
                if (r4 instanceof ql4) {
                    ql4 = (ql4) r4;
                } else {
                    ql4 = null;
                }
                if (ql4 != null) {
                    if (!dc3.b(ql4)) {
                        ql4 = null;
                    }
                    if (!(ql4 == null || (g0 = ql4.g0()) == null || (F2 = jb5.F(g0)) == null || (k = xs23.k()) == null || !sg3.e(((wj1) xs23).getName(), m75.d))) {
                        uq4 uq43 = fv3.e;
                        if ((fv3.C(k, m27.h) || fv3.F(k)) && xs23.S().size() == 1) {
                            vw3 b = ((h28) xs23.S().get(0)).b();
                            b.getClass();
                            if (sg3.e(jb5.F(b), F2) && xs23.h0().isEmpty() && xs23.b0() == null) {
                                return null;
                            }
                        }
                    }
                }
                StringBuilder sb = new StringBuilder("must override ''equals()'' in Any");
                vj1 r5 = xs23.r();
                r5.getClass();
                if (dc3.b(r5)) {
                    ms1 ms1 = ms1.d;
                    vj1 r6 = xs23.r();
                    r6.getClass();
                    fu6 g02 = ((ql4) r6).g0();
                    g02.getClass();
                    sb.append(" or define ''equals(other: " + ms1.P(jb5.F(g02)) + "): Boolean''");
                }
                return sb.toString();
            case 23:
                xs2 xs24 = (xs2) obj;
                List list3 = l75.a;
                xs24.getClass();
                qz3 W2 = xs24.W();
                if (W2 == null) {
                    W2 = xs24.b0();
                }
                if (W2 != null) {
                    vw3 k3 = xs24.k();
                    if (k3 != null) {
                        z2 = jb5.x(k3, W2.b());
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        return null;
                    }
                    xx5 f1 = W2.f1();
                    f1.getClass();
                    if (f1 instanceof w93) {
                        ql4 ql42 = ((w93) f1).w;
                        if (ql42.H() && (f = ts1.f(ql42)) != null) {
                            sl4 c = rs1.c(ql42);
                            c.getClass();
                            vq0 z4 = r16.z(c, f);
                            if (z4 instanceof ut1) {
                                ut1 = (ut1) z4;
                            } else {
                                ut1 = null;
                            }
                            if (!(ut1 == null || (k2 = xs24.k()) == null)) {
                                z3 = jb5.x(k2, ut1.g1());
                            }
                        }
                    }
                    if (z3) {
                        return null;
                    }
                }
                return "receiver must be a supertype of the return type";
            case 24:
                x95 x95 = (x95) obj;
                x95.getClass();
                return ((y95) x95).A;
            case 25:
                xf4 xf4 = (xf4) obj;
                xf4.getClass();
                return (String) ((vf4) xf4.a()).get(1);
            case 26:
                xf4 xf42 = (xf4) obj;
                xf42.getClass();
                return (String) ((vf4) xf42.a()).get(1);
            case 27:
                xf4 xf43 = (xf4) obj;
                xf43.getClass();
                String group = xf43.a.group();
                group.getClass();
                return group;
            case 28:
                String str = (String) obj;
                str.getClass();
                return "(raw) ".concat(str);
            default:
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                List list4 = m06.a;
                parameterizedType.getClass();
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
        }
    }
}
