package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: cc2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cc2 extends a3 {
    public static final Parcelable.Creator<cc2> CREATOR = new ki8(13);
    public final String w;
    public final int x;
    public final long y;
    public final boolean z;

    public cc2(String str, int i, long j, boolean z2) {
        this.w = str;
        this.x = i;
        this.y = j;
        this.z = z2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cc2) {
            cc2 cc2 = (cc2) obj;
            if (b35.j(this.w, cc2.w) && f() == cc2.f() && this.z == cc2.z) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final long f() {
        long j = this.y;
        if (j == -1) {
            return (long) this.x;
        }
        return j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.w, Long.valueOf(f()), Boolean.valueOf(this.z)});
    }

    public final String toString() {
        hv2 hv2 = new hv2(20, (Object) this);
        hv2.k0("name", this.w);
        hv2.k0("version", Long.valueOf(f()));
        hv2.k0("is_fully_rolled_out", Boolean.valueOf(this.z));
        return hv2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.F(parcel, 1, this.w);
        h75.K(parcel, 2, 4);
        parcel.writeInt(this.x);
        long f = f();
        h75.K(parcel, 3, 8);
        parcel.writeLong(f);
        h75.K(parcel, 4, 4);
        parcel.writeInt(this.z ? 1 : 0);
        h75.O(parcel, M);
    }

    public cc2(long j, String str) {
        this(str, -1, j, false);
    }
}
