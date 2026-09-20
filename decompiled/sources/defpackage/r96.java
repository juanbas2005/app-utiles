package defpackage;

/* renamed from: r96  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r96 extends h49 {
    public final void A(dr6 dr6, float f, float f2) {
        float f3 = f2 * f;
        dr6.d(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        zq6 zq6 = new zq6(0.0f, 0.0f, f4, f4);
        zq6.f = 180.0f;
        zq6.g = 90.0f;
        dr6.f.add(zq6);
        xq6 xq6 = new xq6(zq6);
        dr6.a(180.0f);
        dr6.g.add(xq6);
        dr6.d = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        dr6.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        dr6.c = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
