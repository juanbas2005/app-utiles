package defpackage;

/* renamed from: pg0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pg0 implements og0 {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public pg0(int i, int i2, boolean z, boolean z2, String str) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0065 A[RETURN] */
    public final boolean a(jc6 jc6) {
        int i;
        int i2;
        int i3;
        boolean z = this.d;
        String str = this.e;
        if (z && str == null) {
            str = jc6.o();
        }
        hc6 hc6 = jc6.b;
        if (hc6 != null) {
            i2 = 0;
            i = 0;
            for (lc6 lc6 : hc6.a()) {
                jc6 jc62 = (jc6) lc6;
                if (jc62 == jc6) {
                    i2 = i;
                }
                if (str == null || jc62.o().equals(str)) {
                    i++;
                }
            }
        } else {
            i2 = 0;
            i = 1;
        }
        if (this.c) {
            i3 = i2 + 1;
        } else {
            i3 = i - i2;
        }
        int i4 = this.b;
        int i5 = this.a;
        if (i5 != 0) {
            int i6 = i3 - i4;
            if (!(i6 % i5 == 0 && (Integer.signum(i6) == 0 || Integer.signum(i6) == Integer.signum(i5)))) {
            }
        } else if (i3 == i4) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    public final String toString() {
        String str;
        if (this.c) {
            str = "";
        } else {
            str = "last-";
        }
        int i = this.b;
        boolean z = this.d;
        int i2 = this.a;
        if (z) {
            return String.format("nth-%schild(%dn%+d of type <%s>)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i), this.e});
        }
        return String.format("nth-%schild(%dn%+d)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)});
    }
}
