package defpackage;

/* renamed from: i23  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i23 {
    public int a;
    public float b;
    public final Object c;

    public i23(zf7 zf7) {
        this.c = zf7;
        this.a = -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    public float a(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        int i2;
        float f;
        zf7 zf7 = (zf7) this.c;
        int i3 = 1;
        if (z) {
            int B = h49.B(zf7.f, i, z);
            int lineStart = zf7.f.getLineStart(B);
            int f2 = zf7.f(B);
            if (i == lineStart || i == f2) {
                z4 = true;
                int i4 = i * 4;
                if (!z3) {
                    if (z4) {
                        i3 = 0;
                    }
                } else if (z4) {
                    i3 = 2;
                } else {
                    i3 = 3;
                }
                i2 = i4 + i3;
                if (this.a != i2) {
                    return this.b;
                }
                if (z3) {
                    f = zf7.j(i, z);
                } else {
                    f = zf7.k(i, z);
                }
                if (z2) {
                    this.a = i2;
                    this.b = f;
                }
                return f;
            }
        }
        z4 = false;
        int i42 = i * 4;
        if (!z3) {
        }
        i2 = i42 + i3;
        if (this.a != i2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public Object b(float f, h61 h61) {
        t36 t36;
        int i;
        if (h61 instanceof t36) {
            t36 = (t36) h61;
            int i2 = t36.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t36.B = i2 - Integer.MIN_VALUE;
                Object obj = t36.z;
                i = t36.B;
                if (i != 0) {
                    o85.q(obj);
                    Float f2 = new Float(f);
                    t36.B = 1;
                    obj = ((wh7) this.c).H(f2, t36);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.b += ((Number) obj).floatValue();
                return vs7.a;
            }
        }
        t36 = new t36(this, h61);
        Object obj2 = t36.z;
        i = t36.B;
        if (i != 0) {
        }
        this.b += ((Number) obj2).floatValue();
        return vs7.a;
    }

    public i23(int i, wh7 wh7) {
        this.a = i;
        this.c = wh7;
    }
}
