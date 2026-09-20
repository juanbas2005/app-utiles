package defpackage;

import java.util.Set;

/* renamed from: vj2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vj2 implements fi2 {
    public final /* synthetic */ fi2 w;
    public final /* synthetic */ a96 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ vr2 z;

    public vj2(fi2 fi2, a96 a96, boolean z2, vr2 vr2) {
        this.w = fi2;
        this.x = a96;
        this.y = z2;
        this.z = vr2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (r6.k(r8, r0) != r5) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    public final Object k(Object obj, f61 f61) {
        uj2 uj2;
        int i;
        fi2 fi2;
        if (f61 instanceof uj2) {
            uj2 = (uj2) f61;
            int i2 = uj2.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uj2.A = i2 - Integer.MIN_VALUE;
                Object obj2 = uj2.z;
                i = uj2.A;
                p81 p81 = p81.w;
                if (i != 0) {
                    o85.q(obj2);
                    Set set = (Set) obj;
                    fi2 fi22 = this.w;
                    uj2.B = fi22;
                    uj2.A = 1;
                    obj2 = sg3.P(uj2, this.x, true, this.y, this.z);
                    if (obj2 != p81) {
                        fi2 = fi22;
                    }
                    return p81;
                } else if (i == 1) {
                    fi2 = uj2.B;
                    o85.q(obj2);
                } else if (i == 2) {
                    o85.q(obj2);
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj2.B = null;
                uj2.A = 2;
            }
        }
        uj2 = new uj2(this, f61);
        Object obj22 = uj2.z;
        i = uj2.A;
        p81 p812 = p81.w;
        if (i != 0) {
        }
        uj2.B = null;
        uj2.A = 2;
    }
}
