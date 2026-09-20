package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* renamed from: kf6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class kf6 {
    public static final List a;
    public static final List b;

    static {
        Class<ye6> cls = ye6.class;
        a = sg3.E(Application.class, cls);
        b = sg3.D(cls);
    }

    public static final Constructor a(Class cls, List list) {
        list.getClass();
        Constructor[] constructors = cls.getConstructors();
        constructors.getClass();
        int length = constructors.length;
        int i = 0;
        while (i < length) {
            Constructor constructor = constructors[i];
            Class[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List p1 = qs.p1(parameterTypes);
            if (list.equals(p1)) {
                return constructor;
            }
            if (list.size() != p1.size() || !p1.containsAll(list)) {
                i++;
            } else {
                String simpleName = cls.getSimpleName();
                throw new UnsupportedOperationException("Class " + simpleName + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final r58 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (r58) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            ku4.n("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            ku4.o("An exception happened in constructor of " + cls, e3.getCause());
            return null;
        }
    }
}
