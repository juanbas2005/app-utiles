package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* renamed from: rq7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class rq7 extends a35 {
    public static Font r(FontFamily fontFamily, int i) {
        int i2;
        int i3;
        if ((i & 1) != 0) {
            i2 = 700;
        } else {
            i2 = 400;
        }
        if ((i & 2) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        FontStyle fontStyle = new FontStyle(i2, i3);
        Font font = fontFamily.getFont(0);
        int u = u(fontStyle, font.getStyle());
        for (int i4 = 1; i4 < fontFamily.getSize(); i4++) {
            Font font2 = fontFamily.getFont(i4);
            int u2 = u(fontStyle, font2.getStyle());
            if (u2 < u) {
                font = font2;
                u = u2;
            }
        }
        return font;
    }

    public static int u(FontStyle fontStyle, FontStyle fontStyle2) {
        int i;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i = 0;
        } else {
            i = 2;
        }
        return abs + i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: tl2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: tl2[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: int} */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041 A[SYNTHETIC, Splitter:B:16:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0008 A[Catch:{ Exception -> 0x0036 }] */
    public final Typeface d(Context context, sl2 sl2, Resources resources, int i) {
        sl2 sl22;
        Context context2;
        try {
            Context context3 = context;
            sl2 sl23 = sl2;
            tl2[] tl2Arr = sl2.a;
            int length = tl2Arr.length;
            int i2 = 0;
            FontFamily.Builder builder = null;
            tl2[] tl2Arr2 = tl2Arr;
            int i3 = length;
            if (i2 >= i3) {
                tl2 tl2 = tl2Arr2[i2];
                try {
                    sl23 = i3;
                    context3 = tl2Arr2;
                } catch (IOException unused) {
                    sl22 = sl23;
                    context2 = context3;
                }
                Font build = new Font.Builder(resources, tl2.f).setWeight(tl2.b).setSlant(tl2.c).setTtcIndex(tl2.e).setFontVariationSettings(tl2.d).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(build);
                    sl22 = i3;
                    context2 = tl2Arr2;
                } else {
                    builder.addFont(build);
                    sl22 = i3;
                    context2 = tl2Arr2;
                }
                i2++;
                i3 = sl22;
                tl2Arr2 = context2;
                if (i2 >= i3) {
                    if (builder != null) {
                        return null;
                    }
                    FontFamily build2 = builder.build();
                    return new Typeface.CustomFallbackBuilder(build2).setStyle(r(build2, i).getStyle()).build();
                }
            }
            if (builder != null) {
            }
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public final Typeface e(Context context, dm2[] dm2Arr, int i) {
        try {
            FontFamily s = s(dm2Arr, context.getContentResolver());
            if (s == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(s).setStyle(r(s, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public final Typeface f(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily s = s((dm2[]) list.get(0), contentResolver);
            if (s == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(s);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily s2 = s((dm2[]) list.get(i2), contentResolver);
                if (s2 != null) {
                    customFallbackBuilder.addCustomFallback(s2);
                }
            }
            return customFallbackBuilder.setStyle(r(s, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public final Typeface g(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public final FontFamily s(dm2[] dm2Arr, ContentResolver contentResolver) {
        Font font;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (dm2 dm2 : dm2Arr) {
            if (Objects.equals(dm2.a.getScheme(), "systemfont")) {
                font = t(dm2);
            } else {
                try {
                    Uri uri = dm2.a;
                    String str = dm2.e;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", (CancellationSignal) null);
                    if (openFileDescriptor == null) {
                        if (openFileDescriptor != null) {
                            openFileDescriptor.close();
                        }
                        font = null;
                    } else {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(dm2.c).setSlant(dm2.d ? 1 : 0).setTtcIndex(dm2.b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        font = ttcIndex.build();
                        openFileDescriptor.close();
                    }
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            if (font != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(font);
                } else {
                    builder.addFont(font);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
        throw th;
    }

    public Font t(dm2 dm2) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
