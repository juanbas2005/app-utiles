package defpackage;

/* renamed from: e34  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e34 implements c24 {
    public final s34 a;

    public e34(s34 s34) {
        this.a = s34;
    }

    public final int a() {
        return this.a.j().n;
    }

    public final int b() {
        return Math.min(a() - 1, ((n34) dt0.G0(this.a.j().k)).a);
    }

    public final int c() {
        long i;
        int i2;
        s34 s34 = this.a;
        if (s34.j().k.isEmpty()) {
            return 0;
        }
        m34 j = s34.j();
        if (j.o == z75.w) {
            i = j.i() & 4294967295L;
        } else {
            i = j.i() >> 32;
        }
        int i3 = (int) i;
        int P = kl8.P(s34.j());
        if (P != 0 && (i2 = i3 / P) >= 1) {
            return i2;
        }
        return 1;
    }

    public final boolean d() {
        return !this.a.j().k.isEmpty();
    }

    public final int e() {
        return Math.max(0, this.a.h());
    }
}
