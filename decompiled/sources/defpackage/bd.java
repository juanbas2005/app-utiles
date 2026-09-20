package defpackage;

/* renamed from: bd  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bd {
    public final vr2 a = new j5(7);
    public f81 b;
    public zh c;
    public hl d;
    public tj1 e;
    public final mq4 f = new mq4();
    public final ed5 g;
    public final ed5 h;
    public final oq1 i;
    public final ad5 j;
    public final ad5 k;
    public final ed5 l;
    public final ed5 m;
    public final ad n;

    public bd(yz1 yz1, vr2 vr2) {
        this.g = u55.p(yz1);
        this.h = u55.p(yz1);
        this.i = u55.i(new wc(this, 0));
        this.j = new ad5(Float.NaN);
        u55.j(new wc(this, 1), g22.K);
        this.k = new ad5(0.0f);
        this.l = u55.p((Object) null);
        this.m = u55.p(new ll1(a42.w, new float[0]));
        this.n = new ad(this);
        this.a = vr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public final Object a(Object obj, hq4 hq4, is2 is2, h61 h61) {
        yc ycVar;
        int i2;
        if (h61 instanceof yc) {
            ycVar = (yc) h61;
            int i3 = ycVar.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ycVar.B = i3 - Integer.MIN_VALUE;
                Object obj2 = ycVar.z;
                i2 = ycVar.B;
                ed5 ed5 = this.l;
                if (i2 != 0) {
                    o85.q(obj2);
                    if (b().a.indexOf(obj) != -1) {
                        mq4 mq4 = this.f;
                        zc zcVar = new zc(this, obj, is2, (f61) null, 0);
                        ycVar.B = 1;
                        mq4.getClass();
                        Object L = gl0.L(new p6(hq4, mq4, (vr2) zcVar, (f61) null), ycVar);
                        p81 p81 = p81.w;
                        if (L == p81) {
                            return p81;
                        }
                    } else {
                        Object obj3 = obj;
                        if (((Boolean) this.a.y(obj3)).booleanValue()) {
                            this.h.setValue(obj3);
                            f(obj3);
                        }
                        return vs7.a;
                    }
                } else if (i2 == 1) {
                    try {
                        o85.q(obj2);
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        ed5.setValue((Object) null);
                        throw th2;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ed5.setValue((Object) null);
                return vs7.a;
            }
        }
        ycVar = new yc(this, h61);
        Object obj22 = ycVar.z;
        i2 = ycVar.B;
        ed5 ed52 = this.l;
        if (i2 != 0) {
        }
        ed52.setValue((Object) null);
        return vs7.a;
    }

    public final ll1 b() {
        return (ll1) this.m.getValue();
    }

    public final boolean c() {
        if (this.b == null || this.c == null || this.d == null || this.e == null) {
            return false;
        }
        return true;
    }

    public final float d(float f2) {
        float f3;
        float f4;
        ad5 ad5 = this.j;
        if (Float.isNaN(ad5.d())) {
            f3 = 0.0f;
        } else {
            f3 = ad5.d();
        }
        float f5 = f3 + f2;
        float[] fArr = b().b;
        float f6 = Float.NaN;
        int i2 = 1;
        if (fArr.length == 0) {
            f4 = Float.NaN;
        } else {
            f4 = fArr[0];
            int length = fArr.length - 1;
            if (1 <= length) {
                int i3 = 1;
                while (true) {
                    f4 = Math.min(f4, fArr[i3]);
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
        }
        float[] fArr2 = b().b;
        if (fArr2.length != 0) {
            f6 = fArr2[0];
            int length2 = fArr2.length - 1;
            if (1 <= length2) {
                while (true) {
                    f6 = Math.max(f6, fArr2[i2]);
                    if (i2 == length2) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return z65.o(f5, f4, f6);
    }

    public final float e() {
        ad5 ad5 = this.j;
        if (Float.isNaN(ad5.d())) {
            bc3.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return ad5.d();
    }

    public final void f(Object obj) {
        this.g.setValue(obj);
    }
}
