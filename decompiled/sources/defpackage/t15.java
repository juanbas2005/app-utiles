package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* renamed from: t15  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class t15 implements InputConnection {
    public final pb a;
    public jy5 b;

    public t15(jy5 jy5, pb pbVar) {
        this.a = pbVar;
        this.b = jy5;
    }

    public final boolean beginBatchEdit() {
        jy5 jy5 = this.b;
        if (jy5 != null) {
            return jy5.beginBatchEdit();
        }
        return false;
    }

    public final boolean clearMetaKeyStates(int i) {
        jy5 jy5 = this.b;
        if (jy5 != null) {
            return jy5.clearMetaKeyStates(i);
        }
        return false;
    }

    public final void closeConnection() {
        jy5 jy5 = this.b;
        if (jy5 != null) {
            if (jy5 != null) {
                jy5.closeConnection();
                this.b = null;
            }
            this.a.y(this);
        }
    }

    public final boolean commitCompletion(CompletionInfo completionInfo) {
        jy5 jy5 = this.b;
        if (jy5 != null) {
            return jy5.commitCompletion(completionInfo);
        }
        return false;
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return false;
    }

    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        jy5 jy5 = this.b;
        if (jy5 != null) {
            return jy5.commitCorrection(correctionInfo);
        }
        return false;
    }

    public final boolean commitText(CharSequence charSequence, int i) {
        jy5 jy5 = this.b;
        if (jy5 != null) {
            return jy5.commitText(charSequence, i);
        }
        return false;
    }

    public final boolean deleteSurroundingText(int i, int i2) {
        jy5 jy5 = this.b;
        if (jy5 != null) {
            return jy5.deleteSurroundingText(i, i2);
        }
        return false;
    }

    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        jy5 jy5 = this.b;
        if (jy5 != null) {
            return jy5.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    public final boolean endBatchEdit() {
        jy5 jy5 = this.b;
        if (jy5 != null) {
            return jy5.b();
        }
        return false;
    }

    public final boolean finishComposingText() {
        jy5 jy5 = this.b;
        if (jy5 != null) {
            return jy5.finishComposingText();
        }
        return false;
    }

    public final int getCursorCapsMode(int i) {
        jy5 jy5 = this.b;
        if (jy5 != null) {
            return jy5.getCursorCapsMode(i);
        }
        return 0;
    }

    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        jy5 jy5 = this.b;
        if (jy5 != null) {
            return jy5.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    public final Handler getHandler() {
        return null;
    }

    public final CharSequence getSelectedText(int i) {
        jy5 jy5 = this.b;
        if (jy5 != null) {
            return jy5.getSelectedText(i);
        }
        return null;
    }

    public final CharSequence getTextAfterCursor(int i, int i2) {
        jy5 jy5 = this.b;
        if (jy5 != null) {
            return jy5.getTextAfterCursor(i, i2);
        }
        return null;
    }

    public final CharSequence getTextBeforeCursor(int i, int i2) {
        jy5 jy5 = this.b;
        if (jy5 != null) {
            return jy5.getTextBeforeCursor(i, i2);
        }
        return null;
    }

    public final boolean performContextMenuAction(int i) {
        jy5 jy5 = this.b;
        if (jy5 != null) {
            return jy5.performContextMenuAction(i);
        }
        return false;
    }

    public final boolean performEditorAction(int i) {
        jy5 jy5 = this.b;
        if (jy5 != null) {
            return jy5.performEditorAction(i);
        }
        return false;
    }

    public final boolean performPrivateCommand(String str, Bundle bundle) {
        jy5 jy5 = this.b;
        if (jy5 != null) {
            return jy5.performPrivateCommand(str, bundle);
        }
        return false;
    }

    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    public final boolean requestCursorUpdates(int i) {
        jy5 jy5 = this.b;
        if (jy5 != null) {
            return jy5.requestCursorUpdates(i);
        }
        return false;
    }

    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        jy5 jy5 = this.b;
        if (jy5 != null) {
            return jy5.sendKeyEvent(keyEvent);
        }
        return false;
    }

    public final boolean setComposingRegion(int i, int i2) {
        jy5 jy5 = this.b;
        if (jy5 != null) {
            return jy5.setComposingRegion(i, i2);
        }
        return false;
    }

    public final boolean setComposingText(CharSequence charSequence, int i) {
        jy5 jy5 = this.b;
        if (jy5 != null) {
            return jy5.setComposingText(charSequence, i);
        }
        return false;
    }

    public final boolean setSelection(int i, int i2) {
        jy5 jy5 = this.b;
        if (jy5 != null) {
            return jy5.setSelection(i, i2);
        }
        return false;
    }
}
