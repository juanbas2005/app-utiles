package defpackage;

/* renamed from: s53  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s53 extends xg5 {
    public static final zk2 g = new zk2("Before", 2);
    public static final zk2 h = new zk2("State", 2);
    public static final zk2 i = new zk2("After", 2);
    public static final zk2 j = new zk2("Before", 2);
    public static final zk2 k = new zk2("State", 2);
    public static final zk2 l = new zk2("Transform", 2);
    public static final zk2 m = new zk2("Render", 2);
    public static final zk2 n = new zk2("Send", 2);
    public static final zk2 o = new zk2("Receive", 2);
    public static final zk2 p = new zk2("Parse", 2);
    public static final zk2 q = new zk2("Transform", 2);
    public static final zk2 r = new zk2("State", 2);
    public static final zk2 s = new zk2("After", 2);
    public static final zk2 t = new zk2("Before", 2);
    public static final zk2 u = new zk2("State", 2);
    public static final zk2 v = new zk2("Monitoring", 2);
    public static final zk2 w = new zk2("Engine", 2);
    public static final zk2 x = new zk2("Receive", 2);
    public final /* synthetic */ int e;
    public final boolean f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s53(int i2) {
        super(g, h, i);
        this.e = i2;
        switch (i2) {
            case 1:
                super(j, k, l, m, n);
                this.f = true;
                return;
            case 2:
                super(o, p, q, r, s);
                this.f = true;
                return;
            case 3:
                super(t, u, v, w, x);
                this.f = true;
                return;
            default:
                this.f = true;
                return;
        }
    }

    public final boolean d() {
        switch (this.e) {
            case b85.b:
                return this.f;
            case 1:
                return this.f;
            case 2:
                return this.f;
            default:
                return this.f;
        }
    }
}
