package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: tq1  reason: default package */
public final class tq1 implements sr2 {
    public final /* synthetic */ int w;
    public final vq1 x;
    public final fq3 y;

    public /* synthetic */ tq1(vq1 vq1, fq3 fq3, int i) {
        this.w = i;
        this.x = vq1;
        this.y = fq3;
    }

    public final Object b() {
        switch (this.w) {
            case b85.b:
                vq1 vq1 = this.x;
                fq3 fq3 = this.y;
                ds1 Q = vq1.Q();
                is3 b = fq3.b(vq1.getName(), vq1.getTypeParameters());
                is3 is3 = is3.c;
                as3 as3 = b.b(Q, ks3.w).b;
                if (as3 != null) {
                    return as3;
                }
                mb2.f(vq1.getName());
                throw null;
            default:
                vq1 vq12 = this.x;
                fq3 fq32 = this.y;
                List<qp7> typeParameters = vq12.R().getTypeParameters();
                typeParameters.getClass();
                ArrayList arrayList = new ArrayList(et0.e0(typeParameters, 10));
                for (qp7 qp7 : typeParameters) {
                    p16 j0 = r16.j0(vq12);
                    qp7.getClass();
                    arrayList.add(new ds3(j0, qp7));
                }
                is3 b2 = fq32.b(vq12.getName(), arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ds3 ds3 = (ds3) it.next();
                    List<as3> upperBounds = ds3.getUpperBounds();
                    ArrayList arrayList2 = new ArrayList(et0.e0(upperBounds, 10));
                    for (as3 b3 : upperBounds) {
                        is3 is32 = is3.c;
                        as3 as32 = b2.b(b3, ks3.w).b;
                        if (as32 != null) {
                            arrayList2.add(as32);
                        } else {
                            mb2.f(vq12.getName());
                            throw null;
                        }
                    }
                    ds3.B = arrayList2;
                }
                return arrayList;
        }
    }
}
