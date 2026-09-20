package defpackage;

/* renamed from: x60  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class x60 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ fg7 x;
    public final /* synthetic */ vr2 y;

    public /* synthetic */ x60(fg7 fg7, vr2 vr2, int i) {
        this.w = i;
        this.x = fg7;
        this.y = vr2;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vr2 vr2 = this.y;
        fg7 fg7 = this.x;
        switch (i) {
            case b85.b:
                bg7 bg7 = (bg7) obj;
                if (fg7 != null) {
                    fg7.a.setValue(bg7);
                }
                if (vr2 != null) {
                    vr2.y(bg7);
                }
                return vs7.a;
            default:
                kw1 kw1 = (kw1) obj;
                fg7.c.add(vr2);
                return new m30(8, fg7, vr2);
        }
    }
}
