package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: w31  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w31 implements InvocationHandler {
    public final gq3 a;
    public final fa2 b;

    public w31(gq3 gq3, fa2 fa2) {
        gq3.getClass();
        this.a = gq3;
        this.b = fa2;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        boolean e = sg3.e(method.getName(), "accept");
        fa2 fa2 = this.b;
        boolean z = false;
        if (e && objArr != null && objArr.length == 1) {
            Object obj2 = objArr[0];
            gq3 gq3 = this.a;
            gq3.getClass();
            if (gq3.L(obj2)) {
                obj2.getClass();
                fa2.y(obj2);
                return vs7.a;
            }
            throw new ClassCastException("Value cannot be cast to " + gq3.l());
        } else if (sg3.e(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            if (obj == objArr[0]) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else if (sg3.e(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(fa2.hashCode());
        } else {
            if (sg3.e(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                return fa2.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
    }
}
