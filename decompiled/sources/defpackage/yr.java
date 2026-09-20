package defpackage;

/* renamed from: yr  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yr implements CharSequence {
    public final char[] w;
    public int x;

    public yr(char[] cArr) {
        this.w = cArr;
        this.x = cArr.length;
    }

    public final char charAt(int i) {
        return this.w[i];
    }

    public final int length() {
        return this.x;
    }

    public final CharSequence subSequence(int i, int i2) {
        return k57.j0(this.w, i, Math.min(i2, this.x));
    }

    public final String toString() {
        int i = this.x;
        return k57.j0(this.w, 0, Math.min(i, i));
    }
}
