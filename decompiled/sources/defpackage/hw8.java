package defpackage;

/* renamed from: hw8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hw8 {
    public static final hw8 b;
    public static final hw8 c;
    public final Throwable a;

    static {
        if (sw8.B) {
            c = null;
            b = null;
            return;
        }
        c = new hw8(false, (RuntimeException) null);
        b = new hw8(true, (RuntimeException) null);
    }

    public hw8(boolean z, RuntimeException runtimeException) {
        this.a = runtimeException;
    }
}
