package defpackage;

/* renamed from: rp2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class rp2 implements tu6 {
    public final tu6 w;

    public rp2(tu6 tu6) {
        tu6.getClass();
        this.w = tu6;
    }

    public void close() {
        this.w.close();
    }

    public void flush() {
        this.w.flush();
    }

    public final ri7 g() {
        return this.w.g();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.w + ')';
    }
}
