package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* renamed from: n45  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n45 implements OnBackAnimationCallback {
    public final /* synthetic */ o45 a;

    public n45(o45 o45) {
        this.a = o45;
    }

    public final void onBackCancelled() {
        o45 o45 = this.a;
        rv4 rv4 = o45.a;
        if (rv4 != null) {
            if (!o45.b) {
                rv4.e(o45, (qv4) null);
            }
            rv4.d();
            if (rv4.c) {
                aw4 aw4 = rv4.d;
                aw4.getClass();
                if (o45.equals(aw4.h) && -1 == aw4.g) {
                    tv4 tv4 = aw4.f;
                    if (tv4 == null) {
                        tv4 = aw4.c(-1);
                    }
                    aw4.f = null;
                    aw4.g = 0;
                    aw4.h = null;
                    cw4 cw4 = cw4.a;
                    if (tv4 != null) {
                        tv4.d = cw4;
                        tv4.c();
                    }
                    d37 d37 = aw4.a;
                    d37.getClass();
                    d37.l((Object) null, cw4);
                }
            }
            o45.b = false;
            return;
        }
        h.s("This input is not added to any dispatcher.");
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        qv4 K = ag8.K(backEvent);
        o45 o45 = this.a;
        rv4 rv4 = o45.a;
        if (rv4 == null) {
            h.s("This input is not added to any dispatcher.");
        } else if (o45.b) {
            rv4.d();
            if (rv4.c) {
                aw4 aw4 = rv4.d;
                aw4.getClass();
                if (o45.equals(aw4.h) && -1 == aw4.g) {
                    tv4 tv4 = aw4.f;
                    if (tv4 == null) {
                        tv4 = aw4.c(-1);
                    }
                    if (tv4 != null) {
                        tv4.d = new dw4(K, -1);
                        tv4.e(K);
                    }
                    d37 d37 = aw4.a;
                    dw4 dw4 = new dw4(K, -1);
                    d37.getClass();
                    d37.l((Object) null, dw4);
                }
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        qv4 K = ag8.K(backEvent);
        o45 o45 = this.a;
        rv4 rv4 = o45.a;
        if (rv4 == null) {
            h.s("This input is not added to any dispatcher.");
        } else if (!o45.b) {
            rv4.e(o45, K);
            o45.b = true;
        }
    }
}
