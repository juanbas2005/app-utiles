package defpackage;

/* renamed from: y60  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class y60 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ fg7 x;

    public /* synthetic */ y60(fg7 fg7, int i) {
        this.w = i;
        this.x = fg7;
    }

    public final Object b() {
        vl vlVar;
        ag7 ag7;
        int i = this.w;
        boolean z = false;
        fg7 fg7 = this.x;
        switch (i) {
            case b85.b:
                if (fg7 != null) {
                    z = ((Boolean) new y60(fg7, 2).b()).booleanValue();
                }
                return Boolean.valueOf(z);
            case 1:
                if (fg7 != null) {
                    z = ((Boolean) new y60(fg7, 2).b()).booleanValue();
                }
                return Boolean.valueOf(z);
            default:
                vl vlVar2 = fg7.b;
                bg7 bg7 = (bg7) fg7.a.getValue();
                if (bg7 == null || (ag7 = bg7.a) == null) {
                    vlVar = null;
                } else {
                    vlVar = ag7.a;
                }
                return Boolean.valueOf(sg3.e(vlVar2, vlVar));
        }
    }
}
