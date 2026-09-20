package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: f27  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f27 implements Parcelable {
    public static final Parcelable.Creator<f27> CREATOR = new zc5(12);
    public int A;
    public int[] B;
    public ArrayList C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int w;
    public int x;
    public int y;
    public int[] z;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        if (this.y > 0) {
            parcel.writeIntArray(this.z);
        }
        parcel.writeInt(this.A);
        if (this.A > 0) {
            parcel.writeIntArray(this.B);
        }
        parcel.writeInt(this.D ? 1 : 0);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeInt(this.F ? 1 : 0);
        parcel.writeList(this.C);
    }
}
