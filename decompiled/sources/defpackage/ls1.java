package defpackage;

/* renamed from: ls1  reason: default package */
public final class ls1 implements vr2 {
    public final /* synthetic */ int w;
    public final ms1 x;

    public /* synthetic */ ls1(ms1 ms1, int i) {
        this.w = i;
        this.x = ms1;
    }

    public final Object y(Object obj) {
        int i = this.w;
        ms1 ms1 = this.x;
        switch (i) {
            case b85.b:
                xp7 xp7 = (xp7) obj;
                xp7.getClass();
                if (xp7.c()) {
                    return "*";
                }
                vw3 b = xp7.b();
                b.getClass();
                String P = ms1.P(b);
                if (xp7.a() == k28.y) {
                    return P;
                }
                return xp7.a() + ' ' + P;
            default:
                vw3 vw3 = (vw3) obj;
                vw3.getClass();
                return ms1.P(vw3);
        }
    }
}
