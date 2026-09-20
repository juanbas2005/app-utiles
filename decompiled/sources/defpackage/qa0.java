package defpackage;

/* renamed from: qa0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class qa0 implements vr2 {
    public final /* synthetic */ float A;
    public final /* synthetic */ long B;
    public final /* synthetic */ long C;
    public final /* synthetic */ l57 D;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ kc0 x;
    public final /* synthetic */ long y;
    public final /* synthetic */ float z;

    public /* synthetic */ qa0(boolean z2, ky6 ky6, long j, float f, float f2, long j2, long j3, l57 l57) {
        this.w = z2;
        this.x = ky6;
        this.y = j;
        this.z = f;
        this.A = f2;
        this.B = j2;
        this.C = j3;
        this.D = l57;
    }

    public final Object y(Object obj) {
        long j;
        wy3 wy3 = (wy3) obj;
        wy3.a();
        tk0 tk0 = wy3.w;
        boolean z2 = this.w;
        wy3 wy32 = wy3;
        kc0 kc0 = this.x;
        long j2 = this.y;
        if (z2) {
            hz1.F0(wy32, kc0, 0, 0, j2, 0.0f, (iz1) null, (lt0) null, 246);
        } else {
            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            float f = this.z;
            if (intBitsToFloat < f) {
                float intBitsToFloat2 = Float.intBitsToFloat((int) (tk0.e() >> 32));
                float f2 = this.A;
                float f3 = intBitsToFloat2 - f2;
                float intBitsToFloat3 = Float.intBitsToFloat((int) (tk0.e() & 4294967295L)) - f2;
                wr0 wr0 = tk0.x;
                long L = wr0.L();
                wr0.D().h();
                try {
                    ((ji8) wr0.x).p(f2, f2, f3, intBitsToFloat3, 0);
                    j = L;
                    try {
                        hz1.F0(wy32, kc0, 0, 0, j2, 0.0f, (iz1) null, (lt0) null, 246);
                        b81.u(wr0, j);
                    } catch (Throwable th) {
                        th = th;
                        b81.u(wr0, j);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j = L;
                    b81.u(wr0, j);
                    throw th;
                }
            } else {
                long A2 = rg3.A(f, j2);
                wy3 wy33 = wy32;
                wy3 wy34 = wy33;
                hz1.F0(wy34, kc0, this.B, this.C, A2, 0.0f, this.D, (lt0) null, 208);
            }
        }
        return vs7.a;
    }
}
