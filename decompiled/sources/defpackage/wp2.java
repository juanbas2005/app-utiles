package defpackage;

/* renamed from: wp2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wp2 extends x15 {
    public final int c;
    public final int d;
    public final bt e;

    /* JADX WARNING: Illegal instructions before constructor call */
    public wp2(int i, int i2, zq5 zq5, String str) {
        super(r1, str);
        Integer num;
        zq5.getClass();
        str.getClass();
        if (i == i2) {
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        this.c = i;
        this.d = i2;
        this.e = zq5;
        if (1 > i || i >= 10) {
            throw new IllegalArgumentException(("Invalid minimum length " + i + " for field " + str + ": expected 1..9").toString());
        } else if (i > i2 || i2 >= 10) {
            StringBuilder sb = new StringBuilder("Invalid maximum length ");
            sb.append(i2);
            sb.append(" for field ");
            sb.append(str);
            sb.append(": expected ");
            h.j(hl6.n(sb, i, "..9"));
            throw null;
        }
    }

    public final y15 a(Object obj, CharSequence charSequence, int i, int i2) {
        charSequence.getClass();
        int i3 = i2 - i;
        int i4 = this.c;
        if (i3 < i4) {
            return new bc4(i4, 4);
        }
        int i5 = this.d;
        if (i3 > i5) {
            return new bc4(i5, 5);
        }
        int i6 = 0;
        while (i < i2) {
            i6 = (i6 * 10) + (charSequence.charAt(i) - '0');
            i++;
        }
        Object v = this.e.v(obj, new uj1(i6, i3));
        if (v == null) {
            return null;
        }
        return new a20(v);
    }
}
