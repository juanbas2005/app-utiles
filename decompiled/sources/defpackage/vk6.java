package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: vk6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vk6 extends ri6 {
    public final /* synthetic */ AtomicReferenceArray g = new AtomicReferenceArray(uk6.f);

    public vk6(long j, vk6 vk6, int i) {
        super(j, vk6, i);
    }

    public final int k() {
        return uk6.f;
    }

    public final void l(int i, e81 e81) {
        this.g.set(i, uk6.e);
        m();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.e + ", hashCode=" + hashCode() + ']';
    }
}
