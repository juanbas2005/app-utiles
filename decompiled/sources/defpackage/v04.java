package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: v04  reason: default package */
public final class v04 implements sr2 {
    public final /* synthetic */ int w;
    public final w04 x;

    public /* synthetic */ v04(w04 w04, int i) {
        this.w = i;
        this.x = w04;
    }

    public final Object b() {
        int i = this.w;
        w04 w04 = this.x;
        switch (i) {
            case b85.b:
                if (ts1.f(w04) == null) {
                    return null;
                }
                ((pj3) w04.C.x).w.getClass();
                return null;
            case 1:
                x06 x06 = w04.D;
                ArrayList typeParameters = x06.getTypeParameters();
                ArrayList arrayList = new ArrayList(et0.e0(typeParameters, 10));
                Iterator it = typeParameters.iterator();
                while (it.hasNext()) {
                    m16 m16 = (m16) it.next();
                    qp7 d = ((up7) w04.F.y).d(m16);
                    if (d != null) {
                        arrayList.add(d);
                    } else {
                        throw new AssertionError("Parameter " + m16 + " surely belongs to class " + x06 + ", so it must be resolved");
                    }
                }
                return arrayList;
            default:
                return ya5.g(w04);
        }
    }
}
