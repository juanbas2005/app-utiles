package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: tk  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tk extends q28 implements Animatable {
    public ArrayList A = null;
    public final qk B = new qk(0, this);
    public final rk x;
    public final Context y;
    public s7 z = null;

    /* JADX WARNING: type inference failed for: r3v1, types: [android.graphics.drawable.Drawable$ConstantState, rk] */
    public tk(Context context) {
        this.y = context;
        this.x = new Drawable.ConstantState();
    }

    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        rk rkVar = this.x;
        rkVar.a.draw(canvas);
        if (rkVar.b.isStarted()) {
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.x.a.getAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.x.getClass();
        return changingConfigurations;
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.x.a.getColorFilter();
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.w != null) {
            return new sk(this.w.getConstantState());
        }
        return null;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.x.a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.x.a.getIntrinsicWidth();
    }

    public final int getOpacity() {
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.x.a.getOpacity();
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [js, zt6] */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        rk rkVar;
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            rkVar = this.x;
            if (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if ("animated-vector".equals(name)) {
                        TypedArray v = p25.v(resources, theme, attributeSet, gl0.e);
                        int resourceId = v.getResourceId(0, 0);
                        if (resourceId != 0) {
                            z28 z28 = new z28();
                            ThreadLocal threadLocal = x56.a;
                            z28.w = resources.getDrawable(resourceId, theme);
                            new y28(z28.w.getConstantState());
                            z28.B = false;
                            z28.setCallback(this.B);
                            z28 z282 = rkVar.a;
                            if (z282 != null) {
                                z282.setCallback((Drawable.Callback) null);
                            }
                            rkVar.a = z28;
                        }
                        v.recycle();
                    } else if ("target".equals(name)) {
                        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, gl0.f);
                        String string = obtainAttributes.getString(0);
                        int resourceId2 = obtainAttributes.getResourceId(1, 0);
                        if (resourceId2 != 0) {
                            Context context = this.y;
                            if (context != null) {
                                Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                                loadAnimator.setTarget(rkVar.a.x.b.o.get(string));
                                if (rkVar.c == null) {
                                    rkVar.c = new ArrayList();
                                    rkVar.d = new zt6(0);
                                }
                                rkVar.c.add(loadAnimator);
                                rkVar.d.put(loadAnimator, string);
                            } else {
                                obtainAttributes.recycle();
                                h.s("Context can't be null when inflating animators");
                                return;
                            }
                        }
                        obtainAttributes.recycle();
                    } else {
                        continue;
                    }
                }
                eventType = xmlPullParser.next();
            }
        }
        if (rkVar.b == null) {
            rkVar.b = new AnimatorSet();
        }
        rkVar.b.playTogether(rkVar.c);
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.x.a.isAutoMirrored();
    }

    public final boolean isRunning() {
        Drawable drawable = this.w;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.x.b.isRunning();
    }

    public final boolean isStateful() {
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.x.a.isStateful();
    }

    public final Drawable mutate() {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.x.a.setBounds(rect);
        }
    }

    public final boolean onLevelChange(int i) {
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.x.a.setLevel(i);
    }

    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.x.a.setState(iArr);
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.x.a.setAlpha(i);
        }
    }

    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.x.a.setAutoMirrored(z2);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.x.a.setColorFilter(colorFilter);
        }
    }

    public final void setTint(int i) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.x.a.setTint(i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.x.a.setTintList(colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.x.a.setTintMode(mode);
        }
    }

    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.w;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.x.a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    public final void start() {
        Drawable drawable = this.w;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        rk rkVar = this.x;
        if (!rkVar.b.isStarted()) {
            rkVar.b.start();
            invalidateSelf();
        }
    }

    public final void stop() {
        Drawable drawable = this.w;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.x.b.end();
        }
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
