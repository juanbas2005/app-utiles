package defpackage;

/* renamed from: u05  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u05 extends hp1 {
    public final /* synthetic */ int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u05(fu6 fu6, int i) {
        super(fu6);
        this.y = i;
    }

    public final gp1 A0(fu6 fu6) {
        switch (this.y) {
            case b85.b:
                return new u05(fu6, 0);
            default:
                return new u05(fu6, 1);
        }
    }

    public final boolean Q() {
        switch (this.y) {
            case b85.b:
                return false;
            default:
                return true;
        }
    }
}
