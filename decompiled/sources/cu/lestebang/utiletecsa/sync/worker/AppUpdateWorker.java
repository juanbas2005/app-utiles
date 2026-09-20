package cu.lestebang.utiletecsa.sync.worker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import org.json.JSONObject;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB/\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcu/lestebang/utiletecsa/sync/worker/AppUpdateWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lh81;", "ioDispatcher", "Ldv7;", "userPreferencesDataSource", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lh81;Ldv7;)V", "zq", "sync"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
/* loaded from: classes.dex */
public final class AppUpdateWorker extends CoroutineWorker {
    public final Context g;
    public final h81 h;
    public final dv7 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUpdateWorker(Context context, WorkerParameters workerParameters, h81 h81Var, dv7 dv7Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        h81Var.getClass();
        dv7Var.getClass();
        this.g = context;
        this.h = h81Var;
        this.i = dv7Var;
    }

    public static final zq f(AppUpdateWorker appUpdateWorker) {
        URLConnection openConnection = new URL("https://apputiles.com/version.json").openConnection();
        openConnection.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        try {
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(15000);
            InputStream inputStream = httpURLConnection.getInputStream();
            inputStream.getClass();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, mo0.a), 8192);
            String j = w95.j(bufferedReader);
            bufferedReader.close();
            JSONObject jSONObject = new JSONObject(j);
            String string = jSONObject.getString("version");
            string.getClass();
            String obj = d57.k1(string).toString();
            String optString = jSONObject.optString("size");
            optString.getClass();
            return new zq(obj, d57.k1(optString).toString());
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.f61 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ar
            if (r0 == 0) goto L13
            r0 = r5
            ar r0 = (defpackage.ar) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L1a
        L13:
            ar r0 = new ar
            h61 r5 = (defpackage.h61) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.z
            int r1 = r0.B
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            defpackage.o85.q(r5)
            goto L45
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r4)
            return r2
        L2e:
            defpackage.o85.q(r5)
            p0 r5 = new p0
            r1 = 8
            r5.<init>(r4, r2, r1)
            r0.B = r3
            h81 r4 = r4.h
            java.lang.Object r5 = defpackage.ar7.e0(r4, r5, r0)
            p81 r4 = defpackage.p81.w
            if (r5 != r4) goto L45
            return r4
        L45:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: cu.lestebang.utiletecsa.sync.worker.AppUpdateWorker.c(f61):java.lang.Object");
    }
}
