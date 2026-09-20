package defpackage;

/* renamed from: qo3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qo3 extends gw8 {
    public final String t;
    public final String u;

    public qo3(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.t = str;
        this.u = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo3)) {
            return false;
        }
        qo3 qo3 = (qo3) obj;
        if (sg3.e(this.t, qo3.t) && sg3.e(this.u, qo3.u)) {
            return true;
        }
        return false;
    }

    public final String h() {
        return this.t + this.u;
    }

    public final int hashCode() {
        return this.u.hashCode() + (this.t.hashCode() * 31);
    }
}
