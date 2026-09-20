package defpackage;

import android.os.RemoteException;
import java.util.Objects;

/* renamed from: v59  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v59 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ z99 x;
    public final /* synthetic */ r69 y;

    public v59(r69 r69, z99 z99) {
        this.w = 4;
        this.x = z99;
        Objects.requireNonNull(r69);
        this.y = r69;
    }

    public final void run() {
        int i = this.w;
        z99 z99 = this.x;
        r69 r69 = this.y;
        switch (i) {
            case b85.b:
                iy8 iy8 = r69.z;
                y19 y19 = (y19) r69.w;
                if (iy8 == null) {
                    pz8 pz8 = y19.B;
                    y19.g(pz8);
                    pz8.B.a("Failed to reset data on the service: not connected to service");
                    return;
                }
                try {
                    iy8.x(z99);
                } catch (RemoteException e) {
                    pz8 pz82 = y19.B;
                    y19.g(pz82);
                    pz82.B.b("Failed to reset data on the service: remote exception", e);
                }
                r69.p1();
                return;
            case 1:
                iy8 iy82 = r69.z;
                y19 y192 = (y19) r69.w;
                if (iy82 == null) {
                    pz8 pz83 = y192.B;
                    y19.g(pz83);
                    pz83.B.a("Discarding data. Failed to send app launch");
                    return;
                }
                try {
                    tp8 tp8 = y192.z;
                    ay8 ay8 = by8.W0;
                    if (tp8.n1((String) null, ay8)) {
                        r69.u1(iy82, (a3) null, z99);
                    }
                    iy82.h(z99);
                    y192.i().h1();
                    y192.z.n1((String) null, ay8);
                    r69.u1(iy82, (a3) null, z99);
                    r69.p1();
                    return;
                } catch (RemoteException e2) {
                    pz8 pz84 = y192.B;
                    y19.g(pz84);
                    pz84.B.b("Failed to send app launch to the service", e2);
                    return;
                }
            case 2:
                iy8 iy83 = r69.z;
                y19 y193 = (y19) r69.w;
                if (iy83 == null) {
                    pz8 pz85 = y193.B;
                    y19.g(pz85);
                    pz85.E.a("Failed to send app backgrounded");
                    return;
                }
                try {
                    iy83.A(z99);
                    r69.p1();
                    return;
                } catch (RemoteException e3) {
                    pz8 pz86 = y193.B;
                    y19.g(pz86);
                    pz86.B.b("Failed to send app backgrounded to the service", e3);
                    return;
                }
            case 3:
                iy8 iy84 = r69.z;
                y19 y194 = (y19) r69.w;
                if (iy84 == null) {
                    pz8 pz87 = y194.B;
                    y19.g(pz87);
                    pz87.B.a("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    iy84.C(z99);
                    r69.p1();
                    return;
                } catch (RemoteException e4) {
                    pz8 pz88 = y194.B;
                    y19.g(pz88);
                    pz88.B.b("Failed to send measurementEnabled to the service", e4);
                    return;
                }
            default:
                iy8 iy85 = r69.z;
                y19 y195 = (y19) r69.w;
                if (iy85 == null) {
                    pz8 pz89 = y195.B;
                    y19.g(pz89);
                    pz89.B.a("Failed to send consent settings to service");
                    return;
                }
                try {
                    iy85.q(z99);
                    r69.p1();
                    return;
                } catch (RemoteException e5) {
                    pz8 pz810 = y195.B;
                    y19.g(pz810);
                    pz810.B.b("Failed to send consent settings to the service", e5);
                    return;
                }
        }
    }

    public /* synthetic */ v59(r69 r69, z99 z99, int i) {
        this.w = i;
        this.x = z99;
        this.y = r69;
    }
}
