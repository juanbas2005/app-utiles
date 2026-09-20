.class public final Lqh8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/android/gms/common/api/internal/BasePendingResult;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/BasePendingResult;Lxb7;Ltz2;)V
    .locals 0

    const/4 p3, 0x0

    iput p3, p0, Lqh8;->a:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqh8;->b:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    iput-object p2, p0, Lqh8;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lk68;Lcom/google/android/gms/common/api/internal/BasePendingResult;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lqh8;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lqh8;->b:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lqh8;->c:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
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
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 5

    .line 1
    iget v0, p0, Lqh8;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lqh8;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lk68;

    .line 9
    .line 10
    iget-object p1, p1, Lk68;->x:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Ljava/util/Map;

    .line 13
    .line 14
    iget-object p0, p0, Lqh8;->b:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    .line 15
    .line 16
    invoke-interface {p1, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->f()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget-object p1, p0, Lqh8;->b:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    .line 27
    .line 28
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 29
    .line 30
    iget-boolean v1, p1, Lcom/google/android/gms/common/api/internal/BasePendingResult;->g:Z

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    xor-int/2addr v1, v2

    .line 34
    const-string v3, "Result has already been consumed."

    .line 35
    .line 36
    invoke-static {v3, v1}, Lz65;->m(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    :try_start_0
    iget-object v1, p1, Lcom/google/android/gms/common/api/internal/BasePendingResult;->b:Ljava/util/concurrent/CountDownLatch;

    .line 40
    .line 41
    const-wide/16 v3, 0x0

    .line 42
    .line 43
    invoke-virtual {v1, v3, v4, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_0

    .line 48
    .line 49
    sget-object v0, Lcom/google/android/gms/common/api/Status;->D:Lcom/google/android/gms/common/api/Status;

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->c(Lcom/google/android/gms/common/api/Status;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catch_0
    sget-object v0, Lcom/google/android/gms/common/api/Status;->B:Lcom/google/android/gms/common/api/Status;

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->c(Lcom/google/android/gms/common/api/Status;)V

    .line 58
    .line 59
    .line 60
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->d()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    const-string v1, "Result is not ready."

    .line 65
    .line 66
    invoke-static {v1, v0}, Lz65;->m(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/BasePendingResult;->a:Ljava/lang/Object;

    .line 70
    .line 71
    monitor-enter v0

    .line 72
    :try_start_1
    iget-boolean v1, p1, Lcom/google/android/gms/common/api/internal/BasePendingResult;->g:Z

    .line 73
    .line 74
    xor-int/2addr v1, v2

    .line 75
    const-string v3, "Result has already been consumed."

    .line 76
    .line 77
    invoke-static {v3, v1}, Lz65;->m(Ljava/lang/String;Z)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->d()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    const-string v3, "Result is not ready."

    .line 85
    .line 86
    invoke-static {v3, v1}, Lz65;->m(Ljava/lang/String;Z)V

    .line 87
    .line 88
    .line 89
    iget-object v1, p1, Lcom/google/android/gms/common/api/internal/BasePendingResult;->e:Lp66;

    .line 90
    .line 91
    const/4 v3, 0x0

    .line 92
    iput-object v3, p1, Lcom/google/android/gms/common/api/internal/BasePendingResult;->e:Lp66;

    .line 93
    .line 94
    iput-boolean v2, p1, Lcom/google/android/gms/common/api/internal/BasePendingResult;->g:Z

    .line 95
    .line 96
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/BasePendingResult;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 98
    .line 99
    invoke-virtual {p1, v3}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-nez p1, :cond_1

    .line 104
    .line 105
    invoke-static {v1}, Lz65;->k(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    iget-object p0, p0, Lqh8;->c:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p0, Lxb7;

    .line 111
    .line 112
    invoke-virtual {p0, v3}, Lxb7;->b(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_1
    invoke-static {}, Lku4;->a()V

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :catchall_0
    move-exception p0

    .line 121
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 122
    throw p0

    .line 123
    :cond_2
    iget-object p0, p0, Lqh8;->c:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast p0, Lxb7;

    .line 126
    .line 127
    iget-object v0, p1, Lcom/google/android/gms/common/api/Status;->y:Landroid/app/PendingIntent;

    .line 128
    .line 129
    if-eqz v0, :cond_3

    .line 130
    .line 131
    new-instance v0, Lcom/google/android/gms/common/api/ResolvableApiException;

    .line 132
    .line 133
    invoke-direct {v0, p1}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_3
    new-instance v0, Lcom/google/android/gms/common/api/ApiException;

    .line 138
    .line 139
    invoke-direct {v0, p1}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 140
    .line 141
    .line 142
    :goto_1
    invoke-virtual {p0, v0}, Lxb7;->a(Ljava/lang/Exception;)V

    .line 143
    .line 144
    .line 145
    :goto_2
    return-void

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
