package defpackage;

/* renamed from: pw3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class pw3 extends qw3 implements wr3 {
    public final nz3 G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pw3(yq3 yq3, String str, Object obj, su3 su3, fq3 fq3) {
        super(yq3, str, obj, su3, fq3);
        yq3.getClass();
        str.getClass();
        su3.getClass();
        fq3.getClass();
        nw3 nw3 = new nw3(this, 0);
        i44 i44 = i44.w;
        this.G = rg3.y(i44, nw3);
        rg3.y(i44, new nw3(this, 1));
    }

    public final hw3 Q() {
        return (ow3) this.G.getValue();
    }

    public final sr3 c() {
        return (ow3) this.G.getValue();
    }

    public final Object get(Object obj) {
        return ((ow3) this.G.getValue()).O(obj);
    }

    public p16 x(yq3 yq3, fq3 fq3) {
        yq3.getClass();
        fq3.getClass();
        return new pw3(yq3, this.y, si0.w, this.A, fq3);
    }

    public final Object y(Object obj) {
        return get(obj);
    }

    /* renamed from: c  reason: collision with other method in class */
    public final vr3 m72c() {
        return (ow3) this.G.getValue();
    }
}
