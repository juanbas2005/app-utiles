package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: b80  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b80 extends a3 {
    public static final Parcelable.Creator<b80> CREATOR = new zc5(27);
    public final int A;
    public final z70 B;
    public final y70 C;
    public final boolean D;
    public final a80 w;
    public final x70 x;
    public final String y;
    public final boolean z;

    public b80(a80 a80, x70 x70, String str, boolean z2, int i, z70 z70, y70 y70, boolean z3) {
        z65.k(a80);
        this.w = a80;
        z65.k(x70);
        this.x = x70;
        this.y = str;
        this.z = z2;
        this.A = i;
        this.B = z70 == null ? new z70(false, (byte[]) null, (String) null) : z70;
        this.C = y70 == null ? new y70((String) null, false) : y70;
        this.D = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b80)) {
            return false;
        }
        b80 b80 = (b80) obj;
        if (!b35.j(this.w, b80.w) || !b35.j(this.x, b80.x) || !b35.j(this.B, b80.B) || !b35.j(this.C, b80.C) || !b35.j(this.y, b80.y) || this.z != b80.z || this.A != b80.A || this.D != b80.D) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.w, this.x, this.B, this.C, this.y, Boolean.valueOf(this.z), Integer.valueOf(this.A), Boolean.valueOf(this.D)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.E(parcel, 1, this.w, i);
        h75.E(parcel, 2, this.x, i);
        h75.F(parcel, 3, this.y);
        h75.K(parcel, 4, 4);
        parcel.writeInt(this.z ? 1 : 0);
        h75.K(parcel, 5, 4);
        parcel.writeInt(this.A);
        h75.E(parcel, 6, this.B, i);
        h75.E(parcel, 7, this.C, i);
        h75.K(parcel, 8, 4);
        parcel.writeInt(this.D ? 1 : 0);
        h75.O(parcel, M);
    }
}
