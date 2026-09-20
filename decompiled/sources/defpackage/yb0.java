package defpackage;

/* renamed from: yb0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yb0 {
    public final eq4 a = new eq4(new zb0[16]);

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object a(ly5 ly5, h61 h61) {
        xb0 xb0;
        int i;
        ly5 ly52;
        int i2;
        int i3;
        Object[] objArr;
        if (h61 instanceof xb0) {
            xb0 = (xb0) h61;
            int i4 = xb0.F;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                xb0.F = i4 - Integer.MIN_VALUE;
                Object obj = xb0.D;
                i = xb0.F;
                if (i != 0) {
                    o85.q(obj);
                    eq4 eq4 = this.a;
                    Object[] objArr2 = eq4.w;
                    i3 = eq4.y;
                    Object[] objArr3 = objArr2;
                    ly52 = ly5;
                    i2 = 0;
                    objArr = objArr3;
                } else if (i == 1) {
                    i3 = xb0.C;
                    i2 = xb0.B;
                    objArr = xb0.A;
                    ly5 ly53 = xb0.z;
                    o85.q(obj);
                    ly52 = ly53;
                    i2++;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (i2 < i3) {
                    zh zhVar = new zh(6, (Object) ly52);
                    xb0.z = ly52;
                    xb0.A = objArr;
                    xb0.B = i2;
                    xb0.C = i3;
                    xb0.F = 1;
                    Object t = r16.t((zb0) objArr[i2], zhVar, xb0);
                    p81 p81 = p81.w;
                    if (t == p81) {
                        return p81;
                    }
                    i2++;
                    if (i2 < i3) {
                    }
                }
                return vs7.a;
            }
        }
        xb0 = new xb0(this, h61);
        Object obj2 = xb0.D;
        i = xb0.F;
        if (i != 0) {
        }
        if (i2 < i3) {
        }
        return vs7.a;
    }
}
