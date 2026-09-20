package defpackage;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cw0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cw0 implements tv0, ov3 {
    public static final aw0 D = new aw0(0);
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object w;
    public final Object x;
    public Object y;
    public final Object z;

    public cw0(ArrayList arrayList, ArrayList arrayList2, hz2 hz2) {
        hs7 hs7 = hs7.w;
        this.w = new HashMap();
        this.x = new HashMap();
        this.y = new HashMap();
        this.z = new HashSet();
        this.B = new AtomicReference();
        b72 b72 = new b72();
        this.A = b72;
        this.C = hz2;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(gv0.c(b72, b72.class, w67.class, tu5.class));
        arrayList3.add(gv0.c(this, cw0.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            gv0 gv0 = (gv0) it.next();
            if (gv0 != null) {
                arrayList3.add(gv0);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((nu5) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((hz2) this.C).N0(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((gv0) it4.next()).b.toArray();
                int length = array.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Object obj = array[i];
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (((HashSet) this.z).contains(obj.toString())) {
                            it4.remove();
                            break;
                        }
                        ((HashSet) this.z).add(obj.toString());
                    }
                    i++;
                }
            }
            if (((HashMap) this.w).isEmpty()) {
                rg3.q(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.w).keySet());
                arrayList6.addAll(arrayList3);
                rg3.q(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                gv0 gv02 = (gv0) it5.next();
                ((HashMap) this.w).put(gv02, new oz3(new bw0(0, this, gv02)));
            }
            arrayList5.addAll(f(arrayList3));
            arrayList5.addAll(g());
            e();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) this.B).get();
        if (bool != null) {
            b((HashMap) this.w, bool.booleanValue());
        }
    }

    public void b(HashMap hashMap, boolean z2) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            nu5 nu5 = (nu5) entry.getValue();
            int i = ((gv0) entry.getKey()).d;
            if (i == 1 || (i == 2 && z2)) {
                nu5.get();
            }
        }
        b72 b72 = (b72) this.A;
        synchronized (b72) {
            try {
                arrayDeque = b72.b;
                if (arrayDeque != null) {
                    b72.b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw pb4.g(it);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: qq3} */
    /* JADX WARNING: Multi-variable type inference failed */
    public void c() {
        sq3 sq3;
        kd6 kd6 = (kd6) this.y;
        gq0 gq0 = (gq0) this.A;
        HashMap hashMap = (HashMap) this.w;
        hashMap.getClass();
        boolean z2 = false;
        if (gq0.equals(nz6.b)) {
            Object obj = hashMap.get(uq4.e("value"));
            qq3 qq3 = null;
            if (obj instanceof sq3) {
                sq3 = (sq3) obj;
            } else {
                sq3 = null;
            }
            if (sq3 != null) {
                Object obj2 = sq3.a;
                if (obj2 instanceof qq3) {
                    qq3 = obj2;
                }
                if (qq3 != null) {
                    z2 = kd6.d0(qq3.a.a);
                }
            }
        }
        if (!z2 && !kd6.d0(gq0)) {
            ((List) this.B).add(new gm(((ql4) this.z).g0(), hashMap, (sy6) this.C));
        }
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [a44, java.lang.Object] */
    public void e() {
        boolean z2;
        HashMap hashMap = (HashMap) this.x;
        HashMap hashMap2 = (HashMap) this.y;
        for (gv0 gv0 : ((HashMap) this.w).keySet()) {
            Iterator it = gv0.c.iterator();
            while (true) {
                if (it.hasNext()) {
                    zp1 zp1 = (zp1) it.next();
                    if (zp1.b == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    av5 av5 = zp1.a;
                    if (z2 && !hashMap2.containsKey(av5)) {
                        ? obj = new Object();
                        obj.b = null;
                        obj.a = Collections.newSetFromMap(new ConcurrentHashMap());
                        obj.a.addAll(Collections.EMPTY_SET);
                        hashMap2.put(av5, obj);
                    } else if (hashMap.containsKey(av5)) {
                        continue;
                    } else {
                        int i = zp1.b;
                        if (i == 1) {
                            throw new RuntimeException("Unsatisfied dependency for component " + gv0 + ": " + av5);
                        } else if (i != 2) {
                            hashMap.put(av5, new s75(s75.c, s75.d));
                        }
                    }
                }
            }
        }
    }

    public ArrayList f(ArrayList arrayList) {
        HashMap hashMap = (HashMap) this.x;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gv0 gv0 = (gv0) it.next();
            if (gv0.e == 0) {
                nu5 nu5 = (nu5) ((HashMap) this.w).get(gv0);
                for (av5 av5 : gv0.b) {
                    if (!hashMap.containsKey(av5)) {
                        hashMap.put(av5, nu5);
                    } else {
                        arrayList2.add(new ga(9, (Object) (s75) ((nu5) hashMap.get(av5)), (Object) nu5));
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [a44, java.lang.Object] */
    public ArrayList g() {
        HashMap hashMap = (HashMap) this.y;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.w).entrySet()) {
            gv0 gv0 = (gv0) entry.getKey();
            if (gv0.e != 0) {
                nu5 nu5 = (nu5) entry.getValue();
                for (av5 av5 : gv0.b) {
                    if (!hashMap2.containsKey(av5)) {
                        hashMap2.put(av5, new HashSet());
                    }
                    ((Set) hashMap2.get(av5)).add(nu5);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (!hashMap.containsKey(entry2.getKey())) {
                ? obj = new Object();
                obj.b = null;
                obj.a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap.put((av5) entry2.getKey(), obj);
            } else {
                a44 a44 = (a44) hashMap.get(entry2.getKey());
                for (nu5 gaVar : (Set) entry2.getValue()) {
                    arrayList.add(new ga(10, (Object) a44, (Object) gaVar));
                }
            }
        }
        return arrayList;
    }

    public void i(uq4 uq4, Object obj) {
        e21 l = g22.l((tl4) ((kd6) this.x).z, obj);
        if (l == null) {
            l = new a72("Unsupported annotation argument: " + uq4);
        }
        ((HashMap) this.w).put(uq4, l);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        r3 = new defpackage.y0(26, r2);
        r0 = (java.util.concurrent.atomic.AtomicReference) r2.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r0.compareAndSet((java.lang.Object) null, r3) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        ((defpackage.ya1) ((defpackage.wr0) ((defpackage.cw0) r2.d).x).y).a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (r0.get() == null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        return;
     */
    public void j(String str) {
        l90 l90 = (l90) this.A;
        synchronized (l90) {
            try {
                if (((jt3) ((AtomicMarkableReference) l90.b).getReference()).b(str)) {
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) l90.b;
                    atomicMarkableReference.set((jt3) atomicMarkableReference.getReference(), true);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public void l(uq4 uq4, jq0 jq0) {
        ((HashMap) this.w).put(uq4, new e21(new qq3(jq0)));
    }

    public pv3 m(uq4 uq4) {
        return new am6((kd6) this.x, uq4, this);
    }

    public synchronized nu5 n(av5 av5) {
        a44 a44 = (a44) ((HashMap) this.y).get(av5);
        if (a44 != null) {
            return a44;
        }
        return D;
    }

    public void o(uq4 uq4, gq0 gq0, uq4 uq42) {
        ((HashMap) this.w).put(uq4, new b62(gq0, uq42));
    }

    public ov3 p(gq0 gq0, uq4 uq4) {
        ArrayList arrayList = new ArrayList();
        return new o9(((kd6) this.x).g0(gq0, sy6.j, arrayList), this, uq4, arrayList);
    }

    public s75 q(av5 av5) {
        nu5 r = r(av5);
        if (r == null) {
            return new s75(s75.c, s75.d);
        }
        if (r instanceof s75) {
            return (s75) r;
        }
        return new s75((ku4) null, r);
    }

    public synchronized nu5 r(av5 av5) {
        h75.d("Null interface requested.", av5);
        return (nu5) ((HashMap) this.x).get(av5);
    }

    public cw0(String str, md2 md2, wr0 wr0) {
        this.z = new l90(this, false);
        this.A = new l90(this, true);
        this.B = new v86();
        this.C = new AtomicMarkableReference((Object) null, false);
        this.y = str;
        this.w = new fk4(md2);
        this.x = wr0;
    }

    public cw0(kd6 kd6, ql4 ql4, gq0 gq0, List list, sy6 sy6) {
        this.y = kd6;
        this.z = ql4;
        this.A = gq0;
        this.B = list;
        this.C = sy6;
        this.x = kd6;
        this.w = new HashMap();
    }
}
