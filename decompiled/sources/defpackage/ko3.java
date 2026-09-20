package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: ko3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ko3 extends pv8 {
    public final List A;

    public ko3(Class cls) {
        cls.getClass();
        Object[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        a91 a91 = new a91(20);
        if (declaredMethods.length != 0) {
            declaredMethods = Arrays.copyOf(declaredMethods, declaredMethods.length);
            if (declaredMethods.length > 1) {
                Arrays.sort(declaredMethods, a91);
            }
        }
        List asList = Arrays.asList(declaredMethods);
        asList.getClass();
        this.A = asList;
    }

    public final String m() {
        return dt0.E0(this.A, "", "<init>(", ")V", jo3.x, 24);
    }
}
