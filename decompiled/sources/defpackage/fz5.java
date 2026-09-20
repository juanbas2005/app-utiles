package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: fz5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fz5 extends x {
    public static final Parcelable.Creator<fz5> CREATOR = new xx6(3);
    public Parcelable y;

    public fz5(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.y = parcel.readParcelable(classLoader == null ? xy5.class.getClassLoader() : classLoader);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.y, 0);
    }
}
