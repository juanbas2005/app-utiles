package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: ww8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ww8 extends cs8 implements tu8 {
    public final yu8 d;

    public ww8(yu8 yu8) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.d = yu8;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            long readLong = parcel.readLong();
            ds8.d(parcel);
            g(parcel.readString(), parcel.readString(), (Bundle) ds8.a(parcel, Bundle.CREATOR), readLong);
            parcel2.writeNoException();
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int identityHashCode = System.identityHashCode(this.d);
            parcel2.writeNoException();
            parcel2.writeInt(identityHashCode);
            return true;
        }
    }

    public final int d() {
        return System.identityHashCode(this.d);
    }

    public final void g(String str, String str2, Bundle bundle, long j) {
        this.d.a(str, str2, bundle, j);
    }
}
