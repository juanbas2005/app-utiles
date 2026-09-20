.class public final Lt97;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt97;->a:Landroid/content/Context;

    .line 5
    .line 6
    invoke-static {p1}, Lnd8;->c(Landroid/content/Context;)Lnd8;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string p1, "cu.lestebang.utiletecsa.jetpack.sync.worker"

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lnd8;->d(Ljava/lang/String;)Ldi2;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-instance p1, Lc6;

    .line 17
    .line 18
    const/16 v0, 0xe

    .line 19
    .line 20
    invoke-direct {p1, p0, v0}, Lc6;-><init>(Ldi2;I)V

    .line 21
    .line 22
    .line 23
    const/4 p0, -0x1

    .line 24
    invoke-static {p1, p0}, Lgr8;->u(Ldi2;I)Ldi2;

    .line 25
    .line 26
    .line 27
    return-void
    .line 28
    .line 29
.end method


# virtual methods
.method public final a()V
    .locals 14

    .line 1
    sget-object v0, Lyh7;->a:Lhr2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v2, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {v2}, Lhr2;->m([Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lt97;->a:Landroid/content/Context;

    .line 13
    .line 14
    invoke-static {p0}, Lnd8;->c(Landroid/content/Context;)Lnd8;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-array v0, v1, [Ljava/lang/Object;

    .line 19
    .line 20
    invoke-static {v0}, Lhr2;->m([Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Lr55;

    .line 24
    .line 25
    const-class v1, Lcu/lestebang/utiletecsa/sync/worker/DelegatingWorker;

    .line 26
    .line 27
    invoke-direct {v0, v1}, Lr55;-><init>(Ljava/lang/Class;)V

    .line 28
    .line 29
    .line 30
    iget-object v1, v0, Lst5;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Lbe8;

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    iput-boolean v2, v1, Lbe8;->q:Z

    .line 36
    .line 37
    sget-object v2, Lg85;->w:Lg85;

    .line 38
    .line 39
    iput-object v2, v1, Lbe8;->r:Lg85;

    .line 40
    .line 41
    new-instance v1, Lny4;

    .line 42
    .line 43
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 44
    .line 45
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 46
    .line 47
    .line 48
    new-instance v3, Lny4;

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-direct {v3, v2}, Lny4;-><init>(Landroid/net/NetworkRequest;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v1}, Ldt0;->g1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 55
    .line 56
    .line 57
    move-result-object v13

    .line 58
    new-instance v2, Lj31;

    .line 59
    .line 60
    sget-object v4, Lyy4;->x:Lyy4;

    .line 61
    .line 62
    const/4 v5, 0x0

    .line 63
    const/4 v6, 0x0

    .line 64
    const/4 v7, 0x0

    .line 65
    const/4 v8, 0x0

    .line 66
    const-wide/16 v9, -0x1

    .line 67
    .line 68
    move-wide v11, v9

    .line 69
    invoke-direct/range {v2 .. v13}, Lj31;-><init>(Lny4;Lyy4;ZZZZJJLjava/util/Set;)V

    .line 70
    .line 71
    .line 72
    iget-object v1, v0, Lst5;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, Lbe8;

    .line 75
    .line 76
    iput-object v2, v1, Lbe8;->j:Lj31;

    .line 77
    .line 78
    const-class v1, Lcu/lestebang/utiletecsa/sync/worker/SyncWorker;

    .line 79
    .line 80
    sget-object v2, Lb26;->a:Lc26;

    .line 81
    .line 82
    invoke-virtual {v2, v1}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-static {v1}, Lwe;->i(Lgq3;)Lce1;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    iget-object v2, v0, Lst5;->c:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v2, Lbe8;

    .line 93
    .line 94
    iput-object v1, v2, Lbe8;->e:Lce1;

    .line 95
    .line 96
    invoke-virtual {v0}, Lst5;->a()Lxd8;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, Ls55;

    .line 101
    .line 102
    const-string v1, "cu.lestebang.utiletecsa.jetpack.sync.worker"

    .line 103
    .line 104
    sget-object v2, Lw82;->x:Lw82;

    .line 105
    .line 106
    invoke-virtual {p0, v1, v2, v0}, Lnd8;->b(Ljava/lang/String;Lw82;Ls55;)V

    .line 107
    .line 108
    .line 109
    return-void
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method
