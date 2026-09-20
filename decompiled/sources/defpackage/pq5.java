package defpackage;

/* renamed from: pq5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class pq5 implements vr2 {
    public final /* synthetic */ long A;
    public final /* synthetic */ vr2 B;
    public final /* synthetic */ int w;
    public final /* synthetic */ float x;
    public final /* synthetic */ sr2 y;
    public final /* synthetic */ long z;

    public /* synthetic */ pq5(int i, float f, sr2 sr2, long j, long j2, vr2 vr2) {
        this.w = i;
        this.x = f;
        this.y = sr2;
        this.z = j;
        this.A = j2;
        this.B = vr2;
    }

    public final Object y(Object obj) {
        hz1 hz1 = (hz1) obj;
        float intBitsToFloat = Float.intBitsToFloat((int) (hz1.e() & 4294967295L));
        int i = this.w;
        float f = this.x;
        if (i != 0 && Float.intBitsToFloat((int) (hz1.e() & 4294967295L)) <= Float.intBitsToFloat((int) (hz1.e() >> 32))) {
            f += hz1.S(intBitsToFloat);
        }
        float S = f / hz1.S(Float.intBitsToFloat((int) (hz1.e() >> 32)));
        float floatValue = ((Number) this.y.b()).floatValue();
        float min = Math.min(floatValue, S) + floatValue;
        if (min <= 1.0f) {
            rq5.d(hz1, min, 1.0f, this.z, intBitsToFloat, i);
        }
        rq5.d(hz1, 0.0f, floatValue, this.A, intBitsToFloat, i);
        this.B.y(hz1);
        return vs7.a;
    }
}
