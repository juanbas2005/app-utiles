package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jy2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jy2 {
    public final bj7 a;
    public final tp0 b;
    public final List c;
    public final z97 d;

    public jy2(bj7 bj7, tp0 tp0, List list, sr2 sr2) {
        this.a = bj7;
        this.b = tp0;
        this.c = list;
        this.d = new z97(new gi0(2, sr2));
    }

    public final List a() {
        return (List) this.d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jy2)) {
            return false;
        }
        jy2 jy2 = (jy2) obj;
        if (jy2.a != this.a || jy2.b != this.b || !sg3.e(jy2.a(), a()) || !jy2.c.equals(this.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = a().hashCode();
        return this.c.hashCode() + ((hashCode2 + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        String str2;
        List<Certificate> a2 = a();
        ArrayList arrayList = new ArrayList(et0.e0(a2, 10));
        for (Certificate certificate : a2) {
            if (certificate instanceof X509Certificate) {
                str2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                str2 = certificate.getType();
                str2.getClass();
            }
            arrayList.add(str2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.a);
        sb.append(" cipherSuite=");
        sb.append(this.b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.c;
        ArrayList arrayList2 = new ArrayList(et0.e0(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                str = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                str = certificate2.getType();
                str.getClass();
            }
            arrayList2.add(str);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
