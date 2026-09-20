package defpackage;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: gz5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gz5 {
    public int a;
    public int b;
    public int c;
    public int d;
    public Interpolator e;
    public boolean f;
    public int g;

    public final void a(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.M(i);
            this.f = false;
        } else if (this.f) {
            Interpolator interpolator = this.e;
            if (interpolator == null || this.c >= 1) {
                int i2 = this.c;
                if (i2 >= 1) {
                    recyclerView.w0.b(this.a, this.b, i2, interpolator);
                    int i3 = this.g + 1;
                    this.g = i3;
                    if (i3 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f = false;
                    return;
                }
                h.s("Scroll duration must be a positive number");
                return;
            }
            h.s("If you provide an interpolator, you must set a positive duration");
        } else {
            this.g = 0;
        }
    }
}
