package defpackage;

import java.lang.reflect.Method;

/* renamed from: rq0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rq0 {
    public final int a;
    public final Method b;

    public rq0(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq0)) {
            return false;
        }
        rq0 rq0 = (rq0) obj;
        if (this.a != rq0.a || !this.b.getName().equals(rq0.b.getName())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
