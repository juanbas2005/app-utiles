package defpackage;

/* renamed from: e28  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e28 extends hi4 {
    public final /* synthetic */ int c = 1;
    public final int d;

    /* JADX WARNING: Illegal instructions before constructor call */
    public e28(int i) {
        super(r0.toString(), 1);
        String str;
        StringBuilder o = pb4.o(i, "must have at least ", " value parameter");
        if (i > 1) {
            str = "s";
        } else {
            str = "";
        }
        o.append(str);
        this.d = i;
    }

    public final boolean b(lj3 lj3) {
        int i = this.c;
        int i2 = this.d;
        switch (i) {
            case b85.b:
                if (lj3.S().size() >= i2) {
                    return true;
                }
                return false;
            default:
                if (lj3.S().size() == i2) {
                    return true;
                }
                return false;
        }
    }

    public e28() {
        super("must have exactly 2 value parameters", 1);
        this.d = 2;
    }
}
