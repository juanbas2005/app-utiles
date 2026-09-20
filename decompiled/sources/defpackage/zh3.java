package defpackage;

import java.lang.reflect.Method;
import java.util.List;

/* renamed from: zh3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zh3 extends t16 {
    public final yh3 w;
    public final Method x;
    public final int y;
    public final nz3 z = rg3.y(i44.w, new k3(23, this));

    public zh3(yh3 yh3, Method method, int i) {
        method.getClass();
        this.w = yh3;
        this.x = method;
        this.y = i;
    }

    public final boolean C() {
        if (this.x.getDefaultValue() != null) {
            return true;
        }
        return false;
    }

    public final boolean D() {
        if (!getName().equals("value") || !this.x.getReturnType().isArray()) {
            return false;
        }
        return true;
    }

    public final p16 b() {
        return this.w;
    }

    public final boolean g() {
        return C();
    }

    public final List getAnnotations() {
        throw null;
    }

    public final String getName() {
        String name = this.x.getName();
        name.getClass();
        return name;
    }

    public final int s() {
        return this.y;
    }

    public final qr3 u() {
        return qr3.z;
    }

    public final as3 y() {
        return (as3) this.z.getValue();
    }
}
