package defpackage;

/* renamed from: eh5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class eh5 {
    public long A = 0;
    public int w;
    public int x;
    public long y = 0;
    public long z = fh5.a;

    public Object B() {
        return null;
    }

    public abstract int X(kb kbVar);

    public int Z() {
        return (int) (this.y & 4294967295L);
    }

    public int b0() {
        return (int) (this.y >> 32);
    }

    public final void g0() {
        this.w = z65.p((int) (this.y >> 32), k31.j(this.z), k31.h(this.z));
        int p = z65.p((int) (this.y & 4294967295L), k31.i(this.z), k31.g(this.z));
        this.x = p;
        int i = this.w;
        long j = this.y;
        this.A = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((p - ((int) (j & 4294967295L))) / 2)));
    }

    public abstract void h0(long j, float f, vr2 vr2);

    public final void i0(long j) {
        if (!we3.a(this.y, j)) {
            this.y = j;
            g0();
        }
    }

    public final void m0(long j) {
        if (!k31.b(this.z, j)) {
            this.z = j;
            g0();
        }
    }
}
