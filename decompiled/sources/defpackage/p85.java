package defpackage;

/* renamed from: p85  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class p85 implements p57 {
    public final /* synthetic */ pq6 a;
    public final /* synthetic */ yd7 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ float e;
    public final /* synthetic */ je2 f;
    public final /* synthetic */ float g;

    public /* synthetic */ p85(pq6 pq6, yd7 yd7, boolean z, boolean z2, float f2, je2 je2, float f3) {
        this.a = pq6;
        this.b = yd7;
        this.c = z;
        this.d = z2;
        this.e = f2;
        this.f = je2;
        this.g = f3;
    }

    public final void a(n56 n56) {
        int i;
        long j;
        long j2;
        long j3;
        hl hlVar = this.f;
        float f2 = this.g;
        hl hlVar2 = n56.H;
        hl hlVar3 = n56.I;
        cu7 cu7 = cu7.a;
        if (hlVar2 == cu7) {
            if ((n56.G & 8) != 0) {
                yo4 yo4 = n56.C;
                if (yo4 == null || (hlVar2 = (hl) yo4.b(53)) == null) {
                    hlVar2 = o56.a;
                }
            } else {
                hlVar2 = null;
            }
        }
        if (hlVar3 == cu7) {
            if ((n56.G & 8) != 0) {
                yo4 yo42 = n56.D;
                if (yo42 == null || (hlVar3 = (hl) yo42.b(53)) == null) {
                    hlVar3 = o56.a;
                }
            } else {
                hlVar3 = null;
            }
        }
        if (hlVar2 == null || hlVar3 == null) {
            i = n56.G & -9;
        } else {
            i = n56.G | 8;
        }
        n56.G = i;
        n56.g(53, hlVar2, hlVar3);
        z57 z57 = n56.y;
        if (z57 != null) {
            z57.b |= 8;
            z57.E = this.a;
        }
        yd7 yd7 = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        if (!z) {
            j = yd7.g;
        } else if (z2) {
            j = yd7.h;
        } else {
            j = yd7.f;
        }
        long j4 = yd7.o;
        long j5 = yd7.n;
        n56.a(j);
        if (!z) {
            j2 = j5;
        } else if (z2) {
            j2 = j4;
        } else {
            j2 = yd7.m;
        }
        i75.b(n56, this.e, j2);
        y57 y57 = n56.x;
        y57.getClass();
        if ((y57.U.c.d() & 4) != 0) {
            hl hlVar4 = n56.H;
            hlVar = n56.I;
            try {
                if (!z) {
                    j3 = yd7.g;
                } else if (z2) {
                    j3 = yd7.h;
                } else {
                    j3 = yd7.e;
                }
                n56.a(j3);
                if (!z) {
                    j4 = j5;
                } else if (!z2) {
                    j4 = yd7.l;
                }
                i75.b(n56, f2, j4);
                n56.H = hlVar4;
                n56.I = hlVar;
            } finally {
                n56.H = hlVar4;
                n56.I = hlVar;
            }
        }
    }
}
