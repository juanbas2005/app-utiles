package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: on4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class on4 extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public on4(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    public final void onCallbackDied(IInterface iInterface, Object obj) {
        ((t73) iInterface).getClass();
        obj.getClass();
        this.a.x.remove((Integer) obj);
    }
}
