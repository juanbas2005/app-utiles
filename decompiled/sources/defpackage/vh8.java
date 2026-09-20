package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: vh8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vh8 extends lg8 {
    public final /* synthetic */ xb7 e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vh8(xb7 xb7) {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 0);
        this.e = xb7;
    }

    public final boolean I(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        tg8.b(parcel);
        a35.m((Status) tg8.a(parcel, Status.CREATOR), (Object) null, this.e);
        return true;
    }
}
