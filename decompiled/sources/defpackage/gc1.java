package defpackage;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;

/* renamed from: gc1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gc1 extends Drawable implements Drawable.Callback, Animatable {
    public final int A;
    public final int B;
    public long C;
    public int D;
    public int E;
    public Drawable F;
    public final Drawable G;
    public final wf6 w;
    public final int x;
    public final boolean y;
    public final ArrayList z = new ArrayList();

    public gc1(Drawable drawable, wf6 wf6, int i, boolean z2) {
        Integer num;
        Integer num2;
        Drawable drawable2;
        this.w = wf6;
        this.x = i;
        this.y = z2;
        if (drawable != null) {
            num = Integer.valueOf(drawable.getIntrinsicWidth());
        } else {
            num = null;
        }
        this.A = a((Integer) null, num);
        if (drawable != null) {
            num2 = Integer.valueOf(drawable.getIntrinsicHeight());
        } else {
            num2 = null;
        }
        this.B = a((Integer) null, num2);
        this.D = 255;
        this.F = null;
        if (drawable != null) {
            drawable2 = drawable.mutate();
        } else {
            drawable2 = null;
        }
        this.G = drawable2;
        if (i > 0) {
            Drawable drawable3 = this.F;
            if (drawable3 != null) {
                drawable3.setCallback(this);
            }
            if (drawable2 != null) {
                drawable2.setCallback(this);
                return;
            }
            return;
        }
        h.q("durationMillis must be > 0.");
        throw null;
    }

    public final int a(Integer num, Integer num2) {
        int i;
        int i2 = -1;
        if (num != null && num.intValue() == -1) {
            return -1;
        }
        if (num2 != null && num2.intValue() == -1) {
            return -1;
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        if (num2 != null) {
            i2 = num2.intValue();
        }
        return Math.max(i, i2);
    }

    public final void b() {
        this.E = 2;
        this.F = null;
        ArrayList arrayList = this.z;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ColorStateList colorStateList = ((lg4) arrayList.get(i)).b.K;
            if (colorStateList != null) {
                setTintList(colorStateList);
            }
        }
    }

    public final void c(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int width = rect.width();
        int height = rect.height();
        double C2 = gr8.C(intrinsicWidth, intrinsicHeight, width, height, this.w);
        int B2 = dh4.B((((double) width) - (((double) intrinsicWidth) * C2)) / 2.0d);
        int B3 = dh4.B((((double) height) - (C2 * ((double) intrinsicHeight))) / 2.0d);
        drawable.setBounds(rect.left + B2, rect.top + B3, rect.right - B2, rect.bottom - B3);
    }

    public final void draw(Canvas canvas) {
        boolean z2;
        Drawable drawable;
        int i = this.E;
        if (i == 0) {
            Drawable drawable2 = this.F;
            if (drawable2 != null) {
                drawable2.setAlpha(this.D);
                int save = canvas.save();
                try {
                    drawable2.draw(canvas);
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        } else {
            Drawable drawable3 = this.G;
            if (i != 2) {
                double uptimeMillis = ((double) (SystemClock.uptimeMillis() - this.C)) / ((double) this.x);
                double n = z65.n(uptimeMillis, 0.0d, 1.0d);
                int i2 = this.D;
                int i3 = (int) (n * ((double) i2));
                if (this.y) {
                    i2 -= i3;
                }
                if (uptimeMillis >= 1.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && (drawable = this.F) != null) {
                    drawable.setAlpha(i2);
                    int save2 = canvas.save();
                    try {
                        drawable.draw(canvas);
                        canvas.restoreToCount(save2);
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        canvas.restoreToCount(save2);
                        throw th2;
                    }
                }
                if (drawable3 != null) {
                    drawable3.setAlpha(i3);
                    int save3 = canvas.save();
                    try {
                        drawable3.draw(canvas);
                        canvas.restoreToCount(save3);
                    } catch (Throwable th3) {
                        Throwable th4 = th3;
                        canvas.restoreToCount(save3);
                        throw th4;
                    }
                }
                if (z2) {
                    b();
                } else {
                    invalidateSelf();
                }
            } else if (drawable3 != null) {
                drawable3.setAlpha(this.D);
                int save4 = canvas.save();
                try {
                    drawable3.draw(canvas);
                } finally {
                    canvas.restoreToCount(save4);
                }
            }
        }
    }

    public final int getAlpha() {
        return this.D;
    }

    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        int i = this.E;
        if (i != 0) {
            Drawable drawable = this.G;
            if (i != 1) {
                if (i == 2 && drawable != null) {
                    return drawable.getColorFilter();
                }
                return null;
            } else if (drawable != null && (colorFilter = drawable.getColorFilter()) != null) {
                return colorFilter;
            } else {
                Drawable drawable2 = this.F;
                if (drawable2 != null) {
                    return drawable2.getColorFilter();
                }
                return null;
            }
        } else {
            Drawable drawable3 = this.F;
            if (drawable3 != null) {
                return drawable3.getColorFilter();
            }
            return null;
        }
    }

    public final int getIntrinsicHeight() {
        return this.B;
    }

    public final int getIntrinsicWidth() {
        return this.A;
    }

    public final int getOpacity() {
        Drawable drawable = this.F;
        int i = this.E;
        if (i != 0) {
            Drawable drawable2 = this.G;
            if (i == 2) {
                if (drawable2 != null) {
                    return drawable2.getOpacity();
                }
                return -2;
            } else if (drawable != null && drawable2 != null) {
                return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
            } else {
                if (drawable != null) {
                    return drawable.getOpacity();
                }
                if (drawable2 != null) {
                    return drawable2.getOpacity();
                }
                return -2;
            }
        } else if (drawable != null) {
            return drawable.getOpacity();
        } else {
            return -2;
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isRunning() {
        if (this.E == 1) {
            return true;
        }
        return false;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.F;
        if (drawable != null) {
            c(drawable, rect);
        }
        Drawable drawable2 = this.G;
        if (drawable2 != null) {
            c(drawable2, rect);
        }
    }

    public final boolean onLevelChange(int i) {
        boolean z2;
        boolean z3;
        Drawable drawable = this.F;
        if (drawable != null) {
            z2 = drawable.setLevel(i);
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.G;
        if (drawable2 != null) {
            z3 = drawable2.setLevel(i);
        } else {
            z3 = false;
        }
        if (z2 || z3) {
            return true;
        }
        return false;
    }

    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        boolean z3;
        Drawable drawable = this.F;
        if (drawable != null) {
            z2 = drawable.setState(iArr);
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.G;
        if (drawable2 != null) {
            z3 = drawable2.setState(iArr);
        } else {
            z3 = false;
        }
        if (z2 || z3) {
            return true;
        }
        return false;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void setAlpha(int i) {
        if (i < 0 || i >= 256) {
            h.j(hl6.k(i, "Invalid alpha: "));
        } else {
            this.D = i;
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.F;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.G;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    public final void setTint(int i) {
        Drawable drawable = this.F;
        if (drawable != null) {
            drawable.setTint(i);
        }
        Drawable drawable2 = this.G;
        if (drawable2 != null) {
            drawable2.setTint(i);
        }
    }

    public final void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.F;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.G;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.F;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.G;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.F;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.G;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final void start() {
        Animatable animatable;
        Drawable drawable = this.F;
        Animatable animatable2 = null;
        if (drawable instanceof Animatable) {
            animatable = (Animatable) drawable;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.start();
        }
        ? r0 = this.G;
        if (r0 instanceof Animatable) {
            animatable2 = r0;
        }
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.E == 0) {
            this.E = 1;
            this.C = SystemClock.uptimeMillis();
            ArrayList arrayList = this.z;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((lg4) arrayList.get(i)).a(this);
            }
            invalidateSelf();
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final void stop() {
        Animatable animatable;
        Drawable drawable = this.F;
        Animatable animatable2 = null;
        if (drawable instanceof Animatable) {
            animatable = (Animatable) drawable;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.stop();
        }
        ? r0 = this.G;
        if (r0 instanceof Animatable) {
            animatable2 = r0;
        }
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.E != 2) {
            b();
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
