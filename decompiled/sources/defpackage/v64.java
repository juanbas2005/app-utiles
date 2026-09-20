package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: v64  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v64 implements Parcelable {
    public static final Parcelable.Creator<v64> CREATOR = new ri8(24);
    public int w;
    public int x;
    public boolean y;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        parcel.writeInt(this.y ? 1 : 0);
    }
}
