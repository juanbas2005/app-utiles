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

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB/\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcu/lestebang/utiletecsa/sync/worker/AppUpdateWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lh81;", "ioDispatcher", "Ldv7;", "userPreferencesDataSource", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lh81;Ldv7;)V", "zq", "sync"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class AppUpdateWorker extends CoroutineWorker {
    public final Context g;
    public final h81 h;
    public final dv7 i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppUpdateWorker(Context context, WorkerParameters workerParameters, h81 h81, dv7 dv7) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        h81.getClass();
        dv7.getClass();
        this.g = context;
        this.h = h81;
        this.i = dv7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0068, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        defpackage.ed1.i(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        throw r2;
     */
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

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public final Object c(f61 f61) {
        ar arVar;
        int i2;
        if (f61 instanceof ar) {
            arVar = (ar) f61;
            int i3 = arVar.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                arVar.B = i3 - Integer.MIN_VALUE;
                Object obj = arVar.z;
                i2 = arVar.B;
                if (i2 != 0) {
                    o85.q(obj);
                    p0 p0Var = new p0((Object) this, (f61) null, 8);
                    arVar.B = 1;
                    obj = ar7.e0(this.h, p0Var, arVar);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj.getClass();
                return obj;
            }
        }
        arVar = new ar(this, (h61) f61);
        Object obj2 = arVar.z;
        i2 = arVar.B;
        if (i2 != 0) {
        }
        obj2.getClass();
        return obj2;
    }
}
