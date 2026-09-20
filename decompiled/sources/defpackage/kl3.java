package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* renamed from: kl3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kl3 implements aa3 {
    public static final /* synthetic */ long A;
    public static final /* synthetic */ long B;
    public static final /* synthetic */ AtomicIntegerFieldUpdater x;
    public static final /* synthetic */ AtomicReferenceFieldUpdater y;
    public static final /* synthetic */ AtomicReferenceFieldUpdater z;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final zz4 w;

    static {
        Class<kl3> cls = kl3.class;
        x = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleting$volatile");
        Class<Object> cls2 = Object.class;
        y = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_rootCause$volatile");
        Unsafe unsafe = y79.a;
        B = unsafe.objectFieldOffset(cls.getDeclaredField("_rootCause$volatile"));
        z = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_exceptionsHolder$volatile");
        A = unsafe.objectFieldOffset(cls.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public kl3(zz4 zz4, Throwable th) {
        this.w = zz4;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable c = c();
        if (c == null) {
            g(th);
        } else if (th != c) {
            Object b = b();
            if (b == null) {
                f(th);
            } else if (b instanceof Throwable) {
                if (th != b) {
                    ArrayList arrayList = new ArrayList(4);
                    arrayList.add(b);
                    arrayList.add(th);
                    f(arrayList);
                }
            } else if (b instanceof ArrayList) {
                ((ArrayList) b).add(th);
            } else {
                ta1.l("State is ", b);
            }
        }
    }

    public final Object b() {
        z.getClass();
        return y79.a.getObjectVolatile(this, A);
    }

    public final Throwable c() {
        y.getClass();
        return (Throwable) y79.a.getObjectVolatile(this, B);
    }

    public final boolean d() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    public final ArrayList e(Throwable th) {
        ArrayList arrayList;
        Object b = b();
        if (b == null) {
            arrayList = new ArrayList(4);
        } else if (b instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(b);
            arrayList = arrayList2;
        } else if (b instanceof ArrayList) {
            arrayList = (ArrayList) b;
        } else {
            ta1.l("State is ", b);
            return null;
        }
        Throwable c = c();
        if (c != null) {
            arrayList.add(0, c);
        }
        if (th != null && !th.equals(c)) {
            arrayList.add(th);
        }
        f(ml3.e);
        return arrayList;
    }

    public final void f(Object obj) {
        z.getClass();
        y79.a.putObjectVolatile(this, A, obj);
    }

    public final void g(Throwable th) {
        y.getClass();
        y79.a.putObjectVolatile(this, B, th);
    }

    public final boolean l() {
        if (c() == null) {
            return true;
        }
        return false;
    }

    public final zz4 m() {
        return this.w;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(d());
        sb.append(", completing=");
        boolean z2 = true;
        if (x.get(this) != 1) {
            z2 = false;
        }
        sb.append(z2);
        sb.append(", rootCause=");
        sb.append(c());
        sb.append(", exceptions=");
        sb.append(b());
        sb.append(", list=");
        sb.append(this.w);
        sb.append(']');
        return sb.toString();
    }
}
