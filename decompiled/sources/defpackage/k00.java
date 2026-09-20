package defpackage;

/* renamed from: k00  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k00 extends oa1 {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public k00(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        r5 = (defpackage.k00) ((defpackage.oa1) r5);
     */
    public final boolean equals(Object obj) {
        k00 k00;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oa1) || this.a != k00.a || !this.b.equals(k00.b) || !this.c.equals(k00.c) || this.d != k00.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        if (this.d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return i ^ hashCode;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.a + ", version=" + this.b + ", buildVersion=" + this.c + ", jailbroken=" + this.d + "}";
    }
}
