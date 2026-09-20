package defpackage;

/* renamed from: oa0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class oa0 implements vr2 {
    public final /* synthetic */ sr2 A;
    public final /* synthetic */ ly5 B;
    public final /* synthetic */ long C;
    public final /* synthetic */ eh D;
    public final /* synthetic */ o9 w;
    public final /* synthetic */ float x;
    public final /* synthetic */ k85 y;
    public final /* synthetic */ kc0 z;

    public /* synthetic */ oa0(o9 o9Var, float f, k85 k85, kc0 kc0, sr2 sr2, ly5 ly5, long j, eh ehVar) {
        this.w = o9Var;
        this.x = f;
        this.y = k85;
        this.z = kc0;
        this.A = sr2;
        this.B = ly5;
        this.C = j;
        this.D = ehVar;
    }

    public final Object y(Object obj) {
        float f;
        long j = this.C;
        eh ehVar = this.D;
        hz1 hz1 = (hz1) obj;
        w57 w57 = (w57) this.w.y;
        w57.getClass();
        float floatValue = Float.valueOf(w57.w).floatValue();
        if (floatValue < 0.0f) {
            f = 0.0f;
        } else {
            f = floatValue;
        }
        int i = ((2.0f * f) > this.x ? 1 : ((2.0f * f) == this.x ? 0 : -1));
        k85 k85 = this.y;
        kc0 kc0 = this.z;
        if (i > 0) {
            hz1.U(hz1, k85.l, kc0, 0.0f, (l57) null, (lt0) null, 60);
        } else {
            cx2 cx2 = (cx2) this.A.b();
            ex2 ex2 = cx2.a;
            if (ex2.k() != 1) {
                ex2.F(1);
            }
            ly5 ly5 = this.B;
            float f2 = ly5.a;
            float f3 = ly5.b;
            ((ji8) hz1.j0().x).F(f2, f3);
            try {
                hz1.o0(cx2, j, new pa0(ly5, k85, kc0, f, ehVar));
                t49.H(hz1, cx2);
            } finally {
                ((ji8) hz1.j0().x).F(-f2, -f3);
            }
        }
        return vs7.a;
    }
}
