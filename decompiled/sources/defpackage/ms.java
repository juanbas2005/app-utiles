package defpackage;

/* renamed from: ms  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ms {
    public static final int a;

    static {
        Object obj;
        int i;
        Object obj2 = null;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            if (property != null) {
                obj = k57.v0(property);
            } else {
                obj = null;
            }
        } catch (Throwable th) {
            obj = new m66(th);
        }
        if (!(obj instanceof m66)) {
            obj2 = obj;
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 2097152;
        }
        a = i;
    }
}
