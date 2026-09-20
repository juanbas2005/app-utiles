package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: sq2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sq2 implements Parcelable {
    public static final Parcelable.Creator<sq2> CREATOR = new ri8(19);
    public String A;
    public ArrayList B;
    public ArrayList C;
    public ArrayList D;
    public ArrayList w;
    public ArrayList x;
    public r30[] y;
    public int z;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.w);
        parcel.writeStringList(this.x);
        parcel.writeTypedArray(this.y, i);
        parcel.writeInt(this.z);
        parcel.writeString(this.A);
        parcel.writeStringList(this.B);
        parcel.writeTypedList(this.C);
        parcel.writeTypedList(this.D);
    }
}
