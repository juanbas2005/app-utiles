package defpackage;

import androidx.datastore.preferences.protobuf.e;

/* renamed from: pu2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pu2 implements xj4 {
    public static final pu2 b = new pu2(0);
    public final /* synthetic */ int a;

    public /* synthetic */ pu2(int i) {
        this.a = i;
    }

    public final ew5 a(Class cls) {
        switch (this.a) {
            case b85.b:
                Class<e> cls2 = e.class;
                if (cls2.isAssignableFrom(cls)) {
                    try {
                        return (ew5) e.d(cls.asSubclass(cls2)).c(3);
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
                return e.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
