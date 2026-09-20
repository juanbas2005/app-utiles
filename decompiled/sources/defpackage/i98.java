package defpackage;

/* renamed from: i98  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i98 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ i98(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2) {
        this((i2 & 1) != 0 ? "--" : str, (r1 & 2) != 0 ? "--" : str2, (r1 & 4) != 0 ? "--" : str3, (r1 & 8) != 0 ? "--" : str4, (r1 & 16) != 0 ? "--" : str5, (r1 & 32) != 0 ? "--" : str6, (r1 & 64) != 0 ? "--" : str7, (r1 & 128) != 0 ? "--" : str8, "--");
        int i3 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i98)) {
            return false;
        }
        i98 i98 = (i98) obj;
        if (sg3.e(this.a, i98.a) && sg3.e(this.b, i98.b) && sg3.e(this.c, i98.c) && sg3.e(this.d, i98.d) && sg3.e(this.e, i98.e) && sg3.e(this.f, i98.f) && sg3.e(this.g, i98.g) && sg3.e(this.h, i98.h) && sg3.e(this.i, i98.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode() + hl6.h(hl6.h(hl6.h(hl6.h(hl6.h(hl6.h(hl6.h(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder o = f21.o("WifiDetails(ssid=", this.a, ", bssid=", this.b, ", signalDbm=");
        f21.v(o, this.c, ", linkSpeed=", this.d, ", frequency=");
        f21.v(o, this.e, ", localIp=", this.f, ", gatewayIp=");
        f21.v(o, this.g, ", dnsServers=", this.h, ", internetIp=");
        return f21.l(o, this.i, ")");
    }

    public i98(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        hl6.t(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        str8.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
    }
}
