.class public final Lge1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lx50;


# instance fields
.field public A:Ljava/lang/Object;

.field public final B:Ljava/lang/Object;

.field public w:Z

.field public x:Ljava/lang/Object;

.field public final y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(IFLob5;)V
    .locals 1

    .line 158
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 159
    iput-object p3, p0, Lge1;->y:Ljava/lang/Object;

    .line 160
    new-instance p3, Lbd5;

    invoke-direct {p3, p1}, Lbd5;-><init>(I)V

    .line 161
    iput-object p3, p0, Lge1;->z:Ljava/lang/Object;

    .line 162
    new-instance p3, Lad5;

    invoke-direct {p3, p2}, Lad5;-><init>(F)V

    .line 163
    iput-object p3, p0, Lge1;->A:Ljava/lang/Object;

    .line 164
    new-instance p2, Ll24;

    const/16 p3, 0x1e

    const/16 v0, 0x64

    invoke-direct {p2, p1, p3, v0}, Ll24;-><init>(III)V

    iput-object p2, p0, Lge1;->B:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Loe2;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lge1;->x:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Lxb7;

    .line 12
    .line 13
    invoke-direct {v0}, Lxb7;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lge1;->z:Ljava/lang/Object;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Lge1;->w:Z

    .line 20
    .line 21
    new-instance v1, Lxb7;

    .line 22
    .line 23
    invoke-direct {v1}, Lxb7;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lge1;->A:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-virtual {p1}, Loe2;->a()V

    .line 29
    .line 30
    .line 31
    iget-object v1, p1, Loe2;->a:Landroid/content/Context;

    .line 32
    .line 33
    iput-object p1, p0, Lge1;->y:Ljava/lang/Object;

    .line 34
    .line 35
    const-string p1, "com.google.firebase.crashlytics"

    .line 36
    .line 37
    invoke-virtual {v1, p1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string v2, "firebase_crashlytics_collection_enabled"

    .line 42
    .line 43
    invoke-interface {p1, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    const/4 v4, 0x1

    .line 48
    const/4 v5, 0x0

    .line 49
    if-eqz v3, :cond_0

    .line 50
    .line 51
    iput-boolean v0, p0, Lge1;->w:Z

    .line 52
    .line 53
    invoke-interface {p1, v2, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    move-object p1, v5

    .line 63
    :goto_0
    if-nez p1, :cond_3

    .line 64
    .line 65
    const-string p1, "firebase_crashlytics_collection_enabled"

    .line 66
    .line 67
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    if-eqz v2, :cond_1

    .line 72
    .line 73
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const/16 v3, 0x80

    .line 78
    .line 79
    invoke-virtual {v2, v1, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    if-eqz v1, :cond_1

    .line 84
    .line 85
    iget-object v2, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 86
    .line 87
    if-eqz v2, :cond_1

    .line 88
    .line 89
    invoke-virtual {v2, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_1

    .line 94
    .line 95
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 96
    .line 97
    invoke-virtual {v1, p1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 102
    .line 103
    .line 104
    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    goto :goto_1

    .line 106
    :catch_0
    move-exception p1

    .line 107
    const-string v1, "Could not read data collection permission from manifest"

    .line 108
    .line 109
    const-string v2, "FirebaseCrashlytics"

    .line 110
    .line 111
    invoke-static {v2, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 112
    .line 113
    .line 114
    :cond_1
    move-object p1, v5

    .line 115
    :goto_1
    if-nez p1, :cond_2

    .line 116
    .line 117
    iput-boolean v0, p0, Lge1;->w:Z

    .line 118
    .line 119
    move-object p1, v5

    .line 120
    goto :goto_2

    .line 121
    :cond_2
    iput-boolean v4, p0, Lge1;->w:Z

    .line 122
    .line 123
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 124
    .line 125
    invoke-virtual {v0, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    :cond_3
    :goto_2
    iput-object p1, p0, Lge1;->B:Ljava/lang/Object;

    .line 134
    .line 135
    iget-object p1, p0, Lge1;->x:Ljava/lang/Object;

    .line 136
    .line 137
    monitor-enter p1

    .line 138
    :try_start_1
    invoke-virtual {p0}, Lge1;->a()Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_4

    .line 143
    .line 144
    iget-object p0, p0, Lge1;->z:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p0, Lxb7;

    .line 147
    .line 148
    invoke-virtual {p0, v5}, Lxb7;->d(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :catchall_0
    move-exception p0

    .line 153
    goto :goto_4

    .line 154
    :cond_4
    :goto_3
    monitor-exit p1

    .line 155
    return-void

    .line 156
    :goto_4
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 157
    throw p0
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

.method public constructor <init>(Lpw2;Liw2;Lln;)V
    .locals 0

    .line 165
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lge1;->B:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Lge1;->z:Ljava/lang/Object;

    iput-object p1, p0, Lge1;->A:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lge1;->w:Z

    iput-object p2, p0, Lge1;->y:Ljava/lang/Object;

    iput-object p3, p0, Lge1;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public declared-synchronized a()Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lge1;->B:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/lang/Boolean;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    :try_start_1
    iget-object v0, p0, Lge1;->y:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Loe2;

    .line 18
    .line 19
    invoke-virtual {v0}, Loe2;->h()Z

    .line 20
    .line 21
    .line 22
    move-result v0
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catch_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    :try_start_2
    invoke-virtual {p0, v0}, Lge1;->b(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 26
    .line 27
    .line 28
    monitor-exit p0

    .line 29
    return v0

    .line 30
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 31
    throw v0
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
.end method

.method public b(Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string p1, "ENABLED"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string p1, "DISABLED"

    .line 7
    .line 8
    :goto_0
    iget-object v0, p0, Lge1;->B:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/lang/Boolean;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    const-string p0, "global Firebase setting"

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    iget-boolean p0, p0, Lge1;->w:Z

    .line 18
    .line 19
    if-eqz p0, :cond_2

    .line 20
    .line 21
    const-string p0, "firebase_crashlytics_collection_enabled manifest flag"

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_2
    const-string p0, "API"

    .line 25
    .line 26
    :goto_1
    const-string v0, " by "

    .line 27
    .line 28
    const-string v1, "."

    .line 29
    .line 30
    const-string v2, "Crashlytics automatic data collection "

    .line 31
    .line 32
    invoke-static {v2, p1, v0, p0, v1}, Lpb4;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const/4 p1, 0x3

    .line 37
    const-string v0, "FirebaseCrashlytics"

    .line 38
    .line 39
    invoke-static {v0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    invoke-static {v0, p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 47
    .line 48
    .line 49
    :cond_3
    return-void
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

.method public c(Lm11;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lge1;->B:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lpw2;

    .line 4
    .line 5
    iget-object v0, v0, Lpw2;->F:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    iget-object p0, p0, Lge1;->x:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lln;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lng8;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lng8;->n(Lm11;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public f(Lm11;)V
    .locals 3

    .line 1
    new-instance v0, Lnt2;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, p0, v2, p1, v1}, Lnt2;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lge1;->B:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lpw2;

    .line 12
    .line 13
    iget-object p0, p0, Lpw2;->I:Lph8;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    return-void
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
