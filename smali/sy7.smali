.class public final Lsy7;
.super Landroid/database/ContentObserver;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lad0;Landroid/os/Handler;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lsy7;->a:I

    .line 3
    .line 4
    iput-object p1, p0, Lsy7;->b:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p0, p2}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public constructor <init>(Landroid/os/Handler;Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lsy7;->a:I

    iput-object p2, p0, Lsy7;->b:Ljava/lang/Object;

    .line 10
    invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public final onChange(ZLandroid/net/Uri;)V
    .locals 4

    .line 1
    iget p1, p0, Lsy7;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lsy7;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lad0;

    .line 9
    .line 10
    sget-object p1, Lvs7;->a:Lvs7;

    .line 11
    .line 12
    invoke-interface {p0, p1}, Lxk6;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 17
    .line 18
    sget-object p1, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->T:Ld37;

    .line 19
    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    iget-wide v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->L:J

    .line 25
    .line 26
    sub-long v0, p1, v0

    .line 27
    .line 28
    const-wide/16 v2, 0x2710

    .line 29
    .line 30
    cmp-long v0, v0, v2

    .line 31
    .line 32
    if-gez v0, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->C:Lig0;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    new-instance v2, Lqh6;

    .line 41
    .line 42
    invoke-direct {v2, p1, p2, v1, p0}, Lqh6;-><init>(JLf61;Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x3

    .line 46
    invoke-static {v0, v1, v1, v2, p0}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 47
    .line 48
    .line 49
    :goto_0
    return-void

    .line 50
    :cond_1
    const-string p0, "scope"

    .line 51
    .line 52
    invoke-static {p0}, Lsg3;->a0(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v1

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
.end method
