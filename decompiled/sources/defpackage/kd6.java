package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import cu.lestebang.utiletecsa.R;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: kd6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kd6 implements zl, im, tv0 {
    public static HashSet D;
    public Object A;
    public Object B;
    public Object C;
    public final /* synthetic */ int w;
    public Object x;
    public Object y;
    public Object z;

    public kd6(int i) {
        this.w = i;
        switch (i) {
            case 2:
                this.x = new AtomicBoolean(false);
                this.y = new CountDownLatch(1);
                this.C = "PublicSuffixDatabase.list";
                return;
            default:
                this.x = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                this.y = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.z = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                this.A = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                this.B = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.C = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (r7 != 9) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        r5 = r5 - r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007d A[PHI: r5 
      PHI: (r5v2 float) = (r5v1 float), (r5v3 float) binds: [B:28:0x006f, B:30:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    public static Matrix B(sp4 sp4, sp4 sp42, zn5 zn5) {
        yn5 yn5;
        float f;
        float f2;
        float f3;
        Matrix matrix = new Matrix();
        if (!(zn5 == null || (yn5 = zn5.a) == null)) {
            float f4 = sp4.d / sp42.d;
            float f5 = sp4.e / sp42.e;
            float f6 = -sp42.b;
            float f7 = -sp42.c;
            if (!zn5.equals(zn5.c)) {
                if (zn5.b == 2) {
                    f = Math.max(f4, f5);
                } else {
                    f = Math.min(f4, f5);
                }
                float f8 = sp4.d / f;
                float f9 = sp4.e / f;
                int ordinal = yn5.ordinal();
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 5) {
                            if (ordinal != 6) {
                                if (ordinal != 8) {
                                }
                            }
                        }
                    }
                    f3 = sp42.d - f8;
                    f6 -= f3;
                    switch (yn5.ordinal()) {
                        case 4:
                        case 5:
                        case 6:
                            f2 = (sp42.e - f9) / 2.0f;
                            break;
                        case 7:
                        case 8:
                        case 9:
                            f2 = sp42.e - f9;
                            break;
                        default:
                            matrix.preTranslate(sp4.b, sp4.c);
                            matrix.preScale(f, f);
                            matrix.preTranslate(f6, f7);
                            break;
                    }
                }
                f3 = (sp42.d - f8) / 2.0f;
                f6 -= f3;
                switch (yn5.ordinal()) {
                    case 4:
                    case 5:
                    case 6:
                        break;
                    case 7:
                    case 8:
                    case 9:
                        break;
                }
            } else {
                matrix.preTranslate(sp4.b, sp4.c);
                matrix.preScale(f4, f5);
                matrix.preTranslate(f6, f7);
                return matrix;
            }
        }
        return matrix;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        if (r7.equals("sans-serif") == false) goto L_0x0027;
     */
    public static Typeface E(int i, Integer num, String str) {
        boolean z2;
        int i2;
        char c = 0;
        if (i == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (num.intValue() > 500) {
            if (z2) {
                i2 = 3;
            } else {
                i2 = 1;
            }
        } else if (z2) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1536685117:
                break;
            case -1431958525:
                if (str.equals("monospace")) {
                    c = 1;
                    break;
                }
            case -1081737434:
                if (str.equals("fantasy")) {
                    c = 2;
                    break;
                }
            case 109326717:
                if (str.equals("serif")) {
                    c = 3;
                    break;
                }
            case 1126973893:
                if (str.equals("cursive")) {
                    c = 4;
                    break;
                }
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case b85.b:
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case 1:
                return Typeface.create(Typeface.MONOSPACE, i2);
            case 2:
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case 3:
                return Typeface.create(Typeface.SERIF, i2);
            case 4:
                return Typeface.create(Typeface.SANS_SERIF, i2);
            default:
                return null;
        }
    }

    public static void E0(id6 id6, boolean z2, mc6 mc6) {
        Float f;
        int i;
        dc6 dc6 = id6.a;
        if (z2) {
            f = dc6.y;
        } else {
            f = dc6.A;
        }
        float floatValue = f.floatValue();
        if (mc6 instanceof gb6) {
            i = ((gb6) mc6).w;
        } else if (mc6 instanceof hb6) {
            i = id6.a.G.w;
        } else {
            return;
        }
        int F = F(i, floatValue);
        if (z2) {
            id6.d.setColor(F);
        } else {
            id6.e.setColor(F);
        }
    }

    public static int F(int i, float f) {
        int i2 = 255;
        int round = Math.round(((float) ((i >> 24) & 255)) * f);
        if (round < 0) {
            i2 = 0;
        } else if (round <= 255) {
            i2 = round;
        }
        return (i & 16777215) | (i2 << 24);
    }

    public static void F0(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = yo.b;
        }
        mutate.setColorFilter(yo.c(i, mode));
    }

    public static String G(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                    byteArrayOutputStream.close();
                    bufferedInputStream.close();
                    return byteArrayOutputStream2;
                }
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        throw th;
    }

    public static kd6 H(Context context, f83 f83, md2 md2, wz0 wz0, qc3 qc3, cw0 cw0, hv2 hv2, z00 z00, hv2 hv22, h91 h91, wr0 wr0) {
        sa1 sa1 = new sa1(context, f83, wz0, hv2, z00);
        wa1 wa1 = new wa1(md2, z00, h91);
        va1 va1 = kf1.b;
        in7.b(context);
        return new kd6(sa1, wa1, new kf1(new a56(in7.a().c(new hg0(kf1.c, kf1.d)).a("FIREBASE_CRASHLYTICS_REPORT", new m42("json"), kf1.e), z00.d(), hv22)), qc3, cw0, f83, wr0);
    }

    public static ColorStateList I(Context context, int i) {
        int c = eh7.c(context, R.attr.colorControlHighlight);
        int b = eh7.b(context, R.attr.colorButtonNormal);
        int[] iArr = eh7.b;
        int[] iArr2 = eh7.d;
        int b2 = yt0.b(c, i);
        return new ColorStateList(new int[][]{iArr, iArr2, eh7.c, eh7.f}, new int[]{b, b2, yt0.b(c, i), i});
    }

    public static void O(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void Q(kb6 kb6, String str) {
        jc6 B2 = kb6.a.B(str);
        if (B2 == null) {
            Log.w("SVGAndroidRenderer", "Gradient reference '" + str + "' not found");
        } else if (!(B2 instanceof kb6)) {
            O("Gradient href attributes must point to other gradient elements", new Object[0]);
        } else if (B2 == kb6) {
            O("Circular reference in gradient href attribute '%s'", str);
        } else {
            kb6 kb62 = (kb6) B2;
            if (kb6.i == null) {
                kb6.i = kb62.i;
            }
            if (kb6.j == null) {
                kb6.j = kb62.j;
            }
            if (kb6.k == 0) {
                kb6.k = kb62.k;
            }
            if (kb6.h.isEmpty()) {
                kb6.h = kb62.h;
            }
            try {
                if (kb6 instanceof kc6) {
                    kc6 kc6 = (kc6) kb6;
                    kc6 kc62 = (kc6) B2;
                    if (kc6.m == null) {
                        kc6.m = kc62.m;
                    }
                    if (kc6.n == null) {
                        kc6.n = kc62.n;
                    }
                    if (kc6.o == null) {
                        kc6.o = kc62.o;
                    }
                    if (kc6.p == null) {
                        kc6.p = kc62.p;
                    }
                } else {
                    R((oc6) kb6, (oc6) B2);
                }
            } catch (ClassCastException unused) {
            }
            String str2 = kb62.l;
            if (str2 != null) {
                Q(kb6, str2);
            }
        }
    }

    public static void R(oc6 oc6, oc6 oc62) {
        if (oc6.m == null) {
            oc6.m = oc62.m;
        }
        if (oc6.n == null) {
            oc6.n = oc62.n;
        }
        if (oc6.o == null) {
            oc6.o = oc62.o;
        }
        if (oc6.p == null) {
            oc6.p = oc62.p;
        }
        if (oc6.q == null) {
            oc6.q = oc62.q;
        }
    }

    public static void S(xb6 xb6, String str) {
        jc6 B2 = xb6.a.B(str);
        if (B2 == null) {
            Log.w("SVGAndroidRenderer", "Pattern reference '" + str + "' not found");
        } else if (!(B2 instanceof xb6)) {
            O("Pattern href attributes must point to other pattern elements", new Object[0]);
        } else if (B2 == xb6) {
            O("Circular reference in pattern href attribute '%s'", str);
        } else {
            xb6 xb62 = (xb6) B2;
            if (xb6.p == null) {
                xb6.p = xb62.p;
            }
            if (xb6.q == null) {
                xb6.q = xb62.q;
            }
            if (xb6.r == null) {
                xb6.r = xb62.r;
            }
            if (xb6.s == null) {
                xb6.s = xb62.s;
            }
            if (xb6.t == null) {
                xb6.t = xb62.t;
            }
            if (xb6.u == null) {
                xb6.u = xb62.u;
            }
            if (xb6.v == null) {
                xb6.v = xb62.v;
            }
            if (xb6.i.isEmpty()) {
                xb6.i = xb62.i;
            }
            if (xb6.o == null) {
                xb6.o = xb62.o;
            }
            if (xb6.n == null) {
                xb6.n = xb62.n;
            }
            String str2 = xb62.w;
            if (str2 != null) {
                S(xb6, str2);
            }
        }
    }

    public static /* synthetic */ List U(kd6 kd6, st5 st5, li4 li4, Boolean bool, boolean z2, int i) {
        boolean z3;
        boolean z4;
        if ((i & 4) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if ((i & 16) != 0) {
            bool = null;
        }
        Boolean bool2 = bool;
        if ((i & 32) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        return kd6.T(st5, li4, z3, false, bool2, z4);
    }

    public static li4 Y(k2 k2Var, vq4 vq4, wv1 wv1, int i, boolean z2) {
        k2Var.getClass();
        vq4.getClass();
        if (i != 0) {
            if (k2Var instanceof wr5) {
                y92 y92 = rp3.a;
                qo3 a = rp3.a((wr5) k2Var, vq4, wv1);
                if (a != null) {
                    return rd3.r(a);
                }
            } else if (k2Var instanceof js5) {
                y92 y922 = rp3.a;
                qo3 c = rp3.c((js5) k2Var, vq4, wv1);
                if (c != null) {
                    return rd3.r(c);
                }
            } else if (k2Var instanceof qs5) {
                yu2 yu2 = qp3.d;
                yu2.getClass();
                kp3 kp3 = (kp3) jb5.n((wu2) k2Var, yu2);
                if (kp3 != null) {
                    int B2 = b81.B(i);
                    if (B2 == 1) {
                        return we.t((qs5) k2Var, vq4, wv1, true, true, z2);
                    }
                    if (B2 != 2) {
                        if (B2 != 3 || (kp3.x & 8) != 8) {
                            return null;
                        }
                        ip3 ip3 = kp3.B;
                        ip3.getClass();
                        return new li4(vq4.getString(ip3.y).concat(vq4.getString(ip3.z)));
                    } else if (kp3.i()) {
                        ip3 ip32 = kp3.A;
                        ip32.getClass();
                        return new li4(vq4.getString(ip32.y).concat(vq4.getString(ip32.z)));
                    }
                }
            }
            return null;
        }
        throw null;
    }

    public static LayerDrawable a0(t56 t56, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable c = t56.c(context, R.drawable.abc_star_black_48dp);
        Drawable c2 = t56.c(context, R.drawable.abc_star_half_black_48dp);
        if ((c instanceof BitmapDrawable) && c.getIntrinsicWidth() == dimensionPixelSize && c.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable2 = (BitmapDrawable) c;
            bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c.draw(canvas);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
            bitmapDrawable = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
        if ((c2 instanceof BitmapDrawable) && c2.getIntrinsicWidth() == dimensionPixelSize && c2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        return layerDrawable;
    }

    public static List b0(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    arrayList.add(new hz(str, str2));
                } else {
                    ku4.j("Null value");
                    return null;
                }
            } else {
                ku4.j("Null key");
                return null;
            }
        }
        Collections.sort(arrayList, new wh(9));
        return Collections.unmodifiableList(arrayList);
    }

    public static boolean e0(dc6 dc6, long j) {
        if ((dc6.w & j) != 0) {
            return true;
        }
        return false;
    }

    public static Path n0(yb6 yb6) {
        Path path = new Path();
        float[] fArr = yb6.o;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = yb6.o;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (yb6 instanceof zb6) {
            path.close();
        }
        if (yb6.h == null) {
            yb6.h = z(path);
        }
        return path;
    }

    public static void p(float f, float f2, float f3, float f4, float f5, boolean z2, boolean z3, float f6, float f7, wb6 wb6) {
        double d;
        double d2;
        double d3;
        double d4;
        float f8 = f5;
        boolean z4 = z3;
        float f9 = f7;
        if (f != f6 || f2 != f9) {
            if (f3 == 0.0f || f4 == 0.0f) {
                wb6.e(f6, f9);
                return;
            }
            float abs = Math.abs(f3);
            float abs2 = Math.abs(f4);
            double radians = Math.toRadians(((double) f8) % 360.0d);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d5 = ((double) (f - f6)) / 2.0d;
            double d6 = ((double) (f2 - f9)) / 2.0d;
            double d7 = (sin * d6) + (cos * d5);
            double d8 = cos;
            double d9 = (d8 * d6) + ((-sin) * d5);
            double d10 = (double) (abs * abs);
            double d11 = (double) (abs2 * abs2);
            double d12 = d7 * d7;
            double d13 = d9 * d9;
            double d14 = (d13 / d11) + (d12 / d10);
            if (d14 > 0.99999d) {
                double sqrt = Math.sqrt(d14) * 1.00001d;
                abs = (float) (((double) abs) * sqrt);
                abs2 = (float) (sqrt * ((double) abs2));
                d10 = (double) (abs * abs);
                d11 = (double) (abs2 * abs2);
            }
            double d15 = sin;
            if (z2 == z4) {
                d = -1.0d;
            } else {
                d = 1.0d;
            }
            double d16 = d10 * d11;
            double d17 = d10 * d13;
            double d18 = d11 * d12;
            double d19 = ((d16 - d17) - d18) / (d17 + d18);
            if (d19 < 0.0d) {
                d19 = 0.0d;
            }
            double sqrt2 = Math.sqrt(d19) * d;
            double d20 = (double) abs;
            double d21 = (double) abs2;
            double d22 = ((d20 * d9) / d21) * sqrt2;
            double d23 = d20;
            double d24 = sqrt2 * (-((d21 * d7) / d23));
            double d25 = ((d8 * d22) - (d15 * d24)) + (((double) (f + f6)) / 2.0d);
            double d26 = (d8 * d24) + (d15 * d22);
            double d27 = d21;
            double d28 = d26 + (((double) (f2 + f9)) / 2.0d);
            double d29 = (d7 - d22) / d23;
            double d30 = (d9 - d24) / d27;
            double d31 = ((-d7) - d22) / d23;
            double d32 = ((-d9) - d24) / d27;
            double d33 = (d30 * d30) + (d29 * d29);
            double sqrt3 = Math.sqrt(d33);
            if (d30 < 0.0d) {
                d2 = -1.0d;
            } else {
                d2 = 1.0d;
            }
            double acos = Math.acos(d29 / sqrt3) * d2;
            double sqrt4 = Math.sqrt(((d32 * d32) + (d31 * d31)) * d33);
            double d34 = (d30 * d32) + (d29 * d31);
            if ((d29 * d32) - (d30 * d31) < 0.0d) {
                d3 = -1.0d;
            } else {
                d3 = 1.0d;
            }
            double d35 = d34 / sqrt4;
            if (d35 < -1.0d) {
                d4 = 3.141592653589793d;
            } else if (d35 > 1.0d) {
                d4 = 0.0d;
            } else {
                d4 = Math.acos(d35);
            }
            double d36 = d3 * d4;
            if (!z3 && d36 > 0.0d) {
                d36 -= 6.283185307179586d;
            } else if (z3 && d36 < 0.0d) {
                d36 += 6.283185307179586d;
            }
            double d37 = d36 % 6.283185307179586d;
            double d38 = acos % 6.283185307179586d;
            int ceil = (int) Math.ceil((Math.abs(d37) * 2.0d) / 3.141592653589793d);
            double d39 = d37 / ((double) ceil);
            double d40 = d39 / 2.0d;
            double sin2 = (Math.sin(d40) * 1.3333333333333333d) / (Math.cos(d40) + 1.0d);
            int i = ceil * 6;
            float[] fArr = new float[i];
            double d41 = d39;
            int i2 = 0;
            int i3 = 0;
            while (i2 < ceil) {
                double d42 = d38;
                double d43 = (((double) i2) * d41) + d42;
                double cos2 = Math.cos(d43);
                double sin3 = Math.sin(d43);
                int i4 = i2;
                int i5 = i3;
                fArr[i5] = (float) (cos2 - (sin2 * sin3));
                fArr[i3 + 1] = (float) ((cos2 * sin2) + sin3);
                double d44 = d43 + d41;
                double cos3 = Math.cos(d44);
                double sin4 = Math.sin(d44);
                fArr[i5 + 2] = (float) ((sin2 * sin4) + cos3);
                fArr[i5 + 3] = (float) (sin4 - (sin2 * cos3));
                fArr[i5 + 4] = (float) cos3;
                i3 = i5 + 6;
                fArr[i5 + 5] = (float) sin4;
                i2 = i4 + 1;
                d38 = d42;
                ceil = ceil;
            }
            Matrix matrix = new Matrix();
            matrix.postScale(abs, abs2);
            matrix.postRotate(f8);
            matrix.postTranslate((float) d25, (float) d28);
            matrix.mapPoints(fArr);
            fArr[i - 2] = f6;
            fArr[i - 1] = f9;
            for (int i6 = 0; i6 < i; i6 += 6) {
                wb6.c(fArr[i6], fArr[i6 + 1], fArr[i6 + 2], fArr[i6 + 3], fArr[i6 + 4], fArr[i6 + 5]);
            }
        }
    }

    public static rz u(rz rzVar, qc3 qc3, cw0 cw0, Map map) {
        Map map2;
        Map unmodifiableMap;
        Map unmodifiableMap2;
        qz a = rzVar.a();
        String c = ((zc2) qc3.y).c();
        if (c != null) {
            a.e = new e00(c);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", (Throwable) null);
        }
        boolean isEmpty = map.isEmpty();
        l90 l90 = (l90) cw0.z;
        if (isEmpty) {
            jt3 jt3 = (jt3) ((AtomicMarkableReference) l90.b).getReference();
            synchronized (jt3) {
                try {
                    map2 = Collections.unmodifiableMap(new HashMap(jt3.a));
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        } else {
            jt3 jt32 = (jt3) ((AtomicMarkableReference) l90.b).getReference();
            synchronized (jt32) {
                try {
                    unmodifiableMap2 = Collections.unmodifiableMap(new HashMap(jt32.a));
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
            HashMap hashMap = new HashMap(unmodifiableMap2);
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String a2 = jt3.a(1024, (String) entry.getKey());
                if (hashMap.size() < 64 || hashMap.containsKey(a2)) {
                    hashMap.put(a2, jt3.a(1024, (String) entry.getValue()));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024", (Throwable) null);
            }
            map2 = Collections.unmodifiableMap(hashMap);
        }
        List b0 = b0(map2);
        jt3 jt33 = (jt3) ((AtomicMarkableReference) ((l90) cw0.A).b).getReference();
        synchronized (jt33) {
            try {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(jt33.a));
            } catch (Throwable th3) {
                while (true) {
                    throw th3;
                }
            }
        }
        List b02 = b0(unmodifiableMap);
        if (!b0.isEmpty() || !b02.isEmpty()) {
            sz szVar = (sz) rzVar.c;
            a.c = new sz(szVar.a, b0, b02, szVar.d, szVar.e, szVar.f, szVar.g);
        }
        return a.a();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [f00, java.lang.Object] */
    public static na1 v(rz rzVar, cw0 cw0) {
        List a = ((v86) cw0.B).a();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < a.size()) {
            u86 u86 = (u86) a.get(i);
            u86.getClass();
            ? obj = new Object();
            k10 k10 = (k10) u86;
            String str = k10.e;
            if (str != null) {
                String str2 = k10.b;
                if (str2 != null) {
                    obj.a = new h00(str2, str);
                    String str3 = k10.c;
                    if (str3 != null) {
                        obj.b = str3;
                        obj.c = k10.d;
                        obj.d = k10.f;
                        obj.e = (byte) (obj.e | 1);
                        arrayList.add(obj.a());
                        i++;
                    } else {
                        ku4.j("Null parameterKey");
                        return null;
                    }
                } else {
                    ku4.j("Null rolloutId");
                    return null;
                }
            } else {
                ku4.j("Null variantId");
                return null;
            }
        }
        if (arrayList.isEmpty()) {
            return rzVar;
        }
        qz a2 = rzVar.a();
        a2.f = new i00(arrayList);
        return a2.a();
    }

    public static boolean w(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static sp4 z(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new sp4(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public float A(wc6 wc6) {
        jd6 jd6 = new jd6(this);
        N(wc6, jd6);
        return jd6.c;
    }

    public void A0(sb6 sb6, sp4 sp4) {
        float f;
        float f2;
        float f3;
        Canvas canvas = (Canvas) this.x;
        Boolean bool = sb6.n;
        if (bool == null || !bool.booleanValue()) {
            pb6 pb6 = sb6.p;
            float f4 = 1.2f;
            if (pb6 != null) {
                f3 = pb6.b(this, 1.0f);
            } else {
                f3 = 1.2f;
            }
            pb6 pb62 = sb6.q;
            if (pb62 != null) {
                f4 = pb62.b(this, 1.0f);
            }
            f2 = f3 * sp4.d;
            f = f4 * sp4.e;
        } else {
            pb6 pb63 = sb6.p;
            if (pb63 != null) {
                f2 = pb63.d(this);
            } else {
                f2 = sp4.d;
            }
            pb6 pb64 = sb6.q;
            if (pb64 != null) {
                f = pb64.e(this);
            } else {
                f = sp4.e;
            }
        }
        if (f2 != 0.0f && f != 0.0f) {
            H0();
            id6 V = V(sb6);
            this.z = V;
            V.a.F = Float.valueOf(1.0f);
            boolean t0 = t0();
            canvas.save();
            Boolean bool2 = sb6.o;
            if (bool2 != null && !bool2.booleanValue()) {
                canvas.translate(sp4.b, sp4.c);
                canvas.scale(sp4.d, sp4.e);
            }
            x0(sb6, false);
            canvas.restore();
            if (t0) {
                s0(sp4);
            }
            G0();
        }
    }

    public yb9 B0(String str, Executor executor) {
        xb7 xb7;
        ArrayList b = ((wa1) this.y).b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                va1 va1 = wa1.g;
                String e = wa1.e(file);
                va1.getClass();
                arrayList.add(new dz(va1.i(e), file.getName(), file));
            } catch (IOException e2) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e2);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            dz dzVar = (dz) it2.next();
            if (str == null || str.equals(dzVar.b)) {
                kf1 kf1 = (kf1) this.z;
                cz czVar = dzVar.a;
                boolean z2 = true;
                if (czVar.f == null || czVar.g == null) {
                    se2 b2 = ((f83) this.C).b(true);
                    cz czVar2 = dzVar.a;
                    String str2 = b2.a;
                    bz a = czVar2.a();
                    a.e = str2;
                    cz a2 = a.a();
                    String str3 = b2.b;
                    bz a3 = a2.a();
                    a3.f = str3;
                    dzVar = new dz(a3.a(), dzVar.b, dzVar.c);
                }
                if (str == null) {
                    z2 = false;
                }
                a56 a56 = kf1.a;
                synchronized (a56.f) {
                    try {
                        xb7 = new xb7();
                        if (z2) {
                            ((AtomicInteger) a56.i.y).getAndIncrement();
                            if (a56.f.size() < a56.e) {
                                g22 g22 = g22.D;
                                g22.o("Enqueueing report: " + dzVar.b);
                                g22.o("Queue size: " + a56.f.size());
                                a56.g.execute(new z46(a56, dzVar, xb7, 0));
                                g22.o("Closing task for report: " + dzVar.b);
                                xb7.d(dzVar);
                            } else {
                                a56.a();
                                String str4 = "Dropping report due to queue being full: " + dzVar.b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str4, (Throwable) null);
                                }
                                ((AtomicInteger) a56.i.x).getAndIncrement();
                                xb7.d(dzVar);
                            }
                        } else {
                            a56.b(dzVar, xb7);
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                arrayList2.add(xb7.a.f(executor, new kj6(this)));
            }
        }
        return b35.A(arrayList2);
    }

    public void C(ic6 ic6, sp4 sp4) {
        Path y2;
        if (((id6) this.z).a.T != null && (y2 = y(ic6, sp4)) != null) {
            ((Canvas) this.x).clipPath(y2);
        }
    }

    public void C0(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        am6 am6 = ((id6) this.z).a.L;
        if (am6 != null) {
            f += ((pb6) am6.A).d(this);
            f2 += ((pb6) ((id6) this.z).a.L.x).e(this);
            f5 -= ((pb6) ((id6) this.z).a.L.y).d(this);
            f6 -= ((pb6) ((id6) this.z).a.L.z).e(this);
        }
        ((Canvas) this.x).clipRect(f, f2, f5, f6);
    }

    public void D(ic6 ic6) {
        mc6 mc6 = ((id6) this.z).a.x;
        if (mc6 instanceof ub6) {
            J(true, ic6.h, (ub6) mc6);
        }
        mc6 mc62 = ((id6) this.z).a.z;
        if (mc62 instanceof ub6) {
            J(false, ic6.h, (ub6) mc62);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[ADDED_TO_REGION, ORIG_RETURN, RETURN, SYNTHETIC] */
    public void D0(String str, Bundle bundle, boolean z2) {
        String str2;
        String str3;
        jz2 jz2;
        boolean e;
        int i;
        bundle.putString("scope", "*");
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        oe2 oe2 = (oe2) this.x;
        oe2.a();
        bundle.putString("gmp_app_id", oe2.c.b);
        bundle.putString("gmsv", Integer.toString(((gk4) this.y).d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((gk4) this.y).b());
        gk4 gk4 = (gk4) this.y;
        synchronized (gk4) {
            try {
                if (((String) gk4.e) == null) {
                    gk4.g();
                }
                str2 = (String) gk4.e;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        bundle.putString("app_ver_name", str2);
        oe2 oe22 = (oe2) this.x;
        oe22.a();
        try {
            str3 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(oe22.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str3 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str3);
        if (z2) {
            oe2 oe23 = (oe2) this.x;
            oe23.a();
            bundle.putString("Goog-Api-Key", oe23.c.a);
        }
        try {
            String str4 = ((x00) b35.b(((ve2) ((we2) this.C)).d())).a;
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (ExecutionException e2) {
            e = e2;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) b35.b(((ve2) ((we2) this.C)).c()));
            bundle.putString("cliv", "fcm-25.1.0");
            jz2 = (jz2) ((nu5) this.B).get();
            ho1 ho1 = (ho1) ((nu5) this.A).get();
            if (jz2 == null) {
                return;
            }
        } catch (InterruptedException e3) {
            e = e3;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) b35.b(((ve2) ((we2) this.C)).c()));
            bundle.putString("cliv", "fcm-25.1.0");
            jz2 = (jz2) ((nu5) this.B).get();
            ho1 ho12 = (ho1) ((nu5) this.A).get();
            if (jz2 == null) {
            }
        }
        bundle.putString("appid", (String) b35.b(((ve2) ((we2) this.C)).c()));
        bundle.putString("cliv", "fcm-25.1.0");
        jz2 = (jz2) ((nu5) this.B).get();
        ho1 ho122 = (ho1) ((nu5) this.A).get();
        if (jz2 == null && ho122 != null) {
            wl1 wl1 = (wl1) jz2;
            synchronized (wl1) {
                long currentTimeMillis = System.currentTimeMillis();
                kz2 kz2 = (kz2) wl1.a.get();
                synchronized (kz2) {
                    e = kz2.e(kz2.b, currentTimeMillis);
                }
                if (e) {
                    synchronized (kz2) {
                        kz2.a.a(new cb(kz2, kz2.b(System.currentTimeMillis())));
                    }
                    i = 3;
                } else {
                    i = 1;
                }
            }
            if (i != 1) {
                bundle.putString("Firebase-Client-Log-Type", Integer.toString(b81.B(i)));
                bundle.putString("Firebase-Client", ho122.a());
            }
        }
    }

    public void G0() {
        ((Canvas) this.x).restore();
        this.z = (id6) ((Stack) this.A).pop();
    }

    public void H0() {
        ((Canvas) this.x).save();
        ((Stack) this.A).push((id6) this.z);
        this.z = new id6((id6) this.z);
    }

    public String I0(String str, boolean z2, boolean z3) {
        if (((id6) this.z).h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z2) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z3) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: int} */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0111  */
    public void J(boolean z2, sp4 sp4, ub6 ub6) {
        boolean z3;
        Paint paint;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        boolean z4;
        Paint paint2;
        float f9;
        float f10;
        float f11;
        float f12;
        float b;
        float f13;
        float f14;
        float f15;
        Matrix matrix;
        int size;
        float f16;
        String str;
        boolean z5 = z2;
        sp4 sp42 = sp4;
        ub6 ub62 = ub6;
        jc6 B2 = ((cf4) this.y).B(ub62.w);
        ? r5 = 0;
        if (B2 == null) {
            if (z5) {
                str = "Fill";
            } else {
                str = "Stroke";
            }
            O("%s reference '%s' not found", str, ub62.w);
            mc6 mc6 = ub62.x;
            id6 id6 = (id6) this.z;
            if (mc6 != null) {
                E0(id6, z5, mc6);
            } else if (z5) {
                id6.b = false;
            } else {
                id6.c = false;
            }
        } else {
            boolean z6 = B2 instanceof kc6;
            gb6 gb6 = gb6.x;
            if (z6) {
                kc6 kc6 = (kc6) B2;
                String str2 = kc6.l;
                if (str2 != null) {
                    Q(kc6, str2);
                }
                Boolean bool = kc6.i;
                if (bool == null || !bool.booleanValue()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                id6 id62 = (id6) this.z;
                if (z5) {
                    paint2 = id62.d;
                } else {
                    paint2 = id62.e;
                }
                if (z4) {
                    sp4 sp43 = id62.g;
                    if (sp43 == null) {
                        sp43 = id62.f;
                    }
                    pb6 pb6 = kc6.m;
                    if (pb6 != null) {
                        f10 = pb6.d(this);
                    } else {
                        f10 = 0.0f;
                    }
                    pb6 pb62 = kc6.n;
                    if (pb62 != null) {
                        f11 = pb62.e(this);
                    } else {
                        f11 = 0.0f;
                    }
                    f9 = 0.0f;
                    pb6 pb63 = kc6.o;
                    if (pb63 != null) {
                        f12 = pb63.d(this);
                    } else {
                        f12 = sp43.d;
                    }
                    pb6 pb64 = kc6.p;
                    if (pb64 != null) {
                        b = pb64.e(this);
                        float f17 = f11;
                        float f18 = f12;
                        float f19 = b;
                        float f20 = f10;
                        H0();
                        this.z = V(kc6);
                        Matrix matrix2 = new Matrix();
                        if (!z4) {
                            matrix2.preTranslate(sp42.b, sp42.c);
                            matrix2.preScale(sp42.d, sp42.e);
                        }
                        matrix = kc6.j;
                        if (matrix != null) {
                            matrix2.preConcat(matrix);
                        }
                        size = kc6.h.size();
                        if (size == 0) {
                            G0();
                            id6 id63 = (id6) this.z;
                            if (z5) {
                                id63.b = false;
                                return;
                            } else {
                                id63.c = false;
                                return;
                            }
                        } else {
                            int[] iArr = new int[size];
                            float[] fArr = new float[size];
                            int i = 0;
                            float f21 = -1.0f;
                            for (lc6 lc6 : kc6.h) {
                                cc6 cc6 = (cc6) lc6;
                                Float f22 = cc6.h;
                                if (f22 != null) {
                                    f16 = f22.floatValue();
                                } else {
                                    f16 = f9;
                                }
                                if (i == 0 || f16 >= f21) {
                                    fArr[i] = f16;
                                    f21 = f16;
                                } else {
                                    fArr[i] = f21;
                                }
                                H0();
                                L0((id6) this.z, cc6);
                                dc6 dc6 = ((id6) this.z).a;
                                gb6 gb62 = (gb6) dc6.R;
                                if (gb62 == null) {
                                    gb62 = gb6;
                                }
                                iArr[i] = F(gb62.w, dc6.S.floatValue());
                                i++;
                                G0();
                            }
                            if ((f20 == f18 && f17 == f19) || size == 1) {
                                G0();
                                paint2.setColor(iArr[size - 1]);
                                return;
                            }
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            int i2 = kc6.k;
                            if (i2 != 0) {
                                if (i2 == 2) {
                                    tileMode = Shader.TileMode.MIRROR;
                                } else if (i2 == 3) {
                                    tileMode = Shader.TileMode.REPEAT;
                                }
                            }
                            Shader.TileMode tileMode2 = tileMode;
                            G0();
                            LinearGradient linearGradient = new LinearGradient(f20, f17, f18, f19, iArr, fArr, tileMode2);
                            linearGradient.setLocalMatrix(matrix2);
                            paint2.setShader(linearGradient);
                            int floatValue = (int) (((id6) this.z).a.y.floatValue() * 256.0f);
                            if (floatValue >= 0) {
                                if (floatValue > 255) {
                                    r5 = 255;
                                } else {
                                    r5 = floatValue;
                                }
                            }
                            paint2.setAlpha(r5);
                            return;
                        }
                    }
                } else {
                    f9 = 0.0f;
                    pb6 pb65 = kc6.m;
                    if (pb65 != null) {
                        f15 = pb65.b(this, 1.0f);
                    } else {
                        f15 = 0.0f;
                    }
                    pb6 pb66 = kc6.n;
                    if (pb66 != null) {
                        f14 = pb66.b(this, 1.0f);
                    } else {
                        f14 = 0.0f;
                    }
                    pb6 pb67 = kc6.o;
                    if (pb67 != null) {
                        f13 = pb67.b(this, 1.0f);
                    } else {
                        f13 = 1.0f;
                    }
                    pb6 pb68 = kc6.p;
                    if (pb68 != null) {
                        b = pb68.b(this, 1.0f);
                        float f172 = f11;
                        float f182 = f12;
                        float f192 = b;
                        float f202 = f10;
                        H0();
                        this.z = V(kc6);
                        Matrix matrix22 = new Matrix();
                        if (!z4) {
                        }
                        matrix = kc6.j;
                        if (matrix != null) {
                        }
                        size = kc6.h.size();
                        if (size == 0) {
                        }
                    }
                }
                b = f9;
                float f1722 = f11;
                float f1822 = f12;
                float f1922 = b;
                float f2022 = f10;
                H0();
                this.z = V(kc6);
                Matrix matrix222 = new Matrix();
                if (!z4) {
                }
                matrix = kc6.j;
                if (matrix != null) {
                }
                size = kc6.h.size();
                if (size == 0) {
                }
            } else if (B2 instanceof oc6) {
                oc6 oc6 = (oc6) B2;
                String str3 = oc6.l;
                if (str3 != null) {
                    Q(oc6, str3);
                }
                Boolean bool2 = oc6.i;
                if (bool2 == null || !bool2.booleanValue()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                id6 id64 = (id6) this.z;
                if (z5) {
                    paint = id64.d;
                } else {
                    paint = id64.e;
                }
                if (z3) {
                    pb6 pb69 = new pb6(9, 50.0f);
                    pb6 pb610 = oc6.m;
                    if (pb610 != null) {
                        f7 = pb610.d(this);
                    } else {
                        f7 = pb69.d(this);
                    }
                    pb6 pb611 = oc6.n;
                    if (pb611 != null) {
                        f2 = pb611.e(this);
                    } else {
                        f2 = pb69.e(this);
                    }
                    pb6 pb612 = oc6.o;
                    if (pb612 != null) {
                        f8 = pb612.a(this);
                    } else {
                        f8 = pb69.a(this);
                    }
                    f4 = f8;
                    f3 = f7;
                } else {
                    pb6 pb613 = oc6.m;
                    float f23 = 0.5f;
                    if (pb613 != null) {
                        f = pb613.b(this, 1.0f);
                    } else {
                        f = 0.5f;
                    }
                    pb6 pb614 = oc6.n;
                    if (pb614 != null) {
                        f5 = pb614.b(this, 1.0f);
                    } else {
                        f5 = 0.5f;
                    }
                    pb6 pb615 = oc6.o;
                    if (pb615 != null) {
                        f23 = pb615.b(this, 1.0f);
                    }
                    f3 = f;
                    f4 = f23;
                }
                float f24 = f2;
                H0();
                this.z = V(oc6);
                Matrix matrix3 = new Matrix();
                if (!z3) {
                    matrix3.preTranslate(sp42.b, sp42.c);
                    matrix3.preScale(sp42.d, sp42.e);
                }
                Matrix matrix4 = oc6.j;
                if (matrix4 != null) {
                    matrix3.preConcat(matrix4);
                }
                int size2 = oc6.h.size();
                if (size2 == 0) {
                    G0();
                    id6 id65 = (id6) this.z;
                    if (z5) {
                        id65.b = false;
                    } else {
                        id65.c = false;
                    }
                } else {
                    int[] iArr2 = new int[size2];
                    float[] fArr2 = new float[size2];
                    int i3 = 0;
                    float f25 = -1.0f;
                    for (lc6 lc62 : oc6.h) {
                        cc6 cc62 = (cc6) lc62;
                        Float f26 = cc62.h;
                        if (f26 != null) {
                            f6 = f26.floatValue();
                        } else {
                            f6 = 0.0f;
                        }
                        if (i3 == 0 || f6 >= f25) {
                            fArr2[i3] = f6;
                            f25 = f6;
                        } else {
                            fArr2[i3] = f25;
                        }
                        H0();
                        L0((id6) this.z, cc62);
                        dc6 dc62 = ((id6) this.z).a;
                        gb6 gb63 = (gb6) dc62.R;
                        if (gb63 == null) {
                            gb63 = gb6;
                        }
                        iArr2[i3] = F(gb63.w, dc62.S.floatValue());
                        i3++;
                        G0();
                    }
                    if (f4 == 0.0f || size2 == 1) {
                        int[] iArr3 = iArr2;
                        G0();
                        paint.setColor(iArr3[size2 - 1]);
                        return;
                    }
                    Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                    int i4 = oc6.k;
                    if (i4 != 0) {
                        if (i4 == 2) {
                            tileMode3 = Shader.TileMode.MIRROR;
                        } else if (i4 == 3) {
                            tileMode3 = Shader.TileMode.REPEAT;
                        }
                    }
                    Shader.TileMode tileMode4 = tileMode3;
                    G0();
                    RadialGradient radialGradient = new RadialGradient(f3, f24, f4, iArr2, fArr2, tileMode4);
                    radialGradient.setLocalMatrix(matrix3);
                    paint.setShader(radialGradient);
                    int floatValue2 = (int) (((id6) this.z).a.y.floatValue() * 256.0f);
                    if (floatValue2 >= 0) {
                        if (floatValue2 > 255) {
                            r5 = 255;
                        } else {
                            r5 = floatValue2;
                        }
                    }
                    paint.setAlpha(r5);
                }
            } else if (B2 instanceof bc6) {
                bc6 bc6 = (bc6) B2;
                dc6 dc63 = bc6.e;
                if (z5) {
                    if (e0(dc63, 2147483648L)) {
                        id6 id66 = (id6) this.z;
                        dc6 dc64 = id66.a;
                        mc6 mc62 = bc6.e.V;
                        dc64.x = mc62;
                        if (mc62 != null) {
                            r5 = 1;
                        }
                        id66.b = r5;
                    }
                    if (e0(bc6.e, 4294967296L)) {
                        ((id6) this.z).a.y = bc6.e.W;
                    }
                    if (e0(bc6.e, 6442450944L)) {
                        id6 id67 = (id6) this.z;
                        E0(id67, z5, id67.a.x);
                        return;
                    }
                    return;
                }
                if (e0(dc63, 2147483648L)) {
                    id6 id68 = (id6) this.z;
                    dc6 dc65 = id68.a;
                    mc6 mc63 = bc6.e.V;
                    dc65.z = mc63;
                    if (mc63 != null) {
                        r5 = 1;
                    }
                    id68.c = r5;
                }
                if (e0(bc6.e, 4294967296L)) {
                    ((id6) this.z).a.A = bc6.e.W;
                }
                if (e0(bc6.e, 6442450944L)) {
                    id6 id69 = (id6) this.z;
                    E0(id69, z5, id69.a.z);
                }
            }
        }
    }

    public void J0(ic6 ic6) {
        if (ic6.b != null && ic6.h != null) {
            Matrix matrix = new Matrix();
            if (((Matrix) ((Stack) this.C).peek()).invert(matrix)) {
                sp4 sp4 = ic6.h;
                float f = sp4.b;
                float f2 = sp4.c;
                float c = sp4.c();
                sp4 sp42 = ic6.h;
                float f3 = sp42.c;
                float c2 = sp42.c();
                float d = ic6.h.d();
                sp4 sp43 = ic6.h;
                float[] fArr = {f, f2, c, f3, c2, d, sp43.b, sp43.d()};
                matrix.preConcat(((Canvas) this.x).getMatrix());
                matrix.mapPoints(fArr);
                float f4 = fArr[0];
                float f5 = fArr[1];
                RectF rectF = new RectF(f4, f5, f4, f5);
                for (int i = 2; i <= 6; i += 2) {
                    float f6 = fArr[i];
                    if (f6 < rectF.left) {
                        rectF.left = f6;
                    }
                    if (f6 > rectF.right) {
                        rectF.right = f6;
                    }
                    float f7 = fArr[i + 1];
                    if (f7 < rectF.top) {
                        rectF.top = f7;
                    }
                    if (f7 > rectF.bottom) {
                        rectF.bottom = f7;
                    }
                }
                ic6 ic62 = (ic6) ((Stack) this.B).peek();
                sp4 sp44 = ic62.h;
                float f8 = rectF.left;
                float f9 = rectF.top;
                if (sp44 == null) {
                    ic62.h = new sp4(f8, f9, rectF.right - f8, rectF.bottom - f9);
                    return;
                }
                float f10 = rectF.right - f8;
                float f11 = rectF.bottom - f9;
                if (f8 < sp44.b) {
                    sp44.b = f8;
                }
                if (f9 < sp44.c) {
                    sp44.c = f9;
                }
                if (f8 + f10 > sp44.c()) {
                    sp44.d = (f8 + f10) - sp44.b;
                }
                if (f9 + f11 > sp44.d()) {
                    sp44.e = (f9 + f11) - sp44.c;
                }
            }
        }
    }

    public boolean K() {
        Boolean bool = ((id6) this.z).a.P;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x0261 A[LOOP:1: B:116:0x0261->B:119:0x0275, LOOP_START, PHI: r7 
      PHI: (r7v16 android.graphics.Typeface) = (r7v9 android.graphics.Typeface), (r7v19 android.graphics.Typeface) binds: [B:115:0x025d, B:119:0x0275] A[DONT_GENERATE, DONT_INLINE]] */
    public void K0(id6 id6, dc6 dc6) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        boolean z5;
        boolean z6;
        id6 id62 = id6;
        dc6 dc62 = dc6;
        if (e0(dc62, 4096)) {
            id62.a.G = dc62.G;
        }
        if (e0(dc62, 2048)) {
            id62.a.F = dc62.F;
        }
        boolean e0 = e0(dc62, 1);
        gb6 gb6 = gb6.y;
        boolean z7 = false;
        if (e0) {
            id62.a.x = dc62.x;
            mc6 mc6 = dc62.x;
            if (mc6 == null || mc6 == gb6) {
                z6 = false;
            } else {
                z6 = true;
            }
            id62.b = z6;
        }
        if (e0(dc62, 4)) {
            id62.a.y = dc62.y;
        }
        if (e0(dc62, 6149)) {
            E0(id62, true, id62.a.x);
        }
        if (e0(dc62, 2)) {
            id62.a.Z = dc62.Z;
        }
        if (e0(dc62, 8)) {
            id62.a.z = dc62.z;
            mc6 mc62 = dc62.z;
            if (mc62 == null || mc62 == gb6) {
                z5 = false;
            } else {
                z5 = true;
            }
            id62.c = z5;
        }
        if (e0(dc62, 16)) {
            id62.a.A = dc62.A;
        }
        if (e0(dc62, 6168)) {
            E0(id62, false, id62.a.z);
        }
        if (e0(dc62, 34359738368L)) {
            id62.a.h0 = dc62.h0;
        }
        if (e0(dc62, 32)) {
            dc6 dc63 = id62.a;
            pb6 pb6 = dc62.B;
            dc63.B = pb6;
            id62.e.setStrokeWidth(pb6.a(this));
        }
        if (e0(dc62, 64)) {
            dc6 dc64 = id62.a;
            Paint paint = id62.e;
            dc64.a0 = dc62.a0;
            int B2 = b81.B(dc62.a0);
            if (B2 == 0) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (B2 == 1) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (B2 == 2) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (e0(dc62, 128)) {
            dc6 dc65 = id62.a;
            Paint paint2 = id62.e;
            dc65.b0 = dc62.b0;
            int B3 = b81.B(dc62.b0);
            if (B3 == 0) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (B3 == 1) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (B3 == 2) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (e0(dc62, 256)) {
            id62.a.C = dc62.C;
            id62.e.setStrokeMiter(dc62.C.floatValue());
        }
        if (e0(dc62, 512)) {
            id62.a.D = dc62.D;
        }
        if (e0(dc62, 1024)) {
            id62.a.E = dc62.E;
        }
        Typeface typeface = null;
        if (e0(dc62, 1536)) {
            dc6 dc66 = id62.a;
            Paint paint3 = id62.e;
            pb6[] pb6Arr = dc66.D;
            if (pb6Arr == null) {
                paint3.setPathEffect((PathEffect) null);
            } else {
                int length = pb6Arr.length;
                if (length % 2 == 0) {
                    i = length;
                } else {
                    i = length * 2;
                }
                float[] fArr = new float[i];
                float f = 0.0f;
                for (int i2 = 0; i2 < i; i2++) {
                    float a = dc66.D[i2 % length].a(this);
                    fArr[i2] = a;
                    f += a;
                }
                if (f == 0.0f) {
                    paint3.setPathEffect((PathEffect) null);
                } else {
                    float a2 = dc66.E.a(this);
                    if (a2 < 0.0f) {
                        a2 = (a2 % f) + f;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, a2));
                }
            }
        }
        if (e0(dc62, 16384)) {
            float textSize = ((id6) this.z).d.getTextSize();
            id62.a.I = dc62.I;
            id62.d.setTextSize(dc62.I.b(this, textSize));
            id62.e.setTextSize(dc62.I.b(this, textSize));
        }
        if (e0(dc62, 8192)) {
            id62.a.H = dc62.H;
        }
        if (e0(dc62, 32768)) {
            if (dc62.J.intValue() == -1 && id62.a.J.intValue() > 100) {
                dc6 dc67 = id62.a;
                dc67.J = Integer.valueOf(dc67.J.intValue() - 100);
            } else if (dc62.J.intValue() != 1 || id62.a.J.intValue() >= 900) {
                id62.a.J = dc62.J;
            } else {
                dc6 dc68 = id62.a;
                dc68.J = Integer.valueOf(dc68.J.intValue() + 100);
            }
        }
        if (e0(dc62, 65536)) {
            id62.a.c0 = dc62.c0;
        }
        if (e0(dc62, 106496)) {
            dc6 dc69 = id62.a;
            ArrayList arrayList = dc69.H;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && (typeface = E(dc69.c0, dc69.J, (String) it.next())) == null) {
                    while (it.hasNext() && (typeface = E(dc69.c0, dc69.J, (String) it.next())) == null) {
                    }
                }
            }
            if (typeface == null) {
                typeface = E(dc69.c0, dc69.J, "serif");
            }
            id62.d.setTypeface(typeface);
            id62.e.setTypeface(typeface);
        }
        if (e0(dc62, 131072)) {
            dc6 dc610 = id62.a;
            Paint paint4 = id62.e;
            Paint paint5 = id62.d;
            dc610.d0 = dc62.d0;
            if (dc62.d0 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            paint5.setStrikeThruText(z2);
            if (dc62.d0 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            paint5.setUnderlineText(z3);
            if (dc62.d0 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            paint4.setStrikeThruText(z4);
            if (dc62.d0 == 2) {
                z7 = true;
            }
            paint4.setUnderlineText(z7);
        }
        if (e0(dc62, 68719476736L)) {
            id62.a.e0 = dc62.e0;
        }
        if (e0(dc62, 262144)) {
            id62.a.f0 = dc62.f0;
        }
        if (e0(dc62, 524288)) {
            id62.a.K = dc62.K;
        }
        if (e0(dc62, 2097152)) {
            id62.a.M = dc62.M;
        }
        if (e0(dc62, 4194304)) {
            id62.a.N = dc62.N;
        }
        if (e0(dc62, 8388608)) {
            id62.a.O = dc62.O;
        }
        if (e0(dc62, 16777216)) {
            id62.a.P = dc62.P;
        }
        if (e0(dc62, 33554432)) {
            id62.a.Q = dc62.Q;
        }
        if (e0(dc62, 1048576)) {
            id62.a.L = dc62.L;
        }
        if (e0(dc62, 268435456)) {
            id62.a.T = dc62.T;
        }
        if (e0(dc62, 536870912)) {
            id62.a.g0 = dc62.g0;
        }
        if (e0(dc62, 1073741824)) {
            id62.a.U = dc62.U;
        }
        if (e0(dc62, 67108864)) {
            id62.a.R = dc62.R;
        }
        if (e0(dc62, 134217728)) {
            id62.a.S = dc62.S;
        }
        if (e0(dc62, 8589934592L)) {
            id62.a.X = dc62.X;
        }
        if (e0(dc62, 17179869184L)) {
            id62.a.Y = dc62.Y;
        }
        if (e0(dc62, 137438953472L)) {
            id62.a.i0 = dc62.i0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ac  */
    public void L(ic6 ic6, Path path) {
        boolean z2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z3;
        boolean z4;
        float floor;
        float d;
        boolean t0;
        float f6;
        float f7;
        boolean z5;
        float f8;
        float f9;
        float f10;
        float f11;
        ic6 ic62 = ic6;
        Path path2 = path;
        Canvas canvas = (Canvas) this.x;
        mc6 mc6 = ((id6) this.z).a.x;
        if (mc6 instanceof ub6) {
            jc6 B2 = ((cf4) this.y).B(((ub6) mc6).w);
            if (B2 instanceof xb6) {
                xb6 xb6 = (xb6) B2;
                Boolean bool = xb6.p;
                if (bool == null || !bool.booleanValue()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                String str = xb6.w;
                if (str != null) {
                    S(xb6, str);
                }
                pb6 pb6 = xb6.s;
                if (z2) {
                    if (pb6 != null) {
                        f4 = pb6.d(this);
                    } else {
                        f4 = 0.0f;
                    }
                    pb6 pb62 = xb6.t;
                    if (pb62 != null) {
                        f3 = pb62.e(this);
                    } else {
                        f3 = 0.0f;
                    }
                    pb6 pb63 = xb6.u;
                    if (pb63 != null) {
                        f2 = pb63.d(this);
                    } else {
                        f2 = 0.0f;
                    }
                    pb6 pb64 = xb6.v;
                    if (pb64 != null) {
                        f = pb64.e(this);
                    } else {
                        f = 0.0f;
                    }
                } else {
                    if (pb6 != null) {
                        f8 = pb6.b(this, 1.0f);
                    } else {
                        f8 = 0.0f;
                    }
                    pb6 pb65 = xb6.t;
                    if (pb65 != null) {
                        f9 = pb65.b(this, 1.0f);
                    } else {
                        f9 = 0.0f;
                    }
                    pb6 pb66 = xb6.u;
                    if (pb66 != null) {
                        f10 = pb66.b(this, 1.0f);
                    } else {
                        f10 = 0.0f;
                    }
                    pb6 pb67 = xb6.v;
                    if (pb67 != null) {
                        f11 = pb67.b(this, 1.0f);
                    } else {
                        f11 = 0.0f;
                    }
                    sp4 sp4 = ic62.h;
                    float f12 = sp4.b;
                    float f13 = sp4.d;
                    float f14 = (f8 * f13) + f12;
                    float f15 = sp4.c;
                    float f16 = sp4.e;
                    float f17 = f10 * f13;
                    f = f11 * f16;
                    f4 = f14;
                    f3 = (f9 * f16) + f15;
                    f2 = f17;
                }
                if (f2 != 0.0f && f != 0.0f) {
                    zn5 zn5 = xb6.n;
                    if (zn5 == null) {
                        zn5 = zn5.d;
                    }
                    H0();
                    canvas.clipPath(path2);
                    id6 id6 = new id6();
                    K0(id6, dc6.a());
                    id6.a.K = Boolean.FALSE;
                    W(xb6, id6);
                    this.z = id6;
                    sp4 sp42 = ic62.h;
                    Matrix matrix = xb6.r;
                    if (matrix != null) {
                        canvas.concat(matrix);
                        Matrix matrix2 = new Matrix();
                        if (xb6.r.invert(matrix2)) {
                            sp4 sp43 = ic62.h;
                            float f18 = sp43.b;
                            float f19 = sp43.c;
                            float c = sp43.c();
                            z4 = true;
                            sp4 sp44 = ic62.h;
                            z3 = false;
                            float f20 = sp44.c;
                            float c2 = sp44.c();
                            float d2 = ic62.h.d();
                            float f21 = c;
                            sp4 sp45 = ic62.h;
                            f5 = f4;
                            float[] fArr = {f18, f19, f21, f20, c2, d2, sp45.b, sp45.d()};
                            matrix2.mapPoints(fArr);
                            float f22 = fArr[0];
                            float f23 = fArr[1];
                            RectF rectF = new RectF(f22, f23, f22, f23);
                            for (int i = 2; i <= 6; i += 2) {
                                float f24 = fArr[i];
                                if (f24 < rectF.left) {
                                    rectF.left = f24;
                                }
                                if (f24 > rectF.right) {
                                    rectF.right = f24;
                                }
                                float f25 = fArr[i + 1];
                                if (f25 < rectF.top) {
                                    rectF.top = f25;
                                }
                                if (f25 > rectF.bottom) {
                                    rectF.bottom = f25;
                                }
                            }
                            float f26 = rectF.left;
                            float f27 = rectF.top;
                            sp42 = new sp4(f26, f27, rectF.right - f26, rectF.bottom - f27);
                            float floor2 = (((float) Math.floor((double) ((sp42.b - f5) / f2))) * f2) + f5;
                            float c3 = sp42.c();
                            d = sp42.d();
                            sp4 sp46 = new sp4(0.0f, 0.0f, f2, f);
                            t0 = t0();
                            for (floor = (((float) Math.floor((double) ((sp42.c - f3) / f))) * f) + f3; floor < d; floor += f) {
                                float f28 = floor2;
                                while (f28 < c3) {
                                    sp46.b = f28;
                                    sp46.c = floor;
                                    H0();
                                    if (!((id6) this.z).a.K.booleanValue()) {
                                        f6 = d;
                                        f7 = floor2;
                                        C0(sp46.b, sp46.c, sp46.d, sp46.e);
                                    } else {
                                        f6 = d;
                                        f7 = floor2;
                                    }
                                    sp4 sp47 = xb6.o;
                                    if (sp47 != null) {
                                        canvas.concat(B(sp46, sp47, zn5));
                                    } else {
                                        Boolean bool2 = xb6.q;
                                        if (bool2 == null || bool2.booleanValue()) {
                                            z5 = z4;
                                        } else {
                                            z5 = z3;
                                        }
                                        canvas.translate(f28, floor);
                                        if (!z5) {
                                            sp4 sp48 = ic62.h;
                                            canvas.scale(sp48.d, sp48.e);
                                        }
                                    }
                                    for (lc6 w0 : xb6.i) {
                                        w0(w0);
                                    }
                                    G0();
                                    f28 += f2;
                                    d = f6;
                                    floor2 = f7;
                                }
                                float f29 = d;
                                float f30 = floor2;
                            }
                            if (t0) {
                                s0(xb6.h);
                            }
                            G0();
                            return;
                        }
                    }
                    f5 = f4;
                    z4 = true;
                    z3 = false;
                    float floor22 = (((float) Math.floor((double) ((sp42.b - f5) / f2))) * f2) + f5;
                    float c32 = sp42.c();
                    d = sp42.d();
                    sp4 sp462 = new sp4(0.0f, 0.0f, f2, f);
                    t0 = t0();
                    while (floor < d) {
                    }
                    if (t0) {
                    }
                    G0();
                    return;
                }
                return;
            }
        }
        canvas.drawPath(path2, ((id6) this.z).d);
    }

    public void L0(id6 id6, jc6 jc6) {
        boolean z2;
        if (jc6.b == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        dc6 dc6 = id6.a;
        Float valueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        dc6.P = bool;
        if (!z2) {
            bool = Boolean.FALSE;
        }
        dc6.K = bool;
        dc6.L = null;
        dc6.T = null;
        dc6.F = valueOf;
        dc6.R = gb6.x;
        dc6.S = valueOf;
        dc6.U = null;
        dc6.V = null;
        dc6.W = valueOf;
        dc6.X = null;
        dc6.Y = valueOf;
        dc6.h0 = 1;
        dc6 dc62 = jc6.e;
        if (dc62 != null) {
            K0(id6, dc62);
        }
        ArrayList arrayList = ((wg0) ((cf4) this.y).y).b;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = ((wg0) ((cf4) this.y).y).b.iterator();
            while (it.hasNext()) {
                vg0 vg0 = (vg0) it.next();
                if (v.n(vg0.a, jc6)) {
                    K0(id6, vg0.b);
                }
            }
        }
        dc6 dc63 = jc6.f;
        if (dc63 != null) {
            K0(id6, dc63);
        }
    }

    public void M(Path path) {
        id6 id6 = (id6) this.z;
        int i = id6.a.h0;
        Canvas canvas = (Canvas) this.x;
        if (i == 2) {
            Matrix matrix = canvas.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            canvas.setMatrix(new Matrix());
            Shader shader = ((id6) this.z).e.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            canvas.drawPath(path2, ((id6) this.z).e);
            canvas.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        canvas.drawPath(path, id6.e);
    }

    public void M0() {
        int i;
        dc6 dc6 = ((id6) this.z).a;
        mc6 mc6 = dc6.X;
        if (mc6 instanceof gb6) {
            i = ((gb6) mc6).w;
        } else if (mc6 instanceof hb6) {
            i = dc6.G.w;
        } else {
            return;
        }
        Float f = dc6.Y;
        if (f != null) {
            i = F(i, f.floatValue());
        }
        ((Canvas) this.x).drawColor(i);
    }

    public void N(wc6 wc6, z65 z65) {
        boolean z2;
        float f;
        float f2;
        float f3;
        int X;
        float f4;
        if (K()) {
            Iterator it = wc6.i.iterator();
            boolean z3 = true;
            while (it.hasNext()) {
                lc6 lc6 = (lc6) it.next();
                if (lc6 instanceof zc6) {
                    z65.K(I0(((zc6) lc6).c, z3, !it.hasNext()));
                } else if (z65.t((wc6) lc6)) {
                    float f5 = 0.0f;
                    if (lc6 instanceof xc6) {
                        H0();
                        xc6 xc6 = (xc6) lc6;
                        L0((id6) this.z, xc6);
                        if (K() && N0()) {
                            jc6 B2 = xc6.a.B(xc6.n);
                            if (B2 == null) {
                                O("TextPath reference '%s' not found", xc6.n);
                            } else {
                                vb6 vb6 = (vb6) B2;
                                ed6 ed6 = new ed6(vb6.o);
                                Matrix matrix = vb6.n;
                                Path path = ed6.a;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                pb6 pb6 = xc6.o;
                                if (pb6 != null) {
                                    f5 = pb6.b(this, pathMeasure.getLength());
                                }
                                int X2 = X();
                                if (X2 != 1) {
                                    float A2 = A(xc6);
                                    if (X2 == 2) {
                                        A2 /= 2.0f;
                                    }
                                    f5 -= A2;
                                }
                                D(xc6.p);
                                boolean t0 = t0();
                                N(xc6, new fd6(this, path, f5));
                                if (t0) {
                                    s0(xc6.h);
                                }
                            }
                        }
                        G0();
                    } else if (lc6 instanceof tc6) {
                        H0();
                        tc6 tc6 = (tc6) lc6;
                        L0((id6) this.z, tc6);
                        if (K()) {
                            ArrayList arrayList = tc6.n;
                            if (arrayList == null || arrayList.size() <= 0) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            boolean z4 = z65 instanceof gd6;
                            if (z4) {
                                if (!z2) {
                                    f4 = ((gd6) z65).c;
                                } else {
                                    f4 = ((pb6) tc6.n.get(0)).d(this);
                                }
                                ArrayList arrayList2 = tc6.o;
                                if (arrayList2 == null || arrayList2.size() == 0) {
                                    f2 = ((gd6) z65).d;
                                } else {
                                    f2 = ((pb6) tc6.o.get(0)).e(this);
                                }
                                ArrayList arrayList3 = tc6.p;
                                if (arrayList3 == null || arrayList3.size() == 0) {
                                    f = 0.0f;
                                } else {
                                    f = ((pb6) tc6.p.get(0)).d(this);
                                }
                                ArrayList arrayList4 = tc6.q;
                                if (!(arrayList4 == null || arrayList4.size() == 0)) {
                                    f5 = ((pb6) tc6.q.get(0)).e(this);
                                }
                                float f6 = f4;
                                f3 = f5;
                                f5 = f6;
                            } else {
                                f3 = 0.0f;
                                f2 = 0.0f;
                                f = 0.0f;
                            }
                            if (z2 && (X = X()) != 1) {
                                float A3 = A(tc6);
                                if (X == 2) {
                                    A3 /= 2.0f;
                                }
                                f5 -= A3;
                            }
                            D(tc6.r);
                            if (z4) {
                                gd6 gd6 = (gd6) z65;
                                gd6.c = f5 + f;
                                gd6.d = f2 + f3;
                            }
                            boolean t02 = t0();
                            N(tc6, z65);
                            if (t02) {
                                s0(tc6.h);
                            }
                        }
                        G0();
                    } else if (lc6 instanceof sc6) {
                        H0();
                        sc6 sc6 = (sc6) lc6;
                        L0((id6) this.z, sc6);
                        if (K()) {
                            D(sc6.o);
                            jc6 B3 = lc6.a.B(sc6.n);
                            if (B3 == null || !(B3 instanceof wc6)) {
                                O("Tref reference '%s' not found", sc6.n);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                P((wc6) B3, sb);
                                if (sb.length() > 0) {
                                    z65.K(sb.toString());
                                }
                            }
                        }
                        G0();
                    }
                }
                z3 = false;
            }
        }
    }

    public boolean N0() {
        Boolean bool = ((id6) this.z).a.Q;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [x1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v8, types: [ho7, java.lang.Object, java.lang.Runnable] */
    public x1 O0() {
        AtomicLong atomicLong;
        long j;
        int i;
        f0 f0Var;
        fv1 fv1 = fv1.w;
        xn6 xn6 = (xn6) this.C;
        if (xn6.isDone()) {
            return xn6;
        }
        do {
            atomicLong = (AtomicLong) this.y;
            j = atomicLong.get();
            i = (int) (j >>> 32);
        } while (!atomicLong.compareAndSet(j, (((long) (((int) j) + 1)) & 4294967295L) | (((long) i) << 32)));
        ? obj = new Object();
        ListenableFuture listenableFuture = (ListenableFuture) ((AtomicReference) this.A).getAndSet(obj);
        if (listenableFuture == null) {
            kc9 a = mc9.a(new qa(i, 15, this));
            ? obj2 = new Object();
            obj2.E = new go7((ho7) obj2, (ct) a);
            fv1.execute(obj2);
            f0Var = obj2;
        } else {
            nb9 nb9 = new nb9(this, i);
            int i2 = mc9.a;
            f0Var = pt2.a(listenableFuture, Throwable.class, new l99(4, vb9.a(), nb9), (jl6) this.B);
        }
        obj.n(f0Var);
        ob9 ob9 = new ob9(this, i);
        obj.a(new z46(this, obj, false, ob9, 13), fv1);
        return ob9;
    }

    public void P(wc6 wc6, StringBuilder sb) {
        Iterator it = wc6.i.iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            lc6 lc6 = (lc6) it.next();
            if (lc6 instanceof wc6) {
                P((wc6) lc6, sb);
            } else if (lc6 instanceof zc6) {
                sb.append(I0(((zc6) lc6).c, z2, !it.hasNext()));
            }
            z2 = false;
        }
    }

    public void P0(String str) {
        l55.A(pa9.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        l55.A(!pa9.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.z = str;
    }

    public void Q0(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = pa9.a;
        this.B = str;
    }

    public Uri R0() {
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        String str2 = (String) this.y;
        String str3 = (String) this.z;
        Account account = la9.a;
        Account account2 = (Account) this.A;
        if (account2.type.indexOf(58) == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        l55.A(z2, "Account type contains ':'.", new Object[0]);
        if (account2.type.indexOf(47) == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        l55.A(z3, "Account type contains '/'.", new Object[0]);
        if (account2.name.indexOf(47) == -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        l55.A(z4, "Account name contains '/'.", new Object[0]);
        if (la9.a.equals(account2)) {
            str = "shared";
        } else {
            String str4 = account2.type;
            String str5 = account2.name;
            str = f21.m(new StringBuilder(String.valueOf(str4).length() + 1 + String.valueOf(str5).length()), str4, ":", str5);
        }
        String str6 = (String) this.B;
        StringBuilder sb = new StringBuilder(str.length() + str3.length() + str2.length() + 2 + 1 + 1 + String.valueOf(str6).length());
        f21.v(sb, "/", str2, "/", str3);
        return new Uri.Builder().scheme("android").authority((String) this.x).path(pb4.n(sb, "/", str, "/", str6)).encodedFragment(wa9.a(((l93) this.C).e())).build();
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [ho7, com.google.common.util.concurrent.ListenableFuture, java.lang.Object, java.lang.Runnable] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d A[LOOP:2: B:22:0x004d->B:25:0x0059, LOOP_START] */
    public x1 S0(int i) {
        fv1 fv1;
        AtomicLong atomicLong = (AtomicLong) this.y;
        if (((int) (atomicLong.get() >>> 32)) > i) {
            d93 d93 = d93.D;
            if (d93 != null) {
                return d93;
            }
            return new d93();
        }
        pb9 pb9 = new pb9(i);
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.z;
            pb9 pb92 = (pb9) atomicReference.get();
            if (pb92 == null || pb92.D <= i) {
                while (true) {
                    if (atomicReference.compareAndSet(pb92, pb9)) {
                        if (((int) (atomicLong.get() >>> 32)) > i) {
                            pb9.cancel(true);
                            while (!atomicReference.compareAndSet(pb9, (Object) null) && atomicReference.get() == pb9) {
                                while (!atomicReference.compareAndSet(pb9, (Object) null) && atomicReference.get() == pb9) {
                                }
                            }
                            return pb9;
                        }
                        c49 c49 = (c49) this.x;
                        ct ctVar = (ct) c49.x;
                        if (ctVar == null || (fv1 = (fv1) c49.y) == null) {
                            pb9.n((xn6) this.C);
                            return pb9;
                        }
                        kc9 a = mc9.a(ctVar);
                        ? obj = new Object();
                        obj.E = new go7((ho7) obj, (ct) a);
                        fv1.execute(obj);
                        pb9.n(obj);
                        return pb9;
                    } else if (atomicReference.get() != pb92) {
                    }
                }
            } else {
                d93 d932 = d93.D;
                if (d932 != null) {
                    return d932;
                }
                return new d93();
            }
        }
    }

    public List T(st5 st5, li4 li4, boolean z2, boolean z3, Boolean bool, boolean z4) {
        List list;
        rv3 rv3;
        st5 st52 = st5;
        v16 w2 = su0.w(st52, z2, z3, bool, z4, (rg4) this.x, (rk4) this.C);
        if (w2 == null) {
            if (st52 instanceof qt5) {
                sy6 sy6 = (sy6) ((qt5) st52).d;
                if (sy6 instanceof rv3) {
                    rv3 = (rv3) sy6;
                } else {
                    rv3 = null;
                }
                if (rv3 != null) {
                    w2 = rv3.w;
                }
            }
            w2 = null;
        }
        if (w2 == null || (list = (List) ((sm) ((fb4) this.y).y(w2)).a.get(li4)) == null) {
            return a42.w;
        }
        return list;
    }

    public id6 V(jc6 jc6) {
        id6 id6 = new id6();
        K0(id6, dc6.a());
        W(jc6, id6);
        return id6;
    }

    public void W(lc6 lc6, id6 id6) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (lc6 instanceof jc6) {
                arrayList.add(0, (jc6) lc6);
            }
            hc6 hc6 = lc6.b;
            if (hc6 == null) {
                break;
            }
            lc6 = (lc6) hc6;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            L0(id6, (jc6) it.next());
        }
        id6 id62 = (id6) this.z;
        id6.g = id62.g;
        id6.f = id62.f;
    }

    public int X() {
        int i;
        dc6 dc6 = ((id6) this.z).a;
        if (dc6.e0 == 1 || (i = dc6.f0) == 2) {
            return dc6.f0;
        }
        if (i == 1) {
            return 3;
        }
        return 1;
    }

    public s75 Z(Class cls) {
        return q(av5.a(cls));
    }

    public Object a(Class cls) {
        if (((Set) this.x).contains(av5.a(cls))) {
            Object a = ((tv0) this.C).a(cls);
            if (!cls.equals(tu5.class)) {
                return a;
            }
            tu5 tu5 = (tu5) a;
            return new Object();
        }
        ku4.r(cls, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    public List b(st5 st5, k2 k2Var, int i) {
        int i2;
        k2Var.getClass();
        if (i != 0) {
            if (k2Var instanceof wr5) {
                i2 = ((wr5) k2Var).z;
            } else if (k2Var instanceof js5) {
                i2 = ((js5) k2Var).z;
            } else if (k2Var instanceof qs5) {
                qs5 qs5 = (qs5) k2Var;
                int B2 = b81.B(i);
                if (B2 != 2) {
                    if (B2 != 3) {
                        i2 = qs5.z;
                    } else if ((qs5.y & 512) == 512) {
                        i2 = qs5.N;
                    } else {
                        i2 = qs5.z;
                    }
                } else if ((qs5.y & 256) == 256) {
                    i2 = qs5.M;
                } else {
                    i2 = qs5.z;
                }
            } else {
                i2 = 0;
            }
            if (wg2.c.e(i2).booleanValue()) {
                if (i == 2) {
                    return k0(st5, (qs5) k2Var, e0.w);
                }
                li4 Y = Y(k2Var, (vq4) st5.b, (wv1) st5.c, i, false);
                if (Y != null) {
                    return U(this, st5, Y, (Boolean) null, false, 60);
                }
            }
            return a42.w;
        }
        throw null;
    }

    public Object c(st5 st5, qs5 qs5, vw3 vw3) {
        qs5.getClass();
        return i0(st5, qs5, 3, vw3, c0.x);
    }

    public ColorStateList c0(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return ag8.r(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return ag8.r(context, R.color.abc_tint_switch_track);
        }
        if (i == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList d = eh7.d(context, R.attr.colorSwitchThumbNormal);
            if (d == null || !d.isStateful()) {
                iArr[0] = eh7.b;
                iArr2[0] = eh7.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = eh7.e;
                iArr2[1] = eh7.c(context, R.attr.colorControlActivated);
                iArr[2] = eh7.f;
                iArr2[2] = eh7.c(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = eh7.b;
                iArr[0] = iArr3;
                iArr2[0] = d.getColorForState(iArr3, 0);
                iArr[1] = eh7.e;
                iArr2[1] = eh7.c(context, R.attr.colorControlActivated);
                iArr[2] = eh7.f;
                iArr2[2] = d.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
            return I(context, eh7.c(context, R.attr.colorButtonNormal));
        } else {
            if (i == R.drawable.abc_btn_borderless_material) {
                return I(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return I(context, eh7.c(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return ag8.r(context, R.color.abc_tint_spinner);
            }
            if (w((int[]) this.y, i)) {
                return eh7.d(context, R.attr.colorControlNormal);
            }
            if (w((int[]) this.B, i)) {
                return ag8.r(context, R.color.abc_tint_default);
            }
            if (w((int[]) this.C, i)) {
                return ag8.r(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return ag8.r(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
    }

    public Set d(av5 av5) {
        if (((Set) this.A).contains(av5)) {
            return ((tv0) this.C).d(av5);
        }
        ku4.r(av5, ">.", "Attempting to request an undeclared dependency Set<");
        return null;
    }

    public boolean d0(gq0 gq0) {
        v16 q;
        if (!(gq0.e() == null || !sg3.e(gq0.f().b(), "Container") || (q = b96.q((rg4) this.x, gq0, (rk4) this.C)) == null)) {
            LinkedHashSet linkedHashSet = nz6.a;
            Class cls = q.a;
            cls.getClass();
            Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
            declaredAnnotations.getClass();
            boolean z2 = false;
            for (Annotation annotation : declaredAnnotations) {
                annotation.getClass();
                if (m06.a(kl8.u(kl8.p(annotation))).equals(mn3.b)) {
                    z2 = true;
                }
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public List e(st5 st5, k2 k2Var, int i, int i2, jt5 jt5) {
        int i3;
        k2Var.getClass();
        if (i != 0) {
            if (jt5 != null) {
                i3 = jt5.z;
            } else {
                i3 = 0;
            }
            if (!wg2.c.e(i3).booleanValue()) {
                return a42.w;
            }
            return j0(st5, k2Var, i, i2);
        }
        throw null;
    }

    public List f(st5 st5, qs5 qs5) {
        qs5.getClass();
        if (!wg2.c.e(qs5.z).booleanValue()) {
            return a42.w;
        }
        return k0(st5, qs5, e0.y);
    }

    public wc3 f0() {
        u51 u51;
        Context context;
        AssetManager assetManager;
        ej5 ej5 = ej5.a;
        ej5 ej52 = ej5.a;
        if (ej52 != null) {
            u51 = (u51) ej52;
        } else {
            u51 = null;
        }
        if (u51 != null) {
            context = u51.b();
        } else {
            context = null;
        }
        if (context != null) {
            assetManager = context.getAssets();
        } else {
            assetManager = null;
        }
        if (assetManager != null) {
            InputStream open = assetManager.open((String) this.C);
            open.getClass();
            return j45.q(open);
        } else if (Build.FINGERPRINT == null) {
            rf2.i("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            return null;
        } else {
            rf2.i("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
            return null;
        }
    }

    public List g(st5 st5, k2 k2Var, int i) {
        int i2;
        k2Var.getClass();
        if (i != 0) {
            if (k2Var instanceof js5) {
                i2 = ((js5) k2Var).K.size();
            } else if (k2Var instanceof qs5) {
                i2 = ((qs5) k2Var).K.size();
            } else {
                i2 = 0;
            }
            return j0(st5, k2Var, i, i2);
        }
        throw null;
    }

    public cw0 g0(gq0 gq0, sy6 sy6, List list) {
        list.getClass();
        return new cw0(this, r16.B((tl4) this.z, gq0, (am6) this.A), gq0, list, sy6);
    }

    public nu5 h(Class cls) {
        return r(av5.a(cls));
    }

    public cw0 h0(gq0 gq0, k06 k06, List list) {
        list.getClass();
        if (nz6.a.contains(gq0)) {
            return null;
        }
        return g0(gq0, k06, list);
    }

    public List i(st5 st5, k2 k2Var, int i, int i2, jt5 jt5) {
        k2Var.getClass();
        if (i != 0) {
            int i3 = jt5.z;
            d0 d0Var = new d0(this, st5, k2Var, i, i2);
            if (!wg2.c.e(i3).booleanValue()) {
                return a42.w;
            }
            return (List) d0Var.b();
        }
        throw null;
    }

    public Object i0(st5 st5, qs5 qs5, int i, vw3 vw3, gs2 gs2) {
        Object H;
        rv3 rv3;
        st5 st52 = st5;
        v16 w2 = su0.w(st52, true, true, wg2.D.e(qs5.z), rp3.d(qs5), (rg4) this.x, (rk4) this.C);
        if (w2 == null) {
            if (st52 instanceof qt5) {
                sy6 sy6 = (sy6) ((qt5) st52).d;
                if (sy6 instanceof rv3) {
                    rv3 = (rv3) sy6;
                } else {
                    rv3 = null;
                }
                if (rv3 != null) {
                    w2 = rv3.w;
                }
            }
            w2 = null;
        }
        if (w2 != null) {
            rk4 rk4 = w2.b.b;
            rk4 rk42 = kt1.e;
            rk42.getClass();
            li4 Y = Y(qs5, (vq4) st52.b, (wv1) st52.c, i, rk4.a(rk42.b, rk42.c, rk42.d));
            if (!(Y == null || (H = gs2.H(((fb4) this.y).y(w2), Y)) == null)) {
                if (zt7.a(vw3)) {
                    H = (e21) H;
                    if (H instanceof eg0) {
                        return new kr7(((Number) ((eg0) H).a).byteValue());
                    }
                    if (H instanceof os6) {
                        return new kr7(((Number) ((os6) H).a).shortValue());
                    }
                    if (H instanceof ye3) {
                        return new kr7(((Number) ((ye3) H).a).intValue());
                    }
                    if (H instanceof wc4) {
                        return new kr7(((Number) ((wc4) H).a).longValue());
                    }
                }
                return H;
            }
        }
        return null;
    }

    public ArrayList j(bt5 bt5, vq4 vq4) {
        bt5.getClass();
        vq4.getClass();
        List<qr5> list = bt5.N;
        list.getClass();
        ArrayList arrayList = new ArrayList(et0.e0(list, 10));
        for (qr5 qr5 : list) {
            qr5.getClass();
            arrayList.add(((qc3) this.B).v(qr5, vq4));
        }
        return arrayList;
    }

    public List j0(st5 st5, k2 k2Var, int i, int i2) {
        li4 Y = Y(k2Var, (vq4) st5.b, (wv1) st5.c, i, false);
        if (Y == null) {
            return a42.w;
        }
        return U(this, st5, new li4(Y.a + '@' + i2), (Boolean) null, false, 60);
    }

    public Object k(st5 st5, qs5 qs5, vw3 vw3) {
        qs5.getClass();
        return i0(st5, qs5, 2, vw3, c0.y);
    }

    public List k0(st5 st5, qs5 qs5, e0 e0Var) {
        wv1 wv1 = (wv1) st5.c;
        Boolean k = wg2.D.e(qs5.z);
        boolean d = rp3.d(qs5);
        vq4 vq4 = (vq4) st5.b;
        if (e0Var == e0.w) {
            li4 u = we.u(qs5, vq4, wv1, 40);
            if (u != null) {
                return U(this, st5, u, k, d, 8);
            }
        } else {
            st5 st52 = st5;
            li4 u2 = we.u(qs5, vq4, wv1, 48);
            if (u2 != null) {
                boolean z2 = false;
                boolean x0 = d57.x0(u2.a, "$delegate", false);
                if (e0Var == e0.y) {
                    z2 = true;
                }
                if (x0 == z2) {
                    return T(st52, u2, true, true, k, d);
                }
            }
        }
        return a42.w;
    }

    public ArrayList l(gt5 gt5, vq4 vq4) {
        gt5.getClass();
        vq4.getClass();
        List<qr5> list = gt5.G;
        list.getClass();
        ArrayList arrayList = new ArrayList(et0.e0(list, 10));
        for (qr5 qr5 : list) {
            qr5.getClass();
            arrayList.add(((qc3) this.B).v(qr5, vq4));
        }
        return arrayList;
    }

    public Path l0(eb6 eb6) {
        float f;
        eb6 eb62 = eb6;
        pb6 pb6 = eb62.o;
        float f2 = 0.0f;
        if (pb6 != null) {
            f = pb6.d(this);
        } else {
            f = 0.0f;
        }
        pb6 pb62 = eb62.p;
        if (pb62 != null) {
            f2 = pb62.e(this);
        }
        float f3 = f2;
        float a = eb62.q.a(this);
        float f4 = f - a;
        float f5 = f3 - a;
        float f6 = f + a;
        float f7 = f3 + a;
        if (eb62.h == null) {
            float f8 = 2.0f * a;
            eb62.h = new sp4(f4, f5, f8, f8);
        }
        float f9 = a * 0.5522848f;
        Path path = new Path();
        path.moveTo(f, f5);
        float f10 = f + f9;
        float f11 = f3 - f9;
        float f12 = f5;
        path.cubicTo(f10, f12, f6, f11, f6, f3);
        float f13 = f12;
        float f14 = f11;
        float f15 = f3 + f9;
        float f16 = f7;
        path.cubicTo(f6, f15, f10, f16, f, f7);
        float f17 = f - f9;
        float f18 = f4;
        path.cubicTo(f17, f16, f18, f15, f4, f3);
        path.cubicTo(f18, f14, f17, f13, f, f13);
        path.close();
        return path;
    }

    public List m(st5 st5, es5 es5) {
        st5.getClass();
        String string = ((vq4) st5.b).getString(es5.z);
        String b = kq0.b(((qt5) st5).g.b());
        return U(this, st5, new li4(string + '#' + b), (Boolean) null, false, 60);
    }

    public Path m0(jb6 jb6) {
        float f;
        jb6 jb62 = jb6;
        pb6 pb6 = jb62.o;
        float f2 = 0.0f;
        if (pb6 != null) {
            f = pb6.d(this);
        } else {
            f = 0.0f;
        }
        pb6 pb62 = jb62.p;
        if (pb62 != null) {
            f2 = pb62.e(this);
        }
        float f3 = f2;
        float d = jb62.q.d(this);
        float e = jb62.r.e(this);
        float f4 = f - d;
        float f5 = f3 - e;
        float f6 = f + d;
        float f7 = f3 + e;
        if (jb62.h == null) {
            jb62.h = new sp4(f4, f5, d * 2.0f, 2.0f * e);
        }
        float f8 = d * 0.5522848f;
        float f9 = e * 0.5522848f;
        Path path = new Path();
        path.moveTo(f, f5);
        float f10 = f + f8;
        float f11 = f3 - f9;
        float f12 = f5;
        path.cubicTo(f10, f12, f6, f11, f6, f3);
        float f13 = f12;
        float f14 = f11;
        float f15 = f3 + f9;
        float f16 = f7;
        Path path2 = path;
        path2.cubicTo(f6, f15, f10, f16, f, f16);
        float f17 = f - f8;
        float f18 = f4;
        path2.cubicTo(f17, f16, f18, f15, f4, f3);
        path2.cubicTo(f18, f14, f17, f13, f, f13);
        path2.close();
        return path2;
    }

    public nu5 n(av5 av5) {
        if (((Set) this.B).contains(av5)) {
            return ((tv0) this.C).n(av5);
        }
        ku4.r(av5, ">>.", "Attempting to request an undeclared dependency Provider<Set<");
        return null;
    }

    public List o(st5 st5, qs5 qs5) {
        qs5.getClass();
        if (!wg2.c.e(qs5.z).booleanValue()) {
            return a42.w;
        }
        return k0(st5, qs5, e0.x);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0081  */
    public Path o0(ac6 ac6) {
        float f;
        float f2;
        float min;
        float min2;
        pb6 pb6;
        float f3;
        pb6 pb62;
        float f4;
        ac6 ac62 = ac6;
        pb6 pb63 = ac62.s;
        if (pb63 == null && ac62.t == null) {
            f2 = 0.0f;
        } else {
            pb6 pb64 = ac62.t;
            if (pb63 == null) {
                f2 = pb64.e(this);
            } else if (pb64 == null) {
                f2 = pb63.d(this);
            } else {
                f2 = pb63.d(this);
                f = ac62.t.e(this);
                min = Math.min(f2, ac62.q.d(this) / 2.0f);
                min2 = Math.min(f, ac62.r.e(this) / 2.0f);
                pb6 = ac62.o;
                if (pb6 == null) {
                    f3 = pb6.d(this);
                } else {
                    f3 = 0.0f;
                }
                pb62 = ac62.p;
                if (pb62 == null) {
                    f4 = pb62.e(this);
                } else {
                    f4 = 0.0f;
                }
                float d = ac62.q.d(this);
                float e = ac62.r.e(this);
                if (ac62.h == null) {
                    ac62.h = new sp4(f3, f4, d, e);
                }
                float f5 = d + f3;
                float f6 = f4 + e;
                Path path = new Path();
                if (min == 0.0f || min2 == 0.0f) {
                    float f7 = f5;
                    path.moveTo(f3, f4);
                    path.lineTo(f7, f4);
                    path.lineTo(f7, f6);
                    path.lineTo(f3, f6);
                    path.lineTo(f3, f4);
                } else {
                    float f8 = min * 0.5522848f;
                    float f9 = 0.5522848f * min2;
                    float f10 = f4 + min2;
                    path.moveTo(f3, f10);
                    float f11 = f10 - f9;
                    float f12 = f3 + min;
                    float f13 = f12 - f8;
                    path.cubicTo(f3, f11, f13, f4, f12, f4);
                    float f14 = f13;
                    float f15 = f12;
                    float f16 = f5 - min;
                    path.lineTo(f16, f4);
                    float f17 = f16 + f8;
                    float f18 = f5;
                    path.cubicTo(f17, f4, f18, f11, f5, f10);
                    float f19 = f6 - min2;
                    path.lineTo(f18, f19);
                    float f20 = f19 + f9;
                    float f21 = f18;
                    Path path2 = path;
                    path2.cubicTo(f21, f20, f17, f6, f16, f6);
                    path.lineTo(f15, f6);
                    float f22 = f3;
                    path.cubicTo(f14, f6, f22, f20, f3, f19);
                    path.lineTo(f22, f10);
                }
                path.close();
                return path;
            }
        }
        f = f2;
        min = Math.min(f2, ac62.q.d(this) / 2.0f);
        min2 = Math.min(f, ac62.r.e(this) / 2.0f);
        pb6 = ac62.o;
        if (pb6 == null) {
        }
        pb62 = ac62.p;
        if (pb62 == null) {
        }
        float d2 = ac62.q.d(this);
        float e2 = ac62.r.e(this);
        if (ac62.h == null) {
        }
        float f52 = d2 + f3;
        float f62 = f4 + e2;
        Path path3 = new Path();
        if (min == 0.0f || min2 == 0.0f) {
        }
        path3.close();
        return path3;
    }

    public sp4 p0(pb6 pb6, pb6 pb62, pb6 pb63, pb6 pb64) {
        float f;
        float f2;
        float f3;
        float f4 = 0.0f;
        if (pb6 != null) {
            f = pb6.d(this);
        } else {
            f = 0.0f;
        }
        if (pb62 != null) {
            f4 = pb62.e(this);
        }
        id6 id6 = (id6) this.z;
        sp4 sp4 = id6.g;
        if (sp4 == null) {
            sp4 = id6.f;
        }
        if (pb63 != null) {
            f2 = pb63.d(this);
        } else {
            f2 = sp4.d;
        }
        if (pb64 != null) {
            f3 = pb64.e(this);
        } else {
            f3 = sp4.e;
        }
        return new sp4(f, f4, f2, f3);
    }

    public s75 q(av5 av5) {
        if (((Set) this.z).contains(av5)) {
            return ((tv0) this.C).q(av5);
        }
        ku4.r(av5, ">.", "Attempting to request an undeclared dependency Deferred<");
        return null;
    }

    public o9 q0() {
        o9 o9Var = new o9(false);
        o9Var.x = (g73) this.x;
        o9Var.y = (String) this.y;
        o9Var.A = (f56) this.A;
        o9Var.B = (jb5) this.B;
        o9Var.z = ((bz2) this.z).k();
        return o9Var;
    }

    public nu5 r(av5 av5) {
        if (((Set) this.y).contains(av5)) {
            return ((tv0) this.C).r(av5);
        }
        ku4.r(av5, ">.", "Attempting to request an undeclared dependency Provider<");
        return null;
    }

    public Path r0(ic6 ic6, boolean z2) {
        Path path;
        Path y2;
        float f;
        float f2;
        float f3;
        Path path2;
        Path.FillType fillType;
        Path.FillType fillType2;
        ((Stack) this.A).push((id6) this.z);
        id6 id6 = new id6((id6) this.z);
        this.z = id6;
        L0(id6, ic6);
        if (!K() || !N0()) {
            this.z = (id6) ((Stack) this.A).pop();
            return null;
        }
        if (ic6 instanceof ad6) {
            if (!z2) {
                O("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            ad6 ad6 = (ad6) ic6;
            jc6 B2 = ic6.a.B(ad6.o);
            if (B2 == null) {
                O("Use reference '%s' not found", ad6.o);
                this.z = (id6) ((Stack) this.A).pop();
                return null;
            } else if (!(B2 instanceof ic6)) {
                this.z = (id6) ((Stack) this.A).pop();
                return null;
            } else {
                path = r0((ic6) B2, false);
                if (path != null) {
                    if (ad6.h == null) {
                        ad6.h = z(path);
                    }
                    Matrix matrix = ad6.n;
                    if (matrix != null) {
                        path.transform(matrix);
                    }
                    if (!(((id6) this.z).a.T == null || (y2 = y(ic6, ic6.h)) == null)) {
                        path.op(y2, Path.Op.INTERSECT);
                    }
                    this.z = (id6) ((Stack) this.A).pop();
                    return path;
                }
            }
        } else {
            if (ic6 instanceof lb6) {
                lb6 lb6 = (lb6) ic6;
                if (ic6 instanceof vb6) {
                    ed6 ed6 = new ed6(((vb6) ic6).o);
                    sp4 sp4 = ic6.h;
                    Path path3 = ed6.a;
                    if (sp4 == null) {
                        ic6.h = z(path3);
                    }
                    path2 = path3;
                } else if (ic6 instanceof ac6) {
                    path2 = o0((ac6) ic6);
                } else if (ic6 instanceof eb6) {
                    path2 = l0((eb6) ic6);
                } else if (ic6 instanceof jb6) {
                    path2 = m0((jb6) ic6);
                } else if (ic6 instanceof yb6) {
                    path2 = n0((yb6) ic6);
                } else {
                    path2 = null;
                }
                if (path2 != null) {
                    if (lb6.h == null) {
                        lb6.h = z(path2);
                    }
                    Matrix matrix2 = lb6.n;
                    if (matrix2 != null) {
                        path2.transform(matrix2);
                    }
                    int i = ((id6) this.z).a.g0;
                    if (i == 0 || i != 2) {
                        fillType2 = Path.FillType.WINDING;
                    } else {
                        fillType2 = Path.FillType.EVEN_ODD;
                    }
                    path2.setFillType(fillType2);
                }
            } else if (ic6 instanceof uc6) {
                uc6 uc6 = (uc6) ic6;
                ArrayList arrayList = uc6.n;
                float f4 = 0.0f;
                if (arrayList == null || arrayList.size() == 0) {
                    f = 0.0f;
                } else {
                    f = ((pb6) uc6.n.get(0)).d(this);
                }
                ArrayList arrayList2 = uc6.o;
                if (arrayList2 == null || arrayList2.size() == 0) {
                    f2 = 0.0f;
                } else {
                    f2 = ((pb6) uc6.o.get(0)).e(this);
                }
                ArrayList arrayList3 = uc6.p;
                if (arrayList3 == null || arrayList3.size() == 0) {
                    f3 = 0.0f;
                } else {
                    f3 = ((pb6) uc6.p.get(0)).d(this);
                }
                ArrayList arrayList4 = uc6.q;
                if (!(arrayList4 == null || arrayList4.size() == 0)) {
                    f4 = ((pb6) uc6.q.get(0)).e(this);
                }
                if (((id6) this.z).a.f0 != 1) {
                    float A2 = A(uc6);
                    if (((id6) this.z).a.f0 == 2) {
                        A2 /= 2.0f;
                    }
                    f -= A2;
                }
                if (uc6.h == null) {
                    hd6 hd6 = new hd6(this, f, f2);
                    N(uc6, hd6);
                    Object obj = hd6.g;
                    RectF rectF = (RectF) obj;
                    uc6.h = new sp4(rectF.left, rectF.top, rectF.width(), ((RectF) obj).height());
                }
                path2 = new Path();
                N(uc6, new hd6(this, f + f3, f2 + f4, path2));
                Matrix matrix3 = uc6.r;
                if (matrix3 != null) {
                    path2.transform(matrix3);
                }
                int i2 = ((id6) this.z).a.g0;
                if (i2 == 0 || i2 != 2) {
                    fillType = Path.FillType.WINDING;
                } else {
                    fillType = Path.FillType.EVEN_ODD;
                }
                path2.setFillType(fillType);
            } else {
                O("Invalid %s element found in clipPath definition", ic6.o());
                return null;
            }
            path = path2;
            path.op(y2, Path.Op.INTERSECT);
            this.z = (id6) ((Stack) this.A).pop();
            return path;
        }
        return null;
    }

    public Object s(av5 av5) {
        if (((Set) this.x).contains(av5)) {
            return ((tv0) this.C).s(av5);
        }
        ku4.r(av5, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    public void s0(sp4 sp4) {
        Canvas canvas = (Canvas) this.x;
        if (((id6) this.z).a.U != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer((RectF) null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer((RectF) null, paint2, 31);
            sb6 sb6 = (sb6) ((cf4) this.y).B(((id6) this.z).a.U);
            A0(sb6, sp4);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer((RectF) null, paint3, 31);
            A0(sb6, sp4);
            canvas.restore();
            canvas.restore();
        }
        G0();
    }

    public List t(qt5 qt5) {
        rv3 rv3;
        v16 v16;
        qt5.getClass();
        if (!wg2.c.e(qt5.e.z).booleanValue()) {
            return a42.w;
        }
        sy6 sy6 = (sy6) qt5.d;
        if (sy6 instanceof rv3) {
            rv3 = (rv3) sy6;
        } else {
            rv3 = null;
        }
        if (rv3 != null) {
            v16 = rv3.w;
        } else {
            v16 = null;
        }
        if (v16 != null) {
            ArrayList arrayList = new ArrayList(1);
            Class cls = v16.a;
            cls.getClass();
            Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
            declaredAnnotations.getClass();
            for (Annotation annotation : declaredAnnotations) {
                annotation.getClass();
                Class u = kl8.u(kl8.p(annotation));
                cw0 h0 = h0(m06.a(u), new k06(annotation), arrayList);
                if (h0 != null) {
                    ya5.p(h0, annotation, u);
                }
            }
            return arrayList;
        }
        ku4.x("Class for loading annotations is not found: ", qt5.g.a());
        return null;
    }

    public boolean t0() {
        jc6 B2;
        int i = 0;
        if (((id6) this.z).a.F.floatValue() >= 1.0f && ((id6) this.z).a.U == null) {
            return false;
        }
        Canvas canvas = (Canvas) this.x;
        int floatValue = (int) (((id6) this.z).a.F.floatValue() * 256.0f);
        if (floatValue >= 0) {
            i = 255;
            if (floatValue <= 255) {
                i = floatValue;
            }
        }
        canvas.saveLayerAlpha((RectF) null, i, 31);
        ((Stack) this.A).push((id6) this.z);
        id6 id6 = new id6((id6) this.z);
        this.z = id6;
        String str = id6.a.U;
        if (str != null && ((B2 = ((cf4) this.y).B(str)) == null || !(B2 instanceof sb6))) {
            O("Mask reference '%s' not found", ((id6) this.z).a.U);
            ((id6) this.z).a.U = null;
        }
        return true;
    }

    public String toString() {
        switch (this.w) {
            case 7:
                jb5 jb5 = (jb5) this.B;
                StringBuilder sb = new StringBuilder(32);
                sb.append("Request{method=");
                sb.append((String) this.y);
                sb.append(", url=");
                sb.append((g73) this.x);
                bz2 bz2 = (bz2) this.z;
                if (bz2.size() != 0) {
                    sb.append(", headers=[");
                    int i = 0;
                    for (Object next : bz2) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            yb5 yb5 = (yb5) next;
                            String str = (String) yb5.w;
                            String str2 = (String) yb5.x;
                            if (i > 0) {
                                sb.append(", ");
                            }
                            sb.append(str);
                            sb.append(':');
                            if (dg8.k(str)) {
                                str2 = "██";
                            }
                            sb.append(str2);
                            i = i2;
                        } else {
                            sg3.Z();
                            throw null;
                        }
                    }
                    sb.append(']');
                }
                if (!sg3.e(jb5, h42.d)) {
                    sb.append(", tags=");
                    sb.append(jb5);
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        defpackage.ed1.i(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        throw r2;
     */
    public void u0() {
        try {
            zw5 zw5 = new zw5(f0());
            dg0 q = zw5.q((long) zw5.readInt());
            dg0 q2 = zw5.q((long) zw5.readInt());
            zw5.close();
            synchronized (this) {
                q.getClass();
                this.z = q;
                q2.getClass();
                this.A = q2;
            }
            ((CountDownLatch) this.y).countDown();
        } catch (Throwable th) {
            ((CountDownLatch) this.y).countDown();
            throw th;
        }
    }

    public void v0(ec6 ec6, sp4 sp4, sp4 sp42, zn5 zn5) {
        if (sp4.d != 0.0f && sp4.e != 0.0f) {
            if (zn5 == null && (zn5 = ec6.n) == null) {
                zn5 = zn5.d;
            }
            L0((id6) this.z, ec6);
            if (K()) {
                id6 id6 = (id6) this.z;
                id6.f = sp4;
                if (!id6.a.K.booleanValue()) {
                    sp4 sp43 = ((id6) this.z).f;
                    C0(sp43.b, sp43.c, sp43.d, sp43.e);
                }
                C(ec6, ((id6) this.z).f);
                Canvas canvas = (Canvas) this.x;
                id6 id62 = (id6) this.z;
                if (sp42 != null) {
                    canvas.concat(B(id62.f, sp42, zn5));
                    ((id6) this.z).g = ec6.o;
                } else {
                    sp4 sp44 = id62.f;
                    canvas.translate(sp44.b, sp44.c);
                }
                boolean t0 = t0();
                M0();
                x0(ec6, true);
                if (t0) {
                    s0(ec6.h);
                }
                J0(ec6);
            }
        }
    }

    public void w0(lc6 lc6) {
        float f;
        float f2;
        float f3;
        Path.FillType fillType;
        float f4;
        float f5;
        float f6;
        Path.FillType fillType2;
        pb6 pb6;
        String str;
        float f7;
        float f8;
        int indexOf;
        Set b;
        pb6 pb62;
        float f9;
        float f10;
        Boolean bool;
        if (!(lc6 instanceof tb6)) {
            H0();
            if ((lc6 instanceof jc6) && (bool = ((jc6) lc6).d) != null) {
                ((id6) this.z).h = bool.booleanValue();
            }
            if (lc6 instanceof ec6) {
                ec6 ec6 = (ec6) lc6;
                v0(ec6, p0(ec6.p, ec6.q, ec6.r, ec6.s), ec6.o, ec6.n);
            } else {
                Bitmap bitmap = null;
                float f11 = 0.0f;
                if (lc6 instanceof ad6) {
                    ad6 ad6 = (ad6) lc6;
                    Canvas canvas = (Canvas) this.x;
                    pb6 pb63 = ad6.r;
                    if ((pb63 == null || !pb63.g()) && ((pb62 = ad6.s) == null || !pb62.g())) {
                        L0((id6) this.z, ad6);
                        if (K()) {
                            jc6 B2 = ad6.a.B(ad6.o);
                            if (B2 == null) {
                                O("Use reference '%s' not found", ad6.o);
                            } else {
                                Matrix matrix = ad6.n;
                                if (matrix != null) {
                                    canvas.concat(matrix);
                                }
                                pb6 pb64 = ad6.p;
                                if (pb64 != null) {
                                    f9 = pb64.d(this);
                                } else {
                                    f9 = 0.0f;
                                }
                                pb6 pb65 = ad6.q;
                                if (pb65 != null) {
                                    f10 = pb65.e(this);
                                } else {
                                    f10 = 0.0f;
                                }
                                canvas.translate(f9, f10);
                                C(ad6, ad6.h);
                                boolean t0 = t0();
                                ((Stack) this.B).push(ad6);
                                ((Stack) this.C).push(((Canvas) this.x).getMatrix());
                                if (B2 instanceof ec6) {
                                    ec6 ec62 = (ec6) B2;
                                    sp4 p0 = p0((pb6) null, (pb6) null, ad6.r, ad6.s);
                                    H0();
                                    v0(ec62, p0, ec62.o, ec62.n);
                                    G0();
                                } else if (B2 instanceof rc6) {
                                    pb6 pb66 = ad6.r;
                                    if (pb66 == null) {
                                        pb66 = new pb6(9, 100.0f);
                                    }
                                    pb6 pb67 = ad6.s;
                                    if (pb67 == null) {
                                        pb67 = new pb6(9, 100.0f);
                                    }
                                    sp4 p02 = p0((pb6) null, (pb6) null, pb66, pb67);
                                    H0();
                                    rc6 rc6 = (rc6) B2;
                                    if (!(p02.d == 0.0f || p02.e == 0.0f)) {
                                        zn5 zn5 = rc6.n;
                                        if (zn5 == null) {
                                            zn5 = zn5.d;
                                        }
                                        L0((id6) this.z, rc6);
                                        id6 id6 = (id6) this.z;
                                        id6.f = p02;
                                        if (!id6.a.K.booleanValue()) {
                                            sp4 sp4 = ((id6) this.z).f;
                                            C0(sp4.b, sp4.c, sp4.d, sp4.e);
                                        }
                                        sp4 sp42 = rc6.o;
                                        id6 id62 = (id6) this.z;
                                        if (sp42 != null) {
                                            canvas.concat(B(id62.f, sp42, zn5));
                                            ((id6) this.z).g = rc6.o;
                                        } else {
                                            sp4 sp43 = id62.f;
                                            canvas.translate(sp43.b, sp43.c);
                                        }
                                        boolean t02 = t0();
                                        x0(rc6, true);
                                        if (t02) {
                                            s0(rc6.h);
                                        }
                                        J0(rc6);
                                    }
                                    G0();
                                } else {
                                    w0(B2);
                                }
                                ((Stack) this.B).pop();
                                ((Stack) this.C).pop();
                                if (t0) {
                                    s0(ad6.h);
                                }
                                J0(ad6);
                            }
                        }
                    }
                } else if (lc6 instanceof qc6) {
                    qc6 qc6 = (qc6) lc6;
                    L0((id6) this.z, qc6);
                    if (K()) {
                        Matrix matrix2 = qc6.n;
                        if (matrix2 != null) {
                            ((Canvas) this.x).concat(matrix2);
                        }
                        C(qc6, qc6.h);
                        boolean t03 = t0();
                        String language = Locale.getDefault().getLanguage();
                        Iterator it = qc6.i.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            lc6 lc62 = (lc6) it.next();
                            if (lc62 instanceof fc6) {
                                fc6 fc6 = (fc6) lc62;
                                if (fc6.c() == null && ((b = fc6.b()) == null || (!b.isEmpty() && b.contains(language)))) {
                                    Set g = fc6.g();
                                    if (g != null) {
                                        if (D == null) {
                                            synchronized (kd6.class) {
                                                HashSet hashSet = new HashSet();
                                                D = hashSet;
                                                hashSet.add("Structure");
                                                D.add("BasicStructure");
                                                D.add("ConditionalProcessing");
                                                D.add("Image");
                                                D.add("Style");
                                                D.add("ViewportAttribute");
                                                D.add("Shape");
                                                D.add("BasicText");
                                                D.add("PaintAttribute");
                                                D.add("BasicPaintAttribute");
                                                D.add("OpacityAttribute");
                                                D.add("BasicGraphicsAttribute");
                                                D.add("Marker");
                                                D.add("Gradient");
                                                D.add("Pattern");
                                                D.add("Clip");
                                                D.add("BasicClip");
                                                D.add("Mask");
                                                D.add("View");
                                            }
                                        }
                                        if (g.isEmpty()) {
                                            continue;
                                        } else if (!D.containsAll(g)) {
                                            continue;
                                        }
                                    }
                                    Set m = fc6.m();
                                    if (m == null) {
                                        Set n = fc6.n();
                                        if (n == null) {
                                            w0(lc62);
                                            break;
                                        }
                                        n.isEmpty();
                                    } else {
                                        m.isEmpty();
                                    }
                                }
                            }
                        }
                        if (t03) {
                            s0(qc6.h);
                        }
                        J0(qc6);
                    }
                } else if (lc6 instanceof mb6) {
                    mb6 mb6 = (mb6) lc6;
                    L0((id6) this.z, mb6);
                    if (K()) {
                        Matrix matrix3 = mb6.n;
                        if (matrix3 != null) {
                            ((Canvas) this.x).concat(matrix3);
                        }
                        C(mb6, mb6.h);
                        boolean t04 = t0();
                        x0(mb6, true);
                        if (t04) {
                            s0(mb6.h);
                        }
                        J0(mb6);
                    }
                } else {
                    int i = 0;
                    if (lc6 instanceof ob6) {
                        ob6 ob6 = (ob6) lc6;
                        Canvas canvas2 = (Canvas) this.x;
                        pb6 pb68 = ob6.r;
                        if (!(pb68 == null || pb68.g() || (pb6 = ob6.s) == null || pb6.g() || (str = ob6.o) == null)) {
                            zn5 zn52 = ob6.n;
                            if (zn52 == null) {
                                zn52 = zn5.d;
                            }
                            if (str.startsWith("data:") && str.length() >= 14 && (indexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(indexOf - 7, indexOf))) {
                                try {
                                    byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
                                    bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                                } catch (Exception e) {
                                    Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e);
                                }
                            }
                            if (bitmap != null) {
                                sp4 sp44 = new sp4(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
                                L0((id6) this.z, ob6);
                                if (K() && N0()) {
                                    Matrix matrix4 = ob6.t;
                                    if (matrix4 != null) {
                                        canvas2.concat(matrix4);
                                    }
                                    pb6 pb69 = ob6.p;
                                    if (pb69 != null) {
                                        f7 = pb69.d(this);
                                    } else {
                                        f7 = 0.0f;
                                    }
                                    pb6 pb610 = ob6.q;
                                    if (pb610 != null) {
                                        f8 = pb610.e(this);
                                    } else {
                                        f8 = 0.0f;
                                    }
                                    float d = ob6.r.d(this);
                                    float d2 = ob6.s.d(this);
                                    id6 id63 = (id6) this.z;
                                    id63.f = new sp4(f7, f8, d, d2);
                                    if (!id63.a.K.booleanValue()) {
                                        sp4 sp45 = ((id6) this.z).f;
                                        C0(sp45.b, sp45.c, sp45.d, sp45.e);
                                    }
                                    ob6.h = ((id6) this.z).f;
                                    J0(ob6);
                                    C(ob6, ob6.h);
                                    boolean t05 = t0();
                                    M0();
                                    canvas2.save();
                                    canvas2.concat(B(((id6) this.z).f, sp44, zn52));
                                    if (((id6) this.z).a.i0 != 3) {
                                        i = 2;
                                    }
                                    canvas2.drawBitmap(bitmap, 0.0f, 0.0f, new Paint(i));
                                    canvas2.restore();
                                    if (t05) {
                                        s0(ob6.h);
                                    }
                                }
                            }
                        }
                    } else if (lc6 instanceof vb6) {
                        vb6 vb6 = (vb6) lc6;
                        if (vb6.o != null) {
                            L0((id6) this.z, vb6);
                            if (K() && N0()) {
                                id6 id64 = (id6) this.z;
                                if (id64.c || id64.b) {
                                    Matrix matrix5 = vb6.n;
                                    if (matrix5 != null) {
                                        ((Canvas) this.x).concat(matrix5);
                                    }
                                    Path path = new ed6(vb6.o).a;
                                    if (vb6.h == null) {
                                        vb6.h = z(path);
                                    }
                                    J0(vb6);
                                    D(vb6);
                                    C(vb6, vb6.h);
                                    boolean t06 = t0();
                                    id6 id65 = (id6) this.z;
                                    if (id65.b) {
                                        int i2 = id65.a.Z;
                                        if (i2 == 0 || i2 != 2) {
                                            fillType2 = Path.FillType.WINDING;
                                        } else {
                                            fillType2 = Path.FillType.EVEN_ODD;
                                        }
                                        path.setFillType(fillType2);
                                        L(vb6, path);
                                    }
                                    if (((id6) this.z).c) {
                                        M(path);
                                    }
                                    z0(vb6);
                                    if (t06) {
                                        s0(vb6.h);
                                    }
                                }
                            }
                        }
                    } else if (lc6 instanceof ac6) {
                        ac6 ac6 = (ac6) lc6;
                        pb6 pb611 = ac6.q;
                        if (pb611 != null && ac6.r != null && !pb611.g() && !ac6.r.g()) {
                            L0((id6) this.z, ac6);
                            if (K() && N0()) {
                                Matrix matrix6 = ac6.n;
                                if (matrix6 != null) {
                                    ((Canvas) this.x).concat(matrix6);
                                }
                                Path o0 = o0(ac6);
                                J0(ac6);
                                D(ac6);
                                C(ac6, ac6.h);
                                boolean t07 = t0();
                                if (((id6) this.z).b) {
                                    L(ac6, o0);
                                }
                                if (((id6) this.z).c) {
                                    M(o0);
                                }
                                if (t07) {
                                    s0(ac6.h);
                                }
                            }
                        }
                    } else if (lc6 instanceof eb6) {
                        eb6 eb6 = (eb6) lc6;
                        pb6 pb612 = eb6.q;
                        if (pb612 != null && !pb612.g()) {
                            L0((id6) this.z, eb6);
                            if (K() && N0()) {
                                Matrix matrix7 = eb6.n;
                                if (matrix7 != null) {
                                    ((Canvas) this.x).concat(matrix7);
                                }
                                Path l0 = l0(eb6);
                                J0(eb6);
                                D(eb6);
                                C(eb6, eb6.h);
                                boolean t08 = t0();
                                if (((id6) this.z).b) {
                                    L(eb6, l0);
                                }
                                if (((id6) this.z).c) {
                                    M(l0);
                                }
                                if (t08) {
                                    s0(eb6.h);
                                }
                            }
                        }
                    } else if (lc6 instanceof jb6) {
                        jb6 jb6 = (jb6) lc6;
                        pb6 pb613 = jb6.q;
                        if (pb613 != null && jb6.r != null && !pb613.g() && !jb6.r.g()) {
                            L0((id6) this.z, jb6);
                            if (K() && N0()) {
                                Matrix matrix8 = jb6.n;
                                if (matrix8 != null) {
                                    ((Canvas) this.x).concat(matrix8);
                                }
                                Path m0 = m0(jb6);
                                J0(jb6);
                                D(jb6);
                                C(jb6, jb6.h);
                                boolean t09 = t0();
                                if (((id6) this.z).b) {
                                    L(jb6, m0);
                                }
                                if (((id6) this.z).c) {
                                    M(m0);
                                }
                                if (t09) {
                                    s0(jb6.h);
                                }
                            }
                        }
                    } else if (lc6 instanceof qb6) {
                        qb6 qb6 = (qb6) lc6;
                        L0((id6) this.z, qb6);
                        if (K() && N0() && ((id6) this.z).c) {
                            Matrix matrix9 = qb6.n;
                            if (matrix9 != null) {
                                ((Canvas) this.x).concat(matrix9);
                            }
                            pb6 pb614 = qb6.o;
                            if (pb614 == null) {
                                f4 = 0.0f;
                            } else {
                                f4 = pb614.d(this);
                            }
                            pb6 pb615 = qb6.p;
                            if (pb615 == null) {
                                f5 = 0.0f;
                            } else {
                                f5 = pb615.e(this);
                            }
                            pb6 pb616 = qb6.q;
                            if (pb616 == null) {
                                f6 = 0.0f;
                            } else {
                                f6 = pb616.d(this);
                            }
                            pb6 pb617 = qb6.r;
                            if (pb617 != null) {
                                f11 = pb617.e(this);
                            }
                            if (qb6.h == null) {
                                qb6.h = new sp4(Math.min(f4, f6), Math.min(f5, f11), Math.abs(f6 - f4), Math.abs(f11 - f5));
                            }
                            Path path2 = new Path();
                            path2.moveTo(f4, f5);
                            path2.lineTo(f6, f11);
                            J0(qb6);
                            D(qb6);
                            C(qb6, qb6.h);
                            boolean t010 = t0();
                            M(path2);
                            z0(qb6);
                            if (t010) {
                                s0(qb6.h);
                            }
                        }
                    } else if (lc6 instanceof zb6) {
                        zb6 zb6 = (zb6) lc6;
                        L0((id6) this.z, zb6);
                        if (K() && N0()) {
                            id6 id66 = (id6) this.z;
                            if (id66.c || id66.b) {
                                Matrix matrix10 = zb6.n;
                                if (matrix10 != null) {
                                    ((Canvas) this.x).concat(matrix10);
                                }
                                if (zb6.o.length >= 2) {
                                    Path n0 = n0(zb6);
                                    J0(zb6);
                                    D(zb6);
                                    C(zb6, zb6.h);
                                    boolean t011 = t0();
                                    if (((id6) this.z).b) {
                                        L(zb6, n0);
                                    }
                                    if (((id6) this.z).c) {
                                        M(n0);
                                    }
                                    z0(zb6);
                                    if (t011) {
                                        s0(zb6.h);
                                    }
                                }
                            }
                        }
                    } else if (lc6 instanceof yb6) {
                        yb6 yb6 = (yb6) lc6;
                        L0((id6) this.z, yb6);
                        if (K() && N0()) {
                            id6 id67 = (id6) this.z;
                            if (id67.c || id67.b) {
                                Matrix matrix11 = yb6.n;
                                if (matrix11 != null) {
                                    ((Canvas) this.x).concat(matrix11);
                                }
                                if (yb6.o.length >= 2) {
                                    Path n02 = n0(yb6);
                                    J0(yb6);
                                    int i3 = ((id6) this.z).a.Z;
                                    if (i3 == 0 || i3 != 2) {
                                        fillType = Path.FillType.WINDING;
                                    } else {
                                        fillType = Path.FillType.EVEN_ODD;
                                    }
                                    n02.setFillType(fillType);
                                    D(yb6);
                                    C(yb6, yb6.h);
                                    boolean t012 = t0();
                                    if (((id6) this.z).b) {
                                        L(yb6, n02);
                                    }
                                    if (((id6) this.z).c) {
                                        M(n02);
                                    }
                                    z0(yb6);
                                    if (t012) {
                                        s0(yb6.h);
                                    }
                                }
                            }
                        }
                    } else if (lc6 instanceof uc6) {
                        uc6 uc6 = (uc6) lc6;
                        L0((id6) this.z, uc6);
                        if (K()) {
                            Matrix matrix12 = uc6.r;
                            if (matrix12 != null) {
                                ((Canvas) this.x).concat(matrix12);
                            }
                            ArrayList arrayList = uc6.n;
                            if (arrayList == null || arrayList.size() == 0) {
                                f = 0.0f;
                            } else {
                                f = ((pb6) uc6.n.get(0)).d(this);
                            }
                            ArrayList arrayList2 = uc6.o;
                            if (arrayList2 == null || arrayList2.size() == 0) {
                                f2 = 0.0f;
                            } else {
                                f2 = ((pb6) uc6.o.get(0)).e(this);
                            }
                            ArrayList arrayList3 = uc6.p;
                            if (arrayList3 == null || arrayList3.size() == 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = ((pb6) uc6.p.get(0)).d(this);
                            }
                            ArrayList arrayList4 = uc6.q;
                            if (!(arrayList4 == null || arrayList4.size() == 0)) {
                                f11 = ((pb6) uc6.q.get(0)).e(this);
                            }
                            int X = X();
                            if (X != 1) {
                                float A2 = A(uc6);
                                if (X == 2) {
                                    A2 /= 2.0f;
                                }
                                f -= A2;
                            }
                            if (uc6.h == null) {
                                hd6 hd6 = new hd6(this, f, f2);
                                N(uc6, hd6);
                                RectF rectF = (RectF) hd6.g;
                                uc6.h = new sp4(rectF.left, rectF.top, rectF.width(), ((RectF) hd6.g).height());
                            }
                            J0(uc6);
                            D(uc6);
                            C(uc6, uc6.h);
                            boolean t013 = t0();
                            N(uc6, new gd6(this, f + f3, f2 + f11));
                            if (t013) {
                                s0(uc6.h);
                            }
                        }
                    }
                }
            }
            G0();
        }
    }

    public ah0 x() {
        ah0 ah0 = (ah0) this.C;
        if (ah0 != null) {
            return ah0;
        }
        ah0 ah02 = ah0.n;
        ah0 x2 = ed1.x((bz2) this.z);
        this.C = x2;
        return x2;
    }

    public void x0(gc6 gc6, boolean z2) {
        if (z2) {
            ((Stack) this.B).push(gc6);
            ((Stack) this.C).push(((Canvas) this.x).getMatrix());
        }
        for (lc6 w0 : gc6.i) {
            w0(w0);
        }
        if (z2) {
            ((Stack) this.B).pop();
            ((Stack) this.C).pop();
        }
    }

    public Path y(ic6 ic6, sp4 sp4) {
        boolean z2;
        Path r0;
        jc6 B2 = ic6.a.B(((id6) this.z).a.T);
        if (B2 == null) {
            O("ClipPath reference '%s' not found", ((id6) this.z).a.T);
            return null;
        }
        fb6 fb6 = (fb6) B2;
        ((Stack) this.A).push((id6) this.z);
        this.z = V(fb6);
        Boolean bool = fb6.o;
        if (bool == null || bool.booleanValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(sp4.b, sp4.c);
            matrix.preScale(sp4.d, sp4.e);
        }
        Matrix matrix2 = fb6.n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (lc6 lc6 : fb6.i) {
            if ((lc6 instanceof ic6) && (r0 = r0((ic6) lc6, true)) != null) {
                path.op(r0, Path.Op.UNION);
            }
        }
        if (((id6) this.z).a.T != null) {
            if (fb6.h == null) {
                fb6.h = z(path);
            }
            Path y2 = y(fb6, fb6.h);
            if (y2 != null) {
                path.op(y2, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.z = (id6) ((Stack) this.A).pop();
        return path;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f9, code lost:
        r2 = 0.0f - r14;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ff A[PHI: r2 
      PHI: (r2v1 float) = (r2v0 float), (r2v2 float) binds: [B:60:0x00f3, B:62:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x013d  */
    public void y0(rb6 rb6, dd6 dd6) {
        float f;
        float f2;
        pb6 pb6;
        float f3;
        pb6 pb62;
        float f4;
        pb6 pb63;
        float f5;
        pb6 pb64;
        sp4 sp4;
        boolean t0;
        float f6;
        float f7;
        float f8;
        float min;
        Canvas canvas = (Canvas) this.x;
        H0();
        Float f9 = rb6.u;
        float f10 = 0.0f;
        if (f9 != null) {
            if (Float.isNaN(f9.floatValue())) {
                float f11 = dd6.c;
                if (!(f11 == 0.0f && dd6.d == 0.0f)) {
                    f = (float) Math.toDegrees(Math.atan2((double) dd6.d, (double) f11));
                }
            } else {
                f = rb6.u.floatValue();
            }
            if (!rb6.p) {
                f2 = 1.0f;
            } else {
                f2 = ((id6) this.z).a.B.c();
            }
            this.z = V(rb6);
            Matrix matrix = new Matrix();
            matrix.preTranslate(dd6.a, dd6.b);
            matrix.preRotate(f);
            matrix.preScale(f2, f2);
            pb6 = rb6.q;
            if (pb6 == null) {
                f3 = pb6.d(this);
            } else {
                f3 = 0.0f;
            }
            pb62 = rb6.r;
            if (pb62 == null) {
                f4 = pb62.e(this);
            } else {
                f4 = 0.0f;
            }
            pb63 = rb6.s;
            float f12 = 3.0f;
            if (pb63 == null) {
                f5 = pb63.d(this);
            } else {
                f5 = 3.0f;
            }
            pb64 = rb6.t;
            if (pb64 != null) {
                f12 = pb64.e(this);
            }
            sp4 = rb6.o;
            if (sp4 == null) {
                float f13 = f5 / sp4.d;
                float f14 = f12 / sp4.e;
                zn5 zn5 = rb6.n;
                if (zn5 == null) {
                    zn5 = zn5.d;
                }
                boolean equals = zn5.equals(zn5.c);
                yn5 yn5 = zn5.a;
                if (!equals) {
                    if (zn5.b == 2) {
                        min = Math.max(f13, f14);
                    } else {
                        min = Math.min(f13, f14);
                    }
                    f13 = min;
                    f14 = f13;
                }
                matrix.preTranslate((-f3) * f13, (-f4) * f14);
                canvas.concat(matrix);
                sp4 sp42 = rb6.o;
                float f15 = sp42.d * f13;
                float f16 = sp42.e * f14;
                int ordinal = yn5.ordinal();
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 5) {
                            if (ordinal != 6) {
                                if (ordinal != 8) {
                                    if (ordinal != 9) {
                                        f6 = 0.0f;
                                        switch (yn5.ordinal()) {
                                            case 4:
                                            case 5:
                                            case 6:
                                                f7 = (f12 - f16) / 2.0f;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                f7 = f12 - f16;
                                                break;
                                            default:
                                                if (!((id6) this.z).a.K.booleanValue()) {
                                                    C0(f6, f10, f5, f12);
                                                }
                                                matrix.reset();
                                                matrix.preScale(f13, f14);
                                                canvas.concat(matrix);
                                                break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    f8 = f5 - f15;
                    f6 = 0.0f - f8;
                    switch (yn5.ordinal()) {
                        case 4:
                        case 5:
                        case 6:
                            break;
                        case 7:
                        case 8:
                        case 9:
                            break;
                    }
                }
                f8 = (f5 - f15) / 2.0f;
                f6 = 0.0f - f8;
                switch (yn5.ordinal()) {
                    case 4:
                    case 5:
                    case 6:
                        break;
                    case 7:
                    case 8:
                    case 9:
                        break;
                }
            } else {
                matrix.preTranslate(-f3, -f4);
                canvas.concat(matrix);
                if (!((id6) this.z).a.K.booleanValue()) {
                    C0(0.0f, 0.0f, f5, f12);
                }
            }
            t0 = t0();
            x0(rb6, false);
            if (t0) {
                s0(rb6.h);
            }
            G0();
        }
        f = 0.0f;
        if (!rb6.p) {
        }
        this.z = V(rb6);
        Matrix matrix2 = new Matrix();
        matrix2.preTranslate(dd6.a, dd6.b);
        matrix2.preRotate(f);
        matrix2.preScale(f2, f2);
        pb6 = rb6.q;
        if (pb6 == null) {
        }
        pb62 = rb6.r;
        if (pb62 == null) {
        }
        pb63 = rb6.s;
        float f122 = 3.0f;
        if (pb63 == null) {
        }
        pb64 = rb6.t;
        if (pb64 != null) {
        }
        sp4 = rb6.o;
        if (sp4 == null) {
        }
        t0 = t0();
        x0(rb6, false);
        if (t0) {
        }
        G0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0172  */
    public void z0(lb6 lb6) {
        rb6 rb6;
        String str;
        rb6 rb62;
        String str2;
        rb6 rb63;
        float f;
        int i;
        ArrayList arrayList;
        int size;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        lb6 lb62 = lb6;
        dc6 dc6 = ((id6) this.z).a;
        String str3 = dc6.M;
        if (str3 != null || dc6.N != null || dc6.O != null) {
            if (str3 != null) {
                jc6 B2 = lb62.a.B(str3);
                if (B2 != null) {
                    rb6 = (rb6) B2;
                    str = ((id6) this.z).a.N;
                    if (str != null) {
                        jc6 B3 = lb62.a.B(str);
                        if (B3 != null) {
                            rb62 = (rb6) B3;
                            str2 = ((id6) this.z).a.O;
                            if (str2 != null) {
                                jc6 B4 = lb62.a.B(str2);
                                if (B4 != null) {
                                    rb63 = (rb6) B4;
                                    float f8 = 0.0f;
                                    if (!(lb62 instanceof vb6)) {
                                        arrayList = new cd6(this, ((vb6) lb62).o).a;
                                        f = 0.0f;
                                        i = 1;
                                    } else if (lb62 instanceof qb6) {
                                        qb6 qb6 = (qb6) lb62;
                                        pb6 pb6 = qb6.o;
                                        if (pb6 != null) {
                                            f4 = pb6.d(this);
                                        } else {
                                            f4 = 0.0f;
                                        }
                                        pb6 pb62 = qb6.p;
                                        if (pb62 != null) {
                                            f5 = pb62.e(this);
                                        } else {
                                            f5 = 0.0f;
                                        }
                                        pb6 pb63 = qb6.q;
                                        if (pb63 != null) {
                                            f6 = pb63.d(this);
                                        } else {
                                            f6 = 0.0f;
                                        }
                                        pb6 pb64 = qb6.r;
                                        if (pb64 != null) {
                                            f7 = pb64.e(this);
                                        } else {
                                            f7 = 0.0f;
                                        }
                                        ArrayList arrayList2 = new ArrayList(2);
                                        float f9 = f6 - f4;
                                        i = 1;
                                        float f10 = f7 - f5;
                                        arrayList2.add(new dd6(f4, f5, f9, f10));
                                        arrayList2.add(new dd6(f6, f7, f9, f10));
                                        f = 0.0f;
                                        arrayList = arrayList2;
                                    } else {
                                        i = 1;
                                        yb6 yb6 = (yb6) lb62;
                                        int length = yb6.o.length;
                                        if (length < 2) {
                                            arrayList = null;
                                            f = 0.0f;
                                        } else {
                                            ArrayList arrayList3 = new ArrayList();
                                            float[] fArr = yb6.o;
                                            dd6 dd6 = new dd6(fArr[0], fArr[1], 0.0f, 0.0f);
                                            int i2 = 2;
                                            float f11 = 0.0f;
                                            float f12 = 0.0f;
                                            while (true) {
                                                f2 = dd6.b;
                                                f = f8;
                                                f3 = dd6.a;
                                                if (i2 >= length) {
                                                    break;
                                                }
                                                float[] fArr2 = yb6.o;
                                                float f13 = fArr2[i2];
                                                float f14 = fArr2[i2 + 1];
                                                dd6.a(f13, f14);
                                                arrayList3.add(dd6);
                                                dd6 = new dd6(f13, f14, f13 - f3, f14 - f2);
                                                i2 += 2;
                                                float f15 = f13;
                                                f12 = f14;
                                                f11 = f15;
                                                f8 = f;
                                            }
                                            if (yb6 instanceof zb6) {
                                                float[] fArr3 = yb6.o;
                                                float f16 = fArr3[0];
                                                if (f11 != f16) {
                                                    float f17 = fArr3[1];
                                                    if (f12 != f17) {
                                                        dd6.a(f16, f17);
                                                        arrayList3.add(dd6);
                                                        dd6 dd62 = new dd6(f16, f17, f16 - f3, f17 - f2);
                                                        dd62.b((dd6) arrayList3.get(0));
                                                        arrayList3.add(dd62);
                                                        arrayList3.set(0, dd62);
                                                    }
                                                }
                                            } else {
                                                arrayList3.add(dd6);
                                            }
                                            arrayList = arrayList3;
                                        }
                                    }
                                    if (arrayList == null && (size = arrayList.size()) == 0) {
                                        dc6 dc62 = ((id6) this.z).a;
                                        dc62.O = null;
                                        dc62.N = null;
                                        dc62.M = null;
                                        if (rb6 != null) {
                                            y0(rb6, (dd6) arrayList.get(0));
                                        }
                                        if (rb62 != null && arrayList.size() > 2) {
                                            dd6 dd63 = (dd6) arrayList.get(0);
                                            dd6 dd64 = (dd6) arrayList.get(i);
                                            int i3 = 1;
                                            while (i3 < size - 1) {
                                                i3++;
                                                dd6 dd65 = (dd6) arrayList.get(i3);
                                                if (dd64.e) {
                                                    float f18 = dd64.c;
                                                    float f19 = dd64.d;
                                                    float f20 = dd64.a;
                                                    float f21 = dd64.b;
                                                    float f22 = ((f21 - dd63.b) * f19) + ((f20 - dd63.a) * f18);
                                                    if (f22 == f) {
                                                        f22 = ((dd65.a - f20) * f18) + ((dd65.b - f21) * f19);
                                                    }
                                                    int i4 = (f22 > f ? 1 : (f22 == f ? 0 : -1));
                                                    if (i4 <= 0 && (i4 != 0 || (f18 <= f && f19 < f))) {
                                                        dd64.c = -f18;
                                                        dd64.d = -f19;
                                                    }
                                                }
                                                y0(rb62, dd64);
                                                dd63 = dd64;
                                                dd64 = dd65;
                                            }
                                        }
                                        if (rb63 != null) {
                                            y0(rb63, (dd6) arrayList.get(size - 1));
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                O("Marker reference '%s' not found", ((id6) this.z).a.O);
                            }
                            rb63 = null;
                            float f82 = 0.0f;
                            if (!(lb62 instanceof vb6)) {
                            }
                            if (arrayList == null || (size = arrayList.size()) == 0) {
                            }
                        } else {
                            O("Marker reference '%s' not found", ((id6) this.z).a.N);
                        }
                    }
                    rb62 = null;
                    str2 = ((id6) this.z).a.O;
                    if (str2 != null) {
                    }
                    rb63 = null;
                    float f822 = 0.0f;
                    if (!(lb62 instanceof vb6)) {
                    }
                    if (arrayList == null && (size = arrayList.size()) == 0) {
                    }
                } else {
                    O("Marker reference '%s' not found", ((id6) this.z).a.M);
                }
            }
            rb6 = null;
            str = ((id6) this.z).a.N;
            if (str != null) {
            }
            rb62 = null;
            str2 = ((id6) this.z).a.O;
            if (str2 != null) {
            }
            rb63 = null;
            float f8222 = 0.0f;
            if (!(lb62 instanceof vb6)) {
            }
            if (arrayList == null && (size = arrayList.size()) == 0) {
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [x1, java.lang.Object] */
    public kd6(ct ctVar) {
        this.w = 12;
        this.y = new AtomicLong(-9223372034707292160L);
        this.z = new AtomicReference((Object) null);
        this.A = new AtomicReference((Object) null);
        fv1 fv1 = fv1.w;
        this.B = new jl6(fv1);
        ? obj = new Object();
        this.C = obj;
        c49 c49 = new c49();
        c49.x = ctVar;
        c49.y = fv1;
        this.x = c49;
        obj.a(c49, fv1);
    }

    public kd6(Context context) {
        this.w = 11;
        this.y = "files";
        this.z = "common";
        this.A = pa9.b;
        this.B = "";
        m93 m93 = q93.x;
        this.C = new i93(4);
        l55.A(context != null, "Context cannot be null", new Object[0]);
        this.x = context.getPackageName();
    }

    public kd6(Set set, String str, String str2) {
        this.w = 4;
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.x = unmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.z = str;
        this.A = str2;
        this.B = ht6.w;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.y = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw pb4.g(it);
    }

    public kd6(tl4 tl4, am6 am6, kb4 kb4, rg4 rg4) {
        this.w = 3;
        this.w = 3;
        this.x = rg4;
        this.y = kb4.b(new b0(0, this));
        this.z = tl4;
        this.A = am6;
        this.B = new qc3((sl4) tl4, am6);
        this.C = rk4.g;
    }

    public kd6(o9 o9Var) {
        this.w = 7;
        g73 g73 = (g73) o9Var.x;
        if (g73 != null) {
            this.x = g73;
            this.y = (String) o9Var.y;
            this.z = ((zy2) o9Var.z).a();
            this.A = (f56) o9Var.A;
            this.B = (jb5) o9Var.B;
            return;
        }
        h.s("url == null");
        throw null;
    }

    public kd6(gv0 gv0, tv0 tv0) {
        this.w = 8;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<zp1> set = gv0.c;
        Set set2 = gv0.g;
        for (zp1 zp1 : set) {
            int i = zp1.c;
            int i2 = zp1.b;
            boolean z2 = i == 0;
            av5 av5 = zp1.a;
            if (z2) {
                if (i2 == 2) {
                    hashSet4.add(av5);
                } else {
                    hashSet.add(av5);
                }
            } else if (i == 2) {
                hashSet3.add(av5);
            } else if (i2 == 2) {
                hashSet5.add(av5);
            } else {
                hashSet2.add(av5);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(av5.a(tu5.class));
        }
        this.x = Collections.unmodifiableSet(hashSet);
        this.y = Collections.unmodifiableSet(hashSet2);
        this.z = Collections.unmodifiableSet(hashSet3);
        this.A = Collections.unmodifiableSet(hashSet4);
        this.B = Collections.unmodifiableSet(hashSet5);
        this.C = tv0;
    }

    public /* synthetic */ kd6(int i, boolean z2) {
        this.w = i;
    }

    public kd6(sa1 sa1, wa1 wa1, kf1 kf1, qc3 qc3, cw0 cw0, f83 f83, wr0 wr0) {
        this.w = 9;
        this.x = sa1;
        this.y = wa1;
        this.z = kf1;
        this.A = qc3;
        this.B = cw0;
        this.C = f83;
    }

    public kd6(oe2 oe2, gk4 gk4, nu5 nu5, nu5 nu52, we2 we2) {
        this.w = 6;
        oe2.a();
        ha6 ha6 = new ha6(oe2.a);
        this.x = oe2;
        this.y = gk4;
        this.z = ha6;
        this.A = nu5;
        this.B = nu52;
        this.C = we2;
    }
}
