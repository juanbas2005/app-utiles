package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: l60  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l60 extends InheritableThreadLocal {
    public final Object childValue(Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }
}
