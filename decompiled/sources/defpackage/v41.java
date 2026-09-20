package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.fonts.Font;
import android.view.ContentInfo;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.window.SplashScreenView;

/* renamed from: v41  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class v41 {
    public static /* synthetic */ Font.Builder h(Font font) {
        return new Font.Builder(font);
    }

    public static /* bridge */ /* synthetic */ ContentInfo m(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* synthetic */ ScrollCaptureTarget o(je jeVar, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(jeVar, rect, point, scrollCaptureCallback);
    }

    public static /* bridge */ /* synthetic */ SplashScreenView r(View view) {
        return (SplashScreenView) view;
    }

    public static /* bridge */ /* synthetic */ boolean y(View view) {
        return view instanceof SplashScreenView;
    }
}
