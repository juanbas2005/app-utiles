package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;

/* renamed from: h79  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h79 extends xq8 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h79(Object obj, a39 a39, int i) {
        super(a39);
        this.e = i;
        this.f = obj;
    }

    public final void a() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case b85.b:
                r38 r38 = (r38) obj;
                o79 o79 = (o79) r38.z;
                o79.b1();
                y19 y19 = (y19) o79.w;
                y19.G.getClass();
                r38.e(false, false, SystemClock.elapsedRealtime());
                ev8 ev8 = y19.J;
                y19.d(ev8);
                y19.G.getClass();
                ev8.f1(SystemClock.elapsedRealtime());
                return;
            case 1:
                w79 w79 = (w79) obj;
                w79.h1();
                pz8 pz8 = ((y19) w79.w).B;
                y19.g(pz8);
                pz8.J.a("Starting upload from DelayedRunnable");
                w79.x.l();
                return;
            default:
                v89 v89 = (v89) obj;
                v89.n0().b1();
                String str = (String) v89.M.pollFirst();
                if (str != null) {
                    v89.Q().getClass();
                    v89.e0 = SystemClock.elapsedRealtime();
                    v89.G().J.b("Sending trigger URI notification to app", str);
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    Context context = v89.H.w;
                    if (Build.VERSION.SDK_INT < 34) {
                        context.sendBroadcast(intent);
                    } else {
                        context.sendBroadcast(intent, (String) null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                    }
                }
                v89.D();
                return;
        }
    }
}
