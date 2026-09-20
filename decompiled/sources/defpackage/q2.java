package defpackage;

/* renamed from: q2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class q2 implements zr3 {
    public zr3 a(gy0 gy0, String str) {
        z53 a = gy0.a();
        gq3 c = c();
        a.getClass();
        c.getClass();
        mp7.a0(1, (Object) null);
        return null;
    }

    public zr3 b(j42 j42, Object obj) {
        obj.getClass();
        z53 a = j42.a();
        gq3 c = c();
        a.getClass();
        c.getClass();
        if (!c.L(obj)) {
            return null;
        }
        mp7.a0(1, (Object) null);
        return null;
    }

    public abstract gq3 c();

    public final Object deserialize(ok1 ok1) {
        ll6 descriptor = getDescriptor();
        gy0 c = ok1.c(descriptor);
        Object obj = null;
        String str = null;
        while (true) {
            int h = c.h(getDescriptor());
            if (h != -1) {
                if (h == 0) {
                    str = c.n(getDescriptor(), h);
                } else if (h != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb.append(str);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(h);
                    throw new IllegalArgumentException(sb.toString());
                } else if (str != null) {
                    obj = c.r(getDescriptor(), h, c35.f(this, c, str), (Object) null);
                } else {
                    h.q("Cannot read polymorphic value before its type token");
                    return null;
                }
            } else if (obj != null) {
                c.b(descriptor);
                return obj;
            } else {
                h.j(b81.y("Polymorphic value has not been read for class ", str));
                return null;
            }
        }
    }

    public final void serialize(j42 j42, Object obj) {
        obj.getClass();
        zr3 g = c35.g(this, j42, obj);
        ll6 descriptor = getDescriptor();
        hy0 c = j42.c(descriptor);
        c.x(getDescriptor(), 0, g.getDescriptor().a());
        c.o(getDescriptor(), 1, g, obj);
        c.b(descriptor);
    }
}
