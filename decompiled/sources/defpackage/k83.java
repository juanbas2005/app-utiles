package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: k83  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k83 {
    public static final String[] c = {"*", "FCM", "GCM", ""};
    public final SharedPreferences a;
    public final String b;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
        if (r1.isEmpty() != false) goto L_0x003c;
     */
    public k83(oe2 oe2) {
        oe2.a();
        this.a = oe2.a.getSharedPreferences("com.google.android.gms.appid", 0);
        oe2.a();
        cf2 cf2 = oe2.c;
        String str = cf2.e;
        if (str == null) {
            oe2.a();
            str = cf2.b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] split = str.split(":");
                if (split.length == 4) {
                    str = split[1];
                }
                str = null;
            }
        }
        this.b = str;
    }

    public final String a() {
        String str;
        PublicKey publicKey;
        synchronized (this.a) {
            str = null;
            String string = this.a.getString("|S||P|", (String) null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                Log.w("ContentValues", "Invalid key stored " + e);
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
        }
        return str;
    }
}
