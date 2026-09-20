package defpackage;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.NavigableSet;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: oz0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class oz0 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oz0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [sz0] */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c5, code lost:
        if (r11.j.c() != false) goto L_0x00c7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0123 A[SYNTHETIC, Splitter:B:46:0x0123] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final Object call() {
        FileInputStream fileInputStream;
        boolean z = false;
        FileInputStream fileInputStream2 = null;
        switch (this.a) {
            case b85.b:
                e01 e01 = (e01) this.b;
                synchronized (e01) {
                    try {
                        fileInputStream = e01.a.openFileInput(e01.b);
                        try {
                            int available = fileInputStream.available();
                            byte[] bArr = new byte[available];
                            fileInputStream.read(bArr, 0, available);
                            ? a2 = sz0.a(new JSONObject(new String(bArr, "UTF-8")));
                            fileInputStream.close();
                            fileInputStream2 = a2;
                        } catch (FileNotFoundException | JSONException unused) {
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return fileInputStream2;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream2 = fileInputStream;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException | JSONException unused2) {
                        fileInputStream = null;
                        if (fileInputStream != null) {
                        }
                        return fileInputStream2;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileInputStream2 != null) {
                        }
                        throw th;
                    }
                }
                return fileInputStream2;
            case 1:
                k91 k91 = ((p91) this.b).g;
                k91.getClass();
                wr0.p();
                jz0 jz0 = k91.c;
                md2 md2 = (md2) jz0.y;
                String str = (String) jz0.x;
                md2.getClass();
                if (!new File((File) md2.d, str).exists()) {
                    NavigableSet c = ((wa1) k91.m.y).c();
                    if (!c.isEmpty()) {
                        fileInputStream2 = (String) c.first();
                    }
                    if (fileInputStream2 != null) {
                        break;
                    }
                    return Boolean.valueOf(z);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Found previous crash marker.", (Throwable) null);
                }
                md2 md22 = (md2) jz0.y;
                md22.getClass();
                new File((File) md22.d, str).delete();
                z = true;
                return Boolean.valueOf(z);
            case 2:
                return ((b46) this.b).b("firebase");
            default:
                z00 z00 = (z00) ((kg5) this.b).y;
                al2 al2 = (al2) z00.f;
                wp6 wp6 = (wp6) z00.b;
                String str2 = al2.x;
                wr0.q();
                try {
                    HashMap d = al2.d(wp6);
                    wr0 wr0 = new wr0(str2, d);
                    wr0.Q("User-Agent", "Crashlytics Android SDK/20.0.6");
                    wr0.Q("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    al2.c(wr0, wp6);
                    String concat = "Requesting settings from ".concat(str2);
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", concat, (Throwable) null);
                    }
                    String str3 = "Settings query params were: " + d;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str3, (Throwable) null);
                    }
                    return al2.e(wr0.B());
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e);
                    return null;
                }
        }
    }
}
