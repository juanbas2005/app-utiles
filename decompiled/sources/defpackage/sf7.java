package defpackage;

import android.view.View;
import java.util.concurrent.Executor;

/* renamed from: sf7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class sf7 implements Executor {
    public final /* synthetic */ View w;

    public /* synthetic */ sf7(View view) {
        this.w = view;
    }

    public final void execute(Runnable runnable) {
        this.w.postOnAnimation(runnable);
    }
}
