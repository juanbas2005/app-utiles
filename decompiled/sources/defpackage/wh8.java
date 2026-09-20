package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: wh8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wh8 extends kw2 {
    public static final qc3 m = new qc3("Auth.Api.Identity.SignIn.API", (h49) new wf3(6), new td0(20));
    public final String l = yh8.a();

    public wh8(Context context, mi8 mi8) {
        super(context, m, mi8, jw2.c);
    }

    public static gt6 c(Intent intent) {
        fe6 fe6;
        Status status = Status.C;
        if (intent != null) {
            Parcelable.Creator<Status> creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("status");
            fe6 fe62 = null;
            if (byteArrayExtra == null) {
                fe6 = null;
            } else {
                fe6 = i75.d(byteArrayExtra, creator);
            }
            Status status2 = (Status) fe6;
            if (status2 == null) {
                throw new ApiException(Status.E);
            } else if (status2.f()) {
                Parcelable.Creator<gt6> creator2 = gt6.CREATOR;
                byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
                if (byteArrayExtra2 != null) {
                    fe62 = i75.d(byteArrayExtra2, creator2);
                }
                gt6 gt6 = (gt6) fe62;
                if (gt6 != null) {
                    return gt6;
                }
                throw new ApiException(status);
            } else {
                throw new ApiException(status2);
            }
        } else {
            throw new ApiException(status);
        }
    }
}
