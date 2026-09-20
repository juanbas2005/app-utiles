.class public final synthetic Lis4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lvs4;


# direct methods
.method public synthetic constructor <init>(Lvs4;I)V
    .locals 0

    .line 1
    iput p2, p0, Lis4;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lis4;->x:Lvs4;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lis4;->w:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lvs7;->a:Lvs7;

    .line 5
    .line 6
    iget-object p0, p0, Lis4;->x:Lvs4;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/lang/Long;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    iget-object p0, p0, Lvs4;->c:Lkr4;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    sget-object p1, Lyh7;->a:Lhr2;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    new-array v0, v0, [Ljava/lang/Object;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lhr2;->m([Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Lkr4;->a:Landroid/content/Context;

    .line 34
    .line 35
    invoke-static {p0}, Lnd8;->c(Landroid/content/Context;)Lnd8;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    new-instance p1, Lr55;

    .line 40
    .line 41
    const-class v0, Lcu/lestebang/utiletecsa/sync/worker/DelegatingWorker;

    .line 42
    .line 43
    invoke-direct {p1, v0}, Lr55;-><init>(Ljava/lang/Class;)V

    .line 44
    .line 45
    .line 46
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iget-object v5, p1, Lst5;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v5, Lbe8;

    .line 54
    .line 55
    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 56
    .line 57
    .line 58
    move-result-wide v3

    .line 59
    iput-wide v3, v5, Lbe8;->g:J

    .line 60
    .line 61
    const-wide v3, 0x7fffffffffffffffL

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 67
    .line 68
    .line 69
    move-result-wide v5

    .line 70
    sub-long/2addr v3, v5

    .line 71
    iget-object v0, p1, Lst5;->c:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Lbe8;

    .line 74
    .line 75
    iget-wide v5, v0, Lbe8;->g:J

    .line 76
    .line 77
    cmp-long v0, v3, v5

    .line 78
    .line 79
    if-lez v0, :cond_0

    .line 80
    .line 81
    const-class v0, Lcu/lestebang/utiletecsa/sync/worker/NautaLogoutWorker;

    .line 82
    .line 83
    sget-object v1, Lb26;->a:Lc26;

    .line 84
    .line 85
    invoke-virtual {v1, v0}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v0}, Lwe;->i(Lgq3;)Lce1;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget-object v1, p1, Lst5;->c:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v1, Lbe8;

    .line 96
    .line 97
    iput-object v0, v1, Lbe8;->e:Lce1;

    .line 98
    .line 99
    invoke-virtual {p1}, Lst5;->a()Lxd8;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    check-cast p1, Ls55;

    .line 104
    .line 105
    const-string v0, "cu.lestebang.utiletecsa.sync.worker.nautalogout"

    .line 106
    .line 107
    sget-object v1, Lw82;->w:Lw82;

    .line 108
    .line 109
    invoke-virtual {p0, v0, v1, p1}, Lnd8;->b(Ljava/lang/String;Lw82;Ls55;)V

    .line 110
    .line 111
    .line 112
    move-object v1, v2

    .line 113
    goto :goto_0

    .line 114
    :cond_0
    const-string p0, "The given initial delay is too large and will cause an overflow!"

    .line 115
    .line 116
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    :goto_0
    return-object v1

    .line 120
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-static {p0}, Lu58;->a(Lr58;)Lls0;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    new-instance v3, Lju1;

    .line 130
    .line 131
    const/16 v4, 0x1a

    .line 132
    .line 133
    invoke-direct {v3, p0, p1, v1, v4}, Lju1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 134
    .line 135
    .line 136
    const/4 p0, 0x3

    .line 137
    invoke-static {v0, v1, v1, v3, p0}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 138
    .line 139
    .line 140
    return-object v2

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method
