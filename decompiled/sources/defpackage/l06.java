package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/* renamed from: l06  reason: default package */
public final class l06 implements vr2 {
    public static final l06 A = new l06(3);
    public static final l06 B = new l06(4);
    public static final l06 C = new l06(5);
    public static final l06 D = new l06(6);
    public static final l06 E = new l06(7);
    public static final l06 F = new l06(8);
    public static final l06 G = new l06(9);
    public static final l06 H = new l06(10);
    public static final l06 I = new l06(11);
    public static final l06 J = new l06(12);
    public static final l06 K = new l06(13);
    public static final l06 L = new l06(14);
    public static final l06 M = new l06(15);
    public static final l06 N = new l06(16);
    public static final l06 O = new l06(17);
    public static final l06 P = new l06(18);
    public static final l06 Q = new l06(19);
    public static final l06 R = new l06(20);
    public static final l06 S = new l06(21);
    public static final l06 T = new l06(22);
    public static final l06 U = new l06(23);
    public static final l06 V = new l06(24);
    public static final l06 W = new l06(25);
    public static final l06 X = new l06(26);
    public static final l06 Y = new l06(27);
    public static final l06 Z = new l06(28);
    public static final l06 a0 = new l06(29);
    public static final l06 x = new l06(0);
    public static final l06 y = new l06(1);
    public static final l06 z = new l06(2);
    public final /* synthetic */ int w;

    public /* synthetic */ l06(int i) {
        this.w = i;
    }

    public final Object y(Object obj) {
        ri0 b;
        String h;
        jz6 jz6 = null;
        boolean z2 = false;
        switch (this.w) {
            case b85.b:
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                List list = m06.a;
                parameterizedType.getClass();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                actualTypeArguments.getClass();
                return qs.E0(actualTypeArguments);
            case 1:
                if (((Class) obj).getSimpleName().length() == 0) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 2:
                String simpleName = ((Class) obj).getSimpleName();
                if (!uq4.f(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return uq4.e(simpleName);
                }
                return null;
            case 3:
                t16 t16 = (t16) obj;
                t16.getClass();
                StringBuilder sb = new StringBuilder();
                String name = t16.getName();
                if (name == null) {
                    name = "_";
                }
                sb.append(name);
                sb.append(": ");
                sb.append(t16.y());
                return sb.toString();
            case 4:
                t16 t162 = (t16) obj;
                t162.getClass();
                return d63.v(t162.y(), false);
            case 5:
                t16 t163 = (t16) obj;
                t163.getClass();
                return d63.v(t163.y(), false);
            case 6:
                uq4 uq4 = (uq4) obj;
                uq4.getClass();
                return h49.L(uq4);
            case 7:
                String str = (String) obj;
                str.getClass();
                return str;
            case 8:
                fv3 fv3 = (fv3) obj;
                g76 g76 = g76.c;
                fv3.getClass();
                return fv3.t(ro5.BOOLEAN);
            case 9:
                fv3 fv32 = (fv3) obj;
                h76 h76 = h76.c;
                fv32.getClass();
                return fv32.t(ro5.INT);
            case 10:
                fv3 fv33 = (fv3) obj;
                i76 i76 = i76.c;
                fv33.getClass();
                return fv33.x();
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                Class cls = (Class) obj;
                cls.getClass();
                return m06.b(cls);
            case 12:
                Class cls2 = (Class) obj;
                cls2.getClass();
                return m06.b(cls2);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                if (sg3.e(obj, Boolean.FALSE)) {
                    return new jt0(jt0.g);
                }
                obj.getClass();
                return new jt0(uq3.c(((Integer) obj).intValue()));
            case 14:
                String str2 = (String) obj;
                str2.getClass();
                if (str2.length() > 1) {
                    return pb4.h(';', "L", str2);
                }
                return str2;
            case h75.g:
                ri0 ri0 = (ri0) obj;
                ri0.getClass();
                qz3 b0 = ri0.b0();
                b0.getClass();
                return b0.b();
            case 16:
                ri0 ri02 = (ri0) obj;
                ri02.getClass();
                vw3 k = ri02.k();
                k.getClass();
                return k;
            case 17:
                du7 du7 = (du7) obj;
                du7.getClass();
                return Boolean.valueOf(du7 instanceof jw5);
            case 18:
                vq0 u = ((du7) obj).L().u();
                if (u == null) {
                    return Boolean.FALSE;
                }
                uq4 name2 = u.getName();
                up2 up2 = tj3.f;
                if (sg3.e(name2, up2.a.g()) && sg3.e(ts1.c(u), up2)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 19:
                ri0 ri03 = (ri0) obj;
                ri03.getClass();
                return Boolean.valueOf(h49.D(ts1.i(ri03)));
            case 20:
                ri0 ri04 = (ri0) obj;
                ri04.getClass();
                int i = ud0.l;
                au6 au6 = (au6) ri04;
                if (fv3.A(au6) && ts1.b(au6, new b0(9, au6)) != null) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 21:
                ri0 ri05 = (ri0) obj;
                ri05.getClass();
                if (fv3.A(ri05)) {
                    int i2 = vd0.l;
                    if (!(!mz6.e.contains(ri05.getName()) || (b = ts1.b(ri05, e7.A)) == null || (h = dh4.h(b)) == null)) {
                        jz6 = mz6.b.contains(h) ? jz6.w : ((lz6) sf4.U(h, mz6.d)) == lz6.x ? jz6.y : jz6.x;
                    }
                    if (jz6 != null) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case 22:
                au6 au62 = (au6) obj;
                au62.getClass();
                return au62;
            case 23:
                cr5 cr5 = (cr5) obj;
                cr5.getClass();
                return cr5;
            case 24:
                pi0 pi0 = (pi0) obj;
                pi0.getClass();
                return pi0;
            case 25:
                vj1 vj1 = (vj1) obj;
                vj1.getClass();
                return Boolean.valueOf(vj1 instanceof pi0);
            case 26:
                vj1 vj12 = (vj1) obj;
                vj12.getClass();
                return Boolean.valueOf(!(vj12 instanceof s31));
            case 27:
                vj1 vj13 = (vj1) obj;
                vj13.getClass();
                List typeParameters = ((pi0) vj13).getTypeParameters();
                typeParameters.getClass();
                return new ts(1, typeParameters);
            case 28:
                du7 du72 = (du7) obj;
                du72.getClass();
                vq0 u2 = du72.L().u();
                if (u2 != null && (u2 instanceof qp7) && (((qp7) u2).r() instanceof ut1)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            default:
                du7 du73 = (du7) obj;
                du73.getClass();
                vq0 u3 = du73.L().u();
                if (u3 != null && ((u3 instanceof ut1) || (u3 instanceof qp7))) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
        }
    }
}
