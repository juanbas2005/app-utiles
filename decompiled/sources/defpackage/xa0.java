package defpackage;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: xa0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xa0 extends t75 {
    public final /* synthetic */ int c;
    public final /* synthetic */ w61 d;

    public /* synthetic */ xa0(w61 w61, int i) {
        this.c = i;
        this.d = w61;
    }

    public final void B(int i) {
        int i2 = this.c;
        w61 w61 = this.d;
        switch (i2) {
            case b85.b:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) w61;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.C(1);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) w61;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.r(1);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void C(View view, int i, int i2) {
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3 = this.c;
        w61 w61 = this.d;
        switch (i3) {
            case b85.b:
                ((BottomSheetBehavior) w61).u(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) w61;
                WeakReference weakReference = sideSheetBehavior.q;
                if (weakReference != null) {
                    view2 = (View) weakReference.get();
                } else {
                    view2 = null;
                }
                if (!(view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null)) {
                    sideSheetBehavior.a.W(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.u;
                if (!linkedHashSet.isEmpty()) {
                    sideSheetBehavior.a.d(i);
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw pb4.g(it);
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        if (java.lang.Math.abs(r8 - r6.a.v()) < java.lang.Math.abs(r8 - r6.a.w())) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        if (r8 > r6.E) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c9, code lost:
        if (java.lang.Math.abs(r7.getTop() - r6.x()) < java.lang.Math.abs(r7.getTop() - r6.E)) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fb, code lost:
        if (java.lang.Math.abs(r8 - r6.E) < java.lang.Math.abs(r8 - r6.G)) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0115, code lost:
        if (java.lang.Math.abs(r8 - r6.D) < java.lang.Math.abs(r8 - r6.G)) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0124, code lost:
        if (r8 < java.lang.Math.abs(r8 - r6.G)) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0134, code lost:
        if (java.lang.Math.abs(r8 - r9) < java.lang.Math.abs(r8 - r6.G)) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r6.a.H(r7) == false) goto L_0x005f;
     */
    public final void D(View view, float f, float f2) {
        int i = this.c;
        int i2 = 3;
        w61 w61 = this.d;
        switch (i) {
            case b85.b:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) w61;
                if (f2 < 0.0f) {
                    if (!bottomSheetBehavior.b) {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        break;
                    }
                    bottomSheetBehavior.E(view, i2, true);
                    return;
                } else if (!bottomSheetBehavior.I || !bottomSheetBehavior.D(view, f2)) {
                    if (f2 != 0.0f && Math.abs(f) <= Math.abs(f2)) {
                        if (!bottomSheetBehavior.b) {
                            int top2 = view.getTop();
                            break;
                        }
                    } else {
                        int top3 = view.getTop();
                        if (!bottomSheetBehavior.b) {
                            int i3 = bottomSheetBehavior.E;
                            if (top3 >= i3) {
                                break;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i2 = 4;
                    bottomSheetBehavior.E(view, i2, true);
                    return;
                } else {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= ((float) bottomSheetBehavior.d)) {
                        if (view.getTop() <= (bottomSheetBehavior.x() + bottomSheetBehavior.V) / 2) {
                            if (!bottomSheetBehavior.b) {
                                break;
                            }
                            bottomSheetBehavior.E(view, i2, true);
                            return;
                        }
                    }
                    i2 = 5;
                    bottomSheetBehavior.E(view, i2, true);
                    return;
                }
                i2 = 6;
                bottomSheetBehavior.E(view, i2, true);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) w61;
                if (!sideSheetBehavior.a.G(f)) {
                    if (!sideSheetBehavior.a.P(view, f)) {
                        if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                            int left = view.getLeft();
                            break;
                        }
                    } else if (!sideSheetBehavior.a.I(f, f2)) {
                        break;
                    }
                    i2 = 5;
                }
                sideSheetBehavior.t(view, i2, true);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        if (r6.canScrollVertically(-1) != false) goto L_0x0054;
     */
    public final boolean K(View view, int i) {
        View view2;
        WeakReference weakReference;
        int i2 = this.c;
        w61 w61 = this.d;
        switch (i2) {
            case b85.b:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) w61;
                int i3 = bottomSheetBehavior.N;
                if (i3 != 1 && !bottomSheetBehavior.c0) {
                    if (i3 == 3 && bottomSheetBehavior.a0 == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.X;
                        if (weakReference2 != null) {
                            view2 = (View) weakReference2.get();
                        } else {
                            view2 = null;
                        }
                        if (view2 != null) {
                            break;
                        }
                    }
                    SystemClock.uptimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.W;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        return true;
                    }
                }
                return false;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) w61;
                if (sideSheetBehavior.h == 1 || (weakReference = sideSheetBehavior.p) == null || weakReference.get() != view) {
                    return false;
                }
                return true;
        }
    }

    public final int g(View view, int i) {
        switch (this.c) {
            case b85.b:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.d;
                return gl0.K(i, sideSheetBehavior.a.y(), sideSheetBehavior.a.x());
        }
    }

    public final int h(View view, int i) {
        switch (this.c) {
            case b85.b:
                return gl0.K(i, ((BottomSheetBehavior) this.d).x(), u());
            default:
                return view.getTop();
        }
    }

    public int t(View view) {
        switch (this.c) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.d;
                return sideSheetBehavior.l + sideSheetBehavior.o;
            default:
                return super.t(view);
        }
    }

    public int u() {
        switch (this.c) {
            case b85.b:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.d;
                if (bottomSheetBehavior.I) {
                    return bottomSheetBehavior.V;
                }
                return bottomSheetBehavior.G;
            default:
                return super.u();
        }
    }
}
