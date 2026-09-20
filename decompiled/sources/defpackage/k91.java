package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* renamed from: k91  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k91 {
    public static final g91 r = new g91(1);
    public static final Charset s = Charset.forName("UTF-8");
    public final Context a;
    public final ge1 b;
    public final jz0 c;
    public final cw0 d;
    public final wr0 e;
    public final f83 f;
    public final md2 g;
    public final wz0 h;
    public final qc3 i;
    public final q91 j;
    public final ec k;
    public final h91 l;
    public final kd6 m;
    public xa1 n;
    public final xb7 o = new xb7();
    public final xb7 p = new xb7();
    public final xb7 q = new xb7();

    public k91(Context context, f83 f83, ge1 ge1, md2 md2, jz0 jz0, wz0 wz0, cw0 cw0, qc3 qc3, kd6 kd6, q91 q91, ec ecVar, h91 h91, wr0 wr0) {
        new AtomicBoolean(false);
        this.a = context;
        this.f = f83;
        this.b = ge1;
        this.g = md2;
        this.c = jz0;
        this.h = wz0;
        this.d = cw0;
        this.i = qc3;
        this.j = q91;
        this.k = ecVar;
        this.l = h91;
        this.m = kd6;
        this.e = wr0;
    }

    public static yb9 a(k91 k91) {
        yb9 yb9;
        k91.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : md2.f(((File) k91.g.d).listFiles(r))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", (Throwable) null);
                    yb9 = b35.l((Object) null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", (Throwable) null);
                    }
                    yb9 = b35.d(new ScheduledThreadPoolExecutor(1), new j91(k91, parseLong));
                }
                arrayList.add(yb9);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), (Throwable) null);
            }
            file.delete();
        }
        return b35.A(arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v65, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARNING: type inference failed for: r11v23 */
    /* JADX WARNING: type inference failed for: r11v24 */
    /* JADX WARNING: type inference failed for: r11v28, types: [ez, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v29, types: [qz, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v5, types: [ez, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v59, types: [a00, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v36 */
    /* JADX WARNING: type inference failed for: r11v37 */
    /* JADX WARNING: type inference failed for: r11v38 */
    /* JADX WARNING: type inference failed for: r11v39 */
    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:579)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:485)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:205)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:363)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:322)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
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
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x046a  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x04a6  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x04b2 A[LOOP:3: B:140:0x04b2->B:145:0x04cf, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x04e9  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x073d  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x016c A[EDGE_INSN: B:273:0x016c->B:47:0x016c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:298:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01d9  */
    public final void b(boolean r33, defpackage.z00 r34, boolean r35) {
        /*
            r32 = this;
            r1 = r32
            r2 = r33
            q91 r3 = r1.j
            java.lang.String r4 = "FirebaseCrashlytics"
            defpackage.wr0.p()
            java.util.ArrayList r5 = new java.util.ArrayList
            kd6 r6 = r1.m
            java.lang.Object r0 = r6.y
            wa1 r0 = (defpackage.wa1) r0
            java.util.NavigableSet r0 = r0.c()
            r5.<init>(r0)
            int r0 = r5.size()
            r7 = 2
            r8 = 0
            if (r0 > r2) goto L_0x002e
            java.lang.String r0 = "No open sessions to be closed."
            boolean r1 = android.util.Log.isLoggable(r4, r7)
            if (r1 == 0) goto L_0x0755
            android.util.Log.v(r4, r0, r8)
            return
        L_0x002e:
            java.lang.Object r0 = r5.get(r2)
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            r13 = 1
            r14 = 0
            if (r35 == 0) goto L_0x03d5
            bo6 r0 = r34.d()
            yn6 r0 = r0.b
            boolean r0 = r0.b
            if (r0 == 0) goto L_0x03d5
            md2 r0 = r1.g
            int r15 = android.os.Build.VERSION.SDK_INT
            r16 = 4
            r12 = 30
            if (r15 < r12) goto L_0x03bc
            android.content.Context r12 = r1.a
            java.lang.String r15 = "activity"
            java.lang.Object r12 = r12.getSystemService(r15)
            android.app.ActivityManager r12 = (android.app.ActivityManager) r12
            java.util.List r12 = r12.getHistoricalProcessExitReasons((java.lang.String) null, 0, 0)
            int r15 = r12.size()
            if (r15 == 0) goto L_0x03a1
            qc3 r15 = new qc3
            r15.<init>((defpackage.md2) r0)
            r17 = 8
            tz2 r10 = defpackage.qc3.C
            r15.y = r10
            if (r9 != 0) goto L_0x006f
            goto L_0x007c
        L_0x006f:
            java.lang.String r10 = "userlog"
            java.io.File r10 = r0.c(r9, r10)
            hv5 r7 = new hv5
            r7.<init>(r10)
            r15.y = r7
        L_0x007c:
            wr0 r7 = r1.e
            fk4 r10 = new fk4
            r10.<init>(r0)
            cw0 r8 = new cw0
            r8.<init>((java.lang.String) r9, (defpackage.md2) r0, (defpackage.wr0) r7)
            java.lang.Object r7 = r8.z
            l90 r7 = (defpackage.l90) r7
            java.lang.Object r7 = r7.b
            java.util.concurrent.atomic.AtomicMarkableReference r7 = (java.util.concurrent.atomic.AtomicMarkableReference) r7
            java.lang.Object r7 = r7.getReference()
            jt3 r7 = (defpackage.jt3) r7
            java.util.Map r11 = r10.c(r9, r14)
            r7.c(r11)
            java.lang.Object r7 = r8.A
            l90 r7 = (defpackage.l90) r7
            java.lang.Object r7 = r7.b
            java.util.concurrent.atomic.AtomicMarkableReference r7 = (java.util.concurrent.atomic.AtomicMarkableReference) r7
            java.lang.Object r7 = r7.getReference()
            jt3 r7 = (defpackage.jt3) r7
            java.util.Map r11 = r10.c(r9, r13)
            r7.c(r11)
            java.lang.Object r7 = r8.C
            java.util.concurrent.atomic.AtomicMarkableReference r7 = (java.util.concurrent.atomic.AtomicMarkableReference) r7
            java.lang.String r10 = r10.d(r9)
            r7.set(r10, r14)
            java.lang.Object r7 = r8.B
            v86 r7 = (defpackage.v86) r7
            java.lang.String r10 = "Failed to close rollouts state file."
            java.lang.String r11 = "Loaded rollouts state:\n"
            r20 = r13
            java.lang.String r13 = "rollouts-state"
            java.io.File r13 = r0.c(r9, r13)
            boolean r0 = r13.exists()
            if (r0 == 0) goto L_0x012b
            long r21 = r13.length()
            r23 = 0
            int r0 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r0 != 0) goto L_0x00de
            goto L_0x012b
        L_0x00de:
            java.io.FileInputStream r14 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0117, all -> 0x0114 }
            r14.<init>(r13)     // Catch:{ Exception -> 0x0117, all -> 0x0114 }
            java.lang.String r0 = defpackage.su0.P(r14)     // Catch:{ Exception -> 0x0112 }
            java.util.ArrayList r0 = defpackage.fk4.b(r0)     // Catch:{ Exception -> 0x0112 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0112 }
            r2.<init>(r11)     // Catch:{ Exception -> 0x0112 }
            r2.append(r0)     // Catch:{ Exception -> 0x0112 }
            java.lang.String r11 = "\nfor session "
            r2.append(r11)     // Catch:{ Exception -> 0x0112 }
            r2.append(r9)     // Catch:{ Exception -> 0x0112 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0112 }
            r11 = 3
            boolean r22 = android.util.Log.isLoggable(r4, r11)     // Catch:{ Exception -> 0x0112 }
            if (r22 == 0) goto L_0x010a
            r11 = 0
            android.util.Log.d(r4, r2, r11)     // Catch:{ Exception -> 0x0112 }
        L_0x010a:
            defpackage.su0.h(r14, r10)
            goto L_0x013e
        L_0x010e:
            r8 = r14
            goto L_0x0127
        L_0x0110:
            r0 = move-exception
            goto L_0x010e
        L_0x0112:
            r0 = move-exception
            goto L_0x0119
        L_0x0114:
            r0 = move-exception
            r8 = 0
            goto L_0x0127
        L_0x0117:
            r0 = move-exception
            r14 = 0
        L_0x0119:
            java.lang.String r2 = "Error deserializing rollouts state."
            android.util.Log.w(r4, r2, r0)     // Catch:{ all -> 0x0110 }
            defpackage.fk4.f(r13)     // Catch:{ all -> 0x0110 }
            defpackage.su0.h(r14, r10)
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            goto L_0x013e
        L_0x0127:
            defpackage.su0.h(r8, r10)
            throw r0
        L_0x012b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "The file has a length of zero for session: "
            r0.<init>(r2)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            defpackage.fk4.g(r13, r0)
            java.util.List r0 = java.util.Collections.EMPTY_LIST
        L_0x013e:
            r7.b(r0)
            java.lang.Object r0 = r6.y
            r2 = r0
            wa1 r2 = (defpackage.wa1) r2
            md2 r0 = r2.b
            java.lang.String r7 = "start-time"
            java.io.File r0 = r0.c(r9, r7)
            long r10 = r0.lastModified()
            java.util.Iterator r0 = r12.iterator()
        L_0x0156:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x016c
            java.lang.Object r7 = r0.next()
            android.app.ApplicationExitInfo r7 = defpackage.t4.f(r7)
            long r12 = r7.getTimestamp()
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x016e
        L_0x016c:
            r7 = 0
            goto L_0x0176
        L_0x016e:
            int r12 = r7.getReason()
            r13 = 6
            if (r12 == r13) goto L_0x0176
            goto L_0x0156
        L_0x0176:
            if (r7 != 0) goto L_0x0191
            java.lang.String r0 = "No relevant ApplicationExitInfo occurred during session: "
            java.lang.String r0 = defpackage.b81.y(r0, r9)
            r2 = 2
            boolean r7 = android.util.Log.isLoggable(r4, r2)
            if (r7 == 0) goto L_0x0189
            r11 = 0
            android.util.Log.v(r4, r0, r11)
        L_0x0189:
            r30 = r3
            r31 = r6
            r6 = r20
            goto L_0x038d
        L_0x0191:
            java.lang.Object r0 = r6.x
            r10 = r0
            sa1 r10 = (defpackage.sa1) r10
            java.io.InputStream r0 = r7.getTraceInputStream()     // Catch:{ IOException -> 0x01a1 }
            if (r0 == 0) goto L_0x01c0
            java.lang.String r0 = defpackage.kd6.G(r0)     // Catch:{ IOException -> 0x01a1 }
            goto L_0x01c1
        L_0x01a1:
            r0 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Could not get input trace in application exit info: "
            r11.<init>(r12)
            java.lang.String r12 = r7.toString()
            r11.append(r12)
            java.lang.String r12 = " Error: "
            r11.append(r12)
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            r11 = 0
            android.util.Log.w(r4, r0, r11)
        L_0x01c0:
            r0 = 0
        L_0x01c1:
            ez r11 = new ez
            r11.<init>()
            int r12 = r7.getImportance()
            r11.d = r12
            byte r12 = r11.j
            r12 = r12 | 4
            byte r12 = (byte) r12
            r11.j = r12
            java.lang.String r12 = r7.getProcessName()
            if (r12 == 0) goto L_0x039b
            r11.b = r12
            int r12 = r7.getReason()
            r11.c = r12
            byte r12 = r11.j
            r18 = 2
            r12 = r12 | 2
            byte r12 = (byte) r12
            r11.j = r12
            long r12 = r7.getTimestamp()
            r11.g = r12
            byte r12 = r11.j
            r12 = r12 | 32
            byte r12 = (byte) r12
            r11.j = r12
            int r12 = r7.getPid()
            r11.a = r12
            byte r12 = r11.j
            r12 = r12 | 1
            byte r12 = (byte) r12
            r11.j = r12
            long r12 = r7.getPss()
            r11.e = r12
            byte r12 = r11.j
            r12 = r12 | 8
            byte r12 = (byte) r12
            r11.j = r12
            long r12 = r7.getRss()
            r11.f = r12
            byte r7 = r11.j
            r7 = r7 | 16
            byte r7 = (byte) r7
            r11.j = r7
            r11.h = r0
            fz r0 = r11.a()
            android.content.Context r7 = r10.a
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.orientation
            qz r11 = new qz
            r11.<init>()
            java.lang.String r12 = "anr"
            r11.b = r12
            long r12 = r0.g
            r11.a = r12
            byte r14 = r11.g
            r14 = r14 | 1
            byte r14 = (byte) r14
            r11.g = r14
            wz0 r14 = r10.c
            r30 = r3
            z00 r3 = r10.e
            bo6 r3 = r3.d()
            yn6 r3 = r3.b
            boolean r3 = r3.c
            if (r3 == 0) goto L_0x02b7
            java.lang.Object r3 = r14.c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x02b7
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Object r14 = r14.c
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.util.Iterator r14 = r14.iterator()
        L_0x026b:
            boolean r22 = r14.hasNext()
            if (r22 == 0) goto L_0x02ae
            java.lang.Object r22 = r14.next()
            r29 = r7
            r7 = r22
            id0 r7 = (defpackage.id0) r7
            r34 = r14
            java.lang.String r14 = r7.a
            if (r14 == 0) goto L_0x02a8
            r31 = r6
            java.lang.String r6 = r7.b
            if (r6 == 0) goto L_0x02a2
            java.lang.String r7 = r7.c
            if (r7 == 0) goto L_0x029c
            gz r1 = new gz
            r1.<init>(r6, r14, r7)
            r3.add(r1)
            r1 = r32
            r14 = r34
            r7 = r29
            r6 = r31
            goto L_0x026b
        L_0x029c:
            java.lang.String r0 = "Null buildId"
            defpackage.ku4.j(r0)
            return
        L_0x02a2:
            java.lang.String r0 = "Null arch"
            defpackage.ku4.j(r0)
            return
        L_0x02a8:
            java.lang.String r0 = "Null libraryName"
            defpackage.ku4.j(r0)
            return
        L_0x02ae:
            r31 = r6
            r29 = r7
            java.util.List r1 = java.util.Collections.unmodifiableList(r3)
            goto L_0x02bc
        L_0x02b7:
            r31 = r6
            r29 = r7
            r1 = 0
        L_0x02bc:
            ez r3 = new ez
            r3.<init>()
            int r6 = r0.d
            r3.d = r6
            byte r6 = r3.j
            r6 = r6 | 4
            byte r6 = (byte) r6
            r3.j = r6
            java.lang.String r7 = r0.b
            if (r7 == 0) goto L_0x0395
            r3.b = r7
            int r7 = r0.c
            r3.c = r7
            r18 = 2
            r6 = r6 | 2
            byte r6 = (byte) r6
            r3.g = r12
            r6 = r6 | 32
            byte r6 = (byte) r6
            int r7 = r0.a
            r3.a = r7
            r6 = r6 | 1
            byte r6 = (byte) r6
            long r12 = r0.e
            r3.e = r12
            r6 = r6 | 8
            byte r6 = (byte) r6
            long r12 = r0.f
            r3.f = r12
            r6 = r6 | 16
            byte r6 = (byte) r6
            r3.j = r6
            java.lang.String r0 = r0.h
            r3.h = r0
            r3.i = r1
            fz r0 = r3.a()
            int r1 = r0.d
            r3 = 100
            if (r1 == r3) goto L_0x030a
            r3 = r20
            goto L_0x030b
        L_0x030a:
            r3 = 0
        L_0x030b:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r6 = r0.b
            int r7 = r0.a
            r6.getClass()
            a00 r12 = new a00
            r12.<init>()
            r12.a = r6
            r12.b = r7
            byte r6 = r12.e
            r6 = r6 | 1
            byte r6 = (byte) r6
            r12.c = r1
            r18 = 2
            r1 = r6 | 2
            byte r1 = (byte) r1
            r6 = 0
            r12.d = r6
            r1 = r1 | 4
            byte r1 = (byte) r1
            r12.e = r1
            b00 r1 = r12.a()
            wz r26 = defpackage.sa1.e()
            java.util.List r27 = r10.a()
            if (r27 == 0) goto L_0x038f
            tz r22 = new tz
            r23 = 0
            r24 = 0
            r25 = r0
            r22.<init>(r23, r24, r25, r26, r27)
            sz r0 = new sz
            r25 = 0
            r28 = 0
            r27 = r1
            r26 = r3
            r23 = r22
            r22 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            r1 = r22
            r0 = r29
            r11.c = r1
            d00 r0 = r10.b(r0)
            r11.d = r0
            rz r0 = r11.a()
            java.lang.String r1 = "Persisting anr for session "
            java.lang.String r1 = defpackage.b81.y(r1, r9)
            r11 = 3
            boolean r3 = android.util.Log.isLoggable(r4, r11)
            if (r3 == 0) goto L_0x037e
            r11 = 0
            android.util.Log.d(r4, r1, r11)
        L_0x037e:
            java.util.Map r1 = java.util.Collections.EMPTY_MAP
            rz r0 = defpackage.kd6.u(r0, r15, r8, r1)
            na1 r0 = defpackage.kd6.v(r0, r8)
            r6 = r20
            r2.d(r0, r9, r6)
        L_0x038d:
            r2 = 2
            goto L_0x03ba
        L_0x038f:
            java.lang.String r0 = "Null binaries"
            defpackage.ku4.j(r0)
            return
        L_0x0395:
            java.lang.String r0 = "Null processName"
            defpackage.ku4.j(r0)
            return
        L_0x039b:
            java.lang.String r0 = "Null processName"
            defpackage.ku4.j(r0)
            return
        L_0x03a1:
            r30 = r3
            r31 = r6
            r6 = r13
            r17 = 8
            java.lang.String r0 = "No ApplicationExitInfo available. Session: "
            java.lang.String r0 = defpackage.b81.y(r0, r9)
            r2 = 2
            boolean r1 = android.util.Log.isLoggable(r4, r2)
            if (r1 == 0) goto L_0x03ba
            r11 = 0
            android.util.Log.v(r4, r0, r11)
            goto L_0x03eb
        L_0x03ba:
            r11 = 0
            goto L_0x03eb
        L_0x03bc:
            r30 = r3
            r31 = r6
            r2 = r7
            r11 = r8
            r6 = r13
            r17 = 8
            java.lang.String r0 = "ANR feature enabled, but device is API "
            java.lang.String r0 = defpackage.hl6.k(r15, r0)
            boolean r1 = android.util.Log.isLoggable(r4, r2)
            if (r1 == 0) goto L_0x03eb
            android.util.Log.v(r4, r0, r11)
            goto L_0x03eb
        L_0x03d5:
            r30 = r3
            r31 = r6
            r2 = r7
            r11 = r8
            r6 = r13
            r16 = 4
            r17 = 8
            java.lang.String r0 = "ANR feature disabled."
            boolean r1 = android.util.Log.isLoggable(r4, r2)
            if (r1 == 0) goto L_0x03eb
            android.util.Log.v(r4, r0, r11)
        L_0x03eb:
            if (r35 == 0) goto L_0x0430
            boolean r0 = r30.c()
            if (r0 == 0) goto L_0x0430
            java.lang.String r0 = "Finalizing native report for session "
            java.lang.String r0 = defpackage.b81.y(r0, r9)
            boolean r1 = android.util.Log.isLoggable(r4, r2)
            if (r1 == 0) goto L_0x0402
            android.util.Log.v(r4, r0, r11)
        L_0x0402:
            hz2 r0 = r30.a()
            r0.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No minidump data found for session "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r4, r0, r11)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No Tombstones data found for session "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r4, r0, r11)
            java.lang.String r0 = "No native core present"
            android.util.Log.w(r4, r0, r11)
        L_0x0430:
            if (r33 == 0) goto L_0x043e
            r1 = 0
            java.lang.Object r0 = r5.get(r1)
            r19 = r0
            java.lang.String r19 = (java.lang.String) r19
            r0 = r19
            goto L_0x0447
        L_0x043e:
            r2 = r32
            r1 = 0
            h91 r0 = r2.l
            r0.a(r11)
            r0 = 0
        L_0x0447:
            long r2 = java.lang.System.currentTimeMillis()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r7
            r5 = r31
            java.lang.Object r5 = r5.y
            wa1 r5 = (defpackage.wa1) r5
            md2 r7 = r5.b
            java.lang.String r8 = ".com.google.firebase.crashlytics"
            r7.a(r8)
            java.lang.String r8 = ".com.google.firebase.crashlytics-ndk"
            r7.a(r8)
            java.lang.Object r8 = r7.b
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x04a0
            java.lang.String r8 = ".com.google.firebase.crashlytics.files.v1"
            r7.a(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = ".com.google.firebase.crashlytics.files.v2"
            r8.<init>(r9)
            java.lang.String r9 = java.io.File.pathSeparator
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object r9 = r7.c
            java.io.File r9 = (java.io.File) r9
            boolean r10 = r9.exists()
            if (r10 == 0) goto L_0x04a0
            ld2 r10 = new ld2
            r10.<init>(r8)
            java.lang.String[] r8 = r9.list(r10)
            if (r8 == 0) goto L_0x04a0
            int r9 = r8.length
            r10 = r1
        L_0x0496:
            if (r10 >= r9) goto L_0x04a0
            r11 = r8[r10]
            r7.a(r11)
            int r10 = r10 + 1
            goto L_0x0496
        L_0x04a0:
            java.util.NavigableSet r8 = r5.c()
            if (r0 == 0) goto L_0x04a9
            r8.remove(r0)
        L_0x04a9:
            int r0 = r8.size()
            r9 = r17
            if (r0 > r9) goto L_0x04b2
            goto L_0x04df
        L_0x04b2:
            int r0 = r8.size()
            if (r0 <= r9) goto L_0x04df
            java.lang.Object r0 = r8.last()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r10 = "Removing session over cap: "
            java.lang.String r10 = defpackage.b81.y(r10, r0)
            r11 = 3
            boolean r12 = android.util.Log.isLoggable(r4, r11)
            if (r12 == 0) goto L_0x04cf
            r11 = 0
            android.util.Log.d(r4, r10, r11)
        L_0x04cf:
            java.io.File r10 = new java.io.File
            java.lang.Object r11 = r7.e
            java.io.File r11 = (java.io.File) r11
            r10.<init>(r11, r0)
            defpackage.md2.e(r10)
            r8.remove(r0)
            goto L_0x04b2
        L_0x04df:
            java.util.Iterator r8 = r8.iterator()
        L_0x04e3:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0729
            java.lang.Object r0 = r8.next()
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r0 = "Finalizing report for session "
            java.lang.String r0 = defpackage.b81.y(r0, r9)
            r10 = 2
            boolean r11 = android.util.Log.isLoggable(r4, r10)
            if (r11 == 0) goto L_0x0501
            r11 = 0
            android.util.Log.v(r4, r0, r11)
        L_0x0501:
            va1 r10 = defpackage.wa1.g
            g91 r0 = defpackage.wa1.i
            java.io.File r11 = new java.io.File
            java.lang.Object r12 = r7.e
            java.io.File r12 = (java.io.File) r12
            r11.<init>(r12, r9)
            r11.mkdirs()
            java.io.File[] r0 = r11.listFiles(r0)
            java.util.List r0 = defpackage.md2.f(r0)
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L_0x0538
            java.lang.String r0 = "Session "
            java.lang.String r10 = " has no events."
            java.lang.String r0 = defpackage.f21.h(r0, r9, r10)
            r10 = 2
            boolean r11 = android.util.Log.isLoggable(r4, r10)
            if (r11 == 0) goto L_0x0532
            r11 = 0
            android.util.Log.v(r4, r0, r11)
        L_0x0532:
            r11 = 3
            r15 = 0
        L_0x0534:
            r18 = 2
            goto L_0x0714
        L_0x0538:
            java.util.Collections.sort(r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r12 = r0.iterator()
            r13 = r1
        L_0x0545:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x05b1
            java.lang.Object r0 = r12.next()
            r14 = r0
            java.io.File r14 = (java.io.File) r14
            java.lang.String r0 = defpackage.wa1.e(r14)     // Catch:{ IOException -> 0x0586 }
            r10.getClass()     // Catch:{ IOException -> 0x0586 }
            android.util.JsonReader r15 = new android.util.JsonReader     // Catch:{ IllegalStateException -> 0x058b }
            java.io.StringReader r1 = new java.io.StringReader     // Catch:{ IllegalStateException -> 0x058b }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x058b }
            r15.<init>(r1)     // Catch:{ IllegalStateException -> 0x058b }
            rz r0 = defpackage.va1.e(r15)     // Catch:{ all -> 0x058d }
            r15.close()     // Catch:{ IllegalStateException -> 0x058b }
            r11.add(r0)     // Catch:{ IOException -> 0x0586 }
            if (r13 != 0) goto L_0x0588
            java.lang.String r0 = r14.getName()     // Catch:{ IOException -> 0x0586 }
            java.lang.String r1 = "event"
            boolean r1 = r0.startsWith(r1)     // Catch:{ IOException -> 0x0586 }
            if (r1 == 0) goto L_0x0584
            java.lang.String r1 = "_"
            boolean r0 = r0.endsWith(r1)     // Catch:{ IOException -> 0x0586 }
            if (r0 == 0) goto L_0x0584
            goto L_0x0588
        L_0x0584:
            r0 = 0
            goto L_0x0589
        L_0x0586:
            r0 = move-exception
            goto L_0x059e
        L_0x0588:
            r0 = r6
        L_0x0589:
            r13 = r0
            goto L_0x05af
        L_0x058b:
            r0 = move-exception
            goto L_0x0598
        L_0x058d:
            r0 = move-exception
            r1 = r0
            r15.close()     // Catch:{ all -> 0x0593 }
            goto L_0x0597
        L_0x0593:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalStateException -> 0x058b }
        L_0x0597:
            throw r1     // Catch:{ IllegalStateException -> 0x058b }
        L_0x0598:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0586 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0586 }
            throw r1     // Catch:{ IOException -> 0x0586 }
        L_0x059e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r15 = "Could not add event to report for "
            r1.<init>(r15)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r4, r1, r0)
        L_0x05af:
            r1 = 0
            goto L_0x0545
        L_0x05b1:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x05cd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not parse event files for session "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            r11 = 0
            android.util.Log.w(r4, r0, r11)
            r15 = r11
            r11 = 3
            goto L_0x0534
        L_0x05cd:
            fk4 r0 = new fk4
            r0.<init>(r7)
            java.lang.String r0 = r0.d(r9)
            h91 r1 = r5.d
            wr0 r1 = r1.b
            monitor-enter(r1)
            java.lang.Object r12 = r1.y     // Catch:{ all -> 0x0726 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0726 }
            boolean r12 = java.util.Objects.equals(r12, r9)     // Catch:{ all -> 0x0726 }
            if (r12 == 0) goto L_0x05eb
            java.lang.Object r12 = r1.z     // Catch:{ all -> 0x0726 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0726 }
            monitor-exit(r1)
            goto L_0x0628
        L_0x05eb:
            java.lang.Object r12 = r1.x     // Catch:{ all -> 0x0726 }
            md2 r12 = (defpackage.md2) r12     // Catch:{ all -> 0x0726 }
            g91 r14 = defpackage.wr0.C     // Catch:{ all -> 0x0726 }
            java.io.File r15 = new java.io.File     // Catch:{ all -> 0x0726 }
            java.lang.Object r12 = r12.e     // Catch:{ all -> 0x0726 }
            java.io.File r12 = (java.io.File) r12     // Catch:{ all -> 0x0726 }
            r15.<init>(r12, r9)     // Catch:{ all -> 0x0726 }
            r15.mkdirs()     // Catch:{ all -> 0x0726 }
            java.io.File[] r12 = r15.listFiles(r14)     // Catch:{ all -> 0x0726 }
            java.util.List r12 = defpackage.md2.f(r12)     // Catch:{ all -> 0x0726 }
            boolean r14 = r12.isEmpty()     // Catch:{ all -> 0x0726 }
            if (r14 == 0) goto L_0x0615
            java.lang.String r12 = "Unable to read App Quality Sessions session id."
            java.lang.String r14 = "FirebaseCrashlytics"
            r15 = 0
            android.util.Log.w(r14, r12, r15)     // Catch:{ all -> 0x0726 }
            r12 = 0
            goto L_0x0627
        L_0x0615:
            wh r14 = defpackage.wr0.D     // Catch:{ all -> 0x0726 }
            java.lang.Object r12 = java.util.Collections.min(r12, r14)     // Catch:{ all -> 0x0726 }
            java.io.File r12 = (java.io.File) r12     // Catch:{ all -> 0x0726 }
            java.lang.String r12 = r12.getName()     // Catch:{ all -> 0x0726 }
            r14 = r16
            java.lang.String r12 = r12.substring(r14)     // Catch:{ all -> 0x0726 }
        L_0x0627:
            monitor-exit(r1)
        L_0x0628:
            java.lang.String r1 = "report"
            java.io.File r1 = r7.c(r9, r1)
            java.lang.String r14 = "appQualitySessionId: "
            java.lang.String r15 = defpackage.wa1.e(r1)     // Catch:{ IOException -> 0x06fe }
            r10.getClass()     // Catch:{ IOException -> 0x06fe }
            cz r10 = defpackage.va1.i(r15)     // Catch:{ IOException -> 0x06fe }
            bz r15 = r10.a()     // Catch:{ IOException -> 0x06fe }
            qa1 r10 = r10.k     // Catch:{ IOException -> 0x06fe }
            if (r10 == 0) goto L_0x066d
            kz r10 = r10.a()     // Catch:{ IOException -> 0x0668 }
            java.lang.Long r6 = java.lang.Long.valueOf(r2)     // Catch:{ IOException -> 0x0668 }
            r10.e = r6     // Catch:{ IOException -> 0x0668 }
            r10.f = r13     // Catch:{ IOException -> 0x0668 }
            byte r6 = r10.m     // Catch:{ IOException -> 0x0668 }
            r18 = 2
            r6 = r6 | 2
            byte r6 = (byte) r6
            r10.m = r6     // Catch:{ IOException -> 0x06f0 }
            if (r0 == 0) goto L_0x0661
            l00 r6 = new l00     // Catch:{ IOException -> 0x06f0 }
            r6.<init>(r0)     // Catch:{ IOException -> 0x06f0 }
            r10.h = r6     // Catch:{ IOException -> 0x06f0 }
        L_0x0661:
            lz r0 = r10.a()     // Catch:{ IOException -> 0x06f0 }
            r15.j = r0     // Catch:{ IOException -> 0x06f0 }
            goto L_0x066f
        L_0x0668:
            r0 = move-exception
            r18 = 2
            goto L_0x06f1
        L_0x066d:
            r18 = 2
        L_0x066f:
            cz r0 = r15.a()     // Catch:{ IOException -> 0x06f0 }
            bz r6 = r0.a()     // Catch:{ IOException -> 0x06f0 }
            r6.g = r12     // Catch:{ IOException -> 0x06f0 }
            qa1 r0 = r0.k     // Catch:{ IOException -> 0x06f0 }
            if (r0 == 0) goto L_0x0689
            kz r0 = r0.a()     // Catch:{ IOException -> 0x06f0 }
            r0.c = r12     // Catch:{ IOException -> 0x06f0 }
            lz r0 = r0.a()     // Catch:{ IOException -> 0x06f0 }
            r6.j = r0     // Catch:{ IOException -> 0x06f0 }
        L_0x0689:
            cz r0 = r6.a()     // Catch:{ IOException -> 0x06f0 }
            qa1 r6 = r0.k     // Catch:{ IOException -> 0x06f0 }
            if (r6 == 0) goto L_0x06f4
            bz r0 = r0.a()     // Catch:{ IOException -> 0x06f0 }
            kz r6 = r6.a()     // Catch:{ IOException -> 0x06f0 }
            r6.k = r11     // Catch:{ IOException -> 0x06f0 }
            lz r6 = r6.a()     // Catch:{ IOException -> 0x06f0 }
            r0.j = r6     // Catch:{ IOException -> 0x06f0 }
            cz r0 = r0.a()     // Catch:{ IOException -> 0x06f0 }
            qa1 r6 = r0.k     // Catch:{ IOException -> 0x06f0 }
            if (r6 != 0) goto L_0x06ac
            r11 = 3
            r15 = 0
            goto L_0x0714
        L_0x06ac:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x06f0 }
            r10.<init>(r14)     // Catch:{ IOException -> 0x06f0 }
            r10.append(r12)     // Catch:{ IOException -> 0x06f0 }
            java.lang.String r10 = r10.toString()     // Catch:{ IOException -> 0x06f0 }
            r11 = 3
            boolean r12 = android.util.Log.isLoggable(r4, r11)     // Catch:{ IOException -> 0x06ee }
            if (r12 == 0) goto L_0x06c4
            r15 = 0
            android.util.Log.d(r4, r10, r15)     // Catch:{ IOException -> 0x06ec }
            goto L_0x06c5
        L_0x06c4:
            r15 = 0
        L_0x06c5:
            if (r13 == 0) goto L_0x06d5
            lz r6 = (defpackage.lz) r6     // Catch:{ IOException -> 0x06ec }
            java.lang.String r6 = r6.b     // Catch:{ IOException -> 0x06ec }
            java.io.File r10 = new java.io.File     // Catch:{ IOException -> 0x06ec }
            java.lang.Object r12 = r7.g     // Catch:{ IOException -> 0x06ec }
            java.io.File r12 = (java.io.File) r12     // Catch:{ IOException -> 0x06ec }
            r10.<init>(r12, r6)     // Catch:{ IOException -> 0x06ec }
            goto L_0x06e2
        L_0x06d5:
            lz r6 = (defpackage.lz) r6     // Catch:{ IOException -> 0x06ec }
            java.lang.String r6 = r6.b     // Catch:{ IOException -> 0x06ec }
            java.io.File r10 = new java.io.File     // Catch:{ IOException -> 0x06ec }
            java.lang.Object r12 = r7.f     // Catch:{ IOException -> 0x06ec }
            java.io.File r12 = (java.io.File) r12     // Catch:{ IOException -> 0x06ec }
            r10.<init>(r12, r6)     // Catch:{ IOException -> 0x06ec }
        L_0x06e2:
            ji8 r6 = defpackage.va1.a     // Catch:{ IOException -> 0x06ec }
            java.lang.String r0 = r6.u(r0)     // Catch:{ IOException -> 0x06ec }
            defpackage.wa1.f(r10, r0)     // Catch:{ IOException -> 0x06ec }
            goto L_0x0714
        L_0x06ec:
            r0 = move-exception
            goto L_0x0703
        L_0x06ee:
            r0 = move-exception
            goto L_0x06f2
        L_0x06f0:
            r0 = move-exception
        L_0x06f1:
            r11 = 3
        L_0x06f2:
            r15 = 0
            goto L_0x0703
        L_0x06f4:
            r11 = 3
            r15 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x06ec }
            java.lang.String r6 = "Reports without sessions cannot have events added to them."
            r0.<init>(r6)     // Catch:{ IOException -> 0x06ec }
            throw r0     // Catch:{ IOException -> 0x06ec }
        L_0x06fe:
            r0 = move-exception
            r11 = 3
            r15 = 0
            r18 = 2
        L_0x0703:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r10 = "Could not synthesize final report file for "
            r6.<init>(r10)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            android.util.Log.w(r4, r1, r0)
        L_0x0714:
            java.io.File r0 = new java.io.File
            java.lang.Object r1 = r7.e
            java.io.File r1 = (java.io.File) r1
            r0.<init>(r1, r9)
            defpackage.md2.e(r0)
            r1 = 0
            r6 = 1
            r16 = 4
            goto L_0x04e3
        L_0x0726:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0726 }
            throw r0
        L_0x0729:
            z00 r0 = r5.c
            bo6 r0 = r0.d()
            bc4 r0 = r0.a
            java.util.ArrayList r0 = r5.b()
            int r1 = r0.size()
            r14 = 4
            if (r1 > r14) goto L_0x073d
            goto L_0x0755
        L_0x073d:
            java.util.List r0 = r0.subList(r14, r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0745:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0755
            java.lang.Object r1 = r0.next()
            java.io.File r1 = (java.io.File) r1
            r1.delete()
            goto L_0x0745
        L_0x0755:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k91.b(boolean, z00, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r2v11, types: [bz, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v4, types: [java.lang.Object, kz] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.Object, j00] */
    /* JADX WARNING: type inference failed for: r10v1, types: [java.lang.Object, oz] */
    public final void c(String str, Boolean bool) {
        int i2;
        String str2;
        String str3;
        String str4;
        String str5;
        int i3;
        OutputStreamWriter outputStreamWriter;
        Throwable th;
        Integer num;
        Map unmodifiableMap;
        String str6 = str;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String y = b81.y("Opening a new session with ID ", str6);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", y, (Throwable) null);
        }
        Locale locale = Locale.US;
        f83 f83 = this.f;
        wz0 wz0 = this.h;
        String str7 = f83.c;
        String str8 = (String) wz0.f;
        String str9 = (String) wz0.g;
        String str10 = f83.c().a;
        if (((String) wz0.d) != null) {
            i2 = 4;
        } else {
            i2 = 1;
        }
        q10 q10 = new q10(str7, str8, str9, str10, f21.b(i2), (jz0) wz0.h);
        String str11 = Build.VERSION.RELEASE;
        String str12 = Build.VERSION.CODENAME;
        s10 s10 = new s10(su0.F());
        Context context = this.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        ru0 ru0 = ru0.w;
        String str13 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str13)) {
            ru0 ru02 = (ru0) ru0.x.get(str13.toLowerCase(locale));
            if (ru02 != null) {
                ru0 = ru02;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", (Throwable) null);
        }
        int ordinal = ru0.ordinal();
        String str14 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long f2 = su0.f(context);
        boolean E = su0.E();
        int s2 = su0.s();
        String str15 = Build.MANUFACTURER;
        String str16 = Build.PRODUCT;
        this.j.d(str6, currentTimeMillis, new p10(q10, s10, new r10(ordinal, availableProcessors, f2, blockCount, E, s2)));
        if (!bool.booleanValue() || str6 == null) {
            str5 = str12;
            str3 = str15;
            str2 = str16;
            str4 = str14;
            i3 = 4;
        } else {
            String str17 = str15;
            cw0 cw0 = this.d;
            synchronized (((String) cw0.y)) {
                cw0.y = str6;
                jt3 jt3 = (jt3) ((AtomicMarkableReference) ((l90) cw0.z).b).getReference();
                synchronized (jt3) {
                    unmodifiableMap = Collections.unmodifiableMap(new HashMap(jt3.a));
                }
                str3 = str17;
                str4 = str14;
                Map map = unmodifiableMap;
                str5 = str12;
                str2 = str16;
                i3 = 4;
                ((ya1) ((wr0) cw0.x).y).a(new lm0(cw0, str6, map, ((v86) cw0.B).a(), 3));
            }
        }
        qc3 qc3 = this.i;
        ((zc2) qc3.y).b();
        qc3.y = qc3.C;
        if (str6 != null) {
            qc3.y = new hv5(((md2) qc3.x).c(str6, "userlog"));
        }
        this.l.a(str6);
        kd6 kd6 = this.m;
        sa1 sa1 = (sa1) kd6.x;
        Charset charset = ra1.a;
        ? obj = new Object();
        obj.a = "20.0.6";
        wz0 wz02 = sa1.c;
        String str18 = (String) wz02.a;
        if (str18 != null) {
            obj.b = str18;
            f83 f832 = sa1.b;
            String str19 = f832.c().a;
            if (str19 != null) {
                obj.d = str19;
                obj.e = f832.c().b;
                obj.f = f832.c().c;
                String str20 = (String) wz02.f;
                if (str20 != null) {
                    obj.h = str20;
                    String str21 = (String) wz02.g;
                    if (str21 != null) {
                        obj.i = str21;
                        obj.c = i3;
                        obj.m = (byte) (obj.m | 1);
                        ? obj2 = new Object();
                        int i4 = i3;
                        obj2.f = false;
                        obj2.d = currentTimeMillis;
                        obj2.m = (byte) (((byte) (obj2.m | 2)) | 1);
                        if (str6 != null) {
                            obj2.b = str6;
                            String str22 = sa1.g;
                            if (str22 != null) {
                                obj2.a = str22;
                                String str23 = f832.c;
                                if (str23 != null) {
                                    String str24 = f832.c().a;
                                    jz0 jz0 = (jz0) wz02.h;
                                    if (((yt1) jz0.y) == null) {
                                        jz0.y = new yt1(jz0);
                                    }
                                    yt1 yt1 = (yt1) jz0.y;
                                    String str25 = yt1.w;
                                    if (yt1 == null) {
                                        jz0.y = new yt1(jz0);
                                    }
                                    obj2.g = new mz(str23, str20, str21, str24, str25, ((yt1) jz0.y).x);
                                    ? obj3 = new Object();
                                    obj3.a = 3;
                                    obj3.e = (byte) (obj3.e | 1);
                                    if (str11 != null) {
                                        obj3.b = str11;
                                        if (str5 != null) {
                                            obj3.c = str5;
                                            obj3.d = su0.F();
                                            obj3.e = (byte) (obj3.e | 2);
                                            obj2.i = obj3.a();
                                            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                            int i5 = 7;
                                            if (!TextUtils.isEmpty(str13) && (num = (Integer) sa1.f.get(str13.toLowerCase(locale))) != null) {
                                                i5 = num.intValue();
                                            }
                                            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                            long f3 = su0.f(sa1.a);
                                            long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
                                            boolean E2 = su0.E();
                                            int s3 = su0.s();
                                            ? obj4 = new Object();
                                            obj4.a = i5;
                                            byte b2 = (byte) (obj4.j | 1);
                                            obj4.j = b2;
                                            if (str4 != null) {
                                                obj4.b = str4;
                                                obj4.c = availableProcessors2;
                                                obj4.d = f3;
                                                obj4.e = blockCount2;
                                                obj4.f = E2;
                                                obj4.g = s3;
                                                obj4.j = (byte) (((byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16)) | 32);
                                                String str26 = str3;
                                                if (str26 != null) {
                                                    obj4.h = str26;
                                                    String str27 = str2;
                                                    if (str27 != null) {
                                                        obj4.i = str27;
                                                        obj2.j = obj4.a();
                                                        obj2.l = 3;
                                                        obj2.m = (byte) (obj2.m | 4);
                                                        obj.j = obj2.a();
                                                        cz a2 = obj.a();
                                                        md2 md2 = ((wa1) kd6.y).b;
                                                        qa1 qa1 = a2.k;
                                                        if (qa1 != null) {
                                                            String str28 = ((lz) qa1).b;
                                                            try {
                                                                wa1.g.getClass();
                                                                wa1.f(md2.c(str28, "report"), va1.a.u(a2));
                                                                File c2 = md2.c(str28, "start-time");
                                                                long j2 = ((lz) qa1).d;
                                                                outputStreamWriter = new OutputStreamWriter(new FileOutputStream(c2), wa1.e);
                                                                outputStreamWriter.write("");
                                                                c2.setLastModified(j2 * 1000);
                                                                outputStreamWriter.close();
                                                                return;
                                                            } catch (IOException e2) {
                                                                String y2 = b81.y("Could not persist report for session ", str28);
                                                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                    Log.d("FirebaseCrashlytics", y2, e2);
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (Throwable th2) {
                                                                th.addSuppressed(th2);
                                                            }
                                                        } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                            Log.d("FirebaseCrashlytics", "Could not get session for report", (Throwable) null);
                                                            return;
                                                        } else {
                                                            return;
                                                        }
                                                    } else {
                                                        ku4.j("Null modelClass");
                                                        return;
                                                    }
                                                } else {
                                                    ku4.j("Null manufacturer");
                                                    return;
                                                }
                                            } else {
                                                ku4.j("Null model");
                                                return;
                                            }
                                        } else {
                                            ku4.j("Null buildVersion");
                                            return;
                                        }
                                    } else {
                                        ku4.j("Null version");
                                        return;
                                    }
                                } else {
                                    ku4.j("Null identifier");
                                    return;
                                }
                            } else {
                                ku4.j("Null generator");
                                return;
                            }
                        } else {
                            ku4.j("Null identifier");
                            return;
                        }
                    } else {
                        ku4.j("Null displayVersion");
                        return;
                    }
                } else {
                    ku4.j("Null buildVersion");
                    return;
                }
            } else {
                ku4.j("Null installationUuid");
                return;
            }
        } else {
            ku4.j("Null gmpAppId");
            return;
        }
        throw th;
    }

    public final boolean d(z00 z00) {
        wr0.p();
        xa1 xa1 = this.n;
        if (xa1 == null || !xa1.e.get()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", (Throwable) null);
            }
            try {
                b(true, z00, true);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", (Throwable) null);
                }
                return true;
            } catch (Exception e2) {
                Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e2);
                return false;
            }
        } else {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", (Throwable) null);
            return false;
        }
    }

    public final String e() {
        String str;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        Context context = this.a;
        int v = su0.v(context, "com.google.firebase.crashlytics.version_control_info", "string");
        if (v == 0) {
            str = null;
        } else {
            str = context.getResources().getString(v);
        }
        if (str != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", (Throwable) null);
            }
            return Base64.encodeToString(str.getBytes(s), 0);
        }
        ClassLoader classLoader = k91.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", (Throwable) null);
            inputStream = null;
        } else {
            inputStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (inputStream != null) {
            try {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Read version control info from file", (Throwable) null);
                }
                byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String encodeToString = Base64.encodeToString(byteArray, 0);
                        inputStream.close();
                        return encodeToString;
                    }
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            if (inputStream != null) {
                inputStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", (Throwable) null);
            return null;
        }
        throw th;
    }

    public final void f() {
        try {
            String e2 = e();
            if (e2 != null) {
                this.d.j(e2);
                Log.i("FirebaseCrashlytics", "Saved version control info", (Throwable) null);
            }
        } catch (IllegalArgumentException e3) {
            Context context = this.a;
            if (context != null) {
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    throw e3;
                }
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", (Throwable) null);
        } catch (IOException e4) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e4);
        }
    }

    public final void g(yb9 yb9) {
        yb9 yb92;
        yb9 yb93;
        xb7 xb7 = this.o;
        md2 md2 = ((wa1) this.m.y).b;
        if (!md2.f(((File) md2.f).listFiles()).isEmpty() || !md2.f(((File) md2.g).listFiles()).isEmpty() || !md2.f(((File) md2.h).listFiles()).isEmpty()) {
            g22 g22 = g22.D;
            g22.u("Crash reports are available to be sent.");
            ge1 ge1 = this.b;
            if (ge1.a()) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", (Throwable) null);
                }
                xb7.d(Boolean.FALSE);
                yb92 = b35.l(Boolean.TRUE);
            } else {
                g22.o("Automatic data collection is disabled.");
                g22.u("Notifying that unsent reports are available.");
                xb7.d(Boolean.TRUE);
                synchronized (ge1.x) {
                    yb93 = ((xb7) ge1.z).a;
                }
                pe2 pe2 = new pe2(25);
                yb93.getClass();
                iy2 iy2 = yb7.a;
                yb9 yb94 = new yb9();
                yb93.b.g(new a09(iy2, pe2, yb94));
                yb93.r();
                g22.o("Waiting for send/deleteUnsentReports to be called.");
                yb92 = rj1.C(yb94, this.p.a);
            }
            yb92.l((ya1) this.e.x, new jz0(this, false, yb9, 5));
            return;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", (Throwable) null);
        }
        xb7.d(Boolean.FALSE);
    }
}
