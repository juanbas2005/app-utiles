package defpackage;

/* renamed from: j52  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j52 extends wx3 implements vr2 {
    public final /* synthetic */ long A;
    public final /* synthetic */ eh5 B;
    public final /* synthetic */ long C;
    public final /* synthetic */ f52 D;
    public final /* synthetic */ m52 x;
    public final /* synthetic */ a37 y;
    public final /* synthetic */ long z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j52(m52 m52, am7 am7, long j, long j2, long j3, eh5 eh5, long j4, f52 f52) {
        super(1);
        this.x = m52;
        this.y = am7;
        this.z = j2;
        this.A = j3;
        this.B = eh5;
        this.C = j4;
        this.D = f52;
    }

    public final Object y(Object obj) {
        long j;
        dh5 dh5 = (dh5) obj;
        m52 m52 = this.x;
        tr6 tr6 = m52.R;
        long j2 = 0;
        a37 a37 = this.y;
        if (a37 != null) {
            j = ((oe3) a37.getValue()).a;
        } else {
            j = 0;
        }
        tr6.b();
        if (tr6.b()) {
            tr6.c.getClass();
        }
        long c = oe3.c(j, 0);
        if (tr6.b()) {
            tr6.i = c;
        }
        jb jbVar = m52.V;
        if (jbVar != null) {
            j2 = jbVar.a(this.z, this.A, ey3.w);
        }
        long c2 = oe3.c(j2, c);
        long j3 = this.C;
        dh5.getClass();
        eh5 eh5 = this.B;
        dh5.a(dh5, eh5);
        eh5.h0(oe3.c((((long) (((int) (c2 >> 32)) + ((int) (j3 >> 32)))) << 32) | (((long) (((int) (c2 & 4294967295L)) + ((int) (j3 & 4294967295L)))) & 4294967295L), eh5.A), 0.0f, this.D);
        return vs7.a;
    }
}
