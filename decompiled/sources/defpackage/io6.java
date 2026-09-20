package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import cu.lestebang.utiletecsa.feature.settings.service.BalanceNotificationService;
import cu.lestebang.utiletecsa.feature.settings.service.GsmNetworkService;
import java.util.ArrayList;
import java.util.ListIterator;

/* renamed from: io6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class io6 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Context x;
    public final /* synthetic */ se4 y;

    public /* synthetic */ io6(Context context, se4 se4, int i) {
        this.w = i;
        this.x = context;
        this.y = se4;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        se4 se4 = this.y;
        Context context = this.x;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i) {
            case b85.b:
                Intent intent = new Intent(context, GsmNetworkService.class);
                if (!booleanValue) {
                    context.stopService(intent);
                } else {
                    n74 m = sg3.m();
                    m.add("android.permission.READ_PHONE_STATE");
                    if (Build.VERSION.SDK_INT >= 33) {
                        m.add("android.permission.POST_NOTIFICATIONS");
                    }
                    n74 i2 = sg3.i(m);
                    ArrayList arrayList = new ArrayList();
                    ListIterator listIterator = i2.listIterator(0);
                    while (true) {
                        d03 d03 = (d03) listIterator;
                        if (d03.hasNext()) {
                            Object next = d03.next();
                            if (!sg3.A(context, (String) next)) {
                                arrayList.add(next);
                            }
                        } else if (arrayList.isEmpty()) {
                            ag8.H(context, intent);
                        } else {
                            se4.d0(arrayList.toArray(new String[0]));
                        }
                    }
                }
                return vs7;
            default:
                Intent intent2 = new Intent(context, BalanceNotificationService.class);
                if (!booleanValue) {
                    context.stopService(intent2);
                } else if (Build.VERSION.SDK_INT < 33 || sg3.A(context, "android.permission.POST_NOTIFICATIONS")) {
                    ag8.H(context, intent2);
                } else {
                    se4.d0("android.permission.POST_NOTIFICATIONS");
                }
                return vs7;
        }
    }
}
