package defpackage;

/* renamed from: jb2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jb2 implements y96 {
    public final x96 a;

    public jb2(Throwable th) {
        this.a = new x96((y96) this, th, 2);
    }

    public final y96 a() {
        throw new IllegalStateException("unexpected retry");
    }

    public final ex5 b() {
        throw new IllegalStateException("unexpected call");
    }

    public final boolean c() {
        return false;
    }

    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    public final x96 d() {
        return this.a;
    }

    public final x96 g() {
        return this.a;
    }
}
