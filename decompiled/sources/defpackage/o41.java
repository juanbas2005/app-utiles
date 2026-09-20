package defpackage;

/* renamed from: o41  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o41 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ hf0 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o41(hf0 hf0, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = hf0;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((o41) o(f61, obj)).s(vs7);
            default:
                return ((o41) o(f61, obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                o41 o41 = new o41(this.C, f61, 0);
                o41.B = obj;
                return o41;
            default:
                o41 o412 = new o41(this.C, f61, 1);
                o412.B = obj;
                return o412;
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        boolean z = true;
        hf0 hf0 = this.C;
        Object obj2 = this.B;
        switch (i) {
            case b85.b:
                o85.q(obj);
                if (obj2 == null && !hf0.h()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                o85.q(obj);
                if (obj2 == null && !hf0.h()) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
