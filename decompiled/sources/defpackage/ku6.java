package defpackage;

/* renamed from: ku6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ku6 implements lu5 {
    public static final Object c = new Object();
    public volatile ud1 a;
    public volatile Object b;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, ku6, lu5] */
    public static lu5 a(ud1 ud1) {
        ? obj = new Object();
        obj.b = c;
        obj.a = ud1;
        return obj;
    }

    public final Object get() {
        Object obj = this.b;
        if (obj != c) {
            return obj;
        }
        ud1 ud1 = this.a;
        if (ud1 == null) {
            return this.b;
        }
        Object obj2 = ud1.get();
        this.b = obj2;
        this.a = null;
        return obj2;
    }
}
