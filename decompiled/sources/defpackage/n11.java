package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* renamed from: n11  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n11 {
    public static final n11 e;
    public static final n11 f = new n11(false, false, (String[]) null, (String[]) null);
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        tp0 tp0 = tp0.r;
        tp0 tp02 = tp0.s;
        tp0 tp03 = tp0.t;
        tp0 tp04 = tp0.l;
        tp0 tp05 = tp0.n;
        tp0 tp06 = tp0.m;
        tp0 tp07 = tp0.o;
        tp0 tp08 = tp0.q;
        tp0 tp09 = tp0.p;
        List E = sg3.E(tp0, tp02, tp03, tp04, tp05, tp06, tp07, tp08, tp09);
        tp0 tp010 = tp02;
        tp0 tp011 = tp0;
        List list = E;
        tp0 tp012 = tp09;
        tp0 tp013 = tp08;
        tp0 tp014 = tp07;
        tp0 tp015 = tp06;
        tp0 tp016 = tp05;
        tp0 tp017 = tp04;
        tp0 tp018 = tp03;
        List E2 = sg3.E(tp011, tp010, tp018, tp017, tp016, tp015, tp014, tp013, tp012, tp0.j, tp0.k, tp0.h, tp0.i, tp0.f, tp0.g, tp0.e);
        w70 w70 = new w70();
        tp0[] tp0Arr = (tp0[]) list.toArray(new tp0[0]);
        w70.c((tp0[]) Arrays.copyOf(tp0Arr, tp0Arr.length));
        bj7 bj7 = bj7.TLS_1_3;
        bj7 bj72 = bj7.TLS_1_2;
        w70.d(bj7, bj72);
        w70.b = true;
        w70.b();
        w70 w702 = new w70();
        tp0[] tp0Arr2 = (tp0[]) E2.toArray(new tp0[0]);
        w702.c((tp0[]) Arrays.copyOf(tp0Arr2, tp0Arr2.length));
        w702.d(bj7, bj72);
        w702.b = true;
        e = w702.b();
        w70 w703 = new w70();
        tp0[] tp0Arr3 = (tp0[]) E2.toArray(new tp0[0]);
        w703.c((tp0[]) Arrays.copyOf(tp0Arr3, tp0Arr3.length));
        w703.d(bj7, bj72, bj7.TLS_1_1, bj7.TLS_1_0);
        w703.b = true;
        w703.b();
    }

    public n11(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final void a(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        enabledCipherSuites.getClass();
        String[] strArr2 = this.c;
        if (strArr2 != null) {
            enabledCipherSuites = dg8.j(strArr2, enabledCipherSuites, tp0.c);
        }
        String[] strArr3 = this.d;
        if (strArr3 != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            enabledProtocols.getClass();
            strArr = dg8.j(enabledProtocols, strArr3, dr4.x);
        } else {
            strArr = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        a91 a91 = tp0.c;
        byte[] bArr = dg8.a;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (a91.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            str.getClass();
            enabledCipherSuites.getClass();
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        String[] strArr4 = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length);
        boolean z2 = this.a;
        if (!z2) {
            h.q("no cipher suites for cleartext connections");
        } else if (strArr4.length != 0) {
            String[] strArr5 = (String[]) Arrays.copyOf(strArr4, strArr4.length);
            String[] strArr6 = (String[]) Arrays.copyOf(strArr, strArr.length);
            if (!z2) {
                h.q("no TLS versions for cleartext connections");
            } else if (strArr6.length != 0) {
                n11 n11 = new n11(z2, this.b, strArr5, (String[]) Arrays.copyOf(strArr6, strArr6.length));
                if (n11.c() != null) {
                    sSLSocket.setEnabledProtocols(n11.d);
                }
                if (n11.b() != null) {
                    sSLSocket.setEnabledCipherSuites(n11.c);
                }
            } else {
                h.q("At least one TLS version is required");
            }
        } else {
            h.q("At least one cipher suite is required");
        }
    }

    public final ArrayList b() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String w : strArr) {
            arrayList.add(tp0.b.w(w));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String j : strArr) {
            bj7.x.getClass();
            arrayList.add(or2.j(j));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n11)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        n11 n11 = (n11) obj;
        boolean z = n11.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (!z2) {
            return true;
        }
        if (Arrays.equals(this.c, n11.c) && Arrays.equals(this.d, n11.d) && this.b == n11.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (!this.a) {
            return 17;
        }
        int i2 = 0;
        String[] strArr = this.c;
        if (strArr != null) {
            i = Arrays.hashCode(strArr);
        } else {
            i = 0;
        }
        int i3 = (527 + i) * 31;
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            i2 = Arrays.hashCode(strArr2);
        }
        return ((i3 + i2) * 31) + (this.b ^ true ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.b + ')';
    }
}
