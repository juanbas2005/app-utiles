package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: tw2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tw2 extends a3 {
    public static final Parcelable.Creator<tw2> CREATOR = new zc5(15);
    public final int w;
    public final int x;
    public final Bundle y;

    public tw2(int i, int i2, Bundle bundle) {
        this.w = i;
        this.x = i2;
        this.y = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 4);
        parcel.writeInt(this.w);
        h75.K(parcel, 2, 4);
        parcel.writeInt(this.x);
        h75.z(parcel, 3, this.y);
        h75.O(parcel, M);
    }
}
