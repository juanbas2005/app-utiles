package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cg4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cg4 extends x {
    public static final Parcelable.Creator<cg4> CREATOR = new dd5(3);
    public boolean y;

    public cg4(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            cg4.class.getClassLoader();
        }
        this.y = parcel.readInt() != 1 ? false : true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.y ? 1 : 0);
    }
}
