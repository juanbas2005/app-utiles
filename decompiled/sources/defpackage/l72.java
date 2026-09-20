package defpackage;

/* renamed from: l72  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class l72 implements Runnable, Comparable, mw1 {
    private volatile Object _heap;
    public long w;
    public int x = -1;

    public l72(long j) {
        this.w = j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: lh7} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0032, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void b() {
        m72 m72;
        synchronized (this) {
            Object obj = this._heap;
            py2 py2 = o72.a;
            if (obj != py2) {
                lh7 lh7 = null;
                if (obj instanceof m72) {
                    m72 = (m72) obj;
                } else {
                    m72 = null;
                }
                if (m72 != null) {
                    synchronized (m72) {
                        Object obj2 = this._heap;
                        if (obj2 instanceof lh7) {
                            lh7 = obj2;
                        }
                        if (lh7 != null) {
                            m72.b(this.x);
                        }
                    }
                }
                this._heap = py2;
            }
        }
    }

    public final int c(long j, m72 m72, n72 n72) {
        l72 l72;
        boolean z;
        synchronized (this) {
            if (this._heap == o72.a) {
                return 2;
            }
            synchronized (m72) {
                try {
                    l72[] l72Arr = m72.a;
                    if (l72Arr != null) {
                        l72 = l72Arr[0];
                    } else {
                        l72 = null;
                    }
                    if (n72.E.get(n72) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return 1;
                    }
                    if (l72 == null) {
                        m72.c = j;
                    } else {
                        long j2 = l72.w;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - m72.c > 0) {
                            m72.c = j;
                        }
                    }
                    long j3 = this.w;
                    long j4 = m72.c;
                    if (j3 - j4 < 0) {
                        this.w = j4;
                    }
                    m72.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final int compareTo(Object obj) {
        int i = ((this.w - ((l72) obj).w) > 0 ? 1 : ((this.w - ((l72) obj).w) == 0 ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        return 0;
    }

    public final void d(m72 m72) {
        if (this._heap != o72.a) {
            this._heap = m72;
        } else {
            h.q("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.w + ']';
    }
}
