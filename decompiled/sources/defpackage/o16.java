package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* renamed from: o16  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o16 extends l16 {
    public final WildcardType a;

    public o16(WildcardType wildcardType) {
        this.a = wildcardType;
    }

    public final Type b() {
        return this.a;
    }

    public final l16 c() {
        WildcardType wildcardType = this.a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            kj6.k("Wildcard types with many bounds are not yet supported: ", wildcardType);
            return null;
        } else if (lowerBounds.length == 1) {
            Object j1 = qs.j1(lowerBounds);
            j1.getClass();
            Type type = (Type) j1;
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new j16(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                return new r06(type);
            }
            if (type instanceof WildcardType) {
                return new o16((WildcardType) type);
            }
            return new a16(type);
        } else {
            if (upperBounds.length == 1) {
                Type type2 = (Type) qs.j1(upperBounds);
                if (!sg3.e(type2, Object.class)) {
                    type2.getClass();
                    boolean z2 = type2 instanceof Class;
                    if (z2) {
                        Class cls2 = (Class) type2;
                        if (cls2.isPrimitive()) {
                            return new j16(cls2);
                        }
                    }
                    if ((type2 instanceof GenericArrayType) || (z2 && ((Class) type2).isArray())) {
                        return new r06(type2);
                    }
                    if (type2 instanceof WildcardType) {
                        return new o16((WildcardType) type2);
                    }
                    return new a16(type2);
                }
            }
            return null;
        }
    }

    public final Collection getAnnotations() {
        return a42.w;
    }
}
