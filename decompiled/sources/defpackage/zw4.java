package defpackage;

/* renamed from: zw4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class zw4 {
    public static final g80 a = xb4.M;

    public static String a(k98 k98) {
        km5 km5 = k98.b;
        bc8 bc8 = k98.a;
        if (km5.a) {
            return "NavigationBar";
        }
        int i = bc8.c;
        if (lx1.b((float) bc8.b, 0.0f) || lx1.b((float) bc8.a, 0.0f)) {
            return "NavigationBar";
        }
        return "NavigationRail";
    }
}
