package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* renamed from: lb4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class lb4 {
    public static final /* synthetic */ long A;
    public static final /* synthetic */ long B;
    public static final /* synthetic */ AtomicReferenceFieldUpdater w;
    public static final /* synthetic */ AtomicReferenceFieldUpdater x;
    public static final /* synthetic */ AtomicReferenceFieldUpdater y;
    public static final /* synthetic */ long z;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Class<lb4> cls = lb4.class;
        Class<Object> cls2 = Object.class;
        w = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next$volatile");
        Unsafe unsafe = y79.a;
        z = unsafe.objectFieldOffset(cls.getDeclaredField("_next$volatile"));
        x = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev$volatile");
        A = unsafe.objectFieldOffset(cls.getDeclaredField("_prev$volatile"));
        y = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_removedRef$volatile");
        B = unsafe.objectFieldOffset(cls.getDeclaredField("_removedRef$volatile"));
    }

    public static lb4 g(lb4 lb4) {
        while (lb4.n()) {
            x.getClass();
            lb4 = (lb4) y79.a.getObjectVolatile(lb4, A);
        }
        return lb4;
    }

    public final boolean c(lb4 lb4, int i) {
        lb4 k;
        do {
            k = k();
            if (k instanceof o74) {
                if ((((o74) k).C & i) != 0 || !k.c(lb4, i)) {
                    return false;
                }
                return true;
            }
        } while (!k.d(lb4, this));
        return true;
    }

    public final boolean d(lb4 lb4, lb4 lb42) {
        x.getClass();
        Unsafe unsafe = y79.a;
        unsafe.putObjectVolatile(lb4, A, this);
        w.getClass();
        long j = z;
        unsafe.putObjectVolatile(lb4, j, lb42);
        while (true) {
            Unsafe unsafe2 = y79.a;
            lb4 lb43 = this;
            lb4 lb44 = lb4;
            lb4 lb45 = lb42;
            if (unsafe2.compareAndSwapObject(lb43, z, lb45, lb44)) {
                lb44.h(lb45);
                return true;
            } else if (unsafe2.getObjectVolatile(lb43, j) != lb45) {
                return false;
            } else {
                this = lb43;
                lb42 = lb45;
                lb4 = lb44;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        r9 = r4;
        r10 = r8;
     */
    public final void e(zz4 zz4) {
        x.getClass();
        Unsafe unsafe = y79.a;
        unsafe.putObjectVolatile(zz4, A, this);
        w.getClass();
        long j = z;
        unsafe.putObjectVolatile(zz4, j, this);
        while (this.i() == this) {
            while (true) {
                Unsafe unsafe2 = y79.a;
                lb4 lb4 = this;
                zz4 zz42 = zz4;
                if (unsafe2.compareAndSwapObject(lb4, z, this, zz42)) {
                    zz42.h(lb4);
                    return;
                } else if (unsafe2.getObjectVolatile(lb4, j) != lb4) {
                    break;
                } else {
                    this = lb4;
                    zz4 = zz42;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: lb4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final lb4 f() {
        lb4 lb4;
        lb4 lb42;
        Unsafe unsafe;
        loop0:
        while (true) {
            x.getClass();
            Unsafe unsafe2 = y79.a;
            long j = A;
            lb4 lb43 = (lb4) unsafe2.getObjectVolatile(r15, j);
            lb4 lb44 = null;
            lb4 = lb43;
            while (true) {
                w.getClass();
                if (lb4 != null) {
                    Unsafe unsafe3 = y79.a;
                    long j2 = z;
                    Object objectVolatile = unsafe3.getObjectVolatile(lb4, j2);
                    if (objectVolatile != r15) {
                        lb4 lb45 = lb43;
                        lb42 = r15;
                        if (lb42.n()) {
                            return null;
                        }
                        if (!(objectVolatile instanceof i46)) {
                            objectVolatile.getClass();
                            lb44 = lb4;
                            lb4 = (lb4) objectVolatile;
                        } else if (lb44 != null) {
                            lb4 lb46 = ((i46) objectVolatile).a;
                            do {
                                lb4 lb47 = lb4;
                                Unsafe unsafe4 = y79.a;
                                boolean compareAndSwapObject = unsafe4.compareAndSwapObject(lb44, z, lb47, lb46);
                                unsafe = unsafe4;
                                lb4 = lb47;
                                if (compareAndSwapObject) {
                                    r15 = lb42;
                                    lb4 = lb44;
                                    lb43 = lb45;
                                    lb44 = null;
                                }
                            } while (unsafe.getObjectVolatile(lb44, j2) == lb4);
                            break;
                        } else if (lb4 != null) {
                            lb4 = unsafe3.getObjectVolatile(lb4, j);
                        } else {
                            ku4.a();
                            return null;
                        }
                        r15 = lb42;
                        lb43 = lb45;
                    } else if (lb43 == lb4) {
                        break;
                    } else {
                        while (true) {
                            Unsafe unsafe5 = y79.a;
                            lb4 lb48 = r15;
                            boolean compareAndSwapObject2 = unsafe5.compareAndSwapObject(lb48, A, lb43, lb4);
                            lb4 lb49 = lb43;
                            lb42 = lb48;
                            if (compareAndSwapObject2) {
                                break loop0;
                            } else if (unsafe5.getObjectVolatile(lb42, j) != lb49) {
                                break;
                            } else {
                                r15 = lb42;
                                lb43 = lb49;
                            }
                        }
                    }
                } else {
                    ku4.a();
                    return null;
                }
            }
            this = lb42;
        }
        return lb4;
    }

    public final void h(lb4 lb4) {
        while (true) {
            x.getClass();
            if (lb4 != null) {
                Unsafe unsafe = y79.a;
                long j = A;
                lb4 lb42 = (lb4) unsafe.getObjectVolatile(lb4, j);
                if (this.i() == lb4) {
                    while (lb4 != null) {
                        Unsafe unsafe2 = y79.a;
                        lb4 lb43 = this;
                        lb4 lb44 = lb4;
                        if (unsafe2.compareAndSwapObject(lb44, A, lb42, lb43)) {
                            if (lb43.n()) {
                                lb44.f();
                                return;
                            }
                            return;
                        } else if (lb44 != null) {
                            lb4 = lb44;
                            if (unsafe2.getObjectVolatile(lb44, j) != lb42) {
                                this = lb43;
                            } else {
                                this = lb43;
                            }
                        } else {
                            ku4.a();
                            return;
                        }
                    }
                    ku4.a();
                    return;
                }
                return;
            }
            ku4.a();
            return;
        }
    }

    public final Object i() {
        w.getClass();
        return y79.a.getObjectVolatile(this, z);
    }

    public final lb4 j() {
        i46 i46;
        Object i = i();
        if (i instanceof i46) {
            i46 = (i46) i;
        } else {
            i46 = null;
        }
        if (i46 != null) {
            return i46.a;
        }
        i.getClass();
        return (lb4) i;
    }

    public final lb4 k() {
        lb4 f = f();
        if (f != null) {
            return f;
        }
        x.getClass();
        return g((lb4) y79.a.getObjectVolatile(this, A));
    }

    public boolean n() {
        return i() instanceof i46;
    }

    public final lb4 o() {
        lb4 lb4;
        while (true) {
            Object i = this.i();
            if (i instanceof i46) {
                return ((i46) i).a;
            }
            if (i == this) {
                return (lb4) i;
            }
            i.getClass();
            lb4 lb42 = (lb4) i;
            i46 p = lb42.p();
            while (true) {
                w.getClass();
                Unsafe unsafe = y79.a;
                long j = z;
                lb4 = this;
                if (unsafe.compareAndSwapObject(lb4, j, i, p)) {
                    lb42.f();
                    return null;
                } else if (unsafe.getObjectVolatile(lb4, j) != i) {
                    break;
                } else {
                    this = lb4;
                }
            }
            this = lb4;
        }
    }

    public final i46 p() {
        y.getClass();
        Unsafe unsafe = y79.a;
        long j = B;
        i46 i46 = (i46) unsafe.getObjectVolatile(this, j);
        if (i46 != null) {
            return i46;
        }
        i46 i462 = new i46(this);
        unsafe.putObjectVolatile(this, j, i462);
        return i462;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(new xz3(1, 3, rj1.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;"));
        sb.append('@');
        sb.append(rj1.t(this));
        return sb.toString();
    }
}
