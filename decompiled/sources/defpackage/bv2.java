package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bv2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bv2 implements Iterator, ar3 {
    public final /* synthetic */ int w = 0;
    public int x;
    public Object y;
    public final Object z;

    public bv2(wp4 wp4) {
        this.z = wp4;
        this.x = -1;
        this.y = t75.y(new vp4(wp4, this, (f61) null));
    }

    public void a() {
        Object obj;
        int i;
        int i2 = this.x;
        cv2 cv2 = (cv2) this.z;
        if (i2 == -2) {
            obj = ((sr2) cv2.c).b();
        } else {
            Object obj2 = this.y;
            obj2.getClass();
            obj = ((vr2) cv2.b).y(obj2);
        }
        this.y = obj;
        if (obj == null) {
            i = 0;
        } else {
            i = 1;
        }
        this.x = i;
    }

    public final boolean hasNext() {
        switch (this.w) {
            case b85.b:
                if (this.x < 0) {
                    a();
                }
                if (this.x == 1) {
                    return true;
                }
                return false;
            case 1:
                return ((bl6) this.y).hasNext();
            case 2:
                return ((bl6) this.y).hasNext();
            case 3:
                if (this.x < ((Map) this.z).size()) {
                    return true;
                }
                return false;
            default:
                return ((Iterator) this.y).hasNext();
        }
    }

    public final Object next() {
        int i = this.w;
        Object obj = this.z;
        Object obj2 = null;
        switch (i) {
            case b85.b:
                if (this.x < 0) {
                    a();
                }
                if (this.x != 0) {
                    Object obj3 = this.y;
                    obj3.getClass();
                    this.x = -1;
                    return obj3;
                }
                rf2.c();
                return null;
            case 1:
                return ((bl6) this.y).next();
            case 2:
                return ((bl6) this.y).next();
            case 3:
                if (hasNext()) {
                    obj2 = this.y;
                    this.x++;
                    Object obj4 = ((Map) obj).get(obj2);
                    if (obj4 != null) {
                        this.y = ((k74) obj4).b;
                    } else {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
                    }
                } else {
                    rf2.c();
                }
                return obj2;
            default:
                l61 l61 = (l61) ((cv2) obj).b;
                int i2 = this.x;
                this.x = i2 + 1;
                if (i2 >= 0) {
                    return l61.H(Integer.valueOf(i2), ((Iterator) this.y).next());
                }
                sg3.Z();
                throw null;
        }
    }

    public final void remove() {
        int i = this.w;
        Object obj = this.z;
        switch (i) {
            case b85.b:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.x;
                if (i2 != -1) {
                    ((op4) obj).x.i(i2);
                    this.x = -1;
                    return;
                }
                return;
            case 2:
                int i3 = this.x;
                if (i3 != -1) {
                    ((wp4) obj).x.m(i3);
                    this.x = -1;
                    return;
                }
                return;
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public bv2(cv2 cv2, byte b) {
        this.z = cv2;
        this.y = new zd2((xg2) cv2.c);
    }

    public bv2(cv2 cv2) {
        this.z = cv2;
        this.x = -2;
    }

    public bv2(Object obj, Map map) {
        this.y = obj;
        this.z = map;
    }

    public bv2(op4 op4) {
        this.z = op4;
        this.x = -1;
        this.y = t75.y(new np4(op4, this, (f61) null));
    }
}
