package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: z62  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z62 {
    public static final z62 a = new Object();
    public static final p62 b = p62.w;
    public static final j62 c = new j62(uq4.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));
    public static final v62 d = c(x62.D, new String[0]);
    public static final v62 e = c(x62.Q, new String[0]);
    public static final Set f = wn6.w(new q62());

    public static final t62 a(u62 u62, boolean z, String... strArr) {
        if (!z) {
            return new t62(u62, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return new t62(u62, (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static final t62 b(u62 u62, String... strArr) {
        return a(u62, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final v62 c(x62 x62, String... strArr) {
        x62.getClass();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return e(x62, a42.w, d(x62, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static w62 d(x62 x62, String... strArr) {
        x62.getClass();
        return new w62(x62, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static v62 e(x62 x62, List list, wo7 wo7, String... strArr) {
        x62.getClass();
        return new v62(wo7, b(u62.ERROR_TYPE_SCOPE, wo7.toString()), x62, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean f(vj1 vj1) {
        if (vj1 == null) {
            return false;
        }
        if ((vj1 instanceof j62) || (vj1.r() instanceof j62) || vj1 == b) {
            return true;
        }
        return false;
    }
}
