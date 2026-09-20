package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: qw2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qw2 extends wc1 {
    public final String c;

    /* JADX WARNING: Illegal instructions before constructor call */
    public qw2(String str, String str2, String str3, String str4, String str5, Uri uri, String str6) {
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", r0);
        str.getClass();
        str2.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str3);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str4);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str6);
        bundle.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        this.c = str2;
        int length = str.length();
        String str7 = null;
        if (length <= 0) {
            h.q("id should not be empty");
            throw null;
        } else if (str2.length() > 0) {
            List W0 = d57.W0(str2, new String[]{"."}, 6);
            if (W0.size() == 3) {
                try {
                    byte[] decode = Base64.decode((String) W0.get(1), 8);
                    decode.getClass();
                    Charset charset = StandardCharsets.UTF_8;
                    charset.getClass();
                    JSONObject jSONObject = new JSONObject(new String(decode, charset));
                    jSONObject.optString("email").getClass();
                    String optString = jSONObject.optString("sub");
                    if (optString.length() != 0) {
                        str7 = optString;
                    }
                    if (str7 == null) {
                        throw new IllegalArgumentException("ID token missing required field: sub");
                    }
                } catch (JSONException e) {
                    throw new IllegalArgumentException(e);
                }
            } else {
                h.q("Invalid token format");
                throw null;
            }
        } else {
            h.q("idToken should not be empty");
            throw null;
        }
    }
}
