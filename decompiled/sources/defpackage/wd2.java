package defpackage;

import java.util.List;

/* renamed from: wd2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class wd2 {
    public static final List a = sg3.E(",", ".", ":", "(", ")");

    public static final String a(Object obj) {
        String s0 = k57.s0(k57.s0(String.valueOf(obj), "\\", "\\\\"), "\"", "\\\"");
        List<String> list = a;
        if (list != null && list.isEmpty()) {
            return s0;
        }
        for (String x0 : list) {
            if (d57.x0(s0, x0, false)) {
                return pb4.h('\"', "\"", s0);
            }
        }
        return s0;
    }
}
