package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: q50  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class q50 implements f61, q81, Serializable {
    public final f61 w;

    public q50(f61 f61) {
        this.w = f61;
    }

    public q81 e() {
        f61 f61 = this.w;
        if (f61 instanceof q81) {
            return (q81) f61;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: q50} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: f61} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: q50} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void f(Object obj) {
        while (true) {
            q50 q50 = this;
            f61 f61 = q50.w;
            f61.getClass();
            try {
                obj = q50.s(obj);
                if (obj == p81.w) {
                    return;
                }
            } catch (Throwable th) {
                obj = new m66(th);
            }
            q50.t();
            if (f61 instanceof q50) {
                this = f61;
            } else {
                f61.f(obj);
                return;
            }
        }
    }

    public f61 l(f61 f61) {
        zu0 zu0 = gr8.c;
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public f61 o(f61 f61, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement p() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        Integer num;
        int i2;
        oj1 oj1 = (oj1) getClass().getAnnotation(oj1.class);
        String str2 = null;
        if (oj1 == null || oj1.v() < 1) {
            return null;
        }
        int i3 = -1;
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(this);
            if (obj2 instanceof Integer) {
                num = (Integer) obj2;
            } else {
                num = null;
            }
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            i = i2 - 1;
        } catch (Exception unused) {
            i = -1;
        }
        if (i >= 0) {
            i3 = oj1.l()[i];
        }
        cf4 cf4 = dh4.v;
        cf4 cf42 = dh4.w;
        if (cf42 == null) {
            try {
                cf4 cf43 = new cf4(Class.class.getDeclaredMethod("getModule", (Class[]) null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", (Class[]) null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", (Class[]) null), 2);
                dh4.w = cf43;
                cf42 = cf43;
            } catch (Exception unused2) {
                dh4.w = cf4;
                cf42 = cf4;
            }
        }
        if (!(cf42 == cf4 || (method = (Method) cf42.x) == null || (invoke = method.invoke(getClass(), (Object[]) null)) == null || (method2 = (Method) cf42.y) == null || (invoke2 = method2.invoke(invoke, (Object[]) null)) == null)) {
            Method method3 = (Method) cf42.z;
            if (method3 != null) {
                obj = method3.invoke(invoke2, (Object[]) null);
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str2 = (String) obj;
            }
        }
        if (str2 == null) {
            str = oj1.c();
        } else {
            str = str2 + '/' + oj1.c();
        }
        return new StackTraceElement(str, oj1.m(), oj1.f(), i3);
    }

    public abstract Object s(Object obj);

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object p = p();
        if (p == null) {
            p = getClass().getName();
        }
        sb.append(p);
        return sb.toString();
    }

    public void t() {
    }
}
