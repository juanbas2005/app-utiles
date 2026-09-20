package defpackage;

import com.google.protobuf.b;

/* renamed from: ou2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ou2 implements wj4 {
    public static final ou2 b = new ou2(0);
    public final /* synthetic */ int a;

    public /* synthetic */ ou2(int i) {
        this.a = i;
    }

    public final dw5 a(Class cls) {
        switch (this.a) {
            case b85.b:
                Class<b> cls2 = b.class;
                if (cls2.isAssignableFrom(cls)) {
                    try {
                        return (dw5) b.l(cls.asSubclass(cls2)).k(3);
                    } catch (Exception e) {
                        ku4.o("Unable to get message info for ".concat(cls.getName()), e);
                        return null;
                    }
                } else {
                    h.q("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    public final boolean b(Class cls) {
        switch (this.a) {
            case b85.b:
                return b.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
