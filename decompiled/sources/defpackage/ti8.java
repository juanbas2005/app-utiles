package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ti8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ti8 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gt8 b;

    public /* synthetic */ ti8(gt8 gt8, int i) {
        this.a = i;
        this.b = gt8;
    }

    public final /* synthetic */ Object call() {
        int i = this.a;
        gt8 gt8 = this.b;
        switch (i) {
            case b85.b:
                return new v39(gt8.c);
            default:
                return new v39(gt8.d);
        }
    }
}
