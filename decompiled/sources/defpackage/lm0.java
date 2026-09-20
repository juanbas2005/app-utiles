package defpackage;

import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.logging.Logger;
import org.json.JSONObject;

/* renamed from: lm0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class lm0 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ lm0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
        this.A = obj4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    public final void run() {
        int i = this.w;
        BufferedWriter bufferedWriter = null;
        Object obj = this.A;
        Object obj2 = this.z;
        Object obj3 = this.y;
        Object obj4 = this.x;
        switch (i) {
            case b85.b:
                TelephonyManager telephonyManager = (TelephonyManager) obj3;
                op5 op5 = (op5) obj2;
                nm0 nm0 = new nm0(op5, telephonyManager, (pm0) obj);
                ((h06) obj4).w = nm0;
                try {
                    telephonyManager.listen(nm0, 1280);
                    return;
                } catch (SecurityException unused) {
                    op5.c(new qm0(63));
                    op5.y0((Throwable) null);
                    return;
                }
            case 1:
                en1 en1 = (en1) obj4;
                u10 u10 = (u10) obj3;
                String str = u10.a;
                jn7 jn7 = (jn7) obj2;
                p00 p00 = (p00) obj;
                en1.getClass();
                Logger logger = en1.f;
                try {
                    bn7 a = en1.c.a(str);
                    if (a == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        jn7.b(new IllegalArgumentException(str2));
                        return;
                    }
                    en1.e.v(new yz0(en1, u10, ((hm0) a).a(p00), 2));
                    jn7.b((Exception) null);
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    jn7.b(e);
                    return;
                }
            case 2:
                List<jg6> list = (List) obj4;
                id8 id8 = (id8) obj3;
                f01 f01 = (f01) obj2;
                WorkDatabase workDatabase = (WorkDatabase) obj;
                for (jg6 d : list) {
                    d.d(id8.a);
                }
                mg6.b(f01, workDatabase, list);
                return;
            default:
                cw0 cw0 = (cw0) obj4;
                String str3 = (String) obj3;
                Map map = (Map) obj2;
                List list2 = (List) obj;
                fk4 fk4 = (fk4) cw0.w;
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) cw0.C;
                if (((String) atomicMarkableReference.getReference()) != null) {
                    String str4 = (String) atomicMarkableReference.getReference();
                    File c = fk4.a.c(str3, "user-data");
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("userId", str4);
                        String obj5 = jSONObject.toString();
                        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c), fk4.b));
                        try {
                            bufferedWriter2.write(obj5);
                            bufferedWriter2.flush();
                            su0.h(bufferedWriter2, "Failed to close user metadata file.");
                        } catch (Exception e2) {
                            e = e2;
                            bufferedWriter = bufferedWriter2;
                            try {
                                Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                                su0.h(bufferedWriter, "Failed to close user metadata file.");
                                if (!map.isEmpty()) {
                                }
                                if (!list2.isEmpty()) {
                                }
                            } catch (Throwable th) {
                                th = th;
                                su0.h(bufferedWriter, "Failed to close user metadata file.");
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedWriter = bufferedWriter2;
                            su0.h(bufferedWriter, "Failed to close user metadata file.");
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                        su0.h(bufferedWriter, "Failed to close user metadata file.");
                        if (!map.isEmpty()) {
                        }
                        if (!list2.isEmpty()) {
                        }
                    }
                }
                if (!map.isEmpty()) {
                    fk4.h(str3, map, false);
                }
                if (!list2.isEmpty()) {
                    fk4.i(str3, list2);
                    return;
                }
                return;
        }
    }
}
