package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: v83  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v83 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final List i;
    public final ArrayList j;

    public v83(String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List list, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        f2 = (i2 & 2) != 0 ? 0.0f : f2;
        f3 = (i2 & 4) != 0 ? 0.0f : f3;
        f4 = (i2 & 8) != 0 ? 0.0f : f4;
        f5 = (i2 & 16) != 0 ? 1.0f : f5;
        f6 = (i2 & 32) != 0 ? 1.0f : f6;
        f7 = (i2 & 64) != 0 ? 0.0f : f7;
        f8 = (i2 & 128) != 0 ? 0.0f : f8;
        if ((i2 & 256) != 0) {
            int i3 = e38.a;
            list = a42.w;
        }
        ArrayList arrayList = new ArrayList();
        this.a = str;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = list;
        this.j = arrayList;
    }
}
