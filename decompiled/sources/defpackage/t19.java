package defpackage;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* renamed from: t19  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t19 extends Binder implements IInterface {
    public final /* synthetic */ xb7 d;

    public t19(yf3 yf3, xb7 xb7) {
        this.d = xb7;
        Objects.requireNonNull(yf3);
        attachInterface(this, "com.google.android.gms.cloudmessaging.internal.IRegisterCallback");
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Parcelable parcelable;
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i3 = dt8.a;
        Parcelable parcelable2 = null;
        if (parcel.readInt() == 0) {
            parcelable = null;
        } else {
            parcelable = creator.createFromParcel(parcel);
        }
        Status status = (Status) parcelable;
        String readString = parcel.readString();
        Parcelable.Creator<mn> creator2 = mn.CREATOR;
        if (parcel.readInt() != 0) {
            parcelable2 = creator2.createFromParcel(parcel);
        }
        mn mnVar = (mn) parcelable2;
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            a35.m(status, readString, this.d);
            return true;
        }
        throw new BadParcelableException(hl6.p(new StringBuilder(String.valueOf(dataAvail).length() + 45), "Parcel data not fully consumed, unread size: ", dataAvail));
    }

    public final IBinder asBinder() {
        return this;
    }
}
