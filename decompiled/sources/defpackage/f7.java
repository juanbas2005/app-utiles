package defpackage;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import android.speech.tts.TextToSpeech;
import android.telecom.TelecomManager;
import com.google.common.util.concurrent.ListenableFuture;
import cu.lestebang.utiletecsa.feature.settings.service.CallAlertReceiver;
import cu.lestebang.utiletecsa.feature.settings.service.CallBlockReceiver;
import io.github.jan.supabase.auth.user.UserInfo;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: f7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f7 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f7(Context context, Uri uri, aq4 aq4, aq4 aq42, aq4 aq43, aq4 aq44, f61 f61) {
        super(2, f61);
        this.A = 7;
        this.C = context;
        this.D = uri;
        this.E = aq4;
        this.F = aq42;
        this.G = aq43;
        this.H = aq44;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [oq4] */
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
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
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
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a1, code lost:
        if (r10.a(r9) == r5) goto L_0x00b4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c2 A[Catch:{ all -> 0x00cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c1 A[SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:41:0x00d3=Splitter:B:41:0x00d3, B:29:0x00b9=Splitter:B:29:0x00b9} */
    private final java.lang.Object A(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.G
            nq4 r0 = (defpackage.nq4) r0
            int r1 = r9.B
            r2 = 2
            r3 = 1
            r4 = 0
            p81 r5 = defpackage.p81.w
            if (r1 == 0) goto L_0x0043
            if (r1 == r3) goto L_0x002b
            if (r1 != r2) goto L_0x0025
            java.lang.Object r0 = r9.D
            nq4 r0 = (defpackage.nq4) r0
            java.lang.Object r1 = r9.C
            oq4 r1 = (defpackage.oq4) r1
            java.lang.Object r9 = r9.F
            kq4 r9 = (defpackage.kq4) r9
            defpackage.o85.q(r10)     // Catch:{ all -> 0x0022 }
            goto L_0x00b9
        L_0x0022:
            r10 = move-exception
            goto L_0x00d3
        L_0x0025:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r9)
            return r4
        L_0x002b:
            java.lang.Object r0 = r9.E
            nq4 r0 = (defpackage.nq4) r0
            java.lang.Object r1 = r9.D
            vr2 r1 = (defpackage.vr2) r1
            java.lang.Object r3 = r9.C
            oq4 r3 = (defpackage.oq4) r3
            java.lang.Object r6 = r9.F
            kq4 r6 = (defpackage.kq4) r6
            defpackage.o85.q(r10)
            r10 = r6
            r6 = r1
            r1 = r10
            r10 = r3
            goto L_0x00a4
        L_0x0043:
            defpackage.o85.q(r10)
            java.lang.Object r10 = r9.F
            o81 r10 = (defpackage.o81) r10
            kq4 r1 = new kq4
            e81 r10 = r10.k()
            me6 r6 = defpackage.me6.E
            c81 r10 = r10.a0(r6)
            r10.getClass()
            el3 r10 = (defpackage.el3) r10
            r1.<init>(r10)
            java.util.concurrent.atomic.AtomicReference r10 = r0.a
        L_0x0060:
            java.lang.Object r6 = r10.get()
            kq4 r6 = (defpackage.kq4) r6
            if (r6 == 0) goto L_0x0079
            iq4 r7 = defpackage.iq4.w
            int r7 = r7.compareTo(r7)
            if (r7 < 0) goto L_0x0071
            goto L_0x0079
        L_0x0071:
            java.util.concurrent.CancellationException r9 = new java.util.concurrent.CancellationException
            java.lang.String r10 = "Current mutation had a higher priority"
            r9.<init>(r10)
            throw r9
        L_0x0079:
            boolean r7 = r10.compareAndSet(r6, r1)
            if (r7 == 0) goto L_0x00e7
            if (r6 == 0) goto L_0x008d
            el3 r10 = r6.a
            androidx.compose.animation.core.MutationInterruptedException r6 = new androidx.compose.animation.core.MutationInterruptedException
            java.lang.String r7 = "Mutation interrupted"
            r6.<init>(r7)
            r10.o(r6)
        L_0x008d:
            qq4 r10 = r0.b
            java.lang.Object r6 = r9.H
            vr2 r6 = (defpackage.vr2) r6
            r9.F = r1
            r9.C = r10
            r9.D = r6
            r9.E = r0
            r9.B = r3
            java.lang.Object r3 = r10.a(r9)
            if (r3 != r5) goto L_0x00a4
            goto L_0x00b4
        L_0x00a4:
            r9.F = r1     // Catch:{ all -> 0x00ce }
            r9.C = r10     // Catch:{ all -> 0x00ce }
            r9.D = r0     // Catch:{ all -> 0x00ce }
            r9.E = r4     // Catch:{ all -> 0x00ce }
            r9.B = r2     // Catch:{ all -> 0x00ce }
            java.lang.Object r9 = r6.y(r9)     // Catch:{ all -> 0x00ce }
            if (r9 != r5) goto L_0x00b5
        L_0x00b4:
            return r5
        L_0x00b5:
            r8 = r10
            r10 = r9
            r9 = r1
            r1 = r8
        L_0x00b9:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch:{ all -> 0x00cc }
        L_0x00bb:
            boolean r2 = r0.compareAndSet(r9, r4)     // Catch:{ all -> 0x00cc }
            if (r2 == 0) goto L_0x00c2
            goto L_0x00c8
        L_0x00c2:
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x00cc }
            if (r2 == r9) goto L_0x00bb
        L_0x00c8:
            r1.k(r4)
            return r10
        L_0x00cc:
            r9 = move-exception
            goto L_0x00e3
        L_0x00ce:
            r9 = move-exception
            r8 = r10
            r10 = r9
            r9 = r1
            r1 = r8
        L_0x00d3:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch:{ all -> 0x00cc }
        L_0x00d5:
            boolean r2 = r0.compareAndSet(r9, r4)     // Catch:{ all -> 0x00cc }
            if (r2 != 0) goto L_0x00e2
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x00cc }
            if (r2 != r9) goto L_0x00e2
            goto L_0x00d5
        L_0x00e2:
            throw r10     // Catch:{ all -> 0x00cc }
        L_0x00e3:
            r1.k(r4)
            throw r9
        L_0x00e7:
            java.lang.Object r7 = r10.get()
            if (r7 == r6) goto L_0x0079
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f7.A(java.lang.Object):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: bj0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: h27} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: com.google.common.util.concurrent.ListenableFuture} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        r14 = r0;
        r13 = r9;
        r7 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r14 = defpackage.f31.a;
        r0 = defpackage.bc4.k();
        r0.g(r14, "Delegated worker " + r1.getClass() + " threw exception in startWork.", r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0092, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        r13 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cf, code lost:
        r6.o((java.util.concurrent.CancellationException) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d2, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        r13 = r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:4:0x001f, B:13:0x0056, B:25:0x0074] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0023 A[ExcHandler: all (r0v10 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r6 
      PHI: (r6v3 h27) = (r6v0 h27), (r6v0 h27), (r6v2 h27), (r6v5 h27), (r6v5 h27) binds: [B:19:0x0069, B:20:?, B:13:0x0056, B:4:0x001f, B:5:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:4:0x001f] */
    private final Object v(Object obj) {
        CancellationException cancellationException;
        AtomicInteger atomicInteger;
        ListenableFuture listenableFuture;
        h27 h27;
        t84 t84 = (t84) this.F;
        int i = this.B;
        boolean z = true;
        if (i == 0) {
            o85.q(obj);
            AtomicInteger atomicInteger2 = new AtomicInteger(-256);
            ListenableFuture b = t84.b();
            h27 = ar7.H((o81) this.E, (e81) null, (r81) null, new ng((zy2) this.G, (be8) this.H, atomicInteger2, b, (f61) null, 4), 3);
            this.E = atomicInteger2;
            this.C = b;
            this.D = h27;
            this.B = 1;
            obj = ed1.h(b, this);
            p81 p81 = p81.w;
            if (obj == p81) {
                return p81;
            }
            atomicInteger = atomicInteger2;
            listenableFuture = b;
        } else if (i == 1) {
            h27 = this.D;
            listenableFuture = this.C;
            atomicInteger = (AtomicInteger) this.E;
            try {
                o85.q(obj);
            } catch (CancellationException e) {
                cancellationException = e;
            } catch (Throwable th) {
            }
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        s84 s84 = (s84) obj;
        h27.o((CancellationException) null);
        return s84;
        String str = f31.a;
        bc4 k = bc4.k();
        k.g(str, "Delegated worker " + t84.getClass() + " was cancelled", cancellationException);
        if (atomicInteger.get() == -256) {
            z = false;
        }
        if (!listenableFuture.isCancelled() || !z) {
            throw cancellationException;
        }
        throw new z21(atomicInteger.get());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0097, code lost:
        if (r12 == r4) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009c  */
    private final Object x(Object obj) {
        wr6 wr6;
        Iterator it;
        List list;
        Object obj2;
        Iterator it2;
        int i = this.B;
        p81 p81 = p81.w;
        if (i == 0) {
            o85.q(obj);
            obj = this.F;
            list = (ArrayList) this.H;
            it2 = ((List) this.G).iterator();
        } else if (i == 1) {
            obj2 = this.E;
            it = (Iterator) this.C;
            o85.q(obj);
            List list2 = (List) this.F;
            wr6 = (wr6) this.D;
            list = list2;
            if (!((Boolean) obj).booleanValue()) {
                list.add(new ne1(wr6, (f61) null, 0));
                this.F = list;
                this.C = it;
                this.D = null;
                this.E = null;
                this.B = 2;
                obj = wr6.b.u(new zr6((SharedPreferences) wr6.e.getValue(), wr6.f), obj2, this);
            } else {
                obj = obj2;
            }
            it2 = it;
        } else if (i == 2) {
            it2 = (Iterator) this.C;
            list = (List) this.F;
            o85.q(obj);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (!it2.hasNext()) {
            wr6 wr62 = (wr6) it2.next();
            this.F = list;
            this.C = it2;
            this.D = wr62;
            this.E = obj;
            this.B = 1;
            Object a = wr62.a(obj, this);
            if (a != p81) {
                Iterator it3 = it2;
                obj2 = obj;
                obj = a;
                wr6 = wr62;
                it = it3;
                if (!((Boolean) obj).booleanValue()) {
                }
                it2 = it;
                if (!it2.hasNext()) {
                    return obj;
                }
            }
            return p81;
        }
        return obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: lo2} */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|(1:(1:(7:4|5|6|22|23|26|27)(2:7|8))(3:9|10|11))(5:12|13|14|(1:16)|21)|(2:18|19)|22|23|26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0093, code lost:
        if (defpackage.lo2.b(r1, r0, r14) == r5) goto L_0x0095;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0096 */
    /* JADX WARNING: Multi-variable type inference failed */
    private final Object z(Object obj) {
        Object obj2;
        lo2 lo2;
        String str;
        o81 o81 = (o81) this.D;
        int i = this.B;
        Object obj3 = p81.w;
        if (i == 0) {
            o85.q(obj);
            lo2 = this.H;
            String str2 = (String) this.F;
            String str3 = (String) this.G;
            hm5 i2 = f55.i(lo2.a, "forum_posts");
            gm5 gm5 = i2.a;
            String str4 = i2.c;
            ku4 ku4 = gm5.c.v;
            mp1 mp1 = new mp1(str4, ku4, 0);
            mp1.e(i53.f);
            zc9 zc9 = new zc9(ku4, mp1.f, 4);
            str3.getClass();
            zc9.a("id", xd2.EQ, str3);
            h66 h66 = h66.a;
            String str5 = i2.b;
            this.D = o81;
            this.C = lo2;
            this.E = str2;
            this.B = 1;
            if (h66.a(gm5, str5, mp1, this) != obj3) {
                str = str2;
            }
            return obj3;
        } else if (i == 1) {
            str = (String) this.E;
            lo2 = (lo2) this.C;
            try {
                o85.q(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                obj2 = new m66(e2);
            }
        } else if (i == 2) {
            o81 o812 = (o81) ((String) this.E);
            f61 f61 = (f61) ((lo2) this.C);
            o85.q(obj);
            obj2 = vs7.a;
            return new o66(obj2);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (str != null) {
            this.D = null;
            this.C = null;
            this.E = null;
            this.B = 2;
        }
        obj2 = vs7.a;
        return new o66(obj2);
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((f7) o((f61) obj2, (o81) obj)).s(vs7);
            case 1:
                return ((f7) o((f61) obj2, (o81) obj)).s(vs7);
            case 2:
                return ((f7) o((f61) obj2, (o81) obj)).s(vs7);
            case 3:
                return ((f7) o((f61) obj2, (o81) obj)).s(vs7);
            case 4:
                return ((f7) o((f61) obj2, (o81) obj)).s(vs7);
            case 5:
                return ((f7) o((f61) obj2, obj)).s(vs7);
            case 6:
                return ((f7) o((f61) obj2, (o81) obj)).s(vs7);
            case 7:
                return ((f7) o((f61) obj2, (o81) obj)).s(vs7);
            case 8:
                return ((f7) o((f61) obj2, (o81) obj)).s(vs7);
            default:
                return ((f7) o((f61) obj2, (o81) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.H;
        Object obj3 = this.G;
        switch (i) {
            case b85.b:
                return new f7((p7) this.D, (Activity) obj2, (String) obj3, f61);
            case 1:
                f7 f7Var = new f7((en0) this.E, (uj) this.F, (aq4) obj3, (aq4) obj2, f61, 1);
                f7Var.D = obj;
                return f7Var;
            case 2:
                f7 f7Var2 = new f7((String) this.E, (CallAlertReceiver) this.F, (Context) obj3, (BroadcastReceiver.PendingResult) obj2, f61, 2);
                f7Var2.D = obj;
                return f7Var2;
            case 3:
                f7 f7Var3 = new f7((String) this.E, (Context) this.F, (BroadcastReceiver.PendingResult) obj3, (CallBlockReceiver) obj2, f61, 3);
                f7Var3.D = obj;
                return f7Var3;
            case 4:
                f7 f7Var4 = new f7((t84) this.F, (zy2) obj3, (be8) obj2, f61);
                f7Var4.E = obj;
                return f7Var4;
            case 5:
                f7 f7Var5 = new f7((Object) (List) obj3, (Object) (ArrayList) obj2, f61, 5);
                f7Var5.F = obj;
                return f7Var5;
            case 6:
                f7 f7Var6 = new f7((lo2) obj2, (String) this.F, (String) obj3, f61);
                f7Var6.D = obj;
                return f7Var6;
            case 7:
                return new f7((Context) this.C, (Uri) this.D, (aq4) this.E, (aq4) this.F, (aq4) obj3, (aq4) obj2, f61);
            case 8:
                f7 f7Var7 = new f7((Object) (nq4) obj3, (Object) (vr2) obj2, f61, 8);
                f7Var7.F = obj;
                return f7Var7;
            default:
                return new f7((in8) this.E, (k54) this.F, (o81) obj3, (gs2) obj2, f61, 9);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: p7} */
    /* JADX WARNING: type inference failed for: r4v49, types: [m66] */
    /* JADX WARNING: type inference failed for: r14v4, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r4v54, types: [java.lang.Object, h06] */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        r0 = new defpackage.m66(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01f1, code lost:
        if (defpackage.t49.G(900, r1) == r13) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0293, code lost:
        ((android.content.BroadcastReceiver.PendingResult) r1.G).finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x029a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x02b4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x02c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:?, code lost:
        r0 = new defpackage.m66(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0320, code lost:
        if (defpackage.t49.G(900, r1) == r6) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x041a, code lost:
        ((android.content.BroadcastReceiver.PendingResult) r1.H).finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0421, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x058f, code lost:
        if (r1 == r0) goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x05a3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x05ab, code lost:
        throw new java.lang.IllegalStateException("No se encontró ninguna cuenta de Google en este dispositivo.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x05ac, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x05b4, code lost:
        throw new java.lang.IllegalStateException("Inicio de sesión cancelado.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x05b5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x05b6, code lost:
        r1 = new defpackage.m66(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x05c1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x05c2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0177, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x018b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:186:0x02af, B:191:0x02c2] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:315:0x04b1, B:324:0x04da] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:80:0x0172, B:85:0x0185] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01fa A[Catch:{ all -> 0x018b, all -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01fc A[Catch:{ all -> 0x018b, all -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0209 A[Catch:{ all -> 0x018b, all -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0225 A[Catch:{ all -> 0x018b, all -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0227 A[Catch:{ all -> 0x018b, all -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x023f A[Catch:{ all -> 0x018b, all -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0244 A[Catch:{ all -> 0x018b, all -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x028d A[Catch:{ all -> 0x01c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x032e A[Catch:{ all -> 0x02c8, all -> 0x02b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x032f A[Catch:{ all -> 0x02c8, all -> 0x02b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0094 A[Catch:{ all -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a3 A[Catch:{ all -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x0583 A[Catch:{ GetCredentialCancellationException -> 0x05ac, NoCredentialException -> 0x05a3, CancellationException -> 0x05c1, Exception -> 0x05b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x0593 A[Catch:{ GetCredentialCancellationException -> 0x05ac, NoCredentialException -> 0x05a3, CancellationException -> 0x05c1, Exception -> 0x05b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bf  */
    public final Object s(Object obj) {
        Object obj2;
        p7 p7Var;
        String str;
        Object obj3;
        UserInfo j;
        p7 p7Var2;
        Object a;
        String str2;
        Object obj4;
        o81 o81;
        wc0 wc0;
        Object obj5;
        String str3;
        zn6 zn6;
        String str4;
        boolean z;
        boolean z2;
        boolean z3;
        String str5;
        TextToSpeech textToSpeech;
        Object obj6;
        String str6;
        zn6 zn62;
        String str7;
        int length;
        int i;
        String sb;
        boolean z4;
        String H2;
        TelecomManager telecomManager;
        Object obj7;
        Object obj8;
        h06 h06;
        h06 h062;
        j54 j54;
        int ordinal;
        j54 j542;
        kk0 kk0;
        j54 j543;
        j54 j544;
        String str8 = "";
        boolean z5 = false;
        zn6 zn63 = null;
        switch (this.A) {
            case b85.b:
                Object obj9 = p81.w;
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    p7Var2 = this.D;
                    Activity activity = (Activity) this.H;
                    str = (String) this.G;
                    String uuid = UUID.randomUUID().toString();
                    uuid.getClass();
                    MessageDigest instance = MessageDigest.getInstance("SHA-256");
                    byte[] bytes = uuid.getBytes(mo0.a);
                    bytes.getClass();
                    byte[] digest = instance.digest(bytes);
                    digest.getClass();
                    pv2 pv2 = new pv2(qs.e1(digest, str8, 30));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(pv2);
                    nv2 nv2 = new nv2(dt0.b1(arrayList));
                    mb1 mb1 = p7Var2.b;
                    this.C = p7Var2;
                    this.E = str;
                    this.F = uuid;
                    this.B = 1;
                    mb1.getClass();
                    a = mb1.a(activity, nv2, this);
                    if (a == obj9) {
                        return obj9;
                    }
                    str2 = uuid;
                } else if (i2 == 1) {
                    String str9 = (String) this.F;
                    str = (String) this.E;
                    p7Var2 = (p7) this.C;
                    o85.q(obj);
                    str2 = str9;
                    a = obj;
                } else if (i2 == 2) {
                    String str10 = (String) this.E;
                    p7 p7Var3 = (p7) this.C;
                    o85.q(obj);
                    p7Var = p7Var3;
                    str = str10;
                    obj3 = null;
                    j = rg3.t(p7Var.a).j();
                    if (j == null) {
                        this.C = obj3;
                        this.E = obj3;
                        this.F = obj3;
                        this.B = 3;
                        obj2 = p7Var.l(j, str, this);
                        break;
                    } else {
                        throw new IllegalStateException("No se pudo obtener la sesión. Inténtalo de nuevo.");
                    }
                } else if (i2 == 3) {
                    jb1 jb1 = (jb1) ((String) this.F);
                    f61 f61 = (f61) ((p7) this.C);
                    o85.q(obj);
                    obj2 = obj;
                    return new o66(obj2);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p7Var = p7Var2;
                jb1 jb12 = ((ov2) a).a;
                if (!(jb12 instanceof wc1) || !jb12.a.equals("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL")) {
                    throw new IllegalStateException("No se pudo obtener la credencial de Google.");
                }
                b7 b7Var = new b7(p7Var, gw8.r(jb12.b).c, str2, (f61) null, 1);
                obj3 = null;
                this.C = p7Var;
                this.E = str;
                this.F = null;
                this.B = 2;
                if (p7.a(p7Var, b7Var, this) == obj9) {
                    return obj9;
                }
                j = rg3.t(p7Var.a).j();
                if (j == null) {
                }
                break;
            case 1:
                en0 en0 = (en0) this.E;
                Object obj10 = p81.w;
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    wc0 it = en0.iterator();
                    o81 = (o81) this.D;
                    wc0 = it;
                } else if (i3 == 1) {
                    wc0 = (wc0) this.C;
                    o81 = (o81) this.D;
                    o85.q(obj);
                    obj4 = obj;
                    if (!((Boolean) obj4).booleanValue()) {
                        Object c = wc0.c();
                        Object a2 = rn0.a(en0.p());
                        if (a2 == null) {
                            obj5 = c;
                        } else {
                            obj5 = a2;
                        }
                        ar7.H(o81, (e81) null, (r81) null, new ng(obj5, (uj) this.F, (aq4) this.G, (aq4) this.H, (f61) null, 1), 3);
                    }
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.D = o81;
                this.C = wc0;
                this.B = 1;
                obj4 = wc0.a(this);
                if (obj4 == obj10) {
                    return obj10;
                }
                if (!((Boolean) obj4).booleanValue()) {
                }
                return vs7.a;
            case 2:
                vs7 vs7 = vs7.a;
                o81 o812 = (o81) this.D;
                Object obj11 = p81.w;
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    vp6 vp6 = ((CallAlertReceiver) this.F).c;
                    if (vp6 != null) {
                        c6 a3 = vp6.a();
                        this.D = o812;
                        this.C = null;
                        this.B = 1;
                        obj6 = gr8.H(a3, this);
                        if (obj6 == obj11) {
                            return obj11;
                        }
                    } else {
                        sg3.a0("settingsRepository");
                        throw null;
                    }
                } else if (i4 == 1) {
                    o81 o813 = (o81) ((zn6) this.C);
                    o85.q(obj);
                    obj6 = obj;
                } else if (i4 == 2) {
                    zn6 = (zn6) this.C;
                    o85.q(obj);
                    str3 = CallAlertReceiver.e;
                    if (str3 == null) {
                        ((BroadcastReceiver.PendingResult) this.H).finish();
                        return vs7;
                    }
                    if (CallAlertReceiver.f) {
                        StringBuilder sb2 = new StringBuilder();
                        int length2 = str3.length();
                        for (int i5 = 0; i5 < length2; i5++) {
                            char charAt = (char) str3.charAt(i5);
                            if (Character.isDigit((char) charAt)) {
                                sb2.append(charAt);
                            }
                        }
                        String H3 = uq3.H(sb2.toString());
                        if (zn6.q || (zn6.r && H3 != null)) {
                            String str11 = CallAlertReceiver.e;
                            CallAlertReceiver.f = true;
                            if (H3 == null) {
                                str4 = str3;
                            } else {
                                str4 = H3;
                            }
                            String a4 = CallAlertReceiver.a((CallAlertReceiver) this.F, (Context) this.G, str4);
                            if (zn6.v) {
                                n78 n78 = ((CallAlertReceiver) this.F).d;
                                if (n78 != null) {
                                    if (a4 == null) {
                                        str5 = str4;
                                    } else {
                                        str5 = a4;
                                    }
                                    String str12 = "Llamada de " + str5;
                                    if (n78.b && !d57.I0(str12) && (textToSpeech = n78.a) != null) {
                                        textToSpeech.speak(str12, 1, (Bundle) null, "UtilEsVoice");
                                    }
                                } else {
                                    sg3.a0("voiceNotifier");
                                    throw null;
                                }
                            }
                            if (!CallAlertReceiver.g) {
                                Context context = (Context) this.G;
                                KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService(KeyguardManager.class);
                                if (keyguardManager == null || !keyguardManager.isKeyguardLocked()) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                PowerManager powerManager = (PowerManager) context.getSystemService(PowerManager.class);
                                if (powerManager == null || powerManager.isInteractive()) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z || z2) {
                                    String str13 = a4;
                                    CallAlertReceiver callAlertReceiver = (CallAlertReceiver) this.F;
                                    Context context2 = (Context) this.G;
                                    if (H3 != null) {
                                        z5 = true;
                                    }
                                    CallAlertReceiver.b(callAlertReceiver, context2, str4, str13, z5);
                                } else {
                                    fi0 fi0 = fi0.a;
                                    Context context3 = (Context) this.G;
                                    if (H3 != null) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    fi0.b.post(new di0(context3, new o(18), str4, a4, z3));
                                }
                            }
                        }
                    }
                    ((BroadcastReceiver.PendingResult) this.H).finish();
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zn6 zn64 = (zn6) obj6;
                if (zn64 instanceof m66) {
                    zn64 = null;
                }
                zn6 = zn64;
                if (zn6 != null) {
                    if (zn6.q || zn6.r) {
                        str3 = (String) this.E;
                        if (str3 == null) {
                            this.D = null;
                            this.C = zn6;
                            this.B = 2;
                            break;
                        }
                        if (CallAlertReceiver.f) {
                        }
                    }
                }
                ((BroadcastReceiver.PendingResult) this.H).finish();
                return vs7;
            case 3:
                vs7 vs72 = vs7.a;
                o81 o814 = (o81) this.D;
                Object obj12 = p81.w;
                int i6 = this.B;
                if (i6 == 0) {
                    o85.q(obj);
                    vp6 vp62 = ((CallBlockReceiver) this.H).c;
                    if (vp62 != null) {
                        c6 a5 = vp62.a();
                        this.D = o814;
                        this.C = null;
                        this.B = 1;
                        obj7 = gr8.H(a5, this);
                        if (obj7 == obj12) {
                            return obj12;
                        }
                    } else {
                        sg3.a0("settingsRepository");
                        throw null;
                    }
                } else if (i6 == 1) {
                    o81 o815 = (o81) ((zn6) this.C);
                    o85.q(obj);
                    obj7 = obj;
                } else if (i6 == 2) {
                    zn62 = (zn6) this.C;
                    o85.q(obj);
                    str6 = CallBlockReceiver.d;
                    if (str6 != null) {
                        str7 = str8;
                    } else {
                        str7 = str6;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    length = str7.length();
                    for (i = 0; i < length; i++) {
                        char charAt2 = (char) str7.charAt(i);
                        if (Character.isDigit((char) charAt2)) {
                            sb3.append(charAt2);
                        }
                    }
                    sb = sb3.toString();
                    if (sb.length() != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (k57.u0(sb, "9953", false) && k57.m0(sb, "99", false)) {
                        z5 = true;
                    }
                    H2 = uq3.H(sb);
                    if (H2 == null) {
                        str8 = H2;
                    } else if (str6 != null) {
                        str8 = str6;
                    }
                    if (zn62.p || ((zn62.l && z4) || ((zn62.m && z5) || ((zn62.n && dh4.t(sb)) || (zn62.o && sb.length() > 0 && sg3.A((Context) this.F, "android.permission.READ_CONTACTS") && !dh4.u((Context) this.F, str8)))))) {
                        try {
                            telecomManager = (TelecomManager) ((Context) this.F).getSystemService(TelecomManager.class);
                            if (telecomManager != null) {
                                telecomManager.endCall();
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    ((BroadcastReceiver.PendingResult) this.G).finish();
                    return vs72;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zn6 zn65 = (zn6) obj7;
                if (!(zn65 instanceof m66)) {
                    zn63 = zn65;
                }
                zn62 = zn63;
                if (zn62 != null) {
                    if (zn62.p || zn62.l || zn62.m || zn62.n || zn62.o) {
                        str6 = (String) this.E;
                        if (str6 == null) {
                            this.D = o814;
                            this.C = zn62;
                            this.B = 2;
                            break;
                        }
                        if (str6 != null) {
                        }
                        StringBuilder sb32 = new StringBuilder();
                        length = str7.length();
                        while (i < length) {
                        }
                        sb = sb32.toString();
                        if (sb.length() != 0) {
                        }
                        z5 = true;
                        H2 = uq3.H(sb);
                        if (H2 == null) {
                        }
                        telecomManager = (TelecomManager) ((Context) this.F).getSystemService(TelecomManager.class);
                        if (telecomManager != null) {
                        }
                    }
                }
                ((BroadcastReceiver.PendingResult) this.G).finish();
                return vs72;
            case 4:
                return v(obj);
            case 5:
                return x(obj);
            case 6:
                return z(obj);
            case 7:
                Object obj13 = p81.w;
                int i7 = this.B;
                if (i7 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    dn1 dn1 = aw1.a;
                    obj8 = ar7.e0(cm1.y, new an2((Context) this.C, (Uri) this.D, (f61) null, 0), this);
                    if (obj8 == obj13) {
                        return obj13;
                    }
                } else if (i7 == 1) {
                    o85.q(obj);
                    obj8 = obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                byte[] bArr = (byte[]) obj8;
                if (bArr != null) {
                    ((aq4) this.E).setValue(bArr);
                    ((aq4) this.F).setValue(Boolean.TRUE);
                }
                aq4 aq4 = (aq4) this.G;
                if (bArr == null) {
                    z5 = true;
                }
                aq4.setValue(Boolean.valueOf(z5));
                ((aq4) this.H).setValue(Boolean.FALSE);
                return vs7.a;
            case 8:
                return A(obj);
            default:
                vs7 vs73 = vs7.a;
                in8 in8 = (in8) this.E;
                p81 p81 = p81.w;
                int i8 = this.B;
                if (i8 == 0) {
                    o85.q(obj);
                    if (in8.G0() != k54.w) {
                        ? obj14 = new Object();
                        ? obj15 = new Object();
                        try {
                            k54 k54 = (k54) this.F;
                            o81 o816 = (o81) this.G;
                            gs2 gs2 = (gs2) this.H;
                            this.C = obj14;
                            this.D = obj15;
                            this.B = 1;
                            kk0 kk02 = new kk0(1, rc9.a0(this));
                            kk02.v();
                            j54.Companion.getClass();
                            k54.getClass();
                            int ordinal2 = k54.ordinal();
                            if (ordinal2 == 2) {
                                j544 = j54.ON_CREATE;
                            } else if (ordinal2 == 3) {
                                j544 = j54.ON_START;
                            } else if (ordinal2 != 4) {
                                j54 = null;
                                ordinal = k54.ordinal();
                                if (ordinal != 2) {
                                    j543 = j54.ON_DESTROY;
                                } else if (ordinal == 3) {
                                    j543 = j54.ON_STOP;
                                } else if (ordinal != 4) {
                                    j542 = null;
                                    kk0 = kk02;
                                    p46 p46 = new p46(j54, obj14, o816, j542, kk0, new qq4(), gs2);
                                    obj15.w = p46;
                                    in8.x0(p46);
                                    if (kk0.t() == p81) {
                                        return p81;
                                    }
                                    h06 = obj15;
                                    h062 = obj14;
                                } else {
                                    j543 = j54.ON_PAUSE;
                                }
                                j542 = j543;
                                kk0 = kk02;
                                p46 p462 = new p46(j54, obj14, o816, j542, kk0, new qq4(), gs2);
                                obj15.w = p462;
                                in8.x0(p462);
                                if (kk0.t() == p81) {
                                }
                            } else {
                                j544 = j54.ON_RESUME;
                            }
                            j54 = j544;
                            ordinal = k54.ordinal();
                            if (ordinal != 2) {
                            }
                            j542 = j543;
                            kk0 = kk02;
                            p46 p4622 = new p46(j54, obj14, o816, j542, kk0, new qq4(), gs2);
                            obj15.w = p4622;
                            in8.x0(p4622);
                            if (kk0.t() == p81) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            h06 = obj15;
                            h062 = obj14;
                            el3 el3 = (el3) h062.w;
                            if (el3 != null) {
                                el3.o((CancellationException) null);
                            }
                            q54 q54 = (q54) h06.w;
                            if (q54 != null) {
                                in8.M0(q54);
                            }
                            throw th;
                        }
                    }
                    return vs73;
                } else if (i8 == 1) {
                    h06 = (h06) this.D;
                    h062 = (h06) this.C;
                    try {
                        o85.q(obj);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                el3 el32 = (el3) h062.w;
                if (el32 != null) {
                    el32.o((CancellationException) null);
                }
                q54 q542 = (q54) h06.w;
                if (q542 != null) {
                    in8.M0(q542);
                }
                return vs73;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f7(lo2 lo2, String str, String str2, f61 f61) {
        super(2, f61);
        this.A = 6;
        this.H = lo2;
        this.F = str;
        this.G = str2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f7(t84 t84, zy2 zy2, be8 be8, f61 f61) {
        super(2, f61);
        this.A = 4;
        this.F = t84;
        this.G = zy2;
        this.H = be8;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f7(p7 p7Var, Activity activity, String str, f61 f61) {
        super(2, f61);
        this.A = 0;
        this.D = p7Var;
        this.H = activity;
        this.G = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f7(Object obj, Object obj2, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.G = obj;
        this.H = obj2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f7(Object obj, Object obj2, Object obj3, Object obj4, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.E = obj;
        this.F = obj2;
        this.G = obj3;
        this.H = obj4;
    }
}
