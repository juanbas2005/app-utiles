package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: dg5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dg5 extends b3 implements t93 {
    public final /* synthetic */ int w;
    public final wf5 x;

    public /* synthetic */ dg5(wf5 wf5, int i) {
        this.w = i;
        this.x = wf5;
    }

    public final boolean contains(Object obj) {
        int i = this.w;
        wf5 wf5 = this.x;
        switch (i) {
            case b85.b:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = wf5.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() != null || !wf5.containsKey(entry.getKey())) {
                        return false;
                    }
                    return true;
                }
                return false;
            default:
                return wf5.containsKey(obj);
        }
    }

    public final int f() {
        int i = this.w;
        wf5 wf5 = this.x;
        switch (i) {
            case b85.b:
                return wf5.x;
            default:
                return wf5.x;
        }
    }

    public final Iterator iterator() {
        int i = this.w;
        wf5 wf5 = this.x;
        switch (i) {
            case b85.b:
                rn7 rn7 = wf5.w;
                sn7[] sn7Arr = new sn7[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    sn7Arr[i2] = new tn7(0);
                }
                return new xf5(rn7, sn7Arr);
            default:
                rn7 rn72 = wf5.w;
                sn7[] sn7Arr2 = new sn7[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    sn7Arr2[i3] = new tn7(1);
                }
                return new xf5(rn72, sn7Arr2);
        }
    }
}
