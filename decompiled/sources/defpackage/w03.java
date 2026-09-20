package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: w03  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class w03 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ se4 x;
    public final /* synthetic */ aq4 y;

    public /* synthetic */ w03(se4 se4, aq4 aq4, int i) {
        this.w = i;
        this.x = se4;
        this.y = aq4;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        aq4 aq4 = this.y;
        se4 se4 = this.x;
        switch (i) {
            case b85.b:
                String str = (String) obj;
                str.getClass();
                aq4.setValue(str);
                se4.d0(vs7);
                return vs7;
            case 1:
                vr2 vr2 = (vr2) obj;
                vr2.getClass();
                aq4.setValue(vr2);
                ag6 ag6 = new ag6();
                ag6.b = Arrays.asList(new String[]{"QR_CODE", "CODE_128"});
                Boolean bool = Boolean.FALSE;
                HashMap hashMap = ag6.a;
                hashMap.put("BEEP_ENABLED", bool);
                hashMap.put("SCAN_ORIENTATION_LOCKED", bool);
                se4.d0(ag6);
                return vs7;
            default:
                vr2 vr22 = (vr2) obj;
                vr22.getClass();
                aq4.setValue(vr22);
                se4.d0(vs7);
                return vs7;
        }
    }
}
