package defpackage;

import java.util.List;

/* renamed from: m94  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m94 extends a97 implements gs2 {
    public final /* synthetic */ int A = 1;
    public /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ a37 F;
    public final /* synthetic */ Object G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m94(mm7 mm7, iu4 iu4, zs4 zs4, gp4 gp4, a37 a37, hx0 hx0, f61 f61) {
        super(2, f61);
        this.B = mm7;
        this.C = iu4;
        this.D = zs4;
        this.E = gp4;
        this.F = a37;
        this.G = hx0;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                ((m94) o(f61, o81)).s(vs7);
                return vs7;
            default:
                ((m94) o(f61, o81)).s(vs7);
                return vs7;
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.G;
        Object obj3 = this.E;
        Object obj4 = this.D;
        Object obj5 = this.C;
        switch (i) {
            case b85.b:
                m94 m94 = new m94((uj) obj5, (List) obj3, (bd5) this.F, (ad5) obj2, (uj) obj4, f61);
                m94.B = obj;
                return m94;
            default:
                return new m94((mm7) this.B, (iu4) obj5, (zs4) obj4, (gp4) obj3, this.F, (hx0) obj2, f61);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        Object obj2 = this.E;
        Object obj3 = this.G;
        a37 a37 = this.F;
        Object obj4 = this.D;
        Object obj5 = this.C;
        switch (i) {
            case b85.b:
                o85.q(obj);
                o81 o81 = (o81) this.B;
                uj ujVar = (uj) obj5;
                List list = (List) obj2;
                bd5 bd5 = (bd5) a37;
                ad5 ad5 = (ad5) obj3;
                uj ujVar2 = (uj) obj4;
                if (o81.k().a0(me6.D) == null) {
                    ar7.H(o81, (e81) null, (r81) null, new p6(ujVar, list, bd5, ad5, (f61) null), 3);
                    ar7.H(o81, (e81) null, (r81) null, new ot(ujVar2, (f61) null, 13), 3);
                    return vs7;
                }
                ku4.a();
                return null;
            default:
                o85.q(obj);
                mm7 mm7 = (mm7) this.B;
                Object H0 = mm7.a.H0();
                ed5 ed5 = mm7.d;
                if (sg3.e(H0, ed5.getValue()) && (((zs4) ((iu4) obj5).b.f.p()) == null || sg3.e(ed5.getValue(), (zs4) obj4))) {
                    hx0 hx0 = (hx0) obj3;
                    for (zs4 c : (List) a37.getValue()) {
                        hx0.b().c(c);
                    }
                    gp4 gp4 = (gp4) obj2;
                    long[] jArr = gp4.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((255 & j) < 128) {
                                        int i5 = (i2 << 3) + i4;
                                        Object obj6 = gp4.b[i5];
                                        float f = gp4.c[i5];
                                        if (!sg3.e((String) obj6, ((zs4) ed5.getValue()).B)) {
                                            gp4.e(i5);
                                        }
                                    }
                                    j >>= 8;
                                }
                                if (i3 != 8) {
                                }
                            }
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    }
                }
                return vs7;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m94(uj ujVar, List list, bd5 bd5, ad5 ad5, uj ujVar2, f61 f61) {
        super(2, f61);
        this.C = ujVar;
        this.E = list;
        this.F = bd5;
        this.G = ad5;
        this.D = ujVar2;
    }
}
