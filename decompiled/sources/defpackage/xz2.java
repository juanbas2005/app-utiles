package defpackage;

/* renamed from: xz2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xz2 implements w58 {
    public static final tz2 d = new tz2(0);
    public final pz3 a;
    public final w58 b;
    public final f9 c;

    public xz2(pz3 pz3, w58 w58, jz0 jz0) {
        this.a = pz3;
        this.b = w58;
        this.c = new f9(1, jz0);
    }

    public final r58 a(Class cls) {
        if (!this.a.containsKey(cls)) {
            return this.b.a(cls);
        }
        kj6.n("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        return null;
    }

    public final r58 b(Class cls, to4 to4) {
        if (this.a.containsKey(cls)) {
            return this.c.b(cls, to4);
        }
        return this.b.b(cls, to4);
    }
}
