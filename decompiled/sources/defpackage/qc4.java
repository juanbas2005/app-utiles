package defpackage;

import java.util.Iterator;

/* renamed from: qc4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class qc4 implements Iterable, ar3 {
    public final long w;
    public final long x;
    public final long y;

    public qc4(long j, long j2) {
        this.w = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.x = j2;
        this.y = 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof qc4)) {
            return false;
        }
        if (isEmpty() && ((qc4) obj).isEmpty()) {
            return true;
        }
        qc4 qc4 = (qc4) obj;
        if (this.w == qc4.w && this.x == qc4.x && this.y == qc4.y) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Long.hashCode(this.y) + pb4.b(Long.hashCode(this.w) * 31, 31, this.x);
    }

    public boolean isEmpty() {
        int i = (this.y > 0 ? 1 : (this.y == 0 ? 0 : -1));
        int i2 = (this.w > this.x ? 1 : (this.w == this.x ? 0 : -1));
        if (i > 0) {
            if (i2 > 0) {
                return true;
            }
            return false;
        } else if (i2 < 0) {
            return true;
        } else {
            return false;
        }
    }

    public final Iterator iterator() {
        return new rc4(this.w, this.x, this.y);
    }

    public String toString() {
        StringBuilder sb;
        long j = this.y;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        long j2 = this.x;
        long j3 = this.w;
        if (i > 0) {
            sb.append(j3);
            sb.append("..");
            sb.append(j2);
            sb.append(" step ");
            sb.append(j);
        } else {
            sb = new StringBuilder();
            sb.append(j3);
            sb.append(" downTo ");
            sb.append(j2);
            sb.append(" step ");
            sb.append(-j);
        }
        return sb.toString();
    }
}
