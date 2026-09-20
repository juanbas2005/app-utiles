package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import cu.lestebang.utiletecsa.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: t56  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t56 {
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static t56 g;
    public static final s56 h = new kd4(6);
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public kd6 e;

    public static synchronized t56 b() {
        t56 t56;
        synchronized (t56.class) {
            try {
                if (g == null) {
                    g = new t56();
                }
                t56 = g;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return t56;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (t56.class) {
            s56 s56 = h;
            s56.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) s56.h(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) s56.l(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00cf A[RETURN] */
    public final Drawable a(Context context, int i) {
        Drawable drawable;
        LayerDrawable layerDrawable;
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            vc4 vc4 = (vc4) this.b.get(context);
            if (vc4 != null) {
                WeakReference weakReference = (WeakReference) vc4.b(j);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        vc4.f(j);
                    }
                }
            }
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        if (this.e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawable = kd6.a0(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = kd6.a0(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = kd6.a0(this, context, R.dimen.abc_star_small);
            }
            if (layerDrawable != null) {
                return layerDrawable;
            }
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                    if (constantState2 == null) {
                        return layerDrawable;
                    }
                    vc4 vc42 = (vc4) this.b.get(context);
                    if (vc42 == null) {
                        vc42 = new vc4((Object) null);
                        this.b.put(context, vc42);
                    }
                    vc42.e(j, new WeakReference(constantState2));
                    return layerDrawable;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
        layerDrawable = null;
        if (layerDrawable != null) {
        }
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    public final synchronized Drawable d(Context context, int i, boolean z) {
        Drawable a2;
        try {
            if (!this.d) {
                this.d = true;
                Drawable c2 = c(context, R.drawable.abc_vector_test);
                if (c2 == null || (!(c2 instanceof z28) && !"android.graphics.drawable.VectorDrawable".equals(c2.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a2 = a(context, i);
            if (a2 == null) {
                a2 = context.getDrawable(i);
            }
            if (a2 != null) {
                a2 = g(context, i, z, a2);
            }
            if (a2 != null) {
                sz1.a(a2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a2;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        cz6 cz6;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap == null || (cz6 = (cz6) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            colorStateList = (ColorStateList) cz6.c(i);
        }
        if (colorStateList == null) {
            kd6 kd6 = this.e;
            if (kd6 != null) {
                colorStateList2 = kd6.c0(context, i);
            }
            if (colorStateList2 != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                cz6 cz62 = (cz6) this.a.get(context);
                if (cz62 == null) {
                    cz62 = new cz6(0);
                    this.a.put(context, cz62);
                }
                cz62.a(i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e2  */
    public final Drawable g(Context context, int i, boolean z, Drawable drawable) {
        boolean z2;
        int i2;
        ColorStateList f2 = f(context, i);
        PorterDuff.Mode mode = null;
        if (f2 != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTintList(f2);
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        kd6 kd6 = this.e;
        int i3 = R.attr.colorControlNormal;
        if (kd6 != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int c2 = eh7.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = yo.b;
                kd6.F0(findDrawableByLayerId, c2, mode2);
                kd6.F0(layerDrawable.findDrawableByLayerId(16908303), eh7.c(context, R.attr.colorControlNormal), mode2);
                kd6.F0(layerDrawable.findDrawableByLayerId(16908301), eh7.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            } else if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                int b2 = eh7.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = yo.b;
                kd6.F0(findDrawableByLayerId2, b2, mode3);
                kd6.F0(layerDrawable2.findDrawableByLayerId(16908303), eh7.c(context, R.attr.colorControlActivated), mode3);
                kd6.F0(layerDrawable2.findDrawableByLayerId(16908301), eh7.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        kd6 kd62 = this.e;
        boolean z3 = false;
        if (kd62 != null) {
            PorterDuff.Mode mode4 = yo.b;
            if (!kd6.w((int[]) kd62.x, i)) {
                if (kd6.w((int[]) kd62.z, i)) {
                    i3 = R.attr.colorControlActivated;
                } else {
                    i3 = 16842801;
                    if (kd6.w((int[]) kd62.A, i)) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                        i2 = Math.round(40.8f);
                        i3 = 16842800;
                        z2 = true;
                        if (z2) {
                            Drawable mutate2 = drawable.mutate();
                            mutate2.setColorFilter(yo.c(eh7.c(context, i3), mode4));
                            if (i2 != -1) {
                                mutate2.setAlpha(i2);
                            }
                            z3 = true;
                        }
                    } else if (i != R.drawable.abc_dialog_material_background) {
                        z2 = false;
                        i3 = 0;
                        i2 = -1;
                        if (z2) {
                        }
                    }
                }
            }
            z2 = true;
            i2 = -1;
            if (z2) {
            }
        }
        if (z3 || !z) {
            return drawable;
        }
        return null;
    }
}
