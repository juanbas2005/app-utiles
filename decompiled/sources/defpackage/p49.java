package defpackage;

import android.content.Context;

/* renamed from: p49  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p49 {
    public final Context a;
    public final x77 b;

    public p49(Context context, x77 x77) {
        this.a = context;
        this.b = x77;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p49)) {
            return false;
        }
        p49 p49 = (p49) obj;
        if (!this.a.equals(p49.a)) {
            return false;
        }
        x77 x77 = p49.b;
        x77 x772 = this.b;
        if (x772 == null) {
            if (x77 == null) {
                return true;
            }
            return false;
        } else if (!x772.equals(x77)) {
            return false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        x77 x77 = this.b;
        if (x77 == null) {
            i = 0;
        } else {
            i = x77.hashCode();
        }
        return i ^ (hashCode * 1000003);
    }

    public final String toString() {
        String obj = this.a.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(length + 45 + valueOf.length() + 1);
        f21.v(sb, "FlagsContext{context=", obj, ", hermeticFileOverrides=", valueOf);
        sb.append("}");
        return sb.toString();
    }
}
