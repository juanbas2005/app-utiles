package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: nb9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class nb9 implements dt {
    public final /* synthetic */ kd6 a;
    public final /* synthetic */ int b;

    public /* synthetic */ nb9(kd6 kd6, int i) {
        this.a = kd6;
        this.b = i;
    }

    public final /* synthetic */ ListenableFuture apply(Object obj) {
        Throwable th = (Throwable) obj;
        return this.a.S0(this.b);
    }
}
