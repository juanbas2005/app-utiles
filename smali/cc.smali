.class public final synthetic Lcc;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lub0;
.implements Lec;
.implements Lko1;


# instance fields
.field public final synthetic w:Ldc;


# direct methods
.method public synthetic constructor <init>(Ldc;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcc;->w:Ldc;

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
.method public e(Lnu5;)V
    .locals 8

    .line 1
    iget-object p0, p0, Lcc;->w:Ldc;

    .line 2
    .line 3
    sget-object v0, Lg22;->D:Lg22;

    .line 4
    .line 5
    const-string v1, "AnalyticsConnector now available."

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lg22;->o(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Lnu5;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lac;

    .line 15
    .line 16
    new-instance v1, Lf96;

    .line 17
    .line 18
    const/16 v2, 0xe

    .line 19
    .line 20
    invoke-direct {v1, v2, p1}, Lf96;-><init>(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    new-instance v2, Ljz0;

    .line 24
    .line 25
    const/4 v3, 0x4

    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-direct {v2, v3, v4}, Ljz0;-><init>(IZ)V

    .line 28
    .line 29
    .line 30
    const-string v3, "FirebaseCrashlytics"

    .line 31
    .line 32
    const-string v5, "clx"

    .line 33
    .line 34
    check-cast p1, Lbc;

    .line 35
    .line 36
    invoke-virtual {p1, v5, v2}, Lbc;->b(Ljava/lang/String;Ljz0;)Lpe2;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    const/4 v6, 0x0

    .line 41
    if-nez v5, :cond_1

    .line 42
    .line 43
    const-string v5, "Could not register AnalyticsConnectorListener with Crashlytics origin."

    .line 44
    .line 45
    const/4 v7, 0x3

    .line 46
    invoke-static {v3, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    if-eqz v7, :cond_0

    .line 51
    .line 52
    invoke-static {v3, v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 53
    .line 54
    .line 55
    :cond_0
    const-string v5, "crash"

    .line 56
    .line 57
    invoke-virtual {p1, v5, v2}, Lbc;->b(Ljava/lang/String;Ljz0;)Lpe2;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    if-eqz v5, :cond_1

    .line 62
    .line 63
    const-string p1, "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version."

    .line 64
    .line 65
    invoke-static {v3, p1, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 66
    .line 67
    .line 68
    :cond_1
    if-eqz v5, :cond_3

    .line 69
    .line 70
    const-string p1, "Registered Firebase Analytics listener."

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Lg22;->o(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    new-instance p1, Lns8;

    .line 76
    .line 77
    const/4 v0, 0x7

    .line 78
    invoke-direct {p1, v0, v4}, Lns8;-><init>(IZ)V

    .line 79
    .line 80
    .line 81
    new-instance v0, Lwr0;

    .line 82
    .line 83
    invoke-direct {v0, v1}, Lwr0;-><init>(Lf96;)V

    .line 84
    .line 85
    .line 86
    monitor-enter p0

    .line 87
    :try_start_0
    iget-object v1, p0, Ldc;->a:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v1, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_2

    .line 100
    .line 101
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    check-cast v3, Lm91;

    .line 106
    .line 107
    invoke-virtual {p1, v3}, Lns8;->m(Lm91;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :catchall_0
    move-exception p1

    .line 112
    goto :goto_1

    .line 113
    :cond_2
    iput-object p1, v2, Ljz0;->y:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v0, v2, Ljz0;->x:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object p1, p0, Ldc;->c:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v0, p0, Ldc;->b:Ljava/lang/Object;

    .line 120
    .line 121
    monitor-exit p0

    .line 122
    return-void

    .line 123
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    throw p1

    .line 125
    :cond_3
    const-string p0, "Could not register Firebase Analytics listener; a listener is already registered."

    .line 126
    .line 127
    invoke-virtual {v0, p0, v6}, Lg22;->v(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 128
    .line 129
    .line 130
    return-void
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

.method public j(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcc;->w:Ldc;

    .line 2
    .line 3
    iget-object p0, p0, Ldc;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lec;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Lec;->j(Landroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public m(Lm91;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcc;->w:Ldc;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v0, p0, Ldc;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lub0;

    .line 7
    .line 8
    instance-of v0, v0, Llv1;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Ldc;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    iget-object v0, p0, Ldc;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lub0;

    .line 25
    .line 26
    invoke-interface {v0, p1}, Lub0;->m(Lm91;)V

    .line 27
    .line 28
    .line 29
    monitor-exit p0

    .line 30
    return-void

    .line 31
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    throw p1
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
