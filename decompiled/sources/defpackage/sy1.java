package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: sy1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sy1 extends a97 implements gs2 {
    public final /* synthetic */ int A = 0;
    public h06 B;
    public h06 C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ ty1 F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sy1(h06 h06, ty1 ty1, f61 f61) {
        super(2, f61);
        this.C = h06;
        this.F = ty1;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((sy1) o((f61) obj2, (vr2) obj)).s(vs7);
            default:
                return ((sy1) o((f61) obj2, (o81) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        ty1 ty1 = this.F;
        switch (i) {
            case b85.b:
                sy1 sy1 = new sy1(this.C, ty1, f61);
                sy1.E = obj;
                return sy1;
            default:
                sy1 sy12 = new sy1(ty1, f61);
                sy12.E = obj;
                return sy12;
        }
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, h06] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        r7 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (defpackage.gl0.X(r7) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
        r0 = new java.lang.Object();
        r9 = r5.Q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        if (r9 == null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        r8.E = r7;
        r8.B = r0;
        r8.C = r0;
        r8.D = 1;
        r9 = defpackage.ad0.J(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0079, code lost:
        if (r9 != r4) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007d, code lost:
        r3 = r0;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        r9 = (defpackage.ey1) r9;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0081, code lost:
        r3 = r0;
        r9 = null;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
        r0.w = r9;
        r9 = r3.w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0089, code lost:
        if ((r9 instanceof defpackage.cy1) == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008b, code lost:
        r8.E = r7;
        r8.B = r3;
        r8.C = null;
        r8.D = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009a, code lost:
        if (defpackage.ty1.Z0(r5, (defpackage.cy1) r9, r8) != r4) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        r0 = r3;
        r3 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r9 = new defpackage.sy1(r0, r5, (defpackage.f61) null);
        r8.E = r3;
        r8.B = r0;
        r8.D = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00af, code lost:
        if (r5.c1(r9, r8) != r4) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r9 = r0.w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b6, code lost:
        if ((r9 instanceof defpackage.dy1) == false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b8, code lost:
        r8.E = r7;
        r8.B = null;
        r8.D = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c5, code lost:
        if (defpackage.ty1.a1(r5, (defpackage.dy1) r9, r8) != r4) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c8, code lost:
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cc, code lost:
        if ((r9 instanceof defpackage.ay1) == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
        r8.E = r7;
        r8.B = null;
        r8.D = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d9, code lost:
        if (defpackage.ty1.Y0(r5, r8) != r4) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e7, code lost:
        if (defpackage.ty1.Y0(r5, r8) == r4) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        defpackage.o85.q(r9);
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    public final Object s(Object obj) {
        ey1 ey1;
        vr2 vr2;
        h06 h06;
        by1 by1;
        o81 o81;
        o81 o812;
        h06 h062;
        o81 o813;
        int i = this.A;
        vs7 vs7 = vs7.a;
        Object obj2 = p81.w;
        ty1 ty1 = this.F;
        switch (i) {
            case b85.b:
                h06 h063 = this.C;
                int i2 = this.D;
                if (i2 == 0) {
                    o85.q(obj);
                    vr2 = (vr2) this.E;
                } else if (i2 == 1) {
                    h06 = this.B;
                    vr2 = (vr2) this.E;
                    o85.q(obj);
                    ey1 = (ey1) obj;
                    h06.w = ey1;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj3 = h063.w;
                if ((obj3 instanceof dy1) || (obj3 instanceof ay1)) {
                    return vs7;
                }
                if (obj3 instanceof by1) {
                    by1 = (by1) obj3;
                } else {
                    by1 = null;
                }
                if (by1 != null) {
                    vr2.y(by1);
                }
                ad0 ad0 = ty1.Q;
                if (ad0 != null) {
                    this.E = vr2;
                    this.B = h063;
                    this.D = 1;
                    obj = ad0.J(ad0, this);
                    if (obj != obj2) {
                        h06 = h063;
                        ey1 = (ey1) obj;
                        h06.w = ey1;
                        Object obj32 = h063.w;
                        if ((obj32 instanceof dy1) || (obj32 instanceof ay1)) {
                        }
                    }
                    return obj2;
                }
                h06 = h063;
                ey1 = null;
                h06.w = ey1;
                Object obj322 = h063.w;
                if ((obj322 instanceof dy1) || (obj322 instanceof ay1)) {
                }
                break;
            default:
                switch (this.D) {
                    case b85.b:
                        o85.q(obj);
                        o813 = (o81) this.E;
                        break;
                    case 1:
                        h06 h064 = this.C;
                        h06 h065 = this.B;
                        o813 = (o81) this.E;
                        o85.q(obj);
                        h06 h066 = h064;
                        break;
                    case 2:
                        h062 = this.B;
                        o812 = (o81) this.E;
                        o85.q(obj);
                        break;
                    case 3:
                        h062 = this.B;
                        o812 = (o81) this.E;
                        try {
                            o85.q(obj);
                            break;
                        } catch (CancellationException unused) {
                            o81 = o812;
                            this.E = o81;
                            this.B = null;
                            this.D = 6;
                            break;
                        }
                    case 4:
                        o81 = (o81) this.E;
                        break;
                    case 5:
                        o81 = (o81) this.E;
                        break;
                    case 6:
                        o81 = (o81) this.E;
                        o85.q(obj);
                        break;
                    default:
                        h.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sy1(ty1 ty1, f61 f61) {
        super(2, f61);
        this.F = ty1;
    }
}
