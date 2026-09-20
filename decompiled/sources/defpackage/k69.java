package defpackage;

import android.os.RemoteException;

/* renamed from: k69  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class k69 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ r69 x;

    public /* synthetic */ k69(r69 r69, int i) {
        this.w = i;
        this.x = r69;
    }

    public final void run() {
        int i = this.w;
        r69 r69 = this.x;
        switch (i) {
            case b85.b:
                r69.i1();
                return;
            case 1:
                y19 y19 = (y19) r69.w;
                iy8 iy8 = r69.z;
                if (iy8 == null) {
                    pz8 pz8 = y19.B;
                    y19.g(pz8);
                    pz8.B.a("Failed to send Dma consent settings to service");
                    return;
                }
                try {
                    iy8.D(r69.s1(false));
                    r69.p1();
                    return;
                } catch (RemoteException e) {
                    pz8 pz82 = y19.B;
                    y19.g(pz82);
                    pz82.B.b("Failed to send Dma consent settings to the service", e);
                    return;
                }
            default:
                y19 y192 = (y19) r69.w;
                iy8 iy82 = r69.z;
                if (iy82 == null) {
                    pz8 pz83 = y192.B;
                    y19.g(pz83);
                    pz83.B.a("Failed to send storage consent settings to service");
                    return;
                }
                try {
                    iy82.l(r69.s1(false));
                    r69.p1();
                    return;
                } catch (RemoteException e2) {
                    pz8 pz84 = y192.B;
                    y19.g(pz84);
                    pz84.B.b("Failed to send storage consent settings to the service", e2);
                    return;
                }
        }
    }
}
