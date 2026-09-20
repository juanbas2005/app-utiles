package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: f49  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f49 extends iw2 {
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        if (queryLocalInterface instanceof d49) {
            return (d49) queryLocalInterface;
        }
        return new gg8(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService", 3);
    }

    public final cc2[] f() {
        return mp7.H;
    }

    public final int i() {
        return 9410000;
    }

    public final String m() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    public final String n() {
        return "com.google.android.gms.phenotype.service.START";
    }
}
