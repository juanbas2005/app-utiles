package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: f96  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class f96 implements qj4, xi4, t41, l45, ec, v35, ot0, r8, t77, bg4 {
    public static final f96 A = new f96(1, (Object) new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});
    public static final pu2 B = new pu2(1);
    public static f96 y;
    public static final g96 z = new g96(0, false, false, 0, 0);
    public final /* synthetic */ int w;
    public Object x;

    /* JADX WARNING: type inference failed for: r5v9, types: [ve4, java.lang.Object] */
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f96(int i) {
        this((pl3) pl3.d);
        xj4 xj4;
        this.w = i;
        switch (i) {
            case 3:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.x = new d5(this);
                    return;
                } else {
                    this.x = new d5(this);
                    return;
                }
            case 8:
                this.x = new eq4(new q41[16]);
                return;
            case 16:
                this.x = new br4(8, (Object) gv2.l);
                return;
            case 18:
                this.x = new ConcurrentHashMap(16);
                return;
            case 21:
                this.x = new c71();
                return;
            case 26:
                return;
            default:
                bu5 bu5 = bu5.c;
                try {
                    xj4 = (xj4) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null);
                } catch (Exception unused) {
                    xj4 = B;
                }
                xj4[] xj4Arr = {pu2.b, xj4};
                ? obj = new Object();
                obj.a = xj4Arr;
                Charset charset = tf3.a;
                this.x = obj;
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    public static f77 B(mx5 mx5, s83 s83, mi4 mi4, ni4 ni4) {
        String str;
        boolean z2;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(s83.a.getResources(), ni4.a);
        Map map = ni4.b;
        Object obj = map.get("coil#disk_cache_key");
        Boolean bool = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = map.get("coil#is_sampled");
        if (obj2 instanceof Boolean) {
            bool = obj2;
        }
        boolean z3 = false;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = false;
        }
        Bitmap.Config[] configArr = i.a;
        if (mx5 != null && mx5.g) {
            z3 = true;
        }
        return new f77(bitmapDrawable, s83, pe1.w, mi4, str, z2, z3);
    }

    public static synchronized f96 z() {
        f96 f96;
        synchronized (f96.class) {
            try {
                if (y == null) {
                    y = new f96(0, false);
                }
                f96 = y;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return f96;
    }

    public mi4 A(s83 s83, Object obj, v75 v75, g72 g72) {
        String str;
        Map map;
        s83.getClass();
        List list = s83.g;
        List list2 = ((jx5) this.x).f.c;
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                str = null;
                break;
            }
            yb5 yb5 = (yb5) list2.get(i);
            dt3 dt3 = (dt3) yb5.w;
            if (((Class) yb5.x).isAssignableFrom(obj.getClass())) {
                dt3.getClass();
                str = dt3.a(obj, v75);
                if (str != null) {
                    break;
                }
            }
            i++;
        }
        if (str == null) {
            return null;
        }
        Map map2 = s83.y.w;
        boolean isEmpty = map2.isEmpty();
        b42 b42 = b42.w;
        if (isEmpty) {
            map = b42;
        } else {
            map = new LinkedHashMap();
            Iterator it = map2.entrySet().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getValue().getClass();
                ku4.a();
                return null;
            }
        }
        if (list.isEmpty() && map.isEmpty()) {
            return new mi4(str, b42);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (!list.isEmpty()) {
            if (list.size() <= 0) {
                linkedHashMap.put("coil#transformation_size", v75.d.toString());
            } else {
                list.get(0).getClass();
                ku4.a();
                return null;
            }
        }
        return new mi4(str, linkedHashMap);
    }

    public boolean C(int i, int i2, Bundle bundle) {
        return false;
    }

    public void D(xb4 xb4) {
        xb4.getClass();
        f21.u(((c71) this.x).a(xb4));
    }

    public void E() {
        eq4 eq4 = (eq4) this.x;
        re3 V = z65.V(0, eq4.y);
        int i = V.w;
        int i2 = V.x;
        if (i <= i2) {
            while (true) {
                ((q41) eq4.w[i]).b.f(vs7.a);
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        eq4.g();
    }

    public void a(ti4 ti4, boolean z2) {
        ((wo) this.x).t(ti4);
    }

    public void b(Object obj) {
        q8 q8Var = (q8) obj;
        rq2 rq2 = (rq2) this.x;
        nq2 nq2 = (nq2) rq2.F.pollFirst();
        if (nq2 == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = nq2.w;
        int i = nq2.x;
        bq2 A2 = rq2.c.A(str);
        if (A2 == null) {
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
            return;
        }
        A2.x(i, q8Var.w, q8Var.x);
    }

    public x41 build() {
        return new x41(new wv2(((ContentInfo.Builder) this.x).build()));
    }

    public long c() {
        kp1 kp1 = (kp1) this.x;
        y76 y76 = (y76) h49.w(kp1, d86.b);
        return ((zg4) h49.w(kp1, ch4.b)).a.g;
    }

    public void d(ti4 ti4, MenuItem menuItem) {
        ((am0) this.x).B.removeCallbacksAndMessages(ti4);
    }

    public void f(Uri uri) {
        ((ContentInfo.Builder) this.x).setLinkUri(uri);
    }

    public void g(int i) {
        ((ContentInfo.Builder) this.x).setFlags(i);
    }

    public int h(int i) {
        cj1 cj1 = (cj1) this.x;
        if (i <= cj1.x - 1) {
            return i;
        }
        if (i <= cj1.y - 1) {
            return i - 1;
        }
        int i2 = cj1.z;
        if (i <= i2 + 1) {
            return i - 2;
        }
        return i2;
    }

    public db8 i(View view, db8 db8) {
        boolean z2;
        za8 za8 = db8.a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.x;
        if (!Objects.equals(coordinatorLayout.J, db8)) {
            coordinatorLayout.J = db8;
            boolean z3 = true;
            if (db8.d() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            coordinatorLayout.K = z2;
            if (z2 || coordinatorLayout.getBackground() != null) {
                z3 = false;
            }
            coordinatorLayout.setWillNotDraw(z3);
            if (!za8.r()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = e58.a;
                    if (childAt.getFitsSystemWindows() && ((z61) childAt.getLayoutParams()).a != null && za8.r()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return db8;
    }

    public void j(Bundle bundle) {
        ((bc) ((ac) this.x)).a("clx", "_ae", bundle);
    }

    public void k(CancellationException cancellationException) {
        eq4 eq4 = (eq4) this.x;
        int i = eq4.y;
        ik0[] ik0Arr = new ik0[i];
        for (int i2 = 0; i2 < i; i2++) {
            ik0Arr[i2] = ((q41) eq4.w[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            ik0Arr[i3].a(cancellationException);
        }
        if (eq4.y != 0) {
            bc3.c("uncancelled requests present");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: zl0} */
    /* JADX WARNING: Multi-variable type inference failed */
    public void l(ti4 ti4, yi4 yi4) {
        am0 am0 = (am0) this.x;
        Handler handler = am0.B;
        zl0 zl0 = null;
        handler.removeCallbacksAndMessages((Object) null);
        ArrayList arrayList = am0.D;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (ti4 == ((zl0) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            int i2 = i + 1;
            if (i2 < arrayList.size()) {
                zl0 = arrayList.get(i2);
            }
            ti4 ti42 = ti4;
            handler.postAtTime(new yl0(this, zl0, yi4, ti42, 0), ti42, SystemClock.uptimeMillis() + 200);
        }
    }

    public boolean m(ti4 ti4) {
        Window.Callback callback = ((wo) this.x).H.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, ti4);
        return true;
    }

    public c5 n(int i) {
        return null;
    }

    public void o() {
        ((ky0) this.x).getClass();
    }

    public int p(int i) {
        cj1 cj1 = (cj1) this.x;
        if (i < cj1.x) {
            return i;
        }
        if (i < cj1.y) {
            return i + 1;
        }
        int i2 = cj1.z;
        if (i <= i2) {
            return i + 2;
        }
        return i2 + 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a A[Catch:{ ChecksumException | FormatException -> 0x0052 }] */
    public fv0 q(k90 k90, Map map) {
        ChecksumException checksumException;
        k90 k902;
        int i;
        l90 l90 = new l90(k90);
        try {
            return r(l90, map);
        } catch (FormatException e) {
            e = e;
            checksumException = null;
            try {
                l90.i();
                l90.c = null;
                l90.d = null;
                l90.a = true;
                l90.h();
                l90.g();
                k902 = (k90) l90.b;
                i = 0;
                while (i < k902.w) {
                    int i2 = i + 1;
                    for (int i3 = i2; i3 < k902.x; i3++) {
                        if (k902.b(i, i3) != k902.b(i3, i)) {
                            k902.a(i3, i);
                            k902.a(i, i3);
                        }
                    }
                    i = i2;
                }
                fv0 r = r(l90, map);
                r.g = new Object();
                return r;
            } catch (ChecksumException | FormatException unused) {
                if (e != null) {
                    throw e;
                }
                throw checksumException;
            }
        } catch (ChecksumException e2) {
            checksumException = e2;
            e = null;
            l90.i();
            l90.c = null;
            l90.d = null;
            l90.a = true;
            l90.h();
            l90.g();
            k902 = (k90) l90.b;
            i = 0;
            while (i < k902.w) {
            }
            fv0 r2 = r(l90, map);
            r2.g = new Object();
            return r2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: jo0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0276 A[Catch:{ IllegalArgumentException -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x03c8 A[LOOP:21: B:108:0x0220->B:237:0x03c8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0398 A[SYNTHETIC] */
    public fv0 r(l90 l90, Map map) {
        gl4 gl4;
        int ordinal;
        int i;
        jo0 jo0;
        ArrayList arrayList;
        String str;
        int i2;
        char c;
        char c2;
        char c3;
        int i3;
        int i4;
        f48 h = l90.h();
        int i5 = l90.g().a;
        mm2 g = l90.g();
        f48 h2 = l90.h();
        int i6 = b81.F(8)[g.b];
        k90 k90 = (k90) l90.b;
        int i7 = k90.x;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            for (int i10 = 0; i10 < i7; i10++) {
                if (f21.a(i6, i9, i10)) {
                    k90.a(i10, i9);
                }
            }
        }
        int i11 = h2.a * 4;
        int i12 = i11 + 17;
        int i13 = h2.d;
        k90 k902 = new k90(i12, i12);
        k902.g(0, 0, 9, 9);
        int i14 = i11 + 9;
        k902.g(i14, 0, 8, 9);
        k902.g(0, i14, 9, 8);
        int[] iArr = h2.b;
        int length = iArr.length;
        int i15 = 0;
        while (i15 < length) {
            int i16 = iArr[i15] - 2;
            for (int i17 = i8; i17 < length; i17++) {
                if (!((i15 == 0 && (i17 == 0 || i17 == length - 1)) || (i15 == length - 1 && i17 == 0))) {
                    k902.g(iArr[i17] - 2, i16, 5, 5);
                }
            }
            i15++;
            i8 = 0;
        }
        int i18 = 2;
        int i19 = 6;
        int i20 = 1;
        k902.g(6, 9, 1, i11);
        k902.g(9, 6, i11, 1);
        if (h2.a > 6) {
            int i21 = i11 + 6;
            k902.g(i21, 0, 3, 6);
            k902.g(0, i21, 6, 3);
        }
        byte[] bArr = new byte[i13];
        int i22 = i7 - 1;
        int i23 = i22;
        boolean z2 = true;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        while (i23 > 0) {
            if (i23 == i19) {
                i23--;
            }
            int i27 = 0;
            while (i27 < i7) {
                if (z2) {
                    i4 = i22 - i27;
                } else {
                    i4 = i27;
                }
                int i28 = i20;
                int i29 = 0;
                for (int i30 = i18; i29 < i30; i30 = 2) {
                    int i31 = i23 - i29;
                    if (!k902.b(i31, i4)) {
                        i25++;
                        i26 <<= 1;
                        if (k90.b(i31, i4)) {
                            i26 |= 1;
                        }
                        if (i25 == 8) {
                            bArr[i24] = (byte) i26;
                            i24++;
                            i25 = 0;
                            i26 = 0;
                        }
                    }
                    i29++;
                }
                i27++;
                i20 = i28;
                i18 = 2;
            }
            int i32 = i20;
            z2 = !z2;
            i23 -= 2;
            i19 = 6;
            i18 = 2;
        }
        int i33 = i20;
        if (i24 == i13) {
            int i34 = h.d;
            int i35 = h.a;
            if (i13 == i34) {
                qa qaVar = h.c[b81.B(i5)];
                dv5[] dv5Arr = (dv5[]) qaVar.y;
                int i36 = qaVar.x;
                int i37 = 0;
                for (dv5 dv5 : dv5Arr) {
                    i37 += dv5.b;
                }
                ee1[] ee1Arr = new ee1[i37];
                int i38 = 0;
                for (dv5 dv52 : dv5Arr) {
                    int i39 = 0;
                    while (i39 < dv52.b) {
                        int i40 = dv52.c;
                        ee1Arr[i38] = new ee1(i40, new byte[(i36 + i40)]);
                        i39++;
                        i38++;
                    }
                }
                int length2 = ee1Arr[0].b.length;
                int i41 = i37 - 1;
                while (i41 >= 0 && ee1Arr[i41].b.length != length2) {
                    i41--;
                }
                int i42 = i41 + 1;
                int i43 = length2 - i36;
                int i44 = 0;
                int i45 = 0;
                while (i44 < i43) {
                    int i46 = i45;
                    int i47 = 0;
                    while (i47 < i38) {
                        ee1Arr[i47].b[i44] = bArr[i46];
                        i47++;
                        i46++;
                    }
                    i44++;
                    i45 = i46;
                }
                int i48 = i42;
                while (i48 < i38) {
                    ee1Arr[i48].b[i43] = bArr[i45];
                    i48++;
                    i45++;
                }
                int length3 = ee1Arr[0].b.length;
                while (i43 < length3) {
                    int i49 = i45;
                    int i50 = 0;
                    while (i50 < i38) {
                        if (i50 < i42) {
                            i3 = i43;
                        } else {
                            i3 = i43 + 1;
                        }
                        ee1Arr[i50].b[i3] = bArr[i49];
                        i50++;
                        i49++;
                    }
                    i43++;
                    i45 = i49;
                }
                int i51 = 0;
                for (int i52 = 0; i52 < i37; i52++) {
                    i51 += ee1Arr[i52].a;
                }
                byte[] bArr2 = new byte[i51];
                int i53 = 0;
                int i54 = 0;
                while (i54 < i37) {
                    ee1 ee1 = ee1Arr[i54];
                    byte[] bArr3 = ee1.b;
                    int i55 = ee1.a;
                    int length4 = bArr3.length;
                    int[] iArr2 = new int[length4];
                    for (int i56 = 0; i56 < length4; i56++) {
                        iArr2[i56] = bArr3[i56] & 255;
                    }
                    try {
                        ((br4) this.x).x(iArr2, bArr3.length - i55);
                        for (int i57 = 0; i57 < i55; i57++) {
                            bArr3[i57] = (byte) iArr2[i57];
                        }
                        int i58 = 0;
                        while (i58 < i55) {
                            bArr2[i53] = bArr3[i58];
                            i58++;
                            i53++;
                        }
                        i54++;
                    } catch (ReedSolomonException unused) {
                        throw ChecksumException.a();
                    }
                }
                m90 m90 = new m90(bArr2);
                StringBuilder sb = new StringBuilder(50);
                ArrayList arrayList2 = new ArrayList(i33);
                int i59 = -1;
                int i60 = -1;
                boolean z3 = false;
                jo0 jo02 = null;
                while (true) {
                    try {
                        int a = m90.a();
                        gl4 gl42 = gl4.TERMINATOR;
                        if (a >= 4) {
                            int b = m90.b(4);
                            if (b != 0) {
                                if (b == 1) {
                                    gl4 = gl4.NUMERIC;
                                } else if (b == 2) {
                                    gl4 = gl4.ALPHANUMERIC;
                                } else if (b == 3) {
                                    gl4 = gl4.STRUCTURED_APPEND;
                                } else if (b == 4) {
                                    gl4 = gl4.BYTE;
                                } else if (b == 5) {
                                    gl4 = gl4.FNC1_FIRST_POSITION;
                                } else if (b == 7) {
                                    gl4 = gl4.ECI;
                                } else if (b == 8) {
                                    gl4 = gl4.KANJI;
                                } else if (b == 9) {
                                    gl4 = gl4.FNC1_SECOND_POSITION;
                                } else if (b == 13) {
                                    gl4 = gl4.HANZI;
                                } else {
                                    throw new IllegalArgumentException();
                                }
                                int[] iArr3 = gl4.w;
                                ordinal = gl4.ordinal();
                                if (ordinal == 0) {
                                    if (ordinal != 3) {
                                        if (ordinal == 5) {
                                            int b2 = m90.b(8);
                                            if ((b2 & 128) == 0) {
                                                i2 = b2 & 127;
                                            } else if ((b2 & 192) == 128) {
                                                i2 = ((b2 & 63) << 8) | m90.b(8);
                                            } else if ((b2 & 224) == 192) {
                                                i2 = ((b2 & 31) << 16) | m90.b(16);
                                            } else {
                                                throw FormatException.a();
                                            }
                                            HashMap hashMap = jo0.y;
                                            if (i2 >= 0 && i2 < 900) {
                                                jo0 jo03 = jo0.y.get(Integer.valueOf(i2));
                                                if (jo03 != null) {
                                                    jo0 jo04 = jo03;
                                                    i = i59;
                                                    jo0 = jo04;
                                                } else {
                                                    throw FormatException.a();
                                                }
                                            }
                                        } else if (ordinal == 7 || ordinal == 8) {
                                            jo0 jo05 = jo02;
                                            i = i59;
                                            jo0 = jo05;
                                            z3 = true;
                                        } else if (ordinal != 9) {
                                            if (i35 <= 9) {
                                                c2 = 0;
                                            } else if (i35 <= 26) {
                                                c2 = 1;
                                            } else {
                                                c2 = 2;
                                            }
                                            int b3 = m90.b(iArr3[c2]);
                                            int ordinal2 = gl4.ordinal();
                                            if (ordinal2 == 1) {
                                                c3 = 6;
                                                rg3.p(m90, sb, b3);
                                            } else if (ordinal2 == 2) {
                                                c3 = 6;
                                                rg3.l(m90, sb, b3, z3);
                                            } else if (ordinal2 == 4) {
                                                c3 = 6;
                                                rg3.m(m90, sb, b3, jo02, arrayList2, map);
                                            } else if (ordinal2 == 6) {
                                                rg3.o(m90, sb, b3);
                                            } else {
                                                throw FormatException.a();
                                            }
                                            char c4 = c3;
                                        } else {
                                            int b4 = m90.b(4);
                                            if (i35 <= 9) {
                                                c = 0;
                                            } else if (i35 <= 26) {
                                                c = 1;
                                            } else {
                                                c = 2;
                                            }
                                            int b5 = m90.b(iArr3[c]);
                                            if (b4 == 1) {
                                                rg3.n(m90, sb, b5);
                                            }
                                        }
                                        if (gl4 != gl42) {
                                            String sb2 = sb.toString();
                                            if (arrayList2.isEmpty()) {
                                                arrayList = null;
                                            } else {
                                                arrayList = arrayList2;
                                            }
                                            if (i5 == 1) {
                                                str = "L";
                                            } else if (i5 == 2) {
                                                str = "M";
                                            } else if (i5 == 3) {
                                                str = "Q";
                                            } else if (i5 == 4) {
                                                str = "H";
                                            } else {
                                                throw null;
                                            }
                                            return new fv0(bArr2, sb2, arrayList, str, i, i60);
                                        }
                                        int i61 = i;
                                        jo02 = jo0;
                                        i59 = i61;
                                    } else if (m90.a() >= 16) {
                                        i59 = m90.b(8);
                                        i60 = m90.b(8);
                                    } else {
                                        throw FormatException.a();
                                    }
                                    jo0 jo06 = jo02;
                                    i = i59;
                                    jo0 = jo06;
                                    if (gl4 != gl42) {
                                    }
                                }
                                jo0 jo062 = jo02;
                                i = i59;
                                jo0 = jo062;
                                if (gl4 != gl42) {
                                }
                            }
                        }
                        gl4 = gl42;
                        int[] iArr32 = gl4.w;
                        ordinal = gl4.ordinal();
                        if (ordinal == 0) {
                        }
                        jo0 jo0622 = jo02;
                        i = i59;
                        jo0 = jo0622;
                        if (gl4 != gl42) {
                        }
                    } catch (IllegalArgumentException unused2) {
                        throw FormatException.a();
                    }
                }
                throw FormatException.a();
            }
            ku4.v();
            return null;
        }
        throw FormatException.a();
    }

    public Object s(as3 as3, String str) {
        as3.getClass();
        str.getClass();
        pl3 pl3 = (pl3) this.x;
        return pl3.b(i95.C(pl3.b, as3), str);
    }

    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.x).setExtras(bundle);
    }

    public String t(as3 as3, Object obj) {
        as3.getClass();
        pl3 pl3 = (pl3) this.x;
        return pl3.d(i95.C(pl3.b, as3), obj);
    }

    public String toString() {
        switch (this.w) {
            case 1:
                return "Bradford";
            default:
                return super.toString();
        }
    }

    public void u(byte b) {
        ((Parcel) this.x).writeByte(b);
    }

    public void v(float f) {
        ((Parcel) this.x).writeFloat(f);
    }

    public void w(long j) {
        long b = wg7.b(j);
        byte b2 = 0;
        if (!xg7.a(b, 0)) {
            if (xg7.a(b, 4294967296L)) {
                b2 = 1;
            } else if (xg7.a(b, 8589934592L)) {
                b2 = 2;
            }
        }
        u(b2);
        if (!xg7.a(wg7.b(j), 0)) {
            v(wg7.c(j));
        }
    }

    public c5 x(int i) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b4, code lost:
        if (r7 != false) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0121, code lost:
        if (java.lang.Math.abs(((double) r2) - (r10 * ((double) r3))) > 1.0d) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0134, code lost:
        if (java.lang.Math.abs(r8 - r1) > 1) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0140, code lost:
        if (java.lang.Math.abs(r2 - r3) > 1) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0148, code lost:
        if (r0 != false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x014f, code lost:
        if (r7 == false) goto L_0x0153;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0156 A[RETURN] */
    public ni4 y(s83 s83, mi4 mi4, uu6 uu6, wf6 wf6) {
        ni4 ni4;
        ni4 ni42;
        boolean z2;
        Boolean bool;
        boolean z3;
        int i;
        int i2;
        double d;
        double d2;
        ni4 ni43;
        s83 s832 = s83;
        mi4 mi42 = mi4;
        uu6 uu62 = uu6;
        if (s832.o.w) {
            nx5 nx5 = (nx5) ((jx5) this.x).c.getValue();
            if (nx5 != null) {
                ni4 = nx5.a.h(mi42);
                if (ni4 == null) {
                    qa qaVar = nx5.b;
                    synchronized (qaVar) {
                        try {
                            ArrayList arrayList = (ArrayList) ((LinkedHashMap) qaVar.y).get(mi42);
                            if (arrayList != null) {
                                int size = arrayList.size();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= size) {
                                        ni43 = null;
                                        break;
                                    }
                                    ux5 ux5 = (ux5) arrayList.get(i3);
                                    Bitmap bitmap = (Bitmap) ux5.b.get();
                                    if (bitmap != null) {
                                        ni43 = new ni4(bitmap, ux5.c);
                                    } else {
                                        ni43 = null;
                                    }
                                    if (ni43 != null) {
                                        break;
                                    }
                                    i3++;
                                }
                                int i4 = qaVar.x;
                                qaVar.x = i4 + 1;
                                if (i4 >= 10) {
                                    qaVar.c();
                                }
                                ni4 = ni43;
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                            }
                        }
                    }
                }
                if (ni4 != null) {
                    Bitmap bitmap2 = ni4.a;
                    Bitmap.Config config = bitmap2.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    if (kl8.A(config) && !s832.l) {
                        z2 = false;
                    } else {
                        Object obj = ni4.b.get("coil#is_sampled");
                        if (obj instanceof Boolean) {
                            bool = (Boolean) obj;
                        } else {
                            bool = null;
                        }
                        if (bool != null) {
                            z3 = bool.booleanValue();
                        } else {
                            z3 = false;
                        }
                        if (sg3.e(uu62, uu6.c)) {
                            ni42 = null;
                        } else {
                            String str = (String) mi42.x.get("coil#transformation_size");
                            if (str != null) {
                                z2 = str.equals(uu62.toString());
                            } else {
                                int width = bitmap2.getWidth();
                                int height = bitmap2.getHeight();
                                mp7 mp7 = uu62.a;
                                if (mp7 instanceof bv1) {
                                    i = ((bv1) mp7).L;
                                } else {
                                    i = Integer.MAX_VALUE;
                                }
                                mp7 mp72 = uu62.b;
                                if (mp72 instanceof bv1) {
                                    i2 = ((bv1) mp72).L;
                                } else {
                                    i2 = Integer.MAX_VALUE;
                                }
                                double C = gr8.C(width, height, i, i2, wf6);
                                boolean a = g.a(s832);
                                if (a) {
                                    if (C > 1.0d) {
                                        d2 = 1.0d;
                                    } else {
                                        d2 = C;
                                    }
                                    ni42 = null;
                                    d = 1.0d;
                                    if (Math.abs(((double) i) - (((double) width) * d2)) > 1.0d) {
                                    }
                                    z2 = true;
                                    if (z2) {
                                        return ni4;
                                    }
                                    return ni42;
                                }
                                d = 1.0d;
                                ni42 = null;
                                if (i != Integer.MIN_VALUE) {
                                    if (i != Integer.MAX_VALUE) {
                                    }
                                }
                                if (i2 != Integer.MIN_VALUE) {
                                    if (i2 != Integer.MAX_VALUE) {
                                    }
                                }
                                z2 = true;
                                if (z2) {
                                }
                                if (C != d) {
                                }
                                if (C > d) {
                                }
                                z2 = true;
                                if (z2) {
                                }
                            }
                        }
                        z2 = false;
                        if (z2) {
                        }
                    }
                    ni42 = null;
                    if (z2) {
                    }
                }
            }
            ni4 = null;
            if (ni4 != null) {
            }
        }
        return null;
    }

    public /* synthetic */ f96(int i, boolean z2) {
        this.w = i;
    }

    public f96(pl3 pl3) {
        this.w = 26;
        pl3.getClass();
        this.x = pl3;
    }

    public f96(jx5 jx5, kg5 kg5) {
        this.w = 29;
        this.x = jx5;
    }

    public f96(boolean z2) {
        this.w = 6;
        this.x = new AtomicBoolean(z2);
    }

    public /* synthetic */ f96(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public f96(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.w = 23;
        if (Build.VERSION.SDK_INT >= 25) {
            this.x = new nc3(uri, clipDescription, uri2);
        } else {
            this.x = new wr0((Object) uri, (Object) clipDescription, (Object) uri2, 25);
        }
    }

    public f96(aa0 aa0) {
        this.w = 24;
        this.x = new lo0(aa0, mo0.a);
    }

    public f96(ClipData clipData, int i) {
        this.w = 12;
        this.x = se.e(clipData, i);
    }

    public void e(int i, c5 c5Var, String str, Bundle bundle) {
    }
}
