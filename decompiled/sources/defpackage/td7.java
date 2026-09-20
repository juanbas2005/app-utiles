package defpackage;

import java.util.List;

/* renamed from: td7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class td7 {
    public final vl a;
    public final tg7 b;
    public final int c = Integer.MAX_VALUE;
    public final int d = 1;
    public final boolean e;
    public final int f;
    public final tp1 g;
    public final dl2 h;
    public final List i;
    public o9 j;
    public ey3 k;

    public td7(vl vlVar, tg7 tg7, boolean z, tp1 tp1, dl2 dl2, int i2) {
        this.a = vlVar;
        this.b = tg7;
        this.e = z;
        this.f = 1;
        this.g = tp1;
        this.h = dl2;
        this.i = a42.w;
    }

    public final void a(ey3 ey3) {
        o9 o9Var = this.j;
        if (o9Var == null || ey3 != this.k || o9Var.b()) {
            this.k = ey3;
            o9Var = new o9(this.a, aa5.k(this.b, ey3), this.i, this.g, this.h);
        }
        this.j = o9Var;
    }
}
