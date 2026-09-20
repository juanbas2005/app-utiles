package defpackage;

import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: av1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class av1 extends jb1 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public av1(String str, Bundle bundle, int i) {
        super("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", bundle);
        switch (i) {
            case 1:
                super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
                if (str.length() <= 0) {
                    h.q("password should not be empty");
                    throw null;
                }
                return;
            case 2:
                super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
                if (str.length() != 0) {
                    try {
                        new JSONObject(str);
                        return;
                    } catch (Exception unused) {
                    }
                }
                h.q("authenticationResponseJson must not be empty, and must be a valid JSON");
                throw null;
            default:
                if (str.length() != 0) {
                    try {
                        new JSONObject(str);
                        return;
                    } catch (Exception unused2) {
                    }
                }
                h.q("credentialJson must not be empty, and must be a valid JSON");
                throw null;
        }
    }
}
