package defpackage;

import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* renamed from: ka  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ka implements Runnable {
    public final /* synthetic */ int w;

    public /* synthetic */ ka(int i) {
        this.w = i;
    }

    public final void run() {
        switch (this.w) {
            case b85.b:
                int i = AlarmManagerSchedulerBroadcastReceiver.a;
                return;
            case 1:
                lp4 lp4 = je.f1;
                synchronized (lp4) {
                    try {
                        int i2 = Build.VERSION.SDK_INT;
                        Object[] objArr = lp4.a;
                        int i3 = lp4.b;
                        int i4 = 0;
                        if (i2 < 30) {
                            while (i4 < i3) {
                                je jeVar = (je) objArr[i4];
                                boolean showLayoutBounds = jeVar.getShowLayoutBounds();
                                d63 d63 = je.b1;
                                jeVar.setShowLayoutBounds(d63.q());
                                if (showLayoutBounds != jeVar.getShowLayoutBounds()) {
                                    jeVar.post(new ud(jeVar, 2));
                                }
                                i4++;
                            }
                        } else {
                            while (i4 < i3) {
                                je jeVar2 = (je) objArr[i4];
                                jeVar2.post(new ud(jeVar2, 3));
                                i4++;
                            }
                        }
                    } finally {
                    }
                }
                return;
            case 2:
                fi0 fi0 = fi0.a;
                fi0.a();
                return;
            default:
                fi0 fi02 = fi0.a;
                fi0.a();
                return;
        }
    }
}
