package defpackage;

/* renamed from: fo3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fo3 extends h49 {
    public final String C;
    public final String D;

    public fo3(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.C = str;
        this.D = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo3)) {
            return false;
        }
        fo3 fo3 = (fo3) obj;
        if (sg3.e(this.C, fo3.C) && sg3.e(this.D, fo3.D)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.D.hashCode() + (this.C.hashCode() * 31);
    }

    public final String toString() {
        return this.C + ':' + this.D;
    }
}
