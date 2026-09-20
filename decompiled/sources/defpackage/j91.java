package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: j91  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j91 implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ k91 b;

    public j91(k91 k91, long j) {
        this.b = k91;
        this.a = j;
    }

    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.a);
        this.b.k.j(bundle);
        return null;
    }
}
