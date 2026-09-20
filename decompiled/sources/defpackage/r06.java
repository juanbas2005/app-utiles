package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* renamed from: r06  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r06 extends l16 {
    public final Type a;
    public final l16 b;
    public final a42 c;

    public r06(Type type) {
        l16 l16;
        l16 r06;
        this.a = type;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            genericComponentType.getClass();
            boolean z = genericComponentType instanceof Class;
            if (z) {
                Class cls = (Class) genericComponentType;
                if (cls.isPrimitive()) {
                    l16 = new j16(cls);
                    this.b = l16;
                    this.c = a42.w;
                }
            }
            if ((genericComponentType instanceof GenericArrayType) || (z && ((Class) genericComponentType).isArray())) {
                r06 = new r06(genericComponentType);
            } else if (genericComponentType instanceof WildcardType) {
                r06 = new o16((WildcardType) genericComponentType);
            } else {
                r06 = new a16(genericComponentType);
            }
        } else {
            if (type instanceof Class) {
                Class cls2 = (Class) type;
                if (cls2.isArray()) {
                    Class<?> componentType = cls2.getComponentType();
                    componentType.getClass();
                    if (componentType.isPrimitive()) {
                        r06 = new j16(componentType);
                    } else if ((componentType instanceof GenericArrayType) || componentType.isArray()) {
                        r06 = new r06(componentType);
                    } else if (componentType instanceof WildcardType) {
                        r06 = new o16((WildcardType) componentType);
                    } else {
                        r06 = new a16(componentType);
                    }
                }
            }
            Class<?> cls3 = type.getClass();
            throw new IllegalArgumentException("Not an array type (" + cls3 + "): " + type);
        }
        l16 = r06;
        this.b = l16;
        this.c = a42.w;
    }

    public final Type b() {
        return this.a;
    }

    public final Collection getAnnotations() {
        return this.c;
    }
}
