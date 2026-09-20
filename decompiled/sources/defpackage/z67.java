package defpackage;

import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: z67  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z67 implements cc4 {
    public p72 A;
    public final Queue B;
    public final boolean C;
    public final String w;
    public volatile cc4 x;
    public Boolean y;
    public Method z;

    public z67(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z2) {
        this.w = str;
        this.B = linkedBlockingQueue;
        this.C = z2;
    }

    public final boolean a() {
        return j().a();
    }

    public final boolean b() {
        return j().b();
    }

    public final boolean c() {
        return j().c();
    }

    public final boolean d() {
        return j().d();
    }

    public final boolean e() {
        return j().e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z67.class != obj.getClass() || !this.w.equals(((z67) obj).w)) {
            return false;
        }
        return true;
    }

    public final void f(String str, Throwable th) {
        j().f(str, th);
    }

    public final void g(String str) {
        j().g(str);
    }

    public final void h(String str) {
        j().h(str);
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final boolean i(int i) {
        return j().i(i);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, p72] */
    public final cc4 j() {
        if (this.x != null) {
            return this.x;
        }
        if (this.C) {
            return sq4.w;
        }
        if (this.A == null) {
            Queue queue = this.B;
            ? obj = new Object();
            obj.w = this;
            obj.x = queue;
            this.A = obj;
        }
        return this.A;
    }

    public final boolean k() {
        Boolean bool = this.y;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.z = this.x.getClass().getMethod("log", new Class[]{b77.class});
            this.y = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.y = Boolean.FALSE;
        }
        return this.y.booleanValue();
    }
}
