package defpackage;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: c91  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c91 {
    public static final rg g = rg.d();
    public static final long h = 1000000;
    public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
    public final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    public final String c;
    public final long d;
    public ScheduledFuture e = null;
    public long f = -1;

    public c91() {
        int myPid = Process.myPid();
        this.c = "/proc/" + Integer.toString(myPid) + "/stat";
        this.d = Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    public final synchronized void a(long j, ui7 ui7) {
        try {
            this.f = j;
            this.e = this.b.scheduleAtFixedRate(new b91(this, ui7, 0), 0, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            RejectedExecutionException rejectedExecutionException = e2;
            rg rgVar = g;
            rgVar.f("Unable to start collecting Cpu Metrics: " + rejectedExecutionException.getMessage());
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final e91 b(ui7 ui7) {
        BufferedReader bufferedReader;
        long j = this.d;
        rg rgVar = g;
        if (ui7 == null) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(this.c));
            long b2 = ui7.b() + ui7.w;
            String[] split = bufferedReader.readLine().split(" ");
            long parseLong = Long.parseLong(split[13]);
            long parseLong2 = Long.parseLong(split[15]);
            long parseLong3 = Long.parseLong(split[14]);
            long parseLong4 = Long.parseLong(split[16]);
            d91 v = e91.v();
            v.h();
            e91.s((e91) v.x, b2);
            double d2 = ((double) (parseLong3 + parseLong4)) / ((double) j);
            long j2 = h;
            long round = Math.round(d2 * ((double) j2));
            v.h();
            e91.u((e91) v.x, round);
            long round2 = Math.round((((double) (parseLong + parseLong2)) / ((double) j)) * ((double) j2));
            v.h();
            e91.t((e91) v.x, round2);
            e91 e91 = (e91) v.g();
            bufferedReader.close();
            return e91;
        } catch (IOException e2) {
            rgVar.f("Unable to read 'proc/[pid]/stat' file: " + e2.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e3) {
            rgVar.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e3.getMessage());
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
