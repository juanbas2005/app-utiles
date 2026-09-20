package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class FirebaseMessagingService extends Service {
    public static final ArrayDeque C = new ArrayDeque(10);
    public int A = 0;
    public ha6 B;
    public final ExecutorService w;
    public yc8 x;
    public final Object y = new Object();
    public int z;

    public FirebaseMessagingService() {
        ar4 ar4 = new ar4("Firebase-Messaging-Intent-Handle");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), ar4);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.w = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public final void b(Intent intent) {
        if (intent != null) {
            bb0.Y(intent);
        }
        synchronized (this.y) {
            try {
                int i = this.A - 1;
                this.A = i;
                if (i == 0) {
                    stopSelfResult(this.z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01c4  */
    public final void c(Intent intent) {
        ha6 ha6;
        Integer num;
        int i;
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            String stringExtra = intent.getStringExtra("google.message_id");
            if (!TextUtils.isEmpty(stringExtra)) {
                ArrayDeque arrayDeque = C;
                if (arrayDeque.contains(stringExtra)) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received duplicate message: " + stringExtra);
                    }
                    if (this.B == null) {
                        this.B = new ha6(getApplicationContext());
                    }
                    ha6 = this.B;
                    if (ha6.c.s() < 233700000) {
                        Bundle bundle = new Bundle();
                        String stringExtra2 = intent.getStringExtra("google.message_id");
                        if (stringExtra2 == null) {
                            stringExtra2 = intent.getStringExtra("message_id");
                        }
                        bundle.putString("google.message_id", stringExtra2);
                        if (intent.hasExtra("google.product_id")) {
                            num = Integer.valueOf(intent.getIntExtra("google.product_id", 0));
                        } else {
                            num = null;
                        }
                        if (num != null) {
                            bundle.putInt("google.product_id", num.intValue());
                        }
                        kb9 s = kb9.s(ha6.b);
                        synchronized (s) {
                            i = s.x;
                            s.x = i + 1;
                        }
                        s.t(new ba9(i, 3, bundle, 0));
                        return;
                    }
                    b35.k(new IOException("SERVICE_NOT_AVAILABLE"));
                    return;
                }
                if (arrayDeque.size() >= 10) {
                    arrayDeque.remove();
                }
                arrayDeque.add(stringExtra);
            }
            String stringExtra3 = intent.getStringExtra("message_type");
            if (stringExtra3 == null) {
                stringExtra3 = "gcm";
            }
            char c = 65535;
            switch (stringExtra3.hashCode()) {
                case -2062414158:
                    if (stringExtra3.equals("deleted_messages")) {
                        c = 0;
                        break;
                    }
                    break;
                case 102161:
                    if (stringExtra3.equals("gcm")) {
                        c = 1;
                        break;
                    }
                    break;
                case 814694033:
                    if (stringExtra3.equals("send_error")) {
                        c = 2;
                        break;
                    }
                    break;
                case 814800675:
                    if (stringExtra3.equals("send_event")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case b85.b:
                    break;
                case 1:
                    sg3.G(intent);
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    extras.remove("androidx.content.wakelockid");
                    if (br4.L(extras)) {
                        br4 br4 = new br4(extras);
                        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ar4("Firebase-Messaging-Network-Io"));
                        try {
                            if (new wr0(this, br4, newSingleThreadExecutor).O()) {
                                break;
                            } else {
                                newSingleThreadExecutor.shutdown();
                                if (sg3.V(intent)) {
                                    sg3.H("_nf", intent.getExtras());
                                }
                            }
                        } finally {
                            newSingleThreadExecutor.shutdown();
                        }
                    }
                    d(new d46(extras));
                    break;
                case 2:
                    if (intent.getStringExtra("google.message_id") == null) {
                        intent.getStringExtra("message_id");
                    }
                    String stringExtra4 = intent.getStringExtra("error");
                    new Exception(stringExtra4);
                    if (stringExtra4 != null) {
                        stringExtra4.toLowerCase(Locale.US).getClass();
                        break;
                    }
                    break;
                case 3:
                    intent.getStringExtra("google.message_id");
                    break;
                default:
                    Log.w("FirebaseMessaging", "Received message with unknown type: ".concat(stringExtra3));
                    break;
            }
            if (this.B == null) {
            }
            ha6 = this.B;
            if (ha6.c.s() < 233700000) {
            }
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            e(intent.getStringExtra("token"));
        } else if ("com.google.firebase.messaging.FCM_REGISTERED".equals(action)) {
            intent.getStringExtra("token");
        } else if ("com.google.firebase.messaging.FCM_UNREGISTERED".equals(action)) {
            intent.getStringExtra("token");
        } else {
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
        }
    }

    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.x == null) {
                this.x = new yc8(new wv2(18, this));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.x;
    }

    public void onDestroy() {
        this.w.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.y) {
            this.z = i2;
            this.A++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) am6.H().A).poll();
        if (intent2 == null) {
            b(intent);
            return 2;
        }
        xb7 xb7 = new xb7();
        this.w.execute(new ti(this, intent2, xb7, 6));
        yb9 yb9 = xb7.a;
        if (yb9.j()) {
            b(intent);
            return 2;
        }
        yb9.c(new or(1), new yv0(6, (Object) this, (Object) intent));
        return 3;
    }

    public void d(d46 d46) {
    }

    public void e(String str) {
    }
}
