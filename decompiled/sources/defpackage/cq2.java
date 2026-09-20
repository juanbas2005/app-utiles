package defpackage;

import android.content.Intent;
import android.content.res.Configuration;

/* renamed from: cq2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class cq2 implements v31 {
    public final /* synthetic */ int a;
    public final /* synthetic */ eq2 b;

    public /* synthetic */ cq2(eq2 eq2, int i) {
        this.a = i;
        this.b = eq2;
    }

    public final void accept(Object obj) {
        int i = this.a;
        eq2 eq2 = this.b;
        switch (i) {
            case b85.b:
                Configuration configuration = (Configuration) obj;
                eq2.R.n();
                return;
            default:
                Intent intent = (Intent) obj;
                eq2.R.n();
                return;
        }
    }
}
