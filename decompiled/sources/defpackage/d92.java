package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d92  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d92 extends a3 {
    public static final Parcelable.Creator<d92> CREATOR = new ri8(17);
    public final Bundle w;

    public d92(Bundle bundle) {
        bundle.getClass();
        this.w = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int M = h75.M(parcel, 20293);
        h75.z(parcel, 1, this.w);
        h75.O(parcel, M);
    }
}
