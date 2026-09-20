package defpackage;

/* renamed from: fx1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fx1 {
    public final vo4 a;
    public final vo4 b;

    static {
        Float valueOf = Float.valueOf(0.0f);
        yb5 yb5 = new yb5(valueOf, valueOf);
        Float valueOf2 = Float.valueOf(0.5f);
        new fx1(yb5, new yb5(valueOf2, valueOf2));
    }

    public fx1(yb5... yb5Arr) {
        this.a = new vo4(yb5Arr.length);
        this.b = new vo4(yb5Arr.length);
        int length = yb5Arr.length;
        int i = 0;
        while (true) {
            vo4 vo4 = this.a;
            if (i < length) {
                vo4.a(((Number) yb5Arr[i].w).floatValue());
                this.b.a(((Number) yb5Arr[i].x).floatValue());
                i++;
            } else {
                ar7.d0(vo4);
                ar7.d0(this.b);
                return;
            }
        }
    }
}
