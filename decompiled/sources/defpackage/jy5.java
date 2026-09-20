package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* renamed from: jy5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jy5 implements InputConnection {
    public final f96 a;
    public final boolean b;
    public final u44 c;
    public final ze7 d;
    public final g58 e;
    public int f;
    public hf7 g;
    public int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public boolean k = true;

    public jy5(hf7 hf7, f96 f96, boolean z, u44 u44, ze7 ze7, g58 g58) {
        this.a = f96;
        this.b = z;
        this.c = u44;
        this.d = ze7;
        this.e = g58;
        this.g = hf7;
    }

    public final void a(h22 h22) {
        this.f++;
        try {
            this.j.add(h22);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i2 = this.f - 1;
        this.f = i2;
        if (i2 == 0) {
            ArrayList arrayList = this.j;
            if (!arrayList.isEmpty()) {
                ((v44) this.a.x).c.y(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        if (this.f > 0) {
            return true;
        }
        return false;
    }

    public final boolean beginBatchEdit() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        this.f++;
        return true;
    }

    public final void c(int i2) {
        sendKeyEvent(new KeyEvent(0, i2));
        sendKeyEvent(new KeyEvent(1, i2));
    }

    public final boolean clearMetaKeyStates(int i2) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    public final void closeConnection() {
        this.j.clear();
        this.f = 0;
        this.k = false;
        ArrayList arrayList = ((v44) this.a.x).j;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (sg3.e(((WeakReference) arrayList.get(i2)).get(), this)) {
                arrayList.remove(i2);
                return;
            }
        }
    }

    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.k;
        if (z) {
            return this.b;
        }
        return z;
    }

    public final boolean commitText(CharSequence charSequence, int i2) {
        boolean z = this.k;
        if (z) {
            a(new ou0(String.valueOf(charSequence), i2));
        }
        return z;
    }

    public final boolean deleteSurroundingText(int i2, int i3) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new np1(i2, i3));
        return true;
    }

    public final boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new op1(i2, i3));
        return true;
    }

    public final boolean endBatchEdit() {
        return b();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [h22, java.lang.Object] */
    public final boolean finishComposingText() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new Object());
        return true;
    }

    public final int getCursorCapsMode(int i2) {
        hf7 hf7 = this.g;
        return TextUtils.getCapsMode(hf7.a.x, lg7.f(hf7.b), i2);
    }

    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        boolean z = true;
        int i3 = 0;
        if ((i2 & 1) == 0) {
            z = false;
        }
        this.i = z;
        if (z) {
            if (extractedTextRequest != null) {
                i3 = extractedTextRequest.token;
            }
            this.h = i3;
        }
        return n85.b(this.g);
    }

    public final Handler getHandler() {
        return null;
    }

    public final CharSequence getSelectedText(int i2) {
        if (lg7.c(this.g.b)) {
            return null;
        }
        return t75.q(this.g).x;
    }

    public final CharSequence getTextAfterCursor(int i2, int i3) {
        return t75.r(this.g, i2).x;
    }

    public final CharSequence getTextBeforeCursor(int i2, int i3) {
        return t75.s(this.g, i2).x;
    }

    public final boolean performContextMenuAction(int i2) {
        boolean z = this.k;
        if (z) {
            z = false;
            switch (i2) {
                case 16908319:
                    a(new vn6(0, this.g.a.x.length()));
                    break;
                case 16908320:
                    c(277);
                    return false;
                case 16908321:
                    c(278);
                    return false;
                case 16908322:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    public final boolean performEditorAction(int i2) {
        int i3;
        boolean z = this.k;
        if (z) {
            z = true;
            if (i2 != 0) {
                switch (i2) {
                    case 2:
                        i3 = 2;
                        break;
                    case 3:
                        i3 = 3;
                        break;
                    case 4:
                        i3 = 4;
                        break;
                    case 5:
                        i3 = 6;
                        break;
                    case 6:
                        i3 = 7;
                        break;
                    case 7:
                        i3 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i2);
                        break;
                }
            }
            i3 = 1;
            ((v44) this.a.x).d.y(new b93(i3));
        }
        return z;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, f06] */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Object, f06] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02d8  */
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        vl vlVar;
        long j2;
        int i2;
        cg7 d2;
        cg7 d3;
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        int i6;
        ag7 ag7;
        Executor executor2 = executor;
        IntConsumer intConsumer2 = intConsumer;
        if (Build.VERSION.SDK_INT >= 34) {
            int i7 = 2;
            ay5 ay5 = new ay5(2, (Object) this);
            u44 u44 = this.c;
            int i8 = 3;
            if (u44 != null) {
                vl vlVar2 = u44.j;
                if (vlVar2 != null) {
                    cg7 d4 = u44.d();
                    bg7 bg7 = null;
                    if (d4 == null || (ag7 = d4.a.a) == null) {
                        vlVar = null;
                    } else {
                        vlVar = ag7.a;
                    }
                    if (vlVar2.equals(vlVar)) {
                        boolean r = j22.r(handwritingGesture);
                        ze7 ze7 = this.d;
                        if (r) {
                            SelectGesture m = j22.m(handwritingGesture);
                            ly5 u = o85.u(m.getSelectionArea());
                            if (m.getGranularity() != 1) {
                                i6 = 0;
                            } else {
                                i6 = 1;
                            }
                            long L = ie1.L(u44, u, i6);
                            if (lg7.c(L)) {
                                i7 = fd1.F(j22.i(m), ay5);
                                i8 = i7;
                            } else {
                                ay5.y(new vn6((int) (L >> 32), (int) (L & 4294967295L)));
                                if (ze7 != null) {
                                    ze7.h(true);
                                }
                            }
                        } else if (j22.D(handwritingGesture)) {
                            DeleteGesture n = ky2.n(handwritingGesture);
                            if (n.getGranularity() != 1) {
                                i5 = 0;
                            } else {
                                i5 = 1;
                            }
                            long L2 = ie1.L(u44, o85.u(n.getDeletionArea()), i5);
                            if (lg7.c(L2)) {
                                i7 = fd1.F(j22.i(n), ay5);
                                i8 = i7;
                            } else {
                                if (i5 == 1) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                fd1.W(L2, vlVar2, z2, ay5);
                            }
                        } else if (ky2.y(handwritingGesture)) {
                            SelectRangeGesture p = ky2.p(handwritingGesture);
                            ly5 u2 = o85.u(p.getSelectionStartArea());
                            ly5 u3 = o85.u(p.getSelectionEndArea());
                            if (p.getGranularity() != 1) {
                                i4 = 0;
                            } else {
                                i4 = 1;
                            }
                            long l = ie1.l(u44, u2, u3, i4);
                            if (lg7.c(l)) {
                                i7 = fd1.F(j22.i(p), ay5);
                                i8 = i7;
                            } else {
                                ay5.y(new vn6((int) (l >> 32), (int) (l & 4294967295L)));
                                if (ze7 != null) {
                                    ze7.h(true);
                                }
                            }
                        } else if (ky2.C(handwritingGesture)) {
                            DeleteRangeGesture o = ky2.o(handwritingGesture);
                            if (o.getGranularity() != 1) {
                                i3 = 0;
                            } else {
                                i3 = 1;
                            }
                            long l2 = ie1.l(u44, o85.u(o.getDeletionStartArea()), o85.u(o.getDeletionEndArea()), i3);
                            if (lg7.c(l2)) {
                                i7 = fd1.F(j22.i(o), ay5);
                                i8 = i7;
                            } else {
                                if (i3 == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                fd1.W(l2, vlVar2, z, ay5);
                            }
                        } else {
                            boolean B = j22.B(handwritingGesture);
                            g58 g58 = this.e;
                            if (B) {
                                JoinOrSplitGesture k2 = j22.k(handwritingGesture);
                                if (g58 == null) {
                                    i7 = fd1.F(j22.u(k2), ay5);
                                } else {
                                    int k3 = ie1.k(u44, ie1.n(k2.getJoinOrSplitPoint()), g58);
                                    if (k3 == -1 || ((d3 = u44.d()) != null && ie1.m(d3.a, k3))) {
                                        i7 = fd1.F(j22.i(k2), ay5);
                                    } else {
                                        int i9 = k3;
                                        while (i9 > 0) {
                                            int codePointBefore = Character.codePointBefore(vlVar2, i9);
                                            if (!ie1.Q(codePointBefore)) {
                                                break;
                                            }
                                            i9 -= Character.charCount(codePointBefore);
                                        }
                                        while (k3 < vlVar2.x.length()) {
                                            int codePointAt = Character.codePointAt(vlVar2, k3);
                                            if (!ie1.Q(codePointAt)) {
                                                break;
                                            }
                                            k3 += Character.charCount(codePointAt);
                                        }
                                        long a2 = i95.a(i9, k3);
                                        if (lg7.c(a2)) {
                                            int i10 = (int) (a2 >> 32);
                                            ay5.y(new ly2(new h22[]{new vn6(i10, i10), new ou0(" ", 1)}));
                                        } else {
                                            fd1.W(a2, vlVar2, false, ay5);
                                        }
                                    }
                                }
                                i8 = i7;
                            } else if (j22.w(handwritingGesture)) {
                                InsertGesture j3 = j22.j(handwritingGesture);
                                if (g58 == null) {
                                    i7 = fd1.F(j22.u(j3), ay5);
                                } else {
                                    int k4 = ie1.k(u44, ie1.n(j3.getInsertionPoint()), g58);
                                    if (k4 == -1 || ((d2 = u44.d()) != null && ie1.m(d2.a, k4))) {
                                        i7 = fd1.F(j22.i(j3), ay5);
                                    } else {
                                        ay5.y(new ly2(new h22[]{new vn6(k4, k4), new ou0(j3.getTextToInsert(), 1)}));
                                    }
                                }
                                i8 = i7;
                            } else {
                                if (j22.z(handwritingGesture)) {
                                    RemoveSpaceGesture l3 = j22.l(handwritingGesture);
                                    cg7 d5 = u44.d();
                                    if (d5 != null) {
                                        bg7 = d5.a;
                                    }
                                    long n2 = ie1.n(l3.getStartPoint());
                                    long n3 = ie1.n(l3.getEndPoint());
                                    dy3 c2 = u44.c();
                                    if (bg7 != null) {
                                        pn4 pn4 = bg7.b;
                                        if (c2 != null) {
                                            long N = c2.N(n2);
                                            long N2 = c2.N(n3);
                                            int J = ie1.J(pn4, N, g58);
                                            int J2 = ie1.J(pn4, N2, g58);
                                            if (J != -1) {
                                                if (J2 != -1) {
                                                    J = Math.min(J, J2);
                                                }
                                                J2 = J;
                                            } else if (J2 == -1) {
                                                j2 = lg7.b;
                                                if (lg7.c(j2)) {
                                                    i7 = fd1.F(j22.i(l3), ay5);
                                                } else {
                                                    ? obj = new Object();
                                                    obj.w = -1;
                                                    ? obj2 = new Object();
                                                    obj2.w = -1;
                                                    String f2 = new k26("\\s+").f(vlVar2.subSequence(lg7.f(j2), lg7.e(j2)).x, new m0(24, obj, obj2));
                                                    int i11 = obj.w;
                                                    if (i11 == -1 || (i2 = obj2.w) == -1) {
                                                        i7 = fd1.F(j22.i(l3), ay5);
                                                    } else {
                                                        int i12 = (int) (j2 >> 32);
                                                        ay5.y(new ly2(new h22[]{new vn6(i12 + i11, i12 + i2), new ou0(f2.substring(i11, f2.length() - (lg7.d(j2) - obj2.w)), 1)}));
                                                    }
                                                }
                                            }
                                            float b2 = (pn4.b(J2) + pn4.f(J2)) / 2.0f;
                                            int i13 = (int) (N >> 32);
                                            int i14 = (int) (N2 >> 32);
                                            j2 = pn4.h(new ly5(Math.min(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14)), b2 - 0.1f, Math.max(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14)), b2 + 0.1f), 0, me6.N);
                                            if (lg7.c(j2)) {
                                            }
                                        }
                                    }
                                    j2 = lg7.b;
                                    if (lg7.c(j2)) {
                                    }
                                }
                                i8 = i7;
                            }
                        }
                        i7 = 1;
                        i8 = i7;
                    }
                }
                i7 = 3;
                i8 = i7;
            }
            if (intConsumer2 != null) {
                if (executor2 != null) {
                    executor2.execute(new in(i8, 0, intConsumer2));
                } else {
                    intConsumer2.accept(i8);
                }
            }
        }
    }

    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return true;
        }
        return z;
    }

    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        u44 u44;
        vl vlVar;
        vl vlVar2;
        int i2;
        int i3;
        int i4;
        int i5;
        ag7 ag7;
        if (!(Build.VERSION.SDK_INT < 34 || (u44 = this.c) == null || (vlVar = u44.j) == null)) {
            cg7 d2 = u44.d();
            if (d2 == null || (ag7 = d2.a.a) == null) {
                vlVar2 = null;
            } else {
                vlVar2 = ag7.a;
            }
            if (vlVar.equals(vlVar2)) {
                boolean r = j22.r(previewableHandwritingGesture);
                ey2 ey2 = ey2.w;
                ze7 ze7 = this.d;
                if (r) {
                    SelectGesture m = j22.m(previewableHandwritingGesture);
                    if (ze7 != null) {
                        ly5 u = o85.u(m.getSelectionArea());
                        if (m.getGranularity() != 1) {
                            i5 = 0;
                        } else {
                            i5 = 1;
                        }
                        long L = ie1.L(u44, u, i5);
                        u44 u442 = ze7.d;
                        if (u442 != null) {
                            u442.f(L);
                        }
                        u44 u443 = ze7.d;
                        if (u443 != null) {
                            u443.e(lg7.b);
                        }
                        if (!lg7.c(L)) {
                            ze7.t(false);
                            ze7.q(ey2);
                        }
                    }
                } else if (j22.D(previewableHandwritingGesture)) {
                    DeleteGesture n = ky2.n(previewableHandwritingGesture);
                    if (ze7 != null) {
                        ly5 u2 = o85.u(n.getDeletionArea());
                        if (n.getGranularity() != 1) {
                            i4 = 0;
                        } else {
                            i4 = 1;
                        }
                        long L2 = ie1.L(u44, u2, i4);
                        u44 u444 = ze7.d;
                        if (u444 != null) {
                            u444.e(L2);
                        }
                        u44 u445 = ze7.d;
                        if (u445 != null) {
                            u445.f(lg7.b);
                        }
                        if (!lg7.c(L2)) {
                            ze7.t(false);
                            ze7.q(ey2);
                        }
                    }
                } else if (ky2.y(previewableHandwritingGesture)) {
                    SelectRangeGesture p = ky2.p(previewableHandwritingGesture);
                    if (ze7 != null) {
                        ly5 u3 = o85.u(p.getSelectionStartArea());
                        ly5 u4 = o85.u(p.getSelectionEndArea());
                        if (p.getGranularity() != 1) {
                            i3 = 0;
                        } else {
                            i3 = 1;
                        }
                        long l = ie1.l(u44, u3, u4, i3);
                        u44 u446 = ze7.d;
                        if (u446 != null) {
                            u446.f(l);
                        }
                        u44 u447 = ze7.d;
                        if (u447 != null) {
                            u447.e(lg7.b);
                        }
                        if (!lg7.c(l)) {
                            ze7.t(false);
                            ze7.q(ey2);
                        }
                    }
                } else if (ky2.C(previewableHandwritingGesture)) {
                    DeleteRangeGesture o = ky2.o(previewableHandwritingGesture);
                    if (ze7 != null) {
                        ly5 u5 = o85.u(o.getDeletionStartArea());
                        ly5 u6 = o85.u(o.getDeletionEndArea());
                        if (o.getGranularity() != 1) {
                            i2 = 0;
                        } else {
                            i2 = 1;
                        }
                        long l2 = ie1.l(u44, u5, u6, i2);
                        u44 u448 = ze7.d;
                        if (u448 != null) {
                            u448.e(l2);
                        }
                        u44 u449 = ze7.d;
                        if (u449 != null) {
                            u449.f(lg7.b);
                        }
                        if (!lg7.c(l2)) {
                            ze7.t(false);
                            ze7.q(ey2);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new px0(1, ze7));
                }
                return true;
            }
        }
        return false;
    }

    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Unknown Source)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Unknown Source)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Unknown Source)
        	at java.base/java.util.Objects.checkIndex(Unknown Source)
        	at java.base/java.util.ArrayList.get(Unknown Source)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.k
            if (r0 == 0) goto L_0x0077
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000c
            r0 = r2
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            r3 = r10 & 2
            if (r3 == 0) goto L_0x0013
            r3 = r2
            goto L_0x0014
        L_0x0013:
            r3 = r1
        L_0x0014:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L_0x004d
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0020
            r5 = r2
            goto L_0x0021
        L_0x0020:
            r5 = r1
        L_0x0021:
            r6 = r10 & 8
            if (r6 == 0) goto L_0x0027
            r6 = r2
            goto L_0x0028
        L_0x0027:
            r6 = r1
        L_0x0028:
            r7 = r10 & 4
            if (r7 == 0) goto L_0x002e
            r7 = r2
            goto L_0x002f
        L_0x002e:
            r7 = r1
        L_0x002f:
            r8 = 34
            if (r4 < r8) goto L_0x0038
            r10 = r10 & 32
            if (r10 == 0) goto L_0x0038
            r1 = r2
        L_0x0038:
            if (r5 != 0) goto L_0x004a
            if (r6 != 0) goto L_0x004a
            if (r7 != 0) goto L_0x004a
            if (r1 != 0) goto L_0x004a
            if (r4 < r8) goto L_0x0047
            r10 = r2
            r1 = r10
        L_0x0044:
            r5 = r1
        L_0x0045:
            r6 = r5
            goto L_0x0050
        L_0x0047:
            r10 = r1
            r1 = r2
            goto L_0x0044
        L_0x004a:
            r10 = r1
            r1 = r7
            goto L_0x0050
        L_0x004d:
            r10 = r1
            r5 = r2
            goto L_0x0045
        L_0x0050:
            f96 r9 = r9.a
            java.lang.Object r9 = r9.x
            v44 r9 = (defpackage.v44) r9
            q44 r9 = r9.m
            java.lang.Object r4 = r9.c
            monitor-enter(r4)
            r9.f = r5     // Catch:{ all -> 0x006f }
            r9.g = r6     // Catch:{ all -> 0x006f }
            r9.h = r1     // Catch:{ all -> 0x006f }
            r9.i = r10     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0071
            r9.e = r2     // Catch:{ all -> 0x006f }
            hf7 r10 = r9.j     // Catch:{ all -> 0x006f }
            if (r10 == 0) goto L_0x0071
            r9.a()     // Catch:{ all -> 0x006f }
            goto L_0x0071
        L_0x006f:
            r9 = move-exception
            goto L_0x0075
        L_0x0071:
            r9.d = r3     // Catch:{ all -> 0x006f }
            monitor-exit(r4)
            return r2
        L_0x0075:
            monitor-exit(r4)
            throw r9
        L_0x0077:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy5.requestCursorUpdates(int):boolean");
    }

    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((v44) this.a.x).k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    public final boolean setComposingRegion(int i2, int i3) {
        boolean z = this.k;
        if (z) {
            a(new tn6(i2, i3));
        }
        return z;
    }

    public final boolean setComposingText(CharSequence charSequence, int i2) {
        boolean z = this.k;
        if (z) {
            a(new un6(String.valueOf(charSequence), i2));
        }
        return z;
    }

    public final boolean setSelection(int i2, int i3) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new vn6(i2, i3));
        return true;
    }
}
