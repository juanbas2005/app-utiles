package defpackage;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: gv8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gv8 implements Parcelable {
    public static final Parcelable.Creator<gv8> CREATOR = new ki8(12);
    public final Messenger w;

    public gv8(IBinder iBinder) {
        this.w = new Messenger(iBinder);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            try {
                return this.w.getBinder().equals(((gv8) obj).w.getBinder());
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.w.getBinder().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.w.getBinder());
    }
}
