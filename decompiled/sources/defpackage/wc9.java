package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: wc9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wc9 extends id9 {
    public final /* synthetic */ int f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wc9(String str, Class cls, boolean z, boolean z2, int i) {
        super(str, cls, z, z2);
        this.f = i;
    }

    public void a(Iterator it, ud9 ud9) {
        switch (this.f) {
            case b85.b:
                if (it.hasNext()) {
                    Object next = it.next();
                    boolean hasNext = it.hasNext();
                    String str = this.a;
                    if (!hasNext) {
                        ud9.a(str, next);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("[");
                    sb.append(next);
                    do {
                        sb.append(',');
                        sb.append(it.next());
                    } while (it.hasNext());
                    sb.append(']');
                    ud9.a(str, sb.toString());
                    return;
                }
                return;
            default:
                super.a(it, ud9);
                return;
        }
    }

    public void b(Object obj, ud9 ud9) {
        boolean z;
        switch (this.f) {
            case 1:
                yj8 yj8 = (yj8) obj;
                if (yj8 != null) {
                    wj8 wj8 = yj8.a.y;
                    wj8.getClass();
                    int i = 0;
                    while (true) {
                        if (i < wj8.f() - wj8.d()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            return;
                        }
                        if (i < wj8.f() - wj8.d()) {
                            xj8 xj8 = wj8.x;
                            int d = wj8.d() + i;
                            i++;
                            Map.Entry entry = (Map.Entry) xj8.w[d];
                            if (!((Set) entry.getValue()).isEmpty()) {
                                for (Object a : (Set) entry.getValue()) {
                                    ud9.a((String) entry.getKey(), a);
                                }
                            } else {
                                ud9.a((String) entry.getKey(), (Object) null);
                            }
                        } else {
                            rf2.c();
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                super.b(obj, ud9);
                return;
        }
    }
}
