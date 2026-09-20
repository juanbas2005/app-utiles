package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;

/* renamed from: c82  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c82 implements db2 {
    public final /* synthetic */ int a;

    public /* synthetic */ c82(int i) {
        this.a = i;
    }

    public final Object get() {
        switch (this.a) {
            case b85.b:
                return new iy2(1, Executors.newSingleThreadExecutor());
            default:
                jv2 jv2 = new jv2(14);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set != null) {
                    hashMap.put(to5.w, new n10(30000, 86400000, set));
                    if (set != null) {
                        hashMap.put(to5.y, new n10(1000, 86400000, set));
                        if (set != null) {
                            Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new kg6[]{kg6.x})));
                            if (unmodifiableSet != null) {
                                hashMap.put(to5.x, new n10(86400000, 86400000, unmodifiableSet));
                                if (hashMap.keySet().size() >= to5.values().length) {
                                    new HashMap();
                                    return new m10(jv2, hashMap);
                                }
                                h.s("Not all priorities have been configured");
                                return null;
                            }
                            ku4.j("Null flags");
                            return null;
                        }
                        ku4.j("Null flags");
                        return null;
                    }
                    ku4.j("Null flags");
                    return null;
                }
                ku4.j("Null flags");
                return null;
        }
    }
}
