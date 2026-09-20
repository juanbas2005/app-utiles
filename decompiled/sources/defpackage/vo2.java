package defpackage;

/* renamed from: vo2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class vo2 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ aq4 x;

    public /* synthetic */ vo2(aq4 aq4, int i) {
        this.w = i;
        this.x = aq4;
    }

    public final Object b() {
        int i = this.w;
        vs7 vs7 = vs7.a;
        aq4 aq4 = this.x;
        switch (i) {
            case b85.b:
                aq4.setValue(Boolean.TRUE);
                return vs7;
            case 1:
                aq4.setValue((Object) null);
                return vs7;
            case 2:
                aq4.setValue(Boolean.FALSE);
                return vs7;
            case 3:
                aq4.setValue(Boolean.TRUE);
                return vs7;
            case 4:
                aq4.setValue(Boolean.FALSE);
                return vs7;
            case 5:
                aq4.setValue(Boolean.FALSE);
                return vs7;
            case 6:
                aq4.setValue(Boolean.FALSE);
                return vs7;
            case 7:
                aq4.setValue(Boolean.FALSE);
                return vs7;
            case 8:
                aq4.setValue(Boolean.FALSE);
                return vs7;
            case 9:
                aq4.setValue(Boolean.TRUE);
                return vs7;
            case 10:
                aq4.setValue(Boolean.TRUE);
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                aq4.setValue(Boolean.TRUE);
                return vs7;
            case 12:
                aq4.setValue(Boolean.TRUE);
                return vs7;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                aq4.setValue(Boolean.TRUE);
                return vs7;
            case 14:
                aq4.setValue((Object) null);
                return vs7;
            case h75.g:
                aq4.setValue(Boolean.FALSE);
                return vs7;
            case 16:
                return new vz3((vr2) aq4.getValue());
            case 17:
                return (h24) ((sr2) aq4.getValue()).b();
            case 18:
                return new h34((vr2) aq4.getValue());
            case 19:
                aq4.setValue(Boolean.FALSE);
                return vs7;
            case 20:
                aq4.setValue((Object) null);
                return vs7;
            case 21:
                aq4.setValue(Boolean.TRUE);
                return vs7;
            case 22:
                aq4.setValue(Boolean.FALSE);
                return vs7;
            case 23:
                kx4 kx4 = new kx4();
                ((vr2) aq4.getValue()).y(kx4);
                return kx4;
            case 24:
                dy3 dy3 = (dy3) aq4.getValue();
                if (dy3 != null) {
                    return dy3;
                }
                bc3.d("Required value was null.");
                ta1.e();
                return null;
            case 25:
                aq4.setValue(Boolean.FALSE);
                return vs7;
            case 26:
                aq4.setValue(Boolean.TRUE);
                return vs7;
            case 27:
                aq4.setValue(Boolean.TRUE);
                return vs7;
            case 28:
                aq4.setValue(Boolean.TRUE);
                return vs7;
            default:
                aq4.setValue(Boolean.FALSE);
                return vs7;
        }
    }
}
