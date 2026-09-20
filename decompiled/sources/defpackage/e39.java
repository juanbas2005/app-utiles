package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e39  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e39 extends a3 {
    public static final Parcelable.Creator<e39> CREATOR = new g39(0);
    public final byte[] w;

    public e39(byte[] bArr) {
        this.w = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.A(parcel, 2, this.w);
        h75.O(parcel, M);
    }
}
