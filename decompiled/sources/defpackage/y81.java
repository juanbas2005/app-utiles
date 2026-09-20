package defpackage;

/* renamed from: y81  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y81 implements hf0 {
    public final hf0 b;
    public final tc0 c = new Object();
    public long d;
    public long e;

    /* JADX WARNING: type inference failed for: r1v1, types: [tc0, java.lang.Object] */
    public y81(hf0 hf0) {
        hf0.getClass();
        this.b = hf0;
    }

    public final void a(Throwable th) {
        this.b.a(th);
    }

    public final Throwable b() {
        return this.b.b();
    }

    public final void c() {
        e();
        this.d += this.c.u(this.b.g());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object d(int i, h61 h61) {
        x81 x81;
        Object obj;
        int i2;
        if (h61 instanceof x81) {
            x81 = (x81) h61;
            int i3 = x81.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                x81.B = i3 - Integer.MIN_VALUE;
                obj = x81.z;
                i2 = x81.B;
                if (i2 != 0) {
                    o85.q(obj);
                    c();
                    if (this.c.y >= ((long) i)) {
                        return Boolean.TRUE;
                    }
                    x81.B = 1;
                    obj = this.b.d(i, x81);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (((Boolean) obj).booleanValue()) {
                    return Boolean.FALSE;
                }
                c();
                return Boolean.TRUE;
            }
        }
        x81 = new x81(this, h61);
        obj = x81.z;
        i2 = x81.B;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final void e() {
        long j = this.e;
        long j2 = this.d;
        long j3 = this.c.y;
        this.e = (j2 - j3) + j;
        this.d = j3;
    }

    public final tc0 g() {
        c();
        return this.c;
    }

    public final boolean h() {
        if (!this.c.x() || !this.b.h()) {
            return false;
        }
        return true;
    }
}
