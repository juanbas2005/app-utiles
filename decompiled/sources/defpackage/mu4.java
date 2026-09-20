package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: mu4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class mu4 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ a37 x;

    public /* synthetic */ mu4(int i, a37 a37) {
        this.w = i;
        this.x = a37;
    }

    public final Object b() {
        float f;
        float f2;
        float f3;
        int i = this.w;
        boolean z = false;
        float f4 = 0.0f;
        a37 a37 = this.x;
        switch (i) {
            case b85.b:
                ArrayList arrayList = new ArrayList();
                for (Object next : (List) a37.getValue()) {
                    if (sg3.e(((zs4) next).x.w, "composable")) {
                        arrayList.add(next);
                    }
                }
                return arrayList;
            case 1:
                return Float.valueOf(((Number) a37.getValue()).floatValue());
            case 2:
                return Float.valueOf(((Number) a37.getValue()).floatValue());
            case 3:
                float floatValue = ((Number) a37.getValue()).floatValue();
                if (floatValue >= 0.0f) {
                    f4 = floatValue;
                }
                return Float.valueOf(f4);
            case 4:
                float floatValue2 = ((Number) a37.getValue()).floatValue();
                if (floatValue2 >= 0.0f) {
                    f4 = floatValue2;
                }
                return Float.valueOf(f4);
            case 5:
                float floatValue3 = ((Number) a37.getValue()).floatValue();
                if (floatValue3 >= 0.0f) {
                    f4 = floatValue3;
                }
                return Float.valueOf(f4);
            case 6:
                return Float.valueOf(((Number) a37.getValue()).floatValue());
            case 7:
                return Float.valueOf(((Number) a37.getValue()).floatValue());
            case 8:
                return new l35(((l35) a37.getValue()).a);
            case 9:
                ll llVar = xj6.a;
                return new l35(((l35) a37.getValue()).a);
            case 10:
                if (a37 != null) {
                    f = ((Number) a37.getValue()).floatValue();
                } else {
                    f = 1.0f;
                }
                return Float.valueOf(f);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                if (a37 != null) {
                    f4 = ((Number) a37.getValue()).floatValue();
                }
                return Float.valueOf(f4);
            case 12:
                if (a37 != null) {
                    f4 = ((Number) a37.getValue()).floatValue();
                }
                return Float.valueOf(f4);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                if (a37 != null) {
                    f2 = ((Number) a37.getValue()).floatValue();
                } else {
                    f2 = 0.0f;
                }
                if (f2 > 0.0f) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                if (a37 != null) {
                    f3 = ((Number) a37.getValue()).floatValue();
                } else {
                    f3 = 0.0f;
                }
                if (f3 > 0.0f) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
