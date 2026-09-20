package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: nq2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nq2 implements Parcelable {
    public static final Parcelable.Creator<nq2> CREATOR = new ri8(18);
    public String w;
    public int x;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.w);
        parcel.writeInt(this.x);
    }
}
