package defpackage;

/* renamed from: aj0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class aj0 extends z2 {
    public final /* synthetic */ bj0 D;

    public aj0(bj0 bj0) {
        this.D = bj0;
    }

    public final String h() {
        yi0 yi0 = (yi0) this.D.w.get();
        if (yi0 == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + yi0.a + "]";
    }
}
