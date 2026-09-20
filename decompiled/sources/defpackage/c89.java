package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c89  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c89 extends a3 {
    public static final Parcelable.Creator<c89> CREATOR = new g39(13);
    public final List w;

    public c89(ArrayList arrayList) {
        this.w = arrayList;
    }

    public static c89 f(e59... e59Arr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(e59Arr[0].w));
        return new c89(arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        List list = this.w;
        if (list != null) {
            int M2 = h75.M(parcel, 1);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            h75.O(parcel, M2);
        }
        h75.O(parcel, M);
    }
}
