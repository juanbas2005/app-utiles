package defpackage;

/* renamed from: e56  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e56 extends f56 {
    public final /* synthetic */ yh4 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ byte[] d;

    public e56(yh4 yh4, int i, byte[] bArr) {
        this.b = yh4;
        this.c = i;
        this.d = bArr;
    }

    public final long a() {
        return (long) this.c;
    }

    public final yh4 b() {
        return this.b;
    }

    public final void d(dd0 dd0) {
        dd0.write(this.d, 0, this.c);
    }
}
