package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* renamed from: br2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class br2 implements ry2, if6, a68 {
    public w54 A = null;
    public kg5 B = null;
    public final bq2 w;
    public final z58 x;
    public final y0 y;
    public w58 z;

    public br2(bq2 bq2, z58 z58, y0 y0Var) {
        this.w = bq2;
        this.x = z58;
        this.y = y0Var;
    }

    public final void a(j54 j54) {
        this.A.f1(j54);
    }

    public final w58 c() {
        Application application;
        bq2 bq2 = this.w;
        w58 c = bq2.c();
        if (!c.equals(bq2.o0)) {
            this.z = c;
            return c;
        }
        if (this.z == null) {
            Context applicationContext = bq2.L().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                } else if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                } else {
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                }
            }
            this.z = new jf6(application, bq2, bq2.B);
        }
        return this.z;
    }

    public final to4 d() {
        Application application;
        bq2 bq2 = this.w;
        Context applicationContext = bq2.L().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        to4 to4 = new to4(0);
        LinkedHashMap linkedHashMap = to4.a;
        if (application != null) {
            linkedHashMap.put(v58.d, application);
        }
        linkedHashMap.put(cf6.a, bq2);
        linkedHashMap.put(cf6.b, this);
        Bundle bundle = bq2.B;
        if (bundle != null) {
            linkedHashMap.put(cf6.c, bundle);
        }
        return to4;
    }

    public final void e() {
        if (this.A == null) {
            this.A = new w54(this, true);
            kg5 kg5 = new kg5(new hf6(this, new hx4(18, this)));
            this.B = kg5;
            kg5.F();
            this.y.run();
        }
    }

    public final z58 g() {
        e();
        return this.x;
    }

    public final kg5 h() {
        e();
        return (kg5) this.B.y;
    }

    public final in8 k() {
        e();
        return this.A;
    }
}
