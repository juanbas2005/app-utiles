package defpackage;

/* renamed from: dw2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dw2 implements vr2 {
    public final /* synthetic */ int w;
    public final vr2 x;

    public /* synthetic */ dw2(int i, vr2 vr2) {
        this.w = i;
        this.x = vr2;
    }

    public final Object y(Object obj) {
        long j;
        switch (this.w) {
            case b85.b:
                mx6 mx6 = (mx6) obj;
                synchronized (nx6.c) {
                    j = nx6.e;
                    nx6.e = 1 + j;
                }
                return new ww5(j, mx6, this.x);
            case 1:
                vr2 vr2 = this.x;
                vw3 vw3 = (vw3) obj;
                vw3.getClass();
                return vr2.y(vw3).toString();
            default:
                return this.x.y(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
