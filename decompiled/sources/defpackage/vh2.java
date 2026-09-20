package defpackage;

/* renamed from: vh2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vh2 {
    public float a;
    public float b;
    public float c;
    public float d;
    public final uj e;
    public df3 f;
    public df3 g;

    public vh2(float f2, float f3, float f4, float f5) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.e = new uj(new lx1(f2), we.x, (Object) null, 12);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    public final Object a(df3 df3, h61 h61) {
        th2 th2;
        int i;
        float f2;
        uj ujVar = this.e;
        if (h61 instanceof th2) {
            th2 = (th2) h61;
            int i2 = th2.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                th2.C = i2 - Integer.MIN_VALUE;
                Object obj = th2.A;
                i = th2.C;
                if (i != 0) {
                    o85.q(obj);
                    if (df3 instanceof eo5) {
                        f2 = this.b;
                    } else if (df3 instanceof r23) {
                        f2 = this.c;
                    } else if (df3 instanceof dk2) {
                        f2 = this.d;
                    } else {
                        f2 = this.a;
                    }
                    this.g = df3;
                    if (!lx1.b(((lx1) ujVar.e.getValue()).w, f2)) {
                        df3 df32 = this.f;
                        th2.z = df3;
                        th2.C = 1;
                        Object a2 = n22.a(ujVar, f2, df32, df3, th2);
                        p81 p81 = p81.w;
                        if (a2 == p81) {
                            return p81;
                        }
                    }
                } else if (i == 1) {
                    df3 = th2.z;
                    try {
                        o85.q(obj);
                    } catch (Throwable th) {
                        this.f = df3;
                        throw th;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.f = df3;
                return vs7.a;
            }
        }
        th2 = new th2(this, h61);
        Object obj2 = th2.A;
        i = th2.C;
        if (i != 0) {
        }
        this.f = df3;
        return vs7.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object b(h61 h61) {
        uh2 uh2;
        int i;
        float f2;
        if (h61 instanceof uh2) {
            uh2 = (uh2) h61;
            int i2 = uh2.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uh2.B = i2 - Integer.MIN_VALUE;
                Object obj = uh2.z;
                i = uh2.B;
                if (i != 0) {
                    o85.q(obj);
                    df3 df3 = this.g;
                    if (df3 instanceof eo5) {
                        f2 = this.b;
                    } else if (df3 instanceof r23) {
                        f2 = this.c;
                    } else if (df3 instanceof dk2) {
                        f2 = this.d;
                    } else {
                        f2 = this.a;
                    }
                    uj ujVar = this.e;
                    if (!lx1.b(((lx1) ujVar.e.getValue()).w, f2)) {
                        lx1 lx1 = new lx1(f2);
                        uh2.B = 1;
                        Object f3 = ujVar.f(uh2, lx1);
                        p81 p81 = p81.w;
                        if (f3 == p81) {
                            return p81;
                        }
                    }
                    return vs7.a;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                    } catch (Throwable th) {
                        this.f = this.g;
                        throw th;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.f = this.g;
                return vs7.a;
            }
        }
        uh2 = new uh2(this, h61);
        Object obj2 = uh2.z;
        i = uh2.B;
        if (i != 0) {
        }
        this.f = this.g;
        return vs7.a;
    }
}
