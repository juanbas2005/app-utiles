package defpackage;

import android.net.Uri;

/* renamed from: cb9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cb9 {
    public final Uri a;
    public final d79 b;
    public final xn5 c;
    public final q93 d;

    public cb9(Uri uri, d79 d79, xn5 xn5, q93 q93) {
        this.a = uri;
        this.b = d79;
        this.c = xn5;
        this.d = q93;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cb9)) {
            return false;
        }
        cb9 cb9 = (cb9) obj;
        if (!this.a.equals(cb9.a) || !this.b.equals(cb9.b) || !this.c.equals(cb9.c) || !this.d.equals(cb9.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003)) * 1000003) ^ kw5.O.hashCode()) * 1000003) ^ 1231) * 1000003) ^ 1237;
    }

    public final String toString() {
        String obj = this.a.toString();
        int length = obj.length();
        String nl8 = this.b.toString();
        int length2 = nl8.length();
        kw5 kw5 = kw5.O;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String obj2 = kw5.toString();
        int length3 = valueOf.length();
        int length4 = valueOf2.length();
        StringBuilder sb = new StringBuilder(length + 34 + length2 + 10 + length3 + 13 + length4 + 16 + obj2.length() + 32 + String.valueOf(true).length() + 22);
        f21.v(sb, "ProtoDataStoreConfig{uri=", obj, ", schema=", nl8);
        f21.v(sb, ", handler=", valueOf, ", migrations=", valueOf2);
        return f21.m(sb, ", variantConfig=", obj2, ", useGeneratedExtensionRegistry=true, enableTracing=false}");
    }
}
