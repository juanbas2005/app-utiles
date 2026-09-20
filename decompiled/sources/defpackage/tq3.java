package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: tq3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class tq3 extends gr5 {
    public static final tq3 D = new gr5(uq3.class, "superclasses", "getSuperclasses(Lkotlin/reflect/KClass;)Ljava/util/List;", 1);

    public final Object get(Object obj) {
        gq3 gq3;
        gq3 gq32 = (gq3) obj;
        gq32.getClass();
        List<as3> e = gq32.e();
        ArrayList arrayList = new ArrayList();
        for (as3 J : e) {
            vq3 J2 = J.J();
            if (J2 instanceof gq3) {
                gq3 = (gq3) J2;
            } else {
                gq3 = null;
            }
            if (gq3 != null) {
                arrayList.add(gq3);
            }
        }
        return arrayList;
    }
}
