package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: z49  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class z49 implements x77 {
    public final /* synthetic */ int w;
    public final Context x;

    public z49(Context context, int i) {
        boolean z;
        this.w = i;
        switch (i) {
            case 3:
                new ConcurrentHashMap();
                if (context != null) {
                    z = true;
                } else {
                    z = false;
                }
                l55.A(z, "Context cannot be null", new Object[0]);
                this.x = context.getApplicationContext();
                return;
            default:
                z65.k(context);
                Context applicationContext = context.getApplicationContext();
                z65.k(applicationContext);
                this.x = applicationContext;
                return;
        }
    }

    public Object get() {
        int i = this.w;
        Context context = this.x;
        switch (i) {
            case b85.b:
                Object obj = x49.j;
                kd6 kd6 = new kd6(10, false);
                kd6.x = context;
                context.getClass();
                if (((x77) kd6.y) == null) {
                    kd6.y = x49.m;
                }
                if (((x77) kd6.z) == null) {
                    kd6.z = n85.k(new uy5(19, (Object) (Context) kd6.x));
                }
                if (((rg4) kd6.A) == null) {
                    kd6.A = new rg4(23, (Object) kd6);
                }
                if (((x77) kd6.B) == null) {
                    ArrayList arrayList = new ArrayList();
                    ma9 ma9 = new ma9(new z49((Context) kd6.x, 3));
                    new ConcurrentHashMap();
                    Collections.addAll(arrayList, new za9[]{ma9, new Object()});
                    kd6.B = n85.k(new zy2(arrayList));
                }
                if (((uy5) kd6.C) == null) {
                    kd6.C = new uy5(18, (Object) kd6);
                }
                return new x49((Context) kd6.x, (x77) kd6.y, (x77) kd6.z, (rg4) kd6.A, (x77) kd6.B, (uy5) kd6.C);
            default:
                Object obj2 = h59.a;
                return t49.g0(context);
        }
    }

    public /* synthetic */ z49(Context context, int i, boolean z) {
        this.w = i;
        this.x = context;
    }
}
