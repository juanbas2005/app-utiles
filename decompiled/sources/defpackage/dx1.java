package defpackage;

/* renamed from: dx1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dx1 implements mu5 {
    public static final Object c = new Object();
    public volatile db2 a;
    public volatile Object b;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, dx1, mu5] */
    public static mu5 a(db2 db2) {
        if (db2 instanceof dx1) {
            return db2;
        }
        ? obj = new Object();
        obj.b = c;
        obj.a = db2;
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
            try {
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
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
