package defpackage;

/* renamed from: jh7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jh7 implements d81 {
    public final ThreadLocal w;

    public jh7(ThreadLocal threadLocal) {
        this.w = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jh7) && sg3.e(this.w, ((jh7) obj).w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.w + ')';
    }
}
