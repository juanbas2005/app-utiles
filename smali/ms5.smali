.class public final Lms5;
.super Lvu2;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public A:I

.field public B:Ljava/util/List;

.field public C:Ljava/util/List;

.field public D:Ljava/lang/Object;

.field public E:Lzu2;

.field public F:Lzu2;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lms5;->z:I

    .line 2
    .line 3
    invoke-direct {p0}, Lvu2;-><init>()V

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

.method public static i()Lms5;
    .locals 2

    .line 1
    new-instance v0, Lms5;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lms5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 8
    .line 9
    iput-object v1, v0, Lms5;->B:Ljava/util/List;

    .line 10
    .line 11
    iput-object v1, v0, Lms5;->C:Ljava/util/List;

    .line 12
    .line 13
    iput-object v1, v0, Lms5;->D:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object v1, Lht5;->C:Lht5;

    .line 16
    .line 17
    iput-object v1, v0, Lms5;->E:Lzu2;

    .line 18
    .line 19
    sget-object v1, Lot5;->A:Lot5;

    .line 20
    .line 21
    iput-object v1, v0, Lms5;->F:Lzu2;

    .line 22
    .line 23
    return-object v0
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

.method public static j()Lms5;
    .locals 2

    .line 1
    new-instance v0, Lms5;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lms5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Lws5;->A:Lws5;

    .line 8
    .line 9
    iput-object v1, v0, Lms5;->D:Ljava/lang/Object;

    .line 10
    .line 11
    sget-object v1, Lus5;->A:Lus5;

    .line 12
    .line 13
    iput-object v1, v0, Lms5;->E:Lzu2;

    .line 14
    .line 15
    sget-object v1, Lns5;->G:Lns5;

    .line 16
    .line 17
    iput-object v1, v0, Lms5;->F:Lzu2;

    .line 18
    .line 19
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 20
    .line 21
    iput-object v1, v0, Lms5;->B:Ljava/util/List;

    .line 22
    .line 23
    iput-object v1, v0, Lms5;->C:Ljava/util/List;

    .line 24
    .line 25
    return-object v0
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


# virtual methods
.method public final c()Lk2;
    .locals 1

    .line 1
    iget v0, p0, Lms5;->z:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lms5;->h()Los5;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Los5;->a()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    new-instance p0, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    .line 18
    .line 19
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;-><init>()V

    .line 20
    .line 21
    .line 22
    throw p0

    .line 23
    :pswitch_0
    invoke-virtual {p0}, Lms5;->g()Lns5;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Lns5;->a()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_1
    new-instance p0, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    .line 35
    .line 36
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;-><init>()V

    .line 37
    .line 38
    .line 39
    throw p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lms5;->z:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lms5;->j()Lms5;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lms5;->h()Los5;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v0, p0}, Lms5;->l(Los5;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    invoke-static {}, Lms5;->i()Lms5;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p0}, Lms5;->g()Lns5;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {v0, p0}, Lms5;->k(Lns5;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final d(Lts0;Ly92;)Lru2;
    .locals 2

    .line 1
    iget v0, p0, Lms5;->z:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    :try_start_0
    sget-object v0, Los5;->H:Lfp3;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v0, Los5;

    .line 13
    .line 14
    invoke-direct {v0, p1, p2}, Los5;-><init>(Lts0;Ly92;)V
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lms5;->l(Los5;)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception p1

    .line 24
    :try_start_1
    iget-object p2, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lk2;

    .line 25
    .line 26
    check-cast p2, Los5;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 29
    :catchall_1
    move-exception p1

    .line 30
    move-object v1, p2

    .line 31
    :goto_0
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lms5;->l(Los5;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    throw p1

    .line 37
    :pswitch_0
    :try_start_3
    sget-object v0, Lns5;->H:Lfp3;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance v0, Lns5;

    .line 43
    .line 44
    invoke-direct {v0, p1, p2}, Lns5;-><init>(Lts0;Ly92;)V
    :try_end_3
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v0}, Lms5;->k(Lns5;)V

    .line 48
    .line 49
    .line 50
    return-object p0

    .line 51
    :catchall_2
    move-exception p1

    .line 52
    goto :goto_1

    .line 53
    :catch_1
    move-exception p1

    .line 54
    :try_start_4
    iget-object p2, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lk2;

    .line 55
    .line 56
    check-cast p2, Lns5;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 57
    .line 58
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 59
    :catchall_3
    move-exception p1

    .line 60
    move-object v1, p2

    .line 61
    :goto_1
    if-eqz v1, :cond_1

    .line 62
    .line 63
    invoke-virtual {p0, v1}, Lms5;->k(Lns5;)V

    .line 64
    .line 65
    .line 66
    :cond_1
    throw p1

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final bridge synthetic e(Lzu2;)Lru2;
    .locals 1

    .line 1
    iget v0, p0, Lms5;->z:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Los5;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lms5;->l(Los5;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_0
    check-cast p1, Lns5;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lms5;->k(Lns5;)V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public g()Lns5;
    .locals 5

    .line 1
    new-instance v0, Lns5;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lns5;-><init>(Lms5;)V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lms5;->A:I

    .line 7
    .line 8
    and-int/lit8 v2, v1, 0x1

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-ne v2, v3, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Lms5;->B:Ljava/util/List;

    .line 14
    .line 15
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iput-object v2, p0, Lms5;->B:Ljava/util/List;

    .line 20
    .line 21
    iget v2, p0, Lms5;->A:I

    .line 22
    .line 23
    and-int/lit8 v2, v2, -0x2

    .line 24
    .line 25
    iput v2, p0, Lms5;->A:I

    .line 26
    .line 27
    :cond_0
    iget-object v2, p0, Lms5;->B:Ljava/util/List;

    .line 28
    .line 29
    iput-object v2, v0, Lns5;->z:Ljava/util/List;

    .line 30
    .line 31
    iget v2, p0, Lms5;->A:I

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    and-int/2addr v2, v4

    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-object v2, p0, Lms5;->C:Ljava/util/List;

    .line 38
    .line 39
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iput-object v2, p0, Lms5;->C:Ljava/util/List;

    .line 44
    .line 45
    iget v2, p0, Lms5;->A:I

    .line 46
    .line 47
    and-int/lit8 v2, v2, -0x3

    .line 48
    .line 49
    iput v2, p0, Lms5;->A:I

    .line 50
    .line 51
    :cond_1
    iget-object v2, p0, Lms5;->C:Ljava/util/List;

    .line 52
    .line 53
    iput-object v2, v0, Lns5;->A:Ljava/util/List;

    .line 54
    .line 55
    iget v2, p0, Lms5;->A:I

    .line 56
    .line 57
    const/4 v4, 0x4

    .line 58
    and-int/2addr v2, v4

    .line 59
    if-ne v2, v4, :cond_2

    .line 60
    .line 61
    iget-object v2, p0, Lms5;->D:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, Ljava/util/List;

    .line 64
    .line 65
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    iput-object v2, p0, Lms5;->D:Ljava/lang/Object;

    .line 70
    .line 71
    iget v2, p0, Lms5;->A:I

    .line 72
    .line 73
    and-int/lit8 v2, v2, -0x5

    .line 74
    .line 75
    iput v2, p0, Lms5;->A:I

    .line 76
    .line 77
    :cond_2
    iget-object v2, p0, Lms5;->D:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v2, Ljava/util/List;

    .line 80
    .line 81
    iput-object v2, v0, Lns5;->B:Ljava/util/List;

    .line 82
    .line 83
    and-int/lit8 v2, v1, 0x8

    .line 84
    .line 85
    const/16 v4, 0x8

    .line 86
    .line 87
    if-ne v2, v4, :cond_3

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_3
    const/4 v3, 0x0

    .line 91
    :goto_0
    iget-object v2, p0, Lms5;->E:Lzu2;

    .line 92
    .line 93
    check-cast v2, Lht5;

    .line 94
    .line 95
    iput-object v2, v0, Lns5;->C:Lht5;

    .line 96
    .line 97
    const/16 v2, 0x10

    .line 98
    .line 99
    and-int/2addr v1, v2

    .line 100
    if-ne v1, v2, :cond_4

    .line 101
    .line 102
    or-int/lit8 v3, v3, 0x2

    .line 103
    .line 104
    :cond_4
    iget-object p0, p0, Lms5;->F:Lzu2;

    .line 105
    .line 106
    check-cast p0, Lot5;

    .line 107
    .line 108
    iput-object p0, v0, Lns5;->D:Lot5;

    .line 109
    .line 110
    iput v3, v0, Lns5;->y:I

    .line 111
    .line 112
    return-object v0
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

.method public h()Los5;
    .locals 5

    .line 1
    new-instance v0, Los5;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Los5;-><init>(Lms5;)V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lms5;->A:I

    .line 7
    .line 8
    and-int/lit8 v2, v1, 0x1

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-ne v2, v3, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v3, 0x0

    .line 15
    :goto_0
    iget-object v2, p0, Lms5;->D:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Lws5;

    .line 18
    .line 19
    iput-object v2, v0, Los5;->z:Lws5;

    .line 20
    .line 21
    and-int/lit8 v2, v1, 0x2

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    if-ne v2, v4, :cond_1

    .line 25
    .line 26
    or-int/lit8 v3, v3, 0x2

    .line 27
    .line 28
    :cond_1
    iget-object v2, p0, Lms5;->E:Lzu2;

    .line 29
    .line 30
    check-cast v2, Lus5;

    .line 31
    .line 32
    iput-object v2, v0, Los5;->A:Lus5;

    .line 33
    .line 34
    and-int/lit8 v2, v1, 0x4

    .line 35
    .line 36
    const/4 v4, 0x4

    .line 37
    if-ne v2, v4, :cond_2

    .line 38
    .line 39
    or-int/lit8 v3, v3, 0x4

    .line 40
    .line 41
    :cond_2
    iget-object v2, p0, Lms5;->F:Lzu2;

    .line 42
    .line 43
    check-cast v2, Lns5;

    .line 44
    .line 45
    iput-object v2, v0, Los5;->B:Lns5;

    .line 46
    .line 47
    const/16 v2, 0x8

    .line 48
    .line 49
    and-int/2addr v1, v2

    .line 50
    if-ne v1, v2, :cond_3

    .line 51
    .line 52
    iget-object v1, p0, Lms5;->B:Ljava/util/List;

    .line 53
    .line 54
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iput-object v1, p0, Lms5;->B:Ljava/util/List;

    .line 59
    .line 60
    iget v1, p0, Lms5;->A:I

    .line 61
    .line 62
    and-int/lit8 v1, v1, -0x9

    .line 63
    .line 64
    iput v1, p0, Lms5;->A:I

    .line 65
    .line 66
    :cond_3
    iget-object v1, p0, Lms5;->B:Ljava/util/List;

    .line 67
    .line 68
    iput-object v1, v0, Los5;->C:Ljava/util/List;

    .line 69
    .line 70
    iget v1, p0, Lms5;->A:I

    .line 71
    .line 72
    const/16 v2, 0x10

    .line 73
    .line 74
    and-int/2addr v1, v2

    .line 75
    if-ne v1, v2, :cond_4

    .line 76
    .line 77
    iget-object v1, p0, Lms5;->C:Ljava/util/List;

    .line 78
    .line 79
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iput-object v1, p0, Lms5;->C:Ljava/util/List;

    .line 84
    .line 85
    iget v1, p0, Lms5;->A:I

    .line 86
    .line 87
    and-int/lit8 v1, v1, -0x11

    .line 88
    .line 89
    iput v1, p0, Lms5;->A:I

    .line 90
    .line 91
    :cond_4
    iget-object p0, p0, Lms5;->C:Ljava/util/List;

    .line 92
    .line 93
    iput-object p0, v0, Los5;->D:Ljava/util/List;

    .line 94
    .line 95
    iput v3, v0, Los5;->y:I

    .line 96
    .line 97
    return-object v0
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

.method public k(Lns5;)V
    .locals 5

    .line 1
    sget-object v0, Lns5;->G:Lns5;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p1, Lns5;->z:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-nez v0, :cond_3

    .line 14
    .line 15
    iget-object v0, p0, Lms5;->B:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p1, Lns5;->z:Ljava/util/List;

    .line 24
    .line 25
    iput-object v0, p0, Lms5;->B:Ljava/util/List;

    .line 26
    .line 27
    iget v0, p0, Lms5;->A:I

    .line 28
    .line 29
    and-int/lit8 v0, v0, -0x2

    .line 30
    .line 31
    iput v0, p0, Lms5;->A:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget v0, p0, Lms5;->A:I

    .line 35
    .line 36
    and-int/2addr v0, v1

    .line 37
    if-eq v0, v1, :cond_2

    .line 38
    .line 39
    new-instance v0, Ljava/util/ArrayList;

    .line 40
    .line 41
    iget-object v2, p0, Lms5;->B:Ljava/util/List;

    .line 42
    .line 43
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lms5;->B:Ljava/util/List;

    .line 47
    .line 48
    iget v0, p0, Lms5;->A:I

    .line 49
    .line 50
    or-int/2addr v0, v1

    .line 51
    iput v0, p0, Lms5;->A:I

    .line 52
    .line 53
    :cond_2
    iget-object v0, p0, Lms5;->B:Ljava/util/List;

    .line 54
    .line 55
    iget-object v2, p1, Lns5;->z:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 58
    .line 59
    .line 60
    :cond_3
    :goto_0
    iget-object v0, p1, Lns5;->A:Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    const/4 v2, 0x2

    .line 67
    if-nez v0, :cond_6

    .line 68
    .line 69
    iget-object v0, p0, Lms5;->C:Ljava/util/List;

    .line 70
    .line 71
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    iget-object v0, p1, Lns5;->A:Ljava/util/List;

    .line 78
    .line 79
    iput-object v0, p0, Lms5;->C:Ljava/util/List;

    .line 80
    .line 81
    iget v0, p0, Lms5;->A:I

    .line 82
    .line 83
    and-int/lit8 v0, v0, -0x3

    .line 84
    .line 85
    iput v0, p0, Lms5;->A:I

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    iget v0, p0, Lms5;->A:I

    .line 89
    .line 90
    and-int/2addr v0, v2

    .line 91
    if-eq v0, v2, :cond_5

    .line 92
    .line 93
    new-instance v0, Ljava/util/ArrayList;

    .line 94
    .line 95
    iget-object v3, p0, Lms5;->C:Ljava/util/List;

    .line 96
    .line 97
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 98
    .line 99
    .line 100
    iput-object v0, p0, Lms5;->C:Ljava/util/List;

    .line 101
    .line 102
    iget v0, p0, Lms5;->A:I

    .line 103
    .line 104
    or-int/2addr v0, v2

    .line 105
    iput v0, p0, Lms5;->A:I

    .line 106
    .line 107
    :cond_5
    iget-object v0, p0, Lms5;->C:Ljava/util/List;

    .line 108
    .line 109
    iget-object v3, p1, Lns5;->A:Ljava/util/List;

    .line 110
    .line 111
    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 112
    .line 113
    .line 114
    :cond_6
    :goto_1
    iget-object v0, p1, Lns5;->B:Ljava/util/List;

    .line 115
    .line 116
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-nez v0, :cond_9

    .line 121
    .line 122
    iget-object v0, p0, Lms5;->D:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, Ljava/util/List;

    .line 125
    .line 126
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-eqz v0, :cond_7

    .line 131
    .line 132
    iget-object v0, p1, Lns5;->B:Ljava/util/List;

    .line 133
    .line 134
    iput-object v0, p0, Lms5;->D:Ljava/lang/Object;

    .line 135
    .line 136
    iget v0, p0, Lms5;->A:I

    .line 137
    .line 138
    and-int/lit8 v0, v0, -0x5

    .line 139
    .line 140
    iput v0, p0, Lms5;->A:I

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_7
    iget v0, p0, Lms5;->A:I

    .line 144
    .line 145
    const/4 v3, 0x4

    .line 146
    and-int/2addr v0, v3

    .line 147
    if-eq v0, v3, :cond_8

    .line 148
    .line 149
    new-instance v0, Ljava/util/ArrayList;

    .line 150
    .line 151
    iget-object v4, p0, Lms5;->D:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v4, Ljava/util/List;

    .line 154
    .line 155
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 156
    .line 157
    .line 158
    iput-object v0, p0, Lms5;->D:Ljava/lang/Object;

    .line 159
    .line 160
    iget v0, p0, Lms5;->A:I

    .line 161
    .line 162
    or-int/2addr v0, v3

    .line 163
    iput v0, p0, Lms5;->A:I

    .line 164
    .line 165
    :cond_8
    iget-object v0, p0, Lms5;->D:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v0, Ljava/util/List;

    .line 168
    .line 169
    iget-object v3, p1, Lns5;->B:Ljava/util/List;

    .line 170
    .line 171
    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 172
    .line 173
    .line 174
    :cond_9
    :goto_2
    iget v0, p1, Lns5;->y:I

    .line 175
    .line 176
    and-int/2addr v0, v1

    .line 177
    if-ne v0, v1, :cond_b

    .line 178
    .line 179
    iget-object v0, p1, Lns5;->C:Lht5;

    .line 180
    .line 181
    iget v1, p0, Lms5;->A:I

    .line 182
    .line 183
    const/16 v3, 0x8

    .line 184
    .line 185
    and-int/2addr v1, v3

    .line 186
    if-ne v1, v3, :cond_a

    .line 187
    .line 188
    iget-object v1, p0, Lms5;->E:Lzu2;

    .line 189
    .line 190
    check-cast v1, Lht5;

    .line 191
    .line 192
    sget-object v4, Lht5;->C:Lht5;

    .line 193
    .line 194
    if-eq v1, v4, :cond_a

    .line 195
    .line 196
    invoke-static {v1}, Lht5;->i(Lht5;)Lpr5;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-virtual {v1, v0}, Lpr5;->j(Lht5;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1}, Lpr5;->g()Lht5;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    iput-object v0, p0, Lms5;->E:Lzu2;

    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_a
    iput-object v0, p0, Lms5;->E:Lzu2;

    .line 211
    .line 212
    :goto_3
    iget v0, p0, Lms5;->A:I

    .line 213
    .line 214
    or-int/2addr v0, v3

    .line 215
    iput v0, p0, Lms5;->A:I

    .line 216
    .line 217
    :cond_b
    iget v0, p1, Lns5;->y:I

    .line 218
    .line 219
    and-int/2addr v0, v2

    .line 220
    if-ne v0, v2, :cond_d

    .line 221
    .line 222
    iget-object v0, p1, Lns5;->D:Lot5;

    .line 223
    .line 224
    iget v1, p0, Lms5;->A:I

    .line 225
    .line 226
    const/16 v3, 0x10

    .line 227
    .line 228
    and-int/2addr v1, v3

    .line 229
    if-ne v1, v3, :cond_c

    .line 230
    .line 231
    iget-object v1, p0, Lms5;->F:Lzu2;

    .line 232
    .line 233
    check-cast v1, Lot5;

    .line 234
    .line 235
    sget-object v4, Lot5;->A:Lot5;

    .line 236
    .line 237
    if-eq v1, v4, :cond_c

    .line 238
    .line 239
    new-instance v4, Lxr5;

    .line 240
    .line 241
    invoke-direct {v4, v2}, Lxr5;-><init>(I)V

    .line 242
    .line 243
    .line 244
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 245
    .line 246
    iput-object v2, v4, Lxr5;->z:Ljava/util/List;

    .line 247
    .line 248
    invoke-virtual {v4, v1}, Lxr5;->m(Lot5;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v4, v0}, Lxr5;->m(Lot5;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v4}, Lxr5;->i()Lot5;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    iput-object v0, p0, Lms5;->F:Lzu2;

    .line 259
    .line 260
    goto :goto_4

    .line 261
    :cond_c
    iput-object v0, p0, Lms5;->F:Lzu2;

    .line 262
    .line 263
    :goto_4
    iget v0, p0, Lms5;->A:I

    .line 264
    .line 265
    or-int/2addr v0, v3

    .line 266
    iput v0, p0, Lms5;->A:I

    .line 267
    .line 268
    :cond_d
    invoke-virtual {p0, p1}, Lvu2;->f(Lwu2;)V

    .line 269
    .line 270
    .line 271
    iget-object v0, p0, Lru2;->w:Lbg0;

    .line 272
    .line 273
    iget-object p1, p1, Lns5;->x:Lbg0;

    .line 274
    .line 275
    invoke-virtual {v0, p1}, Lbg0;->f(Lbg0;)Lbg0;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    iput-object p1, p0, Lru2;->w:Lbg0;

    .line 280
    .line 281
    return-void
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
.end method

.method public l(Los5;)V
    .locals 5

    .line 1
    sget-object v0, Los5;->G:Los5;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p1, Los5;->y:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    and-int/2addr v0, v1

    .line 10
    if-ne v0, v1, :cond_2

    .line 11
    .line 12
    iget-object v0, p1, Los5;->z:Lws5;

    .line 13
    .line 14
    iget v2, p0, Lms5;->A:I

    .line 15
    .line 16
    and-int/2addr v2, v1

    .line 17
    if-ne v2, v1, :cond_1

    .line 18
    .line 19
    iget-object v2, p0, Lms5;->D:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lws5;

    .line 22
    .line 23
    sget-object v3, Lws5;->A:Lws5;

    .line 24
    .line 25
    if-eq v2, v3, :cond_1

    .line 26
    .line 27
    new-instance v3, Lxr5;

    .line 28
    .line 29
    const/4 v4, 0x3

    .line 30
    invoke-direct {v3, v4}, Lxr5;-><init>(I)V

    .line 31
    .line 32
    .line 33
    sget-object v4, Lc44;->x:Ldt7;

    .line 34
    .line 35
    iput-object v4, v3, Lxr5;->z:Ljava/util/List;

    .line 36
    .line 37
    invoke-virtual {v3, v2}, Lxr5;->l(Lws5;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, v0}, Lxr5;->l(Lws5;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Lxr5;->h()Lws5;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Lms5;->D:Ljava/lang/Object;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    iput-object v0, p0, Lms5;->D:Ljava/lang/Object;

    .line 51
    .line 52
    :goto_0
    iget v0, p0, Lms5;->A:I

    .line 53
    .line 54
    or-int/2addr v0, v1

    .line 55
    iput v0, p0, Lms5;->A:I

    .line 56
    .line 57
    :cond_2
    iget v0, p1, Los5;->y:I

    .line 58
    .line 59
    const/4 v2, 0x2

    .line 60
    and-int/2addr v0, v2

    .line 61
    if-ne v0, v2, :cond_4

    .line 62
    .line 63
    iget-object v0, p1, Los5;->A:Lus5;

    .line 64
    .line 65
    iget v3, p0, Lms5;->A:I

    .line 66
    .line 67
    and-int/2addr v3, v2

    .line 68
    if-ne v3, v2, :cond_3

    .line 69
    .line 70
    iget-object v3, p0, Lms5;->E:Lzu2;

    .line 71
    .line 72
    check-cast v3, Lus5;

    .line 73
    .line 74
    sget-object v4, Lus5;->A:Lus5;

    .line 75
    .line 76
    if-eq v3, v4, :cond_3

    .line 77
    .line 78
    new-instance v4, Lxr5;

    .line 79
    .line 80
    invoke-direct {v4, v1}, Lxr5;-><init>(I)V

    .line 81
    .line 82
    .line 83
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 84
    .line 85
    iput-object v1, v4, Lxr5;->z:Ljava/util/List;

    .line 86
    .line 87
    invoke-virtual {v4, v3}, Lxr5;->k(Lus5;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4, v0}, Lxr5;->k(Lus5;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4}, Lxr5;->g()Lus5;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iput-object v0, p0, Lms5;->E:Lzu2;

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    iput-object v0, p0, Lms5;->E:Lzu2;

    .line 101
    .line 102
    :goto_1
    iget v0, p0, Lms5;->A:I

    .line 103
    .line 104
    or-int/2addr v0, v2

    .line 105
    iput v0, p0, Lms5;->A:I

    .line 106
    .line 107
    :cond_4
    iget v0, p1, Los5;->y:I

    .line 108
    .line 109
    const/4 v1, 0x4

    .line 110
    and-int/2addr v0, v1

    .line 111
    if-ne v0, v1, :cond_6

    .line 112
    .line 113
    iget-object v0, p1, Los5;->B:Lns5;

    .line 114
    .line 115
    iget v2, p0, Lms5;->A:I

    .line 116
    .line 117
    and-int/2addr v2, v1

    .line 118
    if-ne v2, v1, :cond_5

    .line 119
    .line 120
    iget-object v2, p0, Lms5;->F:Lzu2;

    .line 121
    .line 122
    check-cast v2, Lns5;

    .line 123
    .line 124
    sget-object v3, Lns5;->G:Lns5;

    .line 125
    .line 126
    if-eq v2, v3, :cond_5

    .line 127
    .line 128
    invoke-static {}, Lms5;->i()Lms5;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-virtual {v3, v2}, Lms5;->k(Lns5;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3, v0}, Lms5;->k(Lns5;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3}, Lms5;->g()Lns5;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    iput-object v0, p0, Lms5;->F:Lzu2;

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_5
    iput-object v0, p0, Lms5;->F:Lzu2;

    .line 146
    .line 147
    :goto_2
    iget v0, p0, Lms5;->A:I

    .line 148
    .line 149
    or-int/2addr v0, v1

    .line 150
    iput v0, p0, Lms5;->A:I

    .line 151
    .line 152
    :cond_6
    iget-object v0, p1, Los5;->C:Ljava/util/List;

    .line 153
    .line 154
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-nez v0, :cond_9

    .line 159
    .line 160
    iget-object v0, p0, Lms5;->B:Ljava/util/List;

    .line 161
    .line 162
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_7

    .line 167
    .line 168
    iget-object v0, p1, Los5;->C:Ljava/util/List;

    .line 169
    .line 170
    iput-object v0, p0, Lms5;->B:Ljava/util/List;

    .line 171
    .line 172
    iget v0, p0, Lms5;->A:I

    .line 173
    .line 174
    and-int/lit8 v0, v0, -0x9

    .line 175
    .line 176
    iput v0, p0, Lms5;->A:I

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_7
    iget v0, p0, Lms5;->A:I

    .line 180
    .line 181
    const/16 v1, 0x8

    .line 182
    .line 183
    and-int/2addr v0, v1

    .line 184
    if-eq v0, v1, :cond_8

    .line 185
    .line 186
    new-instance v0, Ljava/util/ArrayList;

    .line 187
    .line 188
    iget-object v2, p0, Lms5;->B:Ljava/util/List;

    .line 189
    .line 190
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 191
    .line 192
    .line 193
    iput-object v0, p0, Lms5;->B:Ljava/util/List;

    .line 194
    .line 195
    iget v0, p0, Lms5;->A:I

    .line 196
    .line 197
    or-int/2addr v0, v1

    .line 198
    iput v0, p0, Lms5;->A:I

    .line 199
    .line 200
    :cond_8
    iget-object v0, p0, Lms5;->B:Ljava/util/List;

    .line 201
    .line 202
    iget-object v1, p1, Los5;->C:Ljava/util/List;

    .line 203
    .line 204
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 205
    .line 206
    .line 207
    :cond_9
    :goto_3
    iget-object v0, p1, Los5;->D:Ljava/util/List;

    .line 208
    .line 209
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-nez v0, :cond_c

    .line 214
    .line 215
    iget-object v0, p0, Lms5;->C:Ljava/util/List;

    .line 216
    .line 217
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-eqz v0, :cond_a

    .line 222
    .line 223
    iget-object v0, p1, Los5;->D:Ljava/util/List;

    .line 224
    .line 225
    iput-object v0, p0, Lms5;->C:Ljava/util/List;

    .line 226
    .line 227
    iget v0, p0, Lms5;->A:I

    .line 228
    .line 229
    and-int/lit8 v0, v0, -0x11

    .line 230
    .line 231
    iput v0, p0, Lms5;->A:I

    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_a
    iget v0, p0, Lms5;->A:I

    .line 235
    .line 236
    const/16 v1, 0x10

    .line 237
    .line 238
    and-int/2addr v0, v1

    .line 239
    if-eq v0, v1, :cond_b

    .line 240
    .line 241
    new-instance v0, Ljava/util/ArrayList;

    .line 242
    .line 243
    iget-object v2, p0, Lms5;->C:Ljava/util/List;

    .line 244
    .line 245
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 246
    .line 247
    .line 248
    iput-object v0, p0, Lms5;->C:Ljava/util/List;

    .line 249
    .line 250
    iget v0, p0, Lms5;->A:I

    .line 251
    .line 252
    or-int/2addr v0, v1

    .line 253
    iput v0, p0, Lms5;->A:I

    .line 254
    .line 255
    :cond_b
    iget-object v0, p0, Lms5;->C:Ljava/util/List;

    .line 256
    .line 257
    iget-object v1, p1, Los5;->D:Ljava/util/List;

    .line 258
    .line 259
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 260
    .line 261
    .line 262
    :cond_c
    :goto_4
    invoke-virtual {p0, p1}, Lvu2;->f(Lwu2;)V

    .line 263
    .line 264
    .line 265
    iget-object v0, p0, Lru2;->w:Lbg0;

    .line 266
    .line 267
    iget-object p1, p1, Los5;->x:Lbg0;

    .line 268
    .line 269
    invoke-virtual {v0, p1}, Lbg0;->f(Lbg0;)Lbg0;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    iput-object p1, p0, Lru2;->w:Lbg0;

    .line 274
    .line 275
    return-void
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
.end method
