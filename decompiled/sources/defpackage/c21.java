package defpackage;

import java.util.List;

/* renamed from: c21  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c21 implements e05 {
    public final String a;

    public c21(String str) {
        str.getClass();
        this.a = str;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [bz0, java.lang.Object] */
    public final bz0 a() {
        this.a.getClass();
        return new Object();
    }

    public final qd5 b() {
        List list;
        String str;
        String str2 = this.a;
        int length = str2.length();
        a42 a42 = a42.w;
        if (length == 0) {
            list = a42;
        } else {
            n74 m = sg3.m();
            String str3 = "";
            if (fb5.m(str2.charAt(0))) {
                int length2 = str2.length();
                int i = 0;
                while (true) {
                    if (i >= length2) {
                        str = str2;
                        break;
                    } else if (!fb5.m(str2.charAt(i))) {
                        str = str2.substring(0, i);
                        break;
                    } else {
                        i++;
                    }
                }
                m.add(new z15(sg3.D(new d21(str))));
                int length3 = str2.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length3) {
                        str2 = str3;
                        break;
                    } else if (!fb5.m(str2.charAt(i2))) {
                        str2 = str2.substring(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (str2.length() > 0) {
                if (fb5.m(str2.charAt(str2.length() - 1))) {
                    int length4 = str2.length();
                    while (true) {
                        length4--;
                        if (-1 >= length4) {
                            break;
                        } else if (!fb5.m(str2.charAt(length4))) {
                            str3 = str2.substring(0, length4 + 1);
                            break;
                        }
                    }
                    m.add(new ih5(str3));
                    int length5 = str2.length() - 1;
                    while (true) {
                        if (-1 >= length5) {
                            break;
                        } else if (!fb5.m(str2.charAt(length5))) {
                            str2 = str2.substring(length5 + 1);
                            break;
                        } else {
                            length5--;
                        }
                    }
                    m.add(new z15(sg3.D(new d21(str2))));
                } else {
                    m.add(new ih5(str2));
                }
            }
            list = sg3.i(m);
        }
        return new qd5(list, a42);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c21)) {
            return false;
        }
        if (sg3.e(this.a, ((c21) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hl6.o(new StringBuilder("ConstantFormatStructure("), this.a, ')');
    }
}
