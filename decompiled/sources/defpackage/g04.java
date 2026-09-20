package defpackage;

/* renamed from: g04  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g04 {
    public final /* synthetic */ int a;
    public final bd5 b;
    public final bd5 c;
    public boolean d;
    public Object e;
    public final l24 f;

    public g04(int i, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = new bd5(i);
                this.c = new bd5(i2);
                this.f = new l24(i, 30, 100);
                return;
            default:
                this.b = new bd5(i);
                this.c = new bd5(i2);
                this.f = new l24(i, 90, 200);
                return;
        }
    }

    public final void a(int i, int i2) {
        int i3 = this.a;
        bd5 bd5 = this.c;
        l24 l24 = this.f;
        bd5 bd52 = this.b;
        switch (i3) {
            case b85.b:
                if (((float) i) < 0.0f) {
                    bc3.a("Index should be non-negative");
                }
                bd52.e(i);
                l24.b(i);
                bd5.e(i2);
                return;
            default:
                if (((float) i) < 0.0f) {
                    bc3.a("Index should be non-negative (" + i + ")");
                }
                bd52.e(i);
                l24.b(i);
                bd5.e(i2);
                return;
        }
    }
}
