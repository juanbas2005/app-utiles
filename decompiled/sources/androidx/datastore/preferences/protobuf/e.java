package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class e extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, e> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected k unknownFields = k.f;

    public e() {
        this.memoizedHashCode = 0;
    }

    public static e d(Class cls) {
        e eVar = defaultInstanceMap.get(cls);
        if (eVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                eVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = (e) ((e) tt7.d(cls)).c(6);
        if (eVar2 != null) {
            defaultInstanceMap.put(cls, eVar2);
            return eVar2;
        }
        throw new IllegalStateException();
    }

    public static Object e(Method method, e eVar, Object... objArr) {
        try {
            return method.invoke(eVar, objArr);
        } catch (IllegalAccessException e) {
            ku4.o("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
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

    public static final boolean f(e eVar, boolean z) {
        byte byteValue = ((Byte) eVar.c(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        bu5 bu5 = bu5.c;
        bu5.getClass();
        boolean c = bu5.a(eVar.getClass()).c(eVar);
        if (z) {
            eVar.c(2);
        }
        return c;
    }

    public static void j(Class cls, e eVar) {
        eVar.h();
        defaultInstanceMap.put(cls, eVar);
    }

    public final int a(pg6 pg6) {
        int i;
        int i2;
        if (g()) {
            if (pg6 == null) {
                bu5 bu5 = bu5.c;
                bu5.getClass();
                i2 = bu5.a(getClass()).f(this);
            } else {
                i2 = pg6.f(this);
            }
            if (i2 >= 0) {
                return i2;
            }
            h.s(hl6.k(i2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i3 = this.memoizedSerializedSize;
        if ((i3 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i3 & Integer.MAX_VALUE;
        }
        if (pg6 == null) {
            bu5 bu52 = bu5.c;
            bu52.getClass();
            i = bu52.a(getClass()).f(this);
        } else {
            i = pg6.f(this);
        }
        k(i);
        return i;
    }

    public final void b(ws0 ws0) {
        bu5 bu5 = bu5.c;
        bu5.getClass();
        pg6 a = bu5.a(getClass());
        ji8 ji8 = ws0.a;
        if (ji8 == null) {
            ji8 = new ji8(ws0);
        }
        a.g(this, ji8);
    }

    public abstract Object c(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bu5 bu5 = bu5.c;
        bu5.getClass();
        return bu5.a(getClass()).i(this, (e) obj);
    }

    public final boolean g() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return true;
        }
        return false;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            bu5 bu5 = bu5.c;
            bu5.getClass();
            return bu5.a(getClass()).h(this);
        }
        if (this.memoizedHashCode == 0) {
            bu5 bu52 = bu5.c;
            bu52.getClass();
            this.memoizedHashCode = bu52.a(getClass()).h(this);
        }
        return this.memoizedHashCode;
    }

    public final e i() {
        return (e) c(4);
    }

    public final void k(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        h.s(hl6.k(i, "serialized size must be non-negative, was "));
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = f.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        f.c(this, sb, 0);
        return sb.toString();
    }
}
