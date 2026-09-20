package defpackage;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: a60  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a60 extends ph8 {
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Pair pair = (Pair) message.obj;
            if (pair.first != null) {
                ku4.a();
                return;
            }
            p66 p66 = (p66) pair.second;
            try {
                throw null;
            } catch (RuntimeException e) {
                cj cjVar = BasePendingResult.j;
                throw e;
            }
        } else if (i != 2) {
            Log.wtf("BasePendingResult", hl6.p(new StringBuilder(String.valueOf(i).length() + 34), "Don't know how to handle message: ", i), new Exception());
        } else {
            ((BasePendingResult) message.obj).c(Status.D);
        }
    }
}
