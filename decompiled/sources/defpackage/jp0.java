package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* renamed from: jp0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jp0 extends k4 {
    public static final Rect K = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final me6 L = new me6(28);
    public static final td0 M = new td0(29);
    public final Rect A = new Rect();
    public final Rect B = new Rect();
    public final int[] C = new int[2];
    public final AccessibilityManager D;
    public final Chip E;
    public ke F;
    public int G = Integer.MIN_VALUE;
    public int H = Integer.MIN_VALUE;
    public int I = Integer.MIN_VALUE;
    public final /* synthetic */ Chip J;
    public final Rect z = new Rect();

    public jp0(Chip chip, Chip chip2) {
        this.J = chip;
        this.E = chip2;
        this.D = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
        chip2.setFocusable(true);
        WeakHashMap weakHashMap = e58.a;
        if (chip2.getImportantForAccessibility() == 0) {
            chip2.setImportantForAccessibility(1);
        }
    }

    public final f96 b(View view) {
        if (this.F == null) {
            this.F = new ke(this, 1);
        }
        return this.F;
    }

    public final void d(View view, c5 c5Var) {
        boolean z2;
        AccessibilityNodeInfo accessibilityNodeInfo = c5Var.a;
        this.w.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.J;
        lp0 lp0 = chip.A;
        if (lp0 == null || !lp0.v0) {
            z2 = false;
        } else {
            z2 = true;
        }
        accessibilityNodeInfo.setCheckable(z2);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c5Var.i(chip.getAccessibilityClassName());
        c5Var.l(chip.getText());
    }

    public final boolean j(int i) {
        if (this.H != i) {
            return false;
        }
        this.H = Integer.MIN_VALUE;
        p(i, false);
        r(i, 8);
        return true;
    }

    public final c5 k(int i) {
        boolean z2;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        c5 c5Var = new c5(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        c5Var.i("android.view.View");
        Rect rect = K;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        c5Var.b = -1;
        Chip chip = this.E;
        obtain.setParent(chip);
        o(i, c5Var);
        if (c5Var.g() == null && obtain.getContentDescription() == null) {
            rf2.r("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.A;
        c5Var.f(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) != 0) {
                rf2.r("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
                return null;
            } else if ((actions & 128) == 0) {
                obtain.setPackageName(chip.getContext().getPackageName());
                c5Var.c = i;
                obtain.setSource(chip, i);
                if (this.G == i) {
                    obtain.setAccessibilityFocused(true);
                    c5Var.a(128);
                } else {
                    obtain.setAccessibilityFocused(false);
                    c5Var.a(64);
                }
                if (this.H == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    c5Var.a(2);
                } else if (obtain.isFocusable()) {
                    c5Var.a(1);
                }
                obtain.setFocused(z2);
                int[] iArr = this.C;
                chip.getLocationOnScreen(iArr);
                Rect rect3 = this.z;
                obtain.getBoundsInScreen(rect3);
                if (rect3.equals(rect)) {
                    c5Var.f(rect3);
                    if (c5Var.b != -1) {
                        c5 c5Var2 = new c5(AccessibilityNodeInfo.obtain());
                        for (int i2 = c5Var.b; i2 != -1; i2 = c5Var2.b) {
                            c5Var2.b = -1;
                            AccessibilityNodeInfo accessibilityNodeInfo = c5Var2.a;
                            accessibilityNodeInfo.setParent(chip, -1);
                            accessibilityNodeInfo.setBoundsInParent(rect);
                            o(i2, c5Var2);
                            c5Var2.f(rect2);
                            rect3.offset(rect2.left, rect2.top);
                        }
                    }
                    rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
                }
                Rect rect4 = this.B;
                if (chip.getLocalVisibleRect(rect4)) {
                    rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
                    if (rect3.intersect(rect4)) {
                        AccessibilityNodeInfo accessibilityNodeInfo2 = c5Var.a;
                        accessibilityNodeInfo2.setBoundsInScreen(rect3);
                        if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                            ViewParent parent = chip.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view = (View) parent;
                                    if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view.getParent();
                                } else if (parent != null) {
                                    accessibilityNodeInfo2.setVisibleToUser(true);
                                }
                            }
                        }
                    }
                }
                return c5Var;
            } else {
                rf2.r("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
                return null;
            }
        } else {
            rf2.r("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
            return null;
        }
    }

    public final void l(ArrayList arrayList) {
        lp0 lp0;
        arrayList.add(0);
        Rect rect = Chip.S;
        Chip chip = this.J;
        if (chip.c() && (lp0 = chip.A) != null && lp0.p0 && chip.D != null) {
            arrayList.add(1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: c5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: c5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: c5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: c5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: c5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: c5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: c5} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final boolean m(int i, Rect rect) {
        c5 c5Var;
        boolean z2;
        int i2;
        c5 c5Var2;
        c5 c5Var3;
        int i3;
        Object obj;
        int i4 = i;
        Rect rect2 = rect;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        cz6 cz6 = new cz6(0);
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            cz6.e(((Integer) arrayList.get(i5)).intValue(), k(((Integer) arrayList.get(i5)).intValue()));
        }
        int i6 = this.H;
        int i7 = Integer.MIN_VALUE;
        if (i6 == Integer.MIN_VALUE) {
            c5Var = null;
        } else {
            c5Var = (c5) cz6.c(i6);
        }
        me6 me6 = L;
        td0 td0 = M;
        Chip chip = this.E;
        int i8 = -1;
        if (i4 == 1 || i4 == 2) {
            WeakHashMap weakHashMap = e58.a;
            if (chip.getLayoutDirection() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            td0.getClass();
            int f = cz6.f();
            ArrayList arrayList2 = new ArrayList(f);
            for (int i9 = 0; i9 < f; i9++) {
                arrayList2.add((c5) cz6.g(i9));
            }
            Collections.sort(arrayList2, new tk2(z2, me6));
            if (i4 == 1) {
                i2 = 0;
                int size = arrayList2.size();
                if (c5Var != null) {
                    size = arrayList2.indexOf(c5Var);
                }
                int i10 = size - 1;
                if (i10 >= 0) {
                    c5Var2 = arrayList2.get(i10);
                } else {
                    c5Var2 = null;
                }
            } else if (i4 == 2) {
                int size2 = arrayList2.size();
                if (c5Var == null) {
                    i3 = -1;
                } else {
                    i3 = arrayList2.lastIndexOf(c5Var);
                }
                int i11 = i3 + 1;
                if (i11 < size2) {
                    obj = arrayList2.get(i11);
                } else {
                    obj = null;
                }
                i2 = 0;
                c5Var2 = obj;
            } else {
                h.q("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                return false;
            }
            c5Var3 = c5Var2;
        } else if (i4 == 17 || i4 == 33 || i4 == 66 || i4 == 130) {
            Rect rect3 = new Rect();
            int i12 = this.H;
            if (i12 != Integer.MIN_VALUE) {
                n(i12).f(rect3);
            } else if (rect2 != null) {
                rect3.set(rect2);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i4 == 17) {
                    rect3.set(width, 0, width, height);
                } else if (i4 == 33) {
                    rect3.set(0, height, width, height);
                } else if (i4 == 66) {
                    rect3.set(-1, 0, -1, height);
                } else if (i4 == 130) {
                    rect3.set(0, -1, width, -1);
                } else {
                    h.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
            }
            Rect rect4 = new Rect(rect3);
            if (i4 == 17) {
                rect4.offset(rect3.width() + 1, 0);
            } else if (i4 == 33) {
                rect4.offset(0, rect3.height() + 1);
            } else if (i4 == 66) {
                rect4.offset(-(rect3.width() + 1), 0);
            } else if (i4 == 130) {
                rect4.offset(0, -(rect3.height() + 1));
            } else {
                h.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            td0.getClass();
            int f2 = cz6.f();
            Rect rect5 = new Rect();
            c5Var3 = null;
            for (int i13 = 0; i13 < f2; i13++) {
                c5 c5Var4 = (c5) cz6.g(i13);
                if (c5Var4 != c5Var) {
                    me6.getClass();
                    c5Var4.f(rect5);
                    if (su0.D(i4, rect3, rect5)) {
                        if (su0.D(i4, rect3, rect4) && !su0.c(i4, rect3, rect5, rect4)) {
                            if (!su0.c(i4, rect3, rect4, rect5)) {
                                int G2 = su0.G(i4, rect3, rect5);
                                int H2 = su0.H(i4, rect3, rect5);
                                int i14 = (H2 * H2) + (G2 * 13 * G2);
                                int G3 = su0.G(i4, rect3, rect4);
                                int H3 = su0.H(i4, rect3, rect4);
                                if (i14 >= (H3 * H3) + (G3 * 13 * G3)) {
                                }
                            }
                        }
                        rect4.set(rect5);
                        c5Var3 = c5Var4;
                    }
                }
            }
            i2 = 0;
        } else {
            h.q("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            return false;
        }
        c5 c5Var5 = c5Var3;
        if (c5Var5 != null) {
            if (cz6.w) {
                rg3.e(cz6);
            }
            int i15 = cz6.z;
            int i16 = i2;
            while (true) {
                if (i16 >= i15) {
                    break;
                } else if (cz6.y[i16] == c5Var5) {
                    i8 = i16;
                    break;
                } else {
                    i16++;
                }
            }
            i7 = cz6.d(i8);
        }
        return q(i7);
    }

    public final c5 n(int i) {
        if (i != -1) {
            return k(i);
        }
        Chip chip = this.E;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        c5 c5Var = new c5(obtain);
        WeakHashMap weakHashMap = e58.a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                c5Var.a.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
            }
            return c5Var;
        }
        rf2.r("Views cannot have both real and virtual children");
        return null;
    }

    public final void o(int i, c5 c5Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = c5Var.a;
        CharSequence charSequence = "";
        if (i == 1) {
            Chip chip = this.J;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                accessibilityNodeInfo.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, new Object[]{charSequence}).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
            c5Var.b(w4.e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            c5Var.i(Button.class.getName());
            return;
        }
        accessibilityNodeInfo.setContentDescription(charSequence);
        accessibilityNodeInfo.setBoundsInParent(Chip.S);
    }

    public final void p(int i, boolean z2) {
        Chip chip = this.J;
        if (i == 1) {
            chip.I = z2;
        }
        lp0 lp0 = chip.A;
        boolean z3 = chip.I;
        boolean z4 = false;
        if (lp0.q0 != null) {
            z4 = lp0.R(z3 ? new int[]{16842919, 16842910} : lp0.k1);
        }
        if (z4) {
            chip.refreshDrawableState();
        }
    }

    public final boolean q(int i) {
        int i2;
        Chip chip = this.E;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.H) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.H = i;
        p(i, true);
        r(i, 8);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = r4.E;
     */
    public final void r(int i, int i2) {
        Chip chip;
        ViewParent parent;
        AccessibilityEvent accessibilityEvent;
        if (i != Integer.MIN_VALUE && this.D.isEnabled() && (parent = chip.getParent()) != null) {
            if (i != -1) {
                accessibilityEvent = AccessibilityEvent.obtain(i2);
                c5 n = n(i);
                accessibilityEvent.getText().add(n.g());
                AccessibilityNodeInfo accessibilityNodeInfo = n.a;
                accessibilityEvent.setContentDescription(accessibilityNodeInfo.getContentDescription());
                accessibilityEvent.setScrollable(accessibilityNodeInfo.isScrollable());
                accessibilityEvent.setPassword(accessibilityNodeInfo.isPassword());
                accessibilityEvent.setEnabled(accessibilityNodeInfo.isEnabled());
                accessibilityEvent.setChecked(accessibilityNodeInfo.isChecked());
                if (!accessibilityEvent.getText().isEmpty() || accessibilityEvent.getContentDescription() != null) {
                    accessibilityEvent.setClassName(accessibilityNodeInfo.getClassName());
                    accessibilityEvent.setSource(chip, i);
                    accessibilityEvent.setPackageName(chip.getContext().getPackageName());
                } else {
                    rf2.r("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                    return;
                }
            } else {
                accessibilityEvent = AccessibilityEvent.obtain(i2);
                chip.onInitializeAccessibilityEvent(accessibilityEvent);
            }
            parent.requestSendAccessibilityEvent(chip, accessibilityEvent);
        }
    }
}
