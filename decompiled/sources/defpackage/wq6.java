package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: wq6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wq6 extends cr6 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public wq6(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    public final void a(Matrix matrix, nq6 nq6, int i, Canvas canvas) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((cr6) it.next()).a(this.d, nq6, i, canvas);
        }
    }
}
