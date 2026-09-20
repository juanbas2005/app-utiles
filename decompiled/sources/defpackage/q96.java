package defpackage;

/* renamed from: q96  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class q96 {
    public static final o96 a;

    static {
        lf5 lf5 = new lf5(50.0f);
        a = new o96(lf5, lf5, lf5, lf5);
    }

    public static final o96 a(float f) {
        mx1 mx1 = new mx1(f);
        return new o96(mx1, mx1, mx1, mx1);
    }

    public static o96 b(float f, float f2) {
        return new o96(new mx1(f), new mx1(f2), new mx1(0.0f), new mx1(0.0f));
    }
}
