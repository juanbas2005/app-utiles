package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;

/* renamed from: x21  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class x21 {
    public final qd8 a;
    public final Context b;
    public final Object c = new Object();
    public final LinkedHashSet d = new LinkedHashSet();
    public Object e;

    public x21(Context context, qd8 qd8) {
        this.a = qd8;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.e = obj;
                this.a.d.execute(new ga(11, (Object) dt0.b1(this.d), (Object) this));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
