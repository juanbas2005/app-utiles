package defpackage;

import java.util.concurrent.Callable;

/* renamed from: fw8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class fw8 implements Callable {
    public static final /* synthetic */ fw8 b = new fw8(0);
    public static final /* synthetic */ fw8 c = new fw8(1);
    public final /* synthetic */ int a;

    public /* synthetic */ fw8(int i) {
        this.a = i;
    }

    public final Object call() {
        switch (this.a) {
            case b85.b:
                j69 j69 = new j69("internal.platform", 4);
                j69.x.put("getVersion", new j69("getVersion", 3));
                return j69;
            default:
                return null;
        }
    }
}
