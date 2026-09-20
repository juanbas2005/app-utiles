package defpackage;

/* renamed from: hm7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hm7 implements gm7 {
    public final Object a;
    public final Object b;

    public hm7(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final Object b() {
        return this.a;
    }

    public final Object d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gm7)) {
            return false;
        }
        gm7 gm7 = (gm7) obj;
        if (!sg3.e(this.a, gm7.b()) || !sg3.e(this.b, gm7.d())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        Object obj = this.a;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Object obj2 = this.b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i3 + i2;
    }
}
