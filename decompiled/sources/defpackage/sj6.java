package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* renamed from: sj6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class sj6 {
    public static final ku4 a = d63.L;

    public static final boolean a(kk5 kk5) {
        MotionEvent a2;
        List list = kk5.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            } else if (((qk5) list.get(i)).i == 2) {
                i++;
            } else {
                MotionEvent a3 = kk5.a();
                if ((a3 == null || !a3.isFromSource(8194)) && ((a2 = kk5.a()) == null || !a2.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
