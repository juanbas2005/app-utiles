package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bi4  reason: default package */
public final class bi4 implements sr2 {
    public final /* synthetic */ int w;
    public final Object x;
    public final Object y;
    public final int z;

    public /* synthetic */ bi4(Object obj, Object obj2, int i, int i2) {
        this.w = i2;
        this.x = obj;
        this.y = obj2;
        this.z = i;
    }

    public final Object b() {
        boolean z2;
        int i = this.w;
        a42 a42 = a42.w;
        List list = null;
        int i2 = this.z;
        Object obj = this.y;
        Object obj2 = this.x;
        switch (i) {
            case b85.b:
                ei4 ei4 = (ei4) obj2;
                k2 k2Var = (k2) obj;
                z00 z00 = ei4.a;
                st5 a = ei4.a((vj1) z00.c);
                if (a != null) {
                    list = dt0.b1(((ws1) z00.a).e.b(a, k2Var, i2));
                }
                if (list == null) {
                    return a42;
                }
                return list;
            case 1:
                ei4 ei42 = (ei4) obj2;
                k2 k2Var2 = (k2) obj;
                z00 z002 = ei42.a;
                st5 a2 = ei42.a((vj1) z002.c);
                if (a2 != null) {
                    list = ((ws1) z002.a).e.g(a2, k2Var2, i2);
                }
                if (list == null) {
                    return a42;
                }
                return list;
            default:
                u72 u72 = (u72) obj2;
                g3 g3Var = (g3) ((ArrayList) obj).get(i2);
                boolean z3 = false;
                if (g3Var.c == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jm jmVar = (jm) u72.e;
                if (jmVar == jm.TYPE_PARAMETER_BOUNDS) {
                    z3 = true;
                }
                if (!z2 && !z3) {
                    jmVar = jm.TYPE_USE;
                }
                ak3 ak3 = g3Var.b;
                if (ak3 != null) {
                    return (ki3) ak3.a.get(jmVar);
                }
                return null;
        }
    }
}
