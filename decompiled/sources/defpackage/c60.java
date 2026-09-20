package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: c60  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c60 implements Handler.Callback {
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            throw b81.j(message.obj);
        } else if (i != 1) {
            return false;
        } else {
            throw b81.j(message.obj);
        }
    }
}
