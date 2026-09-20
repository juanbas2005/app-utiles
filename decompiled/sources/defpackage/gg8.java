package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: gg8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class gg8 implements IInterface {
    public final /* synthetic */ int d;
    public final IBinder e;
    public final String f;

    public /* synthetic */ gg8(IBinder iBinder, String str, int i) {
        this.d = i;
        this.e = iBinder;
        this.f = str;
    }

    public Parcel H(Parcel parcel, int i) {
        parcel = Parcel.obtain();
        try {
            this.e.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    public Parcel I() {
        int i = this.d;
        String str = this.f;
        switch (i) {
            case 2:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(str);
                return obtain;
            default:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(str);
                return obtain2;
        }
    }

    public void J(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.e.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public void K(Parcel parcel) {
        try {
            this.e.transact(2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f);
        return obtain;
    }

    public final IBinder asBinder() {
        switch (this.d) {
            case b85.b:
                return this.e;
            case 1:
                return this.e;
            case 2:
                return this.e;
            default:
                return this.e;
        }
    }

    public void b(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.e.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel e(Parcel parcel, int i) {
        parcel = Parcel.obtain();
        try {
            this.e.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }
}
