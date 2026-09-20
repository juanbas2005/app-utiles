package defpackage;

/* renamed from: qg0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qg0 implements og0 {
    public final /* synthetic */ int a;

    public /* synthetic */ qg0(int i) {
        this.a = i;
    }

    public final boolean a(jc6 jc6) {
        switch (this.a) {
            case b85.b:
                if (!(jc6 instanceof hc6) || ((hc6) jc6).a().size() == 0) {
                    return true;
                }
                return false;
            case 1:
                if (jc6.b == null) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public final String toString() {
        switch (this.a) {
            case b85.b:
                return "empty";
            case 1:
                return "root";
            default:
                return "target";
        }
    }
}
