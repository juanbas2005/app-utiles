package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xt8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xt8 extends cs8 implements ju8 {
    public final AtomicReference d = new AtomicReference();
    public boolean e;

    public xt8() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public static final Object e(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e2) {
            String canonicalName = cls.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            Log.w("AM", "Unexpected object type. Expected, Received: " + canonicalName + ", " + canonicalName2, e2);
            throw e2;
        }
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        ds8.d(parcel);
        z((Bundle) ds8.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000d */
    public final Bundle b(long j) {
        AtomicReference atomicReference = this.d;
        synchronized (atomicReference) {
            if (!this.e) {
                atomicReference.wait(j);
                return null;
            }
            Bundle bundle = (Bundle) this.d.get();
            return bundle;
        }
    }

    public final void z(Bundle bundle) {
        AtomicReference atomicReference = this.d;
        synchronized (atomicReference) {
            try {
                atomicReference.set(bundle);
                this.e = true;
                this.d.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
