package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: z70  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z70 extends a3 {
    public static final Parcelable.Creator<z70> CREATOR = new ki8(1);
    public final boolean w;
    public final byte[] x;
    public final String y;

    public z70(boolean z, byte[] bArr, String str) {
        if (z) {
            z65.k(bArr);
            z65.k(str);
        }
        this.w = z;
        this.x = bArr;
        this.y = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z70)) {
            return false;
        }
        z70 z70 = (z70) obj;
        if (this.w != z70.w || !Arrays.equals(this.x, z70.x) || !Objects.equals(this.y, z70.y)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.x) + (Objects.hash(new Object[]{Boolean.valueOf(this.w), this.y}) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 4);
        parcel.writeInt(this.w ? 1 : 0);
        h75.A(parcel, 2, this.x);
        h75.F(parcel, 3, this.y);
        h75.O(parcel, M);
    }
}
