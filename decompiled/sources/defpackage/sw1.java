package defpackage;

/* renamed from: sw1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sw1 implements fi2 {
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ fi2 x;
    public final /* synthetic */ h06 y;

    public sw1(tw1 tw1, h06 h06, fi2 fi2) {
        this.y = h06;
        this.x = fi2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0073  */
    public final Object k(Object obj, f61 f61) {
        rw1 rw1;
        int i;
        ti2 ti2;
        int i2;
        int i3 = this.w;
        h06 h06 = this.y;
        vs7 vs7 = vs7.a;
        fi2 fi2 = this.x;
        p81 p81 = p81.w;
        switch (i3) {
            case b85.b:
                if (f61 instanceof rw1) {
                    rw1 = (rw1) f61;
                    int i4 = rw1.B;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        rw1.B = i4 - Integer.MIN_VALUE;
                        Object obj2 = rw1.z;
                        i = rw1.B;
                        if (i != 0) {
                            o85.q(obj2);
                            Object obj3 = h06.w;
                            if (obj3 != o15.a && sg3.e(obj3, obj)) {
                                return vs7;
                            }
                            h06.w = obj;
                            rw1.B = 1;
                            if (fi2.k(obj, rw1) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i == 1) {
                            o85.q(obj2);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                rw1 = new rw1(this, f61);
                Object obj22 = rw1.z;
                i = rw1.B;
                if (i != 0) {
                }
                break;
            default:
                if (f61 instanceof ti2) {
                    ti2 = (ti2) f61;
                    int i5 = ti2.B;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ti2.B = i5 - Integer.MIN_VALUE;
                        Object obj4 = ti2.z;
                        i2 = ti2.B;
                        if (i2 != 0) {
                            o85.q(obj4);
                            ti2.B = 1;
                            if (fi2.k(obj, ti2) == p81) {
                                return p81;
                            }
                            return vs7;
                        } else if (i2 == 1) {
                            try {
                                o85.q(obj4);
                                return vs7;
                            } catch (Throwable th) {
                                h06.w = th;
                                throw th;
                            }
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                ti2 = new ti2(this, f61);
                Object obj42 = ti2.z;
                i2 = ti2.B;
                if (i2 != 0) {
                }
        }
    }

    public sw1(fi2 fi2, h06 h06) {
        this.x = fi2;
        this.y = h06;
    }
}
