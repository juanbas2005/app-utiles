package defpackage;

/* renamed from: dn2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dn2 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public np5 B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ byte[] E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dn2(byte[] bArr, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.E = bArr;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        np5 np5 = (np5) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((dn2) o(f61, np5)).s(vs7);
            default:
                return ((dn2) o(f61, np5)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                dn2 dn2 = new dn2(this.E, f61, 0);
                dn2.D = obj;
                return dn2;
            default:
                dn2 dn22 = new dn2(this.E, f61, 1);
                dn22.D = obj;
                return dn22;
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        byte[] bArr = this.E;
        p81 p81 = p81.w;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                np5 np5 = (np5) this.D;
                int i2 = this.C;
                if (i2 == 0) {
                    o85.q(obj);
                    if (bArr != null) {
                        dn1 dn1 = aw1.a;
                        cn2 cn2 = new cn2(bArr, (f61) null, 0);
                        this.D = null;
                        this.B = np5;
                        this.C = 1;
                        obj = ar7.e0(dn1, cn2, this);
                        if (obj == p81) {
                            return p81;
                        }
                        np5.setValue(obj);
                    }
                } else if (i2 == 1) {
                    np5 = this.B;
                    o85.q(obj);
                    np5.setValue(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7;
            default:
                np5 np52 = (np5) this.D;
                int i3 = this.C;
                if (i3 == 0) {
                    o85.q(obj);
                    if (bArr != null) {
                        dn1 dn12 = aw1.a;
                        cn2 cn22 = new cn2(bArr, (f61) null, 1);
                        this.D = null;
                        this.B = np52;
                        this.C = 1;
                        obj = ar7.e0(dn12, cn22, this);
                        if (obj == p81) {
                            return p81;
                        }
                        np52.setValue(obj);
                    }
                } else if (i3 == 1) {
                    np52 = this.B;
                    o85.q(obj);
                    np52.setValue(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7;
        }
    }
}
