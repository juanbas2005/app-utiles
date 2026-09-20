package defpackage;

import com.google.zxing.NotFoundException;

/* renamed from: k  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k extends m {
    public final /* synthetic */ int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(i90 i90, int i) {
        super(i90);
        this.c = i;
    }

    public final String p() {
        switch (this.c) {
            case b85.b:
                wr0 wr0 = (wr0) this.b;
                if (((i90) this.a).x >= 48) {
                    StringBuilder sb = new StringBuilder();
                    s(8, sb);
                    int C = wr0.C(48, 2, (i90) wr0.x);
                    sb.append("(392");
                    sb.append(C);
                    sb.append(')');
                    sb.append(wr0.w(50, (String) null).b);
                    return sb.toString();
                }
                throw NotFoundException.y;
            case 1:
                wr0 wr02 = (wr0) this.b;
                if (((i90) this.a).x >= 48) {
                    StringBuilder sb2 = new StringBuilder();
                    s(8, sb2);
                    int C2 = wr0.C(48, 2, (i90) wr02.x);
                    sb2.append("(393");
                    sb2.append(C2);
                    sb2.append(')');
                    int C3 = wr0.C(50, 10, (i90) wr02.x);
                    if (C3 / 100 == 0) {
                        sb2.append('0');
                    }
                    if (C3 / 10 == 0) {
                        sb2.append('0');
                    }
                    sb2.append(C3);
                    sb2.append(wr02.w(60, (String) null).b);
                    return sb2.toString();
                }
                throw NotFoundException.y;
            default:
                StringBuilder o = b81.o("(01)");
                int length = o.length();
                wr0 wr03 = (wr0) this.b;
                o.append(wr0.C(4, 4, (i90) wr03.x));
                t(o, 8, length);
                return wr03.v(48, o);
        }
    }
}
