package defpackage;

/* renamed from: cq4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cq4 {
    public final ef3 a;
    public final ay6 b = new ay6();
    public final bd5 c = new bd5(16);

    public cq4(ef3 ef3) {
        this.a = ef3;
    }

    public final void a(boolean z) {
        int i;
        bd5 bd5 = this.c;
        int d = bd5.d() & -5;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        bd5.e(i | d);
    }

    public final void b(boolean z) {
        int i;
        bd5 bd5 = this.c;
        int d = bd5.d() & -3;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        bd5.e(i | d);
    }

    public final void c(boolean z) {
        bd5 bd5 = this.c;
        bd5.e(z | (bd5.d() & true) ? 1 : 0);
    }
}
