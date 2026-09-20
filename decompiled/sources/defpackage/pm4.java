package defpackage;

import android.view.MotionEvent;

/* renamed from: pm4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pm4 {
    public static final pm4 a = new Object();

    public final boolean a(MotionEvent motionEvent, int i) {
        if ((Float.floatToRawIntBits(motionEvent.getRawX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY(i)) & Integer.MAX_VALUE) >= 2139095040) {
            return false;
        }
        return true;
    }
}
