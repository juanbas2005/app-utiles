package defpackage;

/* renamed from: af8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class af8 implements x54, ps2 {
    public final /* synthetic */ ky0 w;

    public af8(ky0 ky0) {
        this.w = ky0;
    }

    public final ds2 a() {
        return new ct2(1, this.w, ky0.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x54) || !(obj instanceof ps2)) {
            return false;
        }
        return a().equals(((ps2) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
