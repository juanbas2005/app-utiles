package defpackage;

import android.app.role.RoleManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.ListIterator;

/* renamed from: jo6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class jo6 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Context x;
    public final /* synthetic */ se4 y;
    public final /* synthetic */ aq4 z;

    public /* synthetic */ jo6(Context context, se4 se4, aq4 aq4, int i) {
        this.w = i;
        this.x = context;
        this.y = se4;
        this.z = aq4;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        aq4 aq4 = this.z;
        se4 se4 = this.y;
        Context context = this.x;
        vr2 vr2 = (vr2) obj;
        Boolean bool = (Boolean) obj2;
        switch (i) {
            case b85.b:
                boolean booleanValue = bool.booleanValue();
                vr2.getClass();
                n74 m = sg3.m();
                m.add("android.permission.READ_PHONE_STATE");
                m.add("android.permission.READ_CALL_LOG");
                m.add("android.permission.READ_CONTACTS");
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
                    } else {
                        if (!booleanValue) {
                            vr2.y(Boolean.FALSE);
                        } else if (!Settings.canDrawOverlays(context)) {
                            String packageName = context.getPackageName();
                            context.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + packageName)).addFlags(268435456));
                        } else if (arrayList.isEmpty()) {
                            vr2.y(Boolean.TRUE);
                        } else {
                            aq4.setValue(new zg1(28, vr2));
                            se4.d0(arrayList.toArray(new String[0]));
                        }
                        return vs7;
                    }
                }
            default:
                boolean booleanValue2 = bool.booleanValue();
                vr2.getClass();
                RoleManager c = nd.c(context.getSystemService(nd.g()));
                if (!booleanValue2 || (c != null && c.isRoleHeld("android.app.role.CALL_SCREENING"))) {
                    vr2.y(bool);
                } else if (c != null) {
                    aq4.setValue(new zg1(19, vr2));
                    Intent e = c.createRequestRoleIntent("android.app.role.CALL_SCREENING");
                    e.getClass();
                    se4.d0(e);
                }
                return vs7;
        }
    }
}
