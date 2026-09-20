package defpackage;

/* renamed from: cx1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cx1 implements lu5 {
    public static final Object c = new Object();
    public volatile lu5 a;
    public volatile Object b = c;

    public cx1(lu5 lu5) {
        this.a = lu5;
    }

    public static lu5 a(lu5 lu5) {
        if (lu5 instanceof cx1) {
            return lu5;
        }
        return new cx1(lu5);
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
