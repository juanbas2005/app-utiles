package defpackage;

import java.util.ArrayList;

/* renamed from: gn0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class gn0 implements mt2 {
    public final e81 w;
    public final int x;
    public final vc0 y;

    public gn0(e81 e81, int i, vc0 vc0) {
        this.w = e81;
        this.x = i;
        this.y = vc0;
    }

    public Object a(fi2 fi2, f61 f61) {
        Object L = gl0.L(new p0((Object) fi2, (Object) this, (f61) null, 13), f61);
        if (L == p81.w) {
            return L;
        }
        return vs7.a;
    }

    public final di2 b(e81 e81, int i, vc0 vc0) {
        e81 e812 = this.w;
        e81 X = e81.X(e812);
        vc0 vc02 = vc0.w;
        vc0 vc03 = this.y;
        int i2 = this.x;
        if (vc0 == vc02) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            vc0 = vc03;
        }
        if (sg3.e(X, e812) && i == i2 && vc0 == vc03) {
            return this;
        }
        return f(X, i, vc0);
    }

    public String d() {
        return null;
    }

    public abstract Object e(op5 op5, f61 f61);

    public abstract gn0 f(e81 e81, int i, vc0 vc0);

    public di2 g() {
        return null;
    }

    public en0 h(o81 o81) {
        int i = this.x;
        if (i == -3) {
            i = -2;
        }
        n0 n0Var = new n0(this, (f61) null, 14);
        op5 op5 = new op5(su0.I(o81, this.w), rj1.c(i, 4, this.y));
        op5.x0(r81.y, op5, n0Var);
        return op5;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String d = d();
        if (d != null) {
            arrayList.add(d);
        }
        x32 x32 = x32.w;
        e81 e81 = this.w;
        if (e81 != x32) {
            arrayList.add("context=" + e81);
        }
        int i = this.x;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        vc0 vc0 = vc0.w;
        vc0 vc02 = this.y;
        if (vc02 != vc0) {
            arrayList.add("onBufferOverflow=" + vc02);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return hl6.o(sb, dt0.E0(arrayList, ", ", (String) null, (String) null, (vr2) null, 62), ']');
    }
}
