package defpackage;

import io.ktor.utils.io.ClosedByteChannelException;
import io.ktor.utils.io.ClosedReadChannelException;

/* renamed from: ye0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ye0 extends ct2 implements vr2 {
    public static final ye0 D = new ct2(1, ClosedReadChannelException.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);

    public final Object y(Object obj) {
        return new ClosedByteChannelException((Throwable) obj);
    }
}
