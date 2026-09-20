package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: h16  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h16 extends g16 implements yj3 {
    public final Method a;

    public h16(Method method) {
        method.getClass();
        this.a = method;
    }

    public final Member b() {
        return this.a;
    }

    public final l16 f() {
        Type genericReturnType = this.a.getGenericReturnType();
        genericReturnType.getClass();
        boolean z = genericReturnType instanceof Class;
        if (z) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new j16(cls);
            }
        }
        if ((genericReturnType instanceof GenericArrayType) || (z && ((Class) genericReturnType).isArray())) {
            return new r06(genericReturnType);
        }
        if (genericReturnType instanceof WildcardType) {
            return new o16((WildcardType) genericReturnType);
        }
        return new a16(genericReturnType);
    }

    public final List g() {
        Method method = this.a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        parameterAnnotations.getClass();
        return d(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable m16 : typeParameters) {
            arrayList.add(new m16(m16));
        }
        return arrayList;
    }
}
