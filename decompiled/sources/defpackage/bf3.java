package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bf3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bf3 implements Parcelable {
    public static final Parcelable.Creator<bf3> CREATOR = new ri8(23);
    public final IntentSender w;
    public final Intent x;
    public final int y;
    public final int z;

    public bf3(IntentSender intentSender, Intent intent, int i, int i2) {
        this.w = intentSender;
        this.x = intent;
        this.y = i;
        this.z = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.w, i);
        parcel.writeParcelable(this.x, i);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z);
    }
}
