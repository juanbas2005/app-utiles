.class public final Luy5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lot0;
.implements Lt5;
.implements Lpl;
.implements Ly36;
.implements Lg94;
.implements Lmm8;
.implements Lx77;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(FFLol;)V
    .locals 5

    const/16 v0, 0x8

    iput v0, p0, Luy5;->w:I

    .line 141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 142
    invoke-virtual {p3}, Lol;->b()I

    move-result v0

    new-array v1, v0, [Lqh2;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 143
    new-instance v3, Lqh2;

    invoke-virtual {p3, v2}, Lol;->a(I)F

    move-result v4

    invoke-direct {v3, p1, p2, v4}, Lqh2;-><init>(FFF)V

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 144
    :cond_0
    iput-object v1, p0, Luy5;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Luy5;->w:I

    packed-switch p1, :pswitch_data_0

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 117
    new-instance p1, Lmd4;

    invoke-direct {p1}, Lmd4;-><init>()V

    .line 118
    iput-object p1, p0, Luy5;->x:Ljava/lang/Object;

    return-void

    .line 119
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 120
    iput p1, p0, Luy5;->w:I

    iput-object p2, p0, Luy5;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    const/4 v0, 0x5

    .line 2
    iput v0, p0, Luy5;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const-string v0, "com.google.android.gms.appid"

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Luy5;->x:Ljava/lang/Object;

    .line 15
    .line 16
    const-string v1, "com.google.android.gms.appid-no-backup"

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance v2, Ljava/io/File;

    .line 23
    .line 24
    invoke-direct {v2, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    monitor-enter p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    :try_start_1
    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 49
    :try_start_2
    monitor-exit p0

    .line 50
    if-nez p1, :cond_1

    .line 51
    .line 52
    const-string p1, "FirebaseMessaging"

    .line 53
    .line 54
    const-string v1, "App restored, clearing state"

    .line 55
    .line 56
    invoke-static {p1, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    monitor-enter p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 60
    :try_start_3
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 69
    .line 70
    .line 71
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception p1

    .line 74
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 75
    :try_start_6
    throw p1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    .line 76
    :catchall_1
    move-exception p1

    .line 77
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 78
    :try_start_8
    throw p1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    .line 79
    :catch_0
    move-exception p0

    .line 80
    const-string p1, "FirebaseMessaging"

    .line 81
    .line 82
    const/4 v0, 0x3

    .line 83
    invoke-static {p1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_1

    .line 88
    .line 89
    const-string p1, "FirebaseMessaging"

    .line 90
    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    const-string v1, "Error creating file in no backup dir: "

    .line 94
    .line 95
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    :cond_1
    :goto_0
    return-void
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
.end method

.method public constructor <init>(Loe6;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Luy5;->w:I

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Luy5;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lt39;[B)V
    .locals 0

    const/16 p1, 0x10

    iput p1, p0, Luy5;->w:I

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Luy5;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([J)V
    .locals 6

    const/4 v0, 0x3

    iput v0, p0, Luy5;->w:I

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_4

    .line 122
    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    .line 123
    new-instance v1, Lcp4;

    array-length v2, p1

    invoke-direct {v1, v2}, Lcp4;-><init>(I)V

    .line 124
    iget v2, v1, Lcp4;->b:I

    if-ltz v2, :cond_3

    .line 125
    array-length v3, p1

    if-nez v3, :cond_0

    goto :goto_0

    .line 126
    :cond_0
    array-length v3, p1

    add-int/2addr v3, v2

    .line 127
    iget-object v4, v1, Lcp4;->a:[J

    .line 128
    array-length v5, v4

    if-ge v5, v3, :cond_1

    .line 129
    array-length v5, v4

    mul-int/2addr v5, v0

    div-int/lit8 v5, v5, 0x2

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 130
    invoke-static {v4, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    iput-object v0, v1, Lcp4;->a:[J

    .line 131
    :cond_1
    iget-object v0, v1, Lcp4;->a:[J

    .line 132
    iget v3, v1, Lcp4;->b:I

    if-eq v2, v3, :cond_2

    .line 133
    array-length v4, p1

    add-int/2addr v4, v2

    .line 134
    invoke-static {v0, v0, v4, v2, v3}, Lqs;->L0([J[JIII)V

    .line 135
    :cond_2
    array-length v3, p1

    const/4 v4, 0x0

    invoke-static {p1, v0, v2, v4, v3}, Lqs;->L0([J[JIII)V

    .line 136
    iget v0, v1, Lcp4;->b:I

    array-length p1, p1

    add-int/2addr v0, p1

    iput v0, v1, Lcp4;->b:I

    goto :goto_0

    .line 137
    :cond_3
    const-string p0, ""

    .line 138
    invoke-static {p0}, Lh;->l(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    .line 139
    :cond_4
    new-instance v1, Lcp4;

    invoke-direct {v1}, Lcp4;-><init>()V

    .line 140
    :goto_0
    iput-object v1, p0, Luy5;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)Z
    .locals 3

    .line 1
    iget-object p0, p0, Luy5;->x:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->r(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_4

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x1

    .line 17
    if-ne v0, v2, :cond_0

    .line 18
    .line 19
    move v1, v2

    .line 20
    :cond_0
    iget p0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->d:I

    .line 21
    .line 22
    if-nez p0, :cond_1

    .line 23
    .line 24
    if-nez v1, :cond_2

    .line 25
    .line 26
    :cond_1
    if-ne p0, v2, :cond_3

    .line 27
    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    neg-int p0, p0

    .line 35
    goto :goto_0

    .line 36
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    :goto_0
    sget-object v0, Le58;->a:Ljava/util/WeakHashMap;

    .line 41
    .line 42
    invoke-virtual {p1, p0}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    invoke-virtual {p1, p0}, Landroid/view/View;->setAlpha(F)V

    .line 47
    .line 48
    .line 49
    return v2

    .line 50
    :cond_4
    return v1
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

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Luy5;->w:I

    .line 2
    .line 3
    check-cast p2, Lxb7;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lf49;

    .line 9
    .line 10
    invoke-virtual {p1}, Ly50;->l()Landroid/os/IInterface;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ld49;

    .line 15
    .line 16
    new-instance v0, Lt39;

    .line 17
    .line 18
    iget-object p0, p0, Luy5;->x:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lb49;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lt39;-><init>(Lb49;Lxb7;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lgg8;->I()Landroid/os/Parcel;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0, v0}, Lds8;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 30
    .line 31
    .line 32
    const/16 p2, 0x1b

    .line 33
    .line 34
    invoke-virtual {p1, p0, p2}, Lgg8;->J(Landroid/os/Parcel;I)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_0
    check-cast p1, Lkg8;

    .line 39
    .line 40
    invoke-virtual {p1}, Ly50;->l()Landroid/os/IInterface;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lkh8;

    .line 45
    .line 46
    iget-object p0, p0, Luy5;->x:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Ljg8;

    .line 49
    .line 50
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v1, p1, Lgg8;->f:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget v1, Ltg8;->a:I

    .line 60
    .line 61
    const/4 v1, 0x1

    .line 62
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 63
    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    invoke-virtual {p0, v0, v2}, Ljg8;->writeToParcel(Landroid/os/Parcel;I)V

    .line 67
    .line 68
    .line 69
    :try_start_0
    iget-object p0, p1, Lgg8;->e:Landroid/os/IBinder;

    .line 70
    .line 71
    const/4 p1, 0x0

    .line 72
    invoke-interface {p0, v1, v0, p1, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, p1}, Lxb7;->b(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :catchall_0
    move-exception p0

    .line 83
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 84
    .line 85
    .line 86
    throw p0

    .line 87
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
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

.method public b()Lyk7;
    .locals 6

    .line 1
    invoke-static {}, Lyk7;->L()Lvk7;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Luy5;->x:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lcom/google/firebase/perf/metrics/Trace;

    .line 8
    .line 9
    iget-object v1, v1, Lcom/google/firebase/perf/metrics/Trace;->z:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lvk7;->m(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Luy5;->x:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lcom/google/firebase/perf/metrics/Trace;

    .line 17
    .line 18
    iget-object v1, v1, Lcom/google/firebase/perf/metrics/Trace;->G:Lui7;

    .line 19
    .line 20
    iget-wide v1, v1, Lui7;->w:J

    .line 21
    .line 22
    invoke-virtual {v0, v1, v2}, Lvk7;->k(J)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Luy5;->x:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lcom/google/firebase/perf/metrics/Trace;

    .line 28
    .line 29
    iget-object v2, v1, Lcom/google/firebase/perf/metrics/Trace;->G:Lui7;

    .line 30
    .line 31
    iget-object v1, v1, Lcom/google/firebase/perf/metrics/Trace;->H:Lui7;

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Lui7;->c(Lui7;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v1

    .line 37
    invoke-virtual {v0, v1, v2}, Lvk7;->l(J)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Luy5;->x:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Lcom/google/firebase/perf/metrics/Trace;

    .line 43
    .line 44
    iget-object v1, v1, Lcom/google/firebase/perf/metrics/Trace;->A:Ljava/util/concurrent/ConcurrentHashMap;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_0

    .line 59
    .line 60
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Lz81;

    .line 65
    .line 66
    iget-object v3, v2, Lz81;->w:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v2, v2, Lz81;->x:Ljava/util/concurrent/atomic/AtomicLong;

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 71
    .line 72
    .line 73
    move-result-wide v4

    .line 74
    invoke-virtual {v0, v4, v5, v3}, Lvk7;->j(JLjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    iget-object v1, p0, Luy5;->x:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v1, Lcom/google/firebase/perf/metrics/Trace;

    .line 81
    .line 82
    iget-object v1, v1, Lcom/google/firebase/perf/metrics/Trace;->D:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-nez v2, :cond_1

    .line 89
    .line 90
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_1

    .line 99
    .line 100
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, Lcom/google/firebase/perf/metrics/Trace;

    .line 105
    .line 106
    new-instance v3, Luy5;

    .line 107
    .line 108
    const/4 v4, 0x7

    .line 109
    invoke-direct {v3, v4, v2}, Luy5;-><init>(ILjava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3}, Luy5;->b()Lyk7;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {v0, v2}, Lvk7;->i(Lyk7;)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_1
    iget-object v1, p0, Luy5;->x:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v1, Lcom/google/firebase/perf/metrics/Trace;

    .line 123
    .line 124
    invoke-virtual {v1}, Lcom/google/firebase/perf/metrics/Trace;->getAttributes()Ljava/util/Map;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v0}, Lqu2;->h()V

    .line 129
    .line 130
    .line 131
    iget-object v2, v0, Lqu2;->x:Lcom/google/protobuf/b;

    .line 132
    .line 133
    check-cast v2, Lyk7;

    .line 134
    .line 135
    invoke-static {v2}, Lyk7;->w(Lyk7;)Lif4;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {v2, v1}, Lif4;->putAll(Ljava/util/Map;)V

    .line 140
    .line 141
    .line 142
    iget-object p0, p0, Luy5;->x:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast p0, Lcom/google/firebase/perf/metrics/Trace;

    .line 145
    .line 146
    iget-object v1, p0, Lcom/google/firebase/perf/metrics/Trace;->C:Ljava/util/List;

    .line 147
    .line 148
    monitor-enter v1

    .line 149
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 152
    .line 153
    .line 154
    iget-object p0, p0, Lcom/google/firebase/perf/metrics/Trace;->C:Ljava/util/List;

    .line 155
    .line 156
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    :cond_2
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    if-eqz v3, :cond_3

    .line 165
    .line 166
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    check-cast v3, Lsf5;

    .line 171
    .line 172
    if-eqz v3, :cond_2

    .line 173
    .line 174
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    goto :goto_2

    .line 178
    :catchall_0
    move-exception p0

    .line 179
    goto :goto_3

    .line 180
    :cond_3
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 185
    invoke-static {p0}, Lsf5;->b(Ljava/util/List;)[Lrf5;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    if-eqz p0, :cond_4

    .line 190
    .line 191
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    invoke-virtual {v0}, Lqu2;->h()V

    .line 196
    .line 197
    .line 198
    iget-object v1, v0, Lqu2;->x:Lcom/google/protobuf/b;

    .line 199
    .line 200
    check-cast v1, Lyk7;

    .line 201
    .line 202
    invoke-static {v1, p0}, Lyk7;->y(Lyk7;Ljava/util/List;)V

    .line 203
    .line 204
    .line 205
    :cond_4
    invoke-virtual {v0}, Lqu2;->g()Lcom/google/protobuf/b;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    check-cast p0, Lyk7;

    .line 210
    .line 211
    return-object p0

    .line 212
    :goto_3
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 213
    throw p0
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
.end method

.method public c()J
    .locals 2

    .line 1
    iget-object p0, p0, Luy5;->x:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lo86;

    .line 4
    .line 5
    iget-wide v0, p0, Lo86;->c:J

    .line 6
    .line 7
    return-wide v0
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

.method public d(J)J
    .locals 2

    .line 1
    iget-object p0, p0, Luy5;->x:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lmd4;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p1, p2}, Lx38;->b(J)F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    cmpl-float v0, v0, v1

    .line 14
    .line 15
    if-lez v0, :cond_0

    .line 16
    .line 17
    invoke-static {p1, p2}, Lx38;->c(J)F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    cmpl-float v0, v0, v1

    .line 22
    .line 23
    if-lez v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {p1, p2}, Lx38;->g(J)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "maximumVelocity should be a positive value. You specified="

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, Lyb3;->b(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object v0, p0, Lmd4;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lz38;

    .line 42
    .line 43
    invoke-static {p1, p2}, Lx38;->b(J)F

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-virtual {v0, v1}, Lz38;->c(F)F

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    iget-object p0, p0, Lmd4;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, Lz38;

    .line 54
    .line 55
    invoke-static {p1, p2}, Lx38;->c(J)F

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    invoke-virtual {p0, p1}, Lz38;->c(F)F

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    invoke-static {v0, p0}, Lu55;->b(FF)J

    .line 64
    .line 65
    .line 66
    move-result-wide p0

    .line 67
    return-wide p0
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

.method public e()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
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

.method public bridge synthetic f(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    iget-object p0, p0, Luy5;->x:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    .line 6
    .line 7
    iget p1, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;->Z:I

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;->a0:Landroid/content/Intent;

    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 15
    .line 16
    .line 17
    return-void
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

.method public g(Ljava/lang/Class;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    const/4 v2, 0x2

    .line 4
    if-ge v1, v2, :cond_1

    .line 5
    .line 6
    iget-object v2, p0, Luy5;->x:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, [Lmm8;

    .line 9
    .line 10
    aget-object v2, v2, v1

    .line 11
    .line 12
    invoke-interface {v2, p1}, Lmm8;->g(Ljava/lang/Class;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return v0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public get(I)Lih2;
    .locals 0

    .line 99
    iget-object p0, p0, Luy5;->x:Ljava/lang/Object;

    check-cast p0, [Lqh2;

    aget-object p0, p0, p1

    return-object p0
.end method

.method public get()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Luy5;->w:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Luy5;->x:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lx77;

    .line 9
    .line 10
    invoke-interface {p0}, Lx77;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Ljm4;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    sget-object v0, Lfw8;->c:Lfw8;

    .line 20
    .line 21
    new-instance v1, Lho7;

    .line 22
    .line 23
    invoke-direct {v1, v0}, Lho7;-><init>(Ljava/util/concurrent/Callable;)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Ljm4;->x:Ljava/util/concurrent/ScheduledExecutorService;

    .line 27
    .line 28
    const-wide/16 v2, 0x2710

    .line 29
    .line 30
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 31
    .line 32
    invoke-interface {p0, v1, v2, v3, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    new-instance v0, Lhm4;

    .line 37
    .line 38
    invoke-direct {v0, v1, p0}, Lhm4;-><init>(Lx1;Ljava/util/concurrent/ScheduledFuture;)V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_0
    sget-object v0, Lx49;->j:Ljava/lang/Object;

    .line 43
    .line 44
    new-instance v0, La69;

    .line 45
    .line 46
    iget-object p0, p0, Luy5;->x:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Landroid/content/Context;

    .line 49
    .line 50
    new-instance v1, Lb49;

    .line 51
    .line 52
    sget-object v2, Lym;->a:Lxm;

    .line 53
    .line 54
    sget-object v3, Ljw2;->c:Ljw2;

    .line 55
    .line 56
    sget-object v4, Lr39;->a:Lqc3;

    .line 57
    .line 58
    invoke-direct {v1, p0, v4, v2, v3}, Lkw2;-><init>(Landroid/content/Context;Lqc3;Lym;Ljw2;)V

    .line 59
    .line 60
    .line 61
    invoke-direct {v0, v1}, La69;-><init>(Lb49;)V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :pswitch_1
    iget-object p0, p0, Luy5;->x:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p0, Lkd6;

    .line 68
    .line 69
    iget-object p0, p0, Lkd6;->x:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p0, Landroid/content/Context;

    .line 72
    .line 73
    sget-object v0, Lx49;->j:Ljava/lang/Object;

    .line 74
    .line 75
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    const-string v0, "com.google.android.gms"

    .line 80
    .line 81
    const/4 v1, 0x0

    .line 82
    invoke-virtual {p0, v0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    new-instance v0, Lxn5;

    .line 87
    .line 88
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-direct {v0, p0}, Lxn5;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :catch_0
    sget-object v0, Ly;->w:Ly;

    .line 96
    .line 97
    :goto_0
    return-object v0

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public h(Ljava/lang/Class;)Lvm8;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/4 v1, 0x2

    .line 3
    if-ge v0, v1, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Luy5;->x:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [Lmm8;

    .line 8
    .line 9
    aget-object v1, v1, v0

    .line 10
    .line 11
    invoke-interface {v1, p1}, Lmm8;->g(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-interface {v1, p1}, Lmm8;->h(Ljava/lang/Class;)Lvm8;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string p1, "No factory is available for message type: "

    .line 30
    .line 31
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Lkj6;->n(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    return-object p0
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

.method public i()Lai8;
    .locals 2

    .line 1
    new-instance v0, Lai8;

    .line 2
    .line 3
    iget-object p0, p0, Luy5;->x:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    .line 6
    .line 7
    sget-object v1, Lpg8;->b:Ljava/util/Set;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    invoke-direct {v0, p0, v1}, Lai8;-><init>(Landroid/content/Context;Ljava/util/Set;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    throw p0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public j(Lorg/json/JSONObject;)Lbo6;
    .locals 3

    .line 1
    const-string v0, "settings_version"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x3

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "Could not determine SettingsJsonTransform for settings version "

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v0, ". Using default settings values."

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v1, 0x0

    .line 30
    const-string v2, "FirebaseCrashlytics"

    .line 31
    .line 32
    invoke-static {v2, v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 33
    .line 34
    .line 35
    new-instance v0, Lg22;

    .line 36
    .line 37
    const/16 v1, 0x1a

    .line 38
    .line 39
    invoke-direct {v0, v1}, Lg22;-><init>(I)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    new-instance v0, Ls63;

    .line 44
    .line 45
    const/16 v1, 0x9

    .line 46
    .line 47
    invoke-direct {v0, v1}, Ls63;-><init>(I)V

    .line 48
    .line 49
    .line 50
    :goto_0
    iget-object p0, p0, Luy5;->x:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, Ln63;

    .line 53
    .line 54
    invoke-interface {v0, p0, p1}, Loo6;->h(Ln63;Lorg/json/JSONObject;)Lbo6;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
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

.method public k()V
    .locals 5

    .line 1
    iget-object v0, p0, Luy5;->x:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo79;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcx8;->b1()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, Lin8;->w:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ly19;

    .line 11
    .line 12
    iget-object v1, v0, Ly19;->A:Lq09;

    .line 13
    .line 14
    invoke-static {v1}, Ly19;->e(Lin8;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, v0, Ly19;->G:Lxb4;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    invoke-virtual {v1, v2, v3}, Lq09;->l1(J)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    iget-object v1, v0, Ly19;->A:Lq09;

    .line 33
    .line 34
    invoke-static {v1}, Ly19;->e(Lin8;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, v1, Lq09;->H:Lh09;

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    invoke-virtual {v1, v2}, Lh09;->b(Z)V

    .line 41
    .line 42
    .line 43
    new-instance v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 44
    .line 45
    invoke-direct {v1}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-static {v1}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    .line 49
    .line 50
    .line 51
    iget v1, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 52
    .line 53
    const/16 v2, 0x64

    .line 54
    .line 55
    if-ne v1, v2, :cond_1

    .line 56
    .line 57
    iget-object v1, v0, Ly19;->B:Lpz8;

    .line 58
    .line 59
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 60
    .line 61
    .line 62
    iget-object v1, v1, Lpz8;->J:Lmz8;

    .line 63
    .line 64
    const-string v2, "Detected application was in foreground"

    .line 65
    .line 66
    invoke-virtual {v1, v2}, Lmz8;->a(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 70
    .line 71
    .line 72
    move-result-wide v1

    .line 73
    iget-object v0, v0, Ly19;->z:Ltp8;

    .line 74
    .line 75
    const/4 v3, 0x0

    .line 76
    sget-object v4, Lby8;->e1:Lay8;

    .line 77
    .line 78
    invoke-virtual {v0, v3, v4}, Ltp8;->n1(Ljava/lang/String;Lay8;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_0

    .line 83
    .line 84
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 85
    .line 86
    .line 87
    move-result-wide v3

    .line 88
    goto :goto_0

    .line 89
    :cond_0
    const-wide/16 v3, 0x0

    .line 90
    .line 91
    :goto_0
    invoke-virtual {p0, v1, v2, v3, v4}, Luy5;->m(JJ)V

    .line 92
    .line 93
    .line 94
    :cond_1
    return-void
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

.method public l(JJ)V
    .locals 4

    .line 1
    iget-object v0, p0, Luy5;->x:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo79;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcx8;->b1()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lo79;->g1()V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Lin8;->w:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ly19;

    .line 14
    .line 15
    iget-object v1, v0, Ly19;->A:Lq09;

    .line 16
    .line 17
    invoke-static {v1}, Ly19;->e(Lin8;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1, p2}, Lq09;->l1(J)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-static {v1}, Ly19;->e(Lin8;)V

    .line 27
    .line 28
    .line 29
    iget-object v2, v1, Lq09;->H:Lh09;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    invoke-virtual {v2, v3}, Lh09;->b(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ly19;->l()Lvy8;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Lvy8;->h1()V

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-static {v1}, Ly19;->e(Lin8;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, v1, Lq09;->L:Ll09;

    .line 46
    .line 47
    invoke-virtual {v0, p1, p2}, Ll09;->b(J)V

    .line 48
    .line 49
    .line 50
    iget-object v0, v1, Lq09;->H:Lh09;

    .line 51
    .line 52
    invoke-virtual {v0}, Lh09;->a()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    invoke-virtual {p0, p1, p2, p3, p4}, Luy5;->m(JJ)V

    .line 59
    .line 60
    .line 61
    :cond_1
    return-void
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
    .line 77
    .line 78
    .line 79
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
.end method

.method public m(JJ)V
    .locals 9

    .line 1
    iget-object v0, p0, Luy5;->x:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo79;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcx8;->b1()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, Lin8;->w:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ly19;

    .line 11
    .line 12
    invoke-virtual {v0}, Ly19;->a()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    goto/16 :goto_0

    .line 19
    .line 20
    :cond_0
    iget-object v8, v0, Ly19;->A:Lq09;

    .line 21
    .line 22
    invoke-static {v8}, Ly19;->e(Lin8;)V

    .line 23
    .line 24
    .line 25
    iget-object v3, v8, Lq09;->L:Ll09;

    .line 26
    .line 27
    invoke-virtual {v3, p1, p2}, Ll09;->b(J)V

    .line 28
    .line 29
    .line 30
    iget-object v3, v0, Ly19;->G:Lxb4;

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    iget-object v5, v0, Ly19;->B:Lpz8;

    .line 40
    .line 41
    invoke-static {v5}, Ly19;->g(Ly29;)V

    .line 42
    .line 43
    .line 44
    iget-object v5, v5, Lpz8;->J:Lmz8;

    .line 45
    .line 46
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const-string v4, "Session started, time"

    .line 51
    .line 52
    invoke-virtual {v5, v4, v3}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    const-wide/16 v3, 0x3e8

    .line 56
    .line 57
    div-long v6, p1, v3

    .line 58
    .line 59
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    iget-object v0, v0, Ly19;->I:Lv49;

    .line 64
    .line 65
    invoke-static {v0}, Ly19;->f(Lfy8;)V

    .line 66
    .line 67
    .line 68
    const-string v4, "auto"

    .line 69
    .line 70
    const-string v5, "_sid"

    .line 71
    .line 72
    move-wide v1, p1

    .line 73
    invoke-virtual/range {v0 .. v5}, Lv49;->n1(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v8}, Ly19;->e(Lin8;)V

    .line 77
    .line 78
    .line 79
    iget-object v1, v8, Lq09;->M:Ll09;

    .line 80
    .line 81
    invoke-virtual {v1, v6, v7}, Ll09;->b(J)V

    .line 82
    .line 83
    .line 84
    iget-object v1, v8, Lq09;->H:Lh09;

    .line 85
    .line 86
    const/4 v2, 0x0

    .line 87
    invoke-virtual {v1, v2}, Lh09;->b(Z)V

    .line 88
    .line 89
    .line 90
    new-instance v5, Landroid/os/Bundle;

    .line 91
    .line 92
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 93
    .line 94
    .line 95
    const-string v1, "_sid"

    .line 96
    .line 97
    invoke-virtual {v5, v1, v6, v7}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 98
    .line 99
    .line 100
    invoke-static {v0}, Ly19;->f(Lfy8;)V

    .line 101
    .line 102
    .line 103
    const-string v6, "auto"

    .line 104
    .line 105
    const-string v7, "_s"

    .line 106
    .line 107
    move-wide v1, p1

    .line 108
    move-wide v3, p3

    .line 109
    invoke-virtual/range {v0 .. v7}, Lv49;->k1(JJLandroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    iget-object v1, v8, Lq09;->R:Ll90;

    .line 113
    .line 114
    invoke-virtual {v1}, Ll90;->j()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-nez v2, :cond_1

    .line 123
    .line 124
    new-instance v5, Landroid/os/Bundle;

    .line 125
    .line 126
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 127
    .line 128
    .line 129
    const-string v2, "_ffr"

    .line 130
    .line 131
    invoke-virtual {v5, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v0}, Ly19;->f(Lfy8;)V

    .line 135
    .line 136
    .line 137
    const-string v6, "auto"

    .line 138
    .line 139
    const-string v7, "_ssr"

    .line 140
    .line 141
    move-wide v1, p1

    .line 142
    move-wide v3, p3

    .line 143
    invoke-virtual/range {v0 .. v7}, Lv49;->k1(JJLandroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    :cond_1
    :goto_0
    return-void
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
.end method
