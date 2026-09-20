package defpackage;

import java.util.ArrayList;

/* renamed from: uk3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class uk3 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ String x;
    public final /* synthetic */ xk3 y;

    public /* synthetic */ uk3(String str, xk3 xk3, int i) {
        this.w = i;
        this.x = str;
        this.y = xk3;
    }

    public final Object y(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.w;
        xk3 xk3 = this.y;
        String str = this.x;
        switch (i) {
            case b85.b:
                ua6 ua6 = (ua6) obj;
                ua6.getClass();
                ab6 k0 = ua6.k0("SELECT * FROM jetpacks WHERE userId = ? AND (lastUpdated > lastSynced OR needsSync = 1)");
                try {
                    k0.F(1, str);
                    int n = u55.n(k0, "id");
                    int n2 = u55.n(k0, "name");
                    int n3 = u55.n(k0, "price");
                    int n4 = u55.n(k0, "userId");
                    int n5 = u55.n(k0, "lastUpdated");
                    int n6 = u55.n(k0, "lastSynced");
                    int n7 = u55.n(k0, "needsSync");
                    int n8 = u55.n(k0, "deleted");
                    int n9 = u55.n(k0, "syncAction");
                    ArrayList arrayList = new ArrayList();
                    while (k0.i0()) {
                        String R = k0.R(n);
                        String R2 = k0.R(n2);
                        double d = k0.getDouble(n3);
                        String R3 = k0.R(n4);
                        long j = k0.getLong(n5);
                        long j2 = k0.getLong(n6);
                        if (((int) k0.getLong(n7)) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (((int) k0.getLong(n8)) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        String R4 = k0.R(n9);
                        xk3.getClass();
                        arrayList.add(new al3(R, R2, d, R3, j, j2, z, z2, xk3.a(R4)));
                    }
                    return arrayList;
                } finally {
                    k0.close();
                }
            default:
                ua6 ua62 = (ua6) obj;
                ua62.getClass();
                ab6 k02 = ua62.k0("SELECT * FROM jetpacks WHERE id = ?");
                try {
                    k02.F(1, str);
                    int n10 = u55.n(k02, "id");
                    int n11 = u55.n(k02, "name");
                    int n12 = u55.n(k02, "price");
                    int n13 = u55.n(k02, "userId");
                    int n14 = u55.n(k02, "lastUpdated");
                    int n15 = u55.n(k02, "lastSynced");
                    int n16 = u55.n(k02, "needsSync");
                    int n17 = u55.n(k02, "deleted");
                    int n18 = u55.n(k02, "syncAction");
                    if (k02.i0()) {
                        String R5 = k02.R(n10);
                        String R6 = k02.R(n11);
                        double d2 = k02.getDouble(n12);
                        String R7 = k02.R(n13);
                        long j3 = k02.getLong(n14);
                        long j4 = k02.getLong(n15);
                        if (((int) k02.getLong(n16)) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (((int) k02.getLong(n17)) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        String R8 = k02.R(n18);
                        xk3.getClass();
                        return new al3(R5, R6, d2, R7, j3, j4, z3, z4, xk3.a(R8));
                    }
                    throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type 'cu.lestebang.utiletecsa.core.room.model.JetpackEntity'.");
                } finally {
                    k02.close();
                }
        }
    }
}
