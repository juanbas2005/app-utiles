package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: bd3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bd3 extends us0 {
    public int A;
    public final int[] B = new int[2];
    public final View y;
    public int z;

    public bd3(View view) {
        super(0);
        this.y = view;
    }

    public final void d(ha8 ha8) {
        this.y.setTranslationY(0.0f);
    }

    public final void e(ha8 ha8) {
        View view = this.y;
        int[] iArr = this.B;
        view.getLocationOnScreen(iArr);
        this.z = iArr[1];
    }

    public final db8 f(db8 db8, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ha8 ha8 = (ha8) it.next();
            if ((ha8.a.c() & 8) != 0) {
                int i = this.A;
                this.y.setTranslationY((float) jl.c(ha8.a.b(), i, 0));
                break;
            }
        }
        return db8;
    }

    public final k68 g(ha8 ha8, k68 k68) {
        View view = this.y;
        int[] iArr = this.B;
        view.getLocationOnScreen(iArr);
        int i = this.z - iArr[1];
        this.A = i;
        view.setTranslationY((float) i);
        return k68;
    }
}
