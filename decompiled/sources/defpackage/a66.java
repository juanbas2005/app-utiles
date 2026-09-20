package defpackage;

import java.io.Closeable;

/* renamed from: a66  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a66 implements Closeable {
    public final jy2 A;
    public final bz2 B;
    public final d66 C;
    public final dy6 D;
    public final a66 E;
    public final a66 F;
    public final a66 G;
    public final long H;
    public final long I;
    public final u72 J;
    public final dl7 K;
    public ah0 L;
    public final boolean M;
    public final kd6 w;
    public final gu5 x;
    public final String y;
    public final int z;

    public a66(kd6 kd6, gu5 gu5, String str, int i, jy2 jy2, bz2 bz2, d66 d66, dy6 dy6, a66 a66, a66 a662, a66 a663, long j, long j2, u72 u72, dl7 dl7) {
        kd6.getClass();
        gu5.getClass();
        str.getClass();
        d66.getClass();
        dl7.getClass();
        this.w = kd6;
        this.x = gu5;
        this.y = str;
        this.z = i;
        this.A = jy2;
        this.B = bz2;
        this.C = d66;
        this.D = dy6;
        this.E = a66;
        this.F = a662;
        this.G = a663;
        this.H = j;
        this.I = j2;
        this.J = u72;
        this.K = dl7;
        boolean z2 = false;
        if (200 <= i && i < 300) {
            z2 = true;
        }
        this.M = z2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, z56] */
    public final z56 a() {
        ? obj = new Object();
        obj.c = -1;
        obj.g = d66.w;
        obj.o = dl7.l;
        obj.a = this.w;
        obj.b = this.x;
        obj.c = this.z;
        obj.d = this.y;
        obj.e = this.A;
        obj.f = this.B.k();
        obj.g = this.C;
        obj.h = this.D;
        obj.i = this.E;
        obj.j = this.F;
        obj.k = this.G;
        obj.l = this.H;
        obj.m = this.I;
        obj.n = this.J;
        obj.o = this.K;
        return obj;
    }

    public final void close() {
        this.C.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.x + ", code=" + this.z + ", message=" + this.y + ", url=" + ((g73) this.w.x) + '}';
    }
}
