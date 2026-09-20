package defpackage;

import java.util.ArrayList;

/* renamed from: qn4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class qn4 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ o9 x;

    public /* synthetic */ qn4(o9 o9Var, int i) {
        this.w = i;
        this.x = o9Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: kc5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: kc5} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object b() {
        int i = this.w;
        float f = 0.0f;
        Object obj = null;
        int i2 = 1;
        o9 o9Var = this.x;
        switch (i) {
            case b85.b:
                ArrayList arrayList = (ArrayList) o9Var.y;
                if (!arrayList.isEmpty()) {
                    Object obj2 = arrayList.get(0);
                    float d = ((kc5) obj2).a.d();
                    int size = arrayList.size() - 1;
                    if (1 <= size) {
                        while (true) {
                            Object obj3 = arrayList.get(i2);
                            float d2 = ((kc5) obj3).a.d();
                            if (Float.compare(d, d2) < 0) {
                                obj2 = obj3;
                                d = d2;
                            }
                            if (i2 != size) {
                                i2++;
                            }
                        }
                    }
                    obj = obj2;
                }
                kc5 kc5 = (kc5) obj;
                if (kc5 != null) {
                    f = kc5.a.d();
                }
                return Float.valueOf(f);
            default:
                ArrayList arrayList2 = (ArrayList) o9Var.y;
                if (!arrayList2.isEmpty()) {
                    Object obj4 = arrayList2.get(0);
                    float c = ((kc5) obj4).a.E.c();
                    int size2 = arrayList2.size() - 1;
                    if (1 <= size2) {
                        while (true) {
                            Object obj5 = arrayList2.get(i2);
                            float c2 = ((kc5) obj5).a.E.c();
                            if (Float.compare(c, c2) < 0) {
                                obj4 = obj5;
                                c = c2;
                            }
                            if (i2 != size2) {
                                i2++;
                            }
                        }
                    }
                    obj = obj4;
                }
                kc5 kc52 = (kc5) obj;
                if (kc52 != null) {
                    f = kc52.a.E.c();
                }
                return Float.valueOf(f);
        }
    }
}
