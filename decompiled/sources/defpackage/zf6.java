package defpackage;

import android.content.Intent;

/* renamed from: zf6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zf6 {
    public final String a;
    public final String b;
    public final byte[] c;
    public final Integer d;
    public final String e;
    public final String f;
    public final Intent g;

    public zf6(String str, String str2, byte[] bArr, Integer num, String str3, String str4, Intent intent) {
        this.a = str;
        this.b = str2;
        this.c = bArr;
        this.d = num;
        this.e = str3;
        this.f = str4;
        this.g = intent;
    }

    public final String toString() {
        int i;
        byte[] bArr = this.c;
        if (bArr == null) {
            i = 0;
        } else {
            i = bArr.length;
        }
        return "Format: " + this.b + "\nContents: " + this.a + "\nRaw bytes: (" + i + " bytes)\nOrientation: " + this.d + "\nEC level: " + this.e + "\nBarcode image: " + this.f + "\nOriginal intent: " + this.g + 10;
    }
}
