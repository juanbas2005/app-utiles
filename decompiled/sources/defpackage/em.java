package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: em  reason: default package */
public final class em implements InvocationHandler {
    public final Class a;
    public final Map b;
    public final z97 c;
    public final z97 d;
    public final List e;

    public em(Class cls, Map map, z97 z97, z97 z972, List list) {
        this.a = cls;
        this.b = map;
        this.c = z97;
        this.d = z972;
        this.e = list;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Annotation annotation;
        Class cls;
        boolean z;
        String name = method.getName();
        Class cls2 = this.a;
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -1776922004) {
                if (hashCode != 147696667) {
                    if (hashCode == 1444986633 && name.equals("annotationType")) {
                        return cls2;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) this.d.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) this.c.getValue();
            }
        }
        boolean e2 = sg3.e(name, "equals");
        Map map = this.b;
        boolean z2 = false;
        if (e2 && objArr != null && objArr.length == 1) {
            Object j1 = qs.j1(objArr);
            if (j1 instanceof Annotation) {
                annotation = (Annotation) j1;
            } else {
                annotation = null;
            }
            if (annotation != null) {
                cls = kl8.u(kl8.p(annotation));
            } else {
                cls = null;
            }
            if (sg3.e(cls, cls2)) {
                List list = this.e;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Method method2 = (Method) it.next();
                        Object obj2 = map.get(method2.getName());
                        Object invoke = method2.invoke(j1, (Object[]) null);
                        if (obj2 instanceof boolean[]) {
                            invoke.getClass();
                            z = Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
                            continue;
                        } else if (obj2 instanceof char[]) {
                            invoke.getClass();
                            z = Arrays.equals((char[]) obj2, (char[]) invoke);
                            continue;
                        } else if (obj2 instanceof byte[]) {
                            invoke.getClass();
                            z = Arrays.equals((byte[]) obj2, (byte[]) invoke);
                            continue;
                        } else if (obj2 instanceof short[]) {
                            invoke.getClass();
                            z = Arrays.equals((short[]) obj2, (short[]) invoke);
                            continue;
                        } else if (obj2 instanceof int[]) {
                            invoke.getClass();
                            z = Arrays.equals((int[]) obj2, (int[]) invoke);
                            continue;
                        } else if (obj2 instanceof float[]) {
                            invoke.getClass();
                            z = Arrays.equals((float[]) obj2, (float[]) invoke);
                            continue;
                        } else if (obj2 instanceof long[]) {
                            invoke.getClass();
                            z = Arrays.equals((long[]) obj2, (long[]) invoke);
                            continue;
                        } else if (obj2 instanceof double[]) {
                            invoke.getClass();
                            z = Arrays.equals((double[]) obj2, (double[]) invoke);
                            continue;
                        } else if (obj2 instanceof Object[]) {
                            invoke.getClass();
                            z = Arrays.equals((Object[]) obj2, (Object[]) invoke);
                            continue;
                        } else {
                            z = sg3.e(obj2, invoke);
                            continue;
                        }
                        if (!z) {
                            break;
                        }
                    }
                }
                z2 = true;
            }
            return Boolean.valueOf(z2);
        } else if (map.containsKey(name)) {
            return map.get(name);
        } else {
            StringBuilder sb = new StringBuilder("Method is not supported: ");
            sb.append(method);
            sb.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb.append(qs.p1(objArr));
            sb.append(')');
            throw new Error(sb.toString());
        }
    }
}
