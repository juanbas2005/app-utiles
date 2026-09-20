package defpackage;

import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ha2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ha2 extends ga2 {
    public final ReentrantLock g = new ReentrantLock();
    public final LinkedHashMap h = new LinkedHashMap();
    public final LinkedHashMap i = new LinkedHashMap();

    public ha2(WindowLayoutComponent windowLayoutComponent, ns8 ns8) {
        super(windowLayoutComponent, ns8);
    }

    public final void a(Context context, or orVar, l8 l8Var) {
        LinkedHashMap linkedHashMap = this.h;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            eo4 eo4 = (eo4) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.i;
            if (eo4 != null) {
                eo4.a(l8Var);
                linkedHashMap2.put(l8Var, context);
            } else {
                Consumer eo42 = new eo4(context);
                linkedHashMap.put(context, eo42);
                linkedHashMap2.put(l8Var, context);
                eo42.a(l8Var);
                this.a.addWindowLayoutInfoListener(context, eo42);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(l8 l8Var) {
        LinkedHashMap linkedHashMap = this.h;
        LinkedHashMap linkedHashMap2 = this.i;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(l8Var);
            if (context != null) {
                Consumer consumer = (eo4) linkedHashMap.get(context);
                if (consumer == null) {
                    reentrantLock.unlock();
                    return;
                }
                reentrantLock = consumer.b;
                reentrantLock.lock();
                consumer.d.remove(l8Var);
                reentrantLock.unlock();
                linkedHashMap2.remove(l8Var);
                if (consumer.d.isEmpty()) {
                    linkedHashMap.remove(context);
                    this.a.removeWindowLayoutInfoListener(consumer);
                }
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            reentrantLock.unlock();
        }
    }
}
