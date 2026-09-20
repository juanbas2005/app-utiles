package defpackage;

import java.util.Iterator;

/* renamed from: pe3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class pe3 implements Iterable, ar3 {
    public final int w;
    public final int x;
    public final int y;

    public pe3(int i, int i2, int i3) {
        if (i3 == 0) {
            h.q("Step must be non-zero.");
            throw null;
        } else if (i3 != Integer.MIN_VALUE) {
            this.w = i;
            this.x = wn6.m(i, i2, i3);
            this.y = i3;
        } else {
            h.q("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof pe3)) {
            return false;
        }
        if (isEmpty() && ((pe3) obj).isEmpty()) {
            return true;
        }
        pe3 pe3 = (pe3) obj;
        if (this.w == pe3.w && this.x == pe3.x && this.y == pe3.y) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.w * 31) + this.x) * 31) + this.y;
    }

    public boolean isEmpty() {
        int i = this.x;
        int i2 = this.y;
        int i3 = this.w;
        if (i2 > 0) {
            if (i3 > i) {
                return true;
            }
            return false;
        } else if (i3 < i) {
            return true;
        } else {
            return false;
        }
    }

    public final Iterator iterator() {
        return new qe3(this.w, this.x, this.y);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.x;
        int i2 = this.y;
        int i3 = this.w;
        if (i2 > 0) {
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
