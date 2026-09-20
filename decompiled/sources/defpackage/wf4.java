package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;

/* renamed from: wf4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wf4 extends w0 {
    public final /* synthetic */ int w;
    public final Object x;

    public /* synthetic */ wf4(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public final boolean contains(Object obj) {
        boolean z;
        switch (this.w) {
            case b85.b:
                if (obj == null) {
                    z = true;
                } else {
                    z = obj instanceof uf4;
                }
                if (!z) {
                    return false;
                }
                return super.contains((uf4) obj);
            default:
                return ((wf5) this.x).containsValue(obj);
        }
    }

    public final int f() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                return ((xf4) obj).a.groupCount() + 1;
            default:
                return ((wf5) obj).x;
        }
    }

    public uf4 g(int i) {
        Matcher matcher = ((xf4) this.x).a;
        re3 V = z65.V(matcher.start(i), matcher.end(i));
        if (V.w < 0) {
            return null;
        }
        String group = matcher.group(i);
        group.getClass();
        return new uf4(group, V);
    }

    public boolean isEmpty() {
        switch (this.w) {
            case b85.b:
                return false;
            default:
                return super.isEmpty();
        }
    }

    public final Iterator iterator() {
        switch (this.w) {
            case b85.b:
                return new vl7(new wl7(new ts(1, sg3.v(this)), new h43(14, this)));
            default:
                rn7 rn7 = ((wf5) this.x).w;
                sn7[] sn7Arr = new sn7[8];
                for (int i = 0; i < 8; i++) {
                    sn7Arr[i] = new tn7(2);
                }
                return new xf5(rn7, sn7Arr);
        }
    }
}
