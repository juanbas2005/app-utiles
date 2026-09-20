package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ns0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ns0 extends a3 {
    public static final Parcelable.Creator<ns0> CREATOR = new ki8(5);
    public final Intent w;

    public ns0(Intent intent) {
        this.w = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.E(parcel, 1, this.w, i);
        h75.O(parcel, M);
    }
}
