package defpackage;

import android.os.Trace;
import android.view.MotionEvent;

/* renamed from: ud  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ud implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ je x;

    public /* synthetic */ ud(je jeVar, int i) {
        this.w = i;
        this.x = jeVar;
    }

    public final void run() {
        int i = this.w;
        je jeVar = this.x;
        switch (i) {
            case b85.b:
                as asVar = jeVar.D;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!asVar.isEmpty()) {
                    try {
                        ((sr2) asVar.removeLast()).b();
                    } finally {
                        Trace.endSection();
                    }
                }
                return;
            case 1:
                jeVar.Q0 = false;
                MotionEvent motionEvent = jeVar.G0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    jeVar.H(motionEvent);
                    return;
                } else {
                    h.s("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                je.h(jeVar.getRoot());
                return;
            default:
                je.h(jeVar.getRoot());
                return;
        }
    }
}
