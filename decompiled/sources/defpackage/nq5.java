package defpackage;

/* renamed from: nq5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class nq5 implements vr2 {
    public final /* synthetic */ a37 A;
    public final /* synthetic */ a37 B;
    public final /* synthetic */ long C;
    public final /* synthetic */ l57 D;
    public final /* synthetic */ long E;
    public final /* synthetic */ a37 w;
    public final /* synthetic */ int x;
    public final /* synthetic */ float y;
    public final /* synthetic */ float z;

    public /* synthetic */ nq5(jb3 jb3, int i, float f, float f2, jb3 jb32, jb3 jb33, long j, l57 l57, long j2) {
        this.w = jb3;
        this.x = i;
        this.y = f;
        this.z = f2;
        this.A = jb32;
        this.B = jb33;
        this.C = j;
        this.D = l57;
        this.E = j2;
    }

    public final Object y(Object obj) {
        long j = this.C;
        l57 l57 = this.D;
        long j2 = this.E;
        hz1 hz1 = (hz1) obj;
        float floatValue = ((Number) this.w.getValue()).floatValue() * 360.0f;
        int i = this.x;
        float f = this.y;
        if (i != 0 && Float.intBitsToFloat((int) (hz1.e() & 4294967295L)) <= Float.intBitsToFloat((int) (hz1.e() >> 32))) {
            f += this.z;
        }
        float S = (f / ((float) (((double) hz1.S(Float.intBitsToFloat((int) (hz1.e() >> 32)))) * 3.141592653589793d))) * 360.0f;
        float floatValue2 = ((Number) this.B.getValue()).floatValue() + ((Number) this.A.getValue()).floatValue();
        long v0 = hz1.v0();
        wr0 j0 = hz1.j0();
        long L = j0.L();
        j0.D().h();
        try {
            ((ji8) j0.x).D(floatValue2, v0);
            rq5.c(hz1, Math.min(floatValue, S) + floatValue, (360.0f - floatValue) - (Math.min(floatValue, S) * 2.0f), j, l57);
            rq5.c(hz1, 0.0f, floatValue, j2, l57);
            b81.u(j0, L);
            return vs7.a;
        } catch (Throwable th) {
            Throwable th2 = th;
            b81.u(j0, L);
            throw th2;
        }
    }
}
