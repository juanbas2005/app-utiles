package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: ty2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ty2 extends x0 {
    public final zr3 a;
    public final zr3 b;
    public final /* synthetic */ int c;
    public final sy2 d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ty2(zr3 zr3, zr3 zr32, int i) {
        this(zr3, zr32, (byte) 0);
        this.c = i;
        zr3.getClass();
        zr32.getClass();
        switch (i) {
            case 1:
                this(zr3, zr32, (byte) 0);
                ll6 descriptor = zr3.getDescriptor();
                ll6 descriptor2 = zr32.getDescriptor();
                descriptor.getClass();
                descriptor2.getClass();
                this.d = new sy2("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
                return;
            default:
                ll6 descriptor3 = zr3.getDescriptor();
                ll6 descriptor4 = zr32.getDescriptor();
                descriptor3.getClass();
                descriptor4.getClass();
                this.d = new sy2("kotlin.collections.HashMap", descriptor3, descriptor4);
                return;
        }
    }

    public final Object a() {
        switch (this.c) {
            case b85.b:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    public final int b(Object obj) {
        int size;
        switch (this.c) {
            case b85.b:
                HashMap hashMap = (HashMap) obj;
                hashMap.getClass();
                size = hashMap.size();
                break;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                size = linkedHashMap.size();
                break;
        }
        return size * 2;
    }

    public final Iterator c(Object obj) {
        switch (this.c) {
            case b85.b:
                Map map = (Map) obj;
                map.getClass();
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.entrySet().iterator();
        }
    }

    public final int d(Object obj) {
        switch (this.c) {
            case b85.b:
                Map map = (Map) obj;
                map.getClass();
                return map.size();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.size();
        }
    }

    public final void f(gy0 gy0, int i, Object obj) {
        Object obj2;
        Map map = (Map) obj;
        map.getClass();
        Object r = gy0.r(getDescriptor(), i, this.a, (Object) null);
        int h = gy0.h(getDescriptor());
        if (h == i + 1) {
            boolean containsKey = map.containsKey(r);
            zr3 zr3 = this.b;
            if (!containsKey || (zr3.getDescriptor().u() instanceof no5)) {
                obj2 = gy0.r(getDescriptor(), h, zr3, (Object) null);
            } else {
                obj2 = gy0.r(getDescriptor(), h, zr3, sf4.U(r, map));
            }
            map.put(r, obj2);
            return;
        }
        h.j(b81.l(i, h, "Value must follow key in a map, index for key: ", ", returned index for value: "));
    }

    public final Object g(Object obj) {
        switch (this.c) {
            case b85.b:
                throw null;
            default:
                throw null;
        }
    }

    public final ll6 getDescriptor() {
        switch (this.c) {
            case b85.b:
                return this.d;
            default:
                return this.d;
        }
    }

    public final Object h(Object obj) {
        switch (this.c) {
            case b85.b:
                HashMap hashMap = (HashMap) obj;
                hashMap.getClass();
                return hashMap;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                return linkedHashMap;
        }
    }

    public final void serialize(j42 j42, Object obj) {
        d(obj);
        ll6 descriptor = getDescriptor();
        descriptor.getClass();
        hy0 c2 = j42.c(descriptor);
        Iterator c3 = c(obj);
        int i = 0;
        while (c3.hasNext()) {
            Map.Entry entry = (Map.Entry) c3.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            c2.o(getDescriptor(), i, this.a, key);
            i += 2;
            c2.o(getDescriptor(), i2, this.b, value);
        }
        c2.b(descriptor);
    }

    public ty2(zr3 zr3, zr3 zr32, byte b2) {
        this.a = zr3;
        this.b = zr32;
    }
}
