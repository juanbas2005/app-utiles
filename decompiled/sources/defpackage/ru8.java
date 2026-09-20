package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: ru8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ru8 extends gg8 implements tu8 {
    public ru8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 3);
    }

    public final int d() {
        Parcel H = H(I(), 2);
        int readInt = H.readInt();
        H.recycle();
        return readInt;
    }

    public final void g(String str, String str2, Bundle bundle, long j) {
        Parcel I = I();
        I.writeString(str);
        I.writeString(str2);
        ds8.b(I, bundle);
        I.writeLong(j);
        J(I, 1);
    }
}
