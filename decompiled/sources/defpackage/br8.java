package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: br8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class br8 implements IInterface {
    public final IBinder d;

    public br8(IBinder iBinder) {
        this.d = iBinder;
    }

    public final Parcel a(Parcel parcel, int i) {
        parcel = Parcel.obtain();
        try {
            this.d.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.d;
    }
}
