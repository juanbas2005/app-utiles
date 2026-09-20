package defpackage;

/* renamed from: bx1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bx1 implements ku5 {
    public static final Object c = new Object();
    public volatile cb2 a;
    public volatile Object b;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, bx1, ku5] */
    public static ku5 a(cb2 cb2) {
        if (cb2 instanceof bx1) {
            return cb2;
        }
        ? obj = new Object();
        obj.b = c;
        obj.a = cb2;
        return obj;
    }

    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.b;
            if (obj == obj3) {
                obj = this.a.get();
                Object obj4 = this.b;
                if (obj4 != obj3) {
                    if (obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                }
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }
}
