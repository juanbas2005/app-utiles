package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ro0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ro0 extends x {
    public static final Parcelable.Creator<ro0> CREATOR = new dd5(2);
    public boolean y;

    public ro0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.y = parcel.readInt() != 1 ? false : true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.y ? 1 : 0);
    }
}
