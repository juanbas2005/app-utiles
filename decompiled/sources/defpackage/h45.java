package defpackage;

import io.ktor.http.Url;
import io.ktor.util.date.GMTDate;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: h45  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h45 extends s43 {
    public static final z97 F = new z97(new jk4(22));
    public final e45 A;
    public final Set B = qs.r1(new t43[]{x63.a, p88.a, bb6.a});
    public final e81 C;
    public final e81 D;
    public final Map E;

    public h45(e45 e45) {
        this.A = e45;
        Map synchronizedMap = Collections.synchronizedMap(new ux3(new o0(1, this, h45.class, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeoutConfig;)Lokhttp3/OkHttpClient;", 0, 0, 27), new ot4(19), e45.b));
        synchronizedMap.getClass();
        this.E = synchronizedMap;
        if (System.getProperty("kotlinx.io.pool.size.bytes") == null && sg3.e(System.getProperty("java.vm.name"), "Dalvik") && Runtime.getRuntime().maxMemory() > 10000000) {
            System.setProperty("kotlinx.io.pool.size.bytes", "2097152");
        }
        e81 D0 = rc9.D0(new fl3(r16.Q(super.k())), new v81(d63.z, 0));
        this.C = D0;
        this.D = super.k().X(D0);
        ar7.G(cw2.w, super.k(), r81.y, new ot(this, (f61) null, 22));
    }

    public final Set A() {
        return this.B;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        if (r2 == r8) goto L_0x01c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    public final Object a(md2 md2, h61 h61) {
        f45 f45;
        int i;
        e81 e81;
        md2 md22;
        String str;
        gz2 gz2;
        dn8 dn8;
        q51 b;
        String str2;
        String str3;
        f56 f56;
        d45 d45;
        yh4 yh4;
        h61 h612 = h61;
        if (h612 instanceof f45) {
            f45 = (f45) h612;
            int i2 = f45.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f45.C = i2 - Integer.MIN_VALUE;
                f45 f452 = f45;
                Object obj = f452.A;
                i = f452.C;
                boolean z = true;
                p81 p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    md22 = md2;
                    f452.z = md22;
                    f452.C = 1;
                    Set set = n18.a;
                    e81 e812 = f452.x;
                    e812.getClass();
                    c81 a0 = e812.a0(qx3.x);
                    a0.getClass();
                    e81 = ((qx3) a0).w;
                } else if (i == 1) {
                    md2 md23 = f452.z;
                    o85.q(obj);
                    md2 md24 = md23;
                    e81 = obj;
                    md22 = md24;
                } else if (i == 2) {
                    o85.q(obj);
                    return obj;
                } else if (i == 3) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e81 e813 = e81;
                o9 o9Var = new o9(12);
                j85 j85 = (j85) md22.e;
                o9Var.N(((Url) md22.b).toString());
                i53 i53 = (i53) md22.c;
                Set set2 = j53.a;
                i53.getClass();
                str = i53.a;
                if (!j53.a.contains(i53) || !(j85 instanceof w32)) {
                    z = false;
                }
                gz2 = (gz2) md22.d;
                dn8 = new dn8(z, o9Var);
                Set set3 = n18.a;
                dz2 dz2 = new dz2(0);
                dz2.y0(gz2);
                dz2.y0(j85.c());
                dz2.d1().w(new ph6(19, dn8));
                if (gz2.x("User-Agent") == null && j85.c().x("User-Agent") == null) {
                    int i3 = gk5.a;
                    dn8.H("User-Agent", "ktor-client");
                }
                b = j85.b();
                if (b == null) {
                    str2 = b.toString();
                } else {
                    str2 = j85.c().x("Content-Type");
                    if (str2 == null) {
                        str2 = gz2.x("Content-Type");
                    }
                }
                Long a = j85.a();
                if ((a == null || (str3 = String.valueOf(a.longValue())) == null) && (str3 = j85.c().x("Content-Length")) == null) {
                    str3 = gz2.x("Content-Length");
                }
                if (str2 != null) {
                    dn8.H("Content-Type", str2);
                }
                if (str3 != null) {
                    dn8.H("Content-Length", str3);
                }
                if (!gw8.H(str)) {
                    e813.getClass();
                    this.A.getClass();
                    if (j85 instanceof h85) {
                        byte[] d = ((h85) j85).d();
                        int i4 = f56.a;
                        k26 k26 = yh4.e;
                        try {
                            yh4 = ie1.G(String.valueOf(j85.b()));
                        } catch (IllegalArgumentException unused) {
                            yh4 = null;
                        }
                        int length = d.length;
                        dg8.a((long) d.length, 0, (long) length);
                        f56 = new e56(yh4, length, d);
                    } else if (j85 instanceof i85) {
                        f56 = new k47(e813, j85.a(), new hx4(2, j85));
                    } else if (j85 instanceof tn0) {
                        f56 = new k47(e813, (Long) null, new qm3(13, (Object) e813, (Object) j85));
                    } else if (j85 instanceof w32) {
                        int i5 = f56.a;
                        dg8.a(0, 0, 0);
                        f56 = new e56((yh4) null, 0, new byte[0]);
                    } else {
                        h.c();
                        return null;
                    }
                } else {
                    f56 = null;
                }
                o9Var.G(str, f56);
                e81 e814 = e813;
                kd6 kd6 = new kd6(o9Var);
                d45 = (d45) this.E.get(md22.b());
                if (d45 == null) {
                    au auVar = a63.a;
                    f452.z = null;
                    f452.C = 3;
                    Object l = l(d45, kd6, e814, md22, f452);
                    if (l == p81) {
                        return p81;
                    }
                    return l;
                }
                h.s("OkHttpClient can't be constructed because HttpTimeout plugin is not installed");
                return null;
            }
        }
        f45 = new f45(this, h612);
        f45 f4522 = f45;
        Object obj2 = f4522.A;
        i = f4522.C;
        boolean z2 = true;
        p81 p812 = p81.w;
        if (i != 0) {
        }
        e81 e8132 = e81;
        o9 o9Var2 = new o9(12);
        j85 j852 = (j85) md22.e;
        o9Var2.N(((Url) md22.b).toString());
        i53 i532 = (i53) md22.c;
        Set set22 = j53.a;
        i532.getClass();
        str = i532.a;
        z2 = false;
        gz2 = (gz2) md22.d;
        dn8 = new dn8(z2, o9Var2);
        Set set32 = n18.a;
        dz2 dz22 = new dz2(0);
        dz22.y0(gz2);
        dz22.y0(j852.c());
        dz22.d1().w(new ph6(19, dn8));
        int i32 = gk5.a;
        dn8.H("User-Agent", "ktor-client");
        b = j852.b();
        if (b == null) {
        }
        Long a2 = j852.a();
        str3 = gz2.x("Content-Length");
        if (str2 != null) {
        }
        if (str3 != null) {
        }
        if (!gw8.H(str)) {
        }
        o9Var2.G(str, f56);
        e81 e8142 = e8132;
        kd6 kd62 = new kd6(o9Var2);
        d45 = (d45) this.E.get(md22.b());
        if (d45 == null) {
        }
    }

    public final void close() {
        super.close();
        c81 a0 = this.C.a0(me6.E);
        a0.getClass();
        ((fl3) a0).v0();
    }

    public final e81 k() {
        return this.D;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object l(d45 d45, kd6 kd6, e81 e81, md2 md2, h61 h61) {
        g45 g45;
        int i;
        GMTDate gMTDate;
        af0 af0;
        int ordinal;
        if (h61 instanceof g45) {
            g45 = (g45) h61;
            int i2 = g45.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g45.E = i2 - Integer.MIN_VALUE;
                Object obj = g45.C;
                i = g45.E;
                if (i != 0) {
                    o85.q(obj);
                    GMTDate b = eg1.b((Long) null);
                    g45.z = e81;
                    g45.A = md2;
                    g45.B = b;
                    g45.E = 1;
                    kk0 kk0 = new kk0(1, rc9.a0(g45));
                    kk0.v();
                    d45.getClass();
                    kd6.getClass();
                    dx5 dx5 = new dx5(d45, kd6, false);
                    c81 a0 = e81.a0(me6.E);
                    a0.getClass();
                    ((el3) a0).T(true, true, new b0(26, dx5));
                    dx5.e(new hv2(md2, kk0));
                    Object t = kk0.t();
                    p81 p81 = p81.w;
                    if (t == p81) {
                        return p81;
                    }
                    gMTDate = b;
                    obj = t;
                } else if (i == 1) {
                    GMTDate gMTDate2 = g45.B;
                    md2 = g45.A;
                    e81 = g45.z;
                    o85.q(obj);
                    gMTDate = gMTDate2;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e81 e812 = e81;
                a66 a66 = (a66) obj;
                d66 d66 = a66.C;
                r16.Q(e812).v(new h43(24, d66));
                af0 = (af0) gr8.b0(cw2.w, e812, new w42(d66.l(), e812, md2, (f61) null), 2).x;
                w63 w63 = new w63(a66.z, a66.y);
                gu5 gu5 = a66.x;
                gu5.getClass();
                ordinal = gu5.ordinal();
                r53 r53 = r53.e;
                switch (ordinal) {
                    case b85.b:
                        r53 = r53.g;
                        break;
                    case 1:
                        r53 = r53.f;
                        break;
                    case 2:
                        r53 = r53.h;
                        break;
                    case 3:
                    case 4:
                        break;
                    case 5:
                        r53 = r53.i;
                        break;
                    case 6:
                        r53 = r53.d;
                        break;
                    default:
                        h.c();
                        return null;
                }
                r53 r532 = r53;
                i45 i45 = new i45(a66.B);
                if (af0 == null || ((iz0) md2.g).d(a63.a) == null) {
                    return new i63(w63, gMTDate, i45, r532, af0, e812);
                }
                ku4.a();
                return null;
            }
        }
        g45 = new g45(this, h61);
        Object obj2 = g45.C;
        i = g45.E;
        if (i != 0) {
        }
        e81 e8122 = e81;
        a66 a662 = (a66) obj2;
        d66 d662 = a662.C;
        r16.Q(e8122).v(new h43(24, d662));
        af0 = (af0) gr8.b0(cw2.w, e8122, new w42(d662.l(), e8122, md2, (f61) null), 2).x;
        w63 w632 = new w63(a662.z, a662.y);
        gu5 gu52 = a662.x;
        gu52.getClass();
        ordinal = gu52.ordinal();
        r53 r533 = r53.e;
        switch (ordinal) {
            case b85.b:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        r53 r5322 = r533;
        i45 i452 = new i45(a662.B);
        if (af0 == null || ((iz0) md2.g).d(a63.a) == null) {
        }
    }
}
