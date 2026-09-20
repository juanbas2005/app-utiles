package defpackage;

/* renamed from: kb5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class kb5 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ ob5 x;

    public /* synthetic */ kb5(ob5 ob5, int i) {
        this.w = i;
        this.x = ob5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: db5} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r15v3, types: [java.lang.Long] */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9, types: [vr2] */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e6  */
    public final Object y(Object obj) {
        boolean z;
        db5 db5;
        boolean z2;
        int i = this.w;
        vs7 vs7 = vs7.a;
        ? r2 = 0;
        ob5 ob5 = this.x;
        switch (i) {
            case b85.b:
                Float f = (Float) obj;
                float floatValue = f.floatValue();
                long f2 = fb5.f(ob5);
                float f3 = ob5.i + floatValue;
                long D = dh4.D((double) f3);
                ob5.i = f3 - ((float) D);
                if (Math.abs(floatValue) >= 1.0E-4f) {
                    long j = f2 + D;
                    long q = z65.q(j, ob5.h, ob5.g);
                    boolean z3 = false;
                    if (j != q) {
                        z = true;
                    } else {
                        z = false;
                    }
                    long j2 = q - f2;
                    float f4 = (float) j2;
                    ob5.j = f4;
                    float f5 = 0.0f;
                    if (Math.abs(j2) != 0) {
                        ed5 ed5 = ob5.E;
                        if (f4 > 0.0f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        ed5.setValue(Boolean.valueOf(z2));
                        ed5 ed52 = ob5.F;
                        if (f4 < 0.0f) {
                            z3 = true;
                        }
                        ed52.setValue(Boolean.valueOf(z3));
                    }
                    int i2 = (int) j2;
                    int i3 = -i2;
                    db5 h = ((db5) ob5.m.getValue()).h(i3);
                    if (!(h == null || (db5 = ob5.b) == null)) {
                        db5 h2 = db5.h(i3);
                        if (h2 != null) {
                            ob5.b = h2;
                        }
                        if (r2 == 0) {
                            ob5.h(r2, ob5.a, true);
                            ob5.A.setValue(vs7);
                        } else {
                            ge1 ge1 = ob5.d;
                            ob5 ob52 = (ob5) ge1.y;
                            ad5 ad5 = (ad5) ge1.A;
                            if (ob52.p() != 0) {
                                f5 = ((float) i2) / ((float) ob52.p());
                            }
                            ad5.e(ad5.d() + f5);
                            uy3 uy3 = (uy3) ob5.x.getValue();
                            if (uy3 != null) {
                                uy3.k();
                            }
                        }
                        if (z) {
                            f = Long.valueOf(j2);
                        }
                        floatValue = f.floatValue();
                    }
                    r2 = h;
                    if (r2 == 0) {
                    }
                    if (z) {
                    }
                    floatValue = f.floatValue();
                }
                return Float.valueOf(floatValue);
            default:
                r24 r24 = (r24) obj;
                ix6 h3 = j45.h();
                if (h3 != null) {
                    r2 = h3.e();
                }
                ix6 j3 = j45.j(h3);
                try {
                    r24.a(ob5.e);
                    j45.m(h3, j3, r2);
                    return vs7;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    j45.m(h3, j3, r2);
                    throw th2;
                }
        }
    }
}
