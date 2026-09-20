package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* renamed from: ye4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ye4 {
    public int w;
    public int x;
    public int y;
    public Object z;

    public ye4() {
        if (hr2.x == null) {
            hr2.x = new hr2(14);
        }
    }

    public int a(int i) {
        if (i < this.y) {
            return ((ByteBuffer) this.z).getShort(this.x + i);
        }
        return 0;
    }

    public void b() {
        if (((ze4) this.z).D != this.y) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void e(View view, Object obj);

    public void f() {
        while (true) {
            int i = this.w;
            ze4 ze4 = (ze4) this.z;
            if (i < ze4.B && ze4.y[i] < 0) {
                this.w = i + 1;
            } else {
                return;
            }
        }
    }

    public void g(View view, Object obj) {
        Object obj2;
        if (Build.VERSION.SDK_INT >= this.x) {
            e(view, obj);
            return;
        }
        k4 k4Var = null;
        if (Build.VERSION.SDK_INT >= this.x) {
            obj2 = c(view);
        } else {
            obj2 = view.getTag(this.w);
            if (!((Class) this.z).isInstance(obj2)) {
                obj2 = null;
            }
        }
        if (h(obj2, obj)) {
            View.AccessibilityDelegate d = e58.d(view);
            if (d != null) {
                if (d instanceof j4) {
                    k4Var = ((j4) d).a;
                } else {
                    k4Var = new k4(d);
                }
            }
            if (k4Var == null) {
                k4Var = new k4();
            }
            e58.m(view, k4Var);
            view.setTag(this.w, obj);
            e58.h(view, this.y);
        }
    }

    public abstract boolean h(Object obj, Object obj2);

    public boolean hasNext() {
        if (this.w < ((ze4) this.z).B) {
            return true;
        }
        return false;
    }

    public void remove() {
        ze4 ze4 = (ze4) this.z;
        b();
        if (this.x != -1) {
            ze4.c();
            ze4.n(this.x);
            this.x = -1;
            this.y = ze4.D;
            return;
        }
        h.s("Call next() before removing element from the iterator.");
    }
}
