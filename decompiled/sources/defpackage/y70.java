package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: y70  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y70 extends a3 {
    public static final Parcelable.Creator<y70> CREATOR = new ki8(0);
    public final boolean w;
    public final String x;

    public y70(String str, boolean z) {
        if (z) {
            z65.k(str);
        }
        this.w = z;
        this.x = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y70)) {
            return false;
        }
        y70 y70 = (y70) obj;
        if (this.w != y70.w || !b35.j(this.x, y70.x)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.w), this.x});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 4);
        parcel.writeInt(this.w ? 1 : 0);
        h75.F(parcel, 2, this.x);
        h75.O(parcel, M);
    }
}
