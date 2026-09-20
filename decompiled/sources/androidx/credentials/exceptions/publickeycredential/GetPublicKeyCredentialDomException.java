package androidx.credentials.exceptions.publickeycredential;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;", "Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialException;", "pv8", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class GetPublicKeyCredentialDomException extends GetPublicKeyCredentialException {
    public static final /* synthetic */ int y = 0;

    /* JADX WARNING: Illegal instructions before constructor call */
    public GetPublicKeyCredentialDomException(u uVar, String str) {
        super(str, r2);
        String concat = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(uVar.a);
        if (concat.length() <= 0) {
            h.q("type must not be empty");
            throw null;
        }
    }
}
