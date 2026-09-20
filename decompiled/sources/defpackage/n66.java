package defpackage;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: n66  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n66 {
    public final String a;
    public final byte[] b;
    public r66[] c;
    public final d50 d;
    public Map e;

    public n66(String str, byte[] bArr, r66[] r66Arr, d50 d50, int i) {
        this.a = str;
        this.b = bArr;
        this.c = r66Arr;
        this.d = d50;
        this.e = null;
    }

    public final void a(Map map) {
        if (map != null) {
            Map map2 = this.e;
            if (map2 == null) {
                this.e = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public final void b(q66 q66, Object obj) {
        if (this.e == null) {
            this.e = new EnumMap(q66.class);
        }
        this.e.put(q66, obj);
    }

    public final String toString() {
        return this.a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public n66(String str, byte[] bArr, r66[] r66Arr, d50 d50) {
        this(str, bArr, r66Arr, d50, 0);
        System.currentTimeMillis();
    }
}
