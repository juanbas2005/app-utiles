package defpackage;

import android.content.ClipDescription;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: ke  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ke extends f96 {
    public final /* synthetic */ int C;
    public final /* synthetic */ k4 D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ke(k4 k4Var, int i) {
        super(3);
        this.C = i;
        this.D = k4Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: o4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: o4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: n4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v127, resolved type: m4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v128, resolved type: m4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v129, resolved type: m4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v130, resolved type: m4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v131, resolved type: o4} */
    /* JADX WARNING: type inference failed for: r5v8, types: [n4, f1] */
    /* JADX WARNING: type inference failed for: r4v31, types: [o4, f1] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0246 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x04d3  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x04da  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x04e8  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x04ea  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x04f2  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x04f8  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x04fa  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x051f  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x052a  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x0580  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0597  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x059f  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x05a8  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x05af  */
    /* JADX WARNING: Removed duplicated region for block: B:552:0x08a3  */
    /* JADX WARNING: Removed duplicated region for block: B:598:0x025e A[ADDED_TO_REGION, SYNTHETIC] */
    public final boolean C(int r28, int r29, android.os.Bundle r30) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            int r4 = r0.C
            r5 = 32768(0x8000, float:4.5918E-41)
            r6 = 16
            r7 = 128(0x80, float:1.8E-43)
            r8 = 64
            r9 = -1
            k4 r0 = r0.D
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 65536(0x10000, float:9.1835E-41)
            r12 = 2
            r13 = 1
            r14 = 0
            switch(r4) {
                case 0: goto L_0x0095;
                default: goto L_0x0020;
            }
        L_0x0020:
            jp0 r0 = (defpackage.jp0) r0
            com.google.android.material.chip.Chip r4 = r0.E
            if (r1 == r9) goto L_0x008e
            if (r2 == r13) goto L_0x0089
            if (r2 == r12) goto L_0x0084
            if (r2 == r8) goto L_0x005e
            if (r2 == r7) goto L_0x0051
            com.google.android.material.chip.Chip r0 = r0.J
            if (r2 != r6) goto L_0x004f
            if (r1 != 0) goto L_0x0039
            boolean r13 = r0.performClick()
            goto L_0x0094
        L_0x0039:
            if (r1 != r13) goto L_0x004f
            r0.playSoundEffect(r14)
            android.view.View$OnClickListener r1 = r0.D
            if (r1 == 0) goto L_0x0046
            r1.onClick(r0)
            r14 = r13
        L_0x0046:
            boolean r1 = r0.O
            if (r1 == 0) goto L_0x004f
            jp0 r0 = r0.N
            r0.r(r13, r13)
        L_0x004f:
            r13 = r14
            goto L_0x0094
        L_0x0051:
            int r2 = r0.G
            if (r2 != r1) goto L_0x004f
            r0.G = r10
            r4.invalidate()
            r0.r(r1, r11)
            goto L_0x0094
        L_0x005e:
            android.view.accessibility.AccessibilityManager r2 = r0.D
            boolean r3 = r2.isEnabled()
            if (r3 == 0) goto L_0x004f
            boolean r2 = r2.isTouchExplorationEnabled()
            if (r2 != 0) goto L_0x006d
            goto L_0x004f
        L_0x006d:
            int r2 = r0.G
            if (r2 == r1) goto L_0x004f
            if (r2 == r10) goto L_0x007b
            r0.G = r10
            r4.invalidate()
            r0.r(r2, r11)
        L_0x007b:
            r0.G = r1
            r4.invalidate()
            r0.r(r1, r5)
            goto L_0x0094
        L_0x0084:
            boolean r13 = r0.j(r1)
            goto L_0x0094
        L_0x0089:
            boolean r13 = r0.q(r1)
            goto L_0x0094
        L_0x008e:
            java.util.WeakHashMap r0 = defpackage.e58.a
            boolean r13 = r4.performAccessibilityAction(r2, r3)
        L_0x0094:
            return r13
        L_0x0095:
            oe r0 = (defpackage.oe) r0
            android.view.accessibility.AccessibilityManager r4 = r0.C
            r27 = 0
            java.lang.Float r15 = java.lang.Float.valueOf(r27)
            je r5 = r0.z
            me3 r11 = r0.r()
            java.lang.Object r11 = r11.b(r1)
            hk6 r11 = (defpackage.hk6) r11
            if (r11 == 0) goto L_0x00b1
            fk6 r11 = r11.a
            if (r11 != 0) goto L_0x00b5
        L_0x00b1:
            r21 = r14
            goto L_0x0930
        L_0x00b5:
            uy3 r10 = r11.c
            int r6 = r11.f
            ak6 r9 = r11.d
            tp4 r14 = r9.w
            nk6 r12 = defpackage.jk6.o
            java.lang.Object r12 = r14.g(r12)
            if (r12 != 0) goto L_0x00c6
            r12 = 0
        L_0x00c6:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            boolean r12 = defpackage.sg3.e(r12, r13)
            if (r12 == 0) goto L_0x00e0
            int r12 = android.os.Build.VERSION.SDK_INT
            r7 = 34
            if (r12 < r7) goto L_0x00d9
            boolean r7 = defpackage.l4.j(r4)
            goto L_0x00da
        L_0x00d9:
            r7 = 1
        L_0x00da:
            if (r7 != 0) goto L_0x00e0
        L_0x00dc:
            r21 = 0
            goto L_0x0930
        L_0x00e0:
            r7 = 12
            if (r2 == r8) goto L_0x0933
            r8 = 128(0x80, float:1.8E-43)
            if (r2 == r8) goto L_0x0919
            r4 = 8
            r8 = 512(0x200, float:7.17E-43)
            r12 = 256(0x100, float:3.59E-43)
            if (r2 == r12) goto L_0x07a1
            if (r2 == r8) goto L_0x07a1
            r8 = 16384(0x4000, float:2.2959E-41)
            if (r2 == r8) goto L_0x0780
            r8 = 131072(0x20000, float:1.83671E-40)
            if (r2 == r8) goto L_0x0756
            boolean r6 = defpackage.fd1.o(r11)
            if (r6 != 0) goto L_0x0101
            goto L_0x00dc
        L_0x0101:
            r6 = 1
            if (r2 == r6) goto L_0x072c
            r6 = 2
            if (r2 == r6) goto L_0x070f
            ey3 r4 = defpackage.ey3.x
            switch(r2) {
                case 16: goto L_0x06e3;
                case 32: goto L_0x06c2;
                case 4096: goto L_0x01ce;
                case 8192: goto L_0x01ce;
                case 32768: goto L_0x04ac;
                case 65536: goto L_0x048b;
                case 262144: goto L_0x046a;
                case 524288: goto L_0x0449;
                case 1048576: goto L_0x0428;
                case 2097152: goto L_0x03f4;
                case 16908342: goto L_0x022d;
                case 16908349: goto L_0x01f8;
                case 16908372: goto L_0x01d7;
                default: goto L_0x010c;
            }
        L_0x010c:
            switch(r2) {
                case 16908344: goto L_0x01ce;
                case 16908345: goto L_0x01ce;
                case 16908346: goto L_0x01ce;
                case 16908347: goto L_0x01ce;
                default: goto L_0x010f;
            }
        L_0x010f:
            switch(r2) {
                case 16908358: goto L_0x01ad;
                case 16908359: goto L_0x018c;
                case 16908360: goto L_0x016b;
                case 16908361: goto L_0x014a;
                default: goto L_0x0112;
            }
        L_0x0112:
            cz6 r0 = r0.N
            java.lang.Object r0 = r0.c(r1)
            cz6 r0 = (defpackage.cz6) r0
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r0.c(r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 != 0) goto L_0x0125
            goto L_0x00dc
        L_0x0125:
            nk6 r0 = defpackage.zj6.x
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L_0x012f
            r13 = 0
            goto L_0x0130
        L_0x012f:
            r13 = r0
        L_0x0130:
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto L_0x0135
            goto L_0x00dc
        L_0x0135:
            int r0 = r13.size()
            if (r0 > 0) goto L_0x013c
            goto L_0x00dc
        L_0x013c:
            r0 = 0
            java.lang.Object r1 = r13.get(r0)
            r1.getClass()
            defpackage.ku4.a()
            r13 = 0
            goto L_0x095d
        L_0x014a:
            nk6 r0 = defpackage.zj6.B
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L_0x0154
            r13 = 0
            goto L_0x0155
        L_0x0154:
            r13 = r0
        L_0x0155:
            h4 r13 = (defpackage.h4) r13
            if (r13 == 0) goto L_0x00dc
            ds2 r0 = r13.b
            sr2 r0 = (defpackage.sr2) r0
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r0.b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L_0x095d
        L_0x016b:
            nk6 r0 = defpackage.zj6.z
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L_0x0175
            r13 = 0
            goto L_0x0176
        L_0x0175:
            r13 = r0
        L_0x0176:
            h4 r13 = (defpackage.h4) r13
            if (r13 == 0) goto L_0x00dc
            ds2 r0 = r13.b
            sr2 r0 = (defpackage.sr2) r0
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r0.b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L_0x095d
        L_0x018c:
            nk6 r0 = defpackage.zj6.A
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L_0x0196
            r13 = 0
            goto L_0x0197
        L_0x0196:
            r13 = r0
        L_0x0197:
            h4 r13 = (defpackage.h4) r13
            if (r13 == 0) goto L_0x00dc
            ds2 r0 = r13.b
            sr2 r0 = (defpackage.sr2) r0
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r0.b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L_0x095d
        L_0x01ad:
            nk6 r0 = defpackage.zj6.y
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L_0x01b7
            r13 = 0
            goto L_0x01b8
        L_0x01b7:
            r13 = r0
        L_0x01b8:
            h4 r13 = (defpackage.h4) r13
            if (r13 == 0) goto L_0x00dc
            ds2 r0 = r13.b
            sr2 r0 = (defpackage.sr2) r0
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r0.b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L_0x095d
        L_0x01ce:
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r18 = 32
            goto L_0x04cd
        L_0x01d7:
            nk6 r0 = defpackage.zj6.p
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L_0x01e1
            r13 = 0
            goto L_0x01e2
        L_0x01e1:
            r13 = r0
        L_0x01e2:
            h4 r13 = (defpackage.h4) r13
            if (r13 == 0) goto L_0x00dc
            ds2 r0 = r13.b
            sr2 r0 = (defpackage.sr2) r0
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r0.b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L_0x095d
        L_0x01f8:
            if (r3 == 0) goto L_0x00dc
            java.lang.String r0 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
            boolean r1 = r3.containsKey(r0)
            if (r1 != 0) goto L_0x0204
            goto L_0x00dc
        L_0x0204:
            nk6 r1 = defpackage.zj6.i
            java.lang.Object r1 = r14.g(r1)
            if (r1 != 0) goto L_0x020e
            r13 = 0
            goto L_0x020f
        L_0x020e:
            r13 = r1
        L_0x020f:
            h4 r13 = (defpackage.h4) r13
            if (r13 == 0) goto L_0x00dc
            ds2 r1 = r13.b
            vr2 r1 = (defpackage.vr2) r1
            if (r1 == 0) goto L_0x00dc
            float r0 = r3.getFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.y(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L_0x095d
        L_0x022d:
            fk6 r0 = r11.l()
            if (r0 == 0) goto L_0x0243
            ak6 r1 = r0.d
            nk6 r2 = defpackage.zj6.d
            tp4 r1 = r1.w
            java.lang.Object r1 = r1.g(r2)
            if (r1 != 0) goto L_0x0240
            r1 = 0
        L_0x0240:
            h4 r1 = (defpackage.h4) r1
            goto L_0x0244
        L_0x0243:
            r1 = 0
        L_0x0244:
            if (r1 != 0) goto L_0x025e
            if (r0 == 0) goto L_0x025e
            fk6 r0 = r0.l()
            if (r0 == 0) goto L_0x0243
            ak6 r1 = r0.d
            nk6 r2 = defpackage.zj6.d
            tp4 r1 = r1.w
            java.lang.Object r1 = r1.g(r2)
            if (r1 != 0) goto L_0x025b
            r1 = 0
        L_0x025b:
            h4 r1 = (defpackage.h4) r1
            goto L_0x0244
        L_0x025e:
            if (r0 != 0) goto L_0x0299
            ly5 r0 = r11.g()
            android.graphics.Rect r1 = new android.graphics.Rect
            float r2 = r0.a
            double r2 = (double) r2
            double r2 = java.lang.Math.floor(r2)
            float r2 = (float) r2
            int r2 = (int) r2
            float r3 = r0.b
            double r3 = (double) r3
            double r3 = java.lang.Math.floor(r3)
            float r3 = (float) r3
            int r3 = (int) r3
            float r4 = r0.c
            double r6 = (double) r4
            double r6 = java.lang.Math.ceil(r6)
            float r4 = (float) r6
            int r4 = defpackage.dh4.C(r4)
            float r0 = r0.d
            double r6 = (double) r0
            double r6 = java.lang.Math.ceil(r6)
            float r0 = (float) r6
            int r0 = defpackage.dh4.C(r0)
            r1.<init>(r2, r3, r4, r0)
            boolean r13 = r5.requestRectangleOnScreen(r1)
            goto L_0x095d
        L_0x0299:
            r1 = 0
            r12 = r1
            r3 = 0
        L_0x029d:
            if (r0 == 0) goto L_0x03f1
            uy3 r5 = r0.c
            ak6 r7 = r0.d
            tp4 r7 = r7.w
            nk6 r14 = defpackage.zj6.d
            java.lang.Object r14 = r7.g(r14)
            if (r14 != 0) goto L_0x02ae
            r14 = 0
        L_0x02ae:
            h4 r14 = (defpackage.h4) r14
            if (r14 == 0) goto L_0x03e2
            o00 r15 = r5.a0
            java.lang.Object r15 = r15.d
            hc3 r15 = (defpackage.hc3) r15
            ly5 r15 = defpackage.t49.u(r15)
            o00 r5 = r5.a0
            java.lang.Object r5 = r5.d
            hc3 r5 = (defpackage.hc3) r5
            dy3 r5 = r5.D()
            if (r5 == 0) goto L_0x02d6
            xz4 r5 = (defpackage.xz4) r5
            long r16 = r5.R(r1)
            r8 = r16
        L_0x02d0:
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L_0x02d8
        L_0x02d6:
            r8 = r1
            goto L_0x02d0
        L_0x02d8:
            ly5 r5 = r15.i(r8)
            xz4 r8 = r11.d()
            if (r8 == 0) goto L_0x02f3
            ll4 r9 = r8.c1()
            boolean r9 = r9.J
            if (r9 == 0) goto L_0x02eb
            goto L_0x02ec
        L_0x02eb:
            r8 = 0
        L_0x02ec:
            if (r8 == 0) goto L_0x02f3
            long r8 = r8.R(r1)
            goto L_0x02f4
        L_0x02f3:
            r8 = r1
        L_0x02f4:
            long r8 = defpackage.l35.e(r8, r12)
            xz4 r15 = r11.d()
            r19 = r7
            r18 = 32
            if (r15 == 0) goto L_0x0305
            long r6 = r15.y
            goto L_0x0306
        L_0x0305:
            r6 = r1
        L_0x0306:
            long r6 = defpackage.pv8.O(r6)
            ly5 r6 = defpackage.z85.c(r8, r6)
            float r7 = r6.a
            float r8 = r5.a
            float r7 = r7 - r8
            float r8 = r6.c
            float r9 = r5.c
            float r8 = r8 - r9
            float r9 = java.lang.Math.signum(r7)
            float r15 = java.lang.Math.signum(r8)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L_0x0333
            float r9 = java.lang.Math.abs(r7)
            float r15 = java.lang.Math.abs(r8)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 >= 0) goto L_0x0331
            goto L_0x0335
        L_0x0331:
            r7 = r8
            goto L_0x0335
        L_0x0333:
            r7 = r27
        L_0x0335:
            float r8 = r6.b
            float r9 = r5.b
            float r8 = r8 - r9
            float r6 = r6.d
            float r5 = r5.d
            float r6 = r6 - r5
            float r5 = java.lang.Math.signum(r8)
            float r9 = java.lang.Math.signum(r6)
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x035a
            float r5 = java.lang.Math.abs(r8)
            float r9 = java.lang.Math.abs(r6)
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 >= 0) goto L_0x0358
            goto L_0x035c
        L_0x0358:
            r8 = r6
            goto L_0x035c
        L_0x035a:
            r8 = r27
        L_0x035c:
            int r5 = java.lang.Float.floatToRawIntBits(r7)
            long r5 = (long) r5
            int r7 = java.lang.Float.floatToRawIntBits(r8)
            long r7 = (long) r7
            long r5 = r5 << r18
            long r7 = r7 & r16
            long r5 = r5 | r7
            boolean r7 = defpackage.l35.b(r5, r1)
            if (r7 == 0) goto L_0x0373
            r1 = r5
            goto L_0x03ad
        L_0x0373:
            long r7 = r5 >> r18
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            long r8 = r5 & r16
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            nk6 r9 = defpackage.jk6.v
            r15 = r19
            java.lang.Object r9 = r15.g(r9)
            if (r9 != 0) goto L_0x038c
            r9 = 0
        L_0x038c:
            vg6 r9 = (defpackage.vg6) r9
            ey3 r9 = r10.U
            if (r9 != r4) goto L_0x0393
            float r7 = -r7
        L_0x0393:
            nk6 r9 = defpackage.jk6.w
            java.lang.Object r9 = r15.g(r9)
            if (r9 != 0) goto L_0x039c
            r9 = 0
        L_0x039c:
            vg6 r9 = (defpackage.vg6) r9
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            long r1 = (long) r7
            int r7 = java.lang.Float.floatToRawIntBits(r8)
            long r7 = (long) r7
            long r1 = r1 << r18
            long r7 = r7 & r16
            long r1 = r1 | r7
        L_0x03ad:
            ds2 r7 = r14.b
            gs2 r7 = (defpackage.gs2) r7
            if (r7 == 0) goto L_0x03d7
            long r8 = r1 >> r18
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            long r1 = r1 & r16
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Object r1 = r7.H(r8, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 1
            if (r1 != r2) goto L_0x03d7
            goto L_0x03d9
        L_0x03d7:
            if (r3 == 0) goto L_0x03db
        L_0x03d9:
            r1 = 1
            goto L_0x03dc
        L_0x03db:
            r1 = 0
        L_0x03dc:
            long r12 = defpackage.l35.d(r12, r5)
            r3 = r1
            goto L_0x03e9
        L_0x03e2:
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r18 = 32
        L_0x03e9:
            fk6 r0 = r0.l()
            r1 = 0
            goto L_0x029d
        L_0x03f1:
            r13 = r3
            goto L_0x095d
        L_0x03f4:
            if (r3 == 0) goto L_0x03fd
            java.lang.String r0 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"
            java.lang.String r0 = r3.getString(r0)
            goto L_0x03fe
        L_0x03fd:
            r0 = 0
        L_0x03fe:
            nk6 r1 = defpackage.zj6.k
            java.lang.Object r1 = r14.g(r1)
            if (r1 != 0) goto L_0x0408
            r13 = 0
            goto L_0x0409
        L_0x0408:
            r13 = r1
        L_0x0409:
            h4 r13 = (defpackage.h4) r13
            if (r13 == 0) goto L_0x00dc
            ds2 r1 = r13.b
            vr2 r1 = (defpackage.vr2) r1
            if (r1 == 0) goto L_0x00dc
            vl r2 = new vl
            if (r0 != 0) goto L_0x0419
            java.lang.String r0 = ""
        L_0x0419:
            r2.<init>(r0)
            java.lang.Object r0 = r1.y(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L_0x095d
        L_0x0428:
            nk6 r0 = defpackage.zj6.v
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L_0x0432
            r13 = 0
            goto L_0x0433
        L_0x0432:
            r13 = r0
        L_0x0433:
            h4 r13 = (defpackage.h4) r13
            if (r13 == 0) goto L_0x00dc
            ds2 r0 = r13.b
            sr2 r0 = (defpackage.sr2) r0
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r0.b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L_0x095d
        L_0x0449:
            nk6 r0 = defpackage.zj6.u
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L_0x0453
            r13 = 0
            goto L_0x0454
        L_0x0453:
            r13 = r0
        L_0x0454:
            h4 r13 = (defpackage.h4) r13
            if (r13 == 0) goto L_0x00dc
            ds2 r0 = r13.b
            sr2 r0 = (defpackage.sr2) r0
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r0.b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L_0x095d
        L_0x046a:
            nk6 r0 = defpackage.zj6.t
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L_0x0474
            r13 = 0
            goto L_0x0475
        L_0x0474:
            r13 = r0
        L_0x0475:
            h4 r13 = (defpackage.h4) r13
            if (r13 == 0) goto L_0x00dc
            ds2 r0 = r13.b
            sr2 r0 = (defpackage.sr2) r0
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r0.b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L_0x095d
        L_0x048b:
            nk6 r0 = defpackage.zj6.r
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L_0x0495
            r13 = 0
            goto L_0x0496
        L_0x0495:
            r13 = r0
        L_0x0496:
            h4 r13 = (defpackage.h4) r13
            if (r13 == 0) goto L_0x00dc
            ds2 r0 = r13.b
            sr2 r0 = (defpackage.sr2) r0
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r0.b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L_0x095d
        L_0x04ac:
            nk6 r0 = defpackage.zj6.s
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L_0x04b6
            r13 = 0
            goto L_0x04b7
        L_0x04b6:
            r13 = r0
        L_0x04b7:
            h4 r13 = (defpackage.h4) r13
            if (r13 == 0) goto L_0x00dc
            ds2 r0 = r13.b
            sr2 r0 = (defpackage.sr2) r0
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r0.b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L_0x095d
        L_0x04cd:
            r0 = 4096(0x1000, float:5.74E-42)
            if (r2 != r0) goto L_0x04d3
            r0 = 1
            goto L_0x04d4
        L_0x04d3:
            r0 = 0
        L_0x04d4:
            r1 = 8192(0x2000, float:1.148E-41)
            if (r2 != r1) goto L_0x04da
            r1 = 1
            goto L_0x04db
        L_0x04da:
            r1 = 0
        L_0x04db:
            r3 = 16908345(0x1020039, float:2.387739E-38)
            if (r2 != r3) goto L_0x04e2
            r3 = 1
            goto L_0x04e3
        L_0x04e2:
            r3 = 0
        L_0x04e3:
            r5 = 16908347(0x102003b, float:2.3877394E-38)
            if (r2 != r5) goto L_0x04ea
            r5 = 1
            goto L_0x04eb
        L_0x04ea:
            r5 = 0
        L_0x04eb:
            r6 = 16908344(0x1020038, float:2.3877386E-38)
            if (r2 != r6) goto L_0x04f2
            r6 = 1
            goto L_0x04f3
        L_0x04f2:
            r6 = 0
        L_0x04f3:
            r7 = 16908346(0x102003a, float:2.3877392E-38)
            if (r2 != r7) goto L_0x04fa
            r2 = 1
            goto L_0x04fb
        L_0x04fa:
            r2 = 0
        L_0x04fb:
            if (r3 != 0) goto L_0x0506
            if (r5 != 0) goto L_0x0506
            if (r0 != 0) goto L_0x0506
            if (r1 == 0) goto L_0x0504
            goto L_0x0506
        L_0x0504:
            r7 = 0
            goto L_0x0507
        L_0x0506:
            r7 = 1
        L_0x0507:
            if (r6 != 0) goto L_0x0512
            if (r2 != 0) goto L_0x0512
            if (r0 != 0) goto L_0x0512
            if (r1 == 0) goto L_0x0510
            goto L_0x0512
        L_0x0510:
            r13 = 0
            goto L_0x0513
        L_0x0512:
            r13 = 1
        L_0x0513:
            if (r0 != 0) goto L_0x0517
            if (r1 == 0) goto L_0x0565
        L_0x0517:
            nk6 r0 = defpackage.jk6.c
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L_0x0520
            r0 = 0
        L_0x0520:
            mq5 r0 = (defpackage.mq5) r0
            nk6 r2 = defpackage.zj6.i
            java.lang.Object r2 = r14.g(r2)
            if (r2 != 0) goto L_0x052b
            r2 = 0
        L_0x052b:
            h4 r2 = (defpackage.h4) r2
            if (r0 == 0) goto L_0x0565
            ms0 r8 = r0.b
            if (r2 == 0) goto L_0x0565
            float r3 = r8.a
            int r4 = (r3 > r27 ? 1 : (r3 == r27 ? 0 : -1))
            if (r4 >= 0) goto L_0x053c
            r4 = r27
            goto L_0x053d
        L_0x053c:
            r4 = r3
        L_0x053d:
            int r5 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0543
            r15 = r3
            goto L_0x0545
        L_0x0543:
            r15 = r27
        L_0x0545:
            float r4 = r4 - r15
            r3 = 1101004800(0x41a00000, float:20.0)
            float r4 = r4 / r3
            if (r1 == 0) goto L_0x054c
            float r4 = -r4
        L_0x054c:
            ds2 r1 = r2.b
            vr2 r1 = (defpackage.vr2) r1
            if (r1 == 0) goto L_0x00dc
            float r0 = r0.a
            float r0 = r0 + r4
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.y(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L_0x095d
        L_0x0565:
            o00 r0 = r10.a0
            java.lang.Object r0 = r0.d
            hc3 r0 = (defpackage.hc3) r0
            ly5 r0 = defpackage.t49.u(r0)
            long r8 = r0.c()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            nk6 r2 = defpackage.zj6.C
            java.lang.Object r2 = r14.g(r2)
            if (r2 != 0) goto L_0x0581
            r2 = 0
        L_0x0581:
            h4 r2 = (defpackage.h4) r2
            if (r2 == 0) goto L_0x059f
            ds2 r2 = r2.b
            vr2 r2 = (defpackage.vr2) r2
            if (r2 == 0) goto L_0x059f
            java.lang.Object r2 = r2.y(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x059f
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            java.lang.Float r0 = (java.lang.Float) r0
            goto L_0x05a0
        L_0x059f:
            r0 = 0
        L_0x05a0:
            nk6 r2 = defpackage.zj6.d
            java.lang.Object r2 = r14.g(r2)
            if (r2 != 0) goto L_0x05a9
            r2 = 0
        L_0x05a9:
            h4 r2 = (defpackage.h4) r2
            if (r2 != 0) goto L_0x05af
            goto L_0x00dc
        L_0x05af:
            ds2 r2 = r2.b
            nk6 r11 = defpackage.jk6.v
            java.lang.Object r11 = r14.g(r11)
            if (r11 != 0) goto L_0x05ba
            r11 = 0
        L_0x05ba:
            vg6 r11 = (defpackage.vg6) r11
            if (r11 == 0) goto L_0x0640
            if (r7 == 0) goto L_0x0640
            if (r0 == 0) goto L_0x05cb
            float r7 = r0.floatValue()
            r29 = r0
            r28 = r1
            goto L_0x05d6
        L_0x05cb:
            r29 = r0
            r28 = r1
            long r0 = r8 >> r18
            int r0 = (int) r0
            float r7 = java.lang.Float.intBitsToFloat(r0)
        L_0x05d6:
            if (r3 != 0) goto L_0x05da
            if (r28 == 0) goto L_0x05db
        L_0x05da:
            float r7 = -r7
        L_0x05db:
            ey3 r0 = r10.U
            if (r0 != r4) goto L_0x05e4
            if (r3 != 0) goto L_0x05e3
            if (r5 == 0) goto L_0x05e4
        L_0x05e3:
            float r7 = -r7
        L_0x05e4:
            boolean r0 = defpackage.oe.w(r11, r7)
            if (r0 == 0) goto L_0x0644
            nk6 r0 = defpackage.zj6.z
            boolean r1 = r14.c(r0)
            if (r1 != 0) goto L_0x060f
            nk6 r1 = defpackage.zj6.B
            boolean r1 = r14.c(r1)
            if (r1 == 0) goto L_0x05fb
            goto L_0x060f
        L_0x05fb:
            gs2 r2 = (defpackage.gs2) r2
            if (r2 == 0) goto L_0x00dc
            java.lang.Float r0 = java.lang.Float.valueOf(r7)
            java.lang.Object r0 = r2.H(r0, r15)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L_0x095d
        L_0x060f:
            int r1 = (r7 > r27 ? 1 : (r7 == r27 ? 0 : -1))
            if (r1 <= 0) goto L_0x0621
            nk6 r0 = defpackage.zj6.B
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L_0x061d
            r13 = 0
            goto L_0x061e
        L_0x061d:
            r13 = r0
        L_0x061e:
            h4 r13 = (defpackage.h4) r13
            goto L_0x062c
        L_0x0621:
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L_0x0629
            r13 = 0
            goto L_0x062a
        L_0x0629:
            r13 = r0
        L_0x062a:
            h4 r13 = (defpackage.h4) r13
        L_0x062c:
            if (r13 == 0) goto L_0x00dc
            ds2 r0 = r13.b
            sr2 r0 = (defpackage.sr2) r0
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r0.b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L_0x095d
        L_0x0640:
            r29 = r0
            r28 = r1
        L_0x0644:
            nk6 r0 = defpackage.jk6.w
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L_0x064d
            r0 = 0
        L_0x064d:
            vg6 r0 = (defpackage.vg6) r0
            if (r0 == 0) goto L_0x00dc
            if (r13 == 0) goto L_0x00dc
            if (r29 == 0) goto L_0x065a
            float r1 = r29.floatValue()
            goto L_0x0661
        L_0x065a:
            long r3 = r8 & r16
            int r1 = (int) r3
            float r1 = java.lang.Float.intBitsToFloat(r1)
        L_0x0661:
            if (r6 != 0) goto L_0x0665
            if (r28 == 0) goto L_0x0666
        L_0x0665:
            float r1 = -r1
        L_0x0666:
            boolean r0 = defpackage.oe.w(r0, r1)
            if (r0 == 0) goto L_0x00dc
            nk6 r0 = defpackage.zj6.y
            boolean r3 = r14.c(r0)
            if (r3 != 0) goto L_0x0691
            nk6 r3 = defpackage.zj6.A
            boolean r3 = r14.c(r3)
            if (r3 == 0) goto L_0x067d
            goto L_0x0691
        L_0x067d:
            gs2 r2 = (defpackage.gs2) r2
            if (r2 == 0) goto L_0x00dc
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            java.lang.Object r0 = r2.H(r15, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L_0x095d
        L_0x0691:
            int r1 = (r1 > r27 ? 1 : (r1 == r27 ? 0 : -1))
            if (r1 <= 0) goto L_0x06a3
            nk6 r0 = defpackage.zj6.A
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L_0x069f
            r13 = 0
            goto L_0x06a0
        L_0x069f:
            r13 = r0
        L_0x06a0:
            h4 r13 = (defpackage.h4) r13
            goto L_0x06ae
        L_0x06a3:
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L_0x06ab
            r13 = 0
            goto L_0x06ac
        L_0x06ab:
            r13 = r0
        L_0x06ac:
            h4 r13 = (defpackage.h4) r13
        L_0x06ae:
            if (r13 == 0) goto L_0x00dc
            ds2 r0 = r13.b
            sr2 r0 = (defpackage.sr2) r0
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r0.b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L_0x095d
        L_0x06c2:
            nk6 r0 = defpackage.zj6.c
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L_0x06cc
            r13 = 0
            goto L_0x06cd
        L_0x06cc:
            r13 = r0
        L_0x06cd:
            h4 r13 = (defpackage.h4) r13
            if (r13 == 0) goto L_0x00dc
            ds2 r0 = r13.b
            sr2 r0 = (defpackage.sr2) r0
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r0.b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L_0x095d
        L_0x06e3:
            nk6 r2 = defpackage.zj6.b
            java.lang.Object r2 = r14.g(r2)
            if (r2 != 0) goto L_0x06ec
            r2 = 0
        L_0x06ec:
            h4 r2 = (defpackage.h4) r2
            if (r2 == 0) goto L_0x0701
            ds2 r2 = r2.b
            sr2 r2 = (defpackage.sr2) r2
            if (r2 == 0) goto L_0x0701
            java.lang.Object r2 = r2.b()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r23 = r2
        L_0x06fe:
            r2 = 1
            r3 = 0
            goto L_0x0704
        L_0x0701:
            r23 = 0
            goto L_0x06fe
        L_0x0704:
            defpackage.oe.D(r0, r1, r2, r3, r7)
            if (r23 == 0) goto L_0x00dc
            boolean r13 = r23.booleanValue()
            goto L_0x095d
        L_0x070f:
            nk6 r0 = defpackage.jk6.l
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L_0x0718
            r0 = 0
        L_0x0718:
            boolean r0 = defpackage.sg3.e(r0, r13)
            if (r0 == 0) goto L_0x00dc
            ik2 r0 = r5.getFocusOwner()
            lk2 r0 = (defpackage.lk2) r0
            r1 = 0
            r2 = 1
            r0.c(r4, r1, r2)
            r13 = 1
            goto L_0x095d
        L_0x072c:
            boolean r0 = r5.isInTouchMode()
            if (r0 == 0) goto L_0x0735
            r5.requestFocusFromTouch()
        L_0x0735:
            nk6 r0 = defpackage.zj6.w
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L_0x073f
            r13 = 0
            goto L_0x0740
        L_0x073f:
            r13 = r0
        L_0x0740:
            h4 r13 = (defpackage.h4) r13
            if (r13 == 0) goto L_0x00dc
            ds2 r0 = r13.b
            sr2 r0 = (defpackage.sr2) r0
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r0.b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L_0x095d
        L_0x0756:
            if (r3 == 0) goto L_0x0762
            java.lang.String r1 = "ACTION_ARGUMENT_SELECTION_START_INT"
            r2 = -1
            int r20 = r3.getInt(r1, r2)
            r1 = r20
            goto L_0x0764
        L_0x0762:
            r2 = -1
            r1 = r2
        L_0x0764:
            if (r3 == 0) goto L_0x076e
            java.lang.String r4 = "ACTION_ARGUMENT_SELECTION_END_INT"
            int r9 = r3.getInt(r4, r2)
        L_0x076c:
            r2 = 0
            goto L_0x0770
        L_0x076e:
            r9 = -1
            goto L_0x076c
        L_0x0770:
            boolean r13 = r0.J(r11, r1, r9, r2)
            if (r13 == 0) goto L_0x095d
            int r1 = r0.z(r6)
            r3 = 0
            defpackage.oe.D(r0, r1, r2, r3, r7)
            goto L_0x095d
        L_0x0780:
            nk6 r0 = defpackage.zj6.q
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L_0x078a
            r13 = 0
            goto L_0x078b
        L_0x078a:
            r13 = r0
        L_0x078b:
            h4 r13 = (defpackage.h4) r13
            if (r13 == 0) goto L_0x00dc
            ds2 r0 = r13.b
            sr2 r0 = (defpackage.sr2) r0
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r0.b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L_0x095d
        L_0x07a1:
            if (r3 == 0) goto L_0x00dc
            java.lang.String r1 = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"
            int r1 = r3.getInt(r1)
            java.lang.String r7 = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"
            boolean r3 = r3.getBoolean(r7)
            if (r2 != r12) goto L_0x07b3
            r2 = 1
            goto L_0x07b4
        L_0x07b3:
            r2 = 0
        L_0x07b4:
            java.lang.Integer r7 = r0.Q
            if (r7 != 0) goto L_0x07ba
        L_0x07b8:
            r7 = -1
            goto L_0x07c1
        L_0x07ba:
            int r7 = r7.intValue()
            if (r6 == r7) goto L_0x07c9
            goto L_0x07b8
        L_0x07c1:
            r0.P = r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.Q = r6
        L_0x07c9:
            java.lang.String r6 = defpackage.oe.s(r11)
            if (r6 == 0) goto L_0x00dc
            int r7 = r6.length()
            if (r7 != 0) goto L_0x07d7
            goto L_0x00dc
        L_0x07d7:
            java.lang.String r7 = defpackage.oe.s(r11)
            if (r7 == 0) goto L_0x07f3
            int r10 = r7.length()
            if (r10 != 0) goto L_0x07e4
            goto L_0x07f3
        L_0x07e4:
            r10 = 1
            if (r1 == r10) goto L_0x0877
            r10 = 2
            if (r1 == r10) goto L_0x084e
            r5 = 4
            if (r1 == r5) goto L_0x080a
            if (r1 == r4) goto L_0x07f6
            r4 = 16
            if (r1 == r4) goto L_0x080a
        L_0x07f3:
            r13 = 0
            goto L_0x089f
        L_0x07f6:
            o4 r4 = defpackage.o4.c
            if (r4 != 0) goto L_0x0801
            o4 r4 = new o4
            r4.<init>()
            defpackage.o4.c = r4
        L_0x0801:
            o4 r13 = defpackage.o4.c
            r13.getClass()
            r13.a = r7
            goto L_0x089f
        L_0x080a:
            nk6 r4 = defpackage.zj6.a
            boolean r4 = r14.c(r4)
            if (r4 != 0) goto L_0x0813
            goto L_0x07f3
        L_0x0813:
            bg7 r4 = defpackage.i75.f(r9)
            if (r4 != 0) goto L_0x081a
            goto L_0x07f3
        L_0x081a:
            if (r1 != r5) goto L_0x0832
            m4 r5 = defpackage.m4.g
            if (r5 != 0) goto L_0x0828
            m4 r5 = new m4
            r10 = 2
            r5.<init>(r10)
            defpackage.m4.g = r5
        L_0x0828:
            m4 r13 = defpackage.m4.g
            r13.getClass()
            r13.a = r7
            r13.d = r4
            goto L_0x089f
        L_0x0832:
            n4 r5 = defpackage.n4.e
            if (r5 != 0) goto L_0x0842
            n4 r5 = new n4
            r5.<init>()
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            defpackage.n4.e = r5
        L_0x0842:
            n4 r13 = defpackage.n4.e
            r13.getClass()
            r13.a = r7
            r13.c = r4
            r13.d = r11
            goto L_0x089f
        L_0x084e:
            android.content.Context r4 = r5.getContext()
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            java.util.Locale r4 = r4.locale
            m4 r5 = defpackage.m4.f
            if (r5 != 0) goto L_0x086e
            m4 r5 = new m4
            r10 = 1
            r5.<init>(r10)
            java.text.BreakIterator r4 = java.text.BreakIterator.getWordInstance(r4)
            r5.d = r4
            defpackage.m4.f = r5
        L_0x086e:
            m4 r13 = defpackage.m4.f
            r13.getClass()
            r13.t(r7)
            goto L_0x089f
        L_0x0877:
            android.content.Context r4 = r5.getContext()
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            java.util.Locale r4 = r4.locale
            m4 r5 = defpackage.m4.e
            if (r5 != 0) goto L_0x0897
            m4 r5 = new m4
            r9 = 0
            r5.<init>(r9)
            java.text.BreakIterator r4 = java.text.BreakIterator.getCharacterInstance(r4)
            r5.d = r4
            defpackage.m4.e = r5
        L_0x0897:
            m4 r13 = defpackage.m4.e
            r13.getClass()
            r13.t(r7)
        L_0x089f:
            if (r13 != 0) goto L_0x08a3
            goto L_0x00dc
        L_0x08a3:
            int r4 = r0.p(r11)
            r7 = -1
            if (r4 != r7) goto L_0x08b2
            if (r2 == 0) goto L_0x08ae
            r4 = 0
            goto L_0x08b2
        L_0x08ae:
            int r4 = r6.length()
        L_0x08b2:
            if (r2 == 0) goto L_0x08b9
            int[] r4 = r13.e(r4)
            goto L_0x08bd
        L_0x08b9:
            int[] r4 = r13.q(r4)
        L_0x08bd:
            if (r4 != 0) goto L_0x08c1
            goto L_0x00dc
        L_0x08c1:
            r21 = 0
            r22 = r4[r21]
            r26 = 1
            r23 = r4[r26]
            if (r3 == 0) goto L_0x08f1
            nk6 r3 = defpackage.jk6.a
            boolean r3 = r14.c(r3)
            if (r3 != 0) goto L_0x08f1
            nk6 r3 = defpackage.jk6.G
            boolean r3 = r14.c(r3)
            if (r3 == 0) goto L_0x08f1
            int r3 = r0.q(r11)
            r7 = -1
            if (r3 != r7) goto L_0x08e9
            if (r2 == 0) goto L_0x08e7
            r3 = r22
            goto L_0x08e9
        L_0x08e7:
            r3 = r23
        L_0x08e9:
            if (r2 == 0) goto L_0x08ee
            r4 = r23
            goto L_0x08f9
        L_0x08ee:
            r4 = r22
            goto L_0x08f9
        L_0x08f1:
            if (r2 == 0) goto L_0x08f6
            r3 = r23
            goto L_0x08f8
        L_0x08f6:
            r3 = r22
        L_0x08f8:
            r4 = r3
        L_0x08f9:
            if (r2 == 0) goto L_0x08fe
            r20 = r12
            goto L_0x0900
        L_0x08fe:
            r20 = r8
        L_0x0900:
            le r18 = new le
            long r24 = android.os.SystemClock.uptimeMillis()
            r21 = r1
            r19 = r11
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r2 = r18
            r1 = r19
            r0.V = r2
            r2 = 1
            r0.J(r1, r3, r4, r2)
        L_0x0917:
            r13 = r2
            goto L_0x095d
        L_0x0919:
            r2 = 1
            r21 = 0
            int r3 = r0.G
            if (r3 != r1) goto L_0x0930
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.G = r3
            r3 = 0
            r0.I = r3
            r5.invalidate()
            r6 = 65536(0x10000, float:9.1835E-41)
            defpackage.oe.D(r0, r1, r6, r3, r7)
            goto L_0x0917
        L_0x0930:
            r13 = r21
            goto L_0x095d
        L_0x0933:
            r2 = 1
            r3 = 0
            r6 = 65536(0x10000, float:9.1835E-41)
            r21 = 0
            boolean r8 = r4.isEnabled()
            if (r8 == 0) goto L_0x0930
            boolean r4 = r4.isTouchExplorationEnabled()
            if (r4 == 0) goto L_0x0930
            int r4 = r0.G
            if (r4 != r1) goto L_0x094a
            goto L_0x0930
        L_0x094a:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r8) goto L_0x0951
            defpackage.oe.D(r0, r4, r6, r3, r7)
        L_0x0951:
            r0.G = r1
            r5.invalidate()
            r4 = 32768(0x8000, float:4.5918E-41)
            defpackage.oe.D(r0, r1, r4, r3, r7)
            goto L_0x0917
        L_0x095d:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ke.C(int, int, android.os.Bundle):boolean");
    }

    public void e(int i, c5 c5Var, String str, Bundle bundle) {
        switch (this.C) {
            case b85.b:
                ((oe) this.D).j(i, c5Var, str, bundle);
                return;
            default:
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v45, resolved type: uy3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v46, resolved type: uy3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v61, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v49, resolved type: c5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v49, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v50, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v54, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v112, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v113, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v118, resolved type: uy3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v120, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v73, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v74, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v46, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v75, resolved type: a42} */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r6v37, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r6v38 */
    /* JADX WARNING: type inference failed for: r7v105, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0873, code lost:
        if (r7 == false) goto L_0x087f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0156, code lost:
        if (defpackage.fk6.j(4, r7).isEmpty() != false) goto L_0x015e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x04e5  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04f4  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x04f8  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0510  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0516  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0535  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0550  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x056a  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0570  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0577  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0584  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x058a  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x05b7  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x05d5  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x05dd  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x05f0  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0616  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0629  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x062f  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0634  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x064e  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0672  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0683  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x068b  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0696  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x06a2  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x06a8  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x06c1  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x06c7  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x071c  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x073c  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x074e  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x07ed  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x07f0  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x083a  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0859  */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x0885  */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x08e3  */
    /* JADX WARNING: Removed duplicated region for block: B:463:0x097b  */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x097f  */
    /* JADX WARNING: Removed duplicated region for block: B:503:0x0a3f  */
    /* JADX WARNING: Removed duplicated region for block: B:509:0x0a6c  */
    /* JADX WARNING: Removed duplicated region for block: B:511:0x0a70  */
    /* JADX WARNING: Removed duplicated region for block: B:518:0x0a98  */
    /* JADX WARNING: Removed duplicated region for block: B:521:0x0aa2  */
    /* JADX WARNING: Removed duplicated region for block: B:541:0x0af5  */
    /* JADX WARNING: Removed duplicated region for block: B:543:0x0af9  */
    /* JADX WARNING: Removed duplicated region for block: B:550:0x0b21  */
    /* JADX WARNING: Removed duplicated region for block: B:553:0x0b2b  */
    /* JADX WARNING: Removed duplicated region for block: B:561:0x0b51  */
    /* JADX WARNING: Removed duplicated region for block: B:564:0x0b64  */
    /* JADX WARNING: Removed duplicated region for block: B:565:0x0b68  */
    /* JADX WARNING: Removed duplicated region for block: B:568:0x0b77  */
    /* JADX WARNING: Removed duplicated region for block: B:615:0x0cae  */
    /* JADX WARNING: Removed duplicated region for block: B:616:0x0cb2  */
    /* JADX WARNING: Removed duplicated region for block: B:619:0x0cbf  */
    /* JADX WARNING: Removed duplicated region for block: B:620:0x0ccf  */
    /* JADX WARNING: Removed duplicated region for block: B:623:0x0cd9  */
    /* JADX WARNING: Removed duplicated region for block: B:626:0x0cea  */
    /* JADX WARNING: Removed duplicated region for block: B:630:0x0cf2  */
    /* JADX WARNING: Removed duplicated region for block: B:662:0x0855 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:676:? A[RETURN, SYNTHETIC] */
    public final c5 n(int i) {
        oe oeVar;
        c5 c5Var;
        int i2;
        float f;
        Throwable th;
        cz6 cz6;
        AccessibilityManager accessibilityManager;
        boolean z;
        oe oeVar2;
        je jeVar;
        wo4 wo4;
        Resources resources;
        AccessibilityNodeInfo accessibilityNodeInfo;
        ak6 ak6;
        s86 s86;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        c5 c5Var2;
        fk6 fk6;
        SpannableString spannableString;
        nk6 nk6;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        AccessibilityNodeInfo accessibilityNodeInfo4;
        Object g;
        ij7 ij7;
        Object g2;
        Boolean bool;
        s86 s862;
        int i3;
        Object g3;
        String str;
        Object g4;
        Object g5;
        Object g6;
        Object g7;
        Integer num;
        int i4;
        boolean z2;
        fk6 fk62;
        Object g8;
        f94 f94;
        Object g9;
        h4 h4Var;
        h4 h4Var2;
        h4 h4Var3;
        mq5 mq5;
        Object g10;
        vg6 vg6;
        vg6 vg62;
        int i5;
        int d;
        je jeVar2;
        String str2;
        boolean z3;
        Object g11;
        Object g12;
        uy3 uy3;
        w4 w4Var;
        w4 w4Var2;
        int i6;
        int i7;
        h4 h4Var4;
        String str3;
        uy3 uy32;
        uy3 uy33;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i8;
        boolean z8;
        Object g13;
        List list;
        String str4;
        ArrayList arrayList;
        kf7 kf7;
        int i9;
        am2 am2;
        int i10;
        int i11;
        boolean z9;
        fk6 fk63;
        int i12;
        Integer num2;
        View view;
        boolean z10;
        int i13 = i;
        int i14 = this.C;
        k4 k4Var = this.D;
        switch (i14) {
            case b85.b:
                Float valueOf = Float.valueOf(0.0f);
                oe oeVar3 = (oe) k4Var;
                AccessibilityManager accessibilityManager2 = oeVar3.C;
                je jeVar3 = oeVar3.z;
                if (jeVar3.getComposeViewContext().c().k().G0() != k54.w) {
                    hk6 hk6 = (hk6) oeVar3.r().b(i13);
                    if (hk6 != null) {
                        fk6 fk64 = hk6.a;
                        ak6 k = fk64.k();
                        uy3 uy34 = fk64.c;
                        Object g14 = k.w.g(jk6.o);
                        if (g14 == null) {
                            g14 = null;
                        }
                        boolean e = sg3.e(g14, Boolean.TRUE);
                        if (e) {
                            if (Build.VERSION.SDK_INT >= 34) {
                                z10 = l4.j(accessibilityManager2);
                            } else {
                                z10 = true;
                            }
                            if (!z10) {
                                oeVar = oeVar3;
                                i2 = i13;
                                c5Var = null;
                                if (!oeVar.K) {
                                }
                            }
                        }
                        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
                        c5 c5Var3 = new c5(obtain);
                        int i15 = Build.VERSION.SDK_INT;
                        if (i15 >= 34) {
                            l4.l(obtain, e);
                            f = 0.0f;
                        } else {
                            f = 0.0f;
                            c5Var3.h(64, e);
                        }
                        if (i13 == -1) {
                            ViewParent parentForAccessibility = jeVar3.getParentForAccessibility();
                            th = null;
                            if (parentForAccessibility instanceof View) {
                                view = (View) parentForAccessibility;
                            } else {
                                view = null;
                            }
                            c5Var3.b = -1;
                            obtain.setParent(view);
                        } else {
                            th = null;
                            fk6 l = fk64.l();
                            if (l != null) {
                                num2 = Integer.valueOf(l.f);
                            } else {
                                num2 = null;
                            }
                            if (num2 != null) {
                                int intValue = num2.intValue();
                                if (intValue == jeVar3.getSemanticsOwner().a().f) {
                                    intValue = -1;
                                }
                                c5Var3.b = intValue;
                                obtain.setParent(jeVar3, intValue);
                            } else {
                                yb3.c("semanticsNode " + i13 + " has null parent");
                                ta1.e();
                                return null;
                            }
                        }
                        c5Var3.c = i13;
                        obtain.setSource(jeVar3, i13);
                        obtain.setBoundsInScreen(oeVar3.k(hk6));
                        wo4 wo42 = oeVar3.g0;
                        cz6 cz62 = oeVar3.O;
                        Resources resources2 = jeVar3.getContext().getResources();
                        c5Var3.i("android.view.View");
                        ak6 ak62 = fk64.d;
                        tp4 tp4 = ak62.w;
                        if (tp4.c(jk6.G)) {
                            c5Var3.i("android.widget.EditText");
                        }
                        if (tp4.c(jk6.C)) {
                            c5Var3.i("android.widget.TextView");
                        }
                        Object g15 = tp4.g(jk6.z);
                        if (g15 == null) {
                            g15 = th;
                        }
                        s86 s863 = (s86) g15;
                        Float f2 = valueOf;
                        if (s863 != null) {
                            int i16 = s863.a;
                            if (!fk64.o()) {
                                accessibilityManager = accessibilityManager2;
                                i12 = 4;
                                cz6 = cz62;
                                break;
                            } else {
                                accessibilityManager = accessibilityManager2;
                                i12 = 4;
                                cz6 = cz62;
                            }
                            if (i16 == i12) {
                                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.tab));
                            } else if (i16 == 2) {
                                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.switch_role));
                            } else {
                                String p = i75.p(i16);
                                if (i16 != 5 || fk64.q() || ak62.y) {
                                    c5Var3.i(p);
                                }
                            }
                        } else {
                            accessibilityManager = accessibilityManager2;
                            cz6 = cz62;
                        }
                        obtain.setPackageName(jeVar3.getContext().getPackageName());
                        obtain.setImportantForAccessibility(we.A(fk64));
                        if (i15 >= 34) {
                            z = l4.j(accessibilityManager);
                        } else {
                            z = true;
                        }
                        List j = fk6.j(4, fk64);
                        int size = j.size();
                        boolean z11 = z;
                        uy3 uy35 = uy34;
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            AccessibilityNodeInfo accessibilityNodeInfo5 = c5Var3.a;
                            if (i18 < size) {
                                int i19 = size;
                                List list2 = j;
                                me3 r = oeVar3.r();
                                int i20 = ((fk6) j.get(i18)).f;
                                if (r.a(i20)) {
                                    jeVar3.getAndroidViewsHandler();
                                    if (i20 != -1) {
                                        hk6 hk62 = (hk6) oeVar3.r().b(i20);
                                        if (hk62 == null || (fk63 = hk62.a) == null) {
                                            i11 = i18;
                                            z9 = false;
                                        } else {
                                            i11 = i18;
                                            Object g16 = fk63.k().w.g(jk6.o);
                                            if (g16 == null) {
                                                g16 = th;
                                            }
                                            z9 = sg3.e(g16, Boolean.TRUE);
                                        }
                                        if (z11 || !z9) {
                                            accessibilityNodeInfo5.addChild(jeVar3, i20);
                                        }
                                        wo42.f(i20, i17);
                                        i17++;
                                        i18 = i11 + 1;
                                        j = list2;
                                        size = i19;
                                    }
                                }
                                i11 = i18;
                                i18 = i11 + 1;
                                j = list2;
                                size = i19;
                            } else {
                                if (i13 == oeVar3.G) {
                                    accessibilityNodeInfo5.setAccessibilityFocused(true);
                                    c5Var3.b(w4.g);
                                } else {
                                    accessibilityNodeInfo5.setAccessibilityFocused(false);
                                    c5Var3.b(w4.f);
                                }
                                vl L = fd1.L(fk64);
                                if (L != null) {
                                    jeVar3.getFontFamilyResolver();
                                    tp1 density = jeVar3.getDensity();
                                    cf4 cf4 = oeVar3.c0;
                                    String str5 = L.x;
                                    jeVar = jeVar3;
                                    List list3 = L.w;
                                    SpannableString spannableString2 = new SpannableString(str5);
                                    String str6 = str5;
                                    ArrayList arrayList2 = L.y;
                                    oeVar2 = oeVar3;
                                    if (arrayList2 != null) {
                                        int size2 = arrayList2.size();
                                        wo4 = wo42;
                                        int i21 = 0;
                                        while (i21 < size2) {
                                            int i22 = size2;
                                            ul ulVar = (ul) arrayList2.get(i21);
                                            int i23 = i21;
                                            yy6 yy6 = (yy6) ulVar.a;
                                            ArrayList arrayList3 = arrayList2;
                                            int i24 = ulVar.b;
                                            int i25 = ulVar.c;
                                            ak6 ak63 = ak62;
                                            s86 s864 = s863;
                                            long b = yy6.a.b();
                                            Resources resources3 = resources2;
                                            AccessibilityNodeInfo accessibilityNodeInfo6 = accessibilityNodeInfo5;
                                            long j2 = yy6.b;
                                            Resources resources4 = resources3;
                                            am2 am22 = yy6.c;
                                            yl2 yl2 = yy6.d;
                                            long j3 = j2;
                                            lf7 lf7 = yy6.j;
                                            ya4 ya4 = yy6.k;
                                            AccessibilityNodeInfo accessibilityNodeInfo7 = obtain;
                                            c5 c5Var4 = c5Var3;
                                            long j4 = yy6.l;
                                            rd7 rd7 = yy6.m;
                                            kf7 kf72 = yy6.a;
                                            fk6 fk65 = fk64;
                                            if (jt0.c(b, kf72.b())) {
                                                kf7 = kf72;
                                            } else if (b != 16) {
                                                kf7 = new xt0(b);
                                            } else {
                                                kf7 = jf7.a;
                                            }
                                            t75.G(spannableString2, kf7.b(), i24, i25);
                                            int i26 = i25;
                                            SpannableString spannableString3 = spannableString2;
                                            int i27 = i24;
                                            t75.H(spannableString3, j3, density, i27, i26);
                                            SpannableString spannableString4 = spannableString3;
                                            int i28 = i27;
                                            int i29 = i26;
                                            if (am22 == null && yl2 == null) {
                                                i9 = 33;
                                            } else {
                                                if (am22 == null) {
                                                    am2 = am2.y;
                                                } else {
                                                    am2 = am22;
                                                }
                                                if (yl2 != null) {
                                                    i10 = yl2.a;
                                                } else {
                                                    i10 = 0;
                                                }
                                                StyleSpan styleSpan = new StyleSpan(rd3.s(am2, i10));
                                                i9 = 33;
                                                spannableString4.setSpan(styleSpan, i28, i29, 33);
                                            }
                                            if (rd7 != null) {
                                                int i30 = rd7.a;
                                                if ((i30 | 1) == i30) {
                                                    spannableString4.setSpan(new UnderlineSpan(), i28, i29, i9);
                                                }
                                                if ((i30 | 2) == i30) {
                                                    spannableString4.setSpan(new StrikethroughSpan(), i28, i29, i9);
                                                }
                                            }
                                            if (lf7 != null) {
                                                spannableString4.setSpan(new ScaleXSpan(lf7.a), i28, i29, i9);
                                            }
                                            t75.I(spannableString4, ya4, i28, i29);
                                            if (j4 != 16) {
                                                spannableString4.setSpan(new BackgroundColorSpan(uq3.M(j4)), i28, i29, i9);
                                            }
                                            i21 = i23 + 1;
                                            int i31 = i;
                                            spannableString2 = spannableString4;
                                            fk64 = fk65;
                                            size2 = i22;
                                            arrayList2 = arrayList3;
                                            ak62 = ak63;
                                            s863 = s864;
                                            accessibilityNodeInfo5 = accessibilityNodeInfo6;
                                            resources2 = resources4;
                                            obtain = accessibilityNodeInfo7;
                                            c5Var3 = c5Var4;
                                        }
                                    } else {
                                        wo4 = wo42;
                                    }
                                    SpannableString spannableString5 = spannableString2;
                                    resources = resources2;
                                    accessibilityNodeInfo = accessibilityNodeInfo5;
                                    ak6 = ak62;
                                    s86 = s863;
                                    accessibilityNodeInfo2 = obtain;
                                    c5Var2 = c5Var3;
                                    fk6 = fk64;
                                    int length = str6.length();
                                    a42 a42 = a42.w;
                                    if (list3 != null) {
                                        arrayList = new ArrayList(list3.size());
                                        int size3 = list3.size();
                                        for (int i32 = 0; i32 < size3; i32++) {
                                            Object obj = list3.get(i32);
                                            ul ulVar2 = (ul) obj;
                                            if ((ulVar2.a instanceof c48) && wl.b(0, length, ulVar2.b, ulVar2.c)) {
                                                arrayList.add(obj);
                                            }
                                        }
                                    } else {
                                        arrayList = a42;
                                    }
                                    int size4 = arrayList.size();
                                    int i33 = 0;
                                    while (i33 < size4) {
                                        ul ulVar3 = (ul) arrayList.get(i33);
                                        c48 c48 = (c48) ulVar3.a;
                                        int i34 = ulVar3.b;
                                        int i35 = ulVar3.c;
                                        if (c48 instanceof c48) {
                                            spannableString5.setSpan(new TtsSpan.VerbatimBuilder(c48.a).build(), i34, i35, 33);
                                            i33++;
                                        } else {
                                            h.c();
                                        }
                                    }
                                    int length2 = str6.length();
                                    a42 a422 = a42;
                                    if (list3 != null) {
                                        ArrayList arrayList4 = new ArrayList(list3.size());
                                        int size5 = list3.size();
                                        for (int i36 = 0; i36 < size5; i36++) {
                                            Object obj2 = list3.get(i36);
                                            ul ulVar4 = (ul) obj2;
                                            if ((ulVar4.a instanceof uu7) && wl.b(0, length2, ulVar4.b, ulVar4.c)) {
                                                arrayList4.add(obj2);
                                            }
                                        }
                                        a422 = arrayList4;
                                    }
                                    int size6 = a422.size();
                                    for (int i37 = 0; i37 < size6; i37++) {
                                        ul ulVar5 = (ul) a422.get(i37);
                                        uu7 uu7 = (uu7) ulVar5.a;
                                        int i38 = ulVar5.b;
                                        int i39 = ulVar5.c;
                                        WeakHashMap weakHashMap = (WeakHashMap) cf4.x;
                                        Object obj3 = weakHashMap.get(uu7);
                                        if (obj3 == null) {
                                            obj3 = new URLSpan(uu7.a);
                                            weakHashMap.put(uu7, obj3);
                                        }
                                        spannableString5.setSpan((URLSpan) obj3, i38, i39, 33);
                                    }
                                    List a = L.a(str6.length());
                                    int size7 = a.size();
                                    for (int i40 = 0; i40 < size7; i40++) {
                                        ul ulVar6 = (ul) a.get(i40);
                                        int i41 = ulVar6.b;
                                        Object obj4 = ulVar6.a;
                                        int i42 = ulVar6.c;
                                        if (i41 != i42) {
                                            b74 b74 = (b74) obj4;
                                            if (b74 instanceof a74) {
                                                obj4.getClass();
                                                a74 a74 = (a74) obj4;
                                                ul ulVar7 = new ul(i41, i42, a74);
                                                WeakHashMap weakHashMap2 = (WeakHashMap) cf4.y;
                                                Object obj5 = weakHashMap2.get(ulVar7);
                                                if (obj5 == null) {
                                                    obj5 = new URLSpan(a74.a);
                                                    weakHashMap2.put(ulVar7, obj5);
                                                }
                                                spannableString5.setSpan((URLSpan) obj5, i41, i42, 33);
                                            } else {
                                                WeakHashMap weakHashMap3 = (WeakHashMap) cf4.z;
                                                Object obj6 = weakHashMap3.get(ulVar6);
                                                if (obj6 == null) {
                                                    obj6 = new bx0(b74);
                                                    weakHashMap3.put(ulVar6, obj6);
                                                }
                                                spannableString5.setSpan((ClickableSpan) obj6, i41, i42, 33);
                                            }
                                        }
                                    }
                                    spannableString = (SpannableString) oe.O(spannableString5);
                                    c5 c5Var5 = c5Var2;
                                    c5Var5.l(spannableString);
                                    nk6 = jk6.M;
                                    if (!tp4.c(nk6)) {
                                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                                        accessibilityNodeInfo4.setContentInvalid(true);
                                        Object g17 = tp4.g(nk6);
                                        if (g17 == null) {
                                            g17 = th;
                                        }
                                        accessibilityNodeInfo3 = accessibilityNodeInfo;
                                        accessibilityNodeInfo3.setError((CharSequence) g17);
                                    } else {
                                        accessibilityNodeInfo3 = accessibilityNodeInfo;
                                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                                    }
                                    Resources resources5 = resources;
                                    String K = fd1.K(fk6, resources5);
                                    if (Build.VERSION.SDK_INT < 30) {
                                        x4.j(accessibilityNodeInfo3, K);
                                    } else {
                                        accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", K);
                                    }
                                    accessibilityNodeInfo3.setCheckable(fd1.J(fk6));
                                    g = tp4.g(jk6.K);
                                    if (g == null) {
                                        g = th;
                                    }
                                    ij7 = (ij7) g;
                                    if (ij7 != null) {
                                        if (ij7 == ij7.w) {
                                            accessibilityNodeInfo3.setChecked(true);
                                        } else if (ij7 == ij7.x) {
                                            accessibilityNodeInfo3.setChecked(false);
                                        }
                                    }
                                    g2 = tp4.g(jk6.J);
                                    if (g2 == null) {
                                        g2 = th;
                                    }
                                    bool = (Boolean) g2;
                                    if (bool == null) {
                                        boolean booleanValue = bool.booleanValue();
                                        if (s86 == null) {
                                            s862 = s86;
                                            i3 = 4;
                                        } else {
                                            s862 = s86;
                                            i3 = 4;
                                            if (s862.a == 4) {
                                                accessibilityNodeInfo4.setSelected(booleanValue);
                                            }
                                        }
                                        accessibilityNodeInfo3.setChecked(booleanValue);
                                    } else {
                                        s862 = s86;
                                        i3 = 4;
                                    }
                                    ak6 ak64 = ak6;
                                    if (!ak64.y || fk6.j(i3, fk6).isEmpty()) {
                                        g13 = tp4.g(jk6.a);
                                        if (g13 == null) {
                                            g13 = th;
                                        }
                                        list = (List) g13;
                                        if (list == null) {
                                            str4 = (String) dt0.y0(list);
                                        } else {
                                            str4 = th;
                                        }
                                        accessibilityNodeInfo3.setContentDescription(str4);
                                    }
                                    g3 = tp4.g(jk6.A);
                                    if (g3 == null) {
                                        g3 = th;
                                    }
                                    str = (String) g3;
                                    if (str != null) {
                                        fk6 fk66 = fk6;
                                        while (true) {
                                            if (fk66 != null) {
                                                ak6 ak65 = fk66.d;
                                                nk6 nk62 = kk6.a;
                                                if (ak65.w.c(nk62)) {
                                                    z8 = ((Boolean) ak65.k(nk62)).booleanValue();
                                                } else {
                                                    fk66 = fk66.l();
                                                }
                                            } else {
                                                z8 = false;
                                            }
                                        }
                                        if (z8) {
                                            accessibilityNodeInfo4.setViewIdResourceName(str);
                                        }
                                    }
                                    g4 = tp4.g(jk6.h);
                                    if (g4 == null) {
                                        g4 = th;
                                    }
                                    if (((vs7) g4) != null) {
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            accessibilityNodeInfo3.setHeading(true);
                                        } else {
                                            c5Var5.h(2, true);
                                        }
                                    }
                                    g5 = tp4.g(jk6.i);
                                    if (g5 == null) {
                                        g5 = th;
                                    }
                                    if (((vs7) g5) != null) {
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            accessibilityNodeInfo4.setTextEntryKey(true);
                                        } else {
                                            c5Var5.h(8, true);
                                        }
                                    }
                                    i2 = i;
                                    if (i2 != -1) {
                                        int d2 = wo4.d(fk6.f);
                                        if (d2 != -1) {
                                            accessibilityNodeInfo4.setDrawingOrder(d2);
                                        } else {
                                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                                        }
                                    }
                                    accessibilityNodeInfo4.setPassword(tp4.c(jk6.L));
                                    g6 = tp4.g(jk6.O);
                                    if (g6 == null) {
                                        g6 = th;
                                    }
                                    Boolean bool2 = Boolean.TRUE;
                                    accessibilityNodeInfo4.setEditable(sg3.e(g6, bool2));
                                    g7 = tp4.g(jk6.P);
                                    if (g7 == null) {
                                        g7 = th;
                                    }
                                    num = (Integer) g7;
                                    if (num == null) {
                                        i4 = num.intValue();
                                    } else {
                                        i4 = -1;
                                    }
                                    accessibilityNodeInfo3.setMaxTextLength(i4);
                                    accessibilityNodeInfo3.setEnabled(fd1.o(fk6));
                                    nk6 nk63 = jk6.l;
                                    accessibilityNodeInfo3.setFocusable(tp4.c(nk63));
                                    if (!accessibilityNodeInfo4.isFocusable()) {
                                        accessibilityNodeInfo3.setFocused(((Boolean) ak64.k(nk63)).booleanValue());
                                        if (accessibilityNodeInfo4.isFocused()) {
                                            c5Var5.a(2);
                                            oeVar = oeVar2;
                                            oeVar.H = i2;
                                        } else {
                                            oeVar = oeVar2;
                                            z2 = true;
                                            c5Var5.a(1);
                                            accessibilityNodeInfo3.setVisibleToUser(we.z(fk6) ^ z2);
                                            if (fk6.o()) {
                                                fk62 = fk6.l();
                                                fk62.getClass();
                                            } else {
                                                fk62 = fk6;
                                            }
                                            if (fk62.m().f()) {
                                                accessibilityNodeInfo3.setVisibleToUser(false);
                                            }
                                            g8 = tp4.g(jk6.k);
                                            if (g8 == null) {
                                                g8 = th;
                                            }
                                            f94 = (f94) g8;
                                            if (f94 != null) {
                                                int i43 = f94.a;
                                                if (i43 != 0 && i43 == 1) {
                                                    i8 = 2;
                                                } else {
                                                    i8 = 1;
                                                }
                                                accessibilityNodeInfo4.setLiveRegion(i8);
                                            }
                                            accessibilityNodeInfo3.setClickable(false);
                                            g9 = tp4.g(zj6.b);
                                            if (g9 == null) {
                                                g9 = th;
                                            }
                                            h4Var = (h4) g9;
                                            if (h4Var != null) {
                                                Object g18 = tp4.g(jk6.J);
                                                if (g18 == null) {
                                                    g18 = th;
                                                }
                                                boolean e2 = sg3.e(g18, bool2);
                                                if ((s862 != null && s862.a == 4) || (s862 != null && s862.a == 3)) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                                if (!z6 || (z6 && !e2)) {
                                                    z7 = true;
                                                } else {
                                                    z7 = false;
                                                }
                                                accessibilityNodeInfo3.setClickable(z7);
                                                if (fd1.o(fk6) && accessibilityNodeInfo4.isClickable()) {
                                                    c5Var5.b(new w4(16, h4Var.a));
                                                }
                                            }
                                            accessibilityNodeInfo3.setLongClickable(false);
                                            h4Var2 = (h4) z65.z(ak64, zj6.c);
                                            if (h4Var2 != null) {
                                                accessibilityNodeInfo3.setLongClickable(true);
                                                if (fd1.o(fk6)) {
                                                    c5Var5.b(new w4(32, h4Var2.a));
                                                }
                                            }
                                            h4Var3 = (h4) z65.z(ak64, zj6.q);
                                            if (h4Var3 != null) {
                                                c5Var5.b(new w4(16384, h4Var3.a));
                                            }
                                            if (fd1.o(fk6)) {
                                                h4 h4Var5 = (h4) z65.z(ak64, zj6.k);
                                                if (h4Var5 != null) {
                                                    c5Var5.b(new w4(2097152, h4Var5.a));
                                                }
                                                h4 h4Var6 = (h4) z65.z(ak64, zj6.p);
                                                if (h4Var6 != null) {
                                                    c5Var5.b(new w4(16908372, h4Var6.a));
                                                }
                                                h4 h4Var7 = (h4) z65.z(ak64, zj6.r);
                                                if (h4Var7 != null) {
                                                    c5Var5.b(new w4(65536, h4Var7.a));
                                                }
                                                h4 h4Var8 = (h4) z65.z(ak64, zj6.s);
                                                if (h4Var8 != null && accessibilityNodeInfo4.isFocused()) {
                                                    ClipDescription primaryClipDescription = ((td) jeVar.getClipboardManager()).a().getPrimaryClipDescription();
                                                    if (primaryClipDescription != null) {
                                                        z5 = primaryClipDescription.hasMimeType("text/*");
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    if (z5) {
                                                        c5Var5.b(new w4(32768, h4Var8.a));
                                                    }
                                                }
                                            }
                                            String s = oe.s(fk6);
                                            if (!(s == null || s.length() == 0)) {
                                                accessibilityNodeInfo4.setTextSelection(oeVar.q(fk6), oeVar.p(fk6));
                                                h4Var4 = (h4) z65.z(ak64, zj6.j);
                                                if (h4Var4 != null) {
                                                    str3 = h4Var4.a;
                                                } else {
                                                    str3 = th;
                                                }
                                                c5Var5.b(new w4(131072, str3));
                                                c5Var5.a(256);
                                                c5Var5.a(512);
                                                accessibilityNodeInfo3.setMovementGranularities(11);
                                                List list4 = (List) z65.z(ak64, jk6.a);
                                                if ((list4 == null || list4.isEmpty()) && tp4.c(zj6.a) && (!tp4.c(jk6.G) || sg3.e(z65.z(ak64, nk63), bool2))) {
                                                    uy32 = uy35.v();
                                                    while (true) {
                                                        if (uy32 == null) {
                                                            uy33 = th;
                                                        } else {
                                                            ak6 x = uy32.x();
                                                            if (x != null && x.y) {
                                                                if (x.w.c(jk6.G)) {
                                                                    uy33 = uy32;
                                                                }
                                                            }
                                                            uy32 = uy32.v();
                                                        }
                                                    }
                                                    if (uy33 != 0) {
                                                        ak6 x2 = uy33.x();
                                                        if (x2 == null) {
                                                            z4 = false;
                                                            break;
                                                        } else {
                                                            Object g19 = x2.w.g(jk6.l);
                                                            if (g19 == null) {
                                                                g19 = th;
                                                            }
                                                            z4 = sg3.e(g19, Boolean.TRUE);
                                                            break;
                                                        }
                                                    }
                                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                                }
                                            }
                                            if (Build.VERSION.SDK_INT >= 26) {
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add("androidx.compose.ui.semantics.id");
                                                CharSequence g20 = c5Var5.g();
                                                if (!(g20 == null || g20.length() == 0 || !tp4.c(zj6.a))) {
                                                    arrayList5.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                                }
                                                if (tp4.c(jk6.A)) {
                                                    arrayList5.add("androidx.compose.ui.semantics.testTag");
                                                }
                                                if (tp4.c(jk6.Q)) {
                                                    arrayList5.add("androidx.compose.ui.semantics.shapeType");
                                                    arrayList5.add("androidx.compose.ui.semantics.shapeRect");
                                                    arrayList5.add("androidx.compose.ui.semantics.shapeCorners");
                                                    arrayList5.add("androidx.compose.ui.semantics.shapeRegion");
                                                }
                                                if (Build.VERSION.SDK_INT >= 26) {
                                                    accessibilityNodeInfo4.setAvailableExtraData(arrayList5);
                                                }
                                            }
                                            mq5 = (mq5) z65.z(ak64, jk6.c);
                                            if (mq5 != null) {
                                                float f3 = mq5.a;
                                                ms0 ms0 = mq5.b;
                                                nk6 nk64 = zj6.i;
                                                if (tp4.c(nk64)) {
                                                    c5Var5.i("android.widget.SeekBar");
                                                } else {
                                                    c5Var5.i("android.widget.ProgressBar");
                                                }
                                                if (mq5 != mq5.c) {
                                                    accessibilityNodeInfo3.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new b5(AccessibilityNodeInfo.RangeInfo.obtain(1, f2.floatValue(), ((Number) ms0.a()).floatValue(), f3)).a);
                                                }
                                                if (fk6.n().w.c(nk64) && fd1.o(fk6)) {
                                                    float floatValue = ((Number) ms0.a()).floatValue();
                                                    float floatValue2 = f2.floatValue();
                                                    if (floatValue < floatValue2) {
                                                        floatValue = floatValue2;
                                                    }
                                                    if (f3 < floatValue) {
                                                        c5Var5.b(w4.h);
                                                    }
                                                    float floatValue3 = f2.floatValue();
                                                    float floatValue4 = ((Number) ms0.a()).floatValue();
                                                    if (floatValue3 > floatValue4) {
                                                        floatValue3 = floatValue4;
                                                    }
                                                    if (f3 > floatValue3) {
                                                        c5Var5.b(w4.i);
                                                    }
                                                }
                                            }
                                            x91.i(c5Var5, fk6);
                                            rj1.H(c5Var5, fk6);
                                            g10 = fk6.k().w.g(jk6.g);
                                            if (g10 == null) {
                                                g10 = th;
                                            }
                                            if (g10 == null) {
                                                fk6 l2 = fk6.l();
                                                if (l2 != null) {
                                                    Object g21 = l2.k().w.g(jk6.e);
                                                    if (g21 == null) {
                                                        g21 = th;
                                                    }
                                                    if (g21 != null) {
                                                        Object g22 = l2.k().w.g(jk6.f);
                                                        if (g22 == null) {
                                                            g22 = th;
                                                        }
                                                        at0 at0 = (at0) g22;
                                                        if (at0 == null || (at0.a >= 0 && at0.b >= 0)) {
                                                            if (fk6.k().w.c(jk6.J)) {
                                                                ArrayList arrayList6 = new ArrayList();
                                                                List j5 = fk6.j(4, l2);
                                                                int size8 = j5.size();
                                                                int i44 = 0;
                                                                for (int i45 = 0; i45 < size8; i45++) {
                                                                    fk6 fk67 = (fk6) j5.get(i45);
                                                                    if (fk67.k().w.c(jk6.J)) {
                                                                        arrayList6.add(fk67);
                                                                        if (fk67.c.w() < fk6.c.w()) {
                                                                            i44++;
                                                                        }
                                                                    }
                                                                }
                                                                if (!arrayList6.isEmpty()) {
                                                                    boolean n = rj1.n(arrayList6);
                                                                    if (n) {
                                                                        i6 = 0;
                                                                    } else {
                                                                        i6 = i44;
                                                                    }
                                                                    if (n) {
                                                                        i7 = i44;
                                                                    } else {
                                                                        i7 = 0;
                                                                    }
                                                                    Object g23 = fk6.k().w.g(jk6.J);
                                                                    if (g23 == null) {
                                                                        g23 = Boolean.FALSE;
                                                                    }
                                                                    accessibilityNodeInfo3.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i6, 1, i7, 1, false, ((Boolean) g23).booleanValue()));
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                ku4.a();
                                            }
                                            vg6 = (vg6) z65.z(fk6.n(), jk6.v);
                                            h4 h4Var9 = (h4) z65.z(fk6.n(), zj6.d);
                                            if (!(vg6 == null || h4Var9 == null)) {
                                                g12 = fk6.k().w.g(jk6.f);
                                                if (g12 == null) {
                                                    g12 = th;
                                                }
                                                if (g12 == null) {
                                                    Object g24 = fk6.k().w.g(jk6.e);
                                                    if (g24 == null) {
                                                        g24 = th;
                                                    }
                                                    if (g24 == null) {
                                                        c5Var5.i("android.widget.HorizontalScrollView");
                                                    }
                                                }
                                                if (((Number) vg6.b.b()).floatValue() > f) {
                                                    c5Var5.k(true);
                                                }
                                                if (fd1.o(fk6)) {
                                                    boolean y = oe.y(vg6);
                                                    ey3 ey3 = ey3.x;
                                                    if (y) {
                                                        c5Var5.b(w4.h);
                                                        uy3 = uy35;
                                                        if (uy3.U == ey3) {
                                                            w4Var2 = w4.n;
                                                        } else {
                                                            w4Var2 = w4.p;
                                                        }
                                                        c5Var5.b(w4Var2);
                                                    } else {
                                                        uy3 = uy35;
                                                    }
                                                    if (oe.x(vg6)) {
                                                        c5Var5.b(w4.i);
                                                        if (uy3.U == ey3) {
                                                            w4Var = w4.p;
                                                        } else {
                                                            w4Var = w4.n;
                                                        }
                                                        c5Var5.b(w4Var);
                                                    }
                                                }
                                            }
                                            vg62 = (vg6) z65.z(fk6.n(), jk6.w);
                                            if (!(vg62 == null || h4Var9 == null)) {
                                                g11 = fk6.k().w.g(jk6.f);
                                                if (g11 == null) {
                                                    g11 = th;
                                                }
                                                if (g11 == null) {
                                                    Object g25 = fk6.k().w.g(jk6.e);
                                                    if (g25 == null) {
                                                        g25 = th;
                                                    }
                                                    if (g25 == null) {
                                                        c5Var5.i("android.widget.ScrollView");
                                                    }
                                                }
                                                if (((Number) vg62.b.b()).floatValue() > f) {
                                                    c5Var5.k(true);
                                                }
                                                if (fd1.o(fk6)) {
                                                    if (oe.y(vg62)) {
                                                        c5Var5.b(w4.h);
                                                        c5Var5.b(w4.o);
                                                    }
                                                    if (oe.x(vg62)) {
                                                        c5Var5.b(w4.i);
                                                        c5Var5.b(w4.m);
                                                    }
                                                }
                                            }
                                            i5 = Build.VERSION.SDK_INT;
                                            if (i5 >= 29) {
                                                ed1.f(c5Var5, fk6);
                                            }
                                            CharSequence charSequence = (CharSequence) z65.z(fk6.n(), jk6.d);
                                            if (i5 >= 28) {
                                                accessibilityNodeInfo3.setPaneTitle(charSequence);
                                            } else {
                                                accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                            }
                                            if (fd1.o(fk6)) {
                                                h4 h4Var10 = (h4) z65.z(fk6.n(), zj6.t);
                                                if (h4Var10 != null) {
                                                    c5Var5.b(new w4(262144, h4Var10.a));
                                                }
                                                h4 h4Var11 = (h4) z65.z(fk6.n(), zj6.u);
                                                if (h4Var11 != null) {
                                                    c5Var5.b(new w4(524288, h4Var11.a));
                                                }
                                                h4 h4Var12 = (h4) z65.z(fk6.n(), zj6.v);
                                                if (h4Var12 != null) {
                                                    c5Var5.b(new w4(1048576, h4Var12.a));
                                                }
                                                ak6 n2 = fk6.n();
                                                nk6 nk65 = zj6.x;
                                                if (n2.w.c(nk65)) {
                                                    List list5 = (List) fk6.n().k(nk65);
                                                    int size9 = list5.size();
                                                    xo4 xo4 = oe.l0;
                                                    int i46 = xo4.b;
                                                    if (size9 < i46) {
                                                        cz6 cz63 = new cz6(0);
                                                        hp4 a2 = v25.a();
                                                        cz6 cz64 = cz6;
                                                        if (cz64.w) {
                                                            rg3.e(cz64);
                                                        }
                                                        if (ie1.q(cz64.z, i2, cz64.x) >= 0) {
                                                            z3 = true;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                        if (z3) {
                                                            hp4 hp4 = (hp4) cz64.c(i2);
                                                            int[] iArr = xo4.a;
                                                            int i47 = xo4.b;
                                                            int[] iArr2 = new int[16];
                                                            int i48 = 0;
                                                            int i49 = 0;
                                                            while (i48 < i47) {
                                                                int i50 = iArr[i48];
                                                                int i51 = i47;
                                                                int i52 = i49 + 1;
                                                                hp4 hp42 = hp4;
                                                                if (iArr2.length < i52) {
                                                                    iArr2 = Arrays.copyOf(iArr2, Math.max(i52, (iArr2.length * 3) / 2));
                                                                }
                                                                iArr2[i49] = i50;
                                                                i48++;
                                                                hp4 = hp42;
                                                                i49 = i52;
                                                                i47 = i51;
                                                            }
                                                            hp4 hp43 = hp4;
                                                            ArrayList arrayList7 = new ArrayList();
                                                            if (list5.size() > 0) {
                                                                f21.u(list5.get(0));
                                                                hp43.getClass();
                                                                throw th;
                                                            } else if (arrayList7.size() > 0) {
                                                                f21.u(arrayList7.get(0));
                                                                if (i49 <= 0) {
                                                                    h.l("Index must be between 0 and size");
                                                                } else {
                                                                    int i53 = iArr2[0];
                                                                    throw th;
                                                                }
                                                            }
                                                        } else if (list5.size() > 0) {
                                                            f21.u(list5.get(0));
                                                            xo4.c(0);
                                                            throw th;
                                                        }
                                                        oeVar.N.e(i2, cz63);
                                                        cz64.e(i2, a2);
                                                    } else {
                                                        h.s(pb4.i(i46, "Can't have more than ", " custom actions for one widget"));
                                                    }
                                                }
                                            }
                                            boolean p2 = fd1.p(fk6, resources5);
                                            if (Build.VERSION.SDK_INT >= 28) {
                                                accessibilityNodeInfo3.setScreenReaderFocusable(p2);
                                            } else {
                                                c5Var5.h(1, p2);
                                            }
                                            d = oeVar.Y.d(i2);
                                            if (d != -1) {
                                                jeVar.getAndroidViewsHandler();
                                                jeVar2 = jeVar;
                                                accessibilityNodeInfo3.setTraversalBefore(jeVar2, d);
                                                oeVar.j(i2, c5Var5, oeVar.a0, th);
                                            } else {
                                                jeVar2 = jeVar;
                                            }
                                            if (oeVar.Z.d(i2) != -1) {
                                                jeVar2.getAndroidViewsHandler();
                                            }
                                            str2 = (String) z65.z(fk6.n(), kk6.b);
                                            if (str2 != null) {
                                                c5Var5.i(str2);
                                            }
                                            c5Var = c5Var5;
                                            if (!oeVar.K) {
                                            }
                                        }
                                    } else {
                                        oeVar = oeVar2;
                                    }
                                    z2 = true;
                                    accessibilityNodeInfo3.setVisibleToUser(we.z(fk6) ^ z2);
                                    if (fk6.o()) {
                                    }
                                    if (fk62.m().f()) {
                                    }
                                    g8 = tp4.g(jk6.k);
                                    if (g8 == null) {
                                    }
                                    f94 = (f94) g8;
                                    if (f94 != null) {
                                    }
                                    accessibilityNodeInfo3.setClickable(false);
                                    g9 = tp4.g(zj6.b);
                                    if (g9 == null) {
                                    }
                                    h4Var = (h4) g9;
                                    if (h4Var != null) {
                                    }
                                    accessibilityNodeInfo3.setLongClickable(false);
                                    h4Var2 = (h4) z65.z(ak64, zj6.c);
                                    if (h4Var2 != null) {
                                    }
                                    h4Var3 = (h4) z65.z(ak64, zj6.q);
                                    if (h4Var3 != null) {
                                    }
                                    if (fd1.o(fk6)) {
                                    }
                                    String s2 = oe.s(fk6);
                                    accessibilityNodeInfo4.setTextSelection(oeVar.q(fk6), oeVar.p(fk6));
                                    h4Var4 = (h4) z65.z(ak64, zj6.j);
                                    if (h4Var4 != null) {
                                    }
                                    c5Var5.b(new w4(131072, str3));
                                    c5Var5.a(256);
                                    c5Var5.a(512);
                                    accessibilityNodeInfo3.setMovementGranularities(11);
                                    List list42 = (List) z65.z(ak64, jk6.a);
                                    uy32 = uy35.v();
                                    while (true) {
                                        if (uy32 == null) {
                                        }
                                        uy32 = uy32.v();
                                    }
                                    if (uy33 != 0) {
                                    }
                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                    if (Build.VERSION.SDK_INT >= 26) {
                                    }
                                    mq5 = (mq5) z65.z(ak64, jk6.c);
                                    if (mq5 != null) {
                                    }
                                    x91.i(c5Var5, fk6);
                                    rj1.H(c5Var5, fk6);
                                    g10 = fk6.k().w.g(jk6.g);
                                    if (g10 == null) {
                                    }
                                    if (g10 == null) {
                                    }
                                    vg6 = (vg6) z65.z(fk6.n(), jk6.v);
                                    h4 h4Var92 = (h4) z65.z(fk6.n(), zj6.d);
                                    g12 = fk6.k().w.g(jk6.f);
                                    if (g12 == null) {
                                    }
                                    if (g12 == null) {
                                    }
                                    if (((Number) vg6.b.b()).floatValue() > f) {
                                    }
                                    if (fd1.o(fk6)) {
                                    }
                                    vg62 = (vg6) z65.z(fk6.n(), jk6.w);
                                    g11 = fk6.k().w.g(jk6.f);
                                    if (g11 == null) {
                                    }
                                    if (g11 == null) {
                                    }
                                    if (((Number) vg62.b.b()).floatValue() > f) {
                                    }
                                    if (fd1.o(fk6)) {
                                    }
                                    i5 = Build.VERSION.SDK_INT;
                                    if (i5 >= 29) {
                                    }
                                    CharSequence charSequence2 = (CharSequence) z65.z(fk6.n(), jk6.d);
                                    if (i5 >= 28) {
                                    }
                                    if (fd1.o(fk6)) {
                                    }
                                    boolean p22 = fd1.p(fk6, resources5);
                                    if (Build.VERSION.SDK_INT >= 28) {
                                    }
                                    d = oeVar.Y.d(i2);
                                    if (d != -1) {
                                    }
                                    if (oeVar.Z.d(i2) != -1) {
                                    }
                                    str2 = (String) z65.z(fk6.n(), kk6.b);
                                    if (str2 != null) {
                                    }
                                    c5Var = c5Var5;
                                    if (!oeVar.K) {
                                    }
                                } else {
                                    oeVar2 = oeVar3;
                                    jeVar = jeVar3;
                                    wo4 = wo42;
                                    resources = resources2;
                                    accessibilityNodeInfo = accessibilityNodeInfo5;
                                    ak6 = ak62;
                                    s86 = s863;
                                    accessibilityNodeInfo2 = obtain;
                                    c5Var2 = c5Var3;
                                    fk6 = fk64;
                                    spannableString = th;
                                    c5 c5Var52 = c5Var2;
                                    c5Var52.l(spannableString);
                                    nk6 = jk6.M;
                                    if (!tp4.c(nk6)) {
                                    }
                                    Resources resources52 = resources;
                                    String K2 = fd1.K(fk6, resources52);
                                    if (Build.VERSION.SDK_INT < 30) {
                                    }
                                    accessibilityNodeInfo3.setCheckable(fd1.J(fk6));
                                    g = tp4.g(jk6.K);
                                    if (g == null) {
                                    }
                                    ij7 = (ij7) g;
                                    if (ij7 != null) {
                                    }
                                    g2 = tp4.g(jk6.J);
                                    if (g2 == null) {
                                    }
                                    bool = (Boolean) g2;
                                    if (bool == null) {
                                    }
                                    ak6 ak642 = ak6;
                                    g13 = tp4.g(jk6.a);
                                    if (g13 == null) {
                                    }
                                    list = (List) g13;
                                    if (list == null) {
                                    }
                                    accessibilityNodeInfo3.setContentDescription(str4);
                                    g3 = tp4.g(jk6.A);
                                    if (g3 == null) {
                                    }
                                    str = (String) g3;
                                    if (str != null) {
                                    }
                                    g4 = tp4.g(jk6.h);
                                    if (g4 == null) {
                                    }
                                    if (((vs7) g4) != null) {
                                    }
                                    g5 = tp4.g(jk6.i);
                                    if (g5 == null) {
                                    }
                                    if (((vs7) g5) != null) {
                                    }
                                    i2 = i;
                                    if (i2 != -1) {
                                    }
                                    accessibilityNodeInfo4.setPassword(tp4.c(jk6.L));
                                    g6 = tp4.g(jk6.O);
                                    if (g6 == null) {
                                    }
                                    Boolean bool22 = Boolean.TRUE;
                                    accessibilityNodeInfo4.setEditable(sg3.e(g6, bool22));
                                    g7 = tp4.g(jk6.P);
                                    if (g7 == null) {
                                    }
                                    num = (Integer) g7;
                                    if (num == null) {
                                    }
                                    accessibilityNodeInfo3.setMaxTextLength(i4);
                                    accessibilityNodeInfo3.setEnabled(fd1.o(fk6));
                                    nk6 nk632 = jk6.l;
                                    accessibilityNodeInfo3.setFocusable(tp4.c(nk632));
                                    if (!accessibilityNodeInfo4.isFocusable()) {
                                    }
                                    z2 = true;
                                    accessibilityNodeInfo3.setVisibleToUser(we.z(fk6) ^ z2);
                                    if (fk6.o()) {
                                    }
                                    if (fk62.m().f()) {
                                    }
                                    g8 = tp4.g(jk6.k);
                                    if (g8 == null) {
                                    }
                                    f94 = (f94) g8;
                                    if (f94 != null) {
                                    }
                                    accessibilityNodeInfo3.setClickable(false);
                                    g9 = tp4.g(zj6.b);
                                    if (g9 == null) {
                                    }
                                    h4Var = (h4) g9;
                                    if (h4Var != null) {
                                    }
                                    accessibilityNodeInfo3.setLongClickable(false);
                                    h4Var2 = (h4) z65.z(ak642, zj6.c);
                                    if (h4Var2 != null) {
                                    }
                                    h4Var3 = (h4) z65.z(ak642, zj6.q);
                                    if (h4Var3 != null) {
                                    }
                                    if (fd1.o(fk6)) {
                                    }
                                    String s22 = oe.s(fk6);
                                    accessibilityNodeInfo4.setTextSelection(oeVar.q(fk6), oeVar.p(fk6));
                                    h4Var4 = (h4) z65.z(ak642, zj6.j);
                                    if (h4Var4 != null) {
                                    }
                                    c5Var52.b(new w4(131072, str3));
                                    c5Var52.a(256);
                                    c5Var52.a(512);
                                    accessibilityNodeInfo3.setMovementGranularities(11);
                                    List list422 = (List) z65.z(ak642, jk6.a);
                                    uy32 = uy35.v();
                                    while (true) {
                                        if (uy32 == null) {
                                        }
                                        uy32 = uy32.v();
                                    }
                                    if (uy33 != 0) {
                                    }
                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                    if (Build.VERSION.SDK_INT >= 26) {
                                    }
                                    mq5 = (mq5) z65.z(ak642, jk6.c);
                                    if (mq5 != null) {
                                    }
                                    x91.i(c5Var52, fk6);
                                    rj1.H(c5Var52, fk6);
                                    g10 = fk6.k().w.g(jk6.g);
                                    if (g10 == null) {
                                    }
                                    if (g10 == null) {
                                    }
                                    vg6 = (vg6) z65.z(fk6.n(), jk6.v);
                                    h4 h4Var922 = (h4) z65.z(fk6.n(), zj6.d);
                                    g12 = fk6.k().w.g(jk6.f);
                                    if (g12 == null) {
                                    }
                                    if (g12 == null) {
                                    }
                                    if (((Number) vg6.b.b()).floatValue() > f) {
                                    }
                                    if (fd1.o(fk6)) {
                                    }
                                    vg62 = (vg6) z65.z(fk6.n(), jk6.w);
                                    g11 = fk6.k().w.g(jk6.f);
                                    if (g11 == null) {
                                    }
                                    if (g11 == null) {
                                    }
                                    if (((Number) vg62.b.b()).floatValue() > f) {
                                    }
                                    if (fd1.o(fk6)) {
                                    }
                                    i5 = Build.VERSION.SDK_INT;
                                    if (i5 >= 29) {
                                    }
                                    CharSequence charSequence22 = (CharSequence) z65.z(fk6.n(), jk6.d);
                                    if (i5 >= 28) {
                                    }
                                    if (fd1.o(fk6)) {
                                    }
                                    boolean p222 = fd1.p(fk6, resources52);
                                    if (Build.VERSION.SDK_INT >= 28) {
                                    }
                                    d = oeVar.Y.d(i2);
                                    if (d != -1) {
                                    }
                                    if (oeVar.Z.d(i2) != -1) {
                                    }
                                    str2 = (String) z65.z(fk6.n(), kk6.b);
                                    if (str2 != null) {
                                    }
                                    c5Var = c5Var52;
                                    if (!oeVar.K) {
                                    }
                                }
                                return th;
                            }
                        }
                    } else if (!accessibilityManager2.isEnabled()) {
                        c5Var = new c5(AccessibilityNodeInfo.obtain());
                        oeVar = oeVar3;
                        i2 = i13;
                        if (!oeVar.K) {
                        }
                    }
                } else if (!accessibilityManager2.isEnabled()) {
                    c5Var = new c5(AccessibilityNodeInfo.obtain());
                    oeVar = oeVar3;
                    i2 = i13;
                    if (!oeVar.K) {
                        return c5Var;
                    }
                    if (i2 == oeVar.G) {
                        oeVar.I = c5Var;
                    }
                    if (i2 != oeVar.H) {
                        return c5Var;
                    }
                    oeVar.J = c5Var;
                    return c5Var;
                }
                c5Var = null;
                oeVar = oeVar3;
                i2 = i13;
                if (!oeVar.K) {
                }
                break;
            default:
                return new c5(AccessibilityNodeInfo.obtain(((jp0) k4Var).n(i13).a));
        }
    }

    public final c5 x(int i) {
        int i2;
        int i3 = this.C;
        k4 k4Var = this.D;
        switch (i3) {
            case b85.b:
                oe oeVar = (oe) k4Var;
                if (i == 1) {
                    int i4 = oeVar.H;
                    if (i4 == Integer.MIN_VALUE) {
                        return null;
                    }
                    return n(i4);
                } else if (i == 2) {
                    return n(oeVar.G);
                } else {
                    h.q(hl6.k(i, "Unknown focus type: "));
                    return null;
                }
            default:
                jp0 jp0 = (jp0) k4Var;
                if (i == 2) {
                    i2 = jp0.G;
                } else {
                    i2 = jp0.H;
                }
                if (i2 == Integer.MIN_VALUE) {
                    return null;
                }
                return n(i2);
        }
    }
}
