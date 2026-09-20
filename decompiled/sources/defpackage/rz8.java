package defpackage;

import android.os.Bundle;

/* renamed from: rz8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rz8 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final Bundle e;

    public rz8(long j, long j2, Bundle bundle, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.e = bundle;
        this.c = j;
        this.d = j2;
    }

    public static rz8 a(zr8 zr8) {
        String str = zr8.w;
        String str2 = zr8.y;
        return new rz8(zr8.z, zr8.A, zr8.x.l(), str, str2);
    }

    public final zr8 b() {
        ur8 ur8 = new ur8(new Bundle(this.e));
        return new zr8(this.a, ur8, this.b, this.c, this.d);
    }

    public final String toString() {
        String obj = this.e.toString();
        String str = this.b;
        int length = String.valueOf(str).length();
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + obj.length());
        f21.v(sb, "origin=", str, ",name=", str2);
        return f21.l(sb, ",params=", obj);
    }
}
