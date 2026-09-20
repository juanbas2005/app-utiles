package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* renamed from: t09  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t09 implements ServiceConnection {
    public final String w;
    public final /* synthetic */ v09 x;

    public t09(v09 v09, String str) {
        Objects.requireNonNull(v09);
        this.x = v09;
        this.w = str;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [gg8] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ls8 ls8;
        v09 v09 = this.x;
        if (iBinder != null) {
            try {
                int i = ks8.d;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                if (queryLocalInterface instanceof ls8) {
                    ls8 = (ls8) queryLocalInterface;
                } else {
                    ls8 = new gg8(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 3);
                }
                y19 y19 = v09.w;
                pz8 pz8 = y19.B;
                y19.g(pz8);
                pz8.J.a("Install Referrer Service connected");
                r19 r19 = y19.C;
                y19.g(r19);
                r19.l1(new nt2(this, ls8, this));
            } catch (RuntimeException e) {
                pz8 pz82 = v09.w.B;
                y19.g(pz82);
                pz82.E.b("Exception occurred while calling Install Referrer API", e);
            }
        } else {
            pz8 pz83 = v09.w.B;
            y19.g(pz83);
            pz83.E.a("Install Referrer connection returned with null binder");
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        pz8 pz8 = this.x.w.B;
        y19.g(pz8);
        pz8.J.a("Install Referrer Service disconnected");
    }
}
