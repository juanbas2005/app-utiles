package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: yu2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yu2 {
    public final k2 a;
    public final Object b;
    public final k2 c;
    public final xu2 d;
    public final Method e;

    public yu2(k2 k2Var, Object obj, k2 k2Var2, xu2 xu2, Class cls) {
        if (k2Var == null) {
            h.q("Null containingTypeDefaultInstance");
            throw null;
        } else if (xu2.x == rc8.MESSAGE && k2Var2 == null) {
            h.q("Null messageDefaultInstance");
            throw null;
        } else {
            this.a = k2Var;
            this.b = obj;
            this.c = k2Var2;
            this.d = xu2;
            if (mf3.class.isAssignableFrom(cls)) {
                try {
                    this.e = cls.getMethod("valueOf", new Class[]{Integer.TYPE});
                } catch (NoSuchMethodException e2) {
                    String name = cls.getName();
                    ku4.o(f21.m(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e2);
                    throw null;
                }
            } else {
                this.e = null;
            }
        }
    }

    public final Object a(Object obj) {
        if (this.d.x.w != uc8.E) {
            return obj;
        }
        try {
            return this.e.invoke((Object) null, new Object[]{(Integer) obj});
        } catch (IllegalAccessException e2) {
            ku4.o("Couldn't use Java reflection to implement protocol message reflection.", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (!(cause instanceof Error)) {
                ku4.o("Unexpected exception thrown by generated accessor method.", cause);
                return null;
            } else {
                throw ((Error) cause);
            }
        }
    }

    public final Object b(Object obj) {
        if (this.d.x.w == uc8.E) {
            return Integer.valueOf(((mf3) obj).a());
        }
        return obj;
    }
}
