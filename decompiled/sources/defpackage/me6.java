package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.Editable;
import android.text.Selection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocket;

/* renamed from: me6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class me6 implements xv0, d81, gj5, r62, rr0, vu7, no1, xf0, xx5 {
    public static final me6 A = new me6(3);
    public static final me6 B = new me6(4);
    public static final me6 C = new me6(5);
    public static final /* synthetic */ me6 D = new me6(6);
    public static final /* synthetic */ me6 E = new me6(7);
    public static final me6 F = new me6(8);
    public static final me6 G = new me6(9);
    public static final me6 H = new me6(10);
    public static final me6 I = new me6(11);
    public static final me6 J = new me6(12);
    public static final me6 K = new me6(13);
    public static final me6 L = new me6(14);
    public static final me6 M = new me6(15);
    public static final kj6 N = new kj6(8);
    public static final kj6 O = new kj6(9);
    public static final me6 P = new me6(17);
    public static final me6 Q = new me6(18);
    public static final qm x = new Object();
    public static final me6 y = new me6(2);
    public static jx5 z;
    public final /* synthetic */ int w;

    public me6() {
        this.w = 20;
        new kd4(16);
        long[] jArr = bg6.a;
        new tp4
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0012: CONSTRUCTOR  (r1v3 ? I:tp4) =  call: tp4.<init>():void type: CONSTRUCTOR in method: me6.<init>():void, dex: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v3 ?
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	... 29 more
            */
        /*
            this = this;
            r0 = 20
            r1.w = r0
            r1.<init>()
            kd4 r1 = new kd4
            r0 = 16
            r1.<init>(r0)
            long[] r1 = defpackage.bg6.a
            tp4 r1 = new tp4
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.me6.<init>():void");
    }

    public static final int i(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i * 31) + Character.toLowerCase(str.charAt(i2));
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0075, code lost:
        if (r11 != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0082, code lost:
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a2, code lost:
        if (r10 != -1) goto L_0x00b3;
     */
    public static boolean k(d32 d32, Editable editable, int i, int i2, boolean z2) {
        int i3;
        int i4;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd)) {
                if (z2) {
                    int max = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0:
                        while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z3) {
                                        break;
                                    } else if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else if (Character.isHighSurrogate(charAt)) {
                                        break loop0;
                                    } else {
                                        z3 = true;
                                    }
                                } else if (!z3) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i2, 0);
                    i3 = editable.length();
                    if (selectionEnd >= 0 && i3 >= selectionEnd && max2 >= 0) {
                        loop2:
                        while (true) {
                            boolean z4 = false;
                            while (true) {
                                if (max2 == 0) {
                                    i3 = i4;
                                    break loop2;
                                } else if (i4 < i3) {
                                    char charAt2 = editable.charAt(i4);
                                    if (z4) {
                                        break;
                                    } else if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        i4++;
                                    } else if (Character.isLowSurrogate(charAt2)) {
                                        break loop2;
                                    } else {
                                        i4++;
                                        z4 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd = i4 + 1;
                        }
                    }
                    i3 = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    i3 = Math.min(selectionEnd + i2, editable.length());
                }
                uq7[] uq7Arr = (uq7[]) editable.getSpans(selectionStart, i3, uq7.class);
                if (uq7Arr != null && uq7Arr.length > 0) {
                    for (uq7 uq7 : uq7Arr) {
                        int spanStart = editable.getSpanStart(uq7);
                        int spanEnd = editable.getSpanEnd(uq7);
                        selectionStart = Math.min(spanStart, selectionStart);
                        i3 = Math.max(spanEnd, i3);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min = Math.min(i3, editable.length());
                    d32.beginBatchEdit();
                    editable.delete(max3, min);
                    d32.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public void D0(j43 j43, a97 a97) {
        j43.getClass();
        j43.z.f(s53.j, new do1((Object) (gs2) a97, (f61) null, 3));
    }

    public boolean a(SSLSocket sSLSocket) {
        return k57.u0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    public vw3 b() {
        throw new IllegalStateException("This method should not be called");
    }

    public byte[] c(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    public Object d(kd6 kd6) {
        Object s = kd6.s(new av5(x90.class, Executor.class));
        s.getClass();
        return we.l((Executor) s);
    }

    public void e(ql4 ql4, ArrayList arrayList) {
        throw new IllegalStateException("Incomplete hierarchy for class " + ql4.getName() + ", unresolved classes " + arrayList);
    }

    public void f(ri0 ri0) {
        ri0.getClass();
        throw new IllegalStateException("Cannot infer visibility for " + ri0);
    }

    public ey6 g(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                rf2.z("No OpenSSLSocketImpl superclass of socket of type ", cls);
                return null;
            }
        }
        return new mi(cls2);
    }

    public boolean h(ql4 ql4, tt1 tt1) {
        ql4.getClass();
        return true;
    }

    public Signature[] j(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public String toString() {
        switch (this.w) {
            case 10:
                return "coil.request.NullRequestData";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ me6(int i) {
        this.w = i;
    }
}
