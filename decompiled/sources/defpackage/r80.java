package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import java.io.Serializable;

/* renamed from: r80  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class r80 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ r80(Object obj, int i, Object obj2, int i2) {
        this.w = i2;
        this.y = obj;
        this.x = i;
        this.z = obj2;
    }

    public final void run() {
        r8 r8Var;
        int i = this.w;
        Object obj = this.z;
        int i2 = this.x;
        Object obj2 = this.y;
        switch (i) {
            case b85.b:
                ((y80) obj2).V(i2, (CharSequence) obj);
                return;
            case 1:
                pv0 pv0 = (pv0) obj2;
                Serializable serializable = (Serializable) ((ns8) obj).x;
                String str = (String) pv0.a.get(Integer.valueOf(i2));
                if (str != null) {
                    y8 y8Var = (y8) pv0.e.get(str);
                    if (y8Var != null) {
                        r8Var = y8Var.a;
                    } else {
                        r8Var = null;
                    }
                    if (r8Var == null) {
                        pv0.g.remove(str);
                        pv0.f.put(str, serializable);
                        return;
                    }
                    r8 r8Var2 = y8Var.a;
                    if (pv0.d.remove(str)) {
                        r8Var2.b(serializable);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((pv0) obj2).a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                return;
            default:
                ((sp5) ((au1) obj2).c).e(i2, obj);
                return;
        }
    }
}
