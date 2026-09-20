package defpackage;

import java.util.Iterator;

/* renamed from: we4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class we4 extends ye4 implements Iterator, ar3 {
    public final /* synthetic */ int A;

    public we4(ze4 ze4, int i) {
        this.A = i;
        ze4.getClass();
        this.z = ze4;
        this.x = -1;
        this.y = ze4.D;
        f();
    }

    public final Object next() {
        switch (this.A) {
            case b85.b:
                b();
                int i = this.w;
                ze4 ze4 = (ze4) this.z;
                if (i < ze4.B) {
                    this.w = i + 1;
                    this.x = i;
                    xe4 xe4 = new xe4(ze4, i);
                    f();
                    return xe4;
                }
                rf2.c();
                return null;
            case 1:
                b();
                int i2 = this.w;
                ze4 ze42 = (ze4) this.z;
                if (i2 < ze42.B) {
                    this.w = i2 + 1;
                    this.x = i2;
                    Object obj = ze42.w[i2];
                    f();
                    return obj;
                }
                rf2.c();
                return null;
            default:
                b();
                int i3 = this.w;
                ze4 ze43 = (ze4) this.z;
                if (i3 < ze43.B) {
                    this.w = i3 + 1;
                    this.x = i3;
                    Object[] objArr = ze43.x;
                    objArr.getClass();
                    Object obj2 = objArr[this.x];
                    f();
                    return obj2;
                }
                rf2.c();
                return null;
        }
    }
}
