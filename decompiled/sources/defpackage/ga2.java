package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ga2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ga2 extends ea2 {
    public final WindowLayoutComponent a;
    public final ns8 b;
    public final ReentrantLock c = new ReentrantLock();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();

    public ga2(WindowLayoutComponent windowLayoutComponent, ns8 ns8) {
        this.a = windowLayoutComponent;
        this.b = ns8;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [ct2, fa2] */
    public void a(Context context, or orVar, l8 l8Var) {
        LinkedHashMap linkedHashMap = this.d;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.e;
            if (multicastConsumer != null) {
                multicastConsumer.a(l8Var);
                linkedHashMap2.put(l8Var, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                linkedHashMap.put(context, multicastConsumer2);
                linkedHashMap2.put(l8Var, context);
                multicastConsumer2.a(l8Var);
                if (context instanceof Activity) {
                    this.f.put(multicastConsumer2, this.b.Q(this.a, b26.a.b(WindowLayoutInfo.class), (Activity) context, new ct2(1, multicastConsumer2, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0, 0)));
                } else {
                    multicastConsumer2.accept(new WindowLayoutInfo(a42.w));
                    reentrantLock.unlock();
                    return;
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            Throwable th2 = th;
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void b(l8 l8Var) {
        LinkedHashMap linkedHashMap = this.d;
        LinkedHashMap linkedHashMap2 = this.e;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(l8Var);
            if (context != null) {
                MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
                if (multicastConsumer == null) {
                    reentrantLock.unlock();
                    return;
                }
                LinkedHashSet linkedHashSet = multicastConsumer.d;
                reentrantLock = multicastConsumer.b;
                reentrantLock.lock();
                linkedHashSet.remove(l8Var);
                reentrantLock.unlock();
                linkedHashMap2.remove(l8Var);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    x31 x31 = (x31) this.f.remove(multicastConsumer);
                    if (x31 != null) {
                        x31.a.invoke(x31.b, new Object[]{x31.c});
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            reentrantLock.unlock();
        }
    }
}
