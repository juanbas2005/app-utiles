.class public Lcom/google/firebase/remoteconfig/RemoteConfigRegistrar;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-rc"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
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
.end method

.method public static synthetic a(Lav5;Lkd6;)Lb46;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/firebase/remoteconfig/RemoteConfigRegistrar;->lambda$getComponents$0(Lav5;Ltv0;)Lb46;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
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

.method private static lambda$getComponents$0(Lav5;Ltv0;)Lb46;
    .locals 9

    .line 1
    new-instance v0, Lb46;

    .line 2
    .line 3
    const-class v1, Landroid/content/Context;

    .line 4
    .line 5
    invoke-interface {p1, v1}, Ltv0;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Landroid/content/Context;

    .line 10
    .line 11
    invoke-interface {p1, p0}, Ltv0;->s(Lav5;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    move-object v2, p0

    .line 16
    check-cast v2, Ljava/util/concurrent/ScheduledExecutorService;

    .line 17
    .line 18
    const-class p0, Loe2;

    .line 19
    .line 20
    invoke-interface {p1, p0}, Ltv0;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    move-object v3, p0

    .line 25
    check-cast v3, Loe2;

    .line 26
    .line 27
    const-class p0, Lwe2;

    .line 28
    .line 29
    invoke-interface {p1, p0}, Ltv0;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    move-object v4, p0

    .line 34
    check-cast v4, Lwe2;

    .line 35
    .line 36
    const-class p0, Lz3;

    .line 37
    .line 38
    invoke-interface {p1, p0}, Ltv0;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, Lz3;

    .line 43
    .line 44
    const-string v5, "frc"

    .line 45
    .line 46
    monitor-enter p0

    .line 47
    :try_start_0
    iget-object v6, p0, Lz3;->a:Ljava/util/HashMap;

    .line 48
    .line 49
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-nez v6, :cond_0

    .line 54
    .line 55
    iget-object v6, p0, Lz3;->a:Ljava/util/HashMap;

    .line 56
    .line 57
    new-instance v7, Lke2;

    .line 58
    .line 59
    iget-object v8, p0, Lz3;->b:Lnu5;

    .line 60
    .line 61
    invoke-direct {v7, v8}, Lke2;-><init>(Lnu5;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v6, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    move-object p1, v0

    .line 70
    goto :goto_1

    .line 71
    :cond_0
    :goto_0
    iget-object v6, p0, Lz3;->a:Ljava/util/HashMap;

    .line 72
    .line 73
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    check-cast v5, Lke2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    monitor-exit p0

    .line 80
    const-class p0, Lac;

    .line 81
    .line 82
    invoke-interface {p1, p0}, Ltv0;->h(Ljava/lang/Class;)Lnu5;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-direct/range {v0 .. v6}, Lb46;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Loe2;Lwe2;Lke2;Lnu5;)V

    .line 87
    .line 88
    .line 89
    return-object v0

    .line 90
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    throw p1
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
.method public getComponents()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgv0;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p0, Lav5;

    .line 2
    .line 3
    const-class v0, Lx90;

    .line 4
    .line 5
    const-class v1, Ljava/util/concurrent/ScheduledExecutorService;

    .line 6
    .line 7
    invoke-direct {p0, v0, v1}, Lav5;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    const-class v0, Lof2;

    .line 11
    .line 12
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Lfv0;

    .line 17
    .line 18
    const-class v2, Lb46;

    .line 19
    .line 20
    invoke-direct {v1, v2, v0}, Lfv0;-><init>(Ljava/lang/Class;[Ljava/lang/Class;)V

    .line 21
    .line 22
    .line 23
    const-string v0, "fire-rc"

    .line 24
    .line 25
    iput-object v0, v1, Lfv0;->a:Ljava/lang/String;

    .line 26
    .line 27
    const-class v2, Landroid/content/Context;

    .line 28
    .line 29
    invoke-static {v2}, Lzp1;->c(Ljava/lang/Class;)Lzp1;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v1, v2}, Lfv0;->a(Lzp1;)V

    .line 34
    .line 35
    .line 36
    new-instance v2, Lzp1;

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    const/4 v4, 0x0

    .line 40
    invoke-direct {v2, p0, v3, v4}, Lzp1;-><init>(Lav5;II)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Lfv0;->a(Lzp1;)V

    .line 44
    .line 45
    .line 46
    const-class v2, Loe2;

    .line 47
    .line 48
    invoke-static {v2}, Lzp1;->c(Ljava/lang/Class;)Lzp1;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v1, v2}, Lfv0;->a(Lzp1;)V

    .line 53
    .line 54
    .line 55
    const-class v2, Lwe2;

    .line 56
    .line 57
    invoke-static {v2}, Lzp1;->c(Ljava/lang/Class;)Lzp1;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v1, v2}, Lfv0;->a(Lzp1;)V

    .line 62
    .line 63
    .line 64
    const-class v2, Lz3;

    .line 65
    .line 66
    invoke-static {v2}, Lzp1;->c(Ljava/lang/Class;)Lzp1;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v1, v2}, Lfv0;->a(Lzp1;)V

    .line 71
    .line 72
    .line 73
    const-class v2, Lac;

    .line 74
    .line 75
    invoke-static {v2}, Lzp1;->a(Ljava/lang/Class;)Lzp1;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v1, v2}, Lfv0;->a(Lzp1;)V

    .line 80
    .line 81
    .line 82
    new-instance v2, Lul1;

    .line 83
    .line 84
    const/4 v3, 0x3

    .line 85
    invoke-direct {v2, p0, v3}, Lul1;-><init>(Lav5;I)V

    .line 86
    .line 87
    .line 88
    iput-object v2, v1, Lfv0;->g:Ljava/lang/Object;

    .line 89
    .line 90
    const/4 p0, 0x2

    .line 91
    invoke-virtual {v1, p0}, Lfv0;->c(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Lfv0;->b()Lgv0;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    const-string v1, "23.1.0"

    .line 99
    .line 100
    invoke-static {v0, v1}, Lgw8;->q(Ljava/lang/String;Ljava/lang/String;)Lgv0;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    filled-new-array {p0, v0}, [Lgv0;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0
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
