package defpackage;

import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;

/* renamed from: dr2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dr2 implements Window.OnFrameMetricsAvailableListener {
    public final /* synthetic */ kb9 a;

    public dr2(kb9 kb9) {
        this.a = kb9;
    }

    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        kb9 kb9 = this.a;
        if ((kb9.x & 1) != 0) {
            SparseIntArray sparseIntArray = ((SparseIntArray[]) kb9.y)[0];
            long metric = frameMetrics.getMetric(8);
            if (sparseIntArray != null) {
                int i2 = (int) ((500000 + metric) / 1000000);
                if (metric >= 0) {
                    sparseIntArray.put(i2, sparseIntArray.get(i2) + 1);
                }
            }
        }
    }
}
