package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import cu.lestebang.utiletecsa.data.repository.forum.ForumPostInsertDto;
import cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService;
import io.github.jan.supabase.auth.user.UserInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* renamed from: p6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p6 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p6(x42 x42, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = x42;
        this.D = obj;
        this.E = obj2;
        this.F = obj3;
        this.G = obj4;
        this.H = obj5;
        this.I = obj6;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((p6) o((f61) obj2, (o81) obj)).s(vs7);
            case 1:
                return ((p6) o((f61) obj2, (o81) obj)).s(vs7);
            case 2:
                return ((p6) o((f61) obj2, (o81) obj)).s(vs7);
            case 3:
                return ((p6) o((f61) obj2, (o81) obj)).s(vs7);
            case 4:
                ((p6) o((f61) obj2, (o81) obj)).s(vs7);
                return p81.w;
            case 5:
                return ((p6) o((f61) obj2, (o81) obj)).s(vs7);
            case 6:
                return ((p6) o((f61) obj2, (o81) obj)).s(vs7);
            default:
                return ((p6) o((f61) obj2, (fi2) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.I;
        Object obj3 = this.H;
        switch (i) {
            case b85.b:
                Object obj4 = obj2;
                Object obj5 = obj3;
                String str = (String) this.F;
                String str2 = (String) this.G;
                return new p6((p7) this.D, str, str2, (String) obj5, (String) obj4, f61);
            case 1:
                Object obj6 = obj3;
                Object obj7 = obj2;
                return new p6((x42) this.C, (h06) this.D, (h06) this.E, (s83) this.F, this.G, (h06) obj6, (g72) obj7, f61, 1);
            case 2:
                Object obj8 = obj3;
                Object obj9 = this.E;
                s83 s83 = (s83) this.D;
                g72 g72 = (g72) this.G;
                return new p6((x42) this.C, s83, obj9, (v75) this.F, g72, (mi4) obj8, (mx5) obj2, f61, 2);
            case 3:
                p6 p6Var = new p6((lo2) obj3, (ez4) obj2, f61);
                p6Var.G = obj;
                return p6Var;
            case 4:
                ad5 ad5 = (ad5) obj2;
                List list = (List) this.G;
                p6 p6Var2 = new p6((uj) this.F, list, (bd5) obj3, ad5, f61);
                p6Var2.E = obj;
                return p6Var2;
            case 5:
                p6 p6Var3 = new p6((hq4) this.G, (mq4) obj3, (vr2) obj2, f61);
                p6Var3.F = obj;
                return p6Var3;
            case 6:
                return new p6((UssdAutoUpdaterService) obj3, (String) this.F, (vr2) obj2, f61);
            default:
                ad0 ad0 = (ad0) obj3;
                Context context = (Context) obj2;
                p6 p6Var4 = new p6((ContentResolver) this.E, (Uri) this.F, (sy7) this.G, ad0, context, f61);
                p6Var4.D = obj;
                return p6Var4;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: p7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v51, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: lo2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v73, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v67, resolved type: mq4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v74, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: oq4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v55, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v59, resolved type: cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v67, resolved type: qq4} */
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
    /* JADX WARNING: Can't wrap try/catch for region: R(5:155|156|157|206|207) */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0507, code lost:
        if (defpackage.lo2.b(r4, r2, r5) == r3) goto L_0x0509;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0563, code lost:
        if (r0 == r9) goto L_0x0565;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0134, code lost:
        if (r7 == r0) goto L_0x01d7;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Missing exception handler attribute for start block: B:206:0x050b */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0295 A[Catch:{ all -> 0x02a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02b4 A[Catch:{ all -> 0x02a0 }, LOOP:1: B:126:0x02a8->B:130:0x02b4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0499 A[Catch:{ all -> 0x04ad }, LOOP:2: B:186:0x0493->B:188:0x0499, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x04be A[Catch:{ all -> 0x04ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x04ee  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04f6 A[SYNTHETIC, Splitter:B:202:0x04f6] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0607  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0609  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078 A[Catch:{ all -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x061a  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x061d  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x06ef A[Catch:{ CancellationException -> 0x0702, Exception -> 0x06f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0294 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0161 A[Catch:{ all -> 0x0173 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:124:0x02a6=Splitter:B:124:0x02a6, B:113:0x028c=Splitter:B:113:0x028c} */
    public final java.lang.Object s(java.lang.Object r25) {
        /*
            r24 = this;
            r5 = r24
            int r0 = r5.A
            r1 = 3
            r6 = 0
            r2 = 2
            r7 = 1
            r8 = 0
            switch(r0) {
                case 0: goto L_0x0674;
                case 1: goto L_0x0629;
                case 2: goto L_0x0533;
                case 3: goto L_0x034a;
                case 4: goto L_0x02ba;
                case 5: goto L_0x01f6;
                case 6: goto L_0x00b0;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.Object r0 = r5.G
            r1 = r0
            sy7 r1 = (defpackage.sy7) r1
            java.lang.Object r0 = r5.E
            r3 = r0
            android.content.ContentResolver r3 = (android.content.ContentResolver) r3
            p81 r0 = defpackage.p81.w
            int r4 = r5.B
            if (r4 == 0) goto L_0x0047
            if (r4 == r7) goto L_0x0038
            if (r4 != r2) goto L_0x0031
            java.lang.Object r4 = r5.C
            wc0 r4 = (defpackage.wc0) r4
            java.lang.Object r6 = r5.D
            fi2 r6 = (defpackage.fi2) r6
            defpackage.o85.q(r25)     // Catch:{ all -> 0x002e }
            r8 = r4
            r4 = r6
            goto L_0x005e
        L_0x002e:
            r0 = move-exception
            goto L_0x00ac
        L_0x0031:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r0)
            goto L_0x00ab
        L_0x0038:
            java.lang.Object r4 = r5.C
            wc0 r4 = (defpackage.wc0) r4
            java.lang.Object r6 = r5.D
            fi2 r6 = (defpackage.fi2) r6
            defpackage.o85.q(r25)     // Catch:{ all -> 0x002e }
            r8 = r6
            r6 = r25
            goto L_0x0070
        L_0x0047:
            defpackage.o85.q(r25)
            java.lang.Object r4 = r5.D
            fi2 r4 = (defpackage.fi2) r4
            java.lang.Object r8 = r5.F
            android.net.Uri r8 = (android.net.Uri) r8
            r3.registerContentObserver(r8, r6, r1)
            java.lang.Object r6 = r5.H     // Catch:{ all -> 0x002e }
            ad0 r6 = (defpackage.ad0) r6     // Catch:{ all -> 0x002e }
            wc0 r8 = new wc0     // Catch:{ all -> 0x002e }
            r8.<init>(r6)     // Catch:{ all -> 0x002e }
        L_0x005e:
            r5.D = r4     // Catch:{ all -> 0x002e }
            r5.C = r8     // Catch:{ all -> 0x002e }
            r5.B = r7     // Catch:{ all -> 0x002e }
            java.lang.Object r6 = r8.a(r5)     // Catch:{ all -> 0x002e }
            if (r6 != r0) goto L_0x006b
            goto L_0x009e
        L_0x006b:
            r23 = r8
            r8 = r4
            r4 = r23
        L_0x0070:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x002e }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x002e }
            if (r6 == 0) goto L_0x00a6
            r4.c()     // Catch:{ all -> 0x002e }
            java.lang.Object r6 = r5.I     // Catch:{ all -> 0x002e }
            android.content.Context r6 = (android.content.Context) r6     // Catch:{ all -> 0x002e }
            tp4 r9 = defpackage.ac8.a     // Catch:{ all -> 0x002e }
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ all -> 0x002e }
            java.lang.String r9 = "animator_duration_scale"
            r10 = 1065353216(0x3f800000, float:1.0)
            float r6 = android.provider.Settings.Global.getFloat(r6, r9, r10)     // Catch:{ all -> 0x002e }
            java.lang.Float r9 = new java.lang.Float     // Catch:{ all -> 0x002e }
            r9.<init>(r6)     // Catch:{ all -> 0x002e }
            r5.D = r8     // Catch:{ all -> 0x002e }
            r5.C = r4     // Catch:{ all -> 0x002e }
            r5.B = r2     // Catch:{ all -> 0x002e }
            java.lang.Object r6 = r8.k(r9, r5)     // Catch:{ all -> 0x002e }
            if (r6 != r0) goto L_0x00a0
        L_0x009e:
            r8 = r0
            goto L_0x00ab
        L_0x00a0:
            r23 = r8
            r8 = r4
            r4 = r23
            goto L_0x005e
        L_0x00a6:
            r3.unregisterContentObserver(r1)
            vs7 r8 = defpackage.vs7.a
        L_0x00ab:
            return r8
        L_0x00ac:
            r3.unregisterContentObserver(r1)
            throw r0
        L_0x00b0:
            p81 r0 = defpackage.p81.w
            int r3 = r5.B
            if (r3 == 0) goto L_0x0114
            if (r3 == r7) goto L_0x00fe
            if (r3 == r2) goto L_0x00e0
            if (r3 != r1) goto L_0x00d9
            java.lang.Object r0 = r5.G
            vr2 r0 = (defpackage.vr2) r0
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r5.E
            cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences r0 = (cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences) r0
            java.lang.Object r1 = r5.D
            cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService r1 = (cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService) r1
            java.lang.Object r2 = r5.C
            oq4 r2 = (defpackage.oq4) r2
            defpackage.o85.q(r25)     // Catch:{ all -> 0x00d6 }
            r4 = r1
            r1 = r25
            goto L_0x01db
        L_0x00d6:
            r0 = move-exception
            goto L_0x01f2
        L_0x00d9:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r0)
            goto L_0x01eb
        L_0x00e0:
            java.lang.Object r2 = r5.G
            vr2 r2 = (defpackage.vr2) r2
            java.lang.Object r3 = r5.E
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r5.D
            cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService r4 = (cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService) r4
            java.lang.Object r6 = r5.C
            oq4 r6 = (defpackage.oq4) r6
            defpackage.o85.q(r25)     // Catch:{ all -> 0x00fa }
            r9 = r6
            r6 = r3
            r3 = r9
            r9 = r2
            r2 = r25
            goto L_0x0159
        L_0x00fa:
            r0 = move-exception
            r2 = r6
            goto L_0x01f2
        L_0x00fe:
            java.lang.Object r3 = r5.G
            vr2 r3 = (defpackage.vr2) r3
            java.lang.Object r4 = r5.E
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = r5.D
            cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService r6 = (cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService) r6
            java.lang.Object r7 = r5.C
            oq4 r7 = (defpackage.oq4) r7
            defpackage.o85.q(r25)
            r9 = r3
            r3 = r7
            goto L_0x0138
        L_0x0114:
            defpackage.o85.q(r25)
            java.lang.Object r3 = r5.H
            r6 = r3
            cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService r6 = (cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService) r6
            qq4 r3 = r6.D
            java.lang.Object r4 = r5.F
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r9 = r5.I
            vr2 r9 = (defpackage.vr2) r9
            r5.C = r3
            r5.D = r6
            r5.E = r4
            r5.G = r9
            r5.B = r7
            java.lang.Object r7 = r3.a(r5)
            if (r7 != r0) goto L_0x0138
            goto L_0x01d7
        L_0x0138:
            dv7 r7 = r6.z     // Catch:{ all -> 0x0173 }
            if (r7 == 0) goto L_0x01ec
            dy7 r7 = (defpackage.dy7) r7     // Catch:{ all -> 0x0173 }
            di2 r7 = r7.d()     // Catch:{ all -> 0x0173 }
            r5.C = r3     // Catch:{ all -> 0x0173 }
            r5.D = r6     // Catch:{ all -> 0x0173 }
            r5.E = r4     // Catch:{ all -> 0x0173 }
            r5.G = r9     // Catch:{ all -> 0x0173 }
            r5.B = r2     // Catch:{ all -> 0x0173 }
            java.lang.Object r2 = defpackage.gr8.H(r7, r5)     // Catch:{ all -> 0x0173 }
            if (r2 != r0) goto L_0x0154
            goto L_0x01d7
        L_0x0154:
            r23 = r6
            r6 = r4
            r4 = r23
        L_0x0159:
            cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences r2 = (cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences) r2     // Catch:{ all -> 0x0173 }
            boolean r7 = r2.getUssdAutoEnabled()     // Catch:{ all -> 0x0173 }
            if (r7 == 0) goto L_0x01e6
            r7 = 2131821611(0x7f11042b, float:1.927597E38)
            java.lang.String r7 = r4.getString(r7)     // Catch:{ all -> 0x0173 }
            boolean r7 = defpackage.sg3.e(r6, r7)     // Catch:{ all -> 0x0173 }
            if (r7 == 0) goto L_0x0177
            boolean r6 = r2.getUssdAutoAfterCallEnabled()     // Catch:{ all -> 0x0173 }
            goto L_0x019f
        L_0x0173:
            r0 = move-exception
            r2 = r3
            goto L_0x01f2
        L_0x0177:
            r7 = 2131821614(0x7f11042e, float:1.9275976E38)
            java.lang.String r7 = r4.getString(r7)     // Catch:{ all -> 0x0173 }
            boolean r7 = defpackage.sg3.e(r6, r7)     // Catch:{ all -> 0x0173 }
            if (r7 == 0) goto L_0x0189
            boolean r6 = r2.getUssdAutoAfterSmsEnabled()     // Catch:{ all -> 0x0173 }
            goto L_0x019f
        L_0x0189:
            r7 = 2131821612(0x7f11042c, float:1.9275972E38)
            java.lang.String r7 = r4.getString(r7)     // Catch:{ all -> 0x0173 }
            boolean r6 = defpackage.sg3.e(r6, r7)     // Catch:{ all -> 0x0173 }
            if (r6 == 0) goto L_0x019b
            boolean r6 = r2.getUssdAutoAfterDataOffEnabled()     // Catch:{ all -> 0x0173 }
            goto L_0x019f
        L_0x019b:
            boolean r6 = r2.getUssdAutoPeriodicEnabled()     // Catch:{ all -> 0x0173 }
        L_0x019f:
            if (r6 == 0) goto L_0x01e6
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0173 }
            long r10 = r4.F     // Catch:{ all -> 0x0173 }
            long r10 = r6 - r10
            r12 = 60000(0xea60, double:2.9644E-319)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 < 0) goto L_0x01e6
            r4.F = r6     // Catch:{ all -> 0x0173 }
            java.lang.Object r6 = r9.y(r2)     // Catch:{ all -> 0x0173 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0173 }
            java.lang.CharSequence r6 = defpackage.d57.k1(r6)     // Catch:{ all -> 0x0173 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0173 }
            int r7 = r6.length()     // Catch:{ all -> 0x0173 }
            if (r7 != 0) goto L_0x01c7
            goto L_0x01e6
        L_0x01c7:
            r5.C = r3     // Catch:{ all -> 0x0173 }
            r5.D = r4     // Catch:{ all -> 0x0173 }
            r5.E = r2     // Catch:{ all -> 0x0173 }
            r5.G = r8     // Catch:{ all -> 0x0173 }
            r5.B = r1     // Catch:{ all -> 0x0173 }
            java.lang.Object r1 = cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService.b(r4, r6, r2, r5)     // Catch:{ all -> 0x0173 }
            if (r1 != r0) goto L_0x01d9
        L_0x01d7:
            r8 = r0
            goto L_0x01eb
        L_0x01d9:
            r0 = r2
            r2 = r3
        L_0x01db:
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00d6 }
            d37 r3 = cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService.T     // Catch:{ all -> 0x00d6 }
            r4.j(r0, r1)     // Catch:{ all -> 0x00d6 }
            cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService.d(r4, r1)     // Catch:{ all -> 0x00d6 }
            r3 = r2
        L_0x01e6:
            r3.k(r8)
            vs7 r8 = defpackage.vs7.a
        L_0x01eb:
            return r8
        L_0x01ec:
            java.lang.String r0 = "userPreferencesDataSource"
            defpackage.sg3.a0(r0)     // Catch:{ all -> 0x0173 }
            throw r8     // Catch:{ all -> 0x0173 }
        L_0x01f2:
            r2.k(r8)
            throw r0
        L_0x01f6:
            java.lang.Object r0 = r5.H
            mq4 r0 = (defpackage.mq4) r0
            p81 r1 = defpackage.p81.w
            int r3 = r5.B
            if (r3 == 0) goto L_0x023b
            if (r3 == r7) goto L_0x0224
            if (r3 != r2) goto L_0x021d
            java.lang.Object r0 = r5.D
            r1 = r0
            mq4 r1 = (defpackage.mq4) r1
            java.lang.Object r0 = r5.C
            r2 = r0
            oq4 r2 = (defpackage.oq4) r2
            java.lang.Object r0 = r5.F
            r3 = r0
            jq4 r3 = (defpackage.jq4) r3
            defpackage.o85.q(r25)     // Catch:{ all -> 0x021a }
            r0 = r25
            goto L_0x028c
        L_0x021a:
            r0 = move-exception
            goto L_0x02a6
        L_0x021d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r0)
            goto L_0x029f
        L_0x0224:
            java.lang.Object r0 = r5.E
            mq4 r0 = (defpackage.mq4) r0
            java.lang.Object r3 = r5.D
            vr2 r3 = (defpackage.vr2) r3
            java.lang.Object r4 = r5.C
            oq4 r4 = (defpackage.oq4) r4
            java.lang.Object r6 = r5.F
            jq4 r6 = (defpackage.jq4) r6
            defpackage.o85.q(r25)
            r7 = r6
            r6 = r3
        L_0x0239:
            r3 = r0
            goto L_0x0277
        L_0x023b:
            defpackage.o85.q(r25)
            java.lang.Object r3 = r5.F
            o81 r3 = (defpackage.o81) r3
            jq4 r4 = new jq4
            java.lang.Object r6 = r5.G
            hq4 r6 = (defpackage.hq4) r6
            e81 r3 = r3.k()
            me6 r9 = defpackage.me6.E
            c81 r3 = r3.a0(r9)
            r3.getClass()
            el3 r3 = (defpackage.el3) r3
            r4.<init>(r6, r3)
            defpackage.mq4.a(r0, r4)
            qq4 r3 = r0.b
            java.lang.Object r6 = r5.I
            vr2 r6 = (defpackage.vr2) r6
            r5.F = r4
            r5.C = r3
            r5.D = r6
            r5.E = r0
            r5.B = r7
            java.lang.Object r7 = r3.a(r5)
            if (r7 != r1) goto L_0x0274
            goto L_0x0287
        L_0x0274:
            r7 = r4
            r4 = r3
            goto L_0x0239
        L_0x0277:
            r5.F = r7     // Catch:{ all -> 0x02a2 }
            r5.C = r4     // Catch:{ all -> 0x02a2 }
            r5.D = r3     // Catch:{ all -> 0x02a2 }
            r5.E = r8     // Catch:{ all -> 0x02a2 }
            r5.B = r2     // Catch:{ all -> 0x02a2 }
            java.lang.Object r0 = r6.y(r5)     // Catch:{ all -> 0x02a2 }
            if (r0 != r1) goto L_0x0289
        L_0x0287:
            r8 = r1
            goto L_0x029f
        L_0x0289:
            r1 = r3
            r2 = r4
            r3 = r7
        L_0x028c:
            java.util.concurrent.atomic.AtomicReference r1 = r1.a     // Catch:{ all -> 0x02a0 }
        L_0x028e:
            boolean r4 = r1.compareAndSet(r3, r8)     // Catch:{ all -> 0x02a0 }
            if (r4 == 0) goto L_0x0295
            goto L_0x029b
        L_0x0295:
            java.lang.Object r4 = r1.get()     // Catch:{ all -> 0x02a0 }
            if (r4 == r3) goto L_0x028e
        L_0x029b:
            r2.k(r8)
            r8 = r0
        L_0x029f:
            return r8
        L_0x02a0:
            r0 = move-exception
            goto L_0x02b6
        L_0x02a2:
            r0 = move-exception
            r1 = r3
            r2 = r4
            r3 = r7
        L_0x02a6:
            java.util.concurrent.atomic.AtomicReference r1 = r1.a     // Catch:{ all -> 0x02a0 }
        L_0x02a8:
            boolean r4 = r1.compareAndSet(r3, r8)     // Catch:{ all -> 0x02a0 }
            if (r4 != 0) goto L_0x02b5
            java.lang.Object r4 = r1.get()     // Catch:{ all -> 0x02a0 }
            if (r4 != r3) goto L_0x02b5
            goto L_0x02a8
        L_0x02b5:
            throw r0     // Catch:{ all -> 0x02a0 }
        L_0x02b6:
            r2.k(r8)
            throw r0
        L_0x02ba:
            p81 r0 = defpackage.p81.w
            int r3 = r5.B
            if (r3 == 0) goto L_0x02e9
            if (r3 == r7) goto L_0x02d9
            if (r3 != r2) goto L_0x02d2
            java.lang.Object r3 = r5.C
            x17 r3 = (defpackage.x17) r3
            java.lang.Object r4 = r5.E
            o81 r4 = (defpackage.o81) r4
            defpackage.o85.q(r25)
            r11 = r3
            r3 = r4
            goto L_0x0303
        L_0x02d2:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r0)
            goto L_0x0346
        L_0x02d9:
            java.lang.Object r3 = r5.D
            mo1 r3 = (defpackage.mo1) r3
            java.lang.Object r4 = r5.C
            x17 r4 = (defpackage.x17) r4
            java.lang.Object r6 = r5.E
            o81 r6 = (defpackage.o81) r6
            defpackage.o85.q(r25)
            goto L_0x0337
        L_0x02e9:
            defpackage.o85.q(r25)
            java.lang.Object r3 = r5.E
            o81 r3 = (defpackage.o81) r3
            java.lang.Float r4 = new java.lang.Float
            r6 = 1036831949(0x3dcccccd, float:0.1)
            r4.<init>(r6)
            x17 r6 = new x17
            r9 = 1058642330(0x3f19999a, float:0.6)
            r10 = 1128792064(0x43480000, float:200.0)
            r6.<init>(r9, r10, r4)
            r11 = r6
        L_0x0303:
            w6 r9 = new w6
            java.lang.Object r4 = r5.F
            r10 = r4
            uj r10 = (defpackage.uj) r10
            java.lang.Object r4 = r5.G
            r12 = r4
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r4 = r5.H
            r13 = r4
            bd5 r13 = (defpackage.bd5) r13
            java.lang.Object r4 = r5.I
            r14 = r4
            ad5 r14 = (defpackage.ad5) r14
            r15 = 0
            r16 = 10
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            mo1 r4 = defpackage.ar7.j(r3, r8, r9, r1)
            r5.E = r3
            r5.C = r11
            r5.D = r4
            r5.B = r7
            r9 = 650(0x28a, double:3.21E-321)
            java.lang.Object r6 = defpackage.t49.G(r9, r5)
            if (r6 != r0) goto L_0x0334
            goto L_0x0345
        L_0x0334:
            r6 = r3
            r3 = r4
            r4 = r11
        L_0x0337:
            r5.E = r6
            r5.C = r4
            r5.D = r8
            r5.B = r2
            java.lang.Object r3 = r3.I(r5)
            if (r3 != r0) goto L_0x0347
        L_0x0345:
            r8 = r0
        L_0x0346:
            return r8
        L_0x0347:
            r11 = r4
            r3 = r6
            goto L_0x0303
        L_0x034a:
            java.lang.Object r0 = r5.G
            o81 r0 = (defpackage.o81) r0
            p81 r3 = defpackage.p81.w
            int r4 = r5.B
            if (r4 == 0) goto L_0x03b3
            if (r4 == r7) goto L_0x039a
            if (r4 == r2) goto L_0x037c
            if (r4 == r1) goto L_0x0361
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r0)
            goto L_0x0530
        L_0x0361:
            java.lang.Object r0 = r5.E
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Object r1 = r5.F
            java.lang.String r1 = (java.lang.String) r1
            io.github.jan.supabase.auth.user.UserInfo r1 = (io.github.jan.supabase.auth.user.UserInfo) r1
            java.lang.Object r1 = r5.D
            ez4 r1 = (defpackage.ez4) r1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r5.C
            lo2 r1 = (defpackage.lo2) r1
            f61 r1 = (defpackage.f61) r1
            defpackage.o85.q(r25)     // Catch:{ all -> 0x050b }
            goto L_0x050b
        L_0x037c:
            java.lang.Object r0 = r5.E
            hm5 r0 = (defpackage.hm5) r0
            java.lang.Object r0 = r5.F
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r5.D
            ez4 r0 = (defpackage.ez4) r0
            f61 r0 = (defpackage.f61) r0
            java.lang.Object r0 = r5.C
            r4 = r0
            lo2 r4 = (defpackage.lo2) r4
            defpackage.o85.q(r25)     // Catch:{ all -> 0x0397 }
            r0 = r25
            goto L_0x04ef
        L_0x0397:
            r0 = move-exception
            goto L_0x04f4
        L_0x039a:
            java.lang.Object r4 = r5.E
            io.github.jan.supabase.auth.user.UserInfo r4 = (io.github.jan.supabase.auth.user.UserInfo) r4
            java.lang.Object r6 = r5.F
            java.lang.String r6 = (java.lang.String) r6
            f61 r6 = (defpackage.f61) r6
            java.lang.Object r6 = r5.D
            ez4 r6 = (defpackage.ez4) r6
            java.lang.Object r7 = r5.C
            lo2 r7 = (defpackage.lo2) r7
            defpackage.o85.q(r25)     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
            r9 = r7
            r7 = r25
            goto L_0x03fb
        L_0x03b3:
            defpackage.o85.q(r25)
            java.lang.Object r4 = r5.H
            lo2 r4 = (defpackage.lo2) r4
            java.lang.Object r6 = r5.I
            ez4 r6 = (defpackage.ez4) r6
            j77 r9 = r4.a     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
            uu r9 = defpackage.rg3.t(r9)     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
            io.github.jan.supabase.auth.user.UserInfo r9 = r9.j()     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
            if (r9 == 0) goto L_0x051c
            java.lang.String r10 = r6.a     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
            boolean r10 = defpackage.d57.I0(r10)     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
            if (r10 != 0) goto L_0x0514
            java.lang.String r10 = r6.b     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
            boolean r10 = defpackage.d57.I0(r10)     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
            if (r10 != 0) goto L_0x050c
            byte[] r10 = r6.d     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
            if (r10 == 0) goto L_0x0402
            java.lang.String r11 = r9.getId()     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
            r5.G = r0     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
            r5.C = r4     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
            r5.D = r6     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
            r5.F = r8     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
            r5.E = r9     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
            r5.B = r7     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
            java.lang.Object r7 = defpackage.lo2.h(r4, r11, r10, r5)     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
            if (r7 != r3) goto L_0x03f6
            goto L_0x0509
        L_0x03f6:
            r23 = r9
            r9 = r4
            r4 = r23
        L_0x03fb:
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
            r15 = r9
            r9 = r4
            r4 = r15
            r15 = r7
            goto L_0x0403
        L_0x0402:
            r15 = r8
        L_0x0403:
            j77 r7 = r4.a     // Catch:{ all -> 0x04ad }
            java.lang.String r10 = "forum_posts"
            hm5 r7 = defpackage.f55.i(r7, r10)     // Catch:{ all -> 0x04ad }
            gm5 r10 = r7.a     // Catch:{ all -> 0x04ad }
            cu.lestebang.utiletecsa.data.repository.forum.ForumPostInsertDto r11 = new cu.lestebang.utiletecsa.data.repository.forum.ForumPostInsertDto     // Catch:{ all -> 0x04ad }
            r12 = r10
            java.lang.String r10 = r9.getId()     // Catch:{ all -> 0x04ad }
            java.lang.String r9 = defpackage.lo2.c(r4, r9)     // Catch:{ all -> 0x04ad }
            r13 = r12
            java.lang.String r12 = r6.c     // Catch:{ all -> 0x04ad }
            java.lang.String r14 = r6.a     // Catch:{ all -> 0x04ad }
            java.lang.CharSequence r14 = defpackage.d57.k1(r14)     // Catch:{ all -> 0x04ad }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x04ad }
            r1 = 50
            java.lang.String r1 = defpackage.d57.i1(r1, r14)     // Catch:{ all -> 0x04ad }
            java.lang.String r6 = r6.b     // Catch:{ all -> 0x04ad }
            java.lang.CharSequence r6 = defpackage.d57.k1(r6)     // Catch:{ all -> 0x04ad }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x04ad }
            r14 = 200(0xc8, float:2.8E-43)
            java.lang.String r14 = defpackage.d57.i1(r14, r6)     // Catch:{ all -> 0x04ad }
            r23 = r13
            r13 = r1
            r1 = r23
            r23 = r11
            r11 = r9
            r9 = r23
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x04ad }
            java.util.List r6 = defpackage.sg3.D(r9)     // Catch:{ all -> 0x04ad }
            t77 r9 = r1.d     // Catch:{ all -> 0x04ad }
            ol3 r10 = defpackage.pl3.d     // Catch:{ all -> 0x04ad }
            java.lang.Class<java.util.List> r11 = java.util.List.class
            gs3 r12 = defpackage.gs3.c     // Catch:{ all -> 0x04ad }
            java.lang.Class<cu.lestebang.utiletecsa.data.repository.forum.ForumPostInsertDto> r12 = cu.lestebang.utiletecsa.data.repository.forum.ForumPostInsertDto.class
            as3 r12 = defpackage.b26.b(r12)     // Catch:{ all -> 0x04ad }
            gs3 r12 = defpackage.x91.C(r12)     // Catch:{ all -> 0x04ad }
            as3 r11 = defpackage.b26.c(r11, r12)     // Catch:{ all -> 0x04ad }
            f96 r9 = (defpackage.f96) r9     // Catch:{ all -> 0x04ad }
            java.lang.String r6 = r9.t(r11, r6)     // Catch:{ all -> 0x04ad }
            r10.getClass()     // Catch:{ all -> 0x04ad }
            dm3 r9 = kotlinx.serialization.json.JsonElement.Companion     // Catch:{ all -> 0x04ad }
            zr3 r9 = r9.serializer()     // Catch:{ all -> 0x04ad }
            zr3 r9 = (defpackage.zr3) r9     // Catch:{ all -> 0x04ad }
            java.lang.Object r6 = r10.b(r9, r6)     // Catch:{ all -> 0x04ad }
            kotlinx.serialization.json.JsonElement r6 = (kotlinx.serialization.json.JsonElement) r6     // Catch:{ all -> 0x04ad }
            kotlinx.serialization.json.JsonArray r6 = defpackage.em3.d(r6)     // Catch:{ all -> 0x04ad }
            yc3 r9 = new yc3     // Catch:{ all -> 0x04ad }
            java.lang.String r10 = r7.c     // Catch:{ all -> 0x04ad }
            bm5 r11 = r1.c     // Catch:{ all -> 0x04ad }
            ku4 r11 = r11.v     // Catch:{ all -> 0x04ad }
            r9.<init>(r10, r11)     // Catch:{ all -> 0x04ad }
            r9.e = r6     // Catch:{ all -> 0x04ad }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x04ad }
            r10.<init>()     // Catch:{ all -> 0x04ad }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x04ad }
        L_0x0493:
            boolean r11 = r6.hasNext()     // Catch:{ all -> 0x04ad }
            if (r11 == 0) goto L_0x04b0
            java.lang.Object r11 = r6.next()     // Catch:{ all -> 0x04ad }
            kotlinx.serialization.json.JsonElement r11 = (kotlinx.serialization.json.JsonElement) r11     // Catch:{ all -> 0x04ad }
            kotlinx.serialization.json.JsonObject r11 = defpackage.em3.e(r11)     // Catch:{ all -> 0x04ad }
            java.util.Set r11 = r11.keySet()     // Catch:{ all -> 0x04ad }
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch:{ all -> 0x04ad }
            defpackage.it0.h0(r10, r11)     // Catch:{ all -> 0x04ad }
            goto L_0x0493
        L_0x04ad:
            r0 = move-exception
            r2 = r15
            goto L_0x04f4
        L_0x04b0:
            java.util.Set r6 = defpackage.dt0.f1(r10)     // Catch:{ all -> 0x04ad }
            java.util.List r17 = defpackage.dt0.b1(r6)     // Catch:{ all -> 0x04ad }
            boolean r6 = r17.isEmpty()     // Catch:{ all -> 0x04ad }
            if (r6 != 0) goto L_0x04d7
            java.util.LinkedHashMap r6 = r9.f     // Catch:{ all -> 0x04ad }
            java.lang.String r10 = "columns"
            java.lang.String r18 = ","
            r21 = 0
            r22 = 62
            r19 = 0
            r20 = 0
            java.lang.String r11 = defpackage.dt0.E0(r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x04ad }
            java.util.List r11 = defpackage.sg3.D(r11)     // Catch:{ all -> 0x04ad }
            r6.put(r10, r11)     // Catch:{ all -> 0x04ad }
        L_0x04d7:
            h66 r6 = defpackage.h66.a     // Catch:{ all -> 0x04ad }
            java.lang.String r7 = r7.b     // Catch:{ all -> 0x04ad }
            r5.G = r0     // Catch:{ all -> 0x04ad }
            r5.C = r4     // Catch:{ all -> 0x04ad }
            r5.D = r8     // Catch:{ all -> 0x04ad }
            r5.F = r15     // Catch:{ all -> 0x04ad }
            r5.E = r8     // Catch:{ all -> 0x04ad }
            r5.B = r2     // Catch:{ all -> 0x04ad }
            java.lang.Object r0 = r6.a(r1, r7, r9, r5)     // Catch:{ all -> 0x04ad }
            if (r0 != r3) goto L_0x04ee
            goto L_0x0509
        L_0x04ee:
            r2 = r15
        L_0x04ef:
            jm5 r0 = (defpackage.jm5) r0     // Catch:{ all -> 0x0397 }
            vs7 r0 = defpackage.vs7.a     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
            goto L_0x052b
        L_0x04f4:
            if (r2 == 0) goto L_0x050b
            r5.G = r8     // Catch:{ all -> 0x050b }
            r5.C = r8     // Catch:{ all -> 0x050b }
            r5.D = r8     // Catch:{ all -> 0x050b }
            r5.F = r8     // Catch:{ all -> 0x050b }
            r5.E = r0     // Catch:{ all -> 0x050b }
            r1 = 3
            r5.B = r1     // Catch:{ all -> 0x050b }
            java.lang.Object r1 = defpackage.lo2.b(r4, r2, r5)     // Catch:{ all -> 0x050b }
            if (r1 != r3) goto L_0x050b
        L_0x0509:
            r8 = r3
            goto L_0x0530
        L_0x050b:
            throw r0     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
        L_0x050c:
            java.lang.String r0 = "El cuerpo no puede estar vacío"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
            r1.<init>(r0)     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
            throw r1     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
        L_0x0514:
            java.lang.String r0 = "El título no puede estar vacío"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
            r1.<init>(r0)     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
            throw r1     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
        L_0x051c:
            java.lang.String r0 = "Debes iniciar sesión para publicar en el foro."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
            r1.<init>(r0)     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
            throw r1     // Catch:{ CancellationException -> 0x0531, Exception -> 0x0524 }
        L_0x0524:
            r0 = move-exception
            m66 r1 = new m66
            r1.<init>(r0)
            r0 = r1
        L_0x052b:
            o66 r8 = new o66
            r8.<init>(r0)
        L_0x0530:
            return r8
        L_0x0531:
            r0 = move-exception
            throw r0
        L_0x0533:
            p81 r9 = defpackage.p81.w
            int r0 = r5.B
            if (r0 == 0) goto L_0x0548
            if (r0 != r7) goto L_0x0541
            defpackage.o85.q(r25)
            r0 = r25
            goto L_0x0568
        L_0x0541:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r0)
            goto L_0x0626
        L_0x0548:
            defpackage.o85.q(r25)
            java.lang.Object r0 = r5.C
            x42 r0 = (defpackage.x42) r0
            java.lang.Object r1 = r5.D
            s83 r1 = (defpackage.s83) r1
            java.lang.Object r2 = r5.E
            java.lang.Object r3 = r5.F
            v75 r3 = (defpackage.v75) r3
            java.lang.Object r4 = r5.G
            g72 r4 = (defpackage.g72) r4
            r5.B = r7
            java.lang.Object r0 = defpackage.x42.b(r0, r1, r2, r3, r4, r5)
            if (r0 != r9) goto L_0x0568
        L_0x0565:
            r8 = r9
            goto L_0x0626
        L_0x0568:
            r42 r0 = (defpackage.r42) r0
            java.lang.Object r1 = r5.C
            x42 r1 = (defpackage.x42) r1
            da7 r1 = r1.b
            monitor-enter(r1)
            java.lang.ref.WeakReference r2 = r1.w     // Catch:{ all -> 0x0587 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0587 }
            jx5 r2 = (defpackage.jx5) r2     // Catch:{ all -> 0x0587 }
            if (r2 == 0) goto L_0x058a
            android.content.Context r3 = r1.x     // Catch:{ all -> 0x0587 }
            if (r3 != 0) goto L_0x058d
            android.content.Context r2 = r2.a     // Catch:{ all -> 0x0587 }
            r1.x = r2     // Catch:{ all -> 0x0587 }
            r2.registerComponentCallbacks(r1)     // Catch:{ all -> 0x0587 }
            goto L_0x058d
        L_0x0587:
            r0 = move-exception
            goto L_0x0627
        L_0x058a:
            r1.b()     // Catch:{ all -> 0x0587 }
        L_0x058d:
            monitor-exit(r1)
            java.lang.Object r1 = r5.C
            x42 r1 = (defpackage.x42) r1
            f96 r1 = r1.d
            java.lang.Object r2 = r5.H
            mi4 r2 = (defpackage.mi4) r2
            java.lang.Object r3 = r5.D
            s83 r3 = (defpackage.s83) r3
            eh0 r3 = r3.o
            boolean r3 = r3.x
            if (r3 != 0) goto L_0x05a4
        L_0x05a2:
            r1 = r6
            goto L_0x05f8
        L_0x05a4:
            java.lang.Object r1 = r1.x
            jx5 r1 = (defpackage.jx5) r1
            z97 r1 = r1.c
            java.lang.Object r1 = r1.getValue()
            nx5 r1 = (defpackage.nx5) r1
            if (r1 == 0) goto L_0x05a2
            if (r2 != 0) goto L_0x05b5
            goto L_0x05a2
        L_0x05b5:
            android.graphics.drawable.Drawable r3 = r0.a
            boolean r4 = r3 instanceof android.graphics.drawable.BitmapDrawable
            if (r4 == 0) goto L_0x05be
            android.graphics.drawable.BitmapDrawable r3 = (android.graphics.drawable.BitmapDrawable) r3
            goto L_0x05bf
        L_0x05be:
            r3 = r8
        L_0x05bf:
            if (r3 == 0) goto L_0x05a2
            android.graphics.Bitmap r3 = r3.getBitmap()
            if (r3 != 0) goto L_0x05c8
            goto L_0x05a2
        L_0x05c8:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.lang.String r9 = "coil#is_sampled"
            boolean r10 = r0.b
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r4.put(r9, r10)
            java.lang.String r9 = r0.d
            if (r9 == 0) goto L_0x05e1
            java.lang.String r10 = "coil#disk_cache_key"
            r4.put(r10, r9)
        L_0x05e1:
            m57 r1 = r1.a
            java.util.Map r9 = r2.x
            java.util.Map r9 = defpackage.tf4.Q(r9)
            java.lang.String r2 = r2.w
            mi4 r10 = new mi4
            r10.<init>(r2, r9)
            java.util.Map r2 = defpackage.tf4.Q(r4)
            r1.d(r10, r3, r2)
            r1 = r7
        L_0x05f8:
            android.graphics.drawable.Drawable r10 = r0.a
            java.lang.Object r2 = r5.D
            r11 = r2
            s83 r11 = (defpackage.s83) r11
            pe1 r12 = r0.c
            java.lang.Object r2 = r5.H
            mi4 r2 = (defpackage.mi4) r2
            if (r1 == 0) goto L_0x0609
            r13 = r2
            goto L_0x060a
        L_0x0609:
            r13 = r8
        L_0x060a:
            java.lang.String r14 = r0.d
            boolean r15 = r0.b
            java.lang.Object r0 = r5.I
            mx5 r0 = (defpackage.mx5) r0
            android.graphics.Bitmap$Config[] r1 = defpackage.i.a
            if (r0 == 0) goto L_0x061d
            boolean r0 = r0.g
            if (r0 == 0) goto L_0x061d
            r16 = r7
            goto L_0x061f
        L_0x061d:
            r16 = r6
        L_0x061f:
            f77 r9 = new f77
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0565
        L_0x0626:
            return r8
        L_0x0627:
            monitor-exit(r1)     // Catch:{ all -> 0x0587 }
            throw r0
        L_0x0629:
            p81 r9 = defpackage.p81.w
            int r0 = r5.B
            if (r0 == 0) goto L_0x063e
            if (r0 != r7) goto L_0x0637
            defpackage.o85.q(r25)
            r0 = r25
            goto L_0x0673
        L_0x0637:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r0)
            r0 = r8
            goto L_0x0673
        L_0x063e:
            defpackage.o85.q(r25)
            java.lang.Object r0 = r5.C
            x42 r0 = (defpackage.x42) r0
            java.lang.Object r1 = r5.D
            h06 r1 = (defpackage.h06) r1
            java.lang.Object r1 = r1.w
            xy6 r1 = (defpackage.xy6) r1
            java.lang.Object r2 = r5.E
            h06 r2 = (defpackage.h06) r2
            java.lang.Object r2 = r2.w
            zv0 r2 = (defpackage.zv0) r2
            java.lang.Object r3 = r5.F
            s83 r3 = (defpackage.s83) r3
            java.lang.Object r4 = r5.G
            java.lang.Object r6 = r5.H
            h06 r6 = (defpackage.h06) r6
            java.lang.Object r6 = r6.w
            v75 r6 = (defpackage.v75) r6
            java.lang.Object r8 = r5.I
            g72 r8 = (defpackage.g72) r8
            r5.B = r7
            r7 = r5
            r5 = r6
            r6 = r8
            java.lang.Object r0 = defpackage.x42.a(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r0 != r9) goto L_0x0673
            r0 = r9
        L_0x0673:
            return r0
        L_0x0674:
            p81 r0 = defpackage.p81.w
            int r1 = r5.B
            if (r1 == 0) goto L_0x06a1
            if (r1 == r7) goto L_0x0693
            if (r1 != r2) goto L_0x068c
            java.lang.Object r0 = r5.E
            io.github.jan.supabase.auth.user.UserInfo r0 = (io.github.jan.supabase.auth.user.UserInfo) r0
            java.lang.Object r1 = r5.C
            p7 r1 = (defpackage.p7) r1
            f61 r1 = (defpackage.f61) r1
            defpackage.o85.q(r25)     // Catch:{ CancellationException -> 0x0702, Exception -> 0x06f5 }
            goto L_0x06ec
        L_0x068c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r0)
            goto L_0x0701
        L_0x0693:
            java.lang.Object r1 = r5.E
            io.github.jan.supabase.auth.user.UserInfo r1 = (io.github.jan.supabase.auth.user.UserInfo) r1
            f61 r1 = (defpackage.f61) r1
            java.lang.Object r1 = r5.C
            p7 r1 = (defpackage.p7) r1
            defpackage.o85.q(r25)     // Catch:{ CancellationException -> 0x0702, Exception -> 0x06f5 }
            goto L_0x06d1
        L_0x06a1:
            defpackage.o85.q(r25)
            java.lang.Object r1 = r5.D
            r10 = r1
            p7 r10 = (defpackage.p7) r10
            java.lang.Object r1 = r5.F
            r11 = r1
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r1 = r5.G
            r12 = r1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r5.H
            r13 = r1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r1 = r5.I
            r14 = r1
            java.lang.String r14 = (java.lang.String) r14
            o6 r9 = new o6     // Catch:{ CancellationException -> 0x0702, Exception -> 0x06f5 }
            r15 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ CancellationException -> 0x0702, Exception -> 0x06f5 }
            r5.C = r10     // Catch:{ CancellationException -> 0x0702, Exception -> 0x06f5 }
            r5.E = r8     // Catch:{ CancellationException -> 0x0702, Exception -> 0x06f5 }
            r5.B = r7     // Catch:{ CancellationException -> 0x0702, Exception -> 0x06f5 }
            java.lang.Object r1 = defpackage.p7.a(r10, r9, r5)     // Catch:{ CancellationException -> 0x0702, Exception -> 0x06f5 }
            if (r1 != r0) goto L_0x06d0
            goto L_0x06e9
        L_0x06d0:
            r1 = r10
        L_0x06d1:
            j77 r3 = r1.a     // Catch:{ CancellationException -> 0x0702, Exception -> 0x06f5 }
            uu r3 = defpackage.rg3.t(r3)     // Catch:{ CancellationException -> 0x0702, Exception -> 0x06f5 }
            io.github.jan.supabase.auth.user.UserInfo r3 = r3.j()     // Catch:{ CancellationException -> 0x0702, Exception -> 0x06f5 }
            if (r3 == 0) goto L_0x06ed
            r5.C = r8     // Catch:{ CancellationException -> 0x0702, Exception -> 0x06f5 }
            r5.E = r3     // Catch:{ CancellationException -> 0x0702, Exception -> 0x06f5 }
            r5.B = r2     // Catch:{ CancellationException -> 0x0702, Exception -> 0x06f5 }
            java.lang.Object r1 = r1.l(r3, r8, r5)     // Catch:{ CancellationException -> 0x0702, Exception -> 0x06f5 }
            if (r1 != r0) goto L_0x06eb
        L_0x06e9:
            r8 = r0
            goto L_0x0701
        L_0x06eb:
            r0 = r3
        L_0x06ec:
            r3 = r0
        L_0x06ed:
            if (r3 != 0) goto L_0x06f0
            r6 = r7
        L_0x06f0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ CancellationException -> 0x0702, Exception -> 0x06f5 }
            goto L_0x06fc
        L_0x06f5:
            r0 = move-exception
            m66 r1 = new m66
            r1.<init>(r0)
            r0 = r1
        L_0x06fc:
            o66 r8 = new o66
            r8.<init>(r0)
        L_0x0701:
            return r8
        L_0x0702:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p6.s(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p6(uj ujVar, List list, bd5 bd5, ad5 ad5, f61 f61) {
        super(2, f61);
        this.A = 4;
        this.F = ujVar;
        this.G = list;
        this.H = bd5;
        this.I = ad5;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p6(p7 p7Var, String str, String str2, String str3, String str4, f61 f61) {
        super(2, f61);
        this.A = 0;
        this.D = p7Var;
        this.F = str;
        this.G = str2;
        this.H = str3;
        this.I = str4;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p6(lo2 lo2, ez4 ez4, f61 f61) {
        super(2, f61);
        this.A = 3;
        this.H = lo2;
        this.I = ez4;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p6(hq4 hq4, mq4 mq4, vr2 vr2, f61 f61) {
        super(2, f61);
        this.A = 5;
        this.G = hq4;
        this.H = mq4;
        this.I = vr2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p6(ContentResolver contentResolver, Uri uri, sy7 sy7, ad0 ad0, Context context, f61 f61) {
        super(2, f61);
        this.A = 7;
        this.E = contentResolver;
        this.F = uri;
        this.G = sy7;
        this.H = ad0;
        this.I = context;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p6(UssdAutoUpdaterService ussdAutoUpdaterService, String str, vr2 vr2, f61 f61) {
        super(2, f61);
        this.A = 6;
        this.H = ussdAutoUpdaterService;
        this.F = str;
        this.I = vr2;
    }
}
