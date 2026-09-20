package defpackage;

/* renamed from: ek7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ek7 {
    public final mq4 a;
    public final dq4 b = new dq4(Boolean.FALSE);
    public kk0 c;

    public ek7(mq4 mq4) {
        this.a = mq4;
    }

    public final void a() {
        this.b.y.setValue(Boolean.FALSE);
    }

    public final boolean b() {
        dq4 dq4 = this.b;
        if (((Boolean) dq4.x.getValue()).booleanValue() || ((Boolean) dq4.y.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }

    public final Object c(hq4 hq4, a97 a97) {
        hq4 hq42 = hq4;
        zc zcVar = new zc(this, hq42, new ne1(this, (f61) null, 3), (f61) null, 3);
        mq4 mq4 = this.a;
        mq4.getClass();
        Object L = gl0.L(new p6(hq42, mq4, (vr2) zcVar, (f61) null), a97);
        if (L == p81.w) {
            return L;
        }
        return vs7.a;
    }
}
