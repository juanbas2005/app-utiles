package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: m69  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m69 implements ServiceConnection, v50, w50 {
    public volatile boolean w;
    public volatile hz8 x;
    public final /* synthetic */ r69 y;

    public m69(r69 r69) {
        this.y = r69;
    }

    public final void a(int i) {
        y19 y19 = (y19) this.y.w;
        r19 r19 = y19.C;
        y19.g(r19);
        r19.h1();
        pz8 pz8 = y19.B;
        y19.g(pz8);
        pz8.I.a("Service connection suspended");
        r19 r192 = y19.C;
        y19.g(r192);
        r192.l1(new ge(27, (Object) this));
    }

    public final void b(m11 m11) {
        r69 r69 = this.y;
        r19 r19 = ((y19) r69.w).C;
        y19.g(r19);
        r19.h1();
        pz8 pz8 = ((y19) r69.w).B;
        if (pz8 == null || !pz8.x) {
            pz8 = null;
        }
        if (pz8 != null) {
            pz8.J.b("Service connection failed", m11);
        }
        synchronized (this) {
            this.w = false;
            this.x = null;
        }
        r19 r192 = ((y19) this.y.w).C;
        y19.g(r192);
        r192.l1(new c49(8, (Object) this, (Object) m11));
    }

    public final void e() {
        r19 r19 = ((y19) this.y.w).C;
        y19.g(r19);
        r19.h1();
        synchronized (this) {
            try {
                z65.k(this.x);
                r19 r192 = ((y19) this.y.w).C;
                y19.g(r192);
                r192.l1(new f69(this, (iy8) this.x.l(), 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.x = null;
                this.w = false;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r5 = ((defpackage.y19) r3.y.w).B;
        defpackage.y19.g(r5);
        r5.B.a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0072 */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        iy8 cy8;
        r19 r19 = ((y19) this.y.w).C;
        y19.g(r19);
        r19.h1();
        synchronized (this) {
            if (iBinder == null) {
                this.w = false;
                pz8 pz8 = ((y19) this.y.w).B;
                y19.g(pz8);
                pz8.B.a("Service connected with null binder");
                return;
            }
            iy8 iy8 = null;
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                if (queryLocalInterface instanceof iy8) {
                    cy8 = (iy8) queryLocalInterface;
                } else {
                    cy8 = new cy8(iBinder);
                }
                iy8 = cy8;
                pz8 pz82 = ((y19) this.y.w).B;
                y19.g(pz82);
                pz82.J.a("Bound to IMeasurementService interface");
            } else {
                pz8 pz83 = ((y19) this.y.w).B;
                y19.g(pz83);
                pz83.B.b("Got binder with a wrong descriptor", interfaceDescriptor);
            }
            if (iy8 == null) {
                this.w = false;
                try {
                    q11 b = q11.b();
                    r69 r69 = this.y;
                    b.c(((y19) r69.w).w, r69.y);
                } catch (IllegalArgumentException unused) {
                }
            } else {
                r19 r192 = ((y19) this.y.w).C;
                y19.g(r192);
                r192.l1(new f69(this, iy8, 0));
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        y19 y19 = (y19) this.y.w;
        r19 r19 = y19.C;
        y19.g(r19);
        r19.h1();
        pz8 pz8 = y19.B;
        y19.g(pz8);
        pz8.I.a("Service disconnected");
        r19 r192 = y19.C;
        y19.g(r192);
        r192.l1(new c49(6, (Object) this, (Object) componentName));
    }
}
