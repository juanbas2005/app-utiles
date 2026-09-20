package defpackage;

/* renamed from: zq5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zq5 implements bt {
    public final jr3 w;
    public final String x;

    public zq5(jr3 jr3, String str) {
        jr3.getClass();
        str.getClass();
        this.w = jr3;
        this.x = str;
    }

    public final Object v(Object obj, Object obj2) {
        jr3 jr3 = this.w;
        Object obj3 = jr3.get(obj);
        if (obj3 == null) {
            jr3.E(obj, obj2);
            return null;
        } else if (obj3.equals(obj2)) {
            return null;
        } else {
            return obj3;
        }
    }
}
