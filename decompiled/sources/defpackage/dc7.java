package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: dc7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dc7 extends a3 {
    public static final Parcelable.Creator<dc7> CREATOR = new zc5(16);
    public final int w;
    public List x;

    public dc7(int i, List list) {
        this.w = i;
        this.x = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 4);
        parcel.writeInt(this.w);
        h75.I(parcel, 2, this.x);
        h75.O(parcel, M);
    }
}
