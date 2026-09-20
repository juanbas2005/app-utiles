package defpackage;

/* renamed from: zi3  reason: default package */
public final class zi3 implements sr2 {
    public final /* synthetic */ int w;
    public final aj3 x;

    public /* synthetic */ zi3(aj3 aj3, int i) {
        this.w = i;
        this.x = aj3;
    }

    public final Object b() {
        int i = this.w;
        aj3 aj3 = this.x;
        switch (i) {
            case b85.b:
                return rd3.d(aj3, true);
            case 1:
                if (r16.Z(aj3)) {
                    return rd3.d(aj3, false);
                }
                return aj3.a();
            default:
                return ar7.Z(aj3.Q(), aj3);
        }
    }
}
