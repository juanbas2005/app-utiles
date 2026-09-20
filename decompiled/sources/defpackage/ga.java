package defpackage;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.YuvImage;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.LongSparseArray;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.journeyapps.barcodescanner.CaptureActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;

/* renamed from: ga  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ga implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ ga(lu0 lu0, ListenableFuture listenableFuture, int i) {
        this.w = 0;
        this.x = lu0;
        this.y = listenableFuture;
    }

    public final void run() {
        ko1 ko1;
        Object obj;
        String str = null;
        int i = 0;
        switch (this.w) {
            case b85.b:
                lu0 lu0 = (lu0) this.x;
                ListenableFuture listenableFuture = (ListenableFuture) this.y;
                try {
                    if (listenableFuture.isCancelled()) {
                        lu0.H = null;
                        lu0.cancel(false);
                    } else {
                        pt2.b(listenableFuture);
                    }
                } catch (ExecutionException e) {
                    lu0.r(e.getCause());
                } catch (Throwable th) {
                    lu0.q((j93) null);
                    throw th;
                }
                lu0.q((j93) null);
                return;
            case 1:
                ((lu0) this.x).q((j93) this.y);
                return;
            case 2:
                ie1.F((bf) this.x, (LongSparseArray) this.y);
                return;
            case 3:
                ol6 ol6 = (ol6) this.x;
                try {
                    ((Runnable) this.y).run();
                    return;
                } finally {
                    ol6.a();
                }
            case 4:
                ((AppStartTrace) this.x).x.c((yk7) ((vk7) this.y).g(), jr.A);
                return;
            case 5:
                b90 b90 = (b90) this.y;
                f90 f90 = ((y80) this.x).t0;
                if (f90.c == null) {
                    f90.c = new c90(0);
                }
                f90.c.H(b90);
                return;
            case 6:
                String uuid = ((UUID) this.y).toString();
                uuid.getClass();
                ag8.i((nd8) this.x, uuid);
                return;
            case 7:
                f50 f50 = (f50) this.y;
                n66 n66 = f50.a;
                bl0 bl0 = (bl0) ((ns8) this.x).x;
                CaptureActivity captureActivity = bl0.a;
                if (bl0.d) {
                    ry6 ry6 = f50.b;
                    m90 m90 = ry6.a;
                    int i2 = ry6.c;
                    Rect rect = new Rect(0, 0, m90.b, m90.c);
                    YuvImage yuvImage = new YuvImage(m90.a, ry6.b, m90.b, m90.c, (int[]) null);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = 2;
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                    if (i2 != 0) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate((float) i2);
                        decodeByteArray = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
                    }
                    try {
                        File createTempFile = File.createTempFile("barcodeimage", ".jpg", captureActivity.getCacheDir());
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        decodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        fileOutputStream.close();
                        str = createTempFile.getAbsolutePath();
                    } catch (IOException e2) {
                        Log.w("bl0", "Unable to create temporary file and store bitmap! " + e2);
                    }
                }
                Intent intent = new Intent("com.google.zxing.client.android.SCAN");
                intent.addFlags(524288);
                intent.putExtra("SCAN_RESULT", n66.a);
                intent.putExtra("SCAN_RESULT_FORMAT", n66.d.toString());
                byte[] bArr = n66.b;
                if (bArr != null && bArr.length > 0) {
                    intent.putExtra("SCAN_RESULT_BYTES", bArr);
                }
                Map map = n66.e;
                if (map != null) {
                    q66 q66 = q66.C;
                    if (map.containsKey(q66)) {
                        intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", map.get(q66).toString());
                    }
                    Number number = (Number) map.get(q66.w);
                    if (number != null) {
                        intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
                    }
                    String str2 = (String) map.get(q66.y);
                    if (str2 != null) {
                        intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str2);
                    }
                    Iterable<byte[]> iterable = (Iterable) map.get(q66.x);
                    if (iterable != null) {
                        for (byte[] putExtra : iterable) {
                            intent.putExtra("SCAN_RESULT_BYTE_SEGMENTS_" + i, putExtra);
                            i++;
                        }
                    }
                }
                if (str != null) {
                    intent.putExtra("SCAN_RESULT_IMAGE_PATH", str);
                }
                captureActivity.setResult(-1, intent);
                bl0.a();
                return;
            case 8:
                rv0 rv0 = (rv0) this.x;
                rv0.w.x0(new jv0((v45) this.y, rv0));
                return;
            case 9:
                s75 s75 = (s75) this.x;
                nu5 nu5 = (nu5) this.y;
                if (s75.b == s75.d) {
                    synchronized (s75) {
                        ko1 = s75.a;
                        s75.a = null;
                        s75.b = nu5;
                    }
                    ko1.e(nu5);
                    return;
                }
                h.s("provide() can be called only once.");
                return;
            case 10:
                a44 a44 = (a44) this.x;
                nu5 nu52 = (nu5) this.y;
                synchronized (a44) {
                    try {
                        if (a44.b == null) {
                            a44.a.add(nu52);
                        } else {
                            a44.b.add(nu52.get());
                        }
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                            break;
                        }
                    }
                }
                return;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                x21 x21 = (x21) this.y;
                for (o50 o50 : (List) this.x) {
                    Object obj2 = x21.e;
                    p50 p50 = o50.a;
                    if (p50.e(obj2)) {
                        obj = new q31(p50.d());
                    } else {
                        obj = p31.a;
                    }
                    op5 op5 = o50.b;
                    op5.getClass();
                    op5.c(obj);
                }
                return;
            case 12:
                ((k91) this.x).c((String) this.y, Boolean.FALSE);
                return;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                ((kb1) ((rb1) this.x).c()).b((ov2) this.y);
                return;
            case 14:
                ((kb1) ((rb1) this.x).c()).a(((h06) this.y).w);
                return;
            case h75.g /*15*/:
                ((kb1) ((rb1) this.x).c()).a((GetCredentialUnknownException) this.y);
                return;
            case 16:
                ((kb1) ((lb1) this.x)).a(this.y);
                return;
            case 17:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$3$0$0((lb1) this.x, (h06) this.y);
                return;
            case 18:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2$0$0$0((lb1) this.x, (Exception) this.y);
                return;
            case 19:
                zc1 zc1 = (zc1) this.x;
                Runnable runnable = (Runnable) this.y;
                Process.setThreadPriority(zc1.c);
                StrictMode.ThreadPolicy threadPolicy = zc1.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 20:
                Callable callable = (Callable) this.x;
                fp1 fp1 = (fp1) ((ji8) this.y).x;
                try {
                    fp1.j(callable.call());
                    return;
                } catch (Exception e3) {
                    fp1.k(e3);
                    return;
                }
            case 21:
                zt1 zt1 = (zt1) this.x;
                Context context = (Context) this.y;
                if (zt1.a == null && context != null) {
                    zt1.a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
                    return;
                }
                return;
            case 22:
                ((zb2) this.x).a((Intent) this.y);
                return;
            case 23:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.x;
                xb7 xb7 = (xb7) this.y;
                try {
                    xb7.b(firebaseMessaging.a());
                    return;
                } catch (Exception e4) {
                    xb7.a(e4);
                    return;
                }
            case 24:
                ((kk0) this.x).G((gy2) this.y);
                return;
            case 25:
                m83 m83 = (m83) this.x;
                xb7 xb72 = (xb7) this.y;
                try {
                    xb72.b(m83.a());
                    return;
                } catch (Exception e5) {
                    xb72.a(e5);
                    return;
                }
            case 26:
                int i3 = JobInfoSchedulerService.w;
                ((JobInfoSchedulerService) this.x).jobFinished((JobParameters) this.y, false);
                return;
            case 27:
                lp5 lp5 = (lp5) this.x;
                id8 id8 = (id8) this.y;
                synchronized (lp5.k) {
                    try {
                        Iterator it = lp5.j.iterator();
                        while (it.hasNext()) {
                            ((b82) it.next()).b(id8, false);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 28:
                a56 a56 = (a56) this.x;
                CountDownLatch countDownLatch = (CountDownLatch) this.y;
                try {
                    o9 o9Var = a56.h;
                    in7.a().d.e(((u10) o9Var.x).b(to5.y), 1);
                } catch (Exception unused) {
                }
                countDownLatch.countDown();
                return;
            default:
                ((b85) this.x).p((Typeface) this.y);
                return;
        }
    }

    public /* synthetic */ ga(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }
}
