package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* renamed from: j49  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class j49 implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ u39 c;

    public /* synthetic */ j49(boolean z, String str, u39 u39) {
        this.a = z;
        this.b = str;
        this.c = u39;
    }

    public final Object call() {
        String str;
        MessageDigest messageDigest;
        boolean z = this.a;
        String str2 = this.b;
        u39 u39 = this.c;
        if (z || !j79.b(str2, u39, true, false).x) {
            str = "not allowed";
        } else {
            str = "debug cert rejected";
        }
        int i = 0;
        while (true) {
            if (i >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
                if (messageDigest != null) {
                    break;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        z65.k(messageDigest);
        byte[] digest = messageDigest.digest(u39.f);
        int length = digest.length;
        char[] cArr = new char[(length + length)];
        int i2 = 0;
        for (byte b2 : digest) {
            char[] cArr2 = pd8.h;
            cArr[i2] = cArr2[(b2 & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b2 & 15];
            i2 += 2;
        }
        return str + ": pkg=" + str2 + ", sha256=" + new String(cArr) + ", atk=" + z + ", ver=12451000.false";
    }
}
