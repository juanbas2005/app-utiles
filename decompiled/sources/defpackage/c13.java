package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: c13  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class c13 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ List x;

    public /* synthetic */ c13(List list) {
        this.w = 3;
        this.x = list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    public final Object H(Object obj, Object obj2) {
        yb5 yb5;
        Object obj3;
        Object obj4;
        int i = this.w;
        vs7 vs7 = vs7.a;
        List list = this.x;
        switch (i) {
            case b85.b:
                ((Integer) obj2).getClass();
                t13.s(list, (yt2) obj, b85.v(1));
                return vs7;
            case 1:
                ((Integer) obj2).getClass();
                t13.s(list, (yt2) obj, b85.v(1));
                return vs7;
            case 2:
                ((Integer) obj2).getClass();
                xz5.f(list, (yt2) obj, b85.v(1));
                return vs7;
            default:
                CharSequence charSequence = (CharSequence) obj;
                int intValue = ((Integer) obj2).intValue();
                charSequence.getClass();
                if (list.size() == 1) {
                    String str = (String) dt0.P0(list);
                    int G0 = d57.G0(charSequence, str, intValue, false, 4);
                    if (G0 >= 0) {
                        yb5 = new yb5(Integer.valueOf(G0), str);
                        if (yb5 != null) {
                            return new yb5(yb5.w, Integer.valueOf(((String) yb5.x).length()));
                        }
                        return null;
                    }
                } else {
                    if (intValue < 0) {
                        intValue = 0;
                    }
                    pe3 pe3 = new pe3(intValue, charSequence.length(), 1);
                    boolean z = charSequence instanceof String;
                    int i2 = pe3.y;
                    int i3 = pe3.x;
                    if (z) {
                        if ((i2 > 0 && intValue <= i3) || (i2 < 0 && i3 <= intValue)) {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        String str2 = (String) obj4;
                                        if (str2.regionMatches(0, (String) charSequence, intValue, str2.length())) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str3 = (String) obj4;
                                if (str3 != null) {
                                    yb5 = new yb5(Integer.valueOf(intValue), str3);
                                } else if (intValue != i3) {
                                    intValue += i2;
                                }
                            }
                            if (yb5 != null) {
                            }
                        }
                    } else if ((i2 > 0 && intValue <= i3) || (i2 < 0 && i3 <= intValue)) {
                        int i4 = intValue;
                        while (true) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj3 = it2.next();
                                    String str4 = (String) obj3;
                                    if (d57.Q0(str4, 0, charSequence, i4, str4.length(), false)) {
                                    }
                                } else {
                                    obj3 = null;
                                }
                            }
                            String str5 = (String) obj3;
                            if (str5 != null) {
                                yb5 = new yb5(Integer.valueOf(i4), str5);
                            } else if (i4 != i3) {
                                i4 += i2;
                            }
                        }
                    }
                }
                yb5 = null;
                if (yb5 != null) {
                }
        }
    }

    public /* synthetic */ c13(List list, int i, int i2) {
        this.w = i2;
        this.x = list;
    }
}
