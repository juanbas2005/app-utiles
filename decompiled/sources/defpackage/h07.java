package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import cu.lestebang.utiletecsa.MainActivity;
import cu.lestebang.utiletecsa.R;

/* renamed from: h07  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h07 extends kg5 {
    public final y61 A;
    public f07 z;

    public h07(MainActivity mainActivity) {
        super(mainActivity);
        this.A = new y61(this, mainActivity);
    }

    public final void P(td4 td4) {
        this.y = td4;
        View findViewById = ((MainActivity) this.x).findViewById(16908290);
        ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
        if (this.z != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.z);
        }
        f07 f07 = new f07(this, findViewById, 1);
        this.z = f07;
        viewTreeObserver.addOnPreDrawListener(f07);
    }

    public final void z() {
        int i;
        MainActivity mainActivity = (MainActivity) this.x;
        Resources.Theme theme = mainActivity.getTheme();
        theme.getClass();
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            mainActivity.setTheme(i);
        }
        if (Build.VERSION.SDK_INT < 33) {
            View decorView = mainActivity.getWindow().getDecorView();
            decorView.getClass();
            ((ViewGroup) decorView).setOnHierarchyChangeListener(this.A);
        }
    }
}
