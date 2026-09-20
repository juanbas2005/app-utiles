package defpackage;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;
import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.DateTimeException;
import java.time.Instant;
import java.util.Arrays;
import kotlinx.datetime.LocalDateTime;

/* renamed from: an  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class an {
    public static final ColorSpace a(tt0 tt0) {
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        tt0 tt02 = tt0;
        if (sg3.e(tt02, vt0.e)) {
            ColorSpace colorSpace3 = ColorSpace.get(ColorSpace.Named.SRGB);
            ColorSpace colorSpace4 = colorSpace3;
            return colorSpace3;
        } else if (sg3.e(tt02, vt0.q)) {
            ColorSpace colorSpace5 = ColorSpace.get(ColorSpace.Named.ACES);
            ColorSpace colorSpace6 = colorSpace5;
            return colorSpace5;
        } else if (sg3.e(tt02, vt0.r)) {
            ColorSpace colorSpace7 = ColorSpace.get(ColorSpace.Named.ACESCG);
            ColorSpace colorSpace8 = colorSpace7;
            return colorSpace7;
        } else if (sg3.e(tt02, vt0.o)) {
            ColorSpace colorSpace9 = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
            ColorSpace colorSpace10 = colorSpace9;
            return colorSpace9;
        } else if (sg3.e(tt02, vt0.j)) {
            ColorSpace colorSpace11 = ColorSpace.get(ColorSpace.Named.BT2020);
            ColorSpace colorSpace12 = colorSpace11;
            return colorSpace11;
        } else if (sg3.e(tt02, vt0.i)) {
            ColorSpace colorSpace13 = ColorSpace.get(ColorSpace.Named.BT709);
            ColorSpace colorSpace14 = colorSpace13;
            return colorSpace13;
        } else if (sg3.e(tt02, vt0.t)) {
            ColorSpace colorSpace15 = ColorSpace.get(ColorSpace.Named.CIE_LAB);
            ColorSpace colorSpace16 = colorSpace15;
            return colorSpace15;
        } else if (sg3.e(tt02, vt0.s)) {
            ColorSpace colorSpace17 = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
            ColorSpace colorSpace18 = colorSpace17;
            return colorSpace17;
        } else if (sg3.e(tt02, vt0.k)) {
            ColorSpace colorSpace19 = ColorSpace.get(ColorSpace.Named.DCI_P3);
            ColorSpace colorSpace20 = colorSpace19;
            return colorSpace19;
        } else if (sg3.e(tt02, vt0.l)) {
            ColorSpace colorSpace21 = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
            ColorSpace colorSpace22 = colorSpace21;
            return colorSpace21;
        } else if (sg3.e(tt02, vt0.g)) {
            ColorSpace colorSpace23 = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
            ColorSpace colorSpace24 = colorSpace23;
            return colorSpace23;
        } else if (sg3.e(tt02, vt0.h)) {
            ColorSpace colorSpace25 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            ColorSpace colorSpace26 = colorSpace25;
            return colorSpace25;
        } else if (sg3.e(tt02, vt0.f)) {
            ColorSpace colorSpace27 = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
            ColorSpace colorSpace28 = colorSpace27;
            return colorSpace27;
        } else if (sg3.e(tt02, vt0.m)) {
            ColorSpace colorSpace29 = ColorSpace.get(ColorSpace.Named.NTSC_1953);
            ColorSpace colorSpace30 = colorSpace29;
            return colorSpace29;
        } else if (sg3.e(tt02, vt0.p)) {
            ColorSpace colorSpace31 = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
            ColorSpace colorSpace32 = colorSpace31;
            return colorSpace31;
        } else if (sg3.e(tt02, vt0.n)) {
            ColorSpace colorSpace33 = ColorSpace.get(ColorSpace.Named.SMPTE_C);
            ColorSpace colorSpace34 = colorSpace33;
            return colorSpace33;
        } else {
            int i = Build.VERSION.SDK_INT;
            ColorSpace.Rgb.TransferParameters transferParameters = null;
            if (i >= 34) {
                if (sg3.e(tt02, vt0.v)) {
                    colorSpace2 = ColorSpace.get(ColorSpace.Named.BT2020_HLG);
                } else if (sg3.e(tt02, vt0.w)) {
                    colorSpace2 = ColorSpace.get(ColorSpace.Named.BT2020_PQ);
                } else {
                    colorSpace2 = null;
                }
                if (colorSpace2 != null) {
                    ColorSpace colorSpace35 = colorSpace2;
                    return colorSpace2;
                }
            }
            if (i >= 36) {
                if (sg3.e(tt02, vt0.x)) {
                    colorSpace = ColorSpace.get(ColorSpace.Named.OK_LAB);
                } else {
                    colorSpace = null;
                }
                if (colorSpace != null) {
                    ColorSpace colorSpace36 = colorSpace;
                    return colorSpace;
                }
            }
            if (tt02 instanceof t76) {
                String str = tt02.a;
                t76 t76 = (t76) tt02;
                float[] a = t76.d.a();
                ll7 ll7 = t76.g;
                if (ll7 != null) {
                    transferParameters = new ColorSpace.Rgb.TransferParameters(ll7.b, ll7.c, ll7.d, ll7.e, ll7.f, ll7.g, ll7.a);
                }
                float[] fArr = t76.i;
                if (transferParameters == null) {
                    return new ColorSpace.Rgb(str, t76.h, a, new ut0(0, t76.l), new ut0(1, t76.o), t76.e, t76.f);
                }
                ColorSpace.Rgb rgb = new ColorSpace.Rgb(str, t76.h, a, transferParameters);
                if (!Float.isNaN(fArr[0]) && !Arrays.equals(rgb.getTransform(), fArr)) {
                    return new ColorSpace.Rgb(str, fArr, transferParameters);
                }
                return rgb;
            }
            ColorSpace colorSpace37 = ColorSpace.get(ColorSpace.Named.SRGB);
            ColorSpace colorSpace38 = colorSpace37;
            return colorSpace37;
        }
    }

    public static Notification.Builder b(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Icon c(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static AutofillId d(View view) {
        return view.getAutofillId();
    }

    public static float e(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float f(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float g(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static float h(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static boolean i(File file, File file2) {
        try {
            Files.move(file.toPath(), file2.toPath(), new CopyOption[]{StandardCopyOption.REPLACE_EXISTING});
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static Intent j(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, (String) null, (Handler) null, 0);
    }

    public static Intent k(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, (String) null, (Handler) null, 2);
    }

    public static void l(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    public static void m(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void n(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void o(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void p(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void q(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void r(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    public static void s(Notification.Builder builder) {
        builder.setSettingsText((CharSequence) null);
    }

    public static void t(Notification.Builder builder) {
        builder.setShortcutId((String) null);
    }

    public static void u(Notification.Builder builder) {
        builder.setTimeoutAfter(0);
    }

    public static void v(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static void w(Context context, Intent intent) {
        context.startForegroundService(intent);
    }

    public static final LocalDateTime x(qd3 qd3, pi7 pi7) {
        qd3.getClass();
        try {
            Instant ofEpochSecond = Instant.ofEpochSecond(qd3.w, (long) qd3.x);
            ofEpochSecond.getClass();
            return new LocalDateTime(java.time.LocalDateTime.ofInstant(ofEpochSecond, pi7.a));
        } catch (DateTimeException e) {
            throw new RuntimeException(e);
        }
    }
}
