package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.firebase.perf.metrics.Trace;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: uy5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uy5 implements ot0, t5, pl, y36, g94, mm8, x77 {
    public final /* synthetic */ int w;
    public Object x;

    public uy5(Context context) {
        boolean isEmpty;
        this.w = 5;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.x = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    synchronized (this) {
                        isEmpty = sharedPreferences.getAll().isEmpty();
                    }
                    if (!isEmpty) {
                        Log.i("FirebaseMessaging", "App restored, clearing state");
                        synchronized (this) {
                            sharedPreferences.edit().clear().commit();
                        }
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
                }
            }
        }
    }

    public boolean a(View view) {
        int i;
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.x;
        boolean z = false;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        if (view.getLayoutDirection() == 1) {
            z = true;
        }
        int i2 = swipeDismissBehavior.d;
        if ((i2 != 0 || !z) && (i2 != 1 || z)) {
            i = view.getWidth();
        } else {
            i = -view.getWidth();
        }
        WeakHashMap weakHashMap = e58.a;
        view.offsetLeftAndRight(i);
        view.setAlpha(0.0f);
        return true;
    }

    /* JADX INFO: finally extract failed */
    public void accept(Object obj, Object obj2) {
        xb7 xb7 = (xb7) obj2;
        switch (this.w) {
            case 12:
                kh8 kh8 = (kh8) ((kg8) obj).l();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(kh8.f);
                int i = tg8.a;
                obtain.writeInt(1);
                ((jg8) this.x).writeToParcel(obtain, 0);
                try {
                    kh8.e.transact(1, obtain, (Parcel) null, 1);
                    obtain.recycle();
                    xb7.b((Object) null);
                    return;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            default:
                d49 d49 = (d49) ((f49) obj).l();
                t39 t39 = new t39((b49) this.x, xb7);
                Parcel I = d49.I();
                ds8.c(I, t39);
                d49.J(I, 27);
                return;
        }
    }

    public yk7 b() {
        List unmodifiableList;
        vk7 L = yk7.L();
        L.m(((Trace) this.x).z);
        L.k(((Trace) this.x).G.w);
        Trace trace = (Trace) this.x;
        L.l(trace.G.c(trace.H));
        for (z81 z81 : ((Trace) this.x).A.values()) {
            L.j(z81.x.get(), z81.w);
        }
        ArrayList<Trace> arrayList = ((Trace) this.x).D;
        if (!arrayList.isEmpty()) {
            for (Trace uy5 : arrayList) {
                L.i(new uy5(7, (Object) uy5).b());
            }
        }
        Map<String, String> attributes = ((Trace) this.x).getAttributes();
        L.h();
        yk7.w((yk7) L.x).putAll(attributes);
        Trace trace2 = (Trace) this.x;
        synchronized (trace2.C) {
            try {
                ArrayList arrayList2 = new ArrayList();
                for (sf5 sf5 : trace2.C) {
                    if (sf5 != null) {
                        arrayList2.add(sf5);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList2);
            } finally {
                while (true) {
                }
            }
        }
        rf5[] b = sf5.b(unmodifiableList);
        if (b != null) {
            List asList = Arrays.asList(b);
            L.h();
            yk7.y((yk7) L.x, asList);
        }
        return (yk7) L.g();
    }

    public long c() {
        return ((o86) this.x).c;
    }

    public long d(long j) {
        md4 md4 = (md4) this.x;
        md4.getClass();
        if (x38.b(j) <= 0.0f || x38.c(j) <= 0.0f) {
            yb3.b("maximumVelocity should be a positive value. You specified=".concat(x38.g(j)));
        }
        return u55.b(((z38) md4.b).c(x38.b(j)), ((z38) md4.c).c(x38.c(j)));
    }

    public /* bridge */ /* synthetic */ void f(Object obj) {
        Void voidR = (Void) obj;
        SignInHubActivity signInHubActivity = (SignInHubActivity) this.x;
        signInHubActivity.setResult(signInHubActivity.Z, signInHubActivity.a0);
        signInHubActivity.finish();
    }

    public boolean g(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((mm8[]) this.x)[i].g(cls)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [b49, kw2] */
    public Object get() {
        switch (this.w) {
            case 18:
                Context context = (Context) ((kd6) this.x).x;
                Object obj = x49.j;
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                    applicationInfo.getClass();
                    return new xn5(applicationInfo);
                } catch (PackageManager.NameNotFoundException unused) {
                    return y.w;
                }
            case 19:
                Object obj2 = x49.j;
                return new a69(new kw2((Context) this.x, r39.a, ym.a, jw2.c));
            default:
                jm4 jm4 = (jm4) ((x77) this.x).get();
                jm4.getClass();
                ho7 ho7 = new ho7(fw8.c);
                return new hm4(ho7, jm4.x.schedule(ho7, 10000, TimeUnit.MILLISECONDS));
        }
    }

    public vm8 h(Class cls) {
        for (int i = 0; i < 2; i++) {
            mm8 mm8 = ((mm8[]) this.x)[i];
            if (mm8.g(cls)) {
                return mm8.h(cls);
            }
        }
        kj6.n("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    public ai8 i() {
        SignInHubActivity signInHubActivity = (SignInHubActivity) this.x;
        Set set = pg8.b;
        synchronized (set) {
        }
        return new ai8((Context) signInHubActivity, set);
    }

    public bo6 j(JSONObject jSONObject) {
        oo6 oo6;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", (Throwable) null);
            oo6 = new g22(26);
        } else {
            oo6 = new s63(9);
        }
        return oo6.h((n63) this.x, jSONObject);
    }

    public void k() {
        long j;
        o79 o79 = (o79) this.x;
        o79.b1();
        y19 y19 = (y19) o79.w;
        q09 q09 = y19.A;
        y19.e(q09);
        y19.G.getClass();
        if (q09.l1(System.currentTimeMillis())) {
            q09 q092 = y19.A;
            y19.e(q092);
            q092.H.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                pz8 pz8 = y19.B;
                y19.g(pz8);
                pz8.J.a("Detected application was in foreground");
                long currentTimeMillis = System.currentTimeMillis();
                if (y19.z.n1((String) null, by8.e1)) {
                    j = SystemClock.elapsedRealtime();
                } else {
                    j = 0;
                }
                m(currentTimeMillis, j);
            }
        }
    }

    public void l(long j, long j2) {
        o79 o79 = (o79) this.x;
        o79.b1();
        o79.g1();
        y19 y19 = (y19) o79.w;
        q09 q09 = y19.A;
        y19.e(q09);
        if (q09.l1(j)) {
            y19.e(q09);
            q09.H.b(true);
            y19.l().h1();
        }
        y19.e(q09);
        q09.L.b(j);
        if (q09.H.a()) {
            m(j, j2);
        }
    }

    public void m(long j, long j2) {
        o79 o79 = (o79) this.x;
        o79.b1();
        y19 y19 = (y19) o79.w;
        if (y19.a()) {
            q09 q09 = y19.A;
            y19.e(q09);
            q09.L.b(j);
            y19.G.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.J.b("Session started, time", Long.valueOf(elapsedRealtime));
            long j3 = j / 1000;
            Long valueOf = Long.valueOf(j3);
            v49 v49 = y19.I;
            y19.f(v49);
            v49.n1(j, valueOf, "auto", "_sid");
            y19.e(q09);
            q09.M.b(j3);
            q09.H.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j3);
            y19.f(v49);
            v49.k1(j, j2, bundle, "auto", "_s");
            String j4 = q09.R.j();
            if (!TextUtils.isEmpty(j4)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", j4);
                y19.f(v49);
                v49.k1(j, j2, bundle2, "auto", "_ssr");
            }
        }
    }

    public void e() {
    }

    public ih2 get(int i) {
        return ((qh2[]) this.x)[i];
    }

    public uy5(t39 t39, byte[] bArr) {
        this.w = 16;
        this.x = bArr;
    }

    public uy5(oe6 oe6) {
        this.w = 10;
        this.x = new WeakReference(oe6);
    }

    public uy5(int i) {
        this.w = i;
        switch (i) {
            case h75.g:
                return;
            default:
                this.x = new md4();
                return;
        }
    }

    public /* synthetic */ uy5(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public uy5(long[] jArr) {
        cp4 cp4;
        this.w = 3;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            cp4 = new cp4(copyOf.length);
            int i = cp4.b;
            if (i < 0) {
                h.l("");
                throw null;
            } else if (copyOf.length != 0) {
                int length = copyOf.length + i;
                long[] jArr2 = cp4.a;
                if (jArr2.length < length) {
                    cp4.a = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                }
                long[] jArr3 = cp4.a;
                int i2 = cp4.b;
                if (i != i2) {
                    qs.L0(jArr3, jArr3, copyOf.length + i, i, i2);
                }
                qs.L0(copyOf, jArr3, i, 0, copyOf.length);
                cp4.b += copyOf.length;
            }
        } else {
            new cp4
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0050: CONSTRUCTOR  (r1v1 ? I:cp4) =  call: cp4.<init>():void type: CONSTRUCTOR in method: uy5.<init>(long[]):void, dex: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v1 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                this = this;
                r0 = 3
                r6.w = r0
                r6.<init>()
                if (r7 == 0) goto L_0x004e
                int r1 = r7.length
                long[] r7 = java.util.Arrays.copyOf(r7, r1)
                cp4 r1 = new cp4
                int r2 = r7.length
                r1.<init>(r2)
                int r2 = r1.b
                if (r2 < 0) goto L_0x0047
                int r3 = r7.length
                if (r3 != 0) goto L_0x001b
                goto L_0x0053
            L_0x001b:
                int r3 = r7.length
                int r3 = r3 + r2
                long[] r4 = r1.a
                int r5 = r4.length
                if (r5 >= r3) goto L_0x0030
                int r5 = r4.length
                int r5 = r5 * r0
                int r5 = r5 / 2
                int r0 = java.lang.Math.max(r3, r5)
                long[] r0 = java.util.Arrays.copyOf(r4, r0)
                r1.a = r0
            L_0x0030:
                long[] r0 = r1.a
                int r3 = r1.b
                if (r2 == r3) goto L_0x003b
                int r4 = r7.length
                int r4 = r4 + r2
                defpackage.qs.L0(r0, r0, r4, r2, r3)
            L_0x003b:
                int r3 = r7.length
                r4 = 0
                defpackage.qs.L0(r7, r0, r2, r4, r3)
                int r0 = r1.b
                int r7 = r7.length
                int r0 = r0 + r7
                r1.b = r0
                goto L_0x0053
            L_0x0047:
                java.lang.String r6 = ""
                defpackage.h.l(r6)
                r6 = 0
                throw r6
            L_0x004e:
                cp4 r1 = new cp4
                r1.<init>()
            L_0x0053:
                r6.x = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.uy5.<init>(long[]):void");
        }

        public uy5(float f, float f2, ol olVar) {
            this.w = 8;
            int b = olVar.b();
            qh2[] qh2Arr = new qh2[b];
            for (int i = 0; i < b; i++) {
                qh2Arr[i] = new qh2(f, f2, olVar.a(i));
            }
            this.x = qh2Arr;
        }
    }
