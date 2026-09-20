package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: a16  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a16 extends l16 {
    public final Type a;
    public final gi3 b;

    public a16(Type type) {
        gi3 gi3;
        type.getClass();
        this.a = type;
        if (type instanceof Class) {
            gi3 = new x06((Class) type);
        } else if (type instanceof TypeVariable) {
            gi3 = new m16((TypeVariable) type);
        } else if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            gi3 = new x06((Class) rawType);
        } else {
            ku4.A("Not a classifier type (", type.getClass(), "): ", type);
            throw null;
        }
        this.b = gi3;
    }

    public final n06 a(up2 up2) {
        up2.getClass();
        return null;
    }

    public final Type b() {
        return this.a;
    }

    public final ArrayList c() {
        Object obj;
        Object r06;
        List<Type> c = m06.c(this.a);
        ArrayList arrayList = new ArrayList(et0.e0(c, 10));
        for (Type type : c) {
            type.getClass();
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    obj = new j16(cls);
                    arrayList.add(obj);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                r06 = new r06(type);
            } else if (type instanceof WildcardType) {
                r06 = new o16((WildcardType) type);
            } else {
                r06 = new a16(type);
            }
            obj = r06;
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final boolean d() {
        boolean z;
        Type type = this.a;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            typeParameters.getClass();
            if (typeParameters.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    public final Collection getAnnotations() {
        return a42.w;
    }
}
