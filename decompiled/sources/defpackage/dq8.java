package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dq8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dq8 extends a3 {
    public static final Parcelable.Creator<dq8> CREATOR = new ki8(11);
    public final Bundle w;

    public dq8(Bundle bundle) {
        this.w = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.z(parcel, 1, this.w);
        h75.O(parcel, M);
    }
}
