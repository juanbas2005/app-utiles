package defpackage;

import io.ktor.utils.io.ClosedByteChannelException;
import io.ktor.utils.io.ClosedWriteChannelException;

/* renamed from: ze0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ze0 extends ct2 implements vr2 {
    public static final ze0 D = new ct2(1, ClosedWriteChannelException.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);

    public final Object y(Object obj) {
        return new ClosedByteChannelException((Throwable) obj);
    }
}
