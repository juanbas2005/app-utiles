package defpackage;

/* renamed from: q52  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q52 {
    public final gq3 a;
    public final vr2 b;
    public final vr2 c;
    public final fw0 d;

    public q52(gq3 gq3, vr2 vr2, vr2 vr22, fw0 fw0) {
        this.a = gq3;
        this.b = vr2;
        this.c = vr22;
        this.d = fw0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q52) {
            q52 q52 = (q52) obj;
            if (sg3.e(this.a, q52.a) && this.b.equals(q52.b) && this.c.equals(q52.c) && this.d == q52.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EntryClassProvider(clazz=" + this.a + ", clazzContentKey=" + this.b + ", metadata=" + this.c + ", content=" + this.d + ')';
    }
}
