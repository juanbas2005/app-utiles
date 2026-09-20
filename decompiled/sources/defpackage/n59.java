package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: n59  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n59 implements Runnable {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ r69 B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ z99 z;

    public n59(r69 r69, String str, String str2, z99 z99, boolean z2, ju8 ju8) {
        this.x = str;
        this.y = str2;
        this.z = z99;
        this.A = z2;
        this.C = ju8;
        this.B = r69;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    public final void run() {
        d99 d99;
        AtomicReference atomicReference;
        switch (this.w) {
            case b85.b:
                String str = this.y;
                String str2 = this.x;
                ju8 ju8 = (ju8) this.C;
                r69 r69 = this.B;
                Bundle bundle = new Bundle();
                try {
                    iy8 iy8 = r69.z;
                    y19 y19 = (y19) r69.w;
                    if (iy8 == null) {
                        pz8 pz8 = y19.B;
                        y19.g(pz8);
                        pz8.B.c(str2, str, "Failed to get user properties; not connected to service");
                        d99 = y19.E;
                        y19.e(d99);
                        d99.U1(ju8, bundle);
                        return;
                    }
                    List<z89> i = iy8.i(str2, str, this.A, this.z);
                    Bundle bundle2 = new Bundle();
                    if (i != null) {
                        for (z89 z89 : i) {
                            String str3 = z89.A;
                            String str4 = z89.x;
                            if (str3 != null) {
                                bundle2.putString(str4, str3);
                            } else {
                                Long l = z89.z;
                                if (l != null) {
                                    bundle2.putLong(str4, l.longValue());
                                } else {
                                    Double d = z89.C;
                                    if (d != null) {
                                        bundle2.putDouble(str4, d.doubleValue());
                                    }
                                }
                            }
                        }
                    }
                    try {
                        r69.p1();
                        d99 d992 = y19.E;
                        y19.e(d992);
                        d992.U1(ju8, bundle2);
                        return;
                    } catch (RemoteException e) {
                        e = e;
                        bundle = bundle2;
                        try {
                            pz8 pz82 = ((y19) r69.w).B;
                            y19.g(pz82);
                            pz82.B.c(str2, e, "Failed to get user properties; remote exception");
                            d99 = ((y19) r69.w).E;
                            y19.e(d99);
                            d99.U1(ju8, bundle);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            d99 d993 = ((y19) r69.w).E;
                            y19.e(d993);
                            d993.U1(ju8, bundle);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bundle = bundle2;
                        d99 d9932 = ((y19) r69.w).E;
                        y19.e(d9932);
                        d9932.U1(ju8, bundle);
                        throw th;
                    }
                } catch (RemoteException e2) {
                    e = e2;
                    pz8 pz822 = ((y19) r69.w).B;
                    y19.g(pz822);
                    pz822.B.c(str2, e, "Failed to get user properties; remote exception");
                    d99 = ((y19) r69.w).E;
                    y19.e(d99);
                    d99.U1(ju8, bundle);
                    return;
                }
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.C;
                synchronized (atomicReference2) {
                    try {
                        r69 r692 = this.B;
                        iy8 iy82 = r692.z;
                        if (iy82 == null) {
                            pz8 pz83 = ((y19) r692.w).B;
                            y19.g(pz83);
                            pz83.B.d("(legacy) Failed to get user properties; not connected to service", (Object) null, this.x, this.y);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty((CharSequence) null)) {
                            atomicReference2.set(iy82.i(this.x, this.y, this.A, this.z));
                        } else {
                            atomicReference2.set(iy82.c((String) null, this.x, this.y, this.A));
                        }
                        r692.p1();
                        atomicReference = (AtomicReference) this.C;
                        atomicReference.notify();
                        return;
                    } catch (RemoteException e3) {
                        try {
                            pz8 pz84 = ((y19) this.B.w).B;
                            y19.g(pz84);
                            pz84.B.d("(legacy) Failed to get user properties; remote exception", (Object) null, this.x, e3);
                            ((AtomicReference) this.C).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.C;
                        } catch (Throwable th3) {
                            ((AtomicReference) this.C).notify();
                            throw th3;
                        }
                    }
                }
        }
    }

    public n59(r69 r69, AtomicReference atomicReference, String str, String str2, z99 z99, boolean z2) {
        this.C = atomicReference;
        this.x = str;
        this.y = str2;
        this.z = z99;
        this.A = z2;
        this.B = r69;
    }
}
