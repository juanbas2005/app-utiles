package defpackage;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.zxing.FormatException;
import cu.lestebang.utiletecsa.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.Adler32;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: wr0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wr0 implements y43, fx6, fc, ec, dy6, oc3 {
    public static volatile wr0 A;
    public static final Object B = new Object();
    public static final g91 C = new g91(0);
    public static final wh D = new wh(1);
    public final /* synthetic */ int w;
    public Object x;
    public Object y;
    public Object z;

    public wr0(k90 k90) {
        int i;
        int i2;
        k90 k902 = k90;
        this.w = 8;
        int i3 = k902.x;
        if (i3 < 8 || i3 > 144 || (i = i3 & 1) != 0) {
            throw FormatException.a();
        }
        int i4 = k902.w;
        e48[] e48Arr = e48.h;
        if (i == 0 && (i4 & 1) == 0) {
            e48[] e48Arr2 = e48.h;
            for (int i5 = 0; i5 < 30; i5++) {
                e48 e48 = e48Arr2[i5];
                int i6 = e48.b;
                if (i6 == i3 && (i2 = e48.c) == i4) {
                    this.z = e48;
                    if (i3 == i6) {
                        int i7 = e48.d;
                        int i8 = e48.e;
                        int i9 = i6 / i7;
                        int i10 = i2 / i8;
                        k90 k903 = new k90(i10 * i8, i9 * i7);
                        for (int i11 = 0; i11 < i9; i11++) {
                            int i12 = i11 * i7;
                            for (int i13 = 0; i13 < i10; i13++) {
                                int i14 = i13 * i8;
                                for (int i15 = 0; i15 < i7; i15++) {
                                    int i16 = ((i7 + 2) * i11) + 1 + i15;
                                    int i17 = i12 + i15;
                                    for (int i18 = 0; i18 < i8; i18++) {
                                        if (k902.b(((i8 + 2) * i13) + 1 + i18, i16)) {
                                            k903.f(i14 + i18, i17);
                                        }
                                    }
                                }
                            }
                        }
                        this.x = k903;
                        this.y = new k90(k903.w, k903.x);
                        return;
                    }
                    h.q("Dimension of bitMatrix must match the version size");
                    throw null;
                }
            }
            throw FormatException.a();
        }
        throw FormatException.a();
    }

    public static int C(int i, int i2, i90 i90) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i90.a(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    public static wr0 I(Context context) {
        if (A == null) {
            synchronized (B) {
                try {
                    if (A == null) {
                        A = new wr0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return A;
    }

    public static void V(md2 md2, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                md2.c(str, "aqs.".concat(str2)).createNewFile();
            } catch (IOException e) {
                Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e);
            }
        }
    }

    public static final void p() {
        String name = Thread.currentThread().getName();
        name.getClass();
        if (!d57.x0(name, "Firebase Background Thread #", false)) {
            String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, (Throwable) null);
            }
        }
    }

    public static final void q() {
        String name = Thread.currentThread().getName();
        name.getClass();
        if (!d57.x0(name, "Firebase Blocking Thread #", false)) {
            String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, (Throwable) null);
            }
        }
    }

    public static String u(String str, HashMap hashMap) {
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        Iterator it = hashMap.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        if (entry.getValue() != null) {
            str2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
        } else {
            str2 = "";
        }
        sb.append(str2);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            if (entry2.getValue() != null) {
                str3 = URLEncoder.encode((String) entry2.getValue(), "UTF-8");
            } else {
                str3 = "";
            }
            sb.append(str3);
        }
        String sb2 = sb.toString();
        if (sb2.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return pb4.l(str, "?", sb2);
        }
        if (!str.endsWith("&")) {
            sb2 = "&".concat(sb2);
        }
        return str.concat(sb2);
    }

    public static boolean x(Editable editable, KeyEvent keyEvent, boolean z2) {
        uq7[] uq7Arr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd || (uq7Arr = (uq7[]) editable.getSpans(selectionStart, selectionEnd, uq7.class)) == null || uq7Arr.length <= 0)) {
                int length = uq7Arr.length;
                int i = 0;
                while (i < length) {
                    uq7 uq7 = uq7Arr[i];
                    int spanStart = editable.getSpanStart(uq7);
                    int spanEnd = editable.getSpanEnd(uq7);
                    if ((!z2 || spanStart != selectionStart) && ((z2 || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                        i++;
                    } else {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public Object A(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.x;
        if (f55.p()) {
            try {
                Trace.beginSection(f55.v(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                sb3 sb3 = (sb3) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                List<Class> a = sb3.a();
                if (!a.isEmpty()) {
                    for (Class cls2 : a) {
                        if (!hashMap.containsKey(cls2)) {
                            A(cls2, hashSet);
                        }
                    }
                }
                obj = sb3.b((Context) this.z);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } else {
                obj = hashMap.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        String name = cls.getName();
        throw new IllegalStateException("Cannot initialize " + name + ". Cycle detected.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b1  */
    public g63 B() {
        HttpsURLConnection httpsURLConnection;
        q();
        ? r2 = 0;
        try {
            String u = u((String) this.x, (HashMap) this.y);
            String concat = "GET Request URL: ".concat(u);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", concat, (Throwable) null);
            }
            httpsURLConnection = (HttpsURLConnection) new URL(u).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : ((HashMap) this.z).entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream = httpsURLConnection.getInputStream();
                if (inputStream != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            int read = bufferedReader.read(cArr);
                            if (read == -1) {
                                break;
                            }
                            sb.append(cArr, 0, read);
                        }
                        r2 = sb.toString();
                    } catch (Throwable th) {
                        th = th;
                        r2 = inputStream;
                        if (r2 != 0) {
                        }
                        if (httpsURLConnection != null) {
                        }
                        throw th;
                    }
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                httpsURLConnection.disconnect();
                return new g63(responseCode, r2);
            } catch (Throwable th2) {
                th = th2;
                if (r2 != 0) {
                    r2.close();
                }
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
            if (r2 != 0) {
            }
            if (httpsURLConnection != null) {
            }
            throw th;
        }
    }

    public qk0 D() {
        return ((tk0) this.z).w.c;
    }

    public View E(int i) {
        return ((RecyclerView) ((ay4) this.x).x).getChildAt(K(i));
    }

    public int F() {
        return ((RecyclerView) ((ay4) this.x).x).getChildCount() - ((ArrayList) this.z).size();
    }

    public ya4 G() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((jv2) this.z)) {
            try {
                ya4 ya4 = (ya4) this.y;
                if (ya4 != null && localeList == ((LocaleList) this.x)) {
                    return ya4;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new xa4(localeList.get(i)));
                }
                ya4 ya42 = new ya4(arrayList);
                this.x = localeList;
                this.y = ya42;
                return ya42;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public tp1 H() {
        return ((tk0) this.z).w.a;
    }

    public ey3 J() {
        return ((tk0) this.z).w.b;
    }

    public int K(int i) {
        cp0 cp0 = (cp0) this.y;
        if (i < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((ay4) this.x).x).getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int b = i - (i2 - cp0.b(i2));
            if (b == 0) {
                while (cp0.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    public long L() {
        return ((tk0) this.z).w.d;
    }

    public View M(int i) {
        return ((RecyclerView) ((ay4) this.x).x).getChildAt(i);
    }

    public int N() {
        return ((RecyclerView) ((ay4) this.x).x).getChildCount();
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [in8, b15, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v40, types: [in8, c15, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00be, code lost:
        if (r0 != null) goto L_0x00c0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x039b A[SYNTHETIC, Splitter:B:149:0x039b] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03c2 A[SYNTHETIC, Splitter:B:155:0x03c2] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0479  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0498  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x04a4  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0500  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0516  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x052c A[SYNTHETIC, Splitter:B:221:0x052c] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0592  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bc A[Catch:{ NameNotFoundException -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e4 A[SYNTHETIC, Splitter:B:38:0x00e4] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x024a  */
    public boolean O() {
        m83 m83;
        br4 br4;
        Bundle bundle;
        String packageName;
        Resources resources;
        PackageManager packageManager;
        String I;
        String I2;
        String J;
        int i;
        int i2;
        String J2;
        Uri uri;
        String J3;
        Intent intent;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        String J4;
        Integer num;
        String J5;
        Integer C2;
        Integer C3;
        Integer C4;
        Long H;
        long[] K;
        int[] E;
        boolean B2;
        String J6;
        boolean z2;
        IconCompat iconCompat;
        int i3;
        int i4;
        Uri uri2;
        int i5;
        String str;
        ApplicationInfo applicationInfo;
        if (((br4) this.z).B("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.y;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String J7 = ((br4) this.z).J("gcm.n.image");
        if (!TextUtils.isEmpty(J7)) {
            try {
                m83 = new m83(new URL(J7));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + J7);
            }
            if (m83 != null) {
                xb7 xb7 = new xb7();
                m83.x = ((ExecutorService) this.x).submit(new ga(25, (Object) m83, (Object) xb7));
                m83.y = xb7.a;
            }
            FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.y;
            br4 = (br4) this.z;
            AtomicInteger atomicInteger = qu0.a;
            applicationInfo = firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
            bundle = Bundle.EMPTY;
            Bundle bundle2 = bundle;
            String J8 = br4.J("gcm.n.android_channel_id");
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    if (firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 0).targetSdkVersion >= 26) {
                        NotificationManager notificationManager = (NotificationManager) firebaseMessagingService2.getSystemService(NotificationManager.class);
                        if (!TextUtils.isEmpty(J8)) {
                            if (notificationManager.getNotificationChannel(J8) == null) {
                                Log.w("FirebaseMessaging", "Notification Channel requested (" + J8 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                            }
                            AtomicInteger atomicInteger2 = qu0.a;
                            packageName = firebaseMessagingService2.getPackageName();
                            resources = firebaseMessagingService2.getResources();
                            packageManager = firebaseMessagingService2.getPackageManager();
                            d15 d15 = new d15(firebaseMessagingService2, J8);
                            I = br4.I(resources, packageName, "gcm.n.title");
                            if (!TextUtils.isEmpty(I)) {
                                d15.e = d15.b(I);
                            }
                            I2 = br4.I(resources, packageName, "gcm.n.body");
                            if (!TextUtils.isEmpty(I2)) {
                                d15.f = d15.b(I2);
                                ? obj = new Object();
                                obj.x = d15.b(I2);
                                d15.e(obj);
                            }
                            J = br4.J("gcm.n.icon");
                            if (!TextUtils.isEmpty(J)) {
                                i2 = resources.getIdentifier(J, "drawable", packageName);
                                if ((i2 == 0 || !qu0.a(resources, i2)) && ((i2 = resources.getIdentifier(J, "mipmap", packageName)) == 0 || !qu0.a(resources, i2))) {
                                    i = 1;
                                    Log.w("FirebaseMessaging", "Icon resource " + J + " not found. Notification will use default icon.");
                                } else {
                                    i = 1;
                                    d15.y.icon = i2;
                                    J2 = br4.J("gcm.n.sound2");
                                    if (TextUtils.isEmpty(J2)) {
                                        J2 = br4.J("gcm.n.sound");
                                    }
                                    if (!TextUtils.isEmpty(J2)) {
                                        uri = null;
                                    } else if ("default".equals(J2) || resources.getIdentifier(J2, "raw", packageName) == 0) {
                                        uri = RingtoneManager.getDefaultUri(2);
                                    } else {
                                        uri = Uri.parse("android.resource://" + packageName + "/raw/" + J2);
                                    }
                                    if (uri == null) {
                                        Notification notification = d15.y;
                                        notification.sound = uri;
                                        notification.audioStreamType = -1;
                                        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
                                    }
                                    J3 = br4.J("gcm.n.click_action");
                                    if (TextUtils.isEmpty(J3)) {
                                        intent = new Intent(J3);
                                        intent.setPackage(packageName);
                                        intent.setFlags(268435456);
                                    } else {
                                        String J9 = br4.J("gcm.n.link_android");
                                        if (TextUtils.isEmpty(J9)) {
                                            J9 = br4.J("gcm.n.link");
                                        }
                                        if (!TextUtils.isEmpty(J9)) {
                                            uri2 = Uri.parse(J9);
                                        } else {
                                            uri2 = null;
                                        }
                                        if (uri2 != null) {
                                            intent = new Intent("android.intent.action.VIEW");
                                            intent.setPackage(packageName);
                                            intent.setData(uri2);
                                        } else {
                                            intent = packageManager.getLaunchIntentForPackage(packageName);
                                            if (intent == null) {
                                                Log.w("FirebaseMessaging", "No activity found to launch app");
                                            }
                                        }
                                    }
                                    if (intent != null) {
                                        pendingIntent = null;
                                    } else {
                                        intent.addFlags(67108864);
                                        Bundle bundle3 = (Bundle) br4.x;
                                        Bundle bundle4 = new Bundle(bundle3);
                                        for (String next2 : bundle3.keySet()) {
                                            if (next2.startsWith("google.c.") || next2.startsWith("gcm.n.") || next2.startsWith("gcm.notification.")) {
                                                bundle4.remove(next2);
                                            }
                                        }
                                        intent.putExtras(bundle4);
                                        if (br4.B("google.c.a.e")) {
                                            intent.putExtra("gcm.n.analytics_data", br4.R());
                                        }
                                        pendingIntent = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger2.incrementAndGet(), intent, 1140850688);
                                    }
                                    d15.g = pendingIntent;
                                    if (br4.B("google.c.a.e")) {
                                        pendingIntent2 = null;
                                    } else {
                                        pendingIntent2 = PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(br4.R())), 1140850688);
                                    }
                                    if (pendingIntent2 != null) {
                                        d15.y.deleteIntent = pendingIntent2;
                                    }
                                    J4 = br4.J("gcm.n.color");
                                    if (!TextUtils.isEmpty(J4)) {
                                        try {
                                            num = Integer.valueOf(Color.parseColor(J4));
                                        } catch (IllegalArgumentException unused2) {
                                            Log.w("FirebaseMessaging", "Color is invalid: " + J4 + ". Notification will use default color.");
                                        }
                                        if (num != null) {
                                            d15.s = num.intValue();
                                        }
                                        d15.c(16, !br4.B("gcm.n.sticky"));
                                        d15.p = br4.B("gcm.n.local_only");
                                        J5 = br4.J("gcm.n.ticker");
                                        if (J5 != null) {
                                            d15.y.tickerText = d15.b(J5);
                                        }
                                        C2 = br4.C("gcm.n.notification_priority");
                                        if (C2 != null) {
                                            if (C2.intValue() < -2 || C2.intValue() > 2) {
                                                Log.w("FirebaseMessaging", "notificationPriority is invalid " + C2 + ". Skipping setting notificationPriority.");
                                            }
                                            if (C2 != null) {
                                                d15.k = C2.intValue();
                                            }
                                            C3 = br4.C("gcm.n.visibility");
                                            if (C3 != null) {
                                                if (C3.intValue() < -1 || C3.intValue() > i) {
                                                    Log.w("NotificationParams", "visibility is invalid: " + C3 + ". Skipping setting visibility.");
                                                }
                                                if (C3 != null) {
                                                    d15.t = C3.intValue();
                                                }
                                                C4 = br4.C("gcm.n.notification_count");
                                                if (C4 != null) {
                                                    if (C4.intValue() < 0) {
                                                        Log.w("FirebaseMessaging", "notificationCount is invalid: " + C4 + ". Skipping setting notificationCount.");
                                                    }
                                                    if (C4 != null) {
                                                        d15.j = C4.intValue();
                                                    }
                                                    H = br4.H();
                                                    if (H != null) {
                                                        d15.l = true;
                                                        d15.y.when = H.longValue();
                                                    }
                                                    K = br4.K();
                                                    if (K != null) {
                                                        d15.y.vibrate = K;
                                                    }
                                                    E = br4.E();
                                                    if (E != null) {
                                                        int i6 = E[0];
                                                        int i7 = E[1];
                                                        int i8 = E[2];
                                                        Notification notification2 = d15.y;
                                                        notification2.ledARGB = i6;
                                                        notification2.ledOnMS = i7;
                                                        notification2.ledOffMS = i8;
                                                        if (i7 == 0 || i8 == 0) {
                                                            i3 = 0;
                                                        } else {
                                                            i3 = 1;
                                                        }
                                                        notification2.flags = i3 | (-2 & notification2.flags);
                                                    }
                                                    B2 = br4.B("gcm.n.default_sound");
                                                    if (br4.B("gcm.n.default_vibrate_timings")) {
                                                        B2 |= true;
                                                    }
                                                    if (br4.B("gcm.n.default_light_settings")) {
                                                        B2 |= true;
                                                    }
                                                    Notification notification3 = d15.y;
                                                    notification3.defaults = B2 ? 1 : 0;
                                                    if (B2 && true) {
                                                        notification3.flags |= 1;
                                                    }
                                                    J6 = br4.J("gcm.n.tag");
                                                    if (TextUtils.isEmpty(J6)) {
                                                        J6 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                                    }
                                                    String str2 = J6;
                                                    if (m83 != null) {
                                                        try {
                                                            yb9 yb9 = m83.y;
                                                            z65.k(yb9);
                                                            Bitmap bitmap = (Bitmap) b35.c(yb9, 5, TimeUnit.SECONDS);
                                                            d15.d(bitmap);
                                                            ? obj2 = new Object();
                                                            if (bitmap == null) {
                                                                iconCompat = null;
                                                                z2 = true;
                                                            } else {
                                                                z2 = true;
                                                                iconCompat = new IconCompat(1);
                                                                iconCompat.b = bitmap;
                                                            }
                                                            obj2.x = iconCompat;
                                                            obj2.y = null;
                                                            obj2.z = z2;
                                                            d15.e(obj2);
                                                        } catch (ExecutionException e) {
                                                            Log.w("FirebaseMessaging", "Failed to download image: " + e.getCause());
                                                        } catch (InterruptedException unused3) {
                                                            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                                                            m83.close();
                                                            Thread.currentThread().interrupt();
                                                        } catch (TimeoutException unused4) {
                                                            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                                                            m83.close();
                                                        }
                                                    }
                                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                        Log.d("FirebaseMessaging", "Showing notification");
                                                    }
                                                    ((NotificationManager) ((FirebaseMessagingService) this.y).getSystemService("notification")).notify(str2, 0, d15.a());
                                                    return true;
                                                }
                                                C4 = null;
                                                if (C4 != null) {
                                                }
                                                H = br4.H();
                                                if (H != null) {
                                                }
                                                K = br4.K();
                                                if (K != null) {
                                                }
                                                E = br4.E();
                                                if (E != null) {
                                                }
                                                B2 = br4.B("gcm.n.default_sound");
                                                if (br4.B("gcm.n.default_vibrate_timings")) {
                                                }
                                                if (br4.B("gcm.n.default_light_settings")) {
                                                }
                                                Notification notification32 = d15.y;
                                                notification32.defaults = B2 ? 1 : 0;
                                                if (B2 && true) {
                                                }
                                                J6 = br4.J("gcm.n.tag");
                                                if (TextUtils.isEmpty(J6)) {
                                                }
                                                String str22 = J6;
                                                if (m83 != null) {
                                                }
                                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                }
                                                ((NotificationManager) ((FirebaseMessagingService) this.y).getSystemService("notification")).notify(str22, 0, d15.a());
                                                return true;
                                            }
                                            C3 = null;
                                            if (C3 != null) {
                                            }
                                            C4 = br4.C("gcm.n.notification_count");
                                            if (C4 != null) {
                                            }
                                            C4 = null;
                                            if (C4 != null) {
                                            }
                                            H = br4.H();
                                            if (H != null) {
                                            }
                                            K = br4.K();
                                            if (K != null) {
                                            }
                                            E = br4.E();
                                            if (E != null) {
                                            }
                                            B2 = br4.B("gcm.n.default_sound");
                                            if (br4.B("gcm.n.default_vibrate_timings")) {
                                            }
                                            if (br4.B("gcm.n.default_light_settings")) {
                                            }
                                            Notification notification322 = d15.y;
                                            notification322.defaults = B2 ? 1 : 0;
                                            if (B2 && true) {
                                            }
                                            J6 = br4.J("gcm.n.tag");
                                            if (TextUtils.isEmpty(J6)) {
                                            }
                                            String str222 = J6;
                                            if (m83 != null) {
                                            }
                                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                            }
                                            ((NotificationManager) ((FirebaseMessagingService) this.y).getSystemService("notification")).notify(str222, 0, d15.a());
                                            return true;
                                        }
                                        C2 = null;
                                        if (C2 != null) {
                                        }
                                        C3 = br4.C("gcm.n.visibility");
                                        if (C3 != null) {
                                        }
                                        C3 = null;
                                        if (C3 != null) {
                                        }
                                        C4 = br4.C("gcm.n.notification_count");
                                        if (C4 != null) {
                                        }
                                        C4 = null;
                                        if (C4 != null) {
                                        }
                                        H = br4.H();
                                        if (H != null) {
                                        }
                                        K = br4.K();
                                        if (K != null) {
                                        }
                                        E = br4.E();
                                        if (E != null) {
                                        }
                                        B2 = br4.B("gcm.n.default_sound");
                                        if (br4.B("gcm.n.default_vibrate_timings")) {
                                        }
                                        if (br4.B("gcm.n.default_light_settings")) {
                                        }
                                        Notification notification3222 = d15.y;
                                        notification3222.defaults = B2 ? 1 : 0;
                                        if (B2 && true) {
                                        }
                                        J6 = br4.J("gcm.n.tag");
                                        if (TextUtils.isEmpty(J6)) {
                                        }
                                        String str2222 = J6;
                                        if (m83 != null) {
                                        }
                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                        }
                                        ((NotificationManager) ((FirebaseMessagingService) this.y).getSystemService("notification")).notify(str2222, 0, d15.a());
                                        return true;
                                    }
                                    i4 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                                    if (i4 != 0) {
                                        try {
                                            num = Integer.valueOf(firebaseMessagingService2.getColor(i4));
                                        } catch (Resources.NotFoundException unused5) {
                                            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                                        }
                                        if (num != null) {
                                        }
                                        d15.c(16, !br4.B("gcm.n.sticky"));
                                        d15.p = br4.B("gcm.n.local_only");
                                        J5 = br4.J("gcm.n.ticker");
                                        if (J5 != null) {
                                        }
                                        C2 = br4.C("gcm.n.notification_priority");
                                        if (C2 != null) {
                                        }
                                        C2 = null;
                                        if (C2 != null) {
                                        }
                                        C3 = br4.C("gcm.n.visibility");
                                        if (C3 != null) {
                                        }
                                        C3 = null;
                                        if (C3 != null) {
                                        }
                                        C4 = br4.C("gcm.n.notification_count");
                                        if (C4 != null) {
                                        }
                                        C4 = null;
                                        if (C4 != null) {
                                        }
                                        H = br4.H();
                                        if (H != null) {
                                        }
                                        K = br4.K();
                                        if (K != null) {
                                        }
                                        E = br4.E();
                                        if (E != null) {
                                        }
                                        B2 = br4.B("gcm.n.default_sound");
                                        if (br4.B("gcm.n.default_vibrate_timings")) {
                                        }
                                        if (br4.B("gcm.n.default_light_settings")) {
                                        }
                                        Notification notification32222 = d15.y;
                                        notification32222.defaults = B2 ? 1 : 0;
                                        if (B2 && true) {
                                        }
                                        J6 = br4.J("gcm.n.tag");
                                        if (TextUtils.isEmpty(J6)) {
                                        }
                                        String str22222 = J6;
                                        if (m83 != null) {
                                        }
                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                        }
                                        ((NotificationManager) ((FirebaseMessagingService) this.y).getSystemService("notification")).notify(str22222, 0, d15.a());
                                        return true;
                                    }
                                    num = null;
                                    if (num != null) {
                                    }
                                    d15.c(16, !br4.B("gcm.n.sticky"));
                                    d15.p = br4.B("gcm.n.local_only");
                                    J5 = br4.J("gcm.n.ticker");
                                    if (J5 != null) {
                                    }
                                    C2 = br4.C("gcm.n.notification_priority");
                                    if (C2 != null) {
                                    }
                                    C2 = null;
                                    if (C2 != null) {
                                    }
                                    C3 = br4.C("gcm.n.visibility");
                                    if (C3 != null) {
                                    }
                                    C3 = null;
                                    if (C3 != null) {
                                    }
                                    C4 = br4.C("gcm.n.notification_count");
                                    if (C4 != null) {
                                    }
                                    C4 = null;
                                    if (C4 != null) {
                                    }
                                    H = br4.H();
                                    if (H != null) {
                                    }
                                    K = br4.K();
                                    if (K != null) {
                                    }
                                    E = br4.E();
                                    if (E != null) {
                                    }
                                    B2 = br4.B("gcm.n.default_sound");
                                    if (br4.B("gcm.n.default_vibrate_timings")) {
                                    }
                                    if (br4.B("gcm.n.default_light_settings")) {
                                    }
                                    Notification notification322222 = d15.y;
                                    notification322222.defaults = B2 ? 1 : 0;
                                    if (B2 && true) {
                                    }
                                    J6 = br4.J("gcm.n.tag");
                                    if (TextUtils.isEmpty(J6)) {
                                    }
                                    String str222222 = J6;
                                    if (m83 != null) {
                                    }
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    }
                                    ((NotificationManager) ((FirebaseMessagingService) this.y).getSystemService("notification")).notify(str222222, 0, d15.a());
                                    return true;
                                }
                            } else {
                                i = 1;
                            }
                            i5 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                            if (i5 == 0 || !qu0.a(resources, i5)) {
                                i5 = packageManager.getApplicationInfo(packageName, 0).icon;
                            }
                            if (i5 == 0 || !qu0.a(resources, i5)) {
                                i2 = 17301651;
                            } else {
                                i2 = i5;
                            }
                            d15.y.icon = i2;
                            J2 = br4.J("gcm.n.sound2");
                            if (TextUtils.isEmpty(J2)) {
                            }
                            if (!TextUtils.isEmpty(J2)) {
                            }
                            if (uri == null) {
                            }
                            J3 = br4.J("gcm.n.click_action");
                            if (TextUtils.isEmpty(J3)) {
                            }
                            if (intent != null) {
                            }
                            d15.g = pendingIntent;
                            if (br4.B("google.c.a.e")) {
                            }
                            if (pendingIntent2 != null) {
                            }
                            J4 = br4.J("gcm.n.color");
                            if (!TextUtils.isEmpty(J4)) {
                            }
                            i4 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                            if (i4 != 0) {
                            }
                            num = null;
                            if (num != null) {
                            }
                            d15.c(16, !br4.B("gcm.n.sticky"));
                            d15.p = br4.B("gcm.n.local_only");
                            J5 = br4.J("gcm.n.ticker");
                            if (J5 != null) {
                            }
                            C2 = br4.C("gcm.n.notification_priority");
                            if (C2 != null) {
                            }
                            C2 = null;
                            if (C2 != null) {
                            }
                            C3 = br4.C("gcm.n.visibility");
                            if (C3 != null) {
                            }
                            C3 = null;
                            if (C3 != null) {
                            }
                            C4 = br4.C("gcm.n.notification_count");
                            if (C4 != null) {
                            }
                            C4 = null;
                            if (C4 != null) {
                            }
                            H = br4.H();
                            if (H != null) {
                            }
                            K = br4.K();
                            if (K != null) {
                            }
                            E = br4.E();
                            if (E != null) {
                            }
                            B2 = br4.B("gcm.n.default_sound");
                            if (br4.B("gcm.n.default_vibrate_timings")) {
                            }
                            if (br4.B("gcm.n.default_light_settings")) {
                            }
                            Notification notification3222222 = d15.y;
                            notification3222222.defaults = B2 ? 1 : 0;
                            if (B2 && true) {
                            }
                            J6 = br4.J("gcm.n.tag");
                            if (TextUtils.isEmpty(J6)) {
                            }
                            String str2222222 = J6;
                            if (m83 != null) {
                            }
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                            }
                            ((NotificationManager) ((FirebaseMessagingService) this.y).getSystemService("notification")).notify(str2222222, 0, d15.a());
                            return true;
                        }
                        J8 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(J8)) {
                            if (notificationManager.getNotificationChannel(J8) == null) {
                                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                            }
                            AtomicInteger atomicInteger22 = qu0.a;
                            packageName = firebaseMessagingService2.getPackageName();
                            resources = firebaseMessagingService2.getResources();
                            packageManager = firebaseMessagingService2.getPackageManager();
                            d15 d152 = new d15(firebaseMessagingService2, J8);
                            I = br4.I(resources, packageName, "gcm.n.title");
                            if (!TextUtils.isEmpty(I)) {
                            }
                            I2 = br4.I(resources, packageName, "gcm.n.body");
                            if (!TextUtils.isEmpty(I2)) {
                            }
                            J = br4.J("gcm.n.icon");
                            if (!TextUtils.isEmpty(J)) {
                            }
                            i5 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                            i5 = packageManager.getApplicationInfo(packageName, 0).icon;
                            if (i5 == 0 || !qu0.a(resources, i5)) {
                            }
                            d152.y.icon = i2;
                            J2 = br4.J("gcm.n.sound2");
                            if (TextUtils.isEmpty(J2)) {
                            }
                            if (!TextUtils.isEmpty(J2)) {
                            }
                            if (uri == null) {
                            }
                            J3 = br4.J("gcm.n.click_action");
                            if (TextUtils.isEmpty(J3)) {
                            }
                            if (intent != null) {
                            }
                            d152.g = pendingIntent;
                            if (br4.B("google.c.a.e")) {
                            }
                            if (pendingIntent2 != null) {
                            }
                            J4 = br4.J("gcm.n.color");
                            if (!TextUtils.isEmpty(J4)) {
                            }
                            i4 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                            if (i4 != 0) {
                            }
                            num = null;
                            if (num != null) {
                            }
                            d152.c(16, !br4.B("gcm.n.sticky"));
                            d152.p = br4.B("gcm.n.local_only");
                            J5 = br4.J("gcm.n.ticker");
                            if (J5 != null) {
                            }
                            C2 = br4.C("gcm.n.notification_priority");
                            if (C2 != null) {
                            }
                            C2 = null;
                            if (C2 != null) {
                            }
                            C3 = br4.C("gcm.n.visibility");
                            if (C3 != null) {
                            }
                            C3 = null;
                            if (C3 != null) {
                            }
                            C4 = br4.C("gcm.n.notification_count");
                            if (C4 != null) {
                            }
                            C4 = null;
                            if (C4 != null) {
                            }
                            H = br4.H();
                            if (H != null) {
                            }
                            K = br4.K();
                            if (K != null) {
                            }
                            E = br4.E();
                            if (E != null) {
                            }
                            B2 = br4.B("gcm.n.default_sound");
                            if (br4.B("gcm.n.default_vibrate_timings")) {
                            }
                            if (br4.B("gcm.n.default_light_settings")) {
                            }
                            Notification notification32222222 = d152.y;
                            notification32222222.defaults = B2 ? 1 : 0;
                            if (B2 && true) {
                            }
                            J6 = br4.J("gcm.n.tag");
                            if (TextUtils.isEmpty(J6)) {
                            }
                            String str22222222 = J6;
                            if (m83 != null) {
                            }
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                            }
                            ((NotificationManager) ((FirebaseMessagingService) this.y).getSystemService("notification")).notify(str22222222, 0, d152.a());
                            return true;
                        }
                        Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            int identifier = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                            if (identifier == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                str = "Misc";
                            } else {
                                str = firebaseMessagingService2.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(rk0.g(str));
                        }
                        J8 = "fcm_fallback_notification_channel";
                        AtomicInteger atomicInteger222 = qu0.a;
                        packageName = firebaseMessagingService2.getPackageName();
                        resources = firebaseMessagingService2.getResources();
                        packageManager = firebaseMessagingService2.getPackageManager();
                        d15 d1522 = new d15(firebaseMessagingService2, J8);
                        I = br4.I(resources, packageName, "gcm.n.title");
                        if (!TextUtils.isEmpty(I)) {
                        }
                        I2 = br4.I(resources, packageName, "gcm.n.body");
                        if (!TextUtils.isEmpty(I2)) {
                        }
                        J = br4.J("gcm.n.icon");
                        if (!TextUtils.isEmpty(J)) {
                        }
                        i5 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                        i5 = packageManager.getApplicationInfo(packageName, 0).icon;
                        if (i5 == 0 || !qu0.a(resources, i5)) {
                        }
                        d1522.y.icon = i2;
                        J2 = br4.J("gcm.n.sound2");
                        if (TextUtils.isEmpty(J2)) {
                        }
                        if (!TextUtils.isEmpty(J2)) {
                        }
                        if (uri == null) {
                        }
                        J3 = br4.J("gcm.n.click_action");
                        if (TextUtils.isEmpty(J3)) {
                        }
                        if (intent != null) {
                        }
                        d1522.g = pendingIntent;
                        if (br4.B("google.c.a.e")) {
                        }
                        if (pendingIntent2 != null) {
                        }
                        J4 = br4.J("gcm.n.color");
                        if (!TextUtils.isEmpty(J4)) {
                        }
                        i4 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i4 != 0) {
                        }
                        num = null;
                        if (num != null) {
                        }
                        d1522.c(16, !br4.B("gcm.n.sticky"));
                        d1522.p = br4.B("gcm.n.local_only");
                        J5 = br4.J("gcm.n.ticker");
                        if (J5 != null) {
                        }
                        C2 = br4.C("gcm.n.notification_priority");
                        if (C2 != null) {
                        }
                        C2 = null;
                        if (C2 != null) {
                        }
                        C3 = br4.C("gcm.n.visibility");
                        if (C3 != null) {
                        }
                        C3 = null;
                        if (C3 != null) {
                        }
                        C4 = br4.C("gcm.n.notification_count");
                        if (C4 != null) {
                        }
                        C4 = null;
                        if (C4 != null) {
                        }
                        H = br4.H();
                        if (H != null) {
                        }
                        K = br4.K();
                        if (K != null) {
                        }
                        E = br4.E();
                        if (E != null) {
                        }
                        B2 = br4.B("gcm.n.default_sound");
                        if (br4.B("gcm.n.default_vibrate_timings")) {
                        }
                        if (br4.B("gcm.n.default_light_settings")) {
                        }
                        Notification notification322222222 = d1522.y;
                        notification322222222.defaults = B2 ? 1 : 0;
                        if (B2 && true) {
                        }
                        J6 = br4.J("gcm.n.tag");
                        if (TextUtils.isEmpty(J6)) {
                        }
                        String str222222222 = J6;
                        if (m83 != null) {
                        }
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.y).getSystemService("notification")).notify(str222222222, 0, d1522.a());
                        return true;
                    }
                } catch (PackageManager.NameNotFoundException unused6) {
                }
            }
            J8 = null;
            AtomicInteger atomicInteger2222 = qu0.a;
            packageName = firebaseMessagingService2.getPackageName();
            resources = firebaseMessagingService2.getResources();
            packageManager = firebaseMessagingService2.getPackageManager();
            d15 d15222 = new d15(firebaseMessagingService2, J8);
            I = br4.I(resources, packageName, "gcm.n.title");
            if (!TextUtils.isEmpty(I)) {
            }
            I2 = br4.I(resources, packageName, "gcm.n.body");
            if (!TextUtils.isEmpty(I2)) {
            }
            J = br4.J("gcm.n.icon");
            if (!TextUtils.isEmpty(J)) {
            }
            i5 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            i5 = packageManager.getApplicationInfo(packageName, 0).icon;
            if (i5 == 0 || !qu0.a(resources, i5)) {
            }
            d15222.y.icon = i2;
            J2 = br4.J("gcm.n.sound2");
            if (TextUtils.isEmpty(J2)) {
            }
            if (!TextUtils.isEmpty(J2)) {
            }
            if (uri == null) {
            }
            J3 = br4.J("gcm.n.click_action");
            if (TextUtils.isEmpty(J3)) {
            }
            if (intent != null) {
            }
            d15222.g = pendingIntent;
            if (br4.B("google.c.a.e")) {
            }
            if (pendingIntent2 != null) {
            }
            J4 = br4.J("gcm.n.color");
            if (!TextUtils.isEmpty(J4)) {
            }
            i4 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i4 != 0) {
            }
            num = null;
            if (num != null) {
            }
            d15222.c(16, !br4.B("gcm.n.sticky"));
            d15222.p = br4.B("gcm.n.local_only");
            J5 = br4.J("gcm.n.ticker");
            if (J5 != null) {
            }
            C2 = br4.C("gcm.n.notification_priority");
            if (C2 != null) {
            }
            C2 = null;
            if (C2 != null) {
            }
            C3 = br4.C("gcm.n.visibility");
            if (C3 != null) {
            }
            C3 = null;
            if (C3 != null) {
            }
            C4 = br4.C("gcm.n.notification_count");
            if (C4 != null) {
            }
            C4 = null;
            if (C4 != null) {
            }
            H = br4.H();
            if (H != null) {
            }
            K = br4.K();
            if (K != null) {
            }
            E = br4.E();
            if (E != null) {
            }
            B2 = br4.B("gcm.n.default_sound");
            if (br4.B("gcm.n.default_vibrate_timings")) {
            }
            if (br4.B("gcm.n.default_light_settings")) {
            }
            Notification notification3222222222 = d15222.y;
            notification3222222222.defaults = B2 ? 1 : 0;
            if (B2 && true) {
            }
            J6 = br4.J("gcm.n.tag");
            if (TextUtils.isEmpty(J6)) {
            }
            String str2222222222 = J6;
            if (m83 != null) {
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
            }
            ((NotificationManager) ((FirebaseMessagingService) this.y).getSystemService("notification")).notify(str2222222222, 0, d15222.a());
            return true;
        }
        m83 = null;
        if (m83 != null) {
        }
        FirebaseMessagingService firebaseMessagingService22 = (FirebaseMessagingService) this.y;
        br4 = (br4) this.z;
        AtomicInteger atomicInteger3 = qu0.a;
        try {
            applicationInfo = firebaseMessagingService22.getPackageManager().getApplicationInfo(firebaseMessagingService22.getPackageName(), 128);
            if (applicationInfo != null) {
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e2);
        }
        bundle = Bundle.EMPTY;
        Bundle bundle22 = bundle;
        String J82 = br4.J("gcm.n.android_channel_id");
        if (Build.VERSION.SDK_INT >= 26) {
        }
        J82 = null;
        AtomicInteger atomicInteger22222 = qu0.a;
        packageName = firebaseMessagingService22.getPackageName();
        resources = firebaseMessagingService22.getResources();
        packageManager = firebaseMessagingService22.getPackageManager();
        d15 d152222 = new d15(firebaseMessagingService22, J82);
        I = br4.I(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(I)) {
        }
        I2 = br4.I(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(I2)) {
        }
        J = br4.J("gcm.n.icon");
        if (!TextUtils.isEmpty(J)) {
        }
        i5 = bundle22.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        try {
            i5 = packageManager.getApplicationInfo(packageName, 0).icon;
        } catch (PackageManager.NameNotFoundException e3) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e3);
        }
        if (i5 == 0 || !qu0.a(resources, i5)) {
        }
        d152222.y.icon = i2;
        J2 = br4.J("gcm.n.sound2");
        if (TextUtils.isEmpty(J2)) {
        }
        if (!TextUtils.isEmpty(J2)) {
        }
        if (uri == null) {
        }
        J3 = br4.J("gcm.n.click_action");
        if (TextUtils.isEmpty(J3)) {
        }
        if (intent != null) {
        }
        d152222.g = pendingIntent;
        if (br4.B("google.c.a.e")) {
        }
        if (pendingIntent2 != null) {
        }
        J4 = br4.J("gcm.n.color");
        if (!TextUtils.isEmpty(J4)) {
        }
        i4 = bundle22.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i4 != 0) {
        }
        num = null;
        if (num != null) {
        }
        d152222.c(16, !br4.B("gcm.n.sticky"));
        d152222.p = br4.B("gcm.n.local_only");
        J5 = br4.J("gcm.n.ticker");
        if (J5 != null) {
        }
        C2 = br4.C("gcm.n.notification_priority");
        if (C2 != null) {
        }
        C2 = null;
        if (C2 != null) {
        }
        C3 = br4.C("gcm.n.visibility");
        if (C3 != null) {
        }
        C3 = null;
        if (C3 != null) {
        }
        C4 = br4.C("gcm.n.notification_count");
        if (C4 != null) {
        }
        C4 = null;
        if (C4 != null) {
        }
        H = br4.H();
        if (H != null) {
        }
        K = br4.K();
        if (K != null) {
        }
        E = br4.E();
        if (E != null) {
        }
        B2 = br4.B("gcm.n.default_sound");
        if (br4.B("gcm.n.default_vibrate_timings")) {
        }
        if (br4.B("gcm.n.default_light_settings")) {
        }
        Notification notification32222222222 = d152222.y;
        notification32222222222.defaults = B2 ? 1 : 0;
        if (B2 && true) {
        }
        J6 = br4.J("gcm.n.tag");
        if (TextUtils.isEmpty(J6)) {
        }
        String str22222222222 = J6;
        if (m83 != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.y).getSystemService("notification")).notify(str22222222222, 0, d152222.a());
        return true;
    }

    public boolean P(CharSequence charSequence, int i, int i2, tq7 tq7) {
        int i3;
        if ((tq7.c & 3) == 0) {
            tl1 tl1 = (tl1) this.z;
            ok4 b = tq7.b();
            int a = b.a(8);
            if (a != 0) {
                ((ByteBuffer) b.z).getShort(a + b.w);
            }
            tl1.getClass();
            ThreadLocal threadLocal = tl1.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = tl1.a.hasGlyph(sb.toString());
            int i4 = tq7.c & 4;
            if (hasGlyph) {
                i3 = i4 | 2;
            } else {
                i3 = i4 | 1;
            }
            tq7.c = i3;
        }
        if ((tq7.c & 3) == 2) {
            return true;
        }
        return false;
    }

    public void Q(String str, String str2) {
        ((HashMap) this.z).put(str, str2);
    }

    public void R(View view) {
        ((ArrayList) this.z).add(view);
        ay4 ay4 = (ay4) this.x;
        lz5 I = RecyclerView.I(view);
        if (I != null) {
            View view2 = I.a;
            RecyclerView recyclerView = (RecyclerView) ay4.x;
            int i = I.q;
            if (i != -1) {
                I.p = i;
            } else {
                WeakHashMap weakHashMap = e58.a;
                I.p = view2.getImportantForAccessibility();
            }
            if (recyclerView.L()) {
                I.q = 4;
                recyclerView.M0.add(I);
                return;
            }
            WeakHashMap weakHashMap2 = e58.a;
            view2.setImportantForAccessibility(4);
        }
    }

    public boolean S(int i) {
        int i2;
        int i3 = i + 1;
        i90 i90 = (i90) this.x;
        if (i3 > i90.x) {
            return false;
        }
        int i4 = 0;
        while (i4 < 5 && (i2 = i4 + i) < i90.x) {
            if (i4 == 2) {
                if (!i90.a(i + 2)) {
                    return false;
                }
            } else if (i90.a(i2)) {
                return false;
            }
            i4++;
        }
        return true;
    }

    public boolean T() {
        boolean z2;
        if (!((my6) ((ji8) this.x).x).isEmpty() || !((my6) ((ji8) this.z).x).isEmpty() || !((my6) ((ji8) this.y).x).isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        return !z2;
    }

    public boolean U(int i, n21 n21, g31 g31) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        m60 m60 = (m60) this.y;
        int[] iArr = g31.o0;
        int[] iArr2 = g31.s;
        m60.a = iArr[0];
        m60.b = iArr[1];
        m60.c = g31.n();
        m60.d = g31.k();
        m60.i = false;
        m60.j = i;
        if (m60.a == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (m60.b == 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z2 || g31.V <= 0.0f) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z3 || g31.V <= 0.0f) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z4 && iArr2[0] == 4) {
            m60.a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            m60.b = 1;
        }
        n21.b(g31, m60);
        g31.J(m60.e);
        g31.G(m60.f);
        g31.D = m60.h;
        g31.D(m60.g);
        m60.j = 0;
        return m60.i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00c6 A[SYNTHETIC] */
    public Object W(CharSequence charSequence, int i, int i2, int i3, boolean z2, h32 h32) {
        int i4;
        qk4 qk4;
        boolean z3;
        CharSequence charSequence2 = charSequence;
        int i5 = i2;
        int i6 = i3;
        h32 h322 = h32;
        j32 j32 = new j32((qk4) ((am6) this.y).z);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i7 = 0;
        boolean z4 = true;
        int i8 = i;
        loop0:
        while (true) {
            i4 = i8;
            while (i8 < i5 && i7 < i6 && z4) {
                SparseArray sparseArray = ((qk4) j32.f).a;
                if (sparseArray == null) {
                    qk4 = null;
                } else {
                    qk4 = (qk4) sparseArray.get(codePointAt);
                }
                if (j32.b == 2) {
                    if (qk4 != null) {
                        j32.f = qk4;
                        j32.d++;
                    } else if (codePointAt == 65038) {
                        j32.a();
                    } else if (codePointAt != 65039) {
                        qk4 qk42 = (qk4) j32.f;
                        if (qk42.b != null) {
                            if (j32.d != 1) {
                                j32.g = qk42;
                                j32.a();
                            } else if (j32.b()) {
                                j32.g = (qk4) j32.f;
                                j32.a();
                            } else {
                                j32.a();
                            }
                            z3 = true;
                            j32.c = codePointAt;
                            if (!z3) {
                            }
                        } else {
                            j32.a();
                        }
                    }
                    z3 = true;
                    j32.c = codePointAt;
                    if (!z3) {
                    }
                } else if (qk4 == null) {
                    j32.a();
                } else {
                    j32.b = 2;
                    j32.f = qk4;
                    j32.d = 1;
                    z3 = true;
                    j32.c = codePointAt;
                    if (!z3) {
                        i8 = Character.charCount(Character.codePointAt(charSequence2, i4)) + i4;
                        if (i8 < i5) {
                            codePointAt = Character.codePointAt(charSequence2, i8);
                        }
                    } else if (z3) {
                        int charCount = Character.charCount(codePointAt) + i8;
                        if (charCount < i5) {
                            codePointAt = Character.codePointAt(charSequence2, charCount);
                        }
                        i8 = charCount;
                    } else if (z3) {
                        if (z2 || !P(charSequence2, i4, i8, ((qk4) j32.g).b)) {
                            z4 = h322.b(charSequence2, i4, i8, ((qk4) j32.g).b);
                            i7++;
                        }
                    }
                }
                z3 = true;
                j32.c = codePointAt;
                if (!z3) {
                }
            }
        }
        if (j32.b == 2 && ((qk4) j32.f).b != null && ((j32.d > 1 || j32.b()) && i7 < i6 && z4 && (z2 || !P(charSequence2, i4, i8, ((qk4) j32.f).b)))) {
            h322.b(charSequence2, i4, i8, ((qk4) j32.f).b);
        }
        return h322.a();
    }

    public boolean X(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        ((k90) this.y).f(i2, i);
        return ((k90) this.x).b(i2, i);
    }

    public int Y(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (X(i5, i6, i3, i4) ? 1 : 0) << true;
        int i8 = i2 - 1;
        if (X(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (X(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (X(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (X(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (X(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (X(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (X(i, i2, i3, i4)) {
            return i15 | 1;
        }
        return i15;
    }

    /* JADX INFO: finally extract failed */
    public void Z(u10 u10, int i, boolean z2) {
        Long l;
        u10 u102 = u10;
        int i2 = i;
        m10 m10 = (m10) this.z;
        Context context = (Context) this.x;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = u102.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        to5 to5 = u102.c;
        adler32.update(allocate.putInt(vo5.a(to5)).array());
        byte[] bArr = u102.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z2) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i3 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i3 >= i2) {
                        dh4.i("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", u102);
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((za6) this.y).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(vo5.a(to5))});
        try {
            if (rawQuery.moveToNext()) {
                l = Long.valueOf(rawQuery.getLong(0));
            } else {
                l = 0L;
            }
            rawQuery.close();
            long longValue = l.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            JobScheduler jobScheduler2 = jobScheduler;
            int i4 = value;
            builder.setMinimumLatency(m10.a(to5, longValue, i2));
            Set set = ((n10) m10.b.get(to5)).c;
            if (set.contains(kg6.w)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(kg6.y)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(kg6.x)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i2);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", vo5.a(to5));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {u102, Integer.valueOf(i4), Long.valueOf(m10.a(to5, longValue, i2)), l, Integer.valueOf(i2)};
            String r = dh4.r("JobInfoScheduler");
            if (Log.isLoggable(r, 3)) {
                Log.d(r, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler2.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public ClipDescription a() {
        return (ClipDescription) this.y;
    }

    public void a0(String str) {
        if (str != null) {
            this.x = str;
        } else {
            ku4.j("Null backendName");
        }
    }

    public Uri b() {
        return (Uri) this.x;
    }

    public void b0(qk0 qk0) {
        ((tk0) this.z).w.c = qk0;
    }

    public void c0(tp1 tp1) {
        ((tk0) this.z).w.a = tp1;
    }

    public void cancel() {
        switch (this.w) {
            case 10:
                ((dy6) this.x).cancel();
                return;
            default:
                ((w72) ((u72) this.z).e).cancel();
                return;
        }
    }

    public Uri d() {
        return (Uri) this.z;
    }

    public void d0(ey3 ey3) {
        ((tk0) this.z).w.b = ey3;
    }

    public oy6 e() {
        switch (this.w) {
            case 10:
                return (zw5) this.y;
            default:
                return (t72) this.y;
        }
    }

    public void e0(long j) {
        ((tk0) this.z).w.d = j;
    }

    public Object f() {
        return null;
    }

    public void f0(h31 h31, int i, int i2, int i3) {
        int i4 = h31.a0;
        int i5 = h31.b0;
        h31.a0 = 0;
        h31.b0 = 0;
        h31.J(i2);
        h31.G(i3);
        if (i4 < 0) {
            h31.a0 = 0;
        } else {
            h31.a0 = i4;
        }
        if (i5 < 0) {
            h31.b0 = 0;
        } else {
            h31.b0 = i5;
        }
        h31 h312 = (h31) this.z;
        h312.s0 = i;
        h312.P();
    }

    public void g(Object obj, j43 j43) {
        xr0 xr0 = (xr0) obj;
        xr0.getClass();
        j43.getClass();
        vr0 vr0 = new vr0(xr0.w, j43, xr0.x);
        xr0.y.y(vr0);
        xr0.z = vr0.d;
        Iterator it = vr0.c.iterator();
        while (it.hasNext()) {
            e23 e23 = (e23) it.next();
            e23.getClass();
            e23.a.D0(j43, e23.b);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006c  */
    public du7 g0(r06 r06, wj3 wj3, boolean z2) {
        j16 j16;
        ro5 ro5;
        am6 am6 = (am6) this.x;
        pj3 pj3 = (pj3) am6.x;
        r06.getClass();
        boolean z3 = wj3.d;
        l16 l16 = r06.b;
        if (l16 instanceof j16) {
            j16 = (j16) l16;
        } else {
            j16 = null;
        }
        if (j16 != null) {
            Class cls = j16.a;
            if (!cls.equals(Void.TYPE)) {
                ro5 = zo3.b(cls.getName()).c();
                u04 u04 = new u04(am6, r06, true);
                if (ro5 == null) {
                    fu6 r = pj3.o.g().r(ro5);
                    vw3 E = jb5.E(r, new tm(new rm[]{r.getAnnotations(), u04}));
                    E.getClass();
                    fu6 fu6 = (fu6) E;
                    if (z3) {
                        return fu6;
                    }
                    return kl8.n(fu6, fu6.o0(true));
                }
                vw3 h0 = h0(l16, sg3.b0(fq7.x, z3, (q14) null, 6));
                k28 k28 = k28.y;
                k28 k282 = k28.A;
                if (!z3) {
                    return kl8.n(pj3.o.g().i(k28, h0, u04), pj3.o.g().i(k282, h0, u04).o0(true));
                }
                if (z2) {
                    k28 = k282;
                }
                return pj3.o.g().i(k28, h0, u04);
            }
        }
        ro5 = null;
        u04 u042 = new u04(am6, r06, true);
        if (ro5 == null) {
        }
    }

    public au getKey() {
        return (au) this.z;
    }

    public tu6 h() {
        switch (this.w) {
            case 10:
                return (yw5) this.z;
            default:
                return (s72) this.x;
        }
    }

    public vw3 h0(l16 l16, wj3 wj3) {
        pj3 pj3 = (pj3) ((am6) this.x).x;
        ro5 ro5 = null;
        if (l16 instanceof j16) {
            Class cls = ((j16) l16).a;
            if (!cls.equals(Void.TYPE)) {
                ro5 = zo3.b(cls.getName()).c();
            }
            if (ro5 != null) {
                return pj3.o.g().t(ro5);
            }
            return pj3.o.g().x();
        }
        boolean z2 = false;
        if (l16 instanceof a16) {
            a16 a16 = (a16) l16;
            Type type = a16.a;
            if (!wj3.d && wj3.a != fq7.w) {
                z2 = true;
            }
            boolean d = a16.d();
            x62 x62 = x62.y;
            if (d || z2) {
                wj3 wj32 = wj3;
                fu6 r = r(a16, wj3.a(wj32, xj3.y, false, (Set) null, (fu6) null, 61), (fu6) null);
                if (r == null) {
                    return z62.c(x62, type.toString());
                }
                fu6 r2 = r(a16, wj3.a(wj32, xj3.x, false, (Set) null, (fu6) null, 61), r);
                if (r2 == null) {
                    return z62.c(x62, type.toString());
                }
                if (!d) {
                    return kl8.n(r, r2);
                }
                zg2 zg2 = new zg2(r, r2);
                xw3.a.b(r, r2);
                return zg2;
            }
            fu6 r3 = r(a16, wj3, (fu6) null);
            if (r3 != null) {
                return r3;
            }
            return z62.c(x62, type.toString());
        }
        wj3 wj33 = wj3;
        if (l16 instanceof r06) {
            return g0((r06) l16, wj33, false);
        }
        if (l16 instanceof o16) {
            l16 c = ((o16) l16).c();
            if (c != null) {
                return h0(c, wj33);
            }
            return pj3.o.g().n();
        } else if (l16 == null) {
            return pj3.o.g().n();
        } else {
            kj6.k("Unsupported type: ", l16);
            return null;
        }
    }

    public Object i(vr2 vr2) {
        Object b = ((sr2) this.x).b();
        vr2.y(b);
        return new xr0((au) this.z, b, (vr2) this.y);
    }

    public void i0(View view) {
        if (((ArrayList) this.z).remove(view)) {
            ay4 ay4 = (ay4) this.x;
            lz5 I = RecyclerView.I(view);
            if (I != null) {
                RecyclerView recyclerView = (RecyclerView) ay4.x;
                int i = I.p;
                if (recyclerView.L()) {
                    I.q = i;
                    recyclerView.M0.add(I);
                } else {
                    View view2 = I.a;
                    WeakHashMap weakHashMap = e58.a;
                    view2.setImportantForAccessibility(i);
                }
                I.p = 0;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Throwable} */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    public void j(Bundle bundle) {
        Throwable th;
        synchronized (this.y) {
            try {
                th = bundle;
                g22 g22 = g22.D;
                g22.u("Logging event _ae to Firebase Analytics with params " + bundle);
                this.z = new CountDownLatch(1);
                ((f96) this.x).j(bundle);
                g22.u("Awaiting app exception callback from Analytics...");
                th = null;
                if (((CountDownLatch) this.z).await(500, TimeUnit.MILLISECONDS)) {
                    g22.u("App exception callback received from Analytics listener.");
                } else {
                    g22.v("Timeout exceeded while awaiting app exception callback from Analytics listener.", (Exception) null);
                }
            } catch (InterruptedException unused) {
                Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", th);
                th = th;
            } catch (Throwable th2) {
                throw th2;
            }
            this.z = th;
        }
    }

    public void j0(h31 h31) {
        ArrayList arrayList = (ArrayList) this.x;
        arrayList.clear();
        int size = h31.p0.size();
        for (int i = 0; i < size; i++) {
            g31 g31 = (g31) h31.p0.get(i);
            int[] iArr = g31.o0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(g31);
            }
        }
        h31.r0.b = true;
    }

    public void k(uy3 uy3, bh3 bh3) {
        ji8 ji8 = (ji8) this.x;
        ji8 ji82 = (ji8) this.y;
        ji8 ji83 = (ji8) this.z;
        int ordinal = bh3.ordinal();
        if (ordinal == 0) {
            ji8.o(uy3);
            ji83.o(uy3);
        } else if (ordinal == 1) {
            ji82.o(uy3);
            ji83.o(uy3);
        } else if (ordinal != 2) {
            if (ordinal != 3) {
                h.c();
            } else if (uy3.D != null) {
                ji83.o(uy3);
            } else {
                ji82.o(uy3);
            }
        } else if (uy3.D != null) {
            ji83.o(uy3);
        } else {
            ji8.o(uy3);
        }
    }

    public float l(float f, float f2) {
        return 0.0f;
    }

    public void m(View view, int i, boolean z2) {
        int i2;
        RecyclerView recyclerView = (RecyclerView) ((ay4) this.x).x;
        if (i < 0) {
            i2 = recyclerView.getChildCount();
        } else {
            i2 = K(i);
        }
        ((cp0) this.y).f(i2, z2);
        if (z2) {
            R(view);
        }
        recyclerView.addView(view, i2);
        RecyclerView.I(view);
    }

    public void n(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z2) {
        int i2;
        RecyclerView recyclerView = (RecyclerView) ((ay4) this.x).x;
        if (i < 0) {
            i2 = recyclerView.getChildCount();
        } else {
            i2 = K(i);
        }
        ((cp0) this.y).f(i2, z2);
        if (z2) {
            R(view);
        }
        lz5 I = RecyclerView.I(view);
        if (I != null) {
            if (I.j() || I.o()) {
                I.j &= -257;
            } else {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(I);
                h.n(sb, recyclerView.y());
                return;
            }
        }
        recyclerView.attachViewToParent(view, i2, layoutParams);
    }

    public u10 o() {
        String str;
        if (((String) this.x) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((to5) this.z) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new u10((String) this.x, (byte[]) this.y, (to5) this.z);
        }
        h.s("Missing required properties:".concat(str));
        return null;
    }

    public void onEvent(String str, Bundle bundle) {
        CountDownLatch countDownLatch = (CountDownLatch) this.z;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0134, code lost:
        if (r7 != r9) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e4, code lost:
        if (r2.isEmpty() == false) goto L_0x01e9;
     */
    public fu6 r(a16 a16, wj3 wj3, fu6 fu6) {
        ro7 ro7;
        am6 am6;
        ro7 ro72;
        boolean z2;
        wo7 wo7;
        boolean z3;
        wo7 wo72;
        wo7 wo73;
        List list;
        Iterator it;
        boolean z4;
        Object obj;
        k28 k28;
        am6 am62;
        Object obj2;
        rm rmVar;
        ArrayList arrayList;
        wo7 wo74;
        wr0 wr0;
        xp7 xp7;
        ql4 ql4;
        o16 o16;
        ql4 ql42;
        wr0 wr02 = this;
        a16 a162 = a16;
        wj3 wj32 = wj3;
        fu6 fu62 = fu6;
        fq7 fq7 = wj32.a;
        xj3 xj3 = wj32.b;
        boolean z5 = wj32.d;
        am6 am63 = (am6) wr02.x;
        pj3 pj3 = (pj3) am63.x;
        if (fu62 == null || (ro7 = fu62.J()) == null) {
            ro7 = b85.u(new u04(am63, a162, false));
        }
        gi3 gi3 = a162.b;
        Type type = a162.a;
        if (gi3 != null) {
            boolean z6 = false;
            k28 k282 = k28.A;
            wo7 wo75 = null;
            Class<Object> cls = Object.class;
            fq7 fq72 = fq7.w;
            boolean z7 = z5;
            xj3 xj32 = xj3.y;
            if (gi3 instanceof x06) {
                z2 = true;
                x06 x06 = (x06) gi3;
                ro72 = ro7;
                up2 c = x06.c();
                if (c != null) {
                    if (!z7 || !c.equals(ck3.a)) {
                        am6 = am63;
                        fv3 g = pj3.o.g();
                        g.getClass();
                        gq0 g2 = tj3.g(c);
                        if (g2 != null) {
                            ql42 = g.j(g2.a());
                        } else {
                            ql42 = null;
                        }
                        if (ql4 == null) {
                            ql4 = null;
                        } else {
                            if (tj3.k.containsKey(rs1.f(ql4))) {
                                if (!(xj3 == xj32 || fq7 == fq72)) {
                                    l16 l16 = (l16) dt0.H0(a16.c());
                                    if (l16 instanceof o16) {
                                        o16 = (o16) l16;
                                    } else {
                                        o16 = null;
                                    }
                                    if (!(o16 == null || o16.c() == null)) {
                                        Type[] upperBounds = o16.a.getUpperBounds();
                                        upperBounds.getClass();
                                        if (sg3.e(qs.X0(upperBounds), cls)) {
                                            vp2 f = rs1.f(ql4);
                                            String str = tj3.a;
                                            up2 i = tj3.i(f);
                                            if (i != null) {
                                                List parameters = ts1.e(ql4).j(i).n().getParameters();
                                                parameters.getClass();
                                                qp7 qp7 = (qp7) dt0.H0(parameters);
                                                if (qp7 != null) {
                                                    k28 I = qp7.I();
                                                    if (I != null) {
                                                    }
                                                }
                                            } else {
                                                rf2.q(ql4, " is not a read-only collection", "Given class ");
                                                return null;
                                            }
                                        }
                                    }
                                }
                                ql4 = kw5.j(ql4);
                            }
                        }
                    } else {
                        f26 f26 = pj3.p;
                        s63 s63 = f26.c;
                        yr3 yr3 = f26.e[0];
                        s63.getClass();
                        yr3.getClass();
                        uq4 e = uq4.e(gw8.j(yr3.getName()));
                        am6 = am63;
                        vq0 e2 = ((ji4) f26.b.getValue()).e(e, oz4.x);
                        if (e2 instanceof ql4) {
                            ql4 = (ql4) e2;
                        } else {
                            ql4 = null;
                        }
                        if (ql4 == null) {
                            ql4 = f26.a.E(new gq0(n27.i, e), sg3.D(1));
                        }
                    }
                    if (ql4 == null) {
                        rg4 rg4 = pj3.k;
                        rg4.getClass();
                        ns8 ns8 = (ns8) rg4.x;
                        if (ns8 != null) {
                            ql4 = ns8.U(x06);
                        } else {
                            sg3.a0("resolver");
                            throw null;
                        }
                    }
                    if (ql4 == null || (wo7 = ql4.n()) == null) {
                        kj6.k("Type not found: ", type);
                        return null;
                    }
                } else {
                    throw new AssertionError("Class type should have a FQ name: " + gi3);
                }
            } else {
                am6 = am63;
                ro72 = ro7;
                z2 = true;
                if (gi3 instanceof m16) {
                    qp7 d = ((up7) wr02.y).d((m16) gi3);
                    if (d != null) {
                        wo7 = d.n();
                    } else {
                        wo7 = null;
                    }
                } else {
                    ku4.t("Unknown classifier kind: ", gi3);
                    return null;
                }
            }
            if (wo7 == null) {
                return null;
            }
            if (xj3 == xj32 || z7 || fq7 == fq72) {
                z3 = false;
            } else {
                z3 = z2;
            }
            if (fu62 != null) {
                wo72 = fu62.L();
            } else {
                wo72 = null;
            }
            if (sg3.e(wo72, wo7) && !a16.d() && z3) {
                return fu62.o0(z2);
            }
            boolean z8 = z2;
            if (!a16.d()) {
                if (a16.c().isEmpty()) {
                    List parameters2 = wo7.getParameters();
                    parameters2.getClass();
                }
                z8 = false;
            }
            List<qp7> parameters3 = wo7.getParameters();
            parameters3.getClass();
            if (!z8) {
                wo73 = wo7;
                wr0 wr03 = wr02;
                if (parameters3.size() == a16.c().size()) {
                    ss h1 = dt0.h1(a16.c());
                    ArrayList arrayList2 = new ArrayList(et0.e0(h1, 10));
                    Iterator it2 = h1.iterator();
                    while (true) {
                        f02 f02 = (f02) it2;
                        if (!f02.x.hasNext()) {
                            arrayList = dt0.b1(arrayList2);
                            break;
                        }
                        ka3 ka3 = (ka3) f02.next();
                        int i2 = ka3.a;
                        l16 l162 = (l16) ka3.b;
                        parameters3.size();
                        qp7 qp72 = (qp7) parameters3.get(i2);
                        fq7 fq73 = fq7.x;
                        wj3 b0 = sg3.b0(fq73, z6, (q14) null, 7);
                        qp72.getClass();
                        boolean z9 = l162 instanceof o16;
                        k28 k283 = k28.y;
                        if (z9) {
                            o16 o162 = (o16) l162;
                            l16 c2 = o162.c();
                            Type[] upperBounds2 = o162.a.getUpperBounds();
                            upperBounds2.getClass();
                            if (!sg3.e(qs.X0(upperBounds2), cls)) {
                                k28 = k282;
                            } else {
                                k28 = k28.z;
                            }
                            if (c2 == null || !(qp72.I() == k283 || k28 == qp72.I())) {
                                it = it2;
                                list = parameters3;
                                am62 = am6;
                                z4 = false;
                                obj = iq7.k(qp72, b0);
                            } else if (o162.c() != null) {
                                am62 = am6;
                                Iterator it3 = new u04(am62, o162, false).iterator();
                                while (true) {
                                    zd2 zd2 = (zd2) it3;
                                    if (!zd2.hasNext()) {
                                        it = it2;
                                        list = parameters3;
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = zd2.next();
                                    fm fmVar = (fm) obj2;
                                    it = it2;
                                    up2[] up2Arr = mj3.b;
                                    list = parameters3;
                                    int length = up2Arr.length;
                                    up2[] up2Arr2 = up2Arr;
                                    int i3 = 0;
                                    while (i3 < length) {
                                        int i4 = i3;
                                        int i5 = length;
                                        if (sg3.e(fmVar.f(), up2Arr2[i4])) {
                                            break;
                                        }
                                        i3 = i4 + 1;
                                        length = i5;
                                    }
                                    it2 = it;
                                    parameters3 = list;
                                }
                                fm fmVar2 = (fm) obj2;
                                z4 = false;
                                vw3 h0 = wr03.h0(c2, sg3.b0(fq73, false, (q14) null, 7));
                                if (fmVar2 != null) {
                                    ArrayList L0 = dt0.L0(h0.getAnnotations(), fmVar2);
                                    if (L0.isEmpty()) {
                                        rmVar = me6.x;
                                    } else {
                                        rmVar = new tm(0, L0);
                                    }
                                    h0 = jb5.E(h0, rmVar);
                                }
                                obj = jb5.e(h0, k28, qp72);
                            } else {
                                h.q("Nullability annotations on unbounded wildcards aren't supported");
                                return null;
                            }
                            am6 = am62;
                        } else {
                            it = it2;
                            list = parameters3;
                            z4 = false;
                            obj = new p27(wr03.h0(l162, b0), k283);
                        }
                        arrayList2.add(obj);
                        it2 = it;
                        z6 = z4;
                        parameters3 = list;
                    }
                } else {
                    ArrayList arrayList3 = new ArrayList(et0.e0(parameters3, 10));
                    for (qp7 name : parameters3) {
                        String b = name.getName().b();
                        b.getClass();
                        arrayList3.add(new p27((vw3) z62.c(x62.O, b)));
                    }
                    arrayList = dt0.b1(arrayList3);
                }
            } else {
                ArrayList arrayList4 = new ArrayList(et0.e0(parameters3, 10));
                for (qp7 qp73 : parameters3) {
                    wj3 wj33 = wj3;
                    if (jb5.t(qp73, wo75, wj33.e)) {
                        xp7 = iq7.k(qp73, wj33);
                        wo74 = wo7;
                        wr0 = wr02;
                    } else {
                        wo7 wo76 = wo7;
                        wr0 = wr02;
                        wo74 = wo76;
                        xp7 = ts2.k(qp73, wj3.a(wj3, (xj3) null, a16.d(), (Set) null, (fu6) null, 59), (kg5) wr0.z, new l44(pj3.a, new bk3(wr02, qp73, wj33, wo76, a16)));
                    }
                    arrayList4.add(xp7);
                    wr02 = wr0;
                    wo7 = wo74;
                    wo75 = null;
                }
                wo73 = wo7;
                arrayList = arrayList4;
            }
            return kl8.I(ro72, wo73, arrayList, z3);
        }
        kj6.k("Type not found: ", type);
        return null;
    }

    public float s(float f) {
        bd bdVar = (bd) this.x;
        float e = bdVar.e();
        Object b = rc.b(bdVar.b(), e, f, (vr2) this.y, (lc) this.z);
        if (!((Boolean) bdVar.a.y(b)).booleanValue()) {
            b = bdVar.h.getValue();
        }
        return bdVar.b().c(b) - e;
    }

    public boolean t(uy3 uy3) {
        boolean z2;
        boolean z3;
        if (uy3.D == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (((my6) ((ji8) this.x).x).contains(uy3) || ((my6) ((ji8) this.y).x).contains(uy3)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 || !z3) {
            return false;
        }
        return true;
    }

    public String toString() {
        switch (this.w) {
            case 14:
                return ((cp0) this.y).toString() + ", hidden list:" + ((ArrayList) this.z).size();
            default:
                return super.toString();
        }
    }

    public String v(int i, StringBuilder sb) {
        String str;
        String str2 = null;
        while (true) {
            kk1 w2 = w(i, str2);
            String V = fd1.V(w2.b);
            if (V != null) {
                sb.append(V);
            }
            if (w2.d) {
                str = String.valueOf(w2.c);
            } else {
                str = null;
            }
            int i2 = w2.a;
            if (i == i2) {
                return sb.toString();
            }
            i = i2;
            str2 = str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x020a, code lost:
        r5 = r3.b;
        r6 = r5 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0210, code lost:
        if (r6 <= r2.x) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0213, code lost:
        if (r5 >= r6) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0219, code lost:
        if (r2.a(r5) == false) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0221, code lost:
        if (S(r3.b) == false) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0223, code lost:
        r5 = r3.b;
        r6 = r5 + 5;
        r7 = r2.x;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0229, code lost:
        if (r6 >= r7) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x022b, code lost:
        r3.b = r5 + 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0231, code lost:
        r3.b = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0234, code lost:
        r3.c = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0236, code lost:
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0238, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x023b, code lost:
        r3.b += 3;
        r7 = 1;
        r3.c = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0246, code lost:
        r6 = new defpackage.v70(r7, (java.lang.Object) null, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02ce, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0302, code lost:
        r3.c = 2;
        r3.b += 4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x02ec A[SYNTHETIC] */
    public kk1 w(int i, String str) {
        boolean z2;
        v70 v70;
        boolean z3;
        int i2;
        boolean z4;
        v70 v702;
        lk1 lk1;
        boolean z5;
        kk1 kk1;
        int C2;
        jk1 jk1;
        char c;
        int C3;
        int C4;
        int i3;
        int i4;
        int C5;
        jk1 jk12;
        char c2;
        jk1 jk13;
        int C6;
        String str2 = str;
        i90 i90 = (i90) this.x;
        dv5 dv5 = (dv5) this.y;
        StringBuilder sb = (StringBuilder) this.z;
        sb.setLength(0);
        if (str2 != null) {
            sb.append(str2);
        }
        dv5.b = i;
        while (true) {
            int i5 = dv5.b;
            int i6 = dv5.c;
            if (i6 == 2) {
                while (true) {
                    int i7 = dv5.b;
                    int i8 = i7 + 5;
                    i3 = i90.x;
                    if (i8 <= i3 && (((C5 = C(i7, 5, i90)) >= 5 && C5 < 16) || (i7 + 6 <= i3 && (C6 = C(i7, 6, i90)) >= 16 && C6 < 63))) {
                        int i9 = dv5.b;
                        int C7 = C(i9, 5, i90);
                        if (C7 == 15) {
                            jk12 = new jk1('$', i9 + 5);
                        } else {
                            if (C7 < 5 || C7 >= 15) {
                                int C8 = C(i9, 6, i90);
                                if (C8 < 32 || C8 >= 58) {
                                    switch (C8) {
                                        case 58:
                                            c2 = '*';
                                            break;
                                        case 59:
                                            c2 = ',';
                                            break;
                                        case 60:
                                            c2 = '-';
                                            break;
                                        case 61:
                                            c2 = '.';
                                            break;
                                        case 62:
                                            c2 = '/';
                                            break;
                                        default:
                                            h.s("Decoding invalid alphanumeric value: ".concat(String.valueOf(C8)));
                                            return null;
                                    }
                                    jk13 = new jk1(c2, i9 + 6);
                                } else {
                                    jk13 = new jk1((char) (C8 + 33), i9 + 6);
                                }
                            } else {
                                jk13 = new jk1((char) (C7 + 43), i9 + 5);
                            }
                            jk12 = jk13;
                        }
                        int i10 = jk12.a;
                        dv5.b = i10;
                        char c3 = jk12.b;
                        if (c3 == '$') {
                            v70 = new v70(1, new kk1(i10, sb.toString()), true);
                        } else {
                            sb.append(c3);
                        }
                    }
                }
                int i11 = dv5.b;
                int i12 = i11 + 3;
                if (i12 <= i90.x) {
                    while (true) {
                        if (i11 >= i12) {
                            dv5.b += 3;
                            i4 = 1;
                            dv5.c = 1;
                        } else if (!i90.a(i11)) {
                            i11++;
                        }
                    }
                }
                if (S(dv5.b)) {
                    int i13 = dv5.b;
                    if (i13 + 5 < i3) {
                        dv5.b = i13 + 5;
                    } else {
                        dv5.b = i3;
                    }
                    dv5.c = 3;
                }
                i4 = 1;
                v70 = new v70(i4, (Object) null, false);
                z3 = v70.x;
            } else if (i6 == 3) {
                while (true) {
                    int i14 = dv5.b;
                    int i15 = i14 + 5;
                    int i16 = i90.x;
                    if (i15 <= i16 && (((C2 = C(i14, 5, i90)) >= 5 && C2 < 16) || (i14 + 7 <= i16 && (((C3 = C(i14, 7, i90)) >= 64 && C3 < 116) || (i14 + 8 <= i16 && (C4 = C(i14, 8, i90)) >= 232 && C4 < 253))))) {
                        int i17 = dv5.b;
                        int C9 = C(i17, 5, i90);
                        if (C9 == 15) {
                            jk1 = new jk1('$', i17 + 5);
                        } else if (C9 < 5 || C9 >= 15) {
                            int C10 = C(i17, 7, i90);
                            if (C10 >= 64 && C10 < 90) {
                                jk1 = new jk1((char) (C10 + 1), i17 + 7);
                            } else if (C10 < 90 || C10 >= 116) {
                                switch (C(i17, 8, i90)) {
                                    case 232:
                                        c = '!';
                                        break;
                                    case 233:
                                        c = '\"';
                                        break;
                                    case 234:
                                        c = '%';
                                        break;
                                    case 235:
                                        c = '&';
                                        break;
                                    case 236:
                                        c = '\'';
                                        break;
                                    case 237:
                                        c = '(';
                                        break;
                                    case 238:
                                        c = ')';
                                        break;
                                    case 239:
                                        c = '*';
                                        break;
                                    case 240:
                                        c = '+';
                                        break;
                                    case 241:
                                        c = ',';
                                        break;
                                    case 242:
                                        c = '-';
                                        break;
                                    case 243:
                                        c = '.';
                                        break;
                                    case 244:
                                        c = '/';
                                        break;
                                    case 245:
                                        c = ':';
                                        break;
                                    case 246:
                                        c = ';';
                                        break;
                                    case 247:
                                        c = '<';
                                        break;
                                    case 248:
                                        c = '=';
                                        break;
                                    case 249:
                                        c = '>';
                                        break;
                                    case 250:
                                        c = '?';
                                        break;
                                    case 251:
                                        c = '_';
                                        break;
                                    case 252:
                                        c = ' ';
                                        break;
                                    default:
                                        throw FormatException.a();
                                }
                                jk1 = new jk1(c, i17 + 8);
                            } else {
                                jk1 = new jk1((char) (C10 + 7), i17 + 7);
                            }
                        } else {
                            jk1 = new jk1((char) (C9 + 43), i17 + 5);
                        }
                        int i18 = jk1.a;
                        dv5.b = i18;
                        char c4 = jk1.b;
                        if (c4 == '$') {
                            v70 v703 = new v70(1, new kk1(i18, sb.toString()), true);
                        } else {
                            sb.append(c4);
                        }
                    }
                }
                z3 = v70.x;
            } else {
                while (true) {
                    int i19 = dv5.b;
                    int i20 = i19 + 7;
                    int i21 = i90.x;
                    if (i20 <= i21) {
                        int i22 = i19;
                        while (true) {
                            int i23 = i19 + 3;
                            if (i22 >= i23) {
                                z4 = i90.a(i23);
                            } else if (!i90.a(i22)) {
                                i22++;
                            }
                        }
                    } else if (i19 + 4 > i21) {
                        z4 = false;
                        int i24 = dv5.b;
                        if (!z4) {
                            int i25 = i24 + 7;
                            if (i25 > i21) {
                                int C11 = C(i24, 4, i90);
                                if (C11 == 0) {
                                    lk1 = new lk1(i21, 10, 10);
                                } else {
                                    lk1 = new lk1(i21, C11 - 1, 10);
                                }
                            } else {
                                int C12 = C(i24, 7, i90) - 8;
                                lk1 = new lk1(i25, C12 / 11, C12 % 11);
                            }
                            int i26 = lk1.a;
                            dv5.b = i26;
                            int i27 = lk1.c;
                            int i28 = lk1.b;
                            if (i28 == 10) {
                                if (i27 == 10) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    kk1 = new kk1(i26, sb.toString());
                                } else {
                                    kk1 = new kk1(i26, i27, sb.toString());
                                }
                                v702 = new v70(1, kk1, true);
                            } else {
                                sb.append(i28);
                                if (i27 == 10) {
                                    v702 = new v70(1, new kk1(dv5.b, sb.toString()), true);
                                } else {
                                    sb.append(i27);
                                }
                            }
                        } else {
                            if (i24 + 1 <= i21) {
                                int i29 = 0;
                                while (true) {
                                    if (i29 < 4) {
                                        int i30 = i29 + i24;
                                        if (i30 < i21) {
                                            if (!i90.a(i30)) {
                                                i29++;
                                            }
                                        }
                                    }
                                }
                            }
                            z2 = false;
                            v702 = new v70(1, (Object) null, false);
                        }
                    }
                    z4 = true;
                    int i242 = dv5.b;
                    if (!z4) {
                    }
                }
                z3 = v70.x;
                i2 = dv5.b;
                if ((i5 == i2 && !z3) || z3) {
                    kk1 kk12 = (kk1) v70.y;
                } else {
                    boolean z6 = z2;
                }
            }
            z2 = false;
            i2 = dv5.b;
            if (i5 == i2) {
            }
        }
        kk1 kk122 = (kk1) v70.y;
        if (kk122 == null || !kk122.d) {
            return new kk1(i2, sb.toString());
        }
        return new kk1(i2, kk122.c, sb.toString());
    }

    public void y(int i) {
        lz5 I;
        int K = K(i);
        ((cp0) this.y).i(K);
        RecyclerView recyclerView = (RecyclerView) ((ay4) this.x).x;
        View childAt = recyclerView.getChildAt(K);
        if (!(childAt == null || (I = RecyclerView.I(childAt)) == null)) {
            if (!I.j() || I.o()) {
                I.a(256);
            } else {
                StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                sb.append(I);
                h.n(sb, recyclerView.y());
                return;
            }
        }
        recyclerView.detachViewFromParent(K);
    }

    public void z(Bundle bundle) {
        HashSet hashSet = (HashSet) this.y;
        String string = ((Context) this.z).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String next : bundle.keySet()) {
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (sb3.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    A((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void c() {
    }

    public /* synthetic */ wr0(Object obj, Object obj2, Object obj3, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
    }

    public wr0(ExecutorService executorService, ExecutorService executorService2) {
        this.w = 3;
        executorService.getClass();
        executorService2.getClass();
        this.x = new ya1(executorService);
        this.y = new ya1(executorService);
        b35.l((Object) null);
        this.z = new ya1(executorService2);
    }

    public wr0(int i) {
        this.w = i;
        switch (i) {
            case 17:
                this.x = new ji8(19);
                this.y = new ji8(19);
                this.z = new ji8(19);
                return;
            case 22:
                this.x = new tp4();
                return;
            default:
                this.z = new jv2(11);
                return;
        }
    }

    public wr0(dy6 dy6) {
        this.w = 10;
        this.x = dy6;
        oy6 e = dy6.e();
        e.getClass();
        this.y = new zw5(e);
        tu6 h = dy6.h();
        h.getClass();
        this.z = new yw5(h);
    }

    public /* synthetic */ wr0(int i, boolean z2) {
        this.w = i;
    }

    public wr0(String str, HashMap hashMap) {
        this.w = 24;
        this.x = str;
        this.y = hashMap;
        this.z = new HashMap();
    }

    public wr0(i90 i90) {
        this.w = 23;
        dv5 dv5 = new dv5(2, (byte) 0);
        dv5.b = 0;
        dv5.c = 1;
        this.y = dv5;
        this.z = new StringBuilder();
        this.x = i90;
    }

    public wr0(am6 am6, up7 up7) {
        this.w = 27;
        up7.getClass();
        this.x = am6;
        this.y = up7;
        this.z = new kg5(new ts2(7));
    }

    public wr0(f96 f96) {
        this.w = 9;
        this.y = new Object();
        this.x = f96;
    }

    public wr0(ay4 ay4) {
        this.w = 14;
        this.x = ay4;
        this.y = new cp0();
        this.z = new ArrayList();
    }

    public wr0(md2 md2) {
        this.w = 2;
        this.y = null;
        this.z = null;
        this.x = md2;
    }

    public wr0(FirebaseMessagingService firebaseMessagingService, br4 br4, ExecutorService executorService) {
        this.w = 18;
        this.x = executorService;
        this.y = firebaseMessagingService;
        this.z = br4;
    }

    public wr0(View view) {
        this.w = 26;
        this.x = view;
        this.y = rg3.y(i44.x, new kh(7, this));
        this.z = new ay4(view);
    }

    public wr0(String str, sr2 sr2, vr2 vr2) {
        as3 as3;
        this.w = 0;
        sr2.getClass();
        this.x = sr2;
        this.y = vr2;
        c26 c26 = b26.a;
        Class<xr0> cls = xr0.class;
        gq3 b = c26.b(cls);
        try {
            gs3 gs3 = gs3.c;
            cs3 n = c26.n(c26.b(wr0.class));
            c26.l(n, Collections.singletonList(b26.b(Object.class)));
            as3 = b26.c(cls, x91.C(c26.m(n, Collections.EMPTY_LIST, false)));
        } catch (Throwable unused) {
            as3 = null;
        }
        this.z = new au(str, new fp7(b, as3));
    }

    public wr0(tk0 tk0) {
        this.w = 12;
        this.z = tk0;
        this.x = new ji8(10, (Object) this);
    }

    public wr0(h31 h31) {
        this.w = 7;
        this.x = new ArrayList();
        this.y = new Object();
        this.z = h31;
    }

    public wr0(Context context) {
        this.w = 1;
        this.z = context.getApplicationContext();
        this.y = new HashSet();
        this.x = new HashMap();
    }

    public wr0(am6 am6, kw5 kw5, tl1 tl1, Set set) {
        this.w = 19;
        this.x = kw5;
        this.y = am6;
        this.z = tl1;
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int[] iArr = (int[]) it.next();
                String str = new String(iArr, 0, iArr.length);
                W(str, 0, str.length(), 1, true, new al2(str, 2));
            }
        }
    }

    public wr0(u72 u72) {
        this.w = 20;
        this.z = u72;
        w72 w72 = (w72) u72.e;
        u72 u722 = u72;
        this.x = new s72(u722, w72.h().h(), -1, true);
        this.y = new t72(u722, w72.h().e(), -1, true);
    }
}
