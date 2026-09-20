package defpackage;

/* renamed from: qj5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qj5 {
    public static final qj5 c = new qj5(0, false);
    public final boolean a;
    public final int b;

    public qj5() {
        this.a = false;
        this.b = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.qj5) r5;
     */
    public final boolean equals(Object obj) {
        qj5 qj5;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof qj5) && this.a == qj5.a && this.b == qj5.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        String a2 = k32.a(this.b);
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + a2 + ")";
    }

    public qj5(int i, boolean z) {
        this.a = z;
        this.b = i;
    }
}
