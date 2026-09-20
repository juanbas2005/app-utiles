package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* renamed from: yo  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yo {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static yo c;
    public t56 a;

    public static synchronized yo a() {
        yo yoVar;
        synchronized (yo.class) {
            try {
                if (c == null) {
                    d();
                }
                yoVar = c;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return yoVar;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e;
        synchronized (yo.class) {
            e = t56.e(i, mode);
        }
        return e;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [yo, java.lang.Object] */
    public static synchronized void d() {
        synchronized (yo.class) {
            if (c == null) {
                ? obj = new Object();
                c = obj;
                obj.a = t56.b();
                t56 t56 = c.a;
                kd6 kd6 = new kd6(1);
                synchronized (t56) {
                    t56.e = kd6;
                }
            }
        }
    }

    public static void e(Drawable drawable, w70 w70, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = t56.f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = w70.b;
            if (z || w70.a) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z) {
                    colorStateList = (ColorStateList) w70.c;
                } else {
                    colorStateList = null;
                }
                if (w70.a) {
                    mode = (PorterDuff.Mode) w70.d;
                } else {
                    mode = t56.f;
                }
                if (!(colorStateList == null || mode == null)) {
                    porterDuffColorFilter = t56.e(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
                return;
            }
            drawable.clearColorFilter();
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.c(context, i);
    }
}
