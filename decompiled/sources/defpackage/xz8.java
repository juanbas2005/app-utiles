package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* renamed from: xz8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xz8 extends g89 {
    public final /* synthetic */ int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xz8(v89 v89, int i) {
        super(v89);
        this.z = i;
    }

    public final void f1() {
        int i = this.z;
    }

    public boolean g1() {
        d1();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((y19) this.w).w.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    public void j1(String str, i89 i89, w19 w19, tz8 tz8) {
        String str2;
        String str3 = i89.a;
        y19 y19 = (y19) this.w;
        b1();
        d1();
        try {
            URL url = new URI(str3).toURL();
            this.x.h0();
            byte[] a = w19.a();
            r19 r19 = y19.C;
            y19.g(r19);
            Map map = i89.b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
            try {
                r19.o1(new vz8(this, str2, url, a, map, tz8));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                pz8 pz8 = y19.B;
                y19.g(pz8);
                pz8.B.c(pz8.k1(str2), str3, "Failed to parse URL. Not uploading MeasurementBatch. appId");
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            str2 = str;
            pz8 pz82 = y19.B;
            y19.g(pz82);
            pz82.B.c(pz8.k1(str2), str3, "Failed to parse URL. Not uploading MeasurementBatch. appId");
        }
    }

    private final void h1() {
    }

    private final void i1() {
    }
}
