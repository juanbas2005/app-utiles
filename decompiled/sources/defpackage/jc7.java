package defpackage;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;

/* renamed from: jc7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jc7 extends Canvas {
    public Canvas a;

    public final Canvas a() {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas;
        }
        zb3.c("Text drawing wrapper is missing a Canvas!");
        ta1.e();
        return null;
    }

    public final boolean clipOutPath(Path path) {
        return a().clipOutPath(path);
    }

    public final boolean clipOutRect(RectF rectF) {
        return a().clipOutRect(rectF);
    }

    public final boolean clipPath(Path path, Region.Op op) {
        return a().clipPath(path, op);
    }

    public final boolean clipRect(RectF rectF, Region.Op op) {
        return a().clipRect(rectF, op);
    }

    public final void concat(Matrix matrix) {
        a().concat(matrix);
    }

    public final void disableZ() {
        a().disableZ();
    }

    public final void drawARGB(int i, int i2, int i3, int i4) {
        a().drawARGB(i, i2, i3, i4);
    }

    public final void drawArc(RectF rectF, float f, float f2, boolean z, Paint paint) {
        a().drawArc(rectF, f, f2, z, paint);
    }

    public final void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
        a().drawBitmap(bitmap, f, f2, paint);
    }

    public final void drawBitmapMesh(Bitmap bitmap, int i, int i2, float[] fArr, int i3, int[] iArr, int i4, Paint paint) {
        a().drawBitmapMesh(bitmap, i, i2, fArr, i3, iArr, i4, paint);
    }

    public final void drawCircle(float f, float f2, float f3, Paint paint) {
        a().drawCircle(f, f2, f3, paint);
    }

    public final void drawColor(int i) {
        a().drawColor(i);
    }

    public final void drawDoubleRoundRect(RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        a().drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
    }

    public final void drawGlyphs(int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        a().drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    public final void drawLine(float f, float f2, float f3, float f4, Paint paint) {
        a().drawLine(f, f2, f3, f4, paint);
    }

    public final void drawLines(float[] fArr, int i, int i2, Paint paint) {
        a().drawLines(fArr, i, i2, paint);
    }

    public final void drawOval(RectF rectF, Paint paint) {
        a().drawOval(rectF, paint);
    }

    public final void drawPaint(Paint paint) {
        a().drawPaint(paint);
    }

    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        a().drawPatch(ninePatch, rect, paint);
    }

    public final void drawPath(Path path, Paint paint) {
        a().drawPath(path, paint);
    }

    public final void drawPicture(Picture picture) {
        a().drawPicture(picture);
    }

    public final void drawPoint(float f, float f2, Paint paint) {
        a().drawPoint(f, f2, paint);
    }

    public final void drawPoints(float[] fArr, int i, int i2, Paint paint) {
        a().drawPoints(fArr, i, i2, paint);
    }

    public final void drawPosText(char[] cArr, int i, int i2, float[] fArr, Paint paint) {
        a().drawPosText(cArr, i, i2, fArr, paint);
    }

    public final void drawRGB(int i, int i2, int i3) {
        a().drawRGB(i, i2, i3);
    }

    public final void drawRect(RectF rectF, Paint paint) {
        a().drawRect(rectF, paint);
    }

    public final void drawRenderNode(RenderNode renderNode) {
        a().drawRenderNode(renderNode);
    }

    public final void drawRoundRect(RectF rectF, float f, float f2, Paint paint) {
        a().drawRoundRect(rectF, f, f2, paint);
    }

    public final void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
        a().drawText(cArr, i, i2, f, f2, paint);
    }

    public final void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
        a().drawTextOnPath(cArr, i, i2, path, f, f2, paint);
    }

    public final void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        a().drawTextRun(cArr, i, i2, i3, i4, f, f2, z, paint);
    }

    public final void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i2, float[] fArr2, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, Paint paint) {
        a().drawVertices(vertexMode, i, fArr, i2, fArr2, i3, iArr, i4, sArr, i5, i6, paint);
    }

    public final void enableZ() {
        a().enableZ();
    }

    public final boolean getClipBounds(Rect rect) {
        boolean clipBounds = a().getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    public final int getDensity() {
        return a().getDensity();
    }

    public final DrawFilter getDrawFilter() {
        return a().getDrawFilter();
    }

    public final int getHeight() {
        return a().getHeight();
    }

    public final void getMatrix(Matrix matrix) {
        a().getMatrix(matrix);
    }

    public final int getMaximumBitmapHeight() {
        return a().getMaximumBitmapHeight();
    }

    public final int getMaximumBitmapWidth() {
        return a().getMaximumBitmapWidth();
    }

    public final int getSaveCount() {
        return a().getSaveCount();
    }

    public final int getWidth() {
        return a().getWidth();
    }

    public final boolean isOpaque() {
        return a().isOpaque();
    }

    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        return a().quickReject(rectF, edgeType);
    }

    public final void restore() {
        a().restore();
    }

    public final void restoreToCount(int i) {
        a().restoreToCount(i);
    }

    public final void rotate(float f) {
        a().rotate(f);
    }

    public final int save() {
        return a().save();
    }

    public final int saveLayer(RectF rectF, Paint paint, int i) {
        return a().saveLayer(rectF, paint, i);
    }

    public final int saveLayerAlpha(RectF rectF, int i, int i2) {
        return a().saveLayerAlpha(rectF, i, i2);
    }

    public final void scale(float f, float f2) {
        a().scale(f, f2);
    }

    public final void setBitmap(Bitmap bitmap) {
        a().setBitmap(bitmap);
    }

    public final void setDensity(int i) {
        a().setDensity(i);
    }

    public final void setDrawFilter(DrawFilter drawFilter) {
        a().setDrawFilter(drawFilter);
    }

    public final void setMatrix(Matrix matrix) {
        a().setMatrix(matrix);
    }

    public final void skew(float f, float f2) {
        a().skew(f, f2);
    }

    public final void translate(float f, float f2) {
        a().translate(f, f2);
    }

    public final void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        a().drawArc(f, f2, f3, f4, f5, f6, z, paint);
    }

    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        a().drawBitmap(bitmap, rect, rectF, paint);
    }

    public final void drawColor(long j) {
        a().drawColor(j);
    }

    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        a().drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public final void drawLines(float[] fArr, Paint paint) {
        a().drawLines(fArr, paint);
    }

    public final void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        a().drawOval(f, f2, f3, f4, paint);
    }

    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        a().drawPatch(ninePatch, rectF, paint);
    }

    public final void drawPicture(Picture picture, RectF rectF) {
        a().drawPicture(picture, rectF);
    }

    public final void drawPoints(float[] fArr, Paint paint) {
        a().drawPoints(fArr, paint);
    }

    public final void drawPosText(String str, float[] fArr, Paint paint) {
        a().drawPosText(str, fArr, paint);
    }

    public final void drawRect(Rect rect, Paint paint) {
        a().drawRect(rect, paint);
    }

    public final void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        a().drawRoundRect(f, f2, f3, f4, f5, f6, paint);
    }

    public final void drawText(String str, float f, float f2, Paint paint) {
        a().drawText(str, f, f2, paint);
    }

    public final void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
        a().drawTextOnPath(str, path, f, f2, paint);
    }

    public final void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        a().drawTextRun(charSequence, i, i2, i3, i4, f, f2, z, paint);
    }

    public final boolean clipOutRect(Rect rect) {
        return a().clipOutRect(rect);
    }

    public final boolean clipPath(Path path) {
        return a().clipPath(path);
    }

    public final boolean clipRect(Rect rect, Region.Op op) {
        return a().clipRect(rect, op);
    }

    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        a().drawBitmap(bitmap, rect, rect2, paint);
    }

    public final void drawPicture(Picture picture, Rect rect) {
        a().drawPicture(picture, rect);
    }

    public final void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        a().drawRect(f, f2, f3, f4, paint);
    }

    public final void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
        a().drawText(str, i, i2, f, f2, paint);
    }

    public final boolean quickReject(RectF rectF) {
        return a().quickReject(rectF);
    }

    public final int saveLayer(RectF rectF, Paint paint) {
        return a().saveLayer(rectF, paint);
    }

    public final int saveLayerAlpha(RectF rectF, int i) {
        return a().saveLayerAlpha(rectF, i);
    }

    public final boolean clipRect(RectF rectF) {
        return a().clipRect(rectF);
    }

    public final void drawBitmap(int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, Paint paint) {
        a().drawBitmap(iArr, i, i2, f, f2, i3, i4, z, paint);
    }

    public final void drawColor(int i, PorterDuff.Mode mode) {
        a().drawColor(i, mode);
    }

    public final void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
        a().drawText(charSequence, i, i2, f, f2, paint);
    }

    public final void drawTextRun(MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        a().drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint, int i) {
        return a().saveLayer(f, f2, f3, f4, paint, i);
    }

    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
        return a().saveLayerAlpha(f, f2, f3, f4, i, i2);
    }

    public final boolean clipOutRect(float f, float f2, float f3, float f4) {
        return a().clipOutRect(f, f2, f3, f4);
    }

    public final boolean clipRect(Rect rect) {
        return a().clipRect(rect);
    }

    public final void drawBitmap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Paint paint) {
        a().drawBitmap(iArr, i, i2, i3, i4, i5, i6, z, paint);
    }

    public final void drawColor(int i, BlendMode blendMode) {
        a().drawColor(i, blendMode);
    }

    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        return a().quickReject(path, edgeType);
    }

    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint) {
        return a().saveLayer(f, f2, f3, f4, paint);
    }

    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
        return a().saveLayerAlpha(f, f2, f3, f4, i);
    }

    public final boolean clipRect(float f, float f2, float f3, float f4, Region.Op op) {
        return a().clipRect(f, f2, f3, f4, op);
    }

    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        a().drawBitmap(bitmap, matrix, paint);
    }

    public final boolean quickReject(Path path) {
        return a().quickReject(path);
    }

    public final boolean clipOutRect(int i, int i2, int i3, int i4) {
        return a().clipOutRect(i, i2, i3, i4);
    }

    public final boolean clipRect(float f, float f2, float f3, float f4) {
        return a().clipRect(f, f2, f3, f4);
    }

    public final void drawColor(long j, BlendMode blendMode) {
        a().drawColor(j, blendMode);
    }

    public final boolean clipRect(int i, int i2, int i3, int i4) {
        return a().clipRect(i, i2, i3, i4);
    }

    public final boolean quickReject(float f, float f2, float f3, float f4, Canvas.EdgeType edgeType) {
        return a().quickReject(f, f2, f3, f4, edgeType);
    }

    public final boolean quickReject(float f, float f2, float f3, float f4) {
        return a().quickReject(f, f2, f3, f4);
    }
}
