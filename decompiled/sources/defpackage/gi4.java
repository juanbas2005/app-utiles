package defpackage;

/* renamed from: gi4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gi4 extends hi4 {
    public static final gi4 d = new gi4("must be a member function", 0);
    public static final gi4 e = new gi4("must be a member or an extension function", 1);
    public final /* synthetic */ int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gi4(String str, int i) {
        super(str, 0);
        this.c = i;
    }

    public final boolean b(lj3 lj3) {
        switch (this.c) {
            case b85.b:
                if (lj3.F != null) {
                    return true;
                }
                return false;
            default:
                if (lj3.F == null && lj3.E == null) {
                    return false;
                }
                return true;
        }
    }
}
