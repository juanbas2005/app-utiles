package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "Lv31;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "value", "Lvs7;", "accept", "(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class MulticastConsumer implements v31 {
    public final Context a;
    public final ReentrantLock b = new ReentrantLock();
    public pb8 c;
    public final LinkedHashSet d = new LinkedHashSet();

    public MulticastConsumer(Context context) {
        this.a = context;
    }

    public final void a(l8 l8Var) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            pb8 pb8 = this.c;
            if (pb8 != null) {
                l8Var.accept(pb8);
            }
            this.d.add(l8Var);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void accept(WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            pb8 c2 = na2.c(this.a, windowLayoutInfo);
            this.c = c2;
            for (v31 accept : this.d) {
                accept.accept(c2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
