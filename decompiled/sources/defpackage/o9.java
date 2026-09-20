package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.text.Bidi;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o9 implements ov3, lc5, nz3 {
    public Object A;
    public Object B;
    public final /* synthetic */ int w;
    public Object x;
    public Object y;
    public Object z;

    public o9(vl vlVar, tg7 tg7, List list, tp1 tp1, dl2 dl2) {
        List list2;
        List list3;
        int i;
        String str;
        String str2;
        List list4;
        List list5;
        List list6;
        vl vlVar2 = vlVar;
        tg7 tg72 = tg7;
        this.w = 10;
        this.x = vlVar2;
        this.z = list;
        int i2 = 0;
        qn4 qn4 = new qn4(this, 0);
        i44 i44 = i44.x;
        this.A = rg3.y(i44, qn4);
        this.B = rg3.y(i44, new qn4(this, 1));
        nc5 nc5 = tg72.b;
        vl vlVar3 = wl.a;
        ArrayList arrayList = vlVar2.z;
        String str3 = vlVar2.x;
        List list7 = a42.w;
        if (arrayList != null) {
            list2 = dt0.U0(arrayList, new a91(8));
        } else {
            list2 = list7;
        }
        ArrayList arrayList2 = new ArrayList();
        as asVar = new as();
        int size = list2.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            ul ulVar = (ul) list2.get(i3);
            ul a = ul.a(ulVar, nc5.a((nc5) ulVar.a), i2, 14);
            Object obj = a.a;
            int i5 = a.c;
            int i6 = a.b;
            while (i4 < i6 && !asVar.isEmpty()) {
                ul ulVar2 = (ul) asVar.last();
                List list8 = list2;
                int i7 = ulVar2.c;
                List list9 = list3;
                Object obj2 = ulVar2.a;
                if (i6 < i7) {
                    arrayList2.add(new ul(i4, i6, obj2));
                    i4 = i6;
                    list6 = list8;
                    list3 = list9;
                } else {
                    int i8 = size;
                    arrayList2.add(new ul(i4, i7, obj2));
                    i4 = ulVar2.c;
                    while (!asVar.isEmpty() && i4 == ((ul) asVar.last()).c) {
                        asVar.removeLast();
                    }
                    list6 = list8;
                    list3 = list9;
                    size = i8;
                }
            }
            List list10 = list2;
            List list11 = list3;
            int i9 = size;
            if (i4 < i6) {
                arrayList2.add(new ul(i4, i6, nc5));
                i4 = i6;
            }
            ul ulVar3 = (ul) asVar.p();
            if (ulVar3 != null) {
                int i10 = ulVar3.c;
                Object obj3 = ulVar3.a;
                int i11 = ulVar3.b;
                if (i11 == i6 && i10 == i5) {
                    asVar.removeLast();
                    asVar.addLast(new ul(i6, i5, ((nc5) obj3).a((nc5) obj)));
                } else if (i11 == i10) {
                    arrayList2.add(new ul(i11, i10, obj3));
                    asVar.removeLast();
                    asVar.addLast(new ul(i6, i5, obj));
                } else if (i10 >= i5) {
                    asVar.addLast(new ul(i6, i5, ((nc5) obj3).a((nc5) obj)));
                } else {
                    ku4.v();
                    throw null;
                }
            } else {
                asVar.addLast(new ul(i6, i5, obj));
            }
            i3++;
            list2 = list10;
            list7 = list11;
            size = i9;
            i2 = 0;
        }
        List list12 = list3;
        while (i4 <= str3.length() && !asVar.isEmpty()) {
            ul ulVar4 = (ul) asVar.last();
            Object obj4 = ulVar4.a;
            int i12 = ulVar4.c;
            arrayList2.add(new ul(i4, i12, obj4));
            while (!asVar.isEmpty() && i12 == ((ul) asVar.last()).c) {
                asVar.removeLast();
            }
            i4 = i12;
        }
        if (i4 < str3.length()) {
            arrayList2.add(new ul(i4, str3.length(), nc5));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new ul(0, 0, nc5));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i13 = i;
        while (i13 < size2) {
            ul ulVar5 = (ul) arrayList2.get(i13);
            int i14 = ulVar5.b;
            int i15 = ulVar5.c;
            if (i14 != i15) {
                str = str3.substring(i14, i15);
            } else {
                str = "";
            }
            List a2 = wl.a(vlVar2, i14, i15, new j5(8));
            vl vlVar4 = new vl(str, a2 == null ? list12 : a2);
            nc5 nc52 = (nc5) ulVar5.a;
            if (nc52.b == 0) {
                str2 = str3;
                nc52 = new nc5(nc52.a, nc5.b, nc52.c, nc52.d, nc52.e, nc52.f, nc52.g, nc52.h, nc52.i);
            } else {
                str2 = str3;
            }
            tg7 tg73 = new tg7(tg72.a, nc5.a(nc52));
            List list13 = vlVar4.w;
            if (list13 == null) {
                list4 = list12;
            } else {
                list4 = list13;
            }
            List list14 = (List) this.z;
            ArrayList arrayList4 = new ArrayList(list14.size());
            int size3 = list14.size();
            int i16 = 0;
            while (i16 < size3) {
                ul ulVar6 = (ul) list14.get(i16);
                nc5 nc53 = nc5;
                int i17 = ulVar6.b;
                tg7 tg74 = tg73;
                int i18 = ulVar6.c;
                if (wl.b(i14, i15, i17, i18)) {
                    if (i14 > i17 || i18 > i15) {
                        zb3.a("placeholder can not overlap with paragraph.");
                    }
                    list5 = list14;
                    arrayList4.add(new ul(i17 - i14, i18 - i14, ulVar6.a));
                } else {
                    list5 = list14;
                }
                i16++;
                tg7 tg75 = tg7;
                list14 = list5;
                tg73 = tg74;
                nc5 = nc53;
            }
            nc5 nc54 = nc5;
            arrayList3.add(new kc5(new dh(str, tg73, list4, arrayList4, dl2, tp1), i14, i15));
            i13++;
            vlVar2 = vlVar;
            tg72 = tg7;
            str3 = str2;
        }
        this.y = arrayList3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        return r0;
     */
    public static o9 s(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        o9 o9Var = new o9(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) o9Var.A)) {
            try {
                ((ArrayDeque) o9Var.A).clear();
                String string = ((SharedPreferences) o9Var.x).getString((String) o9Var.y, "");
                if (!TextUtils.isEmpty(string)) {
                    if (string.contains((String) o9Var.z)) {
                        String[] split = string.split((String) o9Var.z, -1);
                        if (split.length == 0) {
                            Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                        }
                        for (String str : split) {
                            if (!TextUtils.isEmpty(str)) {
                                ((ArrayDeque) o9Var.A).add(str);
                            }
                        }
                        return o9Var;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int A(int i, boolean z2) {
        int i2;
        ArrayList arrayList = (ArrayList) this.y;
        int h = sg3.h(arrayList, Integer.valueOf(i));
        if (h < 0) {
            i2 = -(h + 1);
        } else {
            i2 = h + 1;
        }
        if (z2 && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public int B(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.y).get(i - 1)).intValue();
    }

    public boolean C() {
        if (((ArrayList) this.y).size() > 0) {
            return true;
        }
        return false;
    }

    public void D(String str, String str2) {
        str2.getClass();
        zy2 zy2 = (zy2) this.z;
        zy2.getClass();
        za5.u(str);
        za5.v(str2, str);
        zy2.b(str);
        za5.m(zy2, str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r3 = r1.getApplicationInfo(r3.getPackageName(), 128);
     */
    public boolean E() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        oe2 oe2 = (oe2) this.y;
        oe2.a();
        Context context = oe2.a;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_installation_id_enabled")) {
                return false;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_installation_id_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public int F(int i, int i2) {
        while (i > i2) {
            char charAt = ((Layout) this.x).getText().charAt(i - 1);
            if (charAt != ' ' && charAt != 10 && charAt != 5760 && ((sg3.k(charAt, 8192) < 0 || sg3.k(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public void G(String str, f56 f56) {
        str.getClass();
        if (str.length() > 0) {
            if (f56 == null) {
                if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                    h.j(f21.h("method ", str, " must have a request body."));
                    return;
                }
            } else if (!gw8.H(str)) {
                h.j(f21.h("method ", str, " must not have a request body."));
                return;
            }
            this.y = str;
            this.A = f56;
            return;
        }
        h.q("method.isEmpty() == true");
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, n9] */
    public n9 H(int i, int i2, int i3) {
        n9 n9Var = (n9) ((ml5) this.x).a();
        if (n9Var == null) {
            ? obj = new Object();
            obj.a = i;
            obj.b = i2;
            obj.c = i3;
            return obj;
        }
        n9Var.a = i;
        n9Var.b = i2;
        n9Var.c = i3;
        return n9Var;
    }

    public void I(n9 n9Var) {
        br4 br4 = (br4) this.A;
        ((ArrayList) this.z).add(n9Var);
        int i = n9Var.a;
        if (i == 1) {
            br4.O(n9Var.b, n9Var.c);
        } else if (i == 2) {
            int i2 = n9Var.b;
            int i3 = n9Var.c;
            RecyclerView recyclerView = (RecyclerView) br4.x;
            recyclerView.O(i2, i3, false);
            recyclerView.C0 = true;
        } else if (i == 4) {
            br4.M(n9Var.b, n9Var.c);
        } else if (i == 8) {
            br4.P(n9Var.b, n9Var.c);
        } else {
            kj6.o("Unknown update op type for ", n9Var);
        }
    }

    public void J(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            n9 n9Var = (n9) arrayList.get(i);
            n9Var.getClass();
            ((ml5) this.x).c(n9Var);
        }
        arrayList.clear();
    }

    public void K(n00 n00, jn7 jn7) {
        in7 in7 = (in7) this.B;
        u10 u10 = (u10) this.x;
        String str = (String) this.y;
        if (str != null) {
            ul7 ul7 = (ul7) this.A;
            if (ul7 != null) {
                en1 en1 = in7.c;
                u10 b = u10.b(n00.b);
                o00 o00 = new o00();
                o00.i = new HashMap();
                o00.g = Long.valueOf(in7.a.b());
                o00.h = Long.valueOf(in7.b.b());
                o00.b = str;
                o00.f = new i42((m42) this.z, (byte[]) ul7.apply(n00.a));
                o00.d = null;
                h10 h10 = n00.c;
                if (h10 != null) {
                    o00.e = h10.a;
                }
                en1.b.execute(new lm0(en1, b, jn7, o00.c(), 1));
                return;
            }
            ku4.j("Null transformer");
            return;
        }
        ku4.j("Null transportName");
    }

    public void L(String str, Object obj) {
        str.getClass();
        ((LinkedHashMap) this.x).put(str, obj);
        d37 d37 = (d37) ((LinkedHashMap) this.z).get(str);
        if (d37 != null) {
            d37.j(obj);
        }
        d37 d372 = (d37) ((LinkedHashMap) this.A).get(str);
        if (d372 != null) {
            d372.j(obj);
        }
    }

    public int M(int i, int i2) {
        int i3;
        int i4;
        ml5 ml5 = (ml5) this.x;
        ArrayList arrayList = (ArrayList) this.z;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            n9 n9Var = (n9) arrayList.get(size);
            int i5 = n9Var.a;
            int i6 = n9Var.b;
            if (i5 == 8) {
                int i7 = n9Var.c;
                if (i6 < i7) {
                    i3 = i7;
                    i4 = i6;
                } else {
                    i4 = i7;
                    i3 = i6;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            n9Var.b = i6 + 1;
                            n9Var.c = i7 + 1;
                        } else if (i2 == 2) {
                            n9Var.b = i6 - 1;
                            n9Var.c = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        n9Var.c = i7 + 1;
                    } else if (i2 == 2) {
                        n9Var.c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        n9Var.b = i6 + 1;
                    } else if (i2 == 2) {
                        n9Var.b = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= n9Var.c;
                } else if (i5 == 2) {
                    i += n9Var.c;
                }
            } else if (i2 == 1) {
                n9Var.b = i6 + 1;
            } else if (i2 == 2) {
                n9Var.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            n9 n9Var2 = (n9) arrayList.get(size2);
            int i8 = n9Var2.a;
            int i9 = n9Var2.c;
            if (i8 == 8) {
                if (i9 == n9Var2.b || i9 < 0) {
                    arrayList.remove(size2);
                    ml5.c(n9Var2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                ml5.c(n9Var2);
            }
        }
        return i;
    }

    public void N(String str) {
        str.getClass();
        if (k57.u0(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (k57.u0(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        f73 f73 = new f73(0);
        f73.f((g73) null, str);
        this.x = f73.c();
    }

    public boolean a() {
        if (((r58) this.B) != null) {
            return true;
        }
        return false;
    }

    public boolean b() {
        ArrayList arrayList = (ArrayList) this.y;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((kc5) arrayList.get(i)).a.b()) {
                return true;
            }
        }
        return false;
    }

    public void c() {
        ((cw0) this.z).c();
        pm pmVar = new pm((fm) dt0.Q0((ArrayList) this.y));
        ((HashMap) ((cw0) this.A).w).put((uq4) this.B, pmVar);
    }

    public float d() {
        return ((Number) ((nz3) this.A).getValue()).floatValue();
    }

    public float e() {
        return ((Number) ((nz3) this.B).getValue()).floatValue();
    }

    public void f(ke0 ke0, Class cls) {
        ((ArrayList) this.z).add(new yb5(ke0, cls));
    }

    public void g(ic2 ic2, Class cls) {
        ((ArrayList) this.A).add(new yb5(ic2, cls));
    }

    public Object getValue() {
        r58 r58 = (r58) this.B;
        if (r58 != null) {
            return r58;
        }
        no7 no7 = new no7(((be4) this.y).x.g(), ((be4) this.z).x.c(), ((be4) this.A).x.d());
        gq3 gq3 = (gq3) this.x;
        gq3.getClass();
        String l = gq3.l();
        if (l != null) {
            r58 b = no7.b(gq3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(l));
            this.B = b;
            return b;
        }
        h.q("Local and anonymous classes can not be ViewModels");
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, f06] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (r2 == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r10 == null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r10.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        monitor-enter(r8.x);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0054, code lost:
        if (((java.lang.Throwable) r8.y) != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r8.y = r10;
        r2 = (defpackage.lp4) r8.A;
        r4 = r2.a;
        r2 = r2.b;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0063, code lost:
        if (r6 < r2) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0065, code lost:
        ((defpackage.h20) r4[r6]).b(r10);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006f, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0071, code lost:
        ((defpackage.lp4) r8.A).d();
        r10 = (defpackage.yt) r8.z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007c, code lost:
        r2 = r10.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008d, code lost:
        if (r10.compareAndSet(r2, ((((r2 >>> 27) & 15) + 1) & 15) << 27) == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0091, code lost:
        throw r8;
     */
    public mk0 h(h20 h20, sr2 sr2) {
        int i;
        int i2;
        boolean z2;
        ? obj = new Object();
        obj.w = -1;
        synchronized (this.x) {
            Throwable th = (Throwable) this.y;
            if (th != null) {
                h20.b(th);
                h hVar = kw5.y;
                return hVar;
            }
            yt ytVar = (yt) this.z;
            do {
                i = ytVar.get();
                i2 = i + 1;
            } while (!ytVar.compareAndSet(i, i2));
            if ((134217727 & i2) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            obj.w = (i2 >>> 27) & 15;
            ((lp4) this.A).a(h20);
        }
        return new hv2(new g20(h20, this, obj, 0));
    }

    public void i(uq4 uq4, Object obj) {
        ((cw0) this.x).i(uq4, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        if (r6.getRunCount() == 1) goto L_0x0076;
     */
    public Bidi j(int i) {
        int i2;
        Bidi bidi;
        int i3;
        Layout layout = (Layout) this.x;
        ArrayList arrayList = (ArrayList) this.y;
        ArrayList arrayList2 = (ArrayList) this.z;
        boolean[] zArr = (boolean[]) this.A;
        if (zArr[i]) {
            return (Bidi) arrayList2.get(i);
        }
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = ((Number) arrayList.get(i - 1)).intValue();
        }
        int intValue = ((Number) arrayList.get(i)).intValue();
        int i4 = intValue - i2;
        char[] cArr = (char[]) this.B;
        if (cArr == null || cArr.length < i4) {
            cArr = new char[i4];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), i2, intValue, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i4)) {
            if (layout.getParagraphDirection(layout.getLineForOffset(B(i))) == -1) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            bidi = new Bidi(cArr2, 0, (byte[]) null, 0, i4, i3);
        }
        bidi = null;
        arrayList2.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.B;
            if (cArr2 == cArr3) {
                cArr2 = null;
            } else {
                cArr2 = cArr3;
            }
        }
        this.B = cArr2;
        return bidi;
    }

    public jx5 k() {
        Context context = (Context) this.x;
        bn1 bn1 = (bn1) this.y;
        z97 z97 = new z97(new o83(this, 0));
        z97 z972 = new z97(new o83(this, 1));
        nz3 nz3 = (rb3) this.z;
        if (nz3 == null) {
            nz3 = new z97(new nf1(29));
        }
        zv0 zv0 = (zv0) this.A;
        if (zv0 == null) {
            a42 a42 = a42.w;
            zv0 = new zv0(a42, a42, a42, a42, a42);
        }
        return new jx5(context, bn1, z97, z972, nz3, zv0, (p83) this.B);
    }

    public void l(uq4 uq4, jq0 jq0) {
        ((cw0) this.x).l(uq4, jq0);
    }

    public pv3 m(uq4 uq4) {
        return ((cw0) this.x).m(uq4);
    }

    public void n(ah0 ah0) {
        ah0.getClass();
        String ah02 = ah0.toString();
        if (ah02.length() == 0) {
            ((zy2) this.z).b("Cache-Control");
        } else {
            D("Cache-Control", ah02);
        }
    }

    public void o(uq4 uq4, gq0 gq0, uq4 uq42) {
        ((cw0) this.x).o(uq4, gq0, uq42);
    }

    public ov3 p(gq0 gq0, uq4 uq4) {
        return ((cw0) this.x).p(gq0, uq4);
    }

    public boolean q(int i) {
        ArrayList arrayList = (ArrayList) this.z;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            n9 n9Var = (n9) arrayList.get(i2);
            int i3 = n9Var.a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = n9Var.b;
                    int i5 = n9Var.c + i4;
                    while (i4 < i5) {
                        if (v(i4, i2 + 1) != i) {
                            i4++;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
                i2++;
            } else if (v(n9Var.c, i2 + 1) != i) {
                i2++;
            }
            return true;
        }
        return false;
    }

    public void r() {
        br4 br4 = (br4) this.A;
        ArrayList arrayList = (ArrayList) this.z;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((br4) this.A).y((n9) arrayList.get(i));
        }
        J(arrayList);
        ArrayList arrayList2 = (ArrayList) this.y;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            n9 n9Var = (n9) arrayList2.get(i2);
            int i3 = n9Var.a;
            if (i3 == 1) {
                br4.y(n9Var);
                br4.O(n9Var.b, n9Var.c);
            } else if (i3 == 2) {
                br4.y(n9Var);
                int i4 = n9Var.b;
                int i5 = n9Var.c;
                RecyclerView recyclerView = (RecyclerView) br4.x;
                recyclerView.O(i4, i5, true);
                recyclerView.C0 = true;
                recyclerView.z0.c += i5;
            } else if (i3 == 4) {
                br4.y(n9Var);
                br4.M(n9Var.b, n9Var.c);
            } else if (i3 == 8) {
                br4.y(n9Var);
                br4.P(n9Var.b, n9Var.c);
            }
        }
        J(arrayList2);
    }

    public void t(n9 n9Var) {
        int i;
        ml5 ml5 = (ml5) this.x;
        int i2 = n9Var.a;
        if (i2 == 1 || i2 == 8) {
            h.q("should not dispatch add or move for pre layout");
            return;
        }
        int M = M(n9Var.b, i2);
        int i3 = n9Var.b;
        int i4 = n9Var.a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            kj6.o("op should be remove or update.", n9Var);
            return;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < n9Var.c; i6++) {
            int M2 = M((i * i6) + n9Var.b, n9Var.a);
            int i7 = n9Var.a;
            if (i7 == 2 ? M2 != M : !(i7 == 4 && M2 == M + 1)) {
                n9 H = H(i7, M, i5);
                u(H, i3);
                ml5.c(H);
                if (n9Var.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                M = M2;
            } else {
                i5++;
            }
        }
        ml5.c(n9Var);
        if (i5 > 0) {
            n9 H2 = H(n9Var.a, M, i5);
            u(H2, i3);
            ml5.c(H2);
        }
    }

    public String toString() {
        String str;
        switch (this.w) {
            case 8:
                StringBuilder sb = new StringBuilder("KmVersionRequirement(kind=");
                cv3 cv3 = (cv3) this.x;
                if (cv3 != null) {
                    sb.append(cv3);
                    sb.append(", level=");
                    bv3 bv3 = (bv3) this.y;
                    if (bv3 != null) {
                        sb.append(bv3);
                        sb.append(", version=");
                        av3 av3 = (av3) this.B;
                        if (av3 != null) {
                            sb.append(av3);
                            sb.append(", errorCode=");
                            sb.append((Integer) this.z);
                            sb.append(", message=");
                            return hl6.o(sb, (String) this.A, ')');
                        }
                        sg3.a0("version");
                        throw null;
                    }
                    sg3.a0("level");
                    throw null;
                }
                sg3.a0("kind");
                throw null;
            case 16:
                String str2 = (String) this.B;
                StringBuilder sb2 = new StringBuilder("since ");
                sb2.append((h48) this.x);
                sb2.append(' ');
                sb2.append((hq1) this.z);
                Integer num = (Integer) this.A;
                String str3 = "";
                if (num != null) {
                    str = " error " + num.intValue();
                } else {
                    str = str3;
                }
                sb2.append(str);
                if (str2 != null) {
                    str3 = ": ".concat(str2);
                }
                sb2.append(str3);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(n9 n9Var, int i) {
        br4 br4 = (br4) this.A;
        br4.y(n9Var);
        int i2 = n9Var.a;
        if (i2 == 2) {
            int i3 = n9Var.c;
            RecyclerView recyclerView = (RecyclerView) br4.x;
            recyclerView.O(i, i3, true);
            recyclerView.C0 = true;
            recyclerView.z0.c += i3;
        } else if (i2 == 4) {
            br4.M(i, n9Var.c);
        } else {
            h.q("only remove and update ops can be dispatched in first pass");
        }
    }

    public int v(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.z;
        int size = arrayList.size();
        while (i2 < size) {
            n9 n9Var = (n9) arrayList.get(i2);
            int i3 = n9Var.a;
            int i4 = n9Var.b;
            if (i3 == 8) {
                if (i4 == i) {
                    i = n9Var.c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (n9Var.c <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = n9Var.c;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += n9Var.c;
            }
            i2++;
        }
        return i;
    }

    public void w(vr2 vr2) {
        int i;
        synchronized (this.x) {
            try {
                lp4 lp4 = (lp4) this.A;
                this.A = (lp4) this.B;
                this.B = lp4;
                yt ytVar = (yt) this.z;
                do {
                    i = ytVar.get();
                } while (!ytVar.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = lp4.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    vr2.y(lp4.f(i3));
                }
                lp4.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        G("GET", (f56) null);
    }

    public float y(int i, boolean z2) {
        Layout layout = (Layout) this.x;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        if (z2) {
            return layout.getPrimaryHorizontal(i);
        }
        return layout.getSecondaryHorizontal(i);
    }

    public float z(int i, boolean z2, boolean z3) {
        boolean z4;
        Bidi bidi;
        boolean z5;
        int i2;
        int i3;
        boolean z6;
        int i4;
        boolean z7;
        boolean z8;
        int i5 = i;
        boolean z9 = z3;
        Layout layout = (Layout) this.x;
        if (!z9) {
            return y(i, z2);
        }
        int B2 = h49.B(layout, i5, z9);
        int lineStart = layout.getLineStart(B2);
        int lineEnd = layout.getLineEnd(B2);
        if (i5 != lineStart && i5 != lineEnd) {
            return y(i, z2);
        }
        if (i5 == 0 || i5 == layout.getText().length()) {
            return y(i, z2);
        }
        int A2 = A(i5, z9);
        if (layout.getParagraphDirection(layout.getLineForOffset(B(A2))) == -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        int F = F(lineEnd, lineStart);
        int B3 = B(A2);
        int i6 = lineStart - B3;
        int i7 = F - B3;
        Bidi j = j(A2);
        if (j != null) {
            bidi = j.createLineBidi(i6, i7);
        } else {
            bidi = null;
        }
        if (bidi == null || bidi.getRunCount() == 1) {
            boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z2 || z4 == isRtlCharAt) {
                if (!z4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            if (i5 == lineStart) {
                z5 = z4;
            } else if (!z4) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                return layout.getLineLeft(B2);
            }
            return layout.getLineRight(B2);
        }
        int runCount = bidi.getRunCount();
        gy3[] gy3Arr = new gy3[runCount];
        for (int i8 = 0; i8 < runCount; i8++) {
            int runStart = bidi.getRunStart(i8) + lineStart;
            int runLimit = bidi.getRunLimit(i8) + lineStart;
            if (bidi.getRunLevel(i8) % 2 == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            gy3Arr[i8] = new gy3(runStart, runLimit, z8);
        }
        int runCount2 = bidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i9 = 0; i9 < runCount2; i9++) {
            bArr[i9] = (byte) bidi.getRunLevel(i9);
        }
        Bidi.reorderVisually(bArr, 0, gy3Arr, 0, runCount);
        if (i5 == lineStart) {
            int i10 = 0;
            while (true) {
                if (i10 >= runCount) {
                    i4 = -1;
                    break;
                } else if (gy3Arr[i10].a == i5) {
                    i4 = i10;
                    break;
                } else {
                    i10++;
                }
            }
            gy3 gy3 = gy3Arr[i4];
            if (!z2 && z4 != gy3.c) {
                z7 = z4;
            } else if (!z4) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (i4 == 0 && z7) {
                return layout.getLineLeft(B2);
            }
            if (i4 == runCount - 1 && !z7) {
                return layout.getLineRight(B2);
            }
            if (z7) {
                return layout.getPrimaryHorizontal(gy3Arr[i4 - 1].a);
            }
            return layout.getPrimaryHorizontal(gy3Arr[i4 + 1].a);
        }
        if (i5 > F) {
            i2 = F(i5, lineStart);
        } else {
            i2 = i5;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= runCount) {
                i3 = -1;
                break;
            } else if (gy3Arr[i11].b == i2) {
                i3 = i11;
                break;
            } else {
                i11++;
            }
        }
        gy3 gy32 = gy3Arr[i3];
        if (z2 || z4 == gy32.c) {
            z6 = z4;
        } else if (!z4) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (i3 == 0 && z6) {
            return layout.getLineLeft(B2);
        }
        if (i3 == runCount - 1 && !z6) {
            return layout.getLineRight(B2);
        }
        if (z6) {
            return layout.getPrimaryHorizontal(gy3Arr[i3 - 1].b);
        }
        return layout.getPrimaryHorizontal(gy3Arr[i3 + 1].b);
    }

    public /* synthetic */ o9(boolean z2) {
        this.w = 12;
    }

    public o9(jm4 jm4, ka9 ka9, HashMap hashMap) {
        this.w = 18;
        this.x = new ConcurrentHashMap();
        jm4.getClass();
        this.y = jm4;
        ka9.getClass();
        this.z = ka9;
        this.B = hashMap;
        g75.h(!hashMap.isEmpty());
        this.A = y59.c;
    }

    public o9(Context context, oe2 oe2, we2 we2, kd6 kd6, gk4 gk4) {
        this.w = 5;
        this.x = new kw2(context, yf3.p, ym.a, jw2.c);
        this.y = oe2;
        this.z = we2;
        this.A = kd6;
        this.B = gk4;
    }

    public o9(h48 h48, mt5 mt5, hq1 hq1, Integer num, String str) {
        this.w = 16;
        mt5.getClass();
        this.x = h48;
        this.y = mt5;
        this.z = hq1;
        this.A = num;
        this.B = str;
    }

    public o9(Map map) {
        this.w = 13;
        map.getClass();
        this.x = new LinkedHashMap(map);
        this.y = new LinkedHashMap();
        this.z = new LinkedHashMap();
        this.A = new LinkedHashMap();
        this.B = new lv0(4, this);
    }

    public o9(int i) {
        this.w = i;
        switch (i) {
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                this.x = new LinkedHashSet();
                this.y = Optional.empty();
                this.z = Optional.empty();
                this.A = Optional.empty();
                return;
            case 12:
                this.B = h42.d;
                this.y = "GET";
                this.z = new zy2();
                return;
            default:
                this.x = new Object();
                this.z = new AtomicInteger(0);
                this.A = new lp4();
                this.B = new lp4();
                return;
        }
    }

    public o9(Layout layout) {
        this.w = 9;
        this.x = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int F0 = d57.F0(((Layout) this.x).getText(), 10, i, 4);
            i = F0 < 0 ? ((Layout) this.x).getText().length() : F0 + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < ((Layout) this.x).getText().length());
        this.y = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add((Object) null);
        }
        this.z = arrayList2;
        this.A = new boolean[((ArrayList) this.y).size()];
        ((ArrayList) this.y).size();
    }

    public o9(u10 u10, String str, m42 m42, ul7 ul7, in7 in7) {
        this.w = 15;
        this.x = u10;
        this.y = str;
        this.z = m42;
        this.A = ul7;
        this.B = in7;
    }

    public o9(gq3 gq3, be4 be4, be4 be42, be4 be43) {
        this.w = 17;
        gq3.getClass();
        this.x = gq3;
        this.y = be4;
        this.z = be42;
        this.A = be43;
    }

    public /* synthetic */ o9(int i, boolean z2) {
        this.w = i;
    }

    public o9(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.w = 14;
        this.A = new ArrayDeque();
        this.x = sharedPreferences;
        this.y = "topic_operation_queue";
        this.z = ",";
        this.B = scheduledThreadPoolExecutor;
    }

    public o9(br4 br4) {
        this.w = 0;
        this.x = new ml5(30);
        this.y = new ArrayList();
        this.z = new ArrayList();
        this.A = br4;
        this.B = new wv2(27, this);
    }

    public o9(zv0 zv0) {
        this.w = 4;
        this.y = dt0.d1(zv0.a);
        this.z = dt0.d1(zv0.b);
        this.x = dt0.d1(zv0.c);
        this.A = dt0.d1(zv0.d);
        this.B = dt0.d1(zv0.e);
    }

    public o9(Context context) {
        this.w = 7;
        this.x = context.getApplicationContext();
        this.y = g.a;
        this.z = null;
        this.A = null;
        this.B = new p83(true, true, true, 4, t82.w);
    }

    public o9(cw0 cw0, cw0 cw02, uq4 uq4, ArrayList arrayList) {
        this.w = 2;
        this.z = cw0;
        this.A = cw02;
        this.B = uq4;
        this.y = arrayList;
        this.x = cw0;
    }

    public o9(bc7 bc7) {
        this.w = 6;
        bc7.getClass();
        this.x = bc7;
        this.A = n33.a;
        this.B = gi2.a;
    }
}
