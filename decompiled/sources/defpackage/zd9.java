package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: zd9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zd9 {
    public static final xd9 e = new xd9(0);
    public static final yd9 f = new yd9(0);
    public final HashMap a;
    public final HashMap b;
    public final xd9 c;
    public yd9 d;

    public zd9(zd9 zd9) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        hashMap.putAll(zd9.a);
        hashMap2.putAll(zd9.b);
        this.c = zd9.c;
        this.d = zd9.d;
    }

    public void a(id9 id9, Object obj, ud9 ud9) {
        xd9 xd9 = (xd9) this.a.get(id9);
        if (xd9 != null) {
            xd9.a(id9, obj, ud9);
        } else {
            this.c.a(id9, obj, ud9);
        }
    }

    public void b(id9 id9, Iterator it, ud9 ud9) {
        yd9 yd9 = (yd9) this.b.get(id9);
        if (yd9 != null) {
            yd9.a(id9, it, ud9);
            return;
        }
        yd9 yd92 = this.d;
        if (yd92 != null && !this.a.containsKey(id9)) {
            yd92.a(id9, it, ud9);
            return;
        }
        while (it.hasNext()) {
            a(id9, it.next(), ud9);
        }
    }

    public /* synthetic */ zd9() {
        xd9 xd9 = hj8.p;
        this.a = new HashMap();
        this.b = new HashMap();
        this.d = null;
        this.c = xd9;
    }
}
