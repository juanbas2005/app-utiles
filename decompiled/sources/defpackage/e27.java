package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: e27  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e27 implements Parcelable {
    public static final Parcelable.Creator<e27> CREATOR = new zc5(11);
    public int w;
    public int x;
    public int[] y;
    public boolean z;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.w + ", mGapDir=" + this.x + ", mHasUnwantedGapAfter=" + this.z + ", mGapPerSpan=" + Arrays.toString(this.y) + '}';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        parcel.writeInt(this.z ? 1 : 0);
        int[] iArr = this.y;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(iArr.length);
        parcel.writeIntArray(this.y);
    }
}
