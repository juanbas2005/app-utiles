package defpackage;

import android.os.Parcel;

/* renamed from: xv8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xv8 extends cs8 implements pu8 {
    public final /* synthetic */ c49 d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xv8(kv8 kv8, c49 c49) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.d = c49;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        f();
        return true;
    }

    public final void f() {
        this.d.run();
    }
}
