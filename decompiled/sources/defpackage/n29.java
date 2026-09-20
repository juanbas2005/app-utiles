package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: n29  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n29 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z99 b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ w29 d;

    public /* synthetic */ n29(w29 w29, z99 z99, Bundle bundle, int i) {
        this.a = i;
        this.b = z99;
        this.c = bundle;
        this.d = w29;
    }

    public final /* synthetic */ Object call() {
        int i = this.a;
        Bundle bundle = this.c;
        z99 z99 = this.b;
        w29 w29 = this.d;
        switch (i) {
            case b85.b:
                w29.d.T();
                return w29.d.b0(bundle, z99);
            default:
                w29.d.T();
                return w29.d.b0(bundle, z99);
        }
    }
}
