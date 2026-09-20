package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: oe  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class oe extends k4 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener, Runnable {
    public static final xo4 l0;
    public int A = Integer.MIN_VALUE;
    public final ne B = new ne(this, 0);
    public final AccessibilityManager C;
    public long D;
    public List E;
    public final ke F;
    public int G;
    public int H;
    public c5 I;
    public c5 J;
    public boolean K;
    public final yo4 L;
    public final yo4 M;
    public final cz6 N;
    public final cz6 O;
    public int P;
    public Integer Q;
    public final os R;
    public boolean S;
    public long T;
    public boolean U;
    public le V;
    public yo4 W;
    public final zo4 X;
    public final wo4 Y;
    public final wo4 Z;
    public final String a0;
    public final String b0;
    public final cf4 c0;
    public final yo4 d0;
    public gk6 e0;
    public boolean f0;
    public final wo4 g0;
    public final zo4 h0;
    public final y0 i0;
    public final ArrayList j0;
    public final ne k0;
    public final je z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        xo4 xo4 = ke3.a;
        xo4 xo42 = new xo4(32);
        int i = xo42.b;
        if (i >= 0) {
            int i2 = i + 32;
            xo42.b(i2);
            int[] iArr2 = xo42.a;
            int i3 = xo42.b;
            if (i != i3) {
                qs.J0(i2, i, i3, iArr2, iArr2);
            }
            qs.M0(i, 0, 12, iArr, iArr2);
            xo42.b += 32;
            l0 = xo42;
            return;
        }
        h.l("");
    }

    public oe(je jeVar) {
        this.z = jeVar;
        Object systemService = jeVar.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.C = (AccessibilityManager) systemService;
        this.D = 100;
        new Handler(Looper.getMainLooper());
        this.F = new ke(this, 0);
        this.G = Integer.MIN_VALUE;
        this.H = Integer.MIN_VALUE;
        this.L = new yo4();
        this.M = new yo4();
        this.N = new cz6(0);
        this.O = new cz6(0);
        this.P = -1;
        this.R = new os(0);
        this.U = true;
        yo4 yo4 = ne3.a;
        yo4.getClass();
        this.W = yo4;
        this.X = new zo4();
        this.Y = new wo4();
        this.Z = new wo4();
        this.a0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.b0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.c0 = new cf4(25);
        this.d0 = new yo4();
        this.e0 = new gk6(jeVar.getSemanticsOwner().a(), yo4);
        int i = he3.a;
        this.g0 = new wo4();
        this.h0 = new zo4();
        jeVar.addOnAttachStateChangeListener(this);
        this.i0 = new y0(2, this);
        this.j0 = new ArrayList();
        this.k0 = new ne(this, 1);
    }

    public static /* synthetic */ void D(oe oeVar, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        oeVar.C(i, i2, num, (List) null);
    }

    public static Rect K(n85 n85, float f, float f2) {
        if (!(n85 instanceof l85) && !(n85 instanceof m85)) {
            return null;
        }
        ly5 f3 = n85.f();
        return new Rect((int) (f3.a + f), (int) (f3.b + f2), (int) (f3.c + f), (int) (f3.d + f2));
    }

    public static float[] M(n85 n85) {
        if (!(n85 instanceof m85)) {
            return null;
        }
        l96 l96 = ((m85) n85).l;
        long j = l96.h;
        long j2 = l96.g;
        long j3 = l96.f;
        long j4 = l96.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region N(n85 n85, float f, float f2) {
        if (n85 instanceof k85) {
            k85 k85 = (k85) n85;
            ly5 h = k85.f().h(f, f2);
            Region region = new Region(new Rect((int) (h.a + 0.0f), (int) (h.b + 0.0f), (int) (h.c + 0.0f), (int) (h.d + 0.0f)));
            Region region2 = new Region();
            eh ehVar = k85.l;
            if (ehVar instanceof eh) {
                Path path = ehVar.a;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            kj6.n("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    public static CharSequence O(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i);
                subSequence.getClass();
                return subSequence;
            }
        }
        return charSequence;
    }

    public static String s(fk6 fk6) {
        vl vlVar;
        if (fk6 != null) {
            ak6 ak6 = fk6.d;
            tp4 tp4 = ak6.w;
            nk6 nk6 = jk6.a;
            if (tp4.c(nk6)) {
                return i84.a((List) ak6.k(nk6), ",", (tm3) null, 62);
            }
            nk6 nk62 = jk6.G;
            if (tp4.c(nk62)) {
                Object g = tp4.g(nk62);
                if (g == null) {
                    g = null;
                }
                vl vlVar2 = (vl) g;
                if (vlVar2 != null) {
                    return vlVar2.x;
                }
            } else {
                Object g2 = tp4.g(jk6.C);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                if (!(list == null || (vlVar = (vl) dt0.y0(list)) == null)) {
                    return vlVar.x;
                }
            }
        }
        return null;
    }

    public static final boolean w(vg6 vg6, float f) {
        sr2 sr2 = vg6.a;
        if (f < 0.0f && ((Number) sr2.b()).floatValue() > 0.0f) {
            return true;
        }
        if (f <= 0.0f || ((Number) sr2.b()).floatValue() >= ((Number) vg6.b.b()).floatValue()) {
            return false;
        }
        return true;
    }

    public static final boolean x(vg6 vg6) {
        sr2 sr2 = vg6.a;
        if (((Number) sr2.b()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) sr2.b()).floatValue();
        ((Number) vg6.b.b()).floatValue();
        return false;
    }

    public static final boolean y(vg6 vg6) {
        sr2 sr2 = vg6.a;
        if (((Number) sr2.b()).floatValue() < ((Number) vg6.b.b()).floatValue()) {
            return true;
        }
        ((Number) sr2.b()).floatValue();
        return false;
    }

    public final void A(fk6 fk6, gk6 gk6) {
        fk6 fk62 = fk6;
        gk6 gk62 = gk6;
        int[] iArr = ve3.a;
        zo4 zo4 = new zo4();
        List j = fk6.j(4, fk62);
        uy3 uy3 = fk62.c;
        int size = j.size();
        for (int i = 0; i < size; i++) {
            me3 r = r();
            int i2 = ((fk6) j.get(i)).f;
            if (r.a(i2)) {
                if (!gk62.b.c(i2)) {
                    v(uy3);
                    return;
                }
                zo4.a(i2);
            }
        }
        zo4 zo42 = gk62.b;
        int[] iArr2 = zo42.b;
        long[] jArr = zo42.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j2) >= 128 || zo4.c(iArr2[(i3 << 3) + i5])) {
                            j2 >>= 8;
                            i5++;
                        } else {
                            v(uy3);
                            return;
                        }
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        List j3 = fk6.j(4, fk62);
        int size2 = j3.size();
        for (int i6 = 0; i6 < size2; i6++) {
            fk6 fk63 = (fk6) j3.get(i6);
            gk6 gk63 = (gk6) this.d0.b(fk63.f);
            if (gk63 != null && r().a(fk63.f)) {
                A(fk63, gk63);
            }
        }
    }

    public final boolean B(AccessibilityEvent accessibilityEvent) {
        if (!u()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.K = true;
        }
        try {
            return ((Boolean) this.B.y(accessibilityEvent)).booleanValue();
        } finally {
            this.K = false;
        }
    }

    public final boolean C(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !u()) {
            return false;
        }
        AccessibilityEvent n = n(i, i2);
        if (num != null) {
            n.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            n.setContentDescription(i84.a(list, ",", (tm3) null, 62));
        }
        return B(n);
    }

    public final void E(int i, int i2, String str) {
        AccessibilityEvent n = n(z(i), 32);
        n.setContentChangeTypes(i2);
        if (str != null) {
            n.getText().add(str);
        }
        B(n);
    }

    public final void F(int i) {
        le leVar = this.V;
        if (leVar != null) {
            fk6 fk6 = leVar.a;
            if (i == fk6.f) {
                if (SystemClock.uptimeMillis() - leVar.f <= 1000) {
                    AccessibilityEvent n = n(z(fk6.f), 131072);
                    n.setFromIndex(leVar.d);
                    n.setToIndex(leVar.e);
                    n.setAction(leVar.b);
                    n.setMovementGranularity(leVar.c);
                    n.getText().add(s(fk6));
                    B(n);
                }
            } else {
                return;
            }
        }
        this.V = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:201:0x04c0, code lost:
        if (r1.isEmpty() == false) goto L_0x04c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04ef, code lost:
        if (r5 != null) goto L_0x04c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04f4, code lost:
        if (r5 == null) goto L_0x04c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0127, code lost:
        if (defpackage.sg3.e(r1, r13) != false) goto L_0x0129;
     */
    public final void G(me3 me3) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        boolean z2;
        Integer num2;
        int i;
        Integer num3;
        ArrayList arrayList2;
        int i2;
        int i3;
        int i4;
        long[] jArr2;
        int[] iArr2;
        int i5;
        Integer num4;
        boolean z3;
        fk6 fk6;
        ak6 ak6;
        fk6 fk62;
        boolean z4;
        int i6;
        boolean z5;
        boolean z6;
        tp4 tp4;
        uy3 uy3;
        int i7;
        Integer num5;
        ak6 ak62;
        Integer num6;
        ArrayList arrayList3;
        long j;
        int i8;
        int i9;
        uy3 uy32;
        int i10;
        Integer num7;
        int i11;
        tp4 tp42;
        boolean z7;
        dh6 dh6;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        boolean z8;
        boolean z9;
        AccessibilityEvent accessibilityEvent;
        String str2;
        dh6 dh62;
        oe oeVar = this;
        me3 me32 = me3;
        int i16 = 64;
        ArrayList arrayList4 = oeVar.j0;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = me32.b;
        long[] jArr3 = me32.a;
        int i17 = 2;
        int length = jArr3.length - 2;
        boolean z10 = false;
        int i18 = 0;
        if (length >= 0) {
            int i19 = 0;
            while (true) {
                long j2 = jArr3[i19];
                int i20 = i17;
                int i21 = length;
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i22 = 8;
                    int i23 = 8 - ((~(i19 - i21)) >>> 31);
                    long j3 = j2;
                    int i24 = z10;
                    while (i24 < i23) {
                        if ((j3 & 255) < 128) {
                            int i25 = iArr3[(i19 << 3) + i24];
                            gk6 gk6 = (gk6) oeVar.d0.b(i25);
                            if (gk6 != null) {
                                ak6 ak63 = gk6.a;
                                tp4 tp43 = ak63.w;
                                hk6 hk6 = (hk6) me32.b(i25);
                                int i26 = i22;
                                if (hk6 != null) {
                                    fk6 = hk6.a;
                                } else {
                                    fk6 = null;
                                }
                                if (fk6 != null) {
                                    uy3 uy33 = fk6.c;
                                    ak6 ak64 = fk6.d;
                                    iArr2 = iArr3;
                                    int i27 = fk6.f;
                                    jArr2 = jArr3;
                                    tp4 tp44 = ak64.w;
                                    i4 = i19;
                                    Object[] objArr = tp44.b;
                                    Object[] objArr2 = tp44.c;
                                    long[] jArr4 = tp44.a;
                                    i3 = i24;
                                    int length2 = jArr4.length - 2;
                                    long[] jArr5 = jArr4;
                                    if (length2 >= 0) {
                                        uy3 uy34 = uy33;
                                        i2 = i23;
                                        int i28 = 0;
                                        z4 = false;
                                        while (true) {
                                            long j4 = jArr5[i28];
                                            fk62 = fk6;
                                            int i29 = i28;
                                            if ((((~j4) << 7) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                                                int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                                int i31 = 0;
                                                while (i31 < i30) {
                                                    if ((j4 & 255) < 128) {
                                                        int i32 = (i29 << 3) + i31;
                                                        Object obj = objArr[i32];
                                                        int i33 = length2;
                                                        Object obj2 = objArr2[i32];
                                                        ak62 = ak63;
                                                        nk6 nk6 = (nk6) obj;
                                                        j = j4;
                                                        nk6 nk62 = jk6.v;
                                                        if (sg3.e(nk6, nk62) || sg3.e(nk6, jk6.w)) {
                                                            int size = arrayList5.size();
                                                            i9 = i31;
                                                            int i34 = 0;
                                                            while (true) {
                                                                if (i34 >= size) {
                                                                    dh62 = null;
                                                                    break;
                                                                }
                                                                int i35 = size;
                                                                if (((dh6) arrayList5.get(i34)).w == i25) {
                                                                    dh62 = (dh6) arrayList5.get(i34);
                                                                    break;
                                                                } else {
                                                                    i34++;
                                                                    size = i35;
                                                                }
                                                            }
                                                            if (dh62 != null) {
                                                                z7 = false;
                                                            } else {
                                                                dh62 = new dh6(i25, arrayList4);
                                                                z7 = true;
                                                            }
                                                            arrayList4.add(dh62);
                                                        } else {
                                                            i9 = i31;
                                                            z7 = false;
                                                        }
                                                        if (!z7) {
                                                            Object g = tp43.g(nk6);
                                                            if (g == null) {
                                                                g = null;
                                                            }
                                                        }
                                                        nk6 nk63 = jk6.d;
                                                        if (sg3.e(nk6, nk63)) {
                                                            obj2.getClass();
                                                            String str3 = (String) obj2;
                                                            boolean c = tp43.c(nk63);
                                                            int i36 = i26;
                                                            if (c) {
                                                                oeVar.E(i25, i36, str3);
                                                            }
                                                        } else {
                                                            int i37 = i26;
                                                            if (sg3.e(nk6, jk6.b)) {
                                                                D(oeVar, oeVar.z(i25), 2048, i16, i37);
                                                                D(oeVar, oeVar.z(i25), 2048, num5, i37);
                                                            } else if (sg3.e(nk6, jk6.K)) {
                                                                D(oeVar, oeVar.z(i25), 2048, 8192, 8);
                                                                D(oeVar, oeVar.z(i25), 2048, num5, 8);
                                                            } else if (sg3.e(nk6, jk6.M)) {
                                                                D(oeVar, oeVar.z(i25), 2048, 3072, 8);
                                                            } else if (sg3.e(nk6, jk6.c)) {
                                                                D(oeVar, oeVar.z(i25), 2048, i16, 8);
                                                                D(oeVar, oeVar.z(i25), 2048, num5, 8);
                                                            } else {
                                                                nk6 nk64 = jk6.J;
                                                                arrayList3 = arrayList5;
                                                                if (sg3.e(nk6, nk64)) {
                                                                    Object g2 = tp44.g(jk6.z);
                                                                    if (g2 == null) {
                                                                        g2 = null;
                                                                    }
                                                                    s86 s86 = (s86) g2;
                                                                    if (s86 != null && s86.a == 4) {
                                                                        Object g3 = tp44.g(nk64);
                                                                        if (g3 == null) {
                                                                            g3 = null;
                                                                        }
                                                                        if (sg3.e(g3, Boolean.TRUE)) {
                                                                            AccessibilityEvent n = oeVar.n(oeVar.z(i25), 4);
                                                                            fk6 fk63 = fk62;
                                                                            uy32 = uy34;
                                                                            fk6 fk64 = new fk6(fk63.a, true, uy32, ak64);
                                                                            Object g4 = fk64.k().w.g(jk6.a);
                                                                            if (g4 == null) {
                                                                                g4 = null;
                                                                            }
                                                                            List list = (List) g4;
                                                                            fk6 fk65 = fk64;
                                                                            fk62 = fk63;
                                                                            String str4 = null;
                                                                            if (list != null) {
                                                                                str4 = i84.a(list, ",", (tm3) null, 62);
                                                                            }
                                                                            Object g5 = fk65.k().w.g(jk6.C);
                                                                            if (g5 == null) {
                                                                                g5 = null;
                                                                            }
                                                                            List list2 = (List) g5;
                                                                            i8 = i30;
                                                                            if (list2 != null) {
                                                                                str2 = i84.a(list2, ",", (tm3) null, 62);
                                                                            } else {
                                                                                str2 = null;
                                                                            }
                                                                            if (str4 != null) {
                                                                                n.setContentDescription(str4);
                                                                            }
                                                                            if (str2 != null) {
                                                                                n.getText().add(str2);
                                                                            }
                                                                            oeVar.B(n);
                                                                        } else {
                                                                            i8 = i30;
                                                                            uy32 = uy34;
                                                                            D(oeVar, oeVar.z(i25), 2048, num5, 8);
                                                                        }
                                                                    } else {
                                                                        i8 = i30;
                                                                        uy32 = uy34;
                                                                        D(oeVar, oeVar.z(i25), 2048, i16, 8);
                                                                        D(oeVar, oeVar.z(i25), 2048, num5, 8);
                                                                    }
                                                                } else {
                                                                    i8 = i30;
                                                                    uy32 = uy34;
                                                                    if (sg3.e(nk6, jk6.a)) {
                                                                        int z11 = oeVar.z(i25);
                                                                        obj2.getClass();
                                                                        oeVar.C(z11, 2048, 4, (List) obj2);
                                                                    } else {
                                                                        nk6 nk65 = jk6.G;
                                                                        String str5 = "";
                                                                        if (sg3.e(nk6, nk65)) {
                                                                            if (tp44.c(zj6.k)) {
                                                                                Object g6 = tp43.g(nk65);
                                                                                if (g6 == null) {
                                                                                    g6 = null;
                                                                                }
                                                                                CharSequence charSequence = (vl) g6;
                                                                                if (charSequence == null) {
                                                                                    charSequence = str5;
                                                                                }
                                                                                Object g7 = tp44.g(nk65);
                                                                                if (g7 == null) {
                                                                                    g7 = null;
                                                                                }
                                                                                CharSequence charSequence2 = (vl) g7;
                                                                                if (charSequence2 == null) {
                                                                                    charSequence2 = str5;
                                                                                }
                                                                                CharSequence O2 = O(charSequence2);
                                                                                int length3 = charSequence.length();
                                                                                int length4 = charSequence2.length();
                                                                                if (length3 > length4) {
                                                                                    i13 = length4;
                                                                                } else {
                                                                                    i13 = length3;
                                                                                }
                                                                                Integer num8 = num5;
                                                                                int i38 = 0;
                                                                                while (true) {
                                                                                    num6 = i16;
                                                                                    if (i38 >= i13) {
                                                                                        i14 = length3;
                                                                                        break;
                                                                                    }
                                                                                    i14 = length3;
                                                                                    if (charSequence.charAt(i38) != charSequence2.charAt(i38)) {
                                                                                        break;
                                                                                    }
                                                                                    i38++;
                                                                                    length3 = i14;
                                                                                    i16 = num6;
                                                                                }
                                                                                int i39 = 0;
                                                                                while (true) {
                                                                                    if (i39 >= i13 - i38) {
                                                                                        i15 = i39;
                                                                                        break;
                                                                                    }
                                                                                    i15 = i39;
                                                                                    if (charSequence.charAt((i14 - 1) - i39) != charSequence2.charAt((length4 - 1) - i15)) {
                                                                                        break;
                                                                                    }
                                                                                    i39 = i15 + 1;
                                                                                }
                                                                                int i40 = (i14 - i15) - i38;
                                                                                int i41 = (length4 - i15) - i38;
                                                                                nk6 nk66 = jk6.L;
                                                                                boolean c2 = tp43.c(nk66);
                                                                                boolean c3 = tp44.c(nk66);
                                                                                boolean c4 = tp43.c(jk6.G);
                                                                                if (!c4 || c2 || !c3) {
                                                                                    z8 = false;
                                                                                } else {
                                                                                    z8 = true;
                                                                                }
                                                                                if (!c4 || !c2 || c3) {
                                                                                    z9 = false;
                                                                                } else {
                                                                                    z9 = true;
                                                                                }
                                                                                if (z8 || z9) {
                                                                                    tp42 = tp43;
                                                                                    i11 = i25;
                                                                                    num5 = num8;
                                                                                    accessibilityEvent = oeVar.o(oeVar.z(i25), num5, num8, Integer.valueOf(length4), O2);
                                                                                } else {
                                                                                    accessibilityEvent = oeVar.n(oeVar.z(i25), 16);
                                                                                    accessibilityEvent.setFromIndex(i38);
                                                                                    accessibilityEvent.setRemovedCount(i40);
                                                                                    accessibilityEvent.setAddedCount(i41);
                                                                                    accessibilityEvent.setBeforeText(charSequence);
                                                                                    accessibilityEvent.getText().add(O2);
                                                                                    i11 = i25;
                                                                                    tp42 = tp43;
                                                                                    num5 = num8;
                                                                                }
                                                                                accessibilityEvent.setClassName("android.widget.EditText");
                                                                                oeVar.B(accessibilityEvent);
                                                                                if (z8 || z9) {
                                                                                    long j5 = ((lg7) ak64.k(jk6.H)).a;
                                                                                    accessibilityEvent.setFromIndex((int) (j5 >> 32));
                                                                                    accessibilityEvent.setToIndex((int) (j5 & 4294967295L));
                                                                                    oeVar.B(accessibilityEvent);
                                                                                }
                                                                            } else {
                                                                                i11 = i25;
                                                                                tp42 = tp43;
                                                                                num6 = i16;
                                                                                D(oeVar, oeVar.z(i11), 2048, Integer.valueOf(i20), 8);
                                                                            }
                                                                            num7 = num5;
                                                                            i10 = i33;
                                                                        } else {
                                                                            i11 = i25;
                                                                            tp42 = tp43;
                                                                            num6 = i16;
                                                                            i10 = i33;
                                                                            nk6 nk67 = jk6.H;
                                                                            if (sg3.e(nk6, nk67)) {
                                                                                Object g8 = tp44.g(nk65);
                                                                                if (g8 == null) {
                                                                                    g8 = null;
                                                                                }
                                                                                vl vlVar = (vl) g8;
                                                                                if (!(vlVar == null || (str = vlVar.x) == null)) {
                                                                                    str5 = str;
                                                                                }
                                                                                long j6 = ((lg7) ak64.k(nk67)).a;
                                                                                int z12 = oeVar.z(i11);
                                                                                int i42 = z12;
                                                                                num7 = num5;
                                                                                Integer valueOf = Integer.valueOf((int) (j6 >> 32));
                                                                                oeVar = this;
                                                                                oeVar.B(oeVar.o(i42, valueOf, Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str5.length()), O(str5)));
                                                                                oeVar.F(i27);
                                                                            } else {
                                                                                num7 = num5;
                                                                                if (sg3.e(nk6, nk62) || sg3.e(nk6, jk6.w)) {
                                                                                    oeVar.v(uy32);
                                                                                    int size2 = arrayList4.size();
                                                                                    int i43 = 0;
                                                                                    while (true) {
                                                                                        if (i43 >= size2) {
                                                                                            dh6 = null;
                                                                                            break;
                                                                                        } else if (((dh6) arrayList4.get(i43)).w == i11) {
                                                                                            dh6 = (dh6) arrayList4.get(i43);
                                                                                            break;
                                                                                        } else {
                                                                                            i43++;
                                                                                        }
                                                                                    }
                                                                                    dh6.getClass();
                                                                                    Object g9 = tp44.g(nk62);
                                                                                    if (g9 == null) {
                                                                                        g9 = null;
                                                                                    }
                                                                                    dh6.A = (vg6) g9;
                                                                                    Object g10 = tp44.g(jk6.w);
                                                                                    if (g10 == null) {
                                                                                        g10 = null;
                                                                                    }
                                                                                    dh6.B = (vg6) g10;
                                                                                    if (dh6.x.contains(dh6)) {
                                                                                        oeVar.z.getSnapshotObserver().a.e(dh6, oeVar.k0, new ae(1, dh6, oeVar));
                                                                                    }
                                                                                } else if (sg3.e(nk6, jk6.l)) {
                                                                                    obj2.getClass();
                                                                                    if (((Boolean) obj2).booleanValue()) {
                                                                                        i12 = 8;
                                                                                        oeVar.B(oeVar.n(oeVar.z(i27), 8));
                                                                                    } else {
                                                                                        i12 = 8;
                                                                                    }
                                                                                    D(oeVar, oeVar.z(i27), 2048, num7, i12);
                                                                                } else {
                                                                                    nk6 nk68 = zj6.x;
                                                                                    if (sg3.e(nk6, nk68)) {
                                                                                        List list3 = (List) ak64.k(nk68);
                                                                                        Object g11 = tp42.g(nk68);
                                                                                        if (g11 == null) {
                                                                                            g11 = null;
                                                                                        }
                                                                                        List list4 = (List) g11;
                                                                                        if (list4 != null) {
                                                                                            up4 up4 = cg6.a;
                                                                                            up4 up42 = new up4();
                                                                                            if (list3.size() <= 0) {
                                                                                                up4 up43 = new up4();
                                                                                                if (list4.size() <= 0) {
                                                                                                    z4 = !up42.equals(up43);
                                                                                                } else {
                                                                                                    list4.get(0).getClass();
                                                                                                    ku4.a();
                                                                                                    return;
                                                                                                }
                                                                                            } else {
                                                                                                list3.get(0).getClass();
                                                                                                ku4.a();
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                    } else if (obj2 instanceof h4) {
                                                                                        h4 h4Var = (h4) obj2;
                                                                                        Object g12 = tp42.g(nk6);
                                                                                        if (g12 == null) {
                                                                                            g12 = null;
                                                                                        }
                                                                                        if (h4Var != g12) {
                                                                                            if (g12 instanceof h4) {
                                                                                                String str6 = h4Var.a;
                                                                                                h4 h4Var2 = (h4) g12;
                                                                                                ds2 ds2 = h4Var2.b;
                                                                                                if (sg3.e(str6, h4Var2.a)) {
                                                                                                    ds2 ds22 = h4Var.b;
                                                                                                    if (ds22 == null) {
                                                                                                    }
                                                                                                    if (ds22 != null) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        z4 = false;
                                                                                    }
                                                                                    z4 = true;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                num7 = num5;
                                                                i11 = i25;
                                                                tp42 = tp43;
                                                                num6 = i16;
                                                                i10 = i33;
                                                            }
                                                        }
                                                        i11 = i25;
                                                        num6 = i16;
                                                        arrayList3 = arrayList5;
                                                        i8 = i30;
                                                        uy32 = uy34;
                                                        i10 = i33;
                                                        num7 = num5;
                                                        tp42 = tp43;
                                                    } else {
                                                        ak62 = ak63;
                                                        num6 = i16;
                                                        arrayList3 = arrayList5;
                                                        j = j4;
                                                        i8 = i30;
                                                        i9 = i31;
                                                        uy32 = uy34;
                                                        i10 = length2;
                                                        num7 = num5;
                                                        i11 = i25;
                                                        tp42 = tp43;
                                                    }
                                                    i26 = 8;
                                                    i25 = i11;
                                                    uy34 = uy32;
                                                    ak63 = ak62;
                                                    j4 = j >> 8;
                                                    i31 = i9 + 1;
                                                    length2 = i10;
                                                    i18 = num7;
                                                    tp43 = tp42;
                                                    i30 = i8;
                                                    arrayList5 = arrayList3;
                                                    i16 = num6;
                                                }
                                                i6 = i25;
                                                ak6 = ak63;
                                                num3 = i16;
                                                arrayList2 = arrayList5;
                                                uy3 = uy34;
                                                z3 = false;
                                                z5 = true;
                                                i7 = length2;
                                                num4 = num5;
                                                int i44 = i30;
                                                tp4 = tp43;
                                                if (i44 != i26) {
                                                    break;
                                                }
                                            } else {
                                                i6 = i25;
                                                ak6 = ak63;
                                                tp4 = tp43;
                                                num3 = i16;
                                                arrayList2 = arrayList5;
                                                uy3 = uy34;
                                                z3 = false;
                                                z5 = true;
                                                i7 = length2;
                                                num4 = i18;
                                            }
                                            int i45 = i29;
                                            if (i45 == i7) {
                                                break;
                                            }
                                            i18 = num4;
                                            i25 = i6;
                                            tp43 = tp4;
                                            uy34 = uy3;
                                            fk6 = fk62;
                                            ak63 = ak6;
                                            arrayList5 = arrayList2;
                                            i26 = 8;
                                            i28 = i45 + 1;
                                            length2 = i7;
                                            i16 = num3;
                                        }
                                    } else {
                                        ak6 = ak63;
                                        num3 = i16;
                                        arrayList2 = arrayList5;
                                        i2 = i23;
                                        fk62 = fk6;
                                        z5 = true;
                                        num4 = i18;
                                        i6 = i25;
                                        z3 = false;
                                        z4 = false;
                                    }
                                    if (!z4) {
                                        Iterator it = ak6.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                z6 = z3;
                                                break;
                                            }
                                            if (!fk62.k().w.c((nk6) ((Map.Entry) it.next()).getKey())) {
                                                z6 = z5;
                                                break;
                                            }
                                        }
                                        z4 = z6;
                                    }
                                    if (z4) {
                                        int z13 = oeVar.z(i6);
                                        i5 = 8;
                                        D(oeVar, z13, 2048, num4, 8);
                                    } else {
                                        i5 = 8;
                                    }
                                    j3 >>= i5;
                                    i24 = i3 + 1;
                                    me32 = me3;
                                    z10 = z3;
                                    i18 = num4;
                                    i22 = i5;
                                    iArr3 = iArr2;
                                    jArr3 = jArr2;
                                    i19 = i4;
                                    i23 = i2;
                                    arrayList5 = arrayList2;
                                    i16 = num3;
                                } else {
                                    throw b81.t("no value for specified key");
                                }
                            }
                        }
                        i3 = i24;
                        num3 = i16;
                        arrayList2 = arrayList5;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i2 = i23;
                        z3 = z10;
                        i4 = i19;
                        num4 = i18;
                        i5 = i22;
                        j3 >>= i5;
                        i24 = i3 + 1;
                        me32 = me3;
                        z10 = z3;
                        i18 = num4;
                        i22 = i5;
                        iArr3 = iArr2;
                        jArr3 = jArr2;
                        i19 = i4;
                        i23 = i2;
                        arrayList5 = arrayList2;
                        i16 = num3;
                    }
                    int i46 = i23;
                    int i47 = i22;
                    int i48 = i46;
                    num = i16;
                    arrayList = arrayList5;
                    iArr = iArr3;
                    jArr = jArr3;
                    z2 = z10;
                    int i49 = i19;
                    num2 = i18;
                    if (i48 == i47) {
                        i = i49;
                    } else {
                        return;
                    }
                } else {
                    num = i16;
                    arrayList = arrayList5;
                    iArr = iArr3;
                    jArr = jArr3;
                    z2 = z10;
                    num2 = i18;
                    i = i19;
                }
                int i50 = i21;
                if (i != i50) {
                    i19 = i + 1;
                    me32 = me3;
                    length = i50;
                    z10 = z2;
                    i18 = num2;
                    i17 = i20;
                    iArr3 = iArr;
                    jArr3 = jArr;
                    arrayList5 = arrayList;
                    i16 = num;
                } else {
                    return;
                }
            }
        }
    }

    public final void H(uy3 uy3, zo4 zo4) {
        ak6 x;
        if (uy3.J()) {
            this.z.getAndroidViewsHandler();
            uy3 uy32 = null;
            if (!uy3.a0.f(8)) {
                uy3 = uy3.v();
                while (true) {
                    if (uy3 == null) {
                        uy3 = null;
                        break;
                    } else if (uy3.a0.f(8)) {
                        break;
                    } else {
                        uy3 = uy3.v();
                    }
                }
            }
            if (uy3 != null && (x = uy3.x()) != null) {
                if (!x.y) {
                    uy3 v = uy3.v();
                    while (true) {
                        if (v != null) {
                            ak6 x2 = v.x();
                            if (x2 != null && x2.y) {
                                uy32 = v;
                                break;
                            }
                            v = v.v();
                        } else {
                            break;
                        }
                    }
                    if (uy32 != null) {
                        uy3 = uy32;
                    }
                }
                int i = uy3.x;
                if (zo4.a(i)) {
                    D(this, z(i), 2048, 1, 8);
                }
            }
        }
    }

    public final void I(uy3 uy3) {
        if (uy3.J()) {
            this.z.getAndroidViewsHandler();
            int i = uy3.x;
            vg6 vg6 = (vg6) this.L.b(i);
            vg6 vg62 = (vg6) this.M.b(i);
            if (vg6 != null || vg62 != null) {
                AccessibilityEvent n = n(i, 4096);
                if (vg6 != null) {
                    n.setScrollX((int) ((Number) vg6.a.b()).floatValue());
                    n.setMaxScrollX((int) ((Number) vg6.b.b()).floatValue());
                }
                if (vg62 != null) {
                    n.setScrollY((int) ((Number) vg62.a.b()).floatValue());
                    n.setMaxScrollY((int) ((Number) vg62.b.b()).floatValue());
                }
                B(n);
            }
        }
    }

    public final boolean J(fk6 fk6, int i, int i2, boolean z2) {
        String s;
        Integer num;
        Integer num2;
        ak6 ak6 = fk6.d;
        int i3 = fk6.f;
        nk6 nk6 = zj6.j;
        boolean z3 = false;
        if (ak6.w.c(nk6) && fd1.o(fk6)) {
            hs2 hs2 = (hs2) ((h4) fk6.d.k(nk6)).b;
            if (hs2 != null) {
                return ((Boolean) hs2.u(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
            }
        } else if (!((i == i2 && i2 == this.P) || (s = s(fk6)) == null)) {
            if (i < 0 || i != i2 || i2 > s.length()) {
                i = -1;
            }
            this.P = i;
            if (s.length() > 0) {
                z3 = true;
            }
            int z4 = z(i3);
            Integer num3 = null;
            if (z3) {
                num = Integer.valueOf(this.P);
            } else {
                num = null;
            }
            if (z3) {
                num2 = Integer.valueOf(this.P);
            } else {
                num2 = null;
            }
            if (z3) {
                num3 = Integer.valueOf(s.length());
            }
            B(o(z4, num, num2, num3, s));
            F(i3);
            return true;
        }
        return false;
    }

    public final Rect L(float f, float f2, float f3, float f4) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f);
        long floatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
        je jeVar = this.z;
        long q = jeVar.q(floatToRawIntBits2 | (floatToRawIntBits << 32));
        long floatToRawIntBits3 = (long) Float.floatToRawIntBits(f3);
        long q2 = jeVar.q((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (floatToRawIntBits3 << 32));
        int i = (int) (q >> 32);
        int i2 = (int) (q2 >> 32);
        int i3 = (int) (q & 4294967295L);
        int i4 = (int) (q2 & 4294967295L);
        return new Rect((int) ((float) Math.floor((double) Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)))), (int) ((float) Math.floor((double) Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)))), (int) ((float) Math.ceil((double) Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)))), (int) ((float) Math.ceil((double) Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)))));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v7, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013f, code lost:
        r28 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0149, code lost:
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014b, code lost:
        r25 = -1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void P() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long j4;
        long[] jArr2;
        int i;
        int i2;
        int i3;
        char c2;
        fk6 fk6;
        zo4 zo4 = new zo4();
        zo4 zo42 = this.X;
        int[] iArr = zo42.b;
        long[] jArr3 = zo42.a;
        int length = jArr3.length - 2;
        yo4 yo4 = this.d0;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            j3 = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i5];
                char c3 = 7;
                j = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & -9187201950435737472L) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j5 & 255) < 128) {
                            int i8 = iArr[(i5 << 3) + i7];
                            c2 = c3;
                            hk6 hk6 = (hk6) r().b(i8);
                            String str = null;
                            if (hk6 != null) {
                                fk6 = hk6.a;
                            } else {
                                fk6 = null;
                            }
                            if (fk6 != null) {
                                if (fk6.d.w.c(jk6.d)) {
                                }
                            }
                            zo4.a(i8);
                            gk6 gk6 = (gk6) yo4.b(i8);
                            if (gk6 != null) {
                                Object g = gk6.a.w.g(jk6.d);
                                if (g != 0) {
                                    str = g;
                                }
                                str = str;
                            }
                            E(i8, 32, str);
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i7++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i6 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
            }
        } else {
            j3 = 128;
            j2 = 255;
            j = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = zo4.b;
        long[] jArr4 = zo4.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i9 = 0;
            while (true) {
                long j6 = jArr4[i9];
                if ((((~j6) << c) & j6 & j) != j) {
                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j6 & j2) < j3) {
                            int i12 = iArr2[(i9 << 3) + i11];
                            int hashCode = Integer.hashCode(i12) * -862048943;
                            int i13 = hashCode ^ (hashCode << 16);
                            int i14 = i13 & 127;
                            int i15 = zo42.c;
                            int i16 = (i13 >>> 7) & i15;
                            i = i4;
                            int i17 = 0;
                            while (true) {
                                long[] jArr5 = zo42.a;
                                int i18 = i16 >> 3;
                                jArr2 = jArr4;
                                int i19 = (i16 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i18] >>> i19) | ((jArr5[i18 + 1] << (64 - i19)) & ((-((long) i19)) >> 63));
                                int i20 = i15;
                                long j8 = (((long) i14) * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j;
                                while (true) {
                                    if (j9 == 0) {
                                        break;
                                    }
                                    i3 = (i16 + (Long.numberOfTrailingZeros(j9) >> 3)) & i20;
                                    int i21 = i20;
                                    if (zo42.b[i3] == i12) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i20 = i21;
                                }
                                i17 += 8;
                                i16 = (i16 + i17) & i2;
                                jArr4 = jArr2;
                                i15 = i2;
                                j6 = j4;
                            }
                            int i22 = i3;
                            if (i22 >= 0) {
                                zo42.g(i22);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i4;
                        }
                        j6 = j4 >> i;
                        i11++;
                        i4 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i10 != i4) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i9 == length2) {
                    break;
                }
                i9++;
                jArr4 = jArr;
                i4 = 8;
            }
        }
        yo4.c();
        me3 r = r();
        int[] iArr3 = r.b;
        Object[] objArr = r.c;
        long[] jArr6 = r.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i23 = 0;
            while (true) {
                long j10 = jArr6[i23];
                if ((((~j10) << c) & j10 & j) != j) {
                    int i24 = 8 - ((~(i23 - length3)) >>> 31);
                    for (int i25 = 0; i25 < i24; i25++) {
                        if ((j10 & j2) < j3) {
                            int i26 = (i23 << 3) + i25;
                            int i27 = iArr3[i26];
                            fk6 fk62 = ((hk6) objArr[i26]).a;
                            ak6 ak6 = fk62.d;
                            nk6 nk6 = jk6.d;
                            if (ak6.w.c(nk6) && zo42.a(i27)) {
                                E(i27, 16, (String) fk62.d.k(nk6));
                            }
                            yo4.i(i27, new gk6(fk62, r()));
                        }
                        j10 >>= 8;
                    }
                    if (i24 != 8) {
                        break;
                    }
                }
                if (i23 == length3) {
                    break;
                }
                i23++;
            }
        }
        this.e0 = new gk6(this.z.getSemanticsOwner().a(), r());
    }

    public final f96 b(View view) {
        return this.F;
    }

    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0173  */
    public final void j(int i, c5 c5Var, String str, Bundle bundle) {
        fk6 fk6;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i2;
        RectF[] rectFArr;
        int i3;
        bg7 bg7;
        int i4;
        int i5;
        ly5 ly5;
        ly5 ly52;
        int i6 = i;
        String str2 = str;
        Bundle bundle2 = bundle;
        AccessibilityNodeInfo accessibilityNodeInfo = c5Var.a;
        hk6 hk6 = (hk6) r().b(i6);
        if (hk6 != null && (fk6 = hk6.a) != null) {
            uy3 uy3 = fk6.c;
            ak6 ak6 = fk6.d;
            tp4 tp4 = ak6.w;
            String s = s(fk6);
            if (sg3.e(str2, this.a0)) {
                int d = this.Y.d(i6);
                if (d != -1) {
                    accessibilityNodeInfo.getExtras().putInt(str2, d);
                }
            } else if (sg3.e(str2, this.b0)) {
                int d2 = this.Z.d(i6);
                if (d2 != -1) {
                    accessibilityNodeInfo.getExtras().putInt(str2, d2);
                }
            } else {
                boolean c = tp4.c(zj6.a);
                je jeVar = this.z;
                int i7 = 0;
                if (!c || bundle2 == null || !sg3.e(str2, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                    nk6 nk6 = jk6.A;
                    if (tp4.c(nk6) && bundle2 != null && sg3.e(str2, "androidx.compose.ui.semantics.testTag")) {
                        Object g = tp4.g(nk6);
                        if (g == null) {
                            obj5 = null;
                        } else {
                            obj5 = g;
                        }
                        String str3 = (String) obj5;
                        if (str3 != null) {
                            accessibilityNodeInfo.getExtras().putCharSequence(str2, str3);
                        }
                    } else if (sg3.e(str2, "androidx.compose.ui.semantics.id")) {
                        accessibilityNodeInfo.getExtras().putInt(str2, fk6.f);
                    } else if (sg3.e(str2, "androidx.compose.ui.semantics.shapeType")) {
                        Object g2 = tp4.g(jk6.Q);
                        if (g2 == null) {
                            obj4 = null;
                        } else {
                            obj4 = g2;
                        }
                        pq6 pq6 = (pq6) obj4;
                        if (pq6 != null) {
                            Rect rect = new Rect();
                            accessibilityNodeInfo.getBoundsInScreen(rect);
                            ly5 t = t(fk6, rect, pq6);
                            float f = t.b;
                            float f2 = t.a;
                            n85 a = pq6.a(t.c(), uy3.U, jeVar.getDensity());
                            if (a instanceof l85) {
                                accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                                accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", K(a, f2, f));
                            } else if (a instanceof m85) {
                                accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                                accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", K(a, f2, f));
                                accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", M(a));
                            } else if (a instanceof k85) {
                                accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                                accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", N(a, f2, f));
                            } else {
                                h.c();
                            }
                        }
                    } else if (sg3.e(str2, "androidx.compose.ui.semantics.shapeRect")) {
                        Object g3 = tp4.g(jk6.Q);
                        if (g3 == null) {
                            obj3 = null;
                        } else {
                            obj3 = g3;
                        }
                        pq6 pq62 = (pq6) obj3;
                        if (pq62 != null) {
                            Rect rect2 = new Rect();
                            accessibilityNodeInfo.getBoundsInScreen(rect2);
                            ly5 t2 = t(fk6, rect2, pq62);
                            Rect K2 = K(pq62.a(t2.c(), uy3.U, jeVar.getDensity()), t2.a, t2.b);
                            if (K2 != null) {
                                accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", K2);
                            }
                        }
                    } else if (sg3.e(str2, "androidx.compose.ui.semantics.shapeCorners")) {
                        Object g4 = tp4.g(jk6.Q);
                        if (g4 == null) {
                            obj2 = null;
                        } else {
                            obj2 = g4;
                        }
                        pq6 pq63 = (pq6) obj2;
                        if (pq63 != null) {
                            Rect rect3 = new Rect();
                            accessibilityNodeInfo.getBoundsInScreen(rect3);
                            float[] M2 = M(pq63.a(t(fk6, rect3, pq63).c(), uy3.U, jeVar.getDensity()));
                            if (M2 != null) {
                                accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", M2);
                            }
                        }
                    } else if (sg3.e(str2, "androidx.compose.ui.semantics.shapeRegion")) {
                        Object g5 = tp4.g(jk6.Q);
                        if (g5 == null) {
                            obj = null;
                        } else {
                            obj = g5;
                        }
                        pq6 pq64 = (pq6) obj;
                        if (pq64 != null) {
                            Rect rect4 = new Rect();
                            accessibilityNodeInfo.getBoundsInScreen(rect4);
                            ly5 t3 = t(fk6, rect4, pq64);
                            Region N2 = N(pq64.a(t3.c(), uy3.U, jeVar.getDensity()), t3.a, t3.b);
                            if (N2 != null) {
                                accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", N2);
                            }
                        }
                    }
                } else {
                    int i8 = bundle2.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                    int i9 = bundle2.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                    if (i9 > 0 && i8 >= 0) {
                        if (s != null) {
                            i2 = s.length();
                        } else {
                            i2 = Integer.MAX_VALUE;
                        }
                        if (i8 < i2) {
                            bg7 f3 = i75.f(ak6);
                            if (f3 != null) {
                                hc3 hc3 = (hc3) uy3.a0.d;
                                if (!hc3.r0.J) {
                                    hc3 = null;
                                }
                                if (hc3 != null) {
                                    long R2 = hc3.R(0);
                                    ly5 g6 = fk6.g();
                                    RectF[] rectFArr2 = new RectF[i9];
                                    while (i7 < i9) {
                                        int i10 = i8 + i7;
                                        if (i10 < f3.a.a.x.length()) {
                                            ly5 i11 = f3.b(i10).i(R2);
                                            if (i11.g(g6)) {
                                                ly52 = i11.e(g6);
                                            } else {
                                                ly52 = null;
                                            }
                                            if (ly52 != null) {
                                                float f4 = ly52.a;
                                                float f5 = ly52.b;
                                                i4 = i7;
                                                long q = jeVar.q((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L));
                                                float f6 = ly52.c;
                                                long j = q;
                                                long q2 = jeVar.q((((long) Float.floatToRawIntBits(ly52.d)) & 4294967295L) | (((long) Float.floatToRawIntBits(f6)) << 32));
                                                int i12 = (int) (j >> 32);
                                                i5 = i8;
                                                i3 = i9;
                                                int i13 = (int) (q2 >> 32);
                                                bg7 = f3;
                                                ly5 = g6;
                                                int i14 = (int) (j & 4294967295L);
                                                int i15 = (int) (q2 & 4294967295L);
                                                rectFArr2[i4] = new RectF(Math.min(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)), Math.min(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15)), Math.max(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)), Math.max(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15)));
                                                i7 = i4 + 1;
                                                f3 = bg7;
                                                i9 = i3;
                                                g6 = ly5;
                                                i8 = i5;
                                            }
                                        }
                                        i5 = i8;
                                        i3 = i9;
                                        bg7 = f3;
                                        ly5 = g6;
                                        i4 = i7;
                                        i7 = i4 + 1;
                                        f3 = bg7;
                                        i9 = i3;
                                        g6 = ly5;
                                        i8 = i5;
                                    }
                                    rectFArr = rectFArr2;
                                    if (rectFArr == null) {
                                        accessibilityNodeInfo.getExtras().putParcelableArray(str2, (Parcelable[]) rectFArr);
                                        return;
                                    }
                                    return;
                                }
                            }
                            rectFArr = null;
                            if (rectFArr == null) {
                            }
                        }
                    }
                    Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                }
            }
        }
    }

    public final Rect k(hk6 hk6) {
        se3 se3 = hk6.b;
        return L((float) se3.a, (float) se3.b, (float) se3.c, (float) se3.d);
    }

    public final boolean l(boolean z2, int i, long j) {
        nk6 nk6;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7 = z2;
        long j2 = j;
        if (sg3.e(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            me3 r = r();
            if (!l35.b(j2, 9205357640488583168L) && (((9223372034707292159L & j2) + 36028792732385279L) & -9223372034707292160L) == 0) {
                if (z7) {
                    nk6 = jk6.w;
                } else if (!z7) {
                    nk6 = jk6.v;
                } else {
                    h.c();
                    return false;
                }
                Object[] objArr = r.c;
                long[] jArr = r.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z8 = false;
                    while (true) {
                        long j3 = jArr[i3];
                        if ((((~j3) << 7) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j3) < 128) {
                                    hk6 hk6 = (hk6) objArr[(i3 << 3) + i6];
                                    se3 se3 = hk6.b;
                                    i2 = i4;
                                    float f = (float) se3.b;
                                    float f2 = (float) se3.c;
                                    float f3 = (float) se3.d;
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if (intBitsToFloat >= ((float) se3.a)) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (intBitsToFloat < f2) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    boolean z9 = z3 & z4;
                                    if (intBitsToFloat2 >= f) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    boolean z10 = z9 & z5;
                                    if (intBitsToFloat2 < f3) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z6 && z10) {
                                        Object g = hk6.a.d.w.g(nk6);
                                        if (g == null) {
                                            g = null;
                                        }
                                        vg6 vg6 = (vg6) g;
                                        if (vg6 != null) {
                                            sr2 sr2 = vg6.a;
                                            if (i < 0) {
                                                if (((Number) sr2.b()).floatValue() <= 0.0f) {
                                                }
                                            } else if (((Number) sr2.b()).floatValue() >= ((Number) vg6.b.b()).floatValue()) {
                                            }
                                            z8 = true;
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j3 >>= i2;
                                i6++;
                                i4 = i2;
                                long j4 = j;
                            }
                            if (i5 != i4) {
                                return z8;
                            }
                        }
                        if (i3 == length) {
                            return z8;
                        }
                        i3++;
                        long j5 = j;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    public final void m() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (u()) {
                A(this.z.getSemanticsOwner().a(), this.e0);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                G(r());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    P();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final AccessibilityEvent n(int i, int i2) {
        hk6 hk6;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        je jeVar = this.z;
        obtain.setPackageName(jeVar.getContext().getPackageName());
        obtain.setSource(jeVar, i);
        if (u() && (hk6 = (hk6) r().b(i)) != null) {
            fk6 fk6 = hk6.a;
            ak6 ak6 = fk6.d;
            obtain.setPassword(ak6.w.c(jk6.L));
            ak6 ak62 = fk6.d;
            Object g = ak62.w.g(jk6.o);
            if (g == null) {
                g = null;
            }
            boolean e = sg3.e(g, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                l4.k(obtain, e);
            }
        }
        return obtain;
    }

    public final AccessibilityEvent o(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent n = n(i, 8192);
        if (num != null) {
            n.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            n.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            n.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            n.getText().add(charSequence);
        }
        return n;
    }

    public final void onAccessibilityStateChanged(boolean z2) {
        this.E = null;
    }

    public final void onTouchExplorationStateChanged(boolean z2) {
        this.E = null;
    }

    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.C;
        if (accessibilityManager.isEnabled()) {
            this.E = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    public final void onViewDetachedFromWindow(View view) {
        je jeVar = this.z;
        Handler handler = jeVar.getHandler();
        if (handler != null) {
            handler.removeCallbacks(this);
        }
        Handler handler2 = jeVar.getHandler();
        if (handler2 != null) {
            handler2.removeCallbacks(this.i0);
        }
        this.S = false;
        this.f0 = false;
        AccessibilityManager accessibilityManager = this.C;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final int p(fk6 fk6) {
        ak6 ak6 = fk6.d;
        if (!ak6.w.c(jk6.a)) {
            nk6 nk6 = jk6.H;
            if (ak6.w.c(nk6)) {
                return (int) (((lg7) ak6.k(nk6)).a & 4294967295L);
            }
        }
        return this.P;
    }

    public final int q(fk6 fk6) {
        ak6 ak6 = fk6.d;
        if (!ak6.w.c(jk6.a)) {
            nk6 nk6 = jk6.H;
            if (ak6.w.c(nk6)) {
                return (int) (((lg7) ak6.k(nk6)).a >> 32);
            }
        }
        return this.P;
    }

    public final me3 r() {
        fk6 fk6;
        if (this.U) {
            this.U = false;
            je jeVar = this.z;
            this.W = we.m(jeVar.getSemanticsOwner(), ce.z);
            if (u()) {
                yo4 yo4 = this.W;
                Resources resources = jeVar.getContext().getResources();
                wo4 wo4 = this.Y;
                wo4.a();
                wo4 wo42 = this.Z;
                wo42.a();
                hk6 hk6 = (hk6) yo4.b(-1);
                if (hk6 != null) {
                    fk6 = hk6.a;
                } else {
                    fk6 = null;
                }
                fk6.getClass();
                ArrayList b = pk6.b(fk6, new pb(3, yo4), new pb(4, resources), sg3.D(fk6));
                int i = 1;
                int size = b.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((fk6) b.get(i - 1)).f;
                        int i3 = ((fk6) b.get(i)).f;
                        wo4.f(i2, i3);
                        wo42.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.W;
    }

    public final void run() {
        zo4 zo4;
        os osVar = this.R;
        int i = 0;
        this.S = false;
        this.T = SystemClock.uptimeMillis();
        try {
            if (u()) {
                int i2 = osVar.y;
                while (true) {
                    zo4 = this.h0;
                    if (i >= i2) {
                        break;
                    }
                    uy3 uy3 = (uy3) osVar.x[i];
                    H(uy3, zo4);
                    I(uy3);
                    i++;
                }
                zo4.b();
                if (!this.f0) {
                    this.f0 = true;
                    this.i0.run();
                }
            }
            osVar.clear();
            this.L.c();
            this.M.c();
            osVar.clear();
        } catch (Throwable th) {
            osVar.clear();
            throw th;
        }
    }

    public final ly5 t(fk6 fk6, Rect rect, pq6 pq6) {
        me meVar = new me(pq6);
        uy3 uy3 = fk6.c;
        ll4 ll4 = (ll4) uy3.a0.g;
        dk6 dk6 = null;
        if ((ll4.z & 8) != 0) {
            loop0:
            while (true) {
                if (ll4 != null) {
                    if ((ll4.y & 8) != 0) {
                        ll4 ll42 = ll4;
                        eq4 eq4 = null;
                        while (true) {
                            if (ll42 == null) {
                                break;
                            }
                            if (ll42 instanceof dk6) {
                                ((dk6) ll42).D0(meVar);
                                if (meVar.w) {
                                    dk6 = ll42;
                                    break loop0;
                                }
                            } else if ((ll42.y & 8) != 0 && (ll42 instanceof wo1)) {
                                int i = 0;
                                for (ll4 ll43 = ((wo1) ll42).L; ll43 != null; ll43 = ll43.B) {
                                    if ((ll43.y & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            ll42 = ll43;
                                        } else {
                                            if (eq4 == null) {
                                                eq4 = new eq4(new ll4[16]);
                                            }
                                            if (ll42 != null) {
                                                eq4.b(ll42);
                                                ll42 = null;
                                            }
                                            eq4.b(ll43);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            ll42 = rc9.j(eq4);
                        }
                    }
                    if ((ll4.z & 8) == 0) {
                        break;
                    }
                    ll4 = ll4.B;
                } else {
                    break;
                }
            }
        }
        dk6 dk62 = dk6;
        if (dk62 == null || !((ll4) dk62).w.J) {
            return t49.v((xz4) uy3.a0.e, false);
        }
        xz4 N0 = rc9.N0(dk62);
        ly5 Q2 = t49.I(N0).Q(N0, false);
        Rect L2 = L(Q2.a, Q2.b, Q2.c, Q2.d);
        float f = (float) (L2.left - rect.left);
        float f2 = (float) (L2.top - rect.top);
        return new ly5(f, f2, ((float) L2.width()) + f, ((float) L2.height()) + f2);
    }

    public final boolean u() {
        AccessibilityManager accessibilityManager = this.C;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> list = this.E;
        if (list == null) {
            list = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.E = list;
        }
        if (!list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void v(uy3 uy3) {
        if (this.R.add(uy3) && u() && !this.S) {
            this.S = true;
            long uptimeMillis = (this.T + this.D) - SystemClock.uptimeMillis();
            int i = (uptimeMillis > 0 ? 1 : (uptimeMillis == 0 ? 0 : -1));
            je jeVar = this.z;
            if (i < 0) {
                jeVar.post(this);
            } else {
                jeVar.postDelayed(this, uptimeMillis);
            }
        }
    }

    public final int z(int i) {
        if (i == this.z.getSemanticsOwner().a().f) {
            return -1;
        }
        return i;
    }
}
