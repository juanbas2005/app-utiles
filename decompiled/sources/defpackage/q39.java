package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: q39  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q39 extends a3 implements Comparable {
    public static final Parcelable.Creator<q39> CREATOR = new g39(5);
    public final int w;
    public final int x;

    public q39(int i, int i2) {
        this.w = i;
        this.x = i2;
    }

    public final int compareTo(Object obj) {
        q39 q39 = (q39) obj;
        int i = q39.w;
        int i2 = this.w;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        int i3 = q39.x;
        int i4 = this.x;
        if (i4 < i3) {
            return -1;
        }
        if (i4 > i3) {
            return 1;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (defpackage.q39) r3;
        r0 = r3.w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r3 = r3.x;
     */
    public final boolean equals(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        if (!(obj instanceof q39) || (i2 = this.w) < i || i2 > i || (i4 = this.x) < i3 || i4 > i3) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.w * 31) + this.x;
    }

    public final String toString() {
        int i = this.w;
        int length = String.valueOf(i).length();
        int i2 = this.x;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(i2).length() + 1);
        sb.append("GenericDimension(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 4);
        parcel.writeInt(this.w);
        h75.K(parcel, 2, 4);
        parcel.writeInt(this.x);
        h75.O(parcel, M);
    }
}
