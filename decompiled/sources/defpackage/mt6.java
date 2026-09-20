package defpackage;

/* renamed from: mt6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mt6 implements pd5 {
    public final ph6 a;
    public final String b;

    public mt6(ph6 ph6, String str) {
        this.a = ph6;
        this.b = str;
    }

    public final Object a(d71 d71, CharSequence charSequence, int i) {
        charSequence.getClass();
        if (i >= charSequence.length()) {
            return Integer.valueOf(i);
        }
        char charAt = charSequence.charAt(i);
        ph6 ph6 = this.a;
        if (charAt == '-') {
            ph6.H(d71, Boolean.TRUE);
            return Integer.valueOf(i + 1);
        } else if (charAt != '+') {
            return new ld5(i, new lt6(this, charAt));
        } else {
            ph6.H(d71, Boolean.FALSE);
            return Integer.valueOf(i + 1);
        }
    }

    public final String toString() {
        return this.b;
    }
}
