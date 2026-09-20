package defpackage;

/* renamed from: ga6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ga6 implements fa6 {
    public static final ga6 a = new Object();

    public final ml4 b(ml4 ml4, float f, boolean z) {
        if (((double) f) <= 0.0d) {
            wb3.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return ml4.d(new lz3(f, z));
    }
}
