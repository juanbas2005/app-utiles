package defpackage;

import java.nio.charset.Charset;

/* renamed from: l41  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l41 implements fi2 {
    public final /* synthetic */ hf0 A;
    public final /* synthetic */ int w;
    public final /* synthetic */ fi2 x;
    public final /* synthetic */ Charset y;
    public final /* synthetic */ fp7 z;

    public /* synthetic */ l41(fi2 fi2, Charset charset, fp7 fp7, hf0 hf0, int i) {
        this.w = i;
        this.x = fi2;
        this.y = charset;
        this.z = fp7;
        this.A = hf0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005f, code lost:
        if (r0 == r9) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b2, code lost:
        if (r0 == r9) goto L_0x00c1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    public final Object k(Object obj, f61 f61) {
        k41 k41;
        Object obj2;
        int i;
        dx3 dx3;
        Object obj3;
        int i2;
        f61 f612 = f61;
        int i3 = this.w;
        vs7 vs7 = vs7.a;
        hf0 hf0 = this.A;
        fp7 fp7 = this.z;
        Charset charset = this.y;
        fi2 fi2 = this.x;
        p81 p81 = p81.w;
        int i4 = 0;
        switch (i3) {
            case b85.b:
                if (f612 instanceof k41) {
                    k41 = (k41) f612;
                    int i5 = k41.A;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        k41.A = i5 - Integer.MIN_VALUE;
                        obj2 = k41.z;
                        i = k41.A;
                        if (i != 0) {
                            o85.q(obj2);
                            k41.C = fi2;
                            k41.D = 0;
                            k41.A = 1;
                            obj2 = ((jx3) obj).a(charset, fp7, hf0, k41);
                            break;
                        } else if (i == 1) {
                            i4 = k41.D;
                            fi2 = k41.C;
                            o85.q(obj2);
                        } else if (i == 2) {
                            o85.q(obj2);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k41.C = null;
                        k41.D = i4;
                        k41.A = 2;
                        if (fi2.k(obj2, k41) != p81) {
                            return vs7;
                        }
                        return p81;
                    }
                }
                k41 = new k41(this, f612);
                obj2 = k41.z;
                i = k41.A;
                if (i != 0) {
                }
                k41.C = null;
                k41.D = i4;
                k41.A = 2;
                if (fi2.k(obj2, k41) != p81) {
                }
                return p81;
            default:
                if (f612 instanceof dx3) {
                    dx3 = (dx3) f612;
                    int i6 = dx3.A;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        dx3.A = i6 - Integer.MIN_VALUE;
                        obj3 = dx3.z;
                        i2 = dx3.A;
                        if (i2 != 0) {
                            o85.q(obj3);
                            dx3.C = fi2;
                            dx3.D = 0;
                            dx3.A = 1;
                            obj3 = ((px3) obj).b(charset, fp7, hf0, dx3);
                            break;
                        } else if (i2 == 1) {
                            i4 = dx3.D;
                            fi2 = dx3.C;
                            o85.q(obj3);
                        } else if (i2 == 2) {
                            o85.q(obj3);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dx3.C = null;
                        dx3.D = i4;
                        dx3.A = 2;
                        if (fi2.k(obj3, dx3) != p81) {
                            return vs7;
                        }
                        return p81;
                    }
                }
                dx3 = new dx3(this, f612);
                obj3 = dx3.z;
                i2 = dx3.A;
                if (i2 != 0) {
                }
                dx3.C = null;
                dx3.D = i4;
                dx3.A = 2;
                if (fi2.k(obj3, dx3) != p81) {
                }
                return p81;
        }
    }
}
