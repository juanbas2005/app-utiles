package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: wl1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wl1 implements iz2, jz2 {
    public final oz3 a;
    public final Context b;
    public final nu5 c;
    public final Set d;
    public final Executor e;

    public wl1(Context context, String str, Set set, nu5 nu5, Executor executor) {
        this.a = new oz3(new bw0(1, context, str));
        this.d = set;
        this.e = executor;
        this.c = nu5;
        this.b = context;
    }

    public final yb9 a() {
        if (!i75.h(this.b)) {
            return b35.l("");
        }
        return b35.d(this.e, new vl1(this, 0));
    }

    public final void b() {
        if (this.d.size() <= 0) {
            b35.l((Object) null);
        } else if (!i75.h(this.b)) {
            b35.l((Object) null);
        } else {
            b35.d(this.e, new vl1(this, 1));
        }
    }
}
