package defpackage;

import android.app.Service;
import android.content.Intent;
import java.util.Map;

/* renamed from: a59  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class a59 implements Runnable {
    public final /* synthetic */ Cloneable A;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Cloneable, byte[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public /* synthetic */ a59(vz8 vz8, int i, Exception exc, byte[] r4, Map map) {
        this.y = vz8;
        this.x = i;
        this.z = exc;
        this.A = r4;
    }

    public final void run() {
        int i = this.w;
        Cloneable cloneable = this.A;
        Object obj = this.z;
        int i2 = this.x;
        Object obj2 = this.y;
        switch (i) {
            case b85.b /*0*/:
                ((y49) ((vz8) obj2).B).a(i2, (Exception) obj, (byte[]) cloneable);
                return;
            default:
                pz8 pz8 = (pz8) obj;
                Intent intent = (Intent) cloneable;
                Service service = (Service) ((n49) obj2).x;
                x69 x69 = (x69) service;
                if (x69.a(i2)) {
                    pz8.J.b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i2));
                    pz8 pz82 = y19.m(service, (iv8) null, (Long) null, (Long) null).B;
                    y19.g(pz82);
                    pz82.J.a("Completed wakeful intent.");
                    x69.b(intent);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ a59(n49 n49, int i, pz8 pz8, Intent intent) {
        this.y = n49;
        this.x = i;
        this.z = pz8;
        this.A = intent;
    }
}
