package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: n06  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n06 extends c16 {
    public final Annotation a;

    public n06(Annotation annotation) {
        annotation.getClass();
        this.a = annotation;
    }

    public final ArrayList b() {
        Object obj;
        Annotation annotation = this.a;
        Method[] declaredMethods = kl8.u(kl8.p(annotation)).getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object invoke = method.invoke(annotation, (Object[]) null);
            invoke.getClass();
            uq4 e = uq4.e(method.getName());
            Class<?> cls = invoke.getClass();
            List list = m06.a;
            if (Enum.class.isAssignableFrom(cls)) {
                obj = new d16(e, (Enum) invoke);
            } else if (invoke instanceof Annotation) {
                obj = new p06(e, (Annotation) invoke);
            } else if (invoke instanceof Object[]) {
                obj = new q06(e, (Object[]) invoke);
            } else if (invoke instanceof Class) {
                obj = new z06(e, (Class) invoke);
            } else {
                obj = new f16(e, invoke);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n06) || this.a != ((n06) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    public final String toString() {
        return n06.class.getName() + ": " + this.a;
    }
}
