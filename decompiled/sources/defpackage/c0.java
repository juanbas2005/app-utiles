package defpackage;

import cu.lestebang.utiletecsa.R;
import java.util.HashSet;

/* renamed from: c0  reason: default package */
public final class c0 implements gs2 {
    public static final c0 A = new c0(3);
    public static final c0 B = new c0(4);
    public static final c0 C = new c0(5);
    public static final /* synthetic */ c0 D = new c0(6);
    public static final /* synthetic */ c0 E = new c0(7);
    public static final c0 x = new c0(0);
    public static final c0 y = new c0(1);
    public static final c0 z = new c0(2);
    public final /* synthetic */ int w;

    public /* synthetic */ c0(int i) {
        this.w = i;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        boolean z2 = false;
        switch (i) {
            case b85.b:
                sm smVar = (sm) obj;
                li4 li4 = (li4) obj2;
                smVar.getClass();
                li4.getClass();
                return smVar.c.get(li4);
            case 1:
                sm smVar2 = (sm) obj;
                li4 li42 = (li4) obj2;
                smVar2.getClass();
                li42.getClass();
                return smVar2.b.get(li42);
            case 2:
                vj1 vj1 = (vj1) obj;
                vj1 vj12 = (vj1) obj2;
                return Boolean.FALSE;
            case 3:
                ei4 ei4 = (ei4) obj;
                qs5 qs5 = (qs5) obj2;
                HashSet hashSet = oq3.z;
                ei4.getClass();
                qs5.getClass();
                return ei4.g(qs5, true);
            case 4:
                ei4 ei42 = (ei4) obj;
                qs5 qs52 = (qs5) obj2;
                int i2 = pr3.z;
                ei42.getClass();
                qs52.getClass();
                return ei42.g(qs52, true);
            case 5:
                ne6 ne6 = (ne6) obj;
                long j = ((jt0) obj2).a;
                if (j == 16) {
                    return Boolean.FALSE;
                }
                return Integer.valueOf(uq3.M(j));
            case 6:
                int intValue = ((Integer) obj2).intValue();
                int i3 = intValue & 3;
                int i4 = intValue & 1;
                yt2 yt2 = (yt2) obj;
                fw0 fw0 = cr8.a;
                if (i3 != 2) {
                    z2 = true;
                }
                if (yt2.V(i4, z2)) {
                    d83.a(x91.A(), l55.u(R.string.back_button_content_description, yt2), (ml4) null, 0, yt2, 0, 12);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                int i5 = intValue2 & 3;
                int i6 = intValue2 & 1;
                yt2 yt22 = (yt2) obj;
                fw0 fw02 = fv8.a;
                if (i5 != 2) {
                    z2 = true;
                }
                if (yt22.V(i6, z2)) {
                    d83.a(x91.A(), l55.u(R.string.back_button_content_description, yt22), (ml4) null, 0, yt22, 0, 12);
                } else {
                    yt22.Y();
                }
                return vs7;
        }
    }
}
