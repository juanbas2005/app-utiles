package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: f89  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f89 extends a3 {
    public static final Parcelable.Creator<f89> CREATOR = new g39(14);
    public final List w;

    public f89(ArrayList arrayList) {
        this.w = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.I(parcel, 1, this.w);
        h75.O(parcel, M);
    }
}
