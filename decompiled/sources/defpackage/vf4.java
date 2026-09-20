package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: vf4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vf4 extends h2 {
    public final /* synthetic */ int w = 1;
    public final Object x;

    public vf4(List list) {
        list.getClass();
        this.x = list;
    }

    public /* bridge */ boolean contains(Object obj) {
        switch (this.w) {
            case b85.b:
                if (!(obj instanceof String)) {
                    return false;
                }
                return super.contains((String) obj);
            default:
                return super.contains(obj);
        }
    }

    public final int f() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                return ((xf4) obj).a.groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    public final Object get(int i) {
        int i2 = this.w;
        Object obj = this.x;
        switch (i2) {
            case b85.b:
                String group = ((xf4) obj).a.group(i);
                if (group == null) {
                    return "";
                }
                return group;
            default:
                return ((List) obj).get(dt0.m0(i, this));
        }
    }

    public /* bridge */ int indexOf(Object obj) {
        switch (this.w) {
            case b85.b:
                if (!(obj instanceof String)) {
                    return -1;
                }
                return super.indexOf((String) obj);
            default:
                return super.indexOf(obj);
        }
    }

    public Iterator iterator() {
        switch (this.w) {
            case 1:
                return new n76(this, 0);
            default:
                return super.iterator();
        }
    }

    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.w) {
            case b85.b:
                if (!(obj instanceof String)) {
                    return -1;
                }
                return super.lastIndexOf((String) obj);
            default:
                return super.lastIndexOf(obj);
        }
    }

    public ListIterator listIterator() {
        switch (this.w) {
            case 1:
                return new n76(this, 0);
            default:
                return super.listIterator();
        }
    }

    public vf4(xf4 xf4) {
        this.x = xf4;
    }

    public ListIterator listIterator(int i) {
        switch (this.w) {
            case 1:
                return new n76(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
