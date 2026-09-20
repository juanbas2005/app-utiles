package defpackage;

import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: s59  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s59 extends cs8 implements uy8 {
    public final /* synthetic */ AtomicReference d;
    public final /* synthetic */ r69 e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s59(r69 r69, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.d = atomicReference;
        this.e = r69;
    }

    public final void B(f89 f89) {
        AtomicReference atomicReference = this.d;
        synchronized (atomicReference) {
            pz8 pz8 = ((y19) this.e.w).B;
            y19.g(pz8);
            pz8.J.b("[sgtm] Got upload batches from service. count", Integer.valueOf(f89.w.size()));
            atomicReference.set(f89);
            atomicReference.notifyAll();
        }
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ds8.d(parcel);
        B((f89) ds8.a(parcel, f89.CREATOR));
        return true;
    }
}
