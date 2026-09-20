package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: dm0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dm0 implements Map.Entry, dr3 {
    public final /* synthetic */ int w = 0;
    public Object x;
    public Object y;
    public final /* synthetic */ ar3 z;

    public dm0(m37 m37) {
        this.z = m37;
        Map.Entry entry = (Map.Entry) m37.A;
        entry.getClass();
        this.x = entry.getKey();
        Map.Entry entry2 = (Map.Entry) m37.A;
        entry2.getClass();
        this.y = entry2.getValue();
    }

    public boolean equals(Object obj) {
        switch (this.w) {
            case b85.b:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!((String) this.y).equals(entry.getKey()) || !this.x.equals(entry.getValue())) {
                        return false;
                    }
                    return true;
                }
                return false;
            default:
                return super.equals(obj);
        }
    }

    public final Object getKey() {
        switch (this.w) {
            case b85.b:
                return (String) this.y;
            default:
                return this.x;
        }
    }

    public final Object getValue() {
        switch (this.w) {
            case b85.b:
                return this.x;
            default:
                return this.y;
        }
    }

    public int hashCode() {
        switch (this.w) {
            case b85.b:
                return this.x.hashCode() ^ ((String) this.y).hashCode();
            default:
                return super.hashCode();
        }
    }

    public final Object setValue(Object obj) {
        int i = this.w;
        ar3 ar3 = this.z;
        switch (i) {
            case b85.b:
                obj.getClass();
                Object obj2 = this.x;
                this.x = obj;
                fm0 fm0 = (fm0) ar3;
                int a = fm0.a((String) this.y);
                if (a >= 0) {
                    fm0.x[a] = obj;
                }
                return obj2;
            default:
                m37 m37 = (m37) ar3;
                ay6 ay6 = (ay6) m37.y;
                if (ay6.b().d == m37.x) {
                    Object obj3 = this.y;
                    ay6.put(this.x, obj);
                    this.y = obj;
                    return obj3;
                }
                throw new ConcurrentModificationException();
        }
    }

    public String toString() {
        switch (this.w) {
            case b85.b:
                return ((String) this.y) + '=' + this.x;
            default:
                return super.toString();
        }
    }

    public dm0(fm0 fm0, String str, Object obj) {
        this.z = fm0;
        this.y = str;
        this.x = obj;
    }
}
