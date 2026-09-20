.class public final Lk8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lnu2;


# instance fields
.field public A:Lv70;

.field public volatile w:Lpd1;

.field public final x:Ljava/lang/Object;

.field public final y:Lrv0;

.field public final z:Lj9;


# direct methods
.method public constructor <init>(Lrv0;)V
    .locals 1

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
    iput-object v0, p0, Lk8;->x:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p1, p0, Lk8;->y:Lrv0;

    .line 12
    .line 13
    new-instance v0, Lj9;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Lj9;-><init>(Lrv0;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lk8;->z:Lj9;

    .line 19
    .line 20
    return-void
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
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lk8;->w:Lpd1;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lk8;->x:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lk8;->w:Lpd1;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lk8;->b()Lpd1;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, Lk8;->w:Lpd1;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    monitor-exit v0

    .line 22
    goto :goto_2

    .line 23
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p0

    .line 25
    :cond_1
    :goto_2
    iget-object p0, p0, Lk8;->w:Lpd1;

    .line 26
    .line 27
    return-object p0
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

.method public final b()Lpd1;
    .locals 3

    .line 1
    iget-object v0, p0, Lk8;->y:Lrv0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    instance-of v1, v1, Lnu2;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-class v2, Landroid/app/Application;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    const-string v0, "Did you forget to specify your Application\'s class name in your manifest\'s <application />\'s android:name attribute?"

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v2, "Found: "

    .line 35
    .line 36
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :goto_0
    const-string v1, "Hilt Activity must be attached to an @HiltAndroidApp Application. "

    .line 55
    .line 56
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p0

    .line 64
    :cond_1
    iget-object p0, p0, Lk8;->z:Lj9;

    .line 65
    .line 66
    const-class v0, Lj8;

    .line 67
    .line 68
    invoke-static {p0, v0}, Lag8;->q(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    check-cast p0, Lj8;

    .line 73
    .line 74
    check-cast p0, Lrd1;

    .line 75
    .line 76
    iget-object v0, p0, Lrd1;->a:Lvd1;

    .line 77
    .line 78
    iget-object p0, p0, Lrd1;->b:Lrd1;

    .line 79
    .line 80
    new-instance v1, Lpd1;

    .line 81
    .line 82
    invoke-direct {v1, v0, p0}, Lpd1;-><init>(Lvd1;Lrd1;)V

    .line 83
    .line 84
    .line 85
    return-object v1
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

.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, Lk8;->z:Lj9;

    .line 2
    .line 3
    iget-object v1, v0, Lj9;->w:Lrv0;

    .line 4
    .line 5
    iget-object v0, v0, Lj9;->x:Lrv0;

    .line 6
    .line 7
    new-instance v2, Lf9;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v2, v3, v0}, Lf9;-><init>(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Lrv0;->g()Lz58;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v1}, Lo85;->k(La68;)Lib1;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v3, Lno7;

    .line 25
    .line 26
    invoke-direct {v3, v0, v2, v1}, Lno7;-><init>(Lz58;Lw58;Lib1;)V

    .line 27
    .line 28
    .line 29
    const-class v0, Lh9;

    .line 30
    .line 31
    sget-object v1, Lb26;->a:Lc26;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0}, Lgq3;->l()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    const-string v2, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v3, v0, v1}, Lno7;->b(Lgq3;Ljava/lang/String;)Lr58;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lh9;

    .line 54
    .line 55
    iget-object v0, v0, Lh9;->c:Lv70;

    .line 56
    .line 57
    iput-object v0, p0, Lk8;->A:Lv70;

    .line 58
    .line 59
    iget-object v1, v0, Lv70;->y:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, Lto4;

    .line 62
    .line 63
    if-nez v1, :cond_1

    .line 64
    .line 65
    iget-object p0, p0, Lk8;->y:Lrv0;

    .line 66
    .line 67
    invoke-virtual {p0}, Lrv0;->d()Lto4;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    iget-boolean v1, v0, Lv70;->x:Z

    .line 72
    .line 73
    if-eqz v1, :cond_0

    .line 74
    .line 75
    iput-object p0, v0, Lv70;->y:Ljava/lang/Object;

    .line 76
    .line 77
    return-void

    .line 78
    :cond_0
    const-string p0, "setExtras should only be called for an Activity that extends ComponentActivity"

    .line 79
    .line 80
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_1
    return-void

    .line 84
    :cond_2
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 85
    .line 86
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-void
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
