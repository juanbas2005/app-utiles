.class public final Le61;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lzr3;


# instance fields
.field public final synthetic a:I

.field public final b:Lzr3;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Lll6;


# direct methods
.method public constructor <init>(Lgq3;Lzr3;[Lzr3;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Le61;->a:I

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Le61;->c:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p2, p0, Le61;->b:Lzr3;

    .line 13
    .line 14
    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iput-object p2, p0, Le61;->d:Ljava/lang/Object;

    .line 22
    .line 23
    new-array p2, v0, [Lll6;

    .line 24
    .line 25
    new-instance p3, Lgg0;

    .line 26
    .line 27
    const/16 v0, 0xf

    .line 28
    .line 29
    invoke-direct {p3, v0, p0}, Lgg0;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    const-string v0, "kotlinx.serialization.ContextualSerializer"

    .line 33
    .line 34
    sget-object v1, Lpl6;->l:Lpl6;

    .line 35
    .line 36
    invoke-static {v0, v1, p2, p3}, Lb85;->f(Ljava/lang/String;Ln85;[Lll6;Lvr2;)Lnl6;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    new-instance p3, Lw51;

    .line 41
    .line 42
    invoke-direct {p3, p2, p1}, Lw51;-><init>(Lnl6;Lgq3;)V

    .line 43
    .line 44
    .line 45
    iput-object p3, p0, Le61;->e:Lll6;

    .line 46
    .line 47
    return-void
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
.end method

.method public constructor <init>(Lzr3;Lzr3;Lzr3;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Le61;->a:I

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Le61;->b:Lzr3;

    .line 50
    iput-object p2, p0, Le61;->c:Ljava/lang/Object;

    .line 51
    iput-object p3, p0, Le61;->d:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 52
    new-array p1, p1, [Lll6;

    new-instance p2, Lay5;

    const/16 p3, 0x19

    invoke-direct {p2, p3, p0}, Lay5;-><init>(ILjava/lang/Object;)V

    const-string p3, "kotlin.Triple"

    invoke-static {p3, p1, p2}, Lb85;->e(Ljava/lang/String;[Lll6;Lvr2;)Lnl6;

    move-result-object p1

    iput-object p1, p0, Le61;->e:Lll6;

    return-void
.end method


# virtual methods
.method public final deserialize(Lok1;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Le61;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Le61;->b:Lzr3;

    .line 4
    .line 5
    iget-object v2, p0, Le61;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Le61;->d:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Le61;->e:Lll6;

    .line 14
    .line 15
    check-cast p0, Lnl6;

    .line 16
    .line 17
    invoke-interface {p1, p0}, Lok1;->c(Lll6;)Lgy0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget-object v0, Lsu0;->k:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v5, v0

    .line 24
    move-object v6, v5

    .line 25
    move-object v7, v6

    .line 26
    :goto_0
    invoke-interface {p1, p0}, Lgy0;->h(Lll6;)I

    .line 27
    .line 28
    .line 29
    move-result v8

    .line 30
    const/4 v9, -0x1

    .line 31
    if-eq v8, v9, :cond_3

    .line 32
    .line 33
    if-eqz v8, :cond_2

    .line 34
    .line 35
    const/4 v9, 0x1

    .line 36
    if-eq v8, v9, :cond_1

    .line 37
    .line 38
    const/4 v7, 0x2

    .line 39
    if-ne v8, v7, :cond_0

    .line 40
    .line 41
    move-object v8, v3

    .line 42
    check-cast v8, Lzr3;

    .line 43
    .line 44
    check-cast v8, Lzr3;

    .line 45
    .line 46
    invoke-interface {p1, p0, v7, v8, v4}, Lgy0;->r(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    new-instance p0, Lkotlinx/serialization/SerializationException;

    .line 52
    .line 53
    const-string p1, "Unexpected index "

    .line 54
    .line 55
    invoke-static {v8, p1}, Lhl6;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p0

    .line 63
    :cond_1
    move-object v6, v2

    .line 64
    check-cast v6, Lzr3;

    .line 65
    .line 66
    check-cast v6, Lzr3;

    .line 67
    .line 68
    invoke-interface {p1, p0, v9, v6, v4}, Lgy0;->r(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    goto :goto_0

    .line 73
    :cond_2
    const/4 v5, 0x0

    .line 74
    move-object v8, v1

    .line 75
    check-cast v8, Lzr3;

    .line 76
    .line 77
    invoke-interface {p1, p0, v5, v8, v4}, Lgy0;->r(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    goto :goto_0

    .line 82
    :cond_3
    invoke-interface {p1, p0}, Lgy0;->b(Lll6;)V

    .line 83
    .line 84
    .line 85
    if-eq v5, v0, :cond_6

    .line 86
    .line 87
    if-eq v6, v0, :cond_5

    .line 88
    .line 89
    if-eq v7, v0, :cond_4

    .line 90
    .line 91
    new-instance p0, Leo7;

    .line 92
    .line 93
    invoke-direct {p0, v5, v6, v7}, Leo7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    return-object p0

    .line 97
    :cond_4
    new-instance p0, Lkotlinx/serialization/SerializationException;

    .line 98
    .line 99
    const-string p1, "Element \'third\' is missing"

    .line 100
    .line 101
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p0

    .line 105
    :cond_5
    new-instance p0, Lkotlinx/serialization/SerializationException;

    .line 106
    .line 107
    const-string p1, "Element \'second\' is missing"

    .line 108
    .line 109
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw p0

    .line 113
    :cond_6
    new-instance p0, Lkotlinx/serialization/SerializationException;

    .line 114
    .line 115
    const-string p1, "Element \'first\' is missing"

    .line 116
    .line 117
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw p0

    .line 121
    :pswitch_0
    invoke-interface {p1}, Lok1;->a()Lz53;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    check-cast v2, Lgq3;

    .line 126
    .line 127
    check-cast v3, Ljava/util/List;

    .line 128
    .line 129
    invoke-virtual {p0, v2, v3}, Lz53;->b(Lgq3;Ljava/util/List;)V

    .line 130
    .line 131
    .line 132
    if-eqz v1, :cond_7

    .line 133
    .line 134
    check-cast v1, Lzr3;

    .line 135
    .line 136
    invoke-interface {p1, v1}, Lok1;->g(Lzr3;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    return-object p0

    .line 141
    :cond_7
    invoke-static {v2}, Luq3;->L(Lgq3;)V

    .line 142
    .line 143
    .line 144
    throw v4

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final getDescriptor()Lll6;
    .locals 1

    .line 1
    iget v0, p0, Le61;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Le61;->e:Lll6;

    .line 7
    .line 8
    check-cast p0, Lnl6;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Le61;->e:Lll6;

    .line 12
    .line 13
    check-cast p0, Lw51;

    .line 14
    .line 15
    return-object p0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final serialize(Lj42;Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget v0, p0, Le61;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Le61;->d:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Le61;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Le61;->b:Lzr3;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p2, Leo7;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Le61;->e:Lll6;

    .line 18
    .line 19
    check-cast p0, Lnl6;

    .line 20
    .line 21
    invoke-interface {p1, p0}, Lj42;->c(Lll6;)Lhy0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast v3, Lzr3;

    .line 26
    .line 27
    iget-object v0, p2, Leo7;->w:Ljava/lang/Object;

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    invoke-interface {p1, p0, v4, v3, v0}, Lhy0;->o(Lll6;ILzr3;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    check-cast v2, Lzr3;

    .line 34
    .line 35
    check-cast v2, Lzr3;

    .line 36
    .line 37
    iget-object v0, p2, Leo7;->x:Ljava/lang/Object;

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    invoke-interface {p1, p0, v3, v2, v0}, Lhy0;->o(Lll6;ILzr3;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    check-cast v1, Lzr3;

    .line 44
    .line 45
    check-cast v1, Lzr3;

    .line 46
    .line 47
    iget-object p2, p2, Leo7;->y:Ljava/lang/Object;

    .line 48
    .line 49
    const/4 v0, 0x2

    .line 50
    invoke-interface {p1, p0, v0, v1, p2}, Lhy0;->o(Lll6;ILzr3;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p1, p0}, Lhy0;->b(Lll6;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-interface {p1}, Lj42;->a()Lz53;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast v2, Lgq3;

    .line 65
    .line 66
    check-cast v1, Ljava/util/List;

    .line 67
    .line 68
    invoke-virtual {p0, v2, v1}, Lz53;->b(Lgq3;Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    if-eqz v3, :cond_0

    .line 72
    .line 73
    check-cast v3, Lzr3;

    .line 74
    .line 75
    invoke-interface {p1, v3, p2}, Lj42;->g(Lzr3;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_0
    invoke-static {v2}, Luq3;->L(Lgq3;)V

    .line 80
    .line 81
    .line 82
    const/4 p0, 0x0

    .line 83
    throw p0

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
