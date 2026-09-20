package defpackage;

/* renamed from: mb5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mb5 extends a97 implements gs2 {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ ob5 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ float E;
    public final /* synthetic */ hl F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mb5(ob5 ob5, int i, float f, hl hlVar, f61 f61) {
        super(2, f61);
        this.C = ob5;
        this.D = i;
        this.E = f;
        this.F = hlVar;
    }

    public final Object H(Object obj, Object obj2) {
        return ((mb5) o((f61) obj2, (eh6) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        mb5 mb5 = new mb5(this.C, this.D, this.E, this.F, f61);
        mb5.B = obj;
        return mb5;
    }

    public final Object s(Object obj) {
        boolean z;
        int i;
        int i2 = this.A;
        vs7 vs7 = vs7.a;
        if (i2 == 0) {
            o85.q(obj);
            ob5 ob5 = this.C;
            o34 o34 = new o34((eh6) this.B, ob5, 1);
            this.A = 1;
            qb5 qb5 = rb5.a;
            int i3 = this.D;
            ob5.q.e(ob5.j(new Integer(i3).intValue()));
            if (i3 > ob5.e) {
                z = true;
            } else {
                z = false;
            }
            int e = (o34.e() - ob5.e) + 1;
            if (((z && i3 > o34.e()) || (!z && i3 < ob5.e)) && Math.abs(i3 - ob5.e) >= 3) {
                if (z) {
                    i = i3 - e;
                    int i4 = ob5.e;
                    if (i < i4) {
                        i = i4;
                    }
                } else {
                    int i5 = e + i3;
                    i = ob5.e;
                    if (i5 <= i) {
                        i = i5;
                    }
                }
                o34.f(i);
            }
            Object e2 = i95.e(0.0f, ((float) o34.b(i3)) + this.E, this.F, new dx4(1, new Object(), o34), this, 4);
            p81 p81 = p81.w;
            if (e2 != p81) {
                e2 = vs7;
            }
            if (e2 == p81) {
                return p81;
            }
            return vs7;
        } else if (i2 == 1) {
            o85.q(obj);
            return vs7;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }
}
