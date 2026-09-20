package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import io.ktor.http.Url;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: md2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class md2 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public md2(Context context) {
        String str;
        String str2;
        String str3 = ((b00) d63.J.p(context)).a;
        this.b = str3;
        File filesDir = context.getFilesDir();
        this.c = filesDir;
        if (!str3.isEmpty()) {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            if (str3.length() > 40) {
                str2 = su0.N(str3);
            } else {
                str2 = str3.replaceAll("[^a-zA-Z0-9.]", "_");
            }
            sb.append(str2);
            str = sb.toString();
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, str);
        d(file);
        this.d = file;
        File file2 = new File(file, "open-sessions");
        d(file2);
        this.e = file2;
        File file3 = new File(file, "reports");
        d(file3);
        this.f = file3;
        File file4 = new File(file, "priority-reports");
        d(file4);
        this.g = file4;
        File file5 = new File(file, "native-reports");
        d(file5);
        this.h = file5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        return;
     */
    public static synchronized void d(File file) {
        synchronized (md2.class) {
            try {
                if (file.exists()) {
                    if (!file.isDirectory()) {
                        String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", str, (Throwable) null);
                        }
                        file.delete();
                    } else {
                        return;
                    }
                }
                if (!file.mkdirs()) {
                    Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, (Throwable) null);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public static boolean e(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File e2 : listFiles) {
                e(e2);
            }
        }
        return file.delete();
    }

    public static List f(Object[] objArr) {
        if (objArr == null) {
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(objArr);
    }

    public void a(String str) {
        File file = new File((File) this.c, str);
        if (file.exists() && e(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, (Throwable) null);
            }
        }
    }

    public Object b() {
        Map map = (Map) ((iz0) this.g).d(u43.a);
        if (map != null) {
            return map.get(x63.a);
        }
        return null;
    }

    public File c(String str, String str2) {
        File file = new File((File) this.e, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "HttpRequestData(url=" + ((Url) this.b) + ", method=" + ((i53) this.c) + ')';
            default:
                return super.toString();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0025, code lost:
        r2 = r2.keySet();
     */
    public md2(Url url, i53 i53, gz2 gz2, j85 j85, el3 el3, iz0 iz0) {
        i53.getClass();
        el3.getClass();
        iz0.getClass();
        this.b = url;
        this.c = i53;
        this.d = gz2;
        this.e = j85;
        this.f = el3;
        this.g = iz0;
        Map map = (Map) iz0.d(u43.a);
        Object obj = (map == null || obj == null) ? g42.w : obj;
        this.h = obj;
    }

    public md2(Context context, f01 f01, qd8 qd8, lp5 lp5, WorkDatabase workDatabase, be8 be8, ArrayList arrayList) {
        context.getClass();
        lp5.getClass();
        this.b = f01;
        this.c = qd8;
        this.d = lp5;
        this.e = workDatabase;
        this.f = be8;
        this.g = arrayList;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.h = applicationContext;
        new or2();
    }
}
