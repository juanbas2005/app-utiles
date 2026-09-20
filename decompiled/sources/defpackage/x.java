package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: x  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new dd5(1);
    public static final w x = new x();
    public final Parcelable w;

    public x(Parcelable parcelable) {
        if (parcelable != null) {
            this.w = parcelable == x ? null : parcelable;
        } else {
            h.q("superState must not be null");
            throw null;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.w, i);
    }

    public x() {
        this.w = null;
    }

    public x(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.w = readParcelable == null ? x : readParcelable;
    }
}
