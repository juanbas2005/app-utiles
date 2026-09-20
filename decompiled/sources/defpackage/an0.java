package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* renamed from: an0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class an0 extends km7 {
    public static final String[] Y = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final wm0 Z;
    public static final wm0 a0;
    public static final wm0 b0;
    public static final wm0 c0;
    public static final wm0 d0;

    static {
        Class<PointF> cls = PointF.class;
        Z = new wm0(0, cls, "topLeft");
        a0 = new wm0(1, cls, "bottomRight");
        b0 = new wm0(2, cls, "bottomRight");
        c0 = new wm0(3, cls, "topLeft");
        d0 = new wm0(4, cls, "position");
    }

    public static void L(xm7 xm7) {
        View view = xm7.b;
        HashMap hashMap = xm7.a;
        if (view.isLaidOut() || view.getWidth() != 0 || view.getHeight() != 0) {
            hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            hashMap.put("android:changeBounds:parent", view.getParent());
        }
    }

    public final void d(xm7 xm7) {
        L(xm7);
    }

    public final void g(xm7 xm7) {
        L(xm7);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: android.animation.ObjectAnimator} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Animator k(ViewGroup viewGroup, xm7 xm7, xm7 xm72) {
        int i;
        ObjectAnimator objectAnimator;
        an0 an0;
        xm7 xm73 = xm7;
        xm7 xm74 = xm72;
        if (xm73 == null) {
            return null;
        }
        HashMap hashMap = xm73.a;
        if (xm74 == null) {
            return null;
        }
        HashMap hashMap2 = xm74.a;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = xm74.b;
        Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
        Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            if (i2 == i3 && i4 == i5) {
                i = 0;
            } else {
                i = 1;
            }
            if (!(i6 == i7 && i8 == i9)) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i14 = i;
        if (i14 <= 0) {
            return null;
        }
        n68.a(view, i2, i4, i6, i8);
        if (i14 != 2) {
            an0 = this;
            if (i2 == i3 && i4 == i5) {
                an0.R.getClass();
                objectAnimator = o25.a(view, b0, z53.i((float) i6, (float) i8, (float) i7, (float) i9));
            } else {
                an0.R.getClass();
                objectAnimator = o25.a(view, c0, z53.i((float) i2, (float) i4, (float) i3, (float) i5));
            }
        } else if (i10 == i12 && i11 == i13) {
            an0 = this;
            an0.R.getClass();
            objectAnimator = o25.a(view, d0, z53.i((float) i2, (float) i4, (float) i3, (float) i5));
        } else {
            an0 = this;
            zm0 zm0 = new zm0(view);
            an0.R.getClass();
            Animator a = o25.a(zm0, Z, z53.i((float) i2, (float) i4, (float) i3, (float) i5));
            an0.R.getClass();
            Animator a2 = o25.a(zm0, a0, z53.i((float) i6, (float) i8, (float) i7, (float) i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{a, a2});
            animatorSet.addListener(new xm0(zm0));
            objectAnimator = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            b85.s(viewGroup4, true);
            an0.o().a(new ym0(viewGroup4));
        }
        return objectAnimator;
    }

    public final String[] q() {
        return Y;
    }
}
