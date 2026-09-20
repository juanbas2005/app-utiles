package defpackage;

/* renamed from: t87  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class t87 implements vr2 {
    public final /* synthetic */ il A;
    public final /* synthetic */ float B;
    public final /* synthetic */ vr2 C;
    public final /* synthetic */ h06 w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ zk y;
    public final /* synthetic */ ol z;

    public /* synthetic */ t87(h06 h06, Object obj, zk zkVar, ol olVar, il ilVar, float f, vr2 vr2) {
        this.w = h06;
        this.x = obj;
        this.y = zkVar;
        this.z = olVar;
        this.A = ilVar;
        this.B = f;
        this.C = vr2;
    }

    public final Object y(Object obj) {
        long longValue = ((Long) obj).longValue();
        zk zkVar = this.y;
        long j = longValue;
        lo7 c = zkVar.c();
        Object g = zkVar.g();
        il ilVar = this.A;
        gl glVar = new gl(this.x, c, this.z, j, g, j, new u87(1, ilVar));
        zk zkVar2 = zkVar;
        i95.m(glVar, j, this.B, zkVar2, ilVar, this.C);
        this.w.w = glVar;
        return vs7.a;
    }
}
