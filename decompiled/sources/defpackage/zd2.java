package defpackage;

import java.util.Iterator;

/* renamed from: zd2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zd2 implements Iterator, ar3 {
    public final /* synthetic */ al6 A;
    public final /* synthetic */ int w = 0;
    public final Iterator x;
    public int y;
    public Object z;

    public zd2(cv2 cv2) {
        this.A = cv2;
        this.x = ((al6) cv2.c).iterator();
        this.y = -1;
    }

    public void a() {
        Object next;
        ae2 ae2 = (ae2) this.A;
        do {
            Iterator it = this.x;
            if (it.hasNext()) {
                next = it.next();
            } else {
                this.y = 0;
                return;
            }
        } while (((Boolean) ae2.c.y(next)).booleanValue() != ae2.b);
        this.z = next;
        this.y = 1;
    }

    public void b() {
        Iterator it = this.x;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((vr2) ((cv2) this.A).b).y(next)).booleanValue()) {
                this.y = 1;
                this.z = next;
                return;
            }
        }
        this.y = 0;
    }

    public boolean c() {
        Iterator it;
        Iterator it2 = (Iterator) this.z;
        if (it2 == null || !it2.hasNext()) {
            do {
                Iterator it3 = this.x;
                if (it3.hasNext()) {
                    Object next = it3.next();
                    xg2 xg2 = (xg2) this.A;
                    it = (Iterator) xg2.c.y(xg2.b.y(next));
                } else {
                    this.y = 2;
                    this.z = null;
                    return false;
                }
            } while (!it.hasNext());
            this.z = it;
            this.y = 1;
            return true;
        }
        this.y = 1;
        return true;
    }

    public final boolean hasNext() {
        switch (this.w) {
            case b85.b:
                if (this.y == -1) {
                    a();
                }
                if (this.y == 1) {
                    return true;
                }
                return false;
            case 1:
                int i = this.y;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return c();
            default:
                if (this.y == -1) {
                    b();
                }
                if (this.y == 1) {
                    return true;
                }
                return false;
        }
    }

    public final Object next() {
        switch (this.w) {
            case b85.b:
                if (this.y == -1) {
                    a();
                }
                if (this.y != 0) {
                    Object obj = this.z;
                    this.z = null;
                    this.y = -1;
                    return obj;
                }
                rf2.c();
                return null;
            case 1:
                int i = this.y;
                if (i == 2) {
                    rf2.c();
                    return null;
                } else if (i != 0 || c()) {
                    this.y = 0;
                    Iterator it = (Iterator) this.z;
                    it.getClass();
                    return it.next();
                } else {
                    rf2.c();
                    return null;
                }
            default:
                if (this.y == -1) {
                    b();
                }
                if (this.y != 0) {
                    Object obj2 = this.z;
                    this.z = null;
                    this.y = -1;
                    return obj2;
                }
                rf2.c();
                return null;
        }
    }

    public final void remove() {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public zd2(xg2 xg2) {
        this.A = xg2;
        this.x = xg2.a.iterator();
    }

    public zd2(ae2 ae2) {
        this.A = ae2;
        this.x = ae2.a.iterator();
        this.y = -1;
    }
}
