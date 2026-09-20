package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: bf4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class bf4 implements Map.Entry, ar3 {
    public final /* synthetic */ int w;
    public final Object x;
    public final Object y;

    public bf4(String str, List list) {
        this.w = 2;
        str.getClass();
        list.getClass();
        this.x = str;
        this.y = list;
    }

    public boolean equals(Object obj) {
        Map.Entry entry;
        int i = this.w;
        Object obj2 = this.x;
        switch (i) {
            case b85.b:
                if (obj instanceof Map.Entry) {
                    entry = (Map.Entry) obj;
                } else {
                    entry = null;
                }
                if (entry == null || !sg3.e(entry.getKey(), obj2) || !sg3.e(entry.getValue(), getValue())) {
                    return false;
                }
                return true;
            case 2:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry2 = (Map.Entry) obj;
                if (!sg3.e(entry2.getKey(), (String) obj2) || !sg3.e(entry2.getValue(), (List) this.y)) {
                    return false;
                }
                return true;
            default:
                return super.equals(obj);
        }
    }

    public final Object getKey() {
        switch (this.w) {
            case b85.b:
                return this.x;
            case 1:
                return this.x;
            default:
                return (String) this.x;
        }
    }

    public Object getValue() {
        switch (this.w) {
            case b85.b:
                return this.y;
            case 1:
                return this.y;
            default:
                return (List) this.y;
        }
    }

    public int hashCode() {
        int i;
        int i2 = this.w;
        Object obj = this.x;
        switch (i2) {
            case b85.b:
                int i3 = 0;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                Object value = getValue();
                if (value != null) {
                    i3 = value.hashCode();
                }
                return i ^ i3;
            case 2:
                return ((List) this.y).hashCode() ^ ((String) obj).hashCode();
            default:
                return super.hashCode();
        }
    }

    public Object setValue(Object obj) {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                Object value = getValue();
                return obj + "=" + value;
            case 2:
                return ((String) obj) + '=' + ((List) this.y);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ bf4(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }
}
