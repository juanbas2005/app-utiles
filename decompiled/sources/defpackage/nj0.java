package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* renamed from: nj0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class nj0 extends sj0 {
    public final boolean e;
    public final boolean f;

    /* JADX WARNING: Illegal instructions before constructor call */
    public nj0(Field field, boolean z, boolean z2) {
        super(field, r0, r3);
        Type[] typeArr;
        Class cls = Void.TYPE;
        cls.getClass();
        if (z2) {
            Class<?> declaringClass = field.getDeclaringClass();
            declaringClass.getClass();
            Type genericType = field.getGenericType();
            genericType.getClass();
            typeArr = new Type[]{declaringClass, genericType};
        } else {
            Type genericType2 = field.getGenericType();
            genericType2.getClass();
            typeArr = new Type[]{genericType2};
        }
        this.e = z;
        this.f = z2;
    }

    public Object d(Object[] objArr) {
        Object obj;
        f(objArr);
        Field field = (Field) this.c;
        if (this.f) {
            obj = qs.W0(objArr);
        } else {
            obj = null;
        }
        field.set(obj, qs.g1(objArr));
        return vs7.a;
    }

    public void f(Object[] objArr) {
        e(objArr.length);
        if (this.e && qs.g1(objArr) == null) {
            h.q("null is not allowed as a value for this property.");
        }
    }
}
