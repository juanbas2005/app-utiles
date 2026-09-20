package defpackage;

/* renamed from: ru6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ru6 {
    public static final x17 a = kl8.M(0.0f, 0.0f, (Object) null, 7);

    public static final a37 a(long j, hl hlVar, String str, yt2 yt2, int i, int i2) {
        if ((i2 & 2) != 0) {
            hlVar = a;
        }
        hl hlVar2 = hlVar;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        boolean g = yt2.g(jt0.f(j));
        Object Q = yt2.Q();
        if (g || Q == ay0.a) {
            lo7 lo7 = new lo7(ce.M, new pb(7, jt0.f(j)));
            yt2.o0(lo7);
            Q = lo7;
        }
        return vj.c(new jt0(j), (lo7) Q, hlVar2, (Float) null, str2, yt2, (i << 6) & 57344, 8);
    }
}
