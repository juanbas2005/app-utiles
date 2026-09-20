package defpackage;

import java.util.Comparator;
import java.util.Map;

/* renamed from: la2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class la2 implements Comparator {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public la2(Comparator comparator) {
        this.w = 4;
        this.x = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        Class<?> cls;
        String str;
        String str2;
        int i = this.w;
        Object obj3 = this.x;
        switch (i) {
            case b85.b:
                ay5 ay5 = (ay5) obj3;
                return ((Comparable) ay5.y(obj)).compareTo((Comparable) ay5.y(obj2));
            case 1:
                String str3 = (String) obj3;
                vq3 J = ((as3) obj).J();
                if (J != null) {
                    if (J instanceof gq3) {
                        str = kl8.u((gq3) J).getName();
                    } else if (J instanceof cs3) {
                        str = ((cs3) J).b();
                    } else {
                        cls = J.getClass();
                        ku4.x("Unknown upper bound classifier: ", b26.a.b(cls));
                        return 0;
                    }
                    vq3 J2 = ((as3) obj2).J();
                    if (J2 != null) {
                        if (J2 instanceof gq3) {
                            str2 = kl8.u((gq3) J2).getName();
                        } else if (J2 instanceof cs3) {
                            str2 = ((cs3) J2).b();
                        } else {
                            cls = J2.getClass();
                            ku4.x("Unknown upper bound classifier: ", b26.a.b(cls));
                            return 0;
                        }
                        return pd8.k(str, str2);
                    }
                    ku4.z("Upper bounds are always denotable. Upper bounds appear non-denotable for member: '", str3);
                    return 0;
                }
                ku4.z("Upper bounds are always denotable. Upper bounds appear non-denotable for member: '", str3);
                return 0;
            case 2:
                vw3 vw3 = (vw3) obj;
                vr2 vr2 = (vr2) obj3;
                vw3.getClass();
                String obj4 = vr2.y(vw3).toString();
                vw3 vw32 = (vw3) obj2;
                vw32.getClass();
                return pd8.k(obj4, vr2.y(vw32).toString());
            case 3:
                gp4 gp4 = (gp4) obj3;
                return Float.valueOf(gp4.c(((Map.Entry) obj2).getKey())).compareTo(Float.valueOf(gp4.c(((Map.Entry) obj).getKey())));
            case 4:
                int compare = ((Comparator) obj3).compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return uy3.m0.compare(((fk6) obj).c, ((fk6) obj2).c);
            default:
                int compare2 = ((la2) obj3).compare(obj, obj2);
                if (compare2 != 0) {
                    return compare2;
                }
                return Integer.valueOf(((fk6) obj).f).compareTo(Integer.valueOf(((fk6) obj2).f));
        }
    }

    public /* synthetic */ la2(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }
}
