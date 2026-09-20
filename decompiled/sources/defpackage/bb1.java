package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bb1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bb1 extends a3 {
    public static final Parcelable.Creator<bb1> CREATOR = new ri8(12);
    public final String w;
    public final Bundle x;

    public bb1(String str, Bundle bundle) {
        str.getClass();
        bundle.getClass();
        this.w = str;
        this.x = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int M = h75.M(parcel, 20293);
        h75.F(parcel, 1, this.w);
        h75.z(parcel, 2, this.x);
        h75.O(parcel, M);
    }
}
