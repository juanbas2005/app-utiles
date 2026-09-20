package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: nv2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nv2 {
    public final List a;

    public nv2(List list) {
        this.a = list;
        if (list.isEmpty()) {
            h.q("credentialOptions should not be empty");
            throw null;
        } else if (list.size() > 1) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    pv2 pv2 = (pv2) it.next();
                }
            }
            for (pv2 pv22 : this.a) {
            }
        }
    }
}
