package defpackage;

import java.util.List;

/* renamed from: c26  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class c26 {
    public gq3 b(Class cls) {
        return new mq0(cls);
    }

    public wq3 c(Class cls) {
        return new da5(cls);
    }

    public as3 d(as3 as3) {
        yp7 yp7 = (yp7) as3;
        vq3 J = as3.J();
        List I = as3.I();
        yp7.getClass();
        return new yp7(J, I, yp7.y | 2);
    }

    public String j(qs2 qs2) {
        String obj = qs2.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }

    public String k(wx3 wx3) {
        return j(wx3);
    }

    public void l(cs3 cs3, List list) {
        tp7 tp7 = (tp7) cs3;
        tp7.getClass();
        list.getClass();
        if (tp7.A == null) {
            tp7.A = list;
        } else {
            ku4.i(tp7, "' have already been initialized.", "Upper bounds of type parameter '");
        }
    }

    public as3 m(vq3 vq3, List list, boolean z) {
        vq3.getClass();
        list.getClass();
        return new yp7(vq3, list, z ? 1 : 0);
    }

    public cs3 n(gq3 gq3) {
        return new tp7(gq3);
    }

    public zq3 a(ct2 ct2) {
        return ct2;
    }

    public hr3 e(ji1 ji1) {
        return ji1;
    }

    public jr3 f(qp4 qp4) {
        return qp4;
    }

    public ur3 g(xz3 xz3) {
        return xz3;
    }

    public wr3 h(gr5 gr5) {
        return gr5;
    }

    public xr3 i(hr5 hr5) {
        return hr5;
    }
}
