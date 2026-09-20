package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: x06  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x06 extends c16 implements ci3, gi3, yj3 {
    public final Class a;

    public x06(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    public final n06 a(up2 up2) {
        Annotation[] declaredAnnotations;
        up2.getClass();
        Class cls = this.a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return za5.o(declaredAnnotations, up2);
    }

    public final List b() {
        Field[] declaredFields = this.a.getDeclaredFields();
        declaredFields.getClass();
        return cl6.V(new wl7(new ae2(qs.E0(declaredFields), false, u06.D), v06.D));
    }

    public final up2 c() {
        return m06.a(this.a).a();
    }

    public final List d() {
        Method[] declaredMethods = this.a.getDeclaredMethods();
        declaredMethods.getClass();
        return cl6.V(new wl7(new ae2(qs.E0(declaredMethods), true, new b0(29, this)), w06.D));
    }

    public final uq4 e() {
        Class cls = this.a;
        if (cls.isAnonymousClass()) {
            return uq4.e(d57.e1(cls.getName()));
        }
        return uq4.e(cls.getSimpleName());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x06)) {
            return false;
        }
        if (sg3.e(this.a, ((x06) obj).a)) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final ArrayList f() {
        Class cls = this.a;
        cls.getClass();
        am6 am6 = fd1.n;
        Object[] objArr = null;
        if (am6 == null) {
            Class<Class> cls2 = Class.class;
            try {
                am6 = new am6(cls2.getMethod("isSealed", (Class[]) null), cls2.getMethod("getPermittedSubclasses", (Class[]) null), cls2.getMethod("isRecord", (Class[]) null), cls2.getMethod("getRecordComponents", (Class[]) null), 15);
            } catch (NoSuchMethodException unused) {
                am6 = new am6((Object) null, (Object) null, (Object) null, (Object) null, 15);
            }
            fd1.n = am6;
        }
        Method method = (Method) am6.A;
        if (method != null) {
            objArr = method.invoke(cls, (Object[]) null);
        }
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object k16 : objArr) {
            arrayList.add(new k16(k16));
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final boolean g() {
        Class cls = this.a;
        cls.getClass();
        am6 am6 = fd1.n;
        Boolean bool = null;
        if (am6 == null) {
            Class<Class> cls2 = Class.class;
            try {
                am6 = new am6(cls2.getMethod("isSealed", (Class[]) null), cls2.getMethod("getPermittedSubclasses", (Class[]) null), cls2.getMethod("isRecord", (Class[]) null), cls2.getMethod("getRecordComponents", (Class[]) null), 15);
            } catch (NoSuchMethodException unused) {
                am6 = new am6((Object) null, (Object) null, (Object) null, (Object) null, 15);
            }
            fd1.n = am6;
        }
        Method method = (Method) am6.z;
        if (method != null) {
            Object invoke = method.invoke(cls, (Object[]) null);
            invoke.getClass();
            bool = invoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class cls = this.a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return a42.w;
        }
        return za5.p(declaredAnnotations);
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

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return x06.class.getName() + ": " + this.a;
    }
}
