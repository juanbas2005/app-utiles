package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: cg3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cg3 extends sj0 {
    public cg3(Method method) {
        super(method, sg3.D(method.getDeclaringClass()));
    }

    public final Object d(Object[] objArr) {
        Object[] objArr2;
        e(objArr.length);
        Object obj = objArr[0];
        if (objArr.length <= 1) {
            objArr2 = new Object[0];
        } else {
            objArr2 = qs.Q0(objArr, 1, objArr.length);
        }
        return ((Method) this.c).invoke(obj, Arrays.copyOf(objArr2, objArr2.length));
    }
}
