package defpackage;

import java.util.ArrayDeque;

/* renamed from: uo7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uo7 {
    public final boolean a;
    public final boolean b;
    public final eq7 c;
    public final sg3 d;
    public final uq3 e;
    public int f;
    public ArrayDeque g;
    public wv6 h;

    public uo7(boolean z, boolean z2, boolean z3, eq7 eq7, sg3 sg3, uq3 uq3) {
        eq7.getClass();
        sg3.getClass();
        uq3.getClass();
        this.a = z;
        this.b = z2;
        this.c = eq7;
        this.d = sg3;
        this.e = uq3;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.g;
        arrayDeque.getClass();
        arrayDeque.clear();
        wv6 wv6 = this.h;
        wv6.getClass();
        wv6.clear();
    }

    public final void b() {
        if (this.g == null) {
            this.g = new ArrayDeque(4);
        }
        if (this.h == null) {
            int i = wv6.y;
            this.h = ub5.f();
        }
    }
}
