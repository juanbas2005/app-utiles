package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: mn  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mn extends a3 {
    public static final Parcelable.Creator<mn> CREATOR = ri8.b;
    public static final mn z;
    public final dv0 w;
    public final boolean x;
    public boolean y;

    static {
        mn mnVar = new mn((dv0) null, false);
        mnVar.y = false;
        z = mnVar;
    }

    public mn(dv0 dv0, boolean z2) {
        this.w = dv0;
        this.x = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mn)) {
            return false;
        }
        mn mnVar = (mn) obj;
        if (b35.j(this.w, mnVar.w) && this.y == mnVar.y && this.x == mnVar.x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.w, Boolean.valueOf(this.y), Boolean.valueOf(this.x)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.w);
        return f21.m(new StringBuilder(valueOf.length() + 31), "ApiMetadata(complianceOptions=", valueOf, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.y) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int M = h75.M(parcel, 20293);
        h75.E(parcel, 1, this.w, i);
        h75.K(parcel, 2, 4);
        parcel.writeInt(this.x ? 1 : 0);
        h75.O(parcel, M);
    }
}
