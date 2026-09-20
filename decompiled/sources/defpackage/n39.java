package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: n39  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n39 extends a3 {
    public static final Parcelable.Creator<n39> CREATOR = new g39(4);
    public final List w;

    public n39(ArrayList arrayList) {
        this.w = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n39)) {
            return false;
        }
        return this.w.equals(((n39) obj).w);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        boolean z = true;
        for (l39 l39 : this.w) {
            if (!z) {
                sb.append(", ");
            }
            l39.f(sb);
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.I(parcel, 2, this.w);
        h75.O(parcel, M);
    }
}
