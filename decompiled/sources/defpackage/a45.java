package defpackage;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: a45  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a45 implements HostnameVerifier {
    public static final a45 a = new Object();

    public static List a(X509Certificate x509Certificate, int i) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return a42.w;
            }
            ArrayList arrayList = new ArrayList();
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        if (sg3.e(next.get(0), Integer.valueOf(i))) {
                            Object obj = next.get(1);
                            if (obj != null) {
                                arrayList.add((String) obj);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
        }
    }

    public static boolean b(String str) {
        long j;
        char c;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            h.j(pb4.i(length2, "endIndex < beginIndex: ", " < 0"));
            return false;
        } else if (length2 <= str.length()) {
            long j2 = 0;
            int i = 0;
            while (i < length2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    j2++;
                } else {
                    if (charAt < 2048) {
                        j = 2;
                    } else if (charAt < 55296 || charAt > 57343) {
                        j = 3;
                    } else {
                        int i2 = i + 1;
                        if (i2 < length2) {
                            c = str.charAt(i2);
                        } else {
                            c = 0;
                        }
                        if (charAt > 56319 || c < 56320 || c > 57343) {
                            j2++;
                            i = i2;
                        } else {
                            j2 += 4;
                            i += 2;
                        }
                    }
                    j2 += j;
                }
                i++;
            }
            if (length == ((int) j2)) {
                return true;
            }
            return false;
        } else {
            h.i(str.length(), pb4.o(length2, "endIndex > string.length: ", " > "));
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0118 A[SYNTHETIC] */
    public static boolean c(String str, X509Certificate x509Certificate) {
        boolean z;
        String str2;
        int length;
        str.getClass();
        if (bg8.a.e(str)) {
            String b = bg8.b(str);
            List<String> a2 = a(x509Certificate, 7);
            if (!a2.isEmpty()) {
                for (String b2 : a2) {
                    if (sg3.e(b, bg8.b(b2))) {
                    }
                }
            }
            return false;
        }
        if (b(str)) {
            Locale locale = Locale.US;
            locale.getClass();
            str = str.toLowerCase(locale);
            str.getClass();
        }
        List<String> a3 = a(x509Certificate, 2);
        if (!a3.isEmpty()) {
            for (String str3 : a3) {
                if (str.length() != 0 && !k57.u0(str, ".", false) && !k57.m0(str, "..", false) && str3 != null && str3.length() != 0 && !k57.u0(str3, ".", false) && !k57.m0(str3, "..", false)) {
                    if (!k57.m0(str, ".", false)) {
                        str2 = str.concat(".");
                    } else {
                        str2 = str;
                    }
                    if (!k57.m0(str3, ".", false)) {
                        str3 = str3.concat(".");
                    }
                    if (b(str3)) {
                        Locale locale2 = Locale.US;
                        locale2.getClass();
                        str3 = str3.toLowerCase(locale2);
                        str3.getClass();
                    }
                    if (!d57.x0(str3, "*", false)) {
                        z = str2.equals(str3);
                        continue;
                    } else if (k57.u0(str3, "*.", false) && d57.F0(str3, '*', 1, 4) == -1 && str2.length() >= str3.length() && !"*.".equals(str3)) {
                        String substring = str3.substring(1);
                        if (k57.m0(str2, substring, false) && ((length = str2.length() - substring.length()) <= 0 || d57.L0(str2, '.', length - 1, 4) == -1)) {
                            z = true;
                            continue;
                        }
                    }
                    if (z) {
                    }
                }
                z = false;
                continue;
                if (z) {
                }
            }
        }
        return false;
        return true;
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        str.getClass();
        sSLSession.getClass();
        if (b(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                certificate.getClass();
                return c(str, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
