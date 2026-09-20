package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: ax8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ax8 extends a3 {
    public static final Parcelable.Creator<ax8> CREATOR = new ki8(25);
    public final qz8 w;
    public final qz8 x;

    public ax8(qz8 qz8, qz8 qz82) {
        this.w = qz8;
        this.x = qz82;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ax8)) {
            return false;
        }
        ax8 ax8 = (ax8) obj;
        if (!b35.j(this.w, ax8.w) || !b35.j(this.x, ax8.x)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.w, this.x});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr;
        int M = h75.M(parcel, 20293);
        byte[] bArr2 = null;
        qz8 qz8 = this.w;
        if (qz8 == null) {
            bArr = null;
        } else {
            bArr = qz8.s();
        }
        h75.A(parcel, 1, bArr);
        qz8 qz82 = this.x;
        if (qz82 != null) {
            bArr2 = qz82.s();
        }
        h75.A(parcel, 2, bArr2);
        h75.O(parcel, M);
    }
}
