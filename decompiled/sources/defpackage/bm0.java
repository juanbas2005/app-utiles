package defpackage;

import java.util.Iterator;

/* renamed from: bm0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bm0 implements Iterator, ar3 {
    public final /* synthetic */ int w;
    public int x;
    public String y;
    public final /* synthetic */ fm0 z;

    public bm0(fm0 fm0, int i) {
        this.w = i;
        switch (i) {
            case 1:
                this.z = fm0;
                while (true) {
                    int i2 = this.x;
                    fm0 fm02 = this.z;
                    if (i2 < fm02.A) {
                        int i3 = fm02.z[i2];
                        if (i3 < 0 || fm02.w[i3] == null) {
                            this.x = i2 + 1;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                break;
            case 2:
                this.z = fm0;
                while (true) {
                    int i4 = this.x;
                    fm0 fm03 = this.z;
                    if (i4 < fm03.A) {
                        int i5 = fm03.z[i4];
                        if (i5 < 0 || fm03.w[i5] == null) {
                            this.x = i4 + 1;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                break;
            default:
                this.z = fm0;
                while (true) {
                    int i6 = this.x;
                    fm0 fm04 = this.z;
                    if (i6 < fm04.A) {
                        int i7 = fm04.z[i6];
                        if (i7 < 0 || fm04.w[i7] == null) {
                            this.x = i6 + 1;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                break;
        }
    }

    public final boolean hasNext() {
        int i = this.w;
        fm0 fm0 = this.z;
        switch (i) {
            case b85.b:
                if (this.x < fm0.A) {
                    return true;
                }
                return false;
            case 1:
                if (this.x < fm0.A) {
                    return true;
                }
                return false;
            default:
                if (this.x < fm0.A) {
                    return true;
                }
                return false;
        }
    }

    public final Object next() {
        int i;
        int i2;
        int i3;
        int i4 = this.w;
        Object obj = null;
        fm0 fm0 = this.z;
        switch (i4) {
            case b85.b:
                if (hasNext()) {
                    int i5 = fm0.z[this.x];
                    String str = fm0.w[i5];
                    str.getClass();
                    this.y = str;
                    Object obj2 = fm0.x[i5];
                    obj2.getClass();
                    dm0 dm0 = new dm0(fm0, str, obj2);
                    this.x++;
                    while (true) {
                        int i6 = this.x;
                        if (i6 < fm0.A && ((i = fm0.z[i6]) < 0 || fm0.w[i] == null)) {
                            this.x = i6 + 1;
                        }
                    }
                    return dm0;
                }
                rf2.c();
                return null;
            case 1:
                if (hasNext()) {
                    String str2 = fm0.w[fm0.z[this.x]];
                    str2.getClass();
                    this.y = str2;
                    this.x++;
                    while (true) {
                        int i7 = this.x;
                        if (i7 >= fm0.A || ((i2 = fm0.z[i7]) >= 0 && fm0.w[i2] != null)) {
                            String str3 = this.y;
                            str3.getClass();
                        } else {
                            this.x = i7 + 1;
                        }
                    }
                    String str32 = this.y;
                    str32.getClass();
                    return str32;
                }
                rf2.c();
                return null;
            default:
                if (hasNext()) {
                    int i8 = fm0.z[this.x];
                    String str4 = fm0.w[i8];
                    str4.getClass();
                    this.y = str4;
                    obj = fm0.x[i8];
                    obj.getClass();
                    this.x++;
                    while (true) {
                        int i9 = this.x;
                        if (i9 < fm0.A && ((i3 = fm0.z[i9]) < 0 || fm0.w[i3] == null)) {
                            this.x = i9 + 1;
                        }
                    }
                } else {
                    rf2.c();
                }
                return obj;
        }
    }

    public final void remove() {
        int i = this.w;
        fm0 fm0 = this.z;
        switch (i) {
            case b85.b:
                String str = this.y;
                if (str != null) {
                    fm0.remove(str);
                    this.y = null;
                    return;
                }
                h.s("next() must be called before remove()");
                return;
            case 1:
                String str2 = this.y;
                if (str2 != null) {
                    fm0.remove(str2);
                    this.y = null;
                    return;
                }
                h.s("next() must be called before remove()");
                return;
            default:
                String str3 = this.y;
                if (str3 != null) {
                    fm0.remove(str3);
                    this.y = null;
                    return;
                }
                h.s("next() must be called before remove()");
                return;
        }
    }
}
