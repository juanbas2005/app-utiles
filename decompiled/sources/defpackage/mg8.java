package defpackage;

/* renamed from: mg8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mg8 implements u30 {
    public final /* synthetic */ pw2 a;

    public mg8(pw2 pw2) {
        this.a = pw2;
    }

    public final void a(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        pw2 pw2 = this.a;
        pw2.I.sendMessage(pw2.I.obtainMessage(1, valueOf));
    }
}
