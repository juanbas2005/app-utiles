package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: jj0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class jj0 extends sj0 {
    public final boolean e;

    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.Object[]] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    public jj0(Method method, boolean z, Type[] typeArr) {
        super(method, r0, typeArr);
        Type genericReturnType = method.getGenericReturnType();
        genericReturnType.getClass();
        if (z) {
            be5 be5 = new be5(2);
            Class<?> declaringClass = method.getDeclaringClass();
            declaringClass.getClass();
            be5.a(declaringClass);
            be5.b(typeArr);
            ArrayList arrayList = be5.a;
            typeArr = arrayList.toArray(new Type[arrayList.size()]);
        }
        this.e = genericReturnType.equals(Void.TYPE);
    }

    public Object d(Object[] objArr) {
        Object obj;
        f(objArr);
        Field field = (Field) this.c;
        if (this.e) {
            obj = qs.W0(objArr);
        } else {
            obj = null;
        }
        return field.get(obj);
    }

    public Object h(Object obj, Object[] objArr) {
        objArr.getClass();
        Object invoke = ((Method) this.c).invoke(obj, Arrays.copyOf(objArr, objArr.length));
        if (this.e) {
            return vs7.a;
        }
        return invoke;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ jj0(Method method, boolean z, int i) {
        this(method, z, r3);
        z = (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public jj0(Field field, boolean z) {
        super(field, r0, r2);
        Type[] typeArr;
        Type genericType = field.getGenericType();
        genericType.getClass();
        if (z) {
            Class<?> declaringClass = field.getDeclaringClass();
            declaringClass.getClass();
            typeArr = new Type[]{declaringClass};
        } else {
            typeArr = new Type[0];
        }
        this.e = z;
    }
}
