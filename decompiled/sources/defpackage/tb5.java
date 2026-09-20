package defpackage;

/* renamed from: tb5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tb5 implements eh2 {
    public final ax6 a;
    public final ob5 b;

    public tb5(ax6 ax6, ob5 ob5) {
        this.a = ax6;
        this.b = ob5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public final Object a(eh6 eh6, float f, f61 f61) {
        sb5 sb5;
        int i;
        ob5 ob5;
        if (f61 instanceof sb5) {
            sb5 = (sb5) f61;
            int i2 = sb5.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sb5.B = i2 - Integer.MIN_VALUE;
                Object obj = sb5.z;
                i = sb5.B;
                if (i != 0) {
                    o85.q(obj);
                    h43 h43 = new h43(26, this, eh6);
                    sb5.B = 1;
                    obj = this.a.d(eh6, f, h43, sb5);
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
                float floatValue = ((Number) obj).floatValue();
                ob5 = this.b;
                if (ob5.l() != 0.0f && ((double) Math.abs(ob5.l())) < 0.001d) {
                    int k = ob5.k();
                    if (ob5.k.a()) {
                        ar7.H(((db5) ob5.m.getValue()).s, (e81) null, (r81) null, new xa5(ob5, (f61) null, 2), 3);
                    }
                    ob5.t(k, 0.0f, false);
                } else {
                    new Float(ob5.l());
                }
                return new Float(floatValue);
            }
        }
        sb5 = new sb5(this, (h61) f61);
        Object obj2 = sb5.z;
        i = sb5.B;
        if (i != 0) {
        }
        float floatValue2 = ((Number) obj2).floatValue();
        ob5 = this.b;
        if (ob5.l() != 0.0f && ((double) Math.abs(ob5.l())) < 0.001d) {
        }
        return new Float(floatValue2);
    }
}
