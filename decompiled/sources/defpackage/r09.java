package defpackage;

import java.util.Arrays;

/* renamed from: r09  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r09 extends d19 {
    public final boolean w;

    public r09(boolean z) {
        this.w = z;
    }

    public final int a() {
        return d19.d((byte) -32);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i;
        d19 d19 = (d19) obj;
        int a = d19.a();
        int d = d19.d((byte) -32);
        if (d != a) {
            return d - d19.a();
        }
        r09 r09 = (r09) d19;
        int i2 = 21;
        if (true != this.w) {
            i = 20;
        } else {
            i = 21;
        }
        if (true != r09.w) {
            i2 = 20;
        }
        return i - i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r09.class == obj.getClass() && this.w == ((r09) obj).w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(d19.d((byte) -32)), Boolean.valueOf(this.w)});
    }

    public final String toString() {
        return Boolean.toString(this.w);
    }
}
