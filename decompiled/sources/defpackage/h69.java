package defpackage;

import java.util.Arrays;

/* renamed from: h69  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h69 {
    public final String a;
    public final String b = "com.google.android.gms";
    public final boolean c;

    public h69(String str, boolean z) {
        z65.h(str);
        this.a = str;
        z65.h("com.google.android.gms");
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h69)) {
            return false;
        }
        h69 h69 = (h69) obj;
        if (!b35.j(this.a, h69.a) || !b35.j(this.b, h69.b) || !b35.j((Object) null, (Object) null) || this.c != h69.c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        z65.k((Object) null);
        throw null;
    }
}
