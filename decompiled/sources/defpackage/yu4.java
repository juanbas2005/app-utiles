package defpackage;

/* renamed from: yu4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yu4 extends av4 {
    public final Class r;

    public yu4(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.r = cls;
        } else {
            rf2.p(cls, " is not an Enum type.");
            throw null;
        }
    }

    public final String b() {
        return this.r.getName();
    }

    /* renamed from: h */
    public final Enum g(String str) {
        Enum enumR;
        Class cls = this.r;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                enumR = null;
                break;
            }
            enumR = enumConstants[i];
            if (k57.n0(((Enum) enumR).name(), str, true)) {
                break;
            }
            i++;
        }
        Enum enumR2 = enumR;
        if (enumR2 != null) {
            return enumR2;
        }
        StringBuilder q = b81.q("Enum value ", str, " not found for type ");
        q.append(cls.getName());
        q.append('.');
        throw new IllegalArgumentException(q.toString());
    }
}
