package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: iy5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class iy5 implements InputConnection {
    public final rg4 a;
    public final boolean b;
    public int c;
    public hf7 d;
    public int e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public boolean h = true;

    public iy5(hf7 hf7, rg4 rg4, boolean z) {
        this.a = rg4;
        this.b = z;
        this.d = hf7;
    }

    public final void a(h22 h22) {
        this.c++;
        try {
            this.g.add(h22);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            ArrayList arrayList = this.g;
            if (!arrayList.isEmpty()) {
                ((uf7) this.a.x).e.y(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        if (this.c > 0) {
            return true;
        }
        return false;
    }

    public final boolean beginBatchEdit() {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        this.c++;
        return true;
    }

    public final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.h;
        if (z) {
            return false;
        }
        return z;
    }

    public final void closeConnection() {
        this.g.clear();
        this.c = 0;
        this.h = false;
        ArrayList arrayList = ((uf7) this.a.x).i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (sg3.e(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.h;
        if (z) {
            return false;
        }
        return z;
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.h;
        if (z) {
            return false;
        }
        return z;
    }

    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.h;
        if (z) {
            return this.b;
        }
        return z;
    }

    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.h;
        if (z) {
            a(new ou0(String.valueOf(charSequence), i));
        }
        return z;
    }

    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        a(new np1(i, i2));
        return true;
    }

    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        a(new op1(i, i2));
        return true;
    }

    public final boolean endBatchEdit() {
        return b();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [h22, java.lang.Object] */
    public final boolean finishComposingText() {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        a(new Object());
        return true;
    }

    public final int getCursorCapsMode(int i) {
        hf7 hf7 = this.d;
        return TextUtils.getCapsMode(hf7.a.x, lg7.f(hf7.b), i);
    }

    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = true;
        int i2 = 0;
        if ((i & 1) == 0) {
            z = false;
        }
        this.f = z;
        if (z) {
            if (extractedTextRequest != null) {
                i2 = extractedTextRequest.token;
            }
            this.e = i2;
        }
        return pd8.K(this.d);
    }

    public final Handler getHandler() {
        return null;
    }

    public final CharSequence getSelectedText(int i) {
        if (lg7.c(this.d.b)) {
            return null;
        }
        return t75.q(this.d).x;
    }

    public final CharSequence getTextAfterCursor(int i, int i2) {
        return t75.r(this.d, i).x;
    }

    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return t75.s(this.d, i).x;
    }

    public final boolean performContextMenuAction(int i) {
        boolean z = this.h;
        if (z) {
            z = false;
            switch (i) {
                case 16908319:
                    a(new vn6(0, this.d.a.x.length()));
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

    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.h;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        break;
                }
            }
            i2 = 1;
            ((uf7) this.a.x).f.y(new b93(i2));
        }
        return z;
    }

    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.h;
        if (z) {
            return true;
        }
        return z;
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
            boolean r0 = r9.h
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
            rg4 r9 = r9.a
            java.lang.Object r9 = r9.x
            uf7 r9 = (defpackage.uf7) r9
            sc1 r9 = r9.l
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iy5.requestCursorUpdates(int):boolean");
    }

    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((uf7) this.a.x).j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.h;
        if (z) {
            a(new tn6(i, i2));
        }
        return z;
    }

    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.h;
        if (z) {
            a(new un6(String.valueOf(charSequence), i));
        }
        return z;
    }

    public final boolean setSelection(int i, int i2) {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        a(new vn6(i, i2));
        return true;
    }
}
