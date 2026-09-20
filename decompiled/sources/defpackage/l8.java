package defpackage;

import android.content.res.Configuration;

/* renamed from: l8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class l8 implements v31 {
    public final /* synthetic */ int a;
    public final /* synthetic */ op5 b;

    public /* synthetic */ l8(op5 op5, int i) {
        this.a = i;
        this.b = op5;
    }

    public final void accept(Object obj) {
        boolean z;
        int i = this.a;
        op5 op5 = this.b;
        switch (i) {
            case b85.b:
                Configuration configuration = (Configuration) obj;
                op5.getClass();
                configuration.getClass();
                if ((configuration.uiMode & 48) == 32) {
                    z = true;
                } else {
                    z = false;
                }
                op5.c(Boolean.valueOf(z));
                return;
            default:
                op5.c((pb8) obj);
                return;
        }
    }
}
