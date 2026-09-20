package defpackage;

import java.io.Serializable;

/* renamed from: eo7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class eo7 implements Serializable {
    public final Object w;
    public final Object x;
    public final Object y;

    public eo7(Object obj, Object obj2, Object obj3) {
        this.w = obj;
        this.x = obj2;
        this.y = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo7)) {
            return false;
        }
        eo7 eo7 = (eo7) obj;
        if (sg3.e(this.w, eo7.w) && sg3.e(this.x, eo7.x) && sg3.e(this.y, eo7.y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        Object obj = this.w;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        int i4 = i * 31;
        Object obj2 = this.x;
        if (obj2 == null) {
            i2 = 0;
        } else {
            i2 = obj2.hashCode();
        }
        int i5 = (i4 + i2) * 31;
        Object obj3 = this.y;
        if (obj3 != null) {
            i3 = obj3.hashCode();
        }
        return i5 + i3;
    }

    public final String toString() {
        return "(" + this.w + ", " + this.x + ", " + this.y + ')';
    }
}
