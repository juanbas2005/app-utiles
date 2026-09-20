package defpackage;

/* renamed from: n55  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n55 extends wx3 implements vr2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ zj B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int x;
    public final /* synthetic */ vk2 y;
    public final /* synthetic */ vk2 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n55(vk2 vk2, vk2 vk22, Object obj, int i, zj zjVar, int i2) {
        super(1);
        this.x = i2;
        this.y = vk2;
        this.z = vk22;
        this.C = obj;
        this.A = i;
        this.B = zjVar;
    }

    public final Object y(Object obj) {
        int i = this.x;
        zj zjVar = this.B;
        int i2 = this.A;
        Object obj2 = this.C;
        vk2 vk2 = this.z;
        vk2 vk22 = this.y;
        switch (i) {
            case b85.b:
                d80 d80 = (d80) obj;
                if (vk22 != ((lk2) ((je) rc9.P0(vk2)).getFocusOwner()).g()) {
                    return Boolean.TRUE;
                }
                boolean r = o55.r(vk2, (vk2) obj2, i2, zjVar);
                Boolean valueOf = Boolean.valueOf(r);
                if (r || !d80.a()) {
                    return valueOf;
                }
                return null;
            default:
                d80 d802 = (d80) obj;
                if (vk22 != ((lk2) ((je) rc9.P0(vk2)).getFocusOwner()).g()) {
                    return Boolean.TRUE;
                }
                boolean F = t75.F(i2, zjVar, vk2, (ly5) obj2);
                Boolean valueOf2 = Boolean.valueOf(F);
                if (F || !d802.a()) {
                    return valueOf2;
                }
                return null;
        }
    }
}
