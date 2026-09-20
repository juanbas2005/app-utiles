package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: b71  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b71 extends x {
    public static final Parcelable.Creator<b71> CREATOR = new xx6(2);
    public SparseArray y;

    public b71(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.y = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.y.append(iArr[i], readParcelableArray[i]);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.y;
        if (sparseArray != null) {
            i2 = sparseArray.size();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        int[] iArr = new int[i2];
        Parcelable[] parcelableArr = new Parcelable[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = this.y.keyAt(i3);
            parcelableArr[i3] = (Parcelable) this.y.valueAt(i3);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
