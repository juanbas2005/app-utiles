package defpackage;

import java.security.AccessControlException;
import java.util.HashMap;

/* renamed from: ow5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ow5 implements qv3 {
    public static final boolean D;
    public static final HashMap E;
    public String[] A;
    public String[] B;
    public gv3 C;
    public int[] w;
    public String x;
    public int y;
    public String[] z;

    static {
        try {
            D = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            D = false;
        }
        HashMap hashMap = new HashMap();
        E = hashMap;
        hashMap.put(pv8.P(new up2("kotlin.jvm.internal.KotlinClass")), gv3.A);
        hashMap.put(pv8.P(new up2("kotlin.jvm.internal.KotlinFileFacade")), gv3.B);
        hashMap.put(pv8.P(new up2("kotlin.jvm.internal.KotlinMultifileClass")), gv3.D);
        hashMap.put(pv8.P(new up2("kotlin.jvm.internal.KotlinMultifileClassPart")), gv3.E);
        hashMap.put(pv8.P(new up2("kotlin.jvm.internal.KotlinSyntheticClass")), gv3.C);
    }

    public final ov3 f(gq0 gq0, k06 k06) {
        gv3 gv3;
        if (gq0.a().equals(nn3.a)) {
            return new ay4(3, this);
        }
        if (D || this.C != null || (gv3 = (gv3) E.get(gq0)) == null) {
            return null;
        }
        this.C = gv3;
        return new br4(6, (Object) this);
    }
}
