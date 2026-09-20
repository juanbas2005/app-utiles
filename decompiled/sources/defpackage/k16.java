package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* renamed from: k16  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k16 extends g16 {
    public final Object a;

    public k16(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.reflect.Method} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Member b() {
        Object obj = this.a;
        obj.getClass();
        wh3 wh3 = ed1.P;
        Method method = null;
        if (wh3 == null) {
            Class<?> cls = obj.getClass();
            try {
                wh3 = new wh3(cls.getMethod("getType", (Class[]) null), cls.getMethod("getAccessor", (Class[]) null));
            } catch (NoSuchMethodException unused) {
                wh3 = new wh3((Method) null, (Method) null);
            }
            ed1.P = wh3;
        }
        Method method2 = wh3.b;
        if (method2 != null) {
            Object invoke = method2.invoke(obj, (Object[]) null);
            invoke.getClass();
            method = invoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final l16 f() {
        Object obj = this.a;
        obj.getClass();
        wh3 wh3 = ed1.P;
        Class cls = null;
        if (wh3 == null) {
            Class<?> cls2 = obj.getClass();
            try {
                wh3 = new wh3(cls2.getMethod("getType", (Class[]) null), cls2.getMethod("getAccessor", (Class[]) null));
            } catch (NoSuchMethodException unused) {
                wh3 = new wh3((Method) null, (Method) null);
            }
            ed1.P = wh3;
        }
        Method method = wh3.a;
        if (method != null) {
            Object invoke = method.invoke(obj, (Object[]) null);
            invoke.getClass();
            cls = invoke;
        }
        if (cls != null) {
            return new a16(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
