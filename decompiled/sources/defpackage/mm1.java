package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: mm1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mm1 implements Parcelable {
    public static final Parcelable.Creator<mm1> CREATOR = new ri8(16);
    public final int w;

    public mm1(int i) {
        this.w = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof mm1) && this.w == ((mm1) obj).w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.w);
    }

    public final String toString() {
        return pb4.i(this.w, "DefaultLazyKey(index=", ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.w);
    }
}
