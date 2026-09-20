package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.os.Process;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* renamed from: m89  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m89 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public m89(v89 v89, z49 z49) {
        this.w = 0;
        this.x = v89;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [dl8, g89] */
    public final void run() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                v89 v89 = (v89) obj;
                v89.n0().b1();
                v89.G = new v09(v89);
                uq8 uq8 = new uq8(v89);
                uq8.e1();
                v89.y = uq8;
                j19 j19 = v89.w;
                tp8 c0 = v89.c0();
                z65.k(j19);
                c0.z = j19;
                u69 u69 = new u69(v89);
                u69.e1();
                v89.E = u69;
                ? g89 = new g89(v89);
                g89.e1();
                v89.B = g89;
                xz8 xz8 = new xz8(v89, 1);
                xz8.e1();
                v89.D = xz8;
                w79 w79 = new w79(v89);
                w79.e1();
                v89.A = w79;
                v89.z = new f09(v89);
                if (v89.N != v89.O) {
                    v89.G().B.c(Integer.valueOf(v89.N), Integer.valueOf(v89.O), "Not all upload components initialized");
                }
                v89.I.set(true);
                v89.G().J.a("UploadController is now fully initialized");
                v89.n0().b1();
                uq8 uq82 = v89.y;
                v89.R(uq82);
                uq82.m1();
                uq8 uq83 = v89.y;
                v89.R(uq83);
                uq83.b1();
                uq83.d1();
                if (uq83.N1()) {
                    ay8 ay8 = by8.u0;
                    if (((Long) ay8.a((Object) null)).longValue() != 0) {
                        SQLiteDatabase T1 = uq83.T1();
                        y19 y19 = (y19) uq83.w;
                        y19.G.getClass();
                        int delete = T1.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(ay8.a((Object) null))});
                        if (delete > 0) {
                            pz8 pz8 = y19.B;
                            y19.g(pz8);
                            pz8.J.b("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(delete));
                        }
                    }
                }
                if (v89.E.D.a() == 0) {
                    l09 l09 = v89.E.D;
                    v89.Q().getClass();
                    l09.b(System.currentTimeMillis());
                }
                v89.K();
                return;
            case 1:
                throw new RuntimeException(((ExecutionException) obj).getCause());
            case 2:
                try {
                    pt2.b((ListenableFuture) obj);
                    return;
                } catch (ExecutionException e) {
                    ag8.N().post(new m89(1, (Object) e));
                    return;
                }
            case 3:
                try {
                    pt2.b((xj2) obj);
                    return;
                } catch (Exception e2) {
                    Log.w("PhFlagUpdateRegistry", "Failed to register flag update listener which may lead to stale flags.", e2);
                    return;
                }
            case 4:
                if (((Boolean) ((o99) obj).c.get()).booleanValue()) {
                    Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    return;
                }
                return;
            case 5:
                try {
                    pt2.b((yj2) obj);
                    return;
                } catch (Exception e3) {
                    if (Log.isLoggable("StorageInfoHandler", 3)) {
                        Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e3);
                        return;
                    }
                    return;
                }
            case 6:
                y19 y192 = (y19) ((to) obj).b;
                y19.d(y192.Q);
                y192.Q.g1(((Long) by8.D.a((Object) null)).longValue());
                return;
            default:
                y19 y193 = (y19) obj;
                d99 d99 = y193.E;
                v49 v49 = y193.I;
                y19.e(d99);
                d99.b1();
                if (d99.z1() == 1) {
                    y19.f(v49);
                    v49.b1();
                    p39 p39 = v49.H;
                    if (p39 != null) {
                        p39.c();
                    }
                    y19.f(v49);
                    new Thread(new o39(v49, 3)).start();
                    return;
                }
                pz8 pz82 = y193.B;
                y19.g(pz82);
                pz82.E.a("registerTrigger called but app not eligible");
                return;
        }
    }

    public /* synthetic */ m89(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }
}
