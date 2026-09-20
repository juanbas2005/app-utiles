package defpackage;

import java.util.Arrays;

/* renamed from: o80  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o80 {
    public final int a;
    public final CharSequence b;

    public o80(int i, CharSequence charSequence) {
        this.a = i;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        String str;
        if (!(obj instanceof o80)) {
            return false;
        }
        o80 o80 = (o80) obj;
        if (this.a != o80.a) {
            return false;
        }
        CharSequence charSequence = o80.b;
        String str2 = null;
        CharSequence charSequence2 = this.b;
        if (charSequence2 != null) {
            str = charSequence2.toString();
        } else {
            str = null;
        }
        if (charSequence != null) {
            str2 = charSequence.toString();
        }
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || !str.equals(str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        Integer valueOf = Integer.valueOf(this.a);
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        return Arrays.hashCode(new Object[]{valueOf, str});
    }
}
