package defpackage;

/* renamed from: y11  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class y11 {
    public static final yo4 a;

    static {
        t76 t76 = vt0.e;
        int i = t76.c;
        x11 x11 = new x11(t76, t76, 1);
        int i2 = t76.c;
        k45 k45 = vt0.x;
        int i3 = (k45.c << 6) | i2;
        x11 x112 = new x11(t76, k45, 0);
        int i4 = (i2 << 6) | k45.c;
        x11 x113 = new x11(k45, t76, 0);
        yo4 yo4 = ne3.a;
        yo4 yo42 = new yo4();
        yo42.i(i | (i << 6), x11);
        yo42.i(i3, x112);
        yo42.i(i4, x113);
        a = yo42;
    }
}
