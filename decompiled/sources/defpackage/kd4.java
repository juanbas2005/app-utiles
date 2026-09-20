package defpackage;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* renamed from: kd4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class kd4 {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;
    public final Object g;

    public kd4(int i) {
        this.b = i;
        if (i > 0) {
            this.f = new ld4(0);
            this.g = new jv2(3);
            return;
        }
        h.q("maxSize <= 0");
        throw null;
    }

    public void a() {
        View view = (View) b81.k(1, (ArrayList) this.f);
        this.c = ((StaggeredGridLayoutManager) this.g).r.d(view);
        ((d27) view.getLayoutParams()).getClass();
    }

    public void b() {
        ((ArrayList) this.f).clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public Object c(Object obj) {
        obj.getClass();
        return null;
    }

    public void d(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj2.getClass();
    }

    public int e() {
        boolean z = ((StaggeredGridLayoutManager) this.g).w;
        ArrayList arrayList = (ArrayList) this.f;
        if (z) {
            return g(arrayList.size() - 1, -1);
        }
        return g(0, arrayList.size());
    }

    public int f() {
        boolean z = ((StaggeredGridLayoutManager) this.g).w;
        ArrayList arrayList = (ArrayList) this.f;
        if (z) {
            return g(0, arrayList.size());
        }
        return g(arrayList.size() - 1, -1);
    }

    public int g(int i, int i2) {
        int i3;
        boolean z;
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        int m = staggeredGridLayoutManager.r.m();
        int i4 = staggeredGridLayoutManager.r.i();
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View view = (View) ((ArrayList) this.f).get(i);
            int g2 = staggeredGridLayoutManager.r.g(view);
            int d2 = staggeredGridLayoutManager.r.d(view);
            boolean z2 = false;
            if (g2 <= i4) {
                z = true;
            } else {
                z = false;
            }
            if (d2 >= m) {
                z2 = true;
            }
            if (z && z2 && (g2 < m || d2 > i4)) {
                return xy5.H(view);
            }
            i += i3;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        r0 = c(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r0 != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        r1 = (defpackage.jv2) r5.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r2 = (defpackage.ld4) r5.f;
        r2.getClass();
        r2 = r2.a.put(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        if (r2 == null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        r3 = (defpackage.ld4) r5.f;
        r3.getClass();
        r3.a.put(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        r5.c += n(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        if (r2 == null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        d(r6, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        p(r5.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0066, code lost:
        return r0;
     */
    public Object h(Object obj) {
        obj.getClass();
        synchronized (((jv2) this.g)) {
            ld4 ld4 = (ld4) this.f;
            ld4.getClass();
            Object obj2 = ld4.a.get(obj);
            if (obj2 != null) {
                this.d++;
                return obj2;
            }
            this.e++;
        }
    }

    public int i(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.f).size() == 0) {
            return i;
        }
        a();
        return this.c;
    }

    public View j(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        ArrayList arrayList = (ArrayList) this.f;
        View view = null;
        if (i2 == -1) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                View view2 = (View) arrayList.get(i3);
                if ((staggeredGridLayoutManager.w && xy5.H(view2) <= i) || ((!staggeredGridLayoutManager.w && xy5.H(view2) >= i) || !view2.hasFocusable())) {
                    break;
                }
                i3++;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size() - 1;
        while (size2 >= 0) {
            View view3 = (View) arrayList.get(size2);
            if ((staggeredGridLayoutManager.w && xy5.H(view3) >= i) || ((!staggeredGridLayoutManager.w && xy5.H(view3) <= i) || !view3.hasFocusable())) {
                break;
            }
            size2--;
            view = view3;
        }
        return view;
    }

    public int k(int i) {
        ArrayList arrayList = (ArrayList) this.f;
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        this.b = ((StaggeredGridLayoutManager) this.g).r.g(view);
        ((d27) view.getLayoutParams()).getClass();
        return this.b;
    }

    public Object l(Object obj, Object obj2) {
        Object put;
        obj.getClass();
        synchronized (((jv2) this.g)) {
            this.c += n(obj, obj2);
            ld4 ld4 = (ld4) this.f;
            ld4.getClass();
            put = ld4.a.put(obj, obj2);
            if (put != null) {
                this.c -= n(obj, put);
            }
        }
        if (put != null) {
            d(obj, put, obj2);
        }
        p(this.b);
        return put;
    }

    public Object m(Object obj) {
        Object remove;
        obj.getClass();
        synchronized (((jv2) this.g)) {
            ld4 ld4 = (ld4) this.f;
            ld4.getClass();
            remove = ld4.a.remove(obj);
            if (remove != null) {
                this.c -= n(obj, remove);
            }
        }
        if (remove != null) {
            d(obj, remove, (Object) null);
        }
        return remove;
    }

    public int n(Object obj, Object obj2) {
        int o = o(obj, obj2);
        if (o >= 0) {
            return o;
        }
        throw new IllegalStateException("Negative size: " + obj + '=' + obj2);
    }

    public int o(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0075, code lost:
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    public void p(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (((jv2) this.g)) {
                try {
                    if (this.c < 0) {
                        break;
                    }
                    if (((ld4) this.f).a.isEmpty()) {
                        if (this.c != 0) {
                            break;
                        }
                    }
                    if (this.c <= i) {
                        break;
                    } else if (((ld4) this.f).a.isEmpty()) {
                        break;
                    } else {
                        Set entrySet = ((ld4) this.f).a.entrySet();
                        entrySet.getClass();
                        Map.Entry entry = (Map.Entry) dt0.x0(entrySet);
                        if (entry != null) {
                            key = entry.getKey();
                            value = entry.getValue();
                            ld4 ld4 = (ld4) this.f;
                            ld4.getClass();
                            key.getClass();
                            ld4.a.remove(key);
                            this.c -= n(key, value);
                        } else {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            d(key, value, (Object) null);
        }
    }

    public String toString() {
        int i;
        String str;
        switch (this.a) {
            case b85.b:
                synchronized (((jv2) this.g)) {
                    try {
                        int i2 = this.d;
                        int i3 = this.e + i2;
                        if (i3 != 0) {
                            i = (i2 * 100) / i3;
                        } else {
                            i = 0;
                        }
                        str = "LruCache[maxSize=" + this.b + ",hits=" + this.d + ",misses=" + this.e + ",hitRate=" + i + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public kd4(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.g = staggeredGridLayoutManager;
        this.f = new ArrayList();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
        this.e = i;
    }
}
