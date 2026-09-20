package defpackage;

import java.io.Serializable;

/* renamed from: yb5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yb5 implements Serializable {
    public final Object w;
    public final Object x;

    public yb5(Object obj, Object obj2) {
        this.w = obj;
        this.x = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb5)) {
            return false;
        }
        yb5 yb5 = (yb5) obj;
        if (sg3.e(this.w, yb5.w) && sg3.e(this.x, yb5.x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        Object obj = this.w;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        int i3 = i * 31;
        Object obj2 = this.x;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "(" + this.w + ", " + this.x + ')';
    }
}
