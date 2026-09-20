package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: j48  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class j48 {
    public final js a;
    public final js b;
    public final js c;

    public j48(js jsVar, js jsVar2, js jsVar3) {
        this.a = jsVar;
        this.b = jsVar2;
        this.c = jsVar3;
    }

    public abstract k48 a();

    public final Class b(Class cls) {
        String name = cls.getName();
        js jsVar = this.c;
        Class cls2 = (Class) jsVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        String name2 = cls.getPackage().getName();
        String simpleName = cls.getSimpleName();
        Class<?> cls3 = Class.forName(name2 + "." + simpleName + "Parcelizer", false, cls.getClassLoader());
        jsVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        js jsVar = this.a;
        Method method = (Method) jsVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Class<j48> cls = j48.class;
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        jsVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        js jsVar = this.b;
        Method method = (Method) jsVar.get(name);
        if (method != null) {
            return method;
        }
        Class b2 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b2.getDeclaredMethod("write", new Class[]{cls, j48.class});
        jsVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((k48) this).e.readParcelable(k48.class.getClassLoader());
    }

    public final l48 g() {
        String readString = ((k48) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (l48) c(readString).invoke((Object) null, new Object[]{a()});
        } catch (IllegalAccessException e) {
            ku4.o("VersionedParcel encountered IllegalAccessException", e);
            return null;
        } catch (InvocationTargetException e2) {
            if (!(e2.getCause() instanceof RuntimeException)) {
                ku4.o("VersionedParcel encountered InvocationTargetException", e2);
                return null;
            }
            throw ((RuntimeException) e2.getCause());
        } catch (NoSuchMethodException e3) {
            ku4.o("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (ClassNotFoundException e4) {
            ku4.o("VersionedParcel encountered ClassNotFoundException", e4);
            return null;
        }
    }

    public abstract void h(int i);

    public final void i(l48 l48) {
        if (l48 == null) {
            ((k48) this).e.writeString((String) null);
            return;
        }
        try {
            ((k48) this).e.writeString(b(l48.getClass()).getName());
            k48 a2 = a();
            try {
                d(l48.getClass()).invoke((Object) null, new Object[]{l48, a2});
                Parcel parcel = a2.e;
                int i = a2.i;
                if (i >= 0) {
                    int i2 = a2.d.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (IllegalAccessException e) {
                ku4.o("VersionedParcel encountered IllegalAccessException", e);
            } catch (InvocationTargetException e2) {
                if (!(e2.getCause() instanceof RuntimeException)) {
                    ku4.o("VersionedParcel encountered InvocationTargetException", e2);
                    return;
                }
                throw ((RuntimeException) e2.getCause());
            } catch (NoSuchMethodException e3) {
                ku4.o("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (ClassNotFoundException e4) {
                ku4.o("VersionedParcel encountered ClassNotFoundException", e4);
            }
        } catch (ClassNotFoundException e5) {
            ku4.o(l48.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
