package defpackage;

/* renamed from: k66  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class k66 extends q50 {
    public k66(f61 f61) {
        super(f61);
        if (f61 != null && f61.r() != x32.w) {
            h.q("Coroutines with restricted suspension must have EmptyCoroutineContext");
            throw null;
        }
    }

    public final e81 r() {
        return x32.w;
    }
}
