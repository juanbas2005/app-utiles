package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: c02  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c02 extends Drawable implements Drawable.Callback {
    public Drawable w;
    public boolean x;

    public final void a(Canvas canvas) {
        this.w.draw(canvas);
    }

    public final void b(float f, float f2) {
        this.w.setHotspot(f, f2);
    }

    public final void c(int i, int i2, int i3, int i4) {
        this.w.setHotspotBounds(i, i2, i3, i4);
    }

    public final boolean d(boolean z, boolean z2) {
        if (super.setVisible(z, z2) || this.w.setVisible(z, z2)) {
            return true;
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        if (this.x) {
            a(canvas);
        }
    }

    public final int getChangingConfigurations() {
        return this.w.getChangingConfigurations();
    }

    public final Drawable getCurrent() {
        return this.w.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.w.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.w.getIntrinsicWidth();
    }

    public final int getMinimumHeight() {
        return this.w.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.w.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.w.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.w.getPadding(rect);
    }

    public final int[] getState() {
        return this.w.getState();
    }

    public final Region getTransparentRegion() {
        return this.w.getTransparentRegion();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        return this.w.isAutoMirrored();
    }

    public final boolean isStateful() {
        return this.w.isStateful();
    }

    public final void jumpToCurrentState() {
        this.w.jumpToCurrentState();
    }

    public final void onBoundsChange(Rect rect) {
        this.w.setBounds(rect);
    }

    public final boolean onLevelChange(int i) {
        return this.w.setLevel(i);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void setAlpha(int i) {
        this.w.setAlpha(i);
    }

    public final void setAutoMirrored(boolean z) {
        this.w.setAutoMirrored(z);
    }

    public final void setChangingConfigurations(int i) {
        this.w.setChangingConfigurations(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.w.setColorFilter(colorFilter);
    }

    public final void setDither(boolean z) {
        this.w.setDither(z);
    }

    public final void setFilterBitmap(boolean z) {
        this.w.setFilterBitmap(z);
    }

    public final void setHotspot(float f, float f2) {
        if (this.x) {
            b(f, f2);
        }
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.x) {
            c(i, i2, i3, i4);
        }
    }

    public final boolean setState(int[] iArr) {
        if (this.x) {
            return this.w.setState(iArr);
        }
        return false;
    }

    public final void setTint(int i) {
        this.w.setTint(i);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.w.setTintList(colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.w.setTintMode(mode);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.x) {
            return d(z, z2);
        }
        return false;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
