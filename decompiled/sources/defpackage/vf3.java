package defpackage;

import android.os.Bundle;
import java.io.Serializable;

/* renamed from: vf3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vf3 extends bv4 {
    public final Class q;
    public final Class r;

    public vf3(Class cls) {
        super(true);
        this.q = cls;
        if (!Serializable.class.isAssignableFrom(cls)) {
            rf2.p(cls, " does not implement Serializable.");
            throw null;
        } else if (cls.isEnum()) {
            this.r = cls;
        } else {
            rf2.p(cls, " is not an Enum type.");
            throw null;
        }
    }

    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        Object obj = bundle.get(str);
        if (obj instanceof Serializable) {
            return (Serializable) obj;
        }
        return null;
    }

    public final String b() {
        return this.r.getName();
    }

    public final Object c(String str) {
        Enum enumR = null;
        if (str.equals("null")) {
            return null;
        }
        Class cls = this.r;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj = enumConstants[i];
            Enum enumR2 = (Enum) obj;
            enumR2.getClass();
            if (k57.n0(enumR2.name(), str, true)) {
                enumR = obj;
                break;
            }
            i++;
        }
        Enum enumR3 = enumR;
        if (enumR3 != null) {
            return enumR3;
        }
        StringBuilder q2 = b81.q("Enum value ", str, " not found for type ");
        q2.append(cls.getName());
        q2.append('.');
        throw new IllegalArgumentException(q2.toString());
    }

    public final void e(Bundle bundle, String str, Object obj) {
        str.getClass();
        bundle.putSerializable(str, (Serializable) this.q.cast((Serializable) obj));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf3)) {
            return false;
        }
        return this.q.equals(((vf3) obj).q);
    }

    public final int hashCode() {
        return this.q.hashCode();
    }
}
