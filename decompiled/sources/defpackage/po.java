package defpackage;

import android.window.OnBackInvokedCallback;

/* renamed from: po  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class po implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ po(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case b85.b:
                ((wo) obj).F();
                return;
            case 1:
                ((o45) obj).a();
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
