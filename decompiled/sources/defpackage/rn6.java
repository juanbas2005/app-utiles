package defpackage;

/* renamed from: rn6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rn6 {
    public final qo6 a;
    public final qo6 b;

    public rn6(qo6 qo6, qo6 qo62) {
        qo6.getClass();
        qo62.getClass();
        this.a = qo6;
        this.b = qo62;
    }

    public final double a() {
        Double d = this.a.d();
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        Double d2 = this.b.d();
        if (d2 != null) {
            double doubleValue2 = d2.doubleValue();
            if (0.0d > doubleValue2 || doubleValue2 > 1.0d) {
                return 1.0d;
            }
            return doubleValue2;
        }
        return 1.0d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r5.a.b(r0) == r4) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (r5.b.b(r0) != r4) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        return r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public final Object b(h61 h61) {
        qn6 qn6;
        int i;
        if (h61 instanceof qn6) {
            qn6 = (qn6) h61;
            int i2 = qn6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qn6.B = i2 - Integer.MIN_VALUE;
                Object obj = qn6.z;
                i = qn6.B;
                p81 p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    qn6.B = 1;
                } else if (i == 1) {
                    o85.q(obj);
                } else if (i == 2) {
                    o85.q(obj);
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qn6.B = 2;
            }
        }
        qn6 = new qn6(this, h61);
        Object obj2 = qn6.z;
        i = qn6.B;
        p81 p812 = p81.w;
        if (i != 0) {
        }
        qn6.B = 2;
    }
}
