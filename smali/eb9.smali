.class public final Leb9;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lh3;

.field public final c:Lo00;

.field public final d:Ljz0;

.field public final e:Lkd6;

.field public final f:Lkd6;

.field public final g:Ljava/lang/Object;

.field public final h:Lhx8;

.field public i:Ljava/util/List;


# direct methods
.method public constructor <init>(Lo00;Lh3;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lkd6;

    .line 5
    .line 6
    new-instance v1, Lk68;

    .line 7
    .line 8
    const/16 v2, 0x1d

    .line 9
    .line 10
    invoke-direct {v1, v2, p0}, Lk68;-><init>(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Lkd6;-><init>(Lct;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Leb9;->f:Lkd6;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/Object;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Leb9;->g:Ljava/lang/Object;

    .line 24
    .line 25
    new-instance v1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Leb9;->i:Ljava/util/List;

    .line 31
    .line 32
    iput-object p1, p0, Leb9;->c:Lo00;

    .line 33
    .line 34
    iput-object p2, p0, Leb9;->b:Lh3;

    .line 35
    .line 36
    iget-object p2, p1, Lo00;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p2, Ljava/lang/String;

    .line 39
    .line 40
    iput-object p2, p0, Leb9;->a:Ljava/lang/String;

    .line 41
    .line 42
    new-instance p2, Lkd6;

    .line 43
    .line 44
    new-instance v1, Lay4;

    .line 45
    .line 46
    const/16 v2, 0x17

    .line 47
    .line 48
    invoke-direct {v1, v2, p1}, Lay4;-><init>(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p2, v1}, Lkd6;-><init>(Lct;)V

    .line 52
    .line 53
    .line 54
    iput-object p2, p0, Leb9;->e:Lkd6;

    .line 55
    .line 56
    new-instance p1, Ljz0;

    .line 57
    .line 58
    invoke-direct {p1, v2}, Ljz0;-><init>(I)V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, Leb9;->d:Ljz0;

    .line 62
    .line 63
    new-instance p1, Lhx8;

    .line 64
    .line 65
    const/4 p2, 0x4

    .line 66
    invoke-direct {p1, p2}, Lhx8;-><init>(I)V

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, Leb9;->h:Lhx8;

    .line 70
    .line 71
    new-instance p1, Lh89;

    .line 72
    .line 73
    invoke-direct {p1, p2, p0}, Lh89;-><init>(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    monitor-enter v0

    .line 77
    :try_start_0
    iget-object p0, p0, Leb9;->i:Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    monitor-exit v0

    .line 83
    return-void

    .line 84
    :catchall_0
    move-exception p0

    .line 85
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    throw p0
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


# virtual methods
.method public final a(Ln89;Ljm4;)Li3;
    .locals 8

    .line 1
    new-instance v0, Lh89;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1, p1}, Lh89;-><init>(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    sget p1, Lmc9;->a:I

    .line 8
    .line 9
    invoke-static {}, Lvb9;->a()Ljc9;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance v4, Ll99;

    .line 14
    .line 15
    const/4 v1, 0x4

    .line 16
    invoke-direct {v4, v1, p1, v0}, Ll99;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object p1, Loc9;->a:La35;

    .line 20
    .line 21
    const-string v0, "ticker"

    .line 22
    .line 23
    invoke-static {v0, p1}, Lg75;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, La35;->l()J

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Leb9;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string v0, "Update "

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget-object v0, p0, Leb9;->h:Lhx8;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, Lhx8;->b(Ljava/lang/String;)Lcc9;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :try_start_0
    iget-object v0, p0, Leb9;->f:Lkd6;

    .line 51
    .line 52
    invoke-virtual {v0}, Lkd6;->O0()Lx1;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    iget-object v0, p0, Leb9;->d:Ljz0;

    .line 57
    .line 58
    new-instance v1, Ln49;

    .line 59
    .line 60
    const/4 v2, 0x5

    .line 61
    invoke-direct {v1, v2, v3}, Ln49;-><init>(ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    sget-object v7, Lfv1;->w:Lfv1;

    .line 65
    .line 66
    invoke-virtual {v0, v1, v7}, Ljz0;->Y(Lct;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 67
    .line 68
    .line 69
    new-instance v1, Lno7;

    .line 70
    .line 71
    const/16 v6, 0x8

    .line 72
    .line 73
    move-object v2, p0

    .line 74
    move-object v5, p2

    .line 75
    invoke-direct/range {v1 .. v6}, Lno7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 76
    .line 77
    .line 78
    invoke-static {v1}, Lmc9;->a(Lct;)Lkc9;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {v0, p0, v7}, Ljz0;->Y(Lct;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-static {p0, v3}, Lpt2;->propagateCancellation(Lcom/google/common/util/concurrent/ListenableFuture;Ljava/util/concurrent/Future;)V

    .line 87
    .line 88
    .line 89
    iget-object p2, v2, Leb9;->b:Lh3;

    .line 90
    .line 91
    invoke-static {p2}, Lpt2;->e(Lcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 92
    .line 93
    .line 94
    new-instance p2, Llt2;

    .line 95
    .line 96
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-static {p0, p2, v7}, Lpt2;->f(Lcom/google/common/util/concurrent/ListenableFuture;Los2;Ljava/util/concurrent/Executor;)Li3;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {p1, p0}, Lcc9;->a(Lx1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Lcc9;->close()V

    .line 107
    .line 108
    .line 109
    return-object p0

    .line 110
    :catchall_0
    move-exception v0

    .line 111
    move-object p0, v0

    .line 112
    :try_start_1
    invoke-virtual {p1}, Lcc9;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :catchall_1
    move-exception v0

    .line 117
    move-object p1, v0

    .line 118
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    :goto_0
    throw p0
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
