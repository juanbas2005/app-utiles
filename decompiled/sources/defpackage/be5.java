package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: be5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class be5 {
    public final ArrayList a;

    public be5() {
        this.a = new ArrayList(32);
    }

    public void a(Object obj) {
        this.a.add(obj);
    }

    public void b(Object obj) {
        if (obj != null) {
            boolean z = obj instanceof Object[];
            ArrayList arrayList = this.a;
            if (z) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(arrayList, objArr);
                }
            } else if (obj instanceof Collection) {
                arrayList.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object add : (Iterable) obj) {
                    arrayList.add(add);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            } else {
                Class<?> cls = obj.getClass();
                throw new UnsupportedOperationException("Don't know how to spread " + cls);
            }
        }
    }

    public void c() {
        this.a.add(ee5.c);
    }

    public void d(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.add(new fe5(f, f2, f3, f4, f5, f6));
    }

    public void e(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.add(new ne5(f, f2, f3, f4, f5, f6));
    }

    public void f(float f) {
        this.a.add(new ge5(f));
    }

    public void g(float f) {
        this.a.add(new oe5(f));
    }

    public void h(float f, float f2) {
        this.a.add(new he5(f, f2));
    }

    public void i(float f, float f2) {
        this.a.add(new pe5(f, f2));
    }

    public void j(float f, float f2) {
        this.a.add(new ie5(f, f2));
    }

    public void k(float f, float f2, float f3, float f4) {
        this.a.add(new ke5(f, f2, f3, f4));
    }

    public void l(float f, float f2, float f3, float f4) {
        this.a.add(new se5(f, f2, f3, f4));
    }

    public void m(float f) {
        this.a.add(new ve5(f));
    }

    public void n(float f) {
        this.a.add(new ue5(f));
    }

    public be5(int i) {
        this.a = new ArrayList(i);
    }
}
