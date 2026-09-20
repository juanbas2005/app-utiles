package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: af2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class af2 implements k55 {
    public final /* synthetic */ int w;
    public final /* synthetic */ FirebaseMessaging x;

    public /* synthetic */ af2(FirebaseMessaging firebaseMessaging, int i) {
        this.w = i;
        this.x = firebaseMessaging;
    }

    public final void g(Object obj) {
        boolean z;
        int i = this.w;
        FirebaseMessaging firebaseMessaging = this.x;
        switch (i) {
            case b85.b /*0*/:
                pk7 pk7 = (pk7) obj;
                if (firebaseMessaging.f.e() && pk7.g.a() != null) {
                    synchronized (pk7) {
                        z = pk7.f;
                    }
                    if (!z) {
                        pk7.c(0);
                        return;
                    }
                    return;
                }
                return;
            default:
                ns0 ns0 = (ns0) obj;
                if (ns0 != null) {
                    sg3.G(ns0.w);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
