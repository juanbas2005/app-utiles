package defpackage;

import java.nio.charset.Charset;

/* renamed from: gx3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gx3 implements fi2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ fi2 w;
    public final /* synthetic */ q51 x;
    public final /* synthetic */ Charset y;
    public final /* synthetic */ fp7 z;

    public gx3(fi2 fi2, q51 q51, Charset charset, fp7 fp7, Object obj) {
        this.w = fi2;
        this.x = q51;
        this.y = charset;
        this.z = fp7;
        this.A = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009b, code lost:
        if (r14.k(r15, r0) != r5) goto L_0x009e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    public final Object k(Object obj, f61 f61) {
        fx3 fx3;
        int i;
        fi2 fi2;
        int i2;
        tn0 tn0;
        if (f61 instanceof fx3) {
            fx3 = (fx3) f61;
            int i3 = fx3.A;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fx3.A = i3 - Integer.MIN_VALUE;
                Object obj2 = fx3.z;
                i = fx3.A;
                p81 p81 = p81.w;
                if (i != 0) {
                    o85.q(obj2);
                    px3 px3 = (px3) obj;
                    fi2 = this.w;
                    fx3.C = fi2;
                    fx3.D = 0;
                    fx3.A = 1;
                    px3.getClass();
                    Charset charset = mo0.a;
                    Charset charset2 = this.y;
                    if (sg3.e(charset2, charset)) {
                        fp7 fp7 = this.z;
                        if (sg3.e(fp7.a, b26.a.b(di2.class))) {
                            tn0 = new tn0(new w6((Object) px3, this.A, (Object) z85.x(px3.a.b, tf4.i(fp7)), (Object) charset2, (f61) null, 9), t51.b(this.x, charset2));
                            if (tn0 != p81) {
                                i2 = 0;
                                obj2 = tn0;
                            }
                            return p81;
                        }
                    }
                    tn0 = null;
                    if (tn0 != p81) {
                    }
                    return p81;
                } else if (i == 1) {
                    i2 = fx3.D;
                    fi2 = fx3.C;
                    o85.q(obj2);
                } else if (i == 2) {
                    o85.q(obj2);
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fx3.C = null;
                fx3.D = i2;
                fx3.A = 2;
            }
        }
        fx3 = new fx3(this, f61);
        Object obj22 = fx3.z;
        i = fx3.A;
        p81 p812 = p81.w;
        if (i != 0) {
        }
        fx3.C = null;
        fx3.D = i2;
        fx3.A = 2;
    }
}
