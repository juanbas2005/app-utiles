package defpackage;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;

/* renamed from: x4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class x4 {
    public static Icon a(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static String b(Context context) {
        return context.getAttributionTag();
    }

    public static void c(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static Insets e(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static void f(Window window, boolean z) {
        int i;
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z) {
            i = systemUiVisibility & -257;
        } else {
            i = systemUiVisibility | 256;
        }
        decorView.setSystemUiVisibility(i);
        window.setDecorFitsSystemWindows(z);
    }

    public static void g(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static void h(View view) {
        view.setImportantForContentCapture(1);
    }

    public static void i(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void j(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
