package defpackage;

/* renamed from: zx6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zx6 extends p37 {
    public wf5 c;
    public int d;

    public zx6(long j, wf5 wf5) {
        super(j);
        this.c = wf5;
    }

    public final void a(p37 p37) {
        p37.getClass();
        zx6 zx6 = (zx6) p37;
        synchronized (h03.A0) {
            this.c = zx6.c;
            this.d = zx6.d;
        }
    }

    public final p37 b(long j) {
        return new zx6(j, this.c);
    }
}
