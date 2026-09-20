package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import cu.lestebang.utiletecsa.R;
import java.util.HashMap;

/* renamed from: fb2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fb2 extends km7 {
    public static final String[] Z = {"android:visibility:visibility", "android:visibility:parent"};
    public final int Y;

    public fb2() {
        this.Y = 3;
    }

    public static void L(xm7 xm7) {
        View view = xm7.b;
        int visibility = view.getVisibility();
        HashMap hashMap = xm7.a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float N(xm7 xm7, float f) {
        Float f2;
        if (xm7 == null || (f2 = (Float) xm7.a.get("android:fade:transitionAlpha")) == null) {
            return f;
        }
        return f2.floatValue();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, j78] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0035  */
    public static j78 O(xm7 xm7, xm7 xm72) {
        ? obj = new Object();
        obj.a = false;
        obj.b = false;
        if (xm7 != null) {
            HashMap hashMap = xm7.a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                obj.c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                obj.e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (xm72 != null) {
                    HashMap hashMap2 = xm72.a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        obj.d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        obj.f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (xm7 == null && xm72 != null) {
                            int i = obj.c;
                            int i2 = obj.d;
                            if (!(i == i2 && obj.e == obj.f)) {
                                if (i != i2) {
                                    if (i == 0) {
                                        obj.b = false;
                                        obj.a = true;
                                        return obj;
                                    } else if (i2 == 0) {
                                        obj.b = true;
                                        obj.a = true;
                                        return obj;
                                    }
                                } else if (obj.f == null) {
                                    obj.b = false;
                                    obj.a = true;
                                    return obj;
                                } else if (obj.e == null) {
                                    obj.b = true;
                                    obj.a = true;
                                    return obj;
                                }
                            }
                        } else if (xm7 == null && obj.d == 0) {
                            obj.b = true;
                            obj.a = true;
                            return obj;
                        } else if (xm72 == null && obj.c == 0) {
                            obj.b = false;
                            obj.a = true;
                        }
                        return obj;
                    }
                }
                obj.d = -1;
                obj.f = null;
                if (xm7 == null) {
                }
                if (xm7 == null || obj.d == 0) {
                }
            }
        }
        obj.c = -1;
        obj.e = null;
        if (xm72 != null) {
        }
        obj.d = -1;
        obj.f = null;
        if (xm7 == null) {
        }
        if (xm7 == null || obj.d == 0) {
        }
    }

    public final ObjectAnimator M(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        n68.a.C(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, n68.b, new float[]{f2});
        eb2 eb2 = new eb2(view);
        ofFloat.addListener(eb2);
        o().a(eb2);
        return ofFloat;
    }

    public final void d(xm7 xm7) {
        L(xm7);
    }

    public final void g(xm7 xm7) {
        L(xm7);
        View view = xm7.b;
        Float f = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f == null) {
            if (view.getVisibility() == 0) {
                f = Float.valueOf(n68.a.s(view));
            } else {
                f = Float.valueOf(0.0f);
            }
        }
        xm7.a.put("android:fade:transitionAlpha", f);
    }

    /* JADX WARNING: type inference failed for: r19v4, types: [android.view.ViewParent] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (O(n(r3, false), r(r3, false)).a != false) goto L_0x0019;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01df  */
    public final Animator k(ViewGroup viewGroup, xm7 xm7, xm7 xm72) {
        View view;
        int i;
        char c;
        int i2;
        Animator animator;
        View view2;
        boolean z;
        View view3;
        View view4;
        int i3;
        View view5;
        boolean z2;
        Bitmap bitmap;
        boolean z3;
        ViewGroup viewGroup2;
        int i4;
        ViewGroup viewGroup3 = viewGroup;
        xm7 xm73 = xm7;
        xm7 xm74 = xm72;
        j78 O = O(xm7, xm72);
        if (O.a && !(O.e == null && O.f == null)) {
            boolean z4 = O.b;
            int i5 = this.Y;
            int i6 = 1;
            if (!z4) {
                int i7 = O.d;
                if ((i5 & 2) == 2 && xm73 != null) {
                    View view6 = xm73.b;
                    if (xm74 != null) {
                        view = xm74.b;
                    } else {
                        view = null;
                    }
                    View view7 = (View) view6.getTag(R.id.save_overlay_view);
                    if (view7 != null) {
                        i = i7;
                        c = 1;
                        i2 = 0;
                        view2 = null;
                        animator = null;
                    } else {
                        if (view == null || view.getParent() == null) {
                            if (view != null) {
                                z = false;
                                view3 = null;
                                if (z) {
                                    if (view6.getParent() == null) {
                                        i = i7;
                                        c = 1;
                                        i6 = 0;
                                        i2 = 0;
                                        view2 = view3;
                                        animator = null;
                                        view7 = view6;
                                    } else if (view6.getParent() instanceof View) {
                                        View view8 = (View) view6.getParent();
                                        animator = null;
                                        i2 = 0;
                                        if (!O(r(view8, true), n(view8, true)).a) {
                                            boolean z5 = wm7.a;
                                            Matrix matrix = new Matrix();
                                            matrix.setTranslate((float) (-view8.getScrollX()), (float) (-view8.getScrollY()));
                                            t68 t68 = n68.a;
                                            t68.I(view6, matrix);
                                            t68.J(viewGroup3, matrix);
                                            RectF rectF = new RectF(0.0f, 0.0f, (float) view6.getWidth(), (float) view6.getHeight());
                                            matrix.mapRect(rectF);
                                            int round = Math.round(rectF.left);
                                            int round2 = Math.round(rectF.top);
                                            c = 1;
                                            int round3 = Math.round(rectF.right);
                                            int round4 = Math.round(rectF.bottom);
                                            ImageView imageView = new ImageView(view6.getContext());
                                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                            boolean isAttachedToWindow = view6.isAttachedToWindow();
                                            if (viewGroup3 == null || !viewGroup3.isAttachedToWindow()) {
                                                z2 = false;
                                            } else {
                                                z2 = true;
                                            }
                                            if (isAttachedToWindow) {
                                                z3 = isAttachedToWindow;
                                                viewGroup2 = null;
                                                i4 = 0;
                                            } else if (!z2) {
                                                i = i7;
                                                view4 = view3;
                                                bitmap = null;
                                                if (bitmap != null) {
                                                    imageView.setImageBitmap(bitmap);
                                                }
                                                imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                                imageView.layout(round, round2, round3, round4);
                                                view7 = imageView;
                                                i6 = i2;
                                                view2 = view4;
                                            } else {
                                                viewGroup2 = view6.getParent();
                                                int indexOfChild = viewGroup2.indexOfChild(view6);
                                                z3 = isAttachedToWindow;
                                                viewGroup3.getOverlay().add(view6);
                                                i4 = indexOfChild;
                                            }
                                            view4 = view3;
                                            int round5 = Math.round(rectF.width());
                                            i = i7;
                                            int round6 = Math.round(rectF.height());
                                            if (round5 <= 0 || round6 <= 0) {
                                                bitmap = null;
                                            } else {
                                                float min = Math.min(1.0f, 1048576.0f / ((float) (round5 * round6)));
                                                int round7 = Math.round(((float) round5) * min);
                                                int round8 = Math.round(((float) round6) * min);
                                                matrix.postTranslate(-rectF.left, -rectF.top);
                                                matrix.postScale(min, min);
                                                if (wm7.a) {
                                                    Picture picture = new Picture();
                                                    Canvas beginRecording = picture.beginRecording(round7, round8);
                                                    beginRecording.concat(matrix);
                                                    view6.draw(beginRecording);
                                                    picture.endRecording();
                                                    bitmap = vm7.a(picture);
                                                } else {
                                                    bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                                                    Canvas canvas = new Canvas(bitmap);
                                                    canvas.concat(matrix);
                                                    view6.draw(canvas);
                                                }
                                            }
                                            if (!z3) {
                                                viewGroup3.getOverlay().remove(view6);
                                                viewGroup2.addView(view6, i4);
                                            }
                                            if (bitmap != null) {
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                            imageView.layout(round, round2, round3, round4);
                                            view7 = imageView;
                                            i6 = i2;
                                            view2 = view4;
                                        } else {
                                            i3 = i7;
                                            c = 1;
                                            view5 = view3;
                                            int id = view8.getId();
                                            if (view8.getParent() == null && id != -1) {
                                                viewGroup3.findViewById(id);
                                            }
                                            view7 = view;
                                            i6 = i2;
                                            view2 = view4;
                                        }
                                    }
                                }
                                i3 = i7;
                                c = 1;
                                i2 = 0;
                                view5 = view3;
                                animator = null;
                                view7 = view;
                                i6 = i2;
                                view2 = view4;
                            }
                        } else if (i7 == 4 || view6 == view) {
                            z = false;
                            view3 = view;
                            view = null;
                            if (z) {
                            }
                            i3 = i7;
                            c = 1;
                            i2 = 0;
                            view5 = view3;
                            animator = null;
                            view7 = view;
                            i6 = i2;
                            view2 = view4;
                        }
                        z = true;
                        view = null;
                        view3 = null;
                        if (z) {
                        }
                        i3 = i7;
                        c = 1;
                        i2 = 0;
                        view5 = view3;
                        animator = null;
                        view7 = view;
                        i6 = i2;
                        view2 = view4;
                    }
                    if (view7 != null) {
                        if (i6 == 0) {
                            int[] iArr = (int[]) xm73.a.get("android:visibility:screenLocation");
                            int i8 = iArr[i2];
                            int i9 = iArr[c];
                            int[] iArr2 = new int[2];
                            viewGroup3.getLocationOnScreen(iArr2);
                            view7.offsetLeftAndRight((i8 - iArr2[i2]) - view7.getLeft());
                            view7.offsetTopAndBottom((i9 - iArr2[c]) - view7.getTop());
                            viewGroup3.getOverlay().add(view7);
                        }
                        t68 t682 = n68.a;
                        t682.getClass();
                        ObjectAnimator M = M(view7, N(xm73, 1.0f), 0.0f);
                        if (M == null) {
                            t682.C(view7, N(xm72, 1.0f));
                        }
                        if (i6 == 0) {
                            if (M == null) {
                                viewGroup3.getOverlay().remove(view7);
                                return M;
                            }
                            view6.setTag(R.id.save_overlay_view, view7);
                            i78 i78 = new i78(this, viewGroup3, view7, view6);
                            M.addListener(i78);
                            M.addPauseListener(i78);
                            o().a(i78);
                        }
                        return M;
                    }
                    xm7 xm75 = xm72;
                    if (view2 == null) {
                        return animator;
                    }
                    int visibility = view2.getVisibility();
                    n68.b(view2, i2);
                    t68 t683 = n68.a;
                    t683.getClass();
                    ObjectAnimator M2 = M(view2, N(xm73, 1.0f), 0.0f);
                    if (M2 == null) {
                        t683.C(view2, N(xm75, 1.0f));
                    }
                    if (M2 != null) {
                        h78 h78 = new h78(view2, i);
                        M2.addListener(h78);
                        o().a(h78);
                        return M2;
                    }
                    n68.b(view2, visibility);
                    return M2;
                }
            } else if ((i5 & 1) == 1 && xm74 != null) {
                View view9 = xm74.b;
                if (xm73 == null) {
                    View view10 = (View) view9.getParent();
                }
                n68.a.getClass();
                return M(view9, N(xm73, 0.0f), 1.0f);
            }
        }
        return null;
    }

    public final String[] q() {
        return Z;
    }

    public final boolean t(xm7 xm7, xm7 xm72) {
        if (xm7 == null && xm72 == null) {
            return false;
        }
        if (xm7 != null && xm72 != null && xm72.a.containsKey("android:visibility:visibility") != xm7.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        j78 O = O(xm7, xm72);
        if (!O.a) {
            return false;
        }
        if (O.c == 0 || O.d == 0) {
            return true;
        }
        return false;
    }

    public fb2(int i) {
        this();
        this.Y = i;
    }
}
