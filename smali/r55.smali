.class public final Lr55;
.super Lst5;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic e:I


# direct methods
.method public constructor <init>(J)V
    .locals 13

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lr55;->e:I

    .line 3
    .line 4
    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const-class v1, Lcu/lestebang/utiletecsa/sync/worker/DelegatingWorker;

    .line 10
    .line 11
    invoke-direct {p0, v1}, Lst5;-><init>(Ljava/lang/Class;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lst5;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lbe8;

    .line 17
    .line 18
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 19
    .line 20
    .line 21
    move-result-wide p1

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    sget-object v0, Lbe8;->z:Ljava/lang/String;

    .line 26
    .line 27
    const-wide/32 v1, 0xdbba0

    .line 28
    .line 29
    .line 30
    cmp-long v3, p1, v1

    .line 31
    .line 32
    const-string v4, "Interval duration lesser than minimum allowed value; Changed to 900000"

    .line 33
    .line 34
    if-gez v3, :cond_0

    .line 35
    .line 36
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v5, v0, v4}, Lbc4;->q(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    if-gez v3, :cond_1

    .line 44
    .line 45
    move-wide v5, v1

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move-wide v5, p1

    .line 48
    :goto_0
    if-gez v3, :cond_2

    .line 49
    .line 50
    move-wide v7, v1

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move-wide v7, p1

    .line 53
    :goto_1
    cmp-long p1, v5, v1

    .line 54
    .line 55
    if-gez p1, :cond_3

    .line 56
    .line 57
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-virtual {p2, v0, v4}, Lbc4;->q(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :cond_3
    if-gez p1, :cond_4

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_4
    move-wide v1, v5

    .line 68
    :goto_2
    iput-wide v1, p0, Lbe8;->h:J

    .line 69
    .line 70
    const-wide/32 p1, 0x493e0

    .line 71
    .line 72
    .line 73
    cmp-long p1, v7, p1

    .line 74
    .line 75
    if-gez p1, :cond_5

    .line 76
    .line 77
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    const-string p2, "Flex duration lesser than minimum allowed value; Changed to 300000"

    .line 82
    .line 83
    invoke-virtual {p1, v0, p2}, Lbc4;->q(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :cond_5
    iget-wide p1, p0, Lbe8;->h:J

    .line 87
    .line 88
    cmp-long p1, v7, p1

    .line 89
    .line 90
    if-lez p1, :cond_6

    .line 91
    .line 92
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    new-instance p2, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    const-string v1, "Flex duration greater than interval duration; Changed to "

    .line 99
    .line 100
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    invoke-virtual {p1, v0, p2}, Lbc4;->q(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :cond_6
    const-wide/32 v9, 0x493e0

    .line 114
    .line 115
    .line 116
    iget-wide v11, p0, Lbe8;->h:J

    .line 117
    .line 118
    invoke-static/range {v7 .. v12}, Lz65;->q(JJJ)J

    .line 119
    .line 120
    .line 121
    move-result-wide p1

    .line 122
    iput-wide p1, p0, Lbe8;->i:J

    .line 123
    .line 124
    return-void
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

.method public synthetic constructor <init>(Ljava/lang/Class;)V
    .locals 1

    .line 125
    const/4 v0, 0x0

    iput v0, p0, Lr55;->e:I

    invoke-direct {p0, p1}, Lst5;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final b()Lxd8;
    .locals 3

    .line 1
    iget v0, p0, Lr55;->e:I

    .line 2
    .line 3
    iget-object v1, p0, Lst5;->d:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lst5;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lbe8;

    .line 11
    .line 12
    iget-boolean v2, v0, Lbe8;->q:Z

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    new-instance v2, Ltf5;

    .line 17
    .line 18
    iget-object p0, p0, Lst5;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Ljava/util/UUID;

    .line 21
    .line 22
    check-cast v1, Ljava/util/Set;

    .line 23
    .line 24
    invoke-direct {v2, p0, v0, v1}, Lxd8;-><init>(Ljava/util/UUID;Lbe8;Ljava/util/Set;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string p0, "PeriodicWorkRequests cannot be expedited"

    .line 29
    .line 30
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    :goto_0
    return-object v2

    .line 35
    :pswitch_0
    new-instance v0, Ls55;

    .line 36
    .line 37
    iget-object v2, p0, Lst5;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Ljava/util/UUID;

    .line 40
    .line 41
    iget-object p0, p0, Lst5;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Lbe8;

    .line 44
    .line 45
    check-cast v1, Ljava/util/Set;

    .line 46
    .line 47
    invoke-direct {v0, v2, p0, v1}, Lxd8;-><init>(Ljava/util/UUID;Lbe8;Ljava/util/Set;)V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
