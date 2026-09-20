package defpackage;

/* renamed from: ax6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ax6 implements eh2 {
    public final fx6 a;
    public final tj1 b;
    public final hl c;
    public final kv1 d = mh6.c;

    public ax6(fx6 fx6, tj1 tj1, hl hlVar) {
        this.a = fx6;
        this.b = tj1;
        this.c = hlVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0021  */
    public static final Object b(ax6 ax6, eh6 eh6, float f, float f2, xw6 xw6, h61 h61) {
        zw6 zw6;
        int i;
        lr ay4;
        if (h61 instanceof zw6) {
            zw6 = (zw6) h61;
            int i2 = zw6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zw6.B = i2 - Integer.MIN_VALUE;
                zw6 zw62 = zw6;
                Object obj = zw62.z;
                i = zw62.B;
                if (i != 0) {
                    o85.q(obj);
                    if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
                        return gr8.a(f, f2, 28);
                    }
                    zw62.B = 1;
                    tj1 tj1 = ax6.b;
                    if (Math.abs(kl8.g(tj1, 0.0f, f2)) >= Math.abs(f)) {
                        ay4 = new wv2(11, tj1);
                    } else {
                        ay4 = new ay4(12, ax6.c);
                    }
                    obj = ay4.d(eh6, new Float(f), new Float(f2), xw6, zw62);
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
                return ((el) obj).b;
            }
        }
        zw6 = new zw6(ax6, h61);
        zw6 zw622 = zw6;
        Object obj2 = zw622.z;
        i = zw622.B;
        if (i != 0) {
        }
        return ((el) obj2).b;
    }

    public Object a(eh6 eh6, float f, f61 f61) {
        return d(eh6, f, b96.t, (h61) f61);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object c(eh6 eh6, float f, vr2 vr2, h61 h61) {
        ww6 ww6;
        int i;
        vr2 vr22;
        if (h61 instanceof ww6) {
            ww6 = (ww6) h61;
            int i2 = ww6.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ww6.C = i2 - Integer.MIN_VALUE;
                Object obj = ww6.A;
                i = ww6.C;
                if (i != 0) {
                    o85.q(obj);
                    vr2 vr23 = vr2;
                    ql1 ql1 = new ql1(this, f, vr23, eh6, (f61) null);
                    ww6.z = vr23;
                    ww6.C = 1;
                    obj = ar7.e0(this.d, ql1, ww6);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                    vr22 = vr23;
                } else if (i == 1) {
                    vr22 = ww6.z;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                el elVar = (el) obj;
                vr22.y(new Float(0.0f));
                return elVar;
            }
        }
        ww6 = new ww6(this, h61);
        Object obj2 = ww6.A;
        i = ww6.C;
        if (i != 0) {
        }
        el elVar2 = (el) obj2;
        vr22.y(new Float(0.0f));
        return elVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object d(eh6 eh6, float f, vr2 vr2, h61 h61) {
        yw6 yw6;
        int i;
        float floatValue;
        if (h61 instanceof yw6) {
            yw6 = (yw6) h61;
            int i2 = yw6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yw6.B = i2 - Integer.MIN_VALUE;
                Object obj = yw6.z;
                i = yw6.B;
                if (i != 0) {
                    o85.q(obj);
                    yw6.B = 1;
                    obj = c(eh6, f, vr2, yw6);
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
                el elVar = (el) obj;
                floatValue = elVar.a.floatValue();
                il ilVar = elVar.b;
                float f2 = 0.0f;
                if (floatValue != 0.0f) {
                    f2 = ((Number) ilVar.b()).floatValue();
                }
                return new Float(f2);
            }
        }
        yw6 = new yw6(this, h61);
        Object obj2 = yw6.z;
        i = yw6.B;
        if (i != 0) {
        }
        el elVar2 = (el) obj2;
        floatValue = elVar2.a.floatValue();
        il ilVar2 = elVar2.b;
        float f22 = 0.0f;
        if (floatValue != 0.0f) {
        }
        return new Float(f22);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ax6)) {
            return false;
        }
        ax6 ax6 = (ax6) obj;
        if (!sg3.e(ax6.c, this.c) || !sg3.e(ax6.b, this.b) || !ax6.a.equals(this.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.a.hashCode() + ((hashCode + (this.c.hashCode() * 31)) * 31);
    }
}
