package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import cu.lestebang.utiletecsa.R;
import java.util.UUID;

/* renamed from: pl5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pl5 extends a1 implements sv4 {
    public sr2 F;
    public tl5 G;
    public String H;
    public final View I;
    public final boolean J;
    public final jv2 K;
    public final WindowManager L;
    public final WindowManager.LayoutParams M;
    public sl5 N;
    public ey3 O;
    public final ed5 P;
    public final ed5 Q;
    public se3 R;
    public final oq1 S;
    public final Rect T;
    public final cy6 U;
    public final iv1 V;
    public p45 W;
    public final rv4 a0;
    public final ed5 b0;
    public boolean c0;
    public final int[] d0;

    /* JADX WARNING: type inference failed for: r5v20, types: [iv1, zv4, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pl5(sr2 sr2, tl5 tl5, String str, View view, tp1 tp1, sl5 sl5, UUID uuid, boolean z) {
        super(view.getContext());
        jv2 jv2;
        boolean z2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            jv2 = new jv2(6);
        } else if (i >= 29) {
            jv2 = new jv2(6);
        } else {
            jv2 = new jv2(6);
        }
        this.F = sr2;
        this.G = tl5;
        this.H = str;
        this.I = view;
        this.J = z;
        this.K = jv2;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.L = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        tl5 tl52 = this.G;
        boolean b = vh.b(view);
        boolean z3 = tl52.b;
        int i2 = tl52.a;
        if (z3 && b) {
            i2 |= 8192;
        } else if (z3 && !b) {
            i2 &= -8193;
        }
        layoutParams.flags = i2;
        layoutParams.type = this.G.f;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.M = layoutParams;
        this.N = sl5;
        this.O = ey3.w;
        this.P = u55.p((Object) null);
        this.Q = u55.p((Object) null);
        this.S = u55.i(new kh(13, this));
        this.T = new Rect();
        this.U = new cy6(new rh(this, 3));
        ? obj = new Object();
        this.V = obj;
        f30 f30 = new f30(this);
        rv4 rv4 = new rv4((c9) null);
        rv4.a(rv4, f30);
        rv4.b(obj);
        this.a0 = rv4;
        setId(16908290);
        setTag(R.id.view_tree_lifecycle_owner, i95.o(view));
        setTag(R.id.view_tree_view_model_store_owner, aa5.g(view));
        setTag(R.id.view_tree_saved_state_registry_owner, w95.g(view));
        setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
        rv4 navigationEventDispatcher = getNavigationEventDispatcher();
        tl5 tl53 = this.G;
        if ((tl53.a & 8) != 0 || !tl53.c) {
            z2 = false;
        } else {
            z2 = true;
        }
        navigationEventDispatcher.d();
        if (navigationEventDispatcher.c != z2) {
            navigationEventDispatcher.c = z2;
            navigationEventDispatcher.d.b();
        }
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(tp1.e0(8.0f));
        setOutlineProvider(new xu1(1));
        this.b0 = u55.p(hw0.a);
        this.d0 = new int[2];
    }

    private final gs2 getContent() {
        return (gs2) this.b0.getValue();
    }

    private final se3 getDisplayBounds() {
        int i = this.G.a & 512;
        View view = this.I;
        Rect rect = this.T;
        jv2 jv2 = this.K;
        if (i == 0) {
            jv2.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            jv2.h(view, rect);
        }
        return new se3(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: private */
    public final dy3 getParentLayoutCoordinates() {
        return (dy3) this.Q.getValue();
    }

    private final void setContent(gs2 gs2) {
        this.b0.setValue(gs2);
    }

    private final void setParentLayoutCoordinates(dy3 dy3) {
        this.Q.setValue(dy3);
    }

    public final void a(int i, yt2 yt2) {
        int i2;
        boolean z;
        yt2.g0(-857613600);
        if (yt2.i(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i3 & 1, z)) {
            getContent().H(yt2, 0);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new z0(this, i, 8);
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.G.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            } else if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                this.V.a();
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void g(boolean z, int i, int i2, int i3, int i4) {
        super.g(z, i, i2, i3, i4);
        this.G.getClass();
        View childAt = getChildAt(0);
        if (childAt != null) {
            int measuredWidth = childAt.getMeasuredWidth();
            WindowManager.LayoutParams layoutParams = this.M;
            layoutParams.width = measuredWidth;
            layoutParams.height = childAt.getMeasuredHeight();
            this.K.getClass();
            this.L.updateViewLayout(this, layoutParams);
        }
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.S.getValue()).booleanValue();
    }

    public rv4 getNavigationEventDispatcher() {
        return this.a0;
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.M;
    }

    public final ey3 getParentLayoutDirection() {
        return this.O;
    }

    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final we3 m70getPopupContentSizebOM6tXw() {
        return (we3) this.P.getValue();
    }

    public final sl5 getPositionProvider() {
        return this.N;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.c0;
    }

    public final String getTestTag() {
        return this.H;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void h(int i, int i2) {
        this.G.getClass();
        se3 displayBounds = getDisplayBounds();
        super.h(View.MeasureSpec.makeMeasureSpec(displayBounds.d(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.b(), Integer.MIN_VALUE));
    }

    public final void o(ky0 ky0, gs2 gs2) {
        setParentCompositionContext(ky0);
        setContent(gs2);
        this.c0 = true;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U.f();
        if (this.G.c && Build.VERSION.SDK_INT >= 33) {
            y4.g(this, getNavigationEventDispatcher(), new rh(this, 2));
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cy6 cy6 = this.U;
        c9 c9Var = (c9) cy6.i;
        if (c9Var != null) {
            c9Var.h();
        }
        cy6.a();
        if (Build.VERSION.SDK_INT >= 33) {
            p45 p45 = this.W;
            if (p45 != null) {
                rv4 navigationEventDispatcher = getNavigationEventDispatcher();
                navigationEventDispatcher.getClass();
                navigationEventDispatcher.d();
                if (navigationEventDispatcher.g.h(p45)) {
                    aw4 aw4 = navigationEventDispatcher.d;
                    aw4.getClass();
                    aw4.k.h(p45);
                    aw4.j.h(p45);
                    aw4.i.h(p45);
                    p45.a = null;
                    p45.c();
                }
            }
            this.W = null;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.G.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= ((float) getWidth()) || motionEvent.getY() < 0.0f || motionEvent.getY() >= ((float) getHeight()))) {
            sr2 sr2 = this.F;
            if (sr2 != null) {
                sr2.b();
                return true;
            }
        } else if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        } else {
            sr2 sr22 = this.F;
            if (sr22 != null) {
                sr22.b();
            }
        }
        return true;
    }

    public final void p(sr2 sr2, tl5 tl5, String str, ey3 ey3) {
        boolean z;
        this.F = sr2;
        this.H = str;
        int i = 0;
        if (!sg3.e(this.G, tl5)) {
            tl5.getClass();
            this.G = tl5;
            rv4 navigationEventDispatcher = getNavigationEventDispatcher();
            tl5 tl52 = this.G;
            if ((tl52.a & 8) != 0 || !tl52.c) {
                z = false;
            } else {
                z = true;
            }
            navigationEventDispatcher.d();
            if (navigationEventDispatcher.c != z) {
                navigationEventDispatcher.c = z;
                navigationEventDispatcher.d.b();
            }
            boolean b = vh.b(this.I);
            boolean z2 = tl5.b;
            int i2 = tl5.a;
            if (z2 && b) {
                i2 |= 8192;
            } else if (z2 && !b) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.M;
            layoutParams.flags = i2;
            this.K.getClass();
            this.L.updateViewLayout(this, layoutParams);
        }
        int ordinal = ey3.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = 1;
            } else {
                h.c();
                return;
            }
        }
        super.setLayoutDirection(i);
    }

    public final void q() {
        long j;
        dy3 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.n()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates != null) {
                long k = parentLayoutCoordinates.k();
                if (this.J) {
                    j = parentLayoutCoordinates.w(0);
                } else {
                    j = parentLayoutCoordinates.d(0);
                }
                se3 d = tf4.d((((long) Math.round(Float.intBitsToFloat((int) (j >> 32)))) << 32) | (4294967295L & ((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L))))), k);
                if (!d.equals(this.R)) {
                    this.R = d;
                    s();
                }
            }
        }
    }

    public final void r(dy3 dy3) {
        setParentLayoutCoordinates(dy3);
        q();
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, g06] */
    public final void s() {
        we3 r0;
        se3 se3 = this.R;
        if (se3 != null && (r0 = m70getPopupContentSizebOM6tXw()) != null) {
            long j = r0.a;
            se3 displayBounds = getDisplayBounds();
            int d = displayBounds.d();
            long b = (((long) displayBounds.b()) & 4294967295L) | (((long) d) << 32);
            ? obj = new Object();
            obj.w = 0;
            this.U.e(this, xc4.L, new ol5(obj, this, se3, b, j));
            long j2 = obj.w;
            WindowManager.LayoutParams layoutParams = this.M;
            layoutParams.x = (int) (j2 >> 32);
            layoutParams.y = (int) (j2 & 4294967295L);
            boolean z = this.G.e;
            jv2 jv2 = this.K;
            if (z) {
                jv2.i(this, (int) (b >> 32), (int) (b & 4294967295L));
            }
            jv2.getClass();
            this.L.updateViewLayout(this, layoutParams);
        }
    }

    public final void setParentLayoutDirection(ey3 ey3) {
        this.O = ey3;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m71setPopupContentSizefhxjrPA(we3 we3) {
        this.P.setValue(we3);
    }

    public final void setPositionProvider(sl5 sl5) {
        this.N = sl5;
    }

    public final void setTestTag(String str) {
        this.H = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public a1 getSubCompositionView() {
        return this;
    }

    public void setLayoutDirection(int i) {
    }
}
