package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* renamed from: y12  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class y12 {
    public static final int a = Color.argb(230, 255, 255, 255);
    public static final int b = Color.argb(128, 27, 27, 27);
    public static f22 c;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: f22} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: f22} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: f22} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: f22} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: f22} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: f22} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: f22} */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final void a(rv0 rv0, ca7 ca7, ca7 ca72) {
        boolean z;
        f22 f22;
        View decorView = rv0.getWindow().getDecorView();
        decorView.getClass();
        f22 f222 = c;
        if (f222 == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                f22 = new Object();
            } else if (i >= 30) {
                f22 = new Object();
            } else if (i >= 29) {
                f22 = new Object();
            } else if (i >= 28) {
                f22 = new Object();
            } else if (i >= 26) {
                f22 = new Object();
            } else {
                f22 = new Object();
            }
            c = f22;
            f222 = f22;
        }
        f22 f223 = f222;
        rv0 rv02 = rv0;
        a70 a70 = new a70((Object) f223, (Object) ca7, (Object) ca72, (Object) rv02, (Object) decorView, 1);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i2 = 0;
        while (true) {
            if (i2 < viewGroup.getChildCount()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                x12 x12 = new x12(a70, viewGroup.getContext());
                x12.setTag(f223);
                x12.setVisibility(8);
                x12.setWillNotDraw(true);
                viewGroup.addView(x12);
                break;
            }
            int i3 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            } else if (childAt.getTag() instanceof f22) {
                break;
            } else {
                i2 = i3;
            }
        }
        a70.run();
        Window window = rv02.getWindow();
        window.getClass();
        f223.a(window);
    }

    public static void b(yn ynVar) {
        a(ynVar, new ca7(0, 0, new nf6(29)), new ca7(a, b, new nf6(29)));
    }
}
