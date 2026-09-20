package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: t11  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t11 extends kd4 {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ Object i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t11(j19 j19) {
        super(20);
        this.i = j19;
    }

    public Object c(Object obj) {
        LinkedHashMap linkedHashMap;
        switch (this.h) {
            case b85.b:
                String str = (String) obj;
                str.getClass();
                return ((u11) this.i).w.k0(str);
            case 2:
                String str2 = (String) obj;
                z65.h(str2);
                j19 j19 = (j19) this.i;
                j19.d1();
                z65.h(str2);
                uq8 uq8 = j19.x.y;
                v89.R(uq8);
                fm8 k2 = uq8.k2(str2);
                if (k2 == null) {
                    return null;
                }
                pz8 pz8 = ((y19) j19.w).B;
                y19.g(pz8);
                pz8.J.b("Populate EES config from database on cache miss. appId", str2);
                j19.k1(str2, j19.l1(str2, (byte[]) k2.x));
                t11 t11 = j19.G;
                synchronized (((jv2) t11.g)) {
                    Set entrySet = ((ld4) t11.f).a.entrySet();
                    entrySet.getClass();
                    linkedHashMap = new LinkedHashMap(entrySet.size());
                    Set<Map.Entry> entrySet2 = ((ld4) t11.f).a.entrySet();
                    entrySet2.getClass();
                    for (Map.Entry entry : entrySet2) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return (gt8) linkedHashMap.get(str2);
            default:
                return super.c(obj);
        }
    }

    public void d(Object obj, Object obj2, Object obj3) {
        switch (this.h) {
            case b85.b:
                ab6 ab6 = (ab6) obj2;
                ab6 ab62 = (ab6) obj3;
                ((String) obj).getClass();
                ab6.getClass();
                ab6.close();
                return;
            case 1:
                sx5 sx5 = (sx5) obj2;
                sx5 sx52 = (sx5) obj3;
                ((qa) ((kg5) this.i).x).m((mi4) obj, sx5.a, sx5.b, sx5.c);
                return;
            default:
                super.d(obj, obj2, obj3);
                return;
        }
    }

    public int o(Object obj, Object obj2) {
        switch (this.h) {
            case 1:
                mi4 mi4 = (mi4) obj;
                return ((sx5) obj2).c;
            default:
                return super.o(obj, obj2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t11(int i2, kg5 kg5) {
        super(i2);
        this.i = kg5;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t11(u11 u11) {
        super(25);
        this.i = u11;
    }
}
