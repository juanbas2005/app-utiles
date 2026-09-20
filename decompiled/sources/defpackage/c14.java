package defpackage;

/* renamed from: c14  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c14 extends y95 {
    public static final /* synthetic */ yr3[] I;
    public final i16 C;
    public final am6 D;
    public final ib4 E;
    public final yo3 F;
    public final db4 G;
    public final rm H;

    static {
        Class<c14> cls = c14.class;
        I = new yr3[]{new gr5(cls, "binaryClasses", "getBinaryClasses$org_jetbrains_kotlin_descriptors_jvm()Ljava/util/Map;", 0), new gr5(cls, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0)};
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [ib4, hb4] */
    /* JADX WARNING: type inference failed for: r3v3, types: [db4, hb4] */
    /* JADX WARNING: Illegal instructions before constructor call */
    public c14(am6 am6, i16 i16) {
        super(r0.o, i16.a);
        rm rmVar;
        am6.getClass();
        pj3 pj3 = (pj3) am6.x;
        this.C = i16;
        am6 l = uq3.l(am6, this, (x06) null, 6);
        this.D = l;
        pj3.d.c().c.getClass();
        rk4 rk4 = rk4.g;
        pj3 pj32 = (pj3) l.x;
        kb4 kb4 = pj32.a;
        b14 b14 = new b14(this, 0);
        kb4.getClass();
        this.E = new hb4(kb4, b14);
        this.F = new yo3(l, i16, this);
        b14 b142 = new b14(this, 1);
        kb4.getClass();
        this.G = new hb4(kb4, b142);
        if (pj32.v.x) {
            rmVar = me6.x;
        } else {
            rmVar = h03.s(l, i16);
        }
        this.H = rmVar;
        kb4.a(new b14(this, 2));
    }

    public final ji4 R() {
        return this.F;
    }

    public final sy6 e() {
        return new ns8(26, (Object) this);
    }

    public final rm getAnnotations() {
        return this.H;
    }

    public final String toString() {
        return "Lazy Java package fragment: " + this.A + " of module " + ((pj3) this.D.x).o;
    }
}
