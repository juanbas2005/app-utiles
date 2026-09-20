package defpackage;

/* renamed from: w36  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w36 extends c1 implements i81 {
    public final /* synthetic */ ny0 x;
    public final /* synthetic */ x36 y;

    /* JADX WARNING: Illegal instructions before constructor call */
    public w36(ny0 ny0, x36 x36) {
        super(r0);
        d63 d63 = d63.z;
        this.x = ny0;
        this.y = x36;
    }

    public final void B(e81 e81, Throwable th) {
        ny0 ny0 = this.x;
        x36 x36 = this.y;
        tf4.S(th, new f5(13, ny0, x36));
        i81 i81 = (i81) x36.w.a0(d63.z);
        if (i81 != null) {
            i81.B(e81, th);
            return;
        }
        throw th;
    }
}
