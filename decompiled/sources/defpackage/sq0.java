package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: sq0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sq0 {
    public static final sq0 c = new sq0();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, rq0 rq0, j54 j54, Class cls) {
        j54 j542 = (j54) hashMap.get(rq0);
        if (j542 != null && j54 != j542) {
            String name = rq0.b.getName();
            String name2 = cls.getName();
            h.q(f21.m(f21.o("Method ", name, " in ", name2, " already declared with different @OnLifecycleEvent value: previous value "), String.valueOf(j542), ", new value ", String.valueOf(j54)));
        } else if (j542 == null) {
            hashMap.put(rq0, j54);
        }
    }

    public final qq0 a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            qq0 qq0 = (qq0) hashMap2.get(superclass);
            if (qq0 == null) {
                qq0 = a(superclass, (Method[]) null);
            }
            hashMap.putAll(qq0.b);
        }
        for (Class cls2 : cls.getInterfaces()) {
            qq0 qq02 = (qq0) hashMap2.get(cls2);
            if (qq02 == null) {
                qq02 = a(cls2, (Method[]) null);
            }
            for (Map.Entry entry : qq02.b.entrySet()) {
                b(hashMap, (rq0) entry.getKey(), (j54) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            g55 g55 = (g55) method.getAnnotation(g55.class);
            if (g55 != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (t54.class.isAssignableFrom(parameterTypes[0])) {
                    i = 1;
                } else {
                    h.q("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    return null;
                }
                j54 value = g55.value();
                if (parameterTypes.length > 1) {
                    if (!j54.class.isAssignableFrom(parameterTypes[1])) {
                        h.q("invalid parameter type. second arg must be an event");
                        return null;
                    } else if (value == j54.ON_ANY) {
                        i = 2;
                    } else {
                        h.q("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new rq0(i, method), value, cls);
                    z = true;
                } else {
                    h.q("cannot have more than 2 params");
                    return null;
                }
            }
        }
        qq0 qq03 = new qq0(hashMap);
        hashMap2.put(cls, qq03);
        this.b.put(cls, Boolean.valueOf(z));
        return qq03;
    }
}
