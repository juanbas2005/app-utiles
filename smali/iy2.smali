.class public final Liy2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    iput v0, p0, Liy2;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lph8;

    .line 8
    .line 9
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-direct {v0, v1, v2}, Lph8;-><init>(Landroid/os/Looper;I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Liy2;->x:Ljava/lang/Object;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 20
    iput p1, p0, Liy2;->w:I

    iput-object p2, p0, Liy2;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Looper;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Liy2;->w:I

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lph8;

    const/4 v1, 0x3

    invoke-direct {v0, p1, v1}, Lph8;-><init>(Landroid/os/Looper;I)V

    iput-object v0, p0, Liy2;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget v0, p0, Liy2;->w:I

    .line 2
    .line 3
    iget-object p0, p0, Liy2;->x:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lph8;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast p0, Lv49;

    .line 15
    .line 16
    iget-object p0, p0, Lin8;->w:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Ly19;

    .line 19
    .line 20
    iget-object p0, p0, Ly19;->C:Lr19;

    .line 21
    .line 22
    invoke-static {p0}, Ly19;->g(Ly29;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lr19;->l1(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_1
    check-cast p0, Lqd8;

    .line 30
    .line 31
    iget-object p0, p0, Lqd8;->c:Landroid/os/Handler;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_2
    check-cast p0, Ljava/util/concurrent/Executor;

    .line 38
    .line 39
    new-instance v0, Lee6;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-direct {v0, p1, v1}, Lee6;-><init>(Ljava/lang/Runnable;I)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_3
    check-cast p0, Lph8;

    .line 50
    .line 51
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
