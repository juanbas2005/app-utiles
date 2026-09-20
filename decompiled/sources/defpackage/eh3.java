package defpackage;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: eh3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class eh3 {
    public final a96 a;
    public final do7 b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final ReentrantLock d = new ReentrantLock();
    public final q83 e = new q83(this, 6);
    public final q83 f = new q83(this, 7);
    public final Object g;

    public eh3(a96 a96, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.a = a96;
        boolean z = a96.k;
        boolean z2 = z;
        do7 do7 = new do7(a96, linkedHashMap, linkedHashMap2, strArr, z2, new o0(1, this, eh3.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 0, 20));
        this.b = do7;
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.g = new Object();
        do7.k = new zh(23, (Object) this);
    }
}
