package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: tp  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tp extends View.BaseSavedState {
    public static final Parcelable.Creator<tp> CREATOR = new ri8(2);
    public boolean w;

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.w ? (byte) 1 : 0);
    }
}
