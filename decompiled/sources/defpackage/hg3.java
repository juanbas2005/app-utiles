package defpackage;

/* renamed from: hg3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hg3 {
    public final int a;
    public final int b;
    public final d24 c;

    public hg3(int i, int i2, d24 d24) {
        this.a = i;
        this.b = i2;
        this.c = d24;
        if (i < 0) {
            bc3.a("startIndex should be >= 0");
        }
        if (i2 <= 0) {
            bc3.a("size should be > 0");
        }
    }
}
