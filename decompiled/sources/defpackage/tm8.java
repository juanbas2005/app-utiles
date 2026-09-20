package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: tm8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tm8 {
    public static final tm8 c = new tm8();
    public final em8 a = new em8();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public final wm8 a(Class cls) {
        boolean z;
        wm8 wm8;
        or2 or2;
        ConcurrentHashMap concurrentHashMap = this.b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (wm8) obj;
        }
        em8 em8 = this.a;
        em8.getClass();
        xb4 xb4 = xm8.a;
        if (!nl8.class.isAssignableFrom(cls)) {
            int i = rk8.a;
        }
        vm8 h = em8.a.h(cls);
        if ((h.d & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int i2 = rk8.a;
            int i3 = qm8.a;
            int i4 = cm8.a;
            xb4 xb42 = xm8.a;
            if (h.a() - 1 != 1) {
                or2 = hl8.a;
            } else {
                or2 = null;
            }
            int i5 = im8.a;
            wm8 = om8.z(h, xb42, or2);
        } else {
            int i6 = rk8.a;
            xb4 xb43 = xm8.a;
            or2 or22 = hl8.a;
            wm8 = new pm8(xb43, h.a);
        }
        wm8 wm82 = (wm8) concurrentHashMap.putIfAbsent(cls, wm8);
        if (wm82 != null) {
            return wm82;
        }
        return wm8;
    }
}
