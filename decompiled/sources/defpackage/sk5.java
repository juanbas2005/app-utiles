package defpackage;

import java.util.ArrayList;

/* renamed from: sk5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sk5 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    public sk5(long j2, long j3, long j4, long j5, boolean z, float f2, int i2, boolean z2, ArrayList arrayList, long j6, float f3, long j7, long j8) {
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = j5;
        this.e = z;
        this.f = f2;
        this.g = i2;
        this.h = z2;
        this.i = arrayList;
        this.j = j6;
        this.k = f3;
        this.l = j7;
        this.m = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk5)) {
            return false;
        }
        sk5 sk5 = (sk5) obj;
        if (a35.i(this.a, sk5.a) && this.b == sk5.b && l35.b(this.c, sk5.c) && l35.b(this.d, sk5.d) && this.e == sk5.e && Float.compare(this.f, sk5.f) == 0 && this.g == sk5.g && this.h == sk5.h && this.i.equals(sk5.i) && l35.b(this.j, sk5.j) && Float.compare(this.k, sk5.k) == 0 && l35.b(this.l, sk5.l) && l35.b(this.m, sk5.m)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + pb4.b(f21.d(this.k, pb4.b((this.i.hashCode() + hl6.i(f21.e(this.g, f21.d(this.f, hl6.i(pb4.b(pb4.b(pb4.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h)) * 31, 31, this.j), 31), 31, this.l);
    }

    public final String toString() {
        String n = a35.n(this.a);
        String g2 = l35.g(this.c);
        String g3 = l35.g(this.d);
        String a2 = wk5.a(this.g);
        String g4 = l35.g(this.j);
        String g5 = l35.g(this.l);
        String g6 = l35.g(this.m);
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append(n);
        sb.append(", uptime=");
        sb.append(this.b);
        f21.v(sb, ", positionOnScreen=", g2, ", position=", g3);
        sb.append(", down=");
        sb.append(this.e);
        sb.append(", pressure=");
        sb.append(this.f);
        sb.append(", type=");
        sb.append(a2);
        sb.append(", activeHover=");
        sb.append(this.h);
        sb.append(", historical=");
        sb.append(this.i);
        sb.append(", scrollDelta=");
        sb.append(g4);
        sb.append(", scaleGestureFactor=");
        sb.append(this.k);
        sb.append(", panGestureOffset=");
        sb.append(g5);
        return f21.m(sb, ", originalEventPosition=", g6, ")");
    }
}
