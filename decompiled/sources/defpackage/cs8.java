package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: cs8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class cs8 extends Binder implements IInterface {
    public cs8(String str) {
        attachInterface(this, str);
    }

    public abstract boolean a(int i, Parcel parcel, Parcel parcel2);

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return a(i, parcel, parcel2);
    }

    public IBinder asBinder() {
        return this;
    }
}
