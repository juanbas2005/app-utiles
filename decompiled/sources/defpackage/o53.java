package defpackage;

import java.nio.charset.Charset;

/* renamed from: o53  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o53 extends a97 implements hs2 {
    public /* synthetic */ y53 A;
    public /* synthetic */ Object B;
    public final /* synthetic */ String C;
    public final /* synthetic */ Charset D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o53(String str, Charset charset, f61 f61) {
        super(3, f61);
        this.C = str;
        this.D = charset;
    }

    public final Object s(Object obj) {
        q51 q51;
        Charset charset;
        y53 y53 = this.A;
        Object obj2 = this.B;
        o85.q(obj);
        cc4 cc4 = q53.a;
        String str = this.C;
        if (str != null && y53.c.E0("Accept-Charset") == null) {
            cc4 cc42 = q53.a;
            StringBuilder q = b81.q("Adding Accept-Charset=", str, " to ");
            q.append(y53.a);
            cc42.h(q.toString());
            y53.c.J("Accept-Charset", str);
        }
        if (!(obj2 instanceof String)) {
            return null;
        }
        q51 p = pv8.p(y53);
        if (p != null && !sg3.e(p.c, p51.b.c)) {
            return null;
        }
        String str2 = (String) obj2;
        if (p == null) {
            q51 = p51.b;
        } else {
            q51 = p;
        }
        if (p == null || (charset = t51.a(p)) == null) {
            charset = this.D;
        }
        cc4 cc43 = q53.a;
        cc43.h("Sending request body to " + y53.a + " as text/plain with charset " + charset);
        int i = t51.a;
        q51.getClass();
        charset.getClass();
        String name = charset.name();
        name.getClass();
        return new vc7(str2, q51.c(name));
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        o53 o53 = new o53(this.C, this.D, (f61) obj3);
        o53.A = (y53) obj;
        o53.B = obj2;
        return o53.s(vs7.a);
    }
}
