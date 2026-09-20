.class public final synthetic Lmf2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Le77;
.implements Lg61;


# instance fields
.field public final synthetic w:Lnf2;


# direct methods
.method public synthetic constructor <init>(Lnf2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmf2;->w:Lnf2;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
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
.end method


# virtual methods
.method public c(Lyb9;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object p0, p0, Lmf2;->w:Lnf2;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lyb9;->k()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    iget-object v0, p0, Lnf2;->c:Lqz0;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    const/4 v2, 0x0

    .line 17
    :try_start_0
    invoke-static {v2}, Lb35;->l(Ljava/lang/Object;)Lyb9;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iput-object v2, v0, Lqz0;->c:Lyb9;

    .line 22
    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 24
    iget-object v2, v0, Lqz0;->b:Le01;

    .line 25
    .line 26
    monitor-enter v2

    .line 27
    :try_start_1
    iget-object v0, v2, Le01;->a:Landroid/content/Context;

    .line 28
    .line 29
    iget-object v3, v2, Le01;->b:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v3}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    .line 34
    monitor-exit v2

    .line 35
    invoke-virtual {p1}, Lyb9;->i()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lsz0;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    iget-object v0, p1, Lsz0;->d:Lorg/json/JSONArray;

    .line 44
    .line 45
    const-string v2, "FirebaseRemoteConfig"

    .line 46
    .line 47
    iget-object v3, p0, Lnf2;->a:Lke2;

    .line 48
    .line 49
    if-nez v3, :cond_0

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_0
    :try_start_2
    invoke-static {v0}, Lnf2;->d(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v3, v0}, Lke2;->c(Ljava/util/ArrayList;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lcom/google/firebase/abt/AbtException; {:try_start_2 .. :try_end_2} :catch_0

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :catch_0
    move-exception v0

    .line 61
    goto :goto_0

    .line 62
    :catch_1
    move-exception v0

    .line 63
    goto :goto_1

    .line 64
    :goto_0
    const-string v3, "Could not update ABT experiments."

    .line 65
    .line 66
    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :goto_1
    const-string v3, "Could not parse ABT experiments from the JSON response."

    .line 71
    .line 72
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 73
    .line 74
    .line 75
    :goto_2
    iget-object p0, p0, Lnf2;->i:Lam6;

    .line 76
    .line 77
    :try_start_3
    iget-object v0, p0, Lam6;->y:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, Lkg5;

    .line 80
    .line 81
    invoke-virtual {v0, p1}, Lkg5;->s(Lsz0;)Ll10;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iget-object v0, p0, Lam6;->A:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, Ljava/util/Set;

    .line 88
    .line 89
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-eqz v2, :cond_2

    .line 98
    .line 99
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    check-cast v2, Lr91;

    .line 104
    .line 105
    iget-object v3, p0, Lam6;->z:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v3, Ljava/util/concurrent/Executor;

    .line 108
    .line 109
    new-instance v4, Lw86;

    .line 110
    .line 111
    invoke-direct {v4, v2, p1, v1}, Lw86;-><init>(Lr91;Ll10;I)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_3
    .catch Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException; {:try_start_3 .. :try_end_3} :catch_2

    .line 115
    .line 116
    .line 117
    goto :goto_3

    .line 118
    :catch_2
    move-exception p0

    .line 119
    const-string p1, "FirebaseRemoteConfig"

    .line 120
    .line 121
    const-string v0, "Exception publishing RolloutsState to subscribers. Continuing to listen for changes."

    .line 122
    .line 123
    invoke-static {p1, v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 124
    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_1
    const-string p0, "FirebaseRemoteConfig"

    .line 128
    .line 129
    const-string p1, "Activated configs written to disk are null."

    .line 130
    .line 131
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    :cond_2
    :goto_4
    const/4 v1, 0x1

    .line 135
    goto :goto_5

    .line 136
    :catchall_0
    move-exception p0

    .line 137
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 138
    throw p0

    .line 139
    :catchall_1
    move-exception p0

    .line 140
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 141
    throw p0

    .line 142
    :cond_3
    :goto_5
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    return-object p0
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

.method public q(Ljava/lang/Object;)Lyb9;
    .locals 5

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    iget-object p0, p0, Lmf2;->w:Lnf2;

    .line 4
    .line 5
    iget-object p1, p0, Lnf2;->c:Lqz0;

    .line 6
    .line 7
    invoke-virtual {p1}, Lqz0;->b()Lyb9;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v0, p0, Lnf2;->d:Lqz0;

    .line 12
    .line 13
    invoke-virtual {v0}, Lqz0;->b()Lyb9;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    filled-new-array {p1, v0}, [Lyb9;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Lb35;->B([Lyb9;)Lyb9;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v2, p0, Lnf2;->b:Ljava/util/concurrent/Executor;

    .line 26
    .line 27
    new-instance v3, Lyz0;

    .line 28
    .line 29
    const/4 v4, 0x3

    .line 30
    invoke-direct {v3, p0, p1, v0, v4}, Lyz0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v2, v3}, Lyb9;->g(Ljava/util/concurrent/Executor;Lg61;)Lyb9;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
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
    .line 48
    .line 49
    .line 50
    .line 51
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
.end method
