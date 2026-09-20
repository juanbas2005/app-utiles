package defpackage;

/* renamed from: po1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class po1 {
    public final av6 a;
    public final wf6 b;
    public final cm7 c;
    public final qm5 d;

    public po1(av6 av6, wf6 wf6, cm7 cm7, qm5 qm5) {
        this.a = av6;
        this.b = wf6;
        this.c = cm7;
        this.d = qm5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po1)) {
            return false;
        }
        po1 po1 = (po1) obj;
        if (!sg3.e(this.a, po1.a) || this.b != po1.b || !sg3.e(this.c, po1.c) || this.d != po1.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        av6 av6 = this.a;
        if (av6 != null) {
            i = av6.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        wf6 wf6 = this.b;
        if (wf6 != null) {
            i2 = wf6.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 28629151;
        cm7 cm7 = this.c;
        if (cm7 != null) {
            i3 = cm7.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        qm5 qm5 = this.d;
        if (qm5 != null) {
            i4 = qm5.hashCode();
        }
        return (i7 + i4) * 887503681;
    }
}
