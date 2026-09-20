package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: v58  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v58 extends x58 {
    public static v58 c;
    public static final or2 d = new or2(14);
    public final Application b;

    public v58(Application application) {
        this.b = application;
    }

    public final r58 a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        kj6.n("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    public final r58 b(Class cls, to4 to4) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) to4.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!kj.class.isAssignableFrom(cls)) {
            return rc9.G(cls);
        }
        h.q("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final r58 d(Class cls, Application application) {
        if (!kj.class.isAssignableFrom(cls)) {
            return rc9.G(cls);
        }
        try {
            r58 r58 = (r58) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
            r58.getClass();
            return r58;
        } catch (NoSuchMethodException e) {
            ku4.n("Cannot create an instance of ", cls, e);
            return null;
        } catch (IllegalAccessException e2) {
            ku4.n("Cannot create an instance of ", cls, e2);
            return null;
        } catch (InstantiationException e3) {
            ku4.n("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            ku4.n("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
