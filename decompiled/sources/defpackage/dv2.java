package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: dv2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dv2 implements GenericArrayType, Type {
    public final Type w;

    public dv2(Type type) {
        type.getClass();
        this.w = type;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GenericArrayType)) {
            return false;
        }
        if (sg3.e(this.w, ((GenericArrayType) obj).getGenericComponentType())) {
            return true;
        }
        return false;
    }

    public final Type getGenericComponentType() {
        return this.w;
    }

    public final String getTypeName() {
        return ar7.f(this.w) + "[]";
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
