package defpackage;

import java.util.List;

/* renamed from: vz  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vz extends ba1 {
    public final String a;
    public final String b;
    public final List c;
    public final ba1 d;
    public final int e;

    public vz(String str, String str2, List list, ba1 ba1, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = ba1;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ba1) {
            vz vzVar = (vz) ((ba1) obj);
            if (this.a.equals(vzVar.a)) {
                String str = vzVar.b;
                String str2 = this.b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.c.equals(vzVar.c)) {
                        ba1 ba1 = vzVar.d;
                        ba1 ba12 = this.d;
                        if (ba12 != null ? ba12.equals(ba1) : ba1 == null) {
                            if (this.e == vzVar.e) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        int i2 = 0;
        String str = this.b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode2 = (((hashCode ^ i) * 1000003) ^ this.c.hashCode()) * 1000003;
        ba1 ba1 = this.d;
        if (ba1 != null) {
            i2 = ba1.hashCode();
        }
        return this.e ^ ((hashCode2 ^ i2) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return hl6.n(sb, this.e, "}");
    }
}
