package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ez0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ez0 implements ul6 {
    public final vr2 w;
    public final ConcurrentHashMap x;

    public ez0(int i, vr2 vr2) {
        switch (i) {
            case 1:
                this.w = vr2;
                this.x = new ConcurrentHashMap();
                return;
            default:
                this.w = vr2;
                this.x = new ConcurrentHashMap();
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r2 = new defpackage.dh0((defpackage.zr3) r3.w.y(r4));
     */
    public zr3 a(gq3 gq3) {
        Object putIfAbsent;
        Class u = kl8.u(gq3);
        ConcurrentHashMap concurrentHashMap = this.x;
        Object obj = concurrentHashMap.get(u);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(u, obj)) != null) {
            obj = putIfAbsent;
        }
        return ((dh0) obj).a;
    }

    public Object b(Class cls) {
        cls.getClass();
        ConcurrentHashMap concurrentHashMap = this.x;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return obj;
        }
        Object y = this.w.y(cls);
        Object putIfAbsent = concurrentHashMap.putIfAbsent(cls, y);
        if (putIfAbsent == null) {
            return y;
        }
        return putIfAbsent;
    }
}
