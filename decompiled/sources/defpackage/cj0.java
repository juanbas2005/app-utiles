package defpackage;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cj0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cj0 implements Runnable {
    public final /* synthetic */ int w;
    public final int x;
    public final Object y;

    public cj0(List list, int i, Throwable th) {
        this.w = 1;
        k75.i("initCallbacks cannot be null", list);
        this.y = new ArrayList(list);
        this.x = i;
    }

    public final void run() {
        int i = this.w;
        int i2 = this.x;
        Object obj = this.y;
        switch (i) {
            case b85.b:
                b85 b85 = (b85) ((br4) obj).x;
                if (b85 != null) {
                    b85.o(i2);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 != 1) {
                    while (i3 < size) {
                        ((u22) arrayList.get(i3)).a();
                        i3++;
                    }
                    return;
                }
                while (i3 < size) {
                    ((u22) arrayList.get(i3)).b();
                    i3++;
                }
                return;
            case 2:
                RecyclerView recyclerView = ((kg4) obj).A0;
                if (!recyclerView.R) {
                    xy5 xy5 = recyclerView.H;
                    if (xy5 == null) {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        return;
                    } else {
                        xy5.y0(recyclerView, i2);
                        return;
                    }
                } else {
                    return;
                }
            default:
                ((ng8) obj).d(i2);
                return;
        }
    }

    public /* synthetic */ cj0(int i, int i2, Object obj) {
        this.w = i2;
        this.y = obj;
        this.x = i;
    }
}
