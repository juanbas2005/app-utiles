package defpackage;

/* renamed from: f28  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f28 extends hi4 {
    public static final f28 d = new f28("must have no value parameters", 0);
    public static final f28 e = new f28("must have a single value parameter", 1);
    public final /* synthetic */ int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f28(String str, int i) {
        super(str, 1);
        this.c = i;
    }

    public final boolean b(lj3 lj3) {
        switch (this.c) {
            case b85.b:
                return lj3.S().isEmpty();
            default:
                if (lj3.S().size() == 1) {
                    return true;
                }
                return false;
        }
    }
}
