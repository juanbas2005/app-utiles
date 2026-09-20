package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: ip  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ip {
    /* JADX INFO: finally extract failed */
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        f96 f96;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                f96 = new f96(clipData, 3);
            } else {
                u41 u41 = new u41();
                u41.x = clipData;
                u41.y = 3;
                f96 = u41;
            }
            e58.i(textView, f96.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        f96 f96;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            f96 = new f96(clipData, 3);
        } else {
            u41 u41 = new u41();
            u41.x = clipData;
            u41.y = 3;
            f96 = u41;
        }
        e58.i(view, f96.build());
        return true;
    }
}
