.class public final Lz59;
.super Lxq8;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Lr69;


# direct methods
.method public synthetic constructor <init>(Lr69;Ly19;I)V
    .locals 0

    .line 1
    iput p3, p0, Lz59;->e:I

    .line 2
    .line 3
    iput-object p1, p0, Lz59;->f:Lr69;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Lxq8;-><init>(La39;)V

    .line 6
    .line 7
    .line 8
    return-void
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
.method public final a()V
    .locals 2

    .line 1
    iget v0, p0, Lz59;->e:I

    .line 2
    .line 3
    iget-object p0, p0, Lz59;->f:Lr69;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lin8;->w:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Ly19;

    .line 11
    .line 12
    iget-object p0, p0, Ly19;->B:Lpz8;

    .line 13
    .line 14
    invoke-static {p0}, Ly19;->g(Ly29;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lpz8;->E:Lmz8;

    .line 18
    .line 19
    const-string v0, "Tasks have been queued for a long time"

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lmz8;->a(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lr69;->t1()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-object v0, p0, Lin8;->w:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ly19;

    .line 38
    .line 39
    iget-object v0, v0, Ly19;->B:Lpz8;

    .line 40
    .line 41
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, v0, Lpz8;->J:Lmz8;

    .line 45
    .line 46
    const-string v1, "Inactivity, disconnecting from the service"

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lmz8;->a(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lr69;->k1()V

    .line 52
    .line 53
    .line 54
    :goto_0
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
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
.end method
