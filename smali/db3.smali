.class public final Ldb3;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final synthetic c:I


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 10
    iput p1, p0, Ldb3;->a:I

    iput-object p2, p0, Ldb3;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method

.method public constructor <init>(Lw34;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ldb3;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldb3;->b:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
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
.method public onAvailable(Landroid/net/Network;)V
    .locals 3

    .line 1
    iget v0, p0, Ldb3;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Ldb3;->b:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Landroid/net/ConnectivityManager$NetworkCallback;->onAvailable(Landroid/net/Network;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    check-cast v2, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 17
    .line 18
    iput-boolean v1, v2, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->O:Z

    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast v2, Lrz6;

    .line 25
    .line 26
    iget-object p0, v2, Lrz6;->f:Ljava/util/Set;

    .line 27
    .line 28
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    invoke-virtual {v2}, Lrz6;->a()V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void

    .line 38
    :pswitch_2
    check-cast v2, Lcf4;

    .line 39
    .line 40
    invoke-static {v2, p1, v1}, Lcf4;->a(Lcf4;Landroid/net/Network;Z)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public onBlockedStatusChanged(Landroid/net/Network;Z)V
    .locals 7

    .line 1
    iget v0, p0, Ldb3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroid/net/ConnectivityManager$NetworkCallback;->onBlockedStatusChanged(Landroid/net/Network;Z)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Ldb3;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lxy4;

    .line 16
    .line 17
    iget-object v0, v0, Lxy4;->f:Landroid/net/ConnectivityManager;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    sget-object v0, Lwy4;->a:Ljava/lang/String;

    .line 34
    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v2, "Network blocked status changed: "

    .line 38
    .line 39
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {p1, v0, v1}, Lbc4;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Ldb3;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Lxy4;

    .line 55
    .line 56
    iget-object v0, p1, Lx21;->e:Ljava/lang/Object;

    .line 57
    .line 58
    if-nez v0, :cond_0

    .line 59
    .line 60
    invoke-virtual {p1}, Lxy4;->a()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    :cond_0
    check-cast v0, Lvy4;

    .line 65
    .line 66
    iget-object p1, p0, Ldb3;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p1, Lxy4;

    .line 69
    .line 70
    iget-object v1, p1, Lxy4;->g:Ljava/lang/Object;

    .line 71
    .line 72
    monitor-enter v1

    .line 73
    :try_start_0
    iget-boolean v2, p1, Lxy4;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    if-ne v2, p2, :cond_1

    .line 76
    .line 77
    monitor-exit v1

    .line 78
    goto :goto_0

    .line 79
    :cond_1
    :try_start_1
    iput-boolean p2, p1, Lxy4;->h:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    .line 81
    monitor-exit v1

    .line 82
    iget-object p0, p0, Ldb3;->b:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p0, Lxy4;

    .line 85
    .line 86
    iget-boolean v2, v0, Lvy4;->a:Z

    .line 87
    .line 88
    iget-boolean v3, v0, Lvy4;->b:Z

    .line 89
    .line 90
    iget-boolean v4, v0, Lvy4;->c:Z

    .line 91
    .line 92
    iget-boolean v5, v0, Lvy4;->d:Z

    .line 93
    .line 94
    new-instance v1, Lvy4;

    .line 95
    .line 96
    move v6, p2

    .line 97
    invoke-direct/range {v1 .. v6}, Lvy4;-><init>(ZZZZZ)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, v1}, Lx21;->b(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    move-object p0, v0

    .line 106
    monitor-exit v1

    .line 107
    throw p0

    .line 108
    :cond_2
    :goto_0
    return-void

    .line 109
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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

.method public onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 3

    .line 1
    iget v0, p0, Ldb3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0, p1, p2}, Landroid/net/ConnectivityManager$NetworkCallback;->onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_1
    iget-object p0, p0, Ldb3;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lrz6;

    .line 13
    .line 14
    iget-object v0, p0, Lrz6;->f:Ljava/util/Set;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-virtual {p2, v1}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-virtual {p2, v1}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-eqz p2, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, Lrz6;->a()V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    :goto_0
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    invoke-virtual {p0}, Lrz6;->a()V

    .line 54
    .line 55
    .line 56
    :cond_2
    :goto_1
    return-void

    .line 57
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    sget-object v0, Lwy4;->a:Ljava/lang/String;

    .line 68
    .line 69
    new-instance v1, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v2, "Network capabilities changed: "

    .line 72
    .line 73
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-virtual {p1, v0, p2}, Lbc4;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iget-object p0, p0, Ldb3;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p0, Lxy4;

    .line 89
    .line 90
    iget-object p1, p0, Lxy4;->f:Landroid/net/ConnectivityManager;

    .line 91
    .line 92
    iget-boolean p2, p0, Lxy4;->h:Z

    .line 93
    .line 94
    invoke-static {p1, p2}, Lwy4;->a(Landroid/net/ConnectivityManager;Z)Lvy4;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p0, p1}, Lx21;->b(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    sget-object p2, Lbd8;->a:Ljava/lang/String;

    .line 113
    .line 114
    const-string v0, "NetworkRequestConstraintController onCapabilitiesChanged callback"

    .line 115
    .line 116
    invoke-virtual {p1, p2, v0}, Lbc4;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    iget-object p0, p0, Ldb3;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p0, Lw34;

    .line 122
    .line 123
    sget-object p1, Lp31;->a:Lp31;

    .line 124
    .line 125
    invoke-virtual {p0, p1}, Lw34;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
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

.method public final onLost(Landroid/net/Network;)V
    .locals 6

    .line 1
    iget v0, p0, Ldb3;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Ldb3;->b:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 13
    .line 14
    iget-boolean p1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->O:Z

    .line 15
    .line 16
    if-eqz p1, :cond_3

    .line 17
    .line 18
    iget-object p1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->M:Landroid/net/ConnectivityManager;

    .line 19
    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {p1, v0}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-nez p1, :cond_2

    .line 35
    .line 36
    :goto_0
    move p1, v1

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    invoke-virtual {p1, v1}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    :goto_1
    if-nez p1, :cond_3

    .line 43
    .line 44
    iput-boolean v1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->O:Z

    .line 45
    .line 46
    const p1, 0x7f11042c

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    new-instance v0, Lha7;

    .line 57
    .line 58
    const/16 v1, 0x16

    .line 59
    .line 60
    invoke-direct {v0, v1}, Lha7;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, p1, v0}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->i(Ljava/lang/String;Lvr2;)V

    .line 64
    .line 65
    .line 66
    :cond_3
    return-void

    .line 67
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    check-cast p0, Lrz6;

    .line 71
    .line 72
    iget-object v0, p0, Lrz6;->f:Ljava/util/Set;

    .line 73
    .line 74
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_4

    .line 79
    .line 80
    invoke-virtual {p0}, Lrz6;->a()V

    .line 81
    .line 82
    .line 83
    :cond_4
    return-void

    .line 84
    :pswitch_1
    check-cast p0, Lcf4;

    .line 85
    .line 86
    invoke-static {p0, p1, v1}, Lcf4;->a(Lcf4;Landroid/net/Network;Z)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    sget-object v0, Lwy4;->a:Ljava/lang/String;

    .line 98
    .line 99
    const-string v1, "Network connection lost"

    .line 100
    .line 101
    invoke-virtual {p1, v0, v1}, Lbc4;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    check-cast p0, Lxy4;

    .line 105
    .line 106
    new-instance v0, Lvy4;

    .line 107
    .line 108
    const/4 v4, 0x0

    .line 109
    const/4 v5, 0x0

    .line 110
    const/4 v1, 0x0

    .line 111
    const/4 v2, 0x0

    .line 112
    const/4 v3, 0x0

    .line 113
    invoke-direct/range {v0 .. v5}, Lvy4;-><init>(ZZZZZ)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v0}, Lx21;->b(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    sget-object v0, Lbd8;->a:Ljava/lang/String;

    .line 128
    .line 129
    const-string v1, "NetworkRequestConstraintController onLost callback"

    .line 130
    .line 131
    invoke-virtual {p1, v0, v1}, Lbc4;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    check-cast p0, Lw34;

    .line 135
    .line 136
    new-instance p1, Lq31;

    .line 137
    .line 138
    const/4 v0, 0x7

    .line 139
    invoke-direct {p1, v0}, Lq31;-><init>(I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0, p1}, Lw34;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
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
