package defpackage;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: mv2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mv2 extends sb1 {
    public final Context c;
    public lb1 d;
    public Executor e;
    public CancellationSignal f;
    public final qb1 g = new qb1(this, new Handler(Looper.getMainLooper()), 1);

    public mv2(Context context) {
        context.getClass();
        this.c = context;
    }
}
