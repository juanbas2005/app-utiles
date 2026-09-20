package defpackage;

import java.nio.charset.Charset;

/* renamed from: p53  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p53 extends a97 implements js2 {
    public int A;
    public /* synthetic */ yl1 B;
    public /* synthetic */ hf0 C;
    public /* synthetic */ fp7 D;
    public final /* synthetic */ Charset E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p53(Charset charset, f61 f61) {
        super(5, f61);
        this.E = charset;
    }

    public final Object K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        sl7 sl7 = (sl7) obj;
        p53 p53 = new p53(this.E, (f61) obj5);
        p53.B = (yl1) obj2;
        p53.C = (hf0) obj3;
        p53.D = (fp7) obj4;
        return p53.s(vs7.a);
    }

    public final Object s(Object obj) {
        q51 q51;
        yl1 yl1 = this.B;
        hf0 hf0 = this.C;
        fp7 fp7 = this.D;
        int i = this.A;
        Charset charset = null;
        if (i == 0) {
            o85.q(obj);
            if (!sg3.e(fp7.a, b26.a.b(String.class))) {
                return null;
            }
            this.B = yl1;
            this.C = null;
            this.D = null;
            this.A = 1;
            obj = rc9.J0(hf0, this);
            p81 p81 = p81.w;
            if (obj == p81) {
                return p81;
            }
        } else if (i == 1) {
            o85.q(obj);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        py6 py6 = (py6) obj;
        l43 V = yl1.V();
        cc4 cc4 = q53.a;
        String x = V.d().a().x("Content-Type");
        if (x != null) {
            q51 q512 = q51.e;
            q51 = kw5.m(x);
        } else {
            q51 = null;
        }
        if (q51 != null) {
            charset = t51.a(q51);
        }
        if (charset == null) {
            charset = this.E;
        }
        q53.a.h("Reading response body for " + V.c().D() + " as String with charset " + charset);
        return z65.L(py6, charset, 2);
    }
}
