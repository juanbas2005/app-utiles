.class public final Lo99;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lq99;


# static fields
.field public static d:Z


# instance fields
.field public final a:Lx77;

.field public final b:I

.field public final c:Lrx8;


# direct methods
.method public constructor <init>(Lx77;)V
    .locals 2

    .line 1
    sget-object v0, Lrx8;->z:Lrx8;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lo99;->a:Lx77;

    .line 7
    .line 8
    const/4 p1, 0x5

    .line 9
    const/16 v1, 0xa

    .line 10
    .line 11
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iput p1, p0, Lo99;->b:I

    .line 16
    .line 17
    iput-object v0, p0, Lo99;->c:Lrx8;

    .line 18
    .line 19
    return-void
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
.end method


# virtual methods
.method public final a()V
    .locals 8

    .line 1
    const-class v1, Lo99;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    sget-boolean v0, Lo99;->d:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v4, Lm89;

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    invoke-direct {v4, v0, p0}, Lm89;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget v0, p0, Lo99;->b:I

    .line 15
    .line 16
    int-to-long v6, v0

    .line 17
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 18
    .line 19
    iget-object v2, p0, Lo99;->a:Lx77;

    .line 20
    .line 21
    invoke-interface {v2}, Lx77;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    move-object v5, v2

    .line 26
    check-cast v5, Ljm4;

    .line 27
    .line 28
    new-instance v2, Lw97;

    .line 29
    .line 30
    move-object v3, p0

    .line 31
    invoke-direct/range {v2 .. v7}, Lw97;-><init>(Lo99;Lm89;Ljm4;J)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    new-instance p0, Lho7;

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-static {v2, v3}, Ljava/util/concurrent/Executors;->callable(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Callable;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-direct {p0, v2}, Lho7;-><init>(Ljava/util/concurrent/Callable;)V

    .line 45
    .line 46
    .line 47
    iget-object v2, v5, Ljm4;->x:Ljava/util/concurrent/ScheduledExecutorService;

    .line 48
    .line 49
    invoke-interface {v2, p0, v6, v7, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    new-instance v2, Lhm4;

    .line 54
    .line 55
    invoke-direct {v2, p0, v0}, Lhm4;-><init>(Lx1;Ljava/util/concurrent/ScheduledFuture;)V

    .line 56
    .line 57
    .line 58
    new-instance p0, Lm89;

    .line 59
    .line 60
    const/4 v0, 0x2

    .line 61
    invoke-direct {p0, v0, v2}, Lm89;-><init>(ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    sget-object v0, Lfv1;->w:Lfv1;

    .line 65
    .line 66
    invoke-virtual {v2, p0, v0}, Lhm4;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x1

    .line 70
    sput-boolean p0, Lo99;->d:Z

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception v0

    .line 74
    move-object p0, v0

    .line 75
    goto :goto_1

    .line 76
    :cond_0
    :goto_0
    monitor-exit v1

    .line 77
    return-void

    .line 78
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    throw p0
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
