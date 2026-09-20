package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityManager;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: b96  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class b96 {
    public static x83 A;
    public static x83 B;
    public static final fw0 a = new fw0(-985649662, new tw0(17), false);
    public static final fw0 b = new fw0(-354318100, new sw0(14), false);
    public static final int[] c = {0, 4, 1, 5};
    public static final int[] d = {6, 2, 7, 3};
    public static final int[] e = {8, 1, 1, 1, 1, 1, 1, 3};
    public static final int[] f = {7, 1, 1, 3, 1, 1, 1, 2, 1};
    public static final wh g = new wh(5);
    public static final rt0 h;
    public static final rt0 i = rt0.L;
    public static final float j = 56.0f;
    public static final vq6 k = vq6.y;
    public static final rt0 l;
    public static final vq6 m = vq6.A;
    public static final float n = 360.0f;
    public static final rt0 o;
    public static final rt0 p;
    public static final rt0 q = rt0.M;
    public static final ot4 r = new ot4(25);
    public static final ow0 s = new ow0(2);
    public static final ha7 t = new ha7(1);
    public static final String[] u = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "customer_type", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};
    public static final String[] v = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_ct", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};
    public static final String[] w = {"items"};
    public static final String[] x = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "_ct", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};
    public static x83 y;
    public static x83 z;

    static {
        rt0 rt0 = rt0.C;
        h = rt0;
        l = rt0;
        rt0 rt02 = rt0.E;
        o = rt02;
        p = rt02;
    }

    public static Intent A(yn ynVar) {
        Intent parentActivityIntent = ynVar.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String C = C(ynVar, ynVar.getComponentName());
            if (C == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(ynVar, C);
            try {
                if (C(ynVar, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + C + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent B(Context context, ComponentName componentName) {
        String C = C(context, componentName);
        if (C == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), C);
        if (C(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String C(Context context, ComponentName componentName) {
        int i2;
        String string;
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 29) {
            i2 = 269222528;
        } else {
            i2 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i2);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final fd4 D(fd4 fd4) {
        uy3 uy3;
        uy3 uy32 = fd4.O.O;
        while (true) {
            uy3 v2 = uy32.v();
            uy3 uy33 = null;
            if (v2 != null) {
                uy3 = v2.D;
            } else {
                uy3 = null;
            }
            if (uy3 != null) {
                uy3 v3 = uy32.v();
                if (v3 != null) {
                    uy33 = v3.D;
                }
                uy33.getClass();
                uy3 v4 = uy32.v();
                v4.getClass();
                uy32 = v4.D;
                uy32.getClass();
            } else {
                fd4 a1 = ((xz4) uy32.a0.e).a1();
                a1.getClass();
                return a1;
            }
        }
    }

    public static final float[] E(float[] fArr) {
        float[] fArr2 = fArr;
        float f2 = fArr2[0];
        float f3 = fArr2[3];
        float f4 = fArr2[6];
        float f5 = fArr2[1];
        float f6 = fArr2[4];
        float f7 = fArr2[7];
        float f8 = fArr2[2];
        float f9 = fArr2[5];
        float f10 = fArr2[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr3 = new float[fArr2.length];
        fArr3[0] = f11 / f14;
        fArr3[1] = f12 / f14;
        fArr3[2] = f13 / f14;
        fArr3[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr3[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr3[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr3[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr3[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr3[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr3;
    }

    public static final int[] F(int i2, List list) {
        int i3;
        int i4 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i4 < size) {
                iArr[i4] = uq3.M(((jt0) list.get(i4)).a);
                i4++;
            }
            return iArr;
        }
        int[] iArr2 = new int[(list.size() + i2)];
        int size2 = list.size() - 1;
        int size3 = list.size();
        int i5 = 0;
        while (i4 < size3) {
            long j2 = ((jt0) list.get(i4)).a;
            if (jt0.d(j2) == 0.0f) {
                if (i4 == 0) {
                    i3 = i5 + 1;
                    iArr2[i5] = uq3.M(jt0.b(0.0f, ((jt0) list.get(1)).a));
                } else if (i4 == size2) {
                    i3 = i5 + 1;
                    iArr2[i5] = uq3.M(jt0.b(0.0f, ((jt0) list.get(i4 - 1)).a));
                } else {
                    int i6 = i5 + 1;
                    iArr2[i5] = uq3.M(jt0.b(0.0f, ((jt0) list.get(i4 - 1)).a));
                    i5 += 2;
                    iArr2[i6] = uq3.M(jt0.b(0.0f, ((jt0) list.get(i4 + 1)).a));
                }
                i5 = i3;
            } else {
                iArr2[i5] = uq3.M(j2);
                i5++;
            }
            i4++;
        }
        return iArr2;
    }

    public static final float[] G(List list, List list2, int i2) {
        float f2;
        float f3;
        float f4;
        if (i2 != 0) {
            float[] fArr = new float[(list2.size() + i2)];
            if (list != null) {
                f2 = ((Number) list.get(0)).floatValue();
            } else {
                f2 = 0.0f;
            }
            fArr[0] = f2;
            int size = list2.size() - 1;
            int i3 = 1;
            for (int i4 = 1; i4 < size; i4++) {
                long j2 = ((jt0) list2.get(i4)).a;
                if (list != null) {
                    f4 = ((Number) list.get(i4)).floatValue();
                } else {
                    f4 = ((float) i4) / ((float) (list2.size() - 1));
                }
                int i5 = i3 + 1;
                fArr[i3] = f4;
                if (jt0.d(j2) == 0.0f) {
                    i3 += 2;
                    fArr[i5] = f4;
                } else {
                    i3 = i5;
                }
            }
            if (list != null) {
                f3 = ((Number) list.get(list2.size() - 1)).floatValue();
            } else {
                f3 = 1.0f;
            }
            fArr[i3] = f3;
            return fArr;
        } else if (list != null) {
            return dt0.Z0(list);
        } else {
            return null;
        }
    }

    public static final void H(qp4 qp4) {
        wg2.q.getClass();
        w52 w52 = fi4.y;
        ArrayList arrayList = new ArrayList(et0.e0(w52, 10));
        e2 e2Var = new e2(0, w52);
        while (e2Var.hasNext()) {
            arrayList.add(((fi4) e2Var.next()).w);
        }
    }

    public static final am6 I(qp4 qp4) {
        ug2 ug2 = wg2.e;
        ug2.getClass();
        w52 w52 = el4.C;
        ArrayList arrayList = new ArrayList(et0.e0(w52, 10));
        e2 e2Var = new e2(0, w52);
        while (e2Var.hasNext()) {
            arrayList.add(((el4) e2Var.next()).w);
        }
        return new am6(qp4, (vg2) ug2, (u52) w52, arrayList);
    }

    public static final float[] J(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float[] fArr5 = new float[9];
        if (fArr3.length < 9 || fArr4.length < 9) {
            return fArr5;
        }
        float f2 = fArr3[3];
        float f3 = fArr4[1];
        float f4 = fArr3[6];
        float f5 = fArr4[2];
        float f6 = f4 * f5;
        fArr5[0] = f6 + (f2 * f3) + (fArr3[0] * fArr4[0]);
        float f7 = fArr3[1];
        float f8 = fArr4[0];
        float f9 = fArr3[4];
        float f10 = fArr3[7];
        float f11 = f10 * f5;
        fArr5[1] = f11 + (f3 * f9) + (f7 * f8);
        float f12 = fArr3[5];
        float f13 = fArr4[1] * f12;
        float f14 = fArr3[8];
        fArr5[2] = (f5 * f14) + f13 + (fArr3[2] * f8);
        float f15 = fArr3[0];
        float f16 = fArr4[4];
        float f17 = (f2 * f16) + (fArr4[3] * f15);
        float f18 = fArr4[5];
        fArr5[3] = (f4 * f18) + f17;
        float f19 = fArr3[1];
        float f20 = fArr4[3];
        float f21 = f9 * f16;
        fArr5[4] = (f10 * f18) + f21 + (f19 * f20);
        float f22 = fArr3[2];
        float f23 = f18 * f14;
        fArr5[5] = f23 + (f12 * fArr4[4]) + (f20 * f22);
        float f24 = f15 * fArr4[6];
        float f25 = fArr3[3];
        float f26 = fArr4[7];
        float f27 = (f25 * f26) + f24;
        float f28 = fArr4[8];
        fArr5[6] = (f4 * f28) + f27;
        float f29 = fArr4[6];
        float f30 = f10 * f28;
        fArr5[7] = f30 + (fArr3[4] * f26) + (f19 * f29);
        float f31 = f14 * f28;
        fArr5[8] = f31 + (fArr3[5] * fArr4[7]) + (f22 * f29);
        return fArr5;
    }

    public static final float[] K(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        float f5 = fArr[5] * f3;
        fArr2[2] = (fArr[8] * f4) + f5 + (fArr[2] * f2);
        return fArr2;
    }

    public static float L(int[] iArr, int[] iArr2) {
        float f2;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            i2 += iArr[i4];
            i3 += iArr2[i4];
        }
        if (i2 < i3) {
            return Float.POSITIVE_INFINITY;
        }
        float f3 = (float) i2;
        float f4 = f3 / ((float) i3);
        float f5 = 0.8f * f4;
        float f6 = 0.0f;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = iArr[i5];
            float f7 = ((float) iArr2[i5]) * f4;
            float f8 = (float) i6;
            if (f8 > f7) {
                f2 = f8 - f7;
            } else {
                f2 = f7 - f8;
            }
            if (f2 > f5) {
                return Float.POSITIVE_INFINITY;
            }
            f6 += f2;
        }
        return f6 / f3;
    }

    public static final void M(vm3 vm3, String str, String str2) {
        vm3.getClass();
        vm3.b(str, em3.b(str2));
    }

    public static final w84 N(int i2, int i3, yt2 yt2) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if ((i3 & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object systemService = ((Context) yt2.k(ye.b)).getSystemService("accessibility");
        systemService.getClass();
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        if ((((i2 & 14) ^ 6) <= 4 || !yt2.h(true)) && (i2 & 6) != 4) {
            z3 = false;
        } else {
            z3 = true;
        }
        if ((((i2 & 112) ^ 48) <= 32 || !yt2.h(true)) && (i2 & 48) != 32) {
            z4 = false;
        } else {
            z4 = true;
        }
        boolean z6 = z3 | z4;
        if ((((i2 & 896) ^ 384) <= 256 || !yt2.h(z2)) && (i2 & 384) != 256) {
            z5 = false;
        } else {
            z5 = true;
        }
        boolean z7 = z5 | z6;
        Object Q = yt2.Q();
        d63 d63 = ay0.a;
        if (z7 || Q == d63) {
            Q = new w84(true, true, z2);
            yt2.o0(Q);
        }
        w84 w84 = (w84) Q;
        t54 t54 = (t54) yt2.k(ha4.a);
        boolean g2 = yt2.g(w84) | yt2.i(accessibilityManager);
        Object Q2 = yt2.Q();
        if (g2 || Q2 == d63) {
            Q2 = new m0(1, w84, accessibilityManager);
            yt2.o0(Q2);
        }
        vr2 vr2 = (vr2) Q2;
        boolean g3 = yt2.g(w84) | yt2.i(accessibilityManager);
        Object Q3 = yt2.Q();
        if (g3 || Q3 == d63) {
            Q3 = new f5(0, w84, accessibilityManager);
            yt2.o0(Q3);
        }
        c(t54, vr2, (sr2) Q3, yt2, 0);
        return w84;
    }

    public static final w58 O(w58 w58, yt2 yt2) {
        Context context = (Context) yt2.k(ye.b);
        boolean g2 = yt2.g(context) | yt2.g(w58);
        Object Q = yt2.Q();
        if (g2 || Q == ay0.a) {
            context.getClass();
            w58.getClass();
            while (context instanceof ContextWrapper) {
                if (context instanceof rv0) {
                    pd1 pd1 = (pd1) ((vz2) ag8.q((rv0) context, vz2.class));
                    Q = new xz2(pd1.a(), w58, new jz0(9, pd1.a, pd1.b));
                    yt2.o0(Q);
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                    context.getClass();
                }
            }
            ku4.t("Expected an activity context for creating a HiltViewModelFactory but instead found: ", context);
            return null;
        }
        return (w58) Q;
    }

    public static final void P(jv6 jv6, int i2, Object obj) {
        int h2 = jv6.h(i2);
        Object[] objArr = jv6.c;
        Object obj2 = objArr[h2];
        objArr[h2] = ay0.a;
        if (obj != obj2) {
            ey0.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ")");
        }
    }

    public static final void Q(qp4 qp4, vg2 vg2) {
        vg2.getClass();
        w52 w52 = c76.x;
        ArrayList arrayList = new ArrayList(et0.e0(w52, 10));
        e2 e2Var = new e2(0, w52);
        while (e2Var.hasNext()) {
            arrayList.add(new sg2(vg2, ((c76) e2Var.next()).ordinal()));
        }
    }

    public static int R(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i2});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final void S(List list, List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                h.q("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            h.q("colors and colorStops arguments must have equal length.");
        }
    }

    public static final am6 T(qp4 qp4) {
        ug2 ug2 = wg2.d;
        ug2.getClass();
        w52 w52 = k78.B;
        ArrayList arrayList = new ArrayList(et0.e0(w52, 10));
        e2 e2Var = new e2(0, w52);
        while (e2Var.hasNext()) {
            arrayList.add(((k78) e2Var.next()).w);
        }
        return new am6(qp4, (vg2) ug2, (u52) w52, arrayList);
    }

    public static final ub3 a(zr3 zr3, String str) {
        return new ub3(str, new vb3(zr3));
    }

    public static final void b(sr2 sr2, ml4 ml4, t24 t24, i24 i24, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        yt2.g0(1055276397);
        if (yt2.i(sr2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i3 | i2;
        if (yt2.g(ml4)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (yt2.g(t24)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5;
        if (yt2.g(i24)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i10 = i9 | i6;
        if ((i10 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i10 & 1, z2)) {
            gr8.l(su0.J(-933153643, new uo2(t24, ml4, i24, u55.v(sr2, yt2)), yt2), yt2, 6);
        } else {
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new q60(sr2, ml4, t24, i24, i2);
        }
    }

    public static final void c(t54 t54, vr2 vr2, sr2 sr2, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        yt2.g0(-1868327245);
        if (yt2.i(t54)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i2;
        if (yt2.i(vr2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (yt2.i(sr2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        boolean z4 = true;
        if ((i8 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i8 & 1, z2)) {
            if ((i8 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean i9 = z3 | yt2.i(t54);
            if ((i8 & 896) != 256) {
                z4 = false;
            }
            boolean z5 = i9 | z4;
            Object Q = yt2.Q();
            if (z5 || Q == ay0.a) {
                Q = new g5((Object) t54, (Object) vr2, (Object) sr2, 0);
                yt2.o0(Q);
            }
            t49.e(t54, (vr2) Q, yt2);
        } else {
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new y30(i2, 4, t54, vr2, sr2);
        }
    }

    public static final void d(List list, int i2, int i3) {
        int r2 = r(i2, list);
        if (r2 < 0) {
            r2 = -(r2 + 1);
        }
        while (r2 < list.size() && ((ch3) list.get(r2)).b < i3) {
            ch3 ch3 = (ch3) list.remove(r2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: h06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: h06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: h06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: h06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: h06} */
    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    public static final Object e(List list, ue1 ue1, h61 h61) {
        me1 me1;
        int i2;
        h06 h06;
        Iterator it;
        Throwable th;
        List list2;
        h06 h062;
        if (h61 instanceof me1) {
            me1 me12 = (me1) h61;
            int i3 = me12.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                me12.C = i3 - Integer.MIN_VALUE;
                me1 = me12;
                Object obj = me1.B;
                i2 = me1.C;
                Object obj2 = p81.w;
                if (i2 != 0) {
                    o85.q(obj);
                    ArrayList arrayList = new ArrayList();
                    f7 f7Var = new f7((Object) list, (Object) arrayList, (f61) null, 5);
                    me1.z = arrayList;
                    me1.C = 1;
                    if (ue1.a(f7Var, me1) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else if (i2 == 1) {
                    list2 = (List) me1.z;
                    o85.q(obj);
                } else if (i2 == 2) {
                    it = me1.A;
                    h06 h063 = (h06) me1.z;
                    try {
                        h062 = h063;
                        o85.q(obj);
                        h062 = h063;
                        h06 = h063;
                    } catch (Throwable th2) {
                        Object obj3 = h062.w;
                        if (obj3 == null) {
                            h062.w = th2;
                            h06 = h062;
                        } else {
                            su0.b((Throwable) obj3, th2);
                            h06 = h062;
                        }
                    }
                    while (it.hasNext()) {
                        vr2 vr2 = (vr2) it.next();
                        h062 = h06;
                        me1.z = h06;
                        me1.A = it;
                        me1.C = 2;
                        if (vr2.y(me1) == obj2) {
                            return obj2;
                        }
                    }
                    th = (Throwable) h06.w;
                    if (th == null) {
                        return vs7.a;
                    }
                    throw th;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj4 = new Object();
                it = list2.iterator();
                h06 = obj4;
                while (it.hasNext()) {
                }
                th = (Throwable) h06.w;
                if (th == null) {
                }
            }
        }
        me1 = new h61(h61);
        Object obj5 = me1.B;
        i2 = me1.C;
        Object obj22 = p81.w;
        if (i2 != 0) {
        }
        Object obj42 = new Object();
        it = list2.iterator();
        h06 = obj42;
        while (it.hasNext()) {
        }
        th = (Throwable) h06.w;
        if (th == null) {
        }
    }

    public static tt0 f(tt0 tt0) {
        t88 t88 = kl8.i;
        f96 f96 = f96.A;
        if (dh4.m(tt0.b, 12884901888L)) {
            t76 t76 = (t76) tt0;
            t88 t882 = t76.d;
            if (!k(t882, t88)) {
                t76 t762 = t76;
                return new t76(t762.a, t762.h, t88, J(i((float[]) f96.x, t882.a(), t88.a()), t76.i), t762.k, t762.n, t762.e, t762.f, t762.g, -1);
            }
        }
        return tt0;
    }

    public static ml4 g(ml4 ml4, kc0 kc0) {
        return ml4.d(new w30(0, kc0, gr8.h, 1));
    }

    public static final ml4 h(ml4 ml4, long j2, pq6 pq6) {
        return ml4.d(new w30(j2, (kc0) null, pq6, 2));
    }

    public static final float[] i(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArr4 = fArr;
        float[] fArr5 = fArr3;
        K(fArr, fArr2);
        K(fArr4, fArr5);
        float[] fArr6 = {fArr5[0] / fArr2[0], fArr5[1] / fArr2[1], fArr5[2] / fArr2[2]};
        float[] E = E(fArr4);
        float f2 = fArr6[0];
        float f3 = fArr4[0] * f2;
        float f4 = fArr6[1];
        float f5 = fArr4[1] * f4;
        float f6 = fArr6[2];
        return J(E, new float[]{f3, f5, fArr4[2] * f6, fArr4[3] * f2, fArr4[4] * f4, fArr4[5] * f6, f2 * fArr4[6], f4 * fArr4[7], f6 * fArr4[8]});
    }

    public static final void j(fv6 fv6, ArrayList arrayList, int i2) {
        boolean l2 = fv6.l(i2);
        int[] iArr = fv6.b;
        if (l2) {
            arrayList.add(fv6.n(i2));
            return;
        }
        int i3 = iArr[(i2 * 5) + 3] + i2;
        for (int i4 = i2 + 1; i4 < i3; i4 += iArr[(i4 * 5) + 3]) {
            j(fv6, arrayList, i4);
        }
    }

    public static final boolean k(t88 t88, t88 t882) {
        if (t88 == t882) {
            return true;
        }
        if (Math.abs(t88.a - t882.a) >= 0.001f || Math.abs(t88.b - t882.b) >= 0.001f) {
            return false;
        }
        return true;
    }

    public static final int l(List list) {
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int size = list.size() - 1;
        for (int i3 = 1; i3 < size; i3++) {
            if (jt0.d(((jt0) list.get(i3)).a) == 0.0f) {
                i2++;
            }
        }
        return i2;
    }

    public static final x11 m(tt0 tt0, tt0 tt02) {
        if (tt0 == tt02) {
            return new x11(tt0, tt0, 1);
        }
        if (!dh4.m(tt0.b, 12884901888L) || !dh4.m(tt02.b, 12884901888L)) {
            return new x11(tt0, tt02, 0);
        }
        return new w11((t76) tt0, (t76) tt02);
    }

    public static final String n(CharsetDecoder charsetDecoder, py6 py6) {
        charsetDecoder.getClass();
        py6.getClass();
        StringBuilder sb = new StringBuilder((int) Math.min(2147483647L, py6.c().y));
        Charset charset = charsetDecoder.charset();
        charset.getClass();
        if (charset.equals(mo0.a)) {
            sb.append(i95.A(py6));
        } else {
            long j2 = py6.c().y;
            byte[] j3 = i75.j(py6, -1);
            Charset charset2 = charsetDecoder.charset();
            charset2.getClass();
            sb.append(new String(j3, charset2));
        }
        return sb.toString();
    }

    public static ArrayList o(k90 k90) {
        ArrayList arrayList = new ArrayList();
        int i2 = k90.x;
        if (i2 > 0) {
            int i3 = k90.w;
            r66[] r66Arr = new r66[8];
            int i4 = 0;
            int i5 = 0;
            k90 k902 = k90;
            r66[] t2 = t(k902, i2, i3, 0, 0, e);
            for (int i6 = 0; i6 < 4; i6++) {
                r66Arr[c[i6]] = t2[i6];
            }
            r66 r66 = r66Arr[4];
            if (r66 != null) {
                i5 = (int) r66.a;
                i4 = (int) r66.b;
            }
            r66[] t3 = t(k902, i2, i3, i4, i5, f);
            for (int i7 = 0; i7 < 4; i7++) {
                r66Arr[d[i7]] = t3[i7];
            }
            if (!(r66Arr[0] == null && r66Arr[3] == null)) {
                arrayList.add(r66Arr);
            }
        }
        return arrayList;
    }

    public static int[] p(k90 k90, int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i5 = 0;
        while (k90.b(i2, i3) && i2 > 0) {
            int i6 = i5 + 1;
            if (i5 >= 3) {
                break;
            }
            i2--;
            i5 = i6;
        }
        int length = iArr.length;
        int i7 = i2;
        int i8 = 0;
        boolean z2 = false;
        while (i2 < i4) {
            if (k90.b(i2, i3) != z2) {
                iArr2[i8] = iArr2[i8] + 1;
            } else {
                if (i8 != length - 1) {
                    i8++;
                } else if (L(iArr2, iArr) < 0.42f) {
                    return new int[]{i7, i2};
                } else {
                    i7 += iArr2[0] + iArr2[1];
                    int i9 = i8 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i9);
                    iArr2[i9] = 0;
                    iArr2[i8] = 0;
                    i8--;
                }
                iArr2[i8] = 1;
                z2 = !z2;
            }
            i2++;
        }
        if (i8 != length - 1 || L(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i7, i2 - 1};
    }

    public static final v16 q(rg4 rg4, gq0 gq0, rk4 rk4) {
        gq0.getClass();
        rk4.getClass();
        String r0 = k57.r0(gq0.b.a.a, '.', '$');
        up2 up2 = gq0.a;
        if (!up2.a.c()) {
            r0 = up2 + '.' + r0;
        }
        ji8 l2 = rg4.l(r0);
        if (l2 != null) {
            return (v16) l2.x;
        }
        return null;
    }

    public static final int r(int i2, List list) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int k2 = sg3.k(((ch3) list.get(i4)).b, i2);
            if (k2 < 0) {
                i3 = i4 + 1;
            } else if (k2 <= 0) {
                return i4;
            } else {
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008e A[EDGE_INSN: B:38:0x008e->B:35:0x008e ?: BREAK  , SYNTHETIC] */
    public static final List s(ld4 ld4, int i2, int i3) {
        boolean z2;
        yb5 yb5;
        boolean z3;
        int intValue;
        ld4.getClass();
        if (i2 == i3) {
            return a42.w;
        }
        if (i3 > i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList arrayList = new ArrayList();
        do {
            if (z2) {
                if (i2 >= i3) {
                    return arrayList;
                }
            } else if (i2 <= i3) {
                return arrayList;
            }
            LinkedHashMap linkedHashMap = ld4.a;
            if (z2) {
                TreeMap treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i2));
                if (treeMap != null) {
                    yb5 = new yb5(treeMap, treeMap.descendingKeySet());
                    if (yb5 == null) {
                        break;
                    }
                    Map map = (Map) yb5.w;
                    Iterator it = ((Iterable) yb5.x).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z3 = false;
                            continue;
                            break;
                        }
                        intValue = ((Number) it.next()).intValue();
                        if (!z2) {
                            if (i3 <= intValue && intValue < i2) {
                                break;
                            }
                        } else if (i2 + 1 <= intValue && intValue <= i3) {
                            break;
                        }
                    }
                    Object obj = map.get(Integer.valueOf(intValue));
                    obj.getClass();
                    arrayList.add(obj);
                    z3 = true;
                    i2 = intValue;
                    continue;
                }
            } else {
                TreeMap treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i2));
                if (treeMap2 != null) {
                    yb5 = new yb5(treeMap2, treeMap2.keySet());
                    if (yb5 == null) {
                    }
                }
            }
            yb5 = null;
            if (yb5 == null) {
            }
        } while (z3);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r3 = r9 - 1;
     */
    public static r66[] t(k90 k90, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        boolean z2;
        int[] p2;
        r66[] r66Arr = new r66[4];
        int[] iArr2 = iArr;
        int[] iArr3 = new int[iArr2.length];
        int i7 = i4;
        while (true) {
            if (i7 >= i2) {
                i6 = i7;
                z2 = false;
                break;
            }
            int[] p3 = p(k90, i5, i7, i3, iArr2, iArr3);
            if (p3 != null) {
                int[] iArr4 = p3;
                while (true) {
                    i6 = i7;
                    if (i6 <= 0 || (p2 = p(k90, i5, i7, i3, iArr, iArr3)) == null) {
                        float f2 = (float) i6;
                        r66Arr[0] = new r66((float) iArr4[0], f2);
                        r66Arr[1] = new r66((float) iArr4[1], f2);
                        z2 = true;
                    } else {
                        iArr4 = p2;
                    }
                }
                float f22 = (float) i6;
                r66Arr[0] = new r66((float) iArr4[0], f22);
                r66Arr[1] = new r66((float) iArr4[1], f22);
                z2 = true;
            } else {
                i7 += 5;
                iArr2 = iArr;
            }
        }
        int i8 = i6 + 1;
        if (z2) {
            int[] iArr5 = {(int) r66Arr[0].a, (int) r66Arr[1].a};
            int i9 = i8;
            int i10 = 0;
            while (i9 < i2) {
                int[] p4 = p(k90, iArr5[0], i9, i3, iArr, iArr3);
                if (p4 == null || Math.abs(iArr5[0] - p4[0]) >= 5 || Math.abs(iArr5[1] - p4[1]) >= 5) {
                    if (i10 > 25) {
                        break;
                    }
                    i10++;
                } else {
                    iArr5 = p4;
                    i10 = 0;
                }
                i9++;
            }
            i8 = i9 - (i10 + 1);
            float f3 = (float) i8;
            r66Arr[2] = new r66((float) iArr5[0], f3);
            r66Arr[3] = new r66((float) iArr5[1], f3);
        }
        if (i8 - i6 < 10) {
            Arrays.fill(r66Arr, (Object) null);
        }
        return r66Arr;
    }

    public static Object u(Context context) {
        Application v2 = v(context.getApplicationContext());
        boolean z2 = v2 instanceof nu2;
        Class<?> cls = v2.getClass();
        if (z2) {
            return ((nu2) v2).a();
        }
        kj6.o("Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: ", cls);
        return null;
    }

    public static Application v(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
            if (context2 instanceof Application) {
                return (Application) context2;
            }
        }
        ku4.t("Could not find an Application in the given context: ", context);
        return null;
    }

    public static final x83 w() {
        x83 x83 = y;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.Autorenew", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 be5 = new be5();
        be5.j(12.0f, 6.0f);
        be5.n(1.79f);
        be5.e(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        be5.i(2.79f, -2.79f);
        be5.e(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        be5.i(-2.79f, -2.79f);
        be5.e(-0.31f, -0.31f, -0.85f, -0.09f, -0.85f, 0.36f);
        be5.h(12.0f, 4.0f);
        be5.e(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        be5.e(0.0f, 1.04f, 0.2f, 2.04f, 0.57f, 2.95f);
        be5.e(0.27f, 0.67f, 1.13f, 0.85f, 1.64f, 0.34f);
        be5.e(0.27f, -0.27f, 0.38f, -0.68f, 0.23f, -1.04f);
        be5.d(6.15f, 13.56f, 6.0f, 12.79f, 6.0f, 12.0f);
        be5.e(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        be5.c();
        be5.j(17.79f, 8.71f);
        be5.e(-0.27f, 0.27f, -0.38f, 0.69f, -0.23f, 1.04f);
        be5.e(0.28f, 0.7f, 0.44f, 1.46f, 0.44f, 2.25f);
        be5.e(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        be5.n(-1.79f);
        be5.e(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        be5.i(-2.79f, 2.79f);
        be5.e(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        be5.i(2.79f, 2.79f);
        be5.e(0.31f, 0.31f, 0.85f, 0.09f, 0.85f, -0.35f);
        be5.h(12.0f, 20.0f);
        be5.e(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f);
        be5.e(0.0f, -1.04f, -0.2f, -2.04f, -0.57f, -2.95f);
        be5.e(-0.27f, -0.67f, -1.13f, -0.85f, -1.64f, -0.34f);
        be5.c();
        w83.a(w83, be5.a, ky6, 14336);
        x83 b2 = w83.b();
        y = b2;
        return b2;
    }

    public static final x83 x() {
        x83 x83 = z;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.CallMade", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 e2 = pb4.e(9.0f, 6.0f);
        e2.e(0.0f, 0.56f, 0.45f, 1.0f, 1.0f, 1.0f);
        e2.g(5.59f);
        e2.h(4.7f, 17.89f);
        e2.e(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        e2.e(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        e2.h(17.0f, 8.41f);
        e2.m(14.0f);
        e2.e(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e2.l(1.0f, -0.45f, 1.0f, -1.0f);
        e2.m(6.0f);
        e2.e(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e2.g(-8.0f);
        e2.e(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e2.c();
        w83.a(w83, e2.a, ky6, 14336);
        x83 b2 = w83.b();
        z = b2;
        return b2;
    }

    public static final x83 y() {
        x83 x83 = A;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("AutoMirrored.Rounded.Chat", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, true, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 f2 = b81.f(20.0f, 2.0f, 4.0f, 2.0f);
        f2.e(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        f2.h(2.0f, 22.0f);
        f2.i(4.0f, -4.0f);
        f2.g(14.0f);
        f2.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        f2.h(22.0f, 4.0f);
        f2.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        f2.c();
        f2.j(7.0f, 9.0f);
        f2.g(10.0f);
        f2.e(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        f2.l(-0.45f, 1.0f, -1.0f, 1.0f);
        f2.h(7.0f, 11.0f);
        f2.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        f2.l(0.45f, -1.0f, 1.0f, -1.0f);
        b81.v(f2, 13.0f, 14.0f, 7.0f, 14.0f);
        f2.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        f2.l(0.45f, -1.0f, 1.0f, -1.0f);
        f2.g(6.0f);
        f2.e(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        f2.l(-0.45f, 1.0f, -1.0f, 1.0f);
        b81.v(f2, 17.0f, 8.0f, 7.0f, 8.0f);
        f2.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        f2.l(0.45f, -1.0f, 1.0f, -1.0f);
        f2.g(10.0f);
        f2.e(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        f2.l(-0.45f, 1.0f, -1.0f, 1.0f);
        f2.c();
        w83.a(w83, f2.a, ky6, 14336);
        x83 b2 = w83.b();
        A = b2;
        return b2;
    }

    public static final x83 z() {
        x83 x83 = B;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.Dialpad", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 e2 = pb4.e(12.0f, 19.0f);
        e2.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        e2.l(0.9f, 2.0f, 2.0f, 2.0f);
        e2.l(2.0f, -0.9f, 2.0f, -2.0f);
        e2.l(-0.9f, -2.0f, -2.0f, -2.0f);
        e2.c();
        e2.j(6.0f, 1.0f);
        e2.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        e2.l(0.9f, 2.0f, 2.0f, 2.0f);
        e2.l(2.0f, -0.9f, 2.0f, -2.0f);
        e2.l(-0.9f, -2.0f, -2.0f, -2.0f);
        e2.c();
        e2.j(6.0f, 7.0f);
        e2.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        e2.l(0.9f, 2.0f, 2.0f, 2.0f);
        e2.l(2.0f, -0.9f, 2.0f, -2.0f);
        e2.l(-0.9f, -2.0f, -2.0f, -2.0f);
        e2.c();
        e2.j(6.0f, 13.0f);
        e2.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        e2.l(0.9f, 2.0f, 2.0f, 2.0f);
        e2.l(2.0f, -0.9f, 2.0f, -2.0f);
        e2.l(-0.9f, -2.0f, -2.0f, -2.0f);
        e2.c();
        e2.j(18.0f, 5.0f);
        e2.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e2.l(-0.9f, -2.0f, -2.0f, -2.0f);
        e2.l(-2.0f, 0.9f, -2.0f, 2.0f);
        e2.l(0.9f, 2.0f, 2.0f, 2.0f);
        e2.c();
        e2.j(12.0f, 13.0f);
        e2.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        e2.l(0.9f, 2.0f, 2.0f, 2.0f);
        e2.l(2.0f, -0.9f, 2.0f, -2.0f);
        e2.l(-0.9f, -2.0f, -2.0f, -2.0f);
        e2.c();
        e2.j(18.0f, 13.0f);
        e2.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        e2.l(0.9f, 2.0f, 2.0f, 2.0f);
        e2.l(2.0f, -0.9f, 2.0f, -2.0f);
        e2.l(-0.9f, -2.0f, -2.0f, -2.0f);
        e2.c();
        e2.j(18.0f, 7.0f);
        e2.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        e2.l(0.9f, 2.0f, 2.0f, 2.0f);
        e2.l(2.0f, -0.9f, 2.0f, -2.0f);
        e2.l(-0.9f, -2.0f, -2.0f, -2.0f);
        e2.c();
        e2.j(12.0f, 7.0f);
        e2.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        e2.l(0.9f, 2.0f, 2.0f, 2.0f);
        e2.l(2.0f, -0.9f, 2.0f, -2.0f);
        e2.l(-0.9f, -2.0f, -2.0f, -2.0f);
        e2.c();
        e2.j(12.0f, 1.0f);
        e2.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        e2.l(0.9f, 2.0f, 2.0f, 2.0f);
        e2.l(2.0f, -0.9f, 2.0f, -2.0f);
        e2.l(-0.9f, -2.0f, -2.0f, -2.0f);
        e2.c();
        w83.a(w83, e2.a, ky6, 14336);
        x83 b2 = w83.b();
        B = b2;
        return b2;
    }
}
