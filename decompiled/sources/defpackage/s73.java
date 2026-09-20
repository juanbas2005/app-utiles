package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: s73  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s73 implements t73 {
    public IBinder d;

    public final IBinder asBinder() {
        return this.d;
    }

    public final void k(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(t73.a);
            obtain.writeStringArray(strArr);
            this.d.transact(1, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
