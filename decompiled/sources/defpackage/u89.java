package defpackage;

/* renamed from: u89  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u89 {
    public final v89 a;
    public int b = 1;
    public long c = a();

    public u89(v89 v89) {
        this.a = v89;
    }

    public final long a() {
        v89 v89 = this.a;
        z65.k(v89);
        long longValue = ((Long) by8.v.a((Object) null)).longValue();
        long longValue2 = ((Long) by8.w.a((Object) null)).longValue();
        for (int i = 1; i < this.b; i++) {
            longValue += longValue;
            if (longValue >= longValue2) {
                break;
            }
        }
        v89.Q().getClass();
        return Math.min(longValue, longValue2) + System.currentTimeMillis();
    }
}
