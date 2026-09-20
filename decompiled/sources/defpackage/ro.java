package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: ro  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ro implements Window.Callback {
    public final /* synthetic */ wo A;
    public final Window.Callback w;
    public boolean x;
    public boolean y;
    public boolean z;

    public ro(wo woVar, Window.Callback callback) {
        this.A = woVar;
        if (callback != null) {
            this.w = callback;
        } else {
            h.q("Window callback may not be null");
            throw null;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void a(Window.Callback callback) {
        try {
            this.x = true;
            callback.onContentChanged();
            this.x = false;
        } catch (Throwable th) {
            this.x = false;
            throw th;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.w.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.w.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        q98.a(this.w, list, menu, i);
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.w.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.y;
        Window.Callback callback = this.w;
        if (z2) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (this.A.w(keyEvent) || callback.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r0 != false) goto L_0x006a;
     */
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        boolean z2;
        ti4 ti4;
        boolean z3;
        if (!this.w.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            wo woVar = this.A;
            woVar.C();
            u98 u98 = woVar.J;
            if (u98 != null) {
                t98 t98 = u98.i;
                if (t98 == null || (ti4 = t98.A) == null) {
                    z2 = false;
                } else {
                    if (KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    ti4.setQwertyMode(z3);
                    z2 = ti4.performShortcut(keyCode, keyEvent, 0);
                }
            }
            vo voVar = woVar.i0;
            if (voVar == null || !woVar.H(voVar, keyEvent.getKeyCode(), keyEvent)) {
                if (woVar.i0 == null) {
                    vo B = woVar.B(0);
                    woVar.I(B, keyEvent);
                    boolean H = woVar.H(B, keyEvent.getKeyCode(), keyEvent);
                    B.k = false;
                    if (H) {
                        return true;
                    }
                }
                return false;
            }
            vo voVar2 = woVar.i0;
            if (voVar2 != null) {
                voVar2.l = true;
                return true;
            }
        }
        return true;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.w.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.w.dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.w.dispatchTrackballEvent(motionEvent);
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        this.w.onActionModeFinished(actionMode);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        this.w.onActionModeStarted(actionMode);
    }

    public final void onAttachedToWindow() {
        this.w.onAttachedToWindow();
    }

    public final void onContentChanged() {
        if (this.x) {
            this.w.onContentChanged();
        }
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof ti4)) {
            return this.w.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    public final View onCreatePanelView(int i) {
        return this.w.onCreatePanelView(i);
    }

    public final void onDetachedFromWindow() {
        this.w.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.w.onMenuItemSelected(i, menuItem);
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            wo woVar = this.A;
            woVar.C();
            u98 u98 = woVar.J;
            if (u98 != null) {
                ArrayList arrayList = u98.m;
                if (true != u98.l) {
                    u98.l = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        ku4.a();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final void onPanelClosed(int i, Menu menu) {
        if (this.z) {
            this.w.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        wo woVar = this.A;
        if (i == 108) {
            woVar.C();
            u98 u98 = woVar.J;
            if (u98 != null) {
                ArrayList arrayList = u98.m;
                if (u98.l) {
                    u98.l = false;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        ku4.a();
                    }
                }
            }
        } else if (i == 0) {
            vo B = woVar.B(i);
            if (B.m) {
                woVar.u(B, false);
            }
        }
    }

    public final void onPointerCaptureChanged(boolean z2) {
        r98.a(this.w, z2);
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        ti4 ti4;
        if (menu instanceof ti4) {
            ti4 = (ti4) menu;
        } else {
            ti4 = null;
        }
        if (i == 0 && ti4 == null) {
            return false;
        }
        if (ti4 != null) {
            ti4.x = true;
        }
        boolean onPreparePanel = this.w.onPreparePanel(i, view, menu);
        if (ti4 != null) {
            ti4.x = false;
        }
        return onPreparePanel;
    }

    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        ti4 ti4 = this.A.B(0).h;
        if (ti4 != null) {
            d(list, ti4, i);
        } else {
            d(list, menu, i);
        }
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return p98.a(this.w, searchEvent);
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.w.onWindowAttributesChanged(layoutParams);
    }

    public final void onWindowFocusChanged(boolean z2) {
        this.w.onWindowFocusChanged(z2);
    }

    /* JADX WARNING: type inference failed for: r10v9, types: [h8, ri4, g27] */
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        boolean z2;
        ViewGroup viewGroup;
        Context context;
        wo woVar = this.A;
        Context context2 = woVar.G;
        if (!woVar.U || i != 0) {
            return p98.b(this.w, callback, i);
        }
        am6 am6 = new am6(context2, callback);
        h8 h8Var = woVar.P;
        if (h8Var != null) {
            h8Var.b();
        }
        qc3 qc3 = new qc3(woVar, am6);
        woVar.C();
        u98 u98 = woVar.J;
        if (u98 != null) {
            t98 t98 = u98.i;
            if (t98 != null) {
                t98.b();
            }
            u98.c.setHideOnContentScrollEnabled(false);
            u98.f.e();
            t98 t982 = new t98(u98, u98.f.getContext(), qc3);
            ti4 ti4 = t982.A;
            ti4.w();
            try {
                if (((am6) t982.B.x).O(t982, ti4)) {
                    u98.i = t982;
                    t982.j();
                    u98.f.c(t982);
                    u98.a(true);
                } else {
                    t982 = null;
                }
                woVar.P = t982;
            } finally {
                ti4.v();
            }
        }
        if (woVar.P == null) {
            c68 c68 = woVar.T;
            if (c68 != null) {
                c68.b();
            }
            h8 h8Var2 = woVar.P;
            if (h8Var2 != null) {
                h8Var2.b();
            }
            if (woVar.Q == null) {
                if (woVar.e0) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        d61 d61 = new d61(context2, 0);
                        d61.getTheme().setTo(newTheme);
                        context2 = d61;
                    }
                    woVar.Q = new ActionBarContextView(context2, (AttributeSet) null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    woVar.R = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    woVar.R.setContentView(woVar.Q);
                    woVar.R.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    woVar.Q.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    woVar.R.setHeight(-2);
                    woVar.S = new lo(woVar, 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) woVar.W.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        woVar.C();
                        u98 u982 = woVar.J;
                        if (u982 != null) {
                            context = u982.b();
                        } else {
                            context = null;
                        }
                        if (context != null) {
                            context2 = context;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        woVar.Q = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (woVar.Q != null) {
                c68 c682 = woVar.T;
                if (c682 != null) {
                    c682.b();
                }
                woVar.Q.e();
                Context context3 = woVar.Q.getContext();
                ActionBarContextView actionBarContextView = woVar.Q;
                ? h8Var3 = new h8();
                h8Var3.z = context3;
                h8Var3.A = actionBarContextView;
                h8Var3.B = qc3;
                ti4 ti42 = new ti4(actionBarContextView.getContext());
                ti42.l = 1;
                h8Var3.E = ti42;
                ti42.e = h8Var3;
                if (((am6) qc3.x).O(h8Var3, ti42)) {
                    h8Var3.j();
                    woVar.Q.c(h8Var3);
                    woVar.P = h8Var3;
                    if (!woVar.V || (viewGroup = woVar.W) == null || !viewGroup.isLaidOut()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    ActionBarContextView actionBarContextView2 = woVar.Q;
                    if (z2) {
                        actionBarContextView2.setAlpha(0.0f);
                        c68 a = e58.a(woVar.Q);
                        a.a(1.0f);
                        woVar.T = a;
                        a.d(new mo(1, woVar));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        woVar.Q.setVisibility(0);
                        if (woVar.Q.getParent() instanceof View) {
                            WeakHashMap weakHashMap = e58.a;
                            ((View) woVar.Q.getParent()).requestApplyInsets();
                        }
                    }
                    if (woVar.R != null) {
                        woVar.H.getDecorView().post(woVar.S);
                    }
                } else {
                    woVar.P = null;
                }
            }
            woVar.K();
            woVar.P = woVar.P;
        }
        woVar.K();
        h8 h8Var4 = woVar.P;
        if (h8Var4 != null) {
            return am6.B(h8Var4);
        }
        return null;
    }

    public final boolean onSearchRequested() {
        return this.w.onSearchRequested();
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
