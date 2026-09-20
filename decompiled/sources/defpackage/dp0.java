package defpackage;

/* renamed from: dp0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class dp0 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ ok6 x;

    public /* synthetic */ dp0(ok6 ok6, int i) {
        this.w = i;
        this.x = ok6;
    }

    public final Object y(Object obj) {
        int i = this.w;
        boolean z = false;
        ij7 ij7 = ij7.x;
        ij7 ij72 = ij7.w;
        Boolean bool = null;
        ok6 ok6 = this.x;
        switch (i) {
            case b85.b:
                ln7 ln7 = (ln7) obj;
                ln7.getClass();
                hd5 hd5 = (hd5) ln7;
                hd5.L = true;
                hd5.K.y(ok6);
                g75.D(hd5);
                return Boolean.FALSE;
            case 1:
                ag agVar = (ag) obj;
                if (agVar.a.isToggle()) {
                    bool = Boolean.valueOf(agVar.a.getToggleValue());
                }
                if (bool != null) {
                    if (bool.booleanValue()) {
                        ij7 = ij72;
                    }
                    mk6.h(ok6, ij7);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                ag agVar2 = (ag) obj;
                if (agVar2.a.isToggle()) {
                    bool = Boolean.valueOf(agVar2.a.getToggleValue());
                }
                if (bool != null) {
                    if (bool.booleanValue()) {
                        ij7 = ij72;
                    }
                    mk6.h(ok6, ij7);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
