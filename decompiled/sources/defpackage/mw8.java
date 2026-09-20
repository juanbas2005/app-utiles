package defpackage;

/* renamed from: mw8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mw8 extends o85 {
    public final void A(rw8 rw8, rw8 rw82) {
        rw8.b = rw82;
    }

    public final boolean B(sw8 sw8, rw8 rw8, rw8 rw82) {
        synchronized (sw8) {
            try {
                if (sw8.y != rw8) {
                    return false;
                }
                sw8.y = rw82;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final rw8 C(y99 y99) {
        rw8 rw8;
        rw8 rw82 = rw8.c;
        synchronized (y99) {
            try {
                rw8 = y99.y;
                if (rw8 != rw82) {
                    y99.y = rw82;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rw8;
    }

    public final kw8 D(y99 y99) {
        kw8 kw8;
        kw8 kw82 = kw8.b;
        synchronized (y99) {
            try {
                kw8 = y99.x;
                if (kw8 != kw82) {
                    y99.x = kw82;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kw8;
    }

    public final boolean E(sw8 sw8, Object obj, Object obj2) {
        synchronized (sw8) {
            try {
                if (sw8.w != obj) {
                    return false;
                }
                sw8.w = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(rw8 rw8, Thread thread) {
        rw8.a = thread;
    }
}
