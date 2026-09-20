package defpackage;

import java.util.Iterator;

/* renamed from: x0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class x0 implements zr3 {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract Iterator c(Object obj);

    public abstract int d(Object obj);

    public Object deserialize(ok1 ok1) {
        return e(ok1);
    }

    public final Object e(ok1 ok1) {
        Object a = a();
        int b = b(a);
        gy0 c = ok1.c(getDescriptor());
        while (true) {
            int h = c.h(getDescriptor());
            if (h != -1) {
                f(c, h + b, a);
            } else {
                c.b(getDescriptor());
                return h(a);
            }
        }
    }

    public abstract void f(gy0 gy0, int i, Object obj);

    public abstract Object g(Object obj);

    public abstract Object h(Object obj);
}
