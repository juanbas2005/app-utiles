package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import java.util.TreeMap;

/* renamed from: b39  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b39 extends a3 {
    public static final Parcelable.Creator<b39> CREATOR = new ki8(29);
    public final TreeMap A = new TreeMap();
    public final boolean B;
    public final long C;
    public final String w;
    public final byte[] x;
    public final String y;
    public final z29[] z;

    public b39(String str, String str2, z29[] z29Arr, boolean z2, byte[] bArr, long j) {
        this.w = str;
        this.y = str2;
        this.z = z29Arr;
        this.B = z2;
        this.x = bArr;
        this.C = j;
        for (z29 z29 : z29Arr) {
            this.A.put(Integer.valueOf(z29.w), z29);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b39)) {
            return false;
        }
        b39 b39 = (b39) obj;
        if (!a35.q(this.w, b39.w) || !a35.q(this.y, b39.y) || !this.A.equals(b39.A) || this.B != b39.B || !Arrays.equals(this.x, b39.x) || this.C != b39.C) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.w, this.y, this.A, Boolean.valueOf(this.B), this.x, Long.valueOf(this.C)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.w);
        sb.append("', '");
        sb.append(this.y);
        sb.append("', (");
        for (z29 append : this.A.values()) {
            sb.append(append);
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.B);
        sb.append(", ");
        byte[] bArr = this.x;
        if (bArr == null) {
            str = "null";
        } else {
            str = Base64.encodeToString(bArr, 3);
        }
        sb.append(str);
        sb.append(", ");
        sb.append(this.C);
        sb.append(')');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.F(parcel, 2, this.w);
        h75.F(parcel, 3, this.y);
        h75.H(parcel, 4, this.z, i);
        h75.K(parcel, 5, 4);
        parcel.writeInt(this.B ? 1 : 0);
        h75.A(parcel, 6, this.x);
        h75.K(parcel, 7, 8);
        parcel.writeLong(this.C);
        h75.O(parcel, M);
    }
}
