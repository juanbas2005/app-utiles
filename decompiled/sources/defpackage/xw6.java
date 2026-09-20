package defpackage;

/* renamed from: xw6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class xw6 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ e06 x;
    public final /* synthetic */ vr2 y;

    public /* synthetic */ xw6(e06 e06, vr2 vr2, int i) {
        this.w = i;
        this.x = e06;
        this.y = vr2;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        vr2 vr2 = this.y;
        e06 e06 = this.x;
        float floatValue = ((Float) obj).floatValue();
        switch (i) {
            case b85.b:
                float f = e06.w - floatValue;
                e06.w = f;
                vr2.y(Float.valueOf(f));
                return vs7;
            default:
                float f2 = e06.w - floatValue;
                e06.w = f2;
                vr2.y(Float.valueOf(f2));
                return vs7;
        }
    }
}
