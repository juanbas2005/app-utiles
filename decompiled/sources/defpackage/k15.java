package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: k15  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k15 implements Handler.Callback, ServiceConnection {
    public final Context w;
    public final Handler x;
    public final HashMap y = new HashMap();
    public HashSet z = new HashSet();

    public k15(Context context) {
        this.w = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.x = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(j15 j15) {
        boolean z2;
        ArrayDeque arrayDeque = j15.d;
        ComponentName componentName = j15.a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (!arrayDeque.isEmpty()) {
            if (j15.b) {
                z2 = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.w;
                boolean bindService = context.bindService(component, this, 33);
                j15.b = bindService;
                if (bindService) {
                    j15.e = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z2 = j15.b;
            }
            if (!z2 || j15.c == null) {
                b(j15);
                return;
            }
            while (true) {
                h15 h15 = (h15) arrayDeque.peek();
                if (h15 == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + h15);
                    }
                    h15.a(j15.c);
                    arrayDeque.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + componentName);
                    }
                } catch (RemoteException e) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e);
                }
            }
            if (!arrayDeque.isEmpty()) {
                b(j15);
            }
        }
    }

    public final void b(j15 j15) {
        ComponentName componentName = j15.a;
        ArrayDeque arrayDeque = j15.d;
        Handler handler = this.x;
        if (!handler.hasMessages(3, componentName)) {
            int i = j15.e;
            int i2 = i + 1;
            j15.e = i2;
            if (i2 > 6) {
                Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + j15.e + " retries");
                arrayDeque.clear();
                return;
            }
            int i3 = (1 << i) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (long) i3);
        }
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [v73, java.lang.Object] */
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        x73 x73 = null;
        if (i == 0) {
            h15 h15 = (h15) message.obj;
            String string = Settings.Secure.getString(this.w.getContentResolver(), "enabled_notification_listeners");
            synchronized (l15.b) {
                if (string != null) {
                    try {
                        if (!string.equals(l15.c)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String unflattenFromString : split) {
                                ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                                if (unflattenFromString2 != null) {
                                    hashSet2.add(unflattenFromString2.getPackageName());
                                }
                            }
                            l15.d = hashSet2;
                            l15.c = string;
                        }
                    } finally {
                        while (true) {
                        }
                    }
                }
                hashSet = l15.d;
            }
            if (!hashSet.equals(this.z)) {
                this.z = hashSet;
                List<ResolveInfo> queryIntentServices = this.w.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo next : queryIntentServices) {
                    if (hashSet.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    if (!this.y.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.y.put(componentName2, new j15(componentName2));
                    }
                }
                Iterator it2 = this.y.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        j15 j15 = (j15) entry.getValue();
                        if (j15.b) {
                            this.w.unbindService(this);
                            j15.b = false;
                        }
                        j15.c = null;
                        it2.remove();
                    }
                }
            }
            for (j15 j152 : this.y.values()) {
                j152.d.add(h15);
                a(j152);
            }
        } else if (i == 1) {
            i15 i15 = (i15) message.obj;
            ComponentName componentName3 = i15.a;
            IBinder iBinder = i15.b;
            j15 j153 = (j15) this.y.get(componentName3);
            if (j153 != null) {
                int i2 = w73.d;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(x73.c);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof x73)) {
                        ? obj = new Object();
                        obj.d = iBinder;
                        x73 = obj;
                    } else {
                        x73 = (x73) queryLocalInterface;
                    }
                }
                j153.c = x73;
                j153.e = 0;
                a(j153);
                return true;
            }
        } else if (i == 2) {
            j15 j154 = (j15) this.y.get((ComponentName) message.obj);
            if (j154 != null) {
                if (j154.b) {
                    this.w.unbindService(this);
                    j154.b = false;
                }
                j154.c = null;
                return true;
            }
        } else if (i != 3) {
            return false;
        } else {
            j15 j155 = (j15) this.y.get((ComponentName) message.obj);
            if (j155 != null) {
                a(j155);
                return true;
            }
        }
        return true;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.x.obtainMessage(1, new i15(componentName, iBinder)).sendToTarget();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.x.obtainMessage(2, componentName).sendToTarget();
    }
}
