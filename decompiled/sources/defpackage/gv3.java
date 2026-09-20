package defpackage;

import java.util.LinkedHashMap;

/* renamed from: gv3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum gv3 {
    z("UNKNOWN"),
    A("CLASS"),
    B("FILE_FACADE"),
    C("SYNTHETIC_CLASS"),
    D("MULTIFILE_CLASS"),
    E("MULTIFILE_CLASS_PART");
    
    public static final tz2 x = null;
    public static final LinkedHashMap y = null;
    public final int w;

    static {
        int i;
        x = new tz2(2);
        gv3[] values = values();
        int F2 = tf4.F(values.length);
        if (F2 < 16) {
            F2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(F2);
        for (gv3 gv3 : values) {
            linkedHashMap.put(Integer.valueOf(gv3.w), gv3);
        }
        y = linkedHashMap;
    }

    /* access modifiers changed from: public */
    gv3(String str) {
        this.w = r2;
    }
}
