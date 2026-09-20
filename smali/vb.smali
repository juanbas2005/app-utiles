.class public final synthetic Lvb;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Z)V
    .locals 0

    .line 1
    iput p1, p0, Lvb;->w:I

    .line 2
    .line 3
    iput-object p2, p0, Lvb;->y:Ljava/lang/Object;

    .line 4
    .line 5
    iput-boolean p3, p0, Lvb;->x:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lvb;->w:I

    .line 2
    .line 3
    iget-boolean v1, p0, Lvb;->x:Z

    .line 4
    .line 5
    iget-object p0, p0, Lvb;->y:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lto;

    .line 11
    .line 12
    iget-object p0, p0, Lto;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Ln43;

    .line 15
    .line 16
    iput-boolean v1, p0, Ln43;->b:Z

    .line 17
    .line 18
    iget-boolean v0, p0, Ln43;->a:Z

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Ln43;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Landroid/os/Handler;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-boolean v1, p0, Ln43;->b:Z

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    iget-object p0, p0, Ln43;->f:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Lyk0;

    .line 37
    .line 38
    const-wide/32 v1, 0x493e0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void

    .line 45
    :pswitch_0
    check-cast p0, Lxj0;

    .line 46
    .line 47
    iget-object p0, p0, Lxj0;->c:Lzj0;

    .line 48
    .line 49
    invoke-virtual {p0, v1}, Lzj0;->d(Z)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_1
    check-cast p0, Lwb;

    .line 54
    .line 55
    iget-object p0, p0, Lwb;->a:Lzj0;

    .line 56
    .line 57
    invoke-virtual {p0, v1}, Lzj0;->d(Z)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 62
    .line 63
.end method
