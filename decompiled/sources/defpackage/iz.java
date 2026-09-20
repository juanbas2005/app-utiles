package defpackage;

import java.util.List;

/* renamed from: iz  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class iz extends w91 {
    public final List a;
    public final String b;

    public iz(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w91)) {
            return false;
        }
        iz izVar = (iz) ((w91) obj);
        if (!this.a.equals(izVar.a)) {
            return false;
        }
        String str = izVar.b;
        String str2 = this.b;
        if (str2 == null) {
            if (str == null) {
                return true;
            }
            return false;
        } else if (str2.equals(str)) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return i ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.a);
        sb.append(", orgId=");
        return f21.l(sb, this.b, "}");
    }
}
