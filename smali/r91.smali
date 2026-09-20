.class public final Lr91;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Lcw0;


# direct methods
.method public constructor <init>(Lcw0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr91;->a:Lcw0;

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
.method public final a(Ll10;)V
    .locals 10

    .line 1
    iget-object p0, p0, Lr91;->a:Lcw0;

    .line 2
    .line 3
    iget-object p1, p1, Ll10;->a:Ljava/util/HashSet;

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    const/16 v1, 0xa

    .line 8
    .line 9
    invoke-static {p1, v1}, Let0;->e0(Ljava/lang/Iterable;I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lt86;

    .line 31
    .line 32
    move-object v2, v1

    .line 33
    check-cast v2, Lj10;

    .line 34
    .line 35
    iget-object v4, v2, Lj10;->b:Ljava/lang/String;

    .line 36
    .line 37
    check-cast v1, Lj10;

    .line 38
    .line 39
    iget-object v5, v1, Lj10;->d:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v2, v1, Lj10;->e:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v7, v1, Lj10;->c:Ljava/lang/String;

    .line 44
    .line 45
    iget-wide v8, v1, Lj10;->f:J

    .line 46
    .line 47
    sget-object v1, Lu86;->a:Lji8;

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    const/16 v3, 0x100

    .line 54
    .line 55
    if-le v1, v3, :cond_0

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    invoke-virtual {v2, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    :cond_0
    move-object v6, v2

    .line 63
    new-instance v3, Lk10;

    .line 64
    .line 65
    invoke-direct/range {v3 .. v9}, Lk10;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    iget-object p1, p0, Lcw0;->B:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p1, Lv86;

    .line 75
    .line 76
    monitor-enter p1

    .line 77
    :try_start_0
    iget-object v1, p0, Lcw0;->B:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v1, Lv86;

    .line 80
    .line 81
    invoke-virtual {v1, v0}, Lv86;->b(Ljava/util/List;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_2

    .line 86
    .line 87
    monitor-exit p1

    .line 88
    goto :goto_1

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    move-object p0, v0

    .line 91
    goto :goto_2

    .line 92
    :cond_2
    iget-object v0, p0, Lcw0;->B:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, Lv86;

    .line 95
    .line 96
    invoke-virtual {v0}, Lv86;->a()Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iget-object v1, p0, Lcw0;->x:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v1, Lwr0;

    .line 103
    .line 104
    iget-object v1, v1, Lwr0;->y:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v1, Lya1;

    .line 107
    .line 108
    new-instance v2, Le66;

    .line 109
    .line 110
    const/4 v3, 0x4

    .line 111
    invoke-direct {v2, v3, p0, v0}, Le66;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v2}, Lya1;->a(Ljava/lang/Runnable;)Lyb9;

    .line 115
    .line 116
    .line 117
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    :goto_1
    const-string p0, "Updated Crashlytics Rollout State"

    .line 119
    .line 120
    const/4 p1, 0x3

    .line 121
    const-string v0, "FirebaseCrashlytics"

    .line 122
    .line 123
    invoke-static {v0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-eqz p1, :cond_3

    .line 128
    .line 129
    const-string p1, "FirebaseCrashlytics"

    .line 130
    .line 131
    const/4 v0, 0x0

    .line 132
    invoke-static {p1, p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 133
    .line 134
    .line 135
    :cond_3
    return-void

    .line 136
    :goto_2
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 137
    throw p0
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
