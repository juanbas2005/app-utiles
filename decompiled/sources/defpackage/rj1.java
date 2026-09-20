package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.hardware.biometrics.BiometricPrompt;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: rj1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class rj1 {
    public static final float A = 6.0f;
    public static final float B = 1.0f;
    public static final StackTraceElement[] C = new StackTraceElement[0];
    public static final Object D = new Object();
    public static final char[] E = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static x83 F;
    public static x83 G;
    public static x83 H;
    public static x83 I;
    public static final cr7 a = cr7.E;
    public static final fw0 b = new fw0(-1542252402, new rw0(2), false);
    public static final fw0 c = new fw0(-159671739, new rw0(4), false);
    public static final fw0 d = new fw0(1900250758, new rw0(5), false);
    public static final fw0 e = new fw0(-334794041, new rw0(6), false);
    public static final fw0 f = new fw0(-2060602189, new nw0(26), false);
    public static final fw0 g = new fw0(-1306789703, new rw0(7), false);
    public static final fw0 h = new fw0(-583499270, new rw0(8), false);
    public static final fw0 i = new fw0(-340086882, new nw0(27), false);
    public static final fw0 j = new fw0(1671897892, new rw0(9), false);
    public static final fw0 k = new fw0(89789866, new nw0(28), false);
    public static final fw0 l = new fw0(-558907420, new rw0(10), false);
    public static final fw0 m = new fw0(520634627, new rw0(11), false);
    public static final fw0 n = new fw0(-760741068, new nw0(29), false);
    public static final fw0 o = new fw0(-471921678, new sw0(0), false);
    public static final fw0 p = new fw0(667673933, new rw0(12), false);
    public static final fw0 q = new fw0(-1445672567, new rw0(13), false);
    public static final fw0 r = new fw0(-962228472, new sw0(1), false);
    public static final fw0 s = new fw0(-1946680947, new rw0(14), false);
    public static final fw0 t = new fw0(862954874, new rw0(15), false);
    public static final fw0 u = new fw0(2007624031, new rw0(3), false);
    public static final or v = new or(1);
    public static final rt0 w = rt0.P;
    public static final vq6 x = vq6.B;
    public static final rt0 y = rt0.R;
    public static final float z = 0.38f;

    public static final boolean A(cr5 cr5) {
        cr5.getClass();
        if (cr5.c() == null) {
            return true;
        }
        return false;
    }

    public static final boolean B(yx6 yx6, vr2 vr2) {
        int i2;
        o2 o2Var;
        Object y2;
        ix6 j2;
        boolean m2;
        do {
            synchronized (D) {
                k37 k37 = yx6.w;
                k37.getClass();
                k37 k372 = (k37) nx6.h(k37);
                i2 = k372.d;
                o2Var = k372.c;
            }
            o2Var.getClass();
            hg5 n2 = o2Var.n();
            y2 = vr2.y(n2);
            o2 k2 = n2.k();
            if (sg3.e(k2, o2Var)) {
                break;
            }
            k37 k373 = yx6.w;
            k373.getClass();
            synchronized (nx6.c) {
                j2 = nx6.j();
                m2 = m((k37) nx6.w(k373, yx6, j2), i2, k2, true);
            }
            nx6.n(j2, yx6);
        } while (!m2);
        return ((Boolean) y2).booleanValue();
    }

    public static yb9 C(yb9 yb9, yb9 yb92) {
        wv2 wv2 = new wv2(6);
        xb7 xb7 = new xb7((br4) wv2.x);
        yz0 yz0 = new yz0(xb7, new AtomicBoolean(false), wv2, 1);
        or orVar = v;
        yb9.g(orVar, yz0);
        yb92.g(orVar, yz0);
        return xb7.a;
    }

    public static final hg D(String str, yt2 yt2) {
        boolean g2 = yt2.g(str);
        Object Q = yt2.Q();
        if (g2 || Q == ay0.a) {
            Q = new p0((Object) str, (f61) null, 22);
            yt2.o0(Q);
        }
        return (hg) u55.r(str, (gs2) Q, yt2, 6).getValue();
    }

    public static LinkedHashSet E(uq4 uq4, Collection collection, Collection collection2, ql4 ql4, r62 r62, h95 h95, boolean z2) {
        if (uq4 == null) {
            a(12);
            throw null;
        } else if (collection == null) {
            a(13);
            throw null;
        } else if (ql4 == null) {
            a(15);
            throw null;
        } else if (r62 == null) {
            a(16);
            throw null;
        } else if (h95 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            r62 r622 = r62;
            ql4 ql42 = ql4;
            Collection collection3 = collection2;
            Collection collection4 = collection;
            h95.h(uq4, collection4, collection3, ql42, new qs1(r622, linkedHashSet, z2));
            return linkedHashSet;
        } else {
            a(17);
            throw null;
        }
    }

    public static LinkedHashSet F(r62 r62, ql4 ql4, uq4 uq4, h95 h95, AbstractCollection abstractCollection, Collection collection) {
        if (uq4 == null) {
            a(0);
            throw null;
        } else if (ql4 == null) {
            a(3);
            throw null;
        } else if (r62 == null) {
            a(4);
            throw null;
        } else if (h95 != null) {
            return E(uq4, abstractCollection, collection, ql4, r62, h95, false);
        } else {
            a(5);
            throw null;
        }
    }

    public static LinkedHashSet G(r62 r62, ql4 ql4, uq4 uq4, h95 h95, AbstractCollection abstractCollection, Collection collection) {
        if (uq4 == null) {
            a(6);
            throw null;
        } else if (collection == null) {
            a(7);
            throw null;
        } else if (ql4 == null) {
            a(9);
            throw null;
        } else if (r62 == null) {
            a(10);
            throw null;
        } else if (h95 != null) {
            return E(uq4, collection, abstractCollection, ql4, r62, h95, true);
        } else {
            a(11);
            throw null;
        }
    }

    public static final void H(c5 c5Var, fk6 fk6) {
        int i2;
        AccessibilityNodeInfo accessibilityNodeInfo = c5Var.a;
        Object g2 = fk6.k().w.g(jk6.f);
        Object obj = null;
        if (g2 == null) {
            g2 = null;
        }
        at0 at0 = (at0) g2;
        if (at0 != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(at0.a, at0.b, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object g3 = fk6.k().w.g(jk6.e);
        if (g3 != null) {
            obj = g3;
        }
        if (obj != null) {
            List j2 = fk6.j(4, fk6);
            int size = j2.size();
            for (int i3 = 0; i3 < size; i3++) {
                fk6 fk62 = (fk6) j2.get(i3);
                if (fk62.k().w.c(jk6.J)) {
                    arrayList.add(fk62);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            boolean n2 = n(arrayList);
            int i4 = 1;
            if (n2) {
                i2 = 1;
            } else {
                i2 = arrayList.size();
            }
            if (n2) {
                i4 = arrayList.size();
            }
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i4, false, 0));
        }
    }

    public static final nu3 I(Collection collection, ou3 ou3) {
        Iterator it = collection.iterator();
        nu3 nu3 = null;
        while (it.hasNext()) {
            nu3 nu32 = (nu3) it.next();
            if (sg3.e(nu32.b(), ou3)) {
                if (nu3 == null) {
                    nu3 = nu32;
                } else {
                    ku4.t("Multiple extensions handle the same extension type: ", ou3);
                    return null;
                }
            }
        }
        if (nu3 != null) {
            return nu3;
        }
        ku4.t("No extensions handle the extension type: ", ou3);
        return null;
    }

    public static int J(int i2) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i2) * -862048943), 15)) * 461845907);
    }

    public static final String K(f61 f61) {
        Object obj;
        if (f61 instanceof sv1) {
            return ((sv1) f61).toString();
        }
        try {
            obj = f61 + '@' + t(f61);
        } catch (Throwable th) {
            obj = new m66(th);
        }
        if (o66.a(obj) != null) {
            obj = f61.getClass().getName() + '@' + t(f61);
        }
        return (String) obj;
    }

    public static String L(int i2) {
        if (i2 == 0) {
            return "Clear";
        }
        if (i2 == 1) {
            return "Src";
        }
        if (i2 == 2) {
            return "Dst";
        }
        if (i2 == 3) {
            return "SrcOver";
        }
        if (i2 == 4) {
            return "DstOver";
        }
        if (i2 == 5) {
            return "SrcIn";
        }
        if (i2 == 6) {
            return "DstIn";
        }
        if (i2 == 7) {
            return "SrcOut";
        }
        if (i2 == 8) {
            return "DstOut";
        }
        if (i2 == 9) {
            return "SrcAtop";
        }
        if (i2 == 10) {
            return "DstAtop";
        }
        if (i2 == 11) {
            return "Xor";
        }
        if (i2 == 12) {
            return "Plus";
        }
        if (i2 == 13) {
            return "Modulate";
        }
        if (i2 == 14) {
            return "Screen";
        }
        if (i2 == 15) {
            return "Overlay";
        }
        if (i2 == 16) {
            return "Darken";
        }
        if (i2 == 17) {
            return "Lighten";
        }
        if (i2 == 18) {
            return "ColorDodge";
        }
        if (i2 == 19) {
            return "ColorBurn";
        }
        if (i2 == 20) {
            return "HardLight";
        }
        if (i2 == 21) {
            return "Softlight";
        }
        if (i2 == 22) {
            return "Difference";
        }
        if (i2 == 23) {
            return "Exclusion";
        }
        if (i2 == 24) {
            return "Multiply";
        }
        if (i2 == 25) {
            return "Hue";
        }
        if (i2 == 26) {
            return "Saturation";
        }
        if (i2 == 27) {
            return "Color";
        }
        if (i2 == 28) {
            return "Luminosity";
        }
        return "Unknown";
    }

    public static void M(View view, float[] fArr, float[] fArr2, int[] iArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            M((View) parent, fArr, fArr2, iArr);
            we.d(fArr, -((float) view.getScrollX()), -((float) view.getScrollY()), fArr2);
            we.d(fArr, (float) view.getLeft(), (float) view.getTop(), fArr2);
        } else {
            view.getLocationInWindow(iArr);
            we.d(fArr, -((float) view.getScrollX()), -((float) view.getScrollY()), fArr2);
            we.d(fArr, (float) iArr[0], (float) iArr[1], fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            sg3.U(matrix, fArr2);
            we.J(fArr, fArr2);
        }
    }

    public static BiometricPrompt.CryptoObject N(ed1 ed1) {
        return null;
    }

    public static /* synthetic */ void a(int i2) {
        String str;
        int i3;
        Throwable th;
        if (i2 != 18) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i2 != 18) {
            i3 = 3;
        } else {
            i3 = 2;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
            case 7:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case h75.g:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
            default:
                objArr[0] = "name";
                break;
        }
        if (i2 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i2) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 14:
            case h75.g:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        if (i2 != 18) {
            th = new IllegalArgumentException(format);
        } else {
            th = new IllegalStateException(format);
        }
        throw th;
    }

    public static final void b(st stVar, String str, ml4 ml4, vr2 vr2, vr2 vr22, jb jbVar, j51 j51, yt2 yt2, int i2, int i3) {
        int i4;
        vr2 vr23;
        jb jbVar2;
        int i5;
        ml4 ml42;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        st stVar2 = stVar;
        ml4 ml43 = ml4;
        j51 j512 = j51;
        yt2 yt22 = yt2;
        int i17 = i2;
        yt22.g0(-421592773);
        if ((i17 & 14) == 0) {
            if (yt22.g(stVar2)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i4 = i16 | i17;
        } else {
            i4 = i17;
        }
        String str2 = str;
        if ((i17 & 112) == 0) {
            if (yt22.g(str2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i4 |= i15;
        }
        if ((i17 & 896) == 0) {
            if (yt22.g(ml43)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i4 |= i14;
        }
        if ((i17 & 7168) == 0) {
            vr23 = vr2;
            if (yt22.i(vr23)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i4 |= i13;
        } else {
            vr23 = vr2;
        }
        if ((i17 & 57344) == 0) {
            if (yt22.i(vr22)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i4 |= i12;
        } else {
            vr2 vr24 = vr22;
        }
        if ((i17 & 458752) == 0) {
            jbVar2 = jbVar;
            if (yt22.g(jbVar2)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i4 |= i11;
        } else {
            jbVar2 = jbVar;
        }
        if ((i17 & 3670016) == 0) {
            if (yt22.g(j512)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i4 |= i10;
        }
        if ((i17 & 29360128) == 0) {
            if (yt22.d(1.0f)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i4 |= i9;
        }
        if ((234881024 & i17) == 0) {
            if (yt22.g((Object) null)) {
                i8 = 67108864;
            } else {
                i8 = 33554432;
            }
            i4 |= i8;
        }
        if ((1879048192 & i17) == 0) {
            if (yt22.e(1)) {
                i7 = 536870912;
            } else {
                i7 = 268435456;
            }
            i4 |= i7;
        }
        if ((i3 & 14) == 0) {
            if (yt22.h(true)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i5 = i3 | i6;
        } else {
            i5 = i3;
        }
        if ((1533916891 & i4) == 306783378 && (i5 & 11) == 2 && yt22.F()) {
            yt22.Y();
        } else {
            s83 b2 = k18.b(stVar2.a, j512, yt22);
            int i18 = i4 >> 6;
            int i19 = i18 & 57344;
            int i20 = i18;
            qt z2 = dh4.z(b2, stVar2.c, vr23, vr22, j512, yt22, 0);
            av6 av6 = b2.w;
            if (av6 instanceof o31) {
                ml42 = ml43.d((ml4) av6);
            } else {
                ml42 = ml43;
            }
            e(ml42, z2, str2, jbVar2, j51, yt2, ((i4 << 3) & 896) | (i20 & 7168) | i19 | (i20 & 458752) | (i20 & 3670016) | ((i5 << 21) & 29360128));
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new et(stVar2, str, ml43, vr2, vr22, jbVar, j51, i2, i3);
        }
    }

    public static ad0 c(int i2, int i3, vc0 vc0) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        int i4 = i3 & 2;
        vc0 vc02 = vc0.w;
        if (i4 != 0) {
            vc0 = vc02;
        }
        if (i2 != -2) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 == Integer.MAX_VALUE) {
                        return new ad0(Integer.MAX_VALUE, (vr2) null);
                    }
                    if (vc0 == vc02) {
                        return new ad0(i2, (vr2) null);
                    }
                    return new c11(i2, vc0, (vr2) null);
                } else if (vc0 == vc02) {
                    return new ad0(0, (vr2) null);
                } else {
                    return new c11(1, vc0, (vr2) null);
                }
            } else if (vc0 == vc02) {
                return new c11(1, vc0.x, (vr2) null);
            } else {
                h.q("CONFLATED capacity cannot be used with non-default onBufferOverflow");
                return null;
            }
        } else if (vc0 != vc02) {
            return new c11(1, vc0, (vr2) null);
        } else {
            en0.c.getClass();
            return new ad0(dn0.b, (vr2) null);
        }
    }

    public static final void d(ml4 ml4, long j2, long j3, pq6 pq6, List list, yt2 yt2, int i2) {
        int i3;
        boolean z2;
        List list2;
        pq6 pq62;
        long j4;
        long j5;
        int i4;
        List list3;
        pq6 pq63;
        long j6;
        long j7;
        yt2 yt22 = yt2;
        yt22.g0(663218740);
        if (yt22.g(ml4)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3 | 9360;
        if ((i5 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i5 & 1, z2)) {
            yt22.a0();
            if ((i2 & 1) == 0 || yt22.C()) {
                float f2 = j94.a;
                long e2 = st0.e(h03.v0, yt22);
                long e3 = st0.e(h03.u0, yt22);
                pq6 a2 = hr6.a(h03.x0, yt22);
                list3 = j94.c;
                long j8 = e3;
                i4 = i5 & -65521;
                pq63 = a2;
                j7 = e2;
                j6 = j8;
            } else {
                yt22.Y();
                j6 = j3;
                pq63 = pq6;
                list3 = list;
                i4 = i5 & -65521;
                j7 = j2;
            }
            yt22.s();
            h(ml4, j7, j6, pq63, list3, yt22, i4 & 65534);
            pq62 = pq63;
            list2 = list3;
            j4 = j6;
            j5 = j7;
        } else {
            yt2.Y();
            j5 = j2;
            j4 = j3;
            pq62 = pq6;
            list2 = list;
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new s03(ml4, j5, j4, pq62, list2, i2, 1);
        }
    }

    public static final void e(ml4 ml4, qt qtVar, String str, jb jbVar, j51 j51, yt2 yt2, int i2) {
        int i3;
        ml4 ml42;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        yt2.g0(777774312);
        if ((i2 & 14) == 0) {
            if (yt2.g(ml4)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i3 = i11 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (yt2.g(qtVar)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i3 |= i10;
        }
        if ((i2 & 896) == 0) {
            if (yt2.g(str)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        }
        if ((i2 & 7168) == 0) {
            if (yt2.g(jbVar)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        if ((57344 & i2) == 0) {
            if (yt2.g(j51)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        if ((458752 & i2) == 0) {
            if (yt2.d(1.0f)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        if ((3670016 & i2) == 0) {
            if (yt2.g((Object) null)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i3 |= i5;
        }
        if ((29360128 & i2) == 0) {
            if (yt2.h(true)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i3 |= i4;
        }
        if ((i3 & 23967451) != 4793490 || !yt2.F()) {
            qx5 qx5 = k18.b;
            if (str != null) {
                ml42 = ck6.a(ml4, false, new cb(str, 29));
            } else {
                ml42 = ml4;
            }
            ml4 d2 = we.g(ml42).d(new g51(qtVar, jbVar, j51, 1.0f));
            pf pfVar = pf.e;
            yt2.f0(544976794);
            int hashCode = Long.hashCode(yt2.T);
            ml4 E2 = gw8.E(yt2, d2);
            vf5 m2 = yt2.m();
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt2.f0(1405779621);
            yt2.i0();
            if (yt2.S) {
                yt2.l(new gt(0, vy0));
            } else {
                yt2.r0();
            }
            g75.Q(tx0.f, yt2, pfVar);
            g75.Q(tx0.e, yt2, m2);
            g75.Q(tx0.d, yt2, E2);
            ck ckVar = tx0.g;
            if (yt2.S || !sg3.e(yt2.Q(), Integer.valueOf(hashCode))) {
                yt2.o0(Integer.valueOf(hashCode));
                yt2.b(ckVar, Integer.valueOf(hashCode));
            }
            yt2.r(true);
            yt2.r(false);
            yt2.r(false);
        } else {
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new ft(ml4, qtVar, str, jbVar, j51, i2, 0);
        }
    }

    public static final xp1 f(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        vl2 a2 = wl2.a(f2);
        if (a2 == null) {
            a2 = new o64(f2);
        }
        return new xp1(f3, f2, a2);
    }

    public static final long g(int i2) {
        boolean z2;
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            bc3.a("The span value should be higher than 0");
        }
        return (long) i2;
    }

    public static final void h(ml4 ml4, long j2, long j3, pq6 pq6, List list, yt2 yt2, int i2) {
        int i3;
        boolean z2;
        float f2;
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        ml4 ml42 = ml4;
        long j4 = j2;
        pq6 pq62 = pq6;
        List list2 = list;
        yt2 yt22 = yt2;
        int i10 = i2;
        yt22.g0(-1776169461);
        if ((i10 & 6) == 0) {
            if (yt22.g(ml42)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i10;
        } else {
            i3 = i10;
        }
        if ((i10 & 48) == 0) {
            if (yt22.f(j4)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        long j5 = j3;
        if ((i10 & 384) == 0) {
            if (yt22.f(j5)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i10 & 3072) == 0) {
            if (yt22.g(pq62)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i10 & 24576) == 0) {
            if (yt22.i(list2)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((i3 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!yt22.V(i3 & 1, z2)) {
            yt22.Y();
        } else if (list2.size() > 1) {
            boolean g2 = yt22.g(list2);
            Object Q = yt22.Q();
            Object obj = ay0.a;
            if (g2 || Q == obj) {
                n74 m2 = sg3.m();
                int size = list2.size();
                int i11 = 0;
                while (i11 < size) {
                    int i12 = i11 + 1;
                    if (i12 < list2.size()) {
                        i4 = i12;
                        m2.add(new km4(((s96) list2.get(i11)).b(), ((s96) list2.get(i12)).b()));
                    } else {
                        i4 = i12;
                        m2.add(new km4(((s96) list2.get(i11)).b(), ((s96) list2.get(0)).b()));
                    }
                    i11 = i4;
                }
                Q = sg3.i(m2);
                yt22.o0(Q);
            }
            List list3 = (List) Q;
            boolean g3 = yt22.g(list2);
            Object Q2 = yt22.Q();
            if (g3 || Q2 == obj) {
                float[] fArr = new float[4];
                int size2 = list2.size();
                float f3 = 1.0f;
                int i13 = 0;
                f2 = 0.0f;
                while (i13 < size2) {
                    int i14 = size2;
                    s96 s96 = (s96) list2.get(i13);
                    s96.a(s96, fArr, 2);
                    n74 n74 = s96.d;
                    float[] fArr2 = fArr;
                    float f4 = s96.c;
                    float f5 = s96.b;
                    int f6 = n74.f();
                    float f7 = f4;
                    float f8 = 0.0f;
                    int i15 = 0;
                    while (i15 < f6) {
                        qc1 qc1 = (qc1) n74.get(i15);
                        int i16 = f6;
                        float[] fArr3 = qc1.a;
                        float f9 = fArr3[0] - f5;
                        float f10 = fArr3[1] - f7;
                        float f11 = j18.b;
                        float f12 = (f10 * f10) + (f9 * f9);
                        n74 n742 = n74;
                        long c2 = qc1.c(0.5f);
                        float r2 = jb5.r(c2) - f5;
                        float s2 = jb5.s(c2) - f7;
                        f8 = Math.max(f8, Math.max(f12, (s2 * s2) + (r2 * r2)));
                        i15++;
                        f6 = i16;
                        n74 = n742;
                    }
                    float sqrt = (float) Math.sqrt((double) f8);
                    float[] fArr4 = {f5 - sqrt, f7 - sqrt, f5 + sqrt, f7 + sqrt};
                    f3 = Math.min(f3, Math.max((fArr2[2] - fArr2[0]) / (fArr4[2] - fArr4[0]), (fArr2[3] - fArr2[1]) / (fArr4[3] - fArr4[1])));
                    i13++;
                    long j6 = j3;
                    int i17 = i2;
                    fArr = fArr2;
                    size2 = i14;
                }
                Q2 = Float.valueOf(f3 * j94.d);
                yt22.o0(Q2);
            } else {
                f2 = 0.0f;
            }
            float floatValue = ((Number) Q2).floatValue();
            Object Q3 = yt22.Q();
            if (Q3 == obj) {
                Q3 = ed1.a(f2);
                yt22.o0(Q3);
            }
            uj ujVar = (uj) Q3;
            Object Q4 = yt22.Q();
            if (Q4 == obj) {
                Q4 = new ad5(90.0f);
                yt22.o0(Q4);
            }
            ad5 ad5 = (ad5) Q4;
            Object Q5 = yt22.Q();
            if (Q5 == obj) {
                Q5 = ed1.a(f2);
                yt22.o0(Q5);
            }
            uj ujVar2 = (uj) Q5;
            boolean g4 = yt22.g(list2);
            Object Q6 = yt22.Q();
            if (g4 || Q6 == obj) {
                Q6 = new bd5(0);
                yt22.o0(Q6);
            }
            bd5 bd5 = (bd5) Q6;
            boolean i18 = yt22.i(ujVar) | yt22.g(bd5) | yt22.i(list3) | yt22.i(ujVar2);
            Object Q7 = yt22.Q();
            if (i18 || Q7 == obj) {
                Q7 = new m94(ujVar, list3, bd5, ad5, ujVar2, (f61) null);
                yt22.o0(Q7);
            }
            t49.h((gs2) Q7, yt22, list2);
            Object Q8 = yt22.Q();
            if (Q8 == obj) {
                Q8 = gh.a();
                yt22.o0(Q8);
            }
            eh ehVar = (eh) Q8;
            Object Q9 = yt22.Q();
            if (Q9 == obj) {
                eh4 eh4 = new eh4(eh4.a());
                yt22.o0(eh4);
                Q9 = eh4;
            }
            float[] fArr5 = ((eh4) Q9).a;
            ml4 h2 = b96.h(we.f(yu6.m(ck6.a(ml42, true, new ot4(27)), j94.a, j94.b).d(yu6.c), pq62), j4, gr8.h);
            lh4 d2 = mb0.d(xb4.C, false);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m3 = yt22.m();
            ml4 E2 = gw8.E(yt22, h2);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            int i19 = hashCode;
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, d2);
            g75.Q(tx0.e, yt22, m3);
            g75.Q(tx0.g, yt22, Integer.valueOf(i19));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E2);
            ml4 i20 = uq3.i(jl4.w, 1.0f, true);
            boolean i21 = yt22.i(ujVar) | yt22.i(ujVar2) | yt22.i(list3) | yt22.g(bd5) | yt22.i(ehVar) | yt22.d(floatValue) | yt22.i(fArr5);
            if ((i3 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z4 = i21 | z3;
            Object Q10 = yt22.Q();
            if (z4 || Q10 == obj) {
                List list4 = list3;
                ad5 ad52 = ad5;
                uj ujVar3 = ujVar2;
                k94 k94 = new k94(ujVar, ujVar3, ad52, list4, ehVar, floatValue, fArr5, j3, bd5);
                yt22.o0(k94);
                Q10 = k94;
            }
            k75.a(yt22, pv8.z(i20, (vr2) Q10));
            yt22.r(true);
        } else {
            h.q("indicatorPolygons should have, at least, two RoundedPolygons");
            return;
        }
        yx5 v2 = yt22.v();
        if (v2 != null) {
            v2.d = new l94(ml4, j2, j3, pq62, list, i2, 0);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: gs2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: gs2} */
    /* JADX WARNING: type inference failed for: r16v2, types: [f61] */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x051b, code lost:
        if (r0.g(r8) == false) goto L_0x0520;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x053f, code lost:
        if (r0.g(r10) == false) goto L_0x0544;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x055a, code lost:
        if (r0.g(r14) == false) goto L_0x055f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0561, code lost:
        if ((r23 & 196608) != r6) goto L_0x0564;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0563, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0564, code lost:
        r4 = r4 | r7;
        r6 = r0.Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0569, code lost:
        if (r4 != false) goto L_0x056d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x056b, code lost:
        if (r6 != r5) goto L_0x0570;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0570, code lost:
        r14 = r5;
        r2 = r23;
        r12 = r28;
        r15 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0578, code lost:
        r7 = r8;
        r8 = r9;
        r9 = r10;
        r6 = r12;
        r10 = r14;
        r12 = r28;
        r15 = r30;
        r14 = r5;
        r4 = r2;
        r2 = r23;
        r3 = new defpackage.vt4(r4, r3, r6, r7, r8, r9, r10);
        r0.o0(r3);
        r6 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x058e, code lost:
        r6 = (defpackage.vr2) r6;
        r3 = (r0.g(r6) | r0.d(r12)) | r0.i(r11);
        r4 = r0.Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x05a2, code lost:
        if (r3 != false) goto L_0x05a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x05a4, code lost:
        if (r4 != r14) goto L_0x05a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x05a7, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x05a9, code lost:
        r3 = 1;
        r4 = new defpackage.ny1(r6, r12, 1);
        r0.o0(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x05b2, code lost:
        r5 = (defpackage.vr2) r4;
        r4 = r0.Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x05b9, code lost:
        if (r4 != r14) goto L_0x05c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x05bb, code lost:
        r4 = new defpackage.ot4(r3);
        r0.o0(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x05c3, code lost:
        r12 = r35;
        r9 = r0;
        defpackage.fd1.c(r13, r38, r5, r39, (defpackage.vr2) r4, defpackage.su0.J(-1167420988, new defpackage.wt4(r13, r12, r1), r0), r9, (((r2 >> 3) & 112) | 221184) | (r2 & 7168));
        r0 = r9.g(r13) | r9.i(r15);
        r1 = r9.Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05f6, code lost:
        if (r0 != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x05f8, code lost:
        if (r1 != r14) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05fd, code lost:
        r4 = r12;
        r12 = r1;
        r1 = r4;
        r7 = r11;
        r4 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0603, code lost:
        r16 = r11;
        r4 = r14;
        r1 = r12;
        r12 = new defpackage.ii3((java.lang.Object) r13, (java.lang.Object) r27, (java.lang.Object) r15, (defpackage.f61) r16, 7);
        r7 = r16;
        r9.o0(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0616, code lost:
        defpackage.t49.h((defpackage.gs2) r12, r9, r13);
        r0 = r1.size() - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0621, code lost:
        if (r0 < 0) goto L_0x0668;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0627, code lost:
        if (r1.get(r0) != null) goto L_0x0658;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0629, code lost:
        r0 = r9.Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x062d, code lost:
        if (r0 != r4) goto L_0x0636;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x062f, code lost:
        r0 = defpackage.t49.D(r9);
        r9.o0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0636, code lost:
        r0 = (defpackage.o81) r0;
        r9.c0(43488003, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0646, code lost:
        if (defpackage.sg3.e(defpackage.dt0.y0(r29), r7) == false) goto L_0x064b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0648, code lost:
        r0 = defpackage.k54.A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x064b, code lost:
        r0 = defpackage.k54.z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x064d, code lost:
        defpackage.o55.p(r0, r9);
        defpackage.ha4.a.getClass();
        r0 = defpackage.hg6.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0657, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0658, code lost:
        defpackage.ku4.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x065b, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x030b A[LOOP:3: B:152:0x0305->B:154:0x030b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x041f  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0444  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x044c  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x04b8  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0515  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x051e  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0526  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0539  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0542  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x054a  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0554  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x055d  */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static final void i(ig6 ig6, bw4 bw4, ml4 ml4, jb jbVar, vr2 vr2, vr2 vr22, gs2 gs2, yt2 yt2, int i2) {
        int i3;
        boolean z2;
        yt2 yt22;
        boolean z3;
        boolean z4;
        float f2;
        int i4;
        boolean z5;
        Object Q;
        ay6 ay6;
        Object Q2;
        gp4 gp4;
        pk pkVar;
        int b2;
        float f3;
        float f4;
        float f5;
        ArrayList arrayList;
        Object Q3;
        yx6 yx6;
        boolean i5;
        float f6;
        Object Q4;
        ay6 ay62;
        boolean g2;
        Object Q5;
        yx6 yx62;
        gp4 gp42;
        ArrayList arrayList2;
        eg6 eg6;
        mm7 mm7;
        Throwable th;
        boolean z6;
        int i6;
        boolean z7;
        gs2 gs22;
        boolean z8;
        vr2 vr23;
        vr2 vr24;
        eg6 eg62;
        Throwable th2;
        eg6 eg63;
        Iterator it;
        boolean e2;
        int size;
        int i7;
        Set set;
        Object obj;
        Object obj2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ig6 ig62 = ig6;
        bw4 bw42 = bw4;
        vr2 vr25 = vr2;
        vr2 vr26 = vr22;
        gs2 gs23 = gs2;
        yt2 yt23 = yt2;
        int i16 = i2;
        yt23.g0(-303833701);
        if ((i16 & 6) == 0) {
            if (yt23.g(ig62)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i3 = i15 | i16;
        } else {
            i3 = i16;
        }
        if ((i16 & 48) == 0) {
            if (yt23.g(bw42)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i3 |= i14;
        }
        ml4 ml42 = ml4;
        if ((i16 & 384) == 0) {
            if (yt23.g(ml42)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i3 |= i13;
        }
        jb jbVar2 = jbVar;
        if ((i16 & 3072) == 0) {
            if (yt23.g(jbVar2)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i3 |= i12;
        }
        if ((i16 & 24576) == 0) {
            if (yt23.i((Object) null)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i3 |= i11;
        }
        if ((i16 & 196608) == 0) {
            if (yt23.i(vr25)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i3 |= i10;
        }
        if ((i16 & 1572864) == 0) {
            if (yt23.i(vr26)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        if ((i16 & 12582912) == 0) {
            if (yt23.i(gs23)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i3 |= i8;
        }
        if ((4793491 & i3) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt23.V(i3 & 1, z2)) {
            yt23.a0();
            if ((i16 & 1) != 0 && !yt23.C()) {
                yt23.Y();
            }
            yt23.s();
            eg6 eg64 = ig62.c;
            ArrayList<cu4> arrayList3 = ig62.a;
            Object Q6 = yt23.Q();
            Object obj3 = ay0.a;
            if (Q6 == obj3) {
                Q6 = new oi6(eg64);
                yt23.o0(Q6);
            }
            oi6 oi6 = (oi6) Q6;
            mm7 K0 = rc9.K0(oi6, "scene", yt23, 56);
            in8 in8 = K0.a;
            int i17 = i3;
            ed5 ed5 = K0.d;
            boolean g3 = yt23.g((eg6) in8.H0());
            Object Q7 = yt23.Q();
            if (g3 || Q7 == obj3) {
                Q7 = dt0.b1(arrayList3);
                yt23.o0(Q7);
            }
            List<cu4> list = (List) Q7;
            in8 in82 = in8;
            eg6 eg65 = (eg6) dt0.H0(ig62.d);
            ew4 ew4 = (ew4) bw42.a.getValue();
            boolean z9 = ew4 instanceof dw4;
            if (!z9 || eg65 == null) {
                z3 = z9;
                z4 = false;
            } else {
                z3 = z9;
                z4 = true;
            }
            boolean z10 = ew4 instanceof cw4;
            ew4 ew42 = ew4;
            if (z10) {
                f2 = 0.0f;
            } else if (z3) {
                f2 = ((dw4) ew42).a.b;
            } else {
                h.c();
                return;
            }
            if (z10) {
                i4 = 2;
            } else if (z3) {
                i4 = ((dw4) ew42).a.a;
            } else {
                h.c();
                return;
            }
            ArrayList arrayList4 = new ArrayList(et0.e0(list, 10));
            for (cu4 cu4 : list) {
                arrayList4.add(cu4.b);
            }
            ArrayList arrayList5 = new ArrayList(et0.e0(arrayList3, 10));
            for (cu4 cu42 : arrayList3) {
                arrayList5.add(cu42.b);
            }
            if (sg3.e(dt0.w0(arrayList4), dt0.w0(arrayList5)) && arrayList5.size() <= arrayList4.size()) {
                Iterator it2 = sg3.v(arrayList5).iterator();
                while (true) {
                    if (!((qe3) it2).y) {
                        obj2 = null;
                        break;
                    }
                    obj2 = ((je3) it2).next();
                    int intValue = ((Number) obj2).intValue();
                    Iterator it3 = it2;
                    if (!sg3.e(arrayList5.get(intValue), arrayList4.get(intValue))) {
                        break;
                    }
                    it2 = it3;
                }
                if (((Integer) obj2) == null && arrayList5.size() != arrayList4.size()) {
                    z5 = true;
                    Q = yt23.Q();
                    if (Q == obj3) {
                        Q = new ay6();
                        yt23.o0(Q);
                    }
                    ay6 = (ay6) Q;
                    Q2 = yt23.Q();
                    if (Q2 == obj3) {
                        int i18 = s25.a;
                        Q2 = new gp4(6);
                        yt23.o0(Q2);
                    }
                    gp4 = (gp4) Q2;
                    pk pkVar2 = new pk((eg6) in82.H0());
                    boolean z11 = z5;
                    pkVar = new pk((eg6) ed5.getValue());
                    b2 = gp4.b(pkVar2);
                    if (b2 < 0) {
                        f3 = gp4.c[b2];
                    } else {
                        f3 = 0.0f;
                        gp4.f(pkVar2, 0.0f);
                    }
                    f4 = f3;
                    if (z4 && sg3.e(ed5.getValue(), eg64) && gp4.b(pkVar) < 0) {
                        f5 = gp4.c(pkVar);
                    } else if (pkVar2.equals(pkVar)) {
                        f5 = f4;
                    } else if (z11 || z4) {
                        f5 = f4 - 1.0f;
                    } else {
                        f5 = f4 + 1.0f;
                    }
                    ay6.put(pkVar, ed5.getValue());
                    ox6 ox6 = ay6.x;
                    gp4.f(pkVar, f5);
                    arrayList = ig62.b;
                    Q3 = yt23.Q();
                    if (Q3 == obj3) {
                        Q3 = new yx6();
                        yt23.o0(Q3);
                    }
                    yx6 = (yx6) Q3;
                    i5 = yt23.i(arrayList);
                    f6 = f5;
                    Q4 = yt23.Q();
                    if (!i5 || Q4 == obj3) {
                        ay62 = ay6;
                        Q4 = new tc1(arrayList, yx6, (f61) null, 12);
                        yt23.o0(Q4);
                    } else {
                        ay62 = ay6;
                    }
                    t49.h((gs2) Q4, yt23, arrayList);
                    List b1 = dt0.b1(ox6);
                    yx6.getClass();
                    g2 = yt23.g(b1) | yt23.g(w(yx6).c) | yt23.g(gp4.toString());
                    Q5 = yt23.Q();
                    if (!g2 || Q5 == obj3) {
                        ze4 ze4 = new ze4();
                        ArrayList arrayList6 = new ArrayList();
                        arrayList2 = arrayList;
                        List<Map.Entry> U0 = dt0.U0(ox6, new la2(3, gp4));
                        gp42 = gp4;
                        ArrayList arrayList7 = new ArrayList(et0.e0(U0, 10));
                        for (Map.Entry value : U0) {
                            arrayList7.add((eg6) value.getValue());
                        }
                        it = arrayList7.iterator();
                        while (it.hasNext()) {
                            eg6 eg66 = (eg6) it.next();
                            if (!arrayList6.contains(eg66)) {
                                arrayList6.add(eg66);
                            }
                        }
                        ArrayList M0 = dt0.M0(yx6, arrayList6);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        e2 = sg3.e(ed5.getValue(), dt0.w0(arrayList6));
                        size = M0.size();
                        i7 = 0;
                        while (i7 < size) {
                            boolean z12 = e2;
                            eg6 eg67 = (eg6) M0.get(i7);
                            ArrayList arrayList8 = M0;
                            List<cu4> c2 = eg67.c();
                            int i19 = size;
                            yx6 yx63 = yx6;
                            int i20 = i7;
                            ArrayList arrayList9 = new ArrayList(et0.e0(c2, 10));
                            for (cu4 cu43 : c2) {
                                arrayList9.add(cu43.b);
                            }
                            ArrayList arrayList10 = new ArrayList();
                            Iterator it4 = arrayList9.iterator();
                            while (it4.hasNext()) {
                                Object next = it4.next();
                                if (!linkedHashSet.contains(next)) {
                                    arrayList10.add(next);
                                }
                            }
                            Set g1 = dt0.g1(arrayList10);
                            if (z12 || sg3.e(ed5.getValue(), eg67)) {
                                set = g1;
                                obj = ze4.put(new pk(eg67), dt0.f1(linkedHashSet));
                            } else {
                                pk pkVar3 = new pk(eg67);
                                List<cu4> c3 = ((eg6) ed5.getValue()).c();
                                set = g1;
                                ArrayList arrayList11 = new ArrayList(et0.e0(c3, 10));
                                for (cu4 cu44 : c3) {
                                    arrayList11.add(cu44.b);
                                }
                                obj = ze4.put(pkVar3, dt0.g1(arrayList11));
                            }
                            Set set2 = (Set) obj;
                            linkedHashSet.addAll(set);
                            i7 = i20 + 1;
                            M0 = arrayList8;
                            e2 = z12;
                            size = i19;
                            yx6 = yx63;
                        }
                        yx62 = yx6;
                        if (!e2) {
                            ze4.put(new pk((eg6) ed5.getValue()), g42.w);
                        }
                        Q5 = ze4.b();
                        yt23.o0(Q5);
                    } else {
                        yx62 = yx6;
                        gp42 = gp4;
                        arrayList2 = arrayList;
                    }
                    Map map = (Map) Q5;
                    if (f4 < f6) {
                        eg6 = (eg6) in82.H0();
                    } else {
                        eg6 = (eg6) ed5.getValue();
                    }
                    if (!z4) {
                        yt23.e0(-2006245323);
                        if (!sg3.e(in82.H0(), eg65)) {
                            yt23.e0(-2006191693);
                            Float valueOf = Float.valueOf(f2);
                            boolean i21 = yt23.i(oi6) | yt23.d(f2) | yt23.g(eg65);
                            Object Q8 = yt23.Q();
                            if (i21 || Q8 == obj3) {
                                eg6 eg68 = eg65;
                                i6 = 131072;
                                th2 = null;
                                Object xt4 = new xt4(oi6, f2, eg68, (f61) null, 0);
                                eg63 = eg68;
                                yt23.o0(xt4);
                                Q8 = xt4;
                            } else {
                                eg63 = eg65;
                                i6 = 131072;
                                th2 = null;
                            }
                            t49.j(eg63, valueOf, (gs2) Q8, yt23);
                            z6 = false;
                            yt23.r(false);
                        } else {
                            i6 = 131072;
                            z6 = false;
                            th2 = null;
                            yt23.e0(-2005987961);
                            yt23.r(false);
                        }
                        yt23.r(z6);
                        mm7 = K0;
                        th = th2;
                    } else {
                        oi6 oi62 = oi6;
                        i6 = 131072;
                        yt23.e0(-2005910120);
                        boolean i22 = yt23.i(oi62) | yt23.g(eg64) | yt23.g(K0);
                        Object Q9 = yt23.Q();
                        if (i22 || Q9 == obj3) {
                            mm7 mm72 = K0;
                            eg6 eg69 = eg64;
                            Object ngVar = new ng((Object) oi62, (Object) eg69, (Object) mm72, (f61) null, 11);
                            eg62 = eg69;
                            mm7 = mm72;
                            th = null;
                            yt23.o0(ngVar);
                            Q9 = ngVar;
                        } else {
                            mm7 = K0;
                            eg62 = eg64;
                            th = null;
                        }
                        t49.h((gs2) Q9, yt23, eg62);
                        z6 = false;
                        yt23.r(false);
                    }
                    boolean h2 = yt23.h(z4) | yt23.g(eg6) | yt23.e(i4);
                    if (((i17 & 29360128) ^ 12582912) <= 8388608) {
                        gs22 = gs2;
                    } else {
                        gs22 = gs2;
                    }
                    if ((i17 & 12582912) != 8388608) {
                        z7 = z6;
                        boolean z13 = h2 | z7;
                        boolean z14 = z11;
                        boolean h3 = z13 | yt23.h(z14);
                        if (((i17 & 3670016) ^ 1572864) > 1048576) {
                            vr23 = vr22;
                        } else {
                            vr23 = vr22;
                        }
                        if ((i17 & 1572864) != 1048576) {
                            z8 = z6;
                            boolean z15 = h3 | z8;
                            if (((i17 & 458752) ^ 196608) <= i6) {
                                vr24 = vr2;
                            } else {
                                vr24 = vr2;
                            }
                        }
                        z8 = true;
                        boolean z152 = h3 | z8;
                        if (((i17 & 458752) ^ 196608) <= i6) {
                        }
                    }
                    z7 = true;
                    boolean z132 = h2 | z7;
                    boolean z142 = z11;
                    boolean h32 = z132 | yt23.h(z142);
                    if (((i17 & 3670016) ^ 1572864) > 1048576) {
                    }
                    if ((i17 & 1572864) != 1048576) {
                    }
                    z8 = true;
                    boolean z1522 = h32 | z8;
                    if (((i17 & 458752) ^ 196608) <= i6) {
                    }
                }
            }
            z5 = false;
            Q = yt23.Q();
            if (Q == obj3) {
            }
            ay6 = (ay6) Q;
            Q2 = yt23.Q();
            if (Q2 == obj3) {
            }
            gp4 = (gp4) Q2;
            pk pkVar22 = new pk((eg6) in82.H0());
            boolean z112 = z5;
            pkVar = new pk((eg6) ed5.getValue());
            b2 = gp4.b(pkVar22);
            if (b2 < 0) {
            }
            f4 = f3;
            if (z4 && sg3.e(ed5.getValue(), eg64) && gp4.b(pkVar) < 0) {
            }
            ay6.put(pkVar, ed5.getValue());
            ox6 ox62 = ay6.x;
            gp4.f(pkVar, f5);
            arrayList = ig62.b;
            Q3 = yt23.Q();
            if (Q3 == obj3) {
            }
            yx6 = (yx6) Q3;
            i5 = yt23.i(arrayList);
            f6 = f5;
            Q4 = yt23.Q();
            if (!i5) {
            }
            ay62 = ay6;
            Q4 = new tc1(arrayList, yx6, (f61) null, 12);
            yt23.o0(Q4);
            t49.h((gs2) Q4, yt23, arrayList);
            List b12 = dt0.b1(ox62);
            yx6.getClass();
            g2 = yt23.g(b12) | yt23.g(w(yx6).c) | yt23.g(gp4.toString());
            Q5 = yt23.Q();
            if (!g2) {
            }
            ze4 ze42 = new ze4();
            ArrayList arrayList62 = new ArrayList();
            arrayList2 = arrayList;
            List<Map.Entry> U02 = dt0.U0(ox62, new la2(3, gp4));
            gp42 = gp4;
            ArrayList arrayList72 = new ArrayList(et0.e0(U02, 10));
            while (r9.hasNext()) {
            }
            it = arrayList72.iterator();
            while (it.hasNext()) {
            }
            ArrayList M02 = dt0.M0(yx6, arrayList62);
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            e2 = sg3.e(ed5.getValue(), dt0.w0(arrayList62));
            size = M02.size();
            i7 = 0;
            while (i7 < size) {
            }
            yx62 = yx6;
            if (!e2) {
            }
            Q5 = ze42.b();
            yt23.o0(Q5);
            Map map2 = (Map) Q5;
            if (f4 < f6) {
            }
            if (!z4) {
            }
            boolean h22 = yt23.h(z4) | yt23.g(eg6) | yt23.e(i4);
            if (((i17 & 29360128) ^ 12582912) <= 8388608) {
            }
            if ((i17 & 12582912) != 8388608) {
            }
            z7 = true;
            boolean z1322 = h22 | z7;
            boolean z1422 = z112;
            boolean h322 = z1322 | yt23.h(z1422);
            if (((i17 & 3670016) ^ 1572864) > 1048576) {
            }
            if ((i17 & 1572864) != 1048576) {
            }
            z8 = true;
            boolean z15222 = h322 | z8;
            if (((i17 & 458752) ^ 196608) <= i6) {
            }
        } else {
            yt22 = yt23;
            yt22.Y();
        }
        yx5 v2 = yt22.v();
        if (v2 != null) {
            v2.d = new iu1(ig6, bw4, ml4, jbVar, vr2, vr22, gs2, i2, 1);
        }
    }

    public static final void j(ArrayList arrayList, ml4 ml4, jb jbVar, List list, List list2, vr2 vr2, vr2 vr22, gs2 gs2, sr2 sr2, yt2 yt2, int i2, int i3) {
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        bw4 bw4;
        boolean z3;
        List list3;
        ts2 ts2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        ArrayList arrayList2 = arrayList;
        List list4 = list;
        List list5 = list2;
        sr2 sr22 = sr2;
        yt2 yt22 = yt2;
        int i19 = i2;
        yt22.g0(-1914095277);
        if ((i19 & 6) == 0) {
            if (yt22.i(arrayList2)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i4 = i18 | i19;
        } else {
            i4 = i19;
        }
        if ((i19 & 48) == 0) {
            if (yt22.g(ml4)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i4 |= i17;
        } else {
            ml4 ml42 = ml4;
        }
        if ((i19 & 384) == 0) {
            if (yt22.g(jbVar)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i4 |= i16;
        } else {
            jb jbVar2 = jbVar;
        }
        if ((i19 & 3072) == 0) {
            if (yt22.i(list4)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i4 |= i15;
        }
        if ((i19 & 24576) == 0) {
            if (yt22.i(list5)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i4 |= i14;
        }
        if ((196608 & i19) == 0) {
            if (yt22.g((Object) null)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i4 |= i13;
        }
        if ((1572864 & i19) == 0) {
            if (yt22.i((Object) null)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i4 |= i12;
        }
        if ((12582912 & i19) == 0) {
            if (yt22.i(vr2)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i4 |= i11;
        } else {
            vr2 vr23 = vr2;
        }
        if ((100663296 & i19) == 0) {
            if (yt22.i(vr22)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i4 |= i10;
        } else {
            vr2 vr24 = vr22;
        }
        if ((805306368 & i19) == 0) {
            if (yt22.i(gs2)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i4 |= i9;
        } else {
            gs2 gs22 = gs2;
        }
        if ((i3 & 6) == 0) {
            if (yt22.i(sr22)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i5 = i3 | i8;
        } else {
            i5 = i3;
        }
        if ((i4 & 306783379) == 306783378 && (i5 & 3) == 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (yt22.V(i4 & 1, z2)) {
            yt22.a0();
            if ((i19 & 1) != 0 && !yt22.C()) {
                yt22.Y();
            }
            yt22.s();
            if (!arrayList2.isEmpty()) {
                int i20 = i4 >> 6;
                int i21 = (i20 & 896) | (i4 & 14) | (i20 & 112) | (i20 & 7168) | ((i5 << 12) & 57344);
                u55.v(sr2, yt2);
                yt22.e0(-984503628);
                yt22.r(false);
                yy0 yy0 = hg6.a;
                Object Q = yt22.Q();
                Object obj = ay0.a;
                if (Q == obj) {
                    ay6 ay6 = new ay6();
                    i7 = i4;
                    i6 = i21;
                    Q = new du4(new ay5(9, (Object) ay6), new fw0(-1714993007, new xa7(16, (Object) ay6), true));
                    yt22.o0(Q);
                } else {
                    i7 = i4;
                    i6 = i21;
                }
                ArrayList M = tf4.M(arrayList2, qs.V0(new du4[]{null, (gg6) Q, new du4(new ot4(4), su0.J(1077673004, new n30(u55.v(arrayList2, yt22), 0), yt22))}), yt22, i6 & 14);
                boolean g2 = yt22.g(dt0.b1(list4)) | yt22.g(M);
                Object Q2 = yt22.Q();
                if (g2 || Q2 == obj) {
                    ts2 ts22 = new ts2(9);
                    ArrayList I2 = sg3.I(za5.y(ts22, M, list4, list5));
                    dt0.G0(I2);
                    List t0 = dt0.t0(1, I2);
                    ArrayList arrayList3 = new ArrayList(t0.size());
                    ArrayList arrayList4 = I2;
                    int i22 = 0;
                    for (int size = t0.size(); i22 < size; size = size) {
                        eg6 eg6 = (eg6) t0.get(i22);
                        eg6.getClass();
                        arrayList3.add((e95) eg6);
                        i22++;
                    }
                    eg6 eg62 = (eg6) dt0.G0(arrayList4);
                    ArrayList I3 = sg3.I(dt0.w0(arrayList4));
                    while (true) {
                        eg6 eg63 = (eg6) dt0.y0(I3);
                        if (eg63 != null) {
                            list3 = eg63.b();
                        } else {
                            list3 = null;
                        }
                        if (list3 == null || list3.isEmpty()) {
                            ts2 = ts22;
                        } else {
                            ts2 = ts22;
                            I3.add(0, za5.y(ts22, list3, list4, list5));
                        }
                        if (list3 == null || list3.isEmpty()) {
                            I3.remove(eg62);
                            ig6 ig6 = new ig6(M, arrayList3, eg62, I3);
                            yt22.o0(ig6);
                            Q2 = ig6;
                        } else {
                            vr2 vr25 = vr2;
                            ts22 = ts2;
                        }
                    }
                    I3.remove(eg62);
                    ig6 ig62 = new ig6(M, arrayList3, eg62, I3);
                    yt22.o0(ig62);
                    Q2 = ig62;
                }
                ig6 ig63 = (ig6) Q2;
                eg6 eg64 = ig63.c;
                fg6 fg6 = new fg6(eg64);
                ArrayList arrayList5 = ig63.d;
                ArrayList arrayList6 = new ArrayList(et0.e0(arrayList5, 10));
                Iterator it = arrayList5.iterator();
                while (it.hasNext()) {
                    arrayList6.add(new fg6((eg6) it.next()));
                }
                Object Q3 = yt22.Q();
                a42 a42 = a42.w;
                if (Q3 == obj) {
                    Q3 = new bw4(fg6, arrayList6, a42);
                    yt22.o0(Q3);
                }
                bw4 bw42 = (bw4) Q3;
                boolean i23 = yt22.i(fg6) | yt22.i(arrayList6) | yt22.i(a42);
                Object Q4 = yt22.Q();
                if (i23 || Q4 == obj) {
                    Q4 = new mm0((Object) bw42, (Object) fg6, (Object) arrayList6, (Object) a42, 7);
                    bw4 = bw42;
                    yt22.o0(Q4);
                } else {
                    bw4 = bw42;
                }
                t49.l((sr2) Q4, yt22);
                boolean z4 = !eg64.b().isEmpty();
                boolean i24 = yt22.i(arrayList2) | yt22.g(eg64);
                if ((i5 & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z5 = i24 | z3;
                Object Q5 = yt22.Q();
                if (z5 || Q5 == obj) {
                    Q5 = new g20(arrayList2, eg64, sr22, 14);
                    yt22.o0(Q5);
                }
                int i25 = i20;
                pd8.c(bw4, z4, (sr2) null, (sr2) Q5, yt22, 0);
                bw4 bw43 = bw4;
                i(ig63, bw43, ml4, jbVar, vr2, vr22, gs2, yt2, ((i7 << 3) & 8064) | (i25 & 57344) | (458752 & i25) | (3670016 & i25) | (i25 & 29360128));
            } else {
                h.q("NavDisplay entries cannot be empty");
                return;
            }
        } else {
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new ut4(arrayList2, ml4, jbVar, list4, list5, vr2, vr22, gs2, sr22, i2, i3);
        }
    }

    public static final void k(List list, ml4 ml4, jb jbVar, sr2 sr2, List list2, List list3, List list4, vr2 vr2, vr2 vr22, gs2 gs2, gg0 gg0, yt2 yt2, int i2) {
        int i3;
        char c2;
        boolean z2;
        jl4 jl4;
        gs2 gs22;
        vr2 vr23;
        vr2 vr24;
        List list5;
        List list6;
        jb jbVar2;
        uz1 uz1;
        ot4 ot4;
        ot4 ot42;
        a42 a42;
        i80 i80;
        List list7;
        int i4;
        ArrayList arrayList;
        int i5;
        List<Object> list8 = list;
        gg0 gg02 = gg0;
        yt2 yt22 = yt2;
        int i6 = i2;
        yt22.g0(1398581072);
        int i7 = i6 | 8624;
        List list9 = list3;
        if (yt22.i(list9)) {
            i3 = 131072;
        } else {
            i3 = 65536;
        }
        int i8 = i7 | i3 | 383254528;
        if (yt22.i(gg02)) {
            c2 = 256;
        } else {
            c2 = 128;
        }
        char c3 = c2 | 18;
        if ((306783379 & i8) == 306783378 && (c3 & 147) == 146) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (yt22.V(i8 & 1, z2)) {
            yt22.a0();
            int i9 = i6 & 1;
            d63 d63 = ay0.a;
            if (i9 == 0 || yt22.C()) {
                i80 i802 = xb4.y;
                pe6 q2 = b85.q(yt22);
                boolean g2 = yt22.g(q2);
                Object Q = yt22.Q();
                if (g2 || Q == d63) {
                    i5 = -1879105537;
                    Q = new du4(new ay5(8, (Object) q2), new fw0(-1320822745, new xa7(15, (Object) q2), true));
                    yt22.o0(Q);
                } else {
                    i5 = -1879105537;
                }
                list7 = sg3.D((qe6) Q);
                ot4 ot43 = new ot4(2);
                i4 = i8 & i5;
                ot4 ot44 = new ot4(3);
                uz1 uz12 = new uz1(18);
                jl4 jl42 = jl4.w;
                ot42 = ot43;
                ot4 = ot44;
                uz1 = uz12;
                a42 = a42.w;
                i80 = i802;
                jl4 = jl42;
            } else {
                yt22.Y();
                i4 = i8 & -1879105537;
                jl4 = ml4;
                i80 = jbVar;
                list7 = list2;
                a42 = list4;
                ot42 = vr2;
                ot4 = vr22;
                uz1 = gs2;
            }
            yt22.s();
            if (!list8.isEmpty()) {
                boolean g3 = yt22.g(dt0.b1(list8));
                Object Q2 = yt22.Q();
                if (g3 || Q2 == d63) {
                    if (list8 instanceof RandomAccess) {
                        arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            arrayList.add((cu4) gg02.y(list8.get(i10)));
                        }
                    } else {
                        arrayList = new ArrayList(et0.e0(list8, 10));
                        for (Object y2 : list8) {
                            arrayList.add((cu4) gg02.y(y2));
                        }
                    }
                    Q2 = arrayList;
                    yt22.o0(Q2);
                }
                j(tf4.M((List) Q2, list7, yt22, 0), jl4, i80, list9, a42, ot42, ot4, uz1, sr2, yt22, ((i4 >> 6) & 7168) | 1794480, 6);
                list6 = list7;
                jbVar2 = i80;
                list5 = a42;
                vr24 = ot42;
                vr23 = ot4;
                gs22 = uz1;
            } else {
                h.q("NavDisplay backstack cannot be empty");
                return;
            }
        } else {
            yt2.Y();
            jl4 = ml4;
            jbVar2 = jbVar;
            list6 = list2;
            list5 = list4;
            vr24 = vr2;
            vr23 = vr22;
            gs22 = gs2;
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new tt4(list8, jl4, jbVar2, sr2, list6, list3, list5, vr24, vr23, gs22, gg02, i6);
        }
    }

    public static final void l(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            h.l(pb4.k("index (", i2, ") is out of bound of [0, ", i3, ")"));
        }
    }

    public static final boolean m(k37 k37, int i2, o2 o2Var, boolean z2) {
        boolean z3;
        synchronized (D) {
            try {
                int i3 = k37.d;
                if (i3 == i2) {
                    k37.c = o2Var;
                    z3 = true;
                    if (z2) {
                        k37.e++;
                    }
                    k37.d = i3 + 1;
                } else {
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public static final boolean n(ArrayList arrayList) {
        List list;
        long j2;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = a42.w;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    Object obj2 = arrayList.get(i2);
                    fk6 fk6 = (fk6) obj2;
                    fk6 fk62 = (fk6) obj;
                    arrayList2.add(new l35((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (fk62.g().b() >> 32)) - Float.intBitsToFloat((int) (fk6.g().b() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (fk62.g().b() & 4294967295L)) - Float.intBitsToFloat((int) (fk6.g().b() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j2 = ((l35) dt0.w0(list)).a;
            } else {
                if (list.isEmpty()) {
                    i84.c("Empty collection can't be reduced.");
                }
                Object w0 = dt0.w0(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i3 = 1;
                    while (true) {
                        w0 = new l35(l35.e(((l35) w0).a, ((l35) list.get(i3)).a));
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                j2 = ((l35) w0).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j2)) < Float.intBitsToFloat((int) (j2 >> 32))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final void o(long j2, long j3, long j4) {
        if (j3 < 0 || j4 > j2) {
            StringBuilder q2 = hl6.q(j3, "startIndex (", ") and endIndex (");
            q2.append(j4);
            q2.append(") are not within the range [0..size(");
            q2.append(j2);
            q2.append("))");
            throw new IndexOutOfBoundsException(q2.toString());
        } else if (j3 > j4) {
            StringBuilder q3 = hl6.q(j3, "startIndex (", ") > endIndex (");
            q3.append(j4);
            q3.append(')');
            throw new IllegalArgumentException(q3.toString());
        }
    }

    public static final void p(long j2, long j3) {
        if (0 > j2 || j2 < j3 || j3 < 0) {
            h.q(f21.k(hl6.q(j3, "offset (0) and byteCount (", ") are not within the range [0..size("), j2, "))"));
        }
    }

    public static h28 q(uq4 uq4, ql4 ql4) {
        if (uq4 == null) {
            a(19);
            throw null;
        } else if (ql4 != null) {
            Collection l2 = ql4.l();
            if (l2.size() != 1) {
                return null;
            }
            for (h28 h28 : ((wp0) l2.iterator().next()).S()) {
                if (h28.getName().equals(uq4)) {
                    return h28;
                }
            }
            return null;
        } else {
            a(20);
            throw null;
        }
    }

    public static final float r(Layout layout, int i2, Paint paint) {
        int i3;
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i2);
        ThreadLocal threadLocal = dg7.a;
        if (layout.getEllipsisCount(i2) <= 0 || layout.getParagraphDirection(i2) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        int lineStart = layout.getLineStart(i2);
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + lineStart) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if (paragraphAlignment == null) {
            i3 = -1;
        } else {
            i3 = ia3.a[paragraphAlignment.ordinal()];
        }
        if (i3 == 1) {
            abs = Math.abs(lineLeft);
            width = (((float) layout.getWidth()) - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = ((float) layout.getWidth()) - measureText;
        }
        return width + abs;
    }

    public static final float s(Layout layout, int i2, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = dg7.a;
        if (layout.getEllipsisCount(i2) <= 0) {
            return 0.0f;
        }
        int i3 = -1;
        if (layout.getParagraphDirection(i2) != -1 || ((float) layout.getWidth()) >= layout.getLineRight(i2)) {
            return 0.0f;
        }
        float primaryHorizontal = layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2));
        float measureText = paint.measureText("…") + (layout.getLineRight(i2) - primaryHorizontal);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if (paragraphAlignment != null) {
            i3 = ia3.a[paragraphAlignment.ordinal()];
        }
        if (i3 == 1) {
            width = ((float) layout.getWidth()) - layout.getLineRight(i2);
            width2 = (((float) layout.getWidth()) - measureText) / 2.0f;
        } else {
            width = ((float) layout.getWidth()) - layout.getLineRight(i2);
            width2 = ((float) layout.getWidth()) - measureText;
        }
        return width - width2;
    }

    public static final String t(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: as3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: as3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: as3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: as3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: as3} */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final gq3 u(vq3 vq3) {
        oq3 oq3;
        if (vq3 instanceof gq3) {
            return (gq3) vq3;
        }
        as3 as3 = null;
        if (vq3 instanceof cs3) {
            List upperBounds = ((cs3) vq3).getUpperBounds();
            Iterator it = upperBounds.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                vq3 J = next.J();
                if (J instanceof oq3) {
                    oq3 = (oq3) J;
                } else {
                    oq3 = null;
                }
                if (oq3 != null && oq3.b0() != hq0.y && oq3.b0() != hq0.B) {
                    as3 = next;
                    break;
                }
            }
            as3 as32 = as3;
            if (as32 == null) {
                as32 = dt0.y0(upperBounds);
            }
            if (as32 != null) {
                return v(as32);
            }
            return b26.a.b(Object.class);
        }
        rf2.x("Cannot calculate JVM erasure for type: ", vq3);
        return null;
    }

    public static final gq3 v(as3 as3) {
        gq3 u2;
        as3.getClass();
        vq3 J = as3.J();
        if (J != null && (u2 = u(J)) != null) {
            return u2;
        }
        rf2.x("Cannot calculate JVM erasure for type: ", as3);
        return null;
    }

    public static final k37 w(yx6 yx6) {
        k37 k37 = yx6.w;
        k37.getClass();
        return (k37) nx6.t(k37, yx6);
    }

    public static final int x(yx6 yx6) {
        k37 k37 = yx6.w;
        k37.getClass();
        return ((k37) nx6.h(k37)).e;
    }

    public static boolean y(uo7 uo7, v76 v76, o85 o85) {
        to7 to7;
        to7 to72 = to7.f;
        uo7.getClass();
        v76.getClass();
        eq7 eq7 = uo7.c;
        if ((eq7.w(v76) && !eq7.y0(v76)) || eq7.K(v76)) {
            return true;
        }
        uo7.b();
        ArrayDeque arrayDeque = uo7.g;
        arrayDeque.getClass();
        wv6 wv6 = uo7.h;
        wv6.getClass();
        arrayDeque.push(v76);
        while (!arrayDeque.isEmpty()) {
            v76 v762 = (v76) arrayDeque.pop();
            v762.getClass();
            if (wv6.add(v762)) {
                if (eq7.y0(v762)) {
                    to7 = to72;
                } else {
                    to7 = o85;
                }
                if (to7.equals(to72)) {
                    to7 = null;
                }
                if (to7 == null) {
                    continue;
                } else {
                    for (zw3 x2 : eq7.D(eq7.F(v762))) {
                        v76 x3 = to7.x(uo7, x2);
                        if ((!eq7.w(x3) || eq7.y0(x3)) && !eq7.K(x3)) {
                            arrayDeque.add(x3);
                        } else {
                            uo7.a();
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        uo7.a();
        return false;
    }

    public static boolean z(uo7 uo7, v76 v76, xo7 xo7) {
        eq7 eq7 = uo7.c;
        if (eq7.v(v76)) {
            return true;
        }
        if (eq7.y0(v76)) {
            return false;
        }
        if (uo7.b) {
            eq7.T(v76);
        }
        return eq7.c0(eq7.F(v76), xo7);
    }
}
