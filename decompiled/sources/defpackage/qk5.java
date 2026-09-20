package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: qk5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qk5 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final float k;
    public final long l;
    public final ArrayList m;
    public final long n;
    public boolean o;
    public boolean p;
    public qk5 q;

    public qk5(long j2, long j3, long j4, boolean z, float f2, long j5, long j6, boolean z2, boolean z3, int i2, long j7, float f3, long j8) {
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = z;
        this.e = f2;
        this.f = j5;
        this.g = j6;
        this.h = z2;
        this.i = i2;
        this.j = j7;
        this.k = f3;
        this.l = j8;
        this.n = 0;
        this.o = z3;
        this.p = z3;
    }

    public final void a() {
        qk5 qk5 = this.q;
        if (qk5 == null) {
            this.o = true;
            this.p = true;
        } else if (qk5 != null) {
            qk5.a();
        }
    }

    public final List b() {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            return a42.w;
        }
        return arrayList;
    }

    public final boolean c() {
        qk5 qk5 = this.q;
        if (qk5 != null) {
            return qk5.c();
        }
        if (this.o || this.p) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String n2 = a35.n(this.a);
        String g2 = l35.g(this.c);
        String g3 = l35.g(this.g);
        boolean c2 = c();
        String a2 = wk5.a(this.i);
        List b2 = b();
        String g4 = l35.g(this.j);
        String g5 = l35.g(this.l);
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append(n2);
        sb.append(", uptimeMillis=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append(g2);
        sb.append(", pressed=");
        sb.append(this.d);
        sb.append(", pressure=");
        sb.append(this.e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f);
        sb.append(", previousPosition=");
        sb.append(g3);
        sb.append(", previousPressed=");
        sb.append(this.h);
        sb.append(", isConsumed=");
        sb.append(c2);
        sb.append(", type=");
        sb.append(a2);
        sb.append(", historical=");
        sb.append(b2);
        sb.append(", scrollDelta=");
        sb.append(g4);
        sb.append(", scaleFactor=");
        sb.append(this.k);
        return f21.m(sb, ", panOffset=", g5, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public qk5(long j2, long j3, long j4, boolean z, float f2, long j5, long j6, boolean z2, int i2, ArrayList arrayList, long j7, float f3, long j8, long j9) {
        this(j2, j3, j4, z, f2, j5, j6, z2, false, i2, j7, f3, j8);
        this.m = arrayList;
        this.n = j9;
    }
}
