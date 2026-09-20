package defpackage;

/* renamed from: jf  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class jf implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ float x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ jf(eh5 eh5, xh7 xh7, float f) {
        this.w = 2;
        this.y = eh5;
        this.z = xh7;
        this.x = f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a5, code lost:
        if (r0 > r4) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a9, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bd, code lost:
        if (r0 < r4) goto L_0x00a7;
     */
    public final Object y(Object obj) {
        float floatValue;
        int i;
        long D;
        int i2 = this.w;
        float f = 0.0f;
        vs7 vs7 = vs7.a;
        Object obj2 = this.z;
        float f2 = this.x;
        Object obj3 = this.y;
        switch (i2) {
            case b85.b:
                hg hgVar = (hg) obj3;
                u90 u90 = (u90) obj2;
                wy3 wy3 = (wy3) obj;
                wy3.a();
                wr0 wr0 = wy3.w.x;
                long L = wr0.L();
                wr0.D().h();
                try {
                    ji8 ji8 = (ji8) wr0.x;
                    ji8.F(f2, 0.0f);
                    ji8.D(45.0f, 0);
                    hz1.F(wy3, hgVar, 0, 0.0f, u90, 46);
                    b81.u(wr0, L);
                    return vs7;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    b81.u(wr0, L);
                    throw th2;
                }
            case 1:
                e06 e06 = (e06) obj3;
                o34 o34 = (o34) obj2;
                gl glVar = (gl) obj;
                if (f2 > 0.0f) {
                    floatValue = ((Number) glVar.e.getValue()).floatValue();
                    break;
                } else {
                    if (f2 < 0.0f) {
                        floatValue = ((Number) glVar.e.getValue()).floatValue();
                        break;
                    }
                    float f3 = f - e06.w;
                    if (!(f3 == o34.a(f3) && f == ((Number) glVar.e.getValue()).floatValue())) {
                        glVar.a();
                    }
                    e06.w += f3;
                    return vs7;
                }
                f = f2;
                float f32 = f - e06.w;
                glVar.a();
                e06.w += f32;
                return vs7;
            case 2:
                eh5 eh5 = (eh5) obj3;
                dh5 dh5 = (dh5) obj;
                uj ujVar = ((xh7) obj2).O;
                if (ujVar != null) {
                    i = (int) ((Number) ujVar.d()).floatValue();
                } else {
                    i = (int) f2;
                }
                dh5.k(dh5, eh5, i, 0);
                return vs7;
            default:
                fu7 fu7 = (fu7) obj3;
                vr2 vr2 = (vr2) obj2;
                long longValue = ((Long) obj).longValue();
                if (fu7.b == Long.MIN_VALUE) {
                    fu7.b = longValue;
                }
                float f4 = fu7.e;
                kl klVar = new kl(f4);
                int i3 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                kl klVar2 = fu7.f;
                if (i3 == 0) {
                    D = fu7.a.d(new kl(f4), klVar2, fu7.c);
                } else {
                    D = dh4.D((double) (((float) (longValue - fu7.b)) / f2));
                }
                long j = D;
                float f5 = ((kl) fu7.a.t(j, klVar, klVar2, fu7.c)).a;
                fu7.c = (kl) fu7.a.j(j, klVar, klVar2, fu7.c);
                fu7.b = longValue;
                fu7.e = f5;
                vr2.y(Float.valueOf(fu7.e - f5));
                return vs7;
        }
    }

    public /* synthetic */ jf(float f, Object obj, Object obj2, int i) {
        this.w = i;
        this.x = f;
        this.y = obj;
        this.z = obj2;
    }

    public /* synthetic */ jf(fu7 fu7, float f, vr2 vr2) {
        this.w = 3;
        this.y = fu7;
        this.x = f;
        this.z = vr2;
    }
}
