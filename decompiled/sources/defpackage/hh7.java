package defpackage;

/* renamed from: hh7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hh7 implements fh7 {
    public final Object w;
    public final ThreadLocal x;
    public final jh7 y;

    public hh7(Object obj, ThreadLocal threadLocal) {
        this.w = obj;
        this.x = threadLocal;
        this.y = new jh7(threadLocal);
    }

    public final Object G(gs2 gs2, Object obj) {
        return gs2.H(obj, this);
    }

    public final e81 L(d81 d81) {
        if (this.y.equals(d81)) {
            return x32.w;
        }
        return this;
    }

    public final e81 X(e81 e81) {
        return rc9.D0(this, e81);
    }

    public final c81 a0(d81 d81) {
        if (this.y.equals(d81)) {
            return this;
        }
        return null;
    }

    public final void b0(e81 e81, Object obj) {
        this.x.set(obj);
    }

    public final d81 getKey() {
        return this.y;
    }

    public final Object h0(e81 e81) {
        ThreadLocal threadLocal = this.x;
        Object obj = threadLocal.get();
        threadLocal.set(this.w);
        return obj;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.w + ", threadLocal = " + this.x + ')';
    }
}
