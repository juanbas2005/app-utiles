package defpackage;

import java.util.ArrayList;

/* renamed from: xp3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xp3 implements nu3 {
    public static final ou3 c = new ou3(b26.a.b(xp3.class));
    public boolean a;
    public final ArrayList b = new ArrayList();

    public final ou3 b() {
        return c;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!xp3.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        xp3 xp3 = (xp3) obj;
        if (this.a == xp3.a && sg3.e(this.b, xp3.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
