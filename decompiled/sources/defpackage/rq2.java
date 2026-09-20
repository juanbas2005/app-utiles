package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import cu.lestebang.utiletecsa.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: rq2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rq2 {
    public final lq2 A;
    public final me6 B;
    public a9 C;
    public a9 D;
    public a9 E;
    public ArrayDeque F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public tq2 O;
    public final ge P;
    public final ArrayList a = new ArrayList();
    public boolean b;
    public final am6 c = new am6(14);
    public ArrayList d = new ArrayList();
    public ArrayList e;
    public final hq2 f = new hq2(this);
    public v45 g;
    public q30 h = null;
    public boolean i = false;
    public final g30 j = new g30(1, this);
    public final AtomicInteger k = new AtomicInteger();
    public final Map l = Collections.synchronizedMap(new HashMap());
    public final Map m = Collections.synchronizedMap(new HashMap());
    public final ArrayList n;
    public final jz0 o;
    public final CopyOnWriteArrayList p;
    public final jq2 q;
    public final jq2 r;
    public final jq2 s;
    public final jq2 t;
    public final kq2 u;
    public int v;
    public dq2 w;
    public mp7 x;
    public bq2 y;
    public bq2 z;

    public rq2() {
        Collections.synchronizedMap(new HashMap());
        this.n = new ArrayList();
        this.o = new jz0(this);
        this.p = new CopyOnWriteArrayList();
        this.q = new jq2(this, 0);
        this.r = new jq2(this, 1);
        this.s = new jq2(this, 2);
        this.t = new jq2(this, 3);
        this.u = new kq2(this);
        this.v = -1;
        this.A = new lq2(this);
        this.B = new me6(29);
        this.F = new ArrayDeque();
        this.P = new ge(9, (Object) this);
    }

    public static HashSet G(q30 q30) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < q30.a.size(); i2++) {
            bq2 bq2 = ((ar2) q30.a.get(i2)).b;
            if (bq2 != null && q30.g) {
                hashSet.add(bq2);
            }
        }
        return hashSet;
    }

    public static boolean L(int i2) {
        if (Log.isLoggable("FragmentManager", i2)) {
            return true;
        }
        return false;
    }

    public static boolean M(bq2 bq2) {
        bq2.getClass();
        Iterator it = bq2.R.c.D().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            bq2 bq22 = (bq2) it.next();
            if (bq22 != null) {
                z2 = M(bq22);
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public static boolean O(bq2 bq2) {
        if (bq2 == null) {
            return true;
        }
        if (!bq2.Z) {
            return false;
        }
        if (bq2.P == null || O(bq2.S)) {
            return true;
        }
        return false;
    }

    public static boolean P(bq2 bq2) {
        if (bq2 == null) {
            return true;
        }
        rq2 rq2 = bq2.P;
        if (bq2 == rq2.z && P(rq2.y)) {
            return true;
        }
        return false;
    }

    public static void f0(bq2 bq2) {
        if (L(2)) {
            Log.v("FragmentManager", "show: " + bq2);
        }
        if (bq2.W) {
            bq2.W = false;
            bq2.g0 = !bq2.g0;
        }
    }

    public final boolean A(boolean z2) {
        boolean z3;
        ArrayList arrayList;
        q30 q30;
        z(z2);
        if (!this.i && (q30 = this.h) != null) {
            q30.r = false;
            q30.d();
            if (L(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.h + " as part of execPendingActions for actions " + this.a);
            }
            this.h.e(false, false);
            this.a.add(0, this.h);
            Iterator it = this.h.a.iterator();
            while (it.hasNext()) {
                bq2 bq2 = ((ar2) it.next()).b;
                if (bq2 != null) {
                    bq2.I = false;
                }
            }
            this.h = null;
        }
        boolean z4 = false;
        while (true) {
            ArrayList arrayList2 = this.L;
            ArrayList arrayList3 = this.M;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    z3 = false;
                } else {
                    try {
                        int size = this.a.size();
                        int i2 = 0;
                        z3 = false;
                        while (true) {
                            arrayList = this.a;
                            if (i2 >= size) {
                                break;
                            }
                            z3 |= ((oq2) arrayList.get(i2)).a(arrayList2, arrayList3);
                            i2++;
                        }
                        arrayList.clear();
                        this.w.N.removeCallbacks(this.P);
                    } catch (Throwable th) {
                        this.a.clear();
                        this.w.N.removeCallbacks(this.P);
                        throw th;
                    }
                }
            }
            if (z3) {
                z4 = true;
                this.b = true;
                try {
                    X(this.L, this.M);
                } finally {
                    d();
                }
            } else {
                i0();
                v();
                ((HashMap) this.c.y).values().removeAll(Collections.singleton((Object) null));
                return z4;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void B(q30 q30, boolean z2) {
        if (!z2 || (this.w != null && !this.J)) {
            z(z2);
            q30 q302 = this.h;
            if (q302 != null) {
                q302.r = false;
                q302.d();
                if (L(3)) {
                    Log.d("FragmentManager", "Reversing mTransitioningOp " + this.h + " as part of execSingleAction for action " + q30);
                }
                this.h.e(false, false);
                this.h.a(this.L, this.M);
                Iterator it = this.h.a.iterator();
                while (it.hasNext()) {
                    bq2 bq2 = ((ar2) it.next()).b;
                    if (bq2 != null) {
                        bq2.I = false;
                    }
                }
                this.h = null;
            }
            q30.a(this.L, this.M);
            this.b = true;
            try {
                X(this.L, this.M);
                d();
                i0();
                v();
                ((HashMap) this.c.y).values().removeAll(Collections.singleton((Object) null));
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: bq2} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void C(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        Object obj;
        String str;
        boolean z2;
        ArrayList arrayList3;
        boolean z3;
        int i4;
        boolean z4;
        ArrayList arrayList4;
        boolean z5;
        ArrayList arrayList5;
        boolean z6;
        int i5;
        int i6;
        ArrayList arrayList6 = arrayList;
        ArrayList arrayList7 = arrayList2;
        int i7 = i2;
        int i8 = i3;
        am6 am6 = this.c;
        ArrayList arrayList8 = this.n;
        boolean z7 = ((q30) arrayList6.get(i7)).o;
        ArrayList arrayList9 = this.N;
        if (arrayList9 == null) {
            this.N = new ArrayList();
        } else {
            arrayList9.clear();
        }
        this.N.addAll(am6.G());
        bq2 bq2 = this.z;
        int i9 = i7;
        boolean z8 = false;
        while (i9 < i8) {
            q30 q30 = (q30) arrayList6.get(i9);
            boolean booleanValue = ((Boolean) arrayList7.get(i9)).booleanValue();
            ArrayList arrayList10 = this.N;
            if (!booleanValue) {
                ArrayList arrayList11 = q30.a;
                int i10 = 0;
                while (i10 < arrayList11.size()) {
                    ar2 ar2 = (ar2) arrayList11.get(i10);
                    boolean z9 = z7;
                    int i11 = ar2.a;
                    int i12 = i9;
                    int i13 = 1;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3 || i11 == 6) {
                                z5 = z8;
                                arrayList10.remove(ar2.b);
                                bq2 bq22 = ar2.b;
                                if (bq22 == bq2) {
                                    arrayList11.add(i10, new ar2(9, bq22));
                                    i10++;
                                    arrayList4 = arrayList8;
                                    bq2 = null;
                                } else {
                                    arrayList4 = arrayList8;
                                }
                            } else if (i11 == 7) {
                                i13 = 1;
                                z6 = z8;
                                arrayList5 = arrayList8;
                            } else if (i11 != 8) {
                                arrayList4 = arrayList8;
                                z5 = z8;
                            } else {
                                z5 = z8;
                                arrayList11.add(i10, new ar2(9, bq2, 0));
                                ar2.c = true;
                                i10++;
                                arrayList4 = arrayList8;
                                bq2 = ar2.b;
                            }
                            i13 = 1;
                        } else {
                            z5 = z8;
                            bq2 bq23 = ar2.b;
                            int i14 = bq23.U;
                            int size = arrayList10.size() - 1;
                            boolean z10 = false;
                            while (size >= 0) {
                                int i15 = size;
                                bq2 bq24 = arrayList10.get(size);
                                ArrayList arrayList12 = arrayList8;
                                if (bq24.U != i14) {
                                    i5 = i14;
                                } else if (bq24 == bq23) {
                                    i5 = i14;
                                    z10 = true;
                                } else {
                                    if (bq24 == bq2) {
                                        i5 = i14;
                                        arrayList11.add(i10, new ar2(9, bq24, 0));
                                        i10++;
                                        i6 = 0;
                                        bq2 = null;
                                    } else {
                                        i5 = i14;
                                        i6 = 0;
                                    }
                                    ar2 ar22 = new ar2(3, bq24, i6);
                                    ar22.d = ar2.d;
                                    ar22.f = ar2.f;
                                    ar22.e = ar2.e;
                                    ar22.g = ar2.g;
                                    arrayList11.add(i10, ar22);
                                    arrayList10.remove(bq24);
                                    i10++;
                                    bq2 = bq2;
                                }
                                size = i15 - 1;
                                i14 = i5;
                                arrayList8 = arrayList12;
                            }
                            arrayList4 = arrayList8;
                            i13 = 1;
                            if (z10) {
                                arrayList11.remove(i10);
                                i10--;
                            } else {
                                ar2.a = 1;
                                ar2.c = true;
                                arrayList10.add(bq23);
                            }
                        }
                        i10 += i13;
                        z7 = z9;
                        i9 = i12;
                        z8 = z5;
                        arrayList8 = arrayList4;
                    } else {
                        arrayList5 = arrayList8;
                        z6 = z8;
                    }
                    arrayList10.add(ar2.b);
                    i10 += i13;
                    z7 = z9;
                    i9 = i12;
                    z8 = z5;
                    arrayList8 = arrayList4;
                }
                arrayList3 = arrayList8;
                z4 = z7;
                i4 = i9;
                z3 = z8;
            } else {
                arrayList3 = arrayList8;
                z4 = z7;
                i4 = i9;
                z3 = z8;
                int i16 = 1;
                ArrayList arrayList13 = q30.a;
                int size2 = arrayList13.size() - 1;
                while (size2 >= 0) {
                    ar2 ar23 = (ar2) arrayList13.get(size2);
                    int i17 = ar23.a;
                    if (i17 != i16) {
                        if (i17 != 3) {
                            switch (i17) {
                                case 6:
                                    break;
                                case 7:
                                    break;
                                case 8:
                                    bq2 = null;
                                    break;
                                case 9:
                                    bq2 = ar23.b;
                                    break;
                                case 10:
                                    ar23.i = ar23.h;
                                    break;
                            }
                        }
                        arrayList10.add(ar23.b);
                        size2--;
                        i16 = 1;
                    }
                    arrayList10.remove(ar23.b);
                    size2--;
                    i16 = 1;
                }
            }
            if (z3 || q30.g) {
                z8 = true;
            } else {
                z8 = false;
            }
            i9 = i4 + 1;
            z7 = z4;
            arrayList8 = arrayList3;
        }
        ArrayList arrayList14 = arrayList8;
        boolean z11 = z7;
        boolean z12 = z8;
        this.N.clear();
        if (!z11 && this.v >= 1) {
            for (int i18 = i7; i18 < i8; i18++) {
                Iterator it = ((q30) arrayList6.get(i18)).a.iterator();
                while (it.hasNext()) {
                    bq2 bq25 = ((ar2) it.next()).b;
                    if (!(bq25 == null || bq25.P == null)) {
                        am6.L(g(bq25));
                    }
                }
            }
        }
        String str2 = "Unknown cmd: ";
        int i19 = i7;
        while (i19 < i8) {
            q30 q302 = (q30) arrayList6.get(i19);
            if (((Boolean) arrayList7.get(i19)).booleanValue()) {
                q302.c(-1);
                rq2 rq2 = q302.q;
                ArrayList arrayList15 = q302.a;
                boolean z13 = true;
                int size3 = arrayList15.size() - 1;
                while (size3 >= 0) {
                    ar2 ar24 = (ar2) arrayList15.get(size3);
                    bq2 bq26 = ar24.b;
                    if (bq26 != null) {
                        if (bq26.f0 != null) {
                            bq26.j().a = z13;
                        }
                        int i20 = q302.f;
                        int i21 = 8194;
                        int i22 = 4097;
                        if (i20 != 4097) {
                            if (i20 != 8194) {
                                i22 = 4100;
                                if (i20 != 8197) {
                                    i21 = 4099;
                                    if (i20 != 4099) {
                                        if (i20 != 4100) {
                                            i21 = 0;
                                        } else {
                                            i21 = 8197;
                                        }
                                    }
                                }
                            }
                            i21 = i22;
                        }
                        if (!(bq26.f0 == null && i21 == 0)) {
                            bq26.j();
                            bq26.f0.f = i21;
                        }
                        bq26.j();
                        bq26.f0.getClass();
                    }
                    switch (ar24.a) {
                        case 1:
                            bq26.N(ar24.d, ar24.e, ar24.f, ar24.g);
                            z2 = true;
                            rq2.b0(bq26, true);
                            rq2.W(bq26);
                            break;
                        case 3:
                            bq26.N(ar24.d, ar24.e, ar24.f, ar24.g);
                            rq2.a(bq26);
                            break;
                        case 4:
                            bq26.N(ar24.d, ar24.e, ar24.f, ar24.g);
                            rq2.getClass();
                            f0(bq26);
                            break;
                        case 5:
                            bq26.N(ar24.d, ar24.e, ar24.f, ar24.g);
                            rq2.b0(bq26, true);
                            rq2.K(bq26);
                            break;
                        case 6:
                            bq26.N(ar24.d, ar24.e, ar24.f, ar24.g);
                            rq2.c(bq26);
                            break;
                        case 7:
                            bq26.N(ar24.d, ar24.e, ar24.f, ar24.g);
                            rq2.b0(bq26, true);
                            rq2.h(bq26);
                            break;
                        case 8:
                            rq2.d0((bq2) null);
                            break;
                        case 9:
                            rq2.d0(bq26);
                            break;
                        case 10:
                            ar24.i = bq26.k0;
                            rq2.c0(bq26, ar24.h);
                            break;
                        default:
                            throw new IllegalArgumentException(str2 + ar24.a);
                    }
                    z2 = true;
                    size3--;
                    z13 = z2;
                }
            } else {
                q302.c(1);
                rq2 rq22 = q302.q;
                ArrayList arrayList16 = q302.a;
                int size4 = arrayList16.size();
                int i23 = 0;
                while (i23 < size4) {
                    ar2 ar25 = (ar2) arrayList16.get(i23);
                    bq2 bq27 = ar25.b;
                    if (bq27 != null) {
                        if (bq27.f0 != null) {
                            bq27.j().a = false;
                        }
                        int i24 = q302.f;
                        if (!(bq27.f0 == null && i24 == 0)) {
                            bq27.j();
                            bq27.f0.f = i24;
                        }
                        bq27.j();
                        bq27.f0.getClass();
                    }
                    switch (ar25.a) {
                        case 1:
                            str = str2;
                            bq27.N(ar25.d, ar25.e, ar25.f, ar25.g);
                            rq22.b0(bq27, false);
                            rq22.a(bq27);
                            break;
                        case 3:
                            str = str2;
                            bq27.N(ar25.d, ar25.e, ar25.f, ar25.g);
                            rq22.W(bq27);
                            break;
                        case 4:
                            str = str2;
                            bq27.N(ar25.d, ar25.e, ar25.f, ar25.g);
                            rq22.K(bq27);
                            break;
                        case 5:
                            str = str2;
                            bq27.N(ar25.d, ar25.e, ar25.f, ar25.g);
                            rq22.b0(bq27, false);
                            f0(bq27);
                            break;
                        case 6:
                            str = str2;
                            bq27.N(ar25.d, ar25.e, ar25.f, ar25.g);
                            rq22.h(bq27);
                            break;
                        case 7:
                            str = str2;
                            bq27.N(ar25.d, ar25.e, ar25.f, ar25.g);
                            rq22.b0(bq27, false);
                            rq22.c(bq27);
                            break;
                        case 8:
                            rq22.d0(bq27);
                            break;
                        case 9:
                            rq22.d0((bq2) null);
                            break;
                        case 10:
                            ar25.h = bq27.k0;
                            rq22.c0(bq27, ar25.i);
                            break;
                        default:
                            throw new IllegalArgumentException(str2 + ar25.a);
                    }
                    str = str2;
                    i23++;
                    str2 = str;
                }
            }
            i19++;
            str2 = str2;
        }
        boolean booleanValue2 = ((Boolean) arrayList7.get(i8 - 1)).booleanValue();
        if (z12 && !arrayList14.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList6.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(G((q30) it2.next()));
            }
            if (this.h == null) {
                Iterator it3 = arrayList14.iterator();
                while (it3.hasNext()) {
                    if (it3.next() == null) {
                        Iterator it4 = linkedHashSet.iterator();
                        if (it4.hasNext()) {
                            bq2 bq28 = (bq2) it4.next();
                            throw null;
                        }
                    } else {
                        ku4.a();
                        return;
                    }
                }
                Iterator it5 = arrayList14.iterator();
                while (it5.hasNext()) {
                    if (it5.next() == null) {
                        Iterator it6 = linkedHashSet.iterator();
                        if (it6.hasNext()) {
                            bq2 bq29 = (bq2) it6.next();
                            throw null;
                        }
                    } else {
                        ku4.a();
                        return;
                    }
                }
            }
        }
        for (int i25 = i7; i25 < i8; i25++) {
            q30 q303 = (q30) arrayList6.get(i25);
            if (booleanValue2) {
                for (int size5 = q303.a.size() - 1; size5 >= 0; size5--) {
                    bq2 bq210 = ((ar2) q303.a.get(size5)).b;
                    if (bq210 != null) {
                        g(bq210).k();
                    }
                }
            } else {
                Iterator it7 = q303.a.iterator();
                while (it7.hasNext()) {
                    bq2 bq211 = ((ar2) it7.next()).b;
                    if (bq211 != null) {
                        g(bq211).k();
                    }
                }
            }
        }
        R(this.v, true);
        Iterator it8 = f(arrayList6, i7, i8).iterator();
        while (it8.hasNext()) {
            un1 un1 = (un1) it8.next();
            un1.e = booleanValue2;
            synchronized (un1.b) {
                try {
                    un1.l();
                    ArrayList arrayList17 = un1.b;
                    ListIterator listIterator = arrayList17.listIterator(arrayList17.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obj = listIterator.previous();
                            gz6 gz6 = (gz6) obj;
                            View view = gz6.c.c0;
                            view.getClass();
                            char c2 = 4;
                            if (!(view.getAlpha() == 0.0f && view.getVisibility() == 0)) {
                                int visibility = view.getVisibility();
                                if (visibility == 0) {
                                    c2 = 2;
                                } else if (visibility != 4) {
                                    if (visibility == 8) {
                                        c2 = 3;
                                    } else {
                                        throw new IllegalArgumentException("Unknown visibility " + visibility);
                                    }
                                }
                                if (gz6.a == 2 || c2 == 2) {
                                }
                            }
                            if (gz6.a == 2) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    gz6 gz62 = (gz6) obj;
                    un1.f = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            un1.e();
        }
        while (i7 < i8) {
            q30 q304 = (q30) arrayList6.get(i7);
            if (((Boolean) arrayList7.get(i7)).booleanValue() && q304.s >= 0) {
                q304.s = -1;
            }
            if (q304.p != null) {
                for (int i26 = 0; i26 < q304.p.size(); i26++) {
                    ((Runnable) q304.p.get(i26)).run();
                }
                q304.p = null;
            }
            i7++;
        }
        if (z12 && arrayList14.size() > 0) {
            arrayList14.get(0).getClass();
            ku4.a();
        }
    }

    public final bq2 D(int i2) {
        am6 am6 = this.c;
        ArrayList arrayList = (ArrayList) am6.x;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            bq2 bq2 = (bq2) arrayList.get(size);
            if (bq2 != null && bq2.T == i2) {
                return bq2;
            }
        }
        for (wq2 wq2 : ((HashMap) am6.y).values()) {
            if (wq2 != null) {
                bq2 bq22 = wq2.c;
                if (bq22.T == i2) {
                    return bq22;
                }
            }
        }
        return null;
    }

    public final bq2 E(String str) {
        am6 am6 = this.c;
        ArrayList arrayList = (ArrayList) am6.x;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            bq2 bq2 = (bq2) arrayList.get(size);
            if (bq2 != null && str.equals(bq2.V)) {
                return bq2;
            }
        }
        for (wq2 wq2 : ((HashMap) am6.y).values()) {
            if (wq2 != null) {
                bq2 bq22 = wq2.c;
                if (str.equals(bq22.V)) {
                    return bq22;
                }
            }
        }
        return null;
    }

    public final void F() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            un1 un1 = (un1) it.next();
            if (un1.f) {
                if (L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                un1.f = false;
                un1.e();
            }
        }
    }

    public final ViewGroup H(bq2 bq2) {
        ViewGroup viewGroup = bq2.b0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (bq2.U <= 0 || !this.x.h0()) {
            return null;
        }
        View g0 = this.x.g0(bq2.U);
        if (g0 instanceof ViewGroup) {
            return (ViewGroup) g0;
        }
        return null;
    }

    public final lq2 I() {
        bq2 bq2 = this.y;
        if (bq2 != null) {
            return bq2.P.I();
        }
        return this.A;
    }

    public final me6 J() {
        bq2 bq2 = this.y;
        if (bq2 != null) {
            return bq2.P.J();
        }
        return this.B;
    }

    public final void K(bq2 bq2) {
        if (L(2)) {
            Log.v("FragmentManager", "hide: " + bq2);
        }
        if (!bq2.W) {
            bq2.W = true;
            bq2.g0 = true ^ bq2.g0;
            e0(bq2);
        }
    }

    public final boolean N() {
        bq2 bq2 = this.y;
        if (bq2 == null) {
            return true;
        }
        if (!bq2.t() || !this.y.p().N()) {
            return false;
        }
        return true;
    }

    public final boolean Q() {
        if (this.H || this.I) {
            return true;
        }
        return false;
    }

    public final void R(int i2, boolean z2) {
        dq2 dq2;
        if (this.w == null && i2 != -1) {
            h.s("No activity");
        } else if (z2 || i2 != this.v) {
            this.v = i2;
            am6 am6 = this.c;
            HashMap hashMap = (HashMap) am6.y;
            Iterator it = ((ArrayList) am6.x).iterator();
            while (it.hasNext()) {
                wq2 wq2 = (wq2) hashMap.get(((bq2) it.next()).A);
                if (wq2 != null) {
                    wq2.k();
                }
            }
            for (wq2 wq22 : hashMap.values()) {
                if (wq22 != null) {
                    wq22.k();
                    bq2 bq2 = wq22.c;
                    if (bq2.H && !bq2.v()) {
                        am6.M(wq22);
                    }
                }
            }
            g0();
            if (this.G && (dq2 = this.w) != null && this.v == 7) {
                dq2.P.invalidateOptionsMenu();
                this.G = false;
            }
        }
    }

    public final void S() {
        if (this.w != null) {
            this.H = false;
            this.I = false;
            this.O.g = false;
            for (bq2 bq2 : this.c.G()) {
                if (bq2 != null) {
                    bq2.R.S();
                }
            }
        }
    }

    public final boolean T() {
        return U(-1, 0);
    }

    public final boolean U(int i2, int i3) {
        A(false);
        z(true);
        bq2 bq2 = this.z;
        if (bq2 != null && i2 < 0 && bq2.m().T()) {
            return true;
        }
        boolean V = V(this.L, this.M, i2, i3);
        if (V) {
            this.b = true;
            try {
                X(this.L, this.M);
            } finally {
                d();
            }
        }
        i0();
        v();
        ((HashMap) this.c.y).values().removeAll(Collections.singleton((Object) null));
        return V;
    }

    public final boolean V(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        boolean z2;
        if ((i3 & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i4 = -1;
        if (!this.d.isEmpty()) {
            if (i2 < 0) {
                i4 = z2 ? 0 : this.d.size() - 1;
            } else {
                int size = this.d.size() - 1;
                while (size >= 0) {
                    q30 q30 = (q30) this.d.get(size);
                    if (i2 >= 0 && i2 == q30.s) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i4 = size;
                } else if (z2) {
                    i4 = size;
                    while (i4 > 0) {
                        q30 q302 = (q30) this.d.get(i4 - 1);
                        if (i2 < 0 || i2 != q302.s) {
                            break;
                        }
                        i4--;
                    }
                } else if (size != this.d.size() - 1) {
                    i4 = size + 1;
                }
            }
        }
        if (i4 < 0) {
            return false;
        }
        for (int size2 = this.d.size() - 1; size2 >= i4; size2--) {
            arrayList.add((q30) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void W(bq2 bq2) {
        if (L(2)) {
            Log.v("FragmentManager", "remove: " + bq2 + " nesting=" + bq2.O);
        }
        boolean v2 = bq2.v();
        if (!bq2.X || !v2) {
            am6 am6 = this.c;
            synchronized (((ArrayList) am6.x)) {
                ((ArrayList) am6.x).remove(bq2);
            }
            bq2.G = false;
            if (M(bq2)) {
                this.G = true;
            }
            bq2.H = true;
            e0(bq2);
        }
    }

    public final void X(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    if (!((q30) arrayList.get(i2)).o) {
                        if (i3 != i2) {
                            C(arrayList, arrayList2, i3, i2);
                        }
                        i3 = i2 + 1;
                        if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                            while (i3 < size && ((Boolean) arrayList2.get(i3)).booleanValue() && !((q30) arrayList.get(i3)).o) {
                                i3++;
                            }
                        }
                        C(arrayList, arrayList2, i2, i3);
                        i2 = i3 - 1;
                    }
                    i2++;
                }
                if (i3 != size) {
                    C(arrayList, arrayList2, i3, size);
                    return;
                }
                return;
            }
            h.s("Internal error with the back stack records");
        }
    }

    /* JADX WARNING: type inference failed for: r15v1, types: [ar2, java.lang.Object] */
    public final void Y(Bundle bundle) {
        jz0 jz0;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        wq2 wq2;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4 = bundle;
        for (String next : bundle4.keySet()) {
            if (next.startsWith("result_") && (bundle3 = bundle4.getBundle(next)) != null) {
                bundle3.setClassLoader(this.w.M.getClassLoader());
                this.m.put(next.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String next2 : bundle4.keySet()) {
            if (next2.startsWith("fragment_") && (bundle2 = bundle4.getBundle(next2)) != null) {
                bundle2.setClassLoader(this.w.M.getClassLoader());
                hashMap.put(next2.substring(9), bundle2);
            }
        }
        am6 am6 = this.c;
        HashMap hashMap2 = (HashMap) am6.z;
        HashMap hashMap3 = (HashMap) am6.y;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        sq2 sq2 = (sq2) bundle4.getParcelable("state");
        if (sq2 != null) {
            hashMap3.clear();
            Iterator it = sq2.w.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                jz0 = this.o;
                i2 = 2;
                if (!hasNext) {
                    break;
                }
                Bundle R = am6.R((String) it.next(), (Bundle) null);
                if (R != null) {
                    bq2 bq2 = (bq2) this.O.b.get(((vq2) R.getParcelable("state")).x);
                    if (bq2 != null) {
                        if (L(2)) {
                            Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + bq2);
                        }
                        wq2 = new wq2(jz0, am6, bq2, R);
                    } else {
                        wq2 = new wq2(this.o, this.c, this.w.M.getClassLoader(), I(), R);
                    }
                    bq2 bq22 = wq2.c;
                    bq22.x = R;
                    bq22.P = this;
                    if (L(2)) {
                        Log.v("FragmentManager", "restoreSaveState: active (" + bq22.A + "): " + bq22);
                    }
                    wq2.m(this.w.M.getClassLoader());
                    am6.L(wq2);
                    wq2.e = this.v;
                }
            }
            tq2 tq2 = this.O;
            tq2.getClass();
            Iterator it2 = new ArrayList(tq2.b.values()).iterator();
            while (true) {
                z2 = true;
                if (!it2.hasNext()) {
                    break;
                }
                bq2 bq23 = (bq2) it2.next();
                if (hashMap3.get(bq23.A) == null) {
                    if (L(2)) {
                        Log.v("FragmentManager", "Discarding retained Fragment " + bq23 + " that was not found in the set of active Fragments " + sq2.w);
                    }
                    this.O.h(bq23);
                    bq23.P = this;
                    wq2 wq22 = new wq2(jz0, am6, bq23);
                    wq22.e = 1;
                    wq22.k();
                    bq23.H = true;
                    wq22.k();
                }
            }
            ArrayList<String> arrayList = sq2.x;
            ((ArrayList) am6.x).clear();
            if (arrayList != null) {
                for (String str : arrayList) {
                    bq2 y2 = am6.y(str);
                    if (y2 != null) {
                        if (L(2)) {
                            Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + y2);
                        }
                        am6.j(y2);
                    } else {
                        h.s(f21.h("No instantiated fragment for (", str, ")"));
                        return;
                    }
                }
            }
            if (sq2.y != null) {
                this.d = new ArrayList(sq2.y.length);
                int i4 = 0;
                while (true) {
                    r30[] r30Arr = sq2.y;
                    if (i4 >= r30Arr.length) {
                        break;
                    }
                    r30 r30 = r30Arr[i4];
                    ArrayList arrayList2 = r30.x;
                    q30 q30 = new q30(this);
                    int[] iArr = r30.w;
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < iArr.length) {
                        ? obj = new Object();
                        int i7 = i5 + 1;
                        int i8 = i2;
                        obj.a = iArr[i5];
                        if (L(i8)) {
                            Log.v("FragmentManager", "Instantiate " + q30 + " op #" + i6 + " base fragment #" + iArr[i7]);
                        }
                        obj.h = k54.values()[r30.y[i6]];
                        obj.i = k54.values()[r30.z[i6]];
                        int i9 = i5 + 2;
                        if (iArr[i7] != 0) {
                            z3 = z2;
                        } else {
                            z3 = false;
                        }
                        obj.c = z3;
                        int i10 = iArr[i9];
                        obj.d = i10;
                        int i11 = iArr[i5 + 3];
                        obj.e = i11;
                        int i12 = i5 + 5;
                        int i13 = iArr[i5 + 4];
                        obj.f = i13;
                        i5 += 6;
                        int[] iArr2 = iArr;
                        int i14 = iArr2[i12];
                        obj.g = i14;
                        q30.b = i10;
                        q30.c = i11;
                        q30.d = i13;
                        q30.e = i14;
                        q30.b(obj);
                        i6++;
                        i2 = i8;
                        iArr = iArr2;
                        z2 = true;
                    }
                    int i15 = i2;
                    q30.f = r30.A;
                    q30.h = r30.B;
                    q30.g = true;
                    q30.i = r30.D;
                    q30.j = r30.E;
                    q30.k = r30.F;
                    q30.l = r30.G;
                    q30.m = r30.H;
                    q30.n = r30.I;
                    q30.o = r30.J;
                    q30.s = r30.C;
                    for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                        String str2 = (String) arrayList2.get(i16);
                        if (str2 != null) {
                            ((ar2) q30.a.get(i16)).b = am6.y(str2);
                        }
                    }
                    q30.c(1);
                    if (L(i15)) {
                        StringBuilder o2 = pb4.o(i4, "restoreAllState: back stack #", " (index ");
                        o2.append(q30.s);
                        o2.append("): ");
                        o2.append(q30);
                        Log.v("FragmentManager", o2.toString());
                        PrintWriter printWriter = new PrintWriter(new zb4());
                        q30.g("  ", printWriter, false);
                        printWriter.close();
                    }
                    this.d.add(q30);
                    i4++;
                    i2 = i15;
                    z2 = true;
                }
                i3 = 0;
            } else {
                i3 = 0;
                this.d = new ArrayList();
            }
            this.k.set(sq2.z);
            String str3 = sq2.A;
            if (str3 != null) {
                bq2 y3 = am6.y(str3);
                this.z = y3;
                r(y3);
            }
            ArrayList arrayList3 = sq2.B;
            if (arrayList3 != null) {
                for (int i17 = i3; i17 < arrayList3.size(); i17++) {
                    this.l.put((String) arrayList3.get(i17), (s30) sq2.C.get(i17));
                }
            }
            this.F = new ArrayDeque(sq2.D);
        }
    }

    /* JADX WARNING: type inference failed for: r3v8, types: [android.os.Parcelable, sq2, java.lang.Object] */
    public final Bundle Z() {
        int i2;
        ArrayList arrayList;
        r30[] r30Arr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        F();
        x();
        A(true);
        this.H = true;
        this.O.g = true;
        am6 am6 = this.c;
        am6.getClass();
        HashMap hashMap = (HashMap) am6.y;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it = hashMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            wq2 wq2 = (wq2) it.next();
            if (wq2 != null) {
                bq2 bq2 = wq2.c;
                String str = bq2.A;
                Bundle bundle3 = new Bundle();
                bq2 bq22 = wq2.c;
                if (bq22.w == -1 && (bundle = bq22.x) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new vq2(bq22));
                if (bq22.w > 0) {
                    Bundle bundle4 = new Bundle();
                    bq22.F(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    wq2.a.z(bq22, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    bq22.p0.H(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle Z = bq22.R.Z();
                    if (!Z.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", Z);
                    }
                    if (bq22.c0 != null) {
                        wq2.o();
                    }
                    SparseArray sparseArray = bq22.y;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = bq22.z;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = bq22.B;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                am6.R(str, bundle3);
                arrayList2.add(bq2.A);
                if (L(2)) {
                    Log.v("FragmentManager", "Saved state of " + bq2 + ": " + bq2.x);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.c.z;
        if (!hashMap2.isEmpty()) {
            am6 am62 = this.c;
            synchronized (((ArrayList) am62.x)) {
                try {
                    if (((ArrayList) am62.x).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) am62.x).size());
                        Iterator it2 = ((ArrayList) am62.x).iterator();
                        while (it2.hasNext()) {
                            bq2 bq23 = (bq2) it2.next();
                            arrayList.add(bq23.A);
                            if (L(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + bq23.A + "): " + bq23);
                            }
                        }
                    }
                } finally {
                    while (true) {
                    }
                }
            }
            int size = this.d.size();
            if (size > 0) {
                r30Arr = new r30[size];
                for (i2 = 0; i2 < size; i2++) {
                    r30Arr[i2] = new r30((q30) this.d.get(i2));
                    if (L(2)) {
                        StringBuilder o2 = pb4.o(i2, "saveAllState: adding back stack #", ": ");
                        o2.append(this.d.get(i2));
                        Log.v("FragmentManager", o2.toString());
                    }
                }
            } else {
                r30Arr = null;
            }
            ? obj = new Object();
            obj.A = null;
            ArrayList arrayList3 = new ArrayList();
            obj.B = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            obj.C = arrayList4;
            obj.w = arrayList2;
            obj.x = arrayList;
            obj.y = r30Arr;
            obj.z = this.k.get();
            bq2 bq24 = this.z;
            if (bq24 != null) {
                obj.A = bq24.A;
            }
            arrayList3.addAll(this.l.keySet());
            arrayList4.addAll(this.l.values());
            obj.D = new ArrayList(this.F);
            bundle2.putParcelable("state", obj);
            for (String str2 : this.m.keySet()) {
                bundle2.putBundle(b81.y("result_", str2), (Bundle) this.m.get(str2));
            }
            for (String str3 : hashMap2.keySet()) {
                bundle2.putBundle(b81.y("fragment_", str3), (Bundle) hashMap2.get(str3));
            }
        } else if (L(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    public final wq2 a(bq2 bq2) {
        String str = bq2.j0;
        if (str != null) {
            zq2.c(bq2, str);
        }
        if (L(2)) {
            Log.v("FragmentManager", "add: " + bq2);
        }
        wq2 g2 = g(bq2);
        bq2.P = this;
        am6 am6 = this.c;
        am6.L(g2);
        if (!bq2.X) {
            am6.j(bq2);
            bq2.H = false;
            if (bq2.c0 == null) {
                bq2.g0 = false;
            }
            if (M(bq2)) {
                this.G = true;
            }
        }
        return g2;
    }

    public final void a0() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.w.N.removeCallbacks(this.P);
                    this.w.N.post(this.P);
                    i0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [bq2] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final void b(dq2 dq2, mp7 mp7, bq2 r9) {
        String str;
        dq2 dq22;
        if (this.w == null) {
            this.w = dq2;
            this.x = mp7;
            this.y = r9;
            CopyOnWriteArrayList copyOnWriteArrayList = this.p;
            if (r9 != 0) {
                copyOnWriteArrayList.add(new mq2(r9));
            } else if (dq2 != null) {
                copyOnWriteArrayList.add(dq2);
            }
            if (this.y != null) {
                i0();
            }
            if (dq2 != null) {
                v45 b2 = dq2.P.b();
                this.g = b2;
                if (r9 != 0) {
                    dq22 = r9;
                } else {
                    dq22 = dq2;
                }
                b2.a(this.j, dq22);
            }
            if (r9 != 0) {
                tq2 tq2 = r9.P.O;
                HashMap hashMap = tq2.c;
                tq2 tq22 = (tq2) hashMap.get(r9.A);
                if (tq22 == null) {
                    tq22 = new tq2(tq2.e);
                    hashMap.put(r9.A, tq22);
                }
                this.O = tq22;
            } else if (dq2 != null) {
                z58 g2 = dq2.P.g();
                gb1 gb1 = gb1.b;
                gb1.getClass();
                no7 no7 = new no7(g2, tq2.h, gb1);
                gq3 b3 = b26.a.b(tq2.class);
                String l2 = b3.l();
                if (l2 != null) {
                    this.O = (tq2) no7.b(b3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(l2));
                } else {
                    h.q("Local and anonymous classes can not be ViewModels");
                    return;
                }
            } else {
                this.O = new tq2(false);
            }
            this.O.g = Q();
            this.c.A = this.O;
            dq2 dq23 = this.w;
            if (dq23 != null && r9 == 0) {
                kg5 h2 = dq23.h();
                h2.K("android:support:fragments", new lv0(3, this));
                Bundle i2 = h2.i("android:support:fragments");
                if (i2 != null) {
                    Y(i2);
                }
            }
            dq2 dq24 = this.w;
            if (dq24 != null) {
                pv0 pv0 = dq24.P.E;
                if (r9 != 0) {
                    str = f21.l(new StringBuilder(), r9.A, ":");
                } else {
                    str = "";
                }
                String concat = "FragmentManager:".concat(str);
                this.C = pv0.c(concat.concat("StartActivityForResult"), new s8(false, 4), new ns8(23, (Object) this));
                this.D = pv0.c(concat.concat("StartIntentSenderForResult"), new s8(5), new f96(22, (Object) this));
                this.E = pv0.c(concat.concat("RequestPermissions"), new s8(false, 2), new ji8(23, (Object) this));
            }
            dq2 dq25 = this.w;
            if (dq25 != null) {
                dq25.i(this.q);
            }
            dq2 dq26 = this.w;
            if (dq26 != null) {
                eq2 eq2 = dq26.P;
                jq2 jq2 = this.r;
                jq2.getClass();
                eq2.G.add(jq2);
            }
            dq2 dq27 = this.w;
            if (dq27 != null) {
                eq2 eq22 = dq27.P;
                jq2 jq22 = this.s;
                jq22.getClass();
                eq22.I.add(jq22);
            }
            dq2 dq28 = this.w;
            if (dq28 != null) {
                eq2 eq23 = dq28.P;
                jq2 jq23 = this.t;
                jq23.getClass();
                eq23.J.add(jq23);
            }
            dq2 dq29 = this.w;
            if (dq29 != null && r9 == 0) {
                eq2 eq24 = dq29.P;
                kq2 kq2 = this.u;
                kq2.getClass();
                cf4 cf4 = eq24.y;
                ((CopyOnWriteArrayList) cf4.y).add(kq2);
                ((Runnable) cf4.x).run();
                return;
            }
            return;
        }
        h.s("Already attached");
    }

    public final void b0(bq2 bq2, boolean z2) {
        ViewGroup H2 = H(bq2);
        if (H2 != null && (H2 instanceof FragmentContainerView)) {
            ((FragmentContainerView) H2).setDrawDisappearingViewsLast(!z2);
        }
    }

    public final void c(bq2 bq2) {
        if (L(2)) {
            Log.v("FragmentManager", "attach: " + bq2);
        }
        if (bq2.X) {
            bq2.X = false;
            if (!bq2.G) {
                this.c.j(bq2);
                if (L(2)) {
                    Log.v("FragmentManager", "add from attach: " + bq2);
                }
                if (M(bq2)) {
                    this.G = true;
                }
            }
        }
    }

    public final void c0(bq2 bq2, k54 k54) {
        if (bq2 == this.c.y(bq2.A) && (bq2.Q == null || bq2.P == this)) {
            bq2.k0 = k54;
        } else {
            ta1.i("Fragment ", bq2, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void d() {
        this.b = false;
        this.M.clear();
        this.L.clear();
    }

    public final void d0(bq2 bq2) {
        if (bq2 != null) {
            if (!(bq2 == this.c.y(bq2.A) && (bq2.Q == null || bq2.P == this))) {
                ta1.i("Fragment ", bq2, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        bq2 bq22 = this.z;
        this.z = bq2;
        r(bq22);
        r(this.z);
    }

    public final HashSet e() {
        un1 un1;
        HashSet hashSet = new HashSet();
        Iterator it = this.c.C().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((wq2) it.next()).c.b0;
            if (viewGroup != null) {
                J().getClass();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof un1) {
                    un1 = (un1) tag;
                } else {
                    un1 = new un1(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, un1);
                }
                hashSet.add(un1);
            }
        }
        return hashSet;
    }

    public final void e0(bq2 bq2) {
        int i2;
        int i3;
        int i4;
        int i5;
        ViewGroup H2 = H(bq2);
        if (H2 != null) {
            aq2 aq2 = bq2.f0;
            boolean z2 = false;
            if (aq2 == null) {
                i2 = 0;
            } else {
                i2 = aq2.b;
            }
            if (aq2 == null) {
                i3 = 0;
            } else {
                i3 = aq2.c;
            }
            int i6 = i3 + i2;
            if (aq2 == null) {
                i4 = 0;
            } else {
                i4 = aq2.d;
            }
            int i7 = i4 + i6;
            if (aq2 == null) {
                i5 = 0;
            } else {
                i5 = aq2.e;
            }
            if (i5 + i7 > 0) {
                if (H2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    H2.setTag(R.id.visible_removing_fragment_view_tag, bq2);
                }
                bq2 bq22 = (bq2) H2.getTag(R.id.visible_removing_fragment_view_tag);
                aq2 aq22 = bq2.f0;
                if (aq22 != null) {
                    z2 = aq22.a;
                }
                if (bq22.f0 != null) {
                    bq22.j().a = z2;
                }
            }
        }
    }

    public final HashSet f(ArrayList arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            Iterator it = ((q30) arrayList.get(i2)).a.iterator();
            while (it.hasNext()) {
                bq2 bq2 = ((ar2) it.next()).b;
                if (!(bq2 == null || (viewGroup = bq2.b0) == null)) {
                    hashSet.add(un1.i(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    public final wq2 g(bq2 bq2) {
        String str = bq2.A;
        am6 am6 = this.c;
        wq2 wq2 = (wq2) ((HashMap) am6.y).get(str);
        if (wq2 != null) {
            return wq2;
        }
        wq2 wq22 = new wq2(this.o, am6, bq2);
        wq22.m(this.w.M.getClassLoader());
        wq22.e = this.v;
        return wq22;
    }

    public final void g0() {
        Iterator it = this.c.C().iterator();
        while (it.hasNext()) {
            wq2 wq2 = (wq2) it.next();
            bq2 bq2 = wq2.c;
            if (bq2.d0) {
                if (this.b) {
                    this.K = true;
                } else {
                    bq2.d0 = false;
                    wq2.k();
                }
            }
        }
    }

    public final void h(bq2 bq2) {
        if (L(2)) {
            Log.v("FragmentManager", "detach: " + bq2);
        }
        if (!bq2.X) {
            bq2.X = true;
            if (bq2.G) {
                if (L(2)) {
                    Log.v("FragmentManager", "remove from detach: " + bq2);
                }
                am6 am6 = this.c;
                synchronized (((ArrayList) am6.x)) {
                    ((ArrayList) am6.x).remove(bq2);
                }
                bq2.G = false;
                if (M(bq2)) {
                    this.G = true;
                }
                e0(bq2);
            }
        }
    }

    public final void h0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new zb4());
        dq2 dq2 = this.w;
        if (dq2 != null) {
            try {
                dq2.P.dump("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        } else {
            try {
                w("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e3) {
                Log.e("FragmentManager", "Failed dumping state", e3);
            }
        }
        throw illegalStateException;
    }

    public final void i(boolean z2) {
        if (!z2 || this.w == null) {
            for (bq2 bq2 : this.c.G()) {
                if (bq2 != null) {
                    bq2.a0 = true;
                    if (z2) {
                        bq2.R.i(true);
                    }
                }
            }
            return;
        }
        h0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        r0 = r5.d.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (r5.h == null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        if ((r0 + r1) <= 0) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (P(r5.y) == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        if (L(3) == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        android.util.Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + r5 + " enabled state is " + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        r5.j.e(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
        return;
     */
    public final void i0() {
        synchronized (this.a) {
            try {
                boolean z2 = true;
                if (!this.a.isEmpty()) {
                    this.j.e(true);
                    if (L(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final boolean j() {
        boolean z2;
        if (this.v >= 1) {
            for (bq2 bq2 : this.c.G()) {
                if (bq2 != null) {
                    if (!bq2.W) {
                        z2 = bq2.R.j();
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean k() {
        boolean z2;
        if (this.v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z3 = false;
        for (bq2 bq2 : this.c.G()) {
            if (bq2 != null && O(bq2)) {
                if (!bq2.W) {
                    z2 = bq2.R.k();
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(bq2);
                    z3 = true;
                }
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                bq2 bq22 = (bq2) this.e.get(i2);
                if (arrayList == null || !arrayList.contains(bq22)) {
                    bq22.getClass();
                }
            }
        }
        this.e = arrayList;
        return z3;
    }

    public final void l() {
        boolean z2 = true;
        this.J = true;
        A(true);
        x();
        dq2 dq2 = this.w;
        am6 am6 = this.c;
        if (dq2 != null) {
            z2 = ((tq2) am6.A).f;
        } else {
            eq2 eq2 = dq2.M;
            if (eq2 != null) {
                z2 = true ^ eq2.isChangingConfigurations();
            }
        }
        if (z2) {
            for (s30 s30 : this.l.values()) {
                for (String f2 : s30.w) {
                    ((tq2) am6.A).f(f2, false);
                }
            }
        }
        u(-1);
        dq2 dq22 = this.w;
        if (dq22 != null) {
            eq2 eq22 = dq22.P;
            jq2 jq2 = this.r;
            jq2.getClass();
            eq22.G.remove(jq2);
        }
        dq2 dq23 = this.w;
        if (dq23 != null) {
            dq23.j(this.q);
        }
        dq2 dq24 = this.w;
        if (dq24 != null) {
            eq2 eq23 = dq24.P;
            jq2 jq22 = this.s;
            jq22.getClass();
            eq23.I.remove(jq22);
        }
        dq2 dq25 = this.w;
        if (dq25 != null) {
            eq2 eq24 = dq25.P;
            jq2 jq23 = this.t;
            jq23.getClass();
            eq24.J.remove(jq23);
        }
        dq2 dq26 = this.w;
        if (dq26 != null && this.y == null) {
            eq2 eq25 = dq26.P;
            kq2 kq2 = this.u;
            kq2.getClass();
            cf4 cf4 = eq25.y;
            ((CopyOnWriteArrayList) cf4.y).remove(kq2);
            if (((HashMap) cf4.z).remove(kq2) == null) {
                ((Runnable) cf4.x).run();
            } else {
                ku4.a();
            }
        }
        this.w = null;
        this.x = null;
        this.y = null;
        if (this.g != null) {
            this.j.d();
            this.g = null;
        }
        a9 a9Var = this.C;
        if (a9Var != null) {
            a9Var.e0();
            this.D.e0();
            this.E.e0();
        }
    }

    public final void m(boolean z2) {
        if (!z2 || this.w == null) {
            for (bq2 bq2 : this.c.G()) {
                if (bq2 != null) {
                    bq2.a0 = true;
                    if (z2) {
                        bq2.R.m(true);
                    }
                }
            }
            return;
        }
        h0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        throw null;
    }

    public final void n(boolean z2) {
        if (!z2 || this.w == null) {
            for (bq2 bq2 : this.c.G()) {
                if (bq2 != null && z2) {
                    bq2.R.n(true);
                }
            }
            return;
        }
        h0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        throw null;
    }

    public final void o() {
        Iterator it = this.c.D().iterator();
        while (it.hasNext()) {
            bq2 bq2 = (bq2) it.next();
            if (bq2 != null) {
                bq2.u();
                bq2.R.o();
            }
        }
    }

    public final boolean p() {
        boolean z2;
        if (this.v >= 1) {
            for (bq2 bq2 : this.c.G()) {
                if (bq2 != null) {
                    if (!bq2.W) {
                        z2 = bq2.R.p();
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.v >= 1) {
            for (bq2 bq2 : this.c.G()) {
                if (bq2 != null && !bq2.W) {
                    bq2.R.q();
                }
            }
        }
    }

    public final void r(bq2 bq2) {
        if (bq2 != null) {
            if (bq2 == this.c.y(bq2.A)) {
                bq2.P.getClass();
                boolean P2 = P(bq2);
                Boolean bool = bq2.F;
                if (bool == null || bool.booleanValue() != P2) {
                    bq2.F = Boolean.valueOf(P2);
                    rq2 rq2 = bq2.R;
                    rq2.i0();
                    rq2.r(rq2.z);
                }
            }
        }
    }

    public final void s(boolean z2) {
        if (!z2 || this.w == null) {
            for (bq2 bq2 : this.c.G()) {
                if (bq2 != null && z2) {
                    bq2.R.s(true);
                }
            }
            return;
        }
        h0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        throw null;
    }

    public final boolean t() {
        boolean z2;
        if (this.v < 1) {
            return false;
        }
        boolean z3 = false;
        for (bq2 bq2 : this.c.G()) {
            if (bq2 != null && O(bq2)) {
                if (!bq2.W) {
                    z2 = bq2.R.t();
                } else {
                    z2 = false;
                }
                if (z2) {
                    z3 = true;
                }
            }
        }
        return z3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        bq2 bq2 = this.y;
        if (bq2 != null) {
            sb.append(bq2.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.y)));
            sb.append("}");
        } else {
            dq2 dq2 = this.w;
            if (dq2 != null) {
                sb.append(dq2.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.w)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: finally extract failed */
    public final void u(int i2) {
        try {
            this.b = true;
            for (wq2 wq2 : ((HashMap) this.c.y).values()) {
                if (wq2 != null) {
                    wq2.e = i2;
                }
            }
            R(i2, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((un1) it.next()).h();
            }
            this.b = false;
            A(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void v() {
        if (this.K) {
            this.K = false;
            g0();
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        String str2;
        String n2 = b81.n(str, "    ");
        am6 am6 = this.c;
        ArrayList arrayList = (ArrayList) am6.x;
        String n3 = b81.n(str, "    ");
        HashMap hashMap = (HashMap) am6.y;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (wq2 wq2 : hashMap.values()) {
                printWriter.print(str);
                if (wq2 != null) {
                    bq2 bq2 = wq2.c;
                    printWriter.println(bq2);
                    bq2.getClass();
                    printWriter.print(n3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(bq2.T));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(bq2.U));
                    printWriter.print(" mTag=");
                    printWriter.println(bq2.V);
                    printWriter.print(n3);
                    printWriter.print("mState=");
                    printWriter.print(bq2.w);
                    printWriter.print(" mWho=");
                    printWriter.print(bq2.A);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(bq2.O);
                    printWriter.print(n3);
                    printWriter.print("mAdded=");
                    printWriter.print(bq2.G);
                    printWriter.print(" mRemoving=");
                    printWriter.print(bq2.H);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(bq2.J);
                    printWriter.print(" mInLayout=");
                    printWriter.println(bq2.K);
                    printWriter.print(n3);
                    printWriter.print("mHidden=");
                    printWriter.print(bq2.W);
                    printWriter.print(" mDetached=");
                    printWriter.print(bq2.X);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(bq2.Z);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(n3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(bq2.Y);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(bq2.e0);
                    if (bq2.P != null) {
                        printWriter.print(n3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(bq2.P);
                    }
                    if (bq2.Q != null) {
                        printWriter.print(n3);
                        printWriter.print("mHost=");
                        printWriter.println(bq2.Q);
                    }
                    if (bq2.S != null) {
                        printWriter.print(n3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(bq2.S);
                    }
                    if (bq2.B != null) {
                        printWriter.print(n3);
                        printWriter.print("mArguments=");
                        printWriter.println(bq2.B);
                    }
                    if (bq2.x != null) {
                        printWriter.print(n3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(bq2.x);
                    }
                    if (bq2.y != null) {
                        printWriter.print(n3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(bq2.y);
                    }
                    if (bq2.z != null) {
                        printWriter.print(n3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(bq2.z);
                    }
                    bq2 bq22 = bq2.C;
                    if (bq22 == null) {
                        rq2 rq2 = bq2.P;
                        if (rq2 == null || (str2 = bq2.D) == null) {
                            bq22 = null;
                        } else {
                            bq22 = rq2.c.y(str2);
                        }
                    }
                    if (bq22 != null) {
                        printWriter.print(n3);
                        printWriter.print("mTarget=");
                        printWriter.print(bq22);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(bq2.E);
                    }
                    printWriter.print(n3);
                    printWriter.print("mPopDirection=");
                    aq2 aq2 = bq2.f0;
                    if (aq2 == null) {
                        z2 = false;
                    } else {
                        z2 = aq2.a;
                    }
                    printWriter.println(z2);
                    aq2 aq22 = bq2.f0;
                    if (aq22 == null) {
                        i2 = 0;
                    } else {
                        i2 = aq22.b;
                    }
                    if (i2 != 0) {
                        printWriter.print(n3);
                        printWriter.print("getEnterAnim=");
                        aq2 aq23 = bq2.f0;
                        if (aq23 == null) {
                            i9 = 0;
                        } else {
                            i9 = aq23.b;
                        }
                        printWriter.println(i9);
                    }
                    aq2 aq24 = bq2.f0;
                    if (aq24 == null) {
                        i3 = 0;
                    } else {
                        i3 = aq24.c;
                    }
                    if (i3 != 0) {
                        printWriter.print(n3);
                        printWriter.print("getExitAnim=");
                        aq2 aq25 = bq2.f0;
                        if (aq25 == null) {
                            i8 = 0;
                        } else {
                            i8 = aq25.c;
                        }
                        printWriter.println(i8);
                    }
                    aq2 aq26 = bq2.f0;
                    if (aq26 == null) {
                        i4 = 0;
                    } else {
                        i4 = aq26.d;
                    }
                    if (i4 != 0) {
                        printWriter.print(n3);
                        printWriter.print("getPopEnterAnim=");
                        aq2 aq27 = bq2.f0;
                        if (aq27 == null) {
                            i7 = 0;
                        } else {
                            i7 = aq27.d;
                        }
                        printWriter.println(i7);
                    }
                    aq2 aq28 = bq2.f0;
                    if (aq28 == null) {
                        i5 = 0;
                    } else {
                        i5 = aq28.e;
                    }
                    if (i5 != 0) {
                        printWriter.print(n3);
                        printWriter.print("getPopExitAnim=");
                        aq2 aq29 = bq2.f0;
                        if (aq29 == null) {
                            i6 = 0;
                        } else {
                            i6 = aq29.e;
                        }
                        printWriter.println(i6);
                    }
                    if (bq2.b0 != null) {
                        printWriter.print(n3);
                        printWriter.print("mContainer=");
                        printWriter.println(bq2.b0);
                    }
                    if (bq2.c0 != null) {
                        printWriter.print(n3);
                        printWriter.print("mView=");
                        printWriter.println(bq2.c0);
                    }
                    if (bq2.n() != null) {
                        hv2.N0(bq2).F0(n3, printWriter);
                    }
                    printWriter.print(n3);
                    printWriter.println("Child " + bq2.R + ":");
                    bq2.R.w(n3.concat("  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size2; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(((bq2) arrayList.get(i10)).toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size; i11++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(((bq2) this.e.get(i11)).toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size3; i12++) {
                q30 q30 = (q30) this.d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(q30.toString());
                q30.g(n2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i13 = 0; i13 < size4; i13++) {
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i13);
                        printWriter.print(": ");
                        printWriter.println((oq2) this.a.get(i13));
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.x);
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final void x() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((un1) it.next()).h();
        }
    }

    public final void y(oq2 oq2, boolean z2) {
        if (!z2) {
            if (this.w == null) {
                if (this.J) {
                    h.s("FragmentManager has been destroyed");
                    return;
                } else {
                    h.s("FragmentManager has not been attached to a host.");
                    return;
                }
            } else if (Q()) {
                h.s("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            try {
                if (this.w != null) {
                    this.a.add(oq2);
                    a0();
                } else if (!z2) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(boolean z2) {
        if (this.b) {
            h.s("FragmentManager is already executing transactions");
        } else if (this.w == null) {
            if (this.J) {
                h.s("FragmentManager has been destroyed");
            } else {
                h.s("FragmentManager has not been attached to a host.");
            }
        } else if (Looper.myLooper() != this.w.N.getLooper()) {
            h.s("Must be called from main thread of fragment host");
        } else if (!z2 && Q()) {
            h.s("Can not perform this action after onSaveInstanceState");
        } else if (this.L == null) {
            this.L = new ArrayList();
            this.M = new ArrayList();
        }
    }
}
