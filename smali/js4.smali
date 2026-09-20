.class public final synthetic Ljs4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lvs4;


# direct methods
.method public synthetic constructor <init>(Lvs4;I)V
    .locals 0

    .line 1
    iput p2, p0, Ljs4;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Ljs4;->x:Lvs4;

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
.method public final b()Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Ljs4;->w:I

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    const-string v2, "CancelWorkByName_"

    .line 6
    .line 7
    const-string v3, "cu.lestebang.utiletecsa.sync.worker.nautalogout"

    .line 8
    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    sget-object v7, Lvs7;->a:Lvs7;

    .line 13
    .line 14
    iget-object p0, p0, Ljs4;->x:Lvs4;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lvs4;->f:Ld37;

    .line 20
    .line 21
    invoke-virtual {v0}, Ld37;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lis7;

    .line 26
    .line 27
    iget-boolean v1, v1, Lis7;->b:Z

    .line 28
    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    invoke-static {p0}, Lu58;->a(Lr58;)Lls0;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v2, Lus4;

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    invoke-direct {v2, v0, v5, p0, v3}, Lus4;-><init>(Ld37;Lf61;Lvs4;I)V

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v5, v5, v2, v4}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 42
    .line 43
    .line 44
    :cond_0
    return-object v7

    .line 45
    :pswitch_0
    iget-object v0, p0, Lvs4;->c:Lkr4;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    sget-object v8, Lyh7;->a:Lhr2;

    .line 51
    .line 52
    new-array v9, v6, [Ljava/lang/Object;

    .line 53
    .line 54
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-static {v9}, Lhr2;->m([Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, v0, Lkr4;->a:Landroid/content/Context;

    .line 61
    .line 62
    invoke-static {v0}, Lnd8;->c(Landroid/content/Context;)Lnd8;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-object v8, v0, Lnd8;->b:Lf01;

    .line 67
    .line 68
    iget-object v8, v8, Lf01;->m:Ltd0;

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    iget-object v9, v0, Lnd8;->d:Lqd8;

    .line 75
    .line 76
    iget-object v9, v9, Lqd8;->a:Lol6;

    .line 77
    .line 78
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    new-instance v10, Lf5;

    .line 82
    .line 83
    invoke-direct {v10, v1, v3, v0}, Lf5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v8, v2, v9, v10}, Lg75;->E(Ltd0;Ljava/lang/String;Ljava/util/concurrent/Executor;Lsr2;)Lg22;

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lvs4;->f:Ld37;

    .line 90
    .line 91
    invoke-virtual {v0}, Ld37;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    check-cast v1, Lis7;

    .line 96
    .line 97
    iget-boolean v1, v1, Lis7;->b:Z

    .line 98
    .line 99
    if-nez v1, :cond_1

    .line 100
    .line 101
    invoke-static {p0}, Lu58;->a(Lr58;)Lls0;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    new-instance v2, Lus4;

    .line 106
    .line 107
    invoke-direct {v2, v0, v5, p0, v6}, Lus4;-><init>(Ld37;Lf61;Lvs4;I)V

    .line 108
    .line 109
    .line 110
    invoke-static {v1, v5, v5, v2, v4}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 111
    .line 112
    .line 113
    :cond_1
    return-object v7

    .line 114
    :pswitch_1
    invoke-virtual {p0}, Lvs4;->f()V

    .line 115
    .line 116
    .line 117
    return-object v7

    .line 118
    :pswitch_2
    iget-object p0, p0, Lvs4;->c:Lkr4;

    .line 119
    .line 120
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    sget-object v0, Lyh7;->a:Lhr2;

    .line 124
    .line 125
    new-array v4, v6, [Ljava/lang/Object;

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-static {v4}, Lhr2;->m([Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    iget-object p0, p0, Lkr4;->a:Landroid/content/Context;

    .line 134
    .line 135
    invoke-static {p0}, Lnd8;->c(Landroid/content/Context;)Lnd8;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    iget-object v0, p0, Lnd8;->b:Lf01;

    .line 140
    .line 141
    iget-object v0, v0, Lf01;->m:Ltd0;

    .line 142
    .line 143
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    iget-object v4, p0, Lnd8;->d:Lqd8;

    .line 148
    .line 149
    iget-object v4, v4, Lqd8;->a:Lol6;

    .line 150
    .line 151
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    new-instance v5, Lf5;

    .line 155
    .line 156
    invoke-direct {v5, v1, v3, p0}, Lf5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    invoke-static {v0, v2, v4, v5}, Lg75;->E(Ltd0;Ljava/lang/String;Ljava/util/concurrent/Executor;Lsr2;)Lg22;

    .line 160
    .line 161
    .line 162
    return-object v7

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method
