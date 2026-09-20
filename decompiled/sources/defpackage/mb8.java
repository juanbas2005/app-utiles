package defpackage;

/* renamed from: mb8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mb8 {
    public static final ic3[] b;
    public static final yo4 c;
    public static final yo4 d;
    public static final yo4 e;
    public final ob8 a;

    static {
        ic3[] ic3Arr = new ic3[4];
        for (int i = 0; i < 4; i++) {
            ic3Arr[i] = new ic3((String) null);
        }
        b = ic3Arr;
        yo4 yo4 = new yo4(8);
        yo4.i(1, new ic3("status bars source"));
        yo4.i(2, new ic3("navigation bars source"));
        yo4.i(4, new ic3("caption bar source"));
        yo4.i(8, new ic3("IME source"));
        yo4.i(16, new ic3("system gestures source"));
        yo4.i(32, new ic3("mandatory system gestures source"));
        yo4.i(64, new ic3("tappable element source"));
        yo4.i(128, new ic3("display cutout source"));
        c = yo4;
        yo4 yo42 = new yo4(8);
        yo42.i(1, new ic3("status bars target"));
        yo42.i(2, new ic3("navigation bars target"));
        yo42.i(4, new ic3("caption bar target"));
        yo42.i(8, new ic3("IME target"));
        yo42.i(16, new ic3("system gestures target"));
        yo42.i(32, new ic3("mandatory system gestures target"));
        yo42.i(64, new ic3("tappable element target"));
        yo42.i(128, new ic3("display cutout target"));
        d = yo42;
        yo4 yo43 = new yo4(8);
        kb8.a.getClass();
        yo43.i(1, jb8.g);
        yo43.i(2, jb8.f);
        yo43.i(4, jb8.b);
        yo43.i(8, jb8.d);
        yo43.i(16, jb8.h);
        yo43.i(32, jb8.e);
        yo43.i(64, jb8.i);
        yo43.i(128, jb8.c);
        e = yo43;
    }

    public mb8(ob8 ob8) {
        this.a = ob8;
        ne3.a();
    }

    public static boolean a(k23 k23, ic3 ic3) {
        if (k23 == ic3.b() || k23 == ic3.d() || k23 == ic3.c() || k23 == ic3.a()) {
            return true;
        }
        return false;
    }

    public static void b(yc4 yc4, ic3 ic3, ad3 ad3) {
        long k = yc4.a().k();
        yc4.c(ic3.b(), (float) ad3.a);
        yc4.c(ic3.d(), (float) ad3.b);
        yc4.c(ic3.c(), (float) (((int) (k >> 32)) - ad3.c));
        yc4.c(ic3.a(), (float) (((int) (k & 4294967295L)) - ad3.d));
    }
}
