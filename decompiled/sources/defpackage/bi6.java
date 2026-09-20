package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: bi6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class bi6 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ ci6 x;

    public /* synthetic */ bi6(ci6 ci6, int i) {
        this.w = i;
        this.x = ci6;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        ci6 ci6 = this.x;
        nq0 nq0 = (nq0) obj;
        switch (i) {
            case b85.b:
                nq0.getClass();
                nq0.b(nq0, "type", t47.b, 12);
                bi6 bi6 = new bi6(ci6, 1);
                nq0.b(nq0, "value", b85.f("kotlinx.serialization.Sealed<" + ci6.a.A() + '>', pl6.l, new ll6[0], bi6), 12);
                List list = ci6.b;
                list.getClass();
                nq0.b = list;
                return vs7;
            default:
                nq0.getClass();
                for (Map.Entry entry : ci6.e.entrySet()) {
                    nq0.b(nq0, (String) entry.getKey(), ((zr3) entry.getValue()).getDescriptor(), 12);
                }
                return vs7;
        }
    }
}
