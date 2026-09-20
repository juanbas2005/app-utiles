package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: t18  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t18 extends a3 {
    public static final Parcelable.Creator<t18> CREATOR = new ki8(15);
    public final int w;
    public final short x;
    public final short y;

    public t18(int i, short s, short s2) {
        this.w = i;
        this.x = s;
        this.y = s2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t18)) {
            return false;
        }
        t18 t18 = (t18) obj;
        if (this.w == t18.w && this.x == t18.x && this.y == t18.y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.w), Short.valueOf(this.x), Short.valueOf(this.y)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 4);
        parcel.writeInt(this.w);
        h75.K(parcel, 2, 4);
        parcel.writeInt(this.x);
        h75.K(parcel, 3, 4);
        parcel.writeInt(this.y);
        h75.O(parcel, M);
    }
}
