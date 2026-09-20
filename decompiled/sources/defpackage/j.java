package defpackage;

import com.google.zxing.NotFoundException;

/* renamed from: j  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j extends n {
    public final /* synthetic */ int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(i90 i90, int i) {
        super(i90);
        this.c = i;
    }

    public final String p() {
        if (((i90) this.a).x == 60) {
            StringBuilder sb = new StringBuilder();
            s(5, sb);
            w(sb, 45, 15);
            return sb.toString();
        }
        throw NotFoundException.y;
    }

    public final void u(int i, StringBuilder sb) {
        switch (this.c) {
            case b85.b:
                sb.append("(3103)");
                return;
            default:
                if (i < 10000) {
                    sb.append("(3202)");
                    return;
                } else {
                    sb.append("(3203)");
                    return;
                }
        }
    }

    public final int v(int i) {
        switch (this.c) {
            case b85.b:
                return i;
            default:
                if (i < 10000) {
                    return i;
                }
                return i - 10000;
        }
    }
}
