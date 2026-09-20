package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

/* renamed from: ow0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ow0 implements js2 {
    public final /* synthetic */ int w;

    public /* synthetic */ ow0(int i) {
        this.w = i;
    }

    public final Object K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        int i3 = this.w;
        boolean z5 = false;
        int i4 = 128;
        int i5 = 16;
        int i6 = 2;
        vs7 vs7 = vs7.a;
        switch (i3) {
            case b85.b:
                md7 md7 = (md7) obj;
                zc7 zc7 = (zc7) obj2;
                sr2 sr2 = (sr2) obj3;
                yt2 yt2 = (yt2) obj4;
                int intValue = ((Integer) obj5).intValue();
                if ((intValue & 6) == 0) {
                    if ((intValue & 8) == 0) {
                        z2 = yt2.g(md7);
                    } else {
                        z2 = yt2.i(md7);
                    }
                    if (z2) {
                        i6 = 4;
                    }
                    i = intValue | i6;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    if ((intValue & 64) == 0) {
                        z = yt2.g(zc7);
                    } else {
                        z = yt2.i(zc7);
                    }
                    if (z) {
                        i5 = 32;
                    }
                    i |= i5;
                }
                if ((intValue & 384) == 0) {
                    if (yt2.i(sr2)) {
                        i4 = 256;
                    }
                    i |= i4;
                }
                if ((i & 1171) != 1170) {
                    z5 = true;
                }
                if (yt2.V(i & 1, z5)) {
                    zn1.c(md7, zc7, sr2, yt2, i & 1022);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                md7 md72 = (md7) obj;
                zc7 zc72 = (zc7) obj2;
                sr2 sr22 = (sr2) obj3;
                yt2 yt22 = (yt2) obj4;
                int intValue2 = ((Integer) obj5).intValue();
                if ((intValue2 & 6) == 0) {
                    if ((intValue2 & 8) == 0) {
                        z4 = yt22.g(md72);
                    } else {
                        z4 = yt22.i(md72);
                    }
                    if (z4) {
                        i6 = 4;
                    }
                    i2 = intValue2 | i6;
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if ((intValue2 & 64) == 0) {
                        z3 = yt22.g(zc72);
                    } else {
                        z3 = yt22.i(zc72);
                    }
                    if (z3) {
                        i5 = 32;
                    }
                    i2 |= i5;
                }
                if ((intValue2 & 384) == 0) {
                    if (yt22.i(sr22)) {
                        i4 = 256;
                    }
                    i2 |= i4;
                }
                if ((i2 & 1171) != 1170) {
                    z5 = true;
                }
                if (yt22.V(i2 & 1, z5)) {
                    zn1.c(md72, zc72, sr22, yt22, i2 & 1022);
                } else {
                    yt22.Y();
                }
                return vs7;
            default:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                long j = ((lg7) obj5).a;
                String obj6 = ((CharSequence) obj4).subSequence(lg7.f(j), lg7.e(j)).toString();
                Intent putExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", booleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = putExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", obj6);
                ((Context) obj).startActivity(className);
                return vs7;
        }
    }
}
