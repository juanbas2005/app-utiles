package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: s30  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s30 implements Parcelable {
    public static final Parcelable.Creator<s30> CREATOR = new ri8(4);
    public final ArrayList w;
    public final ArrayList x;

    public s30(Parcel parcel) {
        this.w = parcel.createStringArrayList();
        this.x = parcel.createTypedArrayList(r30.CREATOR);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.w);
        parcel.writeTypedList(this.x);
    }
}
