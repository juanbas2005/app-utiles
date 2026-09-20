package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ds  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ds extends AbstractSet {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ ds(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public boolean add(Object obj) {
        int i = this.w;
        Object obj2 = this.x;
        switch (i) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((lv6) obj2).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((mv6) obj2).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    return false;
                }
                ((nv6) obj2).put((Comparable) entry3.getKey(), entry3.getValue());
                return true;
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                if (contains(entry4)) {
                    return false;
                }
                ((ym8) obj2).put((Comparable) entry4.getKey(), entry4.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    public void clear() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 1:
                ((lv6) obj).clear();
                return;
            case 2:
                ((mv6) obj).clear();
                return;
            case 3:
                ((nv6) obj).clear();
                return;
            case 4:
                ((ym8) obj).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    public boolean contains(Object obj) {
        int i = this.w;
        Object obj2 = this.x;
        switch (i) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj3 = ((lv6) obj2).get(entry.getKey());
                Object value = entry.getValue();
                if (obj3 == value) {
                    return true;
                }
                if (obj3 == null || !obj3.equals(value)) {
                    return false;
                }
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj4 = ((mv6) obj2).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj4 == value2) {
                    return true;
                }
                if (obj4 == null || !obj4.equals(value2)) {
                    return false;
                }
                return true;
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj5 = ((nv6) obj2).get(entry3.getKey());
                Object value3 = entry3.getValue();
                if (obj5 == value3) {
                    return true;
                }
                if (obj5 == null || !obj5.equals(value3)) {
                    return false;
                }
                return true;
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                Object obj6 = ((ym8) obj2).get(entry4.getKey());
                Object value4 = entry4.getValue();
                if (obj6 == value4) {
                    return true;
                }
                if (obj6 == null || !obj6.equals(value4)) {
                    return false;
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    public Iterator iterator() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                return new gs((js) obj);
            case 1:
                return new sv6((lv6) obj, 0);
            case 2:
                return new sv6((mv6) obj, 1);
            case 3:
                return new sv6((nv6) obj, 2);
            case 4:
                return new sv6((ym8) obj);
            default:
                return new vj8(this, 1);
        }
    }

    public boolean remove(Object obj) {
        int i = this.w;
        Object obj2 = this.x;
        switch (i) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((lv6) obj2).remove(entry.getKey());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((mv6) obj2).remove(entry2.getKey());
                return true;
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    return false;
                }
                ((nv6) obj2).remove(entry3.getKey());
                return true;
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                if (!contains(entry4)) {
                    return false;
                }
                ((ym8) obj2).remove(entry4.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    public final int size() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                return ((js) obj).y;
            case 1:
                return ((lv6) obj).size();
            case 2:
                return ((mv6) obj).size();
            case 3:
                return ((nv6) obj).size();
            case 4:
                return ((ym8) obj).size();
            default:
                return ((ce9) obj).e;
        }
    }
}
