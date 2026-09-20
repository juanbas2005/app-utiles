package defpackage;

import java.lang.reflect.Type;
import java.util.Iterator;

/* renamed from: l16  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class l16 implements ci3 {
    public n06 a(up2 up2) {
        Object obj;
        up2.getClass();
        Iterator it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (sg3.e(m06.a(kl8.u(kl8.p(((n06) obj).a))).a(), up2)) {
                break;
            }
        }
        return (n06) obj;
    }

    public abstract Type b();

    public final boolean equals(Object obj) {
        if (!(obj instanceof l16) || !sg3.e(b(), ((l16) obj).b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
