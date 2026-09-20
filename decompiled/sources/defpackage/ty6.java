package defpackage;

/* renamed from: ty6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ty6 extends u83 {
    public final ie1 w;
    public boolean x;
    public final ed0 y;

    public ty6(ed0 ed0, ie1 ie1) {
        this.w = ie1;
        this.y = ed0;
    }

    public final ie1 a() {
        return this.w;
    }

    public final synchronized void close() {
        this.x = true;
        ed0 ed0 = this.y;
        if (ed0 != null) {
            i.a(ed0);
        }
    }

    public final synchronized ed0 k() {
        ed0 ed0;
        try {
            if (!this.x) {
                ed0 = this.y;
                if (ed0 == null) {
                    sp3 sp3 = nd2.w;
                    throw null;
                }
            } else {
                throw new IllegalStateException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
        return ed0;
    }
}
