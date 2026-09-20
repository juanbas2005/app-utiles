.class public abstract Lpl3;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final d:Lol3;


# instance fields
.field public final a:Lwl3;

.field public final b:Lz53;

.field public final c:Lf96;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Lol3;

    .line 2
    .line 3
    new-instance v1, Lwl3;

    .line 4
    .line 5
    sget-object v11, Lfq0;->y:Lfq0;

    .line 6
    .line 7
    const/4 v12, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x1

    .line 13
    const-string v7, "    "

    .line 14
    .line 15
    const-string v8, "type"

    .line 16
    .line 17
    const/4 v9, 0x0

    .line 18
    const/4 v10, 0x1

    .line 19
    invoke-direct/range {v1 .. v12}, Lwl3;-><init>(ZZZZZLjava/lang/String;Ljava/lang/String;ZZLfq0;Z)V

    .line 20
    .line 21
    .line 22
    sget-object v2, Lwl6;->a:Lz53;

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Lpl3;-><init>(Lwl3;Lz53;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lpl3;->d:Lol3;

    .line 28
    .line 29
    return-void
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

.method public constructor <init>(Lwl3;Lz53;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpl3;->a:Lwl3;

    .line 5
    .line 6
    iput-object p2, p0, Lpl3;->b:Lz53;

    .line 7
    .line 8
    new-instance p1, Lf96;

    .line 9
    .line 10
    const/16 p2, 0x12

    .line 11
    .line 12
    invoke-direct {p1, p2}, Lf96;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lpl3;->c:Lf96;

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


# virtual methods
.method public final a(Lzr3;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of v0, p2, Lkotlinx/serialization/json/JsonObject;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Len3;

    .line 13
    .line 14
    check-cast p2, Lkotlinx/serialization/json/JsonObject;

    .line 15
    .line 16
    const/16 v2, 0xc

    .line 17
    .line 18
    invoke-direct {v0, p0, p2, v1, v2}, Len3;-><init>(Lpl3;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    instance-of v0, p2, Lkotlinx/serialization/json/JsonArray;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    new-instance v0, Lfn3;

    .line 27
    .line 28
    check-cast p2, Lkotlinx/serialization/json/JsonArray;

    .line 29
    .line 30
    invoke-direct {v0, p0, p2}, Lfn3;-><init>(Lpl3;Lkotlinx/serialization/json/JsonArray;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    instance-of v0, p2, Lnm3;

    .line 35
    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    sget-object v0, Lkotlinx/serialization/json/JsonNull;->INSTANCE:Lkotlinx/serialization/json/JsonNull;

    .line 39
    .line 40
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-static {}, Lh;->c()V

    .line 48
    .line 49
    .line 50
    return-object v1

    .line 51
    :cond_3
    :goto_0
    new-instance v0, Lzm3;

    .line 52
    .line 53
    check-cast p2, Lkotlinx/serialization/json/JsonPrimitive;

    .line 54
    .line 55
    invoke-direct {v0, p0, p2, v1}, Lzm3;-><init>(Lpl3;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :goto_1
    invoke-virtual {v0, p1}, La2;->g(Lzr3;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
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

.method public final b(Lzr3;Ljava/lang/String;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p2}, Lj45;->c(Lpl3;Ljava/lang/String;)Lp47;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    new-instance v0, Ll47;

    .line 12
    .line 13
    invoke-interface {p1}, Lzr3;->getDescriptor()Lll6;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    const/4 v5, 0x0

    .line 18
    sget-object v2, Lef8;->y:Lef8;

    .line 19
    .line 20
    move-object v1, p0

    .line 21
    invoke-direct/range {v0 .. v5}, Ll47;-><init>(Lpl3;Lef8;Lz1;Lll6;Lpy2;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ll47;->g(Lzr3;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {v3}, Lz1;->s()V

    .line 29
    .line 30
    .line 31
    return-object p0
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

.method public final c(Lzr3;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lh06;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lan3;

    .line 10
    .line 11
    new-instance v2, Lmr0;

    .line 12
    .line 13
    const/4 v3, 0x3

    .line 14
    invoke-direct {v2, v3, v0}, Lmr0;-><init>(ILh06;)V

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-direct {v1, p0, v2, v3}, Lan3;-><init>(Lpl3;Lvr2;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1, p2}, Lan3;->g(Lzr3;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object p0, v0, Lh06;->w:Ljava/lang/Object;

    .line 25
    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    check-cast p0, Lkotlinx/serialization/json/JsonElement;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_0
    const-string p0, "result"

    .line 32
    .line 33
    invoke-static {p0}, Lsg3;->a0(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    throw p0
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

.method public final d(Lzr3;Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lqa;

    .line 5
    .line 6
    const/4 v1, 0x5

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v0, v1, v2}, Lqa;-><init>(IB)V

    .line 9
    .line 10
    .line 11
    sget-object v1, Lxn0;->c:Lxn0;

    .line 12
    .line 13
    monitor-enter v1

    .line 14
    :try_start_0
    iget-object v2, v1, Lxn0;->a:Las;

    .line 15
    .line 16
    invoke-virtual {v2}, Las;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    move-object v2, v4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v2}, Las;->removeLast()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    :goto_0
    check-cast v2, [C

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    iget v3, v1, Lxn0;->b:I

    .line 34
    .line 35
    array-length v4, v2

    .line 36
    sub-int/2addr v3, v4

    .line 37
    iput v3, v1, Lxn0;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    move-object v4, v2

    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    :goto_1
    monitor-exit v1

    .line 44
    if-nez v4, :cond_2

    .line 45
    .line 46
    const/16 v1, 0x80

    .line 47
    .line 48
    new-array v4, v1, [C

    .line 49
    .line 50
    :cond_2
    iput-object v4, v0, Lqa;->y:Ljava/lang/Object;

    .line 51
    .line 52
    :try_start_1
    new-instance v1, Lm47;

    .line 53
    .line 54
    sget-object v2, Lef8;->y:Lef8;

    .line 55
    .line 56
    sget-object v3, Lef8;->D:Lw52;

    .line 57
    .line 58
    invoke-virtual {v3}, Lw52;->f()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    new-array v3, v3, [Lim3;

    .line 63
    .line 64
    new-instance v4, Lv70;

    .line 65
    .line 66
    const/4 v5, 0x3

    .line 67
    invoke-direct {v4, v5, v0}, Lv70;-><init>(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v1, v4, p0, v2, v3}, Lm47;-><init>(Lv70;Lpl3;Lef8;[Lim3;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, p1, p2}, Lm47;->g(Lzr3;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Lqa;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 80
    invoke-virtual {v0}, Lqa;->j()V

    .line 81
    .line 82
    .line 83
    return-object p0

    .line 84
    :catchall_1
    move-exception p0

    .line 85
    invoke-virtual {v0}, Lqa;->j()V

    .line 86
    .line 87
    .line 88
    throw p0

    .line 89
    :goto_2
    monitor-exit v1

    .line 90
    throw p0
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
