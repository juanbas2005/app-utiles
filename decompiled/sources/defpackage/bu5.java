package defpackage;

import androidx.datastore.preferences.protobuf.e;
import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.h;
import androidx.datastore.preferences.protobuf.i;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.l;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: bu5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bu5 {
    public static final bu5 c = new bu5();
    public final f96 a = new f96(2);
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public final pg6 a(Class cls) {
        boolean z;
        pg6 pg6;
        ba2 ba2;
        ba2 ba22;
        Class cls2;
        tf3.a("messageType", cls);
        ConcurrentHashMap concurrentHashMap = this.b;
        pg6 pg62 = (pg6) concurrentHashMap.get(cls);
        if (pg62 != null) {
            return pg62;
        }
        f96 f96 = this.a;
        f96.getClass();
        Class cls3 = i.a;
        Class<e> cls4 = e.class;
        if (cls4.isAssignableFrom(cls) || (cls2 = i.a) == null || cls2.isAssignableFrom(cls)) {
            ew5 a2 = ((ve4) f96.x).a(cls);
            if ((a2.d & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (cls4.isAssignableFrom(cls)) {
                    pg6 = new h(i.c, da2.a, a2.a);
                } else {
                    j jVar = i.b;
                    ba2 ba23 = da2.b;
                    if (ba23 != null) {
                        pg6 = new h(jVar, ba23, a2.a);
                    } else {
                        h.s("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                }
            } else if (cls4.isAssignableFrom(cls)) {
                gz4 gz4 = iz4.b;
                s74 s74 = t74.b;
                l lVar = i.c;
                if (b81.B(a2.a()) != 1) {
                    ba22 = da2.a;
                } else {
                    ba22 = null;
                }
                lf4 lf4 = nf4.b;
                if (a2 instanceof ew5) {
                    pg6 = g.w(a2, gz4, s74, lVar, ba22, lf4);
                } else {
                    int[] iArr = g.n;
                    ku4.a();
                    return null;
                }
            } else {
                gz4 gz42 = iz4.a;
                s74 s742 = t74.a;
                j jVar2 = i.b;
                if (b81.B(a2.a()) != 1) {
                    ba2 ba24 = da2.b;
                    if (ba24 != null) {
                        ba2 = ba24;
                    } else {
                        h.s("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                } else {
                    ba2 = null;
                }
                lf4 lf42 = nf4.a;
                if (a2 instanceof ew5) {
                    pg6 = g.w(a2, gz42, s742, jVar2, ba2, lf42);
                } else {
                    int[] iArr2 = g.n;
                    ku4.a();
                    return null;
                }
            }
            pg6 pg63 = (pg6) concurrentHashMap.putIfAbsent(cls, pg6);
            if (pg63 != null) {
                return pg63;
            }
            return pg6;
        }
        h.q("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        return null;
    }
}
