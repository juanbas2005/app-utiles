.class public final Lk96;
.super Landroid/view/OrientationEventListener;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic a:Lkb9;


# direct methods
.method public constructor <init>(Lkb9;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk96;->a:Lkb9;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p2, p1}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;I)V

    .line 5
    .line 6
    .line 7
    return-void
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method


# virtual methods
.method public final onOrientationChanged(I)V
    .locals 2

    .line 1
    iget-object p0, p0, Lk96;->a:Lkb9;

    .line 2
    .line 3
    iget-object p1, p0, Lkb9;->y:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroid/view/WindowManager;

    .line 6
    .line 7
    iget-object v0, p0, Lkb9;->A:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lns8;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Landroid/view/Display;->getRotation()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iget v1, p0, Lkb9;->x:I

    .line 24
    .line 25
    if-eq p1, v1, :cond_0

    .line 26
    .line 27
    iput p1, p0, Lkb9;->x:I

    .line 28
    .line 29
    iget-object p0, v0, Lns8;->x:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Lcom/journeyapps/barcodescanner/BarcodeView;

    .line 32
    .line 33
    iget-object p0, p0, Ldk0;->y:Landroid/os/Handler;

    .line 34
    .line 35
    new-instance p1, Ly0;

    .line 36
    .line 37
    const/4 v1, 0x7

    .line 38
    invoke-direct {p1, v1, v0}, Ly0;-><init>(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    const-wide/16 v0, 0xfa

    .line 42
    .line 43
    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
    .line 47
    .line 48
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
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method
