package defpackage;

/* renamed from: c93  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c93 {
    public static final c93 g = new c93(false, 0, true, 1, 1, ya4.y);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final ya4 f;

    public c93(boolean z, int i, boolean z2, int i2, int i3, ya4 ya4) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = ya4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = (defpackage.c93) r3;
     */
    public final boolean equals(Object obj) {
        c93 c93;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c93) && this.a == c93.a && this.b == c93.b && this.c == c93.c && this.d == c93.d && this.e == c93.e && sg3.e(this.f, c93.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.w.hashCode() + f21.e(this.e, f21.e(this.d, hl6.i(f21.e(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        String a2 = at3.a(this.b);
        String a3 = ct3.a(this.d);
        String a4 = b93.a(this.e);
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + a2 + ", autoCorrect=" + this.c + ", keyboardType=" + a3 + ", imeAction=" + a4 + ", platformImeOptions=null, hintLocales=" + this.f + ")";
    }
}
