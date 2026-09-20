package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* renamed from: e22  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e22 extends d22 {
    public void b(ca7 ca7, ca7 ca72, Window window, View view, boolean z, boolean z2) {
        ViewGroup viewGroup;
        g75 g75;
        boolean z3;
        ca7.getClass();
        ca72.getClass();
        window.getClass();
        view.getClass();
        o55.s(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (i < viewGroup.getChildCount()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    break;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    Object tag = childAt.getTag();
                    if (tag instanceof List) {
                        List list = (List) tag;
                        if (list.size() == 4 && (list.get(0) instanceof pt0)) {
                            Iterator it = ((Iterable) tag).iterator();
                            while (it.hasNext()) {
                                it.next();
                            }
                        }
                    }
                    i = i2;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            }
        }
        window.setNavigationBarContrastEnforced(true);
        ay4 ay4 = new ay4(view);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35) {
            g75 = new gb8(window, ay4);
        } else if (i3 >= 30) {
            g75 = new gb8(window, ay4);
        } else if (i3 >= 26) {
            g75 = new eb8(window, ay4);
        } else {
            g75 = new eb8(window, ay4);
        }
        g75.S(!z);
        g75.R(!z2);
    }
}
