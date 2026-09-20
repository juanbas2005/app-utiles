package defpackage;

/* renamed from: ua7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ua7 implements vr2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Integer B;
    public final /* synthetic */ Integer C;
    public final /* synthetic */ eh5 w;
    public final /* synthetic */ eh5 x;
    public final /* synthetic */ oh4 y;
    public final /* synthetic */ int z;

    public /* synthetic */ ua7(eh5 eh5, eh5 eh52, oh4 oh4, int i, int i2, Integer num, Integer num2) {
        this.w = eh5;
        this.x = eh52;
        this.y = oh4;
        this.z = i;
        this.A = i2;
        this.B = num;
        this.C = num2;
    }

    public final Object y(Object obj) {
        float f;
        dh5 dh5 = (dh5) obj;
        eh5 eh5 = this.w;
        eh5 eh52 = this.x;
        int i = this.A;
        if (eh5 != null && eh52 != null) {
            Integer num = this.B;
            num.getClass();
            int intValue = num.intValue();
            Integer num2 = this.C;
            num2.getClass();
            int intValue2 = num2.intValue();
            if (intValue == intValue2) {
                f = va7.d;
            } else {
                f = va7.e;
            }
            oh4 oh4 = this.y;
            int r0 = oh4.r0(jo5.b) + oh4.r0(f);
            int l0 = (oh4.l0(va7.f) + eh52.x) - intValue;
            int i2 = eh5.w;
            int i3 = this.z;
            int i4 = (i - intValue2) - r0;
            dh5.k(dh5, eh5, (i3 - i2) / 2, i4);
            dh5.k(dh5, eh52, (i3 - eh52.w) / 2, i4 - l0);
        } else if (eh5 != null) {
            float f2 = va7.a;
            dh5.k(dh5, eh5, 0, (i - eh5.x) / 2);
        } else if (eh52 != null) {
            float f3 = va7.a;
            dh5.k(dh5, eh52, 0, (i - eh52.x) / 2);
        }
        return vs7.a;
    }
}
