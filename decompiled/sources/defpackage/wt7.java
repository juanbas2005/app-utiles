package defpackage;

/* renamed from: wt7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wt7 extends x15 {
    public final Integer c;
    public final Integer d;
    public final bt e;
    public final boolean f;

    /* JADX WARNING: type inference failed for: r2v1, types: [re3, pe3] */
    /* JADX WARNING: Illegal instructions before constructor call */
    public wt7(Integer num, Integer num2, bt btVar, String str, boolean z) {
        super(r0, str);
        Integer num3;
        if (num.equals(num2)) {
            num3 = num;
        } else {
            num3 = null;
        }
        this.c = num;
        this.d = num2;
        this.e = btVar;
        this.f = z;
        if (num3 != null && !new pe3(1, 9, 1).f(num3.intValue())) {
            ku4.y("Invalid length for field ", str, ": ", num3);
            throw null;
        }
    }

    public final y15 a(Object obj, CharSequence charSequence, int i, int i2) {
        Integer valueOf;
        charSequence.getClass();
        Integer num = this.d;
        if (num != null && i2 - i > num.intValue()) {
            return new bc4(num.intValue(), 5);
        }
        Integer num2 = this.c;
        if (num2 != null && i2 - i < num2.intValue()) {
            return new bc4(num2.intValue(), 4);
        }
        int i3 = 0;
        while (true) {
            if (i >= i2) {
                valueOf = Integer.valueOf(i3);
                break;
            }
            i3 = (i3 * 10) + (charSequence.charAt(i) - '0');
            if (i3 < 0) {
                valueOf = null;
                break;
            }
            i++;
        }
        if (valueOf == null) {
            return td0.I;
        }
        boolean z = this.f;
        int intValue = valueOf.intValue();
        if (z) {
            intValue = -intValue;
        }
        Object v = this.e.v(obj, Integer.valueOf(intValue));
        if (v == null) {
            return null;
        }
        return new a20(v);
    }
}
