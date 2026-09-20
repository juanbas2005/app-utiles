package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* renamed from: gg4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gg4 extends k4 {
    public final /* synthetic */ int z;

    public /* synthetic */ gg4(int i) {
        this.z = i;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z2;
        switch (this.z) {
            case 3:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                if (nestedScrollView.getScrollRange() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                accessibilityEvent.setScrollable(z2);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    public final void d(View view, c5 c5Var) {
        int scrollRange;
        int i = this.z;
        View.AccessibilityDelegate accessibilityDelegate = this.w;
        switch (i) {
            case b85.b:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c5Var.a);
                c5Var.j((r16) null);
                return;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c5Var.a);
                c5Var.k(false);
                return;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c5Var.a);
                c5Var.j((r16) null);
                return;
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c5Var.a);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                c5Var.i(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    c5Var.k(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        c5Var.b(w4.i);
                        c5Var.b(w4.m);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        c5Var.b(w4.h);
                        c5Var.b(w4.o);
                        return;
                    }
                    return;
                }
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = c5Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(false);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r5 != 16908346) goto L_0x00a0;
     */
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.z) {
            case 3:
                if (super.g(view, i, bundle)) {
                    return true;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.isEnabled()) {
                    int height = nestedScrollView.getHeight();
                    Rect rect = new Rect();
                    if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                        height = rect.height();
                    }
                    if (i != 4096) {
                        if (i != 8192 && i != 16908344) {
                            break;
                        } else {
                            int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                            if (max != nestedScrollView.getScrollY()) {
                                nestedScrollView.u(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                                return true;
                            }
                        }
                    }
                    int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                    if (min != nestedScrollView.getScrollY()) {
                        nestedScrollView.u(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
                        return true;
                    }
                }
                return false;
            default:
                return super.g(view, i, bundle);
        }
    }
}
