package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: dv0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dv0 extends a3 {
    public static final Parcelable.Creator<dv0> CREATOR = new ki8(18);
    public final int w;
    public final int x;
    public final int y;
    public final boolean z;

    public dv0(int i, int i2, int i3, boolean z2) {
        this.w = i;
        this.x = i2;
        this.y = i3;
        this.z = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dv0)) {
            return false;
        }
        dv0 dv0 = (dv0) obj;
        if (this.w == dv0.w && this.x == dv0.x && this.y == dv0.y && this.z == dv0.z) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.w), Integer.valueOf(this.x), Integer.valueOf(this.y), Boolean.valueOf(this.z)});
    }

    public final String toString() {
        int i = this.w;
        int length = String.valueOf(i).length();
        int i2 = this.x;
        int length2 = String.valueOf(i2).length();
        int i3 = this.y;
        int length3 = String.valueOf(i3).length();
        boolean z2 = this.z;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z2).length() + 1);
        sb.append("ComplianceOptions{callerProductId=");
        sb.append(i);
        sb.append(", dataOwnerProductId=");
        sb.append(i2);
        sb.append(", processingReason=");
        sb.append(i3);
        sb.append(", isUserData=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 4);
        parcel.writeInt(this.w);
        h75.K(parcel, 2, 4);
        parcel.writeInt(this.x);
        h75.K(parcel, 3, 4);
        parcel.writeInt(this.y);
        h75.K(parcel, 4, 4);
        parcel.writeInt(this.z ? 1 : 0);
        h75.O(parcel, M);
    }
}
