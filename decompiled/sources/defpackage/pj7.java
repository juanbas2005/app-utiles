package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: pj7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pj7 extends x {
    public static final Parcelable.Creator<pj7> CREATOR = new dd5(5);
    public int y;
    public boolean z;

    public pj7(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z2;
        this.y = parcel.readInt();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.z = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z ? 1 : 0);
    }
}
