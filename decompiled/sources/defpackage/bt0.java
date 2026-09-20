package defpackage;

import java.util.Iterator;

/* renamed from: bt0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class bt0 extends x0 {
    public final zr3 a;

    public bt0(zr3 zr3) {
        this.a = zr3;
    }

    public void f(gy0 gy0, int i, Object obj) {
        i(i, obj, gy0.r(getDescriptor(), i, this.a, (Object) null));
    }

    public abstract void i(int i, Object obj, Object obj2);

    public void serialize(j42 j42, Object obj) {
        int d = d(obj);
        ll6 descriptor = getDescriptor();
        descriptor.getClass();
        hy0 c = j42.c(descriptor);
        Iterator c2 = c(obj);
        for (int i = 0; i < d; i++) {
            c.o(getDescriptor(), i, this.a, c2.next());
        }
        c.b(descriptor);
    }
}
