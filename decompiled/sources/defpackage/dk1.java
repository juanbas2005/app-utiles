package defpackage;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.regex.Pattern;

/* renamed from: dk1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class dk1 {
    public static final Pattern a = Pattern.compile(",");
    public static final HashMap b;

    static {
        EnumSet of = EnumSet.of(d50.H);
        EnumSet of2 = EnumSet.of(d50.B);
        EnumSet of3 = EnumSet.of(d50.w);
        EnumSet of4 = EnumSet.of(d50.G);
        EnumSet of5 = EnumSet.of(d50.K, new d50[]{d50.L, d50.D, d50.C, d50.I, d50.J});
        EnumSet of6 = EnumSet.of(d50.y, d50.z, d50.A, d50.E, d50.x);
        EnumSet copyOf = EnumSet.copyOf(of5);
        copyOf.addAll(of6);
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put("ONE_D_MODE", copyOf);
        hashMap.put("PRODUCT_MODE", of5);
        hashMap.put("QR_CODE_MODE", of);
        hashMap.put("DATA_MATRIX_MODE", of2);
        hashMap.put("AZTEC_MODE", of3);
        hashMap.put("PDF417_MODE", of4);
    }
}
