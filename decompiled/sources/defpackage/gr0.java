package defpackage;

import android.view.View;

/* renamed from: gr0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class gr0 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q42 b;

    public /* synthetic */ gr0(q42 q42, int i) {
        this.a = i;
        this.b = q42;
    }

    public final void onFocusChange(View view, boolean z) {
        int i = this.a;
        q42 q42 = this.b;
        switch (i) {
            case b85.b:
                jr0 jr0 = (jr0) q42;
                jr0.s(jr0.t());
                return;
            default:
                n02 n02 = (n02) q42;
                n02.l = z;
                n02.p();
                if (!z) {
                    n02.s(false);
                    n02.m = false;
                    return;
                }
                return;
        }
    }
}
