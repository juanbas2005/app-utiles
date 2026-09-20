package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.google.zxing.NotFoundException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: am6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class am6 implements qv3, ov3, pv3, dy6, yp0 {
    public static am6 B;
    public static final byte[] C = new byte[0];
    public Object A;
    public final /* synthetic */ int w;
    public Object x;
    public Object y;
    public Object z;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: android.graphics.drawable.Icon} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: android.graphics.drawable.Icon} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v19, resolved type: android.graphics.drawable.Icon} */
    /* JADX WARNING: Multi-variable type inference failed */
    public am6(d15 d15) {
        boolean z2;
        boolean z3;
        boolean z4;
        Icon icon;
        int i;
        Bundle bundle;
        int i2;
        ArrayList arrayList;
        Icon icon2;
        Bundle bundle2;
        int i3;
        d15 d152 = d15;
        this.w = 20;
        this.A = new Bundle();
        this.z = d152;
        Context context = d152.a;
        ArrayList<String> arrayList2 = d152.z;
        ArrayList arrayList3 = d152.c;
        ArrayList arrayList4 = d152.d;
        this.x = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.y = an.b(context, d152.w);
        } else {
            this.y = new Notification.Builder(context);
        }
        Notification notification = d152.y;
        Context context2 = null;
        Notification.Builder lights = ((Notification.Builder) this.y).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, (RemoteViews) null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        int i4 = 0;
        boolean z5 = true;
        if ((notification.flags & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z2);
        if ((notification.flags & 8) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z3);
        if ((notification.flags & 16) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        onlyAlertOnce.setAutoCancel(z4).setDefaults(notification.defaults).setContentTitle(d152.e).setContentText(d152.f).setContentInfo((CharSequence) null).setContentIntent(d152.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(d152.h, (notification.flags & 128) == 0 ? false : z5).setNumber(d152.j).setProgress(d152.n, d152.o, false);
        Notification.Builder builder = (Notification.Builder) this.y;
        IconCompat iconCompat = d152.i;
        if (iconCompat == null) {
            icon = null;
        } else {
            icon = iconCompat.f(context);
        }
        builder.setLargeIcon(icon);
        ((Notification.Builder) this.y).setSubText((CharSequence) null).setUsesChronometer(false).setPriority(d152.k);
        Iterator it = d152.b.iterator();
        while (it.hasNext()) {
            z05 z05 = (z05) it.next();
            if (z05.b == null && (i3 = z05.e) != 0) {
                z05.b = IconCompat.b(i3);
            }
            IconCompat iconCompat2 = z05.b;
            boolean z6 = z05.c;
            Bundle bundle3 = z05.a;
            if (iconCompat2 != null) {
                icon2 = iconCompat2.f(context2);
            } else {
                icon2 = context2;
            }
            Notification.Action.Builder builder2 = new Notification.Action.Builder(icon2, z05.f, z05.g);
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android.support.allowGeneratedReplies", z6);
            builder2.setAllowGeneratedReplies(z6);
            bundle2.putInt("android.support.action.semanticAction", 0);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 28) {
                bn.t(builder2);
            }
            if (i5 >= 29) {
                dn.o(builder2);
            }
            if (i5 >= 31) {
                hn.f(builder2);
            }
            if (i5 >= 37) {
                g15.a(builder2);
                g15.b(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", z05.d);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.y).addAction(builder2.build());
            context2 = null;
        }
        Bundle bundle4 = d152.r;
        if (bundle4 != null) {
            ((Bundle) this.A).putAll(bundle4);
        }
        ((Notification.Builder) this.y).setShowWhen(d152.l);
        ((Notification.Builder) this.y).setLocalOnly(d152.p);
        ((Notification.Builder) this.y).setGroup((String) null);
        ((Notification.Builder) this.y).setSortKey((String) null);
        ((Notification.Builder) this.y).setGroupSummary(false);
        ((Notification.Builder) this.y).setCategory(d152.q);
        ((Notification.Builder) this.y).setColor(d152.s);
        ((Notification.Builder) this.y).setVisibility(d152.t);
        ((Notification.Builder) this.y).setPublicVersion((Notification) null);
        ((Notification.Builder) this.y).setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    throw pb4.g(it2);
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    os osVar = new os(arrayList2.size() + arrayList.size());
                    osVar.addAll(arrayList);
                    osVar.addAll(arrayList2);
                    arrayList2 = new ArrayList<>(osVar);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            for (String addPerson : arrayList2) {
                ((Notification.Builder) this.y).addPerson(addPerson);
            }
        }
        if (arrayList4.size() > 0) {
            if (d152.r == null) {
                d152.r = new Bundle();
            }
            Bundle bundle5 = d152.r.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i6 = 0;
            while (i6 < arrayList4.size()) {
                String num = Integer.toString(i6);
                z05 z052 = (z05) arrayList4.get(i6);
                Bundle bundle8 = new Bundle();
                if (z052.b == null && (i2 = z052.e) != 0) {
                    z052.b = IconCompat.b(i2);
                }
                IconCompat iconCompat3 = z052.b;
                Bundle bundle9 = z052.a;
                if (iconCompat3 != null) {
                    i = iconCompat3.c();
                } else {
                    i = i4;
                }
                bundle8.putInt("icon", i);
                bundle8.putCharSequence("title", z052.f);
                bundle8.putParcelable("actionIntent", z052.g);
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", z052.c);
                bundle8.putBundle("extras", bundle);
                bundle8.putParcelableArray("remoteInputs", (Parcelable[]) null);
                bundle8.putBoolean("showsUserInterface", z052.d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(num, bundle8);
                i6++;
                i4 = 0;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (d152.r == null) {
                d152.r = new Bundle();
            }
            d152.r.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.A).putBundle("android.car.EXTENSIONS", bundle6);
        }
        ((Notification.Builder) this.y).setExtras(d152.r);
        ((Notification.Builder) this.y).setRemoteInputHistory((CharSequence[]) null);
        RemoteViews remoteViews = d152.u;
        if (remoteViews != null) {
            ((Notification.Builder) this.y).setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = d152.v;
        if (remoteViews2 != null) {
            ((Notification.Builder) this.y).setCustomBigContentView(remoteViews2);
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            an.m((Notification.Builder) this.y);
            an.s((Notification.Builder) this.y);
            an.t((Notification.Builder) this.y);
            an.u((Notification.Builder) this.y);
            an.o((Notification.Builder) this.y);
            if (!TextUtils.isEmpty(d152.w)) {
                ((Notification.Builder) this.y).setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i7 >= 28) {
            Iterator it3 = arrayList3.iterator();
            if (it3.hasNext()) {
                throw pb4.g(it3);
            }
        }
        if (i7 >= 29) {
            dn.m((Notification.Builder) this.y, d152.x);
            dn.n((Notification.Builder) this.y);
        }
        if (i7 >= 36) {
            z4.e((Notification.Builder) this.y);
        }
    }

    public static synchronized am6 H() {
        am6 am6;
        synchronized (am6.class) {
            try {
                if (B == null) {
                    B = new am6(0);
                }
                am6 = B;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return am6;
    }

    public static void P(am6 am6, ax5 ax5, dx5 dx5, ax5 ax52, int i) {
        wv1 wv1;
        ax5 z2;
        if ((i & 1) != 0) {
            ax5 = null;
        }
        if ((i & 2) != 0) {
            dx5 = null;
        }
        if ((i & 4) != 0) {
            ax52 = null;
        }
        am6.getClass();
        TimeZone timeZone = fg8.a;
        boolean isShutdown = ((ThreadPoolExecutor) am6.x()).isShutdown();
        synchronized (am6) {
            if (dx5 != null) {
                try {
                    if (!((ArrayDeque) am6.z).remove(dx5)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (ax52 != null) {
                ax52.x.decrementAndGet();
                if (!((ArrayDeque) am6.y).remove(ax52)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (ax5 != null) {
                ((ArrayDeque) am6.A).add(ax5);
                dx5 dx52 = ax5.y;
                if (!dx52.y && (z2 = am6.z(((g73) dx52.x.x).d)) != null) {
                    ax5.x = z2.x;
                }
            }
            if (!(dx5 == null && ax52 == null) && (isShutdown || ((ArrayDeque) am6.y).isEmpty())) {
                ((ArrayDeque) am6.z).isEmpty();
            }
            if (isShutdown) {
                List b1 = dt0.b1((ArrayDeque) am6.A);
                ((ArrayDeque) am6.A).clear();
                wv1 = new wv1(b1);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) am6.A).iterator();
                it.getClass();
                while (it.hasNext()) {
                    ax5 ax53 = (ax5) it.next();
                    if (((ArrayDeque) am6.y).size() >= 64) {
                        break;
                    } else if (ax53.x.get() < 5) {
                        it.remove();
                        ax53.x.incrementAndGet();
                        arrayList.add(ax53);
                        ((ArrayDeque) am6.y).add(ax53);
                    }
                }
                wv1 = new wv1((List) arrayList);
            }
        }
        int size = wv1.a.size();
        boolean z3 = true;
        for (int i2 = 0; i2 < size; i2++) {
            ax5 ax54 = (ax5) wv1.a.get(i2);
            if (ax54 == ax5) {
                z3 = false;
            } else {
                ax54.y.A.getClass();
            }
            if (isShutdown) {
                ax54.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause((Throwable) null);
                dx5 dx53 = ax54.y;
                dx53.j(interruptedIOException);
                ax54.w.M(dx53, interruptedIOException);
            } else {
                ExecutorService x2 = am6.x();
                ax54.getClass();
                dx5 dx54 = ax54.y;
                dx54.w.a.getClass();
                try {
                    ((ThreadPoolExecutor) x2).execute(ax54);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                    interruptedIOException2.initCause(e);
                    dx5 dx55 = ax54.y;
                    dx55.j(interruptedIOException2);
                    ax54.w.M(dx55, interruptedIOException2);
                    am6 am62 = dx54.w.a;
                    am62.getClass();
                    P(am62, (ax5) null, (dx5) null, ax54, 3);
                } catch (Throwable th2) {
                    am6 am63 = dx54.w.a;
                    am63.getClass();
                    P(am63, (ax5) null, (dx5) null, ax54, 3);
                    throw th2;
                }
            }
        }
        if (z3 && ax5 != null) {
            ax5.y.A.getClass();
        }
    }

    public static int w(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i5 > i) {
                i3 = i4;
                i = i5;
            }
            if (i5 > i2) {
                i2 = i5;
            }
        }
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 - i3;
            int i10 = iArr[i8] * i9 * i9;
            if (i10 > i7) {
                i6 = i8;
                i7 = i10;
            }
        }
        if (i3 <= i6) {
            int i11 = i3;
            i3 = i6;
            i6 = i11;
        }
        if (i3 - i6 > length / 16) {
            int i12 = i3 - 1;
            int i13 = -1;
            int i14 = i12;
            while (i12 > i6) {
                int i15 = i12 - i6;
                int i16 = (i2 - iArr[i12]) * (i3 - i12) * i15 * i15;
                if (i16 > i13) {
                    i14 = i12;
                    i13 = i16;
                }
                i12--;
            }
            return i14 << 3;
        }
        throw NotFoundException.y;
    }

    public bq2 A(String str) {
        for (wq2 wq2 : ((HashMap) this.y).values()) {
            if (wq2 != null) {
                bq2 bq2 = wq2.c;
                if (!str.equals(bq2.A)) {
                    bq2 = bq2.R.c.A(str);
                }
                if (bq2 != null) {
                    return bq2;
                }
            }
        }
        return null;
    }

    public b87 B(h8 h8Var) {
        ArrayList arrayList = (ArrayList) this.z;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b87 b87 = (b87) arrayList.get(i);
            if (b87 != null && b87.b == h8Var) {
                return b87;
            }
        }
        b87 b872 = new b87((Context) this.y, h8Var);
        arrayList.add(b872);
        return b872;
    }

    public ArrayList C() {
        ArrayList arrayList = new ArrayList();
        for (wq2 wq2 : ((HashMap) this.y).values()) {
            if (wq2 != null) {
                arrayList.add(wq2);
            }
        }
        return arrayList;
    }

    public ArrayList D() {
        ArrayList arrayList = new ArrayList();
        for (wq2 wq2 : ((HashMap) this.y).values()) {
            if (wq2 != null) {
                arrayList.add(wq2.c);
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    public ql4 E(gq0 gq0, List list) {
        gq0.getClass();
        return (ql4) ((fb4) this.A).y(new q05(gq0, list));
    }

    public o81 F() {
        o81 o81 = (o81) ((sr2) this.z).b();
        if (o81 != null) {
            return o81;
        }
        h.s("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public List G() {
        ArrayList arrayList;
        if (((ArrayList) this.x).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.x)) {
            arrayList = new ArrayList((ArrayList) this.x);
        }
        return arrayList;
    }

    public Enum I(yr3 yr3, Object obj) {
        yr3.getClass();
        return (Enum) ((w52) ((u52) this.z)).get(((mf3) ((vg2) this.y).e(((Number) ((qp4) this.x).get(obj)).intValue())).a());
    }

    public boolean J(Context context) {
        boolean z2;
        if (((Boolean) this.z) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.z = Boolean.valueOf(z2);
        }
        if (!((Boolean) this.y).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.z).booleanValue();
    }

    public boolean K(Context context) {
        boolean z2;
        if (((Boolean) this.y) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.y = Boolean.valueOf(z2);
        }
        if (!((Boolean) this.y).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.y).booleanValue();
    }

    public void L(wq2 wq2) {
        bq2 bq2 = wq2.c;
        String str = bq2.A;
        HashMap hashMap = (HashMap) this.y;
        if (hashMap.get(str) == null) {
            hashMap.put(bq2.A, wq2);
            if (rq2.L(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + bq2);
            }
        }
    }

    public void M(wq2 wq2) {
        HashMap hashMap = (HashMap) this.y;
        bq2 bq2 = wq2.c;
        if (bq2.Y) {
            ((tq2) this.A).h(bq2);
        }
        if (hashMap.get(bq2.A) == wq2 && ((wq2) hashMap.put(bq2.A, (Object) null)) != null && rq2.L(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + bq2);
        }
    }

    public boolean N(h8 h8Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.x).onActionItemClicked(B(h8Var), new cj4((Context) this.y, (g87) menuItem));
    }

    public boolean O(h8 h8Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.x;
        b87 B2 = B(h8Var);
        zt6 zt6 = (zt6) this.A;
        Menu menu2 = (Menu) zt6.get(menu);
        if (menu2 == null) {
            menu2 = new uj4((Context) this.y, (ti4) menu);
            zt6.put(menu, menu2);
        }
        return callback.onCreateActionMode(B2, menu2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: qq4} */
    /* JADX WARNING: type inference failed for: r2v4, types: [oq4] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        if (r10.a(r1) == r7) goto L_0x0073;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069 A[SYNTHETIC, Splitter:B:27:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARNING: Unknown variable types count: 1 */
    public Object Q(h61 h61) {
        qa6 qa6;
        int i;
        Throwable th;
        oq4 oq4;
        qq4 qq4;
        xu0 xu0 = (xu0) this.y;
        if (h61 instanceof qa6) {
            qa6 = (qa6) h61;
            int i2 = qa6.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qa6.C = i2 - Integer.MIN_VALUE;
                Object obj = qa6.A;
                i = qa6.C;
                vs7 vs7 = vs7.a;
                Object obj2 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    if (!(xu0.R() instanceof aa3)) {
                        return vs7;
                    }
                    qq4 = (qq4) this.x;
                    qa6.z = qq4;
                    qa6.C = 1;
                } else if (i == 1) {
                    ? r2 = qa6.z;
                    o85.q(obj);
                    qq4 = r2;
                } else if (i == 2) {
                    oq4 = qa6.z;
                    try {
                        o85.q(obj);
                        xu0.c0(vs7);
                        oq4.k((Object) null);
                        return vs7;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (xu0.R() instanceof aa3) {
                    qq4.k((Object) null);
                    return vs7;
                }
                qa6.z = qq4;
                qa6.C = 2;
                if (v(qa6) != obj2) {
                    oq4 = qq4;
                    xu0.c0(vs7);
                    oq4.k((Object) null);
                    return vs7;
                }
                return obj2;
            }
        }
        qa6 = new qa6(this, h61);
        Object obj3 = qa6.A;
        i = qa6.C;
        vs7 vs72 = vs7.a;
        Object obj22 = p81.w;
        if (i != 0) {
        }
        try {
            if (xu0.R() instanceof aa3) {
            }
        } catch (Throwable th3) {
            oq4 oq42 = qq4;
            th = th3;
            oq4 = oq42;
            oq4.k((Object) null);
            throw th;
        }
    }

    public Bundle R(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.z;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }

    public void S(gu3 gu3, yr3 yr3, Enum enumR) {
        yr3.getClass();
        enumR.getClass();
        qp4 qp4 = (qp4) this.x;
        sg2 sg2 = (sg2) ((ArrayList) this.A).get(enumR.ordinal());
        int intValue = ((Number) qp4.get(gu3)).intValue();
        int i = sg2.a;
        qp4.E(gu3, Integer.valueOf((intValue & (~(((1 << sg2.b) - 1) << i))) + (sg2.c << i)));
    }

    public void T(v27 v27) {
        v27.getClass();
        e66 e66 = new e66(1, this, v27);
        synchronized (this.z) {
            Runnable runnable = (Runnable) ((LinkedHashMap) this.A).put(v27, e66);
        }
        ((Handler) ((ns8) this.x).x).postDelayed(e66, 5400000);
    }

    public Object U(String str, byte[] bArr, vr2 vr2, h61 h61) {
        if (bArr.length != 0) {
            ju7 ju7 = new ju7(h49.c(bArr), (long) bArr.length);
            i53 i53 = i53.c;
            return V(i53, ((String) this.x) + '/' + str, ju7, vr2, h61);
        }
        h.q("The data to upload should not be empty");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0096, code lost:
        if (r0 != r10) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    public Object V(i53 i53, String str, ju7 ju7, vr2 vr2, h61 h61) {
        qc0 qc0;
        int i;
        String str2;
        String content;
        String content2;
        h61 h612 = h61;
        if (h612 instanceof qc0) {
            qc0 = (qc0) h612;
            int i2 = qc0.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qc0.C = i2 - Integer.MIN_VALUE;
                qc0 qc02 = qc0;
                Object obj = qc02.A;
                i = qc02.C;
                p81 p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    String c1 = d57.c1(str, ((String) this.x).concat("/"), str);
                    int K0 = d57.K0(0, 6, c1, "?");
                    if (K0 != -1) {
                        c1 = c1.substring(0, K0);
                    }
                    String str3 = c1;
                    ku7 ku7 = new ku7(((h47) this.y).d);
                    vr2.y(ku7);
                    qj qjVar = new qj(i53, this, str3, ju7, ku7);
                    qc02.z = str3;
                    qc02.C = 1;
                    obj = ((aw) this.A).a(str, qjVar, qc02);
                    if (obj != p81) {
                        str2 = str3;
                    }
                    return p81;
                } else if (i == 1) {
                    str2 = qc02.z;
                    o85.q(obj);
                } else if (i == 2) {
                    str2 = qc02.z;
                    o85.q(obj);
                    String str4 = (String) obj;
                    try {
                        km3 km3 = l18.a;
                        km3.getClass();
                        JsonObject jsonObject = (JsonObject) km3.b(JsonObject.Companion.serializer(), str4);
                        JsonElement jsonElement = (JsonElement) jsonObject.get((Object) "Key");
                        if (jsonElement == null || (content = em3.f(jsonElement).getContent()) == null) {
                            h.s("Expected a key in a upload response");
                            return null;
                        }
                        JsonElement jsonElement2 = (JsonElement) jsonObject.get((Object) "Id");
                        if (jsonElement2 != null && (content2 = em3.f(jsonElement2).getContent()) != null) {
                            return new od2(content2, str2, content);
                        }
                        h.s("Expected an id in a upload response");
                        return null;
                    } catch (MissingFieldException unused) {
                        String A2 = b26.a.b(JsonObject.class).A();
                        String s0 = k57.s0(str4, "\n", "");
                        throw new Exception("Couldn't decode payload as " + A2 + ". Input: " + s0);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qc02.z = str2;
                qc02.C = 2;
                obj = h49.q((yl1) obj, mo0.a, qc02);
            }
        }
        qc0 = new qc0(this, h612);
        qc0 qc022 = qc0;
        Object obj2 = qc022.A;
        i = qc022.C;
        p81 p812 = p81.w;
        if (i != 0) {
        }
        qc022.z = str2;
        qc022.C = 2;
        obj2 = h49.q((yl1) obj2, mo0.a, qc022);
    }

    public cw0 W(int i, gq0 gq0, k06 k06) {
        li4 li4 = new li4(((li4) this.x).a + '@' + i);
        qc3 qc3 = (qc3) this.A;
        HashMap hashMap = (HashMap) qc3.y;
        List list = (List) hashMap.get(li4);
        if (list == null) {
            list = new ArrayList();
            hashMap.put(li4, list);
        }
        return ((kd6) qc3.x).h0(gq0, k06, list);
    }

    public ov3 a(gq0 gq0) {
        ArrayList arrayList = new ArrayList();
        return new am6(((kd6) this.y).g0(gq0, sy6.j, arrayList), this, arrayList);
    }

    public void b(Object obj) {
        ArrayList arrayList = (ArrayList) this.x;
        uq4 uq4 = (uq4) this.z;
        Object l = g22.l((tl4) ((kd6) this.y).z, obj);
        if (l == null) {
            l = new a72("Unsupported annotation argument: " + uq4);
        }
        arrayList.add(l);
    }

    public void c() {
        switch (this.w) {
            case 2:
                ArrayList arrayList = (ArrayList) this.y;
                if (!arrayList.isEmpty()) {
                    ((HashMap) ((qc3) this.z).y).put((li4) this.x, arrayList);
                    return;
                }
                return;
            case 3:
                ((cw0) this.y).c();
                ((ArrayList) ((am6) this.z).x).add(new pm((fm) dt0.Q0((ArrayList) this.A)));
                return;
            default:
                cw0 cw0 = (cw0) this.A;
                uq4 uq4 = (uq4) this.z;
                ArrayList arrayList2 = (ArrayList) this.x;
                arrayList2.getClass();
                h28 q = rj1.q(uq4, (ql4) cw0.z);
                if (q != null) {
                    List j = rd3.j(arrayList2);
                    vw3 b = q.b();
                    b.getClass();
                    ((HashMap) cw0.w).put(uq4, new lq7(j, b));
                    return;
                } else if (((kd6) cw0.y).d0((gq0) cw0.A) && sg3.e(uq4.b(), "value")) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof pm) {
                            arrayList3.add(next);
                        }
                    }
                    List list = (List) cw0.B;
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        list.add((fm) ((pm) it2.next()).a);
                    }
                    return;
                } else {
                    return;
                }
        }
    }

    public void cancel() {
        ((Socket) this.x).close();
    }

    public void d(gq0 gq0, uq4 uq4) {
        ((ArrayList) this.x).add(new b62(gq0, uq4));
    }

    public oy6 e() {
        return (kn1) this.z;
    }

    public ov3 f(gq0 gq0, k06 k06) {
        return ((kd6) ((qc3) this.z).x).h0(gq0, k06, (ArrayList) this.y);
    }

    public void g(jq0 jq0) {
        ((ArrayList) this.x).add(new e21(new qq3(jq0)));
    }

    public tu6 h() {
        return (jn1) this.A;
    }

    public void i(uq4 uq4, Object obj) {
        ((cw0) this.x).i(uq4, obj);
    }

    public void j(bq2 bq2) {
        if (!((ArrayList) this.x).contains(bq2)) {
            synchronized (((ArrayList) this.x)) {
                ((ArrayList) this.x).add(bq2);
            }
            bq2.G = true;
            return;
        }
        ku4.t("Fragment already added: ", bq2);
    }

    public void k(String str, String str2) {
        String str3;
        if (((String) this.A).length() == 0) {
            str3 = "?";
        } else {
            str3 = "&";
        }
        this.A = ((String) this.A) + str3 + str + '=' + str2;
    }

    public void l(uq4 uq4, jq0 jq0) {
        ((cw0) this.x).l(uq4, jq0);
    }

    public pv3 m(uq4 uq4) {
        return ((cw0) this.x).m(uq4);
    }

    public void n(v27 v27) {
        Runnable runnable;
        v27.getClass();
        synchronized (this.z) {
            runnable = (Runnable) ((LinkedHashMap) this.A).remove(v27);
        }
        if (runnable != null) {
            ((Handler) ((ns8) this.x).x).removeCallbacks(runnable);
        }
    }

    public void o(uq4 uq4, gq0 gq0, uq4 uq42) {
        ((cw0) this.x).o(uq4, gq0, uq42);
    }

    public ov3 p(gq0 gq0, uq4 uq4) {
        return ((cw0) this.x).p(gq0, uq4);
    }

    public Object q(String[] strArr, a97 a97) {
        List<String> p1 = qs.p1(strArr);
        aw awVar = (aw) this.A;
        String str = (String) this.x;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (String b : p1) {
            JsonPrimitive b2 = em3.b(b);
            b2.getClass();
            arrayList.add(b2);
        }
        JsonElement jsonElement = (JsonElement) linkedHashMap.put("prefixes", new JsonArray(arrayList));
        Object a = awVar.a(str, new jv(l51.c, new JsonObject(linkedHashMap), 3), a97);
        vs7 vs7 = vs7.a;
        p81 p81 = p81.w;
        if (a != p81) {
            a = vs7;
        }
        if (a == p81) {
            return a;
        }
        return vs7;
    }

    public void r(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                ArrayList arrayList2 = (ArrayList) ((zt6) this.y).get(obj);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        r(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(obj);
                arrayList.add(obj);
                return;
            }
            rf2.r("This graph contains cyclic dependencies");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r0 == r1) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0071, code lost:
        if (r0 == r1) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    public Object s(long j, long j2, h61 h61) {
        ux4 ux4;
        int i;
        long j3;
        zx4 zx4;
        if (h61 instanceof ux4) {
            ux4 = (ux4) h61;
            int i2 = ux4.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ux4.B = i2 - Integer.MIN_VALUE;
                ux4 ux42 = ux4;
                Object obj = ux42.z;
                i = ux42.B;
                zx4 zx42 = null;
                if (i != 0) {
                    o85.q(obj);
                    zx4 zx43 = (zx4) this.x;
                    if (zx43 != null) {
                        zx4 = zx43.W0();
                    } else {
                        zx4 = null;
                    }
                    j3 = 0;
                    p81 p81 = p81.w;
                    if (zx4 == null) {
                        zx4 zx44 = (zx4) this.y;
                        if (zx44 != null) {
                            ux42.B = 1;
                            obj = zx44.A(j, j2, ux42);
                        }
                        return new x38(j3);
                    }
                    zx4 zx45 = (zx4) this.x;
                    if (zx45 != null) {
                        zx42 = zx45.W0();
                    }
                    zx4 zx46 = zx42;
                    if (zx46 != null) {
                        ux42.B = 2;
                        obj = zx46.A(j, j2, ux42);
                    }
                    return new x38(j3);
                    return p81;
                } else if (i == 1) {
                    o85.q(obj);
                } else if (i == 2) {
                    o85.q(obj);
                    j3 = ((x38) obj).a;
                    return new x38(j3);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j3 = ((x38) obj).a;
                return new x38(j3);
            }
        }
        ux4 = new ux4(this, h61);
        ux4 ux422 = ux4;
        Object obj2 = ux422.z;
        i = ux422.B;
        zx4 zx422 = null;
        if (i != 0) {
        }
        j3 = ((x38) obj2).a;
        return new x38(j3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public Object t(long j, h61 h61) {
        vx4 vx4;
        int i;
        long j2;
        if (h61 instanceof vx4) {
            vx4 = (vx4) h61;
            int i2 = vx4.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vx4.B = i2 - Integer.MIN_VALUE;
                Object obj = vx4.z;
                i = vx4.B;
                zx4 zx4 = null;
                if (i != 0) {
                    o85.q(obj);
                    zx4 zx42 = (zx4) this.x;
                    if (zx42 != null) {
                        zx4 = zx42.W0();
                    }
                    if (zx4 != null) {
                        vx4.B = 1;
                        obj = zx4.u0(j, vx4);
                        p81 p81 = p81.w;
                        if (obj == p81) {
                            return p81;
                        }
                    } else {
                        j2 = 0;
                        return new x38(j2);
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = ((x38) obj).a;
                return new x38(j2);
            }
        }
        vx4 = new vx4(this, h61);
        Object obj2 = vx4.z;
        i = vx4.B;
        zx4 zx43 = null;
        if (i != 0) {
        }
        j2 = ((x38) obj2).a;
        return new x38(j2);
    }

    public String toString() {
        switch (this.w) {
            case 8:
                String socket = ((Socket) this.x).toString();
                socket.getClass();
                return socket;
            default:
                return super.toString();
        }
    }

    public xp0 u(gq0 gq0) {
        gq0.getClass();
        tr5 tr5 = (tr5) ((LinkedHashMap) this.A).get(gq0);
        if (tr5 == null) {
            return null;
        }
        return new xp0((wq4) this.x, tr5, (nd0) this.y, (sy6) ((e18) this.z).y(gq0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r7 == r2) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        if (r7 == r2) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    public Object v(h61 h61) {
        se1 se1;
        int i;
        de1 de1;
        jf1 jf1 = (jf1) this.A;
        if (h61 instanceof se1) {
            se1 = (se1) h61;
            int i2 = se1.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                se1.B = i2 - Integer.MIN_VALUE;
                Object obj = se1.z;
                i = se1.B;
                if (i != 0) {
                    o85.q(obj);
                    List list = (List) this.z;
                    p81 p81 = p81.w;
                    if (list == null || list.isEmpty()) {
                        se1.B = 1;
                        obj = jf1.h(jf1, false, se1);
                    } else {
                        cf3 i3 = jf1.i();
                        ve1 ve1 = new ve1(jf1, this, (f61) null);
                        se1.B = 2;
                        obj = i3.c(ve1, se1);
                    }
                    return p81;
                } else if (i == 1) {
                    o85.q(obj);
                    de1 = (de1) obj;
                    jf1.h.G(de1);
                    return vs7.a;
                } else if (i == 2) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                de1 = (de1) obj;
                jf1.h.G(de1);
                return vs7.a;
            }
        }
        se1 = new se1(this, h61);
        Object obj2 = se1.z;
        i = se1.B;
        if (i != 0) {
        }
        de1 = (de1) obj2;
        jf1.h.G(de1);
        return vs7.a;
    }

    public synchronized ExecutorService x() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.x) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                this.x = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, new eg8(fg8.b + " Dispatcher", false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.x;
            threadPoolExecutor.getClass();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return threadPoolExecutor;
    }

    public bq2 y(String str) {
        wq2 wq2 = (wq2) ((HashMap) this.y).get(str);
        if (wq2 != null) {
            return wq2.c;
        }
        return null;
    }

    public ax5 z(String str) {
        Iterator it = ((ArrayDeque) this.y).iterator();
        it.getClass();
        while (it.hasNext()) {
            ax5 ax5 = (ax5) it.next();
            if (sg3.e(((g73) ax5.y.x.x).d, str)) {
                return ax5;
            }
        }
        Iterator it2 = ((ArrayDeque) this.A).iterator();
        it2.getClass();
        while (it2.hasNext()) {
            ax5 ax52 = (ax5) it2.next();
            if (sg3.e(((g73) ax52.y.x.x).d, str)) {
                return ax52;
            }
        }
        return null;
    }

    public /* synthetic */ am6(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
        this.A = obj4;
    }

    public am6(ns8 ns8, k68 k68) {
        this.w = 27;
        ns8.getClass();
        this.x = ns8;
        this.y = k68;
        this.z = new Object();
        this.A = new LinkedHashMap();
    }

    public am6(qp4 qp4, vg2 vg2, u52 u52, ArrayList arrayList) {
        this.w = 12;
        vg2.getClass();
        u52.getClass();
        this.x = qp4;
        this.y = vg2;
        this.z = u52;
        this.A = arrayList;
    }

    public am6(kb4 kb4, sl4 sl4) {
        this.w = 19;
        sl4.getClass();
        this.x = kb4;
        this.y = sl4;
        this.z = kb4.b(new p05(this, 0));
        this.A = kb4.b(new p05(this, 1));
    }

    public am6(os5 os5, wq4 wq4, nd0 nd0, e18 e18) {
        this.w = 21;
        this.x = wq4;
        this.y = nd0;
        this.z = e18;
        List list = os5.C;
        list.getClass();
        int F = tf4.F(et0.e0(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(F < 16 ? 16 : F);
        for (Object next : list) {
            linkedHashMap.put(t49.J((wq4) this.x, ((tr5) next).A), next);
        }
        this.A = linkedHashMap;
    }

    public am6(o81 o81, gg0 gg0, xw0 xw0, n0 n0Var) {
        this.w = 25;
        this.x = o81;
        this.y = n0Var;
        this.z = rj1.c(Integer.MAX_VALUE, 6, (vc0) null);
        this.A = new wv2(5);
        el3 el3 = (el3) o81.k().a0(me6.E);
        if (el3 != null) {
            el3.v(new g5((Object) gg0, (Object) this, (Object) xw0, 28));
        }
    }

    public am6(Socket socket) {
        this.w = 8;
        this.x = socket;
        this.y = new AtomicInteger();
        this.z = new kn1(this);
        this.A = new jn1(this);
    }

    public am6(zr3 zr3) {
        this.w = 23;
        this.z = "";
        this.A = "";
        this.y = zr3;
        this.x = zr3.getDescriptor().a();
    }

    public am6(String str, h47 h47, aw awVar, n63 n63) {
        this.w = 5;
        h47.getClass();
        this.x = str;
        this.y = h47;
        cz2.a.getClass();
        this.z = az2.b;
        this.A = awVar.e(new gg0(11, (Object) this));
        j77 j77 = h47.b;
        ((m77) j77).h.getClass();
        a35.k(j77).a("upload/resumable");
        b47 b47 = a35.k(j77).c.v;
        j77.getClass();
    }

    public am6(vg2 vg2) {
        this.w = 1;
        this.w = 1;
        this.x = vg2;
        this.y = C;
        this.z = new int[32];
    }

    public /* synthetic */ am6(int i, boolean z2) {
        this.w = i;
    }

    public am6(Typeface typeface, pk4 pk4) {
        int i;
        int i2;
        int i3;
        int i4;
        this.w = 17;
        this.A = typeface;
        this.x = pk4;
        this.z = new qk4(1024);
        int a = pk4.a(6);
        if (a != 0) {
            int i5 = a + pk4.w;
            i = ((ByteBuffer) pk4.z).getInt(((ByteBuffer) pk4.z).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.y = new char[(i * 2)];
        int a2 = pk4.a(6);
        if (a2 != 0) {
            int i6 = a2 + pk4.w;
            i2 = ((ByteBuffer) pk4.z).getInt(((ByteBuffer) pk4.z).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            tq7 tq7 = new tq7(this, i7);
            ok4 b = tq7.b();
            int a3 = b.a(4);
            Character.toChars(a3 != 0 ? ((ByteBuffer) b.z).getInt(a3 + b.w) : 0, (char[]) this.y, i7 * 2);
            ok4 b2 = tq7.b();
            int a4 = b2.a(16);
            if (a4 != 0) {
                int i8 = a4 + b2.w;
                i3 = ((ByteBuffer) b2.z).getInt(((ByteBuffer) b2.z).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            k75.g("invalid metadata codepoint length", i3 > 0);
            qk4 qk4 = (qk4) this.z;
            ok4 b3 = tq7.b();
            int a5 = b3.a(16);
            if (a5 != 0) {
                int i9 = a5 + b3.w;
                i4 = ((ByteBuffer) b3.z).getInt(((ByteBuffer) b3.z).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            qk4.a(tq7, 0, i4 - 1);
        }
    }

    public am6(qc3 qc3, li4 li4) {
        this.w = 2;
        this.A = qc3;
        this.w = 2;
        this.z = qc3;
        this.x = li4;
        this.y = new ArrayList();
    }

    public am6(pj3 pj3, up7 up7, nz3 nz3) {
        this.w = 16;
        up7.getClass();
        this.x = pj3;
        this.y = up7;
        this.z = nz3;
        this.A = new wr0(this, up7);
    }

    public am6(int i) {
        this.w = i;
        switch (i) {
            case 10:
                this.x = new ml5(10);
                this.y = new zt6(0);
                this.z = new ArrayList();
                this.A = new HashSet();
                return;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                this.A = new ArrayDeque();
                this.y = new ArrayDeque();
                this.z = new ArrayDeque();
                return;
            case 14:
                this.x = new ArrayList();
                this.y = new HashMap();
                this.z = new HashMap();
                return;
            case 18:
                this.z = new kh(11, this);
                return;
            case 28:
                this.x = new zt6(0);
                this.y = new SparseArray();
                this.z = new vc4((Object) null);
                this.A = new zt6(0);
                return;
            default:
                this.x = null;
                this.y = null;
                this.z = null;
                this.A = new ArrayDeque();
                return;
        }
    }

    public am6(Context context, ActionMode.Callback callback) {
        this.w = 26;
        this.y = context;
        this.x = callback;
        this.z = new ArrayList();
        this.A = new zt6(0);
    }

    public am6(kd6 kd6, uq4 uq4, cw0 cw0) {
        this.w = 4;
        this.y = kd6;
        this.z = uq4;
        this.A = cw0;
        this.x = new ArrayList();
    }

    public am6(cw0 cw0, am6 am6, ArrayList arrayList) {
        this.w = 3;
        this.y = cw0;
        this.z = am6;
        this.A = arrayList;
        this.x = cw0;
    }

    public am6(gt1 gt1) {
        this.w = 9;
        this.A = gt1;
        List list = gt1.A.P;
        list.getClass();
        int F = tf4.F(et0.e0(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(F < 16 ? 16 : F);
        for (Object next : list) {
            linkedHashMap.put(t49.P((vq4) gt1.H.b, ((es5) next).z), next);
        }
        this.x = linkedHashMap;
        gt1 gt12 = (gt1) this.A;
        this.y = ((ws1) gt12.H.a).a.c(new e3(7, (Object) this, (Object) gt12));
        kb4 kb4 = ((ws1) ((gt1) this.A).H.a).a;
        k3 k3Var = new k3(16, this);
        kb4.getClass();
        this.z = new hb4(kb4, k3Var);
    }

    public am6(jf1 jf1, List list) {
        this.w = 7;
        this.A = jf1;
        this.x = new qq4();
        this.y = ag8.b();
        this.z = dt0.b1(list);
    }
}
