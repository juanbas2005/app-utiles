package defpackage;

/* renamed from: wq5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wq5 implements sr2 {
    public final /* synthetic */ int w;
    public final String x;

    public /* synthetic */ wq5(String str, int i) {
        this.w = i;
        this.x = str;
    }

    public final Object b() {
        int i = this.w;
        String str = null;
        String str2 = this.x;
        switch (i) {
            case b85.b:
                return new wl7(k26.b(yq5.e, str2), jo3.X);
            case 1:
                return new wl7(k26.b(yq5.g, str2), jo3.Y);
            case 2:
                String o = hl6.o(new StringBuilder(), n27.m.a.a, '.');
                if (k57.u0(str2, o, false)) {
                    str = o;
                }
                if (str == null) {
                    return "";
                }
                return str;
            default:
                String o2 = hl6.o(new StringBuilder(), n27.k.a.a, '.');
                if (k57.u0(str2, o2, false)) {
                    str = o2;
                }
                if (str == null) {
                    return "";
                }
                return str;
        }
    }
}
