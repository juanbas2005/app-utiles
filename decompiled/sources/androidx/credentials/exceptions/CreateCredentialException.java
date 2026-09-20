package androidx.credentials.exceptions;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/exceptions/CreateCredentialException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class CreateCredentialException extends Exception {
    /* JADX WARNING: Illegal instructions before constructor call */
    public CreateCredentialException(CharSequence charSequence, String str) {
        super(r1);
        String str2;
        if (charSequence != null) {
            str2 = charSequence.toString();
        } else {
            str2 = null;
        }
    }
}
