package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ci6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ci6 extends q2 {
    public final gq3 a;
    public List b = a42.w;
    public final nz3 c;
    public final Map d;
    public final LinkedHashMap e;

    public ci6(String str, gq3 gq3, gq3[] gq3Arr, zr3[] zr3Arr) {
        gq3.getClass();
        this.a = gq3;
        this.c = rg3.y(i44.w, new qm3(22, (Object) str, (Object) this));
        if (gq3Arr.length == zr3Arr.length) {
            Map a0 = sf4.a0(qs.s1(gq3Arr, zr3Arr));
            this.d = a0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : a0.entrySet()) {
                String a2 = ((zr3) entry.getValue()).getDescriptor().a();
                Object obj = linkedHashMap.get(a2);
                if (obj == null) {
                    linkedHashMap.containsKey(a2);
                }
                Map.Entry entry2 = (Map.Entry) obj;
                if (entry2 == null) {
                    linkedHashMap.put(a2, entry);
                } else {
                    StringBuilder sb = new StringBuilder("Multiple sealed subclasses of '");
                    sb.append(this.a);
                    sb.append("' have the same serial name '");
                    sb.append(a2);
                    sb.append("': '");
                    sb.append(entry2.getKey());
                    Object key = entry.getKey();
                    sb.append("', '");
                    sb.append(key);
                    sb.append('\'');
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(tf4.F(linkedHashMap.size()));
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry3.getKey(), (zr3) ((Map.Entry) entry3.getValue()).getValue());
            }
            this.e = linkedHashMap2;
            return;
        }
        String A = gq3.A();
        throw new IllegalArgumentException("All subclasses of sealed class " + A + " should be marked @Serializable");
    }

    public final zr3 a(gy0 gy0, String str) {
        zr3 zr3 = (zr3) this.e.get(str);
        if (zr3 != null) {
            return zr3;
        }
        super.a(gy0, str);
        return null;
    }

    public final zr3 b(j42 j42, Object obj) {
        zr3 zr3;
        obj.getClass();
        zr3 zr32 = (zr3) this.d.get(b26.a.b(obj.getClass()));
        if (zr32 != null) {
            zr3 = zr32;
        } else {
            super.b(j42, obj);
            zr3 = null;
        }
        if (zr3 != null) {
            return zr3;
        }
        return null;
    }

    public final gq3 c() {
        return this.a;
    }

    public final ll6 getDescriptor() {
        return (ll6) this.c.getValue();
    }
}
