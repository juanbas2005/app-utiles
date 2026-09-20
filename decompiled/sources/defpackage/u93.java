package defpackage;

import java.util.Arrays;

/* renamed from: u93  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u93 extends i93 {
    public final er4 d = er4.w;

    public u93() {
        super(4);
    }

    public final p36 e() {
        p36 p36;
        Object[] objArr = this.c;
        int i = this.b;
        er4 er4 = this.d;
        if (i != 0) {
            p25.d(i, objArr);
            Arrays.sort(objArr, 0, i, er4);
            int i2 = 1;
            for (int i3 = 1; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (er4.compare(obj, objArr[i2 - 1]) != 0) {
                    objArr[i2] = obj;
                    i2++;
                }
            }
            Arrays.fill(objArr, i2, i, (Object) null);
            if (i2 < objArr.length / 2) {
                objArr = Arrays.copyOf(objArr, i2);
            }
            p36 = new p36(q93.p(i2, objArr), er4);
        } else if (er4.w != er4) {
            p36 = new p36(i36.A, er4);
        } else {
            p36 = p36.D;
        }
        this.b = p36.C.size();
        this.a = true;
        return p36;
    }
}
