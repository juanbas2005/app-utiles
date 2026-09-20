package defpackage;

import android.database.SQLException;

/* renamed from: j11  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class j11 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ Object y;

    public /* synthetic */ j11(l11 l11, boolean z) {
        this.w = 0;
        this.y = l11;
        this.x = z;
    }

    public final Object b() {
        String str;
        xp4 i;
        int i2 = this.w;
        vs7 vs7 = vs7.a;
        Object obj = this.y;
        boolean z = this.x;
        switch (i2) {
            case b85.b:
                l11 l11 = (l11) obj;
                if (z) {
                    str = "reader";
                } else {
                    str = "writer";
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\nWriter pool:\n");
                l11.x.d(sb);
                sb.append("Reader pool:");
                sb.append(10);
                l11.w.d(sb);
                try {
                    l55.w(5, sb.toString());
                    throw null;
                } catch (SQLException e) {
                    int i3 = l11.C;
                    if (i3 != 1) {
                        if (i3 == 2) {
                            e.printStackTrace();
                        }
                        return vs7;
                    }
                    throw e;
                }
            case 1:
                sr2 sr2 = (sr2) obj;
                if (z) {
                    sr2.b();
                }
                return vs7;
            case 2:
                og ogVar = (og) obj;
                if (z && (i = ogVar.i()) != null) {
                    ((pr6) i).r(vs7);
                }
                return vs7;
            default:
                ok2 ok2 = (ok2) obj;
                if (z) {
                    ok2.a(ok2);
                }
                return vs7;
        }
    }

    public /* synthetic */ j11(int i, Object obj, boolean z) {
        this.w = i;
        this.x = z;
        this.y = obj;
    }
}
