package defpackage;

import java.util.LinkedHashMap;

/* renamed from: ox4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ox4 {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(nx4 nx4) {
        nx4.getClass();
        String A = tf4.A(nx4.getClass());
        if (A.length() > 0) {
            LinkedHashMap linkedHashMap = this.a;
            nx4 nx42 = (nx4) linkedHashMap.get(A);
            if (!sg3.e(nx42, nx4)) {
                if (nx42 != null && nx42.b) {
                    ku4.u("Navigator ", nx4, " is replacing an already attached ", nx42);
                } else if (!nx4.b) {
                    nx4 nx43 = (nx4) linkedHashMap.put(A, nx4);
                } else {
                    h.p(nx4, " is already attached to another NavController", "Navigator ");
                }
            }
        } else {
            h.q("navigator name cannot be an empty string");
        }
    }

    public final nx4 b(String str) {
        str.getClass();
        if (str.length() > 0) {
            nx4 nx4 = (nx4) this.a.get(str);
            if (nx4 != null) {
                return nx4;
            }
            h.s(f21.h("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
            return null;
        }
        h.q("navigator name cannot be an empty string");
        return null;
    }
}
