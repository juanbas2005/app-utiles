package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: p29  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class p29 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int w = 2;
    public final /* synthetic */ String x;
    public final /* synthetic */ z99 y;
    public final /* synthetic */ Object z;

    public /* synthetic */ p29(w29 w29, z99 z99, Bundle bundle, oy8 oy8, String str) {
        this.z = w29;
        this.y = z99;
        this.A = bundle;
        this.B = oy8;
        this.x = str;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    public final void run() {
        AtomicReference atomicReference;
        d99 d99;
        switch (this.w) {
            case b85.b:
                z99 z99 = this.y;
                oy8 oy8 = (oy8) this.B;
                String str = this.x;
                v89 v89 = ((w29) this.z).d;
                v89.T();
                try {
                    oy8.F(v89.b0((Bundle) this.A, z99));
                    return;
                } catch (RemoteException e) {
                    v89.G().B.c(str, e, "Failed to return trigger URIs for app");
                    return;
                }
            case 1:
                AtomicReference atomicReference2 = (AtomicReference) this.z;
                synchronized (atomicReference2) {
                    try {
                        r69 r69 = (r69) this.B;
                        iy8 iy8 = r69.z;
                        if (iy8 == null) {
                            pz8 pz8 = ((y19) r69.w).B;
                            y19.g(pz8);
                            pz8.B.d("(legacy) Failed to get conditional properties; not connected to service", (Object) null, this.x, (String) this.A);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty((CharSequence) null)) {
                            atomicReference2.set(iy8.t(this.x, (String) this.A, this.y));
                        } else {
                            atomicReference2.set(iy8.p((String) null, this.x, (String) this.A));
                        }
                        r69.p1();
                        atomicReference = (AtomicReference) this.z;
                        atomicReference.notify();
                        return;
                    } catch (RemoteException e2) {
                        try {
                            pz8 pz82 = ((y19) ((r69) this.B).w).B;
                            y19.g(pz82);
                            pz82.B.d("(legacy) Failed to get conditional properties; remote exception", (Object) null, this.x, e2);
                            ((AtomicReference) this.z).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.z;
                        } catch (Throwable th) {
                            ((AtomicReference) this.z).notify();
                            throw th;
                        }
                    }
                }
            default:
                ju8 ju8 = (ju8) this.A;
                String str2 = (String) this.z;
                String str3 = this.x;
                r69 r692 = (r69) this.B;
                ArrayList arrayList = new ArrayList();
                try {
                    iy8 iy82 = r692.z;
                    if (iy82 == null) {
                        y19 y19 = (y19) r692.w;
                        pz8 pz83 = y19.B;
                        y19.g(pz83);
                        pz83.B.c(str3, str2, "Failed to get conditional properties; not connected to service");
                        d99 = y19.E;
                        y19.e(d99);
                        d99.V1(ju8, arrayList);
                        return;
                    }
                    arrayList = d99.W1(iy82.t(str3, str2, this.y));
                    r692.p1();
                    d99 = ((y19) r692.w).E;
                    y19.e(d99);
                    d99.V1(ju8, arrayList);
                    return;
                } catch (RemoteException e3) {
                    pz8 pz84 = ((y19) r692.w).B;
                    y19.g(pz84);
                    pz84.B.d("Failed to get conditional properties; remote exception", str3, str2, e3);
                } catch (Throwable th2) {
                    d99 d992 = ((y19) r692.w).E;
                    y19.e(d992);
                    d992.V1(ju8, arrayList);
                    throw th2;
                }
        }
    }

    public p29(r69 r69, String str, String str2, z99 z99, ju8 ju8) {
        this.x = str;
        this.z = str2;
        this.y = z99;
        this.A = ju8;
        this.B = r69;
    }

    public p29(r69 r69, AtomicReference atomicReference, String str, String str2, z99 z99) {
        this.z = atomicReference;
        this.x = str;
        this.A = str2;
        this.y = z99;
        this.B = r69;
    }
}
