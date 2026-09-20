package defpackage;

import java.util.regex.Pattern;

/* renamed from: xh5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xh5 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public String B;
    public int C;
    public final /* synthetic */ String D;
    public final /* synthetic */ ni5 E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xh5(String str, ni5 ni5, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.D = str;
        this.E = ni5;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((xh5) o(f61, o81)).s(vs7);
            default:
                return ((xh5) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        ni5 ni5 = this.E;
        String str = this.D;
        switch (i) {
            case b85.b:
                return new xh5(str, ni5, f61, 0);
            default:
                return new xh5(str, ni5, f61, 1);
        }
    }

    public final Object s(Object obj) {
        String str;
        String str2;
        int i = this.A;
        az7 az7 = az7.PLAN_AMIGO_BASE;
        ni5 ni5 = this.E;
        String str3 = this.D;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.C;
                if (i2 == 0) {
                    o85.q(obj);
                    Pattern compile = Pattern.compile("[^\\d]");
                    compile.getClass();
                    str3.getClass();
                    String replaceAll = compile.matcher(str3).replaceAll("");
                    replaceAll.getClass();
                    this.B = replaceAll;
                    this.C = 1;
                    Object a = ni5.a(ni5, az7, this);
                    if (a == p81) {
                        return p81;
                    }
                    String str4 = replaceAll;
                    obj = a;
                    str = str4;
                } else if (i2 == 1) {
                    str = this.B;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return obj + "2*1*" + str + "#";
            default:
                int i3 = this.C;
                if (i3 == 0) {
                    o85.q(obj);
                    Pattern compile2 = Pattern.compile("[^\\d]");
                    compile2.getClass();
                    str3.getClass();
                    String replaceAll2 = compile2.matcher(str3).replaceAll("");
                    replaceAll2.getClass();
                    this.B = replaceAll2;
                    this.C = 1;
                    Object a2 = ni5.a(ni5, az7, this);
                    if (a2 == p81) {
                        return p81;
                    }
                    String str5 = replaceAll2;
                    obj = a2;
                    str2 = str5;
                } else if (i3 == 1) {
                    str2 = this.B;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return obj + "2*2*" + str2 + "#";
        }
    }
}
