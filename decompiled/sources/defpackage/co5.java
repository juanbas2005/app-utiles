package defpackage;

/* renamed from: co5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class co5 implements tp1 {
    public final /* synthetic */ tp1 w;
    public boolean x;
    public boolean y;
    public final qq4 z = new qq4();

    public co5(tp1 tp1) {
        this.w = tp1;
    }

    public final long A0(long j) {
        return this.w.A0(j);
    }

    public final float C0(long j) {
        return this.w.C0(j);
    }

    public final long L(float f) {
        return this.w.L(f);
    }

    public final float P(int i) {
        return this.w.P(i);
    }

    public final float S(float f) {
        return this.w.S(f);
    }

    public final float Y() {
        return this.w.Y();
    }

    public final void a() {
        this.y = true;
        qq4 qq4 = this.z;
        if (qq4.f()) {
            qq4.k((Object) null);
        }
    }

    public final float b() {
        return this.w.b();
    }

    public final void c() {
        this.x = true;
        qq4 qq4 = this.z;
        if (qq4.f()) {
            qq4.k((Object) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object d(h61 h61) {
        ao5 ao5;
        int i;
        if (h61 instanceof ao5) {
            ao5 = (ao5) h61;
            int i2 = ao5.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ao5.B = i2 - Integer.MIN_VALUE;
                Object obj = ao5.z;
                i = ao5.B;
                if (i != 0) {
                    o85.q(obj);
                    ao5.B = 1;
                    Object a = this.z.a(ao5);
                    p81 p81 = p81.w;
                    if (a == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.x = false;
                this.y = false;
                return vs7.a;
            }
        }
        ao5 = new ao5(this, h61);
        Object obj2 = ao5.z;
        i = ao5.B;
        if (i != 0) {
        }
        this.x = false;
        this.y = false;
        return vs7.a;
    }

    public final float e0(float f) {
        return this.w.e0(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public final Object f(h61 h61) {
        bo5 bo5;
        int i;
        if (h61 instanceof bo5) {
            bo5 = (bo5) h61;
            int i2 = bo5.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bo5.B = i2 - Integer.MIN_VALUE;
                Object obj = bo5.z;
                i = bo5.B;
                qq4 qq4 = this.z;
                if (i != 0) {
                    o85.q(obj);
                    if (!this.x && !this.y) {
                        bo5.B = 1;
                        Object a = qq4.a(bo5);
                        p81 p81 = p81.w;
                        if (a == p81) {
                            return p81;
                        }
                    }
                    return Boolean.valueOf(this.x);
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qq4.k((Object) null);
                return Boolean.valueOf(this.x);
            }
        }
        bo5 = new bo5(this, h61);
        Object obj2 = bo5.z;
        i = bo5.B;
        qq4 qq42 = this.z;
        if (i != 0) {
        }
        qq42.k((Object) null);
        return Boolean.valueOf(this.x);
    }

    public final int l0(long j) {
        return this.w.l0(j);
    }

    public final long o(float f) {
        return this.w.o(f);
    }

    public final long p(long j) {
        return this.w.p(j);
    }

    public final int r0(float f) {
        return this.w.r0(f);
    }

    public final float z(long j) {
        return this.w.z(j);
    }
}
