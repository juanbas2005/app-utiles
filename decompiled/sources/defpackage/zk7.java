package defpackage;

import android.content.Context;
import android.os.Build;

/* renamed from: zk7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zk7 {
    public final Context a;
    public final x21 b;
    public final q70 c;
    public final xy4 d;
    public final x21 e;

    public zk7(Context context, qd8 qd8) {
        xy4 xy4;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        q70 q70 = new q70(applicationContext, qd8, 0);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        q70 q702 = new q70(applicationContext2, qd8, 1);
        if (Build.VERSION.SDK_INT < 28) {
            Context applicationContext3 = context.getApplicationContext();
            applicationContext3.getClass();
            String str = wy4.a;
            xy4 = new xy4(applicationContext3, qd8);
        } else {
            xy4 = null;
        }
        Context applicationContext4 = context.getApplicationContext();
        applicationContext4.getClass();
        q70 q703 = new q70(applicationContext4, qd8, 2);
        this.a = context;
        this.b = q70;
        this.c = q702;
        this.d = xy4;
        this.e = q703;
    }
}
