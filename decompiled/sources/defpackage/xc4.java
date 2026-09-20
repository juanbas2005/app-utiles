package defpackage;

import java.util.List;

/* renamed from: xc4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xc4 extends wx3 implements vr2 {
    public static final xc4 A = new xc4(1, 2);
    public static final xc4 B = new xc4(1, 3);
    public static final xc4 C = new xc4(1, 4);
    public static final xc4 D = new xc4(1, 5);
    public static final xc4 E = new xc4(1, 6);
    public static final xc4 F = new xc4(1, 7);
    public static final xc4 G = new xc4(1, 8);
    public static final xc4 H = new xc4(1, 9);
    public static final xc4 I = new xc4(1, 10);
    public static final xc4 J = new xc4(1, 11);
    public static final xc4 K = new xc4(1, 12);
    public static final xc4 L = new xc4(1, 13);
    public static final xc4 M = new xc4(1, 14);
    public static final xc4 N = new xc4(1, 15);
    public static final xc4 O = new xc4(1, 16);
    public static final xc4 P = new xc4(1, 17);
    public static final xc4 Q = new xc4(1, 18);
    public static final xc4 R = new xc4(1, 19);
    public static final xc4 S = new xc4(1, 20);
    public static final xc4 y = new xc4(1, 0);
    public static final xc4 z = new xc4(1, 1);
    public final /* synthetic */ int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xc4(int i) {
        super(1);
        this.x = 25;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: up4} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object y(Object obj) {
        k23 k23;
        int i = this.x;
        up4 up4 = null;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                gh5 gh5 = (gh5) obj;
                if (gh5.r()) {
                    dd4 dd4 = gh5.x;
                    if (!dd4.K) {
                        vr2 g = gh5.w.g();
                        if (gh5.w.f() != null) {
                            dd4.Q0();
                        } else if (g == null) {
                            dd4.D = null;
                            dd4.E = null;
                            dd4.C = null;
                            dd4.Q0();
                        } else {
                            dd4.D = null;
                            dd4.E = null;
                            dd4.s0(gh5, 9223372034707292159L, 0);
                            dd4.C = g;
                        }
                    }
                }
                return vs7;
            case 1:
                gh5 gh52 = (gh5) obj;
                if (gh52.r() && (k23 = gh52.y) != null) {
                    dd4 dd42 = gh52.x;
                    tp4 tp4 = dd42.N;
                    if (tp4 != null) {
                        up4 = tp4.g(k23);
                    }
                    if (up4 != null) {
                        ao aoVar = dd42.M;
                        if (aoVar != null) {
                            aoVar.h(k23);
                        }
                        dd42.O0(up4);
                        up4.b();
                    }
                }
                return vs7;
            case 2:
                o95 o95 = ((xz4) obj).l0;
                if (o95 != null) {
                    ((fx2) o95).c();
                }
                return vs7;
            case 3:
                xz4 xz4 = (xz4) obj;
                uy3 uy3 = xz4.O;
                try {
                    if (xz4.r()) {
                        xz4.C1(true);
                    }
                    return vs7;
                } catch (Throwable th) {
                    uy3.c0(th);
                    throw null;
                }
            case 4:
                j35 j35 = (j35) obj;
                if (j35.r()) {
                    j35.w.m0();
                }
                return vs7;
            case 5:
                uy3 uy32 = (uy3) obj;
                if (uy32.J()) {
                    uy32.Y(false);
                }
                return vs7;
            case 6:
                uy3 uy33 = (uy3) obj;
                if (uy33.J()) {
                    uy33.Y(false);
                }
                return vs7;
            case 7:
                uy3 uy34 = (uy3) obj;
                if (uy34.J()) {
                    uy34.W(false);
                }
                return vs7;
            case 8:
                uy3 uy35 = (uy3) obj;
                if (uy35.J()) {
                    uy35.W(false);
                }
                return vs7;
            case 9:
                uy3 uy36 = (uy3) obj;
                if (uy36.J()) {
                    uy3.X(uy36, false, 7);
                }
                return vs7;
            case 10:
                uy3 uy37 = (uy3) obj;
                if (uy37.J()) {
                    uy3.Z(uy37, false, 7);
                }
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                uy3 uy38 = (uy3) obj;
                if (uy38.J()) {
                    uy38.H();
                }
                return vs7;
            case 12:
                l76 l76 = (l76) obj;
                return vs7;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                pl5 pl5 = (pl5) obj;
                if (pl5.isAttachedToWindow()) {
                    pl5.s();
                }
                return vs7;
            case 14:
                dh5 dh5 = (dh5) obj;
                return vs7;
            case h75.g:
                return Integer.valueOf(((xg6) obj).b);
            case 16:
                return Integer.valueOf(((xg6) obj).c.b());
            case 17:
                List list = (List) obj;
                return vs7;
            case 18:
                int i2 = ((b93) obj).a;
                return vs7;
            case 19:
                List list2 = (List) obj;
                return vs7;
            case 20:
                int i3 = ((b93) obj).a;
                return vs7;
            case 21:
                return new we3((((long) ((int) (((we3) obj).a & 4294967295L))) & 4294967295L) | (((long) 0) << 32));
            case 22:
                return new we3((((long) ((int) (((we3) obj).a >> 32))) << 32) | (((long) 0) & 4294967295L));
            case 23:
                return new we3((((long) ((int) (((we3) obj).a & 4294967295L))) & 4294967295L) | (((long) 0) << 32));
            case 24:
                return new we3((((long) ((int) (((we3) obj).a >> 32))) << 32) | (((long) 0) & 4294967295L));
            case 25:
                return Boolean.valueOf(((vk2) obj).V0());
            default:
                ((q23) obj).getClass();
                return Boolean.TRUE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xc4(int i, int i2) {
        super(i);
        this.x = i2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xc4(h06 h06) {
        super(1);
        this.x = 26;
    }
}
