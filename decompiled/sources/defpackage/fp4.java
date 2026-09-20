package defpackage;

/* renamed from: fp4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fp4 extends bf4 implements dr3 {
    public Object A;
    public final bg5 z;

    public fp4(bg5 bg5, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.z = bg5;
        this.A = obj2;
    }

    public final Object getValue() {
        return this.A;
    }

    public final Object setValue(Object obj) {
        int i;
        Object obj2 = this.A;
        this.A = obj;
        zf5 zf5 = (zf5) this.z.x;
        yf5 yf5 = zf5.z;
        Object obj3 = this.x;
        if (!yf5.containsKey(obj3)) {
            return obj2;
        }
        boolean z2 = zf5.y;
        if (!z2) {
            yf5.put(obj3, obj);
        } else if (z2) {
            sn7 sn7 = zf5.w[zf5.x];
            Object obj4 = sn7.w[sn7.y];
            yf5.put(obj3, obj);
            if (obj4 != null) {
                i = obj4.hashCode();
            } else {
                i = 0;
            }
            zf5.c(i, yf5.y, obj4, 0);
        } else {
            rf2.c();
            return null;
        }
        zf5.C = yf5.A;
        return obj2;
    }
}
