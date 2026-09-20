package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: xp  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xp extends b85 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ WeakReference f;
    public final /* synthetic */ cq g;

    public xp(cq cqVar, int i, int i2, WeakReference weakReference) {
        this.g = cqVar;
        this.d = i;
        this.e = i2;
        this.f = weakReference;
    }

    public final void p(Typeface typeface) {
        int i;
        boolean z;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.d) != -1) {
            if ((this.e & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            typeface = bq.a(typeface, i, z);
        }
        cq cqVar = this.g;
        if (cqVar.m) {
            cqVar.l = typeface;
            TextView textView = (TextView) this.f.get();
            if (textView != null) {
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i2 = cqVar.j;
                if (isAttachedToWindow) {
                    textView.post(new yp(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    public final void o(int i) {
    }
}
