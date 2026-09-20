package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/gms/identitycredentials/GetCredentialRequest;", "La3;", "Lcom/google/android/gms/common/internal/ReflectedParcelable;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "toBundle", "()Landroid/os/Bundle;", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class GetCredentialRequest extends a3 implements ReflectedParcelable {
    public static final Parcelable.Creator<GetCredentialRequest> CREATOR = new ri8(21);
    public final List w;
    public final Bundle x;
    public final String y;
    public final ResultReceiver z;

    public GetCredentialRequest(ArrayList arrayList, Bundle bundle, String str, ResultReceiver resultReceiver) {
        arrayList.getClass();
        bundle.getClass();
        resultReceiver.getClass();
        this.w = arrayList;
        this.x = bundle;
        this.y = str;
        this.z = resultReceiver;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int M = h75.M(parcel, 20293);
        h75.I(parcel, 1, this.w);
        h75.z(parcel, 2, this.x);
        h75.F(parcel, 3, this.y);
        h75.E(parcel, 4, this.z, i);
        h75.O(parcel, M);
    }
}
