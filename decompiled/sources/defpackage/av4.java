package defpackage;

import android.os.Bundle;
import java.io.Serializable;

/* renamed from: av4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class av4 extends bv4 {
    public final Class q;

    public av4(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            rf2.p(cls, " does not implement Serializable.");
            throw null;
        } else if (!cls.isEnum()) {
            this.q = cls;
        } else {
            rf2.p(cls, " is an Enum. You should use EnumType instead.");
            throw null;
        }
    }

    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        return (Serializable) bundle.get(str);
    }

    public String b() {
        return this.q.getName();
    }

    public final void e(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        str.getClass();
        serializable.getClass();
        this.q.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av4)) {
            return false;
        }
        return sg3.e(this.q, ((av4) obj).q);
    }

    /* renamed from: g */
    public Serializable c(String str) {
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.q.hashCode();
    }

    public av4(int i, Class cls) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.q = cls;
        } else {
            rf2.p(cls, " does not implement Serializable.");
            throw null;
        }
    }
}
