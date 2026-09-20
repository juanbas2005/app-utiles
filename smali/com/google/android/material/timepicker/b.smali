.class public final Lcom/google/android/material/timepicker/b;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public final synthetic w:Lcom/google/android/material/timepicker/ClockFaceView;


# direct methods
.method public constructor <init>(Lcom/google/android/material/timepicker/ClockFaceView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/material/timepicker/b;->w:Lcom/google/android/material/timepicker/ClockFaceView;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/timepicker/b;->w:Lcom/google/android/material/timepicker/ClockFaceView;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/material/timepicker/ClockFaceView;->R:Lcom/google/android/material/timepicker/ClockHandView;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x1

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    div-int/lit8 p0, p0, 0x2

    .line 25
    .line 26
    iget v2, v1, Lcom/google/android/material/timepicker/ClockHandView;->z:I

    .line 27
    .line 28
    sub-int/2addr p0, v2

    .line 29
    iget v2, v0, Lcom/google/android/material/timepicker/ClockFaceView;->c0:I

    .line 30
    .line 31
    sub-int/2addr p0, v2

    .line 32
    iget v2, v0, Ltv5;->P:I

    .line 33
    .line 34
    if-eq p0, v2, :cond_1

    .line 35
    .line 36
    iput p0, v0, Ltv5;->P:I

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/google/android/material/timepicker/ClockFaceView;->m()V

    .line 39
    .line 40
    .line 41
    iget p0, v0, Ltv5;->P:I

    .line 42
    .line 43
    iput p0, v1, Lcom/google/android/material/timepicker/ClockHandView;->H:I

    .line 44
    .line 45
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_0
    return v3
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method
