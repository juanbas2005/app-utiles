package defpackage;

/* renamed from: no2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class no2 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ vr2 x;
    public final /* synthetic */ aq4 y;

    public /* synthetic */ no2(vr2 vr2, aq4 aq4, int i) {
        this.w = i;
        this.x = vr2;
        this.y = aq4;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        aq4 aq4 = this.y;
        vr2 vr2 = this.x;
        switch (i) {
            case b85.b:
                ez4 ez4 = (ez4) obj;
                ez4.getClass();
                aq4.setValue(Boolean.FALSE);
                vr2.y(ez4);
                return vs7;
            case 1:
                String str = (String) obj;
                str.getClass();
                aq4.setValue(str);
                vr2.y(str);
                return vs7;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                aq4.setValue(Boolean.FALSE);
                vr2.y(str2);
                return vs7;
            case 3:
                g40 g40 = (g40) obj;
                g40.getClass();
                vr2.y(g40);
                aq4.setValue(Boolean.FALSE);
                return vs7;
            case 4:
                String str3 = (String) obj;
                str3.getClass();
                StringBuilder sb = new StringBuilder();
                int length = str3.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = str3.charAt(i2);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                }
                aq4.setValue(d57.j1(sb.toString()));
                vr2.y((String) aq4.getValue());
                return vs7;
            case 5:
                String str4 = (String) obj;
                str4.getClass();
                aq4.setValue(str4);
                vr2.y(str4);
                return vs7;
            default:
                dz4 dz4 = (dz4) obj;
                dz4.getClass();
                aq4.setValue(Boolean.FALSE);
                vr2.y(dz4);
                return vs7;
        }
    }
}
