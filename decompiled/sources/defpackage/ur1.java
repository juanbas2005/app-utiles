package defpackage;

/* renamed from: ur1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ur1 extends yr1 implements wr3 {
    public final nz3 L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ur1(yq3 yq3, cr5 cr5, fq3 fq3) {
        super(yq3, cr5, fq3);
        yq3.getClass();
        cr5.getClass();
        fq3.getClass();
        sr1 sr1 = new sr1(this, 0);
        i44 i44 = i44.w;
        this.L = rg3.y(i44, sr1);
        rg3.y(i44, new sr1(this, 1));
    }

    public final mr1 U() {
        return (tr1) this.L.getValue();
    }

    /* renamed from: V */
    public ur1 x(yq3 yq3, fq3 fq3) {
        yq3.getClass();
        fq3.getClass();
        return new ur1(yq3, R(), fq3);
    }

    public final sr3 c() {
        return (tr1) this.L.getValue();
    }

    public final Object get(Object obj) {
        return ((tr1) this.L.getValue()).O(obj);
    }

    public final Object y(Object obj) {
        return get(obj);
    }

    /* renamed from: c  reason: collision with other method in class */
    public final vr3 m80c() {
        return (tr1) this.L.getValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ur1(yq3 yq3, String str, String str2, Object obj) {
        super(yq3, str, str2, obj);
        str.getClass();
        str2.getClass();
        sr1 sr1 = new sr1(this, 0);
        i44 i44 = i44.w;
        this.L = rg3.y(i44, sr1);
        rg3.y(i44, new sr1(this, 1));
    }
}
