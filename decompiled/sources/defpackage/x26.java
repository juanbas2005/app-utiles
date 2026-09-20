package defpackage;

/* renamed from: x26  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class x26 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ aq4 x;

    public /* synthetic */ x26(aq4 aq4, int i) {
        this.w = i;
        this.x = aq4;
    }

    public final Object b() {
        int i = this.w;
        vs7 vs7 = vs7.a;
        aq4 aq4 = this.x;
        switch (i) {
            case b85.b:
                aq4.setValue(Boolean.FALSE);
                return vs7;
            case 1:
                aq4.setValue(Boolean.FALSE);
                return vs7;
            case 2:
                aq4.setValue(Boolean.TRUE);
                return vs7;
            case 3:
                aq4.setValue((Object) null);
                return vs7;
            case 4:
                aq4.setValue(Boolean.FALSE);
                return vs7;
            case 5:
                aq4.setValue((Object) null);
                return vs7;
            case 6:
                aq4.setValue(Boolean.valueOf(!((Boolean) aq4.getValue()).booleanValue()));
                return vs7;
            default:
                return (dy3) aq4.getValue();
        }
    }
}
