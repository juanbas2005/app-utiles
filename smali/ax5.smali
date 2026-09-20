.class public final Lax5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final w:Lvi0;

.field public volatile x:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic y:Ldx5;


# direct methods
.method public constructor <init>(Ldx5;Lvi0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax5;->y:Ldx5;

    .line 5
    .line 6
    iput-object p2, p0, Lax5;->w:Lvi0;

    .line 7
    .line 8
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lax5;->x:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 15
    .line 16
    return-void
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
.method public final run()V
    .locals 10

    .line 1
    const-string v0, "Callback failure for "

    .line 2
    .line 3
    const-string v1, "canceled due to "

    .line 4
    .line 5
    iget-object v2, p0, Lax5;->y:Ldx5;

    .line 6
    .line 7
    iget-object v2, v2, Ldx5;->x:Lkd6;

    .line 8
    .line 9
    iget-object v2, v2, Lkd6;->x:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lg73;

    .line 12
    .line 13
    invoke-virtual {v2}, Lg73;->g()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-string v3, "OkHttp "

    .line 18
    .line 19
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v3, p0, Lax5;->y:Ldx5;

    .line 24
    .line 25
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v4}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-virtual {v4, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :try_start_0
    iget-object v2, v3, Ldx5;->B:Lcx5;

    .line 37
    .line 38
    invoke-virtual {v2}, Lvt;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    const/4 v2, 0x3

    .line 42
    const/4 v6, 0x0

    .line 43
    const/4 v7, 0x0

    .line 44
    :try_start_1
    invoke-virtual {v3}, Ldx5;->h()La66;

    .line 45
    .line 46
    .line 47
    move-result-object v7
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 48
    const/4 v8, 0x1

    .line 49
    :try_start_2
    iget-object v9, p0, Lax5;->w:Lvi0;

    .line 50
    .line 51
    invoke-interface {v9, v3, v7}, Lvi0;->z(Lzh0;La66;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 52
    .line 53
    .line 54
    :try_start_3
    iget-object v0, v3, Ldx5;->w:Ld45;

    .line 55
    .line 56
    iget-object v0, v0, Ld45;->a:Lam6;

    .line 57
    .line 58
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v6, v6, p0, v2}, Lam6;->P(Lam6;Lax5;Ldx5;Lax5;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 62
    .line 63
    .line 64
    goto :goto_5

    .line 65
    :catchall_0
    move-exception p0

    .line 66
    goto :goto_7

    .line 67
    :catchall_1
    move-exception v0

    .line 68
    move v7, v8

    .line 69
    goto :goto_1

    .line 70
    :catch_0
    move-exception v1

    .line 71
    move v7, v8

    .line 72
    goto :goto_3

    .line 73
    :catchall_2
    move-exception v0

    .line 74
    :goto_1
    :try_start_4
    invoke-virtual {v3}, Ldx5;->d()V

    .line 75
    .line 76
    .line 77
    if-nez v7, :cond_0

    .line 78
    .line 79
    new-instance v7, Ljava/io/IOException;

    .line 80
    .line 81
    new-instance v8, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v8, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-direct {v7, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v7, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 97
    .line 98
    .line 99
    iget-object v1, p0, Lax5;->w:Lvi0;

    .line 100
    .line 101
    invoke-interface {v1, v3, v7}, Lvi0;->M(Lzh0;Ljava/io/IOException;)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :catchall_3
    move-exception v0

    .line 106
    goto :goto_6

    .line 107
    :cond_0
    :goto_2
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 108
    .line 109
    if-eqz v1, :cond_1

    .line 110
    .line 111
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 116
    .line 117
    .line 118
    :try_start_5
    iget-object v0, v3, Ldx5;->w:Ld45;

    .line 119
    .line 120
    iget-object v0, v0, Ld45;->a:Lam6;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_1
    :try_start_6
    throw v0

    .line 124
    :catch_1
    move-exception v1

    .line 125
    :goto_3
    if-eqz v7, :cond_2

    .line 126
    .line 127
    sget-object v7, Lej5;->a:Lej5;

    .line 128
    .line 129
    sget-object v7, Lej5;->a:Lej5;

    .line 130
    .line 131
    invoke-static {v3}, Ldx5;->a(Ldx5;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    invoke-virtual {v0, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    const/4 v8, 0x4

    .line 140
    invoke-virtual {v7, v0, v8, v1}, Lej5;->i(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_2
    iget-object v0, p0, Lax5;->w:Lvi0;

    .line 145
    .line 146
    invoke-interface {v0, v3, v1}, Lvi0;->M(Lzh0;Ljava/io/IOException;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 147
    .line 148
    .line 149
    :goto_4
    :try_start_7
    iget-object v0, v3, Ldx5;->w:Ld45;

    .line 150
    .line 151
    iget-object v0, v0, Ld45;->a:Lam6;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :goto_5
    invoke-virtual {v4, v5}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :goto_6
    :try_start_8
    iget-object v1, v3, Ldx5;->w:Ld45;

    .line 159
    .line 160
    iget-object v1, v1, Ld45;->a:Lam6;

    .line 161
    .line 162
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-static {v1, v6, v6, p0, v2}, Lam6;->P(Lam6;Lax5;Ldx5;Lax5;I)V

    .line 166
    .line 167
    .line 168
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 169
    :goto_7
    invoke-virtual {v4, v5}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw p0
.end method
