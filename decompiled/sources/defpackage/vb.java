package defpackage;

import android.os.Handler;

/* renamed from: vb  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class vb implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ Object y;

    public /* synthetic */ vb(int i, Object obj, boolean z) {
        this.w = i;
        this.y = obj;
        this.x = z;
    }

    public final void run() {
        int i = this.w;
        boolean z = this.x;
        Object obj = this.y;
        switch (i) {
            case b85.b:
                ((wb) obj).a.d(z);
                return;
            case 1:
                ((xj0) obj).c.d(z);
                return;
            default:
                n43 n43 = (n43) ((to) obj).b;
                n43.b = z;
                if (n43.a) {
                    Handler handler = (Handler) n43.e;
                    handler.removeCallbacksAndMessages((Object) null);
                    if (n43.b) {
                        handler.postDelayed((yk0) n43.f, 300000);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
