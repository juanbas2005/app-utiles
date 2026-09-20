package com.google.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class b extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, b> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected h unknownFields = h.f;

    public b() {
        this.memoizedHashCode = 0;
    }

    public static b l(Class cls) {
        b bVar = defaultInstanceMap.get(cls);
        if (bVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                bVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = (b) ((b) st7.b(cls)).k(6);
        if (bVar2 != null) {
            defaultInstanceMap.put(cls, bVar2);
            return bVar2;
        }
        throw new IllegalStateException();
    }

    public static Object m(Method method, b bVar, Object... objArr) {
        try {
            return method.invoke(bVar, objArr);
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

    public static pf3 p(pf3 pf3) {
        int i;
        int size = pf3.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size * 2;
        }
        return pf3.j(i);
    }

    public static void q(Class cls, b bVar) {
        bVar.o();
        defaultInstanceMap.put(cls, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        au5 au5 = au5.c;
        au5.getClass();
        return au5.a(getClass()).g(this, (b) obj);
    }

    public final int h(og6 og6) {
        int i;
        int i2;
        if (n()) {
            if (og6 == null) {
                au5 au5 = au5.c;
                au5.getClass();
                i2 = au5.a(getClass()).f(this);
            } else {
                i2 = og6.f(this);
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
        if (og6 == null) {
            au5 au52 = au5.c;
            au52.getClass();
            i = au52.a(getClass()).f(this);
        } else {
            i = og6.f(this);
        }
        r(i);
        return i;
    }

    public final int hashCode() {
        if (n()) {
            au5 au5 = au5.c;
            au5.getClass();
            return au5.a(getClass()).e(this);
        }
        if (this.memoizedHashCode == 0) {
            au5 au52 = au5.c;
            au52.getClass();
            this.memoizedHashCode = au52.a(getClass()).e(this);
        }
        return this.memoizedHashCode;
    }

    public final void i(vs0 vs0) {
        au5 au5 = au5.c;
        au5.getClass();
        og6 a = au5.a(getClass());
        wv2 wv2 = vs0.a;
        if (wv2 == null) {
            wv2 = new wv2(vs0);
        }
        a.h(this, wv2);
    }

    public final qu2 j() {
        return (qu2) k(5);
    }

    public abstract Object k(int i);

    public final boolean n() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return true;
        }
        return false;
    }

    public final void o() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final void r(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        h.s(hl6.k(i, "serialized size must be non-negative, was "));
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = c.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        c.c(this, sb, 0);
        return sb.toString();
    }
}
