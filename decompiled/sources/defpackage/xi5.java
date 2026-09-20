package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: xi5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class xi5 extends ct2 implements sr2 {
    public final /* synthetic */ int D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xi5(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.D = i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0151, code lost:
        if (r7 != null) goto L_0x0158;
     */
    public final Object b() {
        Object value;
        String str;
        String str2;
        String str3;
        Object value2;
        wp5 wp5;
        Object value3;
        Object value4;
        wp5 wp52;
        Object value5;
        wp5 wp53;
        Object value6;
        int i;
        Type type;
        Object value7;
        Object value8;
        int i2 = this.D;
        vs7 vs7 = vs7.a;
        Object obj = this.x;
        switch (i2) {
            case b85.b:
                dj5 dj5 = (dj5) obj;
                dj5.getClass();
                dj5.f(new aj5(4, (f61) null, dj5));
                return vs7;
            case 1:
                d37 d37 = ((lq5) obj).c;
                do {
                    value = d37.getValue();
                } while (!pb4.t(wp5.a((wp5) ((is7) value).a, (u5) null, (a54) null, (b54) null, (rv) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, false, (Integer) null, 12287), 6, d37, value));
                return vs7;
            case 2:
                lq5 lq5 = (lq5) obj;
                d37 d372 = lq5.c;
                wp5 wp54 = (wp5) ((is7) d372.getValue()).a;
                if7 if7 = wp54.j;
                if7 if72 = wp54.g;
                if (d57.I0(if7.a)) {
                    str = "Escribe el código";
                } else {
                    str = null;
                }
                if (if72.a.length() >= 3) {
                    str2 = null;
                } else {
                    str2 = "La contraseña debe tener al menos 3 caracteres";
                }
                if (!sg3.e(wp54.h.a, if72.a)) {
                    str3 = "Las contraseñas no coinciden";
                } else {
                    str3 = null;
                }
                do {
                    value2 = d372.getValue();
                    wp5 = (wp5) ((is7) value2).a;
                } while (!pb4.t(wp5.a(wp5, (u5) null, (a54) null, (b54) null, (rv) null, (if7) null, (if7) null, if7.a(wp5.g, str2), if7.a(wp5.h, str3), (if7) null, if7.a(wp5.j, str), (if7) null, (if7) null, false, (Integer) null, 15679), 6, d372, value2));
                List E = sg3.E(str, str2, str3);
                if (!E.isEmpty()) {
                    Iterator it = E.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()) != null) {
                            }
                        }
                    }
                }
                if (!((is7) d372.getValue()).b) {
                    ar7.H(u58.a(lq5), (e81) null, (r81) null, new kq5(d372, (f61) null, lq5, 4), 3);
                }
                return vs7;
            case 3:
                lq5 lq52 = (lq5) obj;
                d37 d373 = lq52.c;
                if (!((is7) d373.getValue()).b) {
                    ar7.H(u58.a(lq52), (e81) null, (r81) null, new kq5(d373, (f61) null, lq52, 2), 3);
                }
                return vs7;
            case 4:
                lq5 lq53 = (lq5) obj;
                if (lq53.k(false)) {
                    d37 d374 = lq53.c;
                    if (!((is7) d374.getValue()).b) {
                        ar7.H(u58.a(lq53), (e81) null, (r81) null, new ii3(d374, (f61) null, (r58) lq53, 13), 3);
                    }
                }
                return vs7;
            case 5:
                lq5 lq54 = (lq5) obj;
                if (lq54.k(true)) {
                    d37 d375 = lq54.c;
                    if (!((is7) d375.getValue()).b) {
                        ar7.H(u58.a(lq54), (e81) null, (r81) null, new kq5(d375, (f61) null, lq54, 1), 3);
                    }
                }
                return vs7;
            case 6:
                d37 d376 = ((lq5) obj).c;
                do {
                    value3 = d376.getValue();
                } while (!pb4.t(wp5.a((wp5) ((is7) value3).a, (u5) null, (a54) null, (b54) null, rv.z, (if7) null, (if7) null, new if7(new String(), (String) null), new if7(new String(), (String) null), (if7) null, new if7(new String(), (String) null), (if7) null, (if7) null, false, (Integer) null, 15671), 6, d376, value3));
                return vs7;
            case 7:
                lq5 lq55 = (lq5) obj;
                d37 d377 = lq55.c;
                String str4 = ((wp5) ((is7) d377.getValue()).a).l.a;
                if (d57.I0(str4)) {
                    do {
                        value4 = d377.getValue();
                        wp52 = (wp5) ((is7) value4).a;
                    } while (!pb4.t(wp5.a(wp52, (u5) null, (a54) null, (b54) null, (rv) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, if7.a(wp52.l, "Escribe el código del cupón"), false, (Integer) null, 14335), 6, d377, value4));
                } else if (!((is7) d377.getValue()).b) {
                    ar7.H(u58.a(lq55), (e81) null, (r81) null, new ii3(d377, (f61) null, (r58) lq55, (Object) str4, 12), 3);
                }
                return vs7;
            case 8:
                lq5 lq56 = (lq5) obj;
                d37 d378 = lq56.c;
                if (!((is7) d378.getValue()).b) {
                    ar7.H(u58.a(lq56), (e81) null, (r81) null, new kq5(d378, (f61) null, lq56, 0), 3);
                }
                return vs7;
            case 9:
                lq5 lq57 = (lq5) obj;
                d37 d379 = lq57.c;
                if (!((is7) d379.getValue()).b) {
                    ar7.H(u58.a(lq57), (e81) null, (r81) null, new kq5(d379, (f61) null, lq57, 6), 3);
                }
                return vs7;
            case 10:
                lq5 lq58 = (lq5) obj;
                d37 d3710 = lq58.c;
                if (!((is7) d3710.getValue()).b) {
                    ar7.H(u58.a(lq58), (e81) null, (r81) null, new kq5(d3710, (f61) null, lq58, 7), 3);
                }
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                lq5 lq59 = (lq5) obj;
                d37 d3711 = lq59.c;
                if (!((is7) d3711.getValue()).b) {
                    ar7.H(u58.a(lq59), (e81) null, (r81) null, new kq5(d3711, (f61) null, lq59, 3), 3);
                }
                return vs7;
            case 12:
                lq5 lq510 = (lq5) obj;
                d37 d3712 = lq510.c;
                wp5 wp55 = (wp5) ((is7) d3712.getValue()).a;
                if (lq5.e(wp55.f.a)) {
                    do {
                        value6 = d3712.getValue();
                    } while (!pb4.t(wp5.a((wp5) ((is7) value6).a, (u5) null, (a54) null, (b54) null, (rv) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, true, (Integer) null, 12287), 6, d3712, value6));
                } else if (!c35.l(wp55.f.a)) {
                    do {
                        value5 = d3712.getValue();
                        wp53 = (wp5) ((is7) value5).a;
                    } while (!pb4.t(wp5.a(wp53, (u5) null, (a54) null, (b54) null, (rv) null, (if7) null, if7.a(wp53.f, "Correo no válido"), (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, false, (Integer) null, 16351), 6, d3712, value5));
                } else if (!((is7) d3712.getValue()).b) {
                    ar7.H(u58.a(lq510), (e81) null, (r81) null, new kq5(d3712, (f61) null, lq510, 5), 3);
                }
                return vs7;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                a06 a06 = (a06) obj;
                h27 h27 = a06.g;
                if (h27 != null) {
                    h27.o((CancellationException) null);
                }
                a06.g = ar7.H(u58.a(a06), (e81) null, (r81) null, new zz5(a06, (f61) null, 2), 3);
                return vs7;
            case 14:
                a06 a062 = (a06) obj;
                h27 h272 = a062.g;
                if (h272 != null) {
                    h272.o((CancellationException) null);
                }
                d37 d3713 = a062.e;
                d3713.l((Object) null, new is7(6, oz5.a((oz5) ((is7) d3713.getValue()).a, yz6.w, 0, 0.0d, 0.0d, 0.0f, 0.0d, false, 4161535)));
                return vs7;
            case h75.g:
                q16 q16 = (q16) obj;
                q16.getClass();
                List<t16> parameters = q16.getParameters();
                int size = (q16.i() ? 1 : 0) + parameters.size();
                if (parameters.isEmpty()) {
                    i = 0;
                } else {
                    i = 0;
                    for (t16 t16 : parameters) {
                        if ((t16.u() == qr3.z || t16.u() == qr3.x) && (i = i + 1) < 0) {
                            sg3.Y();
                            throw null;
                        }
                    }
                }
                int i3 = (i + 31) / 32;
                Object[] objArr = new Object[(size + i3 + 1)];
                for (t16 t162 : parameters) {
                    if (t162.C() && !g18.i(t162.y())) {
                        int s = t162.s();
                        as3 y = t162.y();
                        y.getClass();
                        if (y instanceof c2) {
                            y16 y16 = ((c2) y).w;
                            if (y16 == null) {
                                type = null;
                                break;
                            } else {
                                type = (Type) y16.b();
                                break;
                            }
                        }
                        type = ar7.n(y, false);
                        objArr[s] = g18.f(type);
                    } else if (t162.D()) {
                        int s2 = t162.s();
                        Class u = kl8.u(rj1.v(t162.y()));
                        if (u.isArray()) {
                            Object newInstance = Array.newInstance(u.getComponentType(), 0);
                            newInstance.getClass();
                            objArr[s2] = newInstance;
                        } else {
                            throw new Error("Cannot instantiate the default empty array of type " + u.getSimpleName() + ", because it is not an array type");
                        }
                    } else {
                        continue;
                    }
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    objArr[size + i4] = 0;
                }
                return objArr;
            case 16:
                a96 a96 = (a96) obj;
                ig0 ig0 = a96.a;
                if (ig0 != null) {
                    gl0.J(ig0, (CancellationException) null);
                    a96.g();
                    dq1 dq1 = a96.e;
                    if (dq1 != null) {
                        ((h11) dq1.g).close();
                        j87 j87 = (j87) dq1.h;
                        if (j87 != null) {
                            j87.close();
                        }
                        return vs7;
                    }
                    sg3.a0("connectionManager");
                    throw null;
                }
                sg3.a0("coroutineScope");
                throw null;
            case 17:
                fq6 fq6 = (fq6) obj;
                d37 d3714 = fq6.c;
                if (!((is7) d3714.getValue()).b) {
                    ar7.H(u58.a(fq6), (e81) null, (r81) null, new k05(d3714, (f61) null, fq6), 3);
                }
                return vs7;
            case 18:
                hw6 hw6 = (hw6) obj;
                d37 d3715 = hw6.e;
                xv6 xv6 = ((zv6) ((is7) d3715.getValue()).a).c;
                if (xv6 != null) {
                    do {
                        value7 = d3715.getValue();
                    } while (!d3715.i(value7, new is7(6, zv6.a((zv6) ((is7) value7).a, (ArrayList) null, (ArrayList) null, (xv6) null, 3))));
                    hw6.e(xv6);
                }
                return vs7;
            case 19:
                d37 d3716 = ((hw6) obj).e;
                do {
                    value8 = d3716.getValue();
                } while (!d3716.i(value8, new is7(6, zv6.a((zv6) ((is7) value8).a, (ArrayList) null, (ArrayList) null, (xv6) null, 3))));
                return vs7;
            default:
                e88 e88 = (e88) obj;
                d37 d3717 = e88.c;
                if (!((is7) d3717.getValue()).b) {
                    ar7.H(u58.a(e88), (e81) null, (r81) null, new pd7(d3717, (f61) null, e88), 3);
                }
                return vs7;
        }
    }
}
