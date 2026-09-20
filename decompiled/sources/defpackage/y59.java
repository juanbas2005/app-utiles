package defpackage;

import android.net.Uri;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.internal.measurement.zzmk;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: y59  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class y59 implements dt {
    public static final /* synthetic */ y59 b = new y59(0);
    public static final /* synthetic */ y59 c = new y59(2);
    public final /* synthetic */ int a;

    public /* synthetic */ y59(int i) {
        this.a = i;
    }

    public final ListenableFuture apply(Object obj) {
        switch (this.a) {
            case b85.b:
                ApiException apiException = (ApiException) obj;
                throw new zzmk(apiException.w.w, apiException.getMessage(), apiException);
            case 1:
                pk8 pk8 = (pk8) obj;
                throw null;
            default:
                Uri uri = (Uri) obj;
                return pt2.d("");
        }
    }
}
