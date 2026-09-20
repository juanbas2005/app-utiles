package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: l39  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l39 extends a3 {
    public static final Parcelable.Creator<l39> CREATOR = new g39(3);
    public final String w;
    public final String x;
    public final j39 y;
    public final boolean z;

    public l39(String str, String str2, j39 j39, boolean z2) {
        this.w = str;
        this.x = str2;
        this.y = j39;
        this.z = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l39)) {
            return false;
        }
        l39 l39 = (l39) obj;
        if (!a35.q(this.w, l39.w) || !a35.q(this.x, l39.x) || !a35.q(this.y, l39.y) || this.z != l39.z) {
            return false;
        }
        return true;
    }

    public final void f(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.w);
        sb.append(", ");
        sb.append(this.x);
        sb.append(", ");
        this.y.f(sb);
        sb.append(", ");
        sb.append(this.z);
        sb.append(")");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        f(sb);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.F(parcel, 2, this.w);
        h75.F(parcel, 3, this.x);
        h75.E(parcel, 4, this.y, i);
        h75.K(parcel, 5, 4);
        parcel.writeInt(this.z ? 1 : 0);
        h75.O(parcel, M);
    }
}
