package defpackage;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: q59  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q59 extends cs8 implements oy8 {
    public final /* synthetic */ AtomicReference d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q59(r69 r69, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.d = atomicReference;
    }

    public final void F(List list) {
        AtomicReference atomicReference = this.d;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ArrayList<u79> createTypedArrayList = parcel.createTypedArrayList(u79.CREATOR);
        ds8.d(parcel);
        F(createTypedArrayList);
        return true;
    }
}
