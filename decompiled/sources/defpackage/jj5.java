package defpackage;

import java.lang.reflect.Method;

/* renamed from: jj5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class jj5 {
    public static final Method a;
    public static final Method b;

    static {
        Method method;
        Method method2;
        Class cls;
        Class<Throwable> cls2 = Throwable.class;
        Method[] methods = cls2.getMethods();
        methods.getClass();
        int length = methods.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            method = null;
            if (i2 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i2];
            if (sg3.e(method2.getName(), "addSuppressed")) {
                Class[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                if (parameterTypes.length == 1) {
                    cls = parameterTypes[0];
                } else {
                    cls = null;
                }
                if (sg3.e(cls, cls2)) {
                    break;
                }
            }
            i2++;
        }
        a = method2;
        int length2 = methods.length;
        while (true) {
            if (i >= length2) {
                break;
            }
            Method method3 = methods[i];
            if (sg3.e(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i++;
        }
        b = method;
    }
}
