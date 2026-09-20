package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: fr2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fr2 {
    public static final rg e = rg.d();
    public final Activity a;
    public final wv2 b;
    public final HashMap c;
    public boolean d = false;

    public fr2(Activity activity) {
        wv2 wv2 = new wv2(20);
        HashMap hashMap = new HashMap();
        this.a = activity;
        this.b = wv2;
        this.c = hashMap;
    }

    public final n75 a() {
        boolean z = this.d;
        rg rgVar = e;
        if (!z) {
            rgVar.a("No recording has been started.");
            return new n75();
        }
        SparseIntArray sparseIntArray = ((SparseIntArray[]) ((kb9) this.b.x).y)[0];
        if (sparseIntArray == null) {
            rgVar.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return new n75();
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
            int keyAt = sparseIntArray.keyAt(i4);
            int valueAt = sparseIntArray.valueAt(i4);
            i += valueAt;
            if (keyAt > 700) {
                i3 += valueAt;
            }
            if (keyAt > 16) {
                i2 += valueAt;
            }
        }
        return new n75(new er2(i, i2, i3));
    }

    public final void b() {
        boolean z = this.d;
        Activity activity = this.a;
        if (z) {
            e.b("FrameMetricsAggregator is already recording %s", activity.getClass().getSimpleName());
            return;
        }
        kb9 kb9 = (kb9) this.b.x;
        kb9.getClass();
        if (kb9.D == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            kb9.D = handlerThread;
            handlerThread.start();
            kb9.E = new Handler(kb9.D.getLooper());
        }
        for (int i = 0; i <= 8; i++) {
            SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) kb9.y;
            if (sparseIntArrayArr[i] == null) {
                if (((1 << i) & kb9.x) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener((dr2) kb9.A, kb9.E);
        ((ArrayList) kb9.z).add(new WeakReference(activity));
        this.d = true;
    }
}
