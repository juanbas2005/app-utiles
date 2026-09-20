package defpackage;

/* renamed from: v28  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class v28 extends u28 {
    public xe5[] a;
    public String b;
    public int c;

    public v28(v28 v28) {
        this.a = null;
        this.c = 0;
        this.b = v28.b;
        xe5[] xe5Arr = v28.a;
        xe5[] xe5Arr2 = new xe5[xe5Arr.length];
        for (int i = 0; i < xe5Arr.length; i++) {
            xe5Arr2[i] = new xe5(xe5Arr[i]);
        }
        this.a = xe5Arr2;
    }

    public xe5[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(xe5[] xe5Arr) {
        xe5[] xe5Arr2 = this.a;
        if (!(xe5Arr2 == null || xe5Arr == null || xe5Arr2.length != xe5Arr.length)) {
            int i = 0;
            while (i < xe5Arr2.length) {
                xe5 xe5 = xe5Arr2[i];
                char c2 = xe5.a;
                xe5 xe52 = xe5Arr[i];
                if (c2 == xe52.a && xe5.b.length == xe52.b.length) {
                    i++;
                }
            }
            xe5[] xe5Arr3 = this.a;
            for (int i2 = 0; i2 < xe5Arr.length; i2++) {
                xe5Arr3[i2].a = xe5Arr[i2].a;
                int i3 = 0;
                while (true) {
                    float[] fArr = xe5Arr[i2].b;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    xe5Arr3[i2].b[i3] = fArr[i3];
                    i3++;
                }
            }
            return;
        }
        xe5[] xe5Arr4 = new xe5[xe5Arr.length];
        for (int i4 = 0; i4 < xe5Arr.length; i4++) {
            xe5Arr4[i4] = new xe5(xe5Arr[i4]);
        }
        this.a = xe5Arr4;
    }

    public v28() {
        this.a = null;
        this.c = 0;
    }
}
