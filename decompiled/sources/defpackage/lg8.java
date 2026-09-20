package defpackage;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: lg8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class lg8 extends Binder implements IInterface {
    public final /* synthetic */ int d;

    public lg8(String str, int i) {
        this.d = i;
        switch (i) {
            case 1:
                attachInterface(this, str);
                return;
            case 2:
                attachInterface(this, str);
                return;
            default:
                attachInterface(this, str);
                return;
        }
    }

    public static void H(Parcel parcel) {
        int i = ft8.a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(hl6.p(new StringBuilder(String.valueOf(dataAvail).length() + 45), "Parcel data not fully consumed, unread size: ", dataAvail));
        }
    }

    public abstract boolean I(int i, Parcel parcel, Parcel parcel2);

    public abstract boolean J(int i, Parcel parcel, Parcel parcel2);

    public boolean K(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public final IBinder asBinder() {
        int i = this.d;
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        switch (this.d) {
            case b85.b:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return I(i, parcel, parcel2);
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return J(i, parcel, parcel2);
            case 2:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return K(i, parcel, parcel2);
            default:
                if (i > 16777215) {
                    z = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z = false;
                }
                if (z) {
                    return true;
                }
                xf3 xf3 = (xf3) this;
                switch (i) {
                    case 1:
                        Status status = (Status) ft8.a(parcel, Status.CREATOR);
                        H(parcel);
                        status.getClass();
                        a35.m(status, (if5) ft8.a(parcel, if5.CREATOR), xf3.e);
                        return true;
                    case 2:
                        p26 p26 = (p26) ft8.a(parcel, p26.CREATOR);
                        H(parcel);
                        ((Status) ft8.a(parcel, Status.CREATOR)).getClass();
                        ku4.p();
                        break;
                    case 3:
                        er0 er0 = (er0) ft8.a(parcel, er0.CREATOR);
                        H(parcel);
                        ((Status) ft8.a(parcel, Status.CREATOR)).getClass();
                        ku4.p();
                        break;
                    case 4:
                        jf5 jf5 = (jf5) ft8.a(parcel, jf5.CREATOR);
                        H(parcel);
                        ((Status) ft8.a(parcel, Status.CREATOR)).getClass();
                        ku4.p();
                        break;
                    case 5:
                        n26 n26 = (n26) ft8.a(parcel, n26.CREATOR);
                        H(parcel);
                        ((Status) ft8.a(parcel, Status.CREATOR)).getClass();
                        ku4.p();
                        break;
                    case 6:
                        bb1 bb1 = (bb1) ft8.a(parcel, bb1.CREATOR);
                        H(parcel);
                        ((Status) ft8.a(parcel, Status.CREATOR)).getClass();
                        ku4.p();
                        break;
                    case 7:
                        za1 za1 = (za1) ft8.a(parcel, za1.CREATOR);
                        H(parcel);
                        ((Status) ft8.a(parcel, Status.CREATOR)).getClass();
                        throw new UnsupportedOperationException();
                    case 8:
                        m26 m26 = (m26) ft8.a(parcel, m26.CREATOR);
                        H(parcel);
                        ((Status) ft8.a(parcel, Status.CREATOR)).getClass();
                        ku4.p();
                        break;
                    case 9:
                        cr0 cr0 = (cr0) ft8.a(parcel, cr0.CREATOR);
                        H(parcel);
                        ((Status) ft8.a(parcel, Status.CREATOR)).getClass();
                        throw new UnsupportedOperationException();
                    case 10:
                        qt6 qt6 = (qt6) ft8.a(parcel, qt6.CREATOR);
                        H(parcel);
                        ((Status) ft8.a(parcel, Status.CREATOR)).getClass();
                        throw new UnsupportedOperationException();
                    case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                        dr0 dr0 = (dr0) ft8.a(parcel, dr0.CREATOR);
                        H(parcel);
                        ((Status) ft8.a(parcel, Status.CREATOR)).getClass();
                        ku4.p();
                        break;
                    case 12:
                        x93 x93 = (x93) ft8.a(parcel, x93.CREATOR);
                        H(parcel);
                        ((Status) ft8.a(parcel, Status.CREATOR)).getClass();
                        ku4.p();
                        break;
                    case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                        d92 d92 = (d92) ft8.a(parcel, d92.CREATOR);
                        H(parcel);
                        ((Status) ft8.a(parcel, Status.CREATOR)).getClass();
                        ku4.p();
                        break;
                    case 14:
                        bc1 bc1 = (bc1) ft8.a(parcel, bc1.CREATOR);
                        H(parcel);
                        ((Status) ft8.a(parcel, Status.CREATOR)).getClass();
                        ku4.p();
                        break;
                    case h75.g:
                        ar0 ar0 = (ar0) ft8.a(parcel, ar0.CREATOR);
                        H(parcel);
                        ((Status) ft8.a(parcel, Status.CREATOR)).getClass();
                        ku4.p();
                        break;
                }
                return false;
        }
    }

    public /* synthetic */ lg8() {
        this.d = 3;
    }
}
