package defpackage;

import java.util.List;

/* renamed from: wi  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class wi implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ aq4 x;

    public /* synthetic */ wi(aq4 aq4, int i) {
        this.w = i;
        this.x = aq4;
    }

    public final Object b() {
        int i = this.w;
        vs7 vs7 = vs7.a;
        aq4 aq4 = this.x;
        switch (i) {
            case b85.b:
                dy3 dy3 = (dy3) aq4.getValue();
                if (dy3 != null) {
                    return dy3;
                }
                bc3.d("Required value was null.");
                ta1.e();
                return null;
            case 1:
                aq4.setValue(i20.z);
                return vs7;
            case 2:
                aq4.setValue(i20.A);
                return vs7;
            case 3:
                aq4.setValue(i20.C);
                return vs7;
            case 4:
                aq4.setValue(i20.B);
                return vs7;
            case 5:
                aq4.setValue(i20.w);
                return vs7;
            case 6:
                aq4.setValue(i20.x);
                return vs7;
            case 7:
                aq4.setValue(i20.y);
                return vs7;
            case 8:
                aq4.setValue((Object) null);
                return vs7;
            case 9:
                aq4.setValue((Object) null);
                return vs7;
            case 10:
                aq4.setValue(b56.w);
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                aq4.setValue(b56.x);
                return vs7;
            case 12:
                aq4.setValue((Object) null);
                return vs7;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                aq4.setValue((Object) null);
                return vs7;
            case 14:
                aq4.setValue((Object) null);
                return vs7;
            case h75.g:
                aq4.setValue((Object) null);
                return vs7;
            case 16:
                aq4.setValue((Object) null);
                return vs7;
            case 17:
                dy3 dy32 = (dy3) aq4.getValue();
                if (dy32 != null) {
                    return dy32;
                }
                bc3.d("Required value was null.");
                ta1.e();
                return null;
            case 18:
                if (aq4 != null) {
                    return (List) aq4.getValue();
                }
                return null;
            case 19:
                Boolean bool = (Boolean) aq4.getValue();
                bool.booleanValue();
                return bool;
            case 20:
                aq4.setValue(Boolean.valueOf(!((Boolean) aq4.getValue()).booleanValue()));
                return vs7;
            case 21:
                aq4.setValue(vs7);
                return vs7;
            case 22:
                ((g92) aq4.getValue()).getClass();
                aq4.setValue(new Object());
                return vs7;
            case 23:
                aq4.setValue(Boolean.FALSE);
                return vs7;
            case 24:
                aq4.setValue((Object) null);
                return vs7;
            case 25:
                aq4.setValue((Object) null);
                return vs7;
            case 26:
                aq4.setValue((Object) null);
                return vs7;
            case 27:
                aq4.setValue((Object) null);
                return vs7;
            case 28:
                aq4.setValue((Object) null);
                return vs7;
            default:
                aq4.setValue(Boolean.TRUE);
                return vs7;
        }
    }
}
