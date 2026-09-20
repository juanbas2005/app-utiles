package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: za1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class za1 extends a3 {
    public static final Parcelable.Creator<za1> CREATOR = new ri8(11);
    public final PendingIntent w;
    public final bb1 x;

    public za1(PendingIntent pendingIntent, bb1 bb1) {
        this.w = pendingIntent;
        this.x = bb1;
        if (pendingIntent == null && bb1 == null) {
            h.q("pendingIntent or createCredentialResponse must be specified.");
            throw null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int M = h75.M(parcel, 20293);
        h75.E(parcel, 1, this.w, i);
        h75.E(parcel, 2, this.x, i);
        h75.O(parcel, M);
    }
}
