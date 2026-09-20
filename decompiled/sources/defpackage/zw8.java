package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: zw8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zw8 extends si8 {
    public final IBinder g;
    public final /* synthetic */ y50 h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zw8(y50 y50, int i, IBinder iBinder, Bundle bundle) {
        super(y50, i, bundle);
        this.h = y50;
        this.g = iBinder;
    }

    public final boolean a() {
        IBinder iBinder = this.g;
        try {
            z65.k(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            y50 y50 = this.h;
            if (!y50.m().equals(interfaceDescriptor)) {
                String m = y50.m();
                Log.w("GmsClient", pb4.n(new StringBuilder(m.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", m, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface b = y50.b(iBinder);
            if (b == null || (!y50.t(2, 4, b) && !y50.t(3, 4, b))) {
                return false;
            }
            y50.u = null;
            v50 v50 = y50.o;
            if (v50 == null) {
                return true;
            }
            v50.e();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    public final void b(m11 m11) {
        w50 w50 = this.h.p;
        if (w50 != null) {
            w50.b(m11);
        }
        System.currentTimeMillis();
    }
}
