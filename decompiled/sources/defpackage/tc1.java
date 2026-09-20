package defpackage;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: tc1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tc1 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ Object C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tc1(Object obj, Object obj2, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.B = obj;
        this.C = obj2;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((tc1) o((f61) obj2, (o81) obj)).s(vs7);
            case 1:
                return ((tc1) o((f61) obj2, (y27) obj)).s(vs7);
            case 2:
                ((tc1) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            case 3:
                ((tc1) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            case 4:
                return ((tc1) o((f61) obj2, (o81) obj)).s(vs7);
            case 5:
                ((tc1) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            case 6:
                ((tc1) o((f61) obj2, (gk3) obj)).s(vs7);
                return vs7;
            case 7:
                ((tc1) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            case 8:
                ((tc1) o((f61) obj2, (dh7) obj)).s(vs7);
                return vs7;
            case 9:
                ((tc1) o((f61) obj2, (o81) obj)).s(vs7);
                throw null;
            case 10:
                ((tc1) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                ((tc1) o((f61) obj2, (hs4) obj)).s(vs7);
                return vs7;
            case 12:
                ((tc1) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                ((tc1) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            case 14:
                ((tc1) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            case h75.g:
                return ((tc1) o((f61) obj2, (o81) obj)).s(vs7);
            case 16:
                ((tc1) o((f61) obj2, (is7) obj)).s(vs7);
                return vs7;
            case 17:
                return ((tc1) o((f61) obj2, (pp4) obj)).s(vs7);
            case 18:
                ((tc1) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            case 19:
                return ((tc1) o((f61) obj2, (UserDataPreferences) obj)).s(vs7);
            case 20:
                return ((tc1) o((f61) obj2, (UserDataPreferences) obj)).s(vs7);
            case 21:
                return ((tc1) o((f61) obj2, (o81) obj)).s(vs7);
            case 22:
                ((tc1) o((f61) obj2, (o78) obj)).s(vs7);
                return vs7;
            default:
                return ((tc1) o((f61) obj2, (o81) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.C;
        switch (i) {
            case b85.b:
                tc1 tc1 = new tc1((uc1) obj2, f61, 0);
                tc1.B = obj;
                return tc1;
            case 1:
                tc1 tc12 = new tc1((y27) obj2, f61, 1);
                tc12.B = obj;
                return tc12;
            case 2:
                return new tc1((en2) this.B, (aq4) obj2, f61, 2);
            case 3:
                return new tc1((String) this.B, (aq4) obj2, f61, 3);
            case 4:
                tc1 tc13 = new tc1((sr2) obj2, f61, 4);
                tc13.B = obj;
                return tc13;
            case 5:
                return new tc1((nh3) this.B, (ru4) obj2, f61, 5);
            case 6:
                tc1 tc14 = new tc1((rh3) obj2, f61, 6);
                tc14.B = obj;
                return tc14;
            case 7:
                tc1 tc15 = new tc1((l54) obj2, f61, 7);
                tc15.B = obj;
                return tc15;
            case 8:
                tc1 tc16 = new tc1((ed5) obj2, f61, 8);
                tc16.B = obj;
                return tc16;
            case 9:
                tc1 tc17 = new tc1((vh4) obj2, f61, 9);
                tc17.B = obj;
                return tc17;
            case 10:
                return new tc1((hs4) this.B, (Context) obj2, f61, 10);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                tc1 tc18 = new tc1((vs4) obj2, f61, 11);
                tc18.B = obj;
                return tc18;
            case 12:
                return new tc1((ArrayList) this.B, (yx6) obj2, f61, 12);
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                return new tc1((xz1) this.B, (ok2) obj2, f61, 13);
            case 14:
                return new tc1((cx0) this.B, (k54) obj2, f61, 14);
            case h75.g:
                tc1 tc19 = new tc1((gs2) obj2, f61, 15);
                tc19.B = obj;
                return tc19;
            case 16:
                tc1 tc110 = new tc1((fq6) obj2, f61, 16);
                tc110.B = obj;
                return tc110;
            case 17:
                tc1 tc111 = new tc1((Set) obj2, f61, 17);
                tc111.B = obj;
                return tc111;
            case 18:
                return new tc1((sr2) this.B, (aq4) obj2, f61, 18);
            case 19:
                tc1 tc112 = new tc1((DarkThemeConfigPreferences) obj2, f61, 19);
                tc112.B = obj;
                return tc112;
            case 20:
                tc1 tc113 = new tc1((List) obj2, f61, 20);
                tc113.B = obj;
                return tc113;
            case 21:
                return new tc1((v78) this.B, (Uri) obj2, f61, 21);
            case 22:
                tc1 tc114 = new tc1((e88) obj2, f61, 22);
                tc114.B = obj;
                return tc114;
            default:
                return new tc1((Application) this.B, (jb9) obj2, f61, 23);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v15, types: [int] */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* JADX WARNING: type inference failed for: r4v27 */
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
        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:298)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:64)
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
    public final java.lang.Object s(java.lang.Object r81) {
        /*
            r80 = this;
            r0 = r80
            int r1 = r0.A
            r2 = 3
            r3 = 6
            r4 = 0
            r5 = 1
            r6 = 0
            vs7 r7 = defpackage.vs7.a
            java.lang.Object r8 = r0.C
            switch(r1) {
                case 0: goto L_0x045d;
                case 1: goto L_0x0440;
                case 2: goto L_0x0423;
                case 3: goto L_0x0402;
                case 4: goto L_0x03b4;
                case 5: goto L_0x0399;
                case 6: goto L_0x0368;
                case 7: goto L_0x0345;
                case 8: goto L_0x0336;
                case 9: goto L_0x032e;
                case 10: goto L_0x0310;
                case 11: goto L_0x02e7;
                case 12: goto L_0x02c0;
                case 13: goto L_0x02ad;
                case 14: goto L_0x029e;
                case 15: goto L_0x025b;
                case 16: goto L_0x0241;
                case 17: goto L_0x01db;
                case 18: goto L_0x01c0;
                case 19: goto L_0x0131;
                case 20: goto L_0x00a1;
                case 21: goto L_0x004b;
                case 22: goto L_0x0024;
                default: goto L_0x0010;
            }
        L_0x0010:
            defpackage.o85.q(r81)
            java.lang.Object r0 = r0.B
            android.app.Application r0 = (android.app.Application) r0
            jb9 r8 = (defpackage.jb9) r8
            long r1 = r8.x
            int r3 = r8.y
            java.lang.String r4 = "third_party_licenses"
            java.lang.String r0 = defpackage.z65.Z(r0, r4, r1, r3)
            return r0
        L_0x0024:
            java.lang.Object r0 = r0.B
            r1 = r0
            o78 r1 = (defpackage.o78) r1
            defpackage.o85.q(r81)
            e88 r8 = (defpackage.e88) r8
            d37 r2 = r8.c
        L_0x0030:
            java.lang.Object r0 = r2.getValue()
            r4 = r0
            is7 r4 = (defpackage.is7) r4
            java.lang.Object r4 = r4.a
            w78 r4 = (defpackage.w78) r4
            w78 r4 = defpackage.p25.b(r4, r1)
            is7 r5 = new is7
            r5.<init>(r3, r4)
            boolean r0 = r2.i(r0, r5)
            if (r0 == 0) goto L_0x0030
            return r7
        L_0x004b:
            defpackage.o85.q(r81)
            java.lang.Object r0 = r0.B
            v78 r0 = (defpackage.v78) r0
            android.net.Uri r8 = (android.net.Uri) r8
            android.content.Context r1 = r0.a     // Catch:{ CancellationException -> 0x009f, Exception -> 0x0092 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ CancellationException -> 0x009f, Exception -> 0x0092 }
            java.io.InputStream r1 = r1.openInputStream(r8)     // Catch:{ CancellationException -> 0x009f, Exception -> 0x0092 }
            if (r1 == 0) goto L_0x008a
            java.nio.charset.Charset r2 = defpackage.mo0.a     // Catch:{ all -> 0x0082 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0082 }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x0082 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0082 }
            r4 = 8192(0x2000, float:1.148E-41)
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0082 }
            java.lang.String r2 = defpackage.w95.j(r2)     // Catch:{ all -> 0x0082 }
            r1.close()     // Catch:{ CancellationException -> 0x009f, Exception -> 0x0092 }
            java.lang.String r1 = defpackage.v78.a(r0, r8)     // Catch:{ CancellationException -> 0x009f, Exception -> 0x0092 }
            if (r1 != 0) goto L_0x007d
            java.lang.String r1 = "config importada"
        L_0x007d:
            o78 r0 = r0.g(r2, r1, r5)     // Catch:{ CancellationException -> 0x009f, Exception -> 0x0092 }
            goto L_0x0099
        L_0x0082:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            defpackage.ed1.i(r1, r2)     // Catch:{ CancellationException -> 0x009f, Exception -> 0x0092 }
            throw r0     // Catch:{ CancellationException -> 0x009f, Exception -> 0x0092 }
        L_0x008a:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ CancellationException -> 0x009f, Exception -> 0x0092 }
            java.lang.String r1 = "No se pudo leer el archivo seleccionado"
            r0.<init>(r1)     // Catch:{ CancellationException -> 0x009f, Exception -> 0x0092 }
            throw r0     // Catch:{ CancellationException -> 0x009f, Exception -> 0x0092 }
        L_0x0092:
            r0 = move-exception
            m66 r1 = new m66
            r1.<init>(r0)
            r0 = r1
        L_0x0099:
            o66 r1 = new o66
            r1.<init>(r0)
            return r1
        L_0x009f:
            r0 = move-exception
            throw r0
        L_0x00a1:
            java.lang.Object r0 = r0.B
            r9 = r0
            cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences r9 = (cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences) r9
            defpackage.o85.q(r81)
            r32 = r8
            java.util.List r32 = (java.util.List) r32
            r78 = -1
            r79 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r56 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r67 = 0
            r68 = 0
            r69 = 0
            r70 = 0
            r71 = 0
            r72 = 0
            r73 = 0
            r74 = 0
            r75 = 0
            r76 = 0
            r77 = -4194305(0xffffffffffbfffff, float:NaN)
            cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences r0 = cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences.copy$default(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r52, r53, r54, r56, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79)
            return r0
        L_0x0131:
            java.lang.Object r0 = r0.B
            r9 = r0
            cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences r9 = (cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences) r9
            defpackage.o85.q(r81)
            r13 = r8
            cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences r13 = (cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences) r13
            r78 = -1
            r79 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r56 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r67 = 0
            r68 = 0
            r69 = 0
            r70 = 0
            r71 = 0
            r72 = 0
            r73 = 0
            r74 = 0
            r75 = 0
            r76 = 0
            r77 = -9
            cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences r0 = cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences.copy$default(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r52, r53, r54, r56, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79)
            return r0
        L_0x01c0:
            defpackage.o85.q(r81)
            aq4 r8 = (defpackage.aq4) r8
            java.util.Map r1 = defpackage.dw6.a
            java.lang.Object r1 = r8.getValue()
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            if (r1 != 0) goto L_0x01da
            java.lang.Object r0 = r0.B
            sr2 r0 = (defpackage.sr2) r0
            r0.b()
        L_0x01da:
            return r7
        L_0x01db:
            defpackage.o85.q(r81)
            java.lang.Object r0 = r0.B
            pp4 r0 = (defpackage.pp4) r0
            java.util.Map r0 = r0.a()
            java.util.Set r0 = r0.keySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.et0.e0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x01fb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x020d
            java.lang.Object r2 = r0.next()
            in5 r2 = (defpackage.in5) r2
            java.lang.String r2 = r2.a
            r1.add(r2)
            goto L_0x01fb
        L_0x020d:
            java.util.Set r8 = (java.util.Set) r8
            java.util.LinkedHashSet r0 = defpackage.xr6.a
            if (r8 != r0) goto L_0x0215
        L_0x0213:
            r4 = r5
            goto L_0x023c
        L_0x0215:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r0 = r8 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0225
            r0 = r8
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0225
            goto L_0x023c
        L_0x0225:
            java.util.Iterator r0 = r8.iterator()
        L_0x0229:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x023c
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L_0x0229
            goto L_0x0213
        L_0x023c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L_0x0241:
            java.lang.Object r0 = r0.B
            r1 = r0
            is7 r1 = (defpackage.is7) r1
            defpackage.o85.q(r81)
            fq6 r8 = (defpackage.fq6) r8
            d37 r2 = r8.c
        L_0x024d:
            java.lang.Object r0 = r2.getValue()
            r3 = r0
            is7 r3 = (defpackage.is7) r3
            boolean r0 = r2.i(r0, r1)
            if (r0 == 0) goto L_0x024d
            return r7
        L_0x025b:
            defpackage.o85.q(r81)
            java.lang.Object r0 = r0.B
            o81 r0 = (defpackage.o81) r0
            e81 r0 = r0.k()
            hz2 r1 = defpackage.hz2.z
            c81 r0 = r0.a0(r1)
            r0.getClass()
            h81 r0 = (defpackage.h81) r0
            xu0 r1 = defpackage.ag8.b()
            ii3 r2 = new ii3
            gs2 r8 = (defpackage.gs2) r8
            r3 = 20
            r2.<init>((java.lang.Object) r1, (java.lang.Object) r8, (defpackage.f61) r6, (int) r3)
            cw2 r3 = defpackage.cw2.w
            r81 r4 = defpackage.r81.z
            defpackage.ar7.G(r3, r0, r4, r2)
        L_0x0285:
            java.lang.Object r2 = r1.R()
            boolean r2 = r2 instanceof defpackage.aa3
            if (r2 == 0) goto L_0x0299
            ot r2 = new ot     // Catch:{ InterruptedException -> 0x0285 }
            r3 = 26
            r2.<init>(r1, r6, r3)     // Catch:{ InterruptedException -> 0x0285 }
            java.lang.Object r0 = defpackage.ar7.U(r0, r2)     // Catch:{ InterruptedException -> 0x0285 }
            goto L_0x029d
        L_0x0299:
            java.lang.Object r0 = r1.C()
        L_0x029d:
            return r0
        L_0x029e:
            defpackage.o85.q(r81)
            java.lang.Object r0 = r0.B
            cx0 r0 = (defpackage.cx0) r0
            k54 r8 = (defpackage.k54) r8
            r0.y = r8
            r0.a()
            return r7
        L_0x02ad:
            defpackage.o85.q(r81)
            java.lang.Object r0 = r0.B
            xz1 r0 = (defpackage.xz1) r0
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x02bf
            ok2 r8 = (defpackage.ok2) r8
            defpackage.ok2.a(r8)
        L_0x02bf:
            return r7
        L_0x02c0:
            defpackage.o85.q(r81)
            java.lang.Object r0 = r0.B
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            yx6 r8 = (defpackage.yx6) r8
            int r1 = r0.size()
        L_0x02cd:
            if (r4 >= r1) goto L_0x02e5
            java.lang.Object r2 = r0.get(r4)
            if (r2 != 0) goto L_0x02e1
            boolean r2 = r8.contains(r6)
            if (r2 != 0) goto L_0x02de
            r8.add(r6)
        L_0x02de:
            int r4 = r4 + 1
            goto L_0x02cd
        L_0x02e1:
            defpackage.ku4.a()
            goto L_0x02e6
        L_0x02e5:
            r6 = r7
        L_0x02e6:
            return r6
        L_0x02e7:
            java.lang.Object r0 = r0.B
            r1 = r0
            hs4 r1 = (defpackage.hs4) r1
            defpackage.o85.q(r81)
            vs4 r8 = (defpackage.vs4) r8
            d37 r2 = r8.f
        L_0x02f3:
            java.lang.Object r0 = r2.getValue()
            r4 = r0
            is7 r4 = (defpackage.is7) r4
            java.lang.Object r4 = r4.a
            hs4 r4 = (defpackage.hs4) r4
            i98 r4 = r4.f
            hs4 r4 = defpackage.hs4.a(r1, r4)
            is7 r5 = new is7
            r5.<init>(r3, r4)
            boolean r0 = r2.i(r0, r5)
            if (r0 == 0) goto L_0x02f3
            return r7
        L_0x0310:
            android.content.Context r8 = (android.content.Context) r8
            defpackage.o85.q(r81)
            java.lang.Object r0 = r0.B
            hs4 r0 = (defpackage.hs4) r0
            boolean r0 = r0.a
            if (r0 == 0) goto L_0x032d
            boolean r0 = android.provider.Settings.canDrawOverlays(r8)
            if (r0 == 0) goto L_0x032d
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<cu.lestebang.utiletecsa.feature.nauta.service.NautaOverlayService> r1 = cu.lestebang.utiletecsa.feature.nauta.service.NautaOverlayService.class
            r0.<init>(r8, r1)
            defpackage.ag8.H(r8, r0)
        L_0x032d:
            return r7
        L_0x032e:
            defpackage.o85.q(r81)
            java.lang.Object r0 = r0.B
            o81 r0 = (defpackage.o81) r0
            throw r6
        L_0x0336:
            java.lang.Object r0 = r0.B
            dh7 r0 = (defpackage.dh7) r0
            defpackage.o85.q(r81)
            ed5 r8 = (defpackage.ed5) r8
            int r1 = cu.lestebang.utiletecsa.MainActivity.g0
            r8.setValue(r0)
            return r7
        L_0x0345:
            defpackage.o85.q(r81)
            java.lang.Object r0 = r0.B
            o81 r0 = (defpackage.o81) r0
            l54 r8 = (defpackage.l54) r8
            in8 r1 = r8.w
            k54 r2 = r1.G0()
            k54 r3 = defpackage.k54.x
            int r2 = r2.compareTo(r3)
            if (r2 < 0) goto L_0x0360
            r1.x0(r8)
            goto L_0x0367
        L_0x0360:
            e81 r0 = r0.k()
            defpackage.r16.u(r0, r6)
        L_0x0367:
            return r7
        L_0x0368:
            java.lang.Object r0 = r0.B
            r1 = r0
            gk3 r1 = (defpackage.gk3) r1
            defpackage.o85.q(r81)
            rh3 r8 = (defpackage.rh3) r8
            d37 r2 = r8.d
        L_0x0374:
            java.lang.Object r0 = r2.getValue()
            r4 = r0
            is7 r4 = (defpackage.is7) r4
            java.lang.Object r4 = r4.a
            r8 = r4
            nh3 r8 = (defpackage.nh3) r8
            java.lang.String r9 = r1.a
            java.lang.String r10 = r1.b
            double r11 = r1.c
            r13 = 0
            r14 = 8
            nh3 r4 = defpackage.nh3.a(r8, r9, r10, r11, r13, r14)
            is7 r5 = new is7
            r5.<init>(r3, r4)
            boolean r0 = r2.i(r0, r5)
            if (r0 == 0) goto L_0x0374
            return r7
        L_0x0399:
            defpackage.o85.q(r81)
            java.lang.Object r0 = r0.B
            nh3 r0 = (defpackage.nh3) r0
            hv2 r0 = r0.d
            java.lang.Object r0 = r0.K0()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = defpackage.sg3.e(r0, r1)
            if (r0 == 0) goto L_0x03b3
            ru4 r8 = (defpackage.ru4) r8
            r8.b()
        L_0x03b3:
            return r7
        L_0x03b4:
            java.lang.Object r0 = r0.B
            o81 r0 = (defpackage.o81) r0
            defpackage.o85.q(r81)
            e81 r0 = r0.k()
            sr2 r8 = (defpackage.sr2) r8
            nh7 r1 = new nh7     // Catch:{ InterruptedException -> 0x03f5 }
            r1.<init>()     // Catch:{ InterruptedException -> 0x03f5 }
            el3 r0 = defpackage.r16.Q(r0)     // Catch:{ InterruptedException -> 0x03f5 }
            mw1 r0 = defpackage.r16.W(r0, r5, r1)     // Catch:{ InterruptedException -> 0x03f5 }
            r1.E = r0     // Catch:{ InterruptedException -> 0x03f5 }
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.nh7.F     // Catch:{ InterruptedException -> 0x03f5 }
        L_0x03d2:
            int r3 = r0.get(r1)     // Catch:{ InterruptedException -> 0x03f5 }
            if (r3 == 0) goto L_0x03e2
            r0 = 2
            if (r3 == r0) goto L_0x03e8
            if (r3 != r2) goto L_0x03de
            goto L_0x03e8
        L_0x03de:
            defpackage.nh7.u(r3)     // Catch:{ InterruptedException -> 0x03f5 }
            throw r6     // Catch:{ InterruptedException -> 0x03f5 }
        L_0x03e2:
            boolean r3 = r0.compareAndSet(r1, r3, r4)     // Catch:{ InterruptedException -> 0x03f5 }
            if (r3 == 0) goto L_0x03d2
        L_0x03e8:
            java.lang.Object r0 = r8.b()     // Catch:{ all -> 0x03f0 }
            r1.t()     // Catch:{ InterruptedException -> 0x03f5 }
            return r0
        L_0x03f0:
            r0 = move-exception
            r1.t()     // Catch:{ InterruptedException -> 0x03f5 }
            throw r0     // Catch:{ InterruptedException -> 0x03f5 }
        L_0x03f5:
            r0 = move-exception
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            java.lang.String r2 = "Blocking call was interrupted due to parent cancellation"
            r1.<init>(r2)
            java.lang.Throwable r0 = r1.initCause(r0)
            throw r0
        L_0x0402:
            java.lang.Object r0 = r0.B
            java.lang.String r0 = (java.lang.String) r0
            defpackage.o85.q(r81)
            aq4 r8 = (defpackage.aq4) r8
            java.util.List r1 = defpackage.t13.a
            java.lang.Object r1 = r8.getValue()
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0422
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x0422
            r8.setValue(r0)
        L_0x0422:
            return r7
        L_0x0423:
            defpackage.o85.q(r81)
            java.lang.Object r0 = r0.B
            en2 r0 = (defpackage.en2) r0
            java.lang.String r1 = r0.e
            if (r1 != 0) goto L_0x043f
            boolean r1 = r0.g
            if (r1 == 0) goto L_0x043f
            aq4 r8 = (defpackage.aq4) r8
            java.lang.Object r1 = r8.getValue()
            vr2 r1 = (defpackage.vr2) r1
            java.lang.String r0 = r0.a
            r1.y(r0)
        L_0x043f:
            return r7
        L_0x0440:
            defpackage.o85.q(r81)
            java.lang.Object r0 = r0.B
            y27 r0 = (defpackage.y27) r0
            boolean r1 = r0 instanceof defpackage.de1
            if (r1 == 0) goto L_0x0458
            de1 r0 = (defpackage.de1) r0
            int r0 = r0.a
            y27 r8 = (defpackage.y27) r8
            de1 r8 = (defpackage.de1) r8
            int r1 = r8.a
            if (r0 > r1) goto L_0x0458
            r4 = r5
        L_0x0458:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L_0x045d:
            defpackage.o85.q(r81)
            java.lang.Object r0 = r0.B
            o81 r0 = (defpackage.o81) r0
            uc1 r8 = (defpackage.uc1) r8
            java.util.concurrent.atomic.AtomicReference r1 = r8.b
            java.lang.Object r1 = r1.getAndSet(r6)
            el3 r1 = (defpackage.el3) r1
            java.util.concurrent.atomic.AtomicReference r3 = r8.b
            n0 r7 = new n0
            r9 = 25
            r7.<init>(r1, r8, r6, r9)
            h27 r0 = defpackage.ar7.H(r0, r6, r6, r7, r2)
        L_0x047b:
            boolean r1 = r3.compareAndSet(r6, r0)
            if (r1 == 0) goto L_0x0483
            r4 = r5
            goto L_0x0489
        L_0x0483:
            java.lang.Object r1 = r3.get()
            if (r1 == 0) goto L_0x047b
        L_0x0489:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tc1.s(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tc1(Object obj, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = obj;
    }
}
