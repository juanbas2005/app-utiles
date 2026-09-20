package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.reflection.Consumer2;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: eo4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class eo4 implements v31, Consumer2 {
    public final Context a;
    public final ReentrantLock b = new ReentrantLock();
    public pb8 c;
    public final LinkedHashSet d = new LinkedHashSet();

    public eo4(Context context) {
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

    public final void accept(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
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
