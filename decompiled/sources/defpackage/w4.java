package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: w4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w4 {
    public static final w4 e = new w4(16, (String) null);
    public static final w4 f = new w4(64, (String) null);
    public static final w4 g = new w4(128, (String) null);
    public static final w4 h = new w4(4096, (String) null);
    public static final w4 i = new w4(8192, (String) null);
    public static final w4 j = new w4(262144, (String) null);
    public static final w4 k = new w4(524288, (String) null);
    public static final w4 l = new w4(1048576, (String) null);
    public static final w4 m = new w4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (CharSequence) null, (t5) null, (Class) null);
    public static final w4 n = new w4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (CharSequence) null, (t5) null, (Class) null);
    public static final w4 o = new w4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (CharSequence) null, (t5) null, (Class) null);
    public static final w4 p = new w4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (CharSequence) null, (t5) null, (Class) null);
    public final Object a;
    public final int b;
    public final Class c;
    public final t5 d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        int i2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15 = null;
        new w4(1, (String) null);
        new w4(2, (String) null);
        new w4(4, (String) null);
        new w4(8, (String) null);
        new w4(32, (String) null);
        Class<m5> cls = m5.class;
        new w4(256, (Class) cls);
        new w4(512, (Class) cls);
        Class<n5> cls2 = n5.class;
        new w4(1024, (Class) cls2);
        new w4(2048, (Class) cls2);
        new w4(16384, (String) null);
        new w4(32768, (String) null);
        new w4(65536, (String) null);
        new w4(131072, r5.class);
        new w4(2097152, s5.class);
        new w4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (CharSequence) null, (t5) null, (Class) null);
        new w4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, (CharSequence) null, (t5) null, p5.class);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction = null;
        }
        new w4(accessibilityAction, 16908358, (CharSequence) null, (t5) null, (Class) null);
        if (i3 >= 29) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        } else {
            accessibilityAction2 = null;
        }
        new w4(accessibilityAction2, 16908359, (CharSequence) null, (t5) null, (Class) null);
        if (i3 >= 29) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction3 = null;
        }
        new w4(accessibilityAction3, 16908360, (CharSequence) null, (t5) null, (Class) null);
        if (i3 >= 29) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        } else {
            accessibilityAction4 = null;
        }
        new w4(accessibilityAction4, 16908361, (CharSequence) null, (t5) null, (Class) null);
        new w4(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (CharSequence) null, (t5) null, (Class) null);
        new w4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, (CharSequence) null, (t5) null, q5.class);
        if (i3 >= 26) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction5 = null;
        }
        new w4(accessibilityAction5, 16908354, (CharSequence) null, (t5) null, o5.class);
        if (i3 >= 28) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        } else {
            accessibilityAction6 = null;
        }
        new w4(accessibilityAction6, 16908356, (CharSequence) null, (t5) null, (Class) null);
        if (i3 >= 28) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        } else {
            accessibilityAction7 = null;
        }
        new w4(accessibilityAction7, 16908357, (CharSequence) null, (t5) null, (Class) null);
        if (i3 >= 30) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction8 = null;
        }
        new w4(accessibilityAction8, 16908362, (CharSequence) null, (t5) null, (Class) null);
        if (i3 >= 30) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        } else {
            accessibilityAction9 = null;
        }
        new w4(accessibilityAction9, 16908372, (CharSequence) null, (t5) null, (Class) null);
        if (i3 >= 32) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction10 = null;
        }
        new w4(accessibilityAction10, 16908373, (CharSequence) null, (t5) null, (Class) null);
        if (i3 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
        } else {
            accessibilityAction11 = null;
        }
        new w4(accessibilityAction11, 16908374, (CharSequence) null, (t5) null, (Class) null);
        if (i3 >= 32) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
        } else {
            accessibilityAction12 = null;
        }
        new w4(accessibilityAction12, 16908375, (CharSequence) null, (t5) null, (Class) null);
        if (i3 >= 33) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        } else {
            accessibilityAction13 = null;
        }
        new w4(accessibilityAction13, 16908376, (CharSequence) null, (t5) null, (Class) null);
        if (i3 >= 34) {
            accessibilityAction14 = l4.c();
        } else {
            accessibilityAction14 = null;
        }
        new w4(accessibilityAction14, 16908382, (CharSequence) null, (t5) null, (Class) null);
        int i4 = gd0.a;
        if (i3 >= 36) {
            if (i3 < 36) {
                i2 = i3 * 100000;
            } else {
                i2 = Build.VERSION.SDK_INT_FULL;
            }
            if (i2 >= 3600001) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_EXTENDED_SELECTION;
            }
        }
        new w4(accessibilityAction15, 16908383, (CharSequence) null, (t5) null, (Class) null);
    }

    public w4(Object obj, int i2, CharSequence charSequence, t5 t5Var, Class cls) {
        this.b = i2;
        this.d = t5Var;
        if (obj == null) {
            this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
        } else {
            this.a = obj;
        }
        this.c = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof w4)) {
            return false;
        }
        Object obj2 = ((w4) obj).a;
        Object obj3 = this.a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        } else if (!obj3.equals(obj2)) {
            return false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d2 = c5.d(this.b);
        if (d2.equals("ACTION_UNKNOWN")) {
            Object obj = this.a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d2);
        return sb.toString();
    }

    public w4(int i2, Class cls) {
        this((Object) null, i2, (CharSequence) null, (t5) null, cls);
    }

    public w4(int i2, String str) {
        this((Object) null, i2, str, (t5) null, (Class) null);
    }
}
