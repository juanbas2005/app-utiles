package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import java.util.List;

/* renamed from: rx8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class rx8 implements fs8, e12, x77 {
    public static final /* synthetic */ rx8 x = new rx8(0);
    public static final /* synthetic */ rx8 y = new rx8(1);
    public static final /* synthetic */ rx8 z = new rx8(3);
    public final /* synthetic */ int w;

    public /* synthetic */ rx8(int i) {
        this.w = i;
    }

    public Object a() {
        switch (this.w) {
            case b85.b:
                List list = by8.a;
                wo8.x.get();
                return (Boolean) xo8.a.n(1, "measurement.rb.attribution.client2", true).get();
            default:
                List list2 = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(71, 100000, "measurement.upload.max_events_per_day").get()).longValue());
        }
    }

    public d12 b(Context context, String str, c12 c12) {
        d12 d12 = new d12();
        d12.a = c12.f(context, str);
        int i = 1;
        int b = c12.b(context, str, true);
        d12.b = b;
        int i2 = d12.a;
        if (i2 == 0) {
            i2 = 0;
            if (b == 0) {
                i = 0;
                d12.c = i;
                return d12;
            }
        }
        if (i2 >= b) {
            i = -1;
        }
        d12.c = i;
        return d12;
    }

    public /* synthetic */ Object get() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        boolean z2 = false;
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            int i = runningAppProcessInfo.importance;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 17);
            sb.append("Memory state is: ");
            sb.append(i);
            Log.i("PhenotypeProcessReaper", sb.toString());
            if (runningAppProcessInfo.importance >= 400) {
                z2 = true;
            }
        } catch (RuntimeException e) {
            Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e);
        }
        return new Boolean(z2);
    }
}
