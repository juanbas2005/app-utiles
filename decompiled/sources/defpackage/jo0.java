package defpackage;

import java.util.HashMap;

/* renamed from: jo0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum jo0 {
    ;
    
    public static final HashMap y = null;
    public static final HashMap z = null;
    public final int[] w;
    public final String[] x;

    static {
        y = new HashMap();
        z = new HashMap();
        for (jo0 jo0 : values()) {
            for (int valueOf : jo0.w) {
                y.put(Integer.valueOf(valueOf), jo0);
            }
            z.put(jo0.name(), jo0);
            for (String put : jo0.x) {
                z.put(put, jo0);
            }
        }
    }

    /* access modifiers changed from: public */
    jo0(int i, String... strArr) {
        this.w = new int[]{i};
        this.x = strArr;
    }

    /* access modifiers changed from: public */
    jo0(int[] iArr, String... strArr) {
        this.w = iArr;
        this.x = strArr;
    }
}
