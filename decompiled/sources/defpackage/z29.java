package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.TreeMap;

/* renamed from: z29  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z29 extends a3 implements Comparable {
    public static final Parcelable.Creator<z29> CREATOR = new ki8(28);
    public final int w;
    public final j39[] x;
    public final String[] y;
    public final TreeMap z = new TreeMap();

    public z29(int i, j39[] j39Arr, String[] strArr) {
        this.w = i;
        this.x = j39Arr;
        for (j39 j39 : j39Arr) {
            this.z.put(j39.w, j39);
        }
        this.y = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.w - ((z29) obj).w;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z29)) {
            return false;
        }
        z29 z29 = (z29) obj;
        if (this.w != z29.w || !a35.q(this.z, z29.z) || !Arrays.equals(this.y, z29.y)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.w);
        sb.append(", (");
        for (j39 append : this.z.values()) {
            sb.append(append);
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.y;
        if (strArr != null) {
            for (String append2 : strArr) {
                sb.append(append2);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 2, 4);
        parcel.writeInt(this.w);
        h75.H(parcel, 3, this.x, i);
        String[] strArr = this.y;
        if (strArr != null) {
            int M2 = h75.M(parcel, 4);
            parcel.writeStringArray(strArr);
            h75.O(parcel, M2);
        }
        h75.O(parcel, M);
    }
}
