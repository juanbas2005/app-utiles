package defpackage;

import io.ktor.http.Url;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: c51  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c51 extends a97 implements js2 {
    public int A;
    public /* synthetic */ yl1 B;
    public /* synthetic */ hf0 C;
    public /* synthetic */ fp7 D;
    public final /* synthetic */ Set E;
    public final /* synthetic */ List F;
    public final /* synthetic */ vr0 G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c51(vr0 vr0, f61 f61, List list, Set set) {
        super(5, f61);
        this.E = set;
        this.F = list;
        this.G = vr0;
    }

    public final Object K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        sl7 sl7 = (sl7) obj;
        List list = this.F;
        c51 c51 = new c51(this.G, (f61) obj5, list, this.E);
        c51.B = (yl1) obj2;
        c51.C = (hf0) obj3;
        c51.D = (fp7) obj4;
        return c51.s(vs7.a);
    }

    public final Object s(Object obj) {
        q51 q51;
        Charset charset;
        Charset charset2;
        yl1 yl1 = this.B;
        hf0 hf0 = this.C;
        fp7 fp7 = this.D;
        int i = this.A;
        if (i == 0) {
            o85.q(obj);
            yl1.getClass();
            String x = yl1.a().x("Content-Type");
            if (x != null) {
                q51 q512 = q51.e;
                q51 = kw5.m(x);
            } else {
                q51 = null;
            }
            if (q51 == null) {
                return null;
            }
            cz2 a = yl1.V().c().a();
            Charset charset3 = mo0.a;
            a.getClass();
            charset3.getClass();
            Iterator it = dt0.U0(tf4.H(a.x("Accept-Charset")), new a91(16)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    charset = null;
                    break;
                }
                String str = ((wy2) it.next()).a;
                if (!sg3.e(str, "*")) {
                    Charset charset4 = mo0.a;
                    str.getClass();
                    if (Charset.isSupported(str)) {
                        charset = Charset.forName(str);
                        charset.getClass();
                        break;
                    }
                } else {
                    charset = charset3;
                    break;
                }
            }
            if (charset == null) {
                charset2 = charset3;
            } else {
                charset2 = charset;
            }
            Url D2 = yl1.V().c().D();
            this.B = null;
            this.C = null;
            this.D = null;
            this.A = 1;
            Object b = f51.b(this.E, this.F, D2, fp7, hf0, q51, charset2, this);
            p81 p81 = p81.w;
            if (b == p81) {
                return p81;
            }
            return b;
        } else if (i == 1) {
            o85.q(obj);
            return obj;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }
}
