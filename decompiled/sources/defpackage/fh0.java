package defpackage;

/* renamed from: fh0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class fh0 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ gh0 x;

    public /* synthetic */ fh0(gh0 gh0, int i) {
        this.w = i;
        this.x = gh0;
    }

    public final Object b() {
        int i = this.w;
        gh0 gh0 = this.x;
        switch (i) {
            case b85.b:
                ah0 ah0 = ah0.n;
                return ed1.x(gh0.f);
            default:
                String f = gh0.f.f("Content-Type");
                if (f == null) {
                    return null;
                }
                k26 k26 = yh4.e;
                try {
                    return ie1.G(f);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
        }
    }
}
