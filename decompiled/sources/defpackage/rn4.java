package defpackage;

import java.util.List;

/* renamed from: rn4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rn4 {
    public vl a;
    public dl2 b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public List g;
    public yk4 h;
    public long i = ec3.a;
    public tp1 j;
    public tg7 k;
    public o9 l;
    public ey3 m;
    public bg7 n;
    public int o;
    public int p;
    public long q;

    public rn4(vl vlVar, tg7 tg7, dl2 dl2, int i2, boolean z, int i3, int i4, List list) {
        this.a = vlVar;
        this.b = dl2;
        this.c = i2;
        this.d = z;
        this.e = i3;
        this.f = i4;
        this.g = list;
        this.k = tg7;
        this.o = -1;
        this.p = -1;
    }

    public final int a(int i2, ey3 ey3) {
        int i3 = this.o;
        int i4 = this.p;
        if (i2 == i3 && i3 != -1) {
            return i4;
        }
        long a2 = m31.a(0, i2, 0, Integer.MAX_VALUE);
        if (this.f > 1) {
            yk4 yk4 = this.h;
            tg7 tg7 = this.k;
            tp1 tp1 = this.j;
            tp1.getClass();
            yk4 U = mp7.U(yk4, ey3, tg7, tp1, this.b);
            this.h = U;
            a2 = U.a(a2, this.f);
        }
        int f2 = l55.f(b(a2, ey3).e);
        int i5 = k31.i(a2);
        if (f2 < i5) {
            f2 = i5;
        }
        this.o = i2;
        this.p = f2;
        return f2;
    }

    public final pn4 b(long j2, ey3 ey3) {
        int i2;
        o9 e2 = e(ey3);
        long R = gl0.R(j2, this.d, this.c, e2.e());
        boolean z = this.d;
        int i3 = this.c;
        int i4 = this.e;
        if ((z || !(i3 == 2 || i3 == 4 || i3 == 5)) && i4 >= 1) {
            i2 = i4;
        } else {
            i2 = 1;
        }
        return new pn4(e2, R, i2, i3);
    }

    public final boolean c(long j2, ey3 ey3) {
        this.q = (this.q << 2) | 3;
        if (this.f > 1) {
            yk4 yk4 = this.h;
            tg7 tg7 = this.k;
            tp1 tp1 = this.j;
            tp1.getClass();
            yk4 U = mp7.U(yk4, ey3, tg7, tp1, this.b);
            this.h = U;
            j2 = U.a(j2, this.f);
        }
        bg7 bg7 = this.n;
        if (bg7 != null) {
            pn4 pn4 = bg7.b;
            ag7 ag7 = bg7.a;
            if (!pn4.a.b()) {
                ey3 ey32 = ag7.h;
                long j3 = ag7.j;
                if (ey3 == ey32 && (k31.b(j2, j3) || (k31.h(j2) == k31.h(j3) && k31.j(j2) == k31.j(j3) && ((float) k31.g(j2)) >= pn4.e && !pn4.c))) {
                    bg7 bg72 = this.n;
                    bg72.getClass();
                    if (k31.b(j2, bg72.a.j)) {
                        return false;
                    }
                    bg7 bg73 = this.n;
                    bg73.getClass();
                    this.n = f(ey3, j2, bg73.b);
                    return true;
                }
            }
        }
        this.n = f(ey3, j2, b(j2, ey3));
        return true;
    }

    public final void d(tp1 tp1) {
        long j2;
        tp1 tp12 = this.j;
        if (tp1 != null) {
            int i2 = ec3.b;
            j2 = ec3.a(tp1.b(), tp1.Y());
        } else {
            j2 = ec3.a;
        }
        if (tp12 == null) {
            this.j = tp1;
            this.i = j2;
        } else if (tp1 == null || this.i != j2) {
            this.j = tp1;
            this.i = j2;
            this.q = (this.q << 2) | 1;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.o = -1;
        }
    }

    public final o9 e(ey3 ey3) {
        o9 o9Var = this.l;
        if (o9Var == null || ey3 != this.m || o9Var.b()) {
            this.m = ey3;
            vl vlVar = this.a;
            tg7 k2 = aa5.k(this.k, ey3);
            tp1 tp1 = this.j;
            tp1.getClass();
            dl2 dl2 = this.b;
            List list = this.g;
            if (list == null) {
                list = a42.w;
            }
            o9Var = new o9(vlVar, k2, list, tp1, dl2);
        }
        this.l = o9Var;
        return o9Var;
    }

    public final bg7 f(ey3 ey3, long j2, pn4 pn4) {
        pn4 pn42 = pn4;
        float min = Math.min(pn42.a.e(), pn42.d);
        vl vlVar = this.a;
        tg7 tg7 = this.k;
        List list = this.g;
        if (list == null) {
            list = a42.w;
        }
        int i2 = this.e;
        boolean z = this.d;
        int i3 = this.c;
        tp1 tp1 = this.j;
        tp1.getClass();
        long j3 = j2;
        return new bg7(new ag7(vlVar, tg7, list, i2, z, i3, tp1, ey3, this.b, j3), pn42, m31.d(j3, (((long) l55.f(min)) << 32) | (((long) l55.f(pn42.e)) & 4294967295L)));
    }

    public final String toString() {
        String str;
        Object obj = "null";
        if (this.n != null) {
            str = "<TextLayoutResult>";
        } else {
            str = obj;
        }
        String b2 = ec3.b(this.i);
        long j2 = this.q;
        bg7 bg7 = this.n;
        Object obj2 = obj;
        if (bg7 != null) {
            ag7 ag7 = bg7.a;
            obj2 = obj;
            if (ag7 != null) {
                obj2 = new k31(ag7.j);
            }
        }
        StringBuilder o2 = f21.o("MultiParagraphLayoutCache(textLayoutResult=", str, ", lastDensity=", b2, ", history=");
        o2.append(j2);
        o2.append(", constraints=");
        o2.append(obj2);
        o2.append(")");
        return o2.toString();
    }
}
