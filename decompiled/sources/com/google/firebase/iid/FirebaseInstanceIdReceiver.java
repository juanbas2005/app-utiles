package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class FirebaseInstanceIdReceiver extends BroadcastReceiver {
    public static SoftReference a;
    public static SoftReference b;

    public static int a(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(extras);
            if (!sg3.V(putExtras)) {
                return -1;
            }
            sg3.H("_nd", putExtras.getExtras());
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    public final void onReceive(Context context, Intent intent) {
        ExecutorService executorService;
        ExecutorService executorService2;
        if (intent != null) {
            boolean isOrderedBroadcast = isOrderedBroadcast();
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (FirebaseInstanceIdReceiver.class) {
                try {
                    SoftReference softReference = a;
                    if (softReference != null) {
                        executorService = (ExecutorService) softReference.get();
                    } else {
                        executorService = null;
                    }
                    if (executorService == null) {
                        executorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new ar4("firebase-iid-executor")));
                        a = new SoftReference(executorService);
                    }
                    executorService2 = executorService;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            executorService2.execute(new hy8(this, intent, context, isOrderedBroadcast, goAsync));
        }
    }
}
