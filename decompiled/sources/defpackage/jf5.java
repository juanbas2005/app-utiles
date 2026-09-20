package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: jf5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jf5 extends a3 {
    public static final Parcelable.Creator<jf5> CREATOR = new zc5(4);
    public final PendingIntent w;

    public jf5(PendingIntent pendingIntent) {
        pendingIntent.getClass();
        this.w = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int M = h75.M(parcel, 20293);
        h75.E(parcel, 1, this.w, i);
        h75.O(parcel, M);
    }
}
