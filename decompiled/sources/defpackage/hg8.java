package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: hg8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hg8 extends a3 implements p66 {
    public static final Parcelable.Creator<hg8> CREATOR = new zc5(17);
    public final int w;
    public final int x;
    public final Intent y;

    public hg8(int i, int i2, Intent intent) {
        this.w = i;
        this.x = i2;
        this.y = intent;
    }

    public final Status d() {
        if (this.x == 0) {
            return Status.A;
        }
        return Status.E;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 4);
        parcel.writeInt(this.w);
        h75.K(parcel, 2, 4);
        parcel.writeInt(this.x);
        h75.E(parcel, 3, this.y, i);
        h75.O(parcel, M);
    }
}
