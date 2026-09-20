package defpackage;

/* renamed from: ff4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ff4 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ zr3 x;
    public final /* synthetic */ zr3 y;

    public /* synthetic */ ff4(zr3 zr3, zr3 zr32, int i) {
        this.w = i;
        this.x = zr3;
        this.y = zr32;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        zr3 zr3 = this.y;
        zr3 zr32 = this.x;
        nq0 nq0 = (nq0) obj;
        switch (i) {
            case b85.b:
                nq0.getClass();
                nq0.b(nq0, "key", zr32.getDescriptor(), 12);
                nq0.b(nq0, "value", zr3.getDescriptor(), 12);
                return vs7;
            default:
                nq0.getClass();
                nq0.b(nq0, "first", zr32.getDescriptor(), 12);
                nq0.b(nq0, "second", zr3.getDescriptor(), 12);
                return vs7;
        }
    }
}
