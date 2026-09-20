package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: z47  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public interface z47 {
    static {
        int i = y47.a;
    }

    boolean isEmpty();

    Set l();

    Set names();

    boolean t();

    List v(String str);

    void w(gs2 gs2) {
        for (Map.Entry entry : l()) {
            gs2.H((String) entry.getKey(), (List) entry.getValue());
        }
    }

    String x(String str) {
        List v = v(str);
        if (v != null) {
            return (String) dt0.y0(v);
        }
        return null;
    }
}
