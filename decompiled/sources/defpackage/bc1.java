package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bc1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bc1 extends a3 {
    public static final Parcelable.Creator<bc1> CREATOR = new ri8(14);
    public final Bundle w;

    public bc1(Bundle bundle) {
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
