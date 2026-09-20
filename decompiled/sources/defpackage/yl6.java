package defpackage;

import android.app.Application;
import android.app.Service;

/* renamed from: yl6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yl6 implements nu2 {
    public final Service w;
    public sd1 x;

    public yl6(Service service) {
        this.w = service;
    }

    public final Object a() {
        if (this.x == null) {
            Application application = this.w.getApplication();
            boolean z = application instanceof nu2;
            Class<?> cls = application.getClass();
            if (z) {
                this.x = new sd1(((vd1) ((xl6) ag8.q(application, xl6.class))).b);
            } else {
                ku4.t("Hilt service must be attached to an @HiltAndroidApp Application. Found: ", cls);
                return null;
            }
        }
        return this.x;
    }
}
