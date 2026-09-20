package defpackage;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: gi0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class gi0 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ sr2 x;

    public /* synthetic */ gi0(int i, sr2 sr2) {
        this.w = i;
        this.x = sr2;
    }

    public final Object b() {
        int i = this.w;
        vs7 vs7 = vs7.a;
        sr2 sr2 = this.x;
        switch (i) {
            case b85.b:
                sr2.b();
                return vs7;
            case 1:
                sr2.b();
                return vs7;
            case 2:
                try {
                    return (List) sr2.b();
                } catch (SSLPeerUnverifiedException unused) {
                    return a42.w;
                }
            case 3:
                sr2.b();
                return vs7;
            case 4:
                sr2.b();
                return vs7;
            case 5:
                sr2.b();
                return vs7;
            case 6:
                sr2.b();
                return vs7;
            case 7:
                sr2.b();
                return vs7;
            case 8:
                float floatValue = ((Number) sr2.b()).floatValue();
                if (floatValue < 0.0f) {
                    floatValue = 0.0f;
                }
                if (floatValue > 1.0f) {
                    floatValue = 1.0f;
                }
                return Float.valueOf(floatValue);
            case 9:
                sr2.b();
                return Boolean.TRUE;
            default:
                sr2.b();
                return vs7;
        }
    }
}
