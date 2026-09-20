.class public final Lxz8;
.super Lg89;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lv89;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxz8;->z:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lg89;-><init>(Lv89;)V

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

.method private final h1()V
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

.method private final i1()V
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


# virtual methods
.method public final f1()V
    .locals 0

    .line 1
    iget p0, p0, Lxz8;->z:I

    .line 2
    .line 3
    return-void
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

.method public g1()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lg89;->d1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lin8;->w:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Ly19;

    .line 7
    .line 8
    iget-object p0, p0, Ly19;->w:Landroid/content/Context;

    .line 9
    .line 10
    const-string v0, "connectivity"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Landroid/net/ConnectivityManager;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    :try_start_0
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 22
    .line 23
    .line 24
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    :catch_0
    :cond_0
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return p0
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

.method public j1(Ljava/lang/String;Li89;Lw19;Ltz8;)V
    .locals 10

    .line 1
    iget-object v0, p2, Li89;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lin8;->w:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ly19;

    .line 6
    .line 7
    invoke-virtual {p0}, Lin8;->b1()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lg89;->d1()V

    .line 11
    .line 12
    .line 13
    :try_start_0
    new-instance v2, Ljava/net/URI;

    .line 14
    .line 15
    invoke-direct {v2, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/net/URI;->toURL()Ljava/net/URL;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    iget-object v2, p0, Lz79;->x:Lv89;

    .line 23
    .line 24
    invoke-virtual {v2}, Lv89;->h0()Ly89;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p3}, Lpk8;->a()[B

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    iget-object p3, v1, Ly19;->C:Lr19;

    .line 32
    .line 33
    invoke-static {p3}, Ly19;->g(Ly29;)V

    .line 34
    .line 35
    .line 36
    new-instance v3, Lvz8;

    .line 37
    .line 38
    iget-object p2, p2, Li89;->b:Ljava/util/Map;

    .line 39
    .line 40
    if-nez p2, :cond_0

    .line 41
    .line 42
    sget-object p2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    :cond_0
    move-object v4, p0

    .line 45
    move-object v5, p1

    .line 46
    move-object v8, p2

    .line 47
    move-object v9, p4

    .line 48
    :try_start_1
    invoke-direct/range {v3 .. v9}, Lvz8;-><init>(Lxz8;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Ltz8;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p3, v3}, Lr19;->o1(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_1

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :catch_0
    move-object v5, p1

    .line 56
    :catch_1
    iget-object p0, v1, Ly19;->B:Lpz8;

    .line 57
    .line 58
    invoke-static {p0}, Ly19;->g(Ly29;)V

    .line 59
    .line 60
    .line 61
    iget-object p0, p0, Lpz8;->B:Lmz8;

    .line 62
    .line 63
    invoke-static {v5}, Lpz8;->k1(Ljava/lang/String;)Lnz8;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const-string p2, "Failed to parse URL. Not uploading MeasurementBatch. appId"

    .line 68
    .line 69
    invoke-virtual {p0, p1, v0, p2}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method
